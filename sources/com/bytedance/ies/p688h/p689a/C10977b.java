package com.bytedance.ies.p688h.p689a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.h.a.b */
public final class C10977b {

    /* renamed from: a */
    private static List<C10978a> f29484a = new ArrayList();

    /* renamed from: com.bytedance.ies.h.a.b$a */
    public static class C10978a {

        /* renamed from: a */
        public boolean f29485a;

        /* renamed from: b */
        public String f29486b;

        /* renamed from: c */
        public String f29487c;

        public C10978a(boolean z, String str, String str2) {
            this.f29485a = z;
            this.f29486b = str;
            this.f29487c = str2;
        }
    }

    /* renamed from: a */
    public static void m22242a(String str, String str2) {
        if (C10976a.m22241a()) {
            synchronized (f29484a) {
                f29484a.add(new C10978a(false, str, str2));
            }
        }
    }

    /* renamed from: b */
    public static void m22243b(String str, String str2) {
        if (C10976a.m22241a()) {
            synchronized (f29484a) {
                f29484a.add(new C10978a(true, str, str2));
            }
        }
    }
}
