package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.share.C41941ab.C41954b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.m */
final /* synthetic */ class C46398m implements C41954b {

    /* renamed from: a */
    private final StickerPropDetailFragment f117060a;

    C46398m(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f117060a = stickerPropDetailFragment;
    }

    /* renamed from: a */
    public final void mo60019a(String str, Effect effect) {
        StickerPropDetailFragment stickerPropDetailFragment = this.f117060a;
        if (stickerPropDetailFragment.f117011e) {
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", str).mo47829a("shoot_way", "green_screen").mo47829a("group_id", stickerPropDetailFragment.f117010d).mo47829a("log_pb", stickerPropDetailFragment.f117009c).mo47829a("enter_from", "green_screen_page").f61491a);
        } else {
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", str).mo47829a("shoot_way", "prop_page").mo47829a("prop_id", effect.getEffectId()).mo47829a("group_id", stickerPropDetailFragment.f117010d).mo47829a("log_pb", stickerPropDetailFragment.f117009c).mo47829a("enter_from", "prop_page").mo47829a("enter_method", "click_prop_publish").f61491a);
        }
    }
}
