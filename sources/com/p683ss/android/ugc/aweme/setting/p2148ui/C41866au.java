package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.widget.EditText;
import com.p683ss.android.ugc.aweme.live.C36173w;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.au */
final /* synthetic */ class C41866au implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f106007a;

    /* renamed from: b */
    private final EditText f106008b;

    C41866au(TestSettingFragment testSettingFragment, EditText editText) {
        this.f106007a = testSettingFragment;
        this.f106008b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TestSettingFragment testSettingFragment = this.f106007a;
        EditText editText = this.f106008b;
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            Intent intent = new Intent(testSettingFragment.getActivity(), C36173w.m81665a().getDebugHandler().mo70086c());
            intent.putExtra("room_id", Long.parseLong(obj));
            testSettingFragment.startActivity(intent);
        }
    }
}
