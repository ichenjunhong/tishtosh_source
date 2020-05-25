package com.p683ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0526f;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.p665a.C10638c;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity */
public final class AVABAndSettingActivity extends AmeSSActivity implements C10638c {

    /* renamed from: b */
    public static final C40744a f103806b = new C40744a(null);

    /* renamed from: a */
    public C40759a f103807a;

    /* renamed from: c */
    private HashMap f103808c;

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$a */
    public static final class C40744a {
        private C40744a() {
        }

        public /* synthetic */ C40744a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$b */
    static final class C40745b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVABAndSettingActivity f103809a;

        C40745b(AVABAndSettingActivity aVABAndSettingActivity) {
            this.f103809a = aVABAndSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f103809a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$c */
    static final class C40746c<T> implements C0199s<String> {

        /* renamed from: a */
        final /* synthetic */ AVABAndSettingActivity f103810a;

        C40746c(AVABAndSettingActivity aVABAndSettingActivity) {
            this.f103810a = aVABAndSettingActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            TextView textView = (TextView) this.f103810a.mo83031a(R.id.s_);
            C52711k.m112236a((Object) textView, "changeLanguage");
            textView.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$d */
    static final class C40747d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVABAndSettingActivity f103811a;

        C40747d(AVABAndSettingActivity aVABAndSettingActivity) {
            this.f103811a = aVABAndSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C40759a aVar = this.f103811a.f103807a;
            if (aVar == null) {
                C52711k.m112237a("activityPresent");
            }
            aVar.mo83061a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$e */
    static final class C40748e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVABAndSettingActivity f103812a;

        C40748e(AVABAndSettingActivity aVABAndSettingActivity) {
            this.f103812a = aVABAndSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C40792i.m90224a(Toast.makeText(this.f103812a, "长按 Item 可以显示详情呦~", 1));
        }
    }

    /* renamed from: a */
    public final View mo83031a(int i) {
        if (this.f103808c == null) {
            this.f103808c = new HashMap();
        }
        View view = (View) this.f103808c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103808c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ab);
        C10675b.m21496a((Context) this);
        FragmentActivity fragmentActivity = this;
        this.f103807a = new C40759a(fragmentActivity);
        ((TextView) mo83031a(R.id.s_)).setTextColor(-12965125);
        ((ABAndSettingViewModel) C0214z.m440a(fragmentActivity).mo359a(ABAndSettingViewModel.class)).f103792a.observe(this, new C40746c(this));
        ((TextView) mo83031a(R.id.s_)).setOnClickListener(new C40747d(this));
        C0654k supportFragmentManager = getSupportFragmentManager();
        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
        C40813r rVar = new C40813r(supportFragmentManager, fragmentActivity);
        ViewPager viewPager = (ViewPager) mo83031a(R.id.ds2);
        C52711k.m112236a((Object) viewPager, "viewpager");
        viewPager.setAdapter(rVar);
        ((TabLayout) mo83031a(R.id.cx7)).addTab(((TabLayout) mo83031a(R.id.cx7)).newTab());
        ((TabLayout) mo83031a(R.id.cx7)).addTab(((TabLayout) mo83031a(R.id.cx7)).newTab());
        ((TabLayout) mo83031a(R.id.cx7)).addTab(((TabLayout) mo83031a(R.id.cx7)).newTab());
        ((TabLayout) mo83031a(R.id.cx7)).setupWithViewPager((ViewPager) mo83031a(R.id.ds2), false);
        C0526f tabAt = ((TabLayout) mo83031a(R.id.cx7)).getTabAt(0);
        if (tabAt == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) tabAt, "tablayout.getTabAt(0)!!");
        tabAt.mo1594a((CharSequence) "AB");
        C0526f tabAt2 = ((TabLayout) mo83031a(R.id.cx7)).getTabAt(1);
        if (tabAt2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) tabAt2, "tablayout.getTabAt(1)!!");
        tabAt2.mo1594a((CharSequence) "Setting");
        C0526f tabAt3 = ((TabLayout) mo83031a(R.id.cx7)).getTabAt(2);
        if (tabAt3 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) tabAt3, "tablayout.getTabAt(2)!!");
        tabAt3.mo1594a((CharSequence) "VESDK");
        ((ImageView) mo83031a(R.id.ij)).setOnClickListener(new C40745b(this));
        ((TextView) findViewById(R.id.dha)).setOnClickListener(new C40748e(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onCreate", false);
    }
}
