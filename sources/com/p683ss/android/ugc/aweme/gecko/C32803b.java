package com.p683ss.android.ugc.aweme.gecko;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.ies.geckoclient.p682d.C10882b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p887e.C13333g;
import java.io.File;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.gecko.b */
public final class C32803b implements C10882b {
    /* renamed from: b */
    public final boolean mo19649b(String str, String str2) {
        File file = new File(str2);
        return C13333g.m26866a(-1, str, file.getParent(), null, file.getName(), null, null, null, null, null, null);
    }

    /* renamed from: a */
    public final String mo19647a(String str, String str2) {
        byte[] bArr;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair a = C9917l.m19876a(str, (Map<String, String>) linkedHashMap);
            String str3 = (String) a.first;
            String str4 = (String) a.second;
            String str5 = "application/json";
            if (str2 != null) {
                Charset forName = Charset.forName("UTF-8");
                C52711k.m112236a((Object) forName, "Charset.forName(charsetName)");
                if (str2 != null) {
                    bArr = str2.getBytes(forName);
                    C52711k.m112236a((Object) bArr, "(this as java.lang.String).getBytes(charset)");
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                bArr = null;
            }
            T t = ((INetworkApi) C13333g.m26861a(str3, INetworkApi.class)).postBody(-1, str4, linkedHashMap, new TypedByteArray(str5, bArr, new String[0]), null).execute().f33552b;
            C52711k.m112236a((Object) t, "netWorkApi\n             …                  .body()");
            return (String) t;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final String mo19648a(String str, List<Pair<String, String>> list) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair a = C9917l.m19876a(str, (Map<String, String>) linkedHashMap);
            String str2 = (String) a.first;
            String str3 = (String) a.second;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Pair pair : list) {
                Map map = linkedHashMap2;
                Object obj = pair.first;
                C52711k.m112236a(obj, "it.first");
                Object obj2 = pair.second;
                C52711k.m112236a(obj2, "it.second");
                map.put(obj, obj2);
            }
            T t = ((INetworkApi) C13333g.m26861a(str2, INetworkApi.class)).doPost(-1, str3, linkedHashMap, linkedHashMap2, null, null).execute().f33552b;
            C52711k.m112236a((Object) t, "netWorkApi\n             …                  .body()");
            return (String) t;
        } catch (Exception unused) {
            return "";
        }
    }
}
