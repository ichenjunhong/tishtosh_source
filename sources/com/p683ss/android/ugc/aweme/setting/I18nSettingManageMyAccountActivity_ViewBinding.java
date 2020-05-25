package com.p683ss.android.ugc.aweme.setting;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity_ViewBinding */
public class I18nSettingManageMyAccountActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private I18nSettingManageMyAccountActivity f105179a;

    /* renamed from: b */
    private View f105180b;

    public void unbind() {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.f105179a;
        if (i18nSettingManageMyAccountActivity != null) {
            this.f105179a = null;
            i18nSettingManageMyAccountActivity.statusBar = null;
            i18nSettingManageMyAccountActivity.mTitle = null;
            i18nSettingManageMyAccountActivity.mMyQrCodeItem = null;
            i18nSettingManageMyAccountActivity.mBindPhoneItem = null;
            i18nSettingManageMyAccountActivity.mSetOrChangePwd = null;
            i18nSettingManageMyAccountActivity.mLoginDeviceManagerItem = null;
            i18nSettingManageMyAccountActivity.mSaveLoginInfoItem = null;
            i18nSettingManageMyAccountActivity.mRequestVerificationItem = null;
            i18nSettingManageMyAccountActivity.mDeleteAccount = null;
            i18nSettingManageMyAccountActivity.mSwitchAccount = null;
            i18nSettingManageMyAccountActivity.mSecurityCenter = null;
            i18nSettingManageMyAccountActivity.mEmailItem = null;
            this.f105180b.setOnClickListener(null);
            this.f105180b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public I18nSettingManageMyAccountActivity_ViewBinding(final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, View view) {
        this.f105179a = i18nSettingManageMyAccountActivity;
        i18nSettingManageMyAccountActivity.statusBar = Utils.findRequiredView(view, R.id.csm, "field 'statusBar'");
        i18nSettingManageMyAccountActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        i18nSettingManageMyAccountActivity.mMyQrCodeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bpd, "field 'mMyQrCodeItem'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mBindPhoneItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.avc, "field 'mBindPhoneItem'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mSetOrChangePwd = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.clw, "field 'mSetOrChangePwd'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mLoginDeviceManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bj3, "field 'mLoginDeviceManagerItem'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mSaveLoginInfoItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cgv, "field 'mSaveLoginInfoItem'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mRequestVerificationItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cbp, "field 'mRequestVerificationItem'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mDeleteAccount = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.a43, "field 'mDeleteAccount'", DmtTextView.class);
        i18nSettingManageMyAccountActivity.mSwitchAccount = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cvy, "field 'mSwitchAccount'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mSecurityCenter = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.euk, "field 'mSecurityCenter'", CommonItemView.class);
        i18nSettingManageMyAccountActivity.mEmailItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.dwb, "field 'mEmailItem'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'exit'");
        this.f105180b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nSettingManageMyAccountActivity.exit(view);
            }
        });
    }
}
