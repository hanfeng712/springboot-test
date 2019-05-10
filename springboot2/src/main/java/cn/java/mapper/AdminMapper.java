/**
 * Project Name:springboot2
 * File Name:AdminMapper.java
 * Package Name:cn.java.mapper
 * Date:下午5:27:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

/**
 * Description: easyui后台 <br/>
 * Date: 下午5:27:21 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public interface AdminMapper {

    /**
     * 
     * Description: 后台登录<br/>
     *
     * @author 丁鹏
     * @param username
     * @param password
     * @return
     */
    @Select("SELECT COUNT(*) AS num FROM users WHERE username=#{arg0} AND PASSWORD=#{arg1}")
    int isLogin(String username, String password);

    /**
     * 
     * Description: 查询后台导航栏信息<br/>
     *
     * @author 丁鹏
     * @return
     */
    @Select("SELECT * FROM admin_nav where pid=#{arg0}")
    List<Map<String, Object>> selectNavs(String id);
}
