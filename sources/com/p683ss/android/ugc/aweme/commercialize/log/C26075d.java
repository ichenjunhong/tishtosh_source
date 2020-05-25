package com.p683ss.android.ugc.aweme.commercialize.log;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9425l;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.p1146d.C18894a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.d */
public final class C26075d {

    /* renamed from: a */
    private String f68852a;

    /* renamed from: b */
    private String f68853b;

    /* renamed from: c */
    private String f68854c;

    /* renamed from: d */
    private long f68855d;

    /* renamed from: e */
    private String f68856e;

    /* renamed from: f */
    private long f68857f;

    /* renamed from: g */
    private JSONObject f68858g;

    /* renamed from: h */
    private JSONObject f68859h;

    /* renamed from: i */
    private String f68860i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.d$a */
    public static class C26076a {

        /* renamed from: a */
        public String f68861a;

        /* renamed from: b */
        public String f68862b;

        /* renamed from: c */
        private String f68863c;

        /* renamed from: d */
        private String f68864d;

        /* renamed from: e */
        private String f68865e;

        /* renamed from: f */
        private long f68866f;

        /* renamed from: g */
        private long f68867g;

        /* renamed from: h */
        private JSONObject f68868h;

        /* renamed from: i */
        private JSONObject f68869i;

        /* renamed from: a */
        public final C26075d mo53566a() {
            if (TextUtils.isEmpty(this.f68861a)) {
                this.f68861a = "umeng";
            }
            C26075d dVar = new C26075d(this.f68861a, this.f68863c, this.f68864d, this.f68865e, this.f68866f, this.f68862b, this.f68867g, this.f68868h, this.f68869i);
            return dVar;
        }

        /* renamed from: a */
        public final C26076a mo53563a(long j) {
            this.f68866f = j;
            return this;
        }

        /* renamed from: b */
        public final C26076a mo53567b(long j) {
            this.f68867g = j;
            return this;
        }

        /* renamed from: a */
        public final C26076a mo53564a(String str) {
            this.f68863c = str;
            return this;
        }

        /* renamed from: b */
        public final C26076a mo53568b(String str) {
            this.f68864d = str;
            return this;
        }

        /* renamed from: a */
        public final C26076a mo53565a(JSONObject jSONObject) {
            this.f68869i = jSONObject;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo53562a() {
        Bundle bundle = new Bundle();
        bundle.putString("category", this.f68852a);
        bundle.putLong("nt", (long) C9425l.m18652c(C11010c.m22280a()).getValue());
        bundle.putString("tag", this.f68854c);
        bundle.putString("label", this.f68860i);
        bundle.putString("value", String.valueOf(this.f68855d));
        bundle.putString("log_extra", this.f68856e);
        bundle.putString("ext_value", String.valueOf(this.f68857f));
        bundle.putString("is_ad_event", "1");
        if (this.f68858g != null) {
            bundle.putString("ad_extra_data", String.valueOf(this.f68858g));
        }
        if (this.f68859h != null) {
            try {
                if (this.f68858g == null) {
                    Object opt = this.f68859h.opt("ad_extra_data");
                    if (opt != null) {
                        bundle.putString("ad_extra_data", opt.toString());
                    }
                }
                Iterator keys = this.f68859h.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    bundle.putString(str, this.f68859h.getString(str));
                }
            } catch (JSONException unused) {
            }
        }
        C18894a.m46005a(this.f68853b, bundle);
    }

    C26075d(String str, String str2, String str3, String str4, long j, String str5, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f68852a = str;
        this.f68853b = str2;
        this.f68854c = str3;
        this.f68860i = str4;
        this.f68855d = j;
        this.f68856e = str5;
        this.f68857f = j2;
        this.f68858g = jSONObject;
        this.f68859h = jSONObject2;
    }
}
