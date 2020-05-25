package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.utils.C47702b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.g */
final /* synthetic */ class C43533g implements Runnable {

    /* renamed from: a */
    private final InfoStickerEditView f110130a;

    C43533g(InfoStickerEditView infoStickerEditView) {
        this.f110130a = infoStickerEditView;
    }

    public final void run() {
        String str;
        C23089d dVar;
        String str2;
        C47702b bVar;
        String str3;
        InfoStickerEditView infoStickerEditView = this.f110130a;
        if (!(infoStickerEditView.f109937n == null || infoStickerEditView.f109937n.f109956a == null || infoStickerEditView.f109938o == -1 || infoStickerEditView.f109937n.f109957b == 2)) {
            if (infoStickerEditView.f109937n.f109957b == 1) {
                bVar = C47702b.f120193a;
                str2 = "prop_delete";
                dVar = C23089d.m56640a().mo47829a("creation_id", infoStickerEditView.f109933h.creationId).mo47826a("draft_id", infoStickerEditView.f109933h.draftId).mo47829a("enter_from", infoStickerEditView.f109906B ? "edit_post_page" : "video_edit_page").mo47829a("prop_id", infoStickerEditView.f109937n.f109956a.f110003d.stickerId);
                str = "shoot_way";
                str3 = infoStickerEditView.f109933h.mShootWay;
            } else if (infoStickerEditView.f109938o == 2) {
                bVar = C47702b.f120193a;
                str2 = "prop_adjust";
                dVar = C23089d.m56640a().mo47829a("creation_id", infoStickerEditView.f109933h.creationId).mo47826a("draft_id", infoStickerEditView.f109933h.draftId).mo47829a("enter_from", infoStickerEditView.f109906B ? "edit_post_page" : "video_edit_page").mo47829a("prop_id", infoStickerEditView.f109937n.f109956a.f110003d.stickerId).mo47829a("shoot_way", infoStickerEditView.f109933h.mShootWay);
                str = "enter_method";
                str3 = infoStickerEditView.f109937n.f109957b == 0 ? "finger_gesture" : "click_button";
            }
            bVar.mo94984a(str2, dVar.mo47829a(str, str3).f61491a);
        }
    }
}
