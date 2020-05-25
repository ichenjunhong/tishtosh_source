package com.p683ss.android.ugc.aweme.services;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.retrofit2.C12799u;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.AbsApiMonitorService */
public abstract class AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.services.AbsApiMonitorService$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean filter(String str, Object obj);

    public final void addALog(String str, C12799u<?> uVar) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(uVar, "res");
        try {
            List b = uVar.mo23959b();
            C52711k.m112240b(str, "url");
            Uri parse = Uri.parse(str);
            if (!TextUtils.isEmpty(parse.getQueryParameter("device_id"))) {
                if (!TextUtils.isEmpty(parse.getQueryParameter("aid"))) {
                    if (b != null) {
                        StringBuilder sb = new StringBuilder("URL: ");
                        sb.append(str);
                        sb.append("\r\nHEADER");
                        sb.append(b.toString());
                        C18778a.m45848b("API_URL_HEADER", sb.toString());
                    }
                }
            }
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void apiMonitor(String str, String str2, String str3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str3, "body");
        Uri parse = Uri.parse(str);
        if (parse != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put(LeakCanaryFileProvider.f132050j, parse.getPath());
                jSONObject.put("host", parse.getHost());
                jSONObject.put("body", str3);
                jSONObject.put("requestid", str2);
                jSONObject.put("debug", false);
                C23569o.m57783b("api_error_service_log", "", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
