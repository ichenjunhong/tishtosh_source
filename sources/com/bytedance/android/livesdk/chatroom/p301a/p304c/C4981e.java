package com.bytedance.android.livesdk.chatroom.p301a.p304c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.e */
final /* synthetic */ class C4981e implements C1710e {

    /* renamed from: a */
    private final C4974a f13362a;

    /* renamed from: b */
    private final TextImageModel f13363b;

    C4981e(C4974a aVar, TextImageModel textImageModel) {
        this.f13362a = aVar;
        this.f13363b = textImageModel;
    }

    public final void accept(Object obj) {
        C4974a aVar = this.f13362a;
        TextImageModel textImageModel = this.f13363b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            aVar.f13350g.setVisibility(8);
            aVar.f13351h.setVisibility(8);
            return;
        }
        aVar.f13350g.setImageBitmap(bitmap.copy(Config.ARGB_8888, true));
        aVar.f13351h.setText(textImageModel.f23707a);
        aVar.f13351h.setTextColor(textImageModel.f23708b);
        aVar.f13350g.setVisibility(0);
        aVar.f13351h.setVisibility(0);
        if (aVar.f13345b != null) {
            aVar.f13345b.mo105545a(aVar.f13344a);
        }
    }
}
