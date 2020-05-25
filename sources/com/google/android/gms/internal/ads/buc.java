package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

final class buc extends HandlerThread implements OnFrameAvailableListener, Callback {

    /* renamed from: a */
    Handler f43901a;

    /* renamed from: b */
    private final int[] f43902b = new int[1];

    /* renamed from: c */
    private SurfaceTexture f43903c;

    /* renamed from: d */
    private Error f43904d;

    /* renamed from: e */
    private RuntimeException f43905e;

    /* renamed from: f */
    private zztc f43906f;

    public buc() {
        super("dummySurface");
    }

    /* renamed from: a */
    public final zztc mo30722a(boolean z) {
        boolean z2;
        start();
        this.f43901a = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f43901a.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f43906f == null && this.f43905e == null && this.f43904d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (this.f43905e != null) {
            throw this.f43905e;
        } else if (this.f43904d == null) {
            return this.f43906f;
        } else {
            throw this.f43904d;
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f43901a.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int[] iArr;
        int[] iArr2;
        switch (message.what) {
            case 1:
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    bti.m36702b(eglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr3 = new int[2];
                    bti.m36702b(EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    bti.m36702b(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr4, 0) && iArr4[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (z) {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    bti.m36702b(eglCreateContext != null, "eglCreateContext failed");
                    if (z) {
                        iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                    } else {
                        iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                    }
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, iArr2, 0);
                    bti.m36702b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    bti.m36702b(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.f43902b, 0);
                    this.f43903c = new SurfaceTexture(this.f43902b[0]);
                    this.f43903c.setOnFrameAvailableListener(this);
                    this.f43906f = new zztc(this, this.f43903c, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    this.f43905e = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        this.f43904d = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            case 2:
                this.f43903c.updateTexImage();
                return true;
            case 3:
                try {
                    this.f43903c.release();
                    this.f43906f = null;
                    this.f43903c = null;
                    GLES20.glDeleteTextures(1, this.f43902b, 0);
                    quit();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                return true;
            default:
                return true;
        }
    }
}
