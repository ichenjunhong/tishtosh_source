package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfoStruct */
public class HotSearchInfoStruct implements Serializable {
    @C17952c(mo34828a = "ailab_extra")
    String aiLabExtra;
    @C17952c(mo34828a = "biz_extra")
    String bizExtra;
    @C17952c(mo34828a = "rec_extra")
    String recExtra;
    @C17952c(mo34828a = "sentence")
    String sentence;

    public String getAiLabExtra() {
        return this.aiLabExtra;
    }

    public String getBizExtra() {
        return this.bizExtra;
    }

    public String getRecExtra() {
        return this.recExtra;
    }

    public String getSentence() {
        return this.sentence;
    }

    public void setAiLabExtra(String str) {
        this.aiLabExtra = str;
    }

    public void setBizExtra(String str) {
        this.bizExtra = str;
    }

    public void setRecExtra(String str) {
        this.recExtra = str;
    }

    public void setSentence(String str) {
        this.sentence = str;
    }
}
