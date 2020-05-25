package com.p683ss.android.ugc.effectmanager.common.p2434b;

import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.regex.Pattern;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.b */
public class C48618b implements C48620c {

    /* renamed from: a */
    public String f122250a;

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.b$a */
    static final class C48619a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f122251a;

        /* renamed from: b */
        final /* synthetic */ C48618b f122252b;

        C48619a(Pattern pattern, C48618b bVar) {
            this.f122251a = pattern;
            this.f122252b = bVar;
        }

        public final boolean accept(File file, String str) {
            return this.f122251a.matcher(str).matches();
        }
    }

    public C48618b(String str) {
        C52711k.m112240b(str, "cacheDir");
        this.f122250a = str;
    }

    /* renamed from: d */
    public boolean mo96155d(String str) {
        C52711k.m112240b(str, "key");
        return C48671i.m105324a(m105213e(str));
    }

    /* renamed from: e */
    private final String m105213e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122250a);
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final InputStream mo96152b(String str) {
        InputStream d;
        C52711k.m112240b(str, "key");
        String e = m105213e(str);
        synchronized (C48618b.class) {
            d = C48671i.f122310a.mo96263d(e);
        }
        return d;
    }

    /* renamed from: c */
    public boolean mo96153c(String str) {
        boolean b;
        C52711k.m112240b(str, "key");
        synchronized (C48618b.class) {
            b = C48671i.f122310a.mo96260b(m105213e(str));
        }
        return b;
    }

    /* renamed from: a */
    public final void mo96151a(Pattern pattern) {
        if (pattern != null) {
            synchronized (C48618b.class) {
                File[] listFiles = new File(this.f122250a).listFiles(new C48619a(pattern, this));
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            }
        }
    }

    /* renamed from: c_ */
    public String mo96154c_(String str) {
        String c;
        C52711k.m112240b(str, "key");
        String e = m105213e(str);
        synchronized (C48618b.class) {
            c = C48671i.f122310a.mo96262c(e);
            if (TextUtils.isEmpty(c)) {
                c = "";
            }
        }
        return c;
    }

    /* renamed from: a */
    public long mo96148a(String str, String str2) {
        long a;
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        synchronized (C48618b.class) {
            a = C48671i.m105320a(str2, m105213e(str));
        }
        return a;
    }
}
