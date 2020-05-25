package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.EditText;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27210d;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.az */
final /* synthetic */ class C41871az implements OnClickListener {

    /* renamed from: a */
    private final EditText f106020a;

    C41871az(EditText editText) {
        this.f106020a = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EditText editText = this.f106020a;
        C27210d a = C27210d.m65634a();
        String obj = editText.getText().toString();
        a.f71843a = obj;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C11010c.m22280a());
        if (obj != null) {
            defaultSharedPreferences.edit().putString("rn_debug_source_url_safe_host", obj).apply();
        } else {
            defaultSharedPreferences.edit().remove("rn_debug_source_url_safe_host").apply();
        }
    }
}
