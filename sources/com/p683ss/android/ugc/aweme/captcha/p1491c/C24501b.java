package com.p683ss.android.ugc.aweme.captcha.p1491c;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1492ui.C24507a;

/* renamed from: com.ss.android.ugc.aweme.captcha.c.b */
public final class C24501b {
    /* renamed from: a */
    public static boolean m59896a(Exception exc) {
        if (!(exc instanceof C23459a) || ((C23459a) exc).getErrorCode() != 2155) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m59895a(C0654k kVar, C23459a aVar, C24493b bVar) {
        if (kVar != null) {
            String str = "";
            if (aVar != null) {
                str = aVar.getErrorMsg();
            }
            C24507a aVar2 = (C24507a) kVar.mo2224a("captcha");
            if (aVar2 == null) {
                aVar2 = new C24507a();
            }
            if (!aVar2.f64915j) {
                Bundle bundle = new Bundle();
                bundle.putString("title", str);
                aVar2.setArguments(bundle);
                aVar2.f64910e = bVar;
                aVar2.show(kVar, "captcha");
            }
        }
    }
}
