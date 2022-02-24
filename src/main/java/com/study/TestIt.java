package com.study;


import com.study.dao.DianYingDao;
import com.study.dao.LeiXingDao;
import com.study.entity.DianYingXinXi;
import com.study.entity.LeiXing;
import com.study.entity.TiaoJian;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

/**
 * @author zr_kcool
 * @date 2022/2/21
 * @TIME 16:54
 */
public class TestIt {
  public static void main(String[] args) throws Exception {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();
    //4.打开 sql session
    SqlSession se = sf.openSession();
//    获得电影dao代理
    DianYingDao dao = se.getMapper(DianYingDao.class);
    TiaoJian tj = new TiaoJian();
    tj.setDiJia(1f);
    tj.setGaoJia(1000f);
    tj.setMing("");
    List<DianYingXinXi> dys = dao.chaDianYingByTiaoJian(tj);

    se.close();


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
  }

  private static void hehe() {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();

//4.打开 sql session
    SqlSession se = sf.openSession();
    //创建一个类型对象
    LeiXing lx = new LeiXing();
    lx.setId(1);
    lx.setLeiXing("hehe");
//    用sqlsession的GetMapper方法获得接口对应的代理对象
    LeiXingDao dao = se.getMapper(LeiXingDao.class);
    LeiXing lxs = dao.chaLeiXingByLeiXing(lx);
    if (lxs != null) {
      System.out.println(lxs.getLeiXing());
    }
    se.close();
  }

  private static void parameterLeiXing() {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();

//4.打开 sql session
    SqlSession se = sf.openSession();
    //创建一个类型对象
    LeiXing lx = new LeiXing();
    lx.setId(1);
    lx.setLeiXing("hehe");

//5.执行 sql
    LeiXing lxs = se.selectOne("com.study.dao.LeiXingDao.chaLeiXingByLeiXing", lx);
  }

  private static void chaById() {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();
//4.打开 sql session
    SqlSession se = sf.openSession();
//5.执行 sql
    List<LeiXing> lxs = se.selectList("com.study.dao.LeiXingDao.chaLeiXingById", 1);
    //6.输出
    for (LeiXing lx : lxs)
      System.out.println(lx.getLeiXing());
    se.close();
  }

  private static void testFirst() {
    //   用工具类封装前三步重用功能
    SqlSessionFactory sf = MyBatisUtil.getSqlSessionFactory();
//4.打开 sql session
    SqlSession se = sf.openSession();
//5.执行 sql
    List<LeiXing> lxs =
            se.selectList("com.study.dao.LeiXingDao.chaLeiXing");
//6.输出
    for (LeiXing lx : lxs)
      System.out.println(lx.getLeiXing());
    se.close();
  }
}