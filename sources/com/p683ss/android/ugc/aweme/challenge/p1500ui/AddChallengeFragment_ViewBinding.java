package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.AddChallengeFragment_ViewBinding */
public class AddChallengeFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddChallengeFragment f65086a;

    /* renamed from: b */
    private View f65087b;

    /* renamed from: c */
    private View f65088c;

    /* renamed from: d */
    private TextWatcher f65089d;

    public void unbind() {
        AddChallengeFragment addChallengeFragment = this.f65086a;
        if (addChallengeFragment != null) {
            this.f65086a = null;
            addChallengeFragment.mSendView = null;
            addChallengeFragment.mLabelView = null;
            addChallengeFragment.mEditView = null;
            addChallengeFragment.mListView = null;
            addChallengeFragment.mLoadingView = null;
            addChallengeFragment.mHideChallengeLayout = null;
            addChallengeFragment.mTitleBar = null;
            this.f65087b.setOnClickListener(null);
            this.f65087b = null;
            ((TextView) this.f65088c).removeTextChangedListener(this.f65089d);
            this.f65089d = null;
            this.f65088c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddChallengeFragment_ViewBinding(final AddChallengeFragment addChallengeFragment, View view) {
        this.f65086a = addChallengeFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.cjt, "field 'mSendView' and method 'click'");
        addChallengeFragment.mSendView = (TextView) Utils.castView(findRequiredView, R.id.cjt, "field 'mSendView'", TextView.class);
        this.f65087b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addChallengeFragment.click(view);
            }
        });
        addChallengeFragment.mLabelView = Utils.findRequiredView(view, R.id.apo, "field 'mLabelView'");
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cj3, "field 'mEditView' and method 'onTextChange'");
        addChallengeFragment.mEditView = (EditText) Utils.castView(findRequiredView2, R.id.cj3, "field 'mEditView'", EditText.class);
        this.f65088c = findRequiredView2;
        this.f65089d = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                addChallengeFragment.onTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f65089d);
        addChallengeFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc3, "field 'mListView'", RecyclerView.class);
        addChallengeFragment.mLoadingView = (ImageView) Utils.findRequiredViewAsType(view, R.id.bh6, "field 'mLoadingView'", ImageView.class);
        addChallengeFragment.mHideChallengeLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.avm, "field 'mHideChallengeLayout'", LinearLayout.class);
        addChallengeFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", ButtonTitleBar.class);
        addChallengeFragment.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
