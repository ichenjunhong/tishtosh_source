package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ac */
public final class C33354ac extends C33353ab {

    /* renamed from: a */
    private String f86493a;

    /* renamed from: b */
    private IMUser f86494b;

    /* renamed from: c */
    private Serializable f86495c;

    /* renamed from: d */
    private C35464a f86496d;

    public final Serializable getChatExt() {
        return this.f86495c;
    }

    public final IMUser getFromUser() {
        return this.f86494b;
    }

    public final C35464a getImAdLog() {
        return this.f86496d;
    }

    public final String getShareUserId() {
        return this.f86493a;
    }

    public final IMUser getSingleChatFromUser() {
        return this.f86494b;
    }

    public final String getSingleChatFromUserId() {
        IMUser iMUser = this.f86494b;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return null;
    }

    public final void setChatExt(Serializable serializable) {
        this.f86495c = serializable;
    }

    public final void setFromUser(IMUser iMUser) {
        this.f86494b = iMUser;
    }

    public final void setImAdLog(C35464a aVar) {
        this.f86496d = aVar;
    }

    public final void setShareUserId(String str) {
        this.f86493a = str;
    }
}
