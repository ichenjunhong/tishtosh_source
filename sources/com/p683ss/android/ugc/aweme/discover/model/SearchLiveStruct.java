package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchLiveStruct */
public class SearchLiveStruct implements Serializable {
    @C17952c(mo34828a = "lives")
    Aweme liveAweme;
    @C17952c(mo34828a = "type")
    int type;

    public Aweme getLiveAweme() {
        return this.liveAweme;
    }

    public int getType() {
        return this.type;
    }

    public boolean isSearchLiveCrad() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public void setLiveAweme(Aweme aweme) {
        this.liveAweme = aweme;
    }

    public void setType(int i) {
        this.type = i;
    }
}
