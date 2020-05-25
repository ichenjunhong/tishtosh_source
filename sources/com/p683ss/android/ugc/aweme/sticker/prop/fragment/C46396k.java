package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a;
import com.p683ss.android.ugc.aweme.sticker.model.C46067b;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.k */
final /* synthetic */ class C46396k implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f117057a;

    /* renamed from: b */
    private final C46067b f117058b;

    C46396k(StickerPropDetailFragment stickerPropDetailFragment, C46067b bVar) {
        this.f117057a = stickerPropDetailFragment;
        this.f117058b = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        StickerPropDetailFragment stickerPropDetailFragment = this.f117057a;
        C46067b bVar = this.f117058b;
        C26890h.m65011a("click_link", new C23089d().mo47829a("enter_from", "prop_page").mo47829a("type", "web_link").mo47829a("prop_id", bVar.getId()).f61491a);
        C27170a.m65584a("click_variable_button", bVar.getId(), null);
        if (!C26540w.m64226a(stickerPropDetailFragment.getContext(), bVar.getDetailOpenUrl(), false)) {
            C26540w.m64222a(stickerPropDetailFragment.getContext(), bVar.getDetailWebUrl(), bVar.getDetailWebUrlTitle());
        }
    }
}
