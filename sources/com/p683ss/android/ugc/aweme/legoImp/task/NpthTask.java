package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Process;
import cat.ereza.customactivityoncrash.C2207a;
import com.bytedance.crash.C9544a;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9588g;
import com.bytedance.crash.C9598h;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p547g.C9590b;
import com.bytedance.crash.p551k.C9652h;
import com.bytedance.crash.p551k.C9655i;
import com.bytedance.ies.safemode.C10994a;
import com.bytedance.ies.safemode.C10996b;
import com.bytedance.ies.safemode.C10999e;
import com.bytedance.ies.safemode.C11000f;
import com.bytedance.ies.ugc.statisticlogger.C11063e;
import com.bytedance.p785o.p786a.C12402a;
import com.bytedance.p785o.p786a.p795c.C12424d;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1375e.C23081a;
import com.p683ss.android.ugc.aweme.app.p1375e.C23083b;
import com.p683ss.android.ugc.aweme.app.p1375e.C23084c;
import com.p683ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.C33091a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33211q;
import com.p683ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p683ss.android.ugc.aweme.utils.C47758cb;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.NpthTask */
public class NpthTask implements LegoTask {
    private static Class<? extends Activity> restartActivityClass;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.NpthTask$a */
    class C35955a implements C9588g {
        /* renamed from: b */
        public final String mo17413b() {
            return C19034d.m46323c();
        }

        /* renamed from: d */
        public final String mo17415d() {
            return C11063e.m22389a();
        }

        /* renamed from: c */
        public final long mo17414c() {
            try {
                return Long.parseLong(AppLog.getUserId());
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        /* renamed from: a */
        public final Map<String, Object> mo17412a() {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            NetUtil.putCommonParams(hashMap2, true);
            hashMap.putAll(hashMap2);
            if (!hashMap.containsKey("release_build")) {
                hashMap.put("release_build", C19005d.m46178a());
            }
            return hashMap;
        }

        private C35955a() {
        }
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    private void initAVNpth() {
        ICrashReportService provideErrorReporter = AVExternalServiceImpl.getAVServiceImpl_Monster().provideErrorReporter();
        C9610j.m19133a((C9598h) new C35987n(provideErrorReporter), C9571d.NATIVE);
        C9610j.m19133a((C9598h) new C35988o(provideErrorReporter), C9571d.JAVA);
    }

    private static Class<? extends Activity> guessRestartActivityClass(Context context) {
        Class<? extends Activity> restartActivityClassWithIntentFilter = getRestartActivityClassWithIntentFilter(context);
        if (restartActivityClassWithIntentFilter == null) {
            return getLauncherActivity(context);
        }
        return restartActivityClassWithIntentFilter;
    }

    private void installCustomActivityOnCrash(Context context) {
        C2207a.m6681a(C23794bh.m58412z().mo47710a());
        C2207a.m6680a(context);
    }

    private static Class<? extends Activity> getLauncherActivity(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            try {
                return Class.forName(launchIntentForPackage.getComponent().getClassName());
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    public void run(Context context) {
        if (!C18920g.m46051b(context).contains("miniapp")) {
            C33211q.m76311a();
            try {
                doRun(context);
            } finally {
                C33211q.m76312b();
            }
        }
    }

    private static Class<? extends Activity> getRestartActivityClassWithIntentFilter(Context context) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            try {
                return Class.forName(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    private void doRun(Context context) {
        Context context2;
        String str;
        C35990q qVar = C35990q.f92222b;
        C52711k.m112240b(context, "context");
        if (context instanceof Application) {
            context2 = context;
        } else {
            context2 = context.getApplicationContext();
            if (context2 == null) {
                throw new C52857u("null cannot be cast to non-null type android.app.Application");
            }
        }
        Application application = (Application) context2;
        String b = C18920g.m46051b(application);
        if (b.endsWith(":safemode")) {
            C23794bh.m58412z().mo47740x();
        }
        C10996b a = C10996b.m22262a(application);
        a.f29536e = C35990q.m81165a("max_detect_time", true);
        a.f29535d = C35990q.m81165a("max_crash_times", false);
        a.f29537f = C35990q.m81165a("max_crash_interval", true);
        a.f29533b = C35990q.m81165a("crash_times", false);
        a.f29534c = C35990q.m81165a("last_crash", true);
        a.f29538g = qVar.mo74663d().getEnable();
        a.f29540i = C35995e.f92229a;
        a.f29541j = C35996f.f92230a;
        a.f29539h = C35997g.f92231a;
        if (a.f29538g) {
            a.f29542k = true;
            a.f29543l = System.currentTimeMillis();
            C10994a aVar = C10994a.f29527a;
            Application application2 = a.f29532a;
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (!(defaultUncaughtExceptionHandler instanceof C10994a)) {
                aVar.f29528b = defaultUncaughtExceptionHandler;
                aVar.f29529c = application2;
                Thread.setDefaultUncaughtExceptionHandler(aVar);
                C52711k.m112240b(application2, "$this$isMainProcess");
                C52711k.m112240b(application2, "$this$getProcessName");
                int myPid = Process.myPid();
                Iterator it = C11000f.m22266a(application2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
                if (C52711k.m112239a((Object) str, (Object) application2.getPackageName())) {
                    application2.registerActivityLifecycleCallbacks(aVar);
                }
                C10999e.m22265a("Register handler success");
            }
        }
        if (C35990q.m81169c() && C52711k.m112239a((Object) b, (Object) application.getPackageName())) {
            C2201v.m6592a(4000, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C35998h<Object>(application));
        }
        C9610j.m19133a((C9598h) new C35986m(context), C9571d.NATIVE);
        C32458a.m75144a("NpthTask");
        C9610j.m19137b().mo17478b("https://api2.musical.ly/monitor/collect/c/native_bin_crash");
        C9610j.m19137b().mo17479c("https://api2.musical.ly/monitor/collect/c/crash");
        C9610j.m19137b().mo17475a("https://api2.musical.ly/monitor/collect/c/exception");
        C9610j.m19129a(context, new C35955a(), true, true, true);
        C33091a.m76063a();
        C9610j.m19137b().f26299l = false;
        initAVNpth();
        C9610j.m19132a((C9544a) new C23083b(context, new C23084c()), C9571d.ALL);
        new AddInstalledModulesInfoTask().run(context);
        C18842a.m45933a(new Runnable() {
            public final void run() {
                new C23081a().run();
            }
        }, 200);
        if (!C47758cb.f120281a) {
            return;
        }
        if (C12402a.f32647a != null) {
            C12402a.f32647a.mo23462a(C12424d.REGISTER_EXCEPTION);
            return;
        }
        throw new RuntimeException("you godzillast init Matrix sdk first");
    }

    static final /* synthetic */ void lambda$doRun$1$NpthTask(Context context, C9571d dVar, String str, Thread thread) {
        if (context instanceof Application) {
            C10996b.m22262a((Application) context);
            C10999e.m22265a("Increase time manually!");
            C10994a.f29527a.uncaughtException(Thread.currentThread(), null);
        }
    }

    static final /* synthetic */ void lambda$initAVNpth$3$NpthTask(ICrashReportService iCrashReportService, C9571d dVar, String str, Thread thread) {
        if (str == null || !str.contains("OutOfMemoryError")) {
            iCrashReportService.report(3);
        } else {
            iCrashReportService.report(1);
        }
    }

    static final /* synthetic */ void lambda$doRun$0$NpthTask(Context context, C9571d dVar, String str, Thread thread) {
        int i;
        Intent intent = new Intent(context.getApplicationContext(), C23794bh.m58412z().mo47710a());
        String str2 = "UnKnown";
        if (thread != null) {
            str2 = thread.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CrashType: ");
        sb.append(dVar);
        sb.append("\nDid: ");
        sb.append(C9616k.m19151c().mo17507a());
        sb.append("\nAid: ");
        C9655i c = C9616k.m19151c();
        if (c.f26356a > 0) {
            i = c.f26356a;
        } else {
            int d = C9590b.m19081d(C9590b.m19078b("aid"));
            if (d <= 0) {
                JSONObject a = C9652h.m19252a().mo17502a(System.currentTimeMillis());
                if (a != null) {
                    d = C9590b.m19081d(String.valueOf(a.opt("aid")));
                }
            }
            c.f26356a = d;
            if (c.f26356a >= 0) {
                i = c.f26356a;
            } else {
                i = 4444;
            }
        }
        sb.append(i);
        sb.append("\nthread: ");
        sb.append(str2);
        sb.append("\ntime: ");
        sb.append(System.currentTimeMillis());
        sb.append("\nstackTrace: ");
        sb.append(str);
        if (restartActivityClass == null) {
            restartActivityClass = guessRestartActivityClass(context);
        }
        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS", restartActivityClass);
        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", sb.toString());
        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", str);
        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", 2131952803);
        intent.setFlags(268468224);
        context.getApplicationContext().startActivity(intent);
    }
}
