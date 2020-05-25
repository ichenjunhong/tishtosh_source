package com.p683ss.android.ugc.aweme.i18n.settings.agreements;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity_ViewBinding */
public class AgreementActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AgreementActivity f86124a;

    public void unbind() {
        AgreementActivity agreementActivity = this.f86124a;
        if (agreementActivity != null) {
            this.f86124a = null;
            agreementActivity.mWebView = null;
            agreementActivity.mBtn = null;
            agreementActivity.mBackBtn = null;
            agreementActivity.mTextView = null;
            agreementActivity.mStatusBarView = null;
            agreementActivity.mLoadingView = null;
            agreementActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AgreementActivity_ViewBinding(AgreementActivity agreementActivity, View view) {
        this.f86124a = agreementActivity;
        agreementActivity.mWebView = (WebView) Utils.findRequiredViewAsType(view, R.id.bnr, "field 'mWebView'", WebView.class);
        agreementActivity.mBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.e0, "field 'mBtn'", TextView.class);
        agreementActivity.mBackBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.ik, "field 'mBackBtn'", ImageView.class);
        agreementActivity.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTextView'", TextView.class);
        agreementActivity.mStatusBarView = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBarView'");
        agreementActivity.mLoadingView = Utils.findRequiredView(view, R.id.bhn, "field 'mLoadingView'");
        agreementActivity.mTitleBar = Utils.findRequiredView(view, R.id.d1b, "field 'mTitleBar'");
    }
}
