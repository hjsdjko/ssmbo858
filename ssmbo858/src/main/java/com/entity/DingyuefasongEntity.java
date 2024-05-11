package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 订阅发送
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
@TableName("dingyuefasong")
public class DingyuefasongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingyuefasongEntity() {
		
	}
	
	public DingyuefasongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订阅编号
	 */
					
	private String dingyuebianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订阅编号
	 */
	public void setDingyuebianhao(String dingyuebianhao) {
		this.dingyuebianhao = dingyuebianhao;
	}
	/**
	 * 获取：订阅编号
	 */
	public String getDingyuebianhao() {
		return dingyuebianhao;
	}
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
