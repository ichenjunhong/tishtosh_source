package com.p683ss.android.ugc.aweme.app.api.p1366b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.ss.android.ugc.trill.R;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.api.b.a */
public final class C22971a {
    /* renamed from: a */
    public static Throwable m56490a(Throwable th) {
        if (th instanceof ExecutionException) {
            return th.getCause();
        }
        return th;
    }

    /* renamed from: a */
    public static C23459a m56489a(Exception exc) {
        if (exc instanceof C23459a) {
            return (C23459a) exc;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof C23459a) {
            return (C23459a) cause;
        }
        return null;
    }

    /* renamed from: a */
    public static void m56493a(Context context, Throwable th) {
        m56494a(context, th, R.string.dnk);
    }

    /* renamed from: a */
    public static void m56491a(Context context, C23459a aVar) {
        if (!TextUtils.isEmpty(aVar.getResponse())) {
            try {
                JSONObject jSONObject = new JSONObject(aVar.getResponse());
                if (!TextUtils.isEmpty(jSONObject.optString("status_msg"))) {
                    aVar.setErrorMsg(jSONObject.optString("status_msg"));
                }
            } catch (JSONException unused) {
            }
        }
        m56494a(context, aVar, R.string.dnk);
    }

    /* renamed from: b */
    public static int m56495b(Context context, Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            i = 13;
        } else if (th instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    i = 21;
                } else if (th instanceof C19174b) {
                    if (((C19174b) th).getStatusCode() == 503) {
                        i = 19;
                    } else {
                        i = 16;
                    }
                } else if (!(th instanceof IOException)) {
                    i = 18;
                }
            }
            i = 15;
        }
        if (context == null) {
            return i;
        }
        if ((i == 15 || i == 14) && !C22973b.m56496a(context)) {
            return 12;
        }
        return i;
    }

    /* renamed from: a */
    public static void m56494a(Context context, Throwable th, int i) {
        if (th != null) {
            C23459a aVar = null;
            if (th instanceof C23459a) {
                aVar = (C23459a) th;
            } else {
                Throwable cause = th.getCause();
                if (cause instanceof C23459a) {
                    aVar = (C23459a) cause;
                }
            }
            if (aVar != null) {
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
                                    C20854a.m53161a().interceptorService().promptIfNeededOrToast(context, aVar.getPrompt(), errorCode);
                                } else if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                                    C20854a.m53161a().interceptorService().promptIfNeededOrToast(context, aVar.getErrorMsg(), errorCode);
                                } else if (aVar.getErrorCode() == 100) {
                                    C10691a.m21542b(context, (int) R.string.a85).mo19066a();
                                } else {
                                    C10691a.m21542b(context, i).mo19066a();
                                }
                            }
                        }
                    }
                }
            } else if (context != null) {
                C10691a.m21542b(context, i).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public static void m56492a(Context context, Exception exc, int i, int i2) {
        Throwable a = m56490a((Throwable) exc);
        if (a instanceof C23459a) {
            C23459a aVar = (C23459a) a;
            if (aVar.getErrorCode() == 2752) {
                String errorMsg = aVar.getErrorMsg();
                String string = context.getResources().getString(i2);
                C10643a a2 = new C10643a(context).mo18885a((int) R.string.c4h);
                if (TextUtils.isEmpty(errorMsg)) {
                    errorMsg = string;
                }
                a2.mo18902b(errorMsg).mo18886a((int) R.string.ah2, (OnClickListener) null).mo18897a().mo18882b();
            }
        }
    }
}
