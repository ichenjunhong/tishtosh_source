package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wf */
final class C16342wf extends ThreadLocal<ByteBuffer> {
    C16342wf(C16319vj vjVar) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
