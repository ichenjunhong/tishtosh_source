package com.p683ss.ttvideoengine.net;

import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: com.ss.ttvideoengine.net.LocalDNS */
public class LocalDNS extends BaseDNS {
    public InetAddress mAddress;
    private Future mFuture;
    public boolean mRet;

    /* renamed from: com.ss.ttvideoengine.net.LocalDNS$MyRunnable */
    static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        public void run() {
            LocalDNS localDNS = (LocalDNS) this.mLocalDNSRef.get();
            if (localDNS != null) {
                synchronized (LocalDNS.class) {
                    if (!localDNS.mRet) {
                        localDNS.mRet = true;
                        localDNS.notifyError(new Error("kTTVideoErrorDomainLocalDNS", -10000));
                    }
                }
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }
    }

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            if (this.mFuture != null) {
                this.mFuture.cancel(true);
                this.mFuture = null;
            }
        }
    }

    public void close() {
        super.close();
        this.mCancelled = true;
        if (this.mFuture != null) {
            this.mFuture.cancel(true);
            this.mFuture = null;
        }
    }

    public void start() {
        try {
            this.mFuture = EngineThreadPool.addExecuteTask(new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
                    if (r1 != null) goto L_0x006d;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
                    r6.this$0.notifyError(new com.p683ss.ttvideoengine.utils.Error("kTTVideoErrorDomainLocalDNS", -9997));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
                    r0 = new org.json.JSONObject();
                    r2 = new org.json.JSONArray();
                    r2.put(r1);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
                    r0.put("ips", r2);
                    r0.put("time", java.lang.System.currentTimeMillis());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
                    com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r1);
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r6 = this;
                        r0 = 1
                        com.ss.ttvideoengine.net.LocalDNS r1 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ Throwable -> 0x0098 }
                        com.ss.ttvideoengine.net.LocalDNS r2 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ Throwable -> 0x0098 }
                        java.lang.String r2 = r2.mHostname     // Catch:{ Throwable -> 0x0098 }
                        java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch:{ Throwable -> 0x0098 }
                        r1.mAddress = r2     // Catch:{ Throwable -> 0x0098 }
                        com.ss.ttvideoengine.net.LocalDNS r1 = com.p683ss.ttvideoengine.net.LocalDNS.this
                        java.net.InetAddress r1 = r1.mAddress
                        if (r1 != 0) goto L_0x0033
                        java.lang.Class<com.ss.ttvideoengine.net.LocalDNS> r1 = com.p683ss.ttvideoengine.net.LocalDNS.class
                        monitor-enter(r1)
                        com.ss.ttvideoengine.net.LocalDNS r2 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x0030 }
                        boolean r2 = r2.mRet     // Catch:{ all -> 0x0030 }
                        if (r2 != 0) goto L_0x002e
                        com.ss.ttvideoengine.net.LocalDNS r2 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x0030 }
                        r2.mRet = r0     // Catch:{ all -> 0x0030 }
                        com.ss.ttvideoengine.net.LocalDNS r0 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x0030 }
                        com.ss.ttvideoengine.utils.Error r2 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x0030 }
                        java.lang.String r3 = "kTTVideoErrorDomainLocalDNS"
                        r4 = -9998(0xffffffffffffd8f2, float:NaN)
                        r2.<init>(r3, r4)     // Catch:{ all -> 0x0030 }
                        r0.notifyError(r2)     // Catch:{ all -> 0x0030 }
                    L_0x002e:
                        monitor-exit(r1)     // Catch:{ all -> 0x0030 }
                        return
                    L_0x0030:
                        r0 = move-exception
                        monitor-exit(r1)     // Catch:{ all -> 0x0030 }
                        throw r0
                    L_0x0033:
                        com.ss.ttvideoengine.net.LocalDNS r1 = com.p683ss.ttvideoengine.net.LocalDNS.this
                        java.net.InetAddress r1 = r1.mAddress
                        java.lang.String r1 = r1.getHostAddress()
                        com.ss.ttvideoengine.net.LocalDNS r2 = com.p683ss.ttvideoengine.net.LocalDNS.this
                        java.net.InetAddress r2 = r2.mAddress
                        boolean r2 = r2 instanceof java.net.Inet6Address
                        if (r2 == 0) goto L_0x004e
                        java.lang.String r2 = "[%s]"
                        java.lang.Object[] r3 = new java.lang.Object[r0]
                        r4 = 0
                        r3[r4] = r1
                        java.lang.String r1 = com.C2240a.m6772a(r2, r3)
                    L_0x004e:
                        java.lang.Class<com.ss.ttvideoengine.net.LocalDNS> r2 = com.p683ss.ttvideoengine.net.LocalDNS.class
                        monitor-enter(r2)
                        com.ss.ttvideoengine.net.LocalDNS r3 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x0095 }
                        boolean r3 = r3.mRet     // Catch:{ all -> 0x0095 }
                        if (r3 != 0) goto L_0x0093
                        com.ss.ttvideoengine.net.LocalDNS r3 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x0095 }
                        r3.mRet = r0     // Catch:{ all -> 0x0095 }
                        monitor-exit(r2)     // Catch:{ all -> 0x0095 }
                        if (r1 != 0) goto L_0x006d
                        com.ss.ttvideoengine.net.LocalDNS r0 = com.p683ss.ttvideoengine.net.LocalDNS.this
                        com.ss.ttvideoengine.utils.Error r1 = new com.ss.ttvideoengine.utils.Error
                        java.lang.String r2 = "kTTVideoErrorDomainLocalDNS"
                        r3 = -9997(0xffffffffffffd8f3, float:NaN)
                        r1.<init>(r2, r3)
                        r0.notifyError(r1)
                        return
                    L_0x006d:
                        org.json.JSONObject r0 = new org.json.JSONObject
                        r0.<init>()
                        org.json.JSONArray r2 = new org.json.JSONArray
                        r2.<init>()
                        r2.put(r1)
                        java.lang.String r1 = "ips"
                        r0.put(r1, r2)     // Catch:{ JSONException -> 0x0089 }
                        java.lang.String r1 = "time"
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0089 }
                        r0.put(r1, r2)     // Catch:{ JSONException -> 0x0089 }
                        goto L_0x008d
                    L_0x0089:
                        r1 = move-exception
                        com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r1)
                    L_0x008d:
                        com.ss.ttvideoengine.net.LocalDNS r1 = com.p683ss.ttvideoengine.net.LocalDNS.this
                        r1.notifySuccess(r0)
                        return
                    L_0x0093:
                        monitor-exit(r2)     // Catch:{ all -> 0x0095 }
                        return
                    L_0x0095:
                        r0 = move-exception
                        monitor-exit(r2)     // Catch:{ all -> 0x0095 }
                        throw r0
                    L_0x0098:
                        r1 = move-exception
                        com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r1)
                        java.lang.Class<com.ss.ttvideoengine.net.LocalDNS> r2 = com.p683ss.ttvideoengine.net.LocalDNS.class
                        monitor-enter(r2)
                        com.ss.ttvideoengine.net.LocalDNS r3 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x00bd }
                        boolean r3 = r3.mRet     // Catch:{ all -> 0x00bd }
                        if (r3 != 0) goto L_0x00bb
                        com.ss.ttvideoengine.net.LocalDNS r3 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x00bd }
                        r3.mRet = r0     // Catch:{ all -> 0x00bd }
                        com.ss.ttvideoengine.net.LocalDNS r0 = com.p683ss.ttvideoengine.net.LocalDNS.this     // Catch:{ all -> 0x00bd }
                        com.ss.ttvideoengine.utils.Error r3 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x00bd }
                        java.lang.String r4 = "kTTVideoErrorDomainLocalDNS"
                        r5 = -9968(0xffffffffffffd910, float:NaN)
                        java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00bd }
                        r3.<init>(r4, r5, r1)     // Catch:{ all -> 0x00bd }
                        r0.notifyError(r3)     // Catch:{ all -> 0x00bd }
                    L_0x00bb:
                        monitor-exit(r2)     // Catch:{ all -> 0x00bd }
                        return
                    L_0x00bd:
                        r0 = move-exception
                        monitor-exit(r2)     // Catch:{ all -> 0x00bd }
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.net.LocalDNS.C515111.run():void");
                }
            });
        } catch (Exception e) {
            notifyError(new Error("kTTVideoErrorDomainLocalDNS", -9968, e.getMessage()));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNS(String str) {
        super(str);
        TTVideoEngineLog.m110647i("LocalDNS", "DNS use LocalDNS");
    }
}
