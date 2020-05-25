package com.p683ss.android.newmedia.p1202ui.webview;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.newmedia.ui.webview.c */
final /* synthetic */ class C19620c implements C0011g {

    /* renamed from: a */
    private final Context f54052a;

    C19620c(Context context) {
        this.f54052a = context;
    }

    public final Object then(C0013i iVar) {
        Context context = this.f54052a;
        if (((Boolean) iVar.mo34e()).booleanValue()) {
            Toast makeText = Toast.makeText(context, R.string.e04, 1);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
        }
        return null;
    }
}
