package com.p683ss.android.ugc.aweme.location;

import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.location.o */
public final class C36277o implements C36260e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f92852a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C36277o.class), "locationMonitorImpl", "getLocationMonitorImpl()Lcom/ss/android/ugc/aweme/location/LocationMonitorImpl;"))};

    /* renamed from: b */
    private final C52668f f92853b = C52732g.m112285a(C36278a.f92854a);

    /* renamed from: com.ss.android.ugc.aweme.location.o$a */
    static final class C36278a extends C52712l implements C52670a<C36279p> {

        /* renamed from: a */
        public static final C36278a f92854a = new C36278a();

        C36278a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C36279p();
        }
    }

    /* renamed from: a */
    private final C36279p m81911a() {
        return (C36279p) this.f92853b.getValue();
    }

    /* renamed from: a */
    public final void mo75079a(String str) {
        C36279p a = m81911a();
        if (a != null) {
            a.f92855a = System.currentTimeMillis();
            C23088c a2 = C23088c.m56631a();
            a2.mo47822a("status", Integer.valueOf(0));
            a2.mo47824a("sdk_name", str);
            C23131p.m56692a("location_log", "location_service", a2.mo47825b());
            C36279p.m81915a(0, str);
        }
    }

    /* renamed from: a */
    public final void mo75080a(String str, C36271k kVar) {
        String str2;
        if (m81911a() != null) {
            String str3 = null;
            if (kVar != null) {
                str2 = kVar.f92844a;
            } else {
                str2 = null;
            }
            if (kVar != null) {
                List<? extends Throwable> list = kVar.f92845b;
                if (list != null) {
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        str3 = ((Throwable) list.get(0)).getMessage();
                    }
                }
            }
            C23088c a = C23088c.m56631a();
            a.mo47822a("status", Integer.valueOf(-1));
            a.mo47824a("error_code", str2);
            a.mo47824a("sdk_name", str);
            a.mo47824a("error_message", str3);
            C23131p.m56692a("location_log", "location_service", a.mo47825b());
            C36279p.m81915a(-1, str);
        }
    }

    /* renamed from: a */
    public final void mo75081a(String str, boolean z) {
        boolean z2;
        C36279p a = m81911a();
        if (a != null) {
            if (a.f92855a > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                a = null;
            }
            C36279p pVar = a;
            if (pVar != null) {
                C23088c a2 = C23088c.m56631a();
                a2.mo47822a("status", Integer.valueOf(1));
                a2.mo47824a("sdk_name", str);
                a2.mo47823a("duration", Long.valueOf(System.currentTimeMillis() - pVar.f92855a));
                a2.mo47819a("is_cache", Boolean.valueOf(z));
                C23131p.m56692a("location_log", "location_service", a2.mo47825b());
                pVar.f92855a = 0;
            }
            C36279p.m81915a(1, str);
        }
    }
}
