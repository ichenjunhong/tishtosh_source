package com.p683ss.android.ugc.aweme.promote;

import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.p683ss.android.ugc.aweme.views.C48217o;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteNotificationDialog */
public class PromoteNotificationDialog extends C48217o {

    /* renamed from: a */
    private C48191h f103773a;
    View mBtnCancel;
    View mBtnJoin;
    TextView mTvDesc;
    TextView mTvTitle;

    public void dismiss() {
        super.dismiss();
        if (this.f103773a != null) {
            this.f103773a.dismiss();
        }
    }
}
