package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.view.View;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.DetailKeyboardDialogFragment_ViewBinding */
public class DetailKeyboardDialogFragment_ViewBinding extends KeyboardDialogFragment_ViewBinding {

    /* renamed from: a */
    private DetailKeyboardDialogFragment f66935a;

    public void unbind() {
        DetailKeyboardDialogFragment detailKeyboardDialogFragment = this.f66935a;
        if (detailKeyboardDialogFragment != null) {
            this.f66935a = null;
            detailKeyboardDialogFragment.tabDivider = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DetailKeyboardDialogFragment_ViewBinding(DetailKeyboardDialogFragment detailKeyboardDialogFragment, View view) {
        super(detailKeyboardDialogFragment, view);
        this.f66935a = detailKeyboardDialogFragment;
        detailKeyboardDialogFragment.tabDivider = Utils.findRequiredView(view, R.id.cwp, "field 'tabDivider'");
    }
}
