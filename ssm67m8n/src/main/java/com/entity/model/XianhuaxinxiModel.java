package com.entity.model;

import com.entity.XianhuaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 鲜花信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-10 17:20:56
 */
public class XianhuaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 鲜花类型
	 */
	
	private String xianhualeixing;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 相关花语
	 */
	
	private String xiangguanhuayu;
		
	/**
	 * 赠送对象
	 */
	
	private String zengsongduixiang;
		
	/**
	 * 视频信息
	 */
	
	private String shipinxinxi;
		
	/**
	 * 鲜花介绍
	 */
	
	private String xianhuajieshao;
		
	/**
	 * 鲜花图片
	 */
	
	private String xianhuatupian;
		
	/**
	 * 商铺编号
	 */
	
	private String shangpubianhao;
		
	/**
	 * 商铺名称
	 */
	
	private String shangpumingcheng;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 会员价
	 */
	
	private Float vipprice;
				
	
	/**
	 * 设置：鲜花类型
	 */
	 
	public void setXianhualeixing(String xianhualeixing) {
		this.xianhualeixing = xianhualeixing;
	}
	
	/**
	 * 获取：鲜花类型
	 */
	public String getXianhualeixing() {
		return xianhualeixing;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：相关花语
	 */
	 
	public void setXiangguanhuayu(String xiangguanhuayu) {
		this.xiangguanhuayu = xiangguanhuayu;
	}
	
	/**
	 * 获取：相关花语
	 */
	public String getXiangguanhuayu() {
		return xiangguanhuayu;
	}
				
	
	/**
	 * 设置：赠送对象
	 */
	 
	public void setZengsongduixiang(String zengsongduixiang) {
		this.zengsongduixiang = zengsongduixiang;
	}
	
	/**
	 * 获取：赠送对象
	 */
	public String getZengsongduixiang() {
		return zengsongduixiang;
	}
				
	
	/**
	 * 设置：视频信息
	 */
	 
	public void setShipinxinxi(String shipinxinxi) {
		this.shipinxinxi = shipinxinxi;
	}
	
	/**
	 * 获取：视频信息
	 */
	public String getShipinxinxi() {
		return shipinxinxi;
	}
				
	
	/**
	 * 设置：鲜花介绍
	 */
	 
	public void setXianhuajieshao(String xianhuajieshao) {
		this.xianhuajieshao = xianhuajieshao;
	}
	
	/**
	 * 获取：鲜花介绍
	 */
	public String getXianhuajieshao() {
		return xianhuajieshao;
	}
				
	
	/**
	 * 设置：鲜花图片
	 */
	 
	public void setXianhuatupian(String xianhuatupian) {
		this.xianhuatupian = xianhuatupian;
	}
	
	/**
	 * 获取：鲜花图片
	 */
	public String getXianhuatupian() {
		return xianhuatupian;
	}
				
	
	/**
	 * 设置：商铺编号
	 */
	 
	public void setShangpubianhao(String shangpubianhao) {
		this.shangpubianhao = shangpubianhao;
	}
	
	/**
	 * 获取：商铺编号
	 */
	public String getShangpubianhao() {
		return shangpubianhao;
	}
				
	
	/**
	 * 设置：商铺名称
	 */
	 
	public void setShangpumingcheng(String shangpumingcheng) {
		this.shangpumingcheng = shangpumingcheng;
	}
	
	/**
	 * 获取：商铺名称
	 */
	public String getShangpumingcheng() {
		return shangpumingcheng;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：会员价
	 */
	 
	public void setVipprice(Float vipprice) {
		this.vipprice = vipprice;
	}
	
	/**
	 * 获取：会员价
	 */
	public Float getVipprice() {
		return vipprice;
	}
			
}
