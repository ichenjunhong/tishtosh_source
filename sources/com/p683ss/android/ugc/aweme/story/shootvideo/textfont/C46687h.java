package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.h */
final /* synthetic */ class C46687h implements OnClickListener {

    /* renamed from: a */
    private final TextSelectFontStyleLayout f117767a;

    /* renamed from: b */
    private final TextFontTypeLayout f117768b;

    C46687h(TextSelectFontStyleLayout textSelectFontStyleLayout, TextFontTypeLayout textFontTypeLayout) {
        this.f117767a = textSelectFontStyleLayout;
        this.f117768b = textFontTypeLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        TextSelectFontStyleLayout textSelectFontStyleLayout = this.f117767a;
        TextFontTypeLayout textFontTypeLayout = this.f117768b;
        if (textFontTypeLayout.getFontData() != null) {
            textSelectFontStyleLayout.f117733a = textFontTypeLayout.getFontData().f117747e;
        }
        if (textFontTypeLayout.mo93600c()) {
            textSelectFontStyleLayout.mo93608a(textFontTypeLayout.getFontData());
        }
    }
}
