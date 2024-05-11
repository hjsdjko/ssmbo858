package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaokanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaokanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaokanxinxiView;


/**
 * 报刊信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface BaokanxinxiService extends IService<BaokanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaokanxinxiVO> selectListVO(Wrapper<BaokanxinxiEntity> wrapper);
   	
   	BaokanxinxiVO selectVO(@Param("ew") Wrapper<BaokanxinxiEntity> wrapper);
   	
   	List<BaokanxinxiView> selectListView(Wrapper<BaokanxinxiEntity> wrapper);
   	
   	BaokanxinxiView selectView(@Param("ew") Wrapper<BaokanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaokanxinxiEntity> wrapper);
   	

}

