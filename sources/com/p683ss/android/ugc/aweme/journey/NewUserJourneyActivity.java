package com.p683ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.journey.C35778r.C35779a;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.legoImp.NewUserLaunchActivity;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47464j;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity */
public final class NewUserJourneyActivity extends NewUserLaunchActivity {

    /* renamed from: g */
    public static final C35715a f91681g = new C35715a(null);

    /* renamed from: a */
    public int f91682a = -1;

    /* renamed from: b */
    public C35768n f91683b;

    /* renamed from: c */
    public C35834e f91684c;

    /* renamed from: d */
    public boolean f91685d;

    /* renamed from: e */
    public boolean f91686e = true;

    /* renamed from: f */
    public boolean f91687f;

    /* renamed from: h */
    private Intent f91688h;

    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$a */
    public static final class C35715a {
        private C35715a() {
        }

        public /* synthetic */ C35715a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m80706a(Activity activity, boolean z) {
            C52711k.m112240b(activity, "activity");
            C22574a.m55738f().mo46914a();
            C22574a.m55738f().mo46919b();
            if (!C23110b.m56677b()) {
                Intent intent = new Intent(activity, NewUserJourneyActivity.class);
                intent.putExtra("from_main", z);
                if (!z) {
                    intent.putExtra("deeplink_intent_about_welcome_screen", activity.getIntent());
                    activity.finish();
                }
                activity.overridePendingTransition(0, 0);
                activity.startActivityForResult(intent, 18);
            }
        }
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private static boolean m80705c() {
        return C47464j.f119726b.mo94745c();
    }

    public final void onDestroy() {
        C35781s.f91897b = true;
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        super.setStatusBarColor();
        if (VERSION.SDK_INT >= 23) {
            C23729p.m58269c((Activity) this);
        }
    }

    public final boolean useImmerseMode() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final int getStatusBarColor() {
        if (VERSION.SDK_INT >= 23) {
            return getResources().getColor(R.color.aso);
        }
        return super.getStatusBarColor();
    }

    /* renamed from: b */
    private final boolean m80704b() {
        CharSequence charSequence = "en";
        Resources resources = getResources();
        C52711k.m112236a((Object) resources, "resources");
        Locale locale = resources.getConfiguration().locale;
        C52711k.m112236a((Object) locale, "resources.configuration.locale");
        if (TextUtils.equals(charSequence, locale.getLanguage()) && TextUtils.equals("MY", C35837h.m80980e())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m80703a() {
        if (this.f91684c != null) {
            C35834e eVar = this.f91684c;
            if (eVar == null) {
                C52711k.m112234a();
            }
            CharSequence g = eVar.mo70127g();
            C35834e currentI18nItem = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(this);
            C52711k.m112236a((Object) currentI18nItem, "ServiceManager.get().get….getCurrentI18nItem(this)");
            if (!TextUtils.equals(g, currentI18nItem.mo70127g())) {
                return true;
            }
        }
        return false;
    }

    public final void finish() {
        C35781s.f91897b = true;
        Intent intent = this.f91688h;
        Activity activity = this;
        C52711k.m112240b(activity, "activity");
        if (!(intent == null || intent.getData() == null)) {
            Intent intent2 = new Intent(activity, DeepLinkHandlerActivity.class);
            intent2.setFlags(268435456);
            intent2.setAction("android.intent.action.VIEW");
            C18922i iVar = new C18922i(intent.getData().toString());
            iVar.mo38778a("random", new Random(1000).toString());
            intent2.setData(Uri.parse(iVar.mo38774a()));
            intent2.putExtras(intent).putExtra("new_user_journey", true);
            if (intent.getBooleanExtra("from_task", false)) {
                activity.setResult(-1, intent2);
            } else {
                activity.startActivity(intent2);
            }
        }
        super.finish();
        overridePendingTransition(0, R.anim.ep);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m80698a(intent);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onEvent(C35790u uVar) {
        C52711k.m112240b(uVar, "event");
        m80702a(uVar.f91927a);
    }

    /* renamed from: a */
    private final void m80698a(Intent intent) {
        Intent intent2;
        if (intent != null) {
            intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            this.f91688h = intent2;
            if (!C35779a.m80909a()) {
                C35779a.m80908a(this);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f91687f = false;
        this.f91686e = getIntent().getBooleanExtra("from_main", true);
        if (!this.f91686e) {
            C35781s.f91908m = 1;
        }
        C35781s.f91897b = false;
        m80698a(getIntent());
        Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
        setContentView((int) R.layout.axb);
        m80702a((Boolean) null);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", false);
    }

    @C53771m(mo112975a = ThreadMode.MAIN, mo112976b = true)
    public final void onEvent(C35768n nVar) {
        List<C35777q> list;
        C52711k.m112240b(nVar, "event");
        int b = (int) C9432q.m18687b((Context) this, 28.0f);
        C35776p pVar = nVar.f91864a;
        if (pVar != null) {
            list = pVar.f91885a;
        } else {
            list = null;
        }
        if (list != null && (!list.isEmpty())) {
            Fragment a = getSupportFragmentManager().mo2222a((int) R.id.ajf);
            if (this.f91682a <= 0) {
                for (C35777q qVar : list) {
                    String str = qVar.f91889c;
                    if (str == null) {
                        str = "";
                    }
                    C12203q.m24646a(str).mo23114a((FragmentActivity) this).mo23111a(b, b).mo23128c();
                }
            } else if (this.f91682a == 1 && (a instanceof C35725d)) {
                C35725d dVar = (C35725d) a;
                if (dVar.f91714c == null) {
                    dVar.f91714c = list;
                }
            }
        }
        this.f91683b = nVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        if (com.p683ss.android.ugc.aweme.journey.C35781s.f91909n.mo74444h() != false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m80702a(java.lang.Boolean r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == 0) goto L_0x000e
            boolean r1 = r7.f91685d
            if (r1 != 0) goto L_0x000e
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r0
            r7.f91685d = r8
        L_0x000e:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            int r8 = r8.mo74445i()
            r1 = 5
            r2 = 3
            r3 = 4
            if (r8 != r0) goto L_0x0020
            int r8 = r7.f91682a
            if (r8 != 0) goto L_0x0020
            r7.f91682a = r3
            goto L_0x0043
        L_0x0020:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            int r8 = r8.mo74445i()
            if (r8 != r0) goto L_0x002f
            int r8 = r7.f91682a
            if (r8 != r3) goto L_0x002f
            r7.f91682a = r0
            goto L_0x0043
        L_0x002f:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            int r8 = r8.mo74445i()
            if (r8 != r0) goto L_0x003e
            int r8 = r7.f91682a
            if (r8 != r2) goto L_0x003e
            r7.f91682a = r1
            goto L_0x0043
        L_0x003e:
            int r8 = r7.f91682a
            int r8 = r8 + r0
            r7.f91682a = r8
        L_0x0043:
            boolean r8 = m80705c()
            r4 = 0
            r5 = 2
            r6 = 0
            if (r8 != 0) goto L_0x004f
            r2 = 5
            goto L_0x00aa
        L_0x004f:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            int r8 = r8.mo74445i()
            if (r8 != r0) goto L_0x007c
            boolean r8 = r7.m80704b()
            if (r8 == 0) goto L_0x0062
            boolean r8 = r7.f91686e
            if (r8 == 0) goto L_0x0062
            goto L_0x00aa
        L_0x0062:
            com.ss.android.ugc.aweme.journey.n r8 = r7.f91683b
            if (r8 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.journey.m r8 = r8.f91865b
            if (r8 == 0) goto L_0x006d
            java.util.List<com.ss.android.ugc.aweme.journey.k> r8 = r8.f91862a
            goto L_0x006e
        L_0x006d:
            r8 = r6
        L_0x006e:
            if (r8 == 0) goto L_0x0072
        L_0x0070:
            r2 = 2
            goto L_0x00aa
        L_0x0072:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            boolean r8 = r8.mo74444h()
            if (r8 == 0) goto L_0x0084
        L_0x007a:
            r2 = 1
            goto L_0x00aa
        L_0x007c:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            int r8 = r8.mo74445i()
            if (r8 != r5) goto L_0x0086
        L_0x0084:
            r2 = 4
            goto L_0x00aa
        L_0x0086:
            boolean r8 = r7.m80704b()
            if (r8 == 0) goto L_0x0091
            boolean r8 = r7.f91686e
            if (r8 == 0) goto L_0x0091
            goto L_0x00aa
        L_0x0091:
            com.ss.android.ugc.aweme.journey.n r8 = r7.f91683b
            if (r8 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.journey.m r8 = r8.f91865b
            if (r8 == 0) goto L_0x009c
            java.util.List<com.ss.android.ugc.aweme.journey.k> r8 = r8.f91862a
            goto L_0x009d
        L_0x009c:
            r8 = r6
        L_0x009d:
            if (r8 == 0) goto L_0x00a0
            goto L_0x0070
        L_0x00a0:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            boolean r8 = r8.mo74444h()
            if (r8 == 0) goto L_0x00a9
            goto L_0x007a
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            com.p683ss.android.ugc.aweme.journey.C35781s.f91907l = r2
            int r8 = r7.f91682a
            switch(r8) {
                case 0: goto L_0x01de;
                case 1: goto L_0x01a7;
                case 2: goto L_0x017b;
                case 3: goto L_0x015e;
                case 4: goto L_0x013a;
                case 5: goto L_0x00ca;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            boolean r8 = r7.m80703a()
            if (r8 == 0) goto L_0x0215
            boolean r8 = r7.f91687f
            if (r8 != 0) goto L_0x0215
            r7.f91687f = r0
            com.ss.android.ugc.aweme.i18n.language.a.b r8 = com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b.m76080a()
            com.ss.android.ugc.aweme.language.e r0 = r7.f91684c
            if (r0 != 0) goto L_0x01e9
            p2628d.p2639f.p2641b.C52711k.m112234a()
            goto L_0x01e9
        L_0x00ca:
            com.ss.android.ugc.aweme.journey.o r8 = new com.ss.android.ugc.aweme.journey.o
            r8.<init>()
            boolean r1 = r7.m80703a()
            if (r1 != 0) goto L_0x00e3
            com.p683ss.android.ugc.aweme.journey.C35781s.f91899d = r0
            com.ss.android.ugc.aweme.feed.ui.ai$a r1 = new com.ss.android.ugc.aweme.feed.ui.ai$a
            boolean r2 = r7.f91685d
            r0 = r0 ^ r2
            r1.<init>(r0)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r1)
            goto L_0x012a
        L_0x00e3:
            com.ss.android.ugc.aweme.language.e r0 = r7.f91684c
            if (r0 != 0) goto L_0x00ea
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ea:
            java.lang.String r0 = r0.mo70121a()
            if (r0 != 0) goto L_0x00f1
            goto L_0x011e
        L_0x00f1:
            int r1 = r0.hashCode()
            r2 = 104135475(0x634fb33, float:3.403879E-35)
            if (r1 == r2) goto L_0x010f
            r2 = 1978411730(0x75ec2ad2, float:5.9875516E32)
            if (r1 == r2) goto L_0x0100
            goto L_0x011e
        L_0x0100:
            java.lang.String r1 = "zh-Hant-TW"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "向上滑動"
            java.lang.String r1 = "我們會顯示使用您所選語言製作的影片"
            java.lang.String r2 = "開始觀看"
            goto L_0x0124
        L_0x010f:
            java.lang.String r1 = "ms-MY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "Leret ke atas"
            java.lang.String r1 = "Teruskan menemui lebih banyak video"
            java.lang.String r2 = "Mula menonton"
            goto L_0x0124
        L_0x011e:
            java.lang.String r0 = "Swipe up"
            java.lang.String r1 = "Keep discovering more videos"
            java.lang.String r2 = "Start watching"
        L_0x0124:
            r8.f91873l = r0
            r8.f91874m = r1
            r8.f91875n = r2
        L_0x012a:
            boolean r0 = m80705c()
            if (r0 != 0) goto L_0x0136
            android.support.v4.app.Fragment r8 = (android.support.p030v4.app.Fragment) r8
            r7.m80699a(r8, false)
            return
        L_0x0136:
            r7.finish()
            return
        L_0x013a:
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            int r8 = r8.mo74445i()
            if (r8 == r0) goto L_0x014f
            com.ss.android.ugc.aweme.journey.s r8 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            int r8 = r8.mo74445i()
            if (r8 != r5) goto L_0x014b
            goto L_0x014f
        L_0x014b:
            r7.m80702a((java.lang.Boolean) null)
            return
        L_0x014f:
            com.ss.android.ugc.aweme.journey.d r8 = new com.ss.android.ugc.aweme.journey.d
            r8.<init>()
            int r0 = r7.f91682a
            r8.f91712a = r0
            android.support.v4.app.Fragment r8 = (android.support.p030v4.app.Fragment) r8
            r7.m80699a(r8, false)
            return
        L_0x015e:
            boolean r8 = r7.m80704b()
            if (r8 == 0) goto L_0x0177
            boolean r8 = r7.f91686e
            if (r8 == 0) goto L_0x0177
            com.ss.android.ugc.aweme.journey.d r8 = new com.ss.android.ugc.aweme.journey.d
            r8.<init>()
            int r0 = r7.f91682a
            r8.f91712a = r0
            android.support.v4.app.Fragment r8 = (android.support.p030v4.app.Fragment) r8
            r7.m80699a(r8, false)
            return
        L_0x0177:
            r7.m80702a((java.lang.Boolean) null)
            return
        L_0x017b:
            com.ss.android.ugc.aweme.journey.n r8 = r7.f91683b
            if (r8 == 0) goto L_0x0186
            com.ss.android.ugc.aweme.journey.m r8 = r8.f91865b
            if (r8 == 0) goto L_0x0186
            java.util.List<com.ss.android.ugc.aweme.journey.k> r8 = r8.f91862a
            goto L_0x0187
        L_0x0186:
            r8 = r6
        L_0x0187:
            if (r8 == 0) goto L_0x01a3
            com.ss.android.ugc.aweme.journey.d r8 = new com.ss.android.ugc.aweme.journey.d
            r8.<init>()
            int r0 = r7.f91682a
            r8.f91712a = r0
            com.ss.android.ugc.aweme.journey.n r0 = r7.f91683b
            if (r0 != 0) goto L_0x0199
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0199:
            com.ss.android.ugc.aweme.journey.m r0 = r0.f91865b
            r8.f91713b = r0
            android.support.v4.app.Fragment r8 = (android.support.p030v4.app.Fragment) r8
            r7.m80699a(r8, false)
            return
        L_0x01a3:
            r7.m80702a((java.lang.Boolean) null)
            return
        L_0x01a7:
            com.ss.android.ugc.aweme.journey.n r8 = r7.f91683b
            if (r8 == 0) goto L_0x01b2
            com.ss.android.ugc.aweme.journey.p r8 = r8.f91864a
            if (r8 == 0) goto L_0x01b2
            java.util.List<com.ss.android.ugc.aweme.journey.q> r8 = r8.f91885a
            goto L_0x01b3
        L_0x01b2:
            r8 = r6
        L_0x01b3:
            com.ss.android.ugc.aweme.journey.s r1 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            boolean r1 = r1.mo74444h()
            if (r1 == 0) goto L_0x01da
            com.ss.android.ugc.aweme.journey.d r0 = new com.ss.android.ugc.aweme.journey.d
            r0.<init>()
            int r1 = r7.f91682a
            r0.f91712a = r1
            r0.f91714c = r8
            com.ss.android.ugc.aweme.journey.n r8 = r7.f91683b
            if (r8 == 0) goto L_0x01d1
            com.ss.android.ugc.aweme.journey.p r8 = r8.f91864a
            if (r8 == 0) goto L_0x01d1
            boolean r8 = r8.f91886b
            goto L_0x01d2
        L_0x01d1:
            r8 = 0
        L_0x01d2:
            r0.f91719l = r8
            android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
            r7.m80699a(r0, false)
            return
        L_0x01da:
            r7.m80702a((java.lang.Boolean) null)
            return
        L_0x01de:
            com.ss.android.ugc.aweme.journey.x r8 = new com.ss.android.ugc.aweme.journey.x
            r8.<init>()
            android.support.v4.app.Fragment r8 = (android.support.p030v4.app.Fragment) r8
            r7.m80699a(r8, r0)
            return
        L_0x01e9:
            java.lang.String r0 = r0.mo70121a()
            com.ss.android.ugc.aweme.language.e r1 = r7.f91684c
            if (r1 != 0) goto L_0x01f4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01f4:
            java.lang.String r1 = r1.mo70127g()
            r2 = r7
            android.content.Context r2 = (android.content.Context) r2
            r8.mo70130a(r0, r1, r2)
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin()
            java.lang.String r1 = "ServiceManager.get().get…nagerService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = (com.p683ss.android.ugc.aweme.language.I18nManagerService) r0
            java.lang.String r0 = r0.getAppLanguage()
            r8.updateLanguage(r6, r0, r4)
            return
        L_0x0215:
            boolean r8 = r7.isFinishing()
            if (r8 != 0) goto L_0x021e
            r7.finish()
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.NewUserJourneyActivity.m80702a(java.lang.Boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m80699a(Fragment fragment, boolean z) {
        int i;
        C52711k.m112240b(fragment, "fragment");
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        if (z) {
            i = 0;
        } else {
            i = R.anim.es;
        }
        a.mo2173a(i, (int) R.anim.et);
        a.mo2191b(R.id.ajf, fragment);
        a.mo2195c();
    }
}
