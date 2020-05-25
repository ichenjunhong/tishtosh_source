package com.facebook.imagepipeline.nativecode;

import com.facebook.common.p920d.C13679b;
import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14203q;
import com.facebook.imagepipeline.p977q.C14242a;
import com.facebook.imagepipeline.p977q.C14243b;
import com.facebook.imagepipeline.p977q.C14245d;
import com.facebook.p955h.C13899b;
import com.facebook.p955h.C13900c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NativeJpegTranscoder implements C14243b {
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    static {
        C14222a.m29163a();
    }

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    public boolean canTranscode(C13900c cVar) {
        if (cVar == C13899b.f36263a) {
            return true;
        }
        return false;
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
    }

    public boolean canResize(C14044e eVar, C13953e eVar2, C13952d dVar) {
        if (eVar2 == null) {
            eVar2 = C13953e.m28428a();
        }
        if (C14245d.m29192a(eVar2, dVar, eVar, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13689i.m27655a(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13689i.m27655a(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13689i.m27655a(z4);
        if (i < 0 || i > 270 || i % 90 != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        C13689i.m27655a(z5);
        if (!(i2 == 8 && i == 0)) {
            z6 = true;
        }
        C13689i.m27656a(z6, (Object) "no transformation requested");
        nativeTranscodeJpeg((InputStream) C13689i.m27652a(inputStream), (OutputStream) C13689i.m27652a(outputStream), i, i2, i3);
    }

    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13689i.m27655a(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13689i.m27655a(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13689i.m27655a(z4);
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        C13689i.m27655a(z5);
        if (!(i2 == 8 && i == 1)) {
            z6 = true;
        }
        C13689i.m27656a(z6, (Object) "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C13689i.m27652a(inputStream), (OutputStream) C13689i.m27652a(outputStream), i, i2, i3);
    }

    public C14242a transcode(C14044e eVar, OutputStream outputStream, C13953e eVar2, C13952d dVar, C13900c cVar, Integer num) throws IOException {
        InputStream inputStream;
        if (num == null) {
            num = Integer.valueOf(85);
        }
        if (eVar2 == null) {
            eVar2 = C13953e.m28428a();
        }
        int a = C14203q.m29128a(eVar2, dVar, eVar, this.mMaxBitmapSize);
        try {
            int a2 = C14245d.m29192a(eVar2, dVar, eVar, this.mResizingEnabled);
            int i = 1;
            int max = Math.max(1, 8 / a);
            if (this.mUseDownsamplingRatio) {
                a2 = max;
            }
            inputStream = eVar.mo26265c();
            try {
                if (C14245d.f37148a.contains(Integer.valueOf(eVar.mo26269f()))) {
                    transcodeJpegWithExifOrientation(inputStream, outputStream, C14245d.m29195b(eVar2, eVar), a2, num.intValue());
                } else {
                    transcodeJpeg(inputStream, outputStream, C14245d.m29193a(eVar2, eVar), a2, num.intValue());
                }
                C13679b.m27634a(inputStream);
                if (a != 1) {
                    i = 0;
                }
                return new C14242a(i);
            } catch (Throwable th) {
                th = th;
                C13679b.m27634a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C13679b.m27634a(inputStream);
            throw th;
        }
    }
}
