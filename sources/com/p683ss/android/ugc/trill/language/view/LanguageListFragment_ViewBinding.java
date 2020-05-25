package com.p683ss.android.ugc.trill.language.view;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.language.view.LanguageListFragment_ViewBinding */
public class LanguageListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LanguageListFragment f126301a;

    public void unbind() {
        LanguageListFragment languageListFragment = this.f126301a;
        if (languageListFragment != null) {
            this.f126301a = null;
            languageListFragment.mBtnFinish = null;
            languageListFragment.mListLanguage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LanguageListFragment_ViewBinding(LanguageListFragment languageListFragment, View view) {
        this.f126301a = languageListFragment;
        languageListFragment.mBtnFinish = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mBtnFinish'", TextTitleBar.class);
        languageListFragment.mListLanguage = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bbx, "field 'mListLanguage'", RecyclerView.class);
    }
}
