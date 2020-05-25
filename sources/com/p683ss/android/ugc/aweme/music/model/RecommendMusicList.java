package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.RecommendMusicList */
public class RecommendMusicList {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "music_list")
    public List<RecommendMusic> musicList;

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
