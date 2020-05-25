package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.proto.GroupRole;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.l */
public final class C33677l extends C33353ab {

    /* renamed from: a */
    private C34279d f87316a;

    /* renamed from: b */
    private int f87317b = GroupRole.ORDINARY.getValue();

    public final C34279d getGroupCheckMessage() {
        return this.f87316a;
    }

    public final int getGroupRole() {
        return this.f87317b;
    }

    public final boolean isGroupOwner() {
        if (this.f87317b == GroupRole.OWNER.getValue()) {
            return true;
        }
        return false;
    }

    public final boolean isGroupOwnerOrManager() {
        if (this.f87317b == GroupRole.MANAGER.getValue() || this.f87317b == GroupRole.OWNER.getValue()) {
            return true;
        }
        return false;
    }

    public final void setGroupCheckMessage(C34279d dVar) {
        this.f87316a = dVar;
    }

    public final void setGroupRole(int i) {
        this.f87317b = i;
    }
}
