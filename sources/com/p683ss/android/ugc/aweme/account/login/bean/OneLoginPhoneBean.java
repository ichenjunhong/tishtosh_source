package com.p683ss.android.ugc.aweme.account.login.bean;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean */
public class OneLoginPhoneBean implements Serializable {
    private String accessCode = "";
    private String from = "";
    private String fromMobLabel = "";
    private String mobile = "";

    public String getFrom() {
        return this.from;
    }

    public String getFromMobLabel() {
        return this.fromMobLabel;
    }

    public String getAccessCode() {
        if (this.accessCode == null) {
            return "";
        }
        return this.accessCode;
    }

    public String getMobile() {
        if (this.mobile == null) {
            return "";
        }
        return this.mobile;
    }

    public boolean isValidate() {
        if (!TextUtils.isEmpty(this.mobile)) {
            return true;
        }
        return false;
    }

    public OneLoginPhoneBean() {
    }

    public void setAccessCode(String str) {
        this.accessCode = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public OneLoginPhoneBean(String str, String str2, String str3) {
        this.mobile = str;
        this.from = str2;
        this.fromMobLabel = str3;
    }
}
