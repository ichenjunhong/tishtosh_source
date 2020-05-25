package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.b */
public class C27231b extends WebChromeClient {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71875a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27231b.class), "popupBlackList", "getPopupBlackList()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/PopupBlackList;"))};

    /* renamed from: c */
    public static final C27232a f71876c = new C27232a(null);

    /* renamed from: b */
    public boolean f71877b = true;

    /* renamed from: d */
    private final C52668f f71878d = C52732g.m112285a(C27233b.f71879a);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.b$a */
    public static final class C27232a {
        private C27232a() {
        }

        public /* synthetic */ C27232a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.b$b */
    static final class C27233b extends C52712l implements C52670a<PopupBlackList> {

        /* renamed from: a */
        public static final C27233b f71879a = new C27233b();

        C27233b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m65653a();
        }

        /* renamed from: a */
        private static PopupBlackList m65653a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                return b.getPopupBlackList();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private final PopupBlackList m65651a() {
        return (PopupBlackList) this.f71878d.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m65652a(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r1 = r7.m65651a()
            if (r1 != 0) goto L_0x000d
            boolean r8 = r7.f71877b
            return r8
        L_0x000d:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r1 = r7.m65651a()
            r2 = 1
            if (r1 == 0) goto L_0x001f
            java.lang.Integer r1 = r1.getDimensional()
            if (r1 == 0) goto L_0x001f
            int r1 = r1.intValue()
            goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r3 = r7.m65651a()
            if (r3 == 0) goto L_0x005d
            java.util.List r3 = r3.getKeywordList()
            if (r3 == 0) goto L_0x005d
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003b
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x005d
        L_0x003b:
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = p2628d.p2650m.C52830p.m112455b(r5, r4, r0)
            if (r4 == 0) goto L_0x003f
            r8 = 1
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            boolean r3 = r7.f71877b
            if (r3 == 0) goto L_0x006d
            switch(r1) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            r8 = 0
            goto L_0x006a
        L_0x0067:
            if (r8 != 0) goto L_0x0065
            r8 = 1
        L_0x006a:
            if (r8 == 0) goto L_0x006d
            return r2
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27231b.m65652a(java.lang.String):boolean");
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (m65652a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (m65652a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.confirm();
        }
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (m65652a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (m65652a(str)) {
            return false;
        }
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
        return true;
    }
}
