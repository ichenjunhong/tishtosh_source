package leakcanary.internal;

import android.util.Log;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2673h.C53173a.C53174a;

/* renamed from: leakcanary.internal.d */
public final class C53401d implements C53174a {

    /* renamed from: a */
    public static final C52820l f132072a = new C52820l("\n");

    /* renamed from: b */
    public static final C53402a f132073b = new C53402a(null);

    /* renamed from: leakcanary.internal.d$a */
    public static final class C53402a {
        private C53402a() {
        }

        public /* synthetic */ C53402a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo110681a(String str) {
        C52711k.m112240b(str, "message");
        if (str.length() >= 4000) {
            Iterator it = f132072a.split(str, 0).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final void mo110682a(Throwable th, String str) {
        C52711k.m112240b(th, "throwable");
        C52711k.m112240b(str, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(10);
        sb.append(Log.getStackTraceString(th));
        mo110681a(sb.toString());
    }
}
