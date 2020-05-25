package com.p683ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.bf */
public class C23051bf<T> {

    /* renamed from: a */
    protected T f61415a;

    /* renamed from: b */
    public String f61416b;

    /* renamed from: c */
    protected Type f61417c;

    /* renamed from: a */
    protected static SharedPreferences m56568a() {
        return SharePrefCache.inst().getSharePref();
    }

    /* renamed from: b */
    public final void mo47778b() {
        m56569b(this.f61415a);
    }

    /* renamed from: c */
    public final T mo47781c() {
        T t;
        SharedPreferences a = m56568a();
        try {
            if (this.f61415a != null) {
                return mo47782d();
            }
            if (this.f61417c == null || !(this.f61417c instanceof Class)) {
                return null;
            }
            Class<Boolean> cls = (Class) this.f61417c;
            if (!a.contains(this.f61416b)) {
                return null;
            }
            if (cls == String.class) {
                t = a.getString(this.f61416b, "");
            } else if (cls == Integer.class) {
                t = Integer.valueOf(a.getInt(this.f61416b, -1000));
            } else if (cls == Float.class) {
                t = Float.valueOf(a.getFloat(this.f61416b, -1000.0f));
            } else if (cls == Long.class) {
                t = Long.valueOf(a.getLong(this.f61416b, -1000));
            } else if (cls == Boolean.class) {
                t = Boolean.valueOf(a.getBoolean(this.f61416b, false));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = a.getStringSet(this.f61416b, new HashSet());
            } else {
                throw new AssertionError();
            }
            return t;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public T mo47782d() {
        T t;
        SharedPreferences a = m56568a();
        try {
            Class<Boolean> cls = this.f61415a.getClass();
            if (cls == String.class) {
                t = a.getString(this.f61416b, (String) this.f61415a);
            } else if (cls == Integer.class) {
                t = Integer.valueOf(a.getInt(this.f61416b, ((Integer) this.f61415a).intValue()));
            } else if (cls == Float.class) {
                t = Float.valueOf(a.getFloat(this.f61416b, ((Float) this.f61415a).floatValue()));
            } else if (cls == Long.class) {
                t = Long.valueOf(a.getLong(this.f61416b, ((Long) this.f61415a).longValue()));
            } else if (cls == Boolean.class) {
                t = Boolean.valueOf(a.getBoolean(this.f61416b, ((Boolean) this.f61415a).booleanValue()));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = a.getStringSet(this.f61416b, (Set) this.f61415a);
            } else {
                throw new AssertionError();
            }
            if (t == null) {
                m56569b(this.f61415a);
                t = this.f61415a;
            }
            if (t.getClass() != this.f61415a.getClass()) {
                t = this.f61415a;
            }
            return t;
        } catch (Exception unused) {
            return this.f61415a;
        }
    }

    /* renamed from: b */
    private void m56569b(T t) {
        mo47777a(t, false);
    }

    /* renamed from: a */
    public final void mo47776a(T t) {
        mo47780b(t, false);
    }

    public C23051bf(String str, T t) {
        if (t != null) {
            this.f61415a = t;
            this.f61416b = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final void mo47779b(Editor editor, T t) {
        if (editor != null) {
            mo47775a(editor, t);
            return;
        }
        throw new IllegalArgumentException("editor can not be null!");
    }

    /* renamed from: b */
    public final void mo47780b(T t, boolean z) {
        if (t != null) {
            mo47777a(t, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47775a(Editor editor, T t) {
        if (t instanceof String) {
            editor.putString(this.f61416b, (String) t);
        } else if (t instanceof Integer) {
            editor.putInt(this.f61416b, ((Integer) t).intValue());
        } else if (t instanceof Float) {
            editor.putFloat(this.f61416b, ((Float) t).floatValue());
        } else if (t instanceof Long) {
            editor.putLong(this.f61416b, ((Long) t).longValue());
        } else if (t instanceof Boolean) {
            editor.putBoolean(this.f61416b, ((Boolean) t).booleanValue());
        } else {
            if (t instanceof Set) {
                editor.putStringSet(this.f61416b, (Set) t);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47777a(T t, boolean z) {
        if (t != null) {
            Editor edit = m56568a().edit();
            if (t instanceof String) {
                edit.putString(this.f61416b, (String) t);
            } else if (t instanceof Integer) {
                edit.putInt(this.f61416b, ((Integer) t).intValue());
            } else if (t instanceof Float) {
                edit.putFloat(this.f61416b, ((Float) t).floatValue());
            } else if (t instanceof Long) {
                edit.putLong(this.f61416b, ((Long) t).longValue());
            } else if (t instanceof Boolean) {
                edit.putBoolean(this.f61416b, ((Boolean) t).booleanValue());
            } else if (t instanceof Set) {
                edit.putStringSet(this.f61416b, (Set) t);
            }
            if (z) {
                edit.commit();
            } else {
                edit.apply();
            }
        }
    }

    public C23051bf(String str, Type type, T t) {
        if (t == null && type == null) {
            throw new NullPointerException();
        }
        this.f61415a = t;
        this.f61416b = str;
        this.f61417c = type;
    }
}
