package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34597i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.j */
public final class C34553j {
    /* renamed from: a */
    public static List<C34597i> m78483a(List<StrangerMsgSession> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (StrangerMsgSession strangerMsgSession : list) {
                StrangerMessage lastMsg = strangerMsgSession.getLastMsg();
                int unreadCount = strangerMsgSession.getUnreadCount();
                C34597i iVar = new C34597i();
                iVar.f91115f = lastMsg.getFromUser().getAvatarThumb();
                iVar.f91117h = C33888y.content(lastMsg.getMsgType(), lastMsg.getContent(), lastMsg.isRecalled(), Long.valueOf(lastMsg.getFromUser().getUid()).longValue()).getMsgHint();
                iVar.f91116g = lastMsg.getFromUser().getNickName();
                String uid = lastMsg.getFromUser().getUid();
                if (TextUtils.isEmpty(uid)) {
                    StringBuilder sb = new StringBuilder("StrangerSession convert strangerSessionId:");
                    sb.append(uid);
                    C32458a.m75144a(sb.toString());
                }
                iVar.f91114e = uid;
                iVar.mo73751a(lastMsg.getCreateTime());
                iVar.f89142d = lastMsg.getFromUser();
                iVar.f91119j = unreadCount;
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }
}
