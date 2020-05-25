package com.bytedance.apm.p493m.p495b;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.C9029e;
import com.bytedance.apm.p493m.C9139c;
import com.bytedance.apm.p493m.p494a.C9130c;
import com.bytedance.frameworks.baselib.p565a.C9796b;
import com.bytedance.frameworks.baselib.p565a.C9796b.C9797a;
import com.bytedance.frameworks.baselib.p565a.C9796b.C9799c;
import java.util.List;

/* renamed from: com.bytedance.apm.m.b.a */
public final class C9132a {

    /* renamed from: a */
    public C9796b f24998a;

    /* renamed from: b */
    public volatile long f24999b;

    /* renamed from: c */
    boolean f25000c;

    /* renamed from: d */
    int f25001d;

    /* renamed from: e */
    public boolean f25002e;

    public C9132a(final String str) {
        this.f24998a = new C9796b(C8976c.m17736a(), new C9797a() {
            /* renamed from: a */
            public final String mo16499a() {
                return str;
            }

            /* renamed from: b */
            public final List<String> mo16500b() {
                return C9130c.m18118a(str);
            }

            /* renamed from: c */
            public final int mo16501c() {
                return C9130c.f24997a.mo16494b();
            }

            /* renamed from: d */
            public final long mo16502d() {
                return (long) (C9130c.f24997a.mo16495c() * 1000);
            }
        }, new C9799c() {
            /* renamed from: a */
            public final boolean mo16503a() {
                return C9130c.f24997a.mo16497f();
            }

            /* renamed from: b */
            public final long mo16504b() {
                return C9132a.this.f24999b;
            }

            /* renamed from: c */
            public final boolean mo16505c() {
                return C9132a.this.f25000c;
            }

            /* renamed from: d */
            public final long mo16506d() {
                return C9130c.f24997a.mo16496d() * 1000;
            }
        }) {
            /* renamed from: a */
            public final boolean mo16507a(String str, byte[] bArr) {
                boolean z;
                if (C9137c.m18131a() != null) {
                    C9138d a = C9137c.m18131a().mo16508a(str, bArr);
                    if (a.f25009a > 0) {
                        C9132a.this.f25000c = false;
                        if (a.f25009a != 200 || a.f25010b == null) {
                            if (500 <= a.f25009a && a.f25009a <= 600) {
                                C9132a.this.mo16498a(false);
                                return false;
                            }
                        } else if ("success".equals(a.f25010b.opt("message"))) {
                            C9132a aVar = C9132a.this;
                            aVar.f25002e = false;
                            aVar.f25001d = 0;
                            aVar.f24999b = 0;
                            C9029e.m17898a().f24628a = false;
                            C9139c.m18134a().mo16511a(true, 0);
                            return true;
                        } else {
                            if (a.f25010b.optInt("is_crash", 0) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean equals = "drop data".equals(a.f25010b.opt("message"));
                            if (z || equals) {
                                C9132a.this.mo16498a(true);
                                return false;
                            }
                            C9132a.this.mo16498a(false);
                            return false;
                        }
                    } else {
                        C9132a.this.f25000c = true;
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public final void mo16498a(boolean z) {
        this.f25002e = true;
        if (z) {
            this.f24999b = 1800000;
            this.f25001d = 3;
        } else if (this.f25001d == 0) {
            this.f24999b = 300000;
            this.f25001d++;
        } else if (this.f25001d == 1) {
            this.f24999b = 900000;
            this.f25001d++;
        } else {
            int i = this.f25001d;
            this.f24999b = 1800000;
            this.f25001d++;
        }
        C9029e.m17898a().f24628a = true;
        C9139c.m18134a().mo16511a(false, this.f24999b);
    }
}
