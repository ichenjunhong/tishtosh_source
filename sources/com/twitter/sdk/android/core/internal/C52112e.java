package com.twitter.sdk.android.core.internal;

import android.content.Context;

/* renamed from: com.twitter.sdk.android.core.internal.e */
final class C52112e implements C52113f {

    /* renamed from: a */
    private final Context f129719a;

    /* renamed from: b */
    private String m111457b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.b.a$a").getMethod("getId", new Class[0]).invoke(m111459d(), new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C52104b mo108815a() {
        if (m111456a(this.f129719a)) {
            return new C52104b(m111457b(), m111458c());
        }
        return null;
    }

    /* renamed from: c */
    private boolean m111458c() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.b.a$a").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m111459d(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private Object m111459d() {
        try {
            return Class.forName("com.google.android.gms.ads.b.a").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.f129719a});
        } catch (Exception unused) {
            return null;
        }
    }

    C52112e(Context context) {
        this.f129719a = context.getApplicationContext();
    }

    /* renamed from: a */
    private static boolean m111456a(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.f").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
