package p2628d.p2639f;

import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52704d;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52760c;

/* renamed from: d.f.a */
public final class C52669a {
    /* renamed from: a */
    public static final <T> Class<T> m112219a(C52760c<T> cVar) {
        C52711k.m112240b(cVar, "$this$java");
        Class<T> a = ((C52704d) cVar).mo110297a();
        if (a != null) {
            return a;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: b */
    public static final <T> Class<T> m112220b(C52760c<T> cVar) {
        C52711k.m112240b(cVar, "$this$javaObjectType");
        Class a = ((C52704d) cVar).mo110297a();
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (a != null) {
            return a;
        } else {
            throw new C52857u("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }
}
