package com.p683ss.android.ugc.aweme.notification.view.p2032a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.view.a.a */
public final class C38460a {
    /* renamed from: a */
    public static void m85792a(Context context, Throwable th) {
        m85793a(context, th, R.string.dnk);
    }

    /* renamed from: a */
    private static void m85793a(Context context, Throwable th, int i) {
        if (th != null) {
            if (th instanceof C23459a) {
                C23459a aVar = (C23459a) th;
                if (aVar.getErrorCode() != 2155) {
                    int errorCode = aVar.getErrorCode();
                    if (errorCode != 3070 && errorCode != 3071 && errorCode != 3072) {
                        if (errorCode == 8 && context != null) {
                            return;
                        }
                        if (errorCode == 1001) {
                            try {
                                new C11105a(context).mo20146b((CharSequence) aVar.getErrorMsg()).mo20136a((int) R.string.clf, (OnClickListener) new OnClickListener() {
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
                }
            } else if (context != null) {
                C10691a.m21542b(context, (int) R.string.dnk).mo19066a();
            }
        }
    }
}
