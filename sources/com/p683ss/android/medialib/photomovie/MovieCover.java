package com.p683ss.android.medialib.photomovie;

import com.p683ss.android.medialib.model.CoverInfo;
import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.medialib.photomovie.MovieCover */
public class MovieCover {
    private long mHandle;

    static {
        C20129b.m49688e();
    }

    private native long nativeCreate(int i, int i2, int i3);

    private native void nativeDestroy(long j);

    private native CoverInfo nativeGetCover(long j, String[] strArr, String str, String str2, float f, int i, long j2, int i2, int i3);

    public MovieCover() {
        this(new C19355a(1, 2500, 500));
    }

    public void destroy() {
        nativeDestroy(this.mHandle);
        this.mHandle = 0;
    }

    public MovieCover(C19355a aVar) {
        this.mHandle = nativeCreate(aVar.f53516a, aVar.f53517b, aVar.f53518c);
    }

    public CoverInfo getCover(String[] strArr, String str, int i, long j, int i2, int i3) {
        return nativeGetCover(this.mHandle, strArr, str, null, 1.0f, i, j, i2, i3);
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f, int i, long j) {
        return nativeGetCover(this.mHandle, strArr, str, str2, f, i, j, 720, 1280);
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f, int i, long j, int i2, int i3) {
        return nativeGetCover(this.mHandle, strArr, str, str2, f, i, j, i2, i3);
    }
}
