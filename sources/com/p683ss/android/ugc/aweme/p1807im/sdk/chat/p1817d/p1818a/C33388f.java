package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.a.f */
final /* synthetic */ class C33388f implements C2205y {

    /* renamed from: a */
    private final C33380e f86576a;

    /* renamed from: b */
    private final boolean f86577b;

    C33388f(C33380e eVar, boolean z) {
        this.f86576a = eVar;
        this.f86577b = z;
    }

    public final void subscribe(C2204x xVar) {
        C33380e eVar = this.f86576a;
        boolean z = this.f86577b;
        String string = C35284t.m79782a().f90620a.getString("upload_image_auth_key", null);
        if (!z && !TextUtils.isEmpty(string)) {
            C33377b bVar = (C33377b) C35277o.m79760a(string, C33377b.class);
            if (!(SystemClock.uptimeMillis() > Math.min(bVar.getInnerImageConfig().expireAt, bVar.getPublicImageConfig().expireAt))) {
                xVar.mo6282a(bVar);
            }
        }
        xVar.mo6273a();
    }
}
