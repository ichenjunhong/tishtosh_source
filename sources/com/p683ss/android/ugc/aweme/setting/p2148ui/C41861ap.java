package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27204b;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ap */
final /* synthetic */ class C41861ap implements OnClickListener {

    /* renamed from: a */
    private final EditText f106002a;

    C41861ap(EditText editText) {
        this.f106002a = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditText editText = this.f106002a;
        C27204b a = C27204b.m65627a();
        String obj = editText.getText().toString();
        a.f71832b = obj;
        a.f71831a.storeString("safe_host", obj);
    }
}
