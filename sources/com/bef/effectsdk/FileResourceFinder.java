package com.bef.effectsdk;

public final class FileResourceFinder implements C2592c {

    /* renamed from: a */
    private final String f7998a;

    private static native long nativeCreateFileResourceFinder(long j, String str);

    public final void release(long j) {
    }

    public FileResourceFinder(String str) {
        this.f7998a = str;
    }

    public final long createNativeResourceFinder(long j) {
        return nativeCreateFileResourceFinder(j, this.f7998a);
    }
}
