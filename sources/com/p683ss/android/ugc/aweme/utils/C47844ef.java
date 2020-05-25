package com.p683ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.support.p030v4.view.ViewPager.C1000h;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import com.bytedance.apm.p498p.p499a.C9165b;
import com.p683ss.android.ugc.aweme.common.widget.BaseCustomViewPager;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a.C30515a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ef */
final class C47844ef implements C47728bo {

    /* renamed from: c */
    public static final C47845a f120407c = new C47845a(null);

    /* renamed from: a */
    public final String f120408a;

    /* renamed from: b */
    public final boolean f120409b = false;

    /* renamed from: d */
    private final C9165b f120410d = new C9165b(this.f120408a);

    /* renamed from: e */
    private long f120411e;

    /* renamed from: f */
    private long f120412f;

    /* renamed from: com.ss.android.ugc.aweme.utils.ef$a */
    public static final class C47845a {
        private C47845a() {
        }

        public /* synthetic */ C47845a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ef$b */
    public static final class C47846b extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C47844ef f120413a;

        C47846b(C47844ef efVar) {
            this.f120413a = efVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i != 0) {
                this.f120413a.mo95070b();
                return;
            }
            this.f120413a.mo95071c();
            this.f120413a.mo95069a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ef$c */
    public static final class C47847c extends C1000h {

        /* renamed from: a */
        final /* synthetic */ C47844ef f120414a;

        C47847c(C47844ef efVar) {
            this.f120414a = efVar;
        }

        public final void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f120414a.mo95070b();
                return;
            }
            this.f120414a.mo95071c();
            this.f120414a.mo95069a();
        }
    }

    /* renamed from: a */
    public final void mo95069a() {
        this.f120411e = 0;
        this.f120412f = 0;
    }

    /* renamed from: c */
    public final void mo95071c() {
        if (this.f120412f <= 0) {
            this.f120412f = SystemClock.uptimeMillis();
            if (this.f120411e > 0) {
                this.f120410d.mo16539b();
            }
        }
    }

    /* renamed from: b */
    public final void mo95070b() {
        if (!C30515a.m71483b().f79753a && this.f120411e <= 0) {
            this.f120411e = SystemClock.uptimeMillis();
            if (this.f120411e <= 0 || this.f120412f <= 0 || this.f120412f > this.f120411e) {
                this.f120410d.mo16538a();
            }
        }
    }

    /* renamed from: a */
    public final void mo95020a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.mo4801a((C1340m) new C47846b(this));
        }
    }

    /* renamed from: a */
    public final void mo95021a(BaseCustomViewPager baseCustomViewPager) {
        if (baseCustomViewPager != null) {
            baseCustomViewPager.mo54890a(new C47847c(this));
        }
    }

    public C47844ef(String str, boolean z) {
        C52711k.m112240b(str, "type");
        this.f120408a = str;
    }
}
