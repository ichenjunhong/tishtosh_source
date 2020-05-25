package com.bytedance.geckox.p608g.p609a;

import com.bytedance.geckox.p611i.C10117b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.geckox.g.a.c */
public final class C10110c extends C10108a {
    public C10110c(File file) {
        super(file);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final InputStream mo18086a(File file, String str) throws IOException {
        StringBuilder sb = new StringBuilder("res");
        sb.append(File.separator);
        sb.append(str);
        File file2 = new File(file, sb.toString());
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            C10117b.m20388a("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
            return new FileInputStream(file2.getCanonicalFile());
        }
        throw new IOException("文件不存在");
    }
}
