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


import com.dao.BaokanxinxiDao;
import com.entity.BaokanxinxiEntity;
import com.service.BaokanxinxiService;
import com.entity.vo.BaokanxinxiVO;
import com.entity.view.BaokanxinxiView;

@Service("baokanxinxiService")
public class BaokanxinxiServiceImpl extends ServiceImpl<BaokanxinxiDao, BaokanxinxiEntity> implements BaokanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaokanxinxiEntity> page = this.selectPage(
                new Query<BaokanxinxiEntity>(params).getPage(),
                new EntityWrapper<BaokanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaokanxinxiEntity> wrapper) {
		  Page<BaokanxinxiView> page =new Query<BaokanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaokanxinxiVO> selectListVO(Wrapper<BaokanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaokanxinxiVO selectVO(Wrapper<BaokanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaokanxinxiView> selectListView(Wrapper<BaokanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaokanxinxiView selectView(Wrapper<BaokanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
