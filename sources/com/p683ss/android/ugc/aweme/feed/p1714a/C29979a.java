package com.p683ss.android.ugc.aweme.feed.p1714a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.commercialize.log.C26075d.C26076a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.a.a */
public final class C29979a {
    /* renamed from: a */
    public static void m70142a(Context context, Aweme aweme) {
        m70144a(context, "button_show", aweme, m70135a(context, aweme, "raw ad background show"));
    }

    /* renamed from: a */
    public static void m70143a(Context context, Aweme aweme, Map<String, String> map) {
        JSONObject a = m70137a(context, aweme, "raw ad background show", false);
        if (map.size() != 0) {
            try {
                a.put("ad_extra_data", new JSONObject(map));
            } catch (JSONException unused) {
            }
        }
        m70144a(context, "othershow", aweme, a);
    }

    /* renamed from: a */
    private static void m70144a(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
            Context context2 = context;
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            m70146a(context2, "background_ad", str2, jSONObject2, m70148b(aweme), m70132a(aweme));
        }
    }

    /* renamed from: a */
    public static void m70145a(Context context, String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        m70146a(context, str, str2, jSONObject, m70149b(awemeRawAd), m70133a(awemeRawAd));
    }

    /* renamed from: a */
    private static void m70146a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        if (TextUtils.equals("click", str2)) {
            m70147a(str, str3, j, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException unused) {
            }
        }
        C26890h.m65006a(context, str, str2, str3, j, jSONObject);
    }

    /* renamed from: a */
    private static void m70147a(String str, String str2, long j, JSONObject jSONObject) {
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
        m70141a(jSONObject);
    }

    /* renamed from: a */
    private static JSONObject m70141a(JSONObject jSONObject) {
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

    /* renamed from: a */
    private static long m70133a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    /* renamed from: b */
    private static String m70148b(Aweme aweme) {
        return String.valueOf(aweme.getAwemeRawAd().getCreativeId());
    }

    /* renamed from: a */
    private static long m70132a(Aweme aweme) {
        if (aweme.getAwemeRawAd().getGroupId() != null) {
            return aweme.getAwemeRawAd().getGroupId().longValue();
        }
        return 0;
    }

    /* renamed from: b */
    private static String m70149b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    /* renamed from: a */
    public static String m70134a(String str) {
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
            String serverDeviceId = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(serverDeviceId)) {
                return str;
            }
            if (str.contains("{UID}") || str.contains("__UID__")) {
                String replace2 = str.replace("{UID}", serverDeviceId);
                try {
                    str = replace2.replace("__UID__", serverDeviceId);
                } catch (Exception unused2) {
                    str = replace2;
                }
            }
            return str;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: c */
    private static boolean m70151c(Context context, Aweme aweme) {
        if (context == null || aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: b */
    public static void m70150b(Context context, Aweme aweme) {
        m70144a(context, "replay", aweme, m70136a(context, aweme, "raw ad background replay", "button"));
        if (aweme != null) {
            final List rawAdPlayTrackUrlList = aweme.getRawAdPlayTrackUrlList();
            if (!C9376b.m18558a((Collection<T>) rawAdPlayTrackUrlList)) {
                C0013i.m16a((Callable<TResult>) new Callable<Void>(false) {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void call() throws Exception {
                        try {
                            for (String str : rawAdPlayTrackUrlList) {
                                if (!TextUtils.isEmpty(str)) {
                                    String a = C29979a.m70134a(str);
                                    if (false) {
                                        a = C9431p.m18666b(a);
                                    }
                                    NetworkUtils.executeGet(40960, a, false, false);
                                }
                            }
                        } catch (Exception e) {
                            C32458a.m75143a(e);
                        }
                        return null;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m70135a(Context context, Aweme aweme, String str) {
        if (aweme == null) {
            return null;
        }
        return m70139a(context, aweme.getAwemeRawAd(), str);
    }

    /* renamed from: a */
    private static JSONObject m70139a(Context context, AwemeRawAd awemeRawAd, String str) {
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
        } catch (JSONException e) {
            C32458a.m75143a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m70137a(Context context, Aweme aweme, String str, boolean z) {
        return m70138a(context, aweme, str, false, null);
    }

    /* renamed from: a */
    private static JSONObject m70136a(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m70137a(context, aweme, str, false);
        try {
            if (!TextUtils.isEmpty(str2)) {
                a.put("refer", str2);
            }
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: a */
    private static JSONObject m70138a(Context context, Aweme aweme, String str, boolean z, Map<String, String> map) {
        if (!m70151c(context, aweme)) {
            return new JSONObject();
        }
        return m70140a(context, aweme.getAwemeRawAd(), str, z, null);
    }

    /* renamed from: a */
    private static JSONObject m70140a(Context context, AwemeRawAd awemeRawAd, String str, boolean z, Map<String, String> map) {
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
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            C32458a.m75143a((Exception) e);
        }
        return jSONObject;
    }
}
