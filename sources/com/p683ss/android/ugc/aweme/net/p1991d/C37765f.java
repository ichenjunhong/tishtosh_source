package com.p683ss.android.ugc.aweme.net.p1991d;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.p621b.p624c.C10206c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.p885c.C13302e;
import com.p683ss.android.common.p1144c.C18889b;
import com.p683ss.android.ugc.aweme.net.C37797o;
import com.p683ss.android.ugc.aweme.net.C37812u;
import com.p683ss.android.ugc.aweme.net.ClientChangeSwitch;
import com.p683ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorLegacy;
import com.p683ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.SecUidInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.p683ss.android.ugc.aweme.utils.InterceptorHolder;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.net.d.f */
public final class C37765f extends C37759b {

    /* renamed from: c */
    private static String f96226c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized C18889b mo77248a() {
        boolean z;
        C37797o.m84398a().waitTTNetInit();
        if (VERSION.SDK_INT == 18) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f96226c = "CronetClient";
            C37758a aVar = new C37758a();
            if (aVar.f96218a == null) {
                aVar.f96218a = new C13302e();
            }
            aVar.f96218a.f26780c = 60000;
            if (aVar.f96218a == null) {
                aVar.f96218a = new C13302e();
            }
            aVar.f96218a.f26781d = 60000;
            if (aVar.f96218a == null) {
                aVar.f96218a = new C13302e();
            }
            aVar.f96218a.f26782e = 60000;
            aVar.mo77251a((C12727a) new ApiAlisgInterceptorLegacy());
            aVar.mo77251a((C12727a) new ApiCheckInterceptorTTNet());
            aVar.mo77251a((C12727a) new DevicesNullInterceptorTTNet());
            aVar.mo77251a((C12727a) new UrlTransformInterceptorTTNet());
            aVar.mo77251a((C12727a) new SecUidInterceptorTTNet());
            List<C12727a> specialNetworkInterceptor = InterceptorHolder.createInterceptorProviderbyMonsterPlugin().getSpecialNetworkInterceptor(0);
            if (!C9376b.m18558a((Collection<T>) specialNetworkInterceptor)) {
                for (C12727a a : specialNetworkInterceptor) {
                    aVar.mo77251a(a);
                }
            }
            aVar.f96219b = new C37760c();
            if (C10193n.m20607a().mo18200a(ClientChangeSwitch.class, "change_network_client", C10181b.m20511a().mo18175c().getChangeNetworkClient(), 1) == 0) {
                return aVar;
            }
            return new C37766g(aVar);
        }
        f96226c = "SsOkhttp3Client";
        return new C10206c(new C37812u());
    }

    public C37765f(Context context) {
        super(context);
    }
}
