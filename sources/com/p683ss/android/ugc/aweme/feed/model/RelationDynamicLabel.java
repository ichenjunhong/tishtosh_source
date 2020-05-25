package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel */
public class RelationDynamicLabel implements Serializable {
    @C17952c(mo34828a = "count")
    public int count;
    @C17952c(mo34828a = "label_info")
    public String labelInfo;
    @C17952c(mo34828a = "nickname")
    public String nickname;
    @C17952c(mo34828a = "tab_label_info")
    public String tabText;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "user_id")
    public String userId;

    public int getCount() {
        return this.count;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getTabText() {
        return this.tabText;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.labelInfo)) {
            return true;
        }
        return false;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setTabText(String str) {
        this.tabText = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public RelationDynamicLabel setUserId(String str) {
        this.userId = str;
        return this;
    }
}
