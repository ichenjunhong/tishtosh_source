package com.facebook.p909a.p912b;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.C2240a;
import com.facebook.AccessToken;
import com.facebook.C13600ad;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.C14699w;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14295b;
import com.facebook.internal.C14327m;
import com.facebook.internal.C14327m.C14330a;
import com.facebook.internal.C14327m.C14331b;
import com.facebook.internal.C14336o;
import com.facebook.internal.C14338p;
import com.facebook.internal.C14346r;
import com.facebook.internal.C14349t;
import com.facebook.p909a.C13573e;
import com.facebook.p909a.C13589l;
import com.facebook.p909a.p910a.C13524b;
import com.facebook.p909a.p910a.C13527c;
import com.facebook.p909a.p910a.C13534e;
import com.facebook.p909a.p910a.C13540f.C13541a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.a */
public class C13544a {

    /* renamed from: a */
    public static final String f35353a = C13544a.class.getCanonicalName();

    /* renamed from: b */
    public static final ScheduledExecutorService f35354b = ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a()));

    /* renamed from: c */
    public static volatile ScheduledFuture f35355c;

    /* renamed from: d */
    public static final Object f35356d = new Object();

    /* renamed from: e */
    public static AtomicInteger f35357e = new AtomicInteger(0);

    /* renamed from: f */
    public static volatile C13565h f35358f;

    /* renamed from: g */
    public static String f35359g;

    /* renamed from: h */
    public static long f35360h;

    /* renamed from: i */
    public static int f35361i = 0;

    /* renamed from: j */
    private static AtomicBoolean f35362j = new AtomicBoolean(false);

    /* renamed from: a */
    public static int m27366a() {
        C14336o a = C14338p.m29397a(C14533n.m29777k());
        if (a == null) {
            return 60;
        }
        return a.f37292d;
    }

    /* renamed from: b */
    static void m27368b() {
        synchronized (f35356d) {
            if (f35355c != null) {
                f35355c.cancel(false);
            }
            f35355c = null;
        }
    }

    /* renamed from: a */
    public static void m27367a(Application application, String str) {
        if (f35362j.compareAndSet(false, true)) {
            C14327m.m29381a(C14331b.CodelessEvents, new C14330a() {
                /* renamed from: a */
                public final void mo25363a(boolean z) {
                    if (z) {
                        C13524b.f35306e.set(true);
                    } else {
                        C13524b.f35306e.set(false);
                    }
                }
            });
            f35359g = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public final void onActivityStarted(Activity activity) {
                    C13544a.f35361i++;
                    C14349t.m29408a(C14699w.APP_EVENTS, C13544a.f35353a, "onActivityStarted");
                }

                public final void onActivityDestroyed(Activity activity) {
                    C14349t.m29408a(C14699w.APP_EVENTS, C13544a.f35353a, "onActivityDestroyed");
                    C13527c.m27349a().f35318f.remove(Integer.valueOf(activity.hashCode()));
                }

                public final void onActivityStopped(Activity activity) {
                    C14349t.m29408a(C14699w.APP_EVENTS, C13544a.f35353a, "onActivityStopped");
                    C13573e.f35423c.execute(new Runnable() {
                        public final void run() {
                            C13579f.m27413a(C13573e.f35422b);
                            C13573e.f35422b = new C13572d();
                        }
                    });
                    C13544a.f35361i--;
                }

                public final void onActivityPaused(Activity activity) {
                    C14349t.m29408a(C14699w.APP_EVENTS, C13544a.f35353a, "onActivityPaused");
                    if (C13544a.f35357e.decrementAndGet() < 0) {
                        C13544a.f35357e.set(0);
                    }
                    C13544a.m27368b();
                    long currentTimeMillis = System.currentTimeMillis();
                    String c = C14277aa.m29287c((Context) activity);
                    if (C13524b.f35306e.get()) {
                        C13527c a = C13527c.m27349a();
                        if (!C14346r.m29405a()) {
                            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                a.f35315c.remove(activity);
                                a.f35316d.clear();
                                a.f35318f.put(Integer.valueOf(activity.hashCode()), (HashSet) a.f35317e.clone());
                                a.f35317e.clear();
                            } else {
                                throw new C14457k("Can't remove activity from CodelessMatcher on non-UI thread");
                            }
                        }
                        if (C13524b.f35304c != null) {
                            C13534e eVar = C13524b.f35304c;
                            if (!(((Activity) eVar.f35339c.get()) == null || eVar.f35340d == null)) {
                                try {
                                    eVar.f35340d.cancel();
                                    eVar.f35340d = null;
                                } catch (Exception unused) {
                                }
                            }
                        }
                        if (C13524b.f35303b != null) {
                            C13524b.f35303b.unregisterListener(C13524b.f35302a);
                        }
                    }
                    C13544a.f35354b.execute(new Runnable(currentTimeMillis, c) {

                        /* renamed from: a */
                        final /* synthetic */ long f35365a;

                        /* renamed from: b */
                        final /* synthetic */ String f35366b;

                        public final void run() {
                            long j;
                            if (C13544a.f35358f == null) {
                                C13544a.f35358f = new C13565h(Long.valueOf(this.f35365a), null);
                            }
                            C13544a.f35358f.f35398b = Long.valueOf(this.f35365a);
                            if (C13544a.f35357e.get() <= 0) {
                                C135501 r0 = new Runnable() {
                                    public final void run() {
                                        if (C13544a.f35357e.get() <= 0) {
                                            C13566i.m27396a(C135495.this.f35366b, C13544a.f35358f, C13544a.f35359g);
                                            Editor edit = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g()).edit();
                                            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                                            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                                            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                                            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                                            edit.apply();
                                            Editor edit2 = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g()).edit();
                                            edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                                            edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                                            edit2.apply();
                                            C13544a.f35358f = null;
                                        }
                                        synchronized (C13544a.f35356d) {
                                            C13544a.f35355c = null;
                                        }
                                    }
                                };
                                synchronized (C13544a.f35356d) {
                                    C13544a.f35355c = C13544a.f35354b.schedule(r0, (long) C13544a.m27366a(), TimeUnit.SECONDS);
                                }
                            }
                            long j2 = C13544a.f35360h;
                            if (j2 > 0) {
                                j = (this.f35365a - j2) / 1000;
                            } else {
                                j = 0;
                            }
                            String str = this.f35366b;
                            Context g = C14533n.m29773g();
                            String k = C14533n.m29777k();
                            C14283ab.m29306a((Object) g, "context");
                            C14336o a = C14338p.m29399a(k, false);
                            if (a != null && a.f37295g && j > 0) {
                                C13589l lVar = new C13589l(g);
                                Bundle bundle = new Bundle(1);
                                bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                                lVar.mo25407a("fb_aa_time_spent_on_view", (double) j, bundle);
                            }
                            C13544a.f35358f.mo25388c();
                        }

                        {
                            this.f35365a = r1;
                            this.f35366b = r3;
                        }
                    });
                }

                public final void onActivityResumed(Activity activity) {
                    C14349t.m29408a(C14699w.APP_EVENTS, C13544a.f35353a, "onActivityResumed");
                    C13544a.f35357e.incrementAndGet();
                    C13544a.m27368b();
                    long currentTimeMillis = System.currentTimeMillis();
                    C13544a.f35360h = currentTimeMillis;
                    String c = C14277aa.m29287c((Context) activity);
                    if (C13524b.f35306e.get()) {
                        C13527c a = C13527c.m27349a();
                        if (!C14346r.m29405a()) {
                            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                a.f35315c.add(activity);
                                a.f35317e.clear();
                                if (a.f35318f.containsKey(Integer.valueOf(activity.hashCode()))) {
                                    a.f35317e = (HashSet) a.f35318f.get(Integer.valueOf(activity.hashCode()));
                                }
                                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                    a.mo25347b();
                                } else {
                                    a.f35314b.post(new Runnable() {
                                        public final void run() {
                                            C13527c.this.mo25347b();
                                        }
                                    });
                                }
                            } else {
                                throw new C14457k("Can't add activity to CodelessMatcher on non-UI thread");
                            }
                        }
                        Context applicationContext = activity.getApplicationContext();
                        String k = C14533n.m29777k();
                        C14336o a2 = C14338p.m29397a(k);
                        if (a2 != null && a2.f37300l) {
                            SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                            C13524b.f35303b = sensorManager;
                            if (sensorManager != null) {
                                Sensor defaultSensor = C13524b.f35303b.getDefaultSensor(1);
                                C13524b.f35304c = new C13534e(activity);
                                C13524b.f35302a.f35348a = new C13541a(a2, k) {

                                    /* renamed from: a */
                                    final /* synthetic */ C14336o f35309a;

                                    /* renamed from: b */
                                    final /* synthetic */ String f35310b;

                                    /* renamed from: a */
                                    public final void mo25345a() {
                                        boolean z;
                                        if (this.f35309a == null || !this.f35309a.f37300l) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        C13600ad.m27445a();
                                        boolean a = C13600ad.f35486d.mo25428a();
                                        if (z && a) {
                                            String str = this.f35310b;
                                            if (!C13524b.f35308g.booleanValue()) {
                                                C13524b.f35308g = Boolean.valueOf(true);
                                                C14533n.m29771e().execute(new Runnable(str) {

                                                    /* renamed from: a */
                                                    final /* synthetic */ String f35311a;

                                                    public final void run() {
                                                        String str;
                                                        boolean z;
                                                        String str2;
                                                        boolean z2 = true;
                                                        GraphRequest a = GraphRequest.m27266a((AccessToken) null, C2240a.m6773a(Locale.US, "%s/app_indexing_session", new Object[]{this.f35311a}), (JSONObject) null, (C13501b) null);
                                                        Bundle bundle = a.f35228j;
                                                        if (bundle == null) {
                                                            bundle = new Bundle();
                                                        }
                                                        C14295b a2 = C14295b.m29331a(C14533n.m29773g());
                                                        JSONArray jSONArray = new JSONArray();
                                                        if (Build.MODEL != null) {
                                                            str = Build.MODEL;
                                                        } else {
                                                            str = "";
                                                        }
                                                        jSONArray.put(str);
                                                        if (a2 == null || a2.mo26512a() == null) {
                                                            jSONArray.put("");
                                                        } else {
                                                            jSONArray.put(a2.mo26512a());
                                                        }
                                                        jSONArray.put("0");
                                                        if (Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT))) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (z) {
                                                            str2 = "1";
                                                        } else {
                                                            str2 = "0";
                                                        }
                                                        jSONArray.put(str2);
                                                        Locale b = C14277aa.m29281b();
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(b.getLanguage());
                                                        sb.append("_");
                                                        sb.append(b.getCountry());
                                                        jSONArray.put(sb.toString());
                                                        String jSONArray2 = jSONArray.toString();
                                                        bundle.putString("device_session_id", C13524b.m27346a());
                                                        bundle.putString("extinfo", jSONArray2);
                                                        a.f35228j = bundle;
                                                        JSONObject jSONObject = a.mo25312a().f38084b;
                                                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                                                            z2 = false;
                                                        }
                                                        Boolean valueOf = Boolean.valueOf(z2);
                                                        C13524b.f35307f = valueOf;
                                                        if (!valueOf.booleanValue()) {
                                                            C13524b.f35305d = null;
                                                        } else if (C13524b.f35304c != null) {
                                                            C13524b.f35304c.mo25355a();
                                                        }
                                                        C13524b.f35308g = Boolean.valueOf(false);
                                                    }

                                                    {
                                                        this.f35311a = r1;
                                                    }
                                                });
                                            }
                                        }
                                    }

                                    {
                                        this.f35309a = r1;
                                        this.f35310b = r2;
                                    }
                                };
                                C13524b.f35303b.registerListener(C13524b.f35302a, defaultSensor, 2);
                                if (a2 != null && a2.f37300l) {
                                    C13524b.f35304c.mo25355a();
                                }
                            }
                        }
                    }
                    C13544a.f35354b.execute(new Runnable(currentTimeMillis, c) {

                        /* renamed from: a */
                        final /* synthetic */ long f35363a;

                        /* renamed from: b */
                        final /* synthetic */ String f35364b;

                        public final void run() {
                            if (C13544a.f35358f == null) {
                                C13544a.f35358f = new C13565h(Long.valueOf(this.f35363a), null);
                                C13566i.m27397a(this.f35364b, (C13567j) null, C13544a.f35359g);
                            } else if (C13544a.f35358f.f35398b != null) {
                                long longValue = this.f35363a - C13544a.f35358f.f35398b.longValue();
                                if (longValue > ((long) (C13544a.m27366a() * 1000))) {
                                    C13566i.m27396a(this.f35364b, C13544a.f35358f, C13544a.f35359g);
                                    C13566i.m27397a(this.f35364b, (C13567j) null, C13544a.f35359g);
                                    C13544a.f35358f = new C13565h(Long.valueOf(this.f35363a), null);
                                } else if (longValue > 1000) {
                                    C13565h hVar = C13544a.f35358f;
                                    hVar.f35399c++;
                                }
                            }
                            C13544a.f35358f.f35398b = Long.valueOf(this.f35363a);
                            C13544a.f35358f.mo25388c();
                        }

                        {
                            this.f35363a = r1;
                            this.f35364b = r3;
                        }
                    });
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C14349t.m29408a(C14699w.APP_EVENTS, C13544a.f35353a, "onActivitySaveInstanceState");
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C14349t.m29408a(C14699w.APP_EVENTS, C13544a.f35353a, "onActivityCreated");
                    C13544a.f35354b.execute(new Runnable() {
                        public final void run() {
                            C13565h hVar;
                            if (C13544a.f35358f == null) {
                                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g());
                                long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
                                long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
                                C13567j jVar = null;
                                String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                                if (j == 0 || j2 == 0 || string == null) {
                                    hVar = null;
                                } else {
                                    hVar = new C13565h(Long.valueOf(j), Long.valueOf(j2));
                                    hVar.f35399c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                                    SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g());
                                    if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                                        jVar = new C13567j(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                                    }
                                    hVar.f35401e = jVar;
                                    hVar.f35400d = Long.valueOf(System.currentTimeMillis());
                                    hVar.f35402f = UUID.fromString(string);
                                }
                                C13544a.f35358f = hVar;
                            }
                        }
                    });
                }
            });
        }
    }
}
