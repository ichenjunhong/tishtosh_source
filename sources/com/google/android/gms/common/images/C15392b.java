package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C15462p;

/* renamed from: com.google.android.gms.common.images.b */
final class C15392b {

    /* renamed from: a */
    public final Uri f39718a;

    public C15392b(Uri uri) {
        this.f39718a = uri;
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f39718a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15392b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C15462p.m32120a(((C15392b) obj).f39718a, this.f39718a);
    }
}
