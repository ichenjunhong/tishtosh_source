package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView */
public final class DebugInfoView extends LinearLayout {

    /* renamed from: c */
    public static boolean f80341c = true;

    /* renamed from: d */
    public static final C30695a f80342d = new C30695a(null);

    /* renamed from: a */
    public ScrollView f80343a;

    /* renamed from: b */
    public Switch f80344b;

    /* renamed from: e */
    private RelativeLayout f80345e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$a */
    public static final class C30695a {
        private C30695a() {
        }

        /* renamed from: a */
        public static boolean m71989a() {
            return DebugInfoView.f80341c;
        }

        /* renamed from: a */
        public static void m71988a(boolean z) {
            DebugInfoView.f80341c = z;
        }

        public /* synthetic */ C30695a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$b */
    static final class C30696b implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ DebugInfoView f80346a;

        /* renamed from: b */
        final /* synthetic */ String f80347b;

        C30696b(DebugInfoView debugInfoView, String str) {
            this.f80346a = debugInfoView;
            this.f80347b = str;
        }

        public final boolean onLongClick(View view) {
            String str;
            Object systemService = this.f80346a.getContext().getSystemService("clipboard");
            if (systemService != null) {
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                String str2 = this.f80347b;
                if (str2 == null) {
                    str = null;
                } else if (str2 != null) {
                    str = C52830p.m112447b(str2).toString();
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
                clipboardManager.setText(str);
                C10691a.m21537a(this.f80346a.getContext(), this.f80346a.getResources().getString(R.string.aiv)).mo19066a();
                return true;
            }
            throw new C52857u("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$c */
    static final class C30697c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DebugInfoView f80348a;

        C30697c(DebugInfoView debugInfoView) {
            this.f80348a = debugInfoView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DebugInfoView.m71986a(this.f80348a).setVisibility(0);
                C30695a.m71988a(true);
                DebugInfoView.m71987b(this.f80348a).setChecked(C30695a.m71989a());
                return;
            }
            DebugInfoView.m71986a(this.f80348a).setVisibility(8);
            C30695a.m71988a(false);
            DebugInfoView.m71987b(this.f80348a).setChecked(C30695a.m71989a());
        }
    }

    public DebugInfoView(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    /* renamed from: a */
    public static final /* synthetic */ ScrollView m71986a(DebugInfoView debugInfoView) {
        ScrollView scrollView = debugInfoView.f80343a;
        if (scrollView == null) {
            C52711k.m112237a("mDebugInfoContainer");
        }
        return scrollView;
    }

    /* renamed from: b */
    public static final /* synthetic */ Switch m71987b(DebugInfoView debugInfoView) {
        Switch switchR = debugInfoView.f80344b;
        if (switchR == null) {
            C52711k.m112237a("mDebugSwitch");
        }
        return switchR;
    }

    public final void setContent(String str) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin() && C9431p.m18665a(C11010c.m22295p(), "lark_inhouse")) {
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            if (a.f61631m == null) {
                a.f61631m = new C23051bf<>("debug_text", Boolean.valueOf(true));
            }
            C23051bf<Boolean> bfVar = a.f61631m;
            C52711k.m112236a((Object) bfVar, "CommonSharePrefCache.inst().openDebugText");
            Object d = bfVar.mo47782d();
            C52711k.m112236a(d, "CommonSharePrefCache.inst().openDebugText.cache");
            if (((Boolean) d).booleanValue()) {
                LayoutInflater.from(getContext()).inflate(R.layout.b7a, this, true);
                View findViewById = findViewById(R.id.cvq);
                C52711k.m112236a((Object) findViewById, "findViewById(R.id.sv_debugInfoContainer)");
                this.f80343a = (ScrollView) findViewById;
                View findViewById2 = findViewById(R.id.cw6);
                C52711k.m112236a((Object) findViewById2, "findViewById(R.id.switch_debugInfoView)");
                this.f80344b = (Switch) findViewById2;
                View findViewById3 = findViewById(R.id.cdh);
                C52711k.m112236a((Object) findViewById3, "findViewById(R.id.rl_debugInfoAll)");
                this.f80345e = (RelativeLayout) findViewById3;
                Switch switchR = this.f80344b;
                if (switchR == null) {
                    C52711k.m112237a("mDebugSwitch");
                }
                switchR.setOnCheckedChangeListener(new C30697c(this));
                RelativeLayout relativeLayout = this.f80345e;
                if (relativeLayout == null) {
                    C52711k.m112237a("mDebugInfoAll");
                }
                relativeLayout.setVisibility(0);
                Switch switchR2 = this.f80344b;
                if (switchR2 == null) {
                    C52711k.m112237a("mDebugSwitch");
                }
                switchR2.setChecked(f80341c);
                if (f80341c) {
                    ScrollView scrollView = this.f80343a;
                    if (scrollView == null) {
                        C52711k.m112237a("mDebugInfoContainer");
                    }
                    scrollView.setVisibility(0);
                } else {
                    ScrollView scrollView2 = this.f80343a;
                    if (scrollView2 == null) {
                        C52711k.m112237a("mDebugInfoContainer");
                    }
                    scrollView2.setVisibility(8);
                }
                DmtTextView dmtTextView = new DmtTextView(getContext());
                dmtTextView.setText(str);
                dmtTextView.setTextColor(getResources().getColor(R.color.iu));
                dmtTextView.setGravity(getLeft());
                dmtTextView.setTextAlignment(5);
                dmtTextView.setLineSpacing(0.0f, 1.5f);
                dmtTextView.setTextDirection(5);
                ScrollView scrollView3 = this.f80343a;
                if (scrollView3 == null) {
                    C52711k.m112237a("mDebugInfoContainer");
                }
                scrollView3.removeAllViews();
                ScrollView scrollView4 = this.f80343a;
                if (scrollView4 == null) {
                    C52711k.m112237a("mDebugInfoContainer");
                }
                scrollView4.addView(dmtTextView);
                dmtTextView.setOnLongClickListener(new C30696b(this, str));
            }
        }
    }

    public DebugInfoView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
    }
}
