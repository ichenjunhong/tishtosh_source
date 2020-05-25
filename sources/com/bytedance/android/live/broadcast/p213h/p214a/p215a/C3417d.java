package com.bytedance.android.live.broadcast.p213h.p214a.p215a;

import com.bytedance.android.live.broadcast.p213h.C3444d;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.live.broadcast.h.a.a.d */
public final class C3417d extends C3414a {
    /* renamed from: a */
    public final void mo8787a() {
        if (this.f9727a != null) {
            this.f9727a.mo8778a((String) null);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    /* renamed from: a */
    public final void mo8791a(boolean z) {
        if (this.f9727a != null) {
            this.f9727a.mo8782a(z);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    /* renamed from: a */
    public final void mo8792a(String[] strArr) {
        int i;
        if (this.f9727a != null) {
            C3416c cVar = this.f9727a;
            if (strArr != null) {
                i = strArr.length;
            } else {
                i = 0;
            }
            cVar.mo8772a(strArr, i);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    /* renamed from: a */
    public final void mo8790a(String str, boolean z) throws FileNotFoundException {
        if (!C3444d.m9285a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exists:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (this.f9727a != null) {
            this.f9727a.mo8781a(str, z);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    /* renamed from: a */
    public final void mo8793a(String[] strArr, String[] strArr2) {
        if (this.f9727a != null) {
            this.f9727a.mo8773a(strArr, strArr.length, strArr2);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    /* renamed from: a */
    public final void mo8788a(String str, String str2, float f) throws FileNotFoundException {
        if (!C3444d.m9285a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exists:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (this.f9727a != null) {
            this.f9727a.mo8783b(str, str2, f);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    /* renamed from: a */
    public final void mo8789a(String str, String str2, boolean z) {
        if ("".equals(str)) {
            throw new RuntimeException("renderCacheKey is Null");
        } else if ("".equals(str2)) {
            throw new RuntimeException("resPath is Null");
        } else if (this.f9727a != null) {
            this.f9727a.mo8780a(str, str2, z);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }
}
