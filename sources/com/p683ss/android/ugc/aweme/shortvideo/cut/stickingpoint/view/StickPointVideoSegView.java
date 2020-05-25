package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43025i;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView */
public final class StickPointVideoSegView extends FrameLayout {

    /* renamed from: a */
    public C43025i f108785a;

    /* renamed from: b */
    private View f108786b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView$a */
    static final class C43091a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointVideoSegView f108787a;

        C43091a(StickPointVideoSegView stickPointVideoSegView) {
            this.f108787a = stickPointVideoSegView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43025i iVar = this.f108787a.f108785a;
            if (iVar != null) {
                iVar.mo87325a(view);
            }
        }
    }

    public StickPointVideoSegView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickPointVideoSegView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setStickPointVideoSegListener(C43025i iVar) {
        C52711k.m112240b(iVar, "listener");
        this.f108785a = iVar;
    }

    public final void setButtonClickable(boolean z) {
        View view = this.f108786b;
        if (view == null) {
            C52711k.m112237a("contentView");
        }
        if (view != null) {
            View view2 = this.f108786b;
            if (view2 == null) {
                C52711k.m112237a("contentView");
            }
            View findViewById = view2.findViewById(R.id.cv9);
            C52711k.m112236a((Object) findViewById, "contentView.findViewById<View>(R.id.sure_view)");
            findViewById.setClickable(z);
        }
    }

    public StickPointVideoSegView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.a89, this);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…int_video_seg_view, this)");
        this.f108786b = inflate;
        View view = this.f108786b;
        if (view == null) {
            C52711k.m112237a("contentView");
        }
        view.findViewById(R.id.cv9).setOnClickListener(new C43091a(this));
    }

    public /* synthetic */ StickPointVideoSegView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
