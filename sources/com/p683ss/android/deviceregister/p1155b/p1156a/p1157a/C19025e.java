package com.p683ss.android.deviceregister.p1155b.p1156a.p1157a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.deviceregister.b.a.a.e */
public final class C19025e extends C19013b {

    /* renamed from: a */
    private final SharedPreferences f52364a;

    /* renamed from: b */
    private final SharedPreferences f52365b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo38861a(String str) {
        return m46270d(str);
    }

    /* renamed from: d */
    private String m46270d(String str) {
        return m46271e(str).getString(str, null);
    }

    /* renamed from: e */
    private SharedPreferences m46271e(String str) {
        if ("device_id".equals(str)) {
            return this.f52365b;
        }
        return this.f52364a;
    }

    public C19025e(Context context) {
        if (context != null) {
            this.f52364a = C35807d.m80935a(context, C19002a.m46177c(), 0);
            this.f52365b = C19002a.m46174a(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo38865b(String str) {
        String d = m46270d(str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return d.split("\n");
    }

    /* renamed from: c */
    public final void mo38866c(String str) {
        SharedPreferences e = m46271e(str);
        if (e != null && e.contains(str)) {
            m46271e(str).edit().remove(str).apply();
        }
        super.mo38866c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38863a(String str, String str2) {
        m46272g(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38864a(String str, String[] strArr) {
        if (strArr != null) {
            m46272g(str, TextUtils.join("\n", strArr));
        }
    }

    /* renamed from: g */
    private void m46272g(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            Editor edit = m46271e(str).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
