package com.entity.model;

import com.entity.ZhandianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 站点信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-29 00:46:21
 */
public class ZhandianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 站点分类
	 */
	
	private String zhandianfenlei;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 发车间隔
	 */
	
	private String fachejiange;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：站点分类
	 */
	 
	public void setZhandianfenlei(String zhandianfenlei) {
		this.zhandianfenlei = zhandianfenlei;
	}
	
	/**
	 * 获取：站点分类
	 */
	public String getZhandianfenlei() {
		return zhandianfenlei;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：发车间隔
	 */
	 
	public void setFachejiange(String fachejiange) {
		this.fachejiange = fachejiange;
	}
	
	/**
	 * 获取：发车间隔
	 */
	public String getFachejiange() {
		return fachejiange;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
