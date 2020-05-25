package com.bytedance.frameworks.baselib.p565a;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.bytedance.frameworks.baselib.a.b */
public abstract class C9796b {

    /* renamed from: b */
    public String f26654b;

    /* renamed from: c */
    public C9798b f26655c;

    /* renamed from: d */
    protected C9804e f26656d;

    /* renamed from: e */
    public String f26657e;

    /* renamed from: f */
    public C9799c f26658f;

    /* renamed from: g */
    public long f26659g;

    /* renamed from: h */
    public long f26660h;

    /* renamed from: com.bytedance.frameworks.baselib.a.b$a */
    public static abstract class C9797a implements C9798b {
        /* renamed from: c */
        public int mo16501c() {
            return 4;
        }

        /* renamed from: d */
        public long mo16502d() {
            return 15000;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.a.b$b */
    public interface C9798b {
        /* renamed from: a */
        String mo16499a();

        /* renamed from: b */
        List<String> mo16500b();

        /* renamed from: c */
        int mo16501c();

        /* renamed from: d */
        long mo16502d();
    }

    /* renamed from: com.bytedance.frameworks.baselib.a.b$c */
    public interface C9799c {
        /* renamed from: a */
        boolean mo16503a();

        /* renamed from: b */
        long mo16504b();

        /* renamed from: c */
        boolean mo16505c();

        /* renamed from: d */
        long mo16506d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo16507a(String str, byte[] bArr);

    /* renamed from: a */
    public final boolean mo17646a(byte[] bArr) {
        return this.f26656d.mo17649a(this.f26654b, bArr);
    }

    public C9796b(Context context, C9798b bVar, C9799c cVar) {
        this.f26655c = bVar;
        this.f26658f = cVar;
        if (this.f26655c == null) {
            throw new IllegalArgumentException("config is null.");
        } else if (this.f26658f != null) {
            this.f26654b = bVar.mo16499a();
            if (!TextUtils.isEmpty(this.f26654b)) {
                this.f26656d = C9804e.m19628a(context);
                C9804e eVar = this.f26656d;
                String str = this.f26654b;
                if (!eVar.mo17648a()) {
                    eVar.f26670a.put(str, this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("type is empty.");
        } else {
            throw new IllegalArgumentException("responseConfig is null");
        }
    }
}
