package com.facebook.imagepipeline.nativecode;

import com.facebook.imagepipeline.p977q.C14243b;
import com.facebook.imagepipeline.p977q.C14244c;
import com.facebook.p955h.C13899b;
import com.facebook.p955h.C13900c;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
public final class C14224c implements C14244c {

    /* renamed from: a */
    private final int f37122a;

    /* renamed from: b */
    private final boolean f37123b;

    public C14224c(int i, boolean z) {
        this.f37122a = i;
        this.f37123b = z;
    }

    /* renamed from: a */
    public final C14243b mo26440a(C13900c cVar, boolean z) {
        if (cVar != C13899b.f36263a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f37122a, this.f37123b);
    }
}
