package seniormapper.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @projectName: mybatis
 * @package: seniormapper.bean
 * @className: clazz
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/12 8:53
 * @version: 1.0
 */
public class Clazz implements Serializable {
 private Integer cid;
 private String cname;
 private List<Student> stus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return Objects.equals(cid, clazz.cid) && Objects.equals(cname, clazz.cname) && Objects.equals(stus, clazz.stus);
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", stus=" + stus +
                '}';
    }

    public Clazz(Integer cid, String cname, List<Student> stus) {
        this.cid = cid;
        this.cname = cname;
        this.stus = stus;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }


    @Override
    public int hashCode() {
        return Objects.hash(cid, cname);
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    public Clazz() {
    }
}
