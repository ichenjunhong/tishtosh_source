package com.p683ss.android.ugc.aweme.account.api;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.api.b */
public final class C20897b {
    /* renamed from: a */
    public static void m53229a(Context context, Exception exc) {
        m53230a(context, exc, R.string.dnk);
    }

    /* renamed from: a */
    private static void m53230a(Context context, Exception exc, int i) {
        if (exc instanceof C23459a) {
            C23459a aVar = (C23459a) exc;
            if (aVar.getErrorCode() != 2155) {
                int errorCode = aVar.getErrorCode();
                if (errorCode == 1001) {
                    try {
                        C22284v.m55156a(context).mo20146b((CharSequence) aVar.getErrorMsg()).mo20136a((int) R.string.clf, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).mo20148b();
                    } catch (Exception unused) {
                    }
                } else {
                    if (!(errorCode == 2003 || errorCode == 2004 || context == null)) {
                        if (!TextUtils.isEmpty(aVar.getPrompt())) {
                            C10691a.m21545b(context, aVar.getPrompt()).mo19066a();
                        } else if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                            C10691a.m21545b(context, aVar.getErrorMsg()).mo19066a();
                        } else if (aVar.getErrorCode() == 100) {
                            C10691a.m21542b(context, (int) R.string.a85).mo19066a();
                        } else {
                            C10691a.m21542b(context, (int) R.string.dnk).mo19066a();
                        }
                    }
                }
            }
        } else if (context != null) {
            if (exc == null || TextUtils.isEmpty(exc.getMessage())) {
                C10691a.m21542b(context, (int) R.string.dnk).mo19066a();
            } else {
                C10691a.m21545b(context, exc.getMessage()).mo19066a();
            }
        }
    }
}
