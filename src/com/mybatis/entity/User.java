package com.mybatis.entity;

/**
 * 
 *
 *  @version �� 1.0
 *  
 *  @author  �� ������              <a href="mailto:DennisIT@163.com">�����ʼ�</a>
 *    
 *  @since   �� 1.0        ����ʱ��:    2013-4-9    ����11:15:50
 *     
 *  @function�� TODO        
 *
 */
public class User {
    
    private int id;
    private String username;
    private String password;
    private String sex;
    private String email;
    private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
}