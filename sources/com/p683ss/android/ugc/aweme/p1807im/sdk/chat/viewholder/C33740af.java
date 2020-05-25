package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupNoticeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.af */
public final class C33740af extends C33805c<GroupNoticeContent> {
    public C33740af(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        boolean z;
        GroupNoticeContent groupNoticeContent = (GroupNoticeContent) baseContent;
        C52711k.m112240b(pVar, "msg");
        super.mo71780a(pVar, pVar2, groupNoticeContent, i);
        if (groupNoticeContent != null) {
            C11207p pVar3 = this.f87712n;
            C52711k.m112236a((Object) pVar3, "currentMessage");
            Map ext = pVar3.getExt();
            if (ext != null) {
                z = ext.containsKey("group_notice_show");
            } else {
                z = false;
            }
            groupNoticeContent.setHasShow(z);
            String noticeText = groupNoticeContent.getNoticeText();
            if (groupNoticeContent.getType() != 100121) {
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                C33711v.m77216a(view.getContext(), this.f87703e, noticeText, null, groupNoticeContent, groupNoticeContent.getType(), null);
            } else {
                View view2 = this.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                Context context = view2.getContext();
                TextView textView = this.f87703e;
                String string = C11010c.m22280a().getResources().getString(R.string.bj2);
                int type = groupNoticeContent.getType();
                C11207p pVar4 = this.f87712n;
                C52711k.m112236a((Object) pVar4, "currentMessage");
                C33711v.m77216a(context, textView, noticeText, string, groupNoticeContent, type, pVar4.getConversationId());
            }
            if (!groupNoticeContent.getHasShow()) {
                C11207p pVar5 = this.f87712n;
                C52711k.m112236a((Object) pVar5, "currentMessage");
                Map ext2 = pVar5.getExt();
                if (ext2 == null) {
                    ext2 = new HashMap();
                }
                ext2.put("group_notice_show", "show");
                C11207p pVar6 = this.f87712n;
                C52711k.m112236a((Object) pVar6, "currentMessage");
                pVar6.setExt(ext2);
                C11207p pVar7 = this.f87712n;
                C52711k.m112236a((Object) pVar7, "currentMessage");
                pVar7.setContent(C35277o.m79761a(groupNoticeContent));
                C35197am.m79556a(this.f87712n);
            }
        }
    }
}
