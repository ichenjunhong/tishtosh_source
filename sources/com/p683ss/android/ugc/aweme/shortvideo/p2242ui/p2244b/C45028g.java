package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.g */
final /* synthetic */ class C45028g implements OnCherEffectParmaCallback {

    /* renamed from: a */
    private final C45017b f114062a;

    C45028g(C45017b bVar) {
        this.f114062a = bVar;
    }

    public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        C45017b bVar = this.f114062a;
        if (strArr == null) {
            bVar.f114042t.f107069aU = null;
        } else {
            bVar.f114042t.f107069aU = new ClientCherEffectParam(strArr, dArr, zArr);
        }
        ClientCherEffectParam clientCherEffectParam = bVar.f114042t.f107069aU;
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        if (clientCherEffectParam != null) {
            edit.putString("ve_cher_effect_param", C39629l.m88232a().mo58566D().mo34889b(clientCherEffectParam));
        } else {
            edit.remove("ve_cher_effect_param");
        }
        C9402b.m18594a(edit);
    }
}
