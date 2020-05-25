package com.zego.p2623ve;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zego.p2623ve.IHwAudioKaraokeFeature.Stub;

/* renamed from: com.zego.ve.HwAudioKaraokeFeatureKit */
class HwAudioKaraokeFeatureKit {
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            HwAudioKaraokeFeatureKit.this.mIsServiceConnected = false;
            if (HwAudioKaraokeFeatureKit.this.mFeatureKitManager != null) {
                HwAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1001);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HwAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl = Stub.asInterface(iBinder);
            if (HwAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl != null) {
                HwAudioKaraokeFeatureKit.this.mIsServiceConnected = true;
                HwAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1000);
                HwAudioKaraokeFeatureKit.this.serviceInit(HwAudioKaraokeFeatureKit.this.mContext.getPackageName());
                HwAudioKaraokeFeatureKit.this.serviceLinkToDeath(iBinder);
            }
        }
    };
    public Context mContext;
    public DeathRecipient mDeathRecipient = new DeathRecipient() {
        public void binderDied() {
            HwAudioKaraokeFeatureKit.this.mService.unlinkToDeath(HwAudioKaraokeFeatureKit.this.mDeathRecipient, 0);
            HwAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
            HwAudioKaraokeFeatureKit.this.mService = null;
        }
    };
    public FeatureKitManager mFeatureKitManager = FeatureKitManager.getInstance();
    public IHwAudioKaraokeFeature mIHwAudioKaraokeFeatureAidl;
    public boolean mIsServiceConnected;
    public IBinder mService;

    public void destroy() {
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public void serviceInit(String str) {
        try {
            if (this.mIHwAudioKaraokeFeatureAidl != null && this.mIsServiceConnected) {
                this.mIHwAudioKaraokeFeatureAidl.init(str);
            }
        } catch (RemoteException unused) {
        }
    }

    protected HwAudioKaraokeFeatureKit(Context context) {
        this.mContext = context;
    }

    private void bindService(Context context) {
        if (this.mFeatureKitManager != null && !this.mIsServiceConnected) {
            this.mFeatureKitManager.bindService(context, this.mConnection, "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService");
        }
    }

    public int enableKaraokeFeature(boolean z) {
        try {
            if (this.mIHwAudioKaraokeFeatureAidl != null && this.mIsServiceConnected) {
                return this.mIHwAudioKaraokeFeatureAidl.enableKaraokeFeature(z);
            }
        } catch (RemoteException unused) {
        }
        return -2;
    }

    /* access modifiers changed from: protected */
    public void initialize(Context context) {
        if (context != null) {
            if (!this.mFeatureKitManager.isMediaKitSupport(context)) {
                this.mFeatureKitManager.onCallBack(2);
                return;
            }
            bindService(context);
        }
    }

    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (RemoteException unused) {
                this.mFeatureKitManager.onCallBack(BaseNotice.CHECK_PROFILE);
            }
        }
    }

    public int setParameter(String str, int i) {
        try {
            if (this.mIHwAudioKaraokeFeatureAidl != null && this.mIsServiceConnected) {
                return this.mIHwAudioKaraokeFeatureAidl.setParameter(str, i);
            }
        } catch (RemoteException unused) {
        }
        return -2;
    }
}
