package com.google.gson;

import com.google.gson.internal.C18043c;
import com.google.gson.internal.C18071j;
import com.google.gson.internal.C18072k;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C17999a;
import com.google.gson.internal.bind.C18001b;
import com.google.gson.internal.bind.C18002c;
import com.google.gson.internal.bind.C18004d;
import com.google.gson.internal.bind.C18006e;
import com.google.gson.internal.bind.C18009g;
import com.google.gson.internal.bind.C18010h;
import com.google.gson.internal.bind.C18012j;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import com.google.gson.p1078c.C17962d;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.f */
public final class C17971f {

    /* renamed from: r */
    private static final C17956a<?> f49875r = C17956a.m44006a(Object.class);

    /* renamed from: a */
    final List<C18097x> f49876a;

    /* renamed from: b */
    public final Excluder f49877b;

    /* renamed from: c */
    public final C17970e f49878c;

    /* renamed from: d */
    final Map<Type, C17979h<?>> f49879d;

    /* renamed from: e */
    public final boolean f49880e;

    /* renamed from: f */
    final boolean f49881f;

    /* renamed from: g */
    final boolean f49882g;

    /* renamed from: h */
    public final boolean f49883h;

    /* renamed from: i */
    final boolean f49884i;

    /* renamed from: j */
    final boolean f49885j;

    /* renamed from: k */
    final boolean f49886k;

    /* renamed from: l */
    final String f49887l;

    /* renamed from: m */
    final int f49888m;

    /* renamed from: n */
    final int f49889n;

    /* renamed from: o */
    final C18092v f49890o;

    /* renamed from: p */
    final List<C18097x> f49891p;

    /* renamed from: q */
    final List<C18097x> f49892q;

    /* renamed from: s */
    private final ThreadLocal<Map<C17956a<?>, C17977a<?>>> f49893s;

    /* renamed from: t */
    private final Map<C17956a<?>, C18095w<?>> f49894t;

    /* renamed from: u */
    private final C18043c f49895u;

    /* renamed from: v */
    private final JsonAdapterAnnotationTypeAdapterFactory f49896v;

    /* renamed from: com.google.gson.f$a */
    static class C17977a<T> extends C18095w<T> {

        /* renamed from: a */
        C18095w<T> f49901a;

        C17977a() {
        }

        public final T read(C17958a aVar) throws IOException {
            if (this.f49901a != null) {
                return this.f49901a.read(aVar);
            }
            throw new IllegalStateException();
        }

        public final void write(C17961c cVar, T t) throws IOException {
            if (this.f49901a != null) {
                this.f49901a.write(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.gson.b.a<T>, code=com.google.gson.b.a, for r6v0, types: [com.google.gson.b.a, com.google.gson.b.a<T>, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.gson.C18095w<T> mo34877a(com.google.gson.p1077b.C17956a r6) {
        /*
            r5 = this;
            java.util.Map<com.google.gson.b.a<?>, com.google.gson.w<?>> r0 = r5.f49894t
            if (r6 != 0) goto L_0x0007
            com.google.gson.b.a<?> r1 = f49875r
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            com.google.gson.w r0 = (com.google.gson.C18095w) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.f$a<?>>> r0 = r5.f49893s
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.f$a<?>>> r1 = r5.f49893s
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            com.google.gson.f$a r2 = (com.google.gson.C17971f.C17977a) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            com.google.gson.f$a r2 = new com.google.gson.f$a     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
            r0.put(r6, r2)     // Catch:{ all -> 0x0080 }
            java.util.List<com.google.gson.x> r3 = r5.f49876a     // Catch:{ all -> 0x0080 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0080 }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x006c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0080 }
            com.google.gson.x r4 = (com.google.gson.C18097x) r4     // Catch:{ all -> 0x0080 }
            com.google.gson.w r4 = r4.create(r5, r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x003e
            com.google.gson.w<T> r3 = r2.f49901a     // Catch:{ all -> 0x0080 }
            if (r3 != 0) goto L_0x0066
            r2.f49901a = r4     // Catch:{ all -> 0x0080 }
            java.util.Map<com.google.gson.b.a<?>, com.google.gson.w<?>> r2 = r5.f49894t     // Catch:{ all -> 0x0080 }
            r2.put(r6, r4)     // Catch:{ all -> 0x0080 }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0065
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.f$a<?>>> r6 = r5.f49893s
            r6.remove()
        L_0x0065:
            return r4
        L_0x0066:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x0080 }
            r2.<init>()     // Catch:{ all -> 0x0080 }
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x006c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = "GSON (2.8.5) cannot handle "
            r3.<init>(r4)     // Catch:{ all -> 0x0080 }
            r3.append(r6)     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0080 }
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x008b
            java.lang.ThreadLocal<java.util.Map<com.google.gson.b.a<?>, com.google.gson.f$a<?>>> r6 = r5.f49893s
            r6.remove()
        L_0x008b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C17971f.mo34877a(com.google.gson.b.a):com.google.gson.w");
    }

    /* renamed from: a */
    public final <T> C18095w<T> mo34878a(C18097x xVar, C17956a<T> aVar) {
        if (!this.f49876a.contains(xVar)) {
            xVar = this.f49896v;
        }
        boolean z = false;
        for (C18097x xVar2 : this.f49876a) {
            if (z) {
                C18095w<T> create = xVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (xVar2 == xVar) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("GSON cannot serialize ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final <T> C18095w<T> mo34879a(Class<T> cls) {
        return mo34877a(C17956a.m44006a(cls));
    }

    /* renamed from: a */
    public final C18082l mo34875a(Object obj) {
        if (obj == null) {
            return C18084n.f50144a;
        }
        return mo34876a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public final C18082l mo34876a(Object obj, Type type) {
        C18004d dVar = new C18004d();
        mo34888a(obj, type, (C17961c) dVar);
        return dVar.mo34950a();
    }

    /* renamed from: a */
    public final void mo34887a(Object obj, Appendable appendable) throws C18083m {
        if (obj != null) {
            m44081a(obj, (Type) obj.getClass(), appendable);
        } else {
            m44079a((C18082l) C18084n.f50144a, appendable);
        }
    }

    /* renamed from: a */
    public final void mo34888a(Object obj, Type type, C17961c cVar) throws C18083m {
        C18095w a = mo34877a(C17956a.m44007a(type));
        boolean z = cVar.f49865a;
        cVar.f49865a = true;
        boolean z2 = cVar.f49866b;
        cVar.f49866b = this.f49883h;
        boolean z3 = cVar.f49867c;
        cVar.f49867c = this.f49880e;
        try {
            a.write(cVar, obj);
            cVar.f49865a = z;
            cVar.f49866b = z2;
            cVar.f49867c = z3;
        } catch (IOException e) {
            throw new C18083m((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            cVar.f49865a = z;
            cVar.f49866b = z2;
            cVar.f49867c = z3;
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo34886a(C18082l lVar) {
        StringWriter stringWriter = new StringWriter();
        m44079a(lVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final <T> T mo34884a(String str, Class<T> cls) throws C18091u {
        return C18071j.m44263a(cls).cast(mo34885a(str, (Type) cls));
    }

    /* renamed from: a */
    public final <T> T mo34885a(String str, Type type) throws C18091u {
        if (str == null) {
            return null;
        }
        return m44076a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public final <T> T mo34883a(Reader reader, Class<T> cls) throws C18091u, C18083m {
        C17958a a = mo34873a(reader);
        Object a2 = mo34880a(a, (Type) cls);
        m44080a(a2, a);
        return C18071j.m44263a(cls).cast(a2);
    }

    /* renamed from: a */
    public final <T> T mo34880a(C17958a aVar, Type type) throws C18083m, C18091u {
        boolean z = aVar.f49847a;
        aVar.f49847a = true;
        try {
            aVar.mo34843f();
            T read = mo34877a(C17956a.m44007a(type)).read(aVar);
            aVar.f49847a = z;
            return read;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.f49847a = z;
                return null;
            }
            throw new C18091u((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C18091u((Throwable) e2);
        } catch (IOException e3) {
            throw new C18091u((Throwable) e3);
        } catch (AssertionError e4) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb.append(e4.getMessage());
            throw new AssertionError(sb.toString(), e4);
        } catch (Throwable th) {
            aVar.f49847a = z;
            throw th;
        }
    }

    /* renamed from: a */
    public final <T> T mo34881a(C18082l lVar, Class<T> cls) throws C18091u {
        return C18071j.m44263a(cls).cast(mo34882a(lVar, (Type) cls));
    }

    /* renamed from: a */
    public final <T> T mo34882a(C18082l lVar, Type type) throws C18091u {
        if (lVar == null) {
            return null;
        }
        return mo34880a((C17958a) new C18002c(lVar), type);
    }

    public C17971f() {
        this(Excluder.f49919a, C17963d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C18092v.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f49880e);
        sb.append(",factories:");
        sb.append(this.f49876a);
        sb.append(",instanceCreators:");
        sb.append(this.f49895u);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo34889b(Object obj) {
        if (obj == null) {
            return mo34886a((C18082l) C18084n.f50144a);
        }
        return mo34890b(obj, obj.getClass());
    }

    /* renamed from: a */
    static void m44077a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final C17958a mo34873a(Reader reader) {
        C17958a aVar = new C17958a(reader);
        aVar.f49847a = this.f49885j;
        return aVar;
    }

    /* renamed from: a */
    public final C17961c mo34874a(Writer writer) throws IOException {
        if (this.f49882g) {
            writer.write(")]}'\n");
        }
        C17961c cVar = new C17961c(writer);
        if (this.f49884i) {
            cVar.mo34866c("  ");
        }
        cVar.f49867c = this.f49880e;
        return cVar;
    }

    /* renamed from: a */
    private <T> T m44076a(Reader reader, Type type) throws C18083m, C18091u {
        C17958a a = mo34873a(reader);
        T a2 = mo34880a(a, type);
        m44080a((Object) a2, a);
        return a2;
    }

    /* renamed from: b */
    public final String mo34890b(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m44081a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    private void m44079a(C18082l lVar, Appendable appendable) throws C18083m {
        try {
            m44078a(lVar, mo34874a(C18072k.m44266a(appendable)));
        } catch (IOException e) {
            throw new C18083m((Throwable) e);
        }
    }

    /* renamed from: a */
    private void m44078a(C18082l lVar, C17961c cVar) throws C18083m {
        boolean z = cVar.f49865a;
        cVar.f49865a = true;
        boolean z2 = cVar.f49866b;
        cVar.f49866b = this.f49883h;
        boolean z3 = cVar.f49867c;
        cVar.f49867c = this.f49880e;
        try {
            C18072k.m44267a(lVar, cVar);
            cVar.f49865a = z;
            cVar.f49866b = z2;
            cVar.f49867c = z3;
        } catch (IOException e) {
            throw new C18083m((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
            sb.append(e2.getMessage());
            throw new AssertionError(sb.toString(), e2);
        } catch (Throwable th) {
            cVar.f49865a = z;
            cVar.f49866b = z2;
            cVar.f49867c = z3;
            throw th;
        }
    }

    /* renamed from: a */
    private static void m44080a(Object obj, C17958a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo34843f() != C17960b.END_DOCUMENT) {
                    throw new C18083m("JSON document was not fully consumed.");
                }
            } catch (C17962d e) {
                throw new C18091u((Throwable) e);
            } catch (IOException e2) {
                throw new C18083m((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    private void m44081a(Object obj, Type type, Appendable appendable) throws C18083m {
        try {
            mo34888a(obj, type, mo34874a(C18072k.m44266a(appendable)));
        } catch (IOException e) {
            throw new C18083m((Throwable) e);
        }
    }

    C17971f(Excluder excluder, C17970e eVar, Map<Type, C17979h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C18092v vVar, String str, int i, int i2, List<C18097x> list, List<C18097x> list2, List<C18097x> list3) {
        final C18095w wVar;
        C18095w wVar2;
        C18095w wVar3;
        Excluder excluder2 = excluder;
        C17970e eVar2 = eVar;
        Map<Type, C17979h<?>> map2 = map;
        boolean z8 = z2;
        boolean z9 = z7;
        C18092v vVar2 = vVar;
        this.f49893s = new ThreadLocal<>();
        this.f49894t = new ConcurrentHashMap();
        this.f49877b = excluder2;
        this.f49878c = eVar2;
        this.f49879d = map2;
        this.f49895u = new C18043c(map);
        this.f49880e = z;
        this.f49881f = z8;
        this.f49882g = z3;
        this.f49883h = z4;
        this.f49884i = z5;
        this.f49885j = z6;
        this.f49886k = z9;
        this.f49890o = vVar2;
        this.f49887l = str;
        this.f49888m = i;
        this.f49889n = i2;
        this.f49891p = list;
        this.f49892q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C18012j.f50050Y);
        arrayList.add(C18006e.f50016a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(C18012j.f50029D);
        arrayList.add(C18012j.f50064m);
        arrayList.add(C18012j.f50058g);
        arrayList.add(C18012j.f50060i);
        arrayList.add(C18012j.f50062k);
        if (vVar2 == C18092v.DEFAULT) {
            wVar = C18012j.f50071t;
        } else {
            wVar = new C18095w<Number>() {
                public final /* synthetic */ Object read(C17958a aVar) throws IOException {
                    if (aVar.mo34843f() != C17960b.NULL) {
                        return Long.valueOf(aVar.mo34849m());
                    }
                    aVar.mo34847k();
                    return null;
                }

                public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        cVar.mo34870f();
                    } else {
                        cVar.mo34864b(number.toString());
                    }
                }
            };
        }
        arrayList.add(C18012j.m44215a(Long.TYPE, Long.class, wVar));
        Class cls = Double.TYPE;
        Class<Double> cls2 = Double.class;
        if (z9) {
            wVar2 = C18012j.f50073v;
        } else {
            wVar2 = new C18095w<Number>() {
                public final /* synthetic */ Object read(C17958a aVar) throws IOException {
                    if (aVar.mo34843f() != C17960b.NULL) {
                        return Double.valueOf(aVar.mo34848l());
                    }
                    aVar.mo34847k();
                    return null;
                }

                public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        cVar.mo34870f();
                        return;
                    }
                    C17971f.m44077a(number.doubleValue());
                    cVar.mo34860a(number);
                }
            };
        }
        arrayList.add(C18012j.m44215a(cls, cls2, wVar2));
        Class cls3 = Float.TYPE;
        Class<Float> cls4 = Float.class;
        if (z9) {
            wVar3 = C18012j.f50072u;
        } else {
            wVar3 = new C18095w<Number>() {
                public final /* synthetic */ Object read(C17958a aVar) throws IOException {
                    if (aVar.mo34843f() != C17960b.NULL) {
                        return Float.valueOf((float) aVar.mo34848l());
                    }
                    aVar.mo34847k();
                    return null;
                }

                public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        cVar.mo34870f();
                        return;
                    }
                    C17971f.m44077a((double) number.floatValue());
                    cVar.mo34860a(number);
                }
            };
        }
        arrayList.add(C18012j.m44215a(cls3, cls4, wVar3));
        arrayList.add(C18012j.f50075x);
        arrayList.add(C18012j.f50066o);
        arrayList.add(C18012j.f50068q);
        arrayList.add(C18012j.m44214a(AtomicLong.class, new C18095w<AtomicLong>() {
            public final /* synthetic */ Object read(C17958a aVar) throws IOException {
                return new AtomicLong(((Number) wVar.read(aVar)).longValue());
            }

            public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
                wVar.write(cVar, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.nullSafe()));
        arrayList.add(C18012j.m44214a(AtomicLongArray.class, new C18095w<AtomicLongArray>() {
            public final /* synthetic */ Object read(C17958a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.mo34837a();
                while (aVar.mo34842e()) {
                    arrayList.add(Long.valueOf(((Number) wVar.read(aVar)).longValue()));
                }
                aVar.mo34838b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.mo34863b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    wVar.write(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.mo34865c();
            }
        }.nullSafe()));
        arrayList.add(C18012j.f50070s);
        arrayList.add(C18012j.f50077z);
        arrayList.add(C18012j.f50031F);
        arrayList.add(C18012j.f50033H);
        arrayList.add(C18012j.m44214a(BigDecimal.class, C18012j.f50027B));
        arrayList.add(C18012j.m44214a(BigInteger.class, C18012j.f50028C));
        arrayList.add(C18012j.f50035J);
        arrayList.add(C18012j.f50037L);
        arrayList.add(C18012j.f50041P);
        arrayList.add(C18012j.f50043R);
        arrayList.add(C18012j.f50048W);
        arrayList.add(C18012j.f50039N);
        arrayList.add(C18012j.f50055d);
        arrayList.add(C18001b.f50003a);
        arrayList.add(C18012j.f50046U);
        arrayList.add(C18010h.f50021a);
        arrayList.add(C18009g.f50019a);
        arrayList.add(C18012j.f50044S);
        arrayList.add(C17999a.f49999a);
        arrayList.add(C18012j.f50053b);
        arrayList.add(new CollectionTypeAdapterFactory(this.f49895u));
        arrayList.add(new MapTypeAdapterFactory(this.f49895u, z2));
        this.f49896v = new JsonAdapterAnnotationTypeAdapterFactory(this.f49895u);
        arrayList.add(this.f49896v);
        arrayList.add(C18012j.f50051Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.f49895u, eVar, excluder, this.f49896v));
        this.f49876a = Collections.unmodifiableList(arrayList);
    }
}
