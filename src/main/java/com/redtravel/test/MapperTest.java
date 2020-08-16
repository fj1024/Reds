package com.redtravel.test;

import java.util.UUID;

import com.redtravel.bean.User;
import com.redtravel.dao.UserMapper;
import com.redtravel.utils.RandomUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 测试dao层的工作
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	UserMapper userMapper;
	@Autowired
	SqlSession sqlSession;

	@Test
	public void testCRUD(){

		//插入用户
		//userMapper.insertSelective(new User(null,"11111","fasfsadf"));
		//测试验证码
//		for (int i = 1;i<10;i++){
//		String code = RandomUtils.createActive();
//		System.out.println(code);}


		
	}

}
