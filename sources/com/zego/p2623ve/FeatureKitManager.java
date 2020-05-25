package com.zego.p2623ve;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.zego.ve.FeatureKitManager */
class FeatureKitManager {
    private static final Object BIND_SERVICE_LOCK = new Object();
    private static final Object NEW_FEATUREMANAGER_LOCK = new Object();
    private static final Object SET_CALL_BACK_LOCK = new Object();
    private static final Object UNBIND_SERVICE_LOCK = new Object();
    private static FeatureKitManager sInstance = null;
    private IAudioKitCallback mCallBack;

    /* renamed from: com.zego.ve.FeatureKitManager$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_push_downgrade_StartServiceLancet_bindService */
        static boolean m111989x6b13abbd(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
            if (context == null || !(context instanceof Context)) {
                return context.bindService(intent, serviceConnection, i);
            }
            if (C40895d.m90464a(context, intent)) {
                return true;
            }
            return context.bindService(intent, serviceConnection, i);
        }
    }

    private FeatureKitManager() {
    }

    /* access modifiers changed from: protected */
    public IAudioKitCallback getCallBack() {
        return this.mCallBack;
    }

    protected static FeatureKitManager getInstance() {
        FeatureKitManager featureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            if (sInstance == null) {
                sInstance = new FeatureKitManager();
            }
            featureKitManager = sInstance;
        }
        return featureKitManager;
    }

    /* access modifiers changed from: protected */
    public void setCallBack(IAudioKitCallback iAudioKitCallback) {
        this.mCallBack = iAudioKitCallback;
    }

    /* access modifiers changed from: protected */
    public boolean isMediaKitSupport(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getPackageInfo("com.huawei.multimedia.audioengine", 0) == null) {
                    return false;
                }
            } catch (NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCallBack(int i) {
        synchronized (SET_CALL_BACK_LOCK) {
            if (getCallBack() != null) {
                getCallBack().onResult(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void unbindService(Context context, ServiceConnection serviceConnection) {
        synchronized (UNBIND_SERVICE_LOCK) {
            if (context != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public HwAudioKaraokeFeatureKit createFeatureKit(int i, Context context) {
        if (context == null || i != 1) {
            return null;
        }
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = new HwAudioKaraokeFeatureKit(context);
        hwAudioKaraokeFeatureKit.initialize(context);
        return hwAudioKaraokeFeatureKit;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:(5:3|4|5|6|7)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindService(android.content.Context r4, android.content.ServiceConnection r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.Object r0 = BIND_SERVICE_LOCK
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0016
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0014 }
            r1.<init>()     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = "com.huawei.multimedia.audioengine"
            r1.setClassName(r2, r6)     // Catch:{ all -> 0x0014 }
            r6 = 1
            com.zego.p2623ve.FeatureKitManager._lancet.m111989x6b13abbd(r4, r1, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            goto L_0x0016
        L_0x0014:
            r4 = move-exception
            goto L_0x0018
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            return
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.p2623ve.FeatureKitManager.bindService(android.content.Context, android.content.ServiceConnection, java.lang.String):void");
    }
}
