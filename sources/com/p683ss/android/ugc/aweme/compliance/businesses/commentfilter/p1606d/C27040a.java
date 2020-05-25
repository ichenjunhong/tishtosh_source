package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1606d;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.d.a */
public final class C27040a extends C1352v {

    /* renamed from: a */
    public long f71363a;

    /* renamed from: b */
    public final View f71364b;

    /* renamed from: c */
    public final ImageView f71365c;

    /* renamed from: d */
    public final View f71366d;

    /* renamed from: e */
    public final OnClickListener f71367e;

    public C27040a(View view, OnClickListener onClickListener) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(onClickListener, "listener");
        super(view);
        this.f71366d = view;
        this.f71367e = onClickListener;
        View findViewById = this.f71366d.findViewById(R.id.a6e);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.div)");
        this.f71364b = findViewById;
        View findViewById2 = this.f71366d.findViewById(R.id.aqa);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.icon)");
        this.f71365c = (ImageView) findViewById2;
        View view2 = this.f71364b;
        Context context = this.f71366d.getContext();
        C52711k.m112236a((Object) context, "view.context");
        view2.setBackgroundColor(context.getResources().getColor(R.color.j1));
        this.f71366d.setOnTouchListener(new C28515aw(this) {

            /* renamed from: a */
            final /* synthetic */ C27040a f71368a;

            {
                this.f71368a = r1;
            }

            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                C52711k.m112240b(view, "view");
                C52711k.m112240b(motionEvent, "event");
                if (System.currentTimeMillis() - this.f71368a.f71363a >= 500) {
                    this.f71368a.f71363a = System.currentTimeMillis();
                    view.requestFocus();
                    this.f71368a.f71367e.onClick(view);
                }
            }
        });
    }
}
