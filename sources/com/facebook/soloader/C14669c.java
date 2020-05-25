package com.facebook.soloader;

import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;

/* renamed from: com.facebook.soloader.c */
public class C14669c extends C14685j {

    /* renamed from: b */
    protected final File f38048b;

    /* renamed from: c */
    protected final int f38049c;

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f38048b.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f38048b.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.f38049c);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    private static String[] m30010a(File file) throws IOException {
        if (SoLoader.f38024a) {
            StringBuilder sb = new StringBuilder("SoLoader.getElfDependencies[");
            sb.append(file.getName());
            sb.append("]");
            Api18TraceUtils.m29990a(sb.toString());
        }
        try {
            return C14682h.m30027a(file);
        } finally {
            if (SoLoader.f38024a) {
                Api18TraceUtils.m29989a();
            }
        }
    }

    public C14669c(File file, int i) {
        this.f38048b = file;
        this.f38049c = i;
    }

    /* renamed from: a */
    public int mo26943a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        return mo26947a(str, i, this.f38048b, threadPolicy);
    }

    /* renamed from: a */
    private static void m30009a(File file, int i, ThreadPolicy threadPolicy) throws IOException {
        String[] a = m30010a(file);
        for (String str : a) {
            if (!str.startsWith("/")) {
                SoLoader.m29998a(str, null, null, i | 1, threadPolicy);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo26947a(String str, int i, File file, ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return 0;
        }
        if ((i & 1) != 0 && (this.f38049c & 2) != 0) {
            return 2;
        }
        if ((this.f38049c & 1) != 0) {
            m30009a(file2, i, threadPolicy);
        }
        try {
            SoLoader.f38025b.mo26939a(file2.getAbsolutePath(), i);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            if (e.getMessage().contains("bad ELF magic")) {
                return 3;
            }
            throw e;
        }
    }
}
