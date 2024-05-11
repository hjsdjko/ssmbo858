package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaokanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaokanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaokanleixingView;


/**
 * 报刊类型
 *
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface BaokanleixingService extends IService<BaokanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaokanleixingVO> selectListVO(Wrapper<BaokanleixingEntity> wrapper);
   	
   	BaokanleixingVO selectVO(@Param("ew") Wrapper<BaokanleixingEntity> wrapper);
   	
   	List<BaokanleixingView> selectListView(Wrapper<BaokanleixingEntity> wrapper);
   	
   	BaokanleixingView selectView(@Param("ew") Wrapper<BaokanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaokanleixingEntity> wrapper);
   	

}

