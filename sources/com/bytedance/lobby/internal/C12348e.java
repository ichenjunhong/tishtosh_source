package com.bytedance.lobby.internal;

/* renamed from: com.bytedance.lobby.internal.e */
final class C12348e {

    /* renamed from: a */
    static final boolean f32545a = m24862a("com.google.android.gms.auth.api.signin.GoogleSignInClient");

    /* renamed from: b */
    static final boolean f32546b = m24862a("com.facebook.login.LoginManager");

    /* renamed from: c */
    static final boolean f32547c = m24862a("com.linecorp.linesdk.auth.LineLoginApi");

    /* renamed from: d */
    static final boolean f32548d = m24862a("com.twitter.sdk.android.core.identity.TwitterAuthClient");

    /* renamed from: e */
    static final boolean f32549e = m24862a("com.kakao.auth.KakaoSDK");

    /* renamed from: f */
    static final boolean f32550f = m24862a("com.vk.sdk.VKSdk");

    /* renamed from: a */
    private static boolean m24862a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
