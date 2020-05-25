package com.facebook.p909a;

import android.content.Context;
import com.facebook.AccessToken;

/* renamed from: com.facebook.a.g */
public class C13581g {

    /* renamed from: a */
    private static final String f35434a = C13581g.class.getCanonicalName();

    /* renamed from: b */
    private C13583h f35435b;

    /* renamed from: com.facebook.a.g$a */
    public enum C13582a {
        AUTO,
        EXPLICIT_ONLY
    }

    /* renamed from: a */
    public static C13581g m27415a(Context context) {
        return new C13581g(context, null, null);
    }

    /* renamed from: b */
    public static String m27416b(Context context) {
        return C13583h.m27418a(context);
    }

    private C13581g(Context context, String str, AccessToken accessToken) {
        this.f35435b = new C13583h(context, (String) null, (AccessToken) null);
    }
}
