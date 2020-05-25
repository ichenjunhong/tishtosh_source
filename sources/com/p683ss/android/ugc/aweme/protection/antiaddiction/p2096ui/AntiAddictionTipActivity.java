package com.p683ss.android.ugc.aweme.protection.antiaddiction.p2096ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.protection.api.p2097a.C40856a;
import com.p683ss.android.ugc.aweme.protection.api.p2098b.C40857a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.ui.AntiAddictionTipActivity */
public final class AntiAddictionTipActivity extends AmeBaseActivity implements C40857a {
    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b7l;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onBackPressed() {
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(C40856a aVar) {
        C52711k.m112240b(aVar, "event");
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0654k supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.mo2222a((int) R.id.ajf) == null) {
            C0679r a = supportFragmentManager.mo2225a();
            C22711b d = C23794bh.m58390d();
            C52711k.m112236a((Object) d, "LegacyServiceUtils.getTimeLockRulerService()");
            a.mo2175a((int) R.id.ajf, d.mo47115l()).mo2195c();
        }
    }
}
