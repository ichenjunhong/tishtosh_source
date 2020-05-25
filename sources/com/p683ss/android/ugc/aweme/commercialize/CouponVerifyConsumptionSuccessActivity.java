package com.p683ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.C25640c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity */
public final class CouponVerifyConsumptionSuccessActivity extends AmeActivity implements OnClickListener {

    /* renamed from: a */
    public static final C25575a f67680a = new C25575a(null);

    /* renamed from: b */
    private HashMap f67681b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity$a */
    public static final class C25575a {

        /* renamed from: com.ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity$a$a */
        static final class C25576a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C17832m f67682a;

            /* renamed from: b */
            final /* synthetic */ Context f67683b;

            C25576a(C17832m mVar, Context context) {
                this.f67682a = mVar;
                this.f67683b = context;
            }

            public final void run() {
                try {
                    C25640c cVar = (C25640c) this.f67682a.get();
                    if (cVar == null || cVar.statusCode != 0) {
                        C10691a.m21545b(this.f67683b, cVar.statusMsg).mo19066a();
                        return;
                    }
                    Context context = this.f67683b;
                    C52711k.m112240b(context, "context");
                    Intent intent = new Intent(context, CouponVerifyConsumptionSuccessActivity.class);
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                } catch (InterruptedException unused) {
                } catch (ExecutionException unused2) {
                    C10691a.m21542b(this.f67683b, (int) R.string.cfw).mo19066a();
                }
            }
        }

        private C25575a() {
        }

        public /* synthetic */ C25575a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    private View m62096a(int i) {
        if (this.f67681b == null) {
            this.f67681b = new HashMap();
        }
        View view = (View) this.f67681b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f67681b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.ay9 || id == R.id.f1z) {
                finish();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ax6);
        OnClickListener onClickListener = this;
        ((ImageView) m62096a(R.id.ay9)).setOnClickListener(onClickListener);
        ((DmtTextView) m62096a(R.id.f1z)).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public static final void m62097a(Context context, String str) {
        if (context != null && str != null) {
            C17832m a = CouponRedeemApi.m62162a(str);
            a.mo6039a(new C25576a(a, context), C23551l.f62672a);
        }
    }
}
