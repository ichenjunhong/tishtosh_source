package com.bytedance.apm.internal;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventListener;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.apm.impl.SlardarConfigManagerImpl;
import com.bytedance.apm.p465a.p467b.C8914a;
import com.bytedance.apm.p471b.C8949a;
import com.bytedance.apm.p476c.C8977a;
import com.bytedance.apm.p476c.C8979b;
import com.bytedance.apm.p476c.C8981d;
import com.bytedance.apm.p476c.p477a.C8978a;
import com.bytedance.apm.p478d.C9001b;
import com.bytedance.apm.p478d.C9007d;
import com.bytedance.apm.p480f.C9012a;
import com.bytedance.apm.p486i.C9051b;
import com.bytedance.apm.p489l.C9103c;
import com.bytedance.apm.p489l.C9108e;
import com.bytedance.apm.p489l.C9111g;
import com.bytedance.apm.p489l.C9119i;
import com.bytedance.apm.p489l.p490a.C9082a;
import com.bytedance.apm.p493m.C9126a;
import com.bytedance.apm.p497o.C9148a;
import com.bytedance.apm.p498p.C9160a;
import com.bytedance.apm.p498p.C9171b;
import com.bytedance.apm.p498p.C9173c;
import com.bytedance.apm.p498p.C9176d;
import com.bytedance.apm.p501q.C9179a;
import com.bytedance.apm.p501q.C9185g;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.apm.trace.C9782a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.apm.trace.p564a.C9785b;
import com.bytedance.news.common.service.manager.C12399a;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.services.apm.api.C13221d;
import com.bytedance.services.apm.api.C13225h;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmDelegate implements C13226a {

    /* renamed from: l */
    public static volatile boolean f24740l;

    /* renamed from: a */
    public C9160a f24741a;

    /* renamed from: b */
    public C9176d f24742b;

    /* renamed from: c */
    public C9007d f24743c;

    /* renamed from: d */
    C9051b f24744d;

    /* renamed from: e */
    volatile ExecutorService f24745e;

    /* renamed from: f */
    public C13221d f24746f;

    /* renamed from: g */
    public SlardarConfigManagerImpl f24747g;

    /* renamed from: h */
    public volatile boolean f24748h;

    /* renamed from: i */
    public volatile boolean f24749i;

    /* renamed from: j */
    public volatile boolean f24750j;

    /* renamed from: k */
    boolean f24751k;

    /* renamed from: m */
    public Set<Object> f24752m;

    /* renamed from: n */
    C9103c f24753n;

    /* renamed from: o */
    boolean f24754o;

    /* renamed from: p */
    public boolean f24755p;

    /* renamed from: q */
    List<String> f24756q;

    /* renamed from: r */
    List<String> f24757r;

    /* renamed from: s */
    List<String> f24758s;

    /* renamed from: t */
    private C9001b f24759t;

    /* renamed from: u */
    private ConcurrentHashMap<String, JSONObject> f24760u;

    /* renamed from: v */
    private final Object f24761v;

    /* renamed from: com.bytedance.apm.internal.ApmDelegate$a */
    static class C9067a {

        /* renamed from: a */
        public static final ApmDelegate f24778a = new ApmDelegate();
    }

    /* renamed from: a */
    public static ApmDelegate m17947a() {
        return C9067a.f24778a;
    }

    private void initEvilMethodTraceInject() {
    }

    /* renamed from: d */
    public final C9001b mo16436d() {
        if (this.f24759t == null) {
            return C9001b.m17803a().mo16329a();
        }
        return this.f24759t;
    }

    private ApmDelegate() {
        this.f24761v = new Object();
        this.f24754o = false;
        this.f24755p = true;
        this.f24760u = new ConcurrentHashMap<>();
    }

    /* renamed from: f */
    public final JSONObject mo16437f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_usage", this.f24753n.f24869a);
            jSONObject.put("stat_speed", this.f24753n.f24871g);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: g */
    private void m17949g() {
        this.f24747g = new SlardarConfigManagerImpl();
        this.f24747g.registerConfigListener(this);
        C12401c.m24977a(IConfigManager.class, this.f24747g);
        C12401c.m24976a(IMonitorLogManager.class, (C12399a<T>) new C12399a<IMonitorLogManager>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo16439a() {
                return new MonitorLogManagerImpl();
            }
        });
        C12401c.m24976a(IActivityLifeManager.class, (C12399a<T>) new C12399a<IActivityLifeManager>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo16439a() {
                return ActivityLifeObserver.getInstance();
            }
        });
        C12401c.m24976a(IApmAgent.class, (C12399a<T>) new C12399a<IApmAgent>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo16439a() {
                return new ApmAgentServiceImpl();
            }
        });
        C12401c.m24976a(ILaunchTrace.class, (C12399a<T>) new C12399a<ILaunchTrace>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo16439a() {
                return new LaunchTraceImpl();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16432b() {
        if (!this.f24754o) {
            this.f24754o = true;
            C9148a.m18169a().post(new Runnable() {
                public final void run() {
                    C8981d.m17777a();
                }
            });
            C8979b bVar = new C8979b();
            bVar.mo16269a(this.f24743c.f24529k);
            bVar.mo16271a(this.f24743c.f24528j);
            bVar.mo16268a();
            if (ActivityLifeObserver.getInstance().isForeground()) {
                bVar.mo16272b();
            }
        }
    }

    /* renamed from: c */
    public final void mo16435c() {
        if (this.f24752m != null) {
            Iterator it = this.f24752m.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private static void initTraceEvilMethod() {
        f24740l = true;
        C9782a a = C9782a.m19570a();
        if (!a.f26628e) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                C8981d.m17777a();
                C8981d.m17778a((C8978a) new C8978a() {
                    /* renamed from: c */
                    public final boolean mo16265c() {
                        return C9782a.this.f26624a;
                    }

                    /* renamed from: d */
                    public final void mo16266d() {
                        super.mo16266d();
                        C9782a aVar = C9782a.this;
                        long[] jArr = aVar.f26625b;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        jArr[0] = uptimeMillis;
                        aVar.f26627d = uptimeMillis;
                        aVar.f26625b[2] = SystemClock.currentThreadTimeMillis();
                        MethodCollector.m19564i(1048574);
                        synchronized (aVar.f26626c) {
                            Iterator it = aVar.f26626c.iterator();
                            while (it.hasNext()) {
                                C8977a aVar2 = (C8977a) it.next();
                                if (!aVar2.f24438a) {
                                    aVar2.mo16263a(aVar.f26625b[0], aVar.f26625b[2], aVar.f26627d);
                                }
                            }
                        }
                    }

                    /* renamed from: f */
                    public final void mo16267f() {
                        super.mo16267f();
                        C9782a aVar = C9782a.this;
                        char c = 1;
                        aVar.f26625b[1] = SystemClock.uptimeMillis();
                        char c2 = 3;
                        aVar.f26625b[3] = SystemClock.currentThreadTimeMillis();
                        MethodCollector.m19565o(1048574);
                        synchronized (aVar.f26626c) {
                            Iterator it = aVar.f26626c.iterator();
                            while (it.hasNext()) {
                                C8977a aVar2 = (C8977a) it.next();
                                if (aVar2.f24438a) {
                                    aVar2.mo16264a(aVar.f26625b[0], aVar.f26625b[2], aVar.f26625b[c], aVar.f26625b[c2], aVar.f26627d, false);
                                }
                                c = 1;
                                c2 = 3;
                            }
                        }
                    }
                });
                a.f26628e = true;
            } else {
                throw new AssertionError("must be init in main thread!");
            }
        }
        synchronized (MethodCollector.f26602c) {
            if (MethodCollector.f26601b < 2 && MethodCollector.f26601b >= -2) {
                MethodCollector.f26609j.removeCallbacks(MethodCollector.f26612m);
                if (MethodCollector.f26603d != null) {
                    MethodCollector.f26601b = 2;
                } else {
                    throw new RuntimeException("MethodCollector sBuffer == null");
                }
            }
        }
        new C9785b().mo17627b();
    }

    /* renamed from: e */
    public final void mo16224e() {
        boolean z;
        boolean z2 = true;
        this.f24748h = true;
        if (this.f24744d != null) {
            this.f24744d.mo16382a();
        }
        JSONObject config = this.f24747g.getConfig();
        if (this.f24751k) {
            if (C9185g.m18232a(config, "performance_modules", "fd", "enable_upload") == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                new C9108e().mo16446g();
            }
            new C9119i().mo16446g();
        }
        if (C9185g.m18232a(config, "performance_modules", "battery", "enable_upload") != 1) {
            z2 = false;
        }
        if (z2 && this.f24743c.f24531m) {
            C8949a.m17661a().mo16446g();
        }
        if (this.f24743c.f24527i && C9111g.m18066a().mo16479b("block_monitor")) {
            mo16432b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16427a(Context context) {
        if (this.f24752m != null) {
            Iterator it = this.f24752m.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo16433b(String str) {
        if (!this.f24748h || this.f24747g == null) {
            return false;
        }
        return this.f24747g.getServiceSwitch(str);
    }

    /* renamed from: c */
    public final JSONObject mo16434c(String str) {
        JSONObject a = C9185g.m18233a((JSONObject) this.f24760u.get(str));
        if (a == null) {
            return new JSONObject();
        }
        return a;
    }

    /* renamed from: a */
    static void m17948a(C9007d dVar) {
        List<String> list = dVar.f24520b;
        if (!C9190h.m18253a(list)) {
            try {
                String host = new URL((String) list.get(0)).getHost();
                C9126a.m18106a(host);
                C8914a.m17637a(host);
            } catch (MalformedURLException unused) {
            }
        }
        List<String> list2 = dVar.f24521c;
        if (!C9190h.m18253a(list)) {
            C9220a.m18314b((String) list2.get(0));
        }
    }

    /* renamed from: a */
    public final void mo16429a(C13225h hVar) {
        if (this.f24752m != null) {
            Iterator it = this.f24752m.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final void mo16430a(Runnable runnable) {
        if (this.f24745e == null) {
            synchronized (this) {
                if (this.f24745e == null) {
                    this.f24745e = C9068a.m17970a(1);
                }
            }
        }
        this.f24745e.submit(runnable);
    }

    /* renamed from: a */
    public final boolean mo16431a(String str) {
        if (!this.f24748h || this.f24747g == null) {
            return false;
        }
        return this.f24747g.getLogTypeSwitch(str);
    }

    /* renamed from: a */
    public final void mo16428a(Context context, C9001b bVar) {
        if (!this.f24749i) {
            this.f24749i = true;
            this.f24759t = bVar;
            if (this.f24741a != null) {
                this.f24759t.f24494e = this.f24741a;
            }
            if (this.f24742b != null) {
                this.f24759t.f24491b = this.f24742b.f25136b;
                this.f24759t.f24492c = this.f24742b.f25135a;
                this.f24759t.f24495f = this.f24742b.f25138d;
                this.f24759t.f24496g = (long) this.f24742b.f25137c;
            }
            C9012a.m17812a(bVar.f24490a);
            C9171b.m18194a(bVar.f24497h);
            C9171b.m18195a(bVar.f24498i);
            Application a = C9179a.m18206a(context);
            C8976c.m17740a((Context) a);
            ActivityLifeObserver.init(a);
            m17949g();
            C8976c.m17742a(bVar.f24501l);
            this.f24751k = C8976c.m17747c();
            if (this.f24751k) {
                C9082a.m17999a(a, this.f24759t.f24499j);
                if (bVar.f24491b) {
                    new C9173c().mo16544a();
                }
                AutoPageTraceHelper.setMaxValidTimeMs(bVar.f24492c);
                AutoLaunchTraceHelper.setMaxValidTimeMs(bVar.f24493d);
                C8976c.m17739a(System.currentTimeMillis());
                initEvilMethodTraceInject();
            }
            OkHttpEventListener.setIgnoreMonitorLabel(this.f24759t.f24500k);
        }
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        if (optJSONObject != null) {
            this.f24755p = optJSONObject.optBoolean("enable_active_upload_alog", true);
        } else {
            this.f24755p = true;
        }
    }
}
