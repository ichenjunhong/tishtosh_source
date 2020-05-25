package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget.TimeLockDesc;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockAboutFragmentV2 */
public class TeenagerLockAboutFragmentV2 extends C22753a {
    TimeLockDesc autoOpenTimelock;
    TimeLockDesc desc1;
    TimeLockDesc desc2;
    TimeLockDesc desc3;
    View mBetaDes;
    TextView mTeenagePolicy;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo47204a() {
        return R.layout.qe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo47205f() {
        C26890h.m65011a("open_teen_mode", C23089d.m56640a().f61491a);
        super.mo47205f();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!TimeLockRuler.isTeenagerAbEnable()) {
            this.desc3.setVisibility(8);
            this.desc1.setText(getString(R.string.ai2));
        }
        this.desc1.setText(getString(R.string.hg8));
        this.desc2.setText(getString(R.string.hg9));
        this.mBetaDes.setVisibility(4);
        C23729p.m58261a(false, this.desc3, this.autoOpenTimelock);
        if (mo47214j()) {
            this.autoOpenTimelock.setVisibility(8);
            String str = ((C22781a) mo47213i().getValue()).f61038b.f61040b;
            if (!TextUtils.isEmpty(str)) {
                this.f60984a.setText(getString(R.string.gcn, str));
            } else {
                this.f60984a.setText(getString(R.string.gcm));
            }
            this.desc1.setText(getString(R.string.hg8));
            this.desc2.setText(getString(R.string.gcp));
            this.desc3.setVisibility(8);
        }
    }
}
