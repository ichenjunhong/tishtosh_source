package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.model.ContactModel;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.x */
final /* synthetic */ class C32777x implements OnClickListener {

    /* renamed from: a */
    private final InviteFriendsActivity f85357a;

    C32777x(InviteFriendsActivity inviteFriendsActivity) {
        this.f85357a = inviteFriendsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        InviteFriendsActivity inviteFriendsActivity = this.f85357a;
        if (inviteFriendsActivity.isViewValid() && inviteFriendsActivity.f84984f != null && inviteFriendsActivity.f84983e != null && !inviteFriendsActivity.f84993o) {
            List<Friend> a = inviteFriendsActivity.f84984f.mo50673a();
            if (!C9376b.m18558a((Collection<T>) a)) {
                ArrayList arrayList = new ArrayList(a.size());
                for (Friend friend : a) {
                    if (friend != null) {
                        arrayList.add(new ContactModel(friend.getSocialName(), friend.getNickname()));
                    }
                }
                User curUser = C20854a.m53167g().getCurUser();
                inviteFriendsActivity.f84993o = true;
                inviteFriendsActivity.f84983e.mo65894a(curUser, arrayList, "invite_friends", new InviteFriendsCallback() {
                    public final void onSuccess() {
                        InviteFriendsActivity.this.f84993o = false;
                        if (InviteFriendsActivity.this.isViewValid()) {
                            C9432q.m18691b(InviteFriendsActivity.this.f84987i, 8);
                            C9432q.m18691b(InviteFriendsActivity.this.mBtnFloatInviteAllContainer, 8);
                            InviteFriendsActivity.this.mListView.setPadding(0, 0, 0, 0);
                            SharePrefCache.inst().setLastInviteAllTimeStamp(System.currentTimeMillis());
                            C10691a.m21542b((Context) InviteFriendsActivity.this, (int) R.string.doc).mo19066a();
                        }
                    }

                    public final void onFailed(String str) {
                        InviteFriendsActivity.this.f84993o = false;
                        C10691a.m21542b((Context) InviteFriendsActivity.this, (int) R.string.dob).mo19066a();
                    }
                });
                C26890h.m65011a("invite_all", C23089d.m56640a().mo47826a("invite_num", arrayList.size()).f61491a);
            }
        }
    }
}
