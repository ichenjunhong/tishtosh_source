package com.p683ss.android.ugc.aweme.account.p1271d;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21671o;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21919k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21920l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.account.p1303p.C22115c.C22116a;
import com.p683ss.android.ugc.aweme.account.utils.C22300g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.d.c */
public final class C20958c extends C21920l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f57059a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20958c.class), "email", "getEmail()Ljava/lang/String;"))};

    /* renamed from: e */
    private final C52668f f57060e = C52732g.m112285a(new C20959a(this));

    /* renamed from: j */
    private HashMap f57061j;

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$a */
    static final class C20959a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C20958c f57062a;

        C20959a(C20958c cVar) {
            this.f57062a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C21839d.f59130a.mo45972a((Fragment) this.f57062a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$b */
    static final class C20960b<T> implements C1710e<C12993e<C21671o>> {

        /* renamed from: a */
        final /* synthetic */ C20958c f57063a;

        C20960b(C20958c cVar) {
            this.f57063a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
            if (r4 == null) goto L_0x0031;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r4) {
            /*
                r3 = this;
                com.bytedance.sdk.account.a.a.e r4 = (com.bytedance.sdk.account.p844a.p845a.C12993e) r4
                com.ss.android.ugc.aweme.account.d.c r0 = r3.f57063a
                android.os.Bundle r1 = new android.os.Bundle
                com.ss.android.ugc.aweme.account.d.c r2 = r3.f57063a
                android.os.Bundle r2 = r2.getArguments()
                if (r2 != 0) goto L_0x0011
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0011:
                r1.<init>(r2)
                java.lang.String r2 = ""
                com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.m54505a(r1, r2)
                T r4 = r4.f34007h
                com.ss.android.ugc.aweme.account.login.v2.a.o r4 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21671o) r4
                org.json.JSONObject r4 = r4.f34279l
                if (r4 == 0) goto L_0x0031
                java.lang.String r2 = "data"
                org.json.JSONObject r4 = r4.optJSONObject(r2)
                if (r4 == 0) goto L_0x0031
                java.lang.String r2 = "ticket"
                java.lang.String r4 = r4.optString(r2)
                if (r4 != 0) goto L_0x0033
            L_0x0031:
                java.lang.String r4 = ""
            L_0x0033:
                com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.m54512c(r1, r4)
                java.lang.String r4 = "next_page"
                com.ss.android.ugc.aweme.account.login.v2.base.i r2 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.INPUT_EMAIL_CHANGE
                int r2 = r2.getValue()
                r1.putInt(r4, r2)
                r0.mo45961a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1271d.C20958c.C20960b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$c */
    static final class C20961c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20958c f57064a;

        C20961c(C20958c cVar) {
            this.f57064a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            User i = C23826bi.m58468i();
            C52711k.m112236a((Object) i, "ModuleStore.getCurUser()");
            if (i.isPhoneBinded()) {
                User i2 = C23826bi.m58468i();
                C52711k.m112236a((Object) i2, "ModuleStore.getCurUser()");
                if (!TextUtils.isEmpty(i2.getBindPhone())) {
                    User i3 = C23826bi.m58468i();
                    C52711k.m112236a((Object) i3, "ModuleStore.getCurUser()");
                    String bindPhone = i3.getBindPhone();
                    FragmentActivity activity = this.f57064a.getActivity();
                    C52711k.m112236a((Object) bindPhone, "phone");
                    C21853b a = C21852a.m54530a(activity, bindPhone, this.f57064a.mo45970p());
                    if (a != null) {
                        C21598l lVar = a.f59142a;
                        if (lVar != null && lVar.mo45883e()) {
                            this.f57064a.mo44964a(false);
                            return;
                        }
                    }
                    C22116a.m54925a(this.f57064a, bindPhone, "auto_system").mo6496c((C1710e<? super T>) new C1710e<C12993e<C13120s>>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C20961c f57065a;

                        {
                            this.f57065a = r1;
                        }

                        public final /* synthetic */ void accept(Object obj) {
                            C12993e eVar = (C12993e) obj;
                            this.f57065a.f57064a.mo44964a(true);
                        }
                    }).mo6491b();
                    return;
                }
            }
            C22300g.m55189b(this.f57064a.getContext(), this.f57064a.mo45966l(), this.f57064a.mo45967m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.c$d */
    static final class C20963d implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C20958c f57066a;

        C20963d(C20958c cVar) {
            this.f57066a = cVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f57066a.mo46025v();
        }
    }

    /* renamed from: x */
    private String m53320x() {
        return (String) this.f57060e.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f57061j == null) {
            this.f57061j = new HashMap();
        }
        View view = (View) this.f57061j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f57061j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f57061j != null) {
            this.f57061j.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: h */
    public final void mo44871h() {
        m53319c("resend").mo6491b();
    }

    public final C21919k ab_() {
        C21919k kVar = new C21919k();
        kVar.mo46020a(m53320x());
        kVar.f59299b = false;
        kVar.f59301d = false;
        return kVar;
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f59182d = getString(R.string.ag5);
        aVar.f59183e = getString(R.string.ag6, m53320x());
        aVar.f59179a = " ";
        aVar.f59186h = false;
        return aVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m53319c("auto_system").mo6491b();
    }

    /* renamed from: a_ */
    public final void mo44868a_(String str) {
        C52711k.m112240b(str, "codes");
        C21677s.m54410b(this, str, 6).mo6496c((C1710e<? super T>) new C20960b<Object>(this)).mo6491b();
    }

    /* renamed from: c */
    private C2193n<C12993e<C13109h>> m53319c(String str) {
        C52711k.m112240b(str, "sendMethod");
        C2193n<C12993e<C13109h>> a = C21677s.m54399a(C21677s.f58713a, (C21829b) this, m53320x(), 6, str, (HashMap) null, (String) null, 48, (Object) null).mo6485a((C1706a) new C20963d(this));
        C52711k.m112236a((Object) a, "NetworkHelper.sendEmailC…   onCodeSent()\n        }");
        return a;
    }

    /* renamed from: a */
    public final void mo44964a(boolean z) {
        C21839d.m54508a((Fragment) this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        Bundle bundle = new Bundle(arguments);
        C21839d.m54505a(bundle, "");
        bundle.putInt("next_page", C21850i.VERIFY_PHONE.getValue());
        bundle.putInt("next_next_page", C21850i.INPUT_EMAIL_CHANGE.getValue());
        User i = C23826bi.m58468i();
        C52711k.m112236a((Object) i, "ModuleStore.getCurUser()");
        String bindPhone = i.getBindPhone();
        C52711k.m112236a((Object) bindPhone, "ModuleStore.getCurUser().bindPhone");
        C21839d.m54510b(bundle, bindPhone);
        mo45961a(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.e1k);
        C52711k.m112236a((Object) dmtTextView, "change_step1");
        dmtTextView.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.e1k);
        C52711k.m112236a((Object) dmtTextView2, "change_step1");
        dmtTextView2.setText(getString(R.string.hgk));
        ((DmtTextView) mo44862a((int) R.id.e1k)).setOnClickListener(new C20961c(this));
    }
}
