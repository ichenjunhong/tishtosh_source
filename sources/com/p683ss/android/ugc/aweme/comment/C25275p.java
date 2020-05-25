package com.p683ss.android.ugc.aweme.comment;

import android.arch.lifecycle.C0198r;

/* renamed from: com.ss.android.ugc.aweme.comment.p */
public final class C25275p {

    /* renamed from: a */
    public final C0198r<Boolean> f66866a = new C0198r<>();

    /* renamed from: b */
    public int f66867b;

    public C25275p() {
        this.f66866a.setValue(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo51737a() {
        this.f66867b++;
        if (this.f66867b == 1) {
            this.f66866a.setValue(Boolean.valueOf(true));
        }
    }
}
