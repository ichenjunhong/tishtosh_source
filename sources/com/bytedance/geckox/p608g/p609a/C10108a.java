package com.bytedance.geckox.p608g.p609a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.geckox.g.a.a */
public abstract class C10108a {

    /* renamed from: a */
    private File f27400a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo18086a(File file, String str) throws IOException;

    public C10108a(File file) {
        this.f27400a = file;
    }

    /* renamed from: a */
    public final InputStream mo18087a(String str) throws IOException {
        return mo18086a(this.f27400a, str);
    }
}
