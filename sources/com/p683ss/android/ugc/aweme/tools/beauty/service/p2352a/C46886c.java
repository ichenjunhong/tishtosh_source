package com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a;

import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p683ss.android.ugc.aweme.tools.beauty.C46871e;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46893b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.c */
public final class C46886c implements C46893b {

    /* renamed from: a */
    public final AVETParameter f118445a;

    public C46886c(AVETParameter aVETParameter) {
        C52711k.m112240b(aVETParameter, "etParameter");
        this.f118445a = aVETParameter;
    }

    /* renamed from: a */
    public final void mo94166a(ComposerBeauty composerBeauty) {
        if (composerBeauty != null) {
            C47702b.f120193a.mo94984a("click_beautify_tab", m101810a(composerBeauty, this.f118445a).f107329a);
        }
    }

    /* renamed from: a */
    public static C42438az m101811a(AVETParameter aVETParameter) {
        C42438az a = C42438az.m93209a().mo86526a("creation_id", aVETParameter.getCreationId()).mo86526a("shoot_way", aVETParameter.getShootWay()).mo86526a("content_source", aVETParameter.getContentSource()).mo86526a("content_type", aVETParameter.getContentType()).mo86526a("enter_from", "video_shoot_page");
        C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…l.ENTER_FROM, ENTER_FROM)");
        return a;
    }

    /* renamed from: b */
    public final void mo94168b(ComposerBeauty composerBeauty) {
        if (composerBeauty != null) {
            C47702b.f120193a.mo94984a("select_beautify", m101810a(composerBeauty, this.f118445a).mo86526a("beautify_value", String.valueOf(((float) composerBeauty.getProgressValue()) / 100.0f)).f107329a);
        }
    }

    /* renamed from: c */
    public final void mo94169c(ComposerBeauty composerBeauty) {
        if (composerBeauty != null) {
            C47702b.f120193a.mo94984a("reset_beautify", m101810a(composerBeauty, this.f118445a).mo86526a("beautify_value", String.valueOf(composerBeauty.getProgressValue() / 100)).f107329a);
        }
    }

    /* renamed from: a */
    public final void mo94167a(BeautyCategory beautyCategory) {
        if (beautyCategory != null) {
            C47702b.f120193a.mo94984a("click_beautify_category", m101811a(this.f118445a).mo86526a("beautify_category_id", beautyCategory.getCategoryResponse().getId()).mo86526a("beautify_category_name", beautyCategory.getCategoryResponse().getName()).f107329a);
        }
    }

    /* renamed from: a */
    private final C42438az m101810a(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
        C42438az a = m101811a(aVETParameter);
        if (C46871e.m101789a(composerBeauty)) {
            a.mo86526a("beautify_name_parent", composerBeauty.getParentName()).mo86526a("beautify_id_parent", composerBeauty.getParentId()).mo86526a("beautify_name_child", composerBeauty.getEffect().getName()).mo86526a("beautify_id_child", composerBeauty.getEffect().getEffectId());
        } else {
            a.mo86526a("beautify_name_parent", composerBeauty.getEffect().getName()).mo86526a("beautify_id_parent", composerBeauty.getEffect().getEffectId());
        }
        return a;
    }
}
