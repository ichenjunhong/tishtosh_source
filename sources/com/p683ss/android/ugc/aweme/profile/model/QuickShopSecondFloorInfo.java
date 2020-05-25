package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo */
public class QuickShopSecondFloorInfo implements Serializable {
    @C17952c(mo34828a = "enter_text")
    public String enterText;
    @C17952c(mo34828a = "process_text")
    public String processText;
    @C17952c(mo34828a = "trans_bg_text")
    public String transBgText;

    public String getEnterText() {
        return this.enterText;
    }

    public String getProcessText() {
        return this.processText;
    }

    public String getTransBgText() {
        return this.transBgText;
    }

    public void setEnterText(String str) {
        this.enterText = str;
    }

    public void setProcessText(String str) {
        this.processText = str;
    }

    public void setTransBgText(String str) {
        this.transBgText = str;
    }
}
