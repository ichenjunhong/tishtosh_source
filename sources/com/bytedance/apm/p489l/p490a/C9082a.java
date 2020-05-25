package com.bytedance.apm.p489l.p490a;

import android.app.Activity;
import android.app.Application;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p478d.C8998a;
import com.bytedance.apm.p489l.p490a.p491a.C9088a;
import com.bytedance.apm.p489l.p490a.p491a.C9089b;
import com.bytedance.apm.p489l.p490a.p491a.C9090c;
import com.bytedance.apm.p489l.p490a.p491a.C9090c.C9091a;
import com.bytedance.apm.p489l.p490a.p491a.C9092d;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.apm.l.a.a */
public final class C9082a {

    /* renamed from: g */
    private static C9082a f24815g = new C9082a();

    /* renamed from: h */
    private static boolean f24816h = false;

    /* renamed from: a */
    public Handler f24817a;

    /* renamed from: b */
    public ReferenceQueue<Object> f24818b;

    /* renamed from: c */
    public Set<String> f24819c;

    /* renamed from: d */
    public C8998a f24820d;

    /* renamed from: e */
    public C9090c f24821e;

    /* renamed from: f */
    private Handler f24822f;

    /* renamed from: i */
    private long f24823i;

    /* renamed from: a */
    public final void mo16448a() {
        while (true) {
            C9089b bVar = (C9089b) this.f24818b.poll();
            if (bVar != null) {
                this.f24819c.remove(bVar.f24835a);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo16450a(C9089b bVar) {
        if (!this.f24819c.contains(bVar.f24835a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m17998a(Application application) {
        this.f24822f = new Handler(Looper.getMainLooper());
        this.f24818b = new ReferenceQueue<>();
        this.f24819c = new CopyOnWriteArraySet();
        application.registerActivityLifecycleCallbacks(new C9092d() {
            public final void onActivityDestroyed(Activity activity) {
                boolean b = ApmDelegate.m17947a().mo16433b("activity_leak_switch");
                if (C8976c.m17751g()) {
                    StringBuilder sb = new StringBuilder("activity_leak_switch : ");
                    sb.append(b);
                    String[] strArr = {sb.toString()};
                }
                if (b) {
                    String uuid = UUID.randomUUID().toString();
                    C9082a.this.f24819c.add(uuid);
                    final C9089b bVar = new C9089b(activity, uuid, "", C9082a.this.f24818b);
                    final String localClassName = activity.getLocalClassName();
                    if (C8976c.m17751g()) {
                        StringBuilder sb2 = new StringBuilder("Wait Check Leak:");
                        sb2.append(localClassName);
                        String[] strArr2 = {sb2.toString()};
                    }
                    if (C9082a.this.f24817a != null) {
                        C9082a.this.mo16449a(bVar, localClassName);
                    } else if (C9082a.this.f24821e == null) {
                        C9082a.this.f24821e = new C9090c("LeakCheck-Thread");
                        C9082a.this.f24821e.f24837a = new C9091a() {
                            /* renamed from: a */
                            public final void mo16453a() {
                                if (C8976c.m17751g()) {
                                    new String[1][0] = "onLooperPrepared()";
                                }
                                C9082a.this.f24817a = new Handler(C9082a.this.f24821e.getLooper());
                                C9082a.this.mo16449a(bVar, localClassName);
                            }
                        };
                        C9082a.this.f24821e.start();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m17999a(Application application, C8998a aVar) {
        if (!(application == null || aVar == null || f24816h)) {
            f24816h = true;
            f24815g.m18000b(application, aVar);
        }
    }

    /* renamed from: b */
    private void m18000b(Application application, C8998a aVar) {
        this.f24820d = aVar;
        this.f24823i = this.f24820d.f24481b;
        long currentTimeMillis = System.currentTimeMillis();
        m17998a(application);
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("initActivityLeakCheck done, cost: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms.");
            String[] strArr = {sb.toString()};
        }
    }

    /* renamed from: b */
    public final void mo16451b(C9089b bVar, String str) {
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder("Leak:");
            sb.append(str);
            String[] strArr = {sb.toString()};
        }
        final Activity activity = (Activity) bVar.get();
        if (activity != null) {
            if (this.f24820d.f24483d) {
                this.f24822f.post(new Runnable() {
                    public final void run() {
                        Looper.myQueue().addIdleHandler(new IdleHandler(activity) {

                            /* renamed from: a */
                            final /* synthetic */ Activity f24833a;

                            public final boolean queueIdle() {
                                Activity activity = this.f24833a;
                                long currentTimeMillis = System.currentTimeMillis();
                                if (activity != null && activity.getWindow() != null && activity.getWindow().peekDecorView() != null) {
                                    try {
                                        if (VERSION.SDK_INT > 16 && !activity.isDestroyed()) {
                                            return false;
                                        }
                                        if (activity.getWindow().getContext() == activity) {
                                            View rootView = activity.getWindow().peekDecorView().getRootView();
                                            ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
                                            if (viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getContext() == activity) {
                                                C9088a.m18007a(rootView, activity);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (C8976c.m17751g()) {
                                            String[] strArr = {"caught unexpected exception when unbind drawables.", th.getMessage()};
                                        }
                                    }
                                } else if (C8976c.m17751g()) {
                                    new String[1][0] = "unbindDrawables, ui or ui's window is null, skip rest works.";
                                }
                                if (C8976c.m17751g()) {
                                    StringBuilder sb = new StringBuilder("unbindDrawables done, cost: ");
                                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                                    sb.append(" ms.");
                                    String[] strArr2 = {sb.toString()};
                                }
                                return false;
                            }

                            {
                                this.f24833a = r2;
                            }
                        });
                    }
                });
            }
            if (this.f24820d.f24482c && activity != null) {
                C9088a.m18011a(activity.getClass().getName());
                if (C8976c.m17751g()) {
                    StringBuilder sb2 = new StringBuilder("upload leak activity:");
                    sb2.append(activity.getLocalClassName());
                    String[] strArr2 = {sb2.toString()};
                }
            }
            this.f24819c.remove(bVar.f24835a);
        }
    }

    /* renamed from: a */
    public final void mo16449a(final C9089b bVar, final String str) {
        Handler handler = this.f24817a;
        C90852 r1 = new Runnable() {
            public final void run() {
                try {
                    C9082a.this.mo16448a();
                    if (C9082a.this.mo16450a(bVar)) {
                        if (C8976c.m17751g()) {
                            StringBuilder sb = new StringBuilder("No Leak First Check:");
                            sb.append(str);
                            String[] strArr = {sb.toString()};
                        }
                    } else if (C9082a.this.f24820d.f24480a) {
                        C9082a aVar = C9082a.this;
                        long currentTimeMillis = System.currentTimeMillis();
                        Runtime.getRuntime().gc();
                        Thread.sleep(100);
                        System.runFinalization();
                        if (C8976c.m17751g()) {
                            StringBuilder sb2 = new StringBuilder("GC time done, cost: ");
                            sb2.append(System.currentTimeMillis() - currentTimeMillis);
                            sb2.append(" ms.");
                            String[] strArr2 = {sb2.toString()};
                        }
                        C9082a.this.mo16448a();
                        if (C9082a.this.mo16450a(bVar)) {
                            if (C8976c.m17751g()) {
                                StringBuilder sb3 = new StringBuilder("No Leak:");
                                sb3.append(str);
                                String[] strArr3 = {sb3.toString()};
                            }
                            return;
                        }
                        C9082a.this.mo16451b(bVar, str);
                    } else {
                        C9082a.this.mo16451b(bVar, str);
                    }
                } catch (InterruptedException unused) {
                    throw new AssertionError();
                } catch (Exception unused2) {
                }
            }
        };
        if (this.f24823i <= 0) {
            this.f24823i = 60000;
        }
        handler.postDelayed(r1, this.f24823i);
    }
}
