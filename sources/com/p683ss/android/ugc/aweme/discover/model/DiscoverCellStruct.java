package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct */
public final class DiscoverCellStruct {
    @C17952c(mo34828a = "avatar_url")
    public UrlModel avatarUrl;
    @C17952c(mo34828a = "aweme_list")
    public List<? extends Aweme> awemeList;
    @C17952c(mo34828a = "button_name")
    public String buttonName;
    @C17952c(mo34828a = "cell_id")
    public String cellId;
    @C17952c(mo34828a = "cover_url")
    public UrlModel coverUrl;
    @C17952c(mo34828a = "desc")
    public String desc;
    @C17952c(mo34828a = "is_recommend")
    public boolean isRecommend;
    @C17952c(mo34828a = "ref_url")
    public String refUrl;
    @C17952c(mo34828a = "subtype")
    public int subtype;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "type")
    public int type;

    public final boolean isCommerceChallenge() {
        if (this.subtype == 4) {
            return true;
        }
        return false;
    }

    public final String getMobIdKey() {
        int i = this.subtype;
        if (i == 3) {
            return "playlist_tag_id";
        }
        if (i == 8) {
            return "playlist_artist";
        }
        switch (i) {
            case 5:
                return "playlist_music_id";
            case 6:
                return "playlist_uid";
            default:
                return "playlist_id";
        }
    }

    public final String getPlayListType() {
        int i = this.subtype;
        if (i == 8) {
            return "artist";
        }
        switch (i) {
            case 0:
                return "normal_playlist";
            case 1:
                return "sticker";
            case 2:
                return "activity";
            case 3:
            case 4:
                return "challenge";
            case 5:
                return "music";
            default:
                return "user";
        }
    }

    public final String getSubtypeValue() {
        switch (this.subtype) {
            case 0:
                return "normal_playlist";
            case 1:
                return "sticker";
            case 2:
                return "activity";
            case 3:
            case 4:
                return "challenge";
            case 5:
                return "music";
            case 6:
                return "user";
            case 8:
                return "artist";
            default:
                return "unknown_type";
        }
    }
}
