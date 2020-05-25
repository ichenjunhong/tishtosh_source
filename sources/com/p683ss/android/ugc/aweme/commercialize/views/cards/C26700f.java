package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import com.C2240a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.TopPageAction.C26686a;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.f */
final /* synthetic */ class C26700f implements C26686a {

    /* renamed from: a */
    private final C26691e f70372a;

    C26700f(C26691e eVar) {
        this.f70372a = eVar;
    }

    /* renamed from: a */
    public final void mo54532a(C26690d dVar) {
        C26691e eVar = this.f70372a;
        CardStruct A = C26512f.m64049A(eVar.f70341b);
        String cardUrl = A != null ? A.getCardUrl() : "";
        C26718p a = eVar.mo54533a(false);
        if (a != null) {
            a.mo54558a(C2240a.m6773a(Locale.getDefault(), "javascript:window.modalLoadStatusEvent({'modal_url': '%s', 'status': %d})", new Object[]{cardUrl, Integer.valueOf(dVar.f70334a)}));
        }
    }
}
