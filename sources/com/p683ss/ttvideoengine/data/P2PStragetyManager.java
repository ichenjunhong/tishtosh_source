package com.p683ss.ttvideoengine.data;

import com.C2240a;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: com.ss.ttvideoengine.data.P2PStragetyManager */
public class P2PStragetyManager {
    public int enableP2PStragetyConntrol;
    public int expiredT;
    private long lastBufferT;
    private long lastErrorT;
    private long lastLeaveT;
    private int mForbidP2P;
    public int maxBufferingTime;
    public int maxLeaveWaitTme;
    public int minPlayNum;
    private long playNum;

    /* renamed from: com.ss.ttvideoengine.data.P2PStragetyManager$Holder */
    static class Holder {
        public static P2PStragetyManager instance = new P2PStragetyManager();

        private Holder() {
        }
    }

    public static P2PStragetyManager getInstance() {
        return Holder.instance;
    }

    public synchronized void onePlay() {
        this.playNum++;
    }

    private P2PStragetyManager() {
        this.minPlayNum = 5;
        this.maxLeaveWaitTme = 600;
        this.maxBufferingTime = 500;
        this.expiredT = 120;
    }

    public synchronized int isAllowP2p() {
        if (this.enableP2PStragetyConntrol == 0) {
            TTVideoEngineLog.m110644d("P2PStragetyManager", C2240a.m6772a("control not open, enable p2p", new Object[0]));
            return 1;
        } else if (this.minPlayNum <= 0 || this.playNum >= ((long) this.minPlayNum)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.lastLeaveT > 0 && currentTimeMillis - this.lastLeaveT < ((long) this.expiredT)) {
                TTVideoEngineLog.m110644d("P2PStragetyManager", C2240a.m6772a("curT:%d lastLeaveT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.lastLeaveT), Long.valueOf(currentTimeMillis - this.lastLeaveT), Integer.valueOf(this.expiredT)}));
                return 0;
            } else if (this.lastBufferT > 0 && currentTimeMillis - this.lastBufferT < ((long) this.expiredT)) {
                TTVideoEngineLog.m110644d("P2PStragetyManager", C2240a.m6772a("curT:%d lastbufferT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.lastBufferT), Long.valueOf(currentTimeMillis - this.lastBufferT), Integer.valueOf(this.expiredT)}));
                return 0;
            } else if (this.lastErrorT <= 0 || currentTimeMillis - this.lastErrorT >= ((long) this.expiredT)) {
                this.lastLeaveT = 0;
                this.lastErrorT = 0;
                this.lastBufferT = 0;
                this.mForbidP2P = 0;
                TTVideoEngineLog.m110644d("P2PStragetyManager", C2240a.m6772a("allow p2p", new Object[0]));
                return 1;
            } else {
                TTVideoEngineLog.m110644d("P2PStragetyManager", C2240a.m6772a("curT:%d lastErrorT:%d,internal:%d not reach expiredT:%d, not allow p2p", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(this.lastErrorT), Long.valueOf(currentTimeMillis - this.lastErrorT), Integer.valueOf(this.expiredT)}));
                return 0;
            }
        } else {
            TTVideoEngineLog.m110644d("P2PStragetyManager", C2240a.m6772a("curplaynum:%d minnum:%d, not allow p2p", new Object[]{Long.valueOf(this.playNum), Integer.valueOf(this.minPlayNum)}));
            return 0;
        }
    }

    public synchronized void setPlayErrororInterrupt(int i) {
        if (this.enableP2PStragetyConntrol != 0) {
            TTVideoEngineLog.m110644d("P2PStragetyManager", C2240a.m6772a("occur error code:%d, play after this not allow p2p!", new Object[]{Integer.valueOf(i)}));
            this.lastErrorT = System.currentTimeMillis();
            this.mForbidP2P = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setBufferingTime(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.enableP2PStragetyConntrol     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r6)
            return
        L_0x0007:
            java.lang.String r0 = "P2PStragetyManager"
            java.lang.String r1 = "set buffering time:%d "
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0042 }
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0042 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = com.C2240a.m6772a(r1, r3)     // Catch:{ all -> 0x0042 }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r0, r1)     // Catch:{ all -> 0x0042 }
            int r0 = r6.maxBufferingTime     // Catch:{ all -> 0x0042 }
            long r0 = (long) r0     // Catch:{ all -> 0x0042 }
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0040
            java.lang.String r7 = "P2PStragetyManager"
            java.lang.String r8 = "reach max buffering time:%d not allow p2p"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0042 }
            int r1 = r6.maxBufferingTime     // Catch:{ all -> 0x0042 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0042 }
            r0[r5] = r1     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = com.C2240a.m6772a(r8, r0)     // Catch:{ all -> 0x0042 }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r7, r8)     // Catch:{ all -> 0x0042 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0042 }
            r6.lastBufferT = r7     // Catch:{ all -> 0x0042 }
            r6.mForbidP2P = r2     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r6)
            return
        L_0x0042:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.data.P2PStragetyManager.setBufferingTime(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setLeaveWaitTime(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.enableP2PStragetyConntrol     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r6)
            return
        L_0x0007:
            java.lang.String r0 = "P2PStragetyManager"
            java.lang.String r1 = "leave wait time:%d "
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x004d }
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x004d }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x004d }
            java.lang.String r1 = com.C2240a.m6772a(r1, r3)     // Catch:{ all -> 0x004d }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r0, r1)     // Catch:{ all -> 0x004d }
            int r0 = r6.maxLeaveWaitTme     // Catch:{ all -> 0x004d }
            if (r0 <= 0) goto L_0x004b
            int r0 = r6.maxLeaveWaitTme     // Catch:{ all -> 0x004d }
            long r0 = (long) r0     // Catch:{ all -> 0x004d }
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x004b
            java.lang.String r0 = "P2PStragetyManager"
            java.lang.String r1 = "leave wait time:%d allow max:%d, play after this not allow p2p!"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004d }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x004d }
            r3[r5] = r7     // Catch:{ all -> 0x004d }
            int r7 = r6.maxLeaveWaitTme     // Catch:{ all -> 0x004d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004d }
            r3[r2] = r7     // Catch:{ all -> 0x004d }
            java.lang.String r7 = com.C2240a.m6772a(r1, r3)     // Catch:{ all -> 0x004d }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r0, r7)     // Catch:{ all -> 0x004d }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004d }
            r6.lastLeaveT = r7     // Catch:{ all -> 0x004d }
            r6.mForbidP2P = r2     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r6)
            return
        L_0x004d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.data.P2PStragetyManager.setLeaveWaitTime(long):void");
    }
}
