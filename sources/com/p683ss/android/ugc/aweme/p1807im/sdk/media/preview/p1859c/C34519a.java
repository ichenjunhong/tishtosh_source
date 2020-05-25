package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1859c;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35324c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35324c.C35342r;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.c.a */
public final class C34519a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88995a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34519a.class), "playManager", "getPlayManager()Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager;"))};

    /* renamed from: b */
    public C34409a f88996b;

    /* renamed from: c */
    private final C52668f f88997c = C52732g.m112285a(C34520a.f88998a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.c.a$a */
    static final class C34520a extends C52712l implements C52670a<C35324c> {

        /* renamed from: a */
        public static final C34520a f88998a = new C34520a();

        C34520a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C35324c(C11010c.m22280a(), false, 2, null);
        }
    }

    /* renamed from: a */
    public final C35324c mo72532a() {
        return (C35324c) this.f88997c.getValue();
    }

    /* renamed from: b */
    public final void mo72534b(C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        if (this.f88996b == aVar) {
            mo72532a().mo73497b();
        }
    }

    /* renamed from: a */
    public final void mo72533a(C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        if (this.f88996b != aVar) {
            C35324c a = mo72532a();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.getFilePath());
            a.mo73501d(sb.toString());
            this.f88996b = aVar;
        }
        mo72532a().mo73493a();
    }

    /* renamed from: c */
    public final void mo72535c(C34409a aVar) {
        C52711k.m112240b(aVar, "mediaModel");
        if (this.f88996b == aVar) {
            this.f88996b = null;
            C35324c a = mo72532a();
            if (a.f90698d) {
                a.f90695a.mo73481c();
                return;
            }
            a.mo73496a((C52670a<C52860x>) new C35342r<C52860x>(a));
        }
    }
}
