package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeUnlockFragment_ViewBinding */
public class TimeUnlockFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TimeUnlockFragment f60946a;

    public void unbind() {
        TimeUnlockFragment timeUnlockFragment = this.f60946a;
        if (timeUnlockFragment != null) {
            this.f60946a = null;
            timeUnlockFragment.desc = null;
            timeUnlockFragment.title = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TimeUnlockFragment_ViewBinding(TimeUnlockFragment timeUnlockFragment, View view) {
        this.f60946a = timeUnlockFragment;
        timeUnlockFragment.desc = (TextView) Utils.findOptionalViewAsType(view, R.id.dkb, "field 'desc'", TextView.class);
        timeUnlockFragment.title = (TextView) Utils.findOptionalViewAsType(view, R.id.dl0, "field 'title'", TextView.class);
    }
}
