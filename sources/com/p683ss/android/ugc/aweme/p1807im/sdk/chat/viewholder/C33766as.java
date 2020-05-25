package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SelfStoryReplyContent;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.as */
public final class C33766as extends C33764ar {

    /* renamed from: A */
    public final ImageView f87580A;

    /* renamed from: B */
    public final C33820cn f87581B = new C33820cn(this.f87580A);

    /* renamed from: z */
    public final DmtTextView f87582z;

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87580A.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87580A);
    }

    public C33766as(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
        this.f87582z = (DmtTextView) view.findViewById(R.id.dgr);
        this.f87580A = (ImageView) view.findViewById(R.id.css);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, SelfStoryReplyContent selfStoryReplyContent, int i) {
        super.mo71780a(pVar, pVar2, selfStoryReplyContent, i);
        this.f87573u.setText(R.string.boh);
        if (selfStoryReplyContent != null) {
            if (TextUtils.isEmpty(selfStoryReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.f87582z;
                C52711k.m112236a((Object) dmtTextView, "mStoryReplyStatusText");
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.f87582z;
                C52711k.m112236a((Object) dmtTextView2, "mStoryReplyStatusText");
                dmtTextView2.setText(selfStoryReplyContent.getStoryReplyText());
                DmtTextView dmtTextView3 = this.f87582z;
                C52711k.m112236a((Object) dmtTextView3, "mStoryReplyStatusText");
                dmtTextView3.setVisibility(4);
            }
        }
        this.f87581B.mo71862a(this.f87712n);
    }
}
