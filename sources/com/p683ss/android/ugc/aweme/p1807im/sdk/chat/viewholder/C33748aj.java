package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.CircleProgressTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.aj */
public final class C33748aj extends C33749ak {

    /* renamed from: u */
    private C33750al f87537u;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71782b() {
        super.mo71782b();
        this.f87713o.mo73331a(this.f87704f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87704f = (ImageView) this.itemView.findViewById(R.id.css);
        this.f87537u = new C33750al((CircleProgressTextView) this.itemView.findViewById(R.id.c6a), this.f87704f);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87704f.setOnClickListener(onClickListener);
    }

    public C33748aj(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, OnlyPictureContent onlyPictureContent, int i) {
        super.mo71780a(pVar, pVar2, onlyPictureContent, i);
        if (this.f87712n.getMsgStatus() == 3) {
            this.f87704f.setTag(50331648, Integer.valueOf(6));
            this.f87704f.setTag(67108864, this.f87712n);
            this.f87704f.setImageResource(R.drawable.az6);
            this.f87704f.setVisibility(0);
        } else {
            this.f87704f.setVisibility(8);
        }
        this.f87537u.mo71806a(this.f87712n);
    }
}
