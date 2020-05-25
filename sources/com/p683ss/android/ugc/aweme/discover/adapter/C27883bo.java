package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a.C26326a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26364f;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bo */
final /* synthetic */ class C27883bo implements OnClickListener {

    /* renamed from: a */
    private final SearchUserViewHolder f73250a;

    C27883bo(SearchUserViewHolder searchUserViewHolder) {
        this.f73250a = searchUserViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        SearchUserViewHolder searchUserViewHolder = this.f73250a;
        C25945k.m62909a().getAdRouterTaskFactoryService().mo53201a(searchUserViewHolder.mo56271b(), new C26326a().mo54030c(searchUserViewHolder.f72991e.openUrl).mo54033d("result_ad").mo54024a(true).mo54039g(searchUserViewHolder.f72991e.mpUrl).mo54022a(new C36961a().mo76225e(C26364f.m63807a(searchUserViewHolder.f72991e.openUrl, searchUserViewHolder.f72991e.mpUrl)).mo76221a()).mo54035e(searchUserViewHolder.f72991e.webUrl).mo54037f(searchUserViewHolder.f72991e.webTitle).mo54020a(searchUserViewHolder.f72991e.f68945id).mo54027b(searchUserViewHolder.f72991e.logExtra).mo54040h("result_ad").f69476a).mo54089a();
        C25945k.m62911b().mo53135b(searchUserViewHolder.mo56271b(), String.valueOf(searchUserViewHolder.f72991e.f68945id), "link", searchUserViewHolder.f72991e.logExtra);
        C25945k.m62912c().mo53495a(searchUserViewHolder.f72991e.clickTrackUrlList, searchUserViewHolder.f72991e.f68945id, searchUserViewHolder.f72991e.logExtra);
    }
}
