package com.yorkehan.controller;

import com.github.pagehelper.PageInfo;
import com.yorkehan.pojo.User;
import com.yorkehan.service.UserService;
import com.yorkehan.utils.ExportUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/export")
public class ExportController {
    @Resource
    private UserService userService;
    @RequestMapping("/user")
    public void exportUser(Integer page,Integer rows,HttpServletResponse out){
        PageInfo<User> pageInfo = userService.getAllUserList(page, rows);
        List<User> list = pageInfo.getList();
        //excel标题
        String[] title = {"ID","用户名","邮箱","电话号码","状态"};
        //excel文件名
        String fileName = "用户信息表"+System.currentTimeMillis()+".xls";
        //sheet名
        String sheetName = "用户信息表";
        //值
        String[][] content=new String[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            User obj = list.get(i);
            content[i][0] = obj.getUserId().toString();
            content[i][1] = obj.getUserName().toString();
            content[i][2] = obj.getEmail().toString();
            content[i][3] = obj.getPhoneNumber().toString();
            content[i][4] = obj.getUserStatus().toString();
        }
        //创建HSSFWorkbook
        HSSFWorkbook wb = ExportUtil.getHSSFWorkbook(sheetName, title, content, null);
        //响应到客户端
        try {
            this.setResponseHeader(out, fileName);
            OutputStream os = out.getOutputStream();
            wb.write(os);
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
