package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C15462p;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.bb */
final class C17918bb {

    /* renamed from: a */
    public final KeyPair f49775a;

    /* renamed from: b */
    public final long f49776b;

    C17918bb(KeyPair keyPair, long j) {
        this.f49775a = keyPair;
        this.f49776b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17918bb)) {
            return false;
        }
        C17918bb bbVar = (C17918bb) obj;
        if (this.f49776b != bbVar.f49776b || !this.f49775a.getPublic().equals(bbVar.f49775a.getPublic()) || !this.f49775a.getPrivate().equals(bbVar.f49775a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f49775a.getPublic(), this.f49775a.getPrivate(), Long.valueOf(this.f49776b));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m43922a() {
        return Base64.encodeToString(this.f49775a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m43924b() {
        return Base64.encodeToString(this.f49775a.getPrivate().getEncoded(), 11);
    }
}
