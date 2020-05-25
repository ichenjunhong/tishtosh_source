package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCollection */
public class MusicCollection extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "mc_list")
    public List<MusicCollectionItem> items;

    public List<MusicCollectionItem> getItems() {
        if (this.items == null || this.items.isEmpty()) {
            return this.items;
        }
        return MusicCollectionFilterKt.distinctByName(this.items);
    }
}
