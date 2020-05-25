package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareWebContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cl */
public class C33818cl extends C33809cc {
    public C33818cl(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, baseContent, i);
        ShareWebContent shareWebContent = (ShareWebContent) baseContent;
        this.f87727w.setText(shareWebContent.getTitle());
        this.f87728x.setVisibility(0);
        if (shareWebContent.getDesc() == null || shareWebContent.getDesc().trim().length() <= 0) {
            this.f87728x.setVisibility(8);
        } else {
            this.f87728x.setText(shareWebContent.getDesc());
            this.f87728x.setVisibility(0);
        }
        this.f87729y.setText(R.string.bph);
        if (!TextUtils.isEmpty(shareWebContent.getImage())) {
            C23515d.m57677a(this.f87726v, shareWebContent.getImage());
        } else {
            C23515d.m57668a(this.f87726v, (int) R.drawable.dcb);
        }
        this.f87708j.setTag(50331648, Integer.valueOf(22));
        this.f87708j.setTag(50331649, Boolean.valueOf(C35197am.m79559a(pVar, (BaseContent) shareWebContent)));
        this.f87708j.setTag(50331650, this.f87707i);
        this.f87708j.setTag(50331651, Long.valueOf(pVar.getMsgId()));
    }
}
