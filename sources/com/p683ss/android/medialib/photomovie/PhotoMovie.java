package com.p683ss.android.medialib.photomovie;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import com.p683ss.android.medialib.C19230c;
import com.p683ss.android.medialib.C19310d;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.vesdk.C50792y;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.photomovie.PhotoMovie */
public final class PhotoMovie implements C19310d {
    private static final String TAG = "PhotoMovie";
    private static C19353a mPhotoMovieListener;
    protected static volatile PhotoMovie mSingleton;
    private C19230c mAVCEncoderMark;

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$ProgressCallback */
    public interface ProgressCallback {
        void onProgress(int i);
    }

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$a */
    public interface C19353a {
        /* renamed from: a */
        void mo40157a(int i);
    }

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$b */
    public static class C19354b {

        /* renamed from: a */
        public String[] f53502a;

        /* renamed from: b */
        public String f53503b;

        /* renamed from: c */
        public String f53504c;

        /* renamed from: d */
        public String[] f53505d;

        /* renamed from: e */
        public String[] f53506e;

        /* renamed from: f */
        public int[] f53507f;

        /* renamed from: g */
        public int f53508g;

        /* renamed from: h */
        public String f53509h;

        /* renamed from: i */
        public String f53510i;

        /* renamed from: j */
        public float f53511j = 1.0f;

        /* renamed from: k */
        public final C19355a f53512k = new C19355a(1, 2500, 500);

        /* renamed from: l */
        public ProgressCallback f53513l;
    }

    static {
        C20129b.m49687d();
    }

    private static native int nativeSynthetise(String[] strArr, String str, String str2, String[] strArr2, String[] strArr3, int[] iArr, int i, String str3, String str4, float f, int i2, int i3, int i4, ProgressCallback progressCallback);

    private native void onWriteFile(byte[] bArr, int i, int i2, int i3, int i4);

    private native int setCodecConfig(byte[] bArr, int i);

    private native int setColorFormat(int i);

    private native int setHardEncoderMarkStatus(boolean z);

    private static native void setMarkParams(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6);

    private native void swapGlBuffer();

    public final void onMarkEncoderData(ByteBuffer byteBuffer, int i, boolean z) {
    }

    public final void onMarkEncoderData(byte[] bArr, int i, boolean z) {
    }

    public final void onMarkSwapGlBuffers() {
        swapGlBuffer();
    }

    public PhotoMovie() {
        mSingleton = this;
    }

    public static void onNativeCallback_UninitMarkHardEncoder() {
        if (mSingleton != null) {
            mSingleton.onUninitMarkHardEncoder();
        }
    }

    public static PhotoMovie getInstance() {
        synchronized (PhotoMovie.class) {
            if (mSingleton == null) {
                synchronized (PhotoMovie.class) {
                    if (mSingleton == null) {
                        mSingleton = new PhotoMovie();
                    }
                }
            }
        }
        return mSingleton;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:10|11|(4:13|14|15|16)|17|18|19|20|(1:22)|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUninitMarkHardEncoder() {
        /*
            r4 = this;
            java.lang.String r0 = TAG
            java.lang.String r1 = "onUninitMarkHardEncoder == enter"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)
            com.ss.android.medialib.c r0 = r4.mAVCEncoderMark
            if (r0 == 0) goto L_0x004a
            com.ss.android.medialib.c r0 = r4.mAVCEncoderMark
            monitor-enter(r0)
            int r1 = r0.f53044i     // Catch:{ all -> 0x0047 }
            r2 = 0
            if (r1 == 0) goto L_0x003c
            android.media.MediaCodec r1 = r0.f53041f     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0018
            goto L_0x003c
        L_0x0018:
            int r1 = r0.f53044i     // Catch:{ all -> 0x0047 }
            r3 = 2
            if (r1 != r3) goto L_0x002a
            android.media.MediaCodec r1 = r0.f53041f     // Catch:{ Exception -> 0x0023 }
            r1.stop()     // Catch:{ Exception -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            java.lang.String r1 = com.p683ss.android.medialib.C19230c.f53033a     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "MediaCodec Exception"
            com.p683ss.android.vesdk.C50792y.m109914d(r1, r3)     // Catch:{ all -> 0x0047 }
        L_0x002a:
            android.media.MediaCodec r1 = r0.f53041f     // Catch:{ Exception -> 0x002f }
            r1.release()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r0.f53041f = r2     // Catch:{ all -> 0x0047 }
            android.view.Surface r1 = r0.f53042g     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x003a
            android.view.Surface r1 = r0.f53042g     // Catch:{ all -> 0x0047 }
            r1.release()     // Catch:{ all -> 0x0047 }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x003d
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
        L_0x003d:
            r4.mAVCEncoderMark = r2
            java.lang.String r0 = TAG
            java.lang.String r1 = "====== uninitAVCEncoder ======"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)
            goto L_0x004a
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1
        L_0x004a:
            java.lang.String r0 = TAG
            java.lang.String r1 = "onUninitMarkHardEncoder == exit"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.photomovie.PhotoMovie.onUninitMarkHardEncoder():void");
    }

    public static void setPhotoMovieListener(C19353a aVar) {
        mPhotoMovieListener = aVar;
    }

    public final void setColorFormatMark(int i) {
        setColorFormat(i);
    }

    public static PhotoMoviePlayer createPlayer(Context context) {
        return new PhotoMoviePlayer(context);
    }

    public final void onMarkSetCodecConfig(byte[] bArr) {
        setCodecConfig(bArr, bArr.length);
    }

    public static int calulateDuration(C19354b bVar) {
        if (bVar.f53502a.length == 0) {
            return 0;
        }
        return (bVar.f53502a.length * 2500) - 500;
    }

    public static void onNativeCallback_InitMarkHardEncoderRet(int i) {
        if (mSingleton != null) {
            mSingleton.onInitMarkHardEncoderRet(i);
        }
    }

    public final void onInitMarkHardEncoderRet(int i) {
        if (mPhotoMovieListener != null) {
            mPhotoMovieListener.mo40157a(i);
        }
    }

    public final int synthetise(C19354b bVar) throws IllegalStateException {
        C19354b bVar2 = bVar;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return nativeSynthetise(bVar2.f53502a, bVar2.f53503b, bVar2.f53504c, bVar2.f53505d, bVar2.f53506e, bVar2.f53507f, bVar2.f53508g, bVar2.f53509h, bVar2.f53510i, bVar2.f53511j, bVar2.f53512k.f53516a, bVar2.f53512k.f53517b, bVar2.f53512k.f53518c, bVar2.f53513l);
        }
        throw new IllegalStateException("Don't synthetise photomovie in main thread");
    }

    public final void onMarkWriteFile(byte[] bArr, int i, int i2, int i3) {
        onWriteFile(bArr, bArr.length, i, i2, i3);
        C50792y.m109911b(TAG, "onEncoderData: ...");
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, boolean z) {
        return onInitMarkHardEncoder(i, i2, i3, 1, 1, i4, z);
    }

    public static int onNativeCallback_MarkencodeTexture(int i, int i2, int i3, int i4, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onMarkEncodeData(i, i2, i3, i4, z);
        }
        return 0;
    }

    public final int onMarkEncodeData(int i, int i2, int i3, int i4, boolean z) {
        if (this.mAVCEncoderMark != null) {
            return this.mAVCEncoderMark.mo39622b(i, i2, i3, i4, z);
        }
        return 0;
    }

    public final int onMarkEncoderData(int i, int i2, int i3, int i4, boolean z) {
        if (this.mAVCEncoderMark != null) {
            return this.mAVCEncoderMark.mo39622b(i, i2, i3, i4, z);
        }
        return 0;
    }

    public static Surface onNativeCallback_InitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onInitMarkHardEncoder(i, i2, i3, i4, i5, z);
        }
        return null;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new C19230c();
        }
        C19230c.m46875a(this);
        Surface a = this.mAVCEncoderMark.mo39621a(i, i2, i3, 1, z);
        if (a == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            return null;
        }
        C50792y.m109909a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        return a;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        C50792y.m109909a(TAG, "onInitMarkHardEncoder == enter");
        String str = TAG;
        StringBuilder sb = new StringBuilder("width = ");
        sb.append(i);
        sb.append("\theight = ");
        sb.append(i2);
        C50792y.m109909a(str, sb.toString());
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new C19230c();
        }
        C19230c.m46875a(this);
        Surface a = this.mAVCEncoderMark.mo39621a(i, i2, i3, i6, z);
        if (a == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            return null;
        }
        C50792y.m109909a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        C50792y.m109909a(TAG, "onInitMarkHardEncoder == exit");
        return a;
    }

    public static void onNativeCallback_MarkParam(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (mSingleton != null) {
            mSingleton.onMarkParam(f, i, f2, f3, f4, f5, f6, f7);
        }
    }

    public final void onMarkParam(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.mAVCEncoderMark != null) {
            C19230c cVar = this.mAVCEncoderMark;
            cVar.f53046k = f;
            cVar.f53047l = i;
            cVar.f53048m = f2;
            cVar.f53049n = f3;
            cVar.f53050o = f4;
            cVar.f53051p = f5;
            cVar.f53052q = f6;
            cVar.f53053r = f7;
            if (cVar.f53043h != null) {
                cVar.f53043h.mo39884b(cVar.f53046k);
                cVar.f53043h.mo39882a(cVar.f53048m, cVar.f53049n, cVar.f53050o, cVar.f53051p);
            }
        }
    }

    public final void setMarkParam(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        setMarkParams(strArr, str, z, i, i2, i3, i4, i5, i6);
    }
}
