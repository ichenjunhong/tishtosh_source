package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.an */
final /* synthetic */ class C41859an implements OnEditorActionListener {

    /* renamed from: a */
    private final TestSettingFragment f106000a;

    C41859an(TestSettingFragment testSettingFragment) {
        this.f106000a = testSettingFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        TestSettingFragment testSettingFragment = this.f106000a;
        if (i != 6 && i != 0) {
            return false;
        }
        testSettingFragment.mo85717a();
        return true;
    }
}
