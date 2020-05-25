package com.p683ss.android.vesdk.runtime;

import android.content.res.AssetManager;
import com.bef.effectsdk.C2592c;
import com.bef.effectsdk.FileResourceFinder;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.C50792y;

/* renamed from: com.ss.android.vesdk.runtime.VEEffectConfig */
public class VEEffectConfig {
    private static final String TAG = VEEffectConfig.class.getSimpleName();
    private static AssetManager sEffectAssetManager = null;
    private static C2592c sFinder = new FileResourceFinder("");

    private static native void nativeConfigEffect(boolean z, AssetManager assetManager, String str, String str2);

    private static native void nativeEnableAlgoParamisForce(boolean z, boolean z2);

    private static native void nativeEnableEffectRT(boolean z);

    private static native String nativeGetABConfigList();

    private static native void nativeSetABConfigValue(String str, boolean z, int i, float f, String str2, int i2);

    private static native void nativeSetABbUseBuildinAmazing(boolean z);

    private static native void nativeSetEffectAsynAPI(boolean z);

    private static native void nativeSetEffectForceDetectFace(boolean z);

    private static native void nativeSetEffectJsonConfig(String str);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetEffectMaxMemoryCache(int i);

    private static native void nativeSetEffectSyncTimeDomain(boolean z);

    private static native void nativeSetEnableStickerAmazing(boolean z);

    private static native void nativeSetShareDir(String str);

    private static native void nativeUseNewEffectAlgorithmApi(boolean z);

    public static String getABConfigList() {
        return nativeGetABConfigList();
    }

    static {
        C20129b.m49685b();
    }

    public static boolean enableAssetManager(AssetManager assetManager) {
        sEffectAssetManager = assetManager;
        return true;
    }

    public static void setEffectAsynAPI(boolean z) {
        nativeSetEffectAsynAPI(z);
    }

    public static void setEffectForceDetectFace(boolean z) {
        nativeSetEffectForceDetectFace(z);
    }

    public static void setEffectSyncTimeDomain(boolean z) {
        nativeSetEffectSyncTimeDomain(z);
    }

    public static void setEnableStickerAmazing(boolean z) {
        nativeSetEnableStickerAmazing(z);
    }

    public static void setResourceFinder(C2592c cVar) {
        sFinder = cVar;
    }

    public static void setUseNewEffectAlgorithmApi(boolean z) {
        nativeUseNewEffectAlgorithmApi(z);
    }

    public static boolean enableEffectRT(boolean z) {
        nativeEnableEffectRT(z);
        return true;
    }

    public static boolean setABbUseBuildinAmazing(boolean z) {
        nativeSetABbUseBuildinAmazing(z);
        return true;
    }

    public static boolean setEffectJsonConfig(String str) {
        nativeSetEffectJsonConfig(str);
        return true;
    }

    public static boolean setEffectLogLevel(int i) {
        nativeSetEffectLogLevel(i);
        return true;
    }

    public static boolean setEffectMaxMemoryCache(int i) {
        nativeSetEffectMaxMemoryCache(i);
        return true;
    }

    public static boolean setShareDir(String str) {
        nativeSetShareDir(str);
        return true;
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            C50792y.m109914d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        } else if (sFinder != null) {
            return sFinder.createNativeResourceFinder(j);
        } else {
            throw new C50751p(-1, "错误调用finder相关接口");
        }
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C50792y.m109914d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder != null) {
            sFinder.release(j);
        } else {
            throw new C50751p(-1, "错误调用finder相关接口");
        }
    }

    public static void enableAlgoParamIsForce(boolean z, boolean z2) {
        nativeEnableAlgoParamisForce(z, z2);
    }

    public static void configEffect(String str, String str2) {
        boolean z;
        if (sFinder != null) {
            z = true;
        } else {
            z = false;
        }
        nativeConfigEffect(z, sEffectAssetManager, str, str2);
    }

    public static void setABConfigValue(String str, Object obj, int i) {
        switch (i) {
            case 0:
                if (obj instanceof Boolean) {
                    nativeSetABConfigValue(str, ((Boolean) obj).booleanValue(), 0, 0.0f, null, i);
                    return;
                }
                break;
            case 1:
                if ((obj instanceof Integer) || (obj instanceof Long)) {
                    nativeSetABConfigValue(str, false, ((Number) obj).intValue(), 0.0f, null, i);
                    return;
                }
            case 2:
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    nativeSetABConfigValue(str, false, 0, ((Number) obj).floatValue(), null, i);
                    return;
                }
            case 3:
                if (obj instanceof String) {
                    nativeSetABConfigValue(str, false, 0, 0.0f, (String) obj, i);
                    break;
                }
                break;
        }
    }
}
