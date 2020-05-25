package com.aweme.storage;

import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* renamed from: com.aweme.storage.o */
public final class C2576o {

    /* renamed from: a */
    public String f7977a;

    /* renamed from: b */
    public String f7978b;

    /* renamed from: c */
    public long f7979c;

    /* renamed from: d */
    public List<C2577a> f7980d;

    /* renamed from: com.aweme.storage.o$a */
    public static class C2577a {

        /* renamed from: a */
        public String f7981a;

        /* renamed from: b */
        public String f7982b;

        /* renamed from: c */
        public long f7983c;

        /* renamed from: d */
        public File f7984d;

        /* renamed from: a */
        public final void mo7082a(String str) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f7981a)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(this.f7981a);
                String sb2 = sb.toString();
                this.f7984d = new File(sb2);
                if (this.f7984d.exists()) {
                    this.f7983c = C2562f.m7492a(sb2);
                }
            }
        }

        public C2577a(String str, String str2) {
            this.f7982b = str2;
            this.f7981a = str;
        }
    }

    /* renamed from: a */
    public final void mo7081a() {
        if (!TextUtils.isEmpty(this.f7977a) && this.f7980d != null && !this.f7980d.isEmpty()) {
            for (C2577a aVar : this.f7980d) {
                if (aVar != null) {
                    aVar.mo7082a(this.f7977a);
                }
            }
            this.f7979c = C2562f.m7492a(this.f7977a);
        }
    }

    public C2576o(String str, String str2) {
        this.f7978b = str;
        this.f7977a = str2;
    }

    public C2576o(String str, String str2, List<C2577a> list) {
        this.f7978b = str;
        this.f7977a = str2;
        this.f7980d = list;
    }
}
