package com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p920d.C13696m;
import com.facebook.p987k.p988a.C14460b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a */
public abstract class C44410a {

    /* renamed from: d */
    public static final C44411a f112353d = new C44411a(null);

    /* renamed from: a */
    private long f112354a;

    /* renamed from: c */
    public final String f112355c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a$a */
    public static final class C44411a {
        private C44411a() {
        }

        public /* synthetic */ C44411a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public void mo89474a(int i, long j, long j2) {
    }

    /* renamed from: b */
    public abstract String mo90291b();

    /* renamed from: a */
    public final void mo90290a() {
        this.f112354a = System.currentTimeMillis();
    }

    public C44410a(String str) {
        this.f112355c = str;
    }

    /* renamed from: a */
    public void mo89476a(String str, String str2) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "fullFilePath");
        if (C44412b.m97219a(C11010c.m22280a())) {
            C23131p.m57776a("aweme_download_error_rate", 0, new C23088c().mo47823a("duration", Long.valueOf(System.currentTimeMillis() - this.f112354a)).mo47819a("tools_use_downloader", Boolean.valueOf(true)).mo47824a("from", this.f112355c).mo47824a("url", mo90291b()).mo47824a("cur_url", str).mo47825b());
        }
    }

    /* renamed from: a */
    public void mo89475a(Exception exc, String str, Integer num) {
        int i;
        String str2;
        if (C44412b.m97219a(C11010c.m22280a())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", mo90291b());
                jSONObject.put("from", this.f112355c);
                jSONObject.put("tools_use_downloader", true);
                String str3 = "exception";
                if (exc == null) {
                    str2 = "null exception";
                } else {
                    str2 = C13696m.m27668c(exc);
                }
                jSONObject.put(str3, str2);
            } catch (JSONException unused) {
            }
            C23131p.m57776a("aweme_download_error_rate", 1, jSONObject);
        }
        String str4 = "aweme_movie_download_log";
        String str5 = "";
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        String b = mo90291b();
        String str6 = this.f112355c;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("netWorkQuality", C14460b.m29586a().mo26625b().toString());
            jSONObject2.put("netWorkSpeed", (int) C14460b.m29586a().mo26626c());
            jSONObject2.put("errorDesc", str);
            jSONObject2.put("errorCode", String.valueOf(i));
            jSONObject2.put("errorUrl", b);
            jSONObject2.put("from", str6);
            C23131p.m56692a(str4, str5, jSONObject2);
        } catch (Exception unused2) {
        }
    }
}
