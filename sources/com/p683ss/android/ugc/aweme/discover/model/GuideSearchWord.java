package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.GuideSearchWord */
public final class GuideSearchWord implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private String f74684id;
    private boolean isAllTab;
    @C17952c(mo34828a = "query_id")
    private String queryId;
    private boolean selected;
    @C17952c(mo34828a = "type")
    private String type;
    @C17952c(mo34828a = "word")
    private String word;

    public final String getId() {
        return this.f74684id;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWord() {
        return this.word;
    }

    public final boolean isAllTab() {
        return this.isAllTab;
    }

    public final String toString() {
        String str;
        if (this.word != null) {
            str = this.word;
            if (str == null) {
                C52711k.m112234a();
                return str;
            }
        } else {
            str = "";
        }
        return str;
    }

    public final void setAllTab(boolean z) {
        this.isAllTab = z;
    }

    public final void setId(String str) {
        this.f74684id = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setWord(String str) {
        this.word = str;
    }
}
