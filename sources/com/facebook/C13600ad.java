package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.facebook.GraphRequest.C13501b;
import com.facebook.internal.C14295b;
import com.facebook.internal.C14336o;
import com.facebook.internal.C14338p;
import com.facebook.p909a.C13589l;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ad */
public final class C13600ad {

    /* renamed from: a */
    public static AtomicBoolean f35483a = new AtomicBoolean(false);

    /* renamed from: b */
    static C13602a f35484b = new C13602a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: c */
    public static C13602a f35485c = new C13602a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: d */
    public static C13602a f35486d = new C13602a(false, "auto_event_setup_enabled");

    /* renamed from: e */
    private static final String f35487e = "com.facebook.ad";

    /* renamed from: f */
    private static AtomicBoolean f35488f = new AtomicBoolean(false);

    /* renamed from: g */
    private static C13602a f35489g = new C13602a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: h */
    private static SharedPreferences f35490h;

    /* renamed from: i */
    private static Editor f35491i;

    /* renamed from: com.facebook.ad$a */
    public static class C13602a {

        /* renamed from: a */
        String f35493a;

        /* renamed from: b */
        Boolean f35494b;

        /* renamed from: c */
        boolean f35495c;

        /* renamed from: d */
        long f35496d;

        /* renamed from: a */
        public final boolean mo25428a() {
            if (this.f35494b == null) {
                return this.f35495c;
            }
            return this.f35494b.booleanValue();
        }

        C13602a(boolean z, String str) {
            this.f35495c = z;
            this.f35493a = str;
        }
    }

    C13600ad() {
    }

    /* renamed from: b */
    public static boolean m27449b() {
        m27445a();
        return f35489g.mo25428a();
    }

    /* renamed from: c */
    public static boolean m27451c() {
        m27445a();
        return f35485c.mo25428a();
    }

    /* renamed from: g */
    private static void m27455g() {
        if (!f35488f.get()) {
            throw new C14560o("The UserSettingManager has not been initialized successfully");
        }
    }

    /* renamed from: d */
    private static void m27452d() {
        m27448b(f35486d);
        final long currentTimeMillis = System.currentTimeMillis();
        if (f35486d.f35494b == null || currentTimeMillis - f35486d.f35496d >= 604800000) {
            f35486d.f35494b = null;
            f35486d.f35496d = 0;
            if (f35483a.compareAndSet(false, true)) {
                C14533n.m29771e().execute(new Runnable() {
                    public final void run() {
                        String str;
                        if (C13600ad.f35485c.mo25428a()) {
                            C14336o a = C14338p.m29399a(C14533n.m29777k(), false);
                            if (a != null && a.f37300l) {
                                C14295b a2 = C14295b.m29331a(C14533n.m29773g());
                                if (a2 == null || a2.mo26512a() == null) {
                                    str = null;
                                } else {
                                    str = a2.mo26512a();
                                }
                                if (str != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("advertiser_id", a2.mo26512a());
                                    bundle.putString("fields", "auto_event_setup_enabled");
                                    GraphRequest a3 = GraphRequest.m27265a((AccessToken) null, C14533n.m29777k(), (C13501b) null);
                                    a3.f35232n = true;
                                    a3.f35228j = bundle;
                                    JSONObject jSONObject = a3.mo25312a().f38084b;
                                    if (jSONObject != null) {
                                        C13600ad.f35486d.f35494b = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                        C13600ad.f35486d.f35496d = currentTimeMillis;
                                        C13600ad.m27446a(C13600ad.f35486d);
                                    }
                                }
                            }
                        }
                        C13600ad.f35483a.set(false);
                    }
                });
            }
        }
    }

    /* renamed from: e */
    private static void m27453e() {
        try {
            Context g = C14533n.m29773g();
            ApplicationInfo a = C13603ae.m27457a(g.getPackageManager(), g.getPackageName(), 128);
            if (!(a == null || a.metaData == null)) {
                a.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                a.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                m27451c();
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static void m27445a() {
        if (C14533n.m29764a() && f35488f.compareAndSet(false, true)) {
            SharedPreferences a = C35807d.m80935a(C14533n.m29773g(), "com.facebook.sdk.USER_SETTINGS", 0);
            f35490h = a;
            f35491i = a.edit();
            m27447a(f35489g, f35485c, f35484b);
            m27452d();
            m27453e();
            m27454f();
        }
    }

    /* renamed from: f */
    private static void m27454f() {
        int i;
        boolean[] zArr;
        if (f35488f.get() && C14533n.m29764a()) {
            Context g = C14533n.m29773g();
            int i2 = 0;
            int i3 = ((f35484b.mo25428a() ? 1 : 0) << false) | 0 | ((f35489g.mo25428a() ? 1 : 0) << true) | ((f35485c.mo25428a() ? 1 : 0) << true);
            int i4 = f35490h.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i4 != i3) {
                f35491i.putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).commit();
                try {
                    ApplicationInfo a = C13603ae.m27457a(g.getPackageManager(), g.getPackageName(), 128);
                    if (!(a == null || a.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        // fill-array-data instruction
                        new boolean[]{true, true, true}[0] = 1;
                        new boolean[]{true, true, true}[1] = 1;
                        new boolean[]{true, true, true}[2] = 1;
                        int i5 = 0;
                        i = 0;
                        while (i2 < 3) {
                            try {
                                i |= (a.metaData.containsKey(strArr[i2]) ? 1 : 0) << i2;
                                i5 |= (a.metaData.getBoolean(strArr[i2], zArr[i2]) ? 1 : 0) << i2;
                                i2++;
                            } catch (NameNotFoundException unused) {
                            }
                        }
                        i2 = i5;
                        C13589l lVar = new C13589l(g);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i4);
                        bundle.putInt("current", i3);
                        lVar.mo25411b("fb_sdk_settings_changed", bundle);
                    }
                } catch (NameNotFoundException unused2) {
                }
                i = 0;
                C13589l lVar2 = new C13589l(g);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i4);
                bundle2.putInt("current", i3);
                lVar2.mo25411b("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    /* renamed from: a */
    public static void m27446a(C13602a aVar) {
        m27455g();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", aVar.f35494b);
            jSONObject.put("last_timestamp", aVar.f35496d);
            f35491i.putString(aVar.f35493a, jSONObject.toString()).commit();
            m27454f();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private static void m27448b(C13602a aVar) {
        m27455g();
        try {
            String string = f35490h.getString(aVar.f35493a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                aVar.f35494b = Boolean.valueOf(jSONObject.getBoolean("value"));
                aVar.f35496d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    private static void m27450c(C13602a aVar) {
        m27455g();
        try {
            Context g = C14533n.m29773g();
            ApplicationInfo a = C13603ae.m27457a(g.getPackageManager(), g.getPackageName(), 128);
            if (!(a == null || a.metaData == null || !a.metaData.containsKey(aVar.f35493a))) {
                aVar.f35494b = Boolean.valueOf(a.metaData.getBoolean(aVar.f35493a, aVar.f35495c));
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    private static void m27447a(C13602a... aVarArr) {
        for (int i = 0; i < 3; i++) {
            C13602a aVar = aVarArr[i];
            if (aVar == f35486d) {
                m27452d();
            } else if (aVar.f35494b == null) {
                m27448b(aVar);
                if (aVar.f35494b == null) {
                    m27450c(aVar);
                }
            } else {
                m27446a(aVar);
            }
        }
    }
}
