package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity_ViewBinding */
public class SetTimeLockActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SetTimeLockActivity f60937a;

    public void unbind() {
        SetTimeLockActivity setTimeLockActivity = this.f60937a;
        if (setTimeLockActivity != null) {
            this.f60937a = null;
            setTimeLockActivity.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SetTimeLockActivity_ViewBinding(SetTimeLockActivity setTimeLockActivity, View view) {
        this.f60937a = setTimeLockActivity;
        setTimeLockActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cfc, "field 'rootView'", ViewGroup.class);
    }
}
