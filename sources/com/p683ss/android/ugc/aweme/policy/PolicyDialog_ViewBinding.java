package com.p683ss.android.ugc.aweme.policy;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.policy.PolicyDialog_ViewBinding */
public class PolicyDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PolicyDialog f101044a;

    public void unbind() {
        PolicyDialog policyDialog = this.f101044a;
        if (policyDialog != null) {
            this.f101044a = null;
            policyDialog.mTvAccept = null;
            policyDialog.mWebView = null;
            policyDialog.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PolicyDialog_ViewBinding(PolicyDialog policyDialog, View view) {
        this.f101044a = policyDialog;
        policyDialog.mTvAccept = (TextView) Utils.findRequiredViewAsType(view, R.id.d6j, "field 'mTvAccept'", TextView.class);
        policyDialog.mWebView = (WebView) Utils.findRequiredViewAsType(view, R.id.duj, "field 'mWebView'", WebView.class);
        policyDialog.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
    }
}
