package com.p683ss.android.ugc.aweme.setting.p2148ui.widget;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.widget.StorageCleanLoadingDialog_ViewBinding */
public final class StorageCleanLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StorageCleanLoadingDialog f106042a;

    public final void unbind() {
        StorageCleanLoadingDialog storageCleanLoadingDialog = this.f106042a;
        if (storageCleanLoadingDialog != null) {
            this.f106042a = null;
            storageCleanLoadingDialog.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StorageCleanLoadingDialog_ViewBinding(StorageCleanLoadingDialog storageCleanLoadingDialog, View view) {
        this.f106042a = storageCleanLoadingDialog;
        storageCleanLoadingDialog.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
