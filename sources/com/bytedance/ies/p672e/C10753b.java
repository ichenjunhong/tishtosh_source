package com.bytedance.ies.p672e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.LruCache;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Set;

/* renamed from: com.bytedance.ies.e.b */
public final class C10753b {

    /* renamed from: b */
    private static LruCache<String, C10753b> f28913b = null;

    /* renamed from: d */
    private static String f28914d = "default_app_sp";

    /* renamed from: e */
    private static int f28915e = 3;

    /* renamed from: a */
    public final SharedPreferences f28916a;

    /* renamed from: c */
    private Editor f28917c;

    /* renamed from: com.bytedance.ies.e.b$a */
    enum C10755a {
        STRING,
        INTEGER,
        BOOLEAN,
        FLOAT,
        LONG,
        STRING_SET,
        ALL
    }

    /* renamed from: b */
    private void m21796b() {
        if (this.f28917c == null) {
            this.f28917c = this.f28916a.edit();
        }
    }

    /* renamed from: a */
    public final void mo19443a() {
        if (this.f28917c != null) {
            C9402b.m18594a(this.f28917c);
        }
    }

    /* renamed from: a */
    public static C10753b m21793a(Context context) {
        return m21794a(context, f28914d);
    }

    /* renamed from: b */
    public final void mo19445b(String str, Object obj) {
        mo19441a(str, obj);
        mo19443a();
    }

    private C10753b(Context context, String str) {
        this.f28916a = C35807d.m80935a(context, str, 0);
    }

    /* renamed from: a */
    public final String mo19442a(String str, String str2) {
        return (String) m21795a(str, C10755a.STRING, str2);
    }

    /* renamed from: a */
    public final int mo19439a(String str, int i) {
        return ((Integer) m21795a(str, C10755a.INTEGER, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static C10753b m21794a(Context context, String str) {
        if (context != null) {
            if (f28913b == null) {
                f28913b = new LruCache<>(f28915e);
            }
            C10753b bVar = (C10753b) f28913b.get(str);
            if (bVar != null) {
                return bVar;
            }
            C10753b bVar2 = new C10753b(context, str);
            f28913b.put(str, bVar2);
            return bVar2;
        }
        throw new NullPointerException("null context!!");
    }

    /* renamed from: a */
    public final long mo19440a(String str, long j) {
        return ((Long) m21795a(str, C10755a.LONG, Long.valueOf(0))).longValue();
    }

    /* renamed from: a */
    public final C10753b mo19441a(String str, Object obj) {
        m21796b();
        if (obj instanceof String) {
            this.f28917c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f28917c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f28917c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f28917c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f28917c.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.f28917c.putStringSet(str, (Set) obj);
        } else {
            this.f28917c.putString(str, String.valueOf(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final boolean mo19444a(String str, boolean z) {
        return ((Boolean) m21795a(str, C10755a.BOOLEAN, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: a */
    private <T> T m21795a(String str, C10755a aVar, Object obj) {
        switch (aVar) {
            case STRING:
                return this.f28916a.getString(str, (String) obj);
            case INTEGER:
                return Integer.valueOf(this.f28916a.getInt(str, ((Integer) obj).intValue()));
            case BOOLEAN:
                return Boolean.valueOf(this.f28916a.getBoolean(str, ((Boolean) obj).booleanValue()));
            case FLOAT:
                return Float.valueOf(this.f28916a.getFloat(str, ((Float) obj).floatValue()));
            case LONG:
                return Long.valueOf(this.f28916a.getLong(str, ((Long) obj).longValue()));
            case STRING_SET:
                return this.f28916a.getStringSet(str, (Set) obj);
            case ALL:
                return this.f28916a.getAll();
            default:
                return obj;
        }
    }
}
