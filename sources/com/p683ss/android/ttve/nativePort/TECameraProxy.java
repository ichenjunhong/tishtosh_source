package com.p683ss.android.ttve.nativePort;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.p683ss.android.ttve.utils.CameraInstance;
import com.p683ss.android.ttve.utils.CameraInstance.C20139a;
import com.p683ss.android.vesdk.C50792y;

/* renamed from: com.ss.android.ttve.nativePort.TECameraProxy */
public class TECameraProxy extends CameraInstance {
    private static final String TAG = "TECameraProxy";
    public static long mNativeAddr;
    private C20139a mCameraOpenCallback = new C20139a() {
        /* renamed from: a */
        public final void mo42292a() {
            TECameraProxy.this.nativeOnCameraCreate(TECameraProxy.mNativeAddr, 0);
        }
    };
    private int mCameraTextureID;
    private SurfaceTexture mSurfaceTexture;
    public boolean mbSurfaceTextureReleased;

    static {
        C20129b.m49685b();
    }

    public native int nativeOnCameraCreate(long j, int i);

    public native int nativeOnFrameAvailable(long j, SurfaceTexture surfaceTexture);

    public synchronized void getNextFrame() {
        this.mSurfaceTexture.updateTexImage();
    }

    public synchronized void startPreview() {
        startPreview(this.mSurfaceTexture);
        this.mbSurfaceTextureReleased = false;
    }

    public synchronized void stopCamera() {
        this.mbSurfaceTextureReleased = true;
        this.mSurfaceTexture.setOnFrameAvailableListener(null);
        super.stopCamera();
    }

    public static TECameraProxy create(long j) {
        mNativeAddr = j;
        return new TECameraProxy();
    }

    public synchronized boolean open(int i) {
        return tryOpenCamera(this.mCameraOpenCallback, i);
    }

    public synchronized boolean switchCamera(int i) {
        if (!tryOpenCamera(this.mCameraOpenCallback, i)) {
            return false;
        }
        startPreview(this.mSurfaceTexture);
        return true;
    }

    public int setSurfaceTexture(Object obj, int i) {
        C50792y.m109911b(TAG, "setSurfaceTexture...");
        if (i == 0) {
            C50792y.m109914d(TAG, "Invalid Texture ID!");
            return -100;
        } else if (obj instanceof SurfaceTexture) {
            this.mSurfaceTexture = (SurfaceTexture) obj;
            this.mSurfaceTexture.setOnFrameAvailableListener(new OnFrameAvailableListener() {
                public final synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    if (!TECameraProxy.this.mbSurfaceTextureReleased) {
                        TECameraProxy.this.nativeOnFrameAvailable(TECameraProxy.mNativeAddr, surfaceTexture);
                    }
                }
            });
            return 0;
        } else {
            C50792y.m109914d(TAG, "Invalid SurfaceTexture!");
            return -100;
        }
    }
}
