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


import com.dao.DingyuefasongDao;
import com.entity.DingyuefasongEntity;
import com.service.DingyuefasongService;
import com.entity.vo.DingyuefasongVO;
import com.entity.view.DingyuefasongView;

@Service("dingyuefasongService")
public class DingyuefasongServiceImpl extends ServiceImpl<DingyuefasongDao, DingyuefasongEntity> implements DingyuefasongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingyuefasongEntity> page = this.selectPage(
                new Query<DingyuefasongEntity>(params).getPage(),
                new EntityWrapper<DingyuefasongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingyuefasongEntity> wrapper) {
		  Page<DingyuefasongView> page =new Query<DingyuefasongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingyuefasongVO> selectListVO(Wrapper<DingyuefasongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingyuefasongVO selectVO(Wrapper<DingyuefasongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingyuefasongView> selectListView(Wrapper<DingyuefasongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingyuefasongView selectView(Wrapper<DingyuefasongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
