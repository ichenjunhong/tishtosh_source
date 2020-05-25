package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nBaseMyProfileFragment_ViewBinding */
public class I18nBaseMyProfileFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private I18nBaseMyProfileFragment f102171a;

    /* renamed from: b */
    private View f102172b;

    /* renamed from: c */
    private View f102173c;

    public void unbind() {
        if (this.f102171a != null) {
            this.f102171a = null;
            this.f102172b.setOnClickListener(null);
            this.f102172b = null;
            this.f102173c.setOnClickListener(null);
            this.f102173c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public I18nBaseMyProfileFragment_ViewBinding(final I18nBaseMyProfileFragment i18nBaseMyProfileFragment, View view) {
        this.f102171a = i18nBaseMyProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.dh, "method 'addFriends'");
        this.f102172b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseMyProfileFragment.addFriends(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bn2, "method 'onMore'");
        this.f102173c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseMyProfileFragment.onMore(view);
            }
        });
    }
}
