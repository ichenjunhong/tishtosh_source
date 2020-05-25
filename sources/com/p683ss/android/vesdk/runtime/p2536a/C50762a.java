package com.p683ss.android.vesdk.runtime.p2536a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.vesdk.runtime.a.a */
public final class C50762a {

    /* renamed from: a */
    private boolean f127504a;

    /* renamed from: b */
    private SharedPreferences f127505b;

    /* renamed from: c */
    private Editor f127506c;

    /* renamed from: com.ss.android.vesdk.runtime.a.a$a */
    enum C50764a {
        INSTANCE;
        

        /* renamed from: b */
        private C50762a f127509b;

        /* renamed from: a */
        public final C50762a mo99452a() {
            return this.f127509b;
        }
    }

    private C50762a() {
    }

    /* renamed from: a */
    public static C50762a m109863a() {
        return C50764a.INSTANCE.mo99452a();
    }

    /* renamed from: b */
    private synchronized void m109864b() {
        if (this.f127506c == null) {
            this.f127506c = this.f127505b.edit();
        }
    }

    /* renamed from: a */
    public final void mo99448a(Context context) {
        synchronized (this) {
            if (!this.f127504a) {
                this.f127505b = C35807d.m80935a(context, context.getPackageName(), 0);
                this.f127504a = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo99449a(String str, Object obj) {
        mo99450a(str, obj, false);
    }

    /* renamed from: b */
    public final <T> T mo99451b(String str, T t) {
        if (t instanceof String) {
            return this.f127505b.getString(str, (String) t);
        }
        if (t instanceof Integer) {
            return Integer.valueOf(this.f127505b.getInt(str, ((Integer) t).intValue()));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(this.f127505b.getBoolean(str, ((Boolean) t).booleanValue()));
        }
        if (t instanceof Float) {
            return Float.valueOf(this.f127505b.getFloat(str, ((Float) t).floatValue()));
        }
        if (t instanceof Long) {
            return Long.valueOf(this.f127505b.getLong(str, ((Long) t).longValue()));
        }
        return this.f127505b.getString(str, null);
    }

    /* renamed from: a */
    public final void mo99450a(String str, Object obj, boolean z) {
        m109864b();
        if (obj instanceof String) {
            this.f127506c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f127506c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f127506c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f127506c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f127506c.putLong(str, ((Long) obj).longValue());
        } else {
            this.f127506c.putString(str, obj.toString());
        }
        if (z) {
            this.f127506c.apply();
        } else {
            this.f127506c.commit();
        }
    }
}
