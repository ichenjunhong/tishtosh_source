package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.el */
public final class C30952el extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    private DmtTextView f81055a;

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    public C30952el(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b6w);
        if (view instanceof FrameLayout) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.leftMargin = C23728o.m58241a(4.0d);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(C23728o.m58241a(4.0d));
            }
            ((FrameLayout) view).addView(view2, layoutParams);
        }
        this.f81055a = (DmtTextView) view2.findViewById(R.id.ddv);
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        if (!TextUtils.equals(this.f81193m, "homepage_hot")) {
            if (this.f81192l == null || this.f81192l.getCreateTime() <= 0) {
                C23729p.m58257a((View) this.f81055a, 8);
            } else {
                String d = C47903fw.m103627d(this.f81198r, this.f81192l.getCreateTime() * 1000);
                if (!TextUtils.isEmpty(d)) {
                    DmtTextView dmtTextView = this.f81055a;
                    StringBuilder sb = new StringBuilder("· ");
                    sb.append(d);
                    dmtTextView.setText(sb.toString());
                    C23729p.m58257a((View) this.f81055a, 0);
                } else {
                    C23729p.m58257a((View) this.f81055a, 8);
                }
            }
            return;
        }
        C23729p.m58257a((View) this.f81055a, 8);
    }
}
