package com.google.android.gms.internal.ads;

@C16299uq
final class akm extends C16319vj {

    /* renamed from: a */
    static final akm f40774a = new akm();

    akm() {
    }

    /* renamed from: a */
    public final aaf mo29085a(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new ach();
        }
        if ("mvhd".equals(str)) {
            return new adh();
        }
        return new aei(str);
    }
}
