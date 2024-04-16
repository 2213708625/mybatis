package fuxi.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @projectName: mybatis
 * @package: fuxi.bean
 * @className: Student
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/16 18:29
 * @version: 1.0
 */
public class Student implements Serializable {
    private Integer sid;
    private String sname;
    private Integer cid;
    private Clazz clazz;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", cid=" + cid +
                ", clazz=" + clazz +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) && Objects.equals(sname, student.sname) && Objects.equals(cid, student.cid) && Objects.equals(clazz, student.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, cid, clazz);
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(Integer sid, String sname, Integer cid, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.cid = cid;
        this.clazz = clazz;
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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }


    public Student() {
    }
}
