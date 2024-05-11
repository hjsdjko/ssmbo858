package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingyuefasongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingyuefasongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingyuefasongView;


/**
 * 订阅发送
 *
 * @author 
 * @email 
 * @date 2022-05-18 11:41:33
 */
public interface DingyuefasongService extends IService<DingyuefasongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingyuefasongVO> selectListVO(Wrapper<DingyuefasongEntity> wrapper);
   	
   	DingyuefasongVO selectVO(@Param("ew") Wrapper<DingyuefasongEntity> wrapper);
   	
   	List<DingyuefasongView> selectListView(Wrapper<DingyuefasongEntity> wrapper);
   	
   	DingyuefasongView selectView(@Param("ew") Wrapper<DingyuefasongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingyuefasongEntity> wrapper);
   	

}

