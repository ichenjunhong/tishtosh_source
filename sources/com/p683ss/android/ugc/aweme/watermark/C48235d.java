package com.p683ss.android.ugc.aweme.watermark;

import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.watermark.d */
public final class C48235d {

    /* renamed from: a */
    public final int f121381a;

    /* renamed from: b */
    public final String f121382b;

    /* renamed from: com.ss.android.ugc.aweme.watermark.d$a */
    public static final class C48236a {

        /* renamed from: a */
        private int f121383a = R.drawable.awc;

        /* renamed from: b */
        private String f121384b;

        /* renamed from: a */
        public final C48235d mo95728a() {
            return new C48235d(this.f121383a, this.f121384b);
        }

        /* renamed from: a */
        public final C48236a mo95727a(String str) {
            C52711k.m112240b(str, "waterPicDir");
            C48236a aVar = this;
            aVar.f121384b = str;
            return aVar;
        }
    }

    public C48235d(int i, String str) {
        this.f121381a = i;
        this.f121382b = str;
    }
}
