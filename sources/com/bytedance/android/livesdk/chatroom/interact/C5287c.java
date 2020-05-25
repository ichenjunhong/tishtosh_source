package com.bytedance.android.livesdk.chatroom.interact;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5330c;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.c */
final /* synthetic */ class C5287c implements OnClickListener {

    /* renamed from: a */
    private final C5249a f14142a;

    C5287c(C5249a aVar) {
        this.f14142a = aVar;
    }

    public final void onClick(View view) {
        C5249a aVar = this.f14142a;
        if (aVar.f14031l) {
            if (aVar.f14021a == 1 && aVar.f14032m != null && (aVar.f14032m instanceof C5330c)) {
                ((C5330c) aVar.f14032m).mo11226a();
            }
            aVar.dismiss();
        }
    }
}
