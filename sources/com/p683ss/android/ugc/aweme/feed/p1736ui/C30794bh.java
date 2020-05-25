package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.p683ss.android.ugc.aweme.views.C48217o;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bh */
public final class C30794bh extends C48217o implements C47939a {

    /* renamed from: a */
    private final Activity f80673a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bh$a */
    static final class C30795a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30794bh f80674a;

        C30795a(C30794bh bhVar) {
            this.f80674a = bhVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f80674a.mo63506d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bh$b */
    static final class C30796b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30794bh f80675a;

        C30796b(C30794bh bhVar) {
            this.f80675a = bhVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C30794bh bhVar = this.f80675a;
            bhVar.dismiss();
            C30792bf.m72184a(1);
            bhVar.mo63507e();
        }
    }

    /* renamed from: b */
    public final void mo60069b() {
        C30792bf.m72185b(0);
    }

    /* renamed from: d */
    public final void mo63506d() {
        dismiss();
        C30792bf.m72184a(0);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        mo63506d();
    }

    /* renamed from: c */
    public final void mo63505c() {
        super.mo63505c();
        this.f121344h = -2;
        this.f121345i = -2;
    }

    /* renamed from: a */
    public final void mo60068a() {
        C30792bf.m72185b(1);
        I18nBridgeService.getBridgeService_Monster().tryRefreshLocation(this.f80673a);
    }

    /* renamed from: e */
    public final void mo63507e() {
        C30792bf.m72183a();
        I18nBridgeService.getBridgeService_Monster().requestLocationPermissions(this.f80673a, this);
    }

    public C30794bh(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super((Context) activity, (int) R.style.wc, 0, 0);
        this.f80673a = activity;
        setContentView(R.layout.kg);
        setCanceledOnTouchOutside(false);
        ((DmtTextView) findViewById(R.id.dhb)).setFontType(C10751d.f28908g);
        ((DmtTextView) findViewById(R.id.d6o)).setFontType(C10751d.f28908g);
        ((DmtTextView) findViewById(R.id.d7e)).setOnClickListener(new C30795a(this));
        ((DmtTextView) findViewById(R.id.d6o)).setOnClickListener(new C30796b(this));
    }
}
