package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.au */
public abstract class C26055au {

    /* renamed from: a */
    public boolean f68811a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.au$a */
    public static final class C26056a {

        /* renamed from: a */
        public Context f68812a;

        /* renamed from: b */
        public String f68813b;

        /* renamed from: c */
        public String f68814c;

        /* renamed from: d */
        public String f68815d;

        /* renamed from: e */
        public long f68816e;

        /* renamed from: f */
        public JSONObject f68817f;

        public C26056a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
            this.f68812a = context;
            this.f68813b = str;
            this.f68814c = str2;
            this.f68815d = str3;
            this.f68816e = j;
            this.f68817f = jSONObject;
        }
    }

    /* renamed from: a */
    public abstract boolean mo53542a(C26056a aVar);

    /* renamed from: b */
    public abstract boolean mo53543b(C26056a aVar);

    /* renamed from: c */
    public final boolean mo53544c(C26056a aVar) {
        C52711k.m112240b(aVar, "params");
        if (!this.f68811a || !mo53542a(aVar) || !mo53543b(aVar)) {
            return false;
        }
        return true;
    }
}
