package likethis.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @projectName: mybatis
 * @package: likethis.bean
 * @className: Student
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/13 20:00
 * @version: 1.0
 */
public class Student implements Serializable {
    private Integer sid;
    private String sname;
    private Integer cid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) && Objects.equals(sname, student.sname) && Objects.equals(cid, student.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, cid);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", cid=" + cid +
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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Student(Integer sid, String sname, Integer cid) {
        this.sid = sid;
        this.sname = sname;
        this.cid = cid;
    }

    public Student() {
    }
}
