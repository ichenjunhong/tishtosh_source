package com.google.android.gms.ads.p1029b;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.C15384g;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.google.android.gms.ads.b.c */
public final class C14906c {

    /* renamed from: a */
    private SharedPreferences f38449a;

    public C14906c(Context context) {
        try {
            Context c = C15384g.m31963c(context);
            this.f38449a = c == null ? null : C35807d.m80935a(c, "google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f38449a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo27314a(String str, float f) {
        try {
            if (this.f38449a == null) {
                return 0.0f;
            }
            return this.f38449a.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo27315a(String str, String str2) {
        try {
            return this.f38449a == null ? str2 : this.f38449a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo27316a(String str, boolean z) {
        try {
            if (this.f38449a == null) {
                return false;
            }
            return this.f38449a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }
}
