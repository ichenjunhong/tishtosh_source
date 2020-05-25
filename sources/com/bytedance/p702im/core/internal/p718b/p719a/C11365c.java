package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.InboxMessagesPerUserResponseBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.c */
public final class C11365c extends C11406q<int[]> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20952a() {
        return true;
    }

    public C11365c(C11162b<int[]> bVar) {
        super(IMCMD.CHECK_MESSAGES_BY_USER.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar.f30732g.body == null || fVar.f30732g.body.check_messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
        boolean z;
        if (!fVar.mo21093g() || !mo20947a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        int[] iArr = (int[]) fVar.f30730e[0];
        if (z) {
            CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody = fVar.f30732g.body.check_messages_per_user_body;
            if (checkMessagesPerUserResponseBody == null) {
                mo21058b(fVar);
                return;
            }
            List<InboxMessagesPerUserResponseBody> list = checkMessagesPerUserResponseBody.messages;
            if (list == null || list.isEmpty()) {
                mo21058b(fVar);
            } else if (iArr == null || iArr.length == 0) {
                mo21058b(fVar);
            } else {
                for (InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody : list) {
                    if (inboxMessagesPerUserResponseBody != null) {
                        Integer num = inboxMessagesPerUserResponseBody.inbox_type;
                        Boolean bool = inboxMessagesPerUserResponseBody.has_more;
                        if (!(num == null || bool == null)) {
                            for (int i = 0; i < iArr.length; i++) {
                                if (iArr[i] == num.intValue() && !bool.booleanValue()) {
                                    iArr[i] = -1;
                                }
                            }
                        }
                    }
                }
                mo21055a(iArr);
            }
        } else {
            mo21058b(fVar);
        }
    }
}
