package com.bytedance.android.livesdk.feed.p331a;

import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdkapi.C8830k;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.a.k */
public final /* synthetic */ class C6822k implements C1710e {

    /* renamed from: a */
    private final C6812e f18707a;

    public C6822k(C6812e eVar) {
        this.f18707a = eVar;
    }

    public final void accept(Object obj) {
        String str;
        C6812e eVar = this.f18707a;
        eVar.f18686l = false;
        if (eVar.f18677c != null) {
            String c = C8830k.m17330d() != null ? C8830k.m17330d().mo15060m().mo10871c() : "";
            if (!TextUtils.isEmpty(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append("_");
                str = sb.toString();
            } else {
                str = "";
            }
            BaseFeedDataViewModel baseFeedDataViewModel = eVar.f18677c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("feed_loadmore");
            String sb3 = sb2.toString();
            if (baseFeedDataViewModel.f19376a != null) {
                baseFeedDataViewModel.f19376a.mo12972a(null, sb3);
            }
        }
    }
}
