package com.entity.view;

import com.entity.DiscussbaokanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报刊信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
@TableName("discussbaokanxinxi")
public class DiscussbaokanxinxiView  extends DiscussbaokanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbaokanxinxiView(){
	}
 
 	public DiscussbaokanxinxiView(DiscussbaokanxinxiEntity discussbaokanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussbaokanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
