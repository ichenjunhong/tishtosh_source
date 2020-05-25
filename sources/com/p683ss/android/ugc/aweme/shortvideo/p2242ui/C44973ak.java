package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.graphics.Bitmap;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ak */
final /* synthetic */ class C44973ak implements C0011g {

    /* renamed from: a */
    private final C44971ai f113903a;

    C44973ak(C44971ai aiVar) {
        this.f113903a = aiVar;
    }

    public final Object then(C0013i iVar) {
        C44971ai aiVar = this.f113903a;
        if (!(iVar.mo34e() == null || ((Bitmap) iVar.mo34e()).isRecycled() || aiVar.f113899d == null)) {
            aiVar.f113899d.setImageBitmap((Bitmap) iVar.mo34e());
        }
        return null;
    }
}
