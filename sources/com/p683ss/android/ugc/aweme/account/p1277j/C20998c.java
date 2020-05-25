package com.p683ss.android.ugc.aweme.account.p1277j;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.j.c */
public abstract class C20998c {

    /* renamed from: b */
    public static final C20999a f57108b = new C20999a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.j.c$a */
    public static final class C20999a {
        private C20999a() {
        }

        public /* synthetic */ C20999a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo44981a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo44982c(String str) {
        C52711k.m112240b(str, "msg");
        StringBuilder sb = new StringBuilder("AccountAlogHelper-");
        sb.append(mo44981a());
        C32458a.m75141a(4, sb.toString(), str);
    }
}
