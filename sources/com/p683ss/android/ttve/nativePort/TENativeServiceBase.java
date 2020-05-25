package com.p683ss.android.ttve.nativePort;

import com.p683ss.android.ttve.common.C20072b;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20118a;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20119b;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20120c;
import com.p683ss.android.ttve.nativePort.NativeCallbacks.C20122e;

/* renamed from: com.ss.android.ttve.nativePort.TENativeServiceBase */
public class TENativeServiceBase {
    protected C20118a mEncoderDataCallback;
    protected C20119b mGetImageCallback;
    protected C20120c mMVInitedCallback;
    protected C20072b mOnErrorListener;
    protected C20072b mOnInfoListener;
    protected C20122e mOpenGLCallback;

    public C20118a getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public C20072b getErrorListener() {
        return this.mOnErrorListener;
    }

    public C20072b getInfoListener() {
        return this.mOnInfoListener;
    }

    public C20122e getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void nativeCallback_onOpenGLDrawBefore(int i, double d) {
    }

    public void nativeCallback_onPreviewSurface(int i) {
    }

    public void nativeCallback_onMVInited() {
        if (this.mMVInitedCallback != null) {
            this.mMVInitedCallback.mo42277a();
        }
    }

    public void setEncoderDataListener(C20118a aVar) {
        this.mEncoderDataCallback = aVar;
    }

    public void setErrorListener(C20072b bVar) {
        this.mOnErrorListener = bVar;
    }

    public void setGetImageCallback(C20119b bVar) {
        this.mGetImageCallback = bVar;
    }

    public void setInfoListener(C20072b bVar) {
        this.mOnInfoListener = bVar;
    }

    public void setOpenGLListeners(C20122e eVar) {
        this.mOpenGLCallback = eVar;
    }

    public void setmMVInitedCallback(C20120c cVar) {
        this.mMVInitedCallback = cVar;
    }

    public void nativeCallback_onOpenGLCreate(int i) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo42278a(i);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo42280b(i);
        }
    }

    public void nativeCallback_onOpenGLDrawAfter(int i, double d) {
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo42279a(i, d);
        }
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        if (this.mOnInfoListener != null) {
            this.mOnInfoListener.mo42168a(i, i2, f, null);
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, int i, int i2, boolean z) {
        if (this.mEncoderDataCallback != null) {
            this.mEncoderDataCallback.mo42275a(bArr, i, i2, z);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        if (this.mOnErrorListener != null) {
            this.mOnErrorListener.mo42168a(i, i2, f, str);
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i, int i2, int i3, float f) {
        if (this.mGetImageCallback != null) {
            return this.mGetImageCallback.mo42276a(bArr, i, i2, i3, f);
        }
        return 0;
    }
}
