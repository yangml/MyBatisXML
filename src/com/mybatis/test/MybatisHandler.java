package com.mybatis.test;


import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dao.UserDao;
import com.mybatis.entity.User;



public class MybatisHandler {

    public static void main(String[] args) throws Exception {
        String resource = "MyBatis-Configuration.xml";    //mybatis�����ļ���·��
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builfer = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builfer.build(reader);
        //factory.getConfiguration().addMapper(UserDao.class);
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        
        //��������
        User user = new User();
        user.setUsername("������");
        user.setPassword("dennisit");
        user.setEmail("dennisit@163.com");
        user.setSex("��");
        user.setAge(80);
        //�����û�
        userDao.insert(user);
        
        //��ѯ���ݿ��м�¼����
        System.out.println("���ݿ��еļ�¼��:" + userDao.countAll());
        
       
        //�����û�������
        User usn = userDao.findByUserName("������");
        if(null!=usn){
            System.out.println("�����û������ҵ���Ϣ[" +usn.getId() + "," + usn.getUsername() + "," + usn.getEmail()+"]");
        }
        
        //�����û�
        User updUser = new User();
        updUser.setUsername("������"); //�����û��ǰ����û�������,Ȼ����µ�.����Ҫ�޸ĵ�����ǰ�������ͬһ���û���
        updUser.setEmail("yangmingliang@163.com");
        updUser.setPassword("update");
        updUser.setAge(20);
        updUser.setSex("��");
        userDao.update(updUser);    //ִ�и��²���
       
        //��ѯ�����û���¼
        List<User> list = userDao.selectAll();
        for(int i=0;i<list.size();i++){
            User us = list.get(i);
            System.out.println("[" + us.getId() + "," + us.getUsername() + "," + us.getEmail()+"]");
        }
        
        userDao.delete("������");
        
        System.out.println("ִ��ɾ�������ݿ��еļ�¼��:" + userDao.countAll());
		
        session.commit();
    }
}