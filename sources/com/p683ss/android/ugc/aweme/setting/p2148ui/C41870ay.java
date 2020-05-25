package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.widget.EditText;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ay */
final /* synthetic */ class C41870ay implements OnClickListener {

    /* renamed from: a */
    private final Editor f106017a;

    /* renamed from: b */
    private final EditText f106018b;

    /* renamed from: c */
    private final EditText f106019c;

    C41870ay(Editor editor, EditText editText, EditText editText2) {
        this.f106017a = editor;
        this.f106018b = editText;
        this.f106019c = editText2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Editor editor = this.f106017a;
        EditText editText = this.f106018b;
        EditText editText2 = this.f106019c;
        editor.putBoolean("js_bundle_deltas", false);
        editor.putString("debug_http_host", editText.getText().toString());
        editor.putString("test_schema", editText2.getText().toString()).apply();
        String obj = editText2.getText().toString();
        C41302w.m91042a().mo83861a(Uri.parse(obj).buildUpon().appendQueryParameter("rn_schema", obj).toString());
    }
}
