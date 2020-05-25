package com.p683ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48427a;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48428b;
import com.p683ss.android.ugc.awemepushlib.p2408c.C48432a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.c */
public final class C48444c {
    /* renamed from: a */
    public static Map<String, String> m104835a() {
        return C11049a.m22368d();
    }

    /* renamed from: a */
    public static void m104839a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            List<String> pathSegments = parse.getPathSegments();
            Set queryParameterNames = parse.getQueryParameterNames();
            StringBuilder sb = new StringBuilder("//");
            sb.append(host);
            for (String str2 : pathSegments) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append("/");
                    try {
                        Long.parseLong(str2);
                        sb.append("xxx");
                    } catch (NumberFormatException unused) {
                        sb.append(str2);
                    }
                }
            }
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                sb.append("?");
                Iterator it = queryParameterNames.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    if (it.hasNext()) {
                        sb.append("&");
                    }
                }
            }
            try {
                C23569o.m57783b("deep_link_collect", "", new JSONObject().put(C23060d.f61428b, sb.toString()));
            } catch (JSONException unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m104841a(String str, JSONObject jSONObject) {
        C23569o.m57779a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m104837a(C48428b bVar, int i) {
        C26890h.m65012a("push_receive", new JSONObject(C48427a.m104782a(bVar, i, C48432a.m104793a())));
    }

    /* renamed from: a */
    public static void m104840a(String str, int i, JSONObject jSONObject) {
        C23569o.m57776a(str, i, jSONObject);
    }

    /* renamed from: a */
    public static void m104838a(C48428b bVar, boolean z, int i) {
        String str;
        String str2;
        String str3;
        Map a = C48427a.m104782a(bVar, i, C48432a.m104793a());
        String str4 = "has_image";
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        a.put(str4, str);
        String str5 = "mediastyle";
        if (bVar.extra.style == 5) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        a.put(str5, str2);
        String str6 = "colorized";
        if (TextUtils.isEmpty(bVar.extra.bg_color)) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        a.put(str6, str3);
        C26890h.m65012a("push_show", new JSONObject(a));
    }

    /* renamed from: a */
    public static void m104836a(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
        JSONObject[] jSONObjectArr2 = jSONObjectArr;
        if (jSONObjectArr2.length > 0) {
            C26883g.m64993a(context, "apn", str, j, j2, jSONObjectArr2[0]);
            return;
        }
        C26883g.m64992a(context, "apn", str, j, j2);
    }
}
