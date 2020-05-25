package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.protection.api.p2097a.C40856a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity */
public final class TeenagerModeAppealActivity extends AmeBaseActivity {

    /* renamed from: a */
    public static final C22726a f60938a = new C22726a(null);

    /* renamed from: b */
    private int f60939b = -1;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity$a */
    public static final class C22726a {
        private C22726a() {
        }

        public /* synthetic */ C22726a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity$b */
    static final class C22727b implements OnClickListener {

        /* renamed from: a */
        public static final C22727b f60940a = new C22727b();

        C22727b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22722h.m55982a("teen_mode", "appeal");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity$c */
    static final class C22728c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeenagerModeAppealActivity f60941a;

        C22728c(TeenagerModeAppealActivity teenagerModeAppealActivity) {
            this.f60941a = teenagerModeAppealActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f60941a.finish();
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.eb;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void onBackPressed() {
        if (this.f60939b != 1) {
            super.onBackPressed();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(C40856a aVar) {
        C52711k.m112240b(aVar, "event");
        finish();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f60939b = getIntent().getIntExtra("type", -1);
        View findViewById = findViewById(R.id.bjg);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.logout_appeal_button)");
        ((TextView) findViewById).setOnClickListener(C22727b.f60940a);
        View findViewById2 = findViewById(R.id.cy0);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.teenager_logout_whiteclose)");
        ImageView imageView = (ImageView) findViewById2;
        imageView.setOnClickListener(new C22728c(this));
        if (this.f60939b != 1) {
            z = true;
        } else {
            z = false;
        }
        C23729p.m58261a(z, imageView);
        View findViewById3 = findViewById(R.id.g5);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.appeal_title)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.g4);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.appeal_content)");
        TextView textView2 = (TextView) findViewById4;
        if (this.f60939b == 1) {
            textView.setText(R.string.ik);
            textView2.setText(R.string.ii);
        } else if (this.f60939b == 2) {
            textView.setText(R.string.c35);
            textView2.setText(R.string.dwo);
        }
        LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            double b = (double) C9432q.m18688b(this);
            Double.isNaN(b);
            layoutParams2.topMargin = (int) (b * 0.3d);
            textView.setLayoutParams(layoutParams2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }
}
