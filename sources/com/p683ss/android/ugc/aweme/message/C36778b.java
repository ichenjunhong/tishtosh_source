package com.p683ss.android.ugc.aweme.message;

import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import java.io.Serializable;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.message.b */
final /* synthetic */ class C36778b implements C1710e {

    /* renamed from: a */
    private final MessagesFragment f93994a;

    C36778b(MessagesFragment messagesFragment) {
        this.f93994a = messagesFragment;
    }

    public final void accept(Object obj) {
        MessagesFragment messagesFragment = this.f93994a;
        OneLoginPhoneBean oneLoginPhoneBean = (OneLoginPhoneBean) obj;
        if (messagesFragment.getUserVisibleHint() && !C20854a.m53167g().getCurUser().isPhoneBinded() && oneLoginPhoneBean.isValidate()) {
            C20854a.m53165e().bindMobile(messagesFragment.getActivity(), "message_tab", C47661ab.m103163a().mo94973a("one_key_bind_half_screen_force", true).mo94971a("one_login_phone_bean", (Serializable) oneLoginPhoneBean).mo94972a("enter_from", "message_tab").mo94972a("enter_method", "phone_bind_tutorial").f120139a, new C36786d(messagesFragment));
        }
    }
}
