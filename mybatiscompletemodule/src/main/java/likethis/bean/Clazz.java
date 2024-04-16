package likethis.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @projectName: mybatis
 * @package: likethis.bean
 * @className: Clazz
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/15 11:47
 * @version: 1.0
 */
public class Clazz implements Serializable {
    private Integer cid;
    private String cname;
    private Student student;

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", student=" + student +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return Objects.equals(cid, clazz.cid) && Objects.equals(cname, clazz.cname) && Objects.equals(student, clazz.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cname, student);
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Clazz(Integer cid, String cname, Student student) {
        this.cid = cid;
        this.cname = cname;
        this.student = student;
    }

    public Clazz() {
    }
}
