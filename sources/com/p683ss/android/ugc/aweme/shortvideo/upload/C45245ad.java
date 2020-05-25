package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1058a.C17438t;
import com.p683ss.android.ugc.aweme.utils.C47894fo;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.concurrent.TimeUnit;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ad */
public final class C45245ad {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114437a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45245ad.class), "counter", "getCounter()Lcom/google/common/base/Stopwatch;"))};

    /* renamed from: b */
    private final C52668f f114438b = C52732g.m112285a(C45246a.f114439a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ad$a */
    static final class C45246a extends C52712l implements C52670a<C17429o> {

        /* renamed from: a */
        public static final C45246a f114439a = new C45246a();

        C45246a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C17429o.m42674a((C17438t) C47894fo.f120488a);
        }
    }

    /* renamed from: d */
    private final C17429o m98719d() {
        return (C17429o) this.f114438b.getValue();
    }

    /* renamed from: c */
    public final long mo91534c() {
        return m98719d().mo33754a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final void mo91533b() {
        if (!m98719d().f48964a) {
            m98718a("repeat stop");
        } else {
            m98719d().mo33756d();
        }
    }

    /* renamed from: a */
    public final void mo91532a() {
        if (m98719d().f48964a) {
            m98718a("repeat start");
        } else {
            m98719d().mo33755c();
        }
    }

    /* renamed from: a */
    private static void m98718a(String str) {
        StringBuilder sb = new StringBuilder("UploadWaitTimeCounter 上传 sdk 调用异常: ");
        sb.append(str);
        C50203g.m108361b(sb.toString());
    }
}
