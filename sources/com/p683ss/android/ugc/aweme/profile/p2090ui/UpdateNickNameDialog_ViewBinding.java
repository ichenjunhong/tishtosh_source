package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog_ViewBinding */
public class UpdateNickNameDialog_ViewBinding extends UpdateUserInfoDialog_ViewBinding {

    /* renamed from: a */
    private UpdateNickNameDialog f102594a;

    public void unbind() {
        UpdateNickNameDialog updateNickNameDialog = this.f102594a;
        if (updateNickNameDialog != null) {
            this.f102594a = null;
            updateNickNameDialog.mPolicyDes = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpdateNickNameDialog_ViewBinding(UpdateNickNameDialog updateNickNameDialog, View view) {
        super(updateNickNameDialog, view);
        this.f102594a = updateNickNameDialog;
        updateNickNameDialog.mPolicyDes = (TextView) Utils.findRequiredViewAsType(view, R.id.c3i, "field 'mPolicyDes'", TextView.class);
    }
}
