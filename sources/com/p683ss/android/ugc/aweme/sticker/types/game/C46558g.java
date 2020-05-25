package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.g */
final /* synthetic */ class C46558g implements OnClickListener {

    /* renamed from: a */
    private final C46557f f117471a;

    C46558g(C46557f fVar) {
        this.f117471a = fVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C46557f fVar = this.f117471a;
        if (fVar.f117466a != null) {
            fVar.f117466a.mo93348b();
        }
    }
}
