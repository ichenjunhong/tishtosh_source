package com.bytedance.ies.bullet.p628b.p643i;

import android.os.Bundle;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.b.i.c */
public final class C10370c {

    /* renamed from: com.bytedance.ies.bullet.b.i.c$a */
    public static final class C10371a extends C52712l implements C52682m<Bundle, String, Boolean> {
        public C10371a() {
            super(2);
        }

        public final Boolean invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            if (bundle.containsKey(str)) {
                return Boolean.valueOf(bundle.getBoolean(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$b */
    public static final class C10372b extends C52712l implements C52686q<Bundle, String, Double, Bundle> {
        public C10372b() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Double d) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putDouble(str, d.doubleValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$c */
    public static final class C10373c extends C52712l implements C52682m<Bundle, String, String> {
        public C10373c() {
            super(2);
        }

        public final String invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            if (bundle.containsKey(str)) {
                return bundle.getString(str);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$d */
    public static final class C10374d extends C52712l implements C52686q<Bundle, String, String, Bundle> {
        public C10374d() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, String str2) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putString(str, str2);
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$e */
    public static final class C10375e extends C52712l implements C52686q<Bundle, String, Boolean, Bundle> {
        public C10375e() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Boolean bool) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putBoolean(str, bool.booleanValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$f */
    public static final class C10376f extends C52712l implements C52682m<Bundle, String, Integer> {
        public C10376f() {
            super(2);
        }

        public final Integer invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            if (bundle.containsKey(str)) {
                return Integer.valueOf(bundle.getInt(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$g */
    public static final class C10377g extends C52712l implements C52686q<Bundle, String, Integer, Bundle> {
        public C10377g() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Integer num) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putInt(str, num.intValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$h */
    public static final class C10378h extends C52712l implements C52682m<Bundle, String, Long> {
        public C10378h() {
            super(2);
        }

        public final Long invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            if (bundle.containsKey(str)) {
                return Long.valueOf(bundle.getLong(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$i */
    public static final class C10379i extends C52712l implements C52686q<Bundle, String, Long, Bundle> {
        public C10379i() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Long l) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putLong(str, l.longValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$j */
    public static final class C10380j extends C52712l implements C52682m<Bundle, String, Float> {
        public C10380j() {
            super(2);
        }

        public final Float invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            if (bundle.containsKey(str)) {
                return Float.valueOf(bundle.getFloat(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$k */
    public static final class C10381k extends C52712l implements C52686q<Bundle, String, Float, Bundle> {
        public C10381k() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Float f) {
            C52711k.m112240b(bundle, "builder");
            C52711k.m112240b(str, "key");
            bundle.putFloat(str, f.floatValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.i.c$l */
    public static final class C10382l extends C52712l implements C52682m<Bundle, String, Double> {
        public C10382l() {
            super(2);
        }

        public final Double invoke(Bundle bundle, String str) {
            C52711k.m112240b(bundle, "bundle");
            C52711k.m112240b(str, "key");
            if (bundle.containsKey(str)) {
                return Double.valueOf(bundle.getDouble(str));
            }
            return null;
        }
    }
}
