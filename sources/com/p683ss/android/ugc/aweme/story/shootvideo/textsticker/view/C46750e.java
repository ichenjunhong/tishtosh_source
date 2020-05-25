package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.e */
final /* synthetic */ class C46750e implements OnClickListener {

    /* renamed from: a */
    private final TextStickerInputLayout f118058a;

    C46750e(TextStickerInputLayout textStickerInputLayout) {
        this.f118058a = textStickerInputLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f118058a.mo93835a(view);
    }
}
