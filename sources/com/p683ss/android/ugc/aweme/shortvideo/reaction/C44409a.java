package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a */
public final class C44409a extends BaseResponse implements C22982e, Serializable {
    @C17952c(mo34828a = "can_react_current")

    /* renamed from: a */
    boolean f112349a;
    @C17952c(mo34828a = "can_react_origin")

    /* renamed from: b */
    boolean f112350b;
    @C17952c(mo34828a = "origin")

    /* renamed from: c */
    Aweme f112351c;

    /* renamed from: d */
    String f112352d;

    public final Aweme getOrigin() {
        return this.f112351c;
    }

    public final boolean getOriginReactable() {
        return this.f112350b;
    }

    public final boolean getReactable() {
        return this.f112349a;
    }

    public final String getRequestId() {
        return this.f112352d;
    }

    public final void setOrigin(Aweme aweme) {
        this.f112351c = aweme;
    }

    public final void setOriginReactable(boolean z) {
        this.f112350b = z;
    }

    public final void setReactable(boolean z) {
        this.f112349a = z;
    }

    public final void setRequestId(String str) {
        this.f112352d = str;
    }

    public final int getReactionPermission(Aweme aweme, Aweme aweme2) {
        if ((this.f112349a || C20854a.m53167g().isMe(aweme.getAuthor().getUid())) && (this.f112350b || C20854a.m53167g().isMe(aweme2.getAuthor().getUid()))) {
            return 3;
        }
        if (this.f112349a || C20854a.m53167g().isMe(aweme.getAuthor().getUid())) {
            return 2;
        }
        if (this.f112350b || C20854a.m53167g().isMe(aweme2.getAuthor().getUid())) {
            return 1;
        }
        return 0;
    }
}
