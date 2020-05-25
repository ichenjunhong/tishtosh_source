package com.p683ss.android.ugc.aweme.utils;

import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.bp */
public final class C47729bp {

    /* renamed from: a */
    public static HashMap<String, C47728bo> f120237a = new HashMap<>();

    /* renamed from: b */
    public static final C47730a f120238b = new C47730a(null);

    /* renamed from: com.ss.android.ugc.aweme.utils.bp$a */
    public static final class C47730a {
        private C47730a() {
        }

        public /* synthetic */ C47730a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C47728bo m103327a(String str) {
            C52711k.m112240b(str, "type");
            C47728bo boVar = (C47728bo) C47729bp.f120237a.get(str);
            if (boVar != null) {
                return boVar;
            }
            C47728bo efVar = new C47844ef(str, false);
            C47729bp.f120237a.put(str, efVar);
            return efVar;
        }
    }

    /* renamed from: a */
    public static final C47728bo m103326a(String str) {
        return C47730a.m103327a(str);
    }
}
