package com.p683ss.android.ugc.aweme.setting.safeview;

import com.bytedance.crash.p546f.C9585b;
import com.bytedance.crash.p554m.C9672d;
import com.bytedance.crash.p555n.C9713t;
import com.bytedance.ies.uikit.layout.C11119a;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.safeview.a */
public final class C41681a {

    /* renamed from: a */
    public static final C41681a f105451a = new C41681a();

    /* renamed from: com.ss.android.ugc.aweme.setting.safeview.a$a */
    public static final class C41682a implements C11119a {

        /* renamed from: a */
        public static final C41682a f105452a = new C41682a();

        C41682a() {
        }

        /* renamed from: a */
        public final void mo20221a(Map<String, String> map) {
            String d = C30578o.m71570d();
            Thread currentThread = Thread.currentThread();
            C52711k.m112236a((Object) currentThread, "Thread.currentThread()");
            C9585b a = C9585b.m19044a(new StackTraceElement("SafeView", "report", "SafeView", 0), C9713t.m19435a((Throwable) new RuntimeException("SafeView")), "SafeView", currentThread.getName(), false, "EnsureNotNull");
            C52711k.m112236a((Object) a, "EventBody.wrapEnsure(\n  …ENSURE_NOT_NULL\n        )");
            a.mo17397b("activity", d);
            C9672d.m19295a(a);
        }
    }

    private C41681a() {
    }
}
