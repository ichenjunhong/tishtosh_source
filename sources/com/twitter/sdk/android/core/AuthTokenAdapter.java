package com.twitter.sdk.android.core;

import com.google.gson.C17971f;
import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import com.google.gson.C18089s;
import com.google.gson.C18090t;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class AuthTokenAdapter implements C18081k<C52067a>, C18090t<C52067a> {

    /* renamed from: a */
    static final Map<String, Class<? extends C52067a>> f129645a;

    /* renamed from: b */
    private final C17971f f129646b = new C17971f();

    static {
        HashMap hashMap = new HashMap();
        f129645a = hashMap;
        hashMap.put("oauth1a", TwitterAuthToken.class);
        f129645a.put("oauth2", OAuth2Token.class);
        f129645a.put("guest", GuestAuthToken.class);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        C18085o m = lVar.mo35009m();
        String c = m.mo35023c("auth_type").mo34905c();
        return (C52067a) this.f129646b.mo34881a(m.mo35022b("auth_token"), (Class) f129645a.get(c));
    }

    /* renamed from: a */
    public final /* synthetic */ C18082l mo9500a(Object obj, Type type, C18089s sVar) {
        String str;
        C52067a aVar = (C52067a) obj;
        C18085o oVar = new C18085o();
        String str2 = "auth_type";
        Class cls = aVar.getClass();
        Iterator it = f129645a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            Entry entry = (Entry) it.next();
            if (((Class) entry.getValue()).equals(cls)) {
                str = (String) entry.getKey();
                break;
            }
        }
        oVar.mo35020a(str2, str);
        oVar.mo35017a("auth_token", this.f129646b.mo34875a((Object) aVar));
        return oVar;
    }
}
