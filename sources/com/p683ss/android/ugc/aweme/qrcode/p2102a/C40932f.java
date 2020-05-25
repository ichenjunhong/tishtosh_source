package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.qrcode.C40938b;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;
import com.p683ss.android.ugc.aweme.qrcode.p2106d.C41003a;
import com.p683ss.android.ugc.aweme.router.C41312z;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.f */
public final class C40932f extends C40922a {
    public C40932f(C40923a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo83412a(String str, int i) {
        int i2;
        String b = C41312z.m91072b(str, "schema_type");
        String b2 = C41312z.m91072b(str, "object_id");
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
            return false;
        }
        try {
            i2 = Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            i2 = 0;
        }
        this.f104146a = C40938b.m90530a(i2, b2);
        return this.f104147b.mo83411a(i2, b2, str, i, C41003a.m90629a(str));
    }
}
