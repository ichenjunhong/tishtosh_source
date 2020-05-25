package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ay */
public final class C33776ay extends C33767at {

    /* renamed from: E */
    private C33820cn f87631E;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87704f = (ImageView) mo71845a((int) R.id.css);
        this.f87631E = new C33820cn(this.f87704f);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87704f.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87704f);
    }

    public C33776ay(View view, int i, ShareAwemeConfig shareAwemeConfig) {
        super(view, i, shareAwemeConfig);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, ShareAwemeContent shareAwemeContent, int i) {
        super.mo71780a(pVar, pVar2, shareAwemeContent, i);
        this.f87631E.mo71862a(this.f87712n);
    }
}
