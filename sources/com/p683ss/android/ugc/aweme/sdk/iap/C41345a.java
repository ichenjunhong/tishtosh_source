package com.p683ss.android.ugc.aweme.sdk.iap;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.a */
public final class C41345a {

    /* renamed from: a */
    int f104830a;

    /* renamed from: b */
    int f104831b;

    /* renamed from: c */
    int f104832c;

    /* renamed from: d */
    int f104833d;

    /* renamed from: e */
    String f104834e;

    /* renamed from: f */
    String f104835f;

    /* renamed from: g */
    String f104836g;

    /* renamed from: h */
    String f104837h;

    /* renamed from: i */
    OnClickListener f104838i;

    /* renamed from: j */
    OnClickListener f104839j;

    private C41345a() {
    }

    /* renamed from: a */
    public static C41345a m91118a() {
        return new C41345a();
    }

    /* renamed from: a */
    public final C41345a mo83920a(int i) {
        this.f104831b = i;
        return this;
    }

    /* renamed from: b */
    public final C41345a mo83921b(int i) {
        this.f104833d = i;
        return this;
    }

    /* renamed from: a */
    static String m91119a(Context context, String str, int i) {
        if (!TextUtils.isEmpty(str) || i == 0) {
            return "";
        }
        return context.getResources().getString(i);
    }
}
