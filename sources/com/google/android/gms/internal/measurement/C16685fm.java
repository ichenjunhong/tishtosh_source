package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16684fl;
import com.google.android.gms.internal.measurement.C16685fm;

/* renamed from: com.google.android.gms.internal.measurement.fm */
public abstract class C16685fm<MessageType extends C16684fl<MessageType, BuilderType>, BuilderType extends C16685fm<MessageType, BuilderType>> implements C16776il {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo31990a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ C16776il mo31991a(C16775ik ikVar) {
        if (mo32234j().getClass().isInstance(ikVar)) {
            return mo31990a((MessageType) (C16684fl) ikVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
