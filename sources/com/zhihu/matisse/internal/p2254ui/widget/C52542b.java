package com.zhihu.matisse.internal.p2254ui.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.b */
public class C52542b extends C0649f {
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        C1161a aVar = new C1161a(getActivity());
        if (!TextUtils.isEmpty(string)) {
            aVar.mo3764a((CharSequence) string);
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.mo3770b((CharSequence) string2);
        }
        aVar.mo3759a((int) R.string.c4o, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return aVar.mo3772b();
    }

    /* renamed from: a */
    public static C52542b m112029a(String str, String str2) {
        C52542b bVar = new C52542b();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        bVar.setArguments(bundle);
        return bVar;
    }
}
