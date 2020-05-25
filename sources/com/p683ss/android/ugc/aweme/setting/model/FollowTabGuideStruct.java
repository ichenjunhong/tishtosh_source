package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.model.FollowTabGuideStruct */
public final class FollowTabGuideStruct implements Serializable {
    @C17952c(mo34828a = "follow_tab_guide_times")
    private int followTabGuideTime;
    @C17952c(mo34828a = "follow_tab_guide_word")
    private String followTabGuideWord = "";

    public final int getFollowTabGuideTime() {
        return this.followTabGuideTime;
    }

    public final String getFollowTabGuideWord() {
        return this.followTabGuideWord;
    }

    public final void setFollowTabGuideTime(int i) {
        this.followTabGuideTime = i;
    }

    public final void setFollowTabGuideWord(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.followTabGuideWord = str;
    }
}
