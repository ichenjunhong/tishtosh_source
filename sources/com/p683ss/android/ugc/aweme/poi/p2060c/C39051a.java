package com.p683ss.android.ugc.aweme.poi.p2060c;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.c.a */
public final class C39051a {

    /* renamed from: a */
    public String f99550a;

    /* renamed from: b */
    public String f99551b;

    /* renamed from: c */
    public String f99552c;

    /* renamed from: d */
    public String f99553d;

    /* renamed from: e */
    public String f99554e;

    /* renamed from: f */
    public String f99555f;

    /* renamed from: g */
    public String f99556g;

    /* renamed from: h */
    public String f99557h;

    /* renamed from: i */
    public String f99558i;

    /* renamed from: j */
    public String f99559j;

    /* renamed from: k */
    public String f99560k;

    /* renamed from: l */
    public String f99561l;

    /* renamed from: m */
    public String f99562m = "";

    /* renamed from: n */
    public String f99563n = "";

    /* renamed from: o */
    public String f99564o = "";

    /* renamed from: p */
    public String f99565p = "";

    /* renamed from: q */
    public String f99566q = "";

    /* renamed from: r */
    public String f99567r = "";

    /* renamed from: s */
    public String f99568s = "";

    /* renamed from: t */
    public String f99569t = "";

    /* renamed from: u */
    public String f99570u = "";

    /* renamed from: v */
    public String f99571v = "";

    /* renamed from: com.ss.android.ugc.aweme.poi.c.a$a */
    public static final class C39052a {

        /* renamed from: a */
        public String f99572a = "";

        /* renamed from: b */
        public String f99573b = "";

        /* renamed from: c */
        public String f99574c = "";

        /* renamed from: d */
        public String f99575d = "";

        /* renamed from: e */
        public String f99576e = "";

        /* renamed from: f */
        public String f99577f = "";

        /* renamed from: g */
        public String f99578g = "";

        /* renamed from: h */
        public String f99579h = "";

        /* renamed from: i */
        public String f99580i = "";

        /* renamed from: j */
        public String f99581j = "";

        /* renamed from: k */
        public String f99582k = "";

        /* renamed from: l */
        public String f99583l = "";

        /* renamed from: m */
        public String f99584m = "";

        /* renamed from: n */
        public String f99585n = "";

        /* renamed from: o */
        public String f99586o = "";

        /* renamed from: p */
        public String f99587p = "";

        /* renamed from: q */
        public String f99588q = "";

        /* renamed from: r */
        public String f99589r = "";

        /* renamed from: s */
        public String f99590s = "";

        /* renamed from: t */
        public String f99591t = "";

        /* renamed from: u */
        public String f99592u = "";

        /* renamed from: v */
        public String f99593v = "";

        /* renamed from: a */
        public final C39051a mo79209a() {
            return new C39051a(this);
        }

        /* renamed from: a */
        public final C39052a mo79208a(String str) {
            this.f99572a = str;
            return this;
        }

        /* renamed from: b */
        public final C39052a mo79210b(String str) {
            this.f99573b = str;
            return this;
        }

        /* renamed from: c */
        public final C39052a mo79211c(String str) {
            this.f99574c = str;
            return this;
        }

        /* renamed from: d */
        public final C39052a mo79212d(String str) {
            this.f99575d = str;
            return this;
        }

        /* renamed from: e */
        public final C39052a mo79213e(String str) {
            this.f99576e = str;
            return this;
        }

        /* renamed from: f */
        public final C39052a mo79214f(String str) {
            this.f99577f = str;
            return this;
        }

        /* renamed from: g */
        public final C39052a mo79215g(String str) {
            this.f99578g = str;
            return this;
        }

        /* renamed from: h */
        public final C39052a mo79216h(String str) {
            this.f99579h = str;
            return this;
        }

        /* renamed from: i */
        public final C39052a mo79217i(String str) {
            this.f99581j = str;
            return this;
        }

        /* renamed from: j */
        public final C39052a mo79218j(String str) {
            this.f99583l = str;
            return this;
        }

        /* renamed from: a */
        public final C39052a mo79206a(C39067g gVar) {
            if (gVar != null) {
                this.f99589r = gVar.getBackendType();
                this.f99590s = gVar.getPoiCity();
            }
            return this;
        }

        /* renamed from: a */
        public final C39052a mo79207a(PoiStruct poiStruct) {
            if (poiStruct != null) {
                this.f99589r = poiStruct.getBackendTypeCode();
                if (!TextUtils.isEmpty(poiStruct.getCityCode())) {
                    this.f99590s = poiStruct.getCityCode();
                }
            }
            return this;
        }
    }

    public C39051a(C39052a aVar) {
        C52711k.m112240b(aVar, "builder");
        this.f99550a = aVar.f99572a;
        this.f99551b = aVar.f99573b;
        this.f99552c = aVar.f99574c;
        this.f99553d = aVar.f99575d;
        this.f99554e = aVar.f99576e;
        this.f99555f = aVar.f99577f;
        this.f99556g = aVar.f99578g;
        this.f99557h = aVar.f99579h;
        this.f99558i = aVar.f99580i;
        this.f99559j = aVar.f99581j;
        this.f99560k = aVar.f99582k;
        this.f99561l = aVar.f99583l;
        this.f99562m = aVar.f99584m;
        this.f99567r = aVar.f99589r;
        this.f99568s = aVar.f99590s;
        this.f99563n = aVar.f99585n;
        this.f99564o = aVar.f99586o;
        this.f99565p = aVar.f99587p;
        this.f99566q = aVar.f99588q;
        this.f99569t = aVar.f99591t;
        this.f99570u = aVar.f99592u;
        this.f99571v = aVar.f99593v;
    }
}
