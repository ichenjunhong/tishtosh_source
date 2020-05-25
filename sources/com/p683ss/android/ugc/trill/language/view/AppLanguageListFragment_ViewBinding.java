package com.p683ss.android.ugc.trill.language.view;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.language.view.AppLanguageListFragment_ViewBinding */
public class AppLanguageListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AppLanguageListFragment f126295a;

    public void unbind() {
        AppLanguageListFragment appLanguageListFragment = this.f126295a;
        if (appLanguageListFragment != null) {
            this.f126295a = null;
            appLanguageListFragment.mBtnFinish = null;
            appLanguageListFragment.mListLanguage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AppLanguageListFragment_ViewBinding(AppLanguageListFragment appLanguageListFragment, View view) {
        this.f126295a = appLanguageListFragment;
        appLanguageListFragment.mBtnFinish = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mBtnFinish'", TextTitleBar.class);
        appLanguageListFragment.mListLanguage = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bbx, "field 'mListLanguage'", RecyclerView.class);
    }
}
