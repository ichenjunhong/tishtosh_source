package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.i */
final /* synthetic */ class C46754i implements OnClickListener {

    /* renamed from: a */
    private final TextStickerInputLayout f118062a;

    C46754i(TextStickerInputLayout textStickerInputLayout) {
        this.f118062a = textStickerInputLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        TextStickerInputLayout textStickerInputLayout = this.f118062a;
        if (textStickerInputLayout.f117952x != null) {
            textStickerInputLayout.f117952x.mo93689a(false);
        }
    }
}
