package com.bytedance.liko.leakdetector;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.liko.leakdetector.strategy.C12284a;
import com.bytedance.liko.leakdetector.strategy.C12284a.C12287c;
import com.bytedance.liko.leakdetector.strategy.p775a.C12288a;
import com.bytedance.liko.leakdetector.strategy.p776fd.FdLeakDetector;
import com.bytedance.liko.memoryexplorer.AnalyzerEngine;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.p771a.C12265a;
import com.bytedance.liko.p771a.C12267c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.File;
import java.util.concurrent.Callable;
import leakcanary.C53362a;
import leakcanary.C53362a.C53363a;
import leakcanary.C53369f;
import leakcanary.C53369f.C53370a;
import leakcanary.C53371g;
import leakcanary.internal.C53420k;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0013i;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

public final class LeakDetectorInstaller {
    public static final LeakDetectorInstaller INSTANCE = new LeakDetectorInstaller();
    public static final long MAX_POLL_TIME = 100000;
    private static final int MAX_RETRY_COUNT = 1;
    public static final long POLL_TIME = 10000;
    private static Handler handler;
    private static boolean hasExcuteBackgroud;
    private static int retryCount;
    private static long trySumTime;

    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$a */
    static final class C12273a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Context f32384a;

        C12273a(Context context) {
            this.f32384a = context;
        }

        public final /* synthetic */ Object call() {
            MemoryConfig.initJsonConfig(C12267c.m24749c().toString());
            final C52725c cVar = new C52725c();
            cVar.element = MemoryConfig.getMemoryConfig().strategy;
            Handler handler = LeakDetectorInstaller.INSTANCE.getHandler();
            if (handler != null) {
                return Boolean.valueOf(handler.post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C12273a f32385a;

                    {
                        this.f32385a = r1;
                    }

                    public final void run() {
                        LeakDetectorInstaller.INSTANCE.install(this.f32385a.f32384a, cVar.element);
                    }
                }));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$b */
    static final class C12275b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f32387a;

        C12275b(String str) {
            this.f32387a = str;
        }

        public final /* synthetic */ Object call() {
            LeakDetectorInstaller.INSTANCE.runAnalysis(this.f32387a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$c */
    static final class C12276c<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Context f32388a;

        /* renamed from: b */
        final /* synthetic */ int f32389b;

        C12276c(Context context, int i) {
            this.f32388a = context;
            this.f32389b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((Boolean) obj).booleanValue() && !LeakDetectorInstaller.INSTANCE.getHasExcuteBackgroud()) {
                C12279a.m24757a("excuteStrategy runInbackground");
                LeakDetectorInstaller.INSTANCE.setHasExcuteBackgroud(true);
                LeakDetectorInstaller.INSTANCE.excuteStrategy(this.f32388a, this.f32389b);
            }
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$d */
    public static final class C12277d extends Handler {

        /* renamed from: a */
        final /* synthetic */ Context f32390a;

        public final void handleMessage(Message message) {
            if (LeakDetectorInstaller.INSTANCE.getTrySumTime() > LeakDetectorInstaller.MAX_POLL_TIME) {
                LeakDetectorInstaller.INSTANCE.setTrySumTime(0);
                C12279a.m24757a("Leak detector install timeout");
                return;
            }
            int optInt = C12267c.m24749c().optInt("strategy", 0);
            if (optInt > 0) {
                LeakDetectorInstaller.INSTANCE.initConfig(this.f32390a);
                LeakDetectorInstaller.INSTANCE.setTrySumTime(0);
            } else if (optInt == 0) {
                LeakDetectorInstaller leakDetectorInstaller = LeakDetectorInstaller.INSTANCE;
                leakDetectorInstaller.setTrySumTime(leakDetectorInstaller.getTrySumTime() + 10000);
                C12279a.m24757a("Leak detector strategy < 1,retry");
                sendEmptyMessageDelayed(0, 10000);
            } else {
                if (optInt < 0) {
                    C12279a.m24757a("Leak detector strategy < 0, finish");
                }
            }
        }

        C12277d(Context context, Looper looper) {
            this.f32390a = context;
            super(looper);
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.LeakDetectorInstaller$e */
    public static final class C12278e extends Handler {

        /* renamed from: a */
        final /* synthetic */ Context f32391a;

        public final void handleMessage(Message message) {
            LeakDetectorInstaller.INSTANCE.tryInstall(this.f32391a);
        }

        C12278e(Context context, Looper looper) {
            this.f32391a = context;
            super(looper);
        }
    }

    private LeakDetectorInstaller() {
    }

    public final Handler getHandler() {
        return handler;
    }

    public final boolean getHasExcuteBackgroud() {
        return hasExcuteBackgroud;
    }

    public final int getRetryCount() {
        return retryCount;
    }

    public final long getTrySumTime() {
        return trySumTime;
    }

    public final void setHandler(Handler handler2) {
        handler = handler2;
    }

    public final void setHasExcuteBackgroud(boolean z) {
        hasExcuteBackgroud = z;
    }

    public final void setRetryCount(int i) {
        retryCount = i;
    }

    public final void setTrySumTime(long j) {
        trySumTime = j;
    }

    public final void initConfig(Context context) {
        C0013i.m16a((Callable<TResult>) new C12273a<TResult>(context));
    }

    public final void runAnalysisInBackground(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C0013i.m16a((Callable<TResult>) new C12275b<TResult>(str));
    }

    public final synchronized void runAnalysis(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C12284a.m24769a(true);
        StringBuilder sb = new StringBuilder("start Analysis:hprof path:");
        sb.append(str);
        C12279a.m24757a(sb.toString());
        try {
            new AnalyzerEngine().runAnalysis(new File(str), MemoryConfig.getMemoryConfig());
        } catch (Throwable th) {
            new File(str).delete();
            StringBuilder sb2 = new StringBuilder("runAnalysis fail! delete file ");
            sb2.append(th.toString());
            C12279a.m24757a(sb2.toString());
        }
        C12284a.m24769a(false);
        C12279a.m24757a("end Analysis");
    }

    public final void tryInstall(Context context) {
        if ("local_test".equals(C11010c.m22295p())) {
            boolean z = true;
            try {
                C12267c.m24746a(true);
                C12279a.m24757a("Leak detector start install");
                if (context == null) {
                    Boolean.valueOf(true);
                }
                if (context != null) {
                    SharedPreferences a = C35807d.m80935a(context, "LeakDetectorSp", 0);
                    if (a != null) {
                        z = a.getBoolean("open_leak_detector_on_local_test", true);
                    }
                }
                C12267c.m24746a(z);
                if (!C12267c.m24747a()) {
                    C12279a.m24757a("Leak detector is disabled");
                    return;
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("SPHelper crash!\n");
                sb.append(th);
                C12279a.m24757a(sb.toString());
                int i = retryCount;
                retryCount = i + 1;
                if (i <= 0) {
                    new C12278e(context, Looper.getMainLooper()).sendEmptyMessageDelayed(0, 10000);
                    C12279a.m24757a("retry install in 10s");
                }
                return;
            }
        }
        Handler dVar = new C12277d(context, Looper.getMainLooper());
        handler = dVar;
        dVar.sendEmptyMessageDelayed(0, 10000);
    }

    public final void runInbackground(Context context, int i) {
        C52711k.m112240b(context, "context");
        if (C11010c.m22289j() > 0) {
            C11016e.m22309d().mo6545f((C1710e<? super T>) new C12276c<Object>(context, i));
        } else {
            excuteStrategy(context, i);
        }
    }

    public final void setLeakCanaryConfig(boolean z, int i) {
        C53369f.m113442a(C53370a.m113443a(C53369f.m113441a(), false, z, i, false, 0, false, false, 121, null));
    }

    public final void install(Context context, int i) {
        Context context2;
        Context context3 = null;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        if (context2 instanceof Application) {
            context3 = context2;
        }
        Application application = (Application) context3;
        if (application != null) {
            if ((i & 1) != 0) {
                try {
                    C12279a.m24757a("LeakCanaryInstaller install success");
                    C53371g gVar = C53371g.f132010a;
                    Context context4 = application;
                    C53371g.m113445a();
                    if (C53420k.m113480a()) {
                        C53174a a = C53173a.m112969a();
                        if (a != null) {
                            a.mo110681a("LeakCanary has been installed");
                        }
                    } else {
                        if (context4 == null) {
                            C52711k.m112234a();
                        }
                        Context applicationContext = context4.getApplicationContext();
                        if (applicationContext != null) {
                            C53420k.f132116e.mo111048a((Application) applicationContext);
                            C53174a a2 = C53173a.m112969a();
                            if (a2 != null) {
                                a2.mo110681a("LeakCanary install success");
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.app.Application");
                        }
                    }
                    INSTANCE.setLeakCanaryConfig(C12267c.f32373c, C12267c.f32371a);
                    C53362a.m113430a(C53363a.m113433a(C53362a.m113429a(), false, false, false, false, 0, 23, null));
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Leak detector install failed\n");
                    sb.append(Log.getStackTraceString(th));
                    C12279a.m24757a(sb.toString());
                }
            }
            if ((i & 2) != 0) {
                C12279a.m24757a("OOM catch install success");
                C12288a.m24772a(context);
            }
            if ((i & 8) != 0) {
                C12279a.m24757a("MemoryPeak install success");
                C12284a aVar = C12284a.f32403h;
                C52711k.m112240b(context, "context");
                C12284a.f32399d = context;
                if (!C12284a.f32400e) {
                    C12284a.f32397b.start();
                    Handler cVar = new C12287c(aVar, C12284a.f32397b.getLooper());
                    C12284a.f32398c = cVar;
                    cVar.sendEmptyMessageDelayed(0, C12267c.m24748b());
                    C12284a.f32400e = true;
                }
            }
            INSTANCE.runInbackground(context, i);
            C12279a.m24757a("Leak detector install success");
            if (C12265a.m24739a()) {
                C12279a.m24757a("fdleak install success");
                FdLeakDetector.INSTANCE.install();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void excuteStrategy(android.content.Context r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            r0 = r8 & 2
            r1 = 0
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r3 = 0
            if (r0 == 0) goto L_0x0063
            if (r7 == 0) goto L_0x001f
            java.lang.String r0 = "LeakDetectorSp"
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r7, r0, r1)
            if (r0 == 0) goto L_0x001f
            java.lang.String r4 = "ld_oom_dump_file"
            java.lang.String r0 = r0.getString(r4, r3)
            goto L_0x0020
        L_0x001f:
            r0 = r3
        L_0x0020:
            if (r0 == 0) goto L_0x0063
            r4 = r8 & 16
            if (r4 == 0) goto L_0x0043
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "OOM UploadHprof right now:"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.bytedance.liko.leakdetector.C12279a.m24757a(r4)
            com.bytedance.liko.leakdetector.strategy.miniupload.a r4 = new com.bytedance.liko.leakdetector.strategy.miniupload.a
            r4.<init>()
            r4.mo23225a(r7, r0)
            com.bytedance.liko.leakdetector.p774a.C12282c.m24765b(r7, r3)
            goto L_0x0063
        L_0x0043:
            float r4 = com.bytedance.liko.leakdetector.p774a.C12281b.m24763a()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x004c
            return
        L_0x004c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "OOM anlaysis right now:"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.bytedance.liko.leakdetector.C12279a.m24757a(r4)
            r6.runAnalysisInBackground(r0)
            com.bytedance.liko.leakdetector.p774a.C12282c.m24765b(r7, r3)
        L_0x0063:
            r0 = r8 & 4
            if (r0 == 0) goto L_0x00aa
            com.bytedance.liko.memoryexplorer.MemoryConfig r0 = com.bytedance.liko.memoryexplorer.MemoryConfig.getMemoryConfig()
            java.lang.String r0 = r0.dumpFilePath
            if (r0 == 0) goto L_0x00aa
            r4 = r8 & 16
            if (r4 == 0) goto L_0x008d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "direct UploadHprof right now:"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.bytedance.liko.leakdetector.C12279a.m24757a(r4)
            com.bytedance.liko.leakdetector.strategy.miniupload.a r4 = new com.bytedance.liko.leakdetector.strategy.miniupload.a
            r4.<init>()
            r4.mo23225a(r7, r0)
            goto L_0x00aa
        L_0x008d:
            float r4 = com.bytedance.liko.leakdetector.p774a.C12281b.m24763a()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0096
            return
        L_0x0096:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "direct anlaysis right now:"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.bytedance.liko.leakdetector.C12279a.m24757a(r4)
            r6.runAnalysisInBackground(r0)
        L_0x00aa:
            r0 = r8 & 8
            if (r0 == 0) goto L_0x0103
            if (r7 == 0) goto L_0x00bf
            java.lang.String r0 = "LeakDetectorSp"
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r7, r0, r1)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r1 = "ld_memory_peak_dump_file"
            java.lang.String r0 = r0.getString(r1, r3)
            goto L_0x00c0
        L_0x00bf:
            r0 = r3
        L_0x00c0:
            if (r0 == 0) goto L_0x0103
            r8 = r8 & 16
            if (r8 == 0) goto L_0x00e3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "MemoryPeak UploadHprof right now:"
            r8.<init>(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.bytedance.liko.leakdetector.C12279a.m24757a(r8)
            com.bytedance.liko.leakdetector.strategy.miniupload.a r8 = new com.bytedance.liko.leakdetector.strategy.miniupload.a
            r8.<init>()
            r8.mo23225a(r7, r0)
            com.bytedance.liko.leakdetector.p774a.C12282c.m24764a(r7, r3)
            return
        L_0x00e3:
            float r8 = com.bytedance.liko.leakdetector.p774a.C12281b.m24763a()
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ec
            return
        L_0x00ec:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "MemoryPeak anlaysis right now:"
            r8.<init>(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.bytedance.liko.leakdetector.C12279a.m24757a(r8)
            r6.runAnalysisInBackground(r0)
            com.bytedance.liko.leakdetector.p774a.C12282c.m24764a(r7, r3)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.LeakDetectorInstaller.excuteStrategy(android.content.Context, int):void");
    }
}
