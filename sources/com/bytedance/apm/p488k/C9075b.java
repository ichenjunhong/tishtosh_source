package com.bytedance.apm.p488k;

import com.C2240a;

/* renamed from: com.bytedance.apm.k.b */
public final class C9075b {

    /* renamed from: a */
    public static C9077a f24804a;

    /* renamed from: b */
    private static C9077a f24805b;

    /* renamed from: com.bytedance.apm.k.b$a */
    public interface C9077a {
        /* renamed from: a */
        void mo16443a(String str, String str2, Object... objArr);

        /* renamed from: b */
        void mo16444b(String str, String str2, Object... objArr);

        /* renamed from: c */
        void mo16445c(String str, String str2, Object... objArr);
    }

    static {
        C90761 r0 = new C9077a() {
            /* renamed from: a */
            public final void mo16443a(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    C2240a.m6772a(str2, objArr);
                }
            }

            /* renamed from: b */
            public final void mo16444b(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    C2240a.m6772a(str2, objArr);
                }
            }

            /* renamed from: c */
            public final void mo16445c(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    C2240a.m6772a(str2, objArr);
                }
            }
        };
        f24805b = r0;
        f24804a = r0;
    }

    /* renamed from: a */
    public static void m17973a(String str, String str2, Object... objArr) {
        if (f24804a != null) {
            f24804a.mo16445c(str, str2, objArr);
        }
    }

    /* renamed from: b */
    public static void m17974b(String str, String str2, Object... objArr) {
        if (f24804a != null) {
            f24804a.mo16444b(str, str2, objArr);
        }
    }
}
