package com.p683ss.android.ugc.aweme.account.login.twostep;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p683ss.android.ugc.aweme.account.login.twostep.C21516g.C21517a;
import com.p683ss.android.ugc.aweme.account.p1275h.C20980b;
import com.p683ss.android.ugc.aweme.account.p1307ui.C22242i;
import com.p683ss.android.ugc.aweme.account.p1307ui.C22242i.C22243a;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity */
public final class TwoStepAuthActivity extends MusAbsActivity implements C21517a, C22242i {

    /* renamed from: f */
    public static final boolean f58249f = false;

    /* renamed from: g */
    public static final C21474a f58250g = new C21474a(null);

    /* renamed from: a */
    public C21516g f58251a;

    /* renamed from: b */
    public String f58252b;

    /* renamed from: c */
    public String f58253c;

    /* renamed from: d */
    public String f58254d;

    /* renamed from: e */
    public C21475b f58255e;

    /* renamed from: h */
    private ViewStub f58256h;

    /* renamed from: i */
    private int f58257i = -1;

    /* renamed from: j */
    private C22243a f58258j;

    /* renamed from: k */
    private boolean f58259k;

    /* renamed from: l */
    private HashMap f58260l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$a */
    public static final class C21474a {
        private C21474a() {
        }

        public /* synthetic */ C21474a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$b */
    public interface C21475b {
        /* renamed from: a */
        void mo45658a(int i, int i2, Intent intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$c */
    public static final class C21476c implements C10713a {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f58261a;

        /* renamed from: b */
        public final void mo19167b(View view) {
        }

        C21476c(TwoStepAuthActivity twoStepAuthActivity) {
            this.f58261a = twoStepAuthActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            this.f58261a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$d */
    static final class C21477d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f58262a;

        C21477d(TwoStepAuthActivity twoStepAuthActivity) {
            this.f58262a = twoStepAuthActivity;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m54119a());
        }

        /* renamed from: a */
        private boolean m54119a() {
            JSONObject jSONObject;
            String str = null;
            try {
                jSONObject = new JSONObject(this.f58262a.f58253c);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return false;
            }
            C21516g gVar = this.f58262a.f58251a;
            if (gVar != null) {
                C52711k.m112240b(jSONObject, "fullJson");
                gVar.f58344h = jSONObject;
            }
            TwoStepAuthActivity twoStepAuthActivity = this.f58262a;
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null) {
                str = jSONObject2.optString("profile_key");
            }
            twoStepAuthActivity.f58254d = str;
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$e */
    static final class C21478e<TTaskResult, TContinuationResult> implements C0011g<Boolean, Object> {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f58263a;

        C21478e(TwoStepAuthActivity twoStepAuthActivity) {
            this.f58263a = twoStepAuthActivity;
        }

        public final Object then(C0013i<Boolean> iVar) {
            if (!C47957v.m103770a((C0013i) iVar)) {
                return C52860x.f131107a;
            }
            C21516g gVar = this.f58263a.f58251a;
            if (gVar != null) {
                gVar.f58345i = this.f58263a.f58252b;
            }
            C21516g gVar2 = this.f58263a.f58251a;
            if (gVar2 != null) {
                return gVar2.mo45685a();
            }
            return null;
        }
    }

    /* renamed from: a */
    private View m54114a(int i) {
        if (this.f58260l == null) {
            this.f58260l = new HashMap();
        }
        View view = (View) this.f58260l.get(Integer.valueOf(R.id.dk4));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.dk4);
        this.f58260l.put(Integer.valueOf(R.id.dk4), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f58255e = null;
    }

    public final void finish() {
        if (this.f58259k) {
            C21515f.m54161a().mo45713a(new C20980b(null, null, Integer.valueOf(0), "User left TwoStepAuthActivity before completing auth process"));
        }
        super.finish();
    }

    public final void onBackPressed() {
        boolean z;
        if (this.f58258j != null) {
            C22243a aVar = this.f58258j;
            if (aVar == null) {
                C52711k.m112234a();
            }
            z = aVar.mo46362a();
        } else {
            z = false;
        }
        if (!z) {
            this.f58259k = true;
            finish();
        }
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a6i).statusBarDarkFont(true).init();
    }

    /* renamed from: a */
    public final void mo45655a(String str) {
        C21515f.m54161a().mo45713a(new C20980b(str, this.f58254d, Integer.valueOf(0), null));
        finish();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ayf);
        ((NormalTitleBar) m54114a((int) R.id.dk4)).setOnTitleBarClickListener(new C21476c(this));
        ((NormalTitleBar) m54114a((int) R.id.dk4)).mo19128a(false);
        NormalTitleBar normalTitleBar = (NormalTitleBar) m54114a((int) R.id.dk4);
        C52711k.m112236a((Object) normalTitleBar, "two_step_auth_title_bar");
        normalTitleBar.getStartBtn().setImageResource(R.drawable.c_q);
        ViewStub viewStub = (ViewStub) findViewById(R.id.dk3);
        C52711k.m112236a((Object) viewStub, "two_step_auth_content_stub");
        this.f58256h = viewStub;
        this.f58257i = getIntent().getIntExtra("auth_type", -1);
        this.f58253c = getIntent().getStringExtra("auth_data");
        this.f58252b = getIntent().getStringExtra("url_path");
        if (this.f58257i == -1) {
            new StringBuilder("Unknown TwoStepAuthType: ").append(this.f58257i);
            finish();
        } else if (TextUtils.isEmpty(this.f58253c)) {
            finish();
        } else {
            switch (this.f58257i) {
                case 1:
                    AppCompatActivity appCompatActivity = this;
                    ViewStub viewStub2 = this.f58256h;
                    if (viewStub2 == null) {
                        C52711k.m112237a("contentStub");
                    }
                    this.f58251a = new C21502d(appCompatActivity, viewStub2, this);
                    break;
                case 2:
                    AppCompatActivity appCompatActivity2 = this;
                    ViewStub viewStub3 = this.f58256h;
                    if (viewStub3 == null) {
                        C52711k.m112237a("contentStub");
                    }
                    this.f58251a = new C21496c(appCompatActivity2, viewStub3, this);
                    break;
                case 3:
                    AppCompatActivity appCompatActivity3 = this;
                    ViewStub viewStub4 = this.f58256h;
                    if (viewStub4 == null) {
                        C52711k.m112237a("contentStub");
                    }
                    this.f58251a = new C21509e(appCompatActivity3, viewStub4, this);
                    break;
                case 4:
                    AppCompatActivity appCompatActivity4 = this;
                    ViewStub viewStub5 = this.f58256h;
                    if (viewStub5 == null) {
                        C52711k.m112237a("contentStub");
                    }
                    this.f58251a = new C21489b(appCompatActivity4, viewStub5, this);
                    break;
                case 5:
                    AppCompatActivity appCompatActivity5 = this;
                    ViewStub viewStub6 = this.f58256h;
                    if (viewStub6 == null) {
                        C52711k.m112237a("contentStub");
                    }
                    this.f58251a = new C21486a(appCompatActivity5, viewStub6, this);
                    break;
            }
            C0013i.m16a((Callable<TResult>) new C21477d<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C21478e<TResult,TContinuationResult>(this), C0013i.f25b);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.in)));
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) m54114a((int) R.id.dk4);
        C52711k.m112236a((Object) normalTitleBar2, "two_step_auth_title_bar");
        normalTitleBar2.getStartBtn().setImageResource(R.drawable.c_q);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C21475b bVar = this.f58255e;
        if (bVar != null) {
            bVar.mo45658a(i, i2, intent);
        }
    }
}
