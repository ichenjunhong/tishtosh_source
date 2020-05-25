package com.p683ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.p683ss.avframework.buffer.VideoFrame.Buffer;
import com.p683ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p683ss.avframework.buffer.VideoFrame.IExtraData;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p683ss.avframework.buffer.VideoFrame.stRoiInfo;

/* renamed from: com.ss.avframework.buffer.TextureBufferImpl */
public class TextureBufferImpl implements TextureBuffer {
    private IExtraData extData;
    private final int height;

    /* renamed from: id */
    private final int f127769id;
    private stRoiInfo mROIInfo;
    private ToI420Interface mToI420Interface;
    private int refCount;
    private final Object refCountLock;
    private final Runnable releaseCallback;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final Matrix transformMatrix;
    private final Type type;
    private final int width;

    /* renamed from: com.ss.avframework.buffer.TextureBufferImpl$ToI420Interface */
    public interface ToI420Interface {
        I420Buffer toI420(TextureBuffer textureBuffer);
    }

    public IExtraData getExtData() {
        return this.extData;
    }

    public int getHeight() {
        return this.height;
    }

    public stRoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    public int getTextureId() {
        return this.f127769id;
    }

    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public Type getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: protected */
    public void recycle() {
    }

    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public void release() {
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0) {
                if (this.releaseCallback != null) {
                    this.releaseCallback.run();
                } else {
                    recycle();
                }
            }
        }
    }

    public I420Buffer toI420() {
        if (this.surfaceTextureHelper != null) {
            return this.surfaceTextureHelper.textureToYuv(this);
        }
        if (this.mToI420Interface != null) {
            return this.mToI420Interface.toI420(this);
        }
        throw new AndroidRuntimeException("BUG, Fixed me");
    }

    public void setROIInfo(stRoiInfo stroiinfo) {
        this.mROIInfo = stroiinfo;
    }

    public void updateExtraData(IExtraData iExtraData) {
        this.extData = iExtraData;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) i2) / ((float) this.height));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i5, i6, this.type, this.f127769id, matrix, this.surfaceTextureHelper, (Runnable) new Runnable() {
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
        textureBufferImpl.mToI420Interface = this.mToI420Interface;
        textureBufferImpl.mROIInfo = this.mROIInfo;
        return textureBufferImpl;
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable) {
        this(i, i2, type2, i3, matrix, surfaceTextureHelper2, runnable, (IExtraData) null);
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable) {
        this(i, i2, type2, i3, matrix, toI420Interface, runnable, (IExtraData) null);
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable, IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f127769id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.releaseCallback = runnable;
        this.mToI420Interface = null;
        this.extData = iExtraData;
        this.refCount = 1;
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable, IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f127769id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = null;
        this.releaseCallback = runnable;
        this.mToI420Interface = toI420Interface;
        this.extData = iExtraData;
        this.refCount = 1;
    }
}
