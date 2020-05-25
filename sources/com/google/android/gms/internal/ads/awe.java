package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.awe;
import com.google.android.gms.internal.ads.awf;
import java.io.IOException;

public abstract class awe<MessageType extends awe<MessageType, BuilderType>, BuilderType extends awf<MessageType, BuilderType>> implements azj {
    private static boolean zzfud;
    protected int zzfuc;

    /* renamed from: e */
    public final awo mo29579e() {
        try {
            aww b = awo.m34293b(mo29824i());
            mo29820a(b.f41475a);
            return b.mo29632a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf(str).length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: f */
    public final byte[] mo29580f() {
        try {
            byte[] bArr = new byte[mo29824i()];
            axf a = axf.m34430a(bArr);
            mo29820a(a);
            a.mo29730c();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf(str).length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo29581g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29578a(int i) {
        throw new UnsupportedOperationException();
    }
}
