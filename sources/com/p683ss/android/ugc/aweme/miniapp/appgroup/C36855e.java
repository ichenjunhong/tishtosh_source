package com.p683ss.android.ugc.aweme.miniapp.appgroup;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.e */
public final class C36855e extends C1352v {

    /* renamed from: a */
    public final SimpleDraweeView f94192a;

    /* renamed from: b */
    public final DmtTextView f94193b;

    public C36855e(View view) {
        C52711k.m112240b(view, "microItemView");
        super(view);
        View findViewById = view.findViewById(R.id.blq);
        C52711k.m112236a((Object) findViewById, "microItemView.findViewById(R.id.micro_app_icon)");
        this.f94192a = (SimpleDraweeView) findViewById;
        View findViewById2 = view.findViewById(R.id.blr);
        C52711k.m112236a((Object) findViewById2, "microItemView.findViewById(R.id.micro_app_name)");
        this.f94193b = (DmtTextView) findViewById2;
    }
}
