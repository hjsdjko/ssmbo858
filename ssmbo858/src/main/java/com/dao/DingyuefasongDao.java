package com.dao;

import com.entity.DingyuefasongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingyuefasongVO;
import com.entity.view.DingyuefasongView;


/**
 * 订阅发送
 * 
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface DingyuefasongDao extends BaseMapper<DingyuefasongEntity> {
	
	List<DingyuefasongVO> selectListVO(@Param("ew") Wrapper<DingyuefasongEntity> wrapper);
	
	DingyuefasongVO selectVO(@Param("ew") Wrapper<DingyuefasongEntity> wrapper);
	
	List<DingyuefasongView> selectListView(@Param("ew") Wrapper<DingyuefasongEntity> wrapper);

	List<DingyuefasongView> selectListView(Pagination page,@Param("ew") Wrapper<DingyuefasongEntity> wrapper);
	
	DingyuefasongView selectView(@Param("ew") Wrapper<DingyuefasongEntity> wrapper);
	

}
