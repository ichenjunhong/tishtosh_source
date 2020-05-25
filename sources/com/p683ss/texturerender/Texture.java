package com.p683ss.texturerender;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.Texture */
public class Texture implements ITexture {
    private ReentrantLock mLock = new ReentrantLock();
    private IRef mRef = new Ref();
    private int mTextureId;
    private OnTextureReturnListener mTextureReturnListener;

    /* renamed from: com.ss.texturerender.Texture$OnTextureReturnListener */
    public interface OnTextureReturnListener {
        void onTextureReturn(ITexture iTexture);
    }

    public int refCnt() {
        return this.mRef.refCnt();
    }

    public void unlock() {
        this.mLock.unlock();
    }

    public int addRef() {
        int addRef = this.mRef.addRef();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" add ref ");
        sb.append(addRef);
        TextureRenderLog.m110623d("ITexture", sb.toString());
        return addRef;
    }

    public int lock() {
        if (!this.mLock.isHeldByCurrentThread()) {
            this.mLock.lock();
            return this.mTextureId;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    public int decRef() {
        int decRef = this.mRef.decRef();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" dec ref ");
        sb.append(decRef);
        TextureRenderLog.m110623d("ITexture", sb.toString());
        if (decRef == 1) {
            this.mTextureReturnListener.onTextureReturn(this);
        } else if (decRef <= 0) {
            StringBuilder sb2 = new StringBuilder("reference idx ");
            sb2.append(decRef - 1);
            sb2.append(" app abort!!");
            throw new RuntimeException(new Exception(sb2.toString()));
        }
        return 0;
    }

    public void release() {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("release = ");
        sb.append(this.mTextureId);
        TextureRenderLog.m110623d("ITexture", sb.toString());
        lock();
        GLES20.glDeleteTextures(1, new int[this.mTextureId], 0);
        unlock();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("release end = ");
        sb2.append(this.mTextureId);
        TextureRenderLog.m110623d("ITexture", sb2.toString());
    }

    public int tryLock(int i) {
        try {
            if (this.mLock.tryLock((long) i, TimeUnit.MILLISECONDS)) {
                return this.mTextureId;
            }
            return -1;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    public Texture(int i, OnTextureReturnListener onTextureReturnListener) {
        StringBuilder sb = new StringBuilder("new texture = ");
        sb.append(i);
        TextureRenderLog.m110623d("ITexture", sb.toString());
        this.mTextureId = i;
        this.mTextureReturnListener = onTextureReturnListener;
    }
}
