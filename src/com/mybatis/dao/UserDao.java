package com.mybatis.dao;


import java.util.List;

import com.mybatis.entity.User;



public interface UserDao {

     /**
      * �����û�
      * @param user
      * @return
      */
     public int insert(User user);
     
     /**
      * �޸��û�
      * @param user
      * @return
      */
     public int update(User user);
    
     /**
      * ɾ���û�
      * @param userName
      * @return
      */
     public int delete(String userName);
    
     /**
      * ��ѯ�����û�
      * @return
      */
     public List<User> selectAll();
    
     /**
      * ��ѯ���ݿ����ܼ�¼����
      * @return
      */
     public int countAll();
    
     /**
      * �����û�����ѯ�û�
      * @param userName
      * @return
      */
     public User findByUserName(String userName);

     
     
}