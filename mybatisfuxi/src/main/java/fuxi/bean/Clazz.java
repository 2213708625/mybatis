package fuxi.bean;

import java.util.Arrays;

/**
 * @projectName: mybatis
 * @package: fuxi.bean
 * @className: Clazz
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/16 20:34
 * @version: 1.0
 */
public class Clazz {
    private Integer cid;
    private String cname;
    private Student[] student;

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", student=" + Arrays.toString(student) +
                '}';
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

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Clazz(Integer cid, String cname, Student[] student) {
        this.cid = cid;
        this.cname = cname;
        this.student = student;
    }

    public Clazz() {
    }
}
