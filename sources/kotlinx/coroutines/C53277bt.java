package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53332u;

/* renamed from: kotlinx.coroutines.bt */
public final class C53277bt {

    /* renamed from: a */
    public static final C53332u f131905a = new C53332u("SEALED");

    /* renamed from: b */
    public static final C53229az f131906b = new C53229az(false);

    /* renamed from: c */
    public static final C53229az f131907c = new C53229az(true);

    /* renamed from: a */
    public static final Object m113247a(Object obj) {
        if (obj instanceof C53258bg) {
            return new C53259bh((C53258bg) obj);
        }
        return obj;
    }

    /* renamed from: b */
    public static final Object m113248b(Object obj) {
        Object obj2;
        if (!(obj instanceof C53259bh)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C53259bh bhVar = (C53259bh) obj2;
        if (bhVar == null) {
            return obj;
        }
        C53258bg bgVar = bhVar.f131887a;
        if (bgVar == null) {
            return obj;
        }
        return bgVar;
    }
}
