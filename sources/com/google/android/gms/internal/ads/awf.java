package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.awe;
import com.google.android.gms.internal.ads.awf;
import java.io.IOException;

public abstract class awf<MessageType extends awe<MessageType, BuilderType>, BuilderType extends awf<MessageType, BuilderType>> implements azk {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo29582a(MessageType messagetype);

    /* renamed from: a */
    public abstract BuilderType mo29583a(axa axa, axm axm) throws IOException;

    /* renamed from: b */
    public abstract BuilderType clone();

    /* renamed from: a */
    public BuilderType mo29584a(byte[] bArr, int i, int i2, axm axm) throws ayi {
        try {
            axa a = axa.m34318a(bArr, 0, i2, false);
            mo29583a(a, axm);
            a.mo29635a(0);
            return this;
        } catch (ayi e) {
            throw e;
        } catch (IOException e2) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ azk mo29585a(azj azj) {
        if (mo29827n().getClass().isInstance(azj)) {
            return mo29582a((MessageType) (awe) azj);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
