package com.p683ss.android.ugc.aweme.p1963ml;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.p1192ml.C19497b;
import com.p683ss.android.p1192ml.C19503f;
import com.p683ss.android.p1192ml.C19503f.C19504a;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;

/* renamed from: com.ss.android.ugc.aweme.ml.a */
public final class C37098a extends C19503f {

    /* renamed from: a */
    private MLModel f94751a;

    /* renamed from: e */
    public final C19504a mo40677e() {
        return C37103b.f94752a;
    }

    /* renamed from: g */
    public final C19497b mo40679g() {
        return C37104c.f94753a;
    }

    /* renamed from: a */
    public final boolean mo40673a() {
        if (this.f94751a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo40674b() {
        if (this.f94751a == null) {
            return "";
        }
        return this.f94751a.packageUrl;
    }

    /* renamed from: f */
    public final boolean mo40678f() {
        if (this.f94751a == null || this.f94751a.type != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo40675c() {
        Context a = C11010c.m22280a();
        if (a == null) {
            return "";
        }
        return a.getFilesDir().getAbsolutePath();
    }

    /* renamed from: d */
    public final String mo40676d() {
        if (TextUtils.isEmpty(this.f94751a.scene)) {
            return "default";
        }
        return this.f94751a.scene;
    }

    public C37098a(MLModel mLModel) {
        this.f94751a = mLModel;
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m83322a(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
