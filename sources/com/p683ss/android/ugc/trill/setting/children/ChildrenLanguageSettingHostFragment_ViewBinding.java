package com.p683ss.android.ugc.trill.setting.children;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment_ViewBinding */
public class ChildrenLanguageSettingHostFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenLanguageSettingHostFragment f126376a;

    /* renamed from: b */
    private View f126377b;

    /* renamed from: c */
    private View f126378c;

    public void unbind() {
        ChildrenLanguageSettingHostFragment childrenLanguageSettingHostFragment = this.f126376a;
        if (childrenLanguageSettingHostFragment != null) {
            this.f126376a = null;
            childrenLanguageSettingHostFragment.mTitleLayout = null;
            childrenLanguageSettingHostFragment.mTitle = null;
            childrenLanguageSettingHostFragment.mChangeLanguageItem = null;
            this.f126377b.setOnClickListener(null);
            this.f126377b = null;
            this.f126378c.setOnClickListener(null);
            this.f126378c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenLanguageSettingHostFragment_ViewBinding(final ChildrenLanguageSettingHostFragment childrenLanguageSettingHostFragment, View view) {
        this.f126376a = childrenLanguageSettingHostFragment;
        childrenLanguageSettingHostFragment.mTitleLayout = Utils.findRequiredView(view, R.id.d1b, "field 'mTitleLayout'");
        childrenLanguageSettingHostFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.se, "field 'mChangeLanguageItem' and method 'changeLanguage'");
        childrenLanguageSettingHostFragment.mChangeLanguageItem = (CommonItemView) Utils.castView(findRequiredView, R.id.se, "field 'mChangeLanguageItem'", CommonItemView.class);
        this.f126377b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                childrenLanguageSettingHostFragment.changeLanguage();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ik, "method 'exit'");
        this.f126378c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                childrenLanguageSettingHostFragment.exit(view);
            }
        });
    }
}
