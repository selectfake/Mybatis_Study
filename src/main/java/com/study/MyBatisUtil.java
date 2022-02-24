package com.study;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtil {
  private static SqlSessionFactory sqlSessionFactory;//静态变量sqlSessionFactory

  static {//静态代码块，类加载时被执行
    try {
      //1.创建SqlSessionFactoryBuilder  建造者
      SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
      //2.解析主配置文件获得reader
      Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
      //3.创建SqlSessionFactory工厂
      sqlSessionFactory=sfb.build(reader);//注意这里没有声明，是为静态变量赋值
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //静态工具方法返回 SqlSessionFactory
  public static SqlSessionFactory getSqlSessionFactory() {
    return sqlSessionFactory;
  }
}