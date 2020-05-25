package com.p683ss.android.p1163f.p1164a;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.UrlConfig;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.p1163f.C19143a;
import com.p683ss.android.p1163f.C19149b;
import com.p683ss.android.p1163f.C19154c;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.f.a.a */
public final class C19146a extends C19147b {
    /* renamed from: a */
    public final String mo39093a() {
        return C19149b.f52768d;
    }

    /* renamed from: a */
    public final void mo39095a(C19154c cVar) {
        String str;
        long j;
        JSONObject jSONObject;
        String str2 = cVar.f52790a;
        Map<String, Object> map = cVar.f52792c;
        if (!TextUtils.isEmpty(str2)) {
            if (!cVar.mo39099a()) {
                if (cVar.mo39100b()) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (map != null) {
                        try {
                            for (Entry entry : map.entrySet()) {
                                if (entry != null && (entry.getValue() instanceof String) && (entry.getKey() instanceof String)) {
                                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    C18894a.m46006a(cVar.f52790a, jSONObject2);
                }
            } else if (map == null) {
                AppLog.onEvent(null, str2);
            } else {
                String str3 = (String) map.get(C19149b.f52783s);
                Object obj = map.get(C19149b.f52780p);
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get(C19149b.f52784t);
                long j2 = 0;
                if (obj2 instanceof Long) {
                    j = ((Long) obj2).longValue();
                } else {
                    j = 0;
                }
                Object obj3 = map.get(C19149b.f52785u);
                if (obj3 instanceof Long) {
                    j2 = ((Long) obj3).longValue();
                }
                Object obj4 = map.get(C19149b.f52786v);
                if (obj4 instanceof JSONObject) {
                    jSONObject = (JSONObject) obj4;
                } else {
                    jSONObject = null;
                }
                AppLog.onEvent((Context) null, str3, str2, str, j, j2, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo39094a(Context context, C19143a aVar) {
        AppLog.setAppId(aVar.f52750h);
        AppLog.setChannel(aVar.f52746d);
        UrlConfig urlConfig = new UrlConfig("https://log.tiktokv.com/service/2/app_log/", "https://log.tiktokv.com/service/2/app_log/", new String[]{"https://log.tiktokv.com/service/2/device_register/", "https://log.tiktokv.com/service/2/device_register/"}, "https://log.tiktokv.com/service/2/app_alert_check/", "https://log.tiktokv.com/service/2/log_settings/", "https://log.tiktokv.com/service/2/app_log/", "https://log.tiktokv.com/service/2/log_settings/");
        AppLog.init(context, false, urlConfig);
    }
}
