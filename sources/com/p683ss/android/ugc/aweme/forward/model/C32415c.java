package com.p683ss.android.ugc.aweme.forward.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.model.c */
public final class C32415c implements Serializable {
    @C17952c(mo34828a = "aweme")

    /* renamed from: a */
    Aweme f84349a;

    /* renamed from: b */
    String f84350b;
    @C17952c(mo34828a = "comment_list")

    /* renamed from: c */
    List<Comment> f84351c;
    @C17952c(mo34828a = "type")

    /* renamed from: d */
    int f84352d;
    @C17952c(mo34828a = "count")

    /* renamed from: e */
    int f84353e;
    @C17952c(mo34828a = "favorite_list")

    /* renamed from: f */
    List<Aweme> f84354f;
    @C17952c(mo34828a = "time")

    /* renamed from: g */
    long f84355g;
    @C17952c(mo34828a = "favorite_ids")

    /* renamed from: h */
    List<String> f84356h;

    public final Aweme getAweme() {
        return this.f84349a;
    }

    public final long getBlockFavoriteTime() {
        return this.f84355g;
    }

    public final List<Comment> getComments() {
        return this.f84351c;
    }

    public final List<String> getFavoriteIds() {
        return this.f84356h;
    }

    public final List<Aweme> getFavorites() {
        return this.f84354f;
    }

    public final int getItemType() {
        return this.f84352d;
    }

    public final int getLikeCount() {
        return this.f84353e;
    }

    public final void setAweme(Aweme aweme) {
        this.f84349a = aweme;
    }

    public final void setBlockFavoriteTime(long j) {
        this.f84355g = j;
    }

    public final void setComments(List<Comment> list) {
        this.f84351c = list;
    }

    public final void setFavoriteIds(List<String> list) {
        this.f84356h = list;
    }

    public final void setFavorites(List<Aweme> list) {
        this.f84354f = list;
    }

    public final void setItemType(int i) {
        this.f84352d = i;
    }

    public final void setLikeCount(int i) {
        this.f84353e = i;
    }

    public final void setRequestId(String str) {
        this.f84350b = str;
        if (this.f84349a != null) {
            this.f84349a.setRequestId(str);
        }
    }
}
