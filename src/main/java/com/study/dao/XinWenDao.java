package com.study.dao;

import com.study.entity.DianYingXinXi;
import com.study.entity.XinWenTiaoJian;
import com.study.entity.XinWenXinXi;

import java.util.List;


/**
 * @author zr_kcool
 * @date 2022/2/28
 * @TIME 19:16
 */
public interface XinWenDao {
  void insertXinWen(XinWenXinXi dy);

  void updateXinWen(XinWenXinXi dy);

  void deleteXinWenById(XinWenXinXi dy);

  List<XinWenXinXi> chaXinWenXinXiByTiaoJian(XinWenTiaoJian tj);

  void updateXinWenDynamic(XinWenXinXi xw);

  List<XinWenXinXi> testForeach(List ids);

  void insertXinWenDynamic(XinWenXinXi xw);
}
