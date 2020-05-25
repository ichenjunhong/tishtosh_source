package com.p683ss.android.ugc.aweme.optimize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.p1397az.p1398a.C23333a;
import com.p683ss.android.ugc.aweme.p1397az.p1398a.C23334b;
import com.p683ss.android.ugc.aweme.p1397az.p1400c.C23338a;
import com.p683ss.p2566d.C51295a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity */
public final class OptimizeSettingActivity extends AppCompatActivity {

    /* renamed from: a */
    private C1690c f98014a;

    /* renamed from: b */
    private HashMap f98015b;

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$a */
    public static final class C38529a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f98016a;

        /* renamed from: b */
        final /* synthetic */ OptimizeSettingActivity f98017b;

        public C38529a(SettingItemSwitch settingItemSwitch, OptimizeSettingActivity optimizeSettingActivity) {
            this.f98016a = settingItemSwitch;
            this.f98017b = optimizeSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98016a.toggle();
            SettingItemSwitch settingItemSwitch = this.f98016a;
            Context context = this.f98017b;
            boolean isChecked = settingItemSwitch.isChecked();
            if (context != null) {
                C23337c.f62343a = isChecked ? 1 : 0;
                C35807d.m80935a(context, "performance_sp", 0).edit().putInt("performance_poor_score", C23337c.f62343a).apply();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$b */
    public static final class C38530b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptimizeSettingActivity f98018a;

        public C38530b(OptimizeSettingActivity optimizeSettingActivity) {
            this.f98018a = optimizeSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98018a.startActivity(new Intent(this.f98018a, LayerInfoSettingActivity.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$c */
    public static final class C38531c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f98019a;

        public C38531c(SettingItemSwitch settingItemSwitch) {
            this.f98019a = settingItemSwitch;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98019a.toggle();
            C38542b.f98037a = Boolean.valueOf(this.f98019a.isChecked());
            C38542b.m85880a("log_open", C38542b.f98037a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$d */
    public static final class C38532d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f98020a;

        /* renamed from: b */
        final /* synthetic */ OptimizeSettingActivity f98021b;

        public C38532d(SettingItemSwitch settingItemSwitch, OptimizeSettingActivity optimizeSettingActivity) {
            this.f98020a = settingItemSwitch;
            this.f98021b = optimizeSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98020a.toggle();
            SettingItemSwitch settingItemSwitch = this.f98020a;
            boolean isChecked = settingItemSwitch.isChecked();
            C38542b.f98038b = Boolean.valueOf(isChecked);
            C38542b.m85880a("fps_open", Boolean.valueOf(isChecked));
            if (settingItemSwitch.isChecked()) {
                C23334b.m57392a();
                C23333a.m57391a(this.f98021b);
                return;
            }
            C52711k.m112240b(this.f98021b, "context");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$e */
    public static final class C38533e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f98022a;

        public C38533e(SettingItemSwitch settingItemSwitch) {
            this.f98022a = settingItemSwitch;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98022a.toggle();
            SettingItemSwitch settingItemSwitch = this.f98022a;
            boolean isChecked = settingItemSwitch.isChecked();
            C38542b.f98039c = Boolean.valueOf(isChecked);
            C38542b.m85880a("draw_checker", Boolean.valueOf(isChecked));
            settingItemSwitch.isChecked();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$f */
    public static final class C38534f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SettingItemSwitch f98023a;

        /* renamed from: b */
        final /* synthetic */ OptimizeSettingActivity f98024b;

        public C38534f(SettingItemSwitch settingItemSwitch, OptimizeSettingActivity optimizeSettingActivity) {
            this.f98023a = settingItemSwitch;
            this.f98024b = optimizeSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98023a.toggle();
            SettingItemSwitch settingItemSwitch = this.f98023a;
            boolean isChecked = settingItemSwitch.isChecked();
            C38542b.f98040d = Boolean.valueOf(isChecked);
            C38542b.m85880a("battery", Boolean.valueOf(isChecked));
            if (settingItemSwitch.isChecked()) {
                C38537a.f98030e.mo78446a((Activity) this.f98024b);
            } else {
                C51295a.m110289a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$g */
    static final class C38535g<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ OptimizeSettingActivity f98025a;

        C38535g(OptimizeSettingActivity optimizeSettingActivity) {
            this.f98025a = optimizeSettingActivity;
        }

        public final void subscribe(C2204x<String> xVar) {
            Pair pair;
            String str;
            C52711k.m112240b(xVar, "it");
            Pair a = C23337c.m57395a((Context) this.f98025a);
            if (a.first == null || !(((Integer) a.first).intValue() == -1 || ((Integer) a.first).intValue() == 1)) {
                pair = new Pair(Boolean.valueOf(false), "");
            } else {
                pair = new Pair(Boolean.valueOf(true), a.second);
            }
            StringBuilder sb = new StringBuilder("低端机判断: 本机");
            Object obj = pair.first;
            C52711k.m112236a(obj, "p.first");
            if (((Boolean) obj).booleanValue()) {
                StringBuilder sb2 = new StringBuilder("为低端机, 满足条件:\n");
                sb2.append((String) pair.second);
                str = sb2.toString();
            } else {
                str = "不为低端机";
            }
            sb.append(str);
            xVar.mo6282a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity$h */
    static final class C38536h<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ OptimizeSettingActivity f98026a;

        C38536h(OptimizeSettingActivity optimizeSettingActivity) {
            this.f98026a = optimizeSettingActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            DmtTextView dmtTextView = (DmtTextView) this.f98026a.mo78437a(R.id.ddi);
            C52711k.m112236a((Object) dmtTextView, "tv_performance");
            dmtTextView.setText(str);
        }
    }

    /* renamed from: a */
    public final View mo78437a(int i) {
        if (this.f98015b == null) {
            this.f98015b = new HashMap();
        }
        View view = (View) this.f98015b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98015b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C1690c cVar = this.f98014a;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.d2);
        this.f98014a = C2201v.m6601a((C2205y<T>) new C38535g<T>(this)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C38536h<Object>(this));
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) mo78437a(R.id.coz);
        C52711k.m112236a((Object) settingItemSwitch, "sis_mock_performance_poor");
        settingItemSwitch.setChecked(C23337c.m57398a());
        settingItemSwitch.setOnClickListener(new C38529a(settingItemSwitch, this));
        SettingItem settingItem = (SettingItem) mo78437a(R.id.coa);
        C52711k.m112236a((Object) settingItem, "si_layer_setting");
        settingItem.setOnClickListener(new C38530b(this));
        SettingItemSwitch settingItemSwitch2 = (SettingItemSwitch) mo78437a(R.id.coy);
        C52711k.m112236a((Object) settingItemSwitch2, "sis_log_open");
        settingItemSwitch2.setChecked(C38542b.m85881a());
        settingItemSwitch2.setOnClickListener(new C38531c(settingItemSwitch2));
        SettingItemSwitch settingItemSwitch3 = (SettingItemSwitch) mo78437a(R.id.cow);
        C52711k.m112236a((Object) settingItemSwitch3, "sis_fps_open");
        settingItemSwitch3.setChecked(C38542b.m85883b());
        settingItemSwitch3.setOnClickListener(new C38532d(settingItemSwitch3, this));
        SettingItemSwitch settingItemSwitch4 = (SettingItemSwitch) mo78437a(R.id.cor);
        C52711k.m112236a((Object) settingItemSwitch4, "sis_draw_checker_open");
        settingItemSwitch4.setChecked(C38542b.m85884c());
        settingItemSwitch4.setOnClickListener(new C38533e(settingItemSwitch4));
        SettingItemSwitch settingItemSwitch5 = (SettingItemSwitch) mo78437a(R.id.ew3);
        C52711k.m112236a((Object) settingItemSwitch5, "sis_battery_open");
        settingItemSwitch5.setChecked(C38542b.m85885d());
        settingItemSwitch5.setOnClickListener(new C38534f(settingItemSwitch5, this));
        if (C38542b.m85883b()) {
            C23334b.m57392a();
            C23333a.m57391a(this);
        }
        C23338a.m57402a(this);
        C38542b.m85884c();
        if (C38542b.m85885d()) {
            C38537a.f98030e.mo78446a((Activity) this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.OptimizeSettingActivity", "onCreate", false);
    }
}
