package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchPoi */
public class SearchPoi implements C22982e {
    public String logPb;
    @C17952c(mo34828a = "simple_poi_info")
    public SimplePoiInfoStruct poi;
    @C17952c(mo34828a = "position_info")
    public List<SearchPoiPosition> position;
    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        if (this.poi != null) {
            return this.poi.hashCode();
        }
        return 0;
    }

    public List<Position> getPositionInAddress() {
        if (this.position == null) {
            return null;
        }
        for (SearchPoiPosition searchPoiPosition : this.position) {
            if (searchPoiPosition.isPoiAddress()) {
                return searchPoiPosition.position;
            }
        }
        return null;
    }

    public List<Position> getPositionInName() {
        if (this.position == null) {
            return null;
        }
        for (SearchPoiPosition searchPoiPosition : this.position) {
            if (searchPoiPosition.isPoiName()) {
                return searchPoiPosition.position;
            }
        }
        return null;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPoi)) {
            return false;
        }
        return C23722i.m58215a(this.poi, ((SearchPoi) obj).poi);
    }
}
