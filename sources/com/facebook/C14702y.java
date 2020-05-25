package com.facebook;

import android.content.Intent;
import android.support.p030v4.content.C0732g;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;

/* renamed from: com.facebook.y */
public final class C14702y {

    /* renamed from: c */
    private static volatile C14702y f38095c;

    /* renamed from: a */
    final C14701x f38096a;

    /* renamed from: b */
    public Profile f38097b;

    /* renamed from: d */
    private final C0732g f38098d;

    /* renamed from: a */
    static C14702y m30074a() {
        if (f38095c == null) {
            synchronized (C14702y.class) {
                if (f38095c == null) {
                    f38095c = new C14702y(C0732g.m2130a(C14533n.m29773g()), new C14701x());
                }
            }
        }
        return f38095c;
    }

    private C14702y(C0732g gVar, C14701x xVar) {
        C14283ab.m29306a((Object) gVar, "localBroadcastManager");
        C14283ab.m29306a((Object) xVar, "profileCache");
        this.f38098d = gVar;
        this.f38096a = xVar;
    }

    /* renamed from: a */
    private void m30075a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f38098d.mo2404a(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26970a(Profile profile, boolean z) {
        Profile profile2 = this.f38097b;
        this.f38097b = profile;
        if (z) {
            if (profile != null) {
                this.f38096a.mo26968a(profile);
            } else {
                this.f38096a.mo26969b();
            }
        }
        if (!C14277aa.m29275a(profile2, profile)) {
            m30075a(profile2, profile);
        }
    }
}
