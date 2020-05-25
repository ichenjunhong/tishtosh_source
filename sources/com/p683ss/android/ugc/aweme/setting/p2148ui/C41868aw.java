package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.EditText;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.aw */
final /* synthetic */ class C41868aw implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f106012a;

    /* renamed from: b */
    private final EditText f106013b;

    /* renamed from: c */
    private final Editor f106014c;

    C41868aw(TestSettingFragment testSettingFragment, EditText editText, Editor editor) {
        this.f106012a = testSettingFragment;
        this.f106013b = editText;
        this.f106014c = editor;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TestSettingFragment testSettingFragment = this.f106012a;
        EditText editText = this.f106013b;
        Editor editor = this.f106014c;
        editText.setText("");
        editor.putString("rn_setting_bundle_url", "").apply();
        C10691a.m21552c(testSettingFragment.getContext(), "clear bundle url success", 0).mo19066a();
    }
}
