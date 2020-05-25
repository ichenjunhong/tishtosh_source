package com.p683ss.ttvideoengine.data;

import android.text.TextUtils;
import com.C2240a;
import com.onething.xyvod.XYVodSDK;
import com.p683ss.ttvideoengine.LibraryLoaderProxy;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: com.ss.ttvideoengine.data.VideoLoadWrapper */
public class VideoLoadWrapper {
    private static String TAG = "VideoLoadWrapper";
    private volatile boolean isInited;
    private volatile boolean isProxyLibraryLoaded;
    private volatile LibraryLoaderProxy mProxy;

    /* renamed from: com.ss.ttvideoengine.data.VideoLoadWrapper$VideoLoadWrapperSingletonHolder */
    static class VideoLoadWrapperSingletonHolder {
        public static final VideoLoadWrapper instance = new VideoLoadWrapper();

        private VideoLoadWrapperSingletonHolder() {
        }
    }

    private VideoLoadWrapper() {
    }

    public static VideoLoadWrapper getInstance() {
        return VideoLoadWrapperSingletonHolder.instance;
    }

    public synchronized String getSDKVersion() {
        if (!this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library not loaded,info is empty", new Object[0]));
            return "";
        }
        return XYVodSDK.m44430b();
    }

    public synchronized boolean loadLibrary() {
        if (this.mProxy == null) {
            return true;
        }
        if (this.mProxy != null && !this.isProxyLibraryLoaded) {
            this.isProxyLibraryLoaded = this.mProxy.loadLibrary("xyvodsdk");
        }
        return this.isProxyLibraryLoaded;
    }

    public synchronized int release() {
        if (!this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library never been loaded not need release", new Object[0]));
            return 0;
        } else if (XYVodSDK.m44425a() == 0) {
            TTVideoEngineLog.m110647i(TAG, C2240a.m6772a("release suc", new Object[0]));
            this.isInited = false;
            return 0;
        } else {
            TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("release fail", new Object[0]));
            return -1;
        }
    }

    public synchronized int init() {
        boolean z;
        if (!loadLibrary()) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library load fail, not allow init", new Object[0]));
            return -3;
        } else if (this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("has been init", new Object[0]));
            return 0;
        } else {
            try {
                if (this.mProxy != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (XYVodSDK.m44427a(z) == 0) {
                    this.isInited = true;
                    TTVideoEngineLog.m110647i(TAG, C2240a.m6772a("init suc", new Object[0]));
                    return 0;
                }
                TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("init fail", new Object[0]));
                return -1;
            } catch (Throwable th) {
                TTVideoEngineLog.m110645d(th);
                TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("init suc", new Object[0]));
                return -2;
            }
        }
    }

    public synchronized void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        if (libraryLoaderProxy != null) {
            this.mProxy = libraryLoaderProxy;
        }
    }

    public synchronized void setLogEnable(int i) {
        if (this.isInited) {
            XYVodSDK.setLogEnable(i);
        }
    }

    public synchronized void forbidP2P(String str) {
        if (!this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library not loaded,not permit forbid p2p", new Object[0]));
        } else {
            XYVodSDK.m44426a(str, 4, 1);
        }
    }

    public synchronized void stopTask(String str) {
        if (!this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library not loaded,not permit stoptask", new Object[0]));
        } else {
            XYVodSDK.m44432c(str);
        }
    }

    public synchronized String getLoadInfo(String str) {
        if (this.isInited) {
            if (!TextUtils.isEmpty(str)) {
                return XYVodSDK.m44428a(str);
            }
        }
        TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library not loaded,info is empty", new Object[0]));
        return "";
    }

    public synchronized String getReWriteUrl(String str, int i) {
        if (!this.isInited && init() != 0) {
            return null;
        }
        if (this.isInited) {
            if (!TextUtils.isEmpty(str)) {
                return XYVodSDK.m44429a(str, i);
            }
        }
        TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("get rewrite url fail, library not load or url is null", new Object[0]));
        return null;
    }

    public synchronized void setPlayPos(String str, long j) {
        if (!this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library not loaded,not permit set play pos", new Object[0]));
            return;
        }
        try {
            XYVodSDK.m44431b(str);
            XYVodSDK.setPlayPos(str, j);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public synchronized void videoStalled(String str, int i) {
        if (!this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library not loaded,not permit video stall", new Object[0]));
            return;
        }
        try {
            XYVodSDK.setStuck(XYVodSDK.m44431b(str), i);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public synchronized void setPlayInfo(String str, int i, long j) {
        if (!this.isInited) {
            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("library not loaded,not permit set play info", new Object[0]));
        } else {
            XYVodSDK.m44426a(str, i, j);
        }
    }
}
