package com.p683ss.android.ugc.aweme.qrcode.p2104b;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.b */
public class C40940b extends C37716a<C40939a> {
    /* renamed from: a */
    public void mo83428a(String str) {
    }

    /* renamed from: a */
    public boolean mo83429a() {
        return false;
    }

    /* renamed from: b */
    public File mo83430b() {
        return null;
    }

    /* renamed from: a */
    public final void mo83427a(final int i, final String str, String str2) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable(null) {
            public final Object call() throws Exception {
                return QRCodeApi.m90524a(i, str, null);
            }
        }, 0);
    }
}
