package com.p683ss.android.ugc.aweme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.v */
public final class C27985v {

    /* renamed from: a */
    private List<BroadcastReceiver> f73412a = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo56385b(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002c
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0029 }
            r1 = 26
            if (r0 >= r1) goto L_0x000a
            goto L_0x002c
        L_0x000a:
            java.util.List<android.content.BroadcastReceiver> r0 = r2.f73412a     // Catch:{ all -> 0x0029 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0029 }
        L_0x0010:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0029 }
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0010
            r3.unregisterReceiver(r1)     // Catch:{ all -> 0x0029 }
            goto L_0x0010
        L_0x0022:
            java.util.List<android.content.BroadcastReceiver> r3 = r2.f73412a     // Catch:{ all -> 0x0029 }
            r3.clear()     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002c:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.C27985v.mo56385b(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo56383a(android.content.Context r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.ss.android.ugc.aweme.common.net.NetworkStateAvailableReceiver r0 = new com.ss.android.ugc.aweme.common.net.NetworkStateAvailableReceiver     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0090 }
            r10.mo56384a(r11, r0, r2)     // Catch:{ all -> 0x0090 }
            if (r11 == 0) goto L_0x008e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0090 }
            r2 = 26
            if (r0 >= r2) goto L_0x001a
            goto L_0x008e
        L_0x001a:
            com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver r0 = new com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2[r4] = r3     // Catch:{ all -> 0x0090 }
            r10.mo56384a(r11, r0, r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver r0 = new com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "android.intent.action.PACKAGE_ADDED"
            r2[r4] = r3     // Catch:{ all -> 0x0090 }
            r10.mo56384a(r11, r0, r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.download.DownloadReceiver r0 = new com.ss.android.download.DownloadReceiver     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            r2 = 3
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3[r4] = r5     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = "android.intent.action.PACKAGE_ADDED"
            r3[r1] = r5     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = "android.intent.action.PACKAGE_REPLACED"
            r6 = 2
            r3[r6] = r5     // Catch:{ all -> 0x0090 }
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = "package"
            r5[r4] = r7     // Catch:{ all -> 0x0090 }
            java.util.List<android.content.BroadcastReceiver> r7 = r10.f73412a     // Catch:{ all -> 0x0090 }
            r7.add(r0)     // Catch:{ all -> 0x0090 }
            android.content.IntentFilter r7 = new android.content.IntentFilter     // Catch:{ all -> 0x0090 }
            r7.<init>()     // Catch:{ all -> 0x0090 }
            r8 = 0
        L_0x005c:
            if (r8 >= r2) goto L_0x0066
            r9 = r3[r8]     // Catch:{ all -> 0x0090 }
            r7.addAction(r9)     // Catch:{ all -> 0x0090 }
            int r8 = r8 + 1
            goto L_0x005c
        L_0x0066:
            r2 = 0
        L_0x0067:
            if (r2 > 0) goto L_0x0071
            r3 = r5[r4]     // Catch:{ all -> 0x0090 }
            r7.addDataScheme(r3)     // Catch:{ all -> 0x0090 }
            int r2 = r2 + 1
            goto L_0x0067
        L_0x0071:
            r11.registerReceiver(r0, r7)     // Catch:{ all -> 0x0090 }
            boolean r0 = com.p683ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment.m82548a()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.video.EarPhoneUnplugReceiver r0 = new com.ss.android.ugc.aweme.video.EarPhoneUnplugReceiver     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "android.media.AUDIO_BECOMING_NOISY"
            r2[r4] = r3     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            r2[r1] = r3     // Catch:{ all -> 0x0090 }
            r10.mo56384a(r11, r0, r2)     // Catch:{ all -> 0x0090 }
        L_0x008c:
            monitor-exit(r10)
            return
        L_0x008e:
            monitor-exit(r10)
            return
        L_0x0090:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.C27985v.mo56383a(android.content.Context):void");
    }

    /* renamed from: a */
    public void mo56384a(Context context, BroadcastReceiver broadcastReceiver, String[] strArr) {
        this.f73412a.add(broadcastReceiver);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
        }
        context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
