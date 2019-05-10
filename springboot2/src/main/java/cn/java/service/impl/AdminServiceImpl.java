/**
 * Project Name:springboot2
 * File Name:AdminServiceImpl.java
 * Package Name:cn.java.service.impl
 * Date:下午5:29:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.java.mapper.AdminMapper;
import cn.java.service.AdminService;

/**
 * Description: <br/>
 * Date: 下午5:29:09 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 简单描述该方法的实现功能（可选）.
     * 
     * @see cn.java.service.impl.AdminService#isLogin(java.lang.String,
     *      java.lang.String)
     */
    @Override
    public boolean isLogin(String username, String password) {
        int result = adminMapper.isLogin(username, password);
        if (result >= 1) {
            return true;
        }
        return false;
    }

    @Override
    public List<Map<String, Object>> selectNavs(String id) {
        return adminMapper.selectNavs(id);
    }
}
