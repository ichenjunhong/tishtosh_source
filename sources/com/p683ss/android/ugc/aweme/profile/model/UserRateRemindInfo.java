package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo */
public class UserRateRemindInfo implements Serializable {
    @C17952c(mo34828a = "detail_link")
    String detailLink;
    @C17952c(mo34828a = "remind_text")
    String remindText;
    @C17952c(mo34828a = "show_day_limit")
    int showDayLimit;

    public String getDetailLink() {
        return this.detailLink;
    }

    public String getRemindText() {
        return this.remindText;
    }

    public int getShowDayLimit() {
        return this.showDayLimit;
    }

    public void setDetailLink(String str) {
        this.detailLink = str;
    }

    public void setRemindText(String str) {
        this.remindText = str;
    }

    public void setShowDayLimit(int i) {
        this.showDayLimit = i;
    }
}
