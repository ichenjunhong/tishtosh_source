package com.p683ss.android.ugc.aweme.account.agegate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.view.C22309a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity */
public final class DeleteAccountAlertActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56839a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DeleteAccountAlertActivity.class), "mLoadingDialog", "getMLoadingDialog()Lcom/ss/android/ugc/aweme/account/view/DmtLoadingDialog;"))};

    /* renamed from: b */
    AgeGateResponse f56840b;

    /* renamed from: c */
    private final C52668f f56841c = C52732g.m112285a(new C20878b(this));

    /* renamed from: d */
    private HashMap f56842d;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity$a */
    static final class C20877a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteAccountAlertActivity f56843a;

        C20877a(DeleteAccountAlertActivity deleteAccountAlertActivity) {
            this.f56843a = deleteAccountAlertActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("age_gate_click_next", new C20856a().f56798a);
            DeleteAccountAlertActivity deleteAccountAlertActivity = this.f56843a;
            Intent intent = new Intent(deleteAccountAlertActivity, DeleteVideoAlertActivity.class);
            intent.putExtra("age_gate_response", deleteAccountAlertActivity.f56840b);
            intent.putExtra("enter_from", "from_delete_account");
            deleteAccountAlertActivity.startActivity(intent);
            deleteAccountAlertActivity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity$b */
    static final class C20878b extends C52712l implements C52670a<C22309a> {

        /* renamed from: a */
        final /* synthetic */ DeleteAccountAlertActivity f56844a;

        C20878b(DeleteAccountAlertActivity deleteAccountAlertActivity) {
            this.f56844a = deleteAccountAlertActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C22309a(this.f56844a, this.f56844a.getString(R.string.fot));
        }
    }

    /* renamed from: a */
    private View m53197a(int i) {
        if (this.f56842d == null) {
            this.f56842d = new HashMap();
        }
        View view = (View) this.f56842d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f56842d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        int a;
        int length;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax8);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                obj = extras.get("age_gate_response");
                this.f56840b = (AgeGateResponse) obj;
                DmtTextView dmtTextView = (DmtTextView) m53197a(R.id.ze);
                C52711k.m112236a((Object) dmtTextView, C42311c.f106865i);
                String string = getString(R.string.fq7);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.fq6, new Object[]{string}));
                CharSequence charSequence = spannableStringBuilder;
                C52711k.m112236a((Object) string, "deletePrompt");
                a = C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null);
                length = string.length() + a;
                if (!(a == -1 || length == -1)) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.avn)), a, length, 18);
                    spannableStringBuilder.setSpan(new StyleSpan(1), a, length, 18);
                }
                dmtTextView.setText(charSequence);
                ((DmtTextView) m53197a(R.id.pq)).setOnClickListener(new C20877a(this));
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onCreate", false);
            }
        }
        obj = null;
        this.f56840b = (AgeGateResponse) obj;
        DmtTextView dmtTextView2 = (DmtTextView) m53197a(R.id.ze);
        C52711k.m112236a((Object) dmtTextView2, C42311c.f106865i);
        String string2 = getString(R.string.fq7);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.fq6, new Object[]{string2}));
        CharSequence charSequence2 = spannableStringBuilder2;
        C52711k.m112236a((Object) string2, "deletePrompt");
        a = C52830p.m112419a(charSequence2, string2, 0, false, 6, (Object) null);
        length = string2.length() + a;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.avn)), a, length, 18);
        spannableStringBuilder2.setSpan(new StyleSpan(1), a, length, 18);
        dmtTextView2.setText(charSequence2);
        ((DmtTextView) m53197a(R.id.pq)).setOnClickListener(new C20877a(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteAccountAlertActivity", "onCreate", false);
    }
}
