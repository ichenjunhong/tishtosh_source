package com.google.android.gms.tagmanager;

import java.util.Arrays;

/* renamed from: com.google.android.gms.tagmanager.o */
final class C17219o {

    /* renamed from: a */
    final String f48678a;

    /* renamed from: b */
    final byte[] f48679b;

    C17219o(String str, byte[] bArr) {
        this.f48678a = str;
        this.f48679b = bArr;
    }

    public final String toString() {
        String str = this.f48678a;
        int hashCode = Arrays.hashCode(this.f48679b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("KeyAndSerialized: key = ");
        sb.append(str);
        sb.append(" serialized hash = ");
        sb.append(hashCode);
        return sb.toString();
    }
}
