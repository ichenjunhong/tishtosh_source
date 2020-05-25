package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity_ViewBinding */
public class BaseLoginOrRegisterActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseLoginOrRegisterActivity f58369a;

    public void unbind() {
        BaseLoginOrRegisterActivity baseLoginOrRegisterActivity = this.f58369a;
        if (baseLoginOrRegisterActivity != null) {
            this.f58369a = null;
            baseLoginOrRegisterActivity.mStatusView = null;
            baseLoginOrRegisterActivity.mFragmentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseLoginOrRegisterActivity_ViewBinding(BaseLoginOrRegisterActivity baseLoginOrRegisterActivity, View view) {
        this.f58369a = baseLoginOrRegisterActivity;
        baseLoginOrRegisterActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        baseLoginOrRegisterActivity.mFragmentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ajf, "field 'mFragmentContainer'", ViewGroup.class);
    }
}
