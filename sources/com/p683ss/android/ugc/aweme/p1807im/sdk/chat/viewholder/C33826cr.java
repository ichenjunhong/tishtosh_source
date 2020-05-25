package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cr */
public final class C33826cr extends C33824cq {

    /* renamed from: u */
    private DmtTextView f87770u;

    /* renamed from: v */
    private C33820cn f87771v;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        View findViewById = this.itemView.findViewById(R.id.dgr);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_story_reply_status)");
        this.f87770u = (DmtTextView) findViewById;
        this.f87704f = (ImageView) this.itemView.findViewById(R.id.css);
        this.f87771v = new C33820cn(this.f87704f);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87704f.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87704f);
    }

    public C33826cr(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, StoryReplyContent storyReplyContent, int i) {
        super.mo71780a(pVar, pVar2, storyReplyContent, i);
        if (storyReplyContent == null || TextUtils.isEmpty(storyReplyContent.getStoryReplyText())) {
            DmtTextView dmtTextView = this.f87770u;
            if (dmtTextView == null) {
                C52711k.m112237a("mStoryReplyStatusText");
            }
            dmtTextView.setVisibility(8);
        } else {
            DmtTextView dmtTextView2 = this.f87770u;
            if (dmtTextView2 == null) {
                C52711k.m112237a("mStoryReplyStatusText");
            }
            dmtTextView2.setText(storyReplyContent.getStoryReplyText());
            DmtTextView dmtTextView3 = this.f87770u;
            if (dmtTextView3 == null) {
                C52711k.m112237a("mStoryReplyStatusText");
            }
            dmtTextView3.setVisibility(4);
        }
        C33820cn cnVar = this.f87771v;
        if (cnVar == null) {
            C52711k.m112237a("mStatusIcon");
        }
        cnVar.mo71862a(this.f87712n);
    }
}
