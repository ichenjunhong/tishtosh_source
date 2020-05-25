package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34280e;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent */
public final class GroupInviteContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "aweme_invite_card")
    private C34280e groupInviteCardInfo;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupInviteContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final GroupInviteContent obtain(C34280e eVar) {
            C52711k.m112240b(eVar, "groupInviteCardInfo");
            GroupInviteContent groupInviteContent = new GroupInviteContent();
            groupInviteContent.setGroupInviteCardInfo(eVar);
            return groupInviteContent;
        }
    }

    public static final GroupInviteContent obtain(C34280e eVar) {
        return Companion.obtain(eVar);
    }

    public final C34280e getGroupInviteCardInfo() {
        return this.groupInviteCardInfo;
    }

    public final String getMsgHint() {
        String string = C11010c.m22280a().getResources().getString(R.string.big);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…roup_invite_message_hint)");
        return string;
    }

    public final void setGroupInviteCardInfo(C34280e eVar) {
        this.groupInviteCardInfo = eVar;
    }
}
