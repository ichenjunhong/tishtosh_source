package com.bytedance.android.live.broadcast.p213h.p214a.p215a;

import com.bytedance.android.live.broadcast.p213h.C3444d;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.live.broadcast.h.a.a.b */
public final class C3415b extends C3414a {

    /* renamed from: c */
    private String f9729c;

    /* renamed from: a */
    public final void mo8768a() {
        this.f9727a.mo8779a((String) null, 1.0f);
    }

    /* renamed from: a */
    public final void mo8769a(String str) throws FileNotFoundException {
        if (!C3444d.m9285a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exits:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (this.f9727a != null) {
            this.f9729c = str;
            this.f9727a.mo8779a(this.f9729c, 1.0f);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    /* renamed from: a */
    public final int mo8767a(String str, String str2, float f) throws FileNotFoundException {
        if (!C3444d.m9285a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exits:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (!C3444d.m9285a(str2)) {
            StringBuilder sb2 = new StringBuilder("Filter file not exits:");
            sb2.append(str2);
            throw new FileNotFoundException(sb2.toString());
        } else if (this.f9727a != null) {
            return this.f9727a.mo8771a(str, str2, f);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }
}
