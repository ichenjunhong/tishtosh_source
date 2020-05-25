package kotlinx.coroutines.internal;

import kotlinx.coroutines.C53290cf;
import p2628d.C52857u;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: kotlinx.coroutines.internal.w */
public final class C53334w {

    /* renamed from: a */
    private static final C53332u f131961a = new C53332u("ZERO");

    /* renamed from: b */
    private static final C52682m<Object, C52631b, Object> f131962b = C53335a.f131966a;

    /* renamed from: c */
    private static final C52682m<C53290cf<?>, C52631b, C53290cf<?>> f131963c = C53336b.f131967a;

    /* renamed from: d */
    private static final C52682m<C53341z, C52631b, C53341z> f131964d = C53338d.f131969a;

    /* renamed from: e */
    private static final C52682m<C53341z, C52631b, C53341z> f131965e = C53337c.f131968a;

    /* renamed from: kotlinx.coroutines.internal.w$a */
    static final class C53335a extends C52712l implements C52682m<Object, C52631b, Object> {

        /* renamed from: a */
        public static final C53335a f131966a = new C53335a();

        C53335a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            Object obj3 = (C52631b) obj2;
            C52711k.m112240b(obj3, "element");
            if (obj3 instanceof C53290cf) {
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i != 0) {
                    return Integer.valueOf(i + 1);
                }
                obj = obj3;
            }
            return obj;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.w$b */
    static final class C53336b extends C52712l implements C52682m<C53290cf<?>, C52631b, C53290cf<?>> {

        /* renamed from: a */
        public static final C53336b f131967a = new C53336b();

        C53336b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C53290cf cfVar = (C53290cf) obj;
            C52631b bVar = (C52631b) obj2;
            C52711k.m112240b(bVar, "element");
            if (cfVar != null) {
                return cfVar;
            }
            if (!(bVar instanceof C53290cf)) {
                bVar = null;
            }
            return (C53290cf) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.w$c */
    static final class C53337c extends C52712l implements C52682m<C53341z, C52631b, C53341z> {

        /* renamed from: a */
        public static final C53337c f131968a = new C53337c();

        C53337c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C53341z zVar = (C53341z) obj;
            C52631b bVar = (C52631b) obj2;
            C52711k.m112240b(zVar, "state");
            C52711k.m112240b(bVar, "element");
            if (bVar instanceof C53290cf) {
                C53290cf cfVar = (C53290cf) bVar;
                C52628e eVar = zVar.f131973c;
                Object[] objArr = zVar.f131971a;
                int i = zVar.f131972b;
                zVar.f131972b = i + 1;
                cfVar.mo110762a(eVar, objArr[i]);
            }
            return zVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.w$d */
    static final class C53338d extends C52712l implements C52682m<C53341z, C52631b, C53341z> {

        /* renamed from: a */
        public static final C53338d f131969a = new C53338d();

        C53338d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C53341z zVar = (C53341z) obj;
            C52631b bVar = (C52631b) obj2;
            C52711k.m112240b(zVar, "state");
            C52711k.m112240b(bVar, "element");
            if (bVar instanceof C53290cf) {
                Object a = ((C53290cf) bVar).mo110761a(zVar.f131973c);
                Object[] objArr = zVar.f131971a;
                int i = zVar.f131972b;
                zVar.f131972b = i + 1;
                objArr[i] = a;
            }
            return zVar;
        }
    }

    /* renamed from: a */
    public static final Object m113369a(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        Object fold = eVar.fold(Integer.valueOf(0), f131962b);
        if (fold == null) {
            C52711k.m112234a();
        }
        return fold;
    }

    /* renamed from: a */
    public static final Object m113370a(C52628e eVar, Object obj) {
        C52711k.m112240b(eVar, "context");
        if (obj == null) {
            obj = m113369a(eVar);
        }
        if (obj == Integer.valueOf(0)) {
            return f131961a;
        }
        if (obj instanceof Integer) {
            return eVar.fold(new C53341z(eVar, ((Number) obj).intValue()), f131964d);
        }
        if (obj != null) {
            return ((C53290cf) obj).mo110761a(eVar);
        }
        throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: b */
    public static final void m113371b(C52628e eVar, Object obj) {
        C52711k.m112240b(eVar, "context");
        if (obj != f131961a) {
            if (obj instanceof C53341z) {
                ((C53341z) obj).mo110932a();
                eVar.fold(obj, f131965e);
                return;
            }
            Object fold = eVar.fold(null, f131963c);
            if (fold != null) {
                ((C53290cf) fold).mo110762a(eVar, obj);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }
}
