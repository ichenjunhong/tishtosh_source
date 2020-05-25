package com.bef.effectsdk;

import android.content.res.AssetManager;

public final class AssetResourceFinder implements C2592c {

    /* renamed from: a */
    private final AssetManager f7989a;

    /* renamed from: b */
    private final String f7990b;

    private static native long nativeCreateAssetResourceFinder(long j, AssetManager assetManager, String str);

    private static native void nativeReleaseAssetResourceFinder(long j);

    public final synchronized long createNativeResourceFinder(long j) {
        return nativeCreateAssetResourceFinder(j, this.f7989a, this.f7990b);
    }

    public final synchronized void release(long j) {
        nativeReleaseAssetResourceFinder(j);
    }

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.f7989a = assetManager;
        this.f7990b = str;
    }
}
