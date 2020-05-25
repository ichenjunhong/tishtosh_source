package com.p683ss.android.ugc.aweme.property;

import android.content.SharedPreferences;
import android.support.p030v4.p038f.C0777a;
import com.google.p1057b.p1058a.C17421k;

/* renamed from: com.ss.android.ugc.aweme.property.aa */
public final class C40761aa {

    /* renamed from: a */
    private SharedPreferences f103854a;

    /* renamed from: b */
    private C0777a<String, Object> f103855b = new C0777a<>();

    /* renamed from: com.ss.android.ugc.aweme.property.aa$a */
    public interface C40762a {
        Object defValue();

        String key();

        boolean supportPersist();

        C40763b type();
    }

    /* renamed from: com.ss.android.ugc.aweme.property.aa$b */
    public enum C40763b {
        Boolean,
        Integer,
        Long,
        Float,
        String
    }

    public C40761aa(SharedPreferences sharedPreferences) {
        this.f103854a = sharedPreferences;
    }

    /* renamed from: f */
    public final synchronized boolean mo83072f(C40762a aVar) {
        return this.f103854a.contains(aVar.key());
    }

    /* renamed from: g */
    public final synchronized void mo83073g(C40762a aVar) {
        this.f103855b.remove(aVar.key());
        if (aVar.supportPersist()) {
            this.f103854a.edit().remove(aVar.key()).apply();
        }
    }

    /* renamed from: b */
    public final synchronized int mo83068b(C40762a aVar) {
        boolean z;
        Integer num;
        if (aVar.type() == C40763b.Integer) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        num = (Integer) this.f103855b.get(aVar.key());
        if (num == null) {
            if (aVar.supportPersist()) {
                num = Integer.valueOf(this.f103854a.getInt(aVar.key(), ((Integer) aVar.defValue()).intValue()));
            } else {
                num = (Integer) aVar.defValue();
            }
            this.f103855b.put(aVar.key(), num);
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final synchronized long mo83069c(C40762a aVar) {
        boolean z;
        Long l;
        if (aVar.type() == C40763b.Long) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        l = (Long) this.f103855b.get(aVar.key());
        if (l == null) {
            if (aVar.supportPersist()) {
                l = Long.valueOf(this.f103854a.getLong(aVar.key(), ((Long) aVar.defValue()).longValue()));
            } else {
                l = (Long) aVar.defValue();
            }
            this.f103855b.put(aVar.key(), l);
        }
        return l.longValue();
    }

    /* renamed from: d */
    public final synchronized float mo83070d(C40762a aVar) {
        boolean z;
        Float f;
        if (aVar.type() == C40763b.Float) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        f = (Float) this.f103855b.get(aVar.key());
        if (f == null) {
            if (aVar.supportPersist()) {
                f = Float.valueOf(this.f103854a.getFloat(aVar.key(), ((Float) aVar.defValue()).floatValue()));
            } else {
                f = (Float) aVar.defValue();
            }
            this.f103855b.put(aVar.key(), f);
        }
        return f.floatValue();
    }

    /* renamed from: e */
    public final synchronized String mo83071e(C40762a aVar) {
        boolean z;
        String str;
        if (aVar.type() == C40763b.String) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        str = (String) this.f103855b.get(aVar.key());
        if (str == null) {
            if (aVar.supportPersist()) {
                str = this.f103854a.getString(aVar.key(), (String) aVar.defValue());
            } else {
                str = (String) aVar.defValue();
            }
            this.f103855b.put(aVar.key(), str);
        }
        return str;
    }

    /* renamed from: a */
    public final synchronized boolean mo83067a(C40762a aVar) {
        boolean z;
        Boolean bool;
        if (aVar.type() == C40763b.Boolean) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        bool = (Boolean) this.f103855b.get(aVar.key());
        if (bool == null) {
            if (aVar.supportPersist()) {
                bool = Boolean.valueOf(this.f103854a.getBoolean(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
            } else {
                bool = (Boolean) aVar.defValue();
            }
            this.f103855b.put(aVar.key(), bool);
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public final synchronized void mo83062a(C40762a aVar, float f) {
        boolean z;
        if (aVar.type() == C40763b.Float) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        this.f103855b.put(aVar.key(), Float.valueOf(f));
        if (aVar.supportPersist()) {
            this.f103854a.edit().putFloat(aVar.key(), f).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo83063a(C40762a aVar, int i) {
        boolean z;
        if (aVar.type() == C40763b.Integer) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        this.f103855b.put(aVar.key(), Integer.valueOf(i));
        if (aVar.supportPersist()) {
            this.f103854a.edit().putInt(aVar.key(), i).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo83064a(C40762a aVar, long j) {
        boolean z;
        if (aVar.type() == C40763b.Long) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        this.f103855b.put(aVar.key(), Long.valueOf(j));
        if (aVar.supportPersist()) {
            this.f103854a.edit().putLong(aVar.key(), j).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo83065a(C40762a aVar, String str) {
        boolean z;
        if (aVar.type() == C40763b.String) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42659a(z);
        this.f103855b.put(aVar.key(), str);
        if (aVar.supportPersist()) {
            this.f103854a.edit().putString(aVar.key(), str).apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo83066a(C40762a aVar, boolean z) {
        boolean z2;
        Boolean bool;
        if (aVar.type() == C40763b.Boolean) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17421k.m42659a(z2);
        C0777a<String, Object> aVar2 = this.f103855b;
        String key = aVar.key();
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        aVar2.put(key, bool);
        if (aVar.supportPersist()) {
            this.f103854a.edit().putBoolean(aVar.key(), z).apply();
        }
    }
}
