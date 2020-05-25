package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UsedPhoneConfirmActivity */
public final class UsedPhoneConfirmActivity extends AmeSSActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bo8);
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        a.mo2175a((int) R.id.ajf, (Fragment) new C40373eg());
        a.mo2189b();
    }
}
