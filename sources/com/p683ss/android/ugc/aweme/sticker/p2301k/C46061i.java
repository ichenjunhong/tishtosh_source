package com.p683ss.android.ugc.aweme.sticker.p2301k;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.sticker.model.C46067b;
import com.p683ss.android.ugc.aweme.sticker.model.C46068c;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.utils.C47702b;

/* renamed from: com.ss.android.ugc.aweme.sticker.k.i */
final /* synthetic */ class C46061i implements OnClickListener {

    /* renamed from: a */
    private final C46069d f116208a;

    /* renamed from: b */
    private final String f116209b;

    /* renamed from: c */
    private final Context f116210c;

    C46061i(C46069d dVar, String str, Context context) {
        this.f116208a = dVar;
        this.f116209b = str;
        this.f116210c = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C46069d dVar = this.f116208a;
        String str = this.f116209b;
        Context context = this.f116210c;
        C47702b.f120193a.mo94984a("confirm_toast", C42438az.m93209a().mo86526a("prop_id", dVar.f116246id).mo86526a("scene_id", "1001").mo86526a("enter_from", str).f107329a);
        if (context != null && dVar != null && !C46059g.m100070a(dVar.f116246id) && C46059g.m100075b(dVar)) {
            C46067b bVar = dVar.commerceSticker;
            if (bVar != null) {
                C46068c commerceStickerUnlockInfo = bVar.getCommerceStickerUnlockInfo();
                if (commerceStickerUnlockInfo != null && !C39629l.m88232a().mo58588s().mo74156b(commerceStickerUnlockInfo.openUrl)) {
                    String str2 = commerceStickerUnlockInfo.webUrl;
                    if (!C39629l.m88232a().mo58591v().mo74194a(context, commerceStickerUnlockInfo.openUrl, false)) {
                        C39629l.m88232a().mo58591v().mo74193a(context, str2, "");
                    }
                }
            }
        }
    }
}
