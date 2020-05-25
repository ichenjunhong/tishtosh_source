package com.p683ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.RawURLGetter.C26027a;
import java.util.ArrayList;
import java.util.Collection;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.f */
public class C26081f {

    /* renamed from: a */
    public static final String f68878a = "f";

    /* renamed from: a */
    private static String m63234a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String serverDeviceId = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(serverDeviceId)) {
                return str;
            }
            if (str.contains("__IMEI__")) {
                str = str.replace("__IMEI__", serverDeviceId);
            }
            return str;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m63235a(String str, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                String replace = str.replace("{TS}", String.valueOf(j));
                try {
                    str = replace.replace("__TS__", String.valueOf(j));
                } catch (Exception unused) {
                    str = replace;
                }
            }
            String serverDeviceId = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(serverDeviceId)) {
                return str;
            }
            if (str.contains("{UID}") || str.contains("__UID__")) {
                str = str.replace("{UID}", serverDeviceId).replace("__UID__", serverDeviceId);
            }
            if (str.contains("{UA}") || str.contains("__UA__")) {
                String replace2 = str.replace("{UA}", str2);
                try {
                    str = replace2.replace("__UA__", str2);
                } catch (Exception unused2) {
                    str = replace2;
                }
            }
            return str;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: a */
    public static void m63236a(C26057av avVar, UrlModel urlModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (urlModel != null && !C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
            for (String a : urlModel.getUrlList()) {
                arrayList.add(m63234a(a));
            }
        }
        m63237a(avVar, (Collection<String>) arrayList, z);
    }

    /* renamed from: a */
    public static void m63237a(C26057av avVar, Collection<String> collection, boolean z) {
        if (!C9376b.m18558a(collection)) {
            String d = RawURLGetter.m63087d();
            for (String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    m63238a(str, z, avVar, d);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m63238a(String str, boolean z, C26057av avVar, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        String a = m63235a(str, currentTimeMillis, str2);
        if (z) {
            a = C9431p.m18666b(a);
        }
        Uri parse = Uri.parse(a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url", a);
            jSONObject.put("scheme", parse.getScheme());
            jSONObject.put("host", parse.getHost());
            jSONObject.put(LeakCanaryFileProvider.f132050j, parse.getPath());
            jSONObject.put("ref", "native");
        } catch (JSONException unused) {
        }
        C26082g gVar = new C26082g(avVar, a, currentTimeMillis, jSONObject);
        RawURLGetter.m63086a(a, (C26027a) gVar);
    }
}
