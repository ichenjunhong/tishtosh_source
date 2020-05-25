package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.er */
public final class C30964er extends C31009h {

    /* renamed from: a */
    private View f81093a;

    /* renamed from: b */
    private DmtTextView f81094b;

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
    }

    public C30964er(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f81093a = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b7i);
            this.f81094b = (DmtTextView) this.f81093a.findViewById(R.id.esa);
            frameLayout.addView(this.f81093a);
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        if (this.f81192l == null) {
            C23729p.m58257a(this.f81093a, 8);
            return;
        }
        this.f81093a.setOnClickListener(new C30965es(this, C11010c.m22280a()));
        if (this.f81192l.isProhibitedAndShouldTell()) {
            this.f81094b.setText(R.string.hve);
            C23729p.m58257a(this.f81093a, 0);
            return;
        }
        C23729p.m58257a(this.f81093a, 8);
    }
}
