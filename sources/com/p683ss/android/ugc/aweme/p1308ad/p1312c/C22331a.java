package com.p683ss.android.ugc.aweme.p1308ad.p1312c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26075d.C26076a;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22320c;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22440g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.ad.c.a */
public final class C22331a {
    /* renamed from: n */
    private static boolean m55296n(Context context, AwemeRawAd awemeRawAd) {
        return (context == null || awemeRawAd == null) ? false : true;
    }

    /* renamed from: a */
    private static void m55281a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        if (TextUtils.equals("click", str2)) {
            m55282a(str, str3, j, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException unused) {
            }
        }
        C22320c cVar = C22317a.m55223a().f60116c;
        if (cVar != null) {
            cVar.mo46429a(context, str, str2, str3, j, jSONObject);
        } else if (C22440g.m55471a()) {
            throw new IllegalStateException("IAdLogDepend is null! Fail!");
        }
        C22440g.m55471a();
    }

    /* renamed from: a */
    private static void m55282a(String str, String str2, long j, JSONObject jSONObject) {
        long j2;
        try {
            j2 = Long.parseLong(str2);
        } catch (Exception unused) {
            j2 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                if (!TextUtils.equals("has_v3", str3)) {
                    try {
                        jSONObject2.put(str3, jSONObject.opt(str3));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        new C26076a().mo53568b(str).mo53564a("realtime_click").mo53563a(j2).mo53567b(j).mo53565a(jSONObject2).mo53566a().mo53562a();
        m55277a(jSONObject);
    }

    /* renamed from: a */
    private static long m55272a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    /* renamed from: b */
    private static String m55283b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    /* renamed from: a */
    public static String m55273a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                String replace = str.replace("{TS}", String.valueOf(currentTimeMillis));
                try {
                    str = replace.replace("__TS__", String.valueOf(currentTimeMillis));
                } catch (Exception unused) {
                    str = replace;
                }
            }
            C22320c cVar = C22317a.m55223a().f60116c;
            if (cVar == null) {
                return str;
            }
            String a = cVar.mo46424a();
            if (TextUtils.isEmpty(a)) {
                return str;
            }
            if (str.contains("{UID}") || str.contains("__UID__")) {
                String replace2 = str.replace("{UID}", a);
                try {
                    str = replace2.replace("__UID__", a);
                } catch (Exception unused2) {
                    str = replace2;
                }
            }
            return str;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: a */
    private static JSONObject m55277a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C18085o m = new C18087q().mo35029a(jSONObject.getString("log_extra")).mo35009m();
            JSONObject jSONObject2 = new JSONObject();
            if (m.mo35022b("rit") != null) {
                jSONObject2.put("ctr_rit", m.mo35022b("rit").mo34905c());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m55285c(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "ad_click", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end ad click"));
    }

    /* renamed from: d */
    public static void m55286d(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "click_coupon", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment coupon click"));
    }

    /* renamed from: e */
    public static void m55287e(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "click_source", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end click source"));
    }

    /* renamed from: f */
    public static void m55288f(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "click_title", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end click title"));
    }

    /* renamed from: g */
    public static void m55289g(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "click_call", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end click call"));
    }

    /* renamed from: h */
    public static void m55290h(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "click_start", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end click start"));
    }

    /* renamed from: i */
    public static void m55291i(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "close", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end click close"));
    }

    /* renamed from: j */
    public static void m55292j(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "click_redpacket", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end click red packet"));
    }

    /* renamed from: k */
    public static void m55293k(Context context, AwemeRawAd awemeRawAd) {
        m55280a(context, "comment_end_ad", "click_message", m55275a(context, awemeRawAd, "raw ad click", false), awemeRawAd);
    }

    /* renamed from: l */
    public static void m55294l(Context context, AwemeRawAd awemeRawAd) {
        m55280a(context, "comment_end_ad", "click_message", m55275a(context, awemeRawAd, "raw ad click", false), awemeRawAd);
    }

    /* renamed from: m */
    public static void m55295m(Context context, AwemeRawAd awemeRawAd) {
        m55280a(context, "comment_end_ad", "click_message", m55275a(context, awemeRawAd, "raw ad click", false), awemeRawAd);
    }

    /* renamed from: a */
    public static void m55278a(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "comment_end_show", awemeRawAd, m55274a(context, awemeRawAd, "raw feed comment end show"));
    }

    /* renamed from: b */
    public static void m55284b(Context context, AwemeRawAd awemeRawAd) {
        m55279a(context, "click", awemeRawAd, m55275a(context, awemeRawAd, "raw feed comment end click", true));
        if (awemeRawAd != null) {
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                final List urlList = clickTrackUrlList.getUrlList();
                if (!C9376b.m18558a((Collection<T>) urlList)) {
                    C0013i.m16a((Callable<TResult>) new Callable<Void>(true) {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void call() throws Exception {
                            try {
                                for (String str : urlList) {
                                    if (!TextUtils.isEmpty(str)) {
                                        String a = C22331a.m55273a(str);
                                        if (true) {
                                            a = C9431p.m18666b(a);
                                        }
                                        NetworkUtils.executeGet(40960, a, false, false);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            return null;
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m55274a(Context context, AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_extra", awemeRawAd.getLogExtra());
            jSONObject.put("is_ad_event", "1");
            String networkAccessType = NetworkUtils.getNetworkAccessType(context);
            if (!C9431p.m18664a(networkAccessType)) {
                jSONObject.put("nt", networkAccessType);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m55275a(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        return m55276a(context, awemeRawAd, str, z, null);
    }

    /* renamed from: a */
    private static void m55279a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m55296n(context, awemeRawAd)) {
            m55280a(context, "comment_end_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: a */
    private static JSONObject m55276a(Context context, AwemeRawAd awemeRawAd, String str, boolean z, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            String logExtra = awemeRawAd.getLogExtra();
            if (!TextUtils.isEmpty(logExtra)) {
                jSONObject.put("log_extra", logExtra);
            }
            jSONObject.put("is_ad_event", "1");
            String networkAccessType = NetworkUtils.getNetworkAccessType(context);
            if (!C9431p.m18664a(networkAccessType)) {
                jSONObject.put("nt", networkAccessType);
            }
            if (z) {
                jSONObject.put("has_v3", "1");
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static void m55280a(Context context, String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        m55281a(context, str, str2, jSONObject, m55283b(awemeRawAd), m55272a(awemeRawAd));
    }
}
