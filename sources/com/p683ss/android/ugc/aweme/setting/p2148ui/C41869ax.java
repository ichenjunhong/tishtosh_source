package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.p683ss.android.ugc.aweme.bullet.C24098a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ax */
final /* synthetic */ class C41869ax implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f106015a;

    /* renamed from: b */
    private final EditText f106016b;

    C41869ax(TestSettingFragment testSettingFragment, EditText editText) {
        this.f106015a = testSettingFragment;
        this.f106016b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C24098a.m58974a(this.f106015a.getContext(), this.f106016b.getText().toString());
    }
}
