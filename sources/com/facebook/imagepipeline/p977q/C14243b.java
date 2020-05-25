package com.facebook.imagepipeline.p977q;

import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.p955h.C13900c;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.q.b */
public interface C14243b {
    boolean canResize(C14044e eVar, C13953e eVar2, C13952d dVar);

    boolean canTranscode(C13900c cVar);

    String getIdentifier();

    C14242a transcode(C14044e eVar, OutputStream outputStream, C13953e eVar2, C13952d dVar, C13900c cVar, Integer num) throws IOException;
}
