package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.OriginalMusicList */
public class OriginalMusicList extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public int cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "music")
    public List<Music> musicList;
}
