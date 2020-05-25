package p2699pl.droidsonroids.gif;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p2699pl.droidsonroids.p2700a.C53862c;

/* renamed from: pl.droidsonroids.gif.GifInfoHandle */
final class GifInfoHandle {

    /* renamed from: a */
    private volatile long f133490a;

    GifInfoHandle() {
    }

    private static native void bindSurface(long j, Surface surface, long[] jArr);

    static native int createTempNativeFileDescriptor() throws GifIOException;

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z) throws GifIOException;

    private static native void free(long j);

    private static native long getAllocationByteCount(long j);

    private static native String getComment(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getFrameDuration(long j, int i);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native long getMetadataByteCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native long getSourceLength(long j);

    private static native int getWidth(long j);

    private static native void glTexImage2D(long j, int i, int i2);

    private static native void glTexSubImage2D(long j, int i, int i2);

    private static native void initTexImageDescriptor(long j);

    private static native boolean isAnimationCompleted(long j);

    private static native boolean isOpaque(long j);

    static native long openByteArray(byte[] bArr) throws GifIOException;

    static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    static native long openFile(String str) throws GifIOException;

    static native long openNativeFileDescriptor(int i, long j) throws GifIOException;

    static native long openStream(InputStream inputStream) throws GifIOException;

    private static native void postUnbindSurface(long j);

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToFrame(long j, int i, Bitmap bitmap);

    private static native void seekToFrameGL(long j, int i);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    private static native void setOptions(long j, char c, boolean z);

    private static native void setSpeedFactor(long j, float f);

    private static native void startDecoderThread(long j);

    private static native void stopDecoderThread(long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized long mo113886b() {
        return restoreRemainder(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized boolean mo113887c() {
        return reset(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final synchronized void mo113888d() {
        saveRemainder(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final synchronized int mo113889e() {
        return getLoopCount(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final synchronized int mo113890f() {
        return getNativeErrorCode(this.f133490a);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            mo113884a();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final synchronized int mo113892g() {
        return getDuration(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final synchronized int mo113893h() {
        return getCurrentPosition(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final synchronized int mo113894i() {
        return getCurrentFrameIndex(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final synchronized int mo113895j() {
        return getCurrentLoop(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final synchronized long mo113896k() {
        return getAllocationByteCount(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final synchronized long mo113897l() {
        return getMetadataByteCount(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final synchronized int mo113899n() {
        return getWidth(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final synchronized int mo113900o() {
        return getHeight(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final synchronized int mo113901p() {
        return getNumberOfFrames(this.f133490a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final synchronized boolean mo113902q() {
        return isOpaque(this.f133490a);
    }

    static {
        try {
            C53884f.m114550a("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            C53862c.m114496a(C53883e.m114549a(), "pl_droidsonroids_gif", null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final synchronized boolean mo113898m() {
        boolean z;
        if (this.f133490a == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo113884a() {
        free(this.f133490a);
        this.f133490a = 0;
    }

    GifInfoHandle(FileDescriptor fileDescriptor) throws GifIOException {
        this.f133490a = m114517a(fileDescriptor, 0, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized long mo113883a(Bitmap bitmap) {
        return renderFrame(this.f133490a, bitmap);
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f133490a = m114517a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    GifInfoHandle(InputStream inputStream) throws GifIOException {
        if (inputStream.markSupported()) {
            this.f133490a = openStream(inputStream);
            return;
        }
        throw new IllegalArgumentException("InputStream does not support marking");
    }

    GifInfoHandle(String str) throws GifIOException {
        this.f133490a = openFile(str);
    }

    GifInfoHandle(ByteBuffer byteBuffer) throws GifIOException {
        this.f133490a = openDirectByteBuffer(byteBuffer);
    }

    GifInfoHandle(byte[] bArr) throws GifIOException {
        this.f133490a = openByteArray(bArr);
    }

    /* renamed from: a */
    private static int m114516a(FileDescriptor fileDescriptor, boolean z) throws GifIOException, ErrnoException {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            if (z) {
                Os.close(fileDescriptor);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo113885a(int i, Bitmap bitmap) {
        seekToTime(this.f133490a, i, bitmap);
    }

    /* renamed from: a */
    private static long m114517a(FileDescriptor fileDescriptor, long j, boolean z) throws GifIOException {
        int i;
        if (VERSION.SDK_INT > 27) {
            try {
                i = m114516a(fileDescriptor, z);
            } catch (Exception e) {
                throw new GifIOException(C53878b.OPEN_FAILED.f133515a, e.getMessage());
            }
        } else {
            i = extractNativeFileDescriptor(fileDescriptor, z);
        }
        return openNativeFileDescriptor(i, j);
    }
}
