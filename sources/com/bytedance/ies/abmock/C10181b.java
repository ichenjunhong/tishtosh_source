package com.bytedance.ies.abmock;

import android.app.Application;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.p620a.C10180c;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.abmock.b */
public final class C10181b {

    /* renamed from: e */
    private static C10181b f27511e;

    /* renamed from: a */
    public Application f27512a;

    /* renamed from: b */
    public C10189j f27513b;

    /* renamed from: c */
    public C10183d f27514c;

    /* renamed from: d */
    public C10196q f27515d;

    /* renamed from: f */
    private Map<String, Object> f27516f = new ConcurrentHashMap();

    /* renamed from: a */
    private void m20520a(String str, boolean z, Object obj) {
        if (z && obj != null) {
            this.f27516f.put(str, obj);
        }
    }

    /* renamed from: a */
    private boolean m20522a(Class cls) {
        try {
            return ((Boolean) m20512a(cls, Boolean.TYPE)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo18172a(Class cls, boolean z, String str, int i, boolean z2) {
        Object obj;
        try {
            Object a = m20516a(cls, z, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
            if (this.f27514c.mo18184a()) {
                obj = Boolean.valueOf(this.f27514c.mo18185a(str, z2));
            } else {
                obj = m20518a(str, (T) Boolean.valueOf(z2));
            }
            m20519a(cls, z, obj);
            return ((Boolean) obj).booleanValue();
        } catch (Throwable unused) {
            return m20522a(cls);
        }
    }

    /* renamed from: a */
    public final int mo18168a(Class cls, boolean z, String str, int i, int i2) {
        Object obj;
        try {
            Object a = m20516a(cls, z, str);
            if (a != null) {
                return ((Integer) a).intValue();
            }
            if (this.f27514c.mo18184a()) {
                obj = Integer.valueOf(this.f27514c.mo18178a(str, i2));
            } else {
                obj = m20518a(str, (T) Integer.valueOf(i2));
            }
            m20519a(cls, z, obj);
            return ((Integer) obj).intValue();
        } catch (Throwable unused) {
            return m20523b(cls);
        }
    }

    /* renamed from: a */
    public final String mo18171a(Class cls, boolean z, String str, int i, String str2) {
        Object obj;
        try {
            Object a = m20516a(cls, z, str);
            if (a != null) {
                return (String) a;
            }
            if (this.f27514c.mo18184a()) {
                obj = this.f27514c.mo18182a(str, str2);
            } else {
                obj = m20518a(str, (T) str2);
            }
            m20519a(cls, z, obj);
            return (String) obj;
        } catch (Throwable unused) {
            return m20525c(cls);
        }
    }

    /* renamed from: a */
    public final long mo18169a(Class cls, boolean z, String str, int i, long j) {
        Object obj;
        try {
            Object a = m20516a(cls, true, str);
            if (a != null) {
                return ((Long) a).longValue();
            }
            if (this.f27514c.mo18184a()) {
                obj = Long.valueOf(this.f27514c.mo18179a(str, j));
            } else {
                obj = m20518a(str, (T) Long.valueOf(j));
            }
            m20519a(cls, true, obj);
            return ((Long) obj).longValue();
        } catch (Throwable unused) {
            return m20526d(cls);
        }
    }

    /* renamed from: a */
    public final int mo18167a(Class cls, boolean z, String str, int i) {
        try {
            Object valueOf = Integer.valueOf(i);
            Object a = m20516a(cls, true, str);
            if (a == null) {
                m20519a(cls, true, valueOf);
                a = valueOf;
            }
            return ((Integer) a).intValue();
        } catch (Throwable unused) {
            return m20523b(cls);
        }
    }

    /* renamed from: a */
    public final double mo18166a(Class cls, boolean z, String str, int i, double d) {
        Object obj;
        try {
            Object a = m20516a(cls, true, str);
            if (a != null) {
                return ((Double) a).doubleValue();
            }
            if (this.f27514c.mo18184a()) {
                obj = Double.valueOf(this.f27514c.mo18177a(str, d));
            } else {
                obj = m20518a(str, (T) Double.valueOf(d));
            }
            m20519a(cls, true, obj);
            return ((Double) obj).doubleValue();
        } catch (Throwable unused) {
            return m20527e(cls);
        }
    }

    /* renamed from: a */
    public final <T> T mo18170a(Class cls, boolean z, String str, int i, Class cls2) throws Throwable {
        T t;
        T a = m20516a(cls, z, str);
        if (a != null) {
            return a;
        }
        if (this.f27514c.mo18184a()) {
            t = this.f27514c.mo18181a(str, cls2);
        } else {
            t = m20518a(str, (T) null);
        }
        m20519a(cls, z, (Object) t);
        return t;
    }

    /* renamed from: a */
    public static boolean m20521a(C18085o oVar) {
        return C10191l.m20593a(oVar);
    }

    /* renamed from: b */
    public final boolean mo18174b() {
        return this.f27513b.mo18199c();
    }

    /* renamed from: c */
    public final IESSettingsProxy mo18175c() {
        return this.f27513b.mo18197a();
    }

    /* renamed from: a */
    public static synchronized C10181b m20511a() {
        C10181b bVar;
        synchronized (C10181b.class) {
            if (f27511e == null) {
                f27511e = new C10181b();
            }
            bVar = f27511e;
        }
        return bVar;
    }

    /* renamed from: b */
    private int m20523b(Class cls) {
        try {
            return ((Integer) m20512a(cls, Integer.TYPE)).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private String m20525c(Class cls) {
        try {
            return (String) m20512a(cls, String.class);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    private long m20526d(Class cls) {
        try {
            return ((Long) m20512a(cls, Long.TYPE)).longValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private double m20527e(Class cls) {
        try {
            return ((Double) m20512a(cls, Double.TYPE)).doubleValue();
        } catch (Throwable unused) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
    }

    /* renamed from: b */
    private Object m20524b(String str) throws IllegalAccessException, NoSuchFieldException {
        return ABModel.class.getDeclaredField(str).get(this.f27513b.mo18198b());
    }

    /* renamed from: a */
    private static Object m20517a(String str) {
        try {
            return Class.forName("com.bytedance.ies.abmock.ClientExpManager").getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> T m20518a(String str, T t) {
        try {
            return m20524b(str);
        } catch (Throwable unused) {
            return t;
        }
    }

    /* renamed from: a */
    private <T> T m20512a(Class cls, Class<T> cls2) throws Throwable {
        String str;
        boolean z;
        C10178a aVar = (C10178a) cls.getAnnotation(C10178a.class);
        if (aVar != null) {
            str = aVar.mo18163a();
        } else {
            str = null;
        }
        if (str != null) {
            if (cls.getAnnotation(C10180c.class) == null) {
                z = true;
            } else {
                z = false;
            }
            T a = m20515a(cls, str, z, (Class) cls2);
            if (a != null) {
                return a;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    C10179b bVar = (C10179b) field.getAnnotation(C10179b.class);
                    if (bVar != null && bVar.mo18165a()) {
                        try {
                            field.setAccessible(true);
                            return field.get(null);
                        } catch (IllegalAccessException unused) {
                        }
                    }
                }
            }
        }
        throw new Throwable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r0.equals("int") != false) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m20513a(java.lang.Class r8, java.lang.String r9) throws java.lang.IllegalAccessException {
        /*
            r7 = this;
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0009:
            if (r3 >= r0) goto L_0x0024
            r5 = r8[r3]
            java.lang.Class<com.bytedance.ies.abmock.a.b> r6 = com.bytedance.ies.abmock.p620a.C10179b.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            com.bytedance.ies.abmock.a.b r6 = (com.bytedance.ies.abmock.p620a.C10179b) r6
            if (r6 == 0) goto L_0x0021
            boolean r4 = r6.mo18165a()
            if (r4 != 0) goto L_0x001f
            r4 = r5
            goto L_0x0021
        L_0x001f:
            r4 = r5
            goto L_0x0024
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0024:
            if (r4 == 0) goto L_0x00ed
            r8 = 1
            r4.setAccessible(r8)
            java.lang.Class r0 = r4.getType()
            java.lang.String r0 = r0.getName()
            r3 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case -1325958191: goto L_0x006c;
                case 104431: goto L_0x0063;
                case 3327612: goto L_0x0059;
                case 64711720: goto L_0x004f;
                case 392722245: goto L_0x0045;
                case 1195259493: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0076
        L_0x003b:
            java.lang.String r8 = "java.lang.String"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 4
            goto L_0x0077
        L_0x0045:
            java.lang.String r8 = "[Ljava.lang.String;"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 5
            goto L_0x0077
        L_0x004f:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x0059:
            java.lang.String r8 = "long"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 2
            goto L_0x0077
        L_0x0063:
            java.lang.String r8 = "int"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            goto L_0x0077
        L_0x006c:
            java.lang.String r8 = "double"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 3
            goto L_0x0077
        L_0x0076:
            r1 = -1
        L_0x0077:
            switch(r1) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ae;
                case 3: goto L_0x0099;
                case 4: goto L_0x008c;
                case 5: goto L_0x0085;
                default: goto L_0x007a;
            }
        L_0x007a:
            com.bytedance.ies.abmock.d r8 = r7.f27514c
            java.lang.Class r0 = r4.getType()
            java.lang.Object r8 = r8.mo18181a(r9, r0)
            return r8
        L_0x0085:
            com.bytedance.ies.abmock.d r8 = r7.f27514c
            java.lang.String[] r8 = r8.mo18191b(r9)
            return r8
        L_0x008c:
            com.bytedance.ies.abmock.d r8 = r7.f27514c
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r8 = r8.mo18182a(r9, r0)
            return r8
        L_0x0099:
            com.bytedance.ies.abmock.d r8 = r7.f27514c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            double r8 = r8.mo18177a(r9, r0)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            return r8
        L_0x00ae:
            com.bytedance.ies.abmock.d r8 = r7.f27514c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r8 = r8.mo18179a(r9, r0)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            return r8
        L_0x00c3:
            com.bytedance.ies.abmock.d r8 = r7.f27514c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r8 = r8.mo18185a(r9, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L_0x00d8:
            com.bytedance.ies.abmock.d r8 = r7.f27514c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r8 = r8.mo18178a(r9, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L_0x00ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.C10181b.m20513a(java.lang.Class, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    private void m20519a(Class cls, boolean z, Object obj) {
        m20520a(cls.getName(), z, obj);
    }

    /* renamed from: a */
    private Object m20516a(Class cls, boolean z, String str) {
        if (mo18174b() && C10182c.f27517a.mo18196b()) {
            Object a = C10182c.f27517a.mo18193a(str);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" 正在使用 mock 的数据!!");
                C10177a.m20507a(sb.toString());
                return a;
            }
        }
        if (z) {
            Object obj = this.f27516f.get(cls.getName());
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: a */
    private <T> T m20514a(Class cls, String str, String str2, boolean z) {
        Field field;
        try {
            C18082l a = this.f27514c.mo18180a(str2);
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (((C10179b) field.getAnnotation(C10179b.class)) != null) {
                    break;
                }
                i++;
            }
            T a2 = C10188i.m20580a().mo34881a(a, field.getType());
            m20520a(str, z, (Object) a2);
            return a2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final <T> T mo18173b(Class cls, boolean z, String str, int i) throws Throwable {
        Object obj;
        T a = m20516a(cls, true, str);
        if (a != null) {
            return a;
        }
        if (this.f27514c.mo18184a()) {
            obj = this.f27514c.mo18191b(str);
        } else {
            obj = m20518a(str, (T) null);
        }
        m20519a(cls, true, obj);
        return obj;
    }

    /* renamed from: a */
    private Object m20515a(Class cls, String str, boolean z, Class cls2) {
        boolean z2;
        Object obj;
        String name = cls.getName();
        Object a = m20516a(cls, z, str);
        if (a != null) {
            return a;
        }
        C10178a aVar = (C10178a) cls.getAnnotation(C10178a.class);
        boolean z3 = false;
        if (aVar != null) {
            z2 = aVar.mo18164b();
        } else {
            z2 = false;
        }
        if (z2) {
            if (cls2 == null || cls2 == Boolean.TYPE || cls2 == Integer.TYPE || cls2 == String.class) {
                z3 = true;
            }
            if (z3) {
                Object a2 = m20517a(str);
                if (a2 != null) {
                    m20520a(name, z, a2);
                }
                return a2;
            }
            throw new UnsupportedOperationException("You can only get Boolean/Int/String value from a client experiment.");
        }
        try {
            if (this.f27514c.mo18184a()) {
                obj = m20513a(cls, str);
            } else {
                obj = m20524b(str);
            }
            m20520a(name, z, obj);
            return obj;
        } catch (Exception unused) {
            return m20514a(cls, name, str, z);
        }
    }
}
