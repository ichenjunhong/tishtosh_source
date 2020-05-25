package com.p683ss.android.medialib;

import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.C2592c;
import com.bef.effectsdk.FileResourceFinder;
import com.p683ss.android.medialib.config.C19309a;
import com.p683ss.android.medialib.p1184e.C19314a;
import com.p683ss.android.medialib.util.C19390b;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.vesdk.C50792y;
import java.util.Map;

/* renamed from: com.ss.android.medialib.VideoSdkCore */
public final class VideoSdkCore {
    public static Context APPLICATION_CONTEXT = null;
    public static final int PRODUCT_AWEME = 0;
    public static final int PRODUCT_HOTSOON = 1;
    public static final int PRODUCT_OTHER = 2;
    public static final String TAG = "VideoSdkCore";
    private static boolean inited;
    private static C2592c sFinder = new FileResourceFinder("");

    private static native void nativeEnableGLES3(boolean z);

    private static native String nativeGetVersionCode();

    private static native String nativeGetVersionName();

    private static native void nativeSetABbUseBuildinAmazing(boolean z);

    private static native void nativeSetAmazingShareDir(String str);

    private static native void nativeSetAssertManagerEnable(boolean z);

    private static native void nativeSetAssertManagerFromJava(AssetManager assetManager);

    private static native void nativeSetEffectJsonConfig(String str);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetEffectMaxMemoryCache(int i);

    private static native void nativeSetProduct(int i);

    private static native void nativeSetResourceFinderEnable(boolean z);

    public static String getSdkVersionCode() {
        return nativeGetVersionCode();
    }

    public static String getSdkVersionName() {
        return nativeGetVersionName();
    }

    static {
        C20129b.m49687d();
    }

    public static void enableGLES3(boolean z) {
        nativeEnableGLES3(z);
    }

    public static void setABbUseBuildinAmazing(boolean z) {
        nativeSetABbUseBuildinAmazing(z);
    }

    public static void setAmazingShareDir(String str) {
        nativeSetAmazingShareDir(str);
    }

    public static void setEffectJsonConfig(String str) {
        nativeSetEffectJsonConfig(str);
    }

    public static void setEffectLogLevel(int i) {
        nativeSetEffectLogLevel(i);
    }

    public static void setEffectMaxMemoryCache(int i) {
        nativeSetEffectMaxMemoryCache(i);
    }

    public static void setEnableAssetManager(boolean z) {
        nativeSetAssertManagerEnable(z);
    }

    public static void setProduct(int i) {
        nativeSetProduct(i);
    }

    public static void setResourceFinder(C2592c cVar) {
        sFinder = cVar;
        nativeSetResourceFinderEnable(true);
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C50792y.m109914d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder == null) {
            C50792y.m109914d(TAG, "错误调用finder相关接口");
        } else {
            sFinder.release(j);
        }
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            C50792y.m109914d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        } else if (sFinder != null) {
            return sFinder.createNativeResourceFinder(j);
        } else {
            C50792y.m109914d(TAG, "错误调用finder相关接口");
            return 0;
        }
    }

    public static void init(final Context context) {
        if (!inited) {
            synchronized (VideoSdkCore.class) {
                if (!inited) {
                    APPLICATION_CONTEXT = context.getApplicationContext();
                    nativeSetAssertManagerFromJava(context.getAssets());
                    new Thread() {
                        public final void run() {
                            try {
                                C19314a.m47172a(context);
                                if (VideoSdkCore.APPLICATION_CONTEXT != null) {
                                    Map a = C19390b.m47480a(VideoSdkCore.APPLICATION_CONTEXT);
                                    String str = "use_opensl";
                                    int i = 0;
                                    if (a != null) {
                                        Integer num = (Integer) a.get(str);
                                        if (num != null) {
                                            i = num.intValue();
                                        }
                                    }
                                    if (i == 0) {
                                        i = 2;
                                    }
                                    C19309a.f53348a = i;
                                    return;
                                }
                                throw new IllegalStateException("Must call VideoSdkCore.init() before.");
                            } catch (Exception e) {
                                String str2 = VideoSdkCore.TAG;
                                StringBuilder sb = new StringBuilder("VideoSdkCore init failed: ");
                                sb.append(e.toString());
                                C50792y.m109914d(str2, sb.toString());
                            }
                        }
                    }.start();
                    inited = true;
                }
            }
        }
    }
}
