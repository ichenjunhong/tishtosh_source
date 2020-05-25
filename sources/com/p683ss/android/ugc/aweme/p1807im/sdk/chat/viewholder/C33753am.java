package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.am */
public final class C33753am extends C33805c<TextContent> {

    /* renamed from: u */
    private final Context f87547u;

    /* renamed from: v */
    private final DmtTextView f87548v;

    /* renamed from: w */
    private final DmtTextView f87549w;

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87549w.setOnClickListener(onClickListener);
    }

    public C33753am(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
        this.f87547u = view.getContext();
        View findViewById = view.findViewById(R.id.er3);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.push_notification_tips)");
        this.f87548v = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.buv);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.open_btn)");
        this.f87549w = (DmtTextView) findViewById2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, (TextContent) baseContent, i);
        DmtTextView dmtTextView = this.f87548v;
        Context context = this.f87547u;
        C52711k.m112236a((Object) context, "mContext");
        dmtTextView.setText(context.getResources().getText(R.string.g3x));
        DmtTextView dmtTextView2 = this.f87549w;
        Context context2 = this.f87547u;
        C52711k.m112236a((Object) context2, "mContext");
        dmtTextView2.setText(context2.getResources().getText(R.string.fkg));
        this.f87549w.setTag(50331648, Integer.valueOf(41));
        this.f87549w.setTag(67108864, this.f87712n);
    }
}
