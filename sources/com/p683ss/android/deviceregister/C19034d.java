package com.p683ss.android.deviceregister;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C9415i;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.deviceregister.C19039h.C19043b;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.deviceregister.p1155b.C19008a;
import com.p683ss.android.deviceregister.p1155b.C19026b;
import com.p683ss.android.deviceregister.p1155b.C19026b.C19027a;
import com.p683ss.android.deviceregister.p1155b.p1156a.C19010a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.d */
public class C19034d {

    /* renamed from: a */
    public static volatile C19034d f52405a;

    /* renamed from: b */
    static volatile boolean f52406b;

    /* renamed from: c */
    public static Context f52407c;

    /* renamed from: d */
    public static boolean f52408d;

    /* renamed from: e */
    public static boolean f52409e;

    /* renamed from: f */
    public final C19026b f52410f = new C19026b(f52407c);

    /* renamed from: com.ss.android.deviceregister.d$a */
    public interface C19035a {
        void onDeviceRegistrationInfoChanged(String str, String str2);

        void onDidLoadLocally(boolean z);

        void onRemoteConfigUpdate(boolean z, boolean z2);
    }

    /* renamed from: a */
    public static String m46312a() {
        return C19036e.m46328a();
    }

    /* renamed from: a */
    public static void m46318a(Map map) {
        C19036e.m46329a(map);
    }

    /* renamed from: c */
    public static String m46323c() {
        return C19036e.m46330b();
    }

    /* renamed from: f */
    public static boolean m46327f() {
        return f52409e;
    }

    /* renamed from: b */
    public static String m46320b() {
        C19034d dVar = f52405a;
        String str = "";
        if (dVar != null) {
            return dVar.f52410f.f52386q;
        }
        return str;
    }

    /* renamed from: d */
    public static String m46325d() {
        C19034d dVar = f52405a;
        String str = "";
        if (dVar != null) {
            return dVar.f52410f.mo38883a();
        }
        return str;
    }

    /* renamed from: e */
    public static String m46326e() {
        C19034d dVar = f52405a;
        String str = "";
        if (dVar != null) {
            return dVar.f52410f.mo38886d();
        }
        return str;
    }

    /* renamed from: a */
    public static void m46316a(Bundle bundle) {
        if (bundle != null && bundle.size() > 0) {
            C19026b.m46280a(bundle);
        }
    }

    /* renamed from: c */
    public static boolean m46324c(Context context) {
        return C19037f.m46334b(context);
    }

    /* renamed from: b */
    public static void m46321b(Context context) {
        if (context != null && f52407c == null) {
            synchronized (C19034d.class) {
                if (f52407c == null) {
                    f52407c = context.getApplicationContext();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m46317a(C19035a aVar) {
        C19026b.m46281a(aVar);
    }

    private C19034d(int i) {
        C19008a.f52339e = f52408d;
        C19005d.f52318h = this.f52410f;
        C19026b bVar = this.f52410f;
        bVar.f52382l = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences a = C19002a.m46174a(bVar.f52380j);
        bVar.f52378h = a.getInt("last_config_version", 0);
        bVar.f52386q = a.getString("install_id", "");
        if (bVar.f52378h == C19005d.m46188c()) {
            long j = a.getLong("last_config_time", 0);
            if (j <= currentTimeMillis) {
                currentTimeMillis = j;
            }
            boolean isBadId = NetUtil.isBadId(bVar.mo38883a());
            boolean isBadId2 = NetUtil.isBadId(bVar.f52386q);
            if (!isBadId && !isBadId2) {
                bVar.f52383n = currentTimeMillis;
            }
        }
        if (C19005d.m46185a(bVar.f52380j, bVar.f52382l) || !C9415i.m18635b()) {
            bVar.f52388t = new C19027a(i);
            bVar.f52388t.start();
            return;
        }
        throw new RuntimeException("init header error.");
    }

    /* renamed from: a */
    public static void m46313a(Context context) throws IllegalArgumentException {
        if (context != null) {
            f52406b = true;
            int b = C19047j.m46366a().mo38929b();
            if (context instanceof Activity) {
                f52408d = true;
            }
            m46321b(context);
            if (f52405a == null) {
                synchronized (C19034d.class) {
                    if (f52405a == null) {
                        f52405a = new C19034d(b);
                    }
                }
            }
            C19043b bVar = (C19043b) C19047j.m46366a().f52478f.get(Integer.valueOf(b));
            if (bVar != null) {
                bVar.mo38909b(Long.valueOf(SystemClock.uptimeMillis()));
            }
            C19049l a = C19049l.m46376a();
            long currentTimeMillis = System.currentTimeMillis();
            if (a.f52487a.compareAndSet(-1, currentTimeMillis)) {
                new StringBuilder(" currentTimeMillis=").append(currentTimeMillis);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        new C19058e().start();
                        new C19056c().start();
                        new C19057d().start();
                    }
                }, 5000);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("context = null");
    }

    /* renamed from: b */
    public static void m46322b(Map<String, String> map) {
        C19034d dVar = f52405a;
        if (map == null || dVar == null) {
            if (dVar == null && f52407c != null) {
                SharedPreferences a = C35807d.m80935a(f52407c, C19002a.m46175a(), 0);
                String string = a.getString("device_id", "");
                if (!TextUtils.isEmpty(string)) {
                    map.put("device_id", string);
                }
                String string2 = a.getString("install_id", "");
                if (!TextUtils.isEmpty(string2)) {
                    map.put("install_id", string2);
                }
                String string3 = C35807d.m80935a(f52407c, C19002a.m46177c(), 0).getString("openudid", null);
                if (!TextUtils.isEmpty(string3)) {
                    map.put("openudid", string3);
                }
            }
            return;
        }
        C19034d dVar2 = f52405a;
        String str = "";
        if (dVar2 != null) {
            str = dVar2.f52410f.mo38885c();
        }
        if (str != null) {
            map.put("openudid", str);
        }
        String e = m46326e();
        if (e != null) {
            map.put("clientudid", e);
        }
        String a2 = m46312a();
        if (a2 != null) {
            map.put("install_id", a2);
        }
        String c = m46323c();
        if (c != null) {
            map.put("device_id", c);
        }
    }

    /* renamed from: a */
    public static void m46319a(boolean z) {
        C19005d.m46184a(z);
    }

    /* renamed from: a */
    public static void m46315a(Context context, boolean z) {
        C19037f.m46332a(context, z);
    }

    /* renamed from: a */
    public static void m46314a(Context context, String str) {
        if (f52406b) {
            C19010a a = C19037f.m46331a(context);
            if (a instanceof C19029c) {
                ((C19029c) a).mo38892a(context, str);
                return;
            }
            return;
        }
        throw new IllegalStateException("please init first");
    }
}
