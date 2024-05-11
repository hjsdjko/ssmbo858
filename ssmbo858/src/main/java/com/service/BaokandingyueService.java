package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaokandingyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaokandingyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaokandingyueView;


/**
 * 报刊订阅
 *
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface BaokandingyueService extends IService<BaokandingyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaokandingyueVO> selectListVO(Wrapper<BaokandingyueEntity> wrapper);
   	
   	BaokandingyueVO selectVO(@Param("ew") Wrapper<BaokandingyueEntity> wrapper);
   	
   	List<BaokandingyueView> selectListView(Wrapper<BaokandingyueEntity> wrapper);
   	
   	BaokandingyueView selectView(@Param("ew") Wrapper<BaokandingyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaokandingyueEntity> wrapper);
   	

}

