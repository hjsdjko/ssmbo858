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


import com.dao.BaokandingyueDao;
import com.entity.BaokandingyueEntity;
import com.service.BaokandingyueService;
import com.entity.vo.BaokandingyueVO;
import com.entity.view.BaokandingyueView;

@Service("baokandingyueService")
public class BaokandingyueServiceImpl extends ServiceImpl<BaokandingyueDao, BaokandingyueEntity> implements BaokandingyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaokandingyueEntity> page = this.selectPage(
                new Query<BaokandingyueEntity>(params).getPage(),
                new EntityWrapper<BaokandingyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaokandingyueEntity> wrapper) {
		  Page<BaokandingyueView> page =new Query<BaokandingyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaokandingyueVO> selectListVO(Wrapper<BaokandingyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaokandingyueVO selectVO(Wrapper<BaokandingyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaokandingyueView> selectListView(Wrapper<BaokandingyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaokandingyueView selectView(Wrapper<BaokandingyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
