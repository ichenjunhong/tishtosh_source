package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ab */
public class C33353ab implements Serializable {

    /* renamed from: a */
    private String f86488a = "";

    /* renamed from: b */
    private int f86489b;

    /* renamed from: c */
    private List<C11207p> f86490c;

    /* renamed from: d */
    private int f86491d;

    /* renamed from: e */
    private int f86492e;

    public static /* synthetic */ void chatType$annotations() {
    }

    public static /* synthetic */ void enterFrom$annotations() {
    }

    public final int getChatType() {
        return this.f86491d;
    }

    public final String getConversationId() {
        return this.f86488a;
    }

    public final int getEnterFrom() {
        return this.f86492e;
    }

    public final List<C11207p> getSelectMsgList() {
        return this.f86490c;
    }

    public final int getSelectMsgType() {
        return this.f86489b;
    }

    public IMUser getSingleChatFromUser() {
        return null;
    }

    public String getSingleChatFromUserId() {
        return null;
    }

    public final boolean isFriendChat() {
        if (this.f86491d == 0) {
            return true;
        }
        return false;
    }

    public final boolean isStrangerChat() {
        if (this.f86491d == 1) {
            return true;
        }
        return false;
    }

    public final boolean isAuthorSupporterChat() {
        if (this.f86491d == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEnterpriseChat() {
        if (this.f86491d == 2) {
            return true;
        }
        return false;
    }

    public final boolean isGroupChat() {
        if (this.f86491d == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSingleChat() {
        if (this.f86491d == 0 || this.f86491d == 1 || this.f86491d == 2 || this.f86491d == 4) {
            return true;
        }
        return false;
    }

    public final void setChatType(int i) {
        this.f86491d = i;
    }

    public final void setEnterFrom(int i) {
        this.f86492e = i;
    }

    public final void setSelectMsgList(List<C11207p> list) {
        this.f86490c = list;
    }

    public final void setSelectMsgType(int i) {
        this.f86489b = i;
    }

    public final void setConversationId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f86488a = str;
    }
}
