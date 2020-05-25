package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input;

import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29474d;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33599c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.l */
final /* synthetic */ class C33628l implements Runnable {

    /* renamed from: a */
    private final C336183 f87169a;

    /* renamed from: b */
    private final C33599c f87170b;

    C33628l(C336183 r1, C33599c cVar) {
        this.f87169a = r1;
        this.f87170b = cVar;
    }

    public final void run() {
        C336183 r0 = this.f87169a;
        C33599c cVar = this.f87170b;
        C33611i.this.mo71056c(false);
        C33611i.this.mo71054b(true);
        C33611i iVar = C33611i.this;
        String sourceMessage = C32816h.m75716b().getImAssociativeEmoticonAll().getSourceMessage();
        if (!TextUtils.isEmpty(sourceMessage) && C29474d.m69546a().mo59574b()) {
            C10691a.m21537a(iVar.mo71060h(), sourceMessage).mo19066a();
            C29474d.m69546a().mo59573a(false);
        }
        C33611i iVar2 = C33611i.this;
        iVar2.f87131m.mo70889a(cVar);
        iVar2.f87129k.mo4814b(0);
        C33611i.this.mo71065m();
        C33611i.this.mo71066n();
        C35190af.m79531m(C33611i.this.f87133o.getConversationId());
    }
}
