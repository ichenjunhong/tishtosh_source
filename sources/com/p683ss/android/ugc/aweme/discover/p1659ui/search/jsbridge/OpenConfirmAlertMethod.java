package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.views.C48182c;
import com.p683ss.android.ugc.aweme.views.C48182c.C48184a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod */
public final class OpenConfirmAlertMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f75270a;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod$a */
    static final class C28676a implements OnDismissListener {

        /* renamed from: a */
        public static final C28676a f75271a = new C28676a();

        C28676a() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod$b */
    static final class C28677b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29789a f75272a;

        /* renamed from: b */
        final /* synthetic */ C48182c f75273b;

        C28677b(C29789a aVar, C48182c cVar) {
            this.f75272a = aVar;
            this.f75273b = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C29789a aVar = this.f75272a;
            if (aVar != null) {
                aVar.mo60039a((Object) "confirm");
            }
            this.f75273b.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.OpenConfirmAlertMethod$c */
    static final class C28678c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29789a f75274a;

        /* renamed from: b */
        final /* synthetic */ C48182c f75275b;

        C28678c(C29789a aVar, C48182c cVar) {
            this.f75274a = aVar;
            this.f75275b = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C29789a aVar = this.f75274a;
            if (aVar != null) {
                aVar.mo60039a((Object) "cancel");
            }
            this.f75275b.dismiss();
        }
    }

    public OpenConfirmAlertMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        super(aVar);
        this.f75270a = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString(C42311c.f106865i);
                String optString3 = jSONObject.optString("cancelText");
                String optString4 = jSONObject.optString("confirmText");
                if (optString == null) {
                    optString = "";
                }
                if (optString2 == null) {
                    optString2 = "";
                }
                if (optString3 == null) {
                    optString3 = "";
                }
                if (optString4 == null) {
                    optString4 = "";
                }
                C52711k.m112240b(optString, "title");
                C52711k.m112240b(optString2, C42311c.f106865i);
                C52711k.m112240b(optString3, "cancelText");
                C52711k.m112240b(optString4, "confirmText");
                try {
                    C48184a aVar2 = new C48184a();
                    aVar2.f121223a = optString;
                    aVar2.f121225c = Html.fromHtml(optString2);
                    aVar2.f121226d = true;
                    aVar2.f121227e = 16;
                    aVar2.f121228f = 3;
                    aVar2.f121234l = optString3;
                    aVar2.f121235m = optString4;
                    aVar2.f121237o = 422;
                    aVar2.f121236n = true;
                    C48182c cVar = new C48182c(ActivityStack.getTopActivity());
                    cVar.f121212a = aVar2;
                    cVar.setCanceledOnTouchOutside(false);
                    cVar.setOnDismissListener(C28676a.f75271a);
                    OnClickListener bVar = new C28677b(aVar, cVar);
                    if (cVar.f121212a != null) {
                        cVar.f121212a.f121240r = bVar;
                        OnClickListener cVar2 = new C28678c(aVar, cVar);
                        if (cVar.f121212a != null) {
                            cVar.f121212a.f121239q = cVar2;
                            cVar.show();
                            return;
                        }
                        throw new IllegalStateException("You must init Builder first !");
                    }
                    throw new IllegalStateException("You must init Builder first !");
                } catch (Throwable unused) {
                }
            } catch (Exception e) {
                C28668d.m67931a(e, "DisableInterceptMethod");
                aVar.mo60038a(0, e.getMessage());
            }
        }
    }
}
