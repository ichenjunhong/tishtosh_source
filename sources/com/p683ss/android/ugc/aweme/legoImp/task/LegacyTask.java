package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import cat.ereza.customactivityoncrash.C2207a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.bytedance.ies.ugc.statisticlogger.C11049a.C11051b;
import com.bytedance.ies.ugc.statisticlogger.C11063e;
import com.bytedance.ies.ugc.statisticlogger.config.C11055b;
import com.bytedance.polaris.p821a.C12563i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.AppLog.LogRequestTraceCallback;
import com.p683ss.android.common.applog.CrashUtil;
import com.p683ss.android.common.config.AppConfig;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.newmedia.C19542b;
import com.p683ss.android.p1163f.C19143a;
import com.p683ss.android.p1163f.C19158d;
import com.p683ss.android.p1167g.C19165d;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23036aw;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23128m;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.CommandDispatcher.C22821a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.p683ss.android.ugc.aweme.app.launch.C23117b.C23118a;
import com.p683ss.android.ugc.aweme.app.launch.C23117b.C23119b;
import com.p683ss.android.ugc.aweme.app.launch.C23117b.C23120c;
import com.p683ss.android.ugc.aweme.app.launch.C23121c.C23122a;
import com.p683ss.android.ugc.aweme.app.launch.C23121c.C23123b;
import com.p683ss.android.ugc.aweme.app.launch.C23125d.C23126a;
import com.p683ss.android.ugc.aweme.app.launch.C23125d.C23127b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38064h;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.sec.C41481h;
import com.p683ss.android.ugc.aweme.sec.C41482i;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.statistic.C45710a;
import com.p683ss.sys.p2584ck.SCCheckCallback;
import com.p683ss.sys.p2584ck.SCCheckUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegacyTask */
public class LegacyTask implements LegoTask {
    private Application application;
    private String deviceId = C11049a.m22367c();
    private boolean mainProcess;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.LegacyTask$DeviceIdChangeTask */
    class DeviceIdChangeTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private DeviceIdChangeTask() {
        }

        public void run(Context context) {
            C35857a.m81001b().mo74526a(C23794bh.m58412z().mo47715c()).mo74526a(C23794bh.m58412z().mo47717d()).mo74527a();
            if (!C11016e.m22313h()) {
                String c = C11049a.m22367c();
                String a = C11049a.m22365a();
                if (!C9431p.m18664a(c) && !C9431p.m18664a(a)) {
                    C38064h.m85136d().mo77611f();
                }
            }
            C23794bh.m58412z().mo47735s();
            if (C23794bh.m58412z().mo47736t()) {
                C12563i.m25229k();
            }
        }
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    private void setColorMode() {
        C10675b.m21494a().f28434a = 0;
    }

    private void checkAppReplacingState() {
        if (this.application.getResources() == null) {
            Process.killProcess(Process.myPid());
        }
    }

    private void misSetupInAllProcess() {
        C41481h.f105151a = new C41482i();
        C32463a.m75162a(this.application);
    }

    private void registerSecInitCallBack() {
        SCCheckUtils.resgisterSCCheckUtilsCallBack(new SCCheckCallback() {
            public final HashMap<String, String> getRequestParams() {
                HashMap<String, String> hashMap = new HashMap<>();
                if (!((Boolean) SharePrefCache.inst().getTTRegion().mo47782d()).booleanValue()) {
                    hashMap.put("pass-region", "1");
                }
                return hashMap;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void registerBroadcastReceivers() {
        C23794bh.m58412z().mo47712a((Context) this.application);
    }

    private void antispamReportInstall() {
        boolean z;
        if (C23128m.m56685a() != ((int) C11010c.m22287h())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SecApiImpl.createISecApibyMonsterPlugin().reportData("install");
        }
    }

    private void installCustomActivityOnCrash() {
        C2207a.m6681a(C23794bh.m58412z().mo47710a());
        C2207a.m6680a((Context) this.application);
    }

    private void miscSetupInMainProcess() {
        NetworkUtils.setCommandListener(C22821a.f61149a);
        StringBuilder sb = new StringBuilder(C23057c.f61424b);
        sb.append(C11010c.m22289j());
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(sb2)) {
            C19165d.f52817a = sb2;
        }
    }

    private void initApplog() {
        try {
            AppLog.setUseGoogleAdId(true);
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder("initApplog startLaunch:");
            sb.append(System.currentTimeMillis() - C22574a.m55738f().f60707h);
            C32458a.m75144a(sb.toString());
            C32458a.m75144a(CrashUtil.getCrashInfo(this.application, Thread.currentThread(), e).toString());
            C23131p.m57779a("app_crash", CrashUtil.getCrashInfo(this.application, Thread.currentThread(), e));
            C32458a.m75143a((Exception) e);
        }
        AppLog.registerLogRequestCallback(new LogRequestTraceCallback() {
            public final void onEventDiscard(int i) {
            }

            public final void onEventExpired(List<Long> list) {
            }

            public final void onEventInsertResult(boolean z, long j) {
            }

            public final void onLogRequestResult(boolean z, List<Long> list) {
            }

            public final void onLogDataStateChange(String str, String str2, String str3, boolean z, String str4) {
                if ("terminate".equals(str)) {
                    C23131p.m57779a("type_app_log_state_change", C23088c.m56631a().mo47824a("data_source", str).mo47824a("session_id", str2).mo47822a("is_success", Integer.valueOf(z ^ true ? 1 : 0)).mo47824a("eventIndex", str3).mo47824a("error_message", str4).mo47825b());
                }
            }
        });
        AppConfig.getInstance(this.application).setFirstActivityCreate();
        Application application2 = this.application;
        if (application2 != null) {
            SharedPreferences a = C35807d.m80935a(application2, C19002a.m46175a(), 0);
            if (a != null) {
                C30578o.f79870a = TextUtils.isEmpty(a.getString("device_id", ""));
            }
        }
        C35857a.m81001b().mo74526a(new CommonParamsInitTask()).mo74527a();
        C45710a.m99519a(this.application);
    }

    public void initAppData() {
        C23794bh.m58412z().mo47723g();
        C52711k.m112240b(this.application, "context");
        C11055b.m22383a().mo6522a((C1715j<? super T>) C23118a.f61540a).mo6545f((C1710e<? super T>) new C23119b<Object>());
        C2201v g = C11063e.f29694a.mo6548g();
        C52711k.m112236a((Object) g, "sessionChangeSubject.share()");
        g.mo6545f((C1710e<? super T>) C23120c.f61542a);
        C11016e.m22304b().mo6545f((C1710e<? super T>) C23126a.f61548a);
        C11016e.m22308c().mo6545f((C1710e<? super T>) C23127b.f61549a);
        C2201v a = C11049a.f29670a.mo6548g().mo6533c().mo6522a((C1715j<? super T>) C11051b.f29677a);
        C52711k.m112236a((Object) a, "sourceDeviceIdSubject.sh…ils.isEmpty(it)\n        }");
        a.mo6545f((C1710e<? super T>) new C35983j<Object>(this));
        Application application2 = this.application;
        C52711k.m112240b(application2, "context");
        C11055b.m22383a().mo6522a((C1715j<? super T>) C23122a.f61543a).mo6529b(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C23123b<Object>(application2));
        C23794bh.m58412z().mo47713b();
    }

    private void antispamUpdateDeviceId(String str) {
        String installId = AppLog.getInstallId();
        if (installId == null) {
            installId = "";
        }
        SecApiImpl.createISecApibyMonsterPlugin().updateDeviceIdAndInstallId(str, installId);
    }

    private void updateFirebaseId(String str) {
        if (this.mainProcess) {
            FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this.application);
            if (!TextUtils.isEmpty(str)) {
                instance.mo34670a(str);
            }
        }
    }

    private void initAdProcess(String str) {
        if (!C9431p.m18664a(str) && str.endsWith(":ad") && VERSION.SDK_INT >= 19) {
            try {
                C9409b.m18609a((Object) this).mo17050a("mBase", (Object) new C19542b(this.application.getBaseContext()));
            } catch (Throwable unused) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    private void initPushProcess(String str) {
        boolean z;
        Application application2 = this.application;
        String str2 = ":push";
        String a = C23036aw.m56554a(Process.myPid());
        if (a == null || !a.endsWith(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AppConfig.getInstance(this.application).tryRefreshConfig();
        }
    }

    public void onDeviceIDChange(String str) {
        if (!TextUtils.equals(this.deviceId, str)) {
            this.deviceId = str;
            if (!TextUtils.isEmpty(this.deviceId)) {
                updateFirebaseId(AppLog.getServerDeviceId());
                C19143a aVar = C19158d.m46704a().f52796c;
                if (aVar != null) {
                    aVar.f52747e = this.deviceId;
                    C19158d a = C19158d.m46704a();
                    a.f52796c = aVar;
                    Iterator it = a.f52794a.values().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                antispamUpdateDeviceId(this.deviceId);
                antispamReportInstall();
                C35857a.m81001b().mo74526a(new DeviceIdChangeTask()).mo74527a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        if (r0 != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(android.content.Context r5) {
        /*
            r4 = this;
            r0 = r5
            android.app.Application r0 = (android.app.Application) r0
            r4.application = r0
            boolean r0 = com.p683ss.android.common.util.C18920g.m46048a(r5)
            r4.mainProcess = r0
            r4.misSetupInAllProcess()
            r4.registerSecInitCallBack()
            com.ss.android.ugc.aweme.lego.a$f r0 = com.p683ss.android.ugc.aweme.lego.C35857a.m81001b()
            com.ss.android.ugc.aweme.app.application.task.TokenSdkTask r1 = new com.ss.android.ugc.aweme.app.application.task.TokenSdkTask
            r1.<init>()
            com.ss.android.ugc.aweme.lego.a$f r0 = r0.mo74526a(r1)
            r0.mo74527a()
            boolean r0 = r4.mainProcess
            if (r0 == 0) goto L_0x002d
            r4.miscSetupInMainProcess()
            r4.initAppData()
            r0 = 0
            goto L_0x0039
        L_0x002d:
            android.app.Application r0 = r4.application
            java.lang.String r0 = com.p683ss.android.common.util.C18920g.m46051b(r0)
            r4.initAdProcess(r0)
            r4.initPushProcess(r0)
        L_0x0039:
            r4.initApplog()
            r4.checkAppReplacingState()
            r4.registerBroadcastReceivers()
            r4.setColorMode()
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r2 = "method_init_push_duration"
            r3 = 0
            r1.mo46917a(r2, r3)
            boolean r1 = r4.mainProcess
            if (r1 != 0) goto L_0x0073
            android.app.Application r1 = r4.application
            com.p683ss.android.ugc.aweme.push.downgrade.C40898g.m90475d(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = com.p683ss.android.ugc.aweme.push.downgrade.C40898g.f104080a
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = com.p683ss.android.ugc.aweme.push.downgrade.C40898g.f104081b
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0070
        L_0x006e:
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 == 0) goto L_0x007f
        L_0x0073:
            com.ss.android.ugc.awemepushapi.IPushApi r0 = com.p683ss.android.p1159di.push.C19073a.m46451a()
            com.ss.android.ugc.aweme.services.MainServiceForPush r1 = new com.ss.android.ugc.aweme.services.MainServiceForPush
            r1.<init>()
            r0.init(r5, r1)
        L_0x007f:
            com.ss.android.ugc.aweme.an.a r5 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r0 = "method_init_push_duration"
            r5.mo46921b(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.LegacyTask.run(android.content.Context):void");
    }
}
