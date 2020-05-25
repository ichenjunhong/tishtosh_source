package com.p683ss.android.ugc.aweme.base;

import android.content.Context;
import android.os.Process;
import com.bytedance.apm.C8908a;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p478d.C9007d.C9009a;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9023e;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.p582g.p583a.p584a.C9945a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.o */
public class C23569o {

    /* renamed from: a */
    private static final List<Runnable> f62691a = new ArrayList();

    /* renamed from: b */
    public static final ExecutorService f62692b;

    /* renamed from: c */
    private static final ThreadFactory f62693c = new ThreadFactory() {
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }, "AwemeMonitor");
        }
    };

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), f62693c, new DiscardOldestPolicy());
        f62692b = threadPoolExecutor;
    }

    /* renamed from: a */
    private static synchronized void m57772a() {
        synchronized (C23569o.class) {
            if (f62691a != null) {
                for (Runnable submit : f62691a) {
                    f62692b.submit(submit);
                }
                f62691a.clear();
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m57775a(Runnable runnable) {
        C9945a aVar;
        synchronized (C23569o.class) {
            if (ApmDelegate.m17947a().f24748h) {
                aVar = C9945a.f27028a;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                f62691a.add(runnable);
            } else {
                f62692b.submit(runnable);
            }
        }
    }

    /* renamed from: a */
    public static void m57774a(Context context, C9009a aVar) {
        C8908a.m17633a(aVar.mo16334a());
        m57772a();
    }

    /* renamed from: a */
    public static void m57779a(final String str, final JSONObject jSONObject) {
        m57775a(new Runnable() {
            public final void run() {
                C9951d.m19997a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static void m57776a(String str, int i, JSONObject jSONObject) {
        C9951d.m19996a(str, i, jSONObject);
    }

    /* renamed from: b */
    public static void m57782b(final String str, final String str2, final float f) {
        m57775a(new Runnable() {
            public final void run() {
            }
        });
    }

    /* renamed from: b */
    public static void m57783b(final String str, final String str2, final JSONObject jSONObject) {
        m57775a(new Runnable() {
            public final void run() {
                try {
                    if (jSONObject != null) {
                        jSONObject.put("service", str2);
                    }
                } catch (Exception unused) {
                }
                C9951d.m19997a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static void m57778a(final String str, final String str2, final float f) {
        m57775a(new Runnable() {
            public final void run() {
                C9149b.m18170a().mo16524a((Runnable) new Runnable(str, str2, f) {

                    /* renamed from: a */
                    final /* synthetic */ String f24315a;

                    /* renamed from: b */
                    final /* synthetic */ String f24316b;

                    /* renamed from: c */
                    final /* synthetic */ float f24317c;

                    public final void run() {
                        C9014a.m17825a().mo16336a(new C9023e(this.f24315a, this.f24316b, this.f24317c));
                    }

                    {
                        this.f24315a = r1;
                        this.f24316b = r2;
                        this.f24317c = r3;
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m57780a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C9951d.m19998a(str, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m57777a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C8936b.m17652a(str, i, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m57773a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C9951d.m19995a(j, j2, str, str2, str3, i, jSONObject);
    }

    /* renamed from: b */
    public static void m57781b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C9951d.m20001b(j, j2, str, str2, str3, i, jSONObject);
    }
}
