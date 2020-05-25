package com.p683ss.android.ugc.aweme.photo.setfilter;

import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.g */
final /* synthetic */ class C38715g implements C1710e {

    /* renamed from: a */
    private final EffectPhotoSetFilterActivity f98490a;

    C38715g(EffectPhotoSetFilterActivity effectPhotoSetFilterActivity) {
        this.f98490a = effectPhotoSetFilterActivity;
    }

    public final void accept(Object obj) {
        EffectPhotoSetFilterActivity effectPhotoSetFilterActivity = this.f98490a;
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj;
        if (effectPhotoSetFilterActivity.f98459d != null) {
            C47702b.f120193a.mo94984a("click_filter_tab", C42438az.m93209a().mo86526a("creation_id", effectPhotoSetFilterActivity.f98459d.creationId).mo86526a("shoot_way", effectPhotoSetFilterActivity.f98459d.mShootWay).mo86526a("tab_name", effectCategoryResponse.getName()).mo86526a("content_source", effectPhotoSetFilterActivity.f98459d.getAvetParameter().getContentSource()).mo86526a("content_type", effectPhotoSetFilterActivity.f98459d.getAvetParameter().getContentType()).mo86526a("enter_from", "video_edit_page").mo86526a("scene_id", "1002").f107329a);
        }
    }
}
