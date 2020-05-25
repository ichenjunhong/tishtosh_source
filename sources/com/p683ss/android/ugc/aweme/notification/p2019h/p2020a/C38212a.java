package com.p683ss.android.ugc.aweme.notification.p2019h.p2020a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.notification.h.a.a */
public final class C38212a<T> {

    /* renamed from: a */
    protected T f97278a;

    /* renamed from: b */
    public String f97279b;

    /* renamed from: b */
    private static SharedPreferences m85380b() {
        return C35807d.m80935a(C11010c.m22280a(), "aweme-app", 0);
    }

    /* renamed from: a */
    public final T mo78198a() {
        T t;
        SharedPreferences b = m85380b();
        try {
            Class<Boolean> cls = this.f97278a.getClass();
            if (cls == String.class) {
                t = b.getString(this.f97279b, (String) this.f97278a);
            } else if (cls == Integer.class) {
                t = Integer.valueOf(b.getInt(this.f97279b, ((Integer) this.f97278a).intValue()));
            } else if (cls == Float.class) {
                t = Float.valueOf(b.getFloat(this.f97279b, ((Float) this.f97278a).floatValue()));
            } else if (cls == Long.class) {
                t = Long.valueOf(b.getLong(this.f97279b, ((Long) this.f97278a).longValue()));
            } else if (cls == Boolean.class) {
                t = Boolean.valueOf(b.getBoolean(this.f97279b, ((Boolean) this.f97278a).booleanValue()));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = b.getStringSet(this.f97279b, (Set) this.f97278a);
            } else {
                throw new AssertionError();
            }
            if (t == null) {
                m85381b(this.f97278a, false);
                t = this.f97278a;
            }
            if (t.getClass() != this.f97278a.getClass()) {
                t = this.f97278a;
            }
            return t;
        } catch (Exception unused) {
            return this.f97278a;
        }
    }

    public C38212a(String str, T t) {
        this.f97278a = t;
        this.f97279b = str;
    }

    /* renamed from: a */
    public final void mo78199a(T t, boolean z) {
        if (t != null) {
            m85381b(t, false);
        }
    }

    /* renamed from: b */
    private void m85381b(T t, boolean z) {
        if (t != null) {
            Editor edit = m85380b().edit();
            if (t instanceof String) {
                edit.putString(this.f97279b, (String) t);
            } else if (t instanceof Integer) {
                edit.putInt(this.f97279b, ((Integer) t).intValue());
            } else if (t instanceof Float) {
                edit.putFloat(this.f97279b, ((Float) t).floatValue());
            } else if (t instanceof Long) {
                edit.putLong(this.f97279b, ((Long) t).longValue());
            } else if (t instanceof Boolean) {
                edit.putBoolean(this.f97279b, ((Boolean) t).booleanValue());
            } else if (t instanceof Set) {
                edit.putStringSet(this.f97279b, (Set) t);
            }
            if (z) {
                edit.commit();
            } else {
                edit.apply();
            }
        }
    }
}
