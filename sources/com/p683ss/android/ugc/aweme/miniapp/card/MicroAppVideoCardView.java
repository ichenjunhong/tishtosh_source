package com.p683ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView */
public class MicroAppVideoCardView extends ConstraintLayout {

    /* renamed from: h */
    public boolean f94222h;

    /* renamed from: i */
    C36866a f94223i;

    /* renamed from: j */
    private View f94224j;

    /* renamed from: k */
    private AnimatedImageView f94225k;

    /* renamed from: l */
    private DmtTextView f94226l;

    /* renamed from: m */
    private DmtTextView f94227m;

    /* renamed from: n */
    private DmtTextView f94228n;

    /* renamed from: o */
    private ImageView f94229o;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView$a */
    interface C36866a {
    }

    public void setOnClickCloseListener(C36866a aVar) {
        this.f94223i = aVar;
    }

    public MicroAppVideoCardView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo76062a(boolean z, Aweme aweme) {
        this.f94222h = z;
        setVisibility(8);
    }

    public MicroAppVideoCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MicroAppVideoCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f94224j = LayoutInflater.from(context).inflate(R.layout.b71, this);
        this.f94225k = (AnimatedImageView) this.f94224j.findViewById(R.id.bm2);
        this.f94229o = (ImageView) this.f94224j.findViewById(R.id.bm0);
        this.f94227m = (DmtTextView) this.f94224j.findViewById(R.id.bm1);
        this.f94226l = (DmtTextView) this.f94224j.findViewById(R.id.bm3);
        this.f94228n = (DmtTextView) this.f94224j.findViewById(R.id.blz);
    }
}
