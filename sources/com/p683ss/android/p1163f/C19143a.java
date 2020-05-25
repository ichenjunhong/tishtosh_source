package com.p683ss.android.p1163f;

import android.text.TextUtils;
import com.p683ss.android.common.applog.UrlConfig;

/* renamed from: com.ss.android.f.a */
public final class C19143a {

    /* renamed from: a */
    public String f52743a = "";

    /* renamed from: b */
    public String f52744b = "";

    /* renamed from: c */
    public C19144a f52745c = C19144a.DEBUG;

    /* renamed from: d */
    public String f52746d = "";

    /* renamed from: e */
    public String f52747e = "";

    /* renamed from: f */
    public String f52748f = "";

    /* renamed from: g */
    public int f52749g;

    /* renamed from: h */
    public int f52750h;

    /* renamed from: i */
    public UrlConfig f52751i;

    /* renamed from: j */
    public String f52752j = "";

    /* renamed from: com.ss.android.f.a$a */
    public enum C19144a {
        RELEASE,
        DEBUG
    }

    /* renamed from: com.ss.android.f.a$b */
    public static class C19145b {

        /* renamed from: a */
        private String f52754a;

        /* renamed from: b */
        private String f52755b;

        /* renamed from: c */
        private C19144a f52756c;

        /* renamed from: d */
        private String f52757d;

        /* renamed from: e */
        private String f52758e;

        /* renamed from: f */
        private String f52759f;

        /* renamed from: g */
        private String f52760g;

        /* renamed from: h */
        private int f52761h;

        /* renamed from: i */
        private int f52762i;

        /* renamed from: j */
        private UrlConfig f52763j;

        /* renamed from: a */
        public final C19143a mo39089a() {
            C19143a aVar = new C19143a();
            if (!TextUtils.isEmpty(this.f52754a)) {
                aVar.f52743a = this.f52754a;
            }
            if (!TextUtils.isEmpty(this.f52755b)) {
                aVar.f52744b = this.f52755b;
            }
            if (this.f52756c != null) {
                aVar.f52745c = this.f52756c;
            }
            if (!TextUtils.isEmpty(this.f52757d)) {
                aVar.f52746d = this.f52757d;
            }
            if (!TextUtils.isEmpty(this.f52758e)) {
                aVar.f52747e = this.f52758e;
            }
            if (!TextUtils.isEmpty(this.f52759f)) {
                aVar.f52752j = this.f52759f;
            }
            if (!TextUtils.isEmpty(this.f52760g)) {
                aVar.f52748f = this.f52760g;
            }
            if (this.f52761h != 0) {
                aVar.f52749g = this.f52761h;
            }
            if (this.f52763j == null) {
                this.f52763j = UrlConfig.CHINA;
            }
            aVar.f52751i = this.f52763j;
            aVar.f52750h = this.f52762i;
            return aVar;
        }

        /* renamed from: a */
        public final C19145b mo39085a(int i) {
            this.f52761h = i;
            return this;
        }

        /* renamed from: b */
        public final C19145b mo39090b(int i) {
            this.f52762i = i;
            return this;
        }

        /* renamed from: c */
        public final C19145b mo39092c(String str) {
            this.f52760g = str;
            return this;
        }

        /* renamed from: a */
        public final C19145b mo39086a(C19144a aVar) {
            this.f52756c = aVar;
            return this;
        }

        /* renamed from: b */
        public final C19145b mo39091b(String str) {
            this.f52758e = str;
            return this;
        }

        /* renamed from: a */
        public final C19145b mo39087a(String str) {
            this.f52757d = str;
            return this;
        }

        /* renamed from: a */
        public final C19145b mo39088a(String str, String str2) {
            this.f52754a = str;
            this.f52755b = str2;
            return this;
        }
    }
}
