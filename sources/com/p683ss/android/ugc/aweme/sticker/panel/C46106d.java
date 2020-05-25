package com.p683ss.android.ugc.aweme.sticker.panel;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.d */
final /* synthetic */ class C46106d implements OnClickListener {

    /* renamed from: a */
    private final EffectStickerViewImpl f116355a;

    /* renamed from: b */
    private final C46194l f116356b;

    C46106d(EffectStickerViewImpl effectStickerViewImpl, C46194l lVar) {
        this.f116355a = effectStickerViewImpl;
        this.f116356b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EffectStickerViewImpl effectStickerViewImpl = this.f116355a;
        C46194l lVar = this.f116356b;
        if (!effectStickerViewImpl.f116272r) {
            C50275d.m108539b((Context) effectStickerViewImpl.f116257c, effectStickerViewImpl.f116257c.getResources().getString(R.string.d51)).mo98174a();
            return;
        }
        if (!((GameResultViewModel) C0214z.m440a((FragmentActivity) effectStickerViewImpl.f116257c).mo359a(GameResultViewModel.class)).f117441a) {
            effectStickerViewImpl.f116263i.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new C46167f(effectStickerViewImpl)).withEndAction(new C46168g(effectStickerViewImpl)).start();
            if (lVar.f116547b != null) {
                lVar.f116547b.invoke(effectStickerViewImpl.f116263i);
            }
        }
    }
}
