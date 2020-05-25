package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.h */
final /* synthetic */ class C46753h implements OnClickListener {

    /* renamed from: a */
    private final TextStickerInputLayout f118061a;

    C46753h(TextStickerInputLayout textStickerInputLayout) {
        this.f118061a = textStickerInputLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        TextStickerInputLayout textStickerInputLayout = this.f118061a;
        if (textStickerInputLayout.f117952x != null) {
            textStickerInputLayout.f117952x.mo93689a(true);
        }
        if (textStickerInputLayout.f117946r != null) {
            textStickerInputLayout.f117946r.mo90860a(textStickerInputLayout.getTextWrap());
        }
    }
}
