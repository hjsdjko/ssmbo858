package com.entity.model;

import com.entity.DingyuefasongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订阅发送
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public class DingyuefasongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报刊名称
	 */
	
	private String baokanmingcheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 报刊类型
	 */
	
	private String baokanleixing;
		
	/**
	 * 报刊内容
	 */
	
	private String baokanneirong;
		
	/**
	 * 报刊日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baokanriqi;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：报刊名称
	 */
	 
	public void setBaokanmingcheng(String baokanmingcheng) {
		this.baokanmingcheng = baokanmingcheng;
	}
	
	/**
	 * 获取：报刊名称
	 */
	public String getBaokanmingcheng() {
		return baokanmingcheng;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：报刊类型
	 */
	 
	public void setBaokanleixing(String baokanleixing) {
		this.baokanleixing = baokanleixing;
	}
	
	/**
	 * 获取：报刊类型
	 */
	public String getBaokanleixing() {
		return baokanleixing;
	}
				
	
	/**
	 * 设置：报刊内容
	 */
	 
	public void setBaokanneirong(String baokanneirong) {
		this.baokanneirong = baokanneirong;
	}
	
	/**
	 * 获取：报刊内容
	 */
	public String getBaokanneirong() {
		return baokanneirong;
	}
				
	
	/**
	 * 设置：报刊日期
	 */
	 
	public void setBaokanriqi(Date baokanriqi) {
		this.baokanriqi = baokanriqi;
	}
	
	/**
	 * 获取：报刊日期
	 */
	public Date getBaokanriqi() {
		return baokanriqi;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
