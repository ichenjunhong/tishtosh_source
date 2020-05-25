package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BaseControlSettingActivity_ViewBinding */
public class BaseControlSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseControlSettingActivity f105629a;

    /* renamed from: b */
    private View f105630b;

    public void unbind() {
        BaseControlSettingActivity baseControlSettingActivity = this.f105629a;
        if (baseControlSettingActivity != null) {
            this.f105629a = null;
            baseControlSettingActivity.mTitle = null;
            baseControlSettingActivity.mEveryoneItem = null;
            baseControlSettingActivity.mFriendsItem = null;
            baseControlSettingActivity.mOffItem = null;
            baseControlSettingActivity.mTipsView = null;
            this.f105630b.setOnClickListener(null);
            this.f105630b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseControlSettingActivity_ViewBinding(final BaseControlSettingActivity baseControlSettingActivity, View view) {
        this.f105629a = baseControlSettingActivity;
        baseControlSettingActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        baseControlSettingActivity.mEveryoneItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aci, "field 'mEveryoneItem'", CommonItemView.class);
        baseControlSettingActivity.mFriendsItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ajw, "field 'mFriendsItem'", CommonItemView.class);
        baseControlSettingActivity.mOffItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bu8, "field 'mOffItem'", CommonItemView.class);
        baseControlSettingActivity.mTipsView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d0p, "field 'mTipsView'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'back'");
        this.f105630b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseControlSettingActivity.back();
            }
        });
    }
}
