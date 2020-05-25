package com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c;

import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1058a.C17438t;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45245ad;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47894fo;
import java.util.concurrent.TimeUnit;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.c */
public final class C45292c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114528a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45292c.class), "syntheticTimeCounter", "getSyntheticTimeCounter()Lcom/google/common/base/Stopwatch;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45292c.class), "uploadWaitSyntheticTimeCounter", "getUploadWaitSyntheticTimeCounter()Lcom/ss/android/ugc/aweme/shortvideo/upload/UploadWaitTimeCounter;"))};

    /* renamed from: i */
    public static final C45293a f114529i = new C45293a(null);

    /* renamed from: b */
    public final C17429o f114530b = C17429o.m42674a((C17438t) C47894fo.f120488a);

    /* renamed from: c */
    public long f114531c = -1;

    /* renamed from: d */
    public long f114532d = -1;

    /* renamed from: e */
    public int f114533e;

    /* renamed from: f */
    public long f114534f = -1;

    /* renamed from: g */
    public long f114535g = -1;

    /* renamed from: h */
    public boolean f114536h;

    /* renamed from: j */
    private final C52668f f114537j = C52732g.m112285a(C45294b.f114539a);

    /* renamed from: k */
    private final C52668f f114538k = C52732g.m112285a(C45295c.f114540a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.c$a */
    public static final class C45293a {
        private C45293a() {
        }

        public /* synthetic */ C45293a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.c$b */
    static final class C45294b extends C52712l implements C52670a<C17429o> {

        /* renamed from: a */
        public static final C45294b f114539a = new C45294b();

        C45294b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C17429o.m42674a((C17438t) C47894fo.f120488a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.c$c */
    static final class C45295c extends C52712l implements C52670a<C45245ad> {

        /* renamed from: a */
        public static final C45295c f114540a = new C45295c();

        C45295c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C45245ad();
        }
    }

    /* renamed from: h */
    private final C45245ad m98762h() {
        return (C45245ad) this.f114538k.getValue();
    }

    /* renamed from: a */
    public final C17429o mo91552a() {
        return (C17429o) this.f114537j.getValue();
    }

    /* renamed from: f */
    public final void mo91558f() {
        m98762h().mo91532a();
    }

    /* renamed from: g */
    public final void mo91559g() {
        m98762h().mo91533b();
    }

    /* renamed from: b */
    public final boolean mo91554b() {
        if (this.f114532d != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final long mo91555c() {
        return mo91552a().mo33754a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public final long mo91556d() {
        return m98762h().mo91534c();
    }

    /* renamed from: e */
    public final long mo91557e() {
        return this.f114530b.mo33754a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static void m98761a(String str) {
        StringBuilder sb = new StringBuilder("PublishPerformanceRecorder : ");
        sb.append(str);
        C45407ay.m98971b(sb.toString());
    }

    /* renamed from: a */
    public final void mo91553a(int i) {
        if (!mo91552a().f48964a) {
            m98761a("repeat endSynthetic");
            return;
        }
        mo91552a().mo33756d();
        this.f114532d = System.currentTimeMillis();
        this.f114533e = i;
    }
}
