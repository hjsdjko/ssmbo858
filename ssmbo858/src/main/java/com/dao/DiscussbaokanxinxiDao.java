package com.dao;

import com.entity.DiscussbaokanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaokanxinxiVO;
import com.entity.view.DiscussbaokanxinxiView;


/**
 * 报刊信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface DiscussbaokanxinxiDao extends BaseMapper<DiscussbaokanxinxiEntity> {
	
	List<DiscussbaokanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussbaokanxinxiEntity> wrapper);
	
	DiscussbaokanxinxiVO selectVO(@Param("ew") Wrapper<DiscussbaokanxinxiEntity> wrapper);
	
	List<DiscussbaokanxinxiView> selectListView(@Param("ew") Wrapper<DiscussbaokanxinxiEntity> wrapper);

	List<DiscussbaokanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaokanxinxiEntity> wrapper);
	
	DiscussbaokanxinxiView selectView(@Param("ew") Wrapper<DiscussbaokanxinxiEntity> wrapper);
	

}
