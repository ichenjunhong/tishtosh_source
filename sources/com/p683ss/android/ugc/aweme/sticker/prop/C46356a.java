package com.p683ss.android.ugc.aweme.sticker.prop;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.feed.service.IStickerRecordService;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.a */
public final class C46356a implements IStickerRecordService {
    public final void startRecordSticker(Activity activity, ArrayList<C46069d> arrayList) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(arrayList, "stickerBeans");
        if (TimeLockRuler.isTeenModeON()) {
            C10691a.m21548c((Context) activity, (int) R.string.dw2).mo19066a();
        } else if (!arrayList.isEmpty()) {
            Context context = activity;
            if (!AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo().showCommerceStickerDialog(context, (C46069d) arrayList.get(0), "prop_collection")) {
                if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().needLoginBeforeRecord()) {
                    C27965f.m66721a(activity, "prop_page", "prop_reuse_icon", (Bundle) null, (C23505g) null);
                    return;
                }
                C41941ab abVar = new C41941ab(context, "prop_page");
                Iterable<C46069d> iterable = arrayList;
                Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C46069d dVar : iterable) {
                    arrayList2.add(dVar.f116246id);
                }
                abVar.mo86052a(new ArrayList((List) arrayList2), false, "prop_page", "reuse", false);
            }
        }
    }
}
