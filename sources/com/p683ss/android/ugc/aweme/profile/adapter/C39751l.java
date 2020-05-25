package com.p683ss.android.ugc.aweme.profile.adapter;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.l */
final /* synthetic */ class C39751l implements IGetInfoCallback {

    /* renamed from: a */
    private final C39744e f101481a;

    C39751l(C39744e eVar) {
        this.f101481a = eVar;
    }

    public final void finish(Object obj) {
        C39744e eVar = this.f101481a;
        Bitmap bitmap = (Bitmap) obj;
        if (eVar.f101470b != null && bitmap != null) {
            eVar.f101470b.setImageBitmap(bitmap);
        }
    }
}
