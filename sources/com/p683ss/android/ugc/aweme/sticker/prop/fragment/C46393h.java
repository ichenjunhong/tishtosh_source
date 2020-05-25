package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.h */
final /* synthetic */ class C46393h implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f117054a;

    C46393h(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f117054a = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        StickerPropDetailFragment stickerPropDetailFragment = this.f117054a;
        stickerPropDetailFragment.f72046u.scrollTo(0, -stickerPropDetailFragment.f72046u.getCurScrollY());
    }
}
