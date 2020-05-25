package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.g */
final /* synthetic */ class C46392g implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f117053a;

    C46392g(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f117053a = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        StickerPropDetailFragment stickerPropDetailFragment = this.f117053a;
        if (stickerPropDetailFragment.f117008b != null) {
            stickerPropDetailFragment.f117003a = false;
            stickerPropDetailFragment.mo93103e();
            stickerPropDetailFragment.mTitleFavoriteBtn.mo76959b();
        }
    }
}
