package com.study.entity;

/**
 * @author zr_kcool
 * @date 2022/2/24
 * @TIME 19:36
 */
public class XinWenXinXi {
  private Integer id;
  private Integer LeiXingId;

  private String zhuTi;
  private String neiRong;
  private String tuPianLuJing;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getLeiXingId() {
    return LeiXingId;
  }

  public void setLeiXingId(Integer leiXingId) {
    LeiXingId = leiXingId;
  }

  public String getZhuTi() {
    return zhuTi;
  }

  public void setZhuTi(String zhuTi) {
    this.zhuTi = zhuTi;
  }

  public String getNeiRong() {
    return neiRong;
  }

  public void setNeiRong(String neiRong) {
    this.neiRong = neiRong;
  }

  public String getTuPianLuJing() {
    return tuPianLuJing;
  }

  public void setTuPianLuJing(String tuPianLuJing) {
    this.tuPianLuJing = tuPianLuJing;
  }

}

