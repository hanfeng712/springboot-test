/**
 * Project Name:springboot2
 * File Name:AdminController.java
 * Package Name:cn.java.controller.admin
 * Date:下午5:24:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.controller.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.java.service.AdminService;

/**
 * Description: <br/>
 * Date: 下午5:24:59 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * 
     * Description: 后台登录方法<br/>
     *
     * @author 丁鹏
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/isLogin.do")
    @ResponseBody
    public boolean isLogin(String username, String password) {
        return adminService.isLogin(username, password);
    }

    /**
     * 
     * Description: 获取导航栏信息<br/>
     *
     * @author 丁鹏
     * @return
     */
    @RequestMapping(value = "/getAllNavs.do")
    @ResponseBody
    public List<Map<String, Object>> getAllNavs(@RequestParam(defaultValue = "0") String id) {
        System.out.println("id=" + id);
        return adminService.selectNavs(id);
    }

    @RequestMapping(value = "/test.do")
    public void test(@RequestParam(required = true) String id) {
        System.out.println("-------------------");
    }
}
