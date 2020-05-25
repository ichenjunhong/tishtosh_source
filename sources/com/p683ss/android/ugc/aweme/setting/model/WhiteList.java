package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.setting.model.WhiteList */
public class WhiteList {
    @C17952c(mo34828a = "long_whitelist")
    public String[] longWhiteList;
    @C17952c(mo34828a = "short_whitelist")
    public String[] shortWhiteList;

    public String[] getLongWhiteList() {
        if (this.longWhiteList == null) {
            this.longWhiteList = new String[0];
        }
        return this.longWhiteList;
    }

    public String[] getShortWhiteList() {
        if (this.shortWhiteList == null) {
            this.shortWhiteList = new String[0];
        }
        return this.shortWhiteList;
    }
}
