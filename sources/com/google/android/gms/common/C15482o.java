package com.google.android.gms.common;

import com.C2240a;
import com.google.android.gms.common.util.C15506a;
import com.google.android.gms.common.util.C15519j;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.o */
final /* synthetic */ class C15482o implements Callable {

    /* renamed from: a */
    private final boolean f39892a;

    /* renamed from: b */
    private final String f39893b;

    /* renamed from: c */
    private final C15483p f39894c;

    C15482o(boolean z, String str, C15483p pVar) {
        this.f39892a = z;
        this.f39893b = str;
        this.f39894c = pVar;
    }

    public final Object call() {
        boolean z = this.f39892a;
        String str = this.f39893b;
        C15483p pVar = this.f39894c;
        String str2 = "%s: pkg=%s, sha1=%s, atk=%s, ver=%s";
        Object[] objArr = new Object[5];
        objArr[0] = !z && C15481n.m32205b(str, pVar, true).f40013b ? "debug cert rejected" : "not whitelisted";
        objArr[1] = str;
        byte[] digest = C15506a.m32257a("SHA-1").digest(pVar.mo28467c());
        char[] cArr = new char[(digest.length << 1)];
        int i = 0;
        for (byte b : digest) {
            byte b2 = b & 255;
            int i2 = i + 1;
            cArr[i] = C15519j.f39991a[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = C15519j.f39991a[b2 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "12451009.false";
        return C2240a.m6772a(str2, objArr);
    }
}
