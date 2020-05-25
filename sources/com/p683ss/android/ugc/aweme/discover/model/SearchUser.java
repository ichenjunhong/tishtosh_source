package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.alading.C28047l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchUser */
public class SearchUser {
    @C17952c(mo34828a = "ad_item")
    public Aweme adItem;
    @C17952c(mo34828a = "items")
    public List<Aweme> awemeCards;
    @C17952c(mo34828a = "challenges")
    public List<Challenge> challengeList;
    @C17952c(mo34828a = "effects")
    public List<NewFaceSticker> effectCards;
    @C17952c(mo34828a = "hotspot")
    public C28047l hotSpot;
    @C17952c(mo34828a = "mix_list")
    public List<MixStruct> mixStructList;
    @C17952c(mo34828a = "musics")
    public List<Music> musicCards;
    @C17952c(mo34828a = "position")
    public List<Position> position;
    public int rank;
    @C17952c(mo34828a = "remark_position")
    public List<Position> remarkPosition;
    @C17952c(mo34828a = "uniqid_position")
    public List<Position> uniqidPosition;
    @C17952c(mo34828a = "user_info")
    public User user;

    public boolean isAladdin() {
        if (cardType() != 0) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.awemeCards == null && this.musicCards == null) {
            return false;
        }
        return true;
    }

    public int cardType() {
        if (!C9376b.m18558a((Collection<T>) this.awemeCards)) {
            return 1;
        }
        if (!C9376b.m18558a((Collection<T>) this.musicCards)) {
            return 2;
        }
        if (!C9376b.m18558a((Collection<T>) this.effectCards)) {
            return 3;
        }
        return 0;
    }

    public int hashCode() {
        if (this.user.getUid() != null) {
            return this.user.getUid().hashCode();
        }
        return 0;
    }

    public SearchUser setUser(User user2) {
        this.user = user2;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUser)) {
            return false;
        }
        return TextUtils.equals(this.user.getUid(), ((SearchUser) obj).user.getUid());
    }
}
