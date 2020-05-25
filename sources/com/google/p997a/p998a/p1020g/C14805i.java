package com.google.p997a.p998a.p1020g;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.a.a.g.i */
public final class C14805i {

    /* renamed from: d */
    private static final Map<Field, C14805i> f38354d = new WeakHashMap();

    /* renamed from: a */
    public final boolean f38355a;

    /* renamed from: b */
    public final Field f38356b;

    /* renamed from: c */
    public final String f38357c;

    /* renamed from: b */
    public final <T extends Enum<T>> T mo27147b() {
        return Enum.valueOf(this.f38356b.getDeclaringClass(), this.f38356b.getName());
    }

    /* renamed from: a */
    public final boolean mo27146a() {
        return Modifier.isFinal(this.f38356b.getModifiers());
    }

    /* renamed from: a */
    public final Object mo27144a(Object obj) {
        return m30276a(this.f38356b, obj);
    }

    /* renamed from: a */
    public static C14805i m30274a(Enum<?> enumR) {
        boolean z;
        try {
            C14805i a = m30275a(enumR.getClass().getField(enumR.name()));
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            C14814o.m30291a(z, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return a;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p997a.p998a.p1020g.C14805i m30275a(java.lang.reflect.Field r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<java.lang.reflect.Field, com.google.a.a.g.i> r1 = f38354d
            monitor-enter(r1)
            java.util.Map<java.lang.reflect.Field, com.google.a.a.g.i> r2 = f38354d     // Catch:{ all -> 0x006b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x006b }
            com.google.a.a.g.i r2 = (com.google.p997a.p998a.p1020g.C14805i) r2     // Catch:{ all -> 0x006b }
            boolean r3 = r5.isEnumConstant()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0069
            if (r3 != 0) goto L_0x0021
            int r4 = r5.getModifiers()     // Catch:{ all -> 0x006b }
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0069
        L_0x0021:
            if (r3 == 0) goto L_0x003f
            java.lang.Class<com.google.a.a.g.r> r2 = com.google.p997a.p998a.p1020g.C14819r.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.a.a.g.r r2 = (com.google.p997a.p998a.p1020g.C14819r) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = r2.mo27164a()     // Catch:{ all -> 0x006b }
            goto L_0x0053
        L_0x0032:
            java.lang.Class<com.google.a.a.g.l> r2 = com.google.p997a.p998a.p1020g.C14811l.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.a.a.g.l r2 = (com.google.p997a.p998a.p1020g.C14811l) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x003f:
            java.lang.Class<com.google.a.a.g.k> r2 = com.google.p997a.p998a.p1020g.C14810k.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)     // Catch:{ all -> 0x006b }
            com.google.a.a.g.k r2 = (com.google.p997a.p998a.p1020g.C14810k) r2     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x004b
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r0
        L_0x004b:
            java.lang.String r0 = r2.mo27159a()     // Catch:{ all -> 0x006b }
            r2 = 1
            r5.setAccessible(r2)     // Catch:{ all -> 0x006b }
        L_0x0053:
            java.lang.String r2 = "##default"
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x006b }
        L_0x005f:
            com.google.a.a.g.i r2 = new com.google.a.a.g.i     // Catch:{ all -> 0x006b }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.reflect.Field, com.google.a.a.g.i> r0 = f38354d     // Catch:{ all -> 0x006b }
            r0.put(r5, r2)     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r2
        L_0x006b:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p997a.p998a.p1020g.C14805i.m30275a(java.lang.reflect.Field):com.google.a.a.g.i");
    }

    /* renamed from: a */
    private static Object m30276a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C14805i(Field field, String str) {
        String str2;
        this.f38356b = field;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.intern();
        }
        this.f38357c = str2;
        this.f38355a = C14799f.m30267a((Type) this.f38356b.getType());
    }

    /* renamed from: a */
    public final void mo27145a(Object obj, Object obj2) {
        m30277a(this.f38356b, obj, obj2);
    }

    /* renamed from: a */
    public static void m30277a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a = m30276a(field, obj);
            if (obj2 != null ? !obj2.equals(a) : a != null) {
                String valueOf = String.valueOf(String.valueOf(a));
                String valueOf2 = String.valueOf(String.valueOf(obj2));
                String valueOf3 = String.valueOf(String.valueOf(field.getName()));
                String valueOf4 = String.valueOf(String.valueOf(obj.getClass().getName()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 48 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("expected final value <");
                sb.append(valueOf);
                sb.append("> but was <");
                sb.append(valueOf2);
                sb.append("> on ");
                sb.append(valueOf3);
                sb.append(" field in ");
                sb.append(valueOf4);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
