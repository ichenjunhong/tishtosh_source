package com.p683ss.avframework.opengl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.engine.VideoSink;
import com.p683ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.opengl.GLRenderVideoSink */
public class GLRenderVideoSink extends VideoSink implements Callback, SurfaceHolder.Callback {
    private boolean mCanDrawer;
    public GLRenderer mGLRenderer;
    public GLThread mGLThread;
    private boolean mNeedSwapSurface;
    private GLSurface mSurface;
    public Surface mSurfaceWithTexture;

    /* renamed from: com.ss.avframework.opengl.GLRenderVideoSink$GLRenderer */
    public interface GLRenderer {
        void onDrawFrame(VideoFrame videoFrame);

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated();

        void onSurfaceDestroy();
    }

    public void OnDiscardedFrame() {
    }

    private void onSurfaceCreated() {
        this.mSurface = new GLSurface();
    }

    public Handler getGlThreadHandler() {
        return this.mGLThread.getHandler();
    }

    /* access modifiers changed from: private */
    public void onSurfaceDestroy() {
        if (this.mSurface != null) {
            GLES20.glFinish();
            if (this.mSurfaceWithTexture != null) {
                this.mSurfaceWithTexture.release();
                this.mSurfaceWithTexture = null;
            }
            this.mSurface.nativeSurfaceDestroy();
            this.mSurface.release();
            this.mSurface = null;
            this.mCanDrawer = false;
            if (!getGlThreadHandler().post(new Runnable() {
                public void run() {
                    if (GLRenderVideoSink.this.mGLRenderer != null) {
                        GLRenderVideoSink.this.mGLRenderer.onSurfaceDestroy();
                    }
                }
            }) && this.mGLRenderer != null) {
                this.mGLRenderer.onSurfaceDestroy();
                AVLog.m110011w("GLRenderVideoSink", "surfaceDestroy at release");
            }
        }
    }

    public synchronized void release() {
        super.release();
        if (!getGlThreadHandler().post(new Runnable() {
            public void run() {
                GLRenderVideoSink.this.onSurfaceDestroy();
            }
        })) {
            AVLog.ioe("GLRenderVideoSink", Log.getStackTraceString(new Exception("Already release at")));
        } else if (VERSION.SDK_INT >= 18) {
            this.mGLThread.quitSafely();
        } else {
            this.mGLThread.getHandler().post(new Runnable() {
                public void run() {
                    GLRenderVideoSink.this.mGLThread.quit();
                }
            });
            try {
                this.mGLThread.join(3000);
            } catch (InterruptedException unused) {
                String str = "GLRenderVideoSink";
                StringBuilder sb = new StringBuilder("GlRenderVideoSink thread exit exception at ");
                sb.append(3000);
                sb.append(" ms.");
                AVLog.m110008e(str, sb.toString());
            }
        }
    }

    public void setRenderer(GLRenderer gLRenderer) {
        this.mGLRenderer = gLRenderer;
    }

    public GLRenderVideoSink(SurfaceTexture surfaceTexture) {
    }

    public GLRenderVideoSink(SurfaceView surfaceView) {
        initSurfaceView(surfaceView);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mNeedSwapSurface = true;
        this.mGLThread.post(1);
    }

    public GLRenderVideoSink(TextureView textureView) {
        initTextureView(textureView);
    }

    private void onFrameAvailable(VideoFrame videoFrame) {
        if (this.mGLRenderer != null && this.mCanDrawer) {
            this.mGLRenderer.onDrawFrame(videoFrame);
            if (this.mNeedSwapSurface && this.mSurface != null) {
                this.mSurface.nativeSwapBuffers();
            }
        }
        videoFrame.release();
    }

    public void onFrame(VideoFrame videoFrame) {
        if (this.mGLThread != null) {
            videoFrame.retain();
            if (!this.mGLThread.post(4, videoFrame)) {
                videoFrame.release();
            }
        }
    }

    public GLRenderVideoSink(View view) {
        if (view instanceof TextureView) {
            initTextureView((TextureView) view);
        } else if (view instanceof SurfaceView) {
            initSurfaceView((SurfaceView) view);
        } else {
            StringBuilder sb = new StringBuilder("Unsupport view ");
            sb.append(view);
            throw new AndroidRuntimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Construct with view ");
        sb2.append(view);
        AVLog.iod("GLRenderVideoSink", sb2.toString());
    }

    private void initSurfaceView(SurfaceView surfaceView) {
        this.mNeedSwapSurface = false;
        surfaceView.getHolder().addCallback(this);
        this.mGLThread = new GLThread((Callback) this);
        GLThread gLThread = this.mGLThread;
        StringBuilder sb = new StringBuilder("GRK(");
        sb.append(this);
        sb.append(")");
        gLThread.setName(sb.toString());
        this.mGLThread.start();
    }

    private void initTextureView(TextureView textureView) {
        this.mNeedSwapSurface = false;
        textureView.setSurfaceTextureListener(new SurfaceTextureListener() {
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                GLRenderVideoSink.this.surfaceDestroyed(null);
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                GLRenderVideoSink.this.surfaceChanged(null, -1, i, i2);
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                GLRenderVideoSink.this.mSurfaceWithTexture = new Surface(surfaceTexture);
                GLRenderVideoSink.this.surfaceCreated(null);
                GLRenderVideoSink.this.surfaceChanged(null, -1, i, i2);
            }
        });
        this.mGLThread = new GLThread((Callback) this);
        GLThread gLThread = this.mGLThread;
        StringBuilder sb = new StringBuilder("GRK(");
        sb.append(this);
        sb.append(")");
        gLThread.setName(sb.toString());
        this.mGLThread.start();
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                onSurfaceCreated();
                break;
            case 2:
                onSurfaceChanged(message.arg1, message.arg2, (Surface) message.obj);
                break;
            case 3:
                onSurfaceDestroy();
                break;
            case 4:
                onFrameAvailable((VideoFrame) message.obj);
                break;
        }
        return true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mNeedSwapSurface = false;
        this.mCanDrawer = false;
        final Object obj = new Object();
        synchronized (obj) {
            boolean postAtFrontOfQueue = this.mGLThread.getHandler().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    GLRenderVideoSink.this.onSurfaceDestroy();
                    synchronized (obj) {
                        obj.notify();
                    }
                }
            });
            if (!postAtFrontOfQueue) {
                AVLog.m110011w("GLRenderVideoSink", "already surfaceDestroy");
            }
            if (postAtFrontOfQueue) {
                try {
                    obj.wait(3000);
                } catch (Throwable th) {
                    String str = "GLRenderVideoSink";
                    StringBuilder sb = new StringBuilder("Waited exception ");
                    sb.append(th.getMessage());
                    AVLog.ioe(str, sb.toString(), th);
                }
            }
        }
    }

    public GLRenderVideoSink(int i, int i2, int i3) {
    }

    private void onSurfaceChanged(int i, int i2, Surface surface) {
        if (this.mGLRenderer != null) {
            if (this.mSurface != null) {
                this.mSurface.nativeSurfaceCreate(i, i2, surface);
                this.mSurface.nativeMakeCurrent();
                this.mCanDrawer = true;
            }
            if (this.mGLRenderer != null) {
                this.mGLRenderer.onSurfaceCreated();
                this.mGLRenderer.onSurfaceChanged(i, i2);
            }
            if (this.mNeedSwapSurface && this.mSurface != null) {
                this.mSurface.nativeSwapBuffers();
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Surface surface = this.mSurfaceWithTexture;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        }
        if (!this.mGLThread.post(2, i2, i3, surface)) {
            AVLog.m110011w("GLRenderVideoSink", "surfaceChanged exception! thread already exit.");
        }
    }
}
