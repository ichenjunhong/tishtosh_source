package com.p683ss.android.ugc.aweme.promote;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteNotificationDialog_ViewBinding */
public class PromoteNotificationDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PromoteNotificationDialog f103774a;

    public void unbind() {
        PromoteNotificationDialog promoteNotificationDialog = this.f103774a;
        if (promoteNotificationDialog != null) {
            this.f103774a = null;
            promoteNotificationDialog.mTvTitle = null;
            promoteNotificationDialog.mTvDesc = null;
            promoteNotificationDialog.mBtnJoin = null;
            promoteNotificationDialog.mBtnCancel = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PromoteNotificationDialog_ViewBinding(PromoteNotificationDialog promoteNotificationDialog, View view) {
        this.f103774a = promoteNotificationDialog;
        promoteNotificationDialog.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.dhb, "field 'mTvTitle'", TextView.class);
        promoteNotificationDialog.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.d98, "field 'mTvDesc'", TextView.class);
        promoteNotificationDialog.mBtnJoin = Utils.findRequiredView(view, R.id.o4, "field 'mBtnJoin'");
        promoteNotificationDialog.mBtnCancel = Utils.findRequiredView(view, R.id.ne, "field 'mBtnCancel'");
    }
}
