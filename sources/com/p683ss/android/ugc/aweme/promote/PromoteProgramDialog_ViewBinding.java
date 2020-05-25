package com.p683ss.android.ugc.aweme.promote;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramDialog_ViewBinding */
public class PromoteProgramDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PromoteProgramDialog f103786a;

    public void unbind() {
        PromoteProgramDialog promoteProgramDialog = this.f103786a;
        if (promoteProgramDialog != null) {
            this.f103786a = null;
            promoteProgramDialog.mTvTitle = null;
            promoteProgramDialog.mTvMsg = null;
            promoteProgramDialog.mTvProtocol = null;
            promoteProgramDialog.mBtnJoin = null;
            promoteProgramDialog.mBtnNext = null;
            promoteProgramDialog.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PromoteProgramDialog_ViewBinding(PromoteProgramDialog promoteProgramDialog, View view) {
        this.f103786a = promoteProgramDialog;
        promoteProgramDialog.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.dhb, "field 'mTvTitle'", TextView.class);
        promoteProgramDialog.mTvMsg = (TextView) Utils.findRequiredViewAsType(view, R.id.dc5, "field 'mTvMsg'", TextView.class);
        promoteProgramDialog.mTvProtocol = (TextView) Utils.findRequiredViewAsType(view, R.id.de7, "field 'mTvProtocol'", TextView.class);
        promoteProgramDialog.mBtnJoin = Utils.findRequiredView(view, R.id.o4, "field 'mBtnJoin'");
        promoteProgramDialog.mBtnNext = Utils.findRequiredView(view, R.id.ol, "field 'mBtnNext'");
        promoteProgramDialog.mRootView = Utils.findRequiredView(view, R.id.cfc, "field 'mRootView'");
        promoteProgramDialog.mStrRegular = view.getContext().getResources().getString(R.string.d0_);
    }
}
