package com.p683ss.android.ugc.aweme.account.agegate.activity;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.account.AgeGateService;
import com.p683ss.android.ugc.aweme.account.agegate.p1264b.C20886a;
import com.p683ss.android.ugc.aweme.account.view.C22309a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity */
public final class AccountDeletedActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56822a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AccountDeletedActivity.class), "mLoadingDialog", "getMLoadingDialog()Lcom/ss/android/ugc/aweme/account/view/DmtLoadingDialog;"))};

    /* renamed from: b */
    public boolean f56823b;

    /* renamed from: c */
    private final C52668f f56824c = C52732g.m112285a(new C20876d(this));

    /* renamed from: d */
    private HashMap f56825d;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$a */
    public static final class C20873a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ AccountDeletedActivity f56826a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f56827b;

        /* renamed from: c */
        final /* synthetic */ String f56828c;

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            C20886a.m53208a("complain");
            SmartRouter.buildRoute((Context) this.f56826a, "aweme://webview/?url=https://www.tiktok.com/aweme/inapp/v2/c_feedback/?hide_nav_bar=1").open();
        }

        C20873a(AccountDeletedActivity accountDeletedActivity, SpannableStringBuilder spannableStringBuilder, String str) {
            this.f56826a = accountDeletedActivity;
            this.f56827b = spannableStringBuilder;
            this.f56828c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$b */
    static final class C20874b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountDeletedActivity f56829a;

        C20874b(AccountDeletedActivity accountDeletedActivity) {
            this.f56829a = accountDeletedActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            AgeGateService.showingAccountDelete = false;
            AccountDeletedActivity accountDeletedActivity = this.f56829a;
            if (!accountDeletedActivity.f56823b) {
                C20886a.m53208a("logout");
                C47700ay.m103235a(accountDeletedActivity.mo44795a());
                C23826bi.m58456a((C20834a) new C20875c(accountDeletedActivity));
                accountDeletedActivity.f56823b = true;
                C23826bi.m58470k().logout("age_gate_delete_account", "user_logout");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$c */
    static final class C20875c implements C20834a {

        /* renamed from: a */
        final /* synthetic */ AccountDeletedActivity f56830a;

        C20875c(AccountDeletedActivity accountDeletedActivity) {
            this.f56830a = accountDeletedActivity;
        }

        /* renamed from: a */
        public final void mo44376a(int i, boolean z, int i2, User user) {
            this.f56830a.f56823b = false;
            C47700ay.m103236b(this.f56830a.mo44795a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$d */
    static final class C20876d extends C52712l implements C52670a<C22309a> {

        /* renamed from: a */
        final /* synthetic */ AccountDeletedActivity f56831a;

        C20876d(AccountDeletedActivity accountDeletedActivity) {
            this.f56831a = accountDeletedActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C22309a(this.f56831a);
        }
    }

    /* renamed from: a */
    private View m53191a(int i) {
        if (this.f56825d == null) {
            this.f56825d = new HashMap();
        }
        View view = (View) this.f56825d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f56825d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C22309a mo44795a() {
        return (C22309a) this.f56824c.getValue();
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Date date;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.awy);
        DmtTextView dmtTextView = (DmtTextView) m53191a(R.id.yu);
        C52711k.m112236a((Object) dmtTextView, "contact");
        String string = getString(R.string.foo);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.foq, new Object[]{string}));
        CharSequence charSequence = spannableStringBuilder;
        C52711k.m112236a((Object) string, "contactUs");
        int a = C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null);
        int length = string.length() + a;
        if (!(a == -1 || length == -1)) {
            spannableStringBuilder.setSpan(new C20873a(this, spannableStringBuilder, string), a, length, 18);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.su)), a, length, 18);
        }
        dmtTextView.setText(charSequence);
        DmtTextView dmtTextView2 = (DmtTextView) m53191a(R.id.yu);
        C52711k.m112236a((Object) dmtTextView2, "contact");
        dmtTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        ((DmtTextView) m53191a(R.id.pq)).setOnClickListener(new C20874b(this));
        DmtTextView dmtTextView3 = (DmtTextView) m53191a(R.id.ze);
        C52711k.m112236a((Object) dmtTextView3, C42311c.f106865i);
        User i = C23826bi.m58468i();
        StringBuilder sb = new StringBuilder("@");
        C52711k.m112236a((Object) i, "user");
        if (TextUtils.isEmpty(i.getUniqueId())) {
            str = i.getShortId();
        } else {
            str = i.getUniqueId();
        }
        sb.append(str);
        String sb2 = sb.toString();
        Object a2 = C23826bi.m58450a(C22475af.class);
        C52711k.m112236a(a2, "ModuleStore.getService(I…oduleService::class.java)");
        long h = ((C22475af) a2).mo46781h();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        if (h != 0) {
            date = new Date(h);
        } else {
            date = new Date(System.currentTimeMillis());
        }
        String format = simpleDateFormat.format(date);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.fop, new Object[]{sb2, format}));
        CharSequence charSequence2 = spannableStringBuilder2;
        CharSequence charSequence3 = charSequence2;
        int a3 = C52830p.m112419a(charSequence3, sb2, 0, false, 6, (Object) null);
        int length2 = sb2.length() + a3;
        C52711k.m112236a((Object) format, "date");
        int a4 = C52830p.m112419a(charSequence3, format, 0, false, 6, (Object) null);
        int length3 = format.length() + a4;
        if (!(a3 == -1 || length2 == -1 || a4 == -1 || length3 == -1)) {
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.avn)), a3, length2, 18);
            spannableStringBuilder2.setSpan(new StyleSpan(1), a3, length2, 18);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.avn)), a4, length3, 18);
            spannableStringBuilder2.setSpan(new StyleSpan(1), a4, length3, 18);
        }
        dmtTextView3.setText(charSequence2);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", false);
    }
}
