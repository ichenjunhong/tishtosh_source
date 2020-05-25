package com.p683ss.android.ugc.aweme.captcha.p1491c;

import android.support.p030v4.app.C0654k;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.captcha.c.e */
public final class C24504e implements NoticeCaptchaHelper {
    public final boolean shouldDoCaptcha(Exception exc) {
        C52711k.m112240b(exc, "e");
        return C24501b.m59896a(exc);
    }

    public final void showCaptchaDialog(C0654k kVar, C23459a aVar, C24493b bVar) {
        C52711k.m112240b(kVar, "fm");
        C52711k.m112240b(aVar, "e");
        C52711k.m112240b(bVar, "onVerifyListener");
        C24501b.m59895a(kVar, aVar, bVar);
    }
}
