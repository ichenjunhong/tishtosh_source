package com.bytedance.crash.p551k.p552a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9686b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.k.a.b */
public class C9619b {

    /* renamed from: v */
    private static volatile C9619b f26244v;

    /* renamed from: a */
    public List<String> f26245a = new ArrayList();

    /* renamed from: b */
    public List<Long> f26246b = new ArrayList();

    /* renamed from: c */
    public List<String> f26247c = new ArrayList();

    /* renamed from: d */
    public List<Long> f26248d = new ArrayList();

    /* renamed from: e */
    public LinkedList<C9621a> f26249e = new LinkedList<>();

    /* renamed from: f */
    public String f26250f;

    /* renamed from: g */
    public long f26251g;

    /* renamed from: h */
    public String f26252h;

    /* renamed from: i */
    public long f26253i;

    /* renamed from: j */
    public String f26254j;

    /* renamed from: k */
    public long f26255k;

    /* renamed from: l */
    public String f26256l;

    /* renamed from: m */
    public long f26257m;

    /* renamed from: n */
    public String f26258n;

    /* renamed from: o */
    public long f26259o;

    /* renamed from: p */
    public boolean f26260p = false;

    /* renamed from: q */
    public long f26261q = -1;

    /* renamed from: r */
    public int f26262r = 50;

    /* renamed from: s */
    public int f26263s;

    /* renamed from: t */
    private Application f26264t;

    /* renamed from: u */
    private Context f26265u;

    /* renamed from: com.bytedance.crash.k.a.b$a */
    public static class C9621a {

        /* renamed from: a */
        String f26267a;

        /* renamed from: b */
        String f26268b;

        /* renamed from: c */
        long f26269c;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (C9686b.f26416a == null) {
                C9686b.f26416a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            }
            sb.append(C9686b.f26416a.format(new Date(this.f26269c)));
            sb.append(" : ");
            sb.append(this.f26267a);
            sb.append(' ');
            sb.append(this.f26268b);
            return sb.toString();
        }

        C9621a(String str, String str2, long j) {
            this.f26268b = str2;
            this.f26269c = j;
            this.f26267a = str;
        }
    }

    /* renamed from: a */
    public static C9619b m19170a() {
        if (f26244v == null) {
            synchronized (C9619b.class) {
                if (f26244v == null) {
                    f26244v = new C9619b(C9616k.m19155g());
                }
            }
        }
        return f26244v;
    }

    /* renamed from: c */
    private JSONArray m19172c() {
        JSONArray jSONArray = new JSONArray();
        if (this.f26245a == null || this.f26245a.isEmpty()) {
            return jSONArray;
        }
        int i = 0;
        while (i < this.f26245a.size()) {
            try {
                jSONArray.put(m19171a((String) this.f26245a.get(i), ((Long) this.f26246b.get(i)).longValue()));
                i++;
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    private JSONArray m19173d() {
        JSONArray jSONArray = new JSONArray();
        if (this.f26247c == null || this.f26247c.isEmpty()) {
            return jSONArray;
        }
        int i = 0;
        while (i < this.f26247c.size()) {
            try {
                jSONArray.put(m19171a((String) this.f26247c.get(i), ((Long) this.f26248d.get(i)).longValue()));
                i++;
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public final JSONObject mo17455b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", m19171a(this.f26250f, this.f26251g));
            jSONObject.put("last_start_activity", m19171a(this.f26252h, this.f26253i));
            jSONObject.put("last_resume_activity", m19171a(this.f26254j, this.f26255k));
            jSONObject.put("last_pause_activity", m19171a(this.f26256l, this.f26257m));
            jSONObject.put("last_stop_activity", m19171a(this.f26258n, this.f26259o));
            jSONObject.put("alive_activities", m19172c());
            jSONObject.put("finish_activities", m19173d());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private C9619b(Application application) {
        this.f26265u = application;
        this.f26264t = application;
        try {
            if (VERSION.SDK_INT >= 14 && this.f26264t != null) {
                this.f26264t.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityResumed(Activity activity) {
                        C9619b.this.f26254j = activity.getClass().getName();
                        C9619b.this.f26255k = System.currentTimeMillis();
                        C9619b.this.f26263s++;
                        C9619b.this.f26260p = true;
                        C9619b.this.mo17454a(C9619b.this.f26254j, C9619b.this.f26255k, "onResume");
                    }

                    public final void onActivityStarted(Activity activity) {
                        C9619b.this.f26252h = activity.getClass().getName();
                        C9619b.this.f26253i = System.currentTimeMillis();
                        C9619b.this.mo17454a(C9619b.this.f26252h, C9619b.this.f26253i, "onStart");
                    }

                    public final void onActivityStopped(Activity activity) {
                        C9619b.this.f26258n = activity.getClass().getName();
                        C9619b.this.f26259o = System.currentTimeMillis();
                        C9619b.this.mo17454a(C9619b.this.f26258n, C9619b.this.f26259o, "onStop");
                    }

                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int indexOf = C9619b.this.f26245a.indexOf(name);
                        if (indexOf >= 0 && indexOf < C9619b.this.f26245a.size()) {
                            C9619b.this.f26245a.remove(indexOf);
                            C9619b.this.f26246b.remove(indexOf);
                        }
                        C9619b.this.f26247c.add(name);
                        long currentTimeMillis = System.currentTimeMillis();
                        C9619b.this.f26248d.add(Long.valueOf(currentTimeMillis));
                        C9619b.this.mo17454a(name, currentTimeMillis, "onDestroy");
                    }

                    public final void onActivityPaused(Activity activity) {
                        C9619b.this.f26256l = activity.getClass().getName();
                        C9619b.this.f26257m = System.currentTimeMillis();
                        C9619b.this.f26263s--;
                        if (C9619b.this.f26263s == 0) {
                            C9619b.this.f26260p = false;
                            C9619b.this.f26261q = SystemClock.uptimeMillis();
                        } else if (C9619b.this.f26263s < 0) {
                            C9619b.this.f26263s = 0;
                            C9619b.this.f26260p = false;
                            C9619b.this.f26261q = SystemClock.uptimeMillis();
                        }
                        C9619b.this.mo17454a(C9619b.this.f26256l, C9619b.this.f26257m, "onPause");
                    }

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        C9619b.this.f26250f = activity.getClass().getName();
                        C9619b.this.f26251g = System.currentTimeMillis();
                        C9619b.this.f26245a.add(C9619b.this.f26250f);
                        C9619b.this.f26246b.add(Long.valueOf(C9619b.this.f26251g));
                        C9619b.this.mo17454a(C9619b.this.f26250f, C9619b.this.f26251g, "onCreate");
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static JSONObject m19171a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LeakCanaryFileProvider.f132049i, str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo17454a(String str, long j, String str2) {
        C9621a aVar = null;
        try {
            if (this.f26249e.size() >= this.f26262r) {
                aVar = (C9621a) this.f26249e.poll();
                if (aVar != null) {
                    this.f26249e.add(aVar);
                }
            }
            if (aVar == null) {
                aVar = new C9621a(str, str2, j);
                this.f26249e.add(aVar);
            }
            aVar.f26268b = str2;
            aVar.f26267a = str;
            aVar.f26269c = j;
        } catch (Throwable unused) {
        }
    }
}
