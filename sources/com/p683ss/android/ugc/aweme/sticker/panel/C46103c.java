package com.p683ss.android.ugc.aweme.sticker.panel;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2262a.C45593a;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.panel.search.C46258a;
import com.p683ss.android.ugc.aweme.sticker.panel.search.C46258a.C46272m;
import com.p683ss.android.ugc.aweme.sticker.panel.search.C46258a.C46273n;
import com.p683ss.android.ugc.aweme.sticker.panel.search.SearchStickerViewModel;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.c */
final /* synthetic */ class C46103c implements OnClickListener {

    /* renamed from: a */
    private final EffectStickerViewImpl f116349a;

    C46103c(EffectStickerViewImpl effectStickerViewImpl) {
        this.f116349a = effectStickerViewImpl;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EffectStickerViewImpl effectStickerViewImpl = this.f116349a;
        effectStickerViewImpl.f116270p.mo92479a();
        C46258a aVar = effectStickerViewImpl.f116260f;
        ((SearchStickerViewModel) C0214z.m440a((FragmentActivity) aVar.f116721i).mo359a(SearchStickerViewModel.class)).f116711b.setValue(Boolean.valueOf(true));
        View view2 = aVar.f116714b;
        if (view2 == null) {
            C52711k.m112237a("curView");
        }
        view2.setVisibility(0);
        View view3 = aVar.f116714b;
        if (view3 == null) {
            C52711k.m112237a("curView");
        }
        view3.setAlpha(1.0f);
        AVStatusView aVStatusView = aVar.f116717e;
        if (aVStatusView == null) {
            C52711k.m112237a("statusView");
        }
        aVStatusView.mo98093a();
        EditText editText = aVar.f116716d;
        if (editText == null) {
            C52711k.m112237a("searchEditText");
        }
        editText.setText("");
        EditText editText2 = aVar.f116716d;
        if (editText2 == null) {
            C52711k.m112237a("searchEditText");
        }
        editText2.requestFocus();
        aVar.f116719g.mo64318a((List<? extends StickerWrapper>) new ArrayList<Object>());
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(200);
        C52711k.m112236a((Object) duration, "animator");
        duration.setInterpolator(new C45593a(0.15f, 0.12f, 1.0f, 0.0f));
        duration.addUpdateListener(new C46272m(aVar));
        duration.addListener(new C46273n(aVar));
        duration.start();
        aVar.f116724l.mo92765a();
    }
}
