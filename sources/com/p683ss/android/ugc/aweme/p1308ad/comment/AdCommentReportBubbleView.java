package com.p683ss.android.ugc.aweme.p1308ad.comment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.AdCommentReportBubbleView */
public final class AdCommentReportBubbleView extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    C26138s f60141a;

    /* renamed from: b */
    Aweme f60142b;

    /* renamed from: c */
    DmtTextView f60143c;

    /* renamed from: d */
    private C22333a f60144d;

    /* renamed from: e */
    private DmtTextView f60145e;

    /* renamed from: f */
    private DmtTextView f60146f;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.AdCommentReportBubbleView$a */
    public interface C22333a {
        /* renamed from: a */
        void mo46489a();

        /* renamed from: b */
        void mo46490b();

        /* renamed from: c */
        void mo46491c();
    }

    public final void setInnerClick(C22333a aVar) {
        this.f60144d = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        int id = view.getId();
        if (id == R.id.eku) {
            C22333a aVar = this.f60144d;
            if (aVar != null) {
                aVar.mo46490b();
            }
        } else if (id == R.id.ena) {
            C22333a aVar2 = this.f60144d;
            if (aVar2 != null) {
                aVar2.mo46489a();
            }
        } else if (id == R.id.cbk) {
            C22333a aVar3 = this.f60144d;
            if (aVar3 != null) {
                aVar3.mo46491c();
            }
        }
    }

    public AdCommentReportBubbleView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b5g, this, true);
        this.f60145e = (DmtTextView) inflate.findViewById(R.id.eku);
        this.f60146f = (DmtTextView) inflate.findViewById(R.id.ena);
        this.f60143c = (DmtTextView) inflate.findViewById(R.id.cbk);
        DmtTextView dmtTextView = this.f60145e;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(this);
        }
        DmtTextView dmtTextView2 = this.f60146f;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(this);
        }
        DmtTextView dmtTextView3 = this.f60143c;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(this);
        }
    }

    public /* synthetic */ AdCommentReportBubbleView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
