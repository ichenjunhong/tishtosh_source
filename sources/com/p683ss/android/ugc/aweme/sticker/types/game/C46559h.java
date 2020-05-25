package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.h */
final /* synthetic */ class C46559h implements OnClickListener {

    /* renamed from: a */
    private final C46557f f117472a;

    C46559h(C46557f fVar) {
        this.f117472a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C46557f fVar = this.f117472a;
        if (fVar.f117466a != null) {
            fVar.f117466a.mo93347a();
        }
    }
}
