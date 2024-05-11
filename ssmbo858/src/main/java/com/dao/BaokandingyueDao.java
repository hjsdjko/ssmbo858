package com.dao;

import com.entity.BaokandingyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaokandingyueVO;
import com.entity.view.BaokandingyueView;


/**
 * 报刊订阅
 * 
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface BaokandingyueDao extends BaseMapper<BaokandingyueEntity> {
	
	List<BaokandingyueVO> selectListVO(@Param("ew") Wrapper<BaokandingyueEntity> wrapper);
	
	BaokandingyueVO selectVO(@Param("ew") Wrapper<BaokandingyueEntity> wrapper);
	
	List<BaokandingyueView> selectListView(@Param("ew") Wrapper<BaokandingyueEntity> wrapper);

	List<BaokandingyueView> selectListView(Pagination page,@Param("ew") Wrapper<BaokandingyueEntity> wrapper);
	
	BaokandingyueView selectView(@Param("ew") Wrapper<BaokandingyueEntity> wrapper);
	

}
