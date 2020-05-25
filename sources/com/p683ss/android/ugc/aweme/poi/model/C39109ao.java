package com.p683ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ao */
public final class C39109ao implements Serializable {
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "poi_info_list")
    public List<SimplePoiInfoStruct> list;
    @C17952c(mo34828a = "title")
    public String title;

    public final boolean hasMore() {
        return this.hasMore;
    }

    public final void addNullItem() {
        this.list.add(new SimplePoiInfoStruct());
    }

    public final boolean isValid() {
        if (TextUtils.isEmpty(this.title) || C9376b.m18558a((Collection<T>) this.list) || this.list.size() < 3) {
            return false;
        }
        return true;
    }
}
