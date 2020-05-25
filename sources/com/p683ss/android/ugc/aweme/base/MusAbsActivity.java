package com.p683ss.android.ugc.aweme.base;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.MusAbsActivity */
public class MusAbsActivity extends AmeActivity {
    public int getStatusBarColor() {
        return getResources().getColor(R.color.a1v);
    }

    public void setStatusBarColor() {
        C23729p.m58255a((Activity) this, getStatusBarColor());
        C23729p.m58269c((Activity) this);
    }
}
