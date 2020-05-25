package com.p683ss.android.ugc.aweme.account.agegate.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity */
public final class DeleteVideoAlertActivity extends AmeActivity implements OnClickListener {

    /* renamed from: b */
    public static final C20879a f56845b = new C20879a(null);

    /* renamed from: a */
    public String f56846a;

    /* renamed from: c */
    private HashMap f56847c;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$a */
    public static final class C20879a {
        private C20879a() {
        }

        public /* synthetic */ C20879a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$b */
    static final class C20880b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteVideoAlertActivity f56848a;

        C20880b(DeleteVideoAlertActivity deleteVideoAlertActivity) {
            this.f56848a = deleteVideoAlertActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent;
            if (!TextUtils.equals(this.f56848a.f56846a, "from_delete_account")) {
                C26890h.m65011a("export_video_no_confirm", C20856a.m53173a().mo44776a("enter_method", "pop_up").mo44774a("type", TextUtils.equals(this.f56848a.f56846a, "from_create_account_password") ? 1 : 0).f56798a);
                C22282t.m55145c(false);
                intent = new Intent(this.f56848a, OperatorCompleteActivity.class);
            } else {
                intent = new Intent(this.f56848a, AccountDeletedActivity.class);
            }
            intent.putExtra("age_gate_response", this.f56848a.getIntent().getSerializableExtra("age_gate_response"));
            this.f56848a.startActivity(intent);
            this.f56848a.finish();
        }
    }

    /* renamed from: a */
    private View m53198a(int i) {
        if (this.f56847c == null) {
            this.f56847c = new HashMap();
        }
        View view = (View) this.f56847c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f56847c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r6)
            r0 = 0
            if (r6 == 0) goto L_0x000f
            int r6 = r6.getId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0010
        L_0x000f:
            r6 = r0
        L_0x0010:
            if (r6 != 0) goto L_0x0013
            goto L_0x0074
        L_0x0013:
            int r1 = r6.intValue()
            r2 = 2132024775(0x7f141dc7, float:1.9688036E38)
            if (r1 != r2) goto L_0x0074
            java.lang.String r6 = r5.f56846a
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r0 = "from_delete_account"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r6 = android.text.TextUtils.equals(r6, r0)
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "export_video_yes"
            com.ss.android.ugc.aweme.account.a.b.a r0 = com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a.m53173a()
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "pop_up"
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "type"
            java.lang.String r2 = r5.f56846a
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "from_create_account_password"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44774a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            goto L_0x0055
        L_0x0050:
            java.lang.String r6 = "download"
            com.p683ss.android.ugc.aweme.account.agegate.p1264b.C20886a.m53209b(r6)
        L_0x0055:
            android.content.Intent r6 = new android.content.Intent
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Class<com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity> r1 = com.p683ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity.class
            r6.<init>(r0, r1)
            java.lang.String r0 = "age_gate_response"
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "age_gate_response"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            r6.putExtra(r0, r1)
            r0 = 1024(0x400, float:1.435E-42)
            r5.startActivityForResult(r6, r0)
            return
        L_0x0074:
            if (r6 != 0) goto L_0x0077
            return
        L_0x0077:
            int r6 = r6.intValue()
            r1 = 2132021286(0x7f141026, float:1.968096E38)
            if (r6 != r1) goto L_0x013b
            java.lang.String r6 = r5.f56846a
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r1 = "from_delete_account"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r6 = android.text.TextUtils.equals(r6, r1)
            if (r6 != 0) goto L_0x00b4
            java.lang.String r6 = "export_video_no"
            com.ss.android.ugc.aweme.account.a.b.a r1 = com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a.m53173a()
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "pop_up"
            com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44776a(r2, r3)
            java.lang.String r2 = "type"
            java.lang.String r3 = r5.f56846a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "from_create_account_password"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44774a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r1)
            goto L_0x00b9
        L_0x00b4:
            java.lang.String r6 = "not_download"
            com.p683ss.android.ugc.aweme.account.agegate.p1264b.C20886a.m53209b(r6)
        L_0x00b9:
            com.bytedance.ies.dmt.ui.b.a$a r6 = new com.bytedance.ies.dmt.ui.b.a$a
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            r6.<init>(r1)
            java.lang.String r1 = r5.f56846a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "from_delete_account"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x00d3
            r1 = 2132542324(0x7f1c0374, float:2.073775E38)
            goto L_0x00d6
        L_0x00d3:
            r1 = 2132544892(0x7f1c0d7c, float:2.0742958E38)
        L_0x00d6:
            com.bytedance.ies.dmt.ui.b.a$a r6 = r6.mo18885a(r1)
            java.lang.String r1 = r5.f56846a
            if (r1 != 0) goto L_0x00df
            goto L_0x0106
        L_0x00df:
            int r2 = r1.hashCode()
            r3 = -1873536069(0xffffffff90541bbb, float:-4.183099E-29)
            if (r2 == r3) goto L_0x00fa
            r3 = -1607227186(0xffffffffa033a8ce, float:-1.5217743E-19)
            if (r2 == r3) goto L_0x00ee
            goto L_0x0106
        L_0x00ee:
            java.lang.String r2 = "from_delete_account"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0106
            r1 = 2132542322(0x7f1c0372, float:2.0737746E38)
            goto L_0x0109
        L_0x00fa:
            java.lang.String r2 = "from_create_account_password"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0106
            r1 = 2132543374(0x7f1c078e, float:2.073988E38)
            goto L_0x0109
        L_0x0106:
            r1 = 2132544893(0x7f1c0d7d, float:2.074296E38)
        L_0x0109:
            com.bytedance.ies.dmt.ui.b.a$a r6 = r6.mo18899b(r1)
            r1 = 2132542491(0x7f1c041b, float:2.0738088E38)
            com.bytedance.ies.dmt.ui.b.a$a r6 = r6.mo18886a(r1, r0)
            java.lang.String r0 = r5.f56846a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "from_delete_account"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0126
            r0 = 2132542323(0x7f1c0373, float:2.0737748E38)
            goto L_0x0129
        L_0x0126:
            r0 = 2132542496(0x7f1c0420, float:2.0738099E38)
        L_0x0129:
            com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$b r1 = new com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$b
            r1.<init>(r5)
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            com.bytedance.ies.dmt.ui.b.a$a r6 = r6.mo18900b(r0, r1)
            com.bytedance.ies.dmt.ui.b.a r6 = r6.mo18897a()
            r6.mo18882b()
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity.onClick(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r6)
            r6 = 2132213989(0x7f1700e5, float:2.0071807E38)
            r5.setContentView(r6)
            r6 = 2132024775(0x7f141dc7, float:1.9688036E38)
            android.view.View r6 = r5.m53198a(r6)
            android.support.constraint.ConstraintLayout r6 = (android.support.constraint.ConstraintLayout) r6
            r0 = r5
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
            r6 = 2132021286(0x7f141026, float:1.968096E38)
            android.view.View r6 = r5.m53198a(r6)
            android.support.constraint.ConstraintLayout r6 = (android.support.constraint.ConstraintLayout) r6
            r6.setOnClickListener(r0)
            android.content.Intent r6 = r5.getIntent()
            if (r6 == 0) goto L_0x0039
            java.lang.String r0 = "enter_from"
            java.lang.String r6 = r6.getStringExtra(r0)
            goto L_0x003a
        L_0x0039:
            r6 = 0
        L_0x003a:
            r5.f56846a = r6
            r6 = 2132018490(0x7f14053a, float:1.9675288E38)
            android.view.View r6 = r5.m53198a(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = "delete_video_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            java.lang.String r0 = r5.f56846a
            r1 = -1607227186(0xffffffffa033a8ce, float:-1.5217743E-19)
            if (r0 != 0) goto L_0x0052
            goto L_0x009d
        L_0x0052:
            int r3 = r0.hashCode()
            r4 = -1873536069(0xffffffff90541bbb, float:-4.183099E-29)
            if (r3 == r4) goto L_0x008b
            if (r3 == r1) goto L_0x005e
            goto L_0x009d
        L_0x005e:
            java.lang.String r3 = "from_delete_account"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x009d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 2132542318(0x7f1c036e, float:2.0737738E38)
            java.lang.String r3 = r5.getString(r3)
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            r3 = 2132542319(0x7f1c036f, float:2.073774E38)
            java.lang.String r3 = r5.getString(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00a6
        L_0x008b:
            java.lang.String r3 = "from_create_account_password"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x009d
            r0 = 2132543777(0x7f1c0921, float:2.0740697E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00a6
        L_0x009d:
            r0 = 2132544894(0x7f1c0d7e, float:2.0742962E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L_0x00a6:
            r6.setText(r0)
            r6 = 2132024776(0x7f141dc8, float:1.9688038E38)
            android.view.View r6 = r5.m53198a(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = "yes_desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            java.lang.String r0 = r5.f56846a
            if (r0 != 0) goto L_0x00bc
            goto L_0x00d5
        L_0x00bc:
            int r3 = r0.hashCode()
            if (r3 == r1) goto L_0x00c3
            goto L_0x00d5
        L_0x00c3:
            java.lang.String r3 = "from_delete_account"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00d5
            r0 = 2132542328(0x7f1c0378, float:2.0737758E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x00de
        L_0x00d5:
            r0 = 2132544896(0x7f1c0d80, float:2.0742966E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L_0x00de:
            r6.setText(r0)
            r6 = 2132021291(0x7f14102b, float:1.968097E38)
            android.view.View r6 = r5.m53198a(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r0 = "no_desc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            java.lang.String r0 = r5.f56846a
            if (r0 != 0) goto L_0x00f4
            goto L_0x010d
        L_0x00f4:
            int r3 = r0.hashCode()
            if (r3 == r1) goto L_0x00fb
            goto L_0x010d
        L_0x00fb:
            java.lang.String r1 = "from_delete_account"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x010d
            r0 = 2132542325(0x7f1c0375, float:2.0737752E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x0116
        L_0x010d:
            r0 = 2132544895(0x7f1c0d7f, float:2.0742964E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L_0x0116:
            r6.setText(r0)
            java.lang.String r6 = r5.f56846a
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r0 = "from_delete_account"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r6 = android.text.TextUtils.equals(r6, r0)
            if (r6 != 0) goto L_0x012a
            com.p683ss.android.ugc.aweme.account.util.C22282t.m55145c(r2)
        L_0x012a:
            java.lang.String r6 = "com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity"
            java.lang.String r0 = "onCreate"
            r1 = 0
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity.onCreate(android.os.Bundle):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1024 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }
}
