package com.p683ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.login.twostep.C21515f;
import com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.p683ss.android.ugc.aweme.account.p1275h.C20979a;
import com.p683ss.android.ugc.aweme.account.p1275h.C20980b;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONObject;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor */
public final class TwoStepAuthenticationInterceptor implements IInterceptor {
    private Integer currentErrorCode;
    private String currentUrlPath;

    private final String getPathFromUrl(String str) {
        try {
            return new URI(str).getPath();
        } catch (NullPointerException | URISyntaxException unused) {
            return null;
        }
    }

    private final Integer getAuthType(Integer num) {
        if (num != null && num.intValue() == 2020) {
            return Integer.valueOf(2);
        }
        if (num != null && num.intValue() == 2032) {
            return Integer.valueOf(1);
        }
        if (num != null && num.intValue() == 2033) {
            return Integer.valueOf(4);
        }
        if (num != null && num.intValue() == 2025) {
            return Integer.valueOf(3);
        }
        if (num != null && num.intValue() == 2031) {
            return Integer.valueOf(5);
        }
        return null;
    }

    private final C0013i<C20980b> startTwoStepAuthentication(Context context, String str, String str2) {
        C0027j jVar = new C0027j();
        if (context == null || str2 == null) {
            StringBuilder sb = new StringBuilder("Activity or response is null, activity: ");
            sb.append(context);
            sb.append(", response: ");
            sb.append(str2);
            jVar.mo46b(new Exception(sb.toString()));
            return jVar.f77a;
        }
        Integer authType = getAuthType(this.currentErrorCode);
        if (authType == null) {
            StringBuilder sb2 = new StringBuilder("Failed to parse error code from JSON response: ");
            sb2.append(str2);
            jVar.mo46b(new Exception(sb2.toString()));
            return jVar.f77a;
        }
        C21515f a = C21515f.m54161a();
        C20979a twoStepAuthenticationInterceptor$startTwoStepAuthentication$1 = new TwoStepAuthenticationInterceptor$startTwoStepAuthentication$1(jVar);
        synchronized (C21515f.f58340a) {
            a.f58342b = twoStepAuthenticationInterceptor$startTwoStepAuthentication$1;
        }
        this.currentUrlPath = getPathFromUrl(str);
        Intent intent = new Intent(context, TwoStepAuthActivity.class);
        intent.putExtra("auth_type", authType.intValue());
        intent.putExtra("auth_data", str2);
        intent.putExtra("url_path", this.currentUrlPath);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        return jVar.f77a;
    }

    public final Map<String, String> tryToIntercept(String str, String str2, int i) {
        Context context;
        String str3;
        C0777a aVar = new C0777a();
        Activity g = C11016e.m22312g();
        if (g != null) {
            context = g;
        } else {
            context = C11010c.m22280a();
        }
        this.currentErrorCode = Integer.valueOf(i);
        C0013i startTwoStepAuthentication = startTwoStepAuthentication(context, str, str2);
        if (startTwoStepAuthentication == null) {
            return aVar;
        }
        startTwoStepAuthentication.mo36g();
        C20980b bVar = (C20980b) startTwoStepAuthentication.mo34e();
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            StringBuilder sb = new StringBuilder("interceptAndGetNewParams, 2-step auth result: ");
            sb.append(bVar);
            if (bVar != null) {
                StringBuilder sb2 = new StringBuilder("ticket: ");
                sb2.append(bVar.f57089a);
                sb2.append(", profileKey: ");
                sb2.append(bVar.f57090b);
                sb2.append(", errorCode: ");
                sb2.append(bVar.f57091c);
                sb2.append(", errorMessage: ");
                sb2.append(bVar.f57092d);
                str3 = sb2.toString();
            } else {
                str3 = null;
            }
            sb.append(str3);
        }
        if (bVar == null || TextUtils.isEmpty(bVar.f57089a)) {
            return aVar;
        }
        if (!TextUtils.isEmpty(bVar.f57090b)) {
            aVar.put("profile_key", bVar.f57090b);
        }
        Map<String, String> map = aVar;
        map.put("verify_ticket", bVar.f57089a);
        String str4 = this.currentUrlPath;
        JSONObject b = C23088c.m56631a().mo47824a("url_path", str4).mo47822a("error_code", this.currentErrorCode).mo47825b();
        C52711k.m112236a((Object) b, "json");
        C22089b.m54868a("two_step_auth", 0, b);
        return map;
    }
}
