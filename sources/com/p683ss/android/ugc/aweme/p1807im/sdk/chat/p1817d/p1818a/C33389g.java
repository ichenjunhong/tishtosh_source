package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a;

import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.a.g */
final /* synthetic */ class C33389g implements C1710e {

    /* renamed from: a */
    static final C1710e f86578a = new C33389g();

    private C33389g() {
    }

    public final void accept(Object obj) {
        C33377b bVar = (C33377b) obj;
        if (bVar != null) {
            try {
                C35284t.m79782a().f90620a.edit().putString("upload_image_auth_key", C35277o.m79761a(bVar)).commit();
            } catch (Exception unused) {
            }
        }
    }
}
