package com.p683ss.android.ugc.aweme.p1439bl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bl.a */
public abstract class C23858a {

    /* renamed from: a */
    protected String f63535a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49461a();

    public C23858a() {
        mo49461a();
    }

    /* renamed from: b */
    private void m58558b() {
        if (TextUtils.isEmpty(this.f63535a)) {
            throw new IllegalStateException("filename can not bo null");
        }
    }

    /* renamed from: a */
    public SharedPreferences mo49458a(Context context) {
        if (context == null) {
            return null;
        }
        m58558b();
        return C35807d.m80935a(context, this.f63535a, 0);
    }

    /* renamed from: c */
    public final long mo49473c(Context context, String str) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return 0;
        }
        return a.getLong(str, 0);
    }

    /* renamed from: a */
    public final String mo49460a(Context context, String str) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return null;
        }
        return a.getString(str, "");
    }

    /* renamed from: b */
    public final boolean mo49471b(Context context, String str) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return false;
        }
        return a.getBoolean(str, false);
    }

    /* renamed from: b */
    public final int mo49467b(Context context, String str, int i) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return 0;
        }
        return a.getInt(str, i);
    }

    /* renamed from: a */
    public final <T> T mo49459a(Context context, String str, Class<T> cls) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return null;
        }
        String string = a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseObject(string, cls);
        } catch (Error | Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String mo49468b(Context context, String str, String str2) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return null;
        }
        return a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo49462a(Context context, String str, int i) {
        Editor edit = C35807d.m80935a(context, this.f63535a, 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: b */
    public final <T> List<T> mo49469b(Context context, String str, Class<T> cls) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return null;
        }
        String string = a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseArray(string, cls);
        } catch (Error | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo49463a(Context context, String str, long j) {
        SharedPreferences a = mo49458a(context);
        if (a != null) {
            Editor edit = a.edit();
            edit.putLong(str, j);
            edit.apply();
        }
    }

    /* renamed from: b */
    public final void mo49470b(Context context, String str, Object obj) {
        try {
            SharedPreferences a = mo49458a(context);
            if (a != null) {
                if (obj != null) {
                    Editor edit = a.edit();
                    edit.putString(str, JSONObject.toJSONString(obj));
                    edit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo49464a(Context context, String str, Object obj) {
        try {
            SharedPreferences a = mo49458a(context);
            if (a != null) {
                if (obj != null) {
                    Editor edit = a.edit();
                    edit.putString(str, JSONObject.toJSONString(obj));
                    edit.apply();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo49465a(Context context, String str, String str2) {
        SharedPreferences a = mo49458a(context);
        if (a != null) {
            Editor edit = a.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    /* renamed from: b */
    public final boolean mo49472b(Context context, String str, boolean z) {
        SharedPreferences a = mo49458a(context);
        if (a == null) {
            return false;
        }
        return a.getBoolean(str, z);
    }

    /* renamed from: a */
    public final void mo49466a(Context context, String str, boolean z) {
        SharedPreferences a = mo49458a(context);
        if (a != null) {
            Editor edit = a.edit();
            edit.putBoolean(str, z);
            edit.apply();
        }
    }
}
