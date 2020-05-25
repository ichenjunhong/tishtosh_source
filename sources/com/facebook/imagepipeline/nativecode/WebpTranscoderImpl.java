package com.facebook.imagepipeline.nativecode;

import android.os.Build.VERSION;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p928l.C13735c;
import com.facebook.p955h.C13899b;
import com.facebook.p955h.C13900c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WebpTranscoderImpl implements C14226e {
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;

    public boolean isWebpNativelySupported(C13900c cVar) {
        if (cVar == C13899b.f36268f) {
            if (VERSION.SDK_INT >= 14) {
                return true;
            }
            return false;
        } else if (cVar == C13899b.f36269g || cVar == C13899b.f36270h || cVar == C13899b.f36271i) {
            return C13735c.f35724c;
        } else {
            if (cVar == C13899b.f36272j) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
    }

    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException {
        C14225d.m29166a();
        nativeTranscodeWebpToPng((InputStream) C13689i.m27652a(inputStream), (OutputStream) C13689i.m27652a(outputStream));
    }

    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        C14225d.m29166a();
        nativeTranscodeWebpToJpeg((InputStream) C13689i.m27652a(inputStream), (OutputStream) C13689i.m27652a(outputStream), i);
    }
}
