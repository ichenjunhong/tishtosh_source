package com.p683ss.android.ugc.aweme.following.p1770ui;

import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32352x.C32357b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.following.ui.n */
public final class C32199n implements Serializable {

    /* renamed from: a */
    private String f83946a;

    /* renamed from: b */
    private String f83947b;

    /* renamed from: c */
    private boolean f83948c;

    /* renamed from: d */
    private C32357b f83949d;

    public final C32357b getPageType() {
        return this.f83949d;
    }

    public final String getSecUid() {
        return this.f83947b;
    }

    public final String getUid() {
        return this.f83946a;
    }

    public final boolean isMine() {
        return this.f83948c;
    }

    public final User getUser() {
        return C31187c.m72824c();
    }

    public final void setMine(boolean z) {
        this.f83948c = z;
    }

    public final void setPageType(C32357b bVar) {
        this.f83949d = bVar;
    }

    public final void setSecUid(String str) {
        this.f83947b = str;
    }

    public final void setUid(String str) {
        this.f83946a = str;
    }

    public C32199n(String str, boolean z, C32357b bVar) {
        this.f83946a = str;
        this.f83948c = z;
        this.f83949d = bVar;
    }
}
