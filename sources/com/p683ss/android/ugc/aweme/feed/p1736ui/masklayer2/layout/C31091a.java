package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31077c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a.C31068i;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.a */
public final class C31091a extends LinearLayout {

    /* renamed from: a */
    public C31068i f81369a;

    /* renamed from: b */
    public C31068i f81370b;

    /* renamed from: c */
    private OptionDescItemLayout f81371c;

    /* renamed from: d */
    private LinearLayout f81372d;

    /* renamed from: e */
    private DmtTextView f81373e;

    /* renamed from: a */
    public final void mo63870a(C31077c cVar) {
        C52711k.m112240b(cVar, "item");
        this.f81369a = cVar.f81340b;
        this.f81370b = cVar.f81341c;
        this.f81371c.mo63869a(cVar.f81339a);
    }

    public C31091a(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.b62, this);
        View findViewById = findViewById(R.id.a4i);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.desc_layout)");
        this.f81371c = (OptionDescItemLayout) findViewById;
        View findViewById2 = findViewById(R.id.elp);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.more_layout)");
        this.f81372d = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.f3e);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.tv_more)");
        this.f81373e = (DmtTextView) findViewById3;
        TextPaint paint = this.f81373e.getPaint();
        C52711k.m112236a((Object) paint, "mTvMore.paint");
        paint.setFakeBoldText(true);
        this.f81371c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C31091a f81374a;

            {
                this.f81374a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31068i iVar = this.f81374a.f81369a;
                if (iVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    iVar.mo63839b(view);
                }
            }
        });
        this.f81372d.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C31091a f81375a;

            {
                this.f81375a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31068i iVar = this.f81375a.f81370b;
                if (iVar != null) {
                    C52711k.m112236a((Object) view, "it");
                    iVar.mo63839b(view);
                }
            }
        });
    }
}
