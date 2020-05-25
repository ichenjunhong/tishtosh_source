package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AggregationTab */
public class AggregationTab implements Serializable {
    @C17952c(mo34828a = "show_tab")
    boolean showTab;
    @C17952c(mo34828a = "title")
    String title;

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTab() {
        return this.showTab;
    }

    public void setShowTab(boolean z) {
        this.showTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
