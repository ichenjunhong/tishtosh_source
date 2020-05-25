package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.widget.setting.EffectiveSettingItem;
import com.bytedance.ies.dmt.p664ui.widget.setting.EffectiveSettingItemBase.C10729a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.p1417h.C23536a;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24529c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36212f;
import com.p683ss.android.ugc.aweme.livewallpaper.p1929ui.LocalLiveWallPaperActivity;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.setting.C41632l;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity */
public final class AccessibilitySettingActivity extends AmeBaseActivity {

    /* renamed from: a */
    private HashMap f105597a;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity$a */
    static final class C41721a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilitySettingActivity f105598a;

        C41721a(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f105598a = accessibilitySettingActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            AccessibilitySettingActivity accessibilitySettingActivity = this.f105598a;
            CommonItemView commonItemView = (CommonItemView) accessibilitySettingActivity.mo85568a(R.id.a26);
            C52711k.m112236a((Object) commonItemView, "cover_item");
            CommonItemView commonItemView2 = (CommonItemView) accessibilitySettingActivity.mo85568a(R.id.a26);
            C52711k.m112236a((Object) commonItemView2, "cover_item");
            commonItemView.setChecked(!commonItemView2.mo19040c());
            Context context = accessibilitySettingActivity;
            String str2 = "dynamic_cover";
            CommonItemView commonItemView3 = (CommonItemView) accessibilitySettingActivity.mo85568a(R.id.a26);
            C52711k.m112236a((Object) commonItemView3, "cover_item");
            if (commonItemView3.mo19040c()) {
                str = "on";
            } else {
                str = "off";
            }
            C18898c.m46009a(context, str2, str);
            CommonItemView commonItemView4 = (CommonItemView) accessibilitySettingActivity.mo85568a(R.id.a26);
            C52711k.m112236a((Object) commonItemView4, "cover_item");
            boolean c = commonItemView4.mo19040c();
            String str3 = "aweme_app";
            String str4 = "use_dynamic_cover";
            C35807d.m80935a(C11010c.m22280a(), str3, 0).edit().putBoolean(str4, c).apply();
            C23536a.f62659a.put(C23536a.m57710a(str3, str4), Boolean.valueOf(c));
            CommonItemView commonItemView5 = (CommonItemView) accessibilitySettingActivity.mo85568a(R.id.a26);
            C52711k.m112236a((Object) commonItemView5, "cover_item");
            C47718bf.m103288a(new C24529c(commonItemView5.mo19040c() ^ true ? 1 : 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity$b */
    static final class C41722b implements C10729a {

        /* renamed from: a */
        final /* synthetic */ AccessibilitySettingActivity f105599a;

        C41722b(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f105599a = accessibilitySettingActivity;
        }

        /* renamed from: a */
        public final void mo19301a(View view) {
            if (!C32800a.m75679a(view)) {
                AccessibilitySettingActivity accessibilitySettingActivity = this.f105599a;
                C26890h.m65011a("live_photo_manage", C23089d.m56640a().mo47829a("enter_from", "accessibility").f61491a);
                accessibilitySettingActivity.startActivity(new Intent(accessibilitySettingActivity, LocalLiveWallPaperActivity.class));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity$c */
    static final class C41723c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccessibilitySettingActivity f105600a;

        C41723c(AccessibilitySettingActivity accessibilitySettingActivity) {
            this.f105600a = accessibilitySettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105600a.finish();
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.a5;
    }

    /* renamed from: a */
    public final View mo85568a(int i) {
        if (this.f105597a == null) {
            this.f105597a = new HashMap();
        }
        View view = (View) this.f105597a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105597a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.title);
        C52711k.m112236a((Object) findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(getString(R.string.c1));
        if (C23337c.m57398a()) {
            CommonItemView commonItemView = (CommonItemView) mo85568a(R.id.a26);
            C52711k.m112236a((Object) commonItemView, "cover_item");
            commonItemView.setVisibility(8);
        }
        ((CommonItemView) mo85568a(R.id.a26)).setRightIconRes(0);
        View findViewById2 = findViewById(R.id.b3r);
        C52711k.m112236a((Object) findViewById2, "rightIcon");
        findViewById2.setVisibility(8);
        ((CommonItemView) mo85568a(R.id.a26)).setOnClickListener(new C41721a(this));
        if (C36212f.m81747c()) {
            EffectiveSettingItem effectiveSettingItem = (EffectiveSettingItem) mo85568a(R.id.bi2);
            C52711k.m112236a((Object) effectiveSettingItem, "local_livewallpaper");
            effectiveSettingItem.setVisibility(8);
        } else {
            EffectiveSettingItem effectiveSettingItem2 = (EffectiveSettingItem) mo85568a(R.id.bi2);
            C52711k.m112236a((Object) effectiveSettingItem2, "local_livewallpaper");
            effectiveSettingItem2.setVisibility(0);
            ((EffectiveSettingItem) mo85568a(R.id.bi2)).setOnSettingItemClickListener(new C41722b(this));
        }
        findViewById(R.id.ik).setOnClickListener(new C41723c(this));
        CommonItemView commonItemView2 = (CommonItemView) mo85568a(R.id.a26);
        C52711k.m112236a((Object) commonItemView2, "cover_item");
        commonItemView2.setChecked(C41632l.m91511a(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AccessibilitySettingActivity", "onCreate", false);
    }
}
