package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.b.e */
public final class C34148e implements Serializable {
    @C17952c(mo34828a = "group_name")

    /* renamed from: a */
    private String f88248a;
    @C17952c(mo34828a = "group_avatar")

    /* renamed from: b */
    private String f88249b;
    @C17952c(mo34828a = "group_member_count")

    /* renamed from: c */
    private Integer f88250c;
    @C17952c(mo34828a = "conversation_id")

    /* renamed from: d */
    private String f88251d;
    @C17952c(mo34828a = "conversation_short_id")

    /* renamed from: e */
    private String f88252e;
    @C17952c(mo34828a = "inviter_id")

    /* renamed from: f */
    private String f88253f;
    @C17952c(mo34828a = "share_type")

    /* renamed from: g */
    private Integer f88254g;
    @C17952c(mo34828a = "share_scene")

    /* renamed from: h */
    private Integer f88255h;
    @C17952c(mo34828a = "ticket")

    /* renamed from: i */
    private String f88256i;
    @C17952c(mo34828a = "to_follow_user_list")

    /* renamed from: j */
    private List<? extends IMUser> f88257j;

    public final String getConversationId() {
        return this.f88251d;
    }

    public final String getConversationShortId() {
        return this.f88252e;
    }

    public final String getGroupAvatar() {
        return this.f88249b;
    }

    public final Integer getGroupMemberCount() {
        return this.f88250c;
    }

    public final String getGroupName() {
        return this.f88248a;
    }

    public final String getInviterUserId() {
        return this.f88253f;
    }

    public final Integer getShareScene() {
        return this.f88255h;
    }

    public final Integer getShareType() {
        return this.f88254g;
    }

    public final String getTicket() {
        return this.f88256i;
    }

    public final List<IMUser> getToFollowUserList() {
        return this.f88257j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupVerifyInfo:{");
        sb.append("groupName:");
        sb.append(this.f88248a);
        sb.append(", groupMemberCount:");
        sb.append(this.f88250c);
        sb.append(", conversationId:");
        sb.append(this.f88251d);
        sb.append(", conversationShortId:");
        sb.append(this.f88252e);
        sb.append(", inviterUserId:");
        sb.append(this.f88253f);
        sb.append(", shareType:");
        sb.append(this.f88254g);
        sb.append(", shareScene:");
        sb.append(this.f88255h);
        sb.append(", ticket:");
        sb.append(this.f88256i);
        sb.append('}');
        return sb.toString();
    }

    public final void setConversationId(String str) {
        this.f88251d = str;
    }

    public final void setConversationShortId(String str) {
        this.f88252e = str;
    }

    public final void setGroupAvatar(String str) {
        this.f88249b = str;
    }

    public final void setGroupMemberCount(Integer num) {
        this.f88250c = num;
    }

    public final void setGroupName(String str) {
        this.f88248a = str;
    }

    public final void setInviterUserId(String str) {
        this.f88253f = str;
    }

    public final void setShareScene(Integer num) {
        this.f88255h = num;
    }

    public final void setShareType(Integer num) {
        this.f88254g = num;
    }

    public final void setTicket(String str) {
        this.f88256i = str;
    }

    public final void setToFollowUserList(List<? extends IMUser> list) {
        this.f88257j = list;
    }
}
