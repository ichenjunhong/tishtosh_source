package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusicList */
public class SearchMusicList extends SearchApiResult {
    @C17952c(mo34828a = "cursor")
    public int cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "music", mo34829b = {"music_list"})
    public List<Music> musicList;
    @C17952c(mo34828a = "music_info_list")
    public List<SearchMusic> searchMusicList;
}
