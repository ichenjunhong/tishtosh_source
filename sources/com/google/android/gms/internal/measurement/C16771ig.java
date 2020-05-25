package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ig */
final class C16771ig implements C16770if {
    C16771ig() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo32288a(Object obj) {
        return (C16769ie) obj;
    }

    /* renamed from: f */
    public final C16768id<?, ?> mo32293f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo32289b(Object obj) {
        return (C16769ie) obj;
    }

    /* renamed from: c */
    public final boolean mo32290c(Object obj) {
        return !((C16769ie) obj).isMutable();
    }

    /* renamed from: d */
    public final Object mo32291d(Object obj) {
        ((C16769ie) obj).zzsw();
        return obj;
    }

    /* renamed from: e */
    public final Object mo32292e(Object obj) {
        return C16769ie.zzxg().zzxh();
    }

    /* renamed from: a */
    public final Object mo32287a(Object obj, Object obj2) {
        C16769ie ieVar = (C16769ie) obj;
        C16769ie ieVar2 = (C16769ie) obj2;
        if (!ieVar2.isEmpty()) {
            if (!ieVar.isMutable()) {
                ieVar = ieVar.zzxh();
            }
            ieVar.zza(ieVar2);
        }
        return ieVar;
    }

    /* renamed from: a */
    public final int mo32286a(int i, Object obj, Object obj2) {
        C16769ie ieVar = (C16769ie) obj;
        if (ieVar.isEmpty()) {
            return 0;
        }
        Iterator it = ieVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
