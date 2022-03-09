package com.study.dao;

import com.study.entity.DianYingXinXi;
import com.study.entity.TiaoJian;

import java.util.List;

/**
 * @author zr_kcool
 * @date 2022/2/24
 * @TIME 19:40
 */
public interface DianYingDao {
  void insertDianYing(DianYingXinXi dy);

  void updateDianYing(DianYingXinXi dy);

  void deleteDianYingById(DianYingXinXi dy);

  List<DianYingXinXi> chaDianYing();

  List<DianYingXinXi> chaDianYingByTiaoJian(TiaoJian tiaoJian);
}
