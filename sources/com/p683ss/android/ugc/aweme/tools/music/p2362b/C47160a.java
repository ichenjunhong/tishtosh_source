package com.p683ss.android.ugc.aweme.tools.music.p2362b;

import android.content.Intent;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.b.a */
public final class C47160a {

    /* renamed from: b */
    public static final C47162b f119065b = new C47162b(null);

    /* renamed from: c */
    private static final String f119066c = f119066c;

    /* renamed from: a */
    public C47163b f119067a;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$a */
    public interface C47161a {
        /* renamed from: a */
        void mo94375a(int i, Intent intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.b.a$b */
    public static final class C47162b {
        private C47162b() {
        }

        public /* synthetic */ C47162b(C52707g gVar) {
            this();
        }
    }

    public C47160a(FragmentActivity fragmentActivity) {
        C47163b bVar;
        if (fragmentActivity != null) {
            Fragment a = fragmentActivity.getSupportFragmentManager().mo2224a(f119066c);
            if (a == null) {
                bVar = null;
            } else {
                C52711k.m112236a((Object) a, "activity.supportFragment…ByTag(TAG) ?: return null");
                if (a != null) {
                    bVar = (C47163b) a;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment");
                }
            }
            if (bVar == null) {
                bVar = new C47163b();
                C0654k supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.mo2225a().mo2178a((Fragment) bVar, f119066c).mo2195c();
                if (supportFragmentManager != null) {
                    supportFragmentManager.mo2234b();
                }
            }
            this.f119067a = bVar;
        }
    }
}
