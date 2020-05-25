package com.bytedance.android.p140a.p141a.p143b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import com.bytedance.android.p140a.p141a.C2778c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Map;

/* renamed from: com.bytedance.android.a.a.b.b */
public final class C2777b implements C2776a {

    /* renamed from: a */
    private Context f8340a;

    /* renamed from: b */
    private String f8341b;

    /* renamed from: c */
    private SharedPreferences f8342c;

    /* renamed from: d */
    private Editor f8343d;

    /* renamed from: b */
    public final C2776a mo7371b() {
        m7889d().clear();
        return this;
    }

    /* renamed from: c */
    public final void mo7372c() {
        m7889d().apply();
    }

    /* renamed from: d */
    private Editor m7889d() {
        if (this.f8343d == null) {
            synchronized (this) {
                if (this.f8343d == null) {
                    SharedPreferences e = m7890e();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f8343d = e.edit();
                    C2778c.m7898a().mo7376b(this.f8341b, SystemClock.uptimeMillis() - uptimeMillis);
                }
            }
        }
        return this.f8343d;
    }

    /* renamed from: e */
    private SharedPreferences m7890e() {
        if (this.f8342c == null) {
            synchronized (this) {
                if (this.f8342c == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f8342c = C35807d.m80935a(this.f8340a, this.f8341b, 0);
                    C2778c.m7898a().mo7375a(this.f8341b, SystemClock.uptimeMillis() - uptimeMillis);
                }
            }
        }
        return this.f8342c;
    }

    /* renamed from: a */
    public final Map<String, ?> mo7369a() {
        return m7890e().getAll();
    }

    /* renamed from: a */
    public final C2776a mo7366a(String str) {
        m7889d().remove(str);
        return this;
    }

    public C2777b(Context context, String str) {
        this.f8340a = context;
        this.f8341b = str;
    }

    /* renamed from: a */
    public final C2776a mo7367a(String str, int i) {
        m7889d().putInt(str, 2);
        return this;
    }

    /* renamed from: b */
    public final int mo7370b(String str, int i) {
        return m7890e().getInt(str, 0);
    }

    /* renamed from: a */
    public final C2776a mo7368a(String str, String str2) {
        m7889d().putString(str, str2);
        return this;
    }
}
