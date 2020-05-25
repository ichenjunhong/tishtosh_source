package com.bytedance.frameworks.core.apm;

import android.text.TextUtils;
import com.bytedance.apm.p485h.C9039a;
import com.bytedance.apm.p485h.C9042d;
import com.bytedance.frameworks.core.apm.p578a.p579a.C9932a;
import com.bytedance.frameworks.core.apm.p578a.p579a.C9933b;
import com.bytedance.frameworks.core.apm.p578a.p579a.C9934c;
import com.bytedance.frameworks.core.apm.p578a.p580b.C9936b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.core.apm.b */
public final class C9937b {

    /* renamed from: a */
    public List<C9932a<? extends C9042d>> f27019a;

    /* renamed from: b */
    public C9934c f27020b;

    /* renamed from: c */
    public C9933b f27021c;

    /* renamed from: d */
    public C9936b f27022d;

    /* renamed from: e */
    private Map<Class<?>, C9932a<? extends C9042d>> f27023e;

    /* renamed from: com.bytedance.frameworks.core.apm.b$a */
    static class C9939a {

        /* renamed from: a */
        public static final C9937b f27024a = new C9937b();
    }

    /* renamed from: a */
    public static C9937b m19972a() {
        return C9939a.f27024a;
    }

    private C9937b() {
        this.f27019a = new LinkedList();
        this.f27023e = new HashMap();
        this.f27022d = new C9936b();
        this.f27020b = new C9934c();
        this.f27019a.add(this.f27020b);
        this.f27023e.put(C9042d.class, this.f27020b);
        this.f27021c = new C9933b();
        this.f27019a.add(this.f27021c);
        this.f27023e.put(C9039a.class, this.f27021c);
    }

    /* renamed from: a */
    public final void mo17905a(C9042d dVar) {
        this.f27020b.mo17891a(dVar);
    }

    /* renamed from: a */
    public final C9932a<? extends C9042d> mo17904a(Class<?> cls) {
        return (C9932a) this.f27023e.get(cls);
    }

    /* renamed from: a */
    public final int mo17903a(String str, List<Long> list) {
        if (TextUtils.equals(str, "api_all")) {
            return this.f27021c.mo17896c(list);
        }
        return this.f27020b.mo17896c(list);
    }
}
