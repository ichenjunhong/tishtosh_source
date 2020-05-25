package com.p683ss.android.ugc.aweme.net.interceptor;

import com.p683ss.android.common.applog.NetUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53673t.C53674a;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.f */
public final class C37785f implements C53676u {
    public final C53504ad intercept(C53677a aVar) throws IOException {
        C53498ab a = aVar.mo111416a();
        C53674a j = a.f132378a.mo111624j();
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, true);
        for (Entry entry : hashMap.entrySet()) {
            j.mo111629a((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar.mo111417a(a.mo111256a().mo111268a(j.mo111632b()).mo111272c());
    }
}
