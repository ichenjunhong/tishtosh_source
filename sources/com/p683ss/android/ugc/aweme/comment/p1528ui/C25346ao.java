package com.p683ss.android.ugc.aweme.comment.p1528ui;

import com.p683ss.android.ugc.aweme.comment.C25056a;
import com.p683ss.android.ugc.aweme.comment.adapter.C25104b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ao */
final /* synthetic */ class C25346ao implements C26846a {

    /* renamed from: a */
    private final KeyboardDialogFragment f67020a;

    C25346ao(KeyboardDialogFragment keyboardDialogFragment) {
        this.f67020a = keyboardDialogFragment;
    }

    public final void ar_() {
        C25056a aVar = this.f67020a.f66981q;
        String str = aVar.f66382f.keyword;
        if (str != null) {
            if (str.length() > 0) {
                C25104b bVar = aVar.f66378b;
                if (bVar == null) {
                    C52711k.m112237a("adapter");
                }
                bVar.am_();
                String str2 = aVar.f66382f.keyword;
                C52711k.m112236a((Object) str2, "mSearchList.keyword");
                aVar.mo51120a(str2, aVar.f66382f.cursor, 10, 1);
                return;
            }
        }
        if (C52711k.m112239a((Object) aVar.f66382f.keyword, (Object) "")) {
            C25104b bVar2 = aVar.f66378b;
            if (bVar2 == null) {
                C52711k.m112237a("adapter");
            }
            bVar2.am_();
            aVar.m60904a(aVar.f66382f.cursor, 1, 50);
        }
    }
}
