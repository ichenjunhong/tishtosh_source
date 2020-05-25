package com.p683ss.texturerender;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.p683ss.texturerender.TextureRenderer.OnTextureFocusLossListener;
import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.VideoSurfaceTexture */
public class VideoSurfaceTexture extends SurfaceTexture implements OnFrameAvailableListener, OnTextureFocusLossListener, Serializable {
    private Looper mCreateLooper;
    private EGLConfig mEglConfig;
    private EGLContext mEglContext;
    private EGLDisplay mEglDisplay;
    private EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private long mIdleTimeStamp;
    private boolean mIsMakeCurrent = false;
    private boolean mIsPaused = false;
    private volatile boolean mIsRelease = false;
    private ReentrantLock mLock;
    private long mObjectId;
    private VideoSurface mOffScreenSurface = null;
    private Handler mRenderHandler;
    private Bundle mRenderMsgBundle;
    private Surface mRenderSurface = null;
    private int mSerial = 0;
    private ITexture mTextureId;
    private long mTid;
    private Surface mUpdateSurface = null;
    private long mUpdateSurfaceTime;
    private int mViewportHeight = 0;
    private int mViewportWidth = 0;

    /* renamed from: com.ss.texturerender.VideoSurfaceTexture$TextureDrawCallback */
    public interface TextureDrawCallback {
        void onTextureUpdate(int i, long j);
    }

    public long getOjbectId() {
        return this.mObjectId;
    }

    public int getSerial() {
        return this.mSerial;
    }

    public long getSurfaceUpdateTime() {
        return this.mUpdateSurfaceTime;
    }

    public ITexture getTexId() {
        return this.mTextureId;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public boolean isRelease() {
        return this.mIsRelease;
    }

    public void onFocusLoss() {
        this.mIsMakeCurrent = false;
    }

    public void lock() {
        this.mLock.lock();
    }

    public void unlock() {
        this.mLock.unlock();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        TextureRenderLog.m110623d("VideoSurfaceTexture", "finalize");
        releaseInternal();
        super.finalize();
    }

    public int getViewportHeight() {
        int consumerHeight = getConsumerHeight();
        if (this.mViewportHeight != consumerHeight) {
            this.mViewportHeight = consumerHeight;
        }
        return this.mViewportHeight;
    }

    public int getViewportWidth() {
        int consumerWidth = getConsumerWidth();
        if (this.mViewportWidth != consumerWidth) {
            this.mViewportWidth = consumerWidth;
        }
        return this.mViewportWidth;
    }

    public boolean isMakeCurrent() {
        if (!this.mIsMakeCurrent || this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    private int getConsumerHeight() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    private int getConsumerWidth() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public boolean couldForceRelease() {
        if (SystemClock.elapsedRealtime() - this.mIdleTimeStamp > 120000) {
            return true;
        }
        return false;
    }

    public void release() {
        TextureRenderLog.m110623d("VideoSurfaceTexture", "release");
        releaseOffScreenSurface();
        releaseInternal();
        super.release();
    }

    public synchronized VideoSurface getOffScreenSurface() {
        if (this.mIsRelease) {
            return null;
        }
        if (this.mOffScreenSurface == null) {
            this.mOffScreenSurface = new VideoSurface(this);
        }
        this.mIdleTimeStamp = -9223372036854775807L;
        return this.mOffScreenSurface;
    }

    public boolean isAlive() {
        StringBuilder sb = new StringBuilder("is alive = ");
        sb.append(this.mOffScreenSurface);
        sb.append(", eglsur = ");
        sb.append(this.mEglSurface);
        TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
        if (this.mOffScreenSurface == null && this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public synchronized void releaseInternal() {
        if (!this.mIsRelease) {
            try {
                lock();
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" release internal");
                TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
                this.mIsRelease = true;
                this.mTextureId.decRef();
                this.mRenderHandler = null;
                this.mCreateLooper = null;
            } finally {
                unlock();
            }
        }
    }

    public void releaseOffScreenSurface() {
        this.mOffScreenSurface = null;
        updateSurface(null);
        this.mIdleTimeStamp = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("release offscreen surface done = ");
        sb.append(this.mIdleTimeStamp);
        TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
    }

    public boolean render() {
        if (!EGL14.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append("swap buffer failed");
            TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
            return false;
        }
        notifyRenderFrame(this.mSerial);
        return true;
    }

    public boolean makeCurrent() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            TextureRenderLog.m110623d("VideoSurfaceTexture", "no surface for make current");
            return false;
        }
        GLES20.glFinish();
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext)) {
            StringBuilder sb = new StringBuilder("make current failed = ");
            sb.append(this.mEglSurface);
            TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("make current done = ");
        sb2.append(this.mOffScreenSurface);
        TextureRenderLog.m110623d("VideoSurfaceTexture", sb2.toString());
        this.mIsMakeCurrent = true;
        return true;
    }

    public boolean isCurrentObject(long j) {
        if (this.mObjectId == j) {
            return true;
        }
        return false;
    }

    public void notifyRenderFrame(int i) {
        if (i == this.mSerial) {
            try {
                this.mOffScreenSurface.onTextureUpdate(i, getTimestamp());
            } catch (Exception unused) {
            }
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.mRenderHandler != null) {
            Message obtainMessage = this.mRenderHandler.obtainMessage(2);
            obtainMessage.obj = this;
            obtainMessage.sendToTarget();
        }
    }

    public boolean canReuse(Looper looper) {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" looper =");
        sb.append(looper);
        sb.append(", mlooper = ");
        sb.append(this.mCreateLooper);
        TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
        if (looper == this.mCreateLooper) {
            return true;
        }
        return false;
    }

    private void internalConstruct(Handler handler) {
        this.mObjectId = new Random().nextLong();
        this.mRenderHandler = handler;
        this.mLock = new ReentrantLock();
        this.mCreateLooper = Looper.myLooper();
        this.mRenderMsgBundle = new Bundle();
        setOnFrameAvailableListener(this);
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("gen a texture :");
        sb.append(this.mObjectId);
        sb.append(", thread id ");
        sb.append(Thread.currentThread().getId());
        sb.append(", looper = ");
        sb.append(this.mCreateLooper);
        TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
    }

    public synchronized void updateSurface(Surface surface) {
        String str = "VideoSurfaceTexture";
        StringBuilder sb = new StringBuilder("update Surface = ");
        sb.append(this);
        sb.append(", ");
        sb.append(surface);
        TextureRenderLog.m110623d(str, sb.toString());
        if (surface == this.mUpdateSurface) {
            TextureRenderLog.m110623d("VideoSurfaceTexture", "prevent the same surface???");
            return;
        }
        this.mLock.lock();
        this.mUpdateSurface = surface;
        this.mLock.unlock();
        if (this.mRenderHandler != null) {
            Message obtainMessage = this.mRenderHandler.obtainMessage(4);
            this.mRenderMsgBundle.putSerializable("texture", this);
            obtainMessage.setData(this.mRenderMsgBundle);
            this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
        }
        TextureRenderLog.m110623d("VideoSurfaceTexture", "update Surface end");
    }

    public VideoSurfaceTexture(ITexture iTexture, Handler handler) {
        super(iTexture.lock());
        iTexture.addRef();
        this.mTextureId = iTexture;
        iTexture.unlock();
        internalConstruct(handler);
    }

    public synchronized void pause(boolean z, boolean z2) {
        if (z2) {
            try {
                if (this.mIsPaused && !z && this.mRenderHandler != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append("need active , post a resume msg");
                    TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
                    Message obtainMessage = this.mRenderHandler.obtainMessage(10);
                    obtainMessage.obj = this;
                    this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                }
            } finally {
            }
        }
        this.mIsPaused = z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("paused = ");
        sb2.append(this.mIsPaused);
        TextureRenderLog.m110623d("VideoSurfaceTexture", sb2.toString());
    }

    public boolean handleSurfaceChange(boolean z, EGLSurface eGLSurface) {
        this.mLock.lock();
        if (this.mRenderSurface == this.mUpdateSurface) {
            TextureRenderLog.m110623d("VideoSurfaceTexture", "surface change the same surface hashcode");
            this.mLock.unlock();
            return false;
        }
        this.mRenderSurface = this.mUpdateSurface;
        this.mLock.unlock();
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            StringBuilder sb = new StringBuilder("destory previous surface = ");
            sb.append(this.mEglSurface);
            TextureRenderLog.m110623d("VideoSurfaceTexture", sb.toString());
            if (this.mRenderSurface == null && z) {
                TextureRenderLog.m110623d("VideoSurfaceTexture", "make current to dummy surface due to non render surface");
                EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext);
            }
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
            this.mEglSurface = EGL14.EGL_NO_SURFACE;
            this.mIsMakeCurrent = false;
            StringBuilder sb2 = new StringBuilder("destory previous surface done = ");
            sb2.append(this.mEglSurface);
            TextureRenderLog.m110623d("VideoSurfaceTexture", sb2.toString());
        }
        if (this.mRenderSurface != null && this.mRenderSurface.isValid()) {
            int[] iArr = {12344};
            String str = "VideoSurfaceTexture";
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append("create window surface from ");
                sb3.append(this.mRenderSurface);
                TextureRenderLog.m110623d(str, sb3.toString());
                this.mEglSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, this.mRenderSurface, iArr, 0);
                if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
                    TextureRenderLog.m110623d("VideoSurfaceTexture", "create window surface failed");
                    return false;
                }
                makeCurrent();
            } catch (Exception unused) {
                TextureRenderLog.m110623d("VideoSurfaceTexture", "create current exception failed");
                return false;
            }
        }
        this.mUpdateSurfaceTime = System.nanoTime();
        this.mSerial++;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this);
        sb4.append("update surface done serial = ");
        sb4.append(this.mSerial);
        sb4.append("update time = ");
        sb4.append(this.mUpdateSurfaceTime);
        TextureRenderLog.m110623d("VideoSurfaceTexture", sb4.toString());
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    public void bindEGLEnv(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (eGLContext == null || eGLDisplay == null || eGLConfig == null) {
            throw new RuntimeException("no egl env for texture bind");
        }
        this.mEglContext = eGLContext;
        this.mEglDisplay = eGLDisplay;
        this.mEglConfig = eGLConfig;
    }

    public VideoSurfaceTexture(ITexture iTexture, boolean z, Handler handler) {
        super(iTexture.lock(), z);
        iTexture.addRef();
        this.mTextureId = iTexture;
        iTexture.unlock();
        internalConstruct(handler);
    }
}
