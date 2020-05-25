package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupAnnouncementContent;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ac */
public class C33736ac extends C33805c<GroupAnnouncementContent> {

    /* renamed from: u */
    private DmtTextView f87514u;

    /* renamed from: v */
    private DmtTextView f87515v;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        Object a = mo71845a((int) R.id.dhb);
        C52711k.m112236a(a, "bindView(R.id.tv_title)");
        this.f87514u = (DmtTextView) a;
        Object a2 = mo71845a((int) R.id.d8j);
        C52711k.m112236a(a2, "bindView(R.id.tv_content)");
        this.f87515v = (DmtTextView) a2;
        this.f87708j = (View) mo71845a((int) R.id.ze);
    }

    public C33736ac(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
            pVar.isSelf();
            View view = this.f87708j;
            C52711k.m112236a((Object) view, "contentV");
            view.setEnabled(true);
        }
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, GroupAnnouncementContent groupAnnouncementContent, int i) {
        super.mo71780a(pVar, pVar2, groupAnnouncementContent, i);
        if (groupAnnouncementContent != null) {
            DmtTextView dmtTextView = this.f87514u;
            if (dmtTextView == null) {
                C52711k.m112237a("tvTitle");
            }
            dmtTextView.setText(groupAnnouncementContent.getTitle());
            DmtTextView dmtTextView2 = this.f87515v;
            if (dmtTextView2 == null) {
                C52711k.m112237a("tvContent");
            }
            dmtTextView2.setText(groupAnnouncementContent.getAnnouncement());
        }
    }
}
