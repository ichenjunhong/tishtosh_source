package com.p683ss.android.ugc.aweme.sticker;

import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.sticker.p2284h.C45892a;

/* renamed from: com.ss.android.ugc.aweme.sticker.IStickerViewService */
public interface IStickerViewService {

    /* renamed from: com.ss.android.ugc.aweme.sticker.IStickerViewService$a */
    public interface C45803a {
        /* renamed from: a */
        void mo74857a(FaceSticker faceSticker);

        /* renamed from: b */
        void mo74858b(FaceSticker faceSticker);
    }

    void hideStickerView();

    boolean isShowStickerView();

    void setPixelLoopStickerPresenterSupplier(C17432q<C45892a> qVar);

    void showStickerView(AppCompatActivity appCompatActivity, C0654k kVar, String str, FrameLayout frameLayout, C45803a aVar);
}
