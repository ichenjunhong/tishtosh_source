package com.p683ss.android.ugc.aweme.account.login.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.a */
public final class C22023a extends Dialog {

    /* renamed from: a */
    public C22024a f59502a;

    /* renamed from: b */
    public OnClickListener f59503b;

    /* renamed from: c */
    public OnClickListener f59504c;

    /* renamed from: d */
    public final C22025b f59505d;

    /* renamed from: e */
    private View f59506e;

    /* renamed from: f */
    private DmtTextView f59507f;

    /* renamed from: g */
    private AutoLinefeedTextView f59508g;

    /* renamed from: h */
    private DmtTextView f59509h;

    /* renamed from: i */
    private DmtTextView f59510i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$a */
    public interface C22024a {
        /* renamed from: a */
        void mo45427a();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$b */
    public static final class C22025b {

        /* renamed from: a */
        public final String f59511a;

        /* renamed from: b */
        public final String f59512b;

        /* renamed from: c */
        public final String f59513c;

        /* renamed from: d */
        public final String f59514d;

        /* renamed from: e */
        public final String f59515e;

        /* renamed from: f */
        public final String f59516f;

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f59516f, (java.lang.Object) r3.f59516f) != false) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0047
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22025b
                if (r0 == 0) goto L_0x0045
                com.ss.android.ugc.aweme.account.login.view.a$b r3 = (com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22025b) r3
                java.lang.String r0 = r2.f59511a
                java.lang.String r1 = r3.f59511a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59512b
                java.lang.String r1 = r3.f59512b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59513c
                java.lang.String r1 = r3.f59513c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59514d
                java.lang.String r1 = r3.f59514d
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59515e
                java.lang.String r1 = r3.f59515e
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r2.f59516f
                java.lang.String r3 = r3.f59516f
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x0045
                goto L_0x0047
            L_0x0045:
                r3 = 0
                return r3
            L_0x0047:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22025b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f59511a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f59512b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f59513c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f59514d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f59515e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f59516f;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode5 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(title=");
            sb.append(this.f59511a);
            sb.append(", desc=");
            sb.append(this.f59512b);
            sb.append(", firstItem=");
            sb.append(this.f59513c);
            sb.append(", secondItem=");
            sb.append(this.f59514d);
            sb.append(", enterType=");
            sb.append(this.f59515e);
            sb.append(", phoneNum=");
            sb.append(this.f59516f);
            sb.append(")");
            return sb.toString();
        }

        public C22025b(String str, String str2, String str3, String str4, String str5, String str6) {
            C52711k.m112240b(str, "title");
            C52711k.m112240b(str2, "desc");
            C52711k.m112240b(str3, "firstItem");
            C52711k.m112240b(str4, "secondItem");
            C52711k.m112240b(str5, "enterType");
            C52711k.m112240b(str6, "phoneNum");
            this.f59511a = str;
            this.f59512b = str2;
            this.f59513c = str3;
            this.f59514d = str4;
            this.f59515e = str5;
            this.f59516f = str6;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$c */
    static final class C22026c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22023a f59517a;

        C22026c(C22023a aVar) {
            this.f59517a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22024a aVar = this.f59517a.f59502a;
            if (aVar != null) {
                aVar.mo45427a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$d */
    static final class C22027d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22023a f59518a;

        C22027d(C22023a aVar) {
            this.f59518a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f59518a.f59503b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$e */
    static final class C22028e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22023a f59519a;

        C22028e(C22023a aVar) {
            this.f59519a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f59519a.f59504c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void show() {
        super.show();
        C26890h.m65011a("phone_verification_channel_alert", new C20856a().mo44776a("enter_type", this.f59505d.f59515e).f56798a);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b0i);
        this.f59506e = findViewById(R.id.q7);
        this.f59507f = (DmtTextView) findViewById(R.id.dhb);
        this.f59508g = (AutoLinefeedTextView) findViewById(R.id.d98);
        this.f59509h = (DmtTextView) findViewById(R.id.d_d);
        this.f59510i = (DmtTextView) findViewById(R.id.dfl);
        DmtTextView dmtTextView = this.f59507f;
        if (dmtTextView != null) {
            dmtTextView.setText(this.f59505d.f59511a);
        }
        AutoLinefeedTextView autoLinefeedTextView = this.f59508g;
        if (autoLinefeedTextView != null) {
            autoLinefeedTextView.mo46080a(this.f59505d.f59512b, this.f59505d.f59516f);
        }
        DmtTextView dmtTextView2 = this.f59509h;
        if (dmtTextView2 != null) {
            dmtTextView2.setText(this.f59505d.f59513c);
        }
        DmtTextView dmtTextView3 = this.f59510i;
        if (dmtTextView3 != null) {
            dmtTextView3.setText(this.f59505d.f59514d);
        }
        View view = this.f59506e;
        if (view != null) {
            view.setOnClickListener(new C22026c(this));
        }
        DmtTextView dmtTextView4 = this.f59509h;
        if (dmtTextView4 != null) {
            dmtTextView4.setOnClickListener(new C22027d(this));
        }
        DmtTextView dmtTextView5 = this.f59510i;
        if (dmtTextView5 != null) {
            dmtTextView5.setOnClickListener(new C22028e(this));
        }
        setCanceledOnTouchOutside(false);
    }

    public C22023a(Context context, C22025b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "param");
        super(context, R.style.a3a);
        this.f59505d = bVar;
    }
}
