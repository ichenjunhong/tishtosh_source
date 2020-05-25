package com.p683ss.android.ugc.aweme.p1485by;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.main.C36634ec;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.by.c */
public final class C24463c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f64841a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24463c.class), "sp", "getSp()Lcom/ss/android/ugc/aweme/main/SafeMainTabPreferences;"))};

    /* renamed from: b */
    public static final C24463c f64842b = new C24463c();

    /* renamed from: c */
    private static final C52668f f64843c = C52732g.m112285a(C24464a.f64844a);

    /* renamed from: com.ss.android.ugc.aweme.by.c$a */
    static final class C24464a extends C52712l implements C52670a<C36634ec> {

        /* renamed from: a */
        public static final C24464a f64844a = new C24464a();

        C24464a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C36634ec();
        }
    }

    private C24463c() {
    }

    /* renamed from: a */
    public final C36634ec mo50237a() {
        return (C36634ec) f64843c.getValue();
    }

    /* renamed from: b */
    public final String mo50238b() {
        return mo50237a().mo75727c();
    }

    /* renamed from: a */
    public static boolean m59860a(List<String> list, String str, boolean z) {
        C52711k.m112240b(list, "list");
        C52711k.m112240b(str, "code");
        boolean z2 = false;
        if (C9376b.m18558a((Collection<T>) list)) {
            return false;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            String str2 = (String) list.get(size);
            if (TextUtils.equals(str2, "zh-hant")) {
                list.set(size, "zh-Hant");
            }
            if (C52830p.m112406a(str2, str, true)) {
                if (z) {
                    list.remove(str2);
                }
                z2 = true;
            }
        }
        return z2;
    }
}
