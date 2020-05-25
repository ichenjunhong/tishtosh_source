package com.p683ss.android.ugc.aweme.legoImp.task;

import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask */
public final class AnalysisHprofTask implements LegoTask {
    public static final C35929a Companion = new C35929a(null);
    public static volatile boolean inProgress;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask$a */
    public static final class C35929a {
        private C35929a() {
        }

        public /* synthetic */ C35929a(C52707g gVar) {
            this();
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:2|3|4|5|6|(3:11|12|(3:14|15|16))(1:10)|17|18|19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0135 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run(android.content.Context r10) {
        /*
            r9 = this;
            boolean r10 = com.p683ss.android.monitor.C19524a.m47805b()
            if (r10 == 0) goto L_0x0142
            com.ss.android.ugc.aweme.settings.LikoAnalysisConfig r10 = com.p683ss.android.monitor.C19524a.m47807d()
            java.lang.String r0 = "MobMonitor.getLikoAnalysisConfig()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r0)
            r0 = 1
            r1 = 0
            inProgress = r0     // Catch:{ Throwable -> 0x013f, all -> 0x013b }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x013f, all -> 0x013b }
            r2.<init>()     // Catch:{ Throwable -> 0x013f, all -> 0x013b }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0135 }
            r4 = 19
            if (r3 < r4) goto L_0x0027
            boolean r3 = com.p683ss.android.monitor.C19524a.m47806c()     // Catch:{ JSONException -> 0x0135 }
            if (r3 == 0) goto L_0x0027
            r3 = 18
            goto L_0x003a
        L_0x0027:
            r3 = 2
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ JSONException -> 0x0135 }
            long r4 = r4.maxMemory()     // Catch:{ JSONException -> 0x0135 }
            r6 = 134217728(0x8000000, double:6.63123685E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x003a
            inProgress = r1     // Catch:{  }
            return
        L_0x003a:
            java.lang.String r4 = "strategy"
            r2.put(r4, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "aid"
            int r4 = com.bytedance.ies.ugc.p694a.C11010c.m22289j()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "channel"
            java.lang.String r4 = com.bytedance.ies.ugc.p694a.C11010c.m22295p()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "device_id"
            java.lang.String r4 = com.p683ss.android.common.applog.TeaAgent.getServerDeviceId()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "app_version"
            java.lang.String r4 = com.bytedance.ies.ugc.p694a.C11010c.m22288i()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "update_version_code"
            long r4 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "current_update_version_code"
            long r4 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "os_version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "os_api"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "device_model"
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "device_brand"
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "device_manufacturer"
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "process_name"
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "version_name"
            java.lang.String r4 = com.bytedance.ies.ugc.p694a.C11010c.m22294o()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "version_code"
            long r4 = com.bytedance.ies.ugc.p694a.C11010c.m22293n()     // Catch:{ JSONException -> 0x0135 }
            int r4 = (int) r4     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "region"
            java.lang.String r4 = com.p683ss.android.ugc.aweme.language.C35837h.m80980e()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "oversea"
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "delete_dump_file"
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x0135 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0135 }
            r0.<init>()     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "android.app.Activity"
            r0.put(r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "android.app.Fragment"
            r0.put(r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "android.support.v4.app.Fragment"
            r0.put(r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r3 = "detect_leak_classes"
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "supportBigObjectAnalysis"
            boolean r3 = r10.isSupportBigObjectAnalysis()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "bigObjectFilterSystem"
            boolean r3 = r10.isBigObjectFilterSystem()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "bigObjectLatitude"
            int r3 = r10.getBigObjectLatitude()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "supportObjectInstanceAnalysis"
            boolean r3 = r10.isSupportObjectInstanceAnalysis()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "objectInstanceFilterSystem"
            boolean r3 = r10.isObjectInstanceFilterSystem()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "objectInstanceLatitude"
            int r3 = r10.getObjectInstanceLatitude()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "supportBitmapAnalysis"
            boolean r3 = r10.isSupportBitmapAnalysis()     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
            java.lang.String r0 = "bitmapLatitude"
            int r10 = r10.getBitmapLatitude()     // Catch:{ JSONException -> 0x0135 }
            long r3 = (long) r10     // Catch:{ JSONException -> 0x0135 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0135 }
        L_0x0135:
            com.bytedance.liko.p771a.C12267c.m24745a(r2)     // Catch:{ Throwable -> 0x013f, all -> 0x013b }
            inProgress = r1
            return
        L_0x013b:
            r10 = move-exception
            inProgress = r1
            throw r10
        L_0x013f:
            inProgress = r1
            return
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask.run(android.content.Context):void");
    }
}
