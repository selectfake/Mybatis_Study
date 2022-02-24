package com.study.entity;

/**
 * @author zr_kcool
 * @date 2022/2/24
 * @TIME 19:36
 */
public class DianYingXinXi {
  private Integer id;
  private Integer leixingId;
  private String ming;
  private String yanYuan;
  private String daoYan;
  private Float piaoJia;
  private String tuPianLuJing;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getLeixingId() {
    return leixingId;
  }

  public void setLeixingId(Integer leixingId) {
    this.leixingId = leixingId;
  }

  public String getMing() {
    return ming;
  }

  public void setMing(String ming) {
    this.ming = ming;
  }

  public String getYanYuan() {
    return yanYuan;
  }

  public void setYanYuan(String yanYuan) {
    this.yanYuan = yanYuan;
  }

  public String getDaoYan() {
    return daoYan;
  }

  public void setDaoYan(String daoYan) {
    this.daoYan = daoYan;
  }

  public Float getPiaoJia() {
    return piaoJia;
  }

  public void setPiaoJia(Float piaoJia) {
    this.piaoJia = piaoJia;
  }

  public String getTuPianLuJing() {
    return tuPianLuJing;
  }

  public void setTuPianLuJing(String tuPianLuJing) {
    this.tuPianLuJing = tuPianLuJing;
  }
}
