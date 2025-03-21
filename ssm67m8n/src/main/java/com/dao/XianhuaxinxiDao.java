package com.dao;

import com.entity.XianhuaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianhuaxinxiVO;
import com.entity.view.XianhuaxinxiView;


/**
 * 鲜花信息
 * 
 * @author 
 * @email 
 * @date 2022-03-10 17:20:56
 */
public interface XianhuaxinxiDao extends BaseMapper<XianhuaxinxiEntity> {
	
	List<XianhuaxinxiVO> selectListVO(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
	
	XianhuaxinxiVO selectVO(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
	
	List<XianhuaxinxiView> selectListView(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);

	List<XianhuaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
	
	XianhuaxinxiView selectView(@Param("ew") Wrapper<XianhuaxinxiEntity> wrapper);
	

}
