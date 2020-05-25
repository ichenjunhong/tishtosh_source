package p2628d.p2635d;

import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: d.d.b */
public final class C52641b {

    /* renamed from: a */
    public static final C52638a f130929a;

    /* renamed from: a */
    private static final int m112184a() {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property == null) {
            return 65542;
        }
        CharSequence charSequence = property;
        int a = C52830p.m112415a(charSequence, '.', 0, false, 6, (Object) null);
        if (a < 0) {
            try {
                i = Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        int i2 = a + 1;
        int a2 = C52830p.m112415a(charSequence, '.', i2, false, 4, (Object) null);
        if (a2 < 0) {
            a2 = property.length();
        }
        if (property != null) {
            String substring = property.substring(0, a);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (property != null) {
                String substring2 = property.substring(i2, a2);
                C52711k.m112236a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                try {
                    i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                } catch (NumberFormatException unused2) {
                }
                return i;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    static {
        C52638a aVar;
        Object newInstance;
        Object newInstance2;
        int a = m112184a();
        if (a >= 65544) {
            try {
                newInstance2 = Class.forName("d.d.b.a").newInstance();
                C52711k.m112236a(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = (C52638a) newInstance2;
                    f130929a = aVar;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = C52638a.class.getClassLoader();
                StringBuilder sb = new StringBuilder("Instance classloader: ");
                sb.append(classLoader);
                sb.append(", base type classloader: ");
                sb.append(classLoader2);
                Throwable initCause = new ClassCastException(sb.toString()).initCause(e);
                C52711k.m112236a((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C52711k.m112236a(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (C52638a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = C52638a.class.getClassLoader();
                            StringBuilder sb2 = new StringBuilder("Instance classloader: ");
                            sb2.append(classLoader3);
                            sb2.append(", base type classloader: ");
                            sb2.append(classLoader4);
                            Throwable initCause2 = new ClassCastException(sb2.toString()).initCause(e2);
                            C52711k.m112236a((Object) initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause2;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543) {
            try {
                newInstance = Class.forName("d.d.a.a").newInstance();
                C52711k.m112236a(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = (C52638a) newInstance;
                    f130929a = aVar;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = C52638a.class.getClassLoader();
                StringBuilder sb3 = new StringBuilder("Instance classloader: ");
                sb3.append(classLoader5);
                sb3.append(", base type classloader: ");
                sb3.append(classLoader6);
                Throwable initCause3 = new ClassCastException(sb3.toString()).initCause(e3);
                C52711k.m112236a((Object) initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C52711k.m112236a(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (C52638a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = C52638a.class.getClassLoader();
                            StringBuilder sb4 = new StringBuilder("Instance classloader: ");
                            sb4.append(classLoader7);
                            sb4.append(", base type classloader: ");
                            sb4.append(classLoader8);
                            Throwable initCause4 = new ClassCastException(sb4.toString()).initCause(e4);
                            C52711k.m112236a((Object) initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause4;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C52638a();
        f130929a = aVar;
    }
}
