package com.bytedance.android.livesdk.chatroom.p301a.p304c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bytedance.android.live.base.model.user.FansClubData;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.c */
final /* synthetic */ class C4979c implements C1710e {

    /* renamed from: a */
    private final C4974a f13359a;

    /* renamed from: b */
    private final FansClubData f13360b;

    C4979c(C4974a aVar, FansClubData fansClubData) {
        this.f13359a = aVar;
        this.f13360b = fansClubData;
    }

    public final void accept(Object obj) {
        C4974a aVar = this.f13359a;
        FansClubData fansClubData = this.f13360b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            aVar.f13348e.setVisibility(8);
            aVar.f13349f.setVisibility(8);
            return;
        }
        aVar.f13348e.setImageBitmap(bitmap.copy(Config.ARGB_8888, true));
        aVar.f13349f.setText(fansClubData.clubName);
        aVar.f13348e.setVisibility(0);
        aVar.f13349f.setVisibility(0);
        if (aVar.f13345b != null) {
            aVar.f13345b.mo105545a(aVar.f13344a);
        }
    }
}
