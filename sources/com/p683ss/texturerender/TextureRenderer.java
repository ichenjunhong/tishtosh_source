package com.p683ss.texturerender;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.texturerender.TextureRenderer */
public abstract class TextureRenderer implements Callback {
    public static String LOG_TAG = "TextureRenderer";
    protected long mDrawingObjectId;
    EGLConfig mEglConfig;
    protected EGLContext mEglContext;
    protected EGLDisplay mEglDisplay;
    protected EGLSurface mEglDummySurface;
    private OnEglErrorListener mErrorListener;
    private String mErrorReason;
    protected volatile Handler mHandler;
    private final Object mHandlerObject = new Object();
    private HandlerThread mHandlerThread;
    protected float[] mMVPMatrix = new float[16];
    protected Handler mNotifyHandler;
    protected int mProgram;
    protected float[] mSTMatrix = new float[16];
    private Object mSetupFence = new Object();
    protected volatile int mState;
    private OnStateChangeListener mStateChangeListener;
    private TextureFactory mTextureFactory;
    private List<VideoSurfaceTexture> mTextureList;
    protected FloatBuffer mTextureVertices;
    private final float[] mTextureVerticesData = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    protected FloatBuffer mTriangleVertices;
    private final float[] mTriangleVerticesData = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    protected int maPositionHandle;
    protected int maTextureHandle;
    protected int muMVPMatrixHandle;
    protected int muSTMatrixHandle;

    /* renamed from: com.ss.texturerender.TextureRenderer$OnEglErrorListener */
    public interface OnEglErrorListener {
        void onError(int i, String str);
    }

    /* renamed from: com.ss.texturerender.TextureRenderer$OnStateChangeListener */
    public interface OnStateChangeListener {
        void onStateChanged(int i);
    }

    /* renamed from: com.ss.texturerender.TextureRenderer$OnTextureFocusLossListener */
    public interface OnTextureFocusLossListener {
        void onFocusLoss();
    }

    /* access modifiers changed from: protected */
    public abstract void deinitGLComponents();

    /* access modifiers changed from: protected */
    public abstract boolean draw(VideoSurfaceTexture videoSurfaceTexture);

    public String getErrorReason() {
        return this.mErrorReason;
    }

    public int getState() {
        return this.mState;
    }

    /* access modifiers changed from: protected */
    public abstract void initGLComponents();

    /* access modifiers changed from: protected */
    public abstract void onInternalStateChanged(int i);

    /* access modifiers changed from: protected */
    public abstract void updateDisplaySize(int i, int i2);

    private EGLDisplay getDefaultDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            notifyEGLError(0, "egl get display failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        notifyEGLError(0, "eglInitialize failed");
        return null;
    }

    private int[] getRGB565Attributes() {
        return new int[]{12352, 4, 12324, 5, 12323, 6, 12322, 5, 12344};
    }

    private int[] getRGB888Attributes() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12344};
    }

    public VideoSurface genOffscreenSurface() {
        if (this.mState <= 0) {
            return null;
        }
        VideoSurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            return surfaceTexture.getOffScreenSurface();
        }
        return null;
    }

    private EGLConfig chooseEglConfig() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[][] iArr2 = {getRGB888Attributes(), getRGB565Attributes()};
        for (int i = 0; i < 2; i++) {
            if (EGL14.eglChooseConfig(this.mEglDisplay, iArr2[0], 0, eGLConfigArr, 0, 1, iArr, 0) && iArr[0] > 0) {
                return eGLConfigArr[0];
            }
        }
        notifyEGLError(0, "eglChooseConfig failed");
        return null;
    }

    private ITexture getTexture() {
        Message obtainMessage = this.mHandler.obtainMessage(9);
        Message message = new Message();
        obtainMessage.obj = message;
        try {
            synchronized (message) {
                this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
                message.wait(1000);
            }
            if (message.obj == null) {
                if (this.mHandler.hasMessages(9)) {
                    this.mErrorReason = "The handler is busy for other operation timeout";
                } else {
                    this.mErrorReason = "Try modify the wait timeOut";
                }
            }
            return (ITexture) message.obj;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public void handleDeinit() {
        String str = LOG_TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("deinit");
        TextureRenderLog.m110623d(str, sb.toString());
        changeState(0, true);
        deleteTextures();
        deinitGLComponents();
        deinitEGL();
        this.mHandler = null;
        String str2 = LOG_TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("deinit done");
        TextureRenderLog.m110623d(str2, sb2.toString());
    }

    private void deinitEGL() {
        if (this.mEglDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            if (this.mEglDummySurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglDummySurface);
                this.mEglDummySurface = EGL14.EGL_NO_SURFACE;
            }
            if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
            String str = LOG_TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append("OpenGL deinit OK.");
            TextureRenderLog.m110623d(str, sb.toString());
        }
    }

    private void deleteTextures() {
        synchronized (this.mTextureList) {
            if (this.mTextureList.size() > 0) {
                Iterator it = this.mTextureList.iterator();
                while (it.hasNext()) {
                    ((VideoSurfaceTexture) it.next()).release();
                    it.remove();
                }
            }
            String str = LOG_TAG;
            StringBuilder sb = new StringBuilder("delete textures : ");
            sb.append(this.mTextureList.size());
            TextureRenderLog.m110623d(str, sb.toString());
            this.mTextureFactory.release();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r3 = this;
            java.lang.String r0 = LOG_TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "call release"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.texturerender.TextureRenderLog.m110623d(r0, r1)
            monitor-enter(r3)
            int r0 = r3.mState     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0059
            android.os.Handler r0 = r3.mHandler     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0020
            goto L_0x0059
        L_0x0020:
            java.lang.String r0 = LOG_TAG     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            r1.append(r3)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "send deinit"
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0071 }
            com.p683ss.texturerender.TextureRenderLog.m110623d(r0, r1)     // Catch:{ all -> 0x0071 }
            android.os.Handler r0 = r3.mHandler     // Catch:{ all -> 0x0071 }
            r1 = 3
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0071 }
            android.os.HandlerThread r0 = r3.mHandlerThread     // Catch:{ Exception -> 0x0041 }
            r0.quitSafely()     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            java.lang.String r0 = LOG_TAG     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            r1.append(r3)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "call release end"
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0071 }
            com.p683ss.texturerender.TextureRenderLog.m110623d(r0, r1)     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0059:
            java.lang.String r0 = LOG_TAG     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            r1.append(r3)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "release return"
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0071 }
            com.p683ss.texturerender.TextureRenderLog.m110623d(r0, r1)     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.texturerender.TextureRenderer.release():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ab, code lost:
        throw new java.lang.RuntimeException("EGL initial timeout");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x00a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextureRenderer() {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mHandlerObject = r0
            r0 = 12
            float[] r0 = new float[r0]
            r0 = {-1082130432, -1082130432, 0, 1065353216, -1082130432, 0, -1082130432, 1065353216, 0, 1065353216, 1065353216, 0} // fill-array
            r4.mTriangleVerticesData = r0
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {0, 0, 1065353216, 0, 0, 1065353216, 1065353216, 1065353216} // fill-array
            r4.mTextureVerticesData = r0
            r0 = 16
            float[] r1 = new float[r0]
            r4.mMVPMatrix = r1
            float[] r0 = new float[r0]
            r4.mSTMatrix = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mSetupFence = r0
            java.lang.String r0 = LOG_TAG
            java.lang.String r1 = "version :1.0"
            com.p683ss.texturerender.TextureRenderLog.m110623d(r0, r1)
            r0 = 0
            r4.mState = r0
            r0 = 0
            r4.mErrorReason = r0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r4.mEglDummySurface = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r4.mEglContext = r0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r4.mEglDisplay = r0
            r0 = 0
            r4.mDrawingObjectId = r0
            com.ss.texturerender.TextureFactory r0 = new com.ss.texturerender.TextureFactory
            r0.<init>()
            r4.mTextureFactory = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mTextureList = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "RendererThread"
            r0.<init>(r1)
            r4.mHandlerThread = r0
            android.os.HandlerThread r0 = r4.mHandlerThread
            r0.start()
            com.ss.texturerender.TextureRenderer$1 r0 = new com.ss.texturerender.TextureRenderer$1
            android.os.HandlerThread r1 = r4.mHandlerThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r4.mHandler = r0
            android.os.Handler r0 = r4.mHandler
            r1 = 1
            android.os.Message r0 = r0.obtainMessage(r1)
            java.lang.Object r1 = r4.mSetupFence
            r0.obj = r1
            java.lang.Object r1 = r4.mSetupFence
            monitor-enter(r1)
            r0.sendToTarget()     // Catch:{ all -> 0x00ac }
            java.lang.Object r0 = r4.mSetupFence     // Catch:{ InterruptedException -> 0x00a4 }
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r2)     // Catch:{ InterruptedException -> 0x00a4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00ac }
            android.os.Handler r0 = r4.mHandler
            r1 = 11
            android.os.Message r0 = r0.obtainMessage(r1)
            android.os.Handler r1 = r4.mHandler
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r1.sendMessageDelayed(r0, r2)
            java.lang.String r0 = LOG_TAG
            java.lang.String r1 = "construct done"
            com.p683ss.texturerender.TextureRenderLog.m110623d(r0, r1)
            return
        L_0x00a4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "EGL initial timeout"
            r0.<init>(r2)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ac }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.texturerender.TextureRenderer.<init>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p683ss.texturerender.VideoSurfaceTexture getSurfaceTexture() {
        /*
            r6 = this;
            java.util.List<com.ss.texturerender.VideoSurfaceTexture> r0 = r6.mTextureList
            monitor-enter(r0)
            java.util.List<com.ss.texturerender.VideoSurfaceTexture> r1 = r6.mTextureList     // Catch:{ all -> 0x0082 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0082 }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0082 }
            r3 = 0
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0082 }
            com.ss.texturerender.VideoSurfaceTexture r2 = (com.p683ss.texturerender.VideoSurfaceTexture) r2     // Catch:{ all -> 0x0082 }
            boolean r4 = r2.isRelease()     // Catch:{ all -> 0x0082 }
            if (r4 != 0) goto L_0x0056
            boolean r4 = r2.isAlive()     // Catch:{ all -> 0x0082 }
            if (r4 != 0) goto L_0x0056
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0082 }
            boolean r3 = r2.canReuse(r3)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = LOG_TAG     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "same looper reuse texture"
            com.p683ss.texturerender.TextureRenderLog.m110623d(r1, r3)     // Catch:{ all -> 0x0082 }
            r1 = 0
            r2.pause(r1, r1)     // Catch:{ all -> 0x0082 }
            r2.getOffScreenSurface()     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r2
        L_0x003c:
            java.lang.String r3 = LOG_TAG     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "can't reuse, delete = "
            r4.<init>(r5)     // Catch:{ all -> 0x0082 }
            r4.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0082 }
            com.p683ss.texturerender.TextureRenderLog.m110623d(r3, r4)     // Catch:{ all -> 0x0082 }
            r2.release()     // Catch:{ all -> 0x0082 }
            r1.remove()     // Catch:{ all -> 0x0082 }
            goto L_0x0009
        L_0x0056:
            java.lang.String r1 = LOG_TAG     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "still living"
            com.p683ss.texturerender.TextureRenderLog.m110623d(r1, r2)     // Catch:{ all -> 0x0082 }
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r3
        L_0x005f:
            com.ss.texturerender.ITexture r1 = r6.getTexture()     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0080
            com.ss.texturerender.VideoSurfaceTexture r3 = new com.ss.texturerender.VideoSurfaceTexture     // Catch:{ all -> 0x0082 }
            android.os.Handler r2 = r6.mHandler     // Catch:{ all -> 0x0082 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0082 }
            android.opengl.EGLContext r2 = r6.mEglContext     // Catch:{ all -> 0x0082 }
            android.opengl.EGLDisplay r4 = r6.mEglDisplay     // Catch:{ all -> 0x0082 }
            android.opengl.EGLConfig r5 = r6.mEglConfig     // Catch:{ all -> 0x0082 }
            r3.bindEGLEnv(r2, r4, r5)     // Catch:{ all -> 0x0082 }
            r1.decRef()     // Catch:{ all -> 0x0082 }
            r3.getOffScreenSurface()     // Catch:{ all -> 0x0082 }
            java.util.List<com.ss.texturerender.VideoSurfaceTexture> r1 = r6.mTextureList     // Catch:{ all -> 0x0082 }
            r1.add(r3)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return r3
        L_0x0082:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.texturerender.TextureRenderer.getSurfaceTexture():com.ss.texturerender.VideoSurfaceTexture");
    }

    private void initEGL() {
        this.mEglDisplay = getDefaultDisplay();
        if (this.mEglDisplay != null) {
            this.mEglConfig = chooseEglConfig();
            if (this.mEglConfig != null) {
                this.mEglContext = createContext(this.mEglDisplay, this.mEglConfig);
                if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
                    this.mEglDummySurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, this.mEglConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                    try {
                        if (this.mEglDummySurface == null || this.mEglDummySurface == EGL14.EGL_NO_SURFACE) {
                            notifyEGLError(0, "create eglCreatePbufferSurface failed");
                        }
                        if (!EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglDummySurface, this.mEglDummySurface, this.mEglContext)) {
                            notifyEGLError(0, "eglMakeCurrent failed");
                        }
                        this.mTriangleVertices = ByteBuffer.allocateDirect(this.mTriangleVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.mTriangleVertices.put(this.mTriangleVerticesData).position(0);
                        this.mTextureVertices = ByteBuffer.allocateDirect(this.mTextureVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.mTextureVertices.put(this.mTextureVerticesData).position(0);
                    } catch (Exception unused) {
                        notifyEGLError(0, "create dummy env failed");
                    }
                }
            }
        }
    }

    public void checkExpired() {
        VideoSurfaceTexture videoSurfaceTexture;
        if (this.mHandler != null) {
            String str = LOG_TAG;
            StringBuilder sb = new StringBuilder("renderer =");
            sb.append(this);
            sb.append(", check expired");
            TextureRenderLog.m110623d(str, sb.toString());
            synchronized (this.mTextureList) {
                if (!this.mHandler.hasMessages(8)) {
                    if (!this.mHandler.hasMessages(9)) {
                        if (this.mTextureList.size() == 0) {
                            TextureRenderLog.m110623d(LOG_TAG, "renderer is expired");
                            release();
                            return;
                        }
                        boolean z = false;
                        Iterator it = this.mTextureList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            videoSurfaceTexture = (VideoSurfaceTexture) it.next();
                            if (videoSurfaceTexture.isRelease() || (!videoSurfaceTexture.isAlive() && videoSurfaceTexture.couldForceRelease())) {
                            }
                        }
                        String str2 = LOG_TAG;
                        StringBuilder sb2 = new StringBuilder("a texture is still working ");
                        sb2.append(videoSurfaceTexture);
                        TextureRenderLog.m110623d(str2, sb2.toString());
                        z = true;
                        if (!z) {
                            TextureRenderLog.m110623d(LOG_TAG, "non live texture , renderer is expired");
                            release();
                            return;
                        }
                        this.mHandler.sendEmptyMessageDelayed(11, 120000);
                        return;
                    }
                }
                TextureRenderLog.m110623d(LOG_TAG, "renderer is excuting");
                this.mHandler.sendEmptyMessageDelayed(11, 120000);
            }
        }
    }

    public void handleFrameAvailable(VideoSurfaceTexture videoSurfaceTexture) {
        handleDraw(videoSurfaceTexture);
    }

    private void handleDraw(VideoSurfaceTexture videoSurfaceTexture) {
        if (draw(videoSurfaceTexture)) {
            videoSurfaceTexture.render();
        }
    }

    public void handleGenTexture(Message message) {
        ITexture createTexture = this.mTextureFactory.createTexture();
        if (createTexture == null) {
            TextureRenderLog.m110623d(LOG_TAG, "Create Texture failed.");
        }
        message.obj = createTexture;
        synchronized (message) {
            message.notify();
        }
    }

    public void setOnErrorListener(OnEglErrorListener onEglErrorListener) {
        String str = LOG_TAG;
        StringBuilder sb = new StringBuilder("setOnErrorListener =  ");
        sb.append(onEglErrorListener);
        TextureRenderLog.m110623d(str, sb.toString());
        this.mErrorListener = onEglErrorListener;
    }

    public void setOnStateChangedListener(OnStateChangeListener onStateChangeListener) {
        String str = LOG_TAG;
        StringBuilder sb = new StringBuilder("setOnStateChangedListener =  ");
        sb.append(onStateChangeListener);
        TextureRenderLog.m110623d(str, sb.toString());
        this.mStateChangeListener = onStateChangeListener;
    }

    public void handleChangeActiveTexture(VideoSurfaceTexture videoSurfaceTexture) {
        if (videoSurfaceTexture != null) {
            String str = LOG_TAG;
            StringBuilder sb = new StringBuilder("resume texture =");
            sb.append(videoSurfaceTexture);
            TextureRenderLog.m110623d(str, sb.toString());
            if (!videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
                videoSurfaceTexture.makeCurrent();
                this.mDrawingObjectId = videoSurfaceTexture.getOjbectId();
                String str2 = LOG_TAG;
                StringBuilder sb2 = new StringBuilder("change active drawing id = ");
                sb2.append(this.mDrawingObjectId);
                TextureRenderLog.m110623d(str2, sb2.toString());
            }
        }
    }

    public void handleInit(Object obj) {
        TextureRenderLog.m110623d(LOG_TAG, "init start");
        initEGL();
        if (this.mState != -1) {
            initGLComponents();
            if (this.mState != -1) {
                changeState(1, true);
                synchronized (obj) {
                    obj.notify();
                    TextureRenderLog.m110623d(LOG_TAG, "init done");
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 6:
                if (this.mErrorListener != null) {
                    this.mErrorListener.onError(message.arg1, message.obj.toString());
                    break;
                }
                break;
            case 7:
                if (this.mStateChangeListener != null) {
                    this.mStateChangeListener.onStateChanged(message.arg1);
                    if (message.arg1 == 0) {
                        this.mNotifyHandler.removeCallbacksAndMessages(null);
                        this.mNotifyHandler = null;
                        break;
                    }
                }
                break;
            case 8:
                int i = message.arg1;
                VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) message.obj;
                if (videoSurfaceTexture != null) {
                    videoSurfaceTexture.notifyRenderFrame(i);
                    break;
                }
                break;
        }
        return true;
    }

    public void handleSetSurface(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) data.getSerializable("texture");
            if (videoSurfaceTexture != null) {
                boolean z = true;
                if (this.mDrawingObjectId != 0 && !videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
                    z = false;
                }
                if (videoSurfaceTexture.handleSurfaceChange(z, this.mEglDummySurface) && !videoSurfaceTexture.isPaused()) {
                    this.mDrawingObjectId = videoSurfaceTexture.getOjbectId();
                    String str = LOG_TAG;
                    StringBuilder sb = new StringBuilder("texture switch surface & playing ");
                    sb.append(this.mDrawingObjectId);
                    TextureRenderLog.m110623d(str, sb.toString());
                }
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        obj.notify();
                    }
                }
                TextureRenderLog.m110623d(LOG_TAG, "set surface done");
                return;
            }
            throw new RuntimeException("update surface but missing texture");
        }
        throw new RuntimeException("update surface but missing bundle?");
    }

    private EGLContext createContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
            notifyEGLError(0, "eglcreateContext failed");
        }
        return eglCreateContext;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void changeState(int r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.mState
            if (r0 != r4) goto L_0x0005
            return
        L_0x0005:
            int r0 = r3.mState
            r1 = -1
            if (r0 != r1) goto L_0x000d
            if (r4 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r0 = LOG_TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "state change from "
            r1.<init>(r2)
            int r2 = r3.mState
            r1.append(r2)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p683ss.texturerender.TextureRenderLog.m110623d(r0, r1)
            r3.mState = r4
            if (r5 != 0) goto L_0x002f
            return
        L_0x002f:
            java.lang.Object r5 = r3.mHandlerObject
            monitor-enter(r5)
            com.ss.texturerender.TextureRenderer$OnStateChangeListener r0 = r3.mStateChangeListener     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0049
            android.os.Handler r0 = r3.mNotifyHandler     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x003b
            goto L_0x0049
        L_0x003b:
            android.os.Handler r0 = r3.mNotifyHandler     // Catch:{ all -> 0x004b }
            r1 = 7
            android.os.Message r0 = r0.obtainMessage(r1)     // Catch:{ all -> 0x004b }
            r0.arg1 = r4     // Catch:{ all -> 0x004b }
            r0.sendToTarget()     // Catch:{ all -> 0x004b }
            monitor-exit(r5)     // Catch:{ all -> 0x004b }
            return
        L_0x0049:
            monitor-exit(r5)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.texturerender.TextureRenderer.changeState(int, boolean):void");
    }

    /* access modifiers changed from: protected */
    public void notifyEGLError(int i, String str) {
        synchronized (this.mHandlerObject) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", reason = ");
            sb.append(GLUtils.getEGLErrorString(EGL14.eglGetError()));
            this.mErrorReason = sb.toString();
            changeState(-1, false);
            if (this.mErrorListener != null) {
                Message obtainMessage = this.mNotifyHandler.obtainMessage(6);
                obtainMessage.arg1 = i;
                StringBuilder sb2 = new StringBuilder("EGL fail = ");
                sb2.append(str);
                sb2.append(", reason = ");
                sb2.append(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                obtainMessage.obj = sb2.toString();
                obtainMessage.sendToTarget();
            }
        }
    }
}
