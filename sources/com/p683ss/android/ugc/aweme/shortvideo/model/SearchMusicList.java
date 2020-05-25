package com.p683ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SearchMusicList */
public class SearchMusicList {
    @C17952c(mo34828a = "cursor")
    public int cursor;
    @C17952c(mo34828a = "has_more")
    int hasMore;
    @C17952c(mo34828a = "music_list")
    public List<SearchMusic> items;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
