package com.bytedance.sdk.account.bdplatform.impl.p857a;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.sdk.account.bdplatform.p854a.C13035a.C13036a;
import com.bytedance.sdk.account.bdplatform.p854a.C13039b;
import com.bytedance.sdk.account.bdplatform.p855b.C13042a;
import com.bytedance.sdk.account.bdplatform.p855b.C13043b;
import com.bytedance.sdk.account.bdplatform.p855b.C13048e;
import com.bytedance.sdk.account.bdplatform.p856c.C13049a;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13030a;
import com.bytedance.sdk.account.p849b.p853d.C13032a;
import com.bytedance.sdk.account.p849b.p853d.C13033b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.a.b */
public final class C13063b implements C13036a {

    /* renamed from: a */
    C13039b f34122a;

    /* renamed from: b */
    private Context f34123b;

    /* renamed from: a */
    private static Set<String> m26239a(String str) {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(",")) {
                hashSet.addAll(Arrays.asList(str.split(",")));
            } else {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private String m26240c(C13030a aVar) {
        StringBuilder sb = new StringBuilder();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(m26239a(aVar.f34049f));
        hashSet.addAll(m26239a(aVar.f34050g));
        hashSet.addAll(m26239a(aVar.f34051h));
        for (String append : hashSet) {
            sb.append(append);
            sb.append(",");
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final C13048e mo24683b(C13030a aVar) {
        try {
            return C13062a.m26237b(this.f34122a.mo24699a(new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(this.f34122a.mo24704c()).path("/passport/open/authorize/ticket/").appendQueryParameter("client_key", aVar.f34046c).appendQueryParameter("scope", m26240c(aVar)).build().toString()));
        } catch (Throwable th) {
            C13048e eVar = new C13048e();
            eVar.f34092f = C13049a.m26225a(this.f34122a, th);
            return eVar;
        }
    }

    /* renamed from: a */
    public final C13043b mo24682a(C13030a aVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("client_key", aVar.f34046c);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.f34049f);
        if (!TextUtils.isEmpty(aVar.f34050g)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(aVar.f34050g);
        }
        if (!TextUtils.isEmpty(aVar.f34051h)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(aVar.f34051h);
        }
        hashMap.put("scope", sb.toString());
        try {
            return C13062a.m26238c(this.f34122a.mo24700a(new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(this.f34122a.mo24705d()).path("/oauth/auth_info/").build().toString(), hashMap));
        } catch (Throwable th) {
            C13043b bVar = new C13043b();
            bVar.f34092f = C13049a.m26225a(this.f34122a, th);
            return bVar;
        }
    }

    public C13063b(Context context, C13039b bVar) {
        this.f34122a = bVar;
        this.f34123b = context;
    }

    /* renamed from: a */
    public final C13042a mo24681a(C13030a aVar, String str) {
        Object obj;
        List a = C13033b.m26207a(this.f34123b, aVar.getCallerPackage());
        if (a == null || a.isEmpty()) {
            obj = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a.size(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                sb.append((String) a.get(i));
            }
            obj = sb.toString();
        }
        HashMap hashMap = new HashMap(6);
        hashMap.put("client_key", aVar.f34046c);
        hashMap.put("response_type", "code");
        hashMap.put("scope", aVar.f34049f);
        hashMap.put("state", aVar.f34044a);
        hashMap.put("from", aVar.f34047d);
        hashMap.put("ticket", str);
        hashMap.put("app_identity", C13032a.m26205a(aVar.getCallerPackage()));
        hashMap.put("signature", obj);
        hashMap.put("sign", obj);
        if (TextUtils.equals("wap_to_native", aVar.f34047d) && !TextUtils.isEmpty(aVar.f34045b)) {
            hashMap.put("redirect_uri", aVar.f34045b);
        }
        try {
            return C13062a.m26235a(this.f34122a.mo24700a(new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(this.f34122a.mo24705d()).path("/oauth/authorize/").build().toString(), hashMap));
        } catch (Throwable th) {
            new C13042a().f34092f = C13049a.m26225a(this.f34122a, th);
            return null;
        }
    }
}
