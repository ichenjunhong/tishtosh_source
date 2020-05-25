package com.p683ss.android.ugc.aweme.discover.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMix */
public class SearchMix extends SearchApiResult {
    @C17952c(mo34828a = "aweme_list")
    public List<Aweme> awemeList;
    @C17952c(mo34828a = "challenge_list")
    public List<SearchChallenge> challengeList;
    @C17952c(mo34828a = "cursor")
    public int cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "has_top_user")
    public boolean hasTopUser;
    @C17952c(mo34828a = "modules")
    public List<String> modulesList;
    @C17952c(mo34828a = "music_list")
    public List<Music> musicLists;
    @C17952c(mo34828a = "poi_info_list")
    public List<SearchPoi> poiList;
    @C17952c(mo34828a = "user_list")
    public List<SearchUser> users;

    public boolean isAllEmpty() {
        if (!C9376b.m18558a((Collection<T>) this.users) || !C9376b.m18558a((Collection<T>) this.musicLists) || !C9376b.m18558a((Collection<T>) this.challengeList) || !C9376b.m18558a((Collection<T>) this.awemeList)) {
            return false;
        }
        return true;
    }
}
