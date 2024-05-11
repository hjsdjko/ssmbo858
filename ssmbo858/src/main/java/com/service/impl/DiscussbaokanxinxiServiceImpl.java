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


import com.dao.DiscussbaokanxinxiDao;
import com.entity.DiscussbaokanxinxiEntity;
import com.service.DiscussbaokanxinxiService;
import com.entity.vo.DiscussbaokanxinxiVO;
import com.entity.view.DiscussbaokanxinxiView;

@Service("discussbaokanxinxiService")
public class DiscussbaokanxinxiServiceImpl extends ServiceImpl<DiscussbaokanxinxiDao, DiscussbaokanxinxiEntity> implements DiscussbaokanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaokanxinxiEntity> page = this.selectPage(
                new Query<DiscussbaokanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussbaokanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaokanxinxiEntity> wrapper) {
		  Page<DiscussbaokanxinxiView> page =new Query<DiscussbaokanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaokanxinxiVO> selectListVO(Wrapper<DiscussbaokanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaokanxinxiVO selectVO(Wrapper<DiscussbaokanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaokanxinxiView> selectListView(Wrapper<DiscussbaokanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaokanxinxiView selectView(Wrapper<DiscussbaokanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
