package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget.TimeLockDesc;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockOptionsFragmentV2_ViewBinding */
public class TeenagerLockOptionsFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TeenagerLockOptionsFragmentV2 f60974a;

    public void unbind() {
        TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2 = this.f60974a;
        if (teenagerLockOptionsFragmentV2 != null) {
            this.f60974a = null;
            teenagerLockOptionsFragmentV2.desc1 = null;
            teenagerLockOptionsFragmentV2.desc2 = null;
            teenagerLockOptionsFragmentV2.desc3 = null;
            teenagerLockOptionsFragmentV2.mBetaDes = null;
            teenagerLockOptionsFragmentV2.mBottom = null;
            teenagerLockOptionsFragmentV2.mAppealCloseTeenagerMode = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TeenagerLockOptionsFragmentV2_ViewBinding(TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2, View view) {
        this.f60974a = teenagerLockOptionsFragmentV2;
        teenagerLockOptionsFragmentV2.desc1 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.cxw, "field 'desc1'", TimeLockDesc.class);
        teenagerLockOptionsFragmentV2.desc2 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.cxx, "field 'desc2'", TimeLockDesc.class);
        teenagerLockOptionsFragmentV2.desc3 = (TimeLockDesc) Utils.findRequiredViewAsType(view, R.id.cxy, "field 'desc3'", TimeLockDesc.class);
        teenagerLockOptionsFragmentV2.mBetaDes = Utils.findRequiredView(view, R.id.ju, "field 'mBetaDes'");
        teenagerLockOptionsFragmentV2.mBottom = Utils.findRequiredView(view, R.id.ll, "field 'mBottom'");
        teenagerLockOptionsFragmentV2.mAppealCloseTeenagerMode = (Button) Utils.findRequiredViewAsType(view, R.id.nd, "field 'mAppealCloseTeenagerMode'", Button.class);
    }
}
