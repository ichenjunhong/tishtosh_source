package com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10327c;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10564a;
import com.p683ss.android.ugc.aweme.app.download.p1374a.C23077b;
import com.p683ss.android.ugc.aweme.app.download.p1374a.C23078c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.jsdownload.a */
public final class C24225a {

    /* renamed from: a */
    public static final C24225a f64285a = new C24225a();

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.jsdownload.a$a */
    public static final class C24226a implements C10327c<C23077b> {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f64286a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24226a.class), "downloadManager", "getDownloadManager()Lcom/ss/android/ugc/aweme/app/download/jsdownload/JsAppDownloadManager;"))};

        /* renamed from: b */
        final /* synthetic */ C10326b f64287b;

        /* renamed from: c */
        private final C52668f f64288c = C52732g.m112286a(C52757k.NONE, new C24227a(this));

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.jsdownload.a$a$a */
        static final class C24227a extends C52712l implements C52670a<C23077b> {

            /* renamed from: a */
            final /* synthetic */ C24226a f64289a;

            C24227a(C24226a aVar) {
                this.f64289a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return C23077b.m56614a((Context) this.f64289a.f64287b.mo18401c(Context.class), (C23078c) new C23078c(this) {

                    /* renamed from: a */
                    final /* synthetic */ C24227a f64290a;

                    {
                        this.f64290a = r1;
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo18295a() {
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo18392b() {
            return (C23077b) this.f64288c.getValue();
        }

        public C24226a(C10326b bVar) {
            this.f64287b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.jsdownload.a$b */
    public static final class C24229b implements C10564a {

        /* renamed from: a */
        final /* synthetic */ C10326b f64291a;

        /* renamed from: a */
        public final void mo18710a(Activity activity, int i, int i2, Intent intent) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: a */
        public final void mo18711a(Activity activity, int i, String[] strArr, int[] iArr) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(strArr, "permissions");
            C52711k.m112240b(iArr, "grantResults");
        }

        /* renamed from: a */
        public final void mo18712a(Activity activity, Configuration configuration) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: a */
        public final void mo18713a(Activity activity, Bundle bundle) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: a */
        public final void mo18714a(Activity activity, boolean z) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: b */
        public final void mo18717b(Activity activity, Bundle bundle) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: c */
        public final void mo18719c(Activity activity, Bundle bundle) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: c */
        public final boolean mo18673c(Activity activity) {
            C52711k.m112240b(activity, "activity");
            return false;
        }

        /* renamed from: d */
        public final void mo18720d(Activity activity) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: e */
        public final void mo18721e(Activity activity) {
            C52711k.m112240b(activity, "activity");
        }

        /* renamed from: a */
        private final C23077b m59292a() {
            return (C23077b) this.f64291a.mo18401c(C23077b.class);
        }

        public C24229b(C10326b bVar) {
            this.f64291a = bVar;
        }

        /* renamed from: b */
        public final void mo18672b(Activity activity) {
            C52711k.m112240b(activity, "activity");
            m59292a();
        }

        /* renamed from: a */
        public final void mo18671a(Activity activity) {
            C52711k.m112240b(activity, "activity");
            m59292a();
        }

        /* renamed from: f */
        public final void mo18722f(Activity activity) {
            C52711k.m112240b(activity, "activity");
            m59292a();
            C10577d dVar = (C10577d) this.f64291a.mo18401c(C10577d.class);
            if (dVar != null) {
                dVar.mo18718b(this);
            }
        }
    }

    private C24225a() {
    }
}
