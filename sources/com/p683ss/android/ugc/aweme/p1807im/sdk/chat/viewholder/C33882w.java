package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EPlatformCardContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1834e.C34153a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.EPlatformSpanInterceptNoTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.w */
public class C33882w extends C33805c<EPlatformCardContent> {

    /* renamed from: u */
    boolean f87877u = true;

    /* renamed from: v */
    private TextView f87878v;

    public C33882w(View view, int i) {
        super(view, i);
        this.f87878v = (TextView) view.findViewById(R.id.bnh);
        this.f87708j = view.findViewById(R.id.ze);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, EPlatformCardContent ePlatformCardContent, int i) {
        if (ePlatformCardContent != null) {
            super.mo71780a(pVar, pVar2, ePlatformCardContent, i);
            if (this.f87877u) {
                C34153a.m77970a(this.f87878v, ePlatformCardContent.content, ePlatformCardContent.actions, this.f87707i, pVar.getMsgId(), this.itemView.getContext().getResources().getColor(R.color.sv));
                ((EPlatformSpanInterceptNoTextView) this.f87878v).f90789b = this.itemView.getContext().getResources().getColor(R.color.qn);
            } else {
                C34153a.m77970a(this.f87878v, ePlatformCardContent.content, ePlatformCardContent.actions, this.f87707i, pVar.getMsgId(), -1);
                ((EPlatformSpanInterceptNoTextView) this.f87878v).f90789b = this.itemView.getContext().getResources().getColor(R.color.qo);
            }
            ((EPlatformSpanInterceptNoTextView) this.f87878v).setContentArea(this.f87708j);
            this.f87708j.setTag(50331648, Integer.valueOf(36));
        }
    }
}
