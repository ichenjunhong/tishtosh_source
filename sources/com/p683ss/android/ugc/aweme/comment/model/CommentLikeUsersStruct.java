package com.p683ss.android.ugc.aweme.comment.model;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct */
public final class CommentLikeUsersStruct extends Comment implements Serializable {
    private Aweme aweme;
    private int dialogHeight;
    private String eventType = "";
    private List<? extends User> likeUsers;
    private long likeUsersCount;

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final int getDialogHeight() {
        return this.dialogHeight;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final List<User> getLikeUsers() {
        return this.likeUsers;
    }

    public final long getLikeUsersCount() {
        return this.likeUsersCount;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setDialogHeight(int i) {
        this.dialogHeight = i;
    }

    public final void setLikeUsers(List<? extends User> list) {
        this.likeUsers = list;
    }

    public final void setLikeUsersCount(long j) {
        this.likeUsersCount = j;
    }

    public final void setEventType(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.eventType = str;
    }
}
