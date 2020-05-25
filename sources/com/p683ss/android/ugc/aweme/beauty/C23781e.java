package com.p683ss.android.ugc.aweme.beauty;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.beauty.e */
public final class C23781e {

    /* renamed from: a */
    public static final Keva f63375a;

    /* renamed from: b */
    public static final C23781e f63376b = new C23781e();

    /* renamed from: com.ss.android.ugc.aweme.beauty.e$a */
    public static final class C23782a extends C17956a<List<? extends UlikeBeautyData>> {
        C23782a() {
        }
    }

    private C23781e() {
    }

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        C52711k.m112236a((Object) repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        f63375a = repo;
    }

    /* renamed from: a */
    public static ArrayList<UlikeBeautyData> m58370a() {
        String string = f63375a.getString("ulike_download_config", "");
        if (TextUtils.isEmpty(string)) {
            C39666o oVar = (C39666o) C26888e.m65000a(C39629l.m88233b(), C39666o.class);
            String b = oVar.mo48455b("");
            if (!TextUtils.isEmpty(b)) {
                oVar.mo48459c("");
                f63375a.storeString("ulike_download_config", b);
                string = b;
            }
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (ArrayList) C39629l.m88232a().mo58566D().mo34885a(string, new C23782a().f49843c);
    }

    /* renamed from: a */
    public static final int m58369a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Keva keva = f63375a;
        if (str == null) {
            C52711k.m112234a();
        }
        StringBuilder sb = new StringBuilder("composer_beauty_manual_");
        sb.append(str);
        return keva.getInt(sb.toString(), -1);
    }
}
