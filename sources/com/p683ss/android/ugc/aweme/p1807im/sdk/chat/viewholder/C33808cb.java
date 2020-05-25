package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.C2240a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareRankingListContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cb */
public class C33808cb extends C33809cc {
    public C33808cb(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, baseContent, i);
        ShareRankingListContent shareRankingListContent = (ShareRankingListContent) baseContent;
        int type = shareRankingListContent.getType();
        if (type != 2301) {
            switch (type) {
                case 1801:
                    this.f87727w.setText(R.string.bnz);
                    C23515d.m57668a(this.f87726v, (int) R.drawable.dc8);
                    break;
                case 1802:
                    this.f87727w.setText(R.string.bny);
                    C23515d.m57668a(this.f87726v, (int) R.drawable.dc7);
                    break;
                case 1803:
                    this.f87727w.setText(R.string.bnx);
                    C23515d.m57668a(this.f87726v, (int) R.drawable.dc6);
                    break;
            }
        } else {
            this.f87727w.setText(R.string.bnw);
            C23515d.m57668a(this.f87726v, (int) R.drawable.dc5);
        }
        this.f87728x.setVisibility(0);
        this.f87728x.setText(C2240a.m6772a(this.itemView.getContext().getResources().getString(R.string.bm3), new Object[]{shareRankingListContent.getLastUpdateTime()}));
        this.f87729y.setText(R.string.bm2);
        this.f87708j.setTag(50331648, Integer.valueOf(15));
        C35190af.m79442a();
        C35190af.m79450a(shareRankingListContent, this.f87707i, this.f87712n.getConversationId(), false);
    }
}
