package com.dao;

import com.entity.BaokanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaokanleixingVO;
import com.entity.view.BaokanleixingView;


/**
 * 报刊类型
 * 
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface BaokanleixingDao extends BaseMapper<BaokanleixingEntity> {
	
	List<BaokanleixingVO> selectListVO(@Param("ew") Wrapper<BaokanleixingEntity> wrapper);
	
	BaokanleixingVO selectVO(@Param("ew") Wrapper<BaokanleixingEntity> wrapper);
	
	List<BaokanleixingView> selectListView(@Param("ew") Wrapper<BaokanleixingEntity> wrapper);

	List<BaokanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<BaokanleixingEntity> wrapper);
	
	BaokanleixingView selectView(@Param("ew") Wrapper<BaokanleixingEntity> wrapper);
	

}
