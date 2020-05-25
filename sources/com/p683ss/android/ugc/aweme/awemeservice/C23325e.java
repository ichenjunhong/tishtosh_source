package com.p683ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService.C23319a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1632di.C27599am;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.e */
public final class C23325e implements IRequestIdService {

    /* renamed from: a */
    private Map<String, C23319a> f62335a = new ConcurrentHashMap();

    /* renamed from: a */
    public static IRequestIdService m57379a() {
        if (C27991b.f73496b == null) {
            synchronized (IRequestIdService.class) {
                if (C27991b.f73496b == null) {
                    C27991b.f73496b = C27599am.m66280b();
                }
            }
        }
        return (IRequestIdService) C27991b.f73496b;
    }

    public final C23319a getRequestIdAndIndex(String str) {
        C23319a aVar = (C23319a) this.f62335a.get(str);
        if (aVar == null) {
            return new C23319a();
        }
        return aVar;
    }

    public final String getRequestId(Aweme aweme, int i) {
        if (aweme == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getAid());
        sb.append(i);
        C23319a requestIdAndIndex = getRequestIdAndIndex(sb.toString());
        if (requestIdAndIndex != null) {
            return requestIdAndIndex.f62324a;
        }
        return "";
    }

    public final JSONObject getRequestIdAndOrderJsonObject(Aweme aweme, int i) {
        String str;
        if (aweme == null) {
            return new JSONObject();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getAid());
        sb.append(i);
        String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        try {
            C23319a requestIdAndIndex = getRequestIdAndIndex(sb2);
            String str2 = requestIdAndIndex.f62324a;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("request_id", str2);
            }
            if (requestIdAndIndex.f62325b != null) {
                jSONObject.put("order", requestIdAndIndex.f62325b);
            }
            String str3 = "is_photo";
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put(str3, str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public final void setRequestIdAndIndex(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f62335a.put(str, new C23319a(str2, i));
        }
    }
}
