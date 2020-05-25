package com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35322b.C35323a;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c */
public final class C35324c implements C35323a {

    /* renamed from: e */
    public static int f90693e;

    /* renamed from: f */
    public static final C35325a f90694f = new C35325a(null);

    /* renamed from: a */
    public C35322b f90695a;

    /* renamed from: b */
    public C35326b f90696b;

    /* renamed from: c */
    public final Context f90697c;

    /* renamed from: d */
    public final boolean f90698d;

    /* renamed from: g */
    private HandlerThread f90699g;

    /* renamed from: h */
    private boolean f90700h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$a */
    public static final class C35325a {
        private C35325a() {
        }

        public /* synthetic */ C35325a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$b */
    public interface C35326b {
        /* renamed from: a */
        void mo72541a(String str);

        /* renamed from: a */
        void mo72542a(boolean z);

        /* renamed from: k */
        void mo72546k();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$c */
    static final class C35327c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90701a;

        C35327c(C35324c cVar) {
            this.f90701a = cVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$d */
    static final class C35328d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90702a;

        /* renamed from: b */
        final /* synthetic */ String f90703b;

        C35328d(C35324c cVar, String str) {
            this.f90702a = cVar;
            this.f90703b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C35326b bVar = this.f90702a.f90696b;
            if (bVar != null) {
                bVar.mo72541a(this.f90703b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$e */
    static final class C35329e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90704a;

        /* renamed from: b */
        final /* synthetic */ int f90705b;

        C35329e(C35324c cVar, int i) {
            this.f90704a = cVar;
            this.f90705b = i;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$f */
    static final class C35330f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90706a;

        C35330f(C35324c cVar) {
            this.f90706a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C35326b bVar = this.f90706a.f90696b;
            if (bVar != null) {
                bVar.mo72542a(true);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$g */
    static final class C35331g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90707a;

        C35331g(C35324c cVar) {
            this.f90707a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C35326b bVar = this.f90707a.f90696b;
            if (bVar != null) {
                bVar.mo72542a(false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$h */
    static final class C35332h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90708a;

        C35332h(C35324c cVar) {
            this.f90708a = cVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$i */
    static final class C35333i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90709a;

        C35333i(C35324c cVar) {
            this.f90709a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C35326b bVar = this.f90709a.f90696b;
            if (bVar != null) {
                bVar.mo72546k();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$j */
    static final class C35334j extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90710a;

        C35334j(C35324c cVar) {
            this.f90710a = cVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$k */
    static final class C35335k extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90711a;

        C35335k(C35324c cVar) {
            this.f90711a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90711a.f90695a.mo73479b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$l */
    static final class C35336l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90712a;

        C35336l(C35324c cVar) {
            this.f90712a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90712a.f90695a.mo73475a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$m */
    static final class C35337m extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90713a;

        C35337m(C35324c cVar) {
            this.f90713a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90713a.f90695a.mo73483d();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$n */
    static final class C35338n extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90714a;

        /* renamed from: b */
        final /* synthetic */ String f90715b;

        C35338n(C35324c cVar, String str) {
            this.f90714a = cVar;
            this.f90715b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90714a.f90695a.mo73478a(this.f90715b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$o */
    static final class C35339o extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90716a;

        /* renamed from: b */
        final /* synthetic */ String f90717b;

        C35339o(C35324c cVar, String str) {
            this.f90716a = cVar;
            this.f90717b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90716a.f90695a.mo73480b(this.f90717b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$p */
    static final class C35340p extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90718a;

        /* renamed from: b */
        final /* synthetic */ String f90719b;

        C35340p(C35324c cVar, String str) {
            this.f90718a = cVar;
            this.f90719b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90718a.f90695a.mo73482c(this.f90719b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$q */
    static final class C35341q extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90720a;

        /* renamed from: b */
        final /* synthetic */ Surface f90721b;

        C35341q(C35324c cVar, Surface surface) {
            this.f90720a = cVar;
            this.f90721b = surface;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90720a.f90695a.mo73476a(this.f90721b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$r */
    public static final class C35342r extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35324c f90722a;

        public C35342r(C35324c cVar) {
            this.f90722a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f90722a.f90695a.mo73481c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$s */
    static final class C35343s<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C52670a f90723a;

        C35343s(C52670a aVar) {
            this.f90723a = aVar;
        }

        public final /* synthetic */ Object call() {
            this.f90723a.invoke();
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: d */
    public final boolean mo73502d() {
        return this.f90695a.mo73484e();
    }

    /* renamed from: a */
    public final void mo73493a() {
        this.f90700h = false;
        if (this.f90698d) {
            this.f90695a.mo73475a();
        } else {
            mo73496a((C52670a<C52860x>) new C35336l<C52860x>(this));
        }
    }

    /* renamed from: c */
    public final void mo73499c() {
        if (this.f90698d) {
            this.f90695a.mo73483d();
        } else {
            mo73496a((C52670a<C52860x>) new C35337m<C52860x>(this));
        }
    }

    /* renamed from: b */
    public final void mo73497b() {
        if (mo73502d()) {
            this.f90700h = false;
            if (this.f90698d) {
                this.f90695a.mo73479b();
            } else {
                mo73496a((C52670a<C52860x>) new C35335k<C52860x>(this));
            }
        } else {
            this.f90700h = true;
        }
    }

    /* renamed from: a */
    public final void mo73495a(C35326b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f90696b = bVar;
    }

    /* renamed from: b */
    private static void m79937b(C52670a<C52860x> aVar) {
        C0013i.m18a((Callable<TResult>) new C35343s<TResult>(aVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo73486a(C35322b bVar) {
        m79937b((C52670a<C52860x>) new C35332h<C52860x>(this));
    }

    /* renamed from: c */
    public final void mo73491c(C35322b bVar) {
        m79937b((C52670a<C52860x>) new C35334j<C52860x>(this));
    }

    /* renamed from: d */
    public final void mo73492d(C35322b bVar) {
        m79937b((C52670a<C52860x>) new C35327c<C52860x>(this));
    }

    /* renamed from: b */
    public final void mo73489b(C35322b bVar) {
        m79937b((C52670a<C52860x>) new C35333i<C52860x>(this));
    }

    /* renamed from: d */
    public final void mo73501d(String str) {
        if (this.f90698d) {
            this.f90695a.mo73482c(str);
        } else {
            mo73496a((C52670a<C52860x>) new C35340p<C52860x>(this, str));
        }
    }

    /* renamed from: a */
    public final void mo73494a(Surface surface) {
        if (this.f90698d) {
            this.f90695a.mo73476a(surface);
        } else {
            mo73496a((C52670a<C52860x>) new C35341q<C52860x>(this, surface));
        }
    }

    /* renamed from: c */
    public final void mo73500c(String str) {
        if (this.f90698d) {
            this.f90695a.mo73480b(str);
        } else {
            mo73496a((C52670a<C52860x>) new C35339o<C52860x>(this, str));
        }
    }

    /* renamed from: a */
    public final void mo73496a(C52670a<C52860x> aVar) {
        Looper looper;
        HandlerThread handlerThread = this.f90699g;
        if (handlerThread != null) {
            looper = handlerThread.getLooper();
        } else {
            looper = null;
        }
        if (looper != null) {
            C0013i.m22b((Callable<TResult>) new C35344d<TResult>(aVar));
        } else {
            m79937b(aVar);
        }
    }

    /* renamed from: b */
    public final void mo73498b(String str) {
        if (this.f90698d) {
            this.f90695a.mo73478a(str);
        } else {
            mo73496a((C52670a<C52860x>) new C35338n<C52860x>(this, str));
        }
    }

    /* renamed from: a */
    public final void mo73488a(String str) {
        m79937b((C52670a<C52860x>) new C35328d<C52860x>(this, str));
    }

    private C35324c(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        this.f90697c = context;
        this.f90698d = z;
        StringBuilder sb = new StringBuilder("video_player_thread");
        int i = f90693e;
        f90693e = i + 1;
        sb.append(i);
        this.f90699g = new HandlerThread(sb.toString(), 0);
        HandlerThread handlerThread = this.f90699g;
        if (handlerThread != null) {
            handlerThread.start();
        }
        this.f90695a = new C35322b(this.f90697c);
        this.f90695a.mo73477a((C35323a) this);
    }

    /* renamed from: a */
    public final void mo73487a(C35322b bVar, int i) {
        if (i != 1) {
            m79937b((C52670a<C52860x>) new C35331g<C52860x>(this));
        } else if (this.f90700h) {
            mo73497b();
        } else {
            m79937b((C52670a<C52860x>) new C35330f<C52860x>(this));
        }
    }

    /* renamed from: b */
    public final void mo73490b(C35322b bVar, int i) {
        m79937b((C52670a<C52860x>) new C35329e<C52860x>(this, i));
    }

    public /* synthetic */ C35324c(Context context, boolean z, int i, C52707g gVar) {
        this(context, false);
    }
}
