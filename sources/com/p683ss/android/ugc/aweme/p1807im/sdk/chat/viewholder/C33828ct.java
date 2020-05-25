package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b.C33407i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.CircleProgressTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ct */
public final class C33828ct extends C33827cs {

    /* renamed from: v */
    private C33407i f87775v;

    /* renamed from: w */
    private CircleProgressTextView f87776w;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87704f = (ImageView) this.itemView.findViewById(R.id.css);
        View findViewById = this.itemView.findViewById(R.id.b58);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_upload_progress)");
        this.f87776w = (CircleProgressTextView) findViewById;
        CircleProgressTextView circleProgressTextView = this.f87776w;
        if (circleProgressTextView == null) {
            C52711k.m112237a("uploadProgressView");
        }
        this.f87775v = new C33407i(circleProgressTextView, mo71869g(), this.f87704f);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87704f.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87704f);
    }

    public C33828ct(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, StoryVideoContent storyVideoContent, int i) {
        super.mo71780a(pVar, pVar2, storyVideoContent, i);
        C33407i iVar = this.f87775v;
        if (iVar == null) {
            C52711k.m112237a("uploadProgressIcon");
        }
        iVar.mo70813a(this.f87712n);
        C11207p pVar3 = this.f87712n;
        C52711k.m112236a((Object) pVar3, "currentMessage");
        if (pVar3.getMsgStatus() == 3) {
            this.f87704f.setImageResource(R.drawable.az6);
            this.f87704f.setTag(50331648, Integer.valueOf(6));
            this.f87704f.setTag(67108864, this.f87712n);
            ImageView imageView = this.f87704f;
            C52711k.m112236a((Object) imageView, "statusIv");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f87704f;
            C52711k.m112236a((Object) imageView2, "statusIv");
            imageView2.setVisibility(8);
        }
        this.f87708j.setTag(50331648, Integer.valueOf(28));
    }
}
