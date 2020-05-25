package com.p683ss.android.ugc.aweme.account.utils;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.lobby.internal.C12347d;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.bean.C20938e;
import com.p683ss.android.ugc.aweme.account.login.C21053aa;
import com.p683ss.android.ugc.aweme.account.login.C21060af;
import com.p683ss.android.ugc.aweme.account.util.ThirdLoginSetting;
import com.p683ss.android.ugc.aweme.experiments.GetLoginPlatformFromServer;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.utils.h */
public final class C22301h {
    /* renamed from: a */
    public static C21053aa[] m55191a() {
        return m55192a(false);
    }

    /* renamed from: a */
    public static C21053aa[] m55192a(boolean z) {
        C21053aa[] aaVarArr = null;
        if (C10181b.m20511a().mo18168a(GetLoginPlatformFromServer.class, true, "login_platforms_from_server", 31744, 1) == 1) {
            ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) C23859b.m58575b().mo49459a((Context) C23826bi.m58460b(), "i18n_third_login_strategy", ThirdLoginSetting.class);
            if (thirdLoginSetting != null) {
                aaVarArr = thirdLoginSetting.getOrder();
            }
        }
        if (aaVarArr == null) {
            return C21060af.m53525a();
        }
        return aaVarArr;
    }

    /* renamed from: a */
    public static List<C20938e> m55190a(C21053aa[] aaVarArr) {
        boolean z;
        C20938e eVar;
        LinkedList linkedList = new LinkedList();
        if (aaVarArr == null) {
            return linkedList;
        }
        for (C21053aa aaVar : aaVarArr) {
            if (aaVar == C21053aa.GOOGLE) {
                z = C12347d.m24857a().mo23348a("google");
            } else {
                z = true;
            }
            if (z) {
                switch (aaVar) {
                    case FACEBOOK:
                        eVar = new C20938e("Facebook", R.drawable.cen, "facebook");
                        break;
                    case TWITTER:
                        eVar = new C20938e("Twitter", R.drawable.ces, "twitter");
                        break;
                    case GOOGLE:
                        eVar = new C20938e("Google", R.drawable.ceo, "google");
                        break;
                    case LINE:
                        eVar = new C20938e("Line", R.drawable.cer, "line");
                        break;
                    case KAKAOTALK:
                        eVar = new C20938e("Kakao Talk", R.drawable.ceq, "kakaotalk");
                        break;
                    case INSTAGRAM:
                        eVar = new C20938e("Instagram", R.drawable.cep, "instagram");
                        break;
                    case VK:
                        eVar = new C20938e("VK", R.drawable.cet, "vk");
                        break;
                }
                linkedList.add(eVar);
            }
        }
        return linkedList;
    }
}
