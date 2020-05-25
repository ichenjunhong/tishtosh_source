package com.p683ss.android.ugc.aweme.sharer;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.g */
public final class C42320g extends RuntimeException {
    public static final C42321a Companion = new C42321a(null);

    /* renamed from: a */
    private final String f106877a;

    /* renamed from: com.ss.android.ugc.aweme.sharer.g$a */
    public static final class C42321a {
        private C42321a() {
        }

        public /* synthetic */ C42321a(C52707g gVar) {
            this();
        }
    }

    public final String getMessage() {
        return this.f106877a;
    }

    public C42320g(String str) {
        C52711k.m112240b(str, "message");
        super(str);
        this.f106877a = str;
    }
}
