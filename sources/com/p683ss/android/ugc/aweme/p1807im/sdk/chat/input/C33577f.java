package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input;

import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29474d;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33599c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.f */
final /* synthetic */ class C33577f implements Runnable {

    /* renamed from: a */
    private final C335262 f87030a;

    /* renamed from: b */
    private final C33599c f87031b;

    C33577f(C335262 r1, C33599c cVar) {
        this.f87030a = r1;
        this.f87031b = cVar;
    }

    public final void run() {
        C335262 r0 = this.f87030a;
        C33599c cVar = this.f87031b;
        C33521c.this.mo70977d(false);
        C33521c.this.mo70975c(true);
        C33521c cVar2 = C33521c.this;
        String sourceMessage = C32816h.m75716b().getImAssociativeEmoticonAll().getSourceMessage();
        if (!TextUtils.isEmpty(sourceMessage) && C29474d.m69546a().mo59574b()) {
            C10691a.m21537a(cVar2.mo70981i(), sourceMessage).mo19066a();
            C29474d.m69546a().mo59573a(false);
        }
        C33521c cVar3 = C33521c.this;
        cVar3.f86894l.mo70889a(cVar);
        cVar3.f86892j.mo4814b(0);
        C33521c.this.mo70986n();
        C33521c.this.mo70987o();
        C35190af.m79531m(C33521c.this.f86896n.getConversationId());
    }
}
