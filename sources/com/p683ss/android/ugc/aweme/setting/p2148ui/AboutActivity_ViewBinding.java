package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AboutActivity_ViewBinding */
public class AboutActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AboutActivity f105593a;

    /* renamed from: b */
    private View f105594b;

    public void unbind() {
        AboutActivity aboutActivity = this.f105593a;
        if (aboutActivity != null) {
            this.f105593a = null;
            aboutActivity.mVersionView = null;
            aboutActivity.mVisitWebsite = null;
            aboutActivity.mCopyEmail = null;
            this.f105594b.setOnClickListener(null);
            this.f105594b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AboutActivity_ViewBinding(final AboutActivity aboutActivity, View view) {
        this.f105593a = aboutActivity;
        aboutActivity.mVersionView = (TextView) Utils.findRequiredViewAsType(view, R.id.dog, "field 'mVersionView'", TextView.class);
        aboutActivity.mVisitWebsite = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.dsd, "field 'mVisitWebsite'", CommonItemView.class);
        aboutActivity.mCopyEmail = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a0k, "field 'mCopyEmail'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'exit'");
        this.f105594b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                aboutActivity.exit(view);
            }
        });
    }
}
