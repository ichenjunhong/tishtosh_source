package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareLiveContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bp */
public final class C33794bp extends C33793bo {

    /* renamed from: u */
    private C33820cn f87670u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87704f = (ImageView) this.itemView.findViewById(R.id.css);
        this.f87670u = new C33820cn(this.f87704f);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87704f.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87704f);
    }

    public C33794bp(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, ShareLiveContent shareLiveContent, int i) {
        super.mo71780a(pVar, pVar2, shareLiveContent, i);
        this.f87670u.mo71862a(this.f87712n);
    }
}
