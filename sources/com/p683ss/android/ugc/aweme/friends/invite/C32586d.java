package com.p683ss.android.ugc.aweme.friends.invite;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.d */
public final class C32586d implements Serializable {
    @C17952c(mo34828a = "show_invite_all")

    /* renamed from: a */
    private boolean f84817a;
    @C17952c(mo34828a = "text")

    /* renamed from: b */
    private String f84818b;
    @C17952c(mo34828a = "url")

    /* renamed from: c */
    private String f84819c;
    @C17952c(mo34828a = "footer_invite_all")

    /* renamed from: d */
    private boolean f84820d;
    @C17952c(mo34828a = "limit_invite_all")

    /* renamed from: e */
    private int f84821e;

    public final int getLimitInviteAllCount() {
        return this.f84821e;
    }

    public final String getText() {
        return this.f84818b;
    }

    public final String getUrl() {
        return this.f84819c;
    }

    public final boolean isFloatInviteAll() {
        return this.f84820d;
    }

    public final boolean isShowInviteAll() {
        return this.f84817a;
    }

    public final void setFloatInviteAll(boolean z) {
        this.f84820d = z;
    }

    public final void setShowInviteAll(boolean z) {
        this.f84817a = z;
    }

    public final void setText(String str) {
        this.f84818b = str;
    }

    public final void setUrl(String str) {
        this.f84819c = str;
    }
}
