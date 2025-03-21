package com.dao;

import com.entity.DiscussxianhuaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxianhuaxinxiVO;
import com.entity.view.DiscussxianhuaxinxiView;


/**
 * 鲜花信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-10 17:20:56
 */
public interface DiscussxianhuaxinxiDao extends BaseMapper<DiscussxianhuaxinxiEntity> {
	
	List<DiscussxianhuaxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
	
	DiscussxianhuaxinxiVO selectVO(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
	
	List<DiscussxianhuaxinxiView> selectListView(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);

	List<DiscussxianhuaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
	
	DiscussxianhuaxinxiView selectView(@Param("ew") Wrapper<DiscussxianhuaxinxiEntity> wrapper);
	

}
