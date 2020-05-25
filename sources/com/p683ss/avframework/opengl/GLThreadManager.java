package com.p683ss.avframework.opengl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES10;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.p683ss.avframework.engine.MediaEngineFactory;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.JNINamespace;
import com.p683ss.avframework.utils.ThreadUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.opengl.GLThreadManager */
public class GLThreadManager {
    private static boolean sForceFinish = true;
    private static GLThreadManager sGLThreadManager = null;
    public static String sGPUGLVersion = "";
    public static String sGPURender = "";
    public static String sGPUVendor = "";
    private static ReentrantLock sGlobalSharedGLContextLock = new ReentrantLock();
    public static boolean sNeedFinish;
    public EGLContext mEGLContext;
    public int[] mEGLVersion = {0, 0};
    private ArrayList<String> mGlFinishBlackList;
    public Handler mHandler;

    /* renamed from: com.ss.avframework.opengl.GLThreadManager$MainGlThread */
    class MainGlThread extends HandlerThread {
        public Handler getHandler() {
            Looper looper = getLooper();
            if (GLThreadManager.this.mHandler == null && looper != null) {
                GLThreadManager.this.mHandler = new Handler(looper);
            }
            return GLThreadManager.this.mHandler;
        }

        public void run() {
            StringBuilder sb = new StringBuilder("thread ");
            sb.append(getName());
            sb.append(" is runing...");
            AVLog.ioi("GLThreadManager", sb.toString());
            super.run();
            GlUtil.nativeDetachThreadToOpenGl();
            StringBuilder sb2 = new StringBuilder("thread ");
            sb2.append(getName());
            sb2.append(" is exit.");
            AVLog.ioi("GLThreadManager", sb2.toString());
        }

        public MainGlThread(String str) {
            super(str);
        }
    }

    public static String getGPUGLVersoin() {
        return sGPUGLVersion;
    }

    public static String getGPURender() {
        return sGPURender;
    }

    public static String getGPUVendor() {
        return sGPUVendor;
    }

    public static boolean isEnableForceGLFinish() {
        return sForceFinish;
    }

    public static native void nativeSetupOpenGlRecycler();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
    }

    public static GLThreadManager get() {
        return get(null, 2);
    }

    public static EGLContext getEGLContext() {
        return get().mEGLContext;
    }

    public static int[] getEGLVersion() {
        return get().mEGLVersion;
    }

    public static Handler getMainGlHandle() {
        return get().mHandler;
    }

    public static void lockSharedGLContext() {
        sGlobalSharedGLContextLock.lock();
    }

    public static void unlockSharedGLContext() {
        sGlobalSharedGLContextLock.unlock();
    }

    public static long getNativeEGLContext() {
        return toNativeEGLContext(getEGLContext());
    }

    public static boolean isNeedFinish() {
        if (sForceFinish || sNeedFinish) {
            return true;
        }
        return false;
    }

    public void fillGPUDescription() {
        this.mHandler.post(new Runnable() {
            public void run() {
                try {
                    GLThreadManager.sGPUGLVersion = GLES10.glGetString(7938);
                    GLThreadManager.sGPURender = GLES10.glGetString(7937);
                    GLThreadManager.sGPUVendor = GLES10.glGetString(7936);
                    GLThreadManager.sNeedFinish = GLThreadManager.this.isContainVendoOnBlackList(GLThreadManager.sGPURender);
                } catch (Throwable th) {
                    AVLog.ioe("GLThreadManager", th.getMessage(), th);
                }
                StringBuilder sb = new StringBuilder("GPU version: ");
                sb.append(GLThreadManager.sGPUGLVersion);
                AVLog.ioi("GLThreadManager", sb.toString());
                StringBuilder sb2 = new StringBuilder("GPU Render: ");
                sb2.append(GLThreadManager.sGPURender);
                AVLog.ioi("GLThreadManager", sb2.toString());
                StringBuilder sb3 = new StringBuilder("GPU Vendor: ");
                sb3.append(GLThreadManager.sGPUVendor);
                AVLog.ioi("GLThreadManager", sb3.toString());
                StringBuilder sb4 = new StringBuilder("GPU render with finish: ");
                sb4.append(GLThreadManager.sNeedFinish);
                AVLog.ioi("GLThreadManager", sb4.toString());
            }
        });
    }

    protected static void dispose() {
        GLThreadManager gLThreadManager = sGLThreadManager;
        Looper looper = null;
        sGLThreadManager = null;
        if (gLThreadManager != null) {
            if (gLThreadManager.mHandler != null) {
                looper = gLThreadManager.mHandler.getLooper();
            }
            if (looper != null) {
                looper.quit();
            }
        }
    }

    private void initBlackList() {
        this.mGlFinishBlackList = new ArrayList<>();
        this.mGlFinishBlackList.add("Adreno (TM) 506");
        this.mGlFinishBlackList.add("Mali-T860");
    }

    public static void enableForceGLFinish(boolean z) {
        sForceFinish = z;
    }

    public static long toNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext != null) {
            if (VERSION.SDK_INT >= 21) {
                return eGLContext.getNativeHandle();
            }
            if (VERSION.SDK_INT >= 17) {
                return (long) eGLContext.getHandle();
            }
        }
        return 0;
    }

    public boolean isContainVendoOnBlackList(String str) {
        if (this.mGlFinishBlackList != null && !this.mGlFinishBlackList.isEmpty()) {
            Iterator it = this.mGlFinishBlackList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private GLThreadManager(EGLContext eGLContext, int i) {
        MediaEngineFactory.loadLibrary();
        initBlackList();
        setupSharedOpenGlContext(eGLContext, i);
    }

    public static GLThreadManager get(EGLContext eGLContext, int i) {
        if (sGLThreadManager == null) {
            synchronized (GLThreadManager.class) {
                long currentTimeMillis = System.currentTimeMillis();
                if (sGLThreadManager == null) {
                    sGLThreadManager = new GLThreadManager(eGLContext, i);
                } else if (eGLContext != null) {
                    AVLog.iow("GLThreadManager", "OpenGl env already init and ignore shared context");
                }
                StringBuilder sb = new StringBuilder("Create GLThreadManager cost time ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append(" ms");
                AVLog.ioi("GLThreadManager", sb.toString());
            }
        }
        return sGLThreadManager;
    }

    private void setupSharedOpenGlContext(EGLContext eGLContext, int i) {
        int[] iArr = {0};
        MainGlThread mainGlThread = new MainGlThread("OpenGlMgrThread");
        mainGlThread.start();
        this.mHandler = mainGlThread.getHandler();
        if (this.mHandler != null) {
            final long nativeEGLContext = toNativeEGLContext(eGLContext);
            Handler handler = this.mHandler;
            final int i2 = i;
            final int[] iArr2 = iArr;
            C511371 r1 = new Runnable() {
                public void run() {
                    StringBuilder sb = new StringBuilder("Init GLThreadManager with context ");
                    sb.append(nativeEGLContext);
                    sb.append(" version ");
                    sb.append(i2);
                    AVLog.ioi("GLThreadManager", sb.toString());
                    iArr2[0] = GlUtil.nativeAttachThreadToOpenGl(nativeEGLContext, i2, 0);
                    if (VERSION.SDK_INT >= 17) {
                        GLThreadManager.this.mEGLContext = EGL14.eglGetCurrentContext();
                        int[] iArr = {0, 0};
                        if (GLThreadManager.this.mEGLContext != null) {
                            EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), GLThreadManager.this.mEGLContext, 12440, iArr, 0);
                            GLThreadManager.this.mEGLVersion = iArr;
                            GLThreadManager.nativeSetupOpenGlRecycler();
                            GLThreadManager.this.fillGPUDescription();
                        }
                    }
                }
            };
            ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r1);
            StringBuilder sb = new StringBuilder();
            sb.append(this.mEGLVersion[0]);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.mEGLVersion[1]);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("EGLClient version ");
            sb3.append(sb2);
            sb3.append(" result:");
            sb3.append(iArr[0]);
            AVLog.ioi("GLThreadManager", sb3.toString());
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! not found handler");
        AVLog.ioe("GLThreadManager", androidRuntimeException.getMessage(), androidRuntimeException);
        throw androidRuntimeException;
    }
}
