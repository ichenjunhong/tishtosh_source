package com.bytedance.apm.p471b;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p471b.p472a.C8953b;
import com.bytedance.apm.p471b.p472a.C8954c;
import com.bytedance.apm.p471b.p472a.C8955d;
import com.bytedance.apm.p471b.p473b.C8956a;
import com.bytedance.apm.p471b.p474c.C8970d;
import com.bytedance.apm.p471b.p474c.C8971e;
import com.bytedance.apm.p471b.p474c.C8972f;
import com.bytedance.apm.p471b.p474c.C8973g;
import com.bytedance.apm.p471b.p474c.C8974h;
import com.bytedance.apm.p471b.p474c.C8975i;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.apm.p489l.C9081a;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p497o.C9149b.C9153b;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.a */
public final class C8949a extends C9081a {

    /* renamed from: a */
    public final Map<String, C8975i> f24336a;

    /* renamed from: b */
    public boolean f24337b;

    /* renamed from: g */
    private long f24338g;

    /* renamed from: h */
    private boolean f24339h;

    /* renamed from: i */
    private long f24340i;

    /* renamed from: com.bytedance.apm.b.a$a */
    static final class C8951a {

        /* renamed from: a */
        public static final C8949a f24341a = new C8949a();
    }

    /* renamed from: a */
    public static C8949a m17661a() {
        return C8951a.f24341a;
    }

    /* renamed from: c */
    public final boolean mo16222c() {
        return true;
    }

    /* renamed from: d */
    public final long mo16223d() {
        return this.f24340i * 60000;
    }

    /* renamed from: e */
    public final void mo16224e() {
        super.mo16224e();
        C8956a.m17674a().mo16234b();
    }

    private C8949a() {
        this.f24336a = new ConcurrentHashMap();
        this.f24338g = -1;
        this.f24812e = "battery";
    }

    /* renamed from: i */
    private void m17662i() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24338g != -1) {
            C8956a.m17674a().f24352b = ActivityLifeObserver.getInstance().getTopActivityClassName();
            C8956a a = C8956a.m17674a();
            long j = currentTimeMillis;
            C9040b bVar = new C9040b(this.f24339h, j, "ground_record", currentTimeMillis - this.f24338g);
            a.mo16233a(bVar);
        }
        this.f24338g = currentTimeMillis;
    }

    /* renamed from: f */
    public final void mo16225f() {
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("onTimer record, current is background? : ");
            sb.append(ActivityLifeObserver.getInstance().isForeground());
            String[] strArr = {sb.toString()};
        }
        m17662i();
        for (C8975i j_ : this.f24336a.values()) {
            j_.mo16260j_();
        }
    }

    /* renamed from: b */
    public final void mo16220b() {
        if (VERSION.SDK_INT >= 21 && VERSION.SDK_INT <= 29) {
            this.f24339h = ActivityLifeObserver.getInstance().isForeground();
            this.f24338g = System.currentTimeMillis();
            C8970d dVar = new C8970d();
            C8972f fVar = new C8972f();
            C8974h hVar = new C8974h();
            try {
                C8953b bVar = new C8953b();
                bVar.mo16227a("alarm", dVar);
                bVar.mo16227a("location", fVar);
                bVar.mo16227a("power", hVar);
                if (bVar.f24345a.size() != 0) {
                    Class cls = Class.forName("android.os.ServiceManager");
                    Method declaredMethod = cls.getDeclaredMethod("getService", new Class[]{String.class});
                    Field declaredField = cls.getDeclaredField("sCache");
                    declaredField.setAccessible(true);
                    Object obj = null;
                    Map map = (Map) declaredField.get(null);
                    for (Entry entry : bVar.f24345a.entrySet()) {
                        String str = (String) entry.getKey();
                        C8955d dVar2 = (C8955d) entry.getValue();
                        IBinder iBinder = (IBinder) declaredMethod.invoke(obj, new Object[]{str});
                        ClassLoader classLoader = cls.getClassLoader();
                        Class[] clsArr = {IBinder.class};
                        C8954c cVar = new C8954c(iBinder, dVar2);
                        IBinder iBinder2 = (IBinder) Proxy.newProxyInstance(classLoader, clsArr, cVar);
                        cVar.f24347b = iBinder2;
                        map.put(str, iBinder2);
                        obj = null;
                    }
                }
                C8971e eVar = new C8971e();
                C8973g gVar = new C8973g();
                this.f24336a.put("alarm", dVar);
                this.f24336a.put("cpu_active_time", eVar);
                this.f24336a.put("traffic", gVar);
                this.f24336a.put("location", fVar);
                this.f24336a.put("power", hVar);
                C9149b.m18170a().mo16523a((C9153b) this);
                if (C8976c.m17747c() && this.f24810c) {
                    C8956a.m17674a().mo16234b();
                }
            } catch (Exception e) {
                if (C8976c.m17751g()) {
                    StringBuilder sb = new StringBuilder("hook failed: ");
                    sb.append(e.getMessage());
                    String[] strArr = {sb.toString()};
                }
                ActivityLifeObserver.getInstance().unregister(this);
                ((IConfigManager) C12401c.m24975a(IConfigManager.class)).unregisterConfigListener(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        super.mo16218a(activity);
        if (C8976c.m17751g()) {
            new String[1][0] = "onChangeToBack, record data";
        }
        m17662i();
        for (C8975i b : this.f24336a.values()) {
            b.mo16248b();
        }
        this.f24339h = false;
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
        super.mo16221b(activity);
        if (C8976c.m17751g()) {
            new String[1][0] = "onChangeToFront, record data";
        }
        m17662i();
        for (C8975i c : this.f24336a.values()) {
            c.mo16249c();
        }
        this.f24339h = true;
    }

    /* renamed from: a */
    public final void mo16219a(JSONObject jSONObject) {
        this.f24340i = jSONObject.optLong("battery_record_interval", 10);
        boolean z = false;
        int optInt = jSONObject.optInt("enable_upload", 0);
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("mRecordInterval:");
            sb.append(this.f24340i);
            sb.append(",mBatteryCollectEnabled");
            sb.append(optInt);
            String[] strArr = {sb.toString()};
        }
        if (optInt <= 0 || this.f24340i <= 0) {
            this.f24336a.clear();
            ActivityLifeObserver.getInstance().unregister(this);
            C9149b.m18170a().mo16525b(this);
        }
        if (jSONObject.optInt("trace_enable", 0) == 1) {
            z = true;
        }
        this.f24337b = z;
    }
}
