package com.entity.model;

import com.entity.BaokanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 报刊信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public class BaokanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
