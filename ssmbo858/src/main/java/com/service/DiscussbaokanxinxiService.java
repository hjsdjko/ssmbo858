package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaokanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaokanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaokanxinxiView;


/**
 * 报刊信息评论表
 *
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface DiscussbaokanxinxiService extends IService<DiscussbaokanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaokanxinxiVO> selectListVO(Wrapper<DiscussbaokanxinxiEntity> wrapper);
   	
   	DiscussbaokanxinxiVO selectVO(@Param("ew") Wrapper<DiscussbaokanxinxiEntity> wrapper);
   	
   	List<DiscussbaokanxinxiView> selectListView(Wrapper<DiscussbaokanxinxiEntity> wrapper);
   	
   	DiscussbaokanxinxiView selectView(@Param("ew") Wrapper<DiscussbaokanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaokanxinxiEntity> wrapper);
   	

}

