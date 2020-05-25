package com.p683ss.android.ugc.aweme.base.p1417h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.h.g */
public final class C23543g {

    /* renamed from: a */
    public SharedPreferences f62665a;

    /* renamed from: b */
    private Editor f62666b;

    /* renamed from: a */
    public Editor mo48701a() {
        if (this.f62666b == null) {
            this.f62666b = this.f62665a.edit();
        }
        return this.f62666b;
    }

    /* renamed from: a */
    public final int mo48699a(String str, int i) {
        return this.f62665a.getInt(str, i);
    }

    public C23543g(Context context, String str) {
        this.f62665a = C35807d.m80935a(context.getApplicationContext(), str, 0);
    }

    /* renamed from: a */
    public final long mo48700a(String str, long j) {
        return this.f62665a.getLong(str, j);
    }

    /* renamed from: b */
    public final void mo48707b(String str, int i) {
        mo48701a().putInt(str, i).apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.util.List<T> mo48706b(java.lang.String r2, java.lang.Class<T> r3) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r2 = r1.mo48703a(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0011
            java.util.List r2 = com.alibaba.fastjson.JSON.parseArray(r2, r3)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 != 0) goto L_0x0019
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1417h.C23543g.mo48706b(java.lang.String, java.lang.Class):java.util.List");
    }

    /* renamed from: a */
    public final <T> T mo48702a(String str, Class<T> cls) {
        String a = mo48703a(str, "");
        if (!TextUtils.isEmpty(a)) {
            try {
                return JSON.parseObject(a, cls);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo48708b(String str, long j) {
        mo48701a().putLong(str, j).apply();
    }

    /* renamed from: a */
    public final String mo48703a(String str, String str2) {
        return this.f62665a.getString(str, str2);
    }

    /* renamed from: b */
    public final void mo48709b(String str, String str2) {
        mo48701a().putString(str, str2).apply();
    }

    /* renamed from: a */
    public final void mo48704a(String str, Object obj) {
        mo48701a().putString(str, JSONObject.toJSONString(obj)).apply();
    }

    /* renamed from: b */
    public final void mo48710b(String str, boolean z) {
        mo48701a().putBoolean(str, z).apply();
    }

    /* renamed from: a */
    public final boolean mo48705a(String str, boolean z) {
        return this.f62665a.getBoolean(str, z);
    }
}
