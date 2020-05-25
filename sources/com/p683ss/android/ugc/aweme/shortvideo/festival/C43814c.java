package com.p683ss.android.ugc.aweme.shortvideo.festival;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.c */
final /* synthetic */ class C43814c implements OnClickListener {

    /* renamed from: a */
    private final ImageView f110959a;

    C43814c(ImageView imageView) {
        this.f110959a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f110959a.performClick();
    }
}
