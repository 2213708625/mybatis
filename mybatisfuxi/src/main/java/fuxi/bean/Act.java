package fuxi.bean;

/**
 * @projectName: mybatis
 * @package: fuxi.bean
 * @className: Act
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/18 20:46
 * @version: 1.0
 */
public class Act {
    private Long id;
    private String actno;
    private Double balance;

    @Override
    public String toString() {
        return "Act{" +
                "id=" + id +
                ", actno='" + actno + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Act() {
    }

    public Act(Long id, String actno, Double balance) {
        this.id = id;
        this.actno = actno;
        this.balance = balance;
    }
}
