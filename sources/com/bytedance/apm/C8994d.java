package com.bytedance.apm;

import java.util.HashSet;

/* renamed from: com.bytedance.apm.d */
public final class C8994d {

    /* renamed from: a */
    public C8996a f24477a;

    /* renamed from: b */
    public HashSet<String> f24478b;

    /* renamed from: com.bytedance.apm.d$a */
    public interface C8996a {
        /* renamed from: a */
        void mo16327a(String str);

        /* renamed from: a */
        void mo16328a(Throwable th, String str);
    }

    /* renamed from: com.bytedance.apm.d$b */
    static class C8997b {

        /* renamed from: a */
        public static final C8994d f24479a = new C8994d();
    }

    /* renamed from: a */
    public static C8994d m17799a() {
        return C8997b.f24479a;
    }

    private C8994d() {
        this.f24478b = new HashSet<>();
    }

    /* renamed from: a */
    public final void mo16326a(String str) {
        if (this.f24477a != null && !this.f24478b.contains(str)) {
            this.f24478b.add(str);
            C8996a aVar = this.f24477a;
            StringBuilder sb = new StringBuilder("apm_");
            sb.append(str);
            aVar.mo16327a(sb.toString());
        }
        if (C8976c.m17751g()) {
            throw new RuntimeException(str);
        }
    }
}
