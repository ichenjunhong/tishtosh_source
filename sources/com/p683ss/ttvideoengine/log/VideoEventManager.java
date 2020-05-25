package com.p683ss.ttvideoengine.log;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerEventLogV2Experiment;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONArray;

/* renamed from: com.ss.ttvideoengine.log.VideoEventManager */
public enum VideoEventManager {
    instance;
    
    private JSONArray mJsonArray;
    private JSONArray mJsonArrayV2;
    private VideoEventListener mListener;
    private int mLoggerVersion;
    private IVideoEventUploader mUploader;

    /* renamed from: com.ss.ttvideoengine.log.VideoEventManager$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion */
        static int m110642x3faaac85(VideoEventManager videoEventManager) {
            return C10181b.m20511a().mo18172a(PlayerEventLogV2Experiment.class, true, "player_event_log_v2_open", 31744, false) ? 2 : 1;
        }
    }

    public final int getLoggerVersion() {
        return _lancet.m110642x3faaac85(this);
    }

    public final synchronized JSONArray popAllEvents() {
        JSONArray jSONArray;
        jSONArray = this.mJsonArray;
        this.mJsonArray = new JSONArray();
        return jSONArray;
    }

    public final int getLoggerVersion$___twin___() {
        StringBuilder sb = new StringBuilder("getLoggerVersion: ");
        sb.append(this.mLoggerVersion);
        TTVideoEngineLog.m110646e("VideoEventManager", sb.toString());
        return this.mLoggerVersion;
    }

    public final JSONArray popAllEventsV2() {
        JSONArray jSONArray = this.mJsonArrayV2;
        synchronized (VideoEventManager.class) {
            this.mJsonArrayV2 = new JSONArray();
        }
        return jSONArray;
    }

    public final void setListener(VideoEventListener videoEventListener) {
        this.mListener = videoEventListener;
    }

    public final void setUploader(IVideoEventUploader iVideoEventUploader) {
        this.mUploader = iVideoEventUploader;
    }

    public final void setLoggerVersion(int i) {
        StringBuilder sb = new StringBuilder("setLoggerVersion: ");
        sb.append(i);
        TTVideoEngineLog.m110646e("VideoEventManager", sb.toString());
        if (i == 1 || i == 2) {
            this.mLoggerVersion = i;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void addEvent(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.Class<com.ss.ttvideoengine.log.VideoEventManager> r0 = com.p683ss.ttvideoengine.log.VideoEventManager.class
            monitor-enter(r0)
            if (r4 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r4 = move-exception
            goto L_0x0029
        L_0x0009:
            r3.showEvent(r4)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.IVideoEventUploader r1 = r3.mUploader     // Catch:{ all -> 0x0007 }
            if (r1 == 0) goto L_0x0019
            com.ss.ttvideoengine.log.IVideoEventUploader r1 = r3.mUploader     // Catch:{ all -> 0x0007 }
            java.lang.String r2 = "video_playq"
            r1.onUplaod(r2, r4)     // Catch:{ all -> 0x0007 }
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0019:
            org.json.JSONArray r1 = r3.mJsonArray     // Catch:{ all -> 0x0007 }
            r1.put(r4)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.VideoEventListener r4 = r3.mListener     // Catch:{ all -> 0x0007 }
            if (r4 == 0) goto L_0x0027
            com.ss.ttvideoengine.log.VideoEventListener r4 = r3.mListener     // Catch:{ all -> 0x0007 }
            r4.onEvent()     // Catch:{ all -> 0x0007 }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.log.VideoEventManager.addEvent(org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5 A[SYNTHETIC, Splitter:B:39:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af A[SYNTHETIC, Splitter:B:44:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bc A[SYNTHETIC, Splitter:B:52:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c6 A[SYNTHETIC, Splitter:B:57:0x00c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showEvent(org.json.JSONObject r8) {
        /*
            r7 = this;
            int r0 = com.p683ss.ttvideoengine.utils.TTVideoEngineLog.LogTurnOn
            r1 = 1
            int r0 = r0 >> r1
            r0 = r0 & r1
            if (r0 != r1) goto L_0x00cf
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r2.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r2.append(r3)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            char r3 = java.io.File.separatorChar     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r2.append(r3)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r3 = "engine.debug"
            r2.append(r3)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            if (r2 != 0) goto L_0x003b
            java.lang.String r1 = "VideoEventManager"
            java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r1, r2)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            return
        L_0x003b:
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0090 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0090 }
        L_0x0045:
            java.lang.String r0 = r1.readLine()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r3 = "\r\n"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r3, r4)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.lang.Object r3 = r8.opt(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = "VideoEventManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r4.<init>()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r4.append(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.lang.Object r0 = r8.opt(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r4.append(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110647i(r3, r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            goto L_0x0045
        L_0x0077:
            r1.close()     // Catch:{ Throwable -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r8 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r8)
        L_0x007f:
            r2.close()     // Catch:{ Throwable -> 0x0083 }
            return
        L_0x0083:
            r8 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r8)
            return
        L_0x0088:
            r8 = move-exception
            r0 = r1
            goto L_0x00ba
        L_0x008b:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0097
        L_0x0090:
            r1 = move-exception
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r2 = r0
            goto L_0x00ba
        L_0x0095:
            r1 = move-exception
            r2 = r0
        L_0x0097:
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r1)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "VideoEventManager"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b9 }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r1, r8)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00ad
            r0.close()     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r8 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r8)
        L_0x00ad:
            if (r2 == 0) goto L_0x00b8
            r2.close()     // Catch:{ Throwable -> 0x00b3 }
            goto L_0x00b8
        L_0x00b3:
            r8 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r8)
            return
        L_0x00b8:
            return
        L_0x00b9:
            r8 = move-exception
        L_0x00ba:
            if (r0 == 0) goto L_0x00c4
            r0.close()     // Catch:{ Throwable -> 0x00c0 }
            goto L_0x00c4
        L_0x00c0:
            r0 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r0)
        L_0x00c4:
            if (r2 == 0) goto L_0x00ce
            r2.close()     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r0)
        L_0x00ce:
            throw r8
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.log.VideoEventManager.showEvent(org.json.JSONObject):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void addEventV2(org.json.JSONObject r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.Class<com.ss.ttvideoengine.log.VideoEventManager> r0 = com.p683ss.ttvideoengine.log.VideoEventManager.class
            monitor-enter(r0)
            if (r3 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r3 = move-exception
            goto L_0x0029
        L_0x0009:
            r2.showEvent(r3)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.IVideoEventUploader r1 = r2.mUploader     // Catch:{ all -> 0x0007 }
            if (r1 == 0) goto L_0x0019
            com.ss.ttvideoengine.log.IVideoEventUploader r4 = r2.mUploader     // Catch:{ all -> 0x0007 }
            java.lang.String r1 = "video_playq"
            r4.onUplaod(r1, r3)     // Catch:{ all -> 0x0007 }
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0019:
            org.json.JSONArray r1 = r2.mJsonArrayV2     // Catch:{ all -> 0x0007 }
            r1.put(r3)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.VideoEventListener r3 = r2.mListener     // Catch:{ all -> 0x0007 }
            if (r3 == 0) goto L_0x0027
            com.ss.ttvideoengine.log.VideoEventListener r3 = r2.mListener     // Catch:{ all -> 0x0007 }
            r3.onEventV2(r4)     // Catch:{ all -> 0x0007 }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.log.VideoEventManager.addEventV2(org.json.JSONObject, java.lang.String):void");
    }
}
