package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.C2240a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35280q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.by */
public class C33803by extends C33809cc {
    public C33803by(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, baseContent, i);
        SharePoiContent sharePoiContent = (SharePoiContent) baseContent;
        this.f87727w.setText(sharePoiContent.getTitle());
        this.f87728x.setVisibility(0);
        if (TextUtils.isEmpty(sharePoiContent.getSubtitle())) {
            this.f87728x.setText(C2240a.m6772a(this.itemView.getContext().getResources().getString(R.string.bm1), new Object[]{C35280q.m79766a((long) sharePoiContent.getUserCount())}));
        } else {
            this.f87728x.setText(sharePoiContent.getSubtitle());
        }
        this.f87729y.setText(R.string.bm0);
        C23515d.m57669a(this.f87726v, sharePoiContent.getMapUrl());
        this.f87708j.setTag(50331648, Integer.valueOf(16));
        this.f87708j.setTag(67108864, sharePoiContent.getPoiId());
        this.f87708j.setTag(50331649, this.f87707i);
    }
}
