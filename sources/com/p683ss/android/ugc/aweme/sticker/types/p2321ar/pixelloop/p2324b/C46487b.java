package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b;

import android.text.TextUtils;
import com.p683ss.android.ugc.tools.utils.C50201e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b */
public final class C46487b {

    /* renamed from: j */
    public static final C46488a f117303j = new C46488a(null);

    /* renamed from: a */
    public String f117304a;

    /* renamed from: b */
    public String f117305b;

    /* renamed from: c */
    public boolean f117306c;

    /* renamed from: d */
    public String f117307d;

    /* renamed from: e */
    public Boolean f117308e = Boolean.valueOf(true);

    /* renamed from: f */
    public Boolean f117309f = Boolean.valueOf(true);

    /* renamed from: g */
    public C46485a f117310g = new C46485a();

    /* renamed from: h */
    public long f117311h;

    /* renamed from: i */
    public int f117312i = 1;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b$a */
    public static final class C46488a {
        private C46488a() {
        }

        public /* synthetic */ C46488a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final List<String> mo93233b() {
        return this.f117310g.f117300a;
    }

    /* renamed from: c */
    public final String mo93234c() {
        return this.f117310g.f117301b;
    }

    /* renamed from: a */
    public final boolean mo93232a() {
        if (!C50201e.m108355a(this.f117310g.f117300a)) {
            return true;
        }
        return false;
    }

    public C46487b() {
    }

    /* renamed from: a */
    public final C46487b mo93231a(String str) {
        C52711k.m112240b(str, "sdkExtra");
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("pl");
            if (optJSONObject != null) {
                this.f117308e = Boolean.valueOf(optJSONObject.optBoolean("guide", true));
                this.f117309f = Boolean.valueOf(optJSONObject.optBoolean("loading", true));
                this.f117310g.f117301b = optJSONObject.optString("imgK");
                this.f117310g.f117302c = optJSONObject.optString("relation");
                JSONArray optJSONArray = optJSONObject.optJSONArray("alg");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = optJSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            List<String> list = this.f117310g.f117300a;
                            C52711k.m112236a((Object) string, "str");
                            list.add(string);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public C46487b(String str, long j) {
        C52711k.m112240b(str, "imgPath");
        this.f117304a = str;
        this.f117311h = j;
    }

    public C46487b(String str, String str2, boolean z) {
        C52711k.m112240b(str, "imgPath");
        C52711k.m112240b(str2, "algorithmName");
        this.f117304a = str;
        this.f117305b = str2;
        this.f117306c = z;
    }
}
