package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.view.View;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SetUpGroupInvitePasswordContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34311c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34312d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34315f;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ag */
public final class C33741ag extends C33805c<SetUpGroupInvitePasswordContent> implements C34311c {

    /* renamed from: u */
    public C11207p f87519u;

    /* renamed from: v */
    public C34315f f87520v;

    /* renamed from: g */
    public final void mo71787g() {
        C11207p pVar = this.f87519u;
        if (pVar != null) {
            StringBuilder sb = new StringBuilder("start to delete msg:");
            sb.append(pVar);
            C32458a.m75141a(4, "GroupOwnerInvitePasswordViewHolder", sb.toString());
            C11213r.m22769a(pVar, true);
        }
    }

    public C33741ag(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        C11207p pVar3 = pVar;
        SetUpGroupInvitePasswordContent setUpGroupInvitePasswordContent = (SetUpGroupInvitePasswordContent) baseContent;
        super.mo71780a(pVar3, pVar2, setUpGroupInvitePasswordContent, i);
        this.f87519u = pVar3;
        if (setUpGroupInvitePasswordContent != null && this.f87520v == null) {
            C34311c cVar = this;
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            Context context = view.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            String conversationId = setUpGroupInvitePasswordContent.getConversationId();
            int shareType = setUpGroupInvitePasswordContent.getShareType();
            C34312d dVar = new C34312d(R.string.fsl, false, R.drawable.d6q, R.drawable.d8t, R.string.fsk, false, false);
            C34315f fVar = new C34315f(cVar, context, view2, conversationId, shareType, dVar);
            fVar.mo72335a();
            this.f87520v = fVar;
        }
    }
}
