package com.bytedance.android.livesdk.chatroom.p325ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dc */
final /* synthetic */ class C6076dc implements C1710e {

    /* renamed from: a */
    private final C6072db f16276a;

    C6076dc(C6072db dbVar) {
        this.f16276a = dbVar;
    }

    public final void accept(Object obj) {
        C6072db dbVar = this.f16276a;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && dbVar.f16254g) {
            dbVar.f16232C.setBackgroundDrawable(new BitmapDrawable(bitmap));
            C9432q.m18679a((View) dbVar.f16232C, -3, (int) C9432q.m18687b(C3922z.m9915e(), 106.0f));
            C9432q.m18680a((View) dbVar.f16232C, -3, (int) C9432q.m18687b(C3922z.m9915e(), 25.0f), -3, -3);
            dbVar.f16232C.setVisibility(0);
            C13833a aVar = (C13833a) dbVar.f16232C.getHierarchy();
            aVar.mo25898a(C13818b.f36061a);
            dbVar.f16232C.setHierarchy(aVar);
            C9432q.m18680a((View) dbVar.f16233D, -3, (int) C9432q.m18687b(C3922z.m9915e(), 75.0f), -3, -3);
            dbVar.f16233D.setVisibility(0);
            dbVar.f16233D.setBackgroundColor(-1);
            if (dbVar.f16237H != null) {
                dbVar.f16237H.setBackgroundColor(0);
            }
        }
    }
}
