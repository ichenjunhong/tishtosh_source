package com.p683ss.android.ugc.aweme.music.p1970a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.detail.C27383j;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.a.b */
public final class C37226b implements C27383j {

    /* renamed from: a */
    public final View f95050a = this.f95053d.findViewById(R.id.csc);

    /* renamed from: b */
    public final TextView f95051b = ((TextView) this.f95053d.findViewById(R.id.csf));

    /* renamed from: c */
    public final Context f95052c;

    /* renamed from: d */
    public final ViewGroup f95053d;

    /* renamed from: b */
    public final void mo55760b(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        View view = this.f95050a;
        if (view != null) {
            view.clearAnimation();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public final void mo55759a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        TextView textView = this.f95051b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view = this.f95050a;
        if (view != null && view.getAnimation() == null) {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.fi));
            aVar.invoke();
        }
    }

    public C37226b(Context context, ViewGroup viewGroup) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "viewGroup");
        this.f95052c = context;
        this.f95053d = viewGroup;
    }
}
