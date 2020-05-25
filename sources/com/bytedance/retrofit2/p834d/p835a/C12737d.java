package com.bytedance.retrofit2.p834d.p835a;

import com.bytedance.retrofit2.C12799u;

/* renamed from: com.bytedance.retrofit2.d.a.d */
public final class C12737d extends RuntimeException {

    /* renamed from: a */
    private final int f33367a;

    /* renamed from: b */
    private final transient C12799u<?> f33368b;

    public final int code() {
        return this.f33367a;
    }

    public final C12799u<?> response() {
        return this.f33368b;
    }

    public C12737d(C12799u<?> uVar) {
        if (uVar != null) {
            StringBuilder sb = new StringBuilder("HTTP ");
            sb.append(uVar.mo23958a());
            super(sb.toString());
            this.f33367a = uVar.mo23958a();
            this.f33368b = uVar;
            return;
        }
        throw new NullPointerException("response == null");
    }
}
