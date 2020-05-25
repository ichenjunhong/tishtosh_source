package com.p683ss.android.ugc.aweme.longvideonew;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.gyf.barlibrary.BarHide;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.longvideo.C36367d;
import com.p683ss.android.ugc.aweme.p1382aq.C23194ab;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoActivity */
public final class LongVideoActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C36395a f93195a = new C36395a(null);

    /* renamed from: b */
    private C36407f f93196b;

    /* renamed from: c */
    private final ArrayList<C23422a> f93197c = new ArrayList<>();

    /* renamed from: d */
    private long f93198d;

    /* renamed from: e */
    private String f93199e = "";

    /* renamed from: f */
    private int f93200f;

    /* renamed from: g */
    private String f93201g = "";

    /* renamed from: h */
    private int f93202h = -1;

    /* renamed from: i */
    private String f93203i = "";

    /* renamed from: j */
    private boolean f93204j;

    /* renamed from: k */
    private Aweme f93205k;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoActivity$a */
    public static final class C36395a {
        private C36395a() {
        }

        public /* synthetic */ C36395a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m82126a(Context context) {
            if (C36406e.m82162a(context)) {
                return true;
            }
            C10691a.m21548c(context, (int) R.string.cg1).mo19066a();
            return false;
        }

        /* renamed from: a */
        private static void m82124a(Aweme aweme, String str, int i) {
            new C23194ab().mo47956c(aweme, i).mo47955a(str).mo48076e();
        }

        /* renamed from: a */
        public final void mo75332a(Context context, Aweme aweme, String str, int i, int i2, String str2, boolean z) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aweme, "aweme");
            C52711k.m112240b(str, "eventType");
            C52711k.m112240b(str2, "reactSessionId");
            if (m82126a(context)) {
                m82124a(aweme, str, i);
                C36367d.m82059a(aweme);
                Intent intent = new Intent(context, LongVideoActivity.class);
                intent.putExtra("extra_aweme_id", aweme.getAid());
                intent.putExtra("extra_event_type", str);
                intent.putExtra("extra_page_type", i);
                intent.putExtra("extra_initial_time", i2);
                intent.putExtra("extra_react_session_id", str2);
                intent.putExtra("extra_hide_interact_area", z);
                context.startActivity(intent);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m82125a(C36395a aVar, Context context, Aweme aweme, String str, int i, int i2, String str2, boolean z, int i3, Object obj) {
            int i4;
            String str3;
            if ((i3 & 16) != 0) {
                i4 = 0;
            } else {
                i4 = i2;
            }
            if ((i3 & 32) != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            aVar.mo75332a(context, aweme, str, i, i4, str3, false);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.am);
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.a8w);
    }

    public final void onBackPressed() {
        C36407f fVar = this.f93196b;
        if (fVar != null) {
            fVar.mo75345a();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f93197c.clear();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onResume", true);
        super.onResume();
        this.f93198d = SystemClock.elapsedRealtime();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onResume", false);
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).hideBar(BarHide.FLAG_HIDE_STATUS_BAR).fullScreen(true).init();
    }

    public final void onPause() {
        super.onPause();
        new C23213as("long_video_stay_time").mo48005a(String.valueOf(SystemClock.elapsedRealtime() - this.f93198d)).mo48006b(this.f93199e).mo47954f(this.f93205k).mo48076e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        if (r9.f93205k == null) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.longvideonew.LongVideoActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r10 < r0) goto L_0x001c
            android.view.Window r10 = r9.getWindow()
            if (r10 == 0) goto L_0x001c
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10.setNavigationBarColor(r0)
        L_0x001c:
            android.view.Window r10 = r9.getWindow()
            if (r10 == 0) goto L_0x0027
            r0 = 128(0x80, float:1.794E-43)
            r10.addFlags(r0)
        L_0x0027:
            r10 = 2131034219(0x7f05006b, float:1.767895E38)
            r0 = 0
            r9.superOverridePendingTransition(r10, r0)
            r10 = 2132213840(0x7f170050, float:2.0071505E38)
            r9.setContentView(r10)
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r1 = "extra_aweme_id"
            java.lang.String r10 = r10.getStringExtra(r1)
            if (r10 != 0) goto L_0x0042
            java.lang.String r10 = ""
        L_0x0042:
            r9.f93201g = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r1 = "extra_event_type"
            java.lang.String r10 = r10.getStringExtra(r1)
            if (r10 != 0) goto L_0x0052
            java.lang.String r10 = ""
        L_0x0052:
            r9.f93199e = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r1 = "extra_page_type"
            int r10 = r10.getIntExtra(r1, r0)
            r9.f93200f = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r1 = "extra_initial_time"
            int r10 = r10.getIntExtra(r1, r0)
            r9.f93202h = r10
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r1 = "extra_react_session_id"
            java.lang.String r10 = r10.getStringExtra(r1)
            if (r10 != 0) goto L_0x007a
            java.lang.String r10 = ""
        L_0x007a:
            r9.f93203i = r10
            android.content.Intent r10 = r9.getIntent()
            if (r10 == 0) goto L_0x0089
            java.lang.String r1 = "extra_hide_interact_area"
            boolean r10 = r10.getBooleanExtra(r1, r0)
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            r9.f93204j = r10
            java.lang.String r10 = r9.f93199e
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r1 = "homepage_hot"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r10 = android.text.TextUtils.equals(r10, r1)
            if (r10 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r10 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r10 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r10
            java.lang.String r1 = r9.f93201g
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r10.getRawAdAwemeById(r1)
            r9.f93205k = r10
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r9.f93205k
            if (r10 != 0) goto L_0x00ba
        L_0x00ac:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r10 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r10 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r10
            java.lang.String r1 = r9.f93201g
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r10.getAwemeById(r1)
            r9.f93205k = r10
        L_0x00ba:
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r9.f93205k
            if (r10 != 0) goto L_0x00c4
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = com.p683ss.android.ugc.aweme.longvideo.C36367d.m82057a()
            r9.f93205k = r10
        L_0x00c4:
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r9.f93205k
            java.lang.String r1 = r9.f93199e
            int r3 = r9.f93200f
            java.lang.String r4 = "longVideoPlayActivity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r4)
            java.lang.String r4 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            r4 = r9
            android.support.v4.app.FragmentActivity r4 = (android.support.p030v4.app.FragmentActivity) r4
            android.arch.lifecycle.y r4 = android.arch.lifecycle.C0214z.m440a(r4)
            java.lang.Class<com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel> r5 = com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel.class
            android.arch.lifecycle.x r4 = r4.mo359a(r5)
            java.lang.String r5 = "ViewModelProviders.of(lo…MobViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r4 = (com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel) r4
            r4.f93194b = r10
            com.ss.android.ugc.aweme.longvideo.f r10 = new com.ss.android.ugc.aweme.longvideo.f
            r10.<init>(r1, r3, r2)
            r4.f93193a = r10
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r9.f93205k
            java.lang.String r1 = r9.f93199e
            int r2 = r9.f93200f
            java.lang.String r3 = "long_video_player_activity"
            int r4 = r9.f93202h
            java.lang.String r5 = r9.f93203i
            boolean r6 = r9.f93204j
            java.lang.String r7 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r7)
            java.lang.String r7 = "businessType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r7)
            java.lang.String r7 = "reactSessionId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = "extra_event_type"
            r7.putString(r8, r1)
            java.lang.String r1 = "extra_page_type"
            r7.putInt(r1, r2)
            java.lang.String r1 = "extra_business_type"
            r7.putString(r1, r3)
            java.lang.String r1 = "extra_initial_time"
            r7.putInt(r1, r4)
            java.lang.String r1 = "extra_react_session_id"
            r7.putString(r1, r5)
            java.lang.String r1 = "extra_hide_interact_area"
            r7.putBoolean(r1, r6)
            com.ss.android.ugc.aweme.longvideonew.f r1 = new com.ss.android.ugc.aweme.longvideonew.f
            r1.<init>()
            r1.setArguments(r7)
            r1.f93238a = r10
            r9.f93196b = r1
            com.ss.android.ugc.aweme.longvideonew.f r10 = r9.f93196b
            com.ss.android.ugc.aweme.base.activity.a r10 = (com.p683ss.android.ugc.aweme.base.activity.C23422a) r10
            if (r10 == 0) goto L_0x0148
            java.util.ArrayList<com.ss.android.ugc.aweme.base.activity.a> r1 = r9.f93197c
            r1.add(r10)
        L_0x0148:
            com.ss.android.ugc.aweme.longvideonew.f r10 = r9.f93196b
            if (r10 == 0) goto L_0x0160
            android.support.v4.app.k r1 = r9.getSupportFragmentManager()
            android.support.v4.app.r r1 = r1.mo2225a()
            r2 = 2132019228(0x7f14081c, float:1.9676785E38)
            android.support.v4.app.Fragment r10 = (android.support.p030v4.app.Fragment) r10
            android.support.v4.app.r r10 = r1.mo2175a(r2, r10)
            r10.mo2189b()
        L_0x0160:
            java.lang.String r10 = "com.ss.android.ugc.aweme.longvideonew.LongVideoActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r10, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isViewValid()) {
            return false;
        }
        Iterator it = this.f93197c.iterator();
        while (it.hasNext()) {
            if (((C23422a) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
