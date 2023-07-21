package cn.xqxls.springframework.test.bean;

/**
 * @author xqxls
 * @create 2023-07-21 14:34
 * @Description
 */
public class Husband {

    private Wife wife;

    public String queryWife(){
        return "Husband.wife";
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

}
