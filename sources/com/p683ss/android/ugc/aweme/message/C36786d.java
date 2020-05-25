package com.p683ss.android.ugc.aweme.message;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.profile.p2085c.C39826d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;

/* renamed from: com.ss.android.ugc.aweme.message.d */
final /* synthetic */ class C36786d implements C20840g {

    /* renamed from: a */
    private final MessagesFragment f94014a;

    C36786d(MessagesFragment messagesFragment) {
        this.f94014a = messagesFragment;
    }

    public final void onResult(int i, int i2, Object obj) {
        MessagesFragment messagesFragment = this.f94014a;
        if (C20854a.m53167g().getCurUser().isPhoneBinded()) {
            boolean z = obj instanceof Bundle;
            if (z && ((Bundle) obj).getBoolean("one_key_bind_half_screen_force", true)) {
                C32616c.f84865a.getContactService().mo66140a(messagesFragment.getActivity());
            }
            if (z) {
                Bundle bundle = (Bundle) obj;
                if (bundle.getBoolean("one_key_bind_half_screen_force", true) && bundle.getBoolean("guide_to_complete_profile", true)) {
                    C39826d.m88570a(messagesFragment.getChildFragmentManager(), C47661ab.m103163a().mo94972a("show_type", "show_type_after_login_or_bind").f120139a);
                }
            }
        }
    }
}
