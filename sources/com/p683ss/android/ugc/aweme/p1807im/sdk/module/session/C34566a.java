package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseVideoRedEnvelopeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommonRedEnvelopeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupAnnouncementContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33459e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34582d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a */
public final class C34566a {
    /* renamed from: a */
    public static String m78501a(BaseContent baseContent, C11207p pVar) {
        if (baseContent instanceof StoryReplyContent) {
            return StoryReplyContent.wrapMessageHint(pVar, baseContent.getMsgHint());
        }
        if ((baseContent instanceof CommonRedEnvelopeContent) || (baseContent instanceof BaseVideoRedEnvelopeContent)) {
            return C33459e.m76689a(pVar, baseContent.getMsgHint());
        }
        return baseContent.wrapMsgHint(!pVar.isSelf(), false, null);
    }

    /* renamed from: a */
    public static String m78502a(BaseContent baseContent, C11207p pVar, boolean z) {
        if (baseContent instanceof StoryReplyContent) {
            return StoryReplyContent.wrapMessageHint(pVar, baseContent.getMsgHint());
        }
        if ((baseContent instanceof CommonRedEnvelopeContent) || (baseContent instanceof BaseVideoRedEnvelopeContent)) {
            return C33459e.m76689a(pVar, baseContent.getMsgHint());
        }
        return baseContent.wrapMsgHint(!pVar.isSelf(), true, C34010e.m77748a().mo71954a(String.valueOf(pVar.getSender()), pVar.getSecSender()).getDisplayName());
    }

    /* renamed from: a */
    public static String m78503a(C34582d dVar, BaseContent baseContent, C11207p pVar) {
        StringBuilder sb = new StringBuilder();
        if (pVar.isRecalled()) {
            IMUser a = C34010e.m77748a().mo71952a((String) pVar.getExt().get("s:recall_uid"));
            if (!pVar.isSelf() && a != null) {
                sb.append(a.getDisplayName());
                sb.append(": ");
            }
            if (C35197am.m79569g(pVar)) {
                sb.append(C11010c.m22280a().getResources().getString(R.string.bko));
            } else if (C35197am.m79570h(pVar)) {
                sb.append(C11010c.m22280a().getResources().getString(R.string.gwc));
            } else if (pVar.isSelf()) {
                sb.append(baseContent.getMsgHint());
            } else {
                sb.append(C11010c.m22280a().getResources().getString(R.string.bkr));
            }
        } else {
            IMUser a2 = C34010e.m77748a().mo71952a(String.valueOf(pVar.getSender()));
            if (!(pVar.isSelf() || pVar.getMsgType() == 1002 || pVar.getMsgType() == 1001)) {
                if (a2 != null) {
                    sb.append(a2.getDisplayName());
                    sb.append(": ");
                } else if (dVar.f89126a <= 0) {
                    dVar.f89126a = 1;
                    C34010e.m77748a().mo71955a(String.valueOf(pVar.getSender()), pVar.getSecSender(), true, (C34015a) new C34600b(dVar, baseContent, pVar));
                }
            }
            if (baseContent instanceof StoryReplyContent) {
                sb.append(StoryReplyContent.wrapMessageHint(pVar, baseContent.getMsgHint()));
            } else if ((baseContent instanceof CommonRedEnvelopeContent) || (baseContent instanceof BaseVideoRedEnvelopeContent)) {
                sb.append(C33459e.m76689a(pVar, baseContent.getMsgHint()));
            } else {
                sb.append(baseContent.getMsgHint());
            }
            if (baseContent instanceof GroupAnnouncementContent) {
                sb = new StringBuilder();
                sb.append(baseContent.getMsgHint());
            }
        }
        return sb.toString();
    }
}
