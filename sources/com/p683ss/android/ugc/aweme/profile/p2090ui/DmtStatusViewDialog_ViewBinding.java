package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.DmtStatusViewDialog_ViewBinding */
public class DmtStatusViewDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DmtStatusViewDialog f102081a;

    public void unbind() {
        DmtStatusViewDialog dmtStatusViewDialog = this.f102081a;
        if (dmtStatusViewDialog != null) {
            this.f102081a = null;
            dmtStatusViewDialog.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DmtStatusViewDialog_ViewBinding(DmtStatusViewDialog dmtStatusViewDialog, View view) {
        this.f102081a = dmtStatusViewDialog;
        dmtStatusViewDialog.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
