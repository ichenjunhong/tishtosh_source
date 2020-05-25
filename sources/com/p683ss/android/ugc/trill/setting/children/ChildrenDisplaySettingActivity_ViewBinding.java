package com.p683ss.android.ugc.trill.setting.children;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity_ViewBinding */
public class ChildrenDisplaySettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenDisplaySettingActivity f126374a;

    public void unbind() {
        ChildrenDisplaySettingActivity childrenDisplaySettingActivity = this.f126374a;
        if (childrenDisplaySettingActivity != null) {
            this.f126374a = null;
            childrenDisplaySettingActivity.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenDisplaySettingActivity_ViewBinding(ChildrenDisplaySettingActivity childrenDisplaySettingActivity, View view) {
        this.f126374a = childrenDisplaySettingActivity;
        childrenDisplaySettingActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cfc, "field 'rootView'", ViewGroup.class);
    }
}
