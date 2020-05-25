package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.c */
public final class C39119c implements Serializable {
    @C17952c(mo34828a = "code")
    public long code;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "poi_info_list")
    public List<SimplePoiInfoStruct> poiInfoStructList;

    public final int size() {
        if (this.poiInfoStructList == null) {
            return 0;
        }
        return this.poiInfoStructList.size();
    }

    public final boolean hasMore() {
        if (this.poiInfoStructList == null || this.poiInfoStructList.size() <= 9) {
            return false;
        }
        return true;
    }

    public final List<SimplePoiInfoStruct> getPage(int i, int i2) {
        int i3 = i * i2;
        int i4 = i2 + i3;
        List<SimplePoiInfoStruct> list = this.poiInfoStructList;
        if (i4 > size()) {
            i4 = size();
        }
        return list.subList(i3, i4);
    }
}
