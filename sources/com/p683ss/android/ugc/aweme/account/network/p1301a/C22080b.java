package com.p683ss.android.ugc.aweme.account.network.p1301a;

import android.content.Context;
import com.bytedance.sdk.account.C13072c;
import com.p683ss.android.C18962e;
import com.p683ss.android.C18963f;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.network.a.b */
public final class C22080b implements C13072c {
    /* renamed from: a */
    public final int mo24747a(Context context, Throwable th) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(th, "e");
        return C20842a.m53147a().mo47685a(context, th);
    }

    /* renamed from: a */
    public final C18963f mo24748a(int i, String str, List<C18962e> list) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(list, "headers");
        return NetworkProxyAccount.f59579c.mo46184a(i, str, list);
    }

    /* renamed from: a */
    public final C18963f mo24749a(int i, String str, Map<String, String> map, List<C18962e> list) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "postParams");
        C52711k.m112240b(list, "headers");
        return NetworkProxyAccount.f59579c.mo46185a(i, str, map, list);
    }
}
