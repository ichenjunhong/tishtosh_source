package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.C25829f;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.e */
public class C26077e {

    /* renamed from: a */
    private static C26080b f68870a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.e$a */
    public static class C26079a {

        /* renamed from: a */
        public JSONObject f68871a;

        private C26079a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo53569a() {
            this.f68871a = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final JSONObject mo53572b() {
            if (this.f68871a == null) {
                this.f68871a = new JSONObject();
            }
            return this.f68871a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo53570a(String str, long j) {
            try {
                mo53572b().put(str, j);
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo53571a(String str, Object obj) {
            try {
                mo53572b().put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.e$b */
    public static class C26080b {

        /* renamed from: a */
        public final C26079a f68872a = new C26079a();

        /* renamed from: b */
        private String f68873b;

        /* renamed from: c */
        private String f68874c;

        /* renamed from: d */
        private String f68875d;

        /* renamed from: e */
        private String f68876e;

        /* renamed from: f */
        private String f68877f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo53585a() {
            this.f68873b = null;
            this.f68874c = null;
            this.f68875d = null;
            this.f68876e = null;
            this.f68872a.mo53569a();
        }

        /* renamed from: a */
        public final C26080b mo53584a(boolean z) {
            try {
                this.f68872a.mo53572b().put("is_i18n_sdk", 1);
            } catch (JSONException unused) {
            }
            this.f68872a.mo53571a("value", (Object) "1590015508824073");
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53583a(JSONObject jSONObject) {
            this.f68872a.mo53571a("ad_extra_data", (Object) jSONObject);
            return this;
        }

        /* renamed from: a */
        public final void mo53586a(Context context) {
            if (context == null) {
                context = C11010c.m22280a();
            }
            Context context2 = context;
            m63197b(context2);
            C25945k.m62911b().mo53127a(context2, this.f68873b, this.f68874c, this.f68872a.f68871a, (this.f68875d == null || !this.f68875d.matches("[+-]?\\d+")) ? "0" : this.f68875d, m63199e());
            C26077e.m63192a(this);
        }

        /* renamed from: d */
        public final void mo53599d() {
            m63198c((Context) null);
        }

        /* renamed from: e */
        private long m63199e() {
            try {
                if (this.f68876e != null) {
                    return Long.parseLong(this.f68876e);
                }
                return 0;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        /* renamed from: b */
        public final C26080b mo53587b() {
            this.f68872a.mo53571a("ad_event_type", (Object) "debug");
            return this;
        }

        /* renamed from: c */
        public final void mo53597c() {
            mo53586a((Context) null);
        }

        /* renamed from: a */
        public final C26080b mo53582a(String str) {
            this.f68873b = str;
            return this;
        }

        /* renamed from: b */
        public final C26080b mo53593b(String str) {
            this.f68874c = str;
            return this;
        }

        /* renamed from: c */
        public final C26080b mo53596c(String str) {
            this.f68875d = str;
            return this;
        }

        /* renamed from: d */
        public final C26080b mo53598d(String str) {
            this.f68876e = str;
            return this;
        }

        /* renamed from: j */
        public final C26080b mo53605j(String str) {
            this.f68877f = str;
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53573a(long j) {
            this.f68872a.mo53570a("duration", j);
            return this;
        }

        /* renamed from: b */
        public final C26080b mo53588b(long j) {
            this.f68872a.mo53570a("video_length", j);
            return this;
        }

        /* renamed from: c */
        public final C26080b mo53595c(Long l) {
            this.f68872a.mo53571a("ad_id", (Object) l);
            return this;
        }

        /* renamed from: h */
        public final C26080b mo53603h(String str) {
            this.f68872a.mo53571a("track_label", (Object) str);
            return this;
        }

        /* renamed from: i */
        public final C26080b mo53604i(String str) {
            this.f68872a.mo53571a("log_extra", (Object) str);
            return this;
        }

        /* renamed from: k */
        public final C26080b mo53606k(String str) {
            this.f68872a.mo53571a("_ad_staging_flag", (Object) str);
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53580a(Long l) {
            String str;
            if (l == null) {
                str = null;
            } else {
                str = l.toString();
            }
            this.f68875d = str;
            return this;
        }

        /* renamed from: f */
        public final C26080b mo53601f(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f68872a.mo53571a("tag_id", (Object) str);
            }
            return this;
        }

        /* renamed from: g */
        public final C26080b mo53602g(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f68872a.mo53571a("refer", (Object) str);
            }
            return this;
        }

        /* renamed from: b */
        private void m63197b(Context context) {
            this.f68872a.mo53571a("is_ad_event", (Object) "1");
            String e = C9425l.m18654e(context);
            if (!C9431p.m18664a(e)) {
                this.f68872a.mo53571a("nt", (Object) e);
            }
        }

        /* renamed from: e */
        public final C26080b mo53600e(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f68872a.mo53571a("prop_id", (Object) str);
            }
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53575a(C26110ae aeVar) {
            if (aeVar != null) {
                mo53580a(Long.valueOf(aeVar.f68945id));
                mo53604i(aeVar.logExtra);
                this.f68872a.mo53570a("ad_id", aeVar.adId);
            }
            return this;
        }

        /* renamed from: b */
        public final C26080b mo53589b(C26138s sVar) {
            if (sVar != null) {
                mo53596c(sVar.creativeId);
                mo53604i(sVar.logExtra);
            }
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53576a(C26138s sVar) {
            String str;
            String str2;
            if (sVar != null) {
                if (sVar.creativeId == null) {
                    str = "";
                } else {
                    str = sVar.creativeId;
                }
                mo53596c(str);
                if (sVar.logExtra == null) {
                    str2 = "";
                } else {
                    str2 = sVar.logExtra;
                }
                mo53604i(str2);
                this.f68872a.mo53570a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: b */
        public final C26080b mo53590b(Aweme aweme) {
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                mo53591b(aweme.getAwemeRawAd());
            }
            return this;
        }

        /* renamed from: c */
        private void m63198c(Context context) {
            m63197b(C11010c.m22280a());
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("category", "umeng");
                if (!TextUtils.isEmpty(this.f68873b)) {
                    hashMap.put("tag", this.f68873b);
                }
                if (!TextUtils.isEmpty(this.f68874c)) {
                    hashMap.put("label", this.f68874c);
                }
                if (!TextUtils.isEmpty(this.f68875d)) {
                    hashMap.put("value", this.f68875d);
                }
                if (!TextUtils.isEmpty(this.f68876e)) {
                    hashMap.put("ext_value", this.f68876e);
                }
                JSONObject b = this.f68872a.mo53572b();
                Iterator keys = b.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    if (!TextUtils.equals("has_v3", str)) {
                        try {
                            Object opt = b.opt(str);
                            if (opt instanceof String) {
                                hashMap.put(str, (String) opt);
                            } else {
                                hashMap.put(str, new C17971f().mo34889b(opt));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f68877f)) {
                    C26890h.m65011a(this.f68877f, (Map<String, String>) hashMap);
                }
            } catch (Exception unused2) {
            }
            C26077e.m63192a(this);
        }

        /* renamed from: a */
        public final C26080b mo53577a(Banner banner) {
            String str;
            if (banner != null) {
                mo53580a(Long.valueOf(banner.getCreativeId()));
                if (banner.getLogExtra() == null) {
                    str = "";
                } else {
                    str = banner.getLogExtra();
                }
                mo53604i(str);
                this.f68872a.mo53570a("ad_id", -1);
            }
            return this;
        }

        /* renamed from: b */
        public final C26080b mo53591b(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo53580a(awemeRawAd.getCreativeId());
                mo53592b(awemeRawAd.getGroupId());
                mo53604i(awemeRawAd.getLogExtra());
            }
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53578a(Aweme aweme) {
            if (!(aweme == null && aweme.getAwemeRawAd() == null)) {
                mo53580a(aweme.getAwemeRawAd().getCreativeId());
                mo53604i(aweme.getAwemeRawAd().getLogExtra());
                this.f68872a.mo53571a("ad_id", (Object) aweme.getAwemeRawAd().getAdId());
            }
            return this;
        }

        /* renamed from: b */
        public final C26080b mo53592b(Long l) {
            String str;
            if (l == null) {
                str = null;
            } else {
                str = l.toString();
            }
            this.f68876e = str;
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53579a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                mo53580a(awemeRawAd.getCreativeId());
                mo53604i(awemeRawAd.getLogExtra());
                this.f68872a.mo53571a("ad_id", (Object) awemeRawAd.getAdId());
            }
            return this;
        }

        /* renamed from: b */
        public final C26080b mo53594b(JSONObject jSONObject) {
            if (jSONObject != null) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    this.f68872a.mo53571a(str, jSONObject.opt(str));
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53581a(Object obj) {
            this.f68872a.mo53571a("ad_extra_data", (Object) new C17971f().mo34889b(obj));
            return this;
        }

        /* renamed from: a */
        public final C26080b mo53574a(long j, String str) {
            mo53580a(Long.valueOf(j));
            if (str == null) {
                str = "";
            }
            mo53604i(str);
            this.f68872a.mo53570a("ad_id", -1);
            return this;
        }
    }

    /* renamed from: a */
    public static C26080b m63190a() {
        C26080b bVar;
        synchronized (C26077e.class) {
            if (f68870a != null) {
                bVar = f68870a;
                f68870a = null;
            } else {
                bVar = null;
            }
        }
        if (bVar == null) {
            return new C26080b();
        }
        bVar.mo53585a();
        return bVar;
    }

    /* renamed from: a */
    static void m63192a(C26080b bVar) {
        synchronized (C26077e.class) {
            if (f68870a == null) {
                f68870a = bVar;
                bVar.mo53585a();
            }
        }
    }

    /* renamed from: a */
    public static C26080b m63191a(String str, String str2, long j) {
        C26080b a = m63190a();
        a.f68872a.mo53571a("ad_event_priority", (Object) "10");
        a.f68872a.mo53571a("ad_event_type", (Object) "monitor");
        a.f68872a.mo53571a("track_url_list", (Object) str);
        a.f68872a.mo53571a("track_status", (Object) str2);
        a.f68872a.mo53570a("ts", j);
        String a2 = C25829f.m62479a();
        if (!TextUtils.isEmpty(a2)) {
            a.f68872a.mo53571a("user_agent", (Object) a2);
        }
        return a;
    }
}
