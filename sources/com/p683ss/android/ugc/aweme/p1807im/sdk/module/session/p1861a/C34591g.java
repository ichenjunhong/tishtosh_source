package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.C35463m;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.g */
public final class C34591g extends C35456b {

    /* renamed from: a */
    public final String f89137a = "notice_under_16_session";

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.g$a */
    static final class C34592a implements C35457c {

        /* renamed from: a */
        final /* synthetic */ C34591g f89138a;

        C34592a(C34591g gVar) {
            this.f89138a = gVar;
        }

        /* renamed from: a */
        public final void mo72636a(Context context, C35456b bVar, int i) {
            if (i == 0) {
                C26891a aVar = new C26891a(context);
                aVar.mo54844a((CharSequence[]) new String[]{context.getString(R.string.bge)}, (OnClickListener) new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C34592a f89139a;

                    {
                        this.f89139a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        if (i == 0) {
                            C35284t a = C35284t.m79782a();
                            C52711k.m112236a((Object) a, "IMSPUtils.get()");
                            a.mo73415e(true);
                            C34032k.m77795a().mo71982a(this.f89139a.f89138a.bm_());
                        }
                    }
                });
                aVar.mo54845b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.g$b */
    public static final class C34594b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C35463m f89140a;

        public C34594b(C35463m mVar) {
            this.f89140a = mVar;
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            this.f89140a.mo70455i();
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: b */
    public final int mo72634b() {
        return 29;
    }

    public final String bm_() {
        return this.f89137a;
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C34592a(this);
    }

    /* renamed from: d */
    public final void mo72643d() {
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        if (a.mo71949f() != null) {
            C34004b a2 = C34004b.m77717a();
            C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
            C35460j f = a2.mo71949f();
            C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
            C35463m under16Proxy = f.getUnder16Proxy();
            C52711k.m112236a((Object) under16Proxy, "AwemeImManager.instance().proxy.under16Proxy");
            if (under16Proxy != null) {
                this.f91116g = under16Proxy.mo70451e();
                this.f91115f = C23556a.m57755a(R.drawable.db0);
                if (under16Proxy.mo70456j() < 10000000000L) {
                    mo73751a(under16Proxy.mo70456j() * 1000);
                    return;
                }
                mo73751a(under16Proxy.mo70456j());
            }
        }
    }
}
