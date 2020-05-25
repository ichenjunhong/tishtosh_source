package com.p683ss.android.ugc.aweme.qrcode.p2104b;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.f */
public final class C40946f extends C37716a<C40945e> {

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b.f$a */
    public static final class C40947a implements Callable<C40945e> {
        C40947a() {
        }

        public final /* synthetic */ Object call() {
            return QRCodeApi.m90525a();
        }
    }

    /* renamed from: a */
    public final void mo83434a() {
        C23566n.m57766a().mo48750a(this.mHandler, new C40947a(), 0);
    }
}
