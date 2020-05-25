package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryList */
public class CategoryList extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public int cursor;
    @C17952c(mo34828a = "device_type")
    public int deviceType;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "category_list")
    public List<Category> items;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }
}
