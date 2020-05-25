package com.p683ss.android.medialib.photomovie;

import android.content.Context;
import android.view.Surface;
import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.medialib.photomovie.PhotoMoviePlayer */
public class PhotoMoviePlayer {

    /* renamed from: a */
    public long f53514a = nativeCreatePlayer();

    /* renamed from: b */
    private Context f53515b;

    private native long nativeCreatePlayer();

    private native long nativeGetDuration(long j);

    private native int nativePause(long j);

    private native void nativePlayCover(long j, int i, int i2);

    private native int nativePrepare(long j, String[] strArr, String str, int i, int i2, int i3, int i4, int i5);

    private static native int nativeRegister();

    private native void nativeRelease(long j);

    private native int nativeReset(long j);

    private native void nativeSeekTo(long j, long j2);

    private native void nativeSetLoop(long j, boolean z);

    private native void nativeSetOrientation(long j, int i);

    private native int nativeStart(long j, Surface surface, int i, int i2);

    private native void nativeStop(long j);

    private native void nativeSwitchPlayMode(long j, int i);

    public native void nativeOnSizeChanged(long j, int i, int i2);

    public native int nativeResume(long j);

    public native void nativeSetFilter(long j, String str, String str2, float f);

    static {
        C20129b.m49688e();
        nativeRegister();
    }

    /* renamed from: a */
    public final int mo40158a() {
        return nativePause(this.f53514a);
    }

    /* renamed from: d */
    public final long mo40169d() {
        return nativeGetDuration(this.f53514a);
    }

    /* renamed from: b */
    public final void mo40166b() {
        synchronized (this) {
            nativeStop(this.f53514a);
        }
    }

    /* renamed from: c */
    public final void mo40168c() {
        mo40166b();
        nativeRelease(this.f53514a);
        this.f53514a = 0;
    }

    /* renamed from: b */
    public final void mo40167b(int i) {
        nativeSwitchPlayMode(this.f53514a, i);
    }

    public PhotoMoviePlayer(Context context) {
        this.f53515b = context;
    }

    /* renamed from: a */
    public final void mo40161a(int i) {
        nativeSetOrientation(this.f53514a, i);
    }

    /* renamed from: a */
    public final void mo40163a(long j) {
        nativeSeekTo(this.f53514a, j);
    }

    /* renamed from: a */
    public final void mo40164a(String str) {
        nativeSetFilter(this.f53514a, str, null, 1.0f);
    }

    /* renamed from: a */
    public final void mo40165a(boolean z) {
        nativeSetLoop(this.f53514a, true);
    }

    /* renamed from: a */
    public final void mo40162a(int i, int i2) {
        nativePlayCover(this.f53514a, i, i2);
    }

    /* renamed from: a */
    public final int mo40159a(Surface surface, int i, int i2) {
        int nativeStart;
        synchronized (this) {
            nativeStart = nativeStart(this.f53514a, surface, i, i2);
        }
        return nativeStart;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0069 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo40160a(java.util.List<java.lang.String> r12, java.lang.String r13, com.p683ss.android.medialib.photomovie.C19355a r14) {
        /*
            r11 = this;
            int r0 = r12.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r12.toArray(r0)
            if (r14 != 0) goto L_0x001b
            com.ss.android.medialib.photomovie.a r14 = new com.ss.android.medialib.photomovie.a
            r14.<init>()
            r12 = 1
            r14.f53516a = r12
            r12 = 2500(0x9c4, float:3.503E-42)
            r14.f53517b = r12
            r12 = 500(0x1f4, float:7.0E-43)
            r14.f53518c = r12
        L_0x001b:
            monitor-enter(r11)
            android.content.Context r12 = r11.f53515b     // Catch:{ all -> 0x006b }
            android.util.Pair r12 = com.p683ss.android.medialib.p1184e.C19317c.m47182a(r12)     // Catch:{ all -> 0x006b }
            long r2 = r11.f53514a     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r12.first     // Catch:{ all -> 0x006b }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x006b }
            int r6 = r1.intValue()     // Catch:{ all -> 0x006b }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x006b }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x006b }
            int r7 = r12.intValue()     // Catch:{ all -> 0x006b }
            int r8 = r14.f53516a     // Catch:{ all -> 0x006b }
            int r9 = r14.f53517b     // Catch:{ all -> 0x006b }
            int r10 = r14.f53518c     // Catch:{ all -> 0x006b }
            r1 = r11
            r4 = r0
            r5 = r13
            int r12 = r1.nativePrepare(r2, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006b }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0069 }
            r1.<init>()     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r2 = "imageArray"
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ JSONException -> 0x0069 }
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r0 = "audioPath"
            r1.put(r0, r13)     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r13 = "transitionParams"
            java.lang.String r14 = r14.toString()     // Catch:{ JSONException -> 0x0069 }
            r1.put(r13, r14)     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r13 = "resultCode"
            r1.put(r13, r12)     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r13 = "vesdk_event_photo_movie_init"
            java.lang.String r14 = "behavior"
            com.p683ss.android.ttve.monitor.C20102a.m49612a(r13, r1, r14)     // Catch:{ JSONException -> 0x0069 }
        L_0x0069:
            monitor-exit(r11)     // Catch:{ all -> 0x006b }
            return r12
        L_0x006b:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x006b }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.photomovie.PhotoMoviePlayer.mo40160a(java.util.List, java.lang.String, com.ss.android.medialib.photomovie.a):int");
    }
}
