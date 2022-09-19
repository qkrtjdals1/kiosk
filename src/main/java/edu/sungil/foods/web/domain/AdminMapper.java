package edu.sungil.foods.web.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sungil.foods.web.domain.dto.MenuInfo;
import edu.sungil.foods.web.domain.dto.schMenuInfo;

@Mapper
public interface AdminMapper {
	void insertMenu(MenuInfo menuInfo);

	List<MenuInfo> selectMenuList(schMenuInfo schMenuInfo);
	
	
	
	
}
