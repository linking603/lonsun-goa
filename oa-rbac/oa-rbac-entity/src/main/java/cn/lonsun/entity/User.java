package cn.lonsun.entity;

import java.math.BigDecimal;

public class User extends AMockEntity {
    private BigDecimal userId;

    private String userName;

    private String userPwd;

    private Short userEnable;

    private Long userLoginCount;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Short getUserEnable() {
        return userEnable;
    }

    public void setUserEnable(Short userEnable) {
        this.userEnable = userEnable;
    }

    public Long getUserLoginCount() {
        return userLoginCount;
    }

    public void setUserLoginCount(Long userLoginCount) {
        this.userLoginCount = userLoginCount;
    }
}