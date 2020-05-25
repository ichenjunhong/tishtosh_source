package com.p683ss.android.ugc.aweme.app.debug;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbsABActivity_ViewBinding */
public class AbsABActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsABActivity f61451a;

    /* renamed from: b */
    private View f61452b;

    public void unbind() {
        if (this.f61451a != null) {
            this.f61451a = null;
            this.f61452b.setOnClickListener(null);
            this.f61452b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsABActivity_ViewBinding(final AbsABActivity absABActivity, View view) {
        this.f61451a = absABActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.ij, "method 'back'");
        this.f61452b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absABActivity.back();
            }
        });
    }
}
