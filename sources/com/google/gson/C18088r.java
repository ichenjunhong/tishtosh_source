package com.google.gson;

import com.google.gson.internal.C17982a;
import com.google.gson.internal.C18060f;
import java.math.BigInteger;

/* renamed from: com.google.gson.r */
public final class C18088r extends C18082l {

    /* renamed from: a */
    private static final Class<?>[] f50146a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f50147b;

    /* renamed from: a */
    public final boolean mo35030a() {
        return this.f50147b instanceof Boolean;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final Boolean mo35012p() {
        return (Boolean) this.f50147b;
    }

    /* renamed from: q */
    public final boolean mo35033q() {
        return this.f50147b instanceof Number;
    }

    /* renamed from: r */
    public final boolean mo35034r() {
        return this.f50147b instanceof String;
    }

    /* renamed from: d */
    public final double mo34906d() {
        if (mo35033q()) {
            return mo34904b().doubleValue();
        }
        return Double.parseDouble(mo34905c());
    }

    /* renamed from: e */
    public final float mo34907e() {
        if (mo35033q()) {
            return mo34904b().floatValue();
        }
        return Float.parseFloat(mo34905c());
    }

    /* renamed from: f */
    public final long mo34909f() {
        if (mo35033q()) {
            return mo34904b().longValue();
        }
        return Long.parseLong(mo34905c());
    }

    /* renamed from: g */
    public final int mo34910g() {
        if (mo35033q()) {
            return mo34904b().intValue();
        }
        return Integer.parseInt(mo34905c());
    }

    /* renamed from: h */
    public final boolean mo34911h() {
        if (mo35030a()) {
            return mo35012p().booleanValue();
        }
        return Boolean.parseBoolean(mo34905c());
    }

    /* renamed from: b */
    public final Number mo34904b() {
        if (this.f50147b instanceof String) {
            return new C18060f((String) this.f50147b);
        }
        return (Number) this.f50147b;
    }

    /* renamed from: c */
    public final String mo34905c() {
        if (mo35033q()) {
            return mo34904b().toString();
        }
        if (mo35030a()) {
            return mo35012p().toString();
        }
        return (String) this.f50147b;
    }

    public final int hashCode() {
        if (this.f50147b == null) {
            return 31;
        }
        if (m44308a(this)) {
            long longValue = mo34904b().longValue();
            return (int) ((longValue >>> 32) ^ longValue);
        } else if (!(this.f50147b instanceof Number)) {
            return this.f50147b.hashCode();
        } else {
            long doubleToLongBits = Double.doubleToLongBits(mo34904b().doubleValue());
            return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
        }
    }

    public C18088r(Boolean bool) {
        m44307a((Object) bool);
    }

    public C18088r(Number number) {
        m44307a((Object) number);
    }

    C18088r(Object obj) {
        m44307a(obj);
    }

    /* renamed from: b */
    private static boolean m44309b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class<?> isAssignableFrom : f50146a) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public C18088r(String str) {
        m44307a((Object) str);
    }

    /* renamed from: a */
    private void m44307a(Object obj) {
        boolean z;
        if (obj instanceof Character) {
            this.f50147b = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || m44309b(obj)) {
            z = true;
        } else {
            z = false;
        }
        C17982a.m44134a(z);
        this.f50147b = obj;
    }

    /* renamed from: a */
    private static boolean m44308a(C18088r rVar) {
        if (!(rVar.f50147b instanceof Number)) {
            return false;
        }
        Number number = (Number) rVar.f50147b;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18088r rVar = (C18088r) obj;
        if (this.f50147b == null) {
            if (rVar.f50147b == null) {
                return true;
            }
            return false;
        } else if (!m44308a(this) || !m44308a(rVar)) {
            if (!(this.f50147b instanceof Number) || !(rVar.f50147b instanceof Number)) {
                return this.f50147b.equals(rVar.f50147b);
            }
            double doubleValue = mo34904b().doubleValue();
            double doubleValue2 = rVar.mo34904b().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                return true;
            }
            return false;
        } else if (mo34904b().longValue() == rVar.mo34904b().longValue()) {
            return true;
        } else {
            return false;
        }
    }
}
