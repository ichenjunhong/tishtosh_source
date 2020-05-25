package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.facebook.internal.C14317i;
import com.facebook.internal.C14353v;
import com.facebook.login.C14522e;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;

public class FacebookActivity extends FragmentActivity {

    /* renamed from: a */
    public static String f35193a = "PassThrough";

    /* renamed from: c */
    private static String f35194c = "SingleFragment";

    /* renamed from: d */
    private static final String f35195d = "com.facebook.FacebookActivity";

    /* renamed from: b */
    public Fragment f35196b;

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f35196b != null) {
            this.f35196b.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C14533n.m29764a()) {
            C14533n.m29760a(getApplicationContext());
        }
        setContentView(R.layout.i_);
        if (f35193a.equals(intent.getAction())) {
            setResult(0, C14353v.m29433a(getIntent(), (Bundle) null, C14353v.m29438a(C14353v.m29447d(getIntent()))));
            finish();
            return;
        }
        Intent intent2 = getIntent();
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a(f35194c);
        if (a == 0) {
            if ("FacebookDialogFragment".equals(intent2.getAction())) {
                C14317i iVar = new C14317i();
                iVar.setRetainInstance(true);
                iVar.show(supportFragmentManager, f35194c);
                a = iVar;
            } else if ("DeviceShareDialogFragment".equals(intent2.getAction())) {
                DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.setRetainInstance(true);
                deviceShareDialogFragment.f37871b = (ShareContent) intent2.getParcelableExtra(C42311c.f106865i);
                deviceShareDialogFragment.show(supportFragmentManager, f35194c);
                a = deviceShareDialogFragment;
            } else {
                Fragment eVar = new C14522e();
                eVar.setRetainInstance(true);
                supportFragmentManager.mo2225a().mo2176a(R.id.wc, eVar, f35194c).mo2189b();
                a = eVar;
            }
        }
        this.f35196b = a;
    }
}
