package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.l */
public class C14325l extends C14284ac {

    /* renamed from: k */
    private static final String f37272k = "com.facebook.internal.l";

    /* renamed from: l */
    private boolean f37273l;

    public void cancel() {
        WebView webView = this.f37208d;
        if (!this.f37214j || this.f37212h || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (!this.f37273l) {
            this.f37273l = true;
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            String sb2 = sb.toString();
            C18984e.m46161a(sb2);
            webView.loadUrl(sb2);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public final void run() {
                    C14325l.super.cancel();
                }
            }, 1500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo26484a(String str) {
        Bundle c = C14277aa.m29286c(Uri.parse(str).getQuery());
        String string = c.getString("bridge_args");
        c.remove("bridge_args");
        if (!C14277aa.m29276a(string)) {
            try {
                c.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C14299c.m29338a(new JSONObject(string)));
            } catch (JSONException e) {
                C14277aa.m29270a(f37272k, "Unable to parse bridge_args JSON", (Throwable) e);
            }
        }
        String string2 = c.getString("method_results");
        c.remove("method_results");
        if (!C14277aa.m29276a(string2)) {
            if (C14277aa.m29276a(string2)) {
                string2 = "{}";
            }
            try {
                c.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C14299c.m29338a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C14277aa.m29270a(f37272k, "Unable to parse bridge_args JSON", (Throwable) e2);
            }
        }
        c.remove(C42311c.f106863g);
        c.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C14353v.m29426a());
        return c;
    }

    private C14325l(Context context, String str, String str2) {
        super(context, str);
        this.f37206b = str2;
    }

    /* renamed from: a */
    public static C14325l m29378a(Context context, String str, String str2) {
        C14284ac.m29316a(context);
        return new C14325l(context, str, str2);
    }
}
