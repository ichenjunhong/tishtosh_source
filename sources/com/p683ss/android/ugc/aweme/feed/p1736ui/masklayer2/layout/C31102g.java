package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31052a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.g */
public final class C31102g extends ConstraintLayout {

    /* renamed from: h */
    public C31052a f81389h;

    /* renamed from: i */
    private AutoRTLImageView f81390i;

    public C31102g(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.b65, this);
        View findViewById = findViewById(R.id.ay9);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.iv_back)");
        this.f81390i = (AutoRTLImageView) findViewById;
        this.f81390i.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C31102g f81391a;

            {
                this.f81391a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31052a aVar = this.f81391a.f81389h;
                if (aVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    aVar.mo63839b(view);
                }
            }
        });
        setOnClickListener(C311042.f81392a);
    }
}
