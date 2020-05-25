package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockSelectTimeFragmentV2_ViewBinding */
public class TimeLockSelectTimeFragmentV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TimeLockSelectTimeFragmentV2 f60978a;

    /* renamed from: b */
    private View f60979b;

    public void unbind() {
        TimeLockSelectTimeFragmentV2 timeLockSelectTimeFragmentV2 = this.f60978a;
        if (timeLockSelectTimeFragmentV2 != null) {
            this.f60978a = null;
            timeLockSelectTimeFragmentV2.mTitle = null;
            timeLockSelectTimeFragmentV2.mContainerLayout = null;
            this.f60979b.setOnClickListener(null);
            this.f60979b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TimeLockSelectTimeFragmentV2_ViewBinding(final TimeLockSelectTimeFragmentV2 timeLockSelectTimeFragmentV2, View view) {
        this.f60978a = timeLockSelectTimeFragmentV2;
        timeLockSelectTimeFragmentV2.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        timeLockSelectTimeFragmentV2.mContainerLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.yw, "field 'mContainerLayout'", ViewGroup.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'back'");
        this.f60979b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                timeLockSelectTimeFragmentV2.back();
            }
        });
    }
}
