package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.StatusLoadingDialog_ViewBinding */
public final class StatusLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StatusLoadingDialog f114989a;

    public final void unbind() {
        StatusLoadingDialog statusLoadingDialog = this.f114989a;
        if (statusLoadingDialog != null) {
            this.f114989a = null;
            statusLoadingDialog.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StatusLoadingDialog_ViewBinding(StatusLoadingDialog statusLoadingDialog, View view) {
        this.f114989a = statusLoadingDialog;
        statusLoadingDialog.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
