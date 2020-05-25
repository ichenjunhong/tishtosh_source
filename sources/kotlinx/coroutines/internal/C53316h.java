package kotlinx.coroutines.internal;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C53316h {

    /* renamed from: a */
    public static final Object f131934a = new C53332u("CONDITION_FALSE");

    /* renamed from: b */
    public static final Object f131935b = new C53332u("REMOVE_PREPARED");

    /* renamed from: c */
    private static final Object f131936c = new C53332u("ALREADY_REMOVED");

    /* renamed from: d */
    private static final Object f131937d = new C53332u("LIST_EMPTY");

    /* renamed from: a */
    public static final C53317i m113308a(Object obj) {
        Object obj2;
        C52711k.m112240b(obj, "receiver$0");
        if (!(obj instanceof C53328q)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C53328q qVar = (C53328q) obj2;
        if (qVar != null) {
            C53317i iVar = qVar.f131957a;
            if (iVar != null) {
                return iVar;
            }
        }
        return (C53317i) obj;
    }
}
