package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.api.C20894a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.net.C37745b;
import com.p683ss.android.ugc.aweme.net.C37757d;
import com.p683ss.android.ugc.aweme.net.C37790j;
import com.p683ss.android.ugc.aweme.p2375u.C47404a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity */
public class RecoverAccountActivity extends AmeBaseActivity {

    /* renamed from: r */
    private static final boolean f59899r = C47404a.m102782a();

    /* renamed from: a */
    TextView f59900a;

    /* renamed from: b */
    TextView f59901b;

    /* renamed from: c */
    TextView f59902c;

    /* renamed from: d */
    public String f59903d;

    /* renamed from: e */
    C48191h f59904e;

    /* renamed from: f */
    boolean f59905f;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.ayd;
    }

    public void onBackPressed() {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo46325b() {
        super.mo46325b();
        this.f59900a = (TextView) findViewById(R.id.o8);
        this.f59901b = (TextView) findViewById(R.id.qa);
        this.f59902c = (TextView) findViewById(R.id.azx);
        if (C20902b.m53242a().getCurUser() != null) {
            this.f59902c.setText(R.string.d60);
        }
        this.f59900a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                RecoverAccountActivity recoverAccountActivity = RecoverAccountActivity.this;
                if (!recoverAccountActivity.f59905f) {
                    if (recoverAccountActivity.f59904e == null) {
                        recoverAccountActivity.f59904e = new C48191h(recoverAccountActivity);
                    }
                    C47700ay.m103235a(recoverAccountActivity.f59904e);
                    C20854a.m53161a().addLoginOrLogoutListener(new C22244j(recoverAccountActivity));
                    recoverAccountActivity.f59905f = true;
                    C20854a.m53162b().logout("recover_account", "user_logout");
                }
            }
        });
        this.f59901b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                RecoverAccountActivity recoverAccountActivity = RecoverAccountActivity.this;
                C221971 r5 = new C37757d() {
                    /* renamed from: a */
                    public final void mo46329a(Exception exc) {
                    }

                    /* renamed from: a */
                    public final void mo46330a(String str, Object obj) {
                        C18842a.m45933a(new Runnable() {
                            public final void run() {
                                C20902b.m53242a().queryUser();
                            }
                        }, 5000);
                        User curUser = C20902b.m53242a().getCurUser();
                        curUser.setUserCancelled(false);
                        C20902b.m53242a().updateCurUser(curUser);
                        if (TextUtils.equals(RecoverAccountActivity.this.f59903d, "enter_from_login_ui_routine")) {
                            C22884a.m56353a(null);
                        }
                        if (C22721g.f60929c) {
                            C22721g.f60929c = false;
                            C22722h.m55978a();
                        }
                        C10691a.m21542b(RecoverAccountActivity.this.getApplicationContext(), (int) R.string.d5y).mo19066a();
                        RecoverAccountActivity.this.finish();
                    }
                };
                C18922i iVar = new C18922i(C20894a.f56872b);
                iVar.mo38778a("type", "0");
                C37745b bVar = new C37745b(iVar.toString(), C37790j.GET, String.class);
                bVar.mo77239a((C37757d) r5);
                bVar.mo77238a();
            }
        });
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f59903d = intent.getStringExtra("enter_from");
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f59903d = getIntent().getStringExtra("enter_from");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m55026a(Context context, String str) {
        Intent intent = new Intent(context, RecoverAccountActivity.class);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        if (!C48121w.m104087I()) {
            C48121w.m104249M().mo95293z();
        } else {
            C50130a.m108170a().mo60215af();
        }
        context.startActivity(intent);
    }
}
