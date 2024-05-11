package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaokanleixingDao;
import com.entity.BaokanleixingEntity;
import com.service.BaokanleixingService;
import com.entity.vo.BaokanleixingVO;
import com.entity.view.BaokanleixingView;

@Service("baokanleixingService")
public class BaokanleixingServiceImpl extends ServiceImpl<BaokanleixingDao, BaokanleixingEntity> implements BaokanleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaokanleixingEntity> page = this.selectPage(
                new Query<BaokanleixingEntity>(params).getPage(),
                new EntityWrapper<BaokanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaokanleixingEntity> wrapper) {
		  Page<BaokanleixingView> page =new Query<BaokanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaokanleixingVO> selectListVO(Wrapper<BaokanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaokanleixingVO selectVO(Wrapper<BaokanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaokanleixingView> selectListView(Wrapper<BaokanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaokanleixingView selectView(Wrapper<BaokanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
