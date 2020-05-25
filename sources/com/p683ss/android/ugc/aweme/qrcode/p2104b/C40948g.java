package com.p683ss.android.ugc.aweme.qrcode.p2104b;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.g */
public final class C40948g extends C37716a<C40950h> {

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b.g$a */
    public static final class C40949a implements Callable<C40950h> {

        /* renamed from: a */
        final /* synthetic */ String f104175a;

        public final /* synthetic */ Object call() {
            return QRCodeApi.m90526a(this.f104175a);
        }

        C40949a(String str) {
            this.f104175a = str;
        }
    }

    /* renamed from: a */
    public final void mo83436a(String str) {
        C52711k.m112240b(str, "materialId");
        C23566n.m57766a().mo48750a(this.mHandler, new C40949a(str), 0);
    }
}
