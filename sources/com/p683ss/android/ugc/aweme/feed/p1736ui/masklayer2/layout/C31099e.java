package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31082h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.e */
public final class C31099e extends FrameLayout {

    /* renamed from: a */
    public C31068i f81384a;

    /* renamed from: b */
    private OptionDescItemLayout f81385b;

    /* renamed from: a */
    public final void mo63879a(C31082h hVar) {
        C52711k.m112240b(hVar, "item");
        this.f81384a = hVar.f81347b;
        this.f81385b.mo63869a(hVar.f81346a);
    }

    public C31099e(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.b64, this);
        View findViewById = findViewById(R.id.a4i);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.desc_layout)");
        this.f81385b = (OptionDescItemLayout) findViewById;
        setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C31099e f81386a;

            {
                this.f81386a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31068i iVar = this.f81386a.f81384a;
                if (iVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    iVar.mo63839b(view);
                }
            }
        });
    }
}
