package com.p683ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import com.p683ss.android.p1159di.push.C19073a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl */
public class OptimizePushProcessImpl implements C40892a {

    /* renamed from: a */
    public static volatile boolean f104070a;

    /* renamed from: b */
    public static boolean f104071b;

    /* renamed from: com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl$StartPushProcessTask */
    public static class StartPushProcessTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BACKGROUND;
        }

        public void run(Context context) {
            C19073a.m46451a().startPushProcess(context);
            C19073a.m46451a().removeRedBadge(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl$a */
    public static class C40891a implements C1710e<Boolean> {
        public final /* synthetic */ void accept(Object obj) throws Exception {
            if (((Boolean) obj).booleanValue() && !OptimizePushProcessImpl.f104071b) {
                OptimizePushProcessImpl.f104071b = true;
                C40898g.m90472a();
                C35857a.m81001b().mo74526a(new StartPushProcessTask()).mo74527a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83380a(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x005d
            if (r6 == 0) goto L_0x002e
            if (r7 == 0) goto L_0x002e
            android.content.ComponentName r2 = r7.getComponent()
            if (r2 == 0) goto L_0x002e
            java.lang.String r3 = r6.getPackageName()
            java.lang.String r4 = r2.getPackageName()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x002e
            java.lang.String r2 = r2.getClassName()
            java.lang.Class<com.bytedance.common.wschannel.server.WsChannelService> r3 = com.bytedance.common.wschannel.server.WsChannelService.class
            java.lang.String r3 = r3.getName()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x005d
            boolean r2 = com.p683ss.android.ugc.aweme.push.downgrade.C40899h.f104085a
            if (r2 != 0) goto L_0x004a
            boolean r2 = com.bytedance.ies.ugc.p694a.C11016e.m22313h()
            if (r2 != 0) goto L_0x0048
            boolean r2 = com.p683ss.android.ugc.aweme.push.downgrade.C40896e.m90465a(r6)
            if (r2 == 0) goto L_0x0048
            boolean r2 = com.p683ss.android.ugc.aweme.push.downgrade.C40898g.m90474c(r6)
            if (r2 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r2 = 0
            goto L_0x004b
        L_0x004a:
            r2 = 1
        L_0x004b:
            if (r2 == 0) goto L_0x005b
            com.p683ss.android.ugc.aweme.push.downgrade.C40899h.f104085a = r0
            if (r7 == 0) goto L_0x005b
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Class<com.ss.android.ugc.aweme.push.downgrade.notice.MainProcessWsChannelService> r3 = com.p683ss.android.ugc.aweme.push.downgrade.notice.MainProcessWsChannelService.class
            r2.<init>(r6, r3)
            r7.setComponent(r2)
        L_0x005b:
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 != 0) goto L_0x00cf
            boolean r2 = com.bytedance.ies.ugc.p694a.C11016e.m22313h()
            if (r2 != 0) goto L_0x00ad
            boolean r2 = com.p683ss.android.ugc.aweme.push.downgrade.C40896e.m90465a(r6)
            if (r2 == 0) goto L_0x00ad
            boolean r2 = com.p683ss.android.ugc.aweme.push.downgrade.C40898g.m90474c(r6)
            if (r2 != 0) goto L_0x00ad
            if (r7 == 0) goto L_0x00a8
            android.content.ComponentName r2 = r7.getComponent()
            if (r2 == 0) goto L_0x00a3
            java.lang.String r3 = r6.getPackageName()
            java.lang.String r4 = r2.getPackageName()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x00a8
            com.p683ss.android.ugc.aweme.push.downgrade.C40897f.m90468a(r6)
            java.util.Set<java.lang.String> r3 = com.p683ss.android.ugc.aweme.push.downgrade.C40897f.f104078a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x009e
            java.util.Set<java.lang.String> r6 = com.p683ss.android.ugc.aweme.push.downgrade.C40897f.f104078a
            java.lang.String r7 = r2.getClassName()
            boolean r6 = r6.contains(r7)
            goto L_0x00a9
        L_0x009e:
            boolean r6 = com.p683ss.android.ugc.aweme.push.downgrade.C40897f.m90469a(r6, r7)
            goto L_0x00a9
        L_0x00a3:
            boolean r6 = com.p683ss.android.ugc.aweme.push.downgrade.C40897f.m90469a(r6, r7)
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            if (r6 == 0) goto L_0x00ad
            r6 = 1
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            if (r6 == 0) goto L_0x00cf
            boolean r6 = f104070a
            if (r6 != 0) goto L_0x00ce
            java.lang.Class<com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl> r6 = com.p683ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl.class
            monitor-enter(r6)
            boolean r7 = f104070a     // Catch:{ all -> 0x00cb }
            if (r7 != 0) goto L_0x00c9
            f104070a = r0     // Catch:{ all -> 0x00cb }
            c.a.v r7 = com.bytedance.ies.ugc.p694a.C11016e.m22309d()     // Catch:{ all -> 0x00cb }
            com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl$a r1 = new com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl$a     // Catch:{ all -> 0x00cb }
            r1.<init>()     // Catch:{ all -> 0x00cb }
            r7.mo6545f(r1)     // Catch:{ all -> 0x00cb }
        L_0x00c9:
            monitor-exit(r6)     // Catch:{ all -> 0x00cb }
            goto L_0x00ce
        L_0x00cb:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00cb }
            throw r7
        L_0x00ce:
            return r0
        L_0x00cf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl.mo83380a(android.content.Context, android.content.Intent):boolean");
    }
}
