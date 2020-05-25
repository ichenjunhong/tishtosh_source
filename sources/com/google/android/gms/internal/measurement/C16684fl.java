package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16684fl;
import com.google.android.gms.internal.measurement.C16685fm;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.fl */
public abstract class C16684fl<MessageType extends C16684fl<MessageType, BuilderType>, BuilderType extends C16685fm<MessageType, BuilderType>> implements C16775ik {
    private static boolean zzbtj;
    protected int zzbti;

    /* renamed from: c */
    public final C16691fs mo31987c() {
        try {
            C16700ga b = C16691fs.m39867b(mo32230g());
            mo32226a(b.f46950a);
            return b.mo32036a();
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

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo31988d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31986a(int i) {
        throw new UnsupportedOperationException();
    }
}
