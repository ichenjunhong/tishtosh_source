package com.p683ss.android.ugc.aweme.legoImp.task;

import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SymphonySdkInitTask */
public class SymphonySdkInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (com.p683ss.android.ugc.aweme.protection.C40869c.m90385p() != 1) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(android.content.Context r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager r7 = com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager.m63648a()
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r1 = r7.f69378b
            if (r1 == 0) goto L_0x0090
            boolean r1 = r7.f69377a
            if (r1 != 0) goto L_0x0090
            r1 = 1
            r7.f69377a = r1
            com.ss.android.ugc.aweme.commercialize.symphony.c r2 = new com.ss.android.ugc.aweme.commercialize.symphony.c
            r2.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager$1 r3 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager$1
            r3.<init>()
            com.bytedance.ad.symphony.d.d r4 = com.p683ss.android.ugc.aweme.commercialize.symphony.C26311d.f69438a
            com.bytedance.ad.symphony.c r5 = new com.bytedance.ad.symphony.c
            r5.<init>(r0, r3)
            r5.f8185f = r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager$2 r2 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager$2
            r2.<init>(r0)
            com.bytedance.ad.symphony.b.a.h r7 = new com.bytedance.ad.symphony.b.a.h
            r7.<init>(r0)
            r7.f8177d = r2
            r5.f8186g = r7
            r5.f8190k = r4
            r7 = 0
            r5.f8183d = r7
            int r0 = com.p683ss.android.ugc.aweme.protection.C40869c.m90383n()
            if (r0 != r1) goto L_0x0061
            com.ss.android.ugc.aweme.protection.a.a r0 = com.p683ss.android.ugc.aweme.protection.C40869c.f104033b
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r0.mo83162a()
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r0 = r0.getAdPersonalitySettings()
            if (r0 == 0) goto L_0x0058
            java.lang.Boolean r0 = r0.getShowPartnerAd()
            if (r0 == 0) goto L_0x0058
            boolean r0 = r0.booleanValue()
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x0064
            int r0 = com.p683ss.android.ugc.aweme.protection.C40869c.m90385p()
            if (r0 == r1) goto L_0x0064
        L_0x0061:
            com.bytedance.p126ad.symphony.C2680b.m7712a(r7)
        L_0x0064:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 == 0) goto L_0x006d
            com.bytedance.p126ad.symphony.C2680b.m7712a(r7)
        L_0x006d:
            java.lang.Class<com.bytedance.ad.symphony.b> r7 = com.bytedance.p126ad.symphony.C2680b.class
            monitor-enter(r7)
            com.bytedance.ad.symphony.b r0 = com.bytedance.p126ad.symphony.C2680b.f8141a     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0084
            boolean r0 = com.bytedance.p126ad.symphony.C2680b.m7713b()     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x007c
            monitor-exit(r7)     // Catch:{ all -> 0x008d }
            return
        L_0x007c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008d }
            java.lang.String r1 = "Singleton instance already exists."
            r0.<init>(r1)     // Catch:{ all -> 0x008d }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x0084:
            com.bytedance.ad.symphony.b r0 = new com.bytedance.ad.symphony.b     // Catch:{ all -> 0x008d }
            r0.<init>(r5)     // Catch:{ all -> 0x008d }
            com.bytedance.p126ad.symphony.C2680b.f8141a = r0     // Catch:{ all -> 0x008d }
            monitor-exit(r7)     // Catch:{ all -> 0x008d }
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x008d }
            throw r0
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.SymphonySdkInitTask.run(android.content.Context):void");
    }
}
