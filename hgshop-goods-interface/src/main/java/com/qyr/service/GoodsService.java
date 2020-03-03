package com.qyr.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.qyr.beans.Brand;
import com.qyr.beans.Category;

/**
 * 
 * @author zhuzg
 *  
 *  **** Dubbo ����ӿں�����Ҫ�з�Void �ķ���ֵ********
 *  
 */
public interface GoodsService {
	
	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	/**
	 * 
	 * @param firstChar ����ĸ
	 * @param page ҳ��
	 * @return
	 */
	PageInfo<Brand> listBrand( String firstChar,int page); 
	
	
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	/**
	 * 
	 * @param firstChar ����ĸ
	 * @param page ҳ��
	 * @return
	 */
	PageInfo<Category> listCategory( String firstChar,int page); 
	/**
	 * ��������ʽ��ʾ�б�
	 * @return
	 */
	List<Category> treeCategory(); 
	
	

}
