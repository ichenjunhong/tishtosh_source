package com.p683ss.android.ugc.gamora.recorder.filter.p2471b;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.b.c */
public final class C49708c extends C12924i {

    /* renamed from: i */
    CompositeStoryFilterIndicator f124668i;

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        Activity v = mo24477v();
        C52711k.m112236a((Object) v, "requireActivity()");
        View inflate = v.getLayoutInflater().inflate(R.layout.bye, viewGroup, false);
        C52711k.m112236a((Object) inflate, "requireActivity().layout…icator, container, false)");
        return inflate;
    }
}
