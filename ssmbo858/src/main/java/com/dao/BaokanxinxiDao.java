package com.dao;

import com.entity.BaokanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaokanxinxiVO;
import com.entity.view.BaokanxinxiView;


/**
 * 报刊信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface BaokanxinxiDao extends BaseMapper<BaokanxinxiEntity> {
	
	List<BaokanxinxiVO> selectListVO(@Param("ew") Wrapper<BaokanxinxiEntity> wrapper);
	
	BaokanxinxiVO selectVO(@Param("ew") Wrapper<BaokanxinxiEntity> wrapper);
	
	List<BaokanxinxiView> selectListView(@Param("ew") Wrapper<BaokanxinxiEntity> wrapper);

	List<BaokanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaokanxinxiEntity> wrapper);
	
	BaokanxinxiView selectView(@Param("ew") Wrapper<BaokanxinxiEntity> wrapper);
	

}
