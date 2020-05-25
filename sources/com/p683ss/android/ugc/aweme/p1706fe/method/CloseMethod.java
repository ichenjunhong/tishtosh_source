package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11016e.C11018b;
import com.p683ss.android.sdk.webview.C19748c;
import com.p683ss.android.ugc.aweme.live.p1920c.C36062a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod */
public final class CloseMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29792a f77801a = new C29792a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod$a */
    public static final class C29792a {
        private C29792a() {
        }

        public /* synthetic */ C29792a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.CloseMethod$b */
    public static final class C29793b {

        /* renamed from: a */
        public final int f77802a;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C29793b) {
                    if (this.f77802a == ((C29793b) obj).f77802a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f77802a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WebViewFragmentBackEvent(webViewHash=");
            sb.append(this.f77802a);
            sb.append(")");
            return sb.toString();
        }

        public C29793b(int i) {
            this.f77802a = i;
        }
    }

    public CloseMethod() {
        this(null, 1, null);
    }

    public CloseMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        boolean z;
        if (this.f77795g != null) {
            int i = 0;
            if (jSONObject != null) {
                String optString = jSONObject.optString("reactId");
                CharSequence charSequence = optString;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    optString = null;
                }
                if (optString != null) {
                    C47718bf.m103288a(new C19748c(optString));
                    return;
                }
            }
            WeakReference weakReference = this.f77793e;
            if (weakReference != null) {
                Context context = (Context) weakReference.get();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (!activity.isFinishing()) {
                        if (context instanceof C11018b) {
                            C10757a aVar2 = this.f77795g;
                            if (aVar2 != null) {
                                WebView webView = aVar2.f28930d;
                                if (webView != null) {
                                    i = webView.hashCode();
                                }
                            }
                            C47718bf.m103288a(new C29793b(i));
                        } else {
                            activity.finish();
                        }
                    }
                }
                C47718bf.m103288a(new C36062a(C36062a.f92417b));
            }
        }
    }

    private /* synthetic */ CloseMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
