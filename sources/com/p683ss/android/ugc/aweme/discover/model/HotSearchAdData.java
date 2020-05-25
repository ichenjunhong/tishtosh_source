package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.p2087e.C39834a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchAdData */
public class HotSearchAdData implements Serializable {
    @C17952c(mo34828a = "click_track_url_list")
    private UrlModel clickTrackUrl;
    @C17952c(mo34828a = "creative_id")
    private long creativeId;
    @C17952c(mo34828a = "is_preview")
    private boolean isPreiew;
    @C17951b(mo34826a = C39834a.class)
    @C17952c(mo34828a = "item_id_list")
    private String itemIdList;
    @C17952c(mo34828a = "log_extra")
    private String logExtra;
    @C17952c(mo34828a = "track_url_list")
    private UrlModel trackUrl;

    public UrlModel getClickTrackUrl() {
        return this.clickTrackUrl;
    }

    public long getCreativeId() {
        return this.creativeId;
    }

    public String getItemIdList() {
        return this.itemIdList;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public UrlModel getTrackUrl() {
        return this.trackUrl;
    }

    public boolean isPreiew() {
        return this.isPreiew;
    }
}
