package com.bytedance.ies.p621b.p624c;

import java.io.IOException;
import okhttp3.C53500ac;
import okhttp3.C53678w;
import okio.BufferedSink;

/* renamed from: com.bytedance.ies.b.c.d */
public final class C10210d extends C53500ac {

    /* renamed from: a */
    C53500ac f27545a;

    public final C53678w contentType() {
        return this.f27545a.contentType();
    }

    public C10210d(C53500ac acVar) {
        if (acVar != null) {
            this.f27545a = acVar;
            return;
        }
        throw new NullPointerException("requestBody == null");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        this.f27545a.writeTo(bufferedSink);
        bufferedSink.flush();
    }
}
