package com.bytedance.p513c;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* renamed from: com.bytedance.c.c */
public final class C9296c {

    /* renamed from: a */
    public C9299b f25425a;

    /* renamed from: b */
    public String f25426b;

    /* renamed from: c */
    public String f25427c;

    /* renamed from: d */
    public String f25428d;

    /* renamed from: e */
    public String f25429e;

    /* renamed from: f */
    public String f25430f;

    /* renamed from: g */
    public String f25431g;

    /* renamed from: h */
    public String f25432h;

    /* renamed from: i */
    public String f25433i;

    /* renamed from: j */
    public String f25434j;

    /* renamed from: k */
    public String f25435k;

    /* renamed from: l */
    public String f25436l;

    /* renamed from: m */
    public String f25437m;

    /* renamed from: n */
    public String f25438n;

    /* renamed from: o */
    public String f25439o;

    /* renamed from: p */
    public String f25440p;

    /* renamed from: q */
    public Context f25441q;

    /* renamed from: r */
    public boolean f25442r;

    /* renamed from: s */
    public String f25443s;

    /* renamed from: t */
    public String f25444t;

    /* renamed from: u */
    public String f25445u;

    /* renamed from: v */
    public int f25446v;

    /* renamed from: w */
    public String f25447w;

    /* renamed from: x */
    public boolean f25448x;

    /* renamed from: y */
    public String f25449y;

    /* renamed from: com.bytedance.c.c$a */
    public static class C9298a {

        /* renamed from: a */
        public C9299b f25450a = C9299b.REGION_CHINA;

        /* renamed from: b */
        public String f25451b;

        /* renamed from: c */
        public String f25452c;

        /* renamed from: d */
        public String f25453d;

        /* renamed from: e */
        public String f25454e;

        /* renamed from: f */
        public String f25455f = "";

        /* renamed from: g */
        public String f25456g;

        /* renamed from: h */
        public Context f25457h;

        /* renamed from: i */
        public boolean f25458i;

        /* renamed from: j */
        public String f25459j;

        /* renamed from: k */
        public String f25460k;

        /* renamed from: l */
        public String f25461l;

        /* renamed from: m */
        public String f25462m;

        /* renamed from: n */
        public String f25463n;

        /* renamed from: o */
        public String f25464o;

        /* renamed from: p */
        public boolean f25465p = true;

        /* renamed from: a */
        public final C9298a mo16896a(C9299b bVar) {
            this.f25450a = bVar;
            return this;
        }

        /* renamed from: b */
        public final C9298a mo16899b(String str) {
            this.f25453d = str;
            return this;
        }

        /* renamed from: c */
        public final C9298a mo16900c(String str) {
            this.f25456g = str;
            return this;
        }

        /* renamed from: d */
        public final C9298a mo16901d(String str) {
            this.f25452c = str;
            return this;
        }

        /* renamed from: e */
        public final C9298a mo16902e(String str) {
            this.f25454e = str;
            return this;
        }

        /* renamed from: a */
        public final C9298a mo16897a(String str) {
            this.f25451b = str;
            return this;
        }

        /* renamed from: a */
        public final C9296c mo16898a(Context context) {
            this.f25457h = context;
            return new C9296c(this);
        }
    }

    /* renamed from: com.bytedance.c.c$b */
    public enum C9299b {
        REGION_CHINA("cn"),
        REGION_SINGAPOER("sg"),
        REGION_USA_EAST("va");
        

        /* renamed from: a */
        private String f25467a;

        public final String getName() {
            return this.f25467a;
        }

        private C9299b(String str) {
            this.f25467a = str;
        }
    }

    /* renamed from: a */
    public final C9296c mo16889a(int i) {
        this.f25446v = i;
        return this;
    }

    /* renamed from: b */
    public final C9296c mo16892b(String str) {
        this.f25436l = str;
        return this;
    }

    /* renamed from: c */
    public final C9296c mo16893c(String str) {
        this.f25439o = str;
        return this;
    }

    /* renamed from: d */
    public final C9296c mo16894d(String str) {
        this.f25440p = str;
        return this;
    }

    /* renamed from: e */
    public final C9296c mo16895e(String str) {
        this.f25427c = str;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C9296c mo16890a(C9299b bVar) {
        this.f25425a = bVar;
        return this;
    }

    /* renamed from: a */
    public final C9296c mo16891a(String str) {
        this.f25432h = str;
        return this;
    }

    private C9296c(C9298a aVar) {
        this.f25430f = "1.2.1";
        this.f25434j = "Android";
        StringBuilder sb = new StringBuilder();
        sb.append(VERSION.SDK_INT);
        this.f25435k = sb.toString();
        this.f25437m = Build.BRAND;
        this.f25438n = Build.MODEL;
        this.f25449y = null;
        this.f25425a = aVar.f25450a;
        this.f25426b = aVar.f25451b;
        this.f25427c = aVar.f25452c;
        this.f25428d = aVar.f25453d;
        this.f25429e = aVar.f25454e;
        this.f25431g = aVar.f25455f;
        this.f25433i = aVar.f25456g;
        this.f25445u = Locale.getDefault().toString();
        if (this.f25445u != null) {
            String[] split = this.f25445u.split("_");
            if (split != null && split.length > 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(split[0]);
                sb2.append("_");
                sb2.append(split[1]);
                this.f25445u = sb2.toString();
            }
        }
        try {
            this.f25437m = URLEncoder.encode(Build.BRAND, "utf-8");
            this.f25438n = URLEncoder.encode(Build.MODEL, "utf-8");
        } catch (UnsupportedEncodingException unused) {
        }
        this.f25447w = aVar.f25464o;
        this.f25432h = aVar.f25460k;
        this.f25436l = aVar.f25461l;
        this.f25439o = aVar.f25462m;
        this.f25440p = aVar.f25463n;
        this.f25441q = aVar.f25457h;
        this.f25442r = aVar.f25458i;
        this.f25443s = aVar.f25459j;
        this.f25448x = aVar.f25465p;
    }
}
