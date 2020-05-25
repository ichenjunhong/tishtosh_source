package com.bytedance.p582g.p583a.p591c;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.bytedance.g.a.c.a */
public abstract class C9985a {

    /* renamed from: c */
    public String f27108c;

    /* renamed from: d */
    public C9987b f27109d;

    /* renamed from: e */
    protected C9993d f27110e;

    /* renamed from: f */
    public String f27111f;

    /* renamed from: g */
    public C9988c f27112g;

    /* renamed from: h */
    public long f27113h;

    /* renamed from: i */
    public long f27114i;

    /* renamed from: com.bytedance.g.a.c.a$a */
    public static abstract class C9986a implements C9987b {
        /* renamed from: c */
        public int mo17930c() {
            return 4;
        }

        /* renamed from: d */
        public long mo17931d() {
            return 15000;
        }
    }

    /* renamed from: com.bytedance.g.a.c.a$b */
    public interface C9987b {
        /* renamed from: a */
        String mo17928a();

        /* renamed from: b */
        List<String> mo17929b();

        /* renamed from: c */
        int mo17930c();

        /* renamed from: d */
        long mo17931d();
    }

    /* renamed from: com.bytedance.g.a.c.a$c */
    public interface C9988c {
        /* renamed from: a */
        boolean mo17932a();

        /* renamed from: b */
        long mo17933b();

        /* renamed from: c */
        boolean mo17934c();

        /* renamed from: d */
        long mo17935d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo17936a(String str, byte[] bArr);

    /* renamed from: a */
    public final boolean mo17954a(byte[] bArr) {
        return this.f27110e.mo17958a(this.f27108c, bArr);
    }

    public C9985a(Context context, C9987b bVar, C9988c cVar) {
        this.f27109d = bVar;
        this.f27112g = cVar;
        if (this.f27109d == null) {
            throw new IllegalArgumentException("config is null.");
        } else if (this.f27112g != null) {
            this.f27108c = bVar.mo17928a();
            if (!TextUtils.isEmpty(this.f27108c)) {
                this.f27110e = C9993d.m20089a(context);
                C9993d dVar = this.f27110e;
                String str = this.f27108c;
                if (!dVar.mo17957a()) {
                    dVar.f27124a.put(str, this);
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
