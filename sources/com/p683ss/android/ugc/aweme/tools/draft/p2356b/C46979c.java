package com.p683ss.android.ugc.aweme.tools.draft.p2356b;

import com.C2240a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.c */
public final class C46979c {

    /* renamed from: a */
    public static final C46979c f118681a = new C46979c();

    private C46979c() {
    }

    /* renamed from: a */
    public static final String m102029a(C29059c cVar) {
        return C52711k.m112240b(cVar, "draft");
    }

    /* renamed from: a */
    public static final String m102028a(long j, boolean z) {
        if (z) {
            double d = (double) j;
            Double.isNaN(d);
            String a = C2240a.m6772a("%.1fMB", Arrays.copyOf(new Object[]{Double.valueOf(d / 1048576.0d)}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            return a;
        }
        double d2 = (double) j;
        Double.isNaN(d2);
        String a2 = C2240a.m6772a("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1048576.0d)}, 1));
        C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
        return a2;
    }
}
