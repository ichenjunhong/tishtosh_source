package com.p683ss.android.ugc.aweme.pay.service;

import android.content.Context;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.pay.service.p2043a.C38567a;
import com.p683ss.android.ugc.aweme.pay.service.p2043a.C38569b;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pay.service.a */
public final class C38564a implements IPayService {

    /* renamed from: a */
    public static final C38565a f98073a = new C38565a(null);

    /* renamed from: com.ss.android.ugc.aweme.pay.service.a$a */
    public static final class C38565a {
        private C38565a() {
        }

        public /* synthetic */ C38565a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pay.service.a$b */
    public static final class C38566b implements C38567a {
        C38566b() {
        }
    }

    public final void initWalletSDKContext(String str) {
        C52711k.m112240b(str, "wxAppId");
        C9220a.m18310a("EmptyPayService initWalletSDKContext");
    }

    public final C38567a newPayTransaction(WeakReference<Context> weakReference, C38569b bVar) {
        C9220a.m18310a("EmptyPayService newPayTransaction");
        return new C38566b();
    }
}
