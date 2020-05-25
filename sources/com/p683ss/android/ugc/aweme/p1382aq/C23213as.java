package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.p1766e.C31874a;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.aq.as */
public final class C23213as extends C23241k<C23213as> {

    /* renamed from: O */
    private String f61794O;

    /* renamed from: P */
    private String f61795P;

    /* renamed from: Q */
    private String f61796Q;

    /* renamed from: R */
    private String f61797R;

    /* renamed from: a */
    public String f61798a;

    /* renamed from: b */
    public String f61799b;

    /* renamed from: c */
    private String f61800c;

    /* renamed from: d */
    private String f61801d;

    /* renamed from: e */
    private Aweme f61802e;

    /* renamed from: com.ss.android.ugc.aweme.aq.as$a */
    public static class C23214a {

        /* renamed from: a */
        public String f61803a;

        /* renamed from: b */
        public String f61804b;

        /* renamed from: c */
        public String f61805c;

        /* renamed from: d */
        public String f61806d;

        /* renamed from: e */
        public String f61807e;

        /* renamed from: f */
        public String f61808f;

        public C23214a() {
        }

        public C23214a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f61803a = str;
            this.f61804b = str2;
            this.f61805c = str3;
            this.f61806d = str4;
            this.f61807e = str6;
            this.f61808f = str5;
        }
    }

    public C23213as() {
        super("stay_time");
        this.f62001w = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        mo48072a("duration", this.f61800c, C23232a.f62005a);
        mo48072a("enter_from", this.f61985g, C23232a.f62005a);
        mo48072a("group_id", this.f61794O, C23232a.f62005a);
        mo48072a("author_id", C23198ae.m56846a(this.f61802e), C23232a.f62005a);
        mo48072a("city_info", C23198ae.m56845a(), C23232a.f62005a);
        mo48072a("page_uid", this.f61797R, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61796Q)) {
            mo48072a("previous_page", this.f61796Q, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61801d)) {
            mo48072a("page_type", this.f61801d, C23232a.f62005a);
        }
        if (TextUtils.equals(this.f61796Q, "homepage_hot") || TextUtils.equals(this.f61796Q, "homepage_follow")) {
            boolean z = !TextUtils.equals(this.f61796Q, "homepage_hot");
            mo48072a("feeds_group_id", this.f61795P, C23232a.f62005a);
            mo48072a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56850a(this.f61795P, z ? 1 : 0)), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61987i)) {
            mo48072a("poi_id", this.f61987i, C23232a.f62005a);
            if (!TextUtils.isEmpty(this.f61988j)) {
                mo48072a("poi_type", this.f61988j, C23232a.f62005a);
            }
        }
        if (C23198ae.m56862e(this.f61985g)) {
            mo48069a("notice_type", C31874a.m74294a());
            mo48069a("show_cnt", String.valueOf(C31874a.m74295b()));
            mo48069a("yellow_dot_logid", C31874a.m74296c());
        }
        if (C23198ae.m56866g(this.f61985g)) {
            String str = this.f61798a;
            String str2 = this.f61799b;
            mo48069a("process_id", str);
            mo48069a("tag_id", str2);
        }
    }

    public C23213as(String str) {
        super(str);
    }

    /* renamed from: a */
    public final C23213as mo48005a(String str) {
        this.f61800c = str;
        return this;
    }

    /* renamed from: b */
    public final C23213as mo48006b(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: c */
    public final C23213as mo48007c(String str) {
        this.f61796Q = str;
        return this;
    }

    /* renamed from: d */
    public final C23213as mo48008d(String str) {
        this.f61801d = str;
        return this;
    }

    /* renamed from: e */
    public final C23213as mo48010e(String str) {
        this.f61987i = str;
        return this;
    }

    /* renamed from: f */
    public final C23213as mo48011f(String str) {
        this.f61988j = str;
        return this;
    }

    /* renamed from: g */
    public final C23213as mo48012g(String str) {
        this.f61794O = str;
        return this;
    }

    /* renamed from: h */
    public final C23213as mo48013h(String str) {
        this.f61795P = str;
        return this;
    }

    /* renamed from: s */
    public final C23213as mo48014s(String str) {
        this.f61797R = str;
        return this;
    }

    /* renamed from: e */
    public final C23213as mo47954f(Aweme aweme) {
        super.mo47954f(aweme);
        this.f61802e = aweme;
        this.f61794O = C23198ae.m56877m(aweme);
        return this;
    }

    /* renamed from: a */
    public final C23213as mo48004a(PoiStruct poiStruct) {
        if (poiStruct != null) {
            this.f61987i = poiStruct.getPoiId();
            this.f61988j = poiStruct.getTypeCode();
            this.f61991m = poiStruct.getBackendTypeCode();
            this.f61992n = poiStruct.getCityCode();
            this.f61989k = C23198ae.m56852b();
        }
        return this;
    }

    /* renamed from: a */
    public final C23213as mo48003a(C23214a aVar) {
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f61803a)) {
                this.f61987i = aVar.f61803a;
            }
            if (!TextUtils.isEmpty(aVar.f61804b)) {
                this.f61988j = aVar.f61804b;
            }
            if (!TextUtils.isEmpty(aVar.f61805c)) {
                this.f61801d = aVar.f61805c;
            }
            if (!TextUtils.isEmpty(aVar.f61806d)) {
                this.f61794O = aVar.f61806d;
            }
            if (!TextUtils.isEmpty(aVar.f61808f)) {
                this.f61991m = aVar.f61808f;
            }
            if (!TextUtils.isEmpty(aVar.f61807e)) {
                this.f61992n = aVar.f61807e;
            }
        }
        return this;
    }
}
