package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33684p.C33685a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.q */
final /* synthetic */ class C33688q implements C33242d {

    /* renamed from: a */
    private final C33685a f87355a;

    C33688q(C33685a aVar) {
        this.f87355a = aVar;
    }

    public final void sendMsg() {
        C33685a aVar = this.f87355a;
        C35237bj.m79649a().mo73340a(aVar.f87341b, (BaseContent) TextContent.obtain(aVar.f87340a.value));
    }
}
