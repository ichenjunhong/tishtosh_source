package com.bytedance.p560f;

import android.content.Context;
import android.os.Environment;
import com.C2240a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.bytedance.f.d */
public final class C9754d implements C9753c {

    /* renamed from: a */
    private final Context f26546a;

    /* renamed from: a */
    private File m19530a() {
        return new File(this.f26546a.getFilesDir(), "external_libs");
    }

    public C9754d(Context context) {
        this.f26546a = context;
    }

    /* renamed from: a */
    public final String mo17580a(String str) {
        return m19531c(str);
    }

    /* renamed from: b */
    public final void mo17581b(String str) {
        new File(m19530a(), str).delete();
    }

    /* renamed from: c */
    private String m19531c(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File a = m19530a();
        if (!a.exists() && !a.mkdirs()) {
            return null;
        }
        final String a2 = C2240a.m6773a(Locale.US, "lib%s.so", new Object[]{str});
        File[] listFiles = externalStorageDirectory.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.equals(a2);
            }
        });
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        File file = new File(a, a2);
        try {
            C9752b.m19527a(listFiles[0], file);
            return file.getPath();
        } catch (IOException unused) {
            return null;
        }
    }
}
