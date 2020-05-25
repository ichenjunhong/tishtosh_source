package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46714c;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.k */
final /* synthetic */ class C46756k implements OnClickListener {

    /* renamed from: a */
    private final TextStickerInputLayout f118064a;

    C46756k(TextStickerInputLayout textStickerInputLayout) {
        this.f118064a = textStickerInputLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        TextStickerInputLayout textStickerInputLayout = this.f118064a;
        C46714c a = C46714c.m101387a();
        a.f117843b++;
        if (a.f117843b == a.f117842a.size()) {
            a.f117843b = 0;
        }
        textStickerInputLayout.f117939k.setBackground(C42430at.m93199a(C46714c.m101387a().mo93786b().f117838a));
    }
}
