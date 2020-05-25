package com.facebook.imagepipeline.nativecode;

import com.facebook.p955h.C13900c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.nativecode.e */
public interface C14226e {
    boolean isWebpNativelySupported(C13900c cVar);

    void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;
}
