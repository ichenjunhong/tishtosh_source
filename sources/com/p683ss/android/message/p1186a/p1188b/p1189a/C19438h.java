package com.p683ss.android.message.p1186a.p1188b.p1189a;

import java.net.InetSocketAddress;

/* renamed from: com.ss.android.message.a.b.a.h */
public final class C19438h {

    /* renamed from: a */
    public final InetSocketAddress f53753a;

    /* renamed from: b */
    final int f53754b = 60000;

    public final int hashCode() {
        return this.f53753a.hashCode() ^ this.f53754b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19438h)) {
            return false;
        }
        C19438h hVar = (C19438h) obj;
        if (!this.f53753a.equals(hVar.f53753a) || this.f53754b != hVar.f53754b) {
            return false;
        }
        return true;
    }

    C19438h(InetSocketAddress inetSocketAddress, int i) {
        this.f53753a = inetSocketAddress;
    }
}
