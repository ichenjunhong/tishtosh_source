package com.p683ss.android.ugc.trill.language;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialog_ViewBinding */
public class ChooseLanguageDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChooseLanguageDialog f126216a;

    public void unbind() {
        ChooseLanguageDialog chooseLanguageDialog = this.f126216a;
        if (chooseLanguageDialog != null) {
            this.f126216a = null;
            chooseLanguageDialog.mLanguageList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChooseLanguageDialog_ViewBinding(ChooseLanguageDialog chooseLanguageDialog, View view) {
        this.f126216a = chooseLanguageDialog;
        chooseLanguageDialog.mLanguageList = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bbx, "field 'mLanguageList'", RecyclerView.class);
    }
}
