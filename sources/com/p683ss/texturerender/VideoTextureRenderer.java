package com.p683ss.texturerender;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;

/* renamed from: com.ss.texturerender.VideoTextureRenderer */
public class VideoTextureRenderer extends TextureRenderer {
    private static VideoTextureRenderer mRenderInstance;
    private final String mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private final String mVertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* access modifiers changed from: protected */
    public void onInternalStateChanged(int i) {
    }

    /* access modifiers changed from: protected */
    public void updateDisplaySize(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void deinitGLComponents() {
        TextureRenderLog.m110623d(LOG_TAG, "delete program");
        GLES20.glDeleteProgram(this.mProgram);
    }

    /* access modifiers changed from: protected */
    public void initGLComponents() {
        if (this.mState != -1) {
            setupGraphics();
        }
    }

    public synchronized void release() {
        super.release();
        mRenderInstance = null;
    }

    public static synchronized VideoTextureRenderer getRenderer() {
        synchronized (VideoTextureRenderer.class) {
            if (mRenderInstance == null) {
                mRenderInstance = new VideoTextureRenderer();
            }
            if (mRenderInstance != null && mRenderInstance.mState == -1) {
                return null;
            }
            VideoTextureRenderer videoTextureRenderer = mRenderInstance;
            return videoTextureRenderer;
        }
    }

    private void setupGraphics() {
        this.mProgram = ShaderHelper.createAndLinkProgram(ShaderHelper.compileShader(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"), ShaderHelper.compileShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"), null);
        GLES20.glUseProgram(this.mProgram);
        this.maPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "aPosition");
        if (this.maPositionHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for aPosition");
            return;
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        if (this.maTextureHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for aTextureCoord");
            return;
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for uSTMatrix");
            return;
        }
        this.mTriangleVertices.position(0);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 12, this.mTriangleVertices);
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        this.mTextureVertices.position(0);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, 8, this.mTextureVertices);
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
    }

    private void drawTexture(int i) {
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glBindTexture(36197, i);
        GLES20.glActiveTexture(33984);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private int getConsumerHeight(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    private int getConsumerWidth(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    /* access modifiers changed from: protected */
    public boolean draw(VideoSurfaceTexture videoSurfaceTexture) {
        if (videoSurfaceTexture == null) {
            TextureRenderLog.m110623d(LOG_TAG, "surface texture is null not draw");
            return false;
        }
        try {
            videoSurfaceTexture.lock();
            if (videoSurfaceTexture.isRelease()) {
                TextureRenderLog.m110623d(LOG_TAG, "surface texture is released not draw");
                return false;
            }
            videoSurfaceTexture.updateTexImage();
            videoSurfaceTexture.unlock();
            if (!videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
                String str = LOG_TAG;
                StringBuilder sb = new StringBuilder("not current object id ");
                sb.append(this.mDrawingObjectId);
                sb.append(", ");
                sb.append(videoSurfaceTexture.getOjbectId());
                TextureRenderLog.m110623d(str, sb.toString());
                return false;
            } else if (videoSurfaceTexture.isPaused() || !videoSurfaceTexture.isMakeCurrent()) {
                String str2 = LOG_TAG;
                StringBuilder sb2 = new StringBuilder("surface texture not draw = ");
                sb2.append(videoSurfaceTexture.isPaused());
                sb2.append(", make current =");
                sb2.append(videoSurfaceTexture.isMakeCurrent());
                TextureRenderLog.m110623d(str2, sb2.toString());
                return false;
            } else {
                ITexture texId = videoSurfaceTexture.getTexId();
                int viewportWidth = videoSurfaceTexture.getViewportWidth();
                int viewportHeight = videoSurfaceTexture.getViewportHeight();
                videoSurfaceTexture.getTransformMatrix(this.mSTMatrix);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glViewport(0, 0, viewportWidth, viewportHeight);
                drawTexture(texId.lock());
                texId.unlock();
                if (GLES20.glGetError() == 0) {
                    return true;
                }
                return false;
            }
        } finally {
            videoSurfaceTexture.unlock();
        }
    }
}
