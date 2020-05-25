package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelExtra */
public final class RelationLabelExtra implements Serializable {
    @C17952c(mo34828a = "after_text")
    private String afterText = "";
    @C17952c(mo34828a = "comment_id")
    private String cid = "";
    @C17952c(mo34828a = "tab_text")
    private String tabText = "";

    public final String getAfterText() {
        return this.afterText;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getTabText() {
        return this.tabText;
    }

    public final void setAfterText(String str) {
        this.afterText = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setTabText(String str) {
        this.tabText = str;
    }
}
