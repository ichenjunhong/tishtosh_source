package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0214z;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p683ss.android.ugc.aweme.choosemusic.fragment.C24923c;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicFragmentView */
public class ChooseMusicFragmentView {

    /* renamed from: a */
    public C24923c f66106a;

    /* renamed from: b */
    public int f66107b;

    /* renamed from: c */
    public TextWatcher f66108c;
    public CommerceTipsItem commerceTipsItem;

    /* renamed from: d */
    MusicSearchStateViewModel f66109d;

    /* renamed from: e */
    public ValueAnimator f66110e;
    public FrameLayout endTextContainer;

    /* renamed from: f */
    public ValueAnimator f66111f;

    /* renamed from: g */
    int f66112g;
    public View mBackView;
    public TextView mCancelSearch;
    public ImageView mClearView;
    public LinearLayout mLinearSearch;
    public FrameLayout mMainLayout;
    public LinearLayout mRelativeSearch;
    public LinearLayout mSearchEditTextContainer;
    public EditText mSearchEditView;
    public SearchResultView mSearchLayout;
    public TextView mSearchTextView;
    public View mSkipView;
    public StarTcmItem starTcmItem;
    public TextView txtClickRecommend;

    /* renamed from: b */
    public final String mo50941b() {
        return this.mSearchEditView.getText().toString();
    }

    /* renamed from: a */
    public final void mo50939a() {
        if (this.f66106a.getActivity() != null) {
            this.mSearchEditView.post(new C24985f(this));
        }
    }

    /* renamed from: a */
    public ViewGroup mo50938a(View view) {
        while (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            if ((layoutParams instanceof C0505d) && (((C0505d) layoutParams).f1693a instanceof ViewPagerBottomSheetBehavior)) {
                return viewGroup;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo50940a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mSearchEditView.setText(charSequence);
            this.mSearchEditView.setSelection(charSequence.length());
        }
    }

    public ChooseMusicFragmentView(View view, C24923c cVar, int i, TextWatcher textWatcher) {
        this.f66106a = cVar;
        this.f66107b = i;
        this.f66108c = textWatcher;
        if (!(this.f66106a == null || this.f66106a.getActivity() == null)) {
            this.f66109d = (MusicSearchStateViewModel) C0214z.m440a(this.f66106a.getActivity()).mo359a(MusicSearchStateViewModel.class);
            this.f66109d.mo50680d().observe(this.f66106a, new C24981b(this));
        }
        ButterKnife.bind((Object) this, view);
        this.f66112g = C9432q.m18670a(view.getContext());
    }
}
