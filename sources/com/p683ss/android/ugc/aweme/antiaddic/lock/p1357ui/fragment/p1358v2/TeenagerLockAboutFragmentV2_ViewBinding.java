package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget.TimeLockDesc;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockAboutFragmentV2_ViewBinding */
public class TeenagerLockAboutFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TeenagerLockAboutFragmentV2 f60972a;

    public void unbind() {
        TeenagerLockAboutFragmentV2 teenagerLockAboutFragmentV2 = this.f60972a;
        if (teenagerLockAboutFragmentV2 != null) {
            this.f60972a = null;
            teenagerLockAboutFragmentV2.desc1 = null;
            teenagerLockAboutFragmentV2.desc2 = null;
            teenagerLockAboutFragmentV2.desc3 = null;
            teenagerLockAboutFragmentV2.autoOpenTimelock = null;
            teenagerLockAboutFragmentV2.mBetaDes = null;
            teenagerLockAboutFragmentV2.mTeenagePolicy = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TeenagerLockAboutFragmentV2_ViewBinding(TeenagerLockAboutFragmentV2 teenagerLockAboutFragmentV2, View view) {
        this.f60972a = teenagerLockAboutFragmentV2;
        teenagerLockAboutFragmentV2.desc1 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.cxw, "field 'desc1'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.desc2 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.cxx, "field 'desc2'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.desc3 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.cxy, "field 'desc3'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.autoOpenTimelock = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.cxz, "field 'autoOpenTimelock'", TimeLockDesc.class);
        teenagerLockAboutFragmentV2.mBetaDes = Utils.findRequiredView(view, R.id.ju, "field 'mBetaDes'");
        teenagerLockAboutFragmentV2.mTeenagePolicy = (TextView) Utils.findRequiredViewAsType(view, R.id.cxv, "field 'mTeenagePolicy'", TextView.class);
    }
}
