package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46035f;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.c */
final /* synthetic */ class C46148c implements C0199s {

    /* renamed from: a */
    private final C46119a f116463a;

    C46148c(C46119a aVar) {
        this.f116463a = aVar;
    }

    public final void onChanged(Object obj) {
        C46119a aVar = this.f116463a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f116494j.mo92973a().mo92534f().mo92517a(C46035f.f116170a);
                return;
            }
            aVar.f116494j.mo92973a().mo92534f().mo92519b(C46035f.f116170a);
        }
    }
}
