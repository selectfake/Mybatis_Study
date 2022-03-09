package com.study;


import com.study.dao.DianYingDao;
import com.study.dao.LeiXingDao;
import com.study.dao.XinWenDao;
import com.study.entity.DianYingXinXi;
import com.study.entity.LeiXing;
import com.study.entity.XinWenTiaoJian;
import com.study.entity.XinWenXinXi;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class TestXinWen {

  public static void main(String[] args) throws Exception {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();
    //4.打开 sql session
    SqlSession se = sf.openSession();
//    获得新闻dao
    XinWenDao dao = se.getMapper(XinWenDao.class);
    XinWenXinXi xw = new XinWenXinXi();
    xw.setZhuTi("一带一路");
    xw.setNeiRong("促进经济发展");
    dao.insertXinWenDynamic(xw);
    se.commit();
    se.close();
  }

  private static void forEach() {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();
    //4.打开 sql session
    SqlSession se = sf.openSession();
//    获得新闻dao
    XinWenDao dao = se.getMapper(XinWenDao.class);
    List ids = new ArrayList();
    ids.add(1);
    ids.add(2);
    ids.add(3);
    List<XinWenXinXi> res = dao.testForeach(ids);
    se.close();
  }

  private static void xuanzeandupdateDynamic() {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();
    //4.打开 sql session
    SqlSession se = sf.openSession();
//    获得新闻dao
    XinWenDao dao = se.getMapper(XinWenDao.class);
    XinWenTiaoJian xw = new XinWenTiaoJian();
//    XinWenXinXi xw = new XinWenXinXi();
    xw.setId(1);
    xw.setLeiXingId(1);
    xw.setZhuTi("俄乌局势");
    xw.setNeiRong("打仗了");
    List<XinWenXinXi> xws = dao.chaXinWenXinXiByTiaoJian(xw);
//    dao.updateXinWenDynamic(xw);
//    se.commit();
    se.close();
  }

  private static void charu() {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();
    //4.打开 sql session
    SqlSession se = sf.openSession();
//    获得新闻dao
    XinWenDao dao = se.getMapper(XinWenDao.class);
    XinWenXinXi xw = new XinWenXinXi();
    xw.setId(14);
//    xw.setLeiXingId(1);
    xw.setNeiRong("长江后浪推前浪");
    xw.setZhuTi("时代在变化");
    dao.insertXinWen(xw);
    se.commit();
    se.close();
  }
}


////    获得电影dao代
//    DianYingDao dao = se.getMapper(DianYingDao.class);
//    DianYingXinXi dy = new DianYingXinXi();
//    dy.setDaoYan("张艺谋13");
////    dy.setId(8);
//    dy.setLeixingId(1);
//    dy.setMing("红高粱62222262226");
//    dy.setPiaoJia(102f);
//    dy.setYanYuan("灰太23狼");
////    dao.deleteDianYingById(dy);
////    dao.updateDianYing(dy);
//    System.out.println(dy.getId());
//    dao.insertDianYing(dy);
//    System.out.println(dy.getId());
//    se.commit();//提交事物
//    se.close();
//  }
//}