package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1824a.C33593a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33597a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33599c;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.v */
final /* synthetic */ class C35303v implements C0011g {

    /* renamed from: a */
    private final C33593a f90643a;

    /* renamed from: b */
    private final int f90644b;

    C35303v(C33593a aVar, int i) {
        this.f90643a = aVar;
        this.f90644b = i;
    }

    public final Object then(C0013i iVar) {
        C33593a aVar = this.f90643a;
        int i = this.f90644b;
        if (iVar == null || iVar.mo33d() || iVar.mo34e() == null) {
            aVar.mo70990a();
        } else {
            C33597a aVar2 = (C33597a) iVar.mo34e();
            if (aVar2.status_code != 0 || aVar2.f87076a == null) {
                aVar.mo70990a();
            } else {
                C33599c cVar = aVar2.f87076a;
                if (i <= 0) {
                    aVar.mo70992b(cVar);
                } else {
                    aVar.mo70991a(cVar);
                }
            }
        }
        return null;
    }
}
