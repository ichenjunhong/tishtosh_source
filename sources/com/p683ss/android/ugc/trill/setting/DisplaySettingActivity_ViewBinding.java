package com.p683ss.android.ugc.trill.setting;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.DisplaySettingActivity_ViewBinding */
public class DisplaySettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DisplaySettingActivity f126342a;

    public void unbind() {
        DisplaySettingActivity displaySettingActivity = this.f126342a;
        if (displaySettingActivity != null) {
            this.f126342a = null;
            displaySettingActivity.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DisplaySettingActivity_ViewBinding(DisplaySettingActivity displaySettingActivity, View view) {
        this.f126342a = displaySettingActivity;
        displaySettingActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cfc, "field 'rootView'", ViewGroup.class);
    }
}
