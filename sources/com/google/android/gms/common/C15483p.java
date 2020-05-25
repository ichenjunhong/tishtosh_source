package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15418ai;
import com.google.android.gms.common.internal.C15419aj;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.p */
abstract class C15483p extends C15419aj {

    /* renamed from: a */
    private int f39895a;

    protected C15483p(byte[] bArr) {
        C15464q.m32133b(bArr.length == 25);
        this.f39895a = Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract byte[] mo28467c();

    public int hashCode() {
        return this.f39895a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C15418ai)) {
            return false;
        }
        try {
            C15418ai aiVar = (C15418ai) obj;
            if (aiVar.mo28388b() != hashCode()) {
                return false;
            }
            C14882b a = aiVar.mo28387a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(mo28467c(), (byte[]) C14886d.m30545a(a));
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C14882b mo28387a() {
        return C14886d.m30544a(mo28467c());
    }

    /* renamed from: b */
    public final int mo28388b() {
        return hashCode();
    }

    /* renamed from: a */
    protected static byte[] m32206a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
