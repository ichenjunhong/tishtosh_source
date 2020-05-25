package com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c */
public final class C26780c {

    /* renamed from: a */
    public final Context f70542a;

    /* renamed from: b */
    public final AwemeRawAd f70543b;

    /* renamed from: c */
    public final int f70544c;

    /* renamed from: d */
    public final int f70545d;

    /* renamed from: e */
    public final String f70546e;

    /* renamed from: f */
    public final String f70547f;

    /* renamed from: g */
    public final boolean f70548g;

    /* renamed from: h */
    public final String f70549h;

    /* renamed from: i */
    public final Aweme f70550i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a */
    public static final class C26781a {

        /* renamed from: a */
        public Context f70551a;

        /* renamed from: b */
        public AwemeRawAd f70552b;

        /* renamed from: c */
        public int f70553c = 2;

        /* renamed from: d */
        public int f70554d;

        /* renamed from: e */
        public String f70555e;

        /* renamed from: f */
        public String f70556f;

        /* renamed from: g */
        public boolean f70557g;

        /* renamed from: h */
        public String f70558h = "";

        /* renamed from: a */
        public final C26780c mo54672a() {
            C26780c cVar = new C26780c(this.f70551a, this.f70552b, this.f70553c, this.f70554d, this.f70555e, this.f70556f, this.f70557g, this.f70558h, null, UnReadVideoExperiment.BROWSE_RECORD_LIST, null);
            return cVar;
        }

        /* renamed from: a */
        public final C26781a mo54667a(int i) {
            C26781a aVar = this;
            aVar.f70554d = i;
            return aVar;
        }

        /* renamed from: a */
        public final C26781a mo54668a(Context context) {
            C26781a aVar = this;
            aVar.f70551a = context;
            return aVar;
        }

        /* renamed from: a */
        public final C26781a mo54669a(AwemeRawAd awemeRawAd) {
            C26781a aVar = this;
            aVar.f70552b = awemeRawAd;
            return aVar;
        }

        /* renamed from: a */
        public final C26781a mo54670a(String str) {
            C52711k.m112240b(str, "awemeId");
            C26781a aVar = this;
            aVar.f70558h = str;
            return aVar;
        }

        /* renamed from: a */
        public final C26781a mo54671a(boolean z) {
            C26781a aVar = this;
            aVar.f70557g = true;
            return aVar;
        }
    }

    private C26780c(Context context, AwemeRawAd awemeRawAd, int i, int i2, String str, String str2, boolean z, String str3, Aweme aweme) {
        this.f70542a = context;
        this.f70543b = awemeRawAd;
        this.f70544c = i;
        this.f70545d = i2;
        this.f70546e = str;
        this.f70547f = str2;
        this.f70548g = z;
        this.f70549h = str3;
        this.f70550i = aweme;
    }

    public /* synthetic */ C26780c(Context context, AwemeRawAd awemeRawAd, int i, int i2, String str, String str2, boolean z, String str3, Aweme aweme, int i3, C52707g gVar) {
        this(context, awemeRawAd, i, i2, str, str2, z, str3, null);
    }
}
