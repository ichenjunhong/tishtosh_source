package com.twitter.sdk.android.core.internal.p2618b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.twitter.sdk.android.core.internal.b.c */
public final class C52107c implements C52106b {

    /* renamed from: a */
    private final SharedPreferences f129711a;

    /* renamed from: a */
    public final SharedPreferences mo108807a() {
        return this.f129711a;
    }

    /* renamed from: b */
    public final Editor mo108809b() {
        return this.f129711a.edit();
    }

    /* renamed from: a */
    public final boolean mo108808a(Editor editor) {
        editor.apply();
        return true;
    }

    public C52107c(Context context, String str) {
        if (context != null) {
            this.f129711a = C35807d.m80935a(context, str, 0);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
