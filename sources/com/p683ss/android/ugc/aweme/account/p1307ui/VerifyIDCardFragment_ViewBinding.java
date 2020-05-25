package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.CheckButton;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerifyIDCardFragment_ViewBinding */
public class VerifyIDCardFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VerifyIDCardFragment f59973a;

    /* renamed from: b */
    private View f59974b;

    /* renamed from: c */
    private View f59975c;

    public void unbind() {
        VerifyIDCardFragment verifyIDCardFragment = this.f59973a;
        if (verifyIDCardFragment != null) {
            this.f59973a = null;
            verifyIDCardFragment.mSubTitle = null;
            verifyIDCardFragment.mIdCardEditText = null;
            verifyIDCardFragment.mDoneBtn = null;
            verifyIDCardFragment.mStatusView = null;
            this.f59974b.setOnClickListener(null);
            this.f59974b = null;
            this.f59975c.setOnClickListener(null);
            this.f59975c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerifyIDCardFragment_ViewBinding(final VerifyIDCardFragment verifyIDCardFragment, View view) {
        this.f59973a = verifyIDCardFragment;
        verifyIDCardFragment.mSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.cup, "field 'mSubTitle'", TextView.class);
        verifyIDCardFragment.mIdCardEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.a95, "field 'mIdCardEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.no, "field 'mDoneBtn' and method 'onClick'");
        verifyIDCardFragment.mDoneBtn = (CheckButton) Utils.castView(findRequiredView, R.id.no, "field 'mDoneBtn'", CheckButton.class);
        this.f59974b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                verifyIDCardFragment.onClick(view);
            }
        });
        verifyIDCardFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ik, "method 'onClick'");
        this.f59975c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                verifyIDCardFragment.onClick(view);
            }
        });
    }
}
