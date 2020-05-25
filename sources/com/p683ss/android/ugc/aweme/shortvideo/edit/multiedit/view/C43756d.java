package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.d */
public final class C43756d extends C43745b {
    /* renamed from: b */
    public final void mo89220b(C0794k<Float, Float> kVar) {
        C52711k.m112240b(kVar, "pair");
        mo89234m().mo87543a(kVar, false);
    }

    /* renamed from: a */
    public final void mo89213a(C0794k<Float, Float> kVar) {
        C52711k.m112240b(kVar, "pair");
        mo89234m().mo87546a(true, kVar);
    }

    /* renamed from: a */
    public final void mo89210a(FragmentActivity fragmentActivity, View view) {
        if (fragmentActivity != null && view != null) {
            super.mo89210a(fragmentActivity, view);
        }
    }

    /* renamed from: a */
    public final void mo89211a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends MediaModel> list, boolean z) {
        MediaModel mediaModel;
        if (!C9190h.m18253a(list)) {
            mo89234m().setExtractFramesInRoughMode(true);
            AbstractVideoEditView m = mo89234m();
            if (list != null) {
                mediaModel = (MediaModel) list.get(0);
            } else {
                mediaModel = null;
            }
            if (mediaModel == null) {
                C52711k.m112234a();
            }
            m.mo87551a(fragmentActivity, cutMultiVideoViewModel, mediaModel.f95383b);
            mo89237p().findViewById(R.id.e6s).setBackgroundColor(0);
            View findViewById = mo89237p().findViewById(R.id.e6o);
            C52711k.m112236a((Object) findViewById, "rootView.findViewById<View>(R.id.edit_bottom_view)");
            findViewById.setVisibility(8);
            mo89238q().setVisibility(0);
            LayoutParams layoutParams = mo89234m().getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = (int) C20141b.m49696a((Context) fragmentActivity, 70.0f);
                mo89234m().setLayoutParams(layoutParams2);
                mo89238q().setVisibility(8);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }
}
