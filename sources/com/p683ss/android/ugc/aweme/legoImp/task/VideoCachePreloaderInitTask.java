package com.p683ss.android.ugc.aweme.legoImp.task;

import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.VideoCachePreloaderInitTask */
public class VideoCachePreloaderInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    private void initVideoLoader() {
        C48107j.m104193f().mo95343a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r7 = "VideoCachePreloaderInitTask"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r7)
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.VideoCachePluginEnableExperiment> r1 = com.p683ss.android.ugc.aweme.video.experiment.VideoCachePluginEnableExperiment.class
            java.lang.String r3 = "enable_videocache_plugin"
            r2 = 1
            r4 = 31744(0x7c00, float:4.4483E-41)
            r5 = 1
            boolean r7 = r0.mo18172a(r1, r2, r3, r4, r5)
            r0 = 0
            if (r7 == 0) goto L_0x0028
            com.bytedance.ies.ugc.aweme.plugin.service.IPluginService r7 = com.p683ss.android.ugc.aweme.video.preload.C48085g.f120850b
            if (r7 == 0) goto L_0x0023
            java.lang.String r1 = "com.ss.android.ugc.aweme.videocache_v2"
            boolean r7 = r7.mo19934a(r1)
            goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            if (r7 == 0) goto L_0x0028
            r7 = 1
            goto L_0x0029
        L_0x0028:
            r7 = 0
        L_0x0029:
            com.p683ss.android.ugc.aweme.video.preload.C48085g.f120849a = r7
            if (r7 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.app.f.c r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r1 = "errorCode"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.app.f.c r7 = r7.mo47822a(r1, r2)
            java.lang.String r1 = "isFirst"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.app.f.c r7 = r7.mo47822a(r1, r0)
            java.lang.String r0 = "packageName"
            java.lang.String r1 = "com.ss.android.ugc.aweme.videocache_v2"
            com.ss.android.ugc.aweme.app.f.c r7 = r7.mo47824a(r0, r1)
            org.json.JSONObject r7 = r7.mo47825b()
            java.lang.String r0 = "videocache_pluginv2"
            java.lang.String r1 = "videocache_pluginv2"
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r0, r1, r7)
            java.lang.String r0 = "videocache_plugin_status"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r7)
        L_0x005d:
            r6.initVideoLoader()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.VideoCachePreloaderInitTask.run(android.content.Context):void");
    }
}
