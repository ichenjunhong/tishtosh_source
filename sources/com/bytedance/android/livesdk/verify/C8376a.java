package com.bytedance.android.livesdk.verify;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.verify.a */
final /* synthetic */ class C8376a implements C1710e {

    /* renamed from: a */
    private final VerifyActivityProxy f22795a;

    C8376a(VerifyActivityProxy verifyActivityProxy) {
        this.f22795a = verifyActivityProxy;
    }

    public final void accept(Object obj) {
        VerifyActivityProxy verifyActivityProxy = this.f22795a;
        C4177d dVar = (C4177d) obj;
        if (dVar != null) {
            verifyActivityProxy.f22792b = ((GetCertificationEntranceResponse) dVar.data).zhima_entrance;
            verifyActivityProxy.f22793c = ((GetCertificationEntranceResponse) dVar.data).manual_entrance;
            Bundle bundle = new Bundle();
            PackageManager packageManager = verifyActivityProxy.f23571d.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("alipays://"));
            List queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
            if (!(queryIntentActivities != null && queryIntentActivities.size() > 0) || TextUtils.isEmpty(verifyActivityProxy.f22792b)) {
                bundle.putString("url", verifyActivityProxy.f22793c);
            } else {
                TTLiveSDKContext.getHostService().mo10318k();
                bundle.putString("url", Uri.parse(verifyActivityProxy.f22792b).buildUpon().appendQueryParameter("return_url", null).build().toString());
            }
            bundle.putBoolean("hide_nav_bar", true);
            verifyActivityProxy.f22791a.setArguments(bundle);
            C0679r a = verifyActivityProxy.f23571d.getSupportFragmentManager().mo2225a();
            a.mo2191b(R.id.zn, verifyActivityProxy.f22791a);
            a.mo2195c();
        }
    }
}
