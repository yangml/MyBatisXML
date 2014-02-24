package com.mybatis.dao;


import java.util.List;

import com.mybatis.entity.User;



public interface UserDao {

     /**
      * 新增用户
      * @param user
      * @return
      */
     public int insert(User user);
     
     /**
      * 修改用户
      * @param user
      * @return
      */
     public int update(User user);
    
     /**
      * 删除用户
      * @param userName
      * @return
      */
     public int delete(String userName);
    
     /**
      * 查询所有用户
      * @return
      */
     public List<User> selectAll();
    
     /**
      * 查询数据库中总记录条数
      * @return
      */
     public int countAll();
    
     /**
      * 根据用户名查询用户
      * @param userName
      * @return
      */
     public User findByUserName(String userName);

     
     
}