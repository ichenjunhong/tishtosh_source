package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.e */
public final class C34280e implements Serializable {
    @C17952c(mo34828a = "group_icon")

    /* renamed from: a */
    private UrlModel f88508a;
    @C17952c(mo34828a = "group_name")

    /* renamed from: b */
    private String f88509b;
    @C17952c(mo34828a = "group_member_count")

    /* renamed from: c */
    private int f88510c = -1;
    @C17952c(mo34828a = "from_uid")

    /* renamed from: d */
    private String f88511d;
    @C17952c(mo34828a = "sec_from_uid")

    /* renamed from: e */
    private String f88512e;
    @C17952c(mo34828a = "conversation_id")

    /* renamed from: f */
    private String f88513f;
    @C17952c(mo34828a = "conversation_short_id")

    /* renamed from: g */
    private String f88514g;
    @C17952c(mo34828a = "ticket")

    /* renamed from: h */
    private String f88515h;

    public final String getConversationId() {
        return this.f88513f;
    }

    public final String getConversationShortId() {
        return this.f88514g;
    }

    public final String getFromUserId() {
        return this.f88511d;
    }

    public final String getFromUserSecId() {
        return this.f88512e;
    }

    public final UrlModel getGroupIcon() {
        return this.f88508a;
    }

    public final String getGroupName() {
        return this.f88509b;
    }

    public final int getMemberCount() {
        return this.f88510c;
    }

    public final String getTicket() {
        return this.f88515h;
    }

    public final void setConversationId(String str) {
        this.f88513f = str;
    }

    public final void setConversationShortId(String str) {
        this.f88514g = str;
    }

    public final void setFromUserId(String str) {
        this.f88511d = str;
    }

    public final void setFromUserSecId(String str) {
        this.f88512e = str;
    }

    public final void setGroupIcon(UrlModel urlModel) {
        this.f88508a = urlModel;
    }

    public final void setGroupName(String str) {
        this.f88509b = str;
    }

    public final void setMemberCount(int i) {
        this.f88510c = i;
    }

    public final void setTicket(String str) {
        this.f88515h = str;
    }
}
