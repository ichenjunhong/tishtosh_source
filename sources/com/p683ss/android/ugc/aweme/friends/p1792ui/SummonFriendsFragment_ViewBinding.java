package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.SummonFriendsFragment_ViewBinding */
public class SummonFriendsFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SummonFriendsFragment f85155a;

    /* renamed from: b */
    private View f85156b;

    /* renamed from: c */
    private View f85157c;

    /* renamed from: d */
    private View f85158d;

    /* renamed from: e */
    private TextWatcher f85159e;

    public void unbind() {
        SummonFriendsFragment summonFriendsFragment = this.f85155a;
        if (summonFriendsFragment != null) {
            this.f85155a = null;
            summonFriendsFragment.mSendView = null;
            summonFriendsFragment.mTitleView = null;
            summonFriendsFragment.mIvSearchBar = null;
            summonFriendsFragment.mBackView = null;
            summonFriendsFragment.mEditView = null;
            summonFriendsFragment.mBtnClear = null;
            summonFriendsFragment.mListView = null;
            summonFriendsFragment.mStatusView = null;
            this.f85156b.setOnClickListener(null);
            this.f85156b = null;
            this.f85157c.setOnClickListener(null);
            this.f85157c = null;
            ((TextView) this.f85158d).removeTextChangedListener(this.f85159e);
            this.f85159e = null;
            this.f85158d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SummonFriendsFragment_ViewBinding(final SummonFriendsFragment summonFriendsFragment, View view) {
        this.f85155a = summonFriendsFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.dfk, "field 'mSendView' and method 'click'");
        summonFriendsFragment.mSendView = (TextView) Utils.castView(findRequiredView, R.id.dfk, "field 'mSendView'", TextView.class);
        this.f85156b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                summonFriendsFragment.click(view);
            }
        });
        summonFriendsFragment.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        summonFriendsFragment.mIvSearchBar = (ImageView) Utils.findRequiredViewAsType(view, R.id.b3y, "field 'mIvSearchBar'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ik, "field 'mBackView' and method 'click'");
        summonFriendsFragment.mBackView = (ImageView) Utils.castView(findRequiredView2, R.id.ik, "field 'mBackView'", ImageView.class);
        this.f85157c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                summonFriendsFragment.click(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ac_, "field 'mEditView' and method 'onTextChange'");
        summonFriendsFragment.mEditView = (EditText) Utils.castView(findRequiredView3, R.id.ac_, "field 'mEditView'", EditText.class);
        this.f85158d = findRequiredView3;
        this.f85159e = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                summonFriendsFragment.onTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView3).addTextChangedListener(this.f85159e);
        summonFriendsFragment.mBtnClear = Utils.findRequiredView(view, R.id.nh, "field 'mBtnClear'");
        summonFriendsFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc3, "field 'mListView'", RecyclerView.class);
        summonFriendsFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        summonFriendsFragment.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
