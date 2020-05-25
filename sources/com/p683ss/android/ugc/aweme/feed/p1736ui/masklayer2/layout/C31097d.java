package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31079e;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d */
public final class C31097d extends FrameLayout {

    /* renamed from: a */
    public C31068i f81381a;

    /* renamed from: b */
    private IMContactDescItemLayout f81382b;

    /* renamed from: a */
    public final void mo63877a(C31079e eVar) {
        C52711k.m112240b(eVar, "item");
        this.f81381a = eVar.f81345b;
        this.f81382b.mo63868a(eVar.f81344a);
    }

    public C31097d(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.b5z, this);
        View findViewById = findViewById(R.id.a4i);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.desc_layout)");
        this.f81382b = (IMContactDescItemLayout) findViewById;
        setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C31097d f81383a;

            {
                this.f81383a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31068i iVar = this.f81383a.f81381a;
                if (iVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    iVar.mo63839b(view);
                }
            }
        });
    }
}
