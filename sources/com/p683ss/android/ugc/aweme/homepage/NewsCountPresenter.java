package com.p683ss.android.ugc.aweme.homepage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.content.C0732g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.homepage.NewsCountPresenter */
public final class NewsCountPresenter {

    /* renamed from: a */
    public static boolean f85636a = true;

    /* renamed from: b */
    public MsgCountBroadcastReceiver f85637b;

    /* renamed from: com.ss.android.ugc.aweme.homepage.NewsCountPresenter$MsgCountBroadcastReceiver */
    public static final class MsgCountBroadcastReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("com.msg.count.action.arrived".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("msg_count", 0);
                    int intExtra2 = intent.getIntExtra("msg_dot", -1);
                    C47718bf.m103288a(new C38041h(99, intExtra));
                    C47718bf.m103288a(new C38041h(BaseNotice.HASHTAG, intExtra2));
                } else if ("message_stranger_mark_read_action".equals(intent.getAction())) {
                    C47718bf.m103288a(new C38041h(11, -1));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69845a() {
        C0732g.m2130a(C11010c.m22280a()).mo2402a((BroadcastReceiver) this.f85637b);
    }
}
