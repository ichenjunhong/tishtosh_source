package com.p683ss.android.ugc.aweme.notification.newstyle.p2028e;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.message.model.SimpleUser;
import com.p683ss.android.ugc.aweme.message.p1949b.C36779a;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38039f;
import com.p683ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38337f;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a.C41050a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.e.b */
public final class C38346b extends C26876b<C38337f> implements C36779a {

    /* renamed from: a */
    private final int f97583a = 1;

    /* renamed from: b */
    private final int f97584b = 3;

    /* renamed from: d */
    private final int f97585d = 4;

    /* renamed from: S_ */
    public final void mo46991S_() {
        super.mo46991S_();
        C47718bf.m103291d(this);
        C36782d.m82775a().mo75931a(2);
    }

    /* renamed from: a */
    public final void mo54800a(C26877c<?> cVar) {
        C52711k.m112240b(cVar, "view");
        super.mo54800a(cVar);
        C47718bf.m103290c(this);
        C36782d.m82775a().mo75933a(2, (C36779a) this);
    }

    @C53771m
    public final void onEvent(String str) {
        C52711k.m112240b(str, "action");
        if (C52711k.m112239a((Object) "sessionListFragment-onMain", (Object) str)) {
            IIMService a = C41050a.m90717a(false);
            if (a != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("unread_count", C36782d.m82775a().mo75940c(11));
                a.onNewNoticeArrived(this.f97583a, bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo75928a(C38039f fVar) {
        C52711k.m112240b(fVar, "noticeCountMessage");
        if (fVar.f96804a == 11) {
            int i = fVar.f96808e;
            if (i == 0) {
                IIMService a = C41050a.m90717a(false);
                if (a != null) {
                    Bundle bundle = new Bundle();
                    StrangerNoticeMessage strangerNoticeMessage = fVar.f96807d;
                    if (strangerNoticeMessage != null) {
                        bundle.putLong("last_create_time", strangerNoticeMessage.getCreateTime());
                        SimpleUser fromUser = strangerNoticeMessage.getFromUser();
                        C52711k.m112236a((Object) fromUser, "msg.fromUser");
                        bundle.putString("from_user_name", fromUser.getNickName());
                        bundle.putString("from_user_content", strangerNoticeMessage.getContent());
                        bundle.putInt("from_user_msg_type", strangerNoticeMessage.getMsgType());
                    }
                    bundle.putInt("unread_count", C36782d.m82775a().mo75940c(11));
                    a.onNewNoticeArrived(this.f97584b, bundle);
                }
            } else if (i == 1) {
                C41049a.f104381a.mo83571a().onNewNoticeArrived(this.f97585d, new Bundle());
            }
        }
    }
}
