package com.study.dao;

import com.study.entity.LeiXing;

/**
 * @author zr_kcool
 * @date 2022/2/24
 * @TIME 19:25
 */
public interface   LeiXingDao {
  LeiXing chaLeiXing();
  LeiXing chaLeiXingById(Integer id);
  LeiXing chaLeiXingByLeiXing(LeiXing leiXing);
}
