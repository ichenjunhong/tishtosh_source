package com.p683ss.android.ugc.aweme.feed;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.l */
final /* synthetic */ class C30465l implements Runnable {

    /* renamed from: a */
    private final Callable f79601a;

    /* renamed from: b */
    private final Handler f79602b;

    /* renamed from: c */
    private final int f79603c;

    /* renamed from: d */
    private final int f79604d;

    C30465l(Callable callable, Handler handler, int i, int i2) {
        this.f79601a = callable;
        this.f79602b = handler;
        this.f79603c = i;
        this.f79604d = i2;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.IllegalArgumentException] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
      assigns: []
      uses: []
      mth insns count: 125
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            java.util.concurrent.Callable r0 = r11.f79601a
            android.os.Handler r1 = r11.f79602b
            int r2 = r11.f79603c
            int r3 = r11.f79604d
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x000e }
            r4 = 0
            goto L_0x0010
        L_0x000e:
            r0 = move-exception
            r4 = r0
        L_0x0010:
            r5 = 6
            r6 = 4
            r7 = 0
            if (r1 == 0) goto L_0x00a1
            if (r0 == 0) goto L_0x00a1
            boolean r8 = r0 instanceof com.p683ss.android.ugc.aweme.feed.model.FeedItemList
            if (r8 == 0) goto L_0x0038
            r8 = r0
            com.ss.android.ugc.aweme.feed.model.FeedItemList r8 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r8
            if (r8 == 0) goto L_0x0038
            java.util.List r8 = r8.getItems()
            boolean r8 = com.bytedance.common.utility.p522b.C9376b.m18558a(r8)
            if (r8 != 0) goto L_0x0038
            r8 = r0
            com.ss.android.ugc.aweme.feed.model.FeedItemList r8 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r8     // Catch:{ Throwable -> 0x0031 }
            com.p683ss.android.ugc.aweme.feed.C30436k.m71363a(r8, r2)     // Catch:{ Throwable -> 0x0031 }
            goto L_0x0038
        L_0x0031:
            r0 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r0)
            r0 = r4
        L_0x0038:
            java.lang.String r8 = "Feed0VVManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "start to post message,type:"
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r6, r8, r9)
            android.os.Message r3 = r1.obtainMessage(r3)
            r3.obj = r0
            com.ss.android.ugc.aweme.splash.b r0 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62927r()
            boolean r0 = r0.mo92144a()
            if (r0 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.splash.b r0 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62927r()
            java.lang.Object r0 = r0.mo92145b()
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0078 }
            com.ss.android.ugc.aweme.splash.b r8 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62927r()     // Catch:{ all -> 0x0075 }
            boolean r8 = r8.mo92144a()     // Catch:{ all -> 0x0075 }
            if (r8 == 0) goto L_0x0073
            r8 = 5000(0x1388, double:2.4703E-320)
            r0.wait(r8)     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x0078
        L_0x0075:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r8     // Catch:{ InterruptedException -> 0x0078 }
        L_0x0078:
            r1.sendMessageAtFrontOfQueue(r3)
            java.lang.String r0 = "Feed0VVManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "end to post message,type:"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r6, r0, r1)
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r1 = "feed_ui_response_to_post_msg"
            r0.mo46921b(r1, r7)
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r1 = "feed_ui_post_msg_to_feed_ui"
            r0.mo46917a(r1, r7)
            goto L_0x00c6
        L_0x00a1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "callHandler is null:"
            r2.<init>(r3)
            r3 = 1
            if (r1 != 0) goto L_0x00ad
            r1 = 1
            goto L_0x00ae
        L_0x00ad:
            r1 = 0
        L_0x00ae:
            r2.append(r1)
            java.lang.String r1 = ",result is null:"
            r2.append(r1)
            if (r0 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "Feed0VVManager"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r5, r1, r0)
        L_0x00c6:
            boolean r0 = r4 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "Feed0VVManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "commit#targetRunnable error:"
            r1.<init>(r2)
            java.lang.String r2 = r4.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r5, r0, r1)
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r4)
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18311a(r4)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x010e }
            r0.<init>()     // Catch:{ Throwable -> 0x010e }
            java.lang.String r1 = android.util.Log.getStackTraceString(r4)     // Catch:{ Throwable -> 0x010e }
            int r2 = r1.length()     // Catch:{ Throwable -> 0x010e }
            r3 = 4096(0x1000, float:5.74E-42)
            if (r2 <= r3) goto L_0x00fc
            java.lang.String r1 = r1.substring(r7, r3)     // Catch:{ Throwable -> 0x010e }
        L_0x00fc:
            java.lang.String r2 = "error_stack"
            r0.put(r2, r1)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r1 = "errorType"
            java.lang.String r2 = "feed_load_error"
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x010e }
            java.lang.String r1 = "aweme_error_find_bug"
            com.p683ss.android.ugc.aweme.base.C23569o.m57779a(r1, r0)     // Catch:{ Throwable -> 0x010e }
            return
        L_0x010e:
            r0 = move-exception
            java.lang.String r1 = "Feed0VVManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "report error:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r6, r1, r0)
            return
        L_0x0123:
            if (r4 == 0) goto L_0x0139
            java.lang.String r0 = "Feed0VVManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "commit#targetRunnable error:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r5, r0, r1)
            return
        L_0x0139:
            java.lang.String r0 = "Feed0VVManager"
            java.lang.String r1 = "commit#targetRunnable success"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C30465l.run():void");
    }
}
