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
 * 报刊信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
@TableName("baokanxinxi")
public class BaokanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaokanxinxiEntity() {
		
	}
	
	public BaokanxinxiEntity(T t) {
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
	 * 订阅价格
	 */
					
	private Float dingyuejiage;
	
	/**
	 * 报刊详情
	 */
					
	private String baokanxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：订阅价格
	 */
	public void setDingyuejiage(Float dingyuejiage) {
		this.dingyuejiage = dingyuejiage;
	}
	/**
	 * 获取：订阅价格
	 */
	public Float getDingyuejiage() {
		return dingyuejiage;
	}
	/**
	 * 设置：报刊详情
	 */
	public void setBaokanxiangqing(String baokanxiangqing) {
		this.baokanxiangqing = baokanxiangqing;
	}
	/**
	 * 获取：报刊详情
	 */
	public String getBaokanxiangqing() {
		return baokanxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
