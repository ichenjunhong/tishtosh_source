package com.p683ss.android.ugc.aweme.comment;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.k */
final /* synthetic */ class C25217k implements C23371a {

    /* renamed from: a */
    private final C25156f f66807a;

    /* renamed from: b */
    private final Aweme f66808b;

    /* renamed from: c */
    private final IIMService f66809c;

    /* renamed from: d */
    private final IMContact f66810d;

    C25217k(C25156f fVar, Aweme aweme, IIMService iIMService, IMContact iMContact) {
        this.f66807a = fVar;
        this.f66808b = aweme;
        this.f66809c = iIMService;
        this.f66810d = iMContact;
    }

    public final void run(Object obj) {
        String str;
        C25156f fVar = this.f66807a;
        Aweme aweme = this.f66808b;
        IIMService iIMService = this.f66809c;
        IMContact iMContact = this.f66810d;
        Boolean bool = (Boolean) obj;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", fVar.f66592h).mo47829a("platform", "chat").mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("conversation_id", iIMService.getIMContactConversationId(iMContact)).mo47829a("to_user_id", iIMService.getIMContactUserId(iMContact));
        String str2 = "chat_type";
        if (iMContact instanceof IMUser) {
            str = "private";
        } else if (iMContact instanceof IMConversation) {
            switch (((IMConversation) iMContact).getConversationType()) {
                case 1:
                    str = "private";
                    break;
                case 2:
                    str = "group";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "";
        }
        Map<String, String> map = a.mo47829a(str2, str).mo47826a("chat_cnt", 1).mo47826a("is_with_text", 0).mo47829a("enter_method", "comment_at").f61491a;
        C26890h.m65011a("share_video_to_chat", map);
        C26890h.m65011a("share_video_success", map);
    }
}
