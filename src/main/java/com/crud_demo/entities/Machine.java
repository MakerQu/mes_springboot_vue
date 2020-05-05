package com.crud_demo.entities;

import javax.lang.model.element.NestingKind;

public class Machine {
    private Integer id;
    private String shebeibianhao;
    private String qiye;
    private String shebeileixing;
    private String chejian;
    private Integer zubie;
    private Integer jihao;
    private Integer zongzhenshu;
    private Integer lushu;
    private String jixiechangjia;
    private String gongzuomoshi;
    private String zhuangtai;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShebeibianhao() {
        return shebeibianhao;
    }

    public void setShebeibianhao(String shebeibianhao) {
        this.shebeibianhao = shebeibianhao;
    }

    public String getQiye() {
        return qiye;
    }

    public void setQiye(String qiye) {
        this.qiye = qiye;
    }

    public String getShebeileixing() {
        return shebeileixing;
    }

    public void setShebeileixing(String shebeileixing) {
        this.shebeileixing = shebeileixing;
    }

    public String getChejian() {
        return chejian;
    }

    public void setChejian(String chejian) {
        this.chejian = chejian;
    }

    public Integer getZubie() {
        return zubie;
    }

    public void setZubie(Integer zubie) {
        this.zubie = zubie;
    }

    public Integer getJihao() {
        return jihao;
    }

    public void setJihao(Integer jihao) {
        this.jihao = jihao;
    }

    public Integer getZongzhenshu() {
        return zongzhenshu;
    }

    public void setZongzhenshu(Integer zongzhenshu) {
        this.zongzhenshu = zongzhenshu;
    }

    public Integer getLushu() {
        return lushu;
    }

    public void setLushu(Integer lushu) {
        this.lushu = lushu;
    }

    public String getJixiechangjia() {
        return jixiechangjia;
    }

    public void setJixiechangjia(String jixiechangjia) {
        this.jixiechangjia = jixiechangjia;
    }

    public String getGongzuomoshi() {
        return gongzuomoshi;
    }

    public void setGongzuomoshi(String gongzuomoshi) {
        this.gongzuomoshi = gongzuomoshi;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", shebeibianhao='" + shebeibianhao + '\'' +
                ", qiye='" + qiye + '\'' +
                ", shebeileixing='" + shebeileixing + '\'' +
                ", chejian='" + chejian + '\'' +
                ", zubie=" + zubie +
                ", jihao=" + jihao +
                ", zongzhenshu=" + zongzhenshu +
                ", lushu=" + lushu +
                ", jixiechangjia='" + jixiechangjia + '\'' +
                ", gongzuomoshi='" + gongzuomoshi + '\'' +
                ", zhuangtai='" + zhuangtai + '\'' +
                '}';
    }
}
