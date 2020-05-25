package com.p683ss.android.ugc.aweme.infoSticker.category;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.category.c */
final /* synthetic */ class C35602c implements OnTouchListener {

    /* renamed from: a */
    private final C35595a f91507a;

    /* renamed from: b */
    private final InfoStickerTabItemView f91508b;

    C35602c(C35595a aVar, InfoStickerTabItemView infoStickerTabItemView) {
        this.f91507a = aVar;
        this.f91508b = infoStickerTabItemView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C35595a aVar = this.f91507a;
        aVar.f91497u.mo73985a(this.f91508b, view, motionEvent);
        return false;
    }
}
