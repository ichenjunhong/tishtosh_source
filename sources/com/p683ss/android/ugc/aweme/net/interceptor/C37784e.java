package com.p683ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.account.token.C18503c;
import com.p683ss.android.ugc.aweme.net.C37791k;
import com.p683ss.android.ugc.aweme.net.C37818z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53671s;
import okhttp3.C53676u.C53677a;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.e */
public final class C37784e implements C37791k {
    public final C53504ad intercept(C53677a aVar) throws IOException {
        C53498ab a = aVar.mo111416a();
        ArrayList arrayList = new ArrayList(C37818z.m84419a(a.f132380c));
        C18503c.m44775a(a.f132378a.toString(), (List<C12685b>) arrayList);
        C53671s a2 = C37818z.m84420a((List<C12685b>) arrayList);
        C53499a a3 = a.mo111256a();
        if (a2 == null) {
            a2 = a.f132380c;
        }
        C53504ad a4 = aVar.mo111417a(a3.mo111267a(a2).mo111272c());
        C18503c.m44777b(a.f132378a.toString(), C37818z.m84419a(a4.f132403f));
        return a4;
    }
}
