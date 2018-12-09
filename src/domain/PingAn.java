package domain;

import java.util.Date;

/**
 * Created by Dagon on 2018/12/9 - 17:32
 */
public class PingAn {
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }

    private Date empDate;
}
