package com.p683ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b */
final /* synthetic */ class C46091b implements OnClickListener {

    /* renamed from: a */
    private final EffectStickerViewImpl f116316a;

    C46091b(EffectStickerViewImpl effectStickerViewImpl) {
        this.f116316a = effectStickerViewImpl;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f116316a.mo92749a(view);
    }
}
