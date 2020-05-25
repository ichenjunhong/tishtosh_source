package com.google.gson.internal.bind;

import com.google.gson.C17970e;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C18043c;
import com.google.gson.internal.C18069h;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.p1079a.C17984b;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements C18097x {

    /* renamed from: a */
    public final C17970e f49953a;

    /* renamed from: b */
    private final C18043c f49954b;

    /* renamed from: c */
    private final Excluder f49955c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f49956d;

    /* renamed from: e */
    private final C17984b f49957e = C17984b.m44136a();

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public static final class C17993a<T> extends C18095w<T> {

        /* renamed from: a */
        private final C18069h<T> f49965a;

        /* renamed from: b */
        private final Map<String, C17994b> f49966b;

        public final T read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            T a = this.f49965a.mo34956a();
            try {
                aVar.mo34839c();
                while (aVar.mo34842e()) {
                    C17994b bVar = (C17994b) this.f49966b.get(aVar.mo34844h());
                    if (bVar != null) {
                        if (bVar.f49969j) {
                            bVar.mo34937a(aVar, (Object) a);
                        }
                    }
                    aVar.mo34851o();
                }
                aVar.mo34841d();
                return a;
            } catch (IllegalStateException e) {
                throw new C18091u((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        C17993a(C18069h<T> hVar, Map<String, C17994b> map) {
            this.f49965a = hVar;
            this.f49966b = map;
        }

        public final void write(C17961c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo34870f();
                return;
            }
            cVar.mo34868d();
            try {
                for (C17994b bVar : this.f49966b.values()) {
                    if (bVar.mo34939a(t)) {
                        cVar.mo34861a(bVar.f49967h);
                        bVar.mo34938a(cVar, (Object) t);
                    }
                }
                cVar.mo34869e();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    static abstract class C17994b {

        /* renamed from: h */
        final String f49967h;

        /* renamed from: i */
        final boolean f49968i;

        /* renamed from: j */
        final boolean f49969j;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo34937a(C17958a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo34938a(C17961c cVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo34939a(Object obj) throws IOException, IllegalAccessException;

        protected C17994b(String str, boolean z, boolean z2) {
            this.f49967h = str;
            this.f49968i = z;
            this.f49969j = z2;
        }
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Class<? super T> cls = aVar.f49842b;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C17993a(this.f49954b.mo34954a(aVar), m44155a(fVar, aVar, cls));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b1 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m44156a(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            com.google.gson.internal.Excluder r0 = r8.f49955c
            java.lang.Class r1 = r9.getType()
            boolean r2 = r0.mo34917a(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0017
            boolean r1 = r0.mo34918a(r1, r10)
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            if (r1 != 0) goto L_0x00b2
            int r1 = r0.f49921c
            int r2 = r9.getModifiers()
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0026
        L_0x0023:
            r9 = 1
            goto L_0x00af
        L_0x0026:
            double r1 = r0.f49920b
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0045
            java.lang.Class<com.google.gson.a.d> r1 = com.google.gson.p1076a.C17953d.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.google.gson.a.d r1 = (com.google.gson.p1076a.C17953d) r1
            java.lang.Class<com.google.gson.a.e> r2 = com.google.gson.p1076a.C17954e.class
            java.lang.annotation.Annotation r2 = r9.getAnnotation(r2)
            com.google.gson.a.e r2 = (com.google.gson.p1076a.C17954e) r2
            boolean r1 = r0.mo34916a(r1, r2)
            if (r1 != 0) goto L_0x0045
            goto L_0x0023
        L_0x0045:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L_0x004c
            goto L_0x0023
        L_0x004c:
            boolean r1 = r0.f49923e
            if (r1 == 0) goto L_0x006a
            java.lang.Class<com.google.gson.a.a> r1 = com.google.gson.p1076a.C17950a.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.google.gson.a.a r1 = (com.google.gson.p1076a.C17950a) r1
            if (r1 == 0) goto L_0x0023
            if (r10 == 0) goto L_0x0063
            boolean r1 = r1.mo34824a()
            if (r1 != 0) goto L_0x006a
            goto L_0x0069
        L_0x0063:
            boolean r1 = r1.mo34825b()
            if (r1 != 0) goto L_0x006a
        L_0x0069:
            goto L_0x0023
        L_0x006a:
            boolean r1 = r0.f49922d
            if (r1 != 0) goto L_0x0079
            java.lang.Class r1 = r9.getType()
            boolean r1 = r0.mo34919c(r1)
            if (r1 == 0) goto L_0x0079
            goto L_0x0023
        L_0x0079:
            java.lang.Class r1 = r9.getType()
            boolean r1 = com.google.gson.internal.Excluder.m44124b(r1)
            if (r1 == 0) goto L_0x0084
            goto L_0x0023
        L_0x0084:
            if (r10 == 0) goto L_0x0089
            java.util.List<com.google.gson.b> r10 = r0.f49924f
            goto L_0x008b
        L_0x0089:
            java.util.List<com.google.gson.b> r10 = r0.f49925g
        L_0x008b:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00ae
            com.google.gson.c r0 = new com.google.gson.c
            r0.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L_0x009a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ae
            java.lang.Object r10 = r9.next()
            com.google.gson.b r10 = (com.google.gson.C17955b) r10
            boolean r10 = r10.shouldSkipField(r0)
            if (r10 == 0) goto L_0x009a
            goto L_0x0023
        L_0x00ae:
            r9 = 0
        L_0x00af:
            if (r9 != 0) goto L_0x00b2
            return r4
        L_0x00b2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.m44156a(java.lang.reflect.Field, boolean):boolean");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r35v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C17994b> m44155a(com.google.gson.C17971f r33, com.google.gson.p1077b.C17956a<?> r34, java.lang.Class r35) {
        /*
            r32 = this;
            r11 = r32
            r12 = r33
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            boolean r0 = r35.isInterface()
            if (r0 == 0) goto L_0x0010
            return r13
        L_0x0010:
            r0 = r34
            java.lang.reflect.Type r14 = r0.f49843c
            r15 = r35
            r10 = r0
        L_0x0017:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r15 == r0) goto L_0x0144
            java.lang.reflect.Field[] r9 = r15.getDeclaredFields()
            int r8 = r9.length
            r7 = 0
            r6 = 0
        L_0x0022:
            if (r6 >= r8) goto L_0x0129
            r5 = r9[r6]
            r4 = 1
            boolean r0 = r11.m44156a(r5, r4)
            boolean r16 = r11.m44156a(r5, r7)
            if (r0 != 0) goto L_0x0042
            if (r16 == 0) goto L_0x0034
            goto L_0x0042
        L_0x0034:
            r30 = r6
            r25 = r8
            r22 = r9
            r31 = r10
            r21 = r15
            r24 = 0
            goto L_0x00fc
        L_0x0042:
            com.google.gson.internal.a.b r1 = r11.f49957e
            r1.mo34921a(r5)
            java.lang.reflect.Type r1 = r10.f49843c
            java.lang.reflect.Type r2 = r5.getGenericType()
            java.lang.reflect.Type r17 = com.google.gson.internal.C17986b.m44146a(r1, r15, r2)
            java.util.List r3 = com.google.gson.internal.bind.C18008f.m44208a(r11, r5)
            int r2 = r3.size()
            r18 = 0
            r19 = r0
            r0 = r18
            r1 = 0
        L_0x0060:
            if (r1 >= r2) goto L_0x00ed
            java.lang.Object r20 = r3.get(r1)
            r21 = r15
            r15 = r20
            java.lang.String r15 = (java.lang.String) r15
            if (r1 == 0) goto L_0x0073
            r22 = r9
            r19 = 0
            goto L_0x0075
        L_0x0073:
            r22 = r9
        L_0x0075:
            com.google.gson.b.a r9 = com.google.gson.p1077b.C17956a.m44007a(r17)
            java.lang.Class<? super T> r4 = r9.f49842b
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r7 = com.google.gson.internal.C18071j.f50134a
            boolean r20 = r7.containsKey(r4)
            java.lang.Class<com.google.gson.a.b> r4 = com.google.gson.p1076a.C17951b.class
            java.lang.annotation.Annotation r4 = r5.getAnnotation(r4)
            com.google.gson.a.b r4 = (com.google.gson.p1076a.C17951b) r4
            if (r4 == 0) goto L_0x0092
            com.google.gson.internal.c r7 = r11.f49954b
            com.google.gson.w r4 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.m44154a(r7, r12, r9, r4)
            goto L_0x0094
        L_0x0092:
            r4 = r18
        L_0x0094:
            if (r4 == 0) goto L_0x0098
            r7 = 1
            goto L_0x0099
        L_0x0098:
            r7 = 0
        L_0x0099:
            if (r4 != 0) goto L_0x009f
            com.google.gson.w r4 = r12.mo34877a(r9)
        L_0x009f:
            r25 = r4
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 r4 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1
            r11 = r0
            r0 = r4
            r26 = r1
            r1 = r32
            r27 = r2
            r2 = r15
            r28 = r3
            r3 = r19
            r12 = r4
            r23 = 1
            r4 = r16
            r29 = r5
            r30 = r6
            r6 = r7
            r24 = 0
            r7 = r25
            r25 = r8
            r8 = r33
            r31 = r10
            r10 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r13.put(r15, r12)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.C17994b) r0
            if (r11 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r0 = r11
        L_0x00d3:
            int r1 = r26 + 1
            r15 = r21
            r9 = r22
            r8 = r25
            r2 = r27
            r3 = r28
            r5 = r29
            r6 = r30
            r10 = r31
            r4 = 1
            r7 = 0
            r11 = r32
            r12 = r33
            goto L_0x0060
        L_0x00ed:
            r11 = r0
            r30 = r6
            r25 = r8
            r22 = r9
            r31 = r10
            r21 = r15
            r24 = 0
            if (r11 != 0) goto L_0x010d
        L_0x00fc:
            int r6 = r30 + 1
            r15 = r21
            r9 = r22
            r8 = r25
            r10 = r31
            r7 = 0
            r11 = r32
            r12 = r33
            goto L_0x0022
        L_0x010d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.f49967h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0129:
            r0 = r10
            r21 = r15
            java.lang.reflect.Type r0 = r0.f49843c
            java.lang.reflect.Type r1 = r21.getGenericSuperclass()
            r2 = r21
            java.lang.reflect.Type r0 = com.google.gson.internal.C17986b.m44146a(r0, r2, r1)
            com.google.gson.b.a r10 = com.google.gson.p1077b.C17956a.m44007a(r0)
            java.lang.Class<? super T> r15 = r10.f49842b
            r11 = r32
            r12 = r33
            goto L_0x0017
        L_0x0144:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.m44155a(com.google.gson.f, com.google.gson.b.a, java.lang.Class):java.util.Map");
    }

    public ReflectiveTypeAdapterFactory(C18043c cVar, C17970e eVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f49954b = cVar;
        this.f49953a = eVar;
        this.f49955c = excluder;
        this.f49956d = jsonAdapterAnnotationTypeAdapterFactory;
    }
}
