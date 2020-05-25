package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView */
public final class ConnectedRelationView extends FrameLayout {

    /* renamed from: a */
    private final View f103102a;

    /* renamed from: b */
    private final ImageView f103103b;

    /* renamed from: c */
    private final ImageView f103104c;

    /* renamed from: d */
    private final DmtTextView f103105d;

    public ConnectedRelationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ConnectedRelationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ConnectedRelationView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.auf, this);
        C52711k.m112236a((Object) inflate, "View.inflate(context, R.…cted_relation_view, this)");
        this.f103102a = inflate;
        View findViewById = this.f103102a.findViewById(R.id.aqa);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.icon)");
        this.f103103b = (ImageView) findViewById;
        View findViewById2 = this.f103102a.findViewById(R.id.bmy);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById(R.id.more)");
        this.f103104c = (ImageView) findViewById2;
        View findViewById3 = this.f103102a.findViewById(R.id.deg);
        C52711k.m112236a((Object) findViewById3, "mRootView.findViewById(R.id.tv_recommend_reason)");
        this.f103105d = (DmtTextView) findViewById3;
    }

    public /* synthetic */ ConnectedRelationView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
