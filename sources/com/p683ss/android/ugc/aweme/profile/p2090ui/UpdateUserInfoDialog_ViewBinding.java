package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateUserInfoDialog_ViewBinding */
public class UpdateUserInfoDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UpdateUserInfoDialog f102600a;

    public void unbind() {
        UpdateUserInfoDialog updateUserInfoDialog = this.f102600a;
        if (updateUserInfoDialog != null) {
            this.f102600a = null;
            updateUserInfoDialog.mNickNameEditText = null;
            updateUserInfoDialog.mConfirmUpdate = null;
            updateUserInfoDialog.mClose = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpdateUserInfoDialog_ViewBinding(UpdateUserInfoDialog updateUserInfoDialog, View view) {
        this.f102600a = updateUserInfoDialog;
        updateUserInfoDialog.mNickNameEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.bqs, "field 'mNickNameEditText'", EditText.class);
        updateUserInfoDialog.mConfirmUpdate = (TextView) Utils.findRequiredViewAsType(view, R.id.yp, "field 'mConfirmUpdate'", TextView.class);
        updateUserInfoDialog.mClose = (ImageView) Utils.findRequiredViewAsType(view, R.id.us, "field 'mClose'", ImageView.class);
    }
}
