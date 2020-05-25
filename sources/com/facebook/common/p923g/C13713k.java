package com.facebook.common.p923g;

import com.facebook.common.p920d.C13696m;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.facebook.common.g.k */
public abstract class C13713k extends OutputStream {
    /* renamed from: a */
    public abstract C13709h mo25626a();

    /* renamed from: b */
    public abstract int mo25627b();

    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C13696m.m27667b(e);
        }
    }
}
