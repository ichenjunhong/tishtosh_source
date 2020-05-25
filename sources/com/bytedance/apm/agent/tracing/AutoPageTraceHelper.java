package com.bytedance.apm.agent.tracing;

import android.text.TextUtils;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p498p.p500b.C9172a;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

public class AutoPageTraceHelper {
    private static boolean sIsFirstWindowFocusChangedActivity;
    private static long sMaxValidTimeMs = 20000;
    private static final HashSet<String> sMethodSet = new HashSet<>(32);
    private static final ConcurrentLinkedQueue<PageTraceEntity> sPageList = new ConcurrentLinkedQueue<>();

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x014b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void reportStats() {
        /*
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.PageTraceEntity> r0 = sPageList     // Catch:{ Exception -> 0x014c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x014c }
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x014b
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.PageTraceEntity> r2 = sPageList     // Catch:{ Exception -> 0x014c }
            java.lang.Object r2 = r2.peek()     // Catch:{ Exception -> 0x014c }
            com.bytedance.apm.agent.tracing.PageTraceEntity r2 = (com.bytedance.apm.agent.tracing.PageTraceEntity) r2     // Catch:{ Exception -> 0x014c }
            if (r2 == 0) goto L_0x014b
            long r3 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x014c }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0021
            long r2 = r2.onViewShowTs     // Catch:{ Exception -> 0x014c }
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x014b
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.apm.agent.tracing.PageTraceEntity> r2 = sPageList     // Catch:{ Exception -> 0x014c }
            java.lang.Object r2 = r2.poll()     // Catch:{ Exception -> 0x014c }
            com.bytedance.apm.agent.tracing.PageTraceEntity r2 = (com.bytedance.apm.agent.tracing.PageTraceEntity) r2     // Catch:{ Exception -> 0x014c }
            boolean r3 = r2.isCreateAndResumeValid()     // Catch:{ Exception -> 0x014c }
            if (r3 != 0) goto L_0x0040
            boolean r0 = com.bytedance.apm.C8976c.m17751g()     // Catch:{ Exception -> 0x014c }
            if (r0 == 0) goto L_0x014b
            com.bytedance.apm.d r0 = com.bytedance.apm.C8994d.m17799a()     // Catch:{ Exception -> 0x014c }
            java.lang.String r1 = "apm_autopage"
            r0.mo16326a(r1)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x0040:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "name"
            java.lang.String r7 = "onCreate"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "start"
            long r7 = r2.onCreateStartTs     // Catch:{ Exception -> 0x014c }
            r3.put(r4, r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "end"
            long r7 = r2.onCreateEndTs     // Catch:{ Exception -> 0x014c }
            r3.put(r4, r7)     // Catch:{ Exception -> 0x014c }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x014c }
            r4.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r7 = "name"
            java.lang.String r8 = "onResume"
            r4.put(r7, r8)     // Catch:{ Exception -> 0x014c }
            java.lang.String r7 = "start"
            long r8 = r2.onResumeStartTs     // Catch:{ Exception -> 0x014c }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x014c }
            java.lang.String r7 = "end"
            long r8 = r2.onResumeEndTs     // Catch:{ Exception -> 0x014c }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x014c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x014c }
            r7.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "name"
            java.lang.String r9 = "onWindowFocusChanged"
            r7.put(r8, r9)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "start"
            long r9 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x014c }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x014c }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x014c }
            r8.<init>()     // Catch:{ Exception -> 0x014c }
            r8.put(r3)     // Catch:{ Exception -> 0x014c }
            r8.put(r4)     // Catch:{ Exception -> 0x014c }
            r8.put(r7)     // Catch:{ Exception -> 0x014c }
            long r3 = r2.onViewShowTs     // Catch:{ Exception -> 0x014c }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "name"
            java.lang.String r7 = "viewShow"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "start"
            long r9 = r2.onViewShowTs     // Catch:{ Exception -> 0x014c }
            r3.put(r4, r9)     // Catch:{ Exception -> 0x014c }
            r8.put(r3)     // Catch:{ Exception -> 0x014c }
        L_0x00b1:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "name"
            java.lang.String r7 = "page_load_stats"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "page_type"
            java.lang.String r7 = "activity"
            r3.put(r4, r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "start"
            long r9 = r2.onCreateStartTs     // Catch:{ Exception -> 0x014c }
            r3.put(r4, r9)     // Catch:{ Exception -> 0x014c }
            long r9 = r2.onViewShowTs     // Catch:{ Exception -> 0x014c }
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ef
            java.lang.String r4 = "end"
            long r9 = r2.onViewShowTs     // Catch:{ Exception -> 0x014c }
            r3.put(r4, r9)     // Catch:{ Exception -> 0x014c }
            long r9 = r2.onViewShowTs     // Catch:{ Exception -> 0x014c }
            long r11 = r2.onCreateStartTs     // Catch:{ Exception -> 0x014c }
            r4 = 0
            long r9 = r9 - r11
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0147
            long r4 = r2.onViewShowTs     // Catch:{ Exception -> 0x014c }
            long r6 = r2.onCreateStartTs     // Catch:{ Exception -> 0x014c }
            r9 = 0
            long r4 = r4 - r6
            long r6 = sMaxValidTimeMs     // Catch:{ Exception -> 0x014c }
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x010c
            goto L_0x0147
        L_0x00ef:
            java.lang.String r4 = "end"
            long r9 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x014c }
            r3.put(r4, r9)     // Catch:{ Exception -> 0x014c }
            long r9 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x014c }
            long r11 = r2.onCreateStartTs     // Catch:{ Exception -> 0x014c }
            r4 = 0
            long r9 = r9 - r11
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0147
            long r4 = r2.onWindowFocusTs     // Catch:{ Exception -> 0x014c }
            long r6 = r2.onCreateStartTs     // Catch:{ Exception -> 0x014c }
            r9 = 0
            long r4 = r4 - r6
            long r6 = sMaxValidTimeMs     // Catch:{ Exception -> 0x014c }
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x0147
        L_0x010c:
            java.lang.String r4 = "spans"
            r3.put(r4, r8)     // Catch:{ Exception -> 0x014c }
            java.util.HashSet<java.lang.String> r4 = sMethodSet     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = r2.pageName     // Catch:{ Exception -> 0x014c }
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x014c }
            r5 = 1
            if (r4 == 0) goto L_0x011e
            r4 = 2
            goto L_0x011f
        L_0x011e:
            r4 = 1
        L_0x011f:
            java.util.HashSet<java.lang.String> r6 = sMethodSet     // Catch:{ Exception -> 0x014c }
            java.lang.String r7 = r2.pageName     // Catch:{ Exception -> 0x014c }
            r6.add(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r6 = "launch_mode"
            r3.put(r6, r4)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "collect_from"
            r3.put(r4, r5)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "page_name"
            java.lang.String r2 = r2.pageName     // Catch:{ Exception -> 0x014c }
            r3.put(r4, r2)     // Catch:{ Exception -> 0x014c }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x014c }
            r2.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = "trace"
            r2.put(r4, r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "page_load_trace"
            r4 = 0
            com.bytedance.apm.agent.monitor.MonitorTool.monitorPerformance(r3, r4, r4, r2)     // Catch:{ Exception -> 0x014c }
        L_0x0147:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x014b:
            return
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.tracing.AutoPageTraceHelper.reportStats():void");
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void reportViewIdStats(long j, String str) {
        PageTraceEntity pageTraceEntity = (PageTraceEntity) sPageList.peek();
        if (pageTraceEntity != null && TextUtils.equals(str, pageTraceEntity.pageName)) {
            pageTraceEntity.onViewShowTs = j;
            C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                public final void run() {
                    AutoPageTraceHelper.reportStats();
                }
            });
        }
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnCreateStart(str);
                }
                if (sPageList.size() > 50) {
                    sPageList.poll();
                }
                sPageList.add(new PageTraceEntity(str, System.currentTimeMillis()));
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnCreateEnd();
            }
            PageTraceEntity pageTraceEntity = (PageTraceEntity) sPageList.peek();
            if (pageTraceEntity != null) {
                pageTraceEntity.onCreateEndTs = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals("onResume", str2)) {
            if (TextUtils.equals("onWindowFocusChanged", str2) && z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnWindowFocusChangedStart(str);
                    sIsFirstWindowFocusChangedActivity = true;
                }
                PageTraceEntity pageTraceEntity2 = (PageTraceEntity) sPageList.peek();
                if (pageTraceEntity2 != null && pageTraceEntity2.onWindowFocusTs == 0) {
                    pageTraceEntity2.onWindowFocusTs = System.currentTimeMillis();
                    if (C9172a.m18196a(str) == null) {
                        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
                            public final void run() {
                                AutoPageTraceHelper.reportStats();
                            }
                        });
                    }
                }
            }
        } else if (z) {
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeStart(str);
            }
            PageTraceEntity pageTraceEntity3 = (PageTraceEntity) sPageList.peek();
            if (pageTraceEntity3 != null) {
                pageTraceEntity3.onResumeStartTs = System.currentTimeMillis();
            }
        } else {
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeEnd();
            }
            PageTraceEntity pageTraceEntity4 = (PageTraceEntity) sPageList.peek();
            if (pageTraceEntity4 != null) {
                pageTraceEntity4.onResumeEndTs = System.currentTimeMillis();
            }
        }
    }
}
