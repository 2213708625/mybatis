package seniormapper.bean;

import java.util.Objects;

/**
 * @projectName: mybatis
 * @package: seniormapper.bean
 * @className: student
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/12 8:53
 * @version: 1.0
 */
public class Student {
    private Integer sid;
    private String sname;
    private Clazz clazz;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) && Objects.equals(sname, student.sname) && Objects.equals(clazz, student.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, clazz);
    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(Integer sid, String sname, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.clazz = clazz;
    }

    public Student() {
    }
}
