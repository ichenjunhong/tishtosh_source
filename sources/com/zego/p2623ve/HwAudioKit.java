package com.zego.p2623ve;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zego.p2623ve.IHwAudioEngine.Stub;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zego.ve.HwAudioKit */
public class HwAudioKit {
    protected IAudioKitCallback _callBack = new IAudioKitCallback() {
        public void onResult(int i) {
            StringBuilder sb = new StringBuilder("audiokit callback ");
            sb.append(i);
            Log.m111994i("HwAudioKit.HwAudioKit", sb.toString());
            if (HwAudioKit.this.barrier != null) {
                HwAudioKit.this.barrier.countDown();
            }
            if (i != 0) {
                if (i != 2) {
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                            break;
                        default:
                            switch (i) {
                                case 1000:
                                    HwAudioKit.this._state = state.state_karaoke_success;
                                    return;
                                case 1001:
                                case BaseNotice.CHECK_PROFILE /*1002*/:
                                case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                                    HwAudioKit.this._state = state.state_karaoke_failed;
                                    break;
                            }
                            return;
                    }
                }
                HwAudioKit.this._state = state.state_audiokit_failed;
                return;
            }
            HwAudioKit.this._state = state.state_audiokit_success;
        }
    };
    protected HwAudioKaraokeFeatureKit _hwAudioKaraokeFeatureKit = null;
    protected state _state = state.state_none;
    protected CountDownLatch barrier = null;
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            HwAudioKit.this.mIHwAudioEngine = null;
            HwAudioKit.this.mIsServiceConnected = false;
            HwAudioKit.this.mFeatureKitManager.onCallBack(4);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HwAudioKit.this.mIHwAudioEngine = Stub.asInterface(iBinder);
            if (HwAudioKit.this.mIHwAudioEngine != null) {
                HwAudioKit.this.mIsServiceConnected = true;
                HwAudioKit.this.mFeatureKitManager.onCallBack(0);
                HwAudioKit.this.serviceInit(HwAudioKit.this.mContext.getPackageName(), "1.0.1");
                HwAudioKit.this.serviceLinkToDeath(iBinder);
            }
        }
    };
    public Context mContext;
    public DeathRecipient mDeathRecipient = new DeathRecipient() {
        public void binderDied() {
            HwAudioKit.this.mService.unlinkToDeath(HwAudioKit.this.mDeathRecipient, 0);
            HwAudioKit.this.mFeatureKitManager.onCallBack(6);
            HwAudioKit.this.mService = null;
        }
    };
    public FeatureKitManager mFeatureKitManager = FeatureKitManager.getInstance();
    public IHwAudioEngine mIHwAudioEngine;
    public boolean mIsServiceConnected;
    public IBinder mService = null;

    /* renamed from: com.zego.ve.HwAudioKit$state */
    enum state {
        state_none,
        state_audiokit_success,
        state_audiokit_failed,
        state_karaoke_success,
        state_karaoke_failed
    }

    public boolean isFeatureKaraokeOn() {
        if (this._state == state.state_karaoke_success) {
            return true;
        }
        return false;
    }

    public void destroy() {
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
        if (this._hwAudioKaraokeFeatureKit != null) {
            this._hwAudioKaraokeFeatureKit.destroy();
        }
    }

    public void createFeatureKaraoke() {
        this.barrier = new CountDownLatch(1);
        this._hwAudioKaraokeFeatureKit = this.mFeatureKitManager.createFeatureKit(1, this.mContext);
        try {
            if (!this.barrier.await(100, TimeUnit.MILLISECONDS)) {
                Log.m111992e("HwAudioKit.HwAudioKit", "createFeatureKaraoke timeout");
            }
        } catch (InterruptedException unused) {
        }
        this.barrier = null;
    }

    public boolean initialize() {
        this.barrier = new CountDownLatch(1);
        if (this.mContext == null) {
            this.mFeatureKitManager.onCallBack(7);
        } else if (!this.mFeatureKitManager.isMediaKitSupport(this.mContext)) {
            this.mFeatureKitManager.onCallBack(2);
        } else {
            bindService(this.mContext);
        }
        try {
            if (!this.barrier.await(100, TimeUnit.MILLISECONDS)) {
                Log.m111992e("HwAudioKit.HwAudioKit", "initialize timeout");
            }
        } catch (InterruptedException unused) {
        }
        this.barrier = null;
        if (this._state == state.state_audiokit_success) {
            return true;
        }
        return false;
    }

    public int enableKaraokeFeature(boolean z) {
        return this._hwAudioKaraokeFeatureKit.enableKaraokeFeature(z);
    }

    public void setKaraokeVolume(int i) {
        this._hwAudioKaraokeFeatureKit.setParameter("Karaoke_volume=", i);
    }

    private void bindService(Context context) {
        if (this.mFeatureKitManager != null && !this.mIsServiceConnected) {
            this.mFeatureKitManager.bindService(context, this.mConnection, "com.huawei.multimedia.audioengine.HwAudioEngineService");
        }
    }

    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        try {
            if (this.mService != null) {
                this.mService.linkToDeath(this.mDeathRecipient, 0);
            }
        } catch (RemoteException unused) {
            this.mFeatureKitManager.onCallBack(5);
        }
    }

    public HwAudioKit(Context context) {
        this.mFeatureKitManager.setCallBack(this._callBack);
        this.mContext = context;
    }

    public void serviceInit(String str, String str2) {
        try {
            if (this.mIHwAudioEngine != null && this.mIsServiceConnected) {
                this.mIHwAudioEngine.init(str, str2);
            }
        } catch (RemoteException unused) {
        }
    }
}
