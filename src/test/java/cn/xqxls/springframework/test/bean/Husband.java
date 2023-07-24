package cn.xqxls.springframework.test.bean;


import java.time.LocalDate;

public class Husband {

    private String wifiName;

    private LocalDate marriageDate;

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageLocalDate) {
        this.marriageDate = marriageLocalDate;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "wifiName='" + wifiName + '\'' +
                ", marriageLocalDate=" + marriageDate +
                '}';
    }

}
