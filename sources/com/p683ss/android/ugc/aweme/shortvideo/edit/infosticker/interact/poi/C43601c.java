package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.view.ViewGroup.LayoutParams;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.c */
final /* synthetic */ class C43601c implements Runnable {

    /* renamed from: a */
    private final PoiStickerView f110337a;

    C43601c(PoiStickerView poiStickerView) {
        this.f110337a = poiStickerView;
    }

    public final void run() {
        PoiStickerView poiStickerView = this.f110337a;
        if (poiStickerView.f110327a.getTextViewWidth() > poiStickerView.f110328b) {
            LayoutParams layoutParams = poiStickerView.f110327a.getLayoutParams();
            layoutParams.width = poiStickerView.f110330d;
            poiStickerView.f110327a.setLayoutParams(layoutParams);
            poiStickerView.f110327a.setTextSize(poiStickerView.f110329c * 0.75f);
            poiStickerView.f110327a.post(new C43602d(poiStickerView));
        }
        poiStickerView.mo88875f();
    }
}
