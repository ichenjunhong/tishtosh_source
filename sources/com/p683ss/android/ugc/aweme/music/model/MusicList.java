package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicList */
public class MusicList extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public int cursor;
    @C17952c(mo34828a = "has_more")
    public int hasMore;
    @C17952c(mo34828a = "music_list")
    public List<Music> items;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPb;
    @C17952c(mo34828a = "music_type")
    public int mMusicType;
    @C17952c(mo34828a = "mc_info")
    public MusicCollectionItem mcInfo;
    @C17952c(mo34828a = "radio_cursor")
    public int radioCursor;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public int getCursor() {
        if (this.radioCursor > 0) {
            return this.radioCursor;
        }
        return this.cursor;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
