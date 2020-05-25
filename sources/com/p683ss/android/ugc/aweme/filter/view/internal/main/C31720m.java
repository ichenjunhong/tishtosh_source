package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.m */
public final class C31720m extends C1352v {

    /* renamed from: a */
    final ImageView f82851a;

    /* renamed from: b */
    public final AVDmtImageTextView f82852b;

    /* renamed from: c */
    ObjectAnimator f82853c;

    /* renamed from: d */
    public C31459g f82854d;

    /* renamed from: e */
    public C31494g f82855e = C31494g.FILTER_STATE_UNKNOWN;

    /* renamed from: f */
    public final C52682m<C31459g, C31494g, C52860x> f82856f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo64604a() {
        ObjectAnimator objectAnimator = this.f82853c;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f82851a;
        C52711k.m112236a((Object) imageView, "ivDownload");
        imageView.setRotation(0.0f);
        this.f82851a.setImageResource(R.drawable.ec);
    }

    public C31720m(View view, C52682m<? super C31459g, ? super C31494g, C52860x> mVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(mVar, "clickListener");
        super(view);
        this.f82856f = mVar;
        this.f82851a = (ImageView) view.findViewById(R.id.b0b);
        this.f82852b = (AVDmtImageTextView) view.findViewById(R.id.avq);
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C31720m f82857a;

            {
                this.f82857a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f82857a.getAdapterPosition() != -1) {
                    C31459g gVar = this.f82857a.f82854d;
                    if (gVar != null) {
                        this.f82857a.f82852b.mo93974c(false);
                        this.f82857a.f82856f.invoke(gVar, this.f82857a.f82855e);
                    }
                }
            }
        });
    }
}
