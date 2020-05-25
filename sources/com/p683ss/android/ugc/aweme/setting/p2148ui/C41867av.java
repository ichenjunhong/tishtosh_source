package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.EditText;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.av */
final /* synthetic */ class C41867av implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f106009a;

    /* renamed from: b */
    private final Editor f106010b;

    /* renamed from: c */
    private final EditText f106011c;

    C41867av(TestSettingFragment testSettingFragment, Editor editor, EditText editText) {
        this.f106009a = testSettingFragment;
        this.f106010b = editor;
        this.f106011c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TestSettingFragment testSettingFragment = this.f106009a;
        Editor editor = this.f106010b;
        EditText editText = this.f106011c;
        editor.putString("rn_setting_bundle_url", editText.getText().toString()).apply();
        Context context = testSettingFragment.getContext();
        StringBuilder sb = new StringBuilder("set bundle url: ");
        sb.append(editText.getText().toString());
        C10691a.m21552c(context, sb.toString(), 0).mo19066a();
    }
}
