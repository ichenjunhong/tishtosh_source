package com.p683ss.android.ugc.aweme.friends.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32505b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.j */
final /* synthetic */ class C32535j implements OnClickListener {

    /* renamed from: a */
    private final C32534i f84720a;

    C32535j(C32534i iVar) {
        this.f84720a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C32534i iVar = this.f84720a;
        if (iVar.f84711c != null) {
            if (!C32539n.m75289a(iVar.f84710b) && iVar.f84709a) {
                C10691a.m21542b(iVar.f84710b, (int) R.string.cg1).mo19066a();
            } else if (!TextUtils.isEmpty(iVar.f84711c.getUid())) {
                int i = 1;
                if (iVar.f84711c.getFollowStatus() == 0) {
                    C26890h.onEvent(MobClick.obtain().setEventName("follow").setLabelName(C32534i.m75285a(iVar.f84712d)).setValue(iVar.f84711c.getUid()).setJsonObject(new C26898j().mo54849a("nt", "4").mo54850a()));
                    C26890h.m65011a("follow", C23089d.m56640a().mo47829a("enter_from", C32534i.m75285a(iVar.f84712d)).mo47829a("to_user_id", iVar.f84711c.getUid()).mo47829a("group_id", "").mo47831b().f61491a);
                } else if (iVar.f84711c.getFollowStatus() == 1 || iVar.f84711c.getFollowStatus() == 4) {
                    C26890h.onEvent(MobClick.obtain().setEventName("unfollow").setLabelName(C32534i.m75285a(iVar.f84712d)).setValue(iVar.f84711c.getUid()));
                    C26890h.m65011a("follow_cancel", C23089d.m56640a().mo47829a("enter_from", C32534i.m75285a(iVar.f84712d)).mo47829a("to_user_id", iVar.f84711c.getUid()).mo47829a("group_id", "").f61491a);
                }
                if (iVar.f84713e != null) {
                    C32505b bVar = iVar.f84713e;
                    String uid = iVar.f84711c.getUid();
                    String secUid = iVar.f84711c.getSecUid();
                    int followerStatus = iVar.f84711c.getFollowerStatus();
                    if (iVar.f84711c.getFollowStatus() != 0) {
                        i = 0;
                    }
                    bVar.mo65817a(uid, secUid, followerStatus, i);
                }
            } else if (iVar.f84712d == 0) {
                Friend a = C32534i.m75284a(iVar.f84711c);
                if (a != null && !a.isInvited()) {
                    C26890h.m65011a("invite_friend", C23089d.m56640a().mo47829a("enter_from", C32534i.m75285a(iVar.f84712d)).f61491a);
                    iVar.f84713e.mo65816a(a);
                }
            }
        }
    }
}
