package com.bytedance.android.livesdk.feed.p347o;

import com.google.gson.p1076a.C17952c;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52775l;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2650m.C52815j;
import p2628d.p2650m.C52820l;

/* renamed from: com.bytedance.android.livesdk.feed.o.g */
public final class C7052g {

    /* renamed from: b */
    public static final C7053a f19211b = new C7053a(null);

    /* renamed from: a */
    public final Object f19212a;

    /* renamed from: com.bytedance.android.livesdk.feed.o.g$a */
    public static final class C7053a {
        private C7053a() {
        }

        public /* synthetic */ C7053a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m14709a(Object obj) {
            String str;
            if (obj == null) {
                return "(null value)";
            }
            Class cls = obj.getClass();
            if (!cls.isArray()) {
                return obj.toString();
            }
            int length = Array.getLength(obj);
            StringBuilder sb = new StringBuilder();
            Class componentType = cls.getComponentType();
            if (componentType != null) {
                str = componentType.getSimpleName();
            } else {
                str = null;
            }
            StringBuilder sb2 = new StringBuilder("(array ");
            sb2.append(str);
            sb2.append('[');
            sb2.append(length);
            sb2.append("]: ");
            sb.append(sb2.toString());
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(Array.get(obj, i));
            }
            sb.append(")");
            String sb3 = sb.toString();
            C52711k.m112236a((Object) sb3, "sb.toString()");
            return sb3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.o.g$b */
    public static final class C7054b {

        /* renamed from: b */
        public static final C7055a f19213b = new C7055a(null);

        /* renamed from: a */
        public final List<C7060b> f19214a;

        /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$a */
        public static final class C7055a {

            /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$a$a */
            static final class C7056a extends C52712l implements C52670a<Character> {

                /* renamed from: a */
                final /* synthetic */ String f19215a;

                /* renamed from: b */
                final /* synthetic */ C52725c f19216b;

                C7056a(String str, C52725c cVar) {
                    this.f19215a = str;
                    this.f19216b = cVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    if (this.f19216b.element + 1 < this.f19215a.length()) {
                        return Character.valueOf(this.f19215a.charAt(this.f19216b.element + 1));
                    }
                    return null;
                }
            }

            /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$a$b */
            static final class C7057b extends C52712l implements C52671b<Character, Character> {

                /* renamed from: a */
                final /* synthetic */ C52670a f19217a;

                C7057b(C52670a aVar) {
                    this.f19217a = aVar;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    char charValue = ((Character) obj).charValue();
                    Character ch = (Character) this.f19217a.invoke();
                    if (ch != null && ch.charValue() == charValue) {
                        return Character.valueOf(charValue);
                    }
                    return null;
                }
            }

            /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$a$c */
            static final class C7058c extends C52712l implements C52670a<C52860x> {

                /* renamed from: a */
                final /* synthetic */ C52725c f19218a;

                /* renamed from: b */
                final /* synthetic */ C52725c f19219b;

                /* renamed from: c */
                final /* synthetic */ String f19220c;

                /* renamed from: d */
                final /* synthetic */ List f19221d;

                /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$a$c$a */
                static final class C7059a extends C52712l implements C52671b<C52815j, String> {

                    /* renamed from: a */
                    public static final C7059a f19222a = new C7059a();

                    C7059a() {
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        boolean z;
                        C52815j jVar = (C52815j) obj;
                        C52711k.m112240b(jVar, "it");
                        CharSequence b = jVar.mo110377b();
                        C52711k.m112240b(b, "$this$first");
                        if (b.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return String.valueOf(b.charAt(0));
                        }
                        throw new NoSuchElementException("Char sequence is empty.");
                    }
                }

                C7058c(C52725c cVar, C52725c cVar2, String str, List list) {
                    this.f19218a = cVar;
                    this.f19219b = cVar2;
                    this.f19220c = str;
                    this.f19221d = list;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    if (this.f19218a.element > this.f19219b.element) {
                        String str = this.f19220c;
                        int i = this.f19219b.element;
                        int i2 = this.f19218a.element;
                        if (str != null) {
                            String substring = str.substring(i, i2);
                            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            this.f19221d.add(new C7062c(C7063a.IDENTIFIER, new C52820l("//|\\.\\.").replace((CharSequence) substring, (C52671b<? super C52815j, ? extends CharSequence>) C7059a.f19222a)));
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    this.f19219b.element = this.f19218a.element + 1;
                    return C52860x.f131107a;
                }
            }

            private C7055a() {
            }

            public /* synthetic */ C7055a(C52707g gVar) {
                this();
            }

            /* renamed from: a */
            public static List<C7060b> m14710a(List<C7062c> list) {
                C7060b bVar;
                C52711k.m112240b(list, "list");
                List<C7060b> arrayList = new ArrayList<>();
                C7063a aVar = C7063a.SLASH;
                for (C7062c cVar : list) {
                    switch (C7064h.f19230b[cVar.f19226a.ordinal()]) {
                        case 1:
                        case 2:
                            aVar = cVar.f19226a;
                            break;
                        case 3:
                            Collection collection = arrayList;
                            switch (C7064h.f19229a[aVar.ordinal()]) {
                                case 1:
                                    C7061a aVar2 = C7061a.COMPONENT;
                                    String str = cVar.f19227b;
                                    if (str == null) {
                                        C52711k.m112234a();
                                    }
                                    bVar = new C7060b(aVar2, str);
                                    break;
                                case 2:
                                    C7061a aVar3 = C7061a.FIELD;
                                    String str2 = cVar.f19227b;
                                    if (str2 == null) {
                                        C52711k.m112234a();
                                    }
                                    bVar = new C7060b(aVar3, str2);
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder("unexpected member type ");
                                    sb.append(cVar.f19226a);
                                    throw new IllegalStateException(sb.toString());
                            }
                            collection.add(bVar);
                            break;
                    }
                }
                return arrayList;
            }

            /* renamed from: a */
            public final List<C7062c> mo13205a(String str) {
                C52711k.m112240b(str, "objPath");
                List<C7062c> arrayList = new ArrayList<>();
                C52725c cVar = new C52725c();
                cVar.element = 0;
                C52725c cVar2 = new C52725c();
                cVar2.element = 0;
                C52670a cVar3 = new C7058c(cVar, cVar2, str, arrayList);
                C52671b bVar = new C7057b(new C7056a(str, cVar));
                while (cVar.element < str.length()) {
                    switch (str.charAt(cVar.element)) {
                        case '.':
                            Character ch = (Character) bVar.invoke(Character.valueOf('.'));
                            if (ch == null) {
                                cVar3.invoke();
                                arrayList.add(new C7062c(C7063a.DOT, null, 2, null));
                                break;
                            } else {
                                ch.charValue();
                                cVar.element++;
                                break;
                            }
                        case '/':
                            Character ch2 = (Character) bVar.invoke(Character.valueOf('/'));
                            if (ch2 == null) {
                                cVar3.invoke();
                                arrayList.add(new C7062c(C7063a.SLASH, null, 2, null));
                                break;
                            } else {
                                ch2.charValue();
                                cVar.element++;
                                break;
                            }
                    }
                    cVar.element++;
                }
                cVar3.invoke();
                return arrayList;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$b */
        public static final class C7060b {

            /* renamed from: a */
            public final C7061a f19223a;

            /* renamed from: b */
            public final String f19224b;

            /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$b$a */
            public enum C7061a {
                FIELD,
                COMPONENT
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f19224b, (java.lang.Object) r3.f19224b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b.C7060b
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.android.livesdk.feed.o.g$b$b r3 = (com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b.C7060b) r3
                    com.bytedance.android.livesdk.feed.o.g$b$b$a r0 = r2.f19223a
                    com.bytedance.android.livesdk.feed.o.g$b$b$a r1 = r3.f19223a
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.lang.String r0 = r2.f19224b
                    java.lang.String r3 = r3.f19224b
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b.C7060b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                C7061a aVar = this.f19223a;
                int i = 0;
                int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
                String str = this.f19224b;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Segment(type=");
                sb.append(this.f19223a);
                sb.append(", name=");
                sb.append(this.f19224b);
                sb.append(")");
                return sb.toString();
            }

            public C7060b(C7061a aVar, String str) {
                C52711k.m112240b(aVar, "type");
                C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
                this.f19223a = aVar;
                this.f19224b = str;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$c */
        public static final class C7062c {

            /* renamed from: a */
            public final C7063a f19226a;

            /* renamed from: b */
            public final String f19227b;

            /* renamed from: com.bytedance.android.livesdk.feed.o.g$b$c$a */
            public enum C7063a {
                SLASH,
                DOT,
                IDENTIFIER
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f19227b, (java.lang.Object) r3.f19227b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b.C7062c
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.android.livesdk.feed.o.g$b$c r3 = (com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b.C7062c) r3
                    com.bytedance.android.livesdk.feed.o.g$b$c$a r0 = r2.f19226a
                    com.bytedance.android.livesdk.feed.o.g$b$c$a r1 = r3.f19226a
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.lang.String r0 = r2.f19227b
                    java.lang.String r3 = r3.f19227b
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b.C7062c.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                C7063a aVar = this.f19226a;
                int i = 0;
                int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
                String str = this.f19227b;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Token(type=");
                sb.append(this.f19226a);
                sb.append(", arg=");
                sb.append(this.f19227b);
                sb.append(")");
                return sb.toString();
            }

            public C7062c(C7063a aVar, String str) {
                C52711k.m112240b(aVar, "type");
                this.f19226a = aVar;
                this.f19227b = str;
            }

            public /* synthetic */ C7062c(C7063a aVar, String str, int i, C52707g gVar) {
                this(aVar, null);
            }
        }

        public C7054b(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            this.f19214a = C7055a.m14710a(f19213b.mo13205a(str));
        }
    }

    public C7052g(Object obj) {
        this.f19212a = obj;
    }

    /* renamed from: a */
    public final Object mo13204a(List<C7060b> list) {
        C52711k.m112240b(list, "segments");
        Object obj = this.f19212a;
        String str = null;
        try {
            for (C7060b bVar : list) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder("(object is null: ");
                    sb.append(bVar.f19224b);
                    sb.append(')');
                    return sb.toString();
                }
                String str2 = bVar.f19224b;
                try {
                    switch (C7065i.f19231a[bVar.f19223a.ordinal()]) {
                        case 1:
                            obj = m14707c(obj, bVar.f19224b);
                            break;
                        case 2:
                            String str3 = bVar.f19224b;
                            Object b = m14706b(obj, str3);
                            if (b == null) {
                                b = m14705a(obj, str3);
                            }
                            if (b == null) {
                                b = m14707c(obj, str3);
                            }
                            obj = b;
                            break;
                        default:
                            throw new C52775l();
                    }
                    String str4 = str2;
                } catch (NoSuchFieldException unused) {
                    str = str2;
                    StringBuilder sb2 = new StringBuilder("(no such field: ");
                    sb2.append(str);
                    sb2.append(')');
                    return sb2.toString();
                }
            }
            return obj;
        } catch (NoSuchFieldException unused2) {
            StringBuilder sb22 = new StringBuilder("(no such field: ");
            sb22.append(str);
            sb22.append(')');
            return sb22.toString();
        }
    }

    /* renamed from: b */
    private static Object m14706b(Object obj, String str) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, new Class[0]);
            C52711k.m112236a((Object) declaredMethod, "m");
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, new Object[0]);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Object m14707c(Object obj, String str) {
        Field declaredField = obj.getClass().getDeclaredField(str);
        C52711k.m112236a((Object) declaredField, "f");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: a */
    private static Object m14705a(Object obj, String str) {
        Field field;
        Object obj2;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        C52711k.m112236a((Object) declaredFields, "cls.declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            C17952c cVar = (C17952c) field.getAnnotation(C17952c.class);
            if (cVar != null) {
                obj2 = cVar.mo34828a();
            } else {
                obj2 = null;
            }
            if (C52711k.m112239a(obj2, (Object) str)) {
                break;
            }
            i++;
        }
        if (field != null) {
            field.setAccessible(true);
        }
        if (field != null) {
            return field.get(obj);
        }
        return null;
    }
}
