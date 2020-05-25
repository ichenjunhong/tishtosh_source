package com.google.p997a.p998a.p1013e;

import com.google.p997a.p998a.p1020g.C14795d;
import com.google.p997a.p998a.p1020g.C14799f;
import com.google.p997a.p998a.p1020g.C14804h;
import com.google.p997a.p998a.p1020g.C14805i;
import com.google.p997a.p998a.p1020g.C14806j;
import com.google.p997a.p998a.p1020g.C14814o;
import com.google.p997a.p998a.p1020g.C14816q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.a.a.e.c */
public abstract class C14775c {
    /* renamed from: a */
    public abstract void mo27067a() throws IOException;

    /* renamed from: a */
    public abstract void mo27068a(double d) throws IOException;

    /* renamed from: a */
    public abstract void mo27069a(float f) throws IOException;

    /* renamed from: a */
    public abstract void mo27070a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo27071a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo27072a(String str) throws IOException;

    /* renamed from: a */
    public abstract void mo27073a(BigDecimal bigDecimal) throws IOException;

    /* renamed from: a */
    public abstract void mo27074a(BigInteger bigInteger) throws IOException;

    /* renamed from: a */
    public abstract void mo27075a(boolean z) throws IOException;

    /* renamed from: b */
    public abstract void mo27076b() throws IOException;

    /* renamed from: b */
    public abstract void mo27077b(String str) throws IOException;

    /* renamed from: c */
    public abstract void mo27078c() throws IOException;

    /* renamed from: d */
    public abstract void mo27079d() throws IOException;

    /* renamed from: e */
    public abstract void mo27080e() throws IOException;

    /* renamed from: f */
    public abstract void mo27081f() throws IOException;

    /* renamed from: g */
    public void mo27082g() throws IOException {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27083a(boolean z, Object obj) throws IOException {
        boolean z2;
        C14795d dVar;
        boolean z3;
        if (obj != null) {
            Class cls = obj.getClass();
            if (C14799f.m30266a(obj)) {
                mo27081f();
            } else if (obj instanceof String) {
                mo27077b((String) obj);
            } else {
                boolean z4 = true;
                if (obj instanceof Number) {
                    if (z) {
                        mo27077b(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        mo27073a((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        mo27074a((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        mo27071a(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z4 = false;
                        }
                        C14814o.m30289a(z4);
                        mo27069a(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        mo27070a(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z4 = false;
                        }
                        C14814o.m30289a(z4);
                        mo27068a(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    mo27075a(((Boolean) obj).booleanValue());
                } else if (obj instanceof C14804h) {
                    mo27077b(((C14804h) obj).toStringRfc3339());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    mo27076b();
                    for (Object a : C14816q.m30296a(obj)) {
                        mo27083a(z, a);
                    }
                    mo27078c();
                } else {
                    if (cls.isEnum()) {
                        String str = C14805i.m30274a((Enum) obj).f38357c;
                        if (str == null) {
                            mo27081f();
                        } else {
                            mo27077b(str);
                        }
                    } else {
                        mo27079d();
                        if (!(obj instanceof Map) || (obj instanceof C14806j)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            dVar = null;
                        } else {
                            dVar = C14795d.m30256a(cls);
                        }
                        for (Entry entry : C14799f.m30268b(obj).entrySet()) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String str2 = (String) entry.getKey();
                                if (z2) {
                                    z3 = z;
                                } else {
                                    Field b = dVar.mo27116b(str2);
                                    if (b == null || b.getAnnotation(C14778e.class) == null) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                }
                                mo27072a(str2);
                                mo27083a(z3, value);
                            }
                        }
                        mo27080e();
                    }
                }
            }
        }
    }
}
