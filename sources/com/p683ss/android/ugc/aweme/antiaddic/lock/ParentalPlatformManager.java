package com.p683ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.router.SmartRouter;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.C22709a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22716a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.profile.p2090ui.DmtStatusViewDialog;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41687b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C53199ae;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager */
public final class ParentalPlatformManager implements C41683a {

    /* renamed from: a */
    public static final List<C22692c> f60888a = new ArrayList();

    /* renamed from: b */
    public static volatile boolean f60889b;

    /* renamed from: c */
    public static final ParentalPlatformManager f60890c;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$a */
    public static final class C22693a implements C22692c {

        /* renamed from: a */
        final /* synthetic */ C52727e f60891a;

        /* renamed from: b */
        final /* synthetic */ Activity f60892b;

        /* renamed from: a */
        public final void mo47081a(Exception exc) {
            C52711k.m112240b(exc, "e");
            ((DmtStatusViewDialog) this.f60891a.element).dismiss();
            C22971a.m56493a((Context) this.f60892b, (Throwable) exc);
        }

        C22693a(C52727e eVar, Activity activity) {
            this.f60891a = eVar;
            this.f60892b = activity;
        }

        /* renamed from: a */
        public final void mo47080a(C41686c cVar, boolean z) {
            C52711k.m112240b(cVar, "settings");
            ((DmtStatusViewDialog) this.f60891a.element).dismiss();
            if (z) {
                if (C22714d.f60914a.mo47119b() == C22687a.UNLINK_LOCKED) {
                    SmartRouter.buildRoute((Context) this.f60892b, "//teenage/setting").open();
                }
            } else if (C22714d.f60914a.mo47119b() == C22687a.CHILD) {
                C41302w.m91042a().mo83861a(C22714d.m55952e());
            } else {
                SmartRouter.buildRoute((Context) this.f60892b, "//teenage/setting").open();
            }
        }
    }

    @C52618f(mo110254b = "ParentalPlatformManager.kt", mo110255c = {195}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$getDynamicPassword$1")
    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$b */
    public static final class C22694b extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f60893a;

        /* renamed from: b */
        int f60894b;

        /* renamed from: c */
        final /* synthetic */ C17832m f60895c;

        /* renamed from: d */
        final /* synthetic */ Context f60896d;

        /* renamed from: e */
        private C53199ae f60897e;

        public C22694b(C17832m mVar, Context context, C52625c cVar) {
            this.f60895c = mVar;
            this.f60896d = context;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C22694b bVar = new C22694b(this.f60895c, this.f60896d, cVar);
            bVar.f60897e = (C53199ae) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C22694b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C52601b.m112157a();
            switch (this.f60894b) {
                case 0:
                    C53199ae aeVar = this.f60897e;
                    try {
                        C17832m mVar = this.f60895c;
                        this.f60893a = aeVar;
                        this.f60894b = 1;
                        obj = C22709a.m55931a(mVar, this);
                        if (obj == a) {
                            return a;
                        }
                    } catch (Exception e) {
                        C22971a.m56493a(this.f60896d, (Throwable) e);
                        break;
                    }
                case 1:
                    String str = ((C22716a) obj).f60918a;
                    Context context = this.f60896d;
                    C52711k.m112236a((Object) str, "password");
                    new C11105a(context).mo20139a((CharSequence) String.valueOf(context.getString(R.string.aug))).mo20146b((CharSequence) String.valueOf(str)).mo20136a((int) R.string.ah2, (OnClickListener) C22699e.f60902a).mo20148b();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$c */
    static final class C22695c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C22695c f60898a = new C22695c();

        C22695c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m55922a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public static void m55922a() {
            new Handler(Looper.myLooper()).post(C226961.f60899a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$d */
    static final class C22697d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C22697d f60900a = new C22697d();

        C22697d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m55923a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public static void m55923a() {
            new Handler(Looper.myLooper()).post(C226981.f60901a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$e */
    static final class C22699e implements OnClickListener {

        /* renamed from: a */
        public static final C22699e f60902a = new C22699e();

        C22699e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private ParentalPlatformManager() {
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    static {
        ParentalPlatformManager parentalPlatformManager = new ParentalPlatformManager();
        f60890c = parentalPlatformManager;
        C47718bf.m103290c(parentalPlatformManager);
    }

    /* renamed from: a */
    public static void m55915a(C22692c cVar) {
        if (cVar != null && !f60888a.contains(cVar)) {
            f60888a.add(cVar);
        }
        if (!f60889b) {
            f60889b = true;
            C41687b.f105513b.mo85532a(null, false);
        }
    }

    /* renamed from: a */
    public static final void m55914a(Activity activity) {
        if (activity != null) {
            Context context = activity;
            if (!C22715e.m55958a(context)) {
                C10691a.m21545b(context, activity.getString(R.string.azb)).mo19066a();
                return;
            }
            C52727e eVar = new C52727e();
            eVar.element = new DmtStatusViewDialog(activity);
            ((DmtStatusViewDialog) eVar.element).show();
            m55915a((C22692c) new C22693a(eVar, activity));
        }
    }

    /* renamed from: a */
    public static boolean m55916a(String str) {
        C52711k.m112240b(str, "result");
        return C52830p.m112455b((CharSequence) str, (CharSequence) "/falcon/rn/guardian_child", true);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onParentalModeChanged(C29906l lVar) {
        C52711k.m112240b(lVar, "event");
        if (TextUtils.equals("guardian_platform_open", lVar.f78045b.getString("eventName")) || TextUtils.equals("guardian_platform_close", lVar.f78045b.getString("eventName"))) {
            m55915a((C22692c) null);
            return;
        }
        if (TextUtils.equals("guardian_platform_child_unlink", lVar.f78045b.getString("eventName"))) {
            Activity g = C11016e.m22312g();
            if (g != null) {
                m55914a(g);
                g.finish();
            }
        }
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
        for (C22692c a : f60888a) {
            a.mo47081a(exc);
        }
        f60888a.clear();
        f60889b = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ee A[LOOP:0: B:61:0x00e8->B:63:0x00ee, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47082a(com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "settings"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "setting"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.ss.android.ugc.aweme.setting.serverpush.a.c r0 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55950a()
            com.ss.android.ugc.aweme.antiaddic.lock.d r1 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.f60914a
            r1.mo47118a(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r1 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0025
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r1 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.PARENT
            if (r1 != r2) goto L_0x004d
        L_0x0025:
            com.ss.android.ugc.aweme.app.v r1 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.app.bf<java.lang.Boolean> r2 = r1.f61625g
            if (r2 != 0) goto L_0x003f
            com.ss.android.ugc.aweme.app.bf r2 = new com.ss.android.ugc.aweme.app.bf
            java.lang.String r5 = "had_open_parent_care"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r5, r6)
            r1.f61625g = r2
        L_0x003f:
            com.ss.android.ugc.aweme.app.bf<java.lang.Boolean> r1 = r1.f61625g
            java.lang.String r2 = "CommonSharePrefCache.inst().hadOpenParentCare"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r1.mo47776a(r2)
        L_0x004d:
            boolean r1 = com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.sLastContentFilterState
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r5 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            if (r2 != r5) goto L_0x0059
            r2 = 1
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r2 == 0) goto L_0x005e
            r2 = r8
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.removeUserSettingWithoutNotify()
        L_0x0064:
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r0)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r5 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            if (r2 != r5) goto L_0x008b
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r5 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            if (r2 == r5) goto L_0x008b
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r1 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.UNLINK_LOCKED
            if (r1 != r2) goto L_0x007f
        L_0x007c:
            r0 = 1
            goto L_0x00e0
        L_0x007f:
            if (r0 == 0) goto L_0x0084
            int r0 = r0.f105479V
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            if (r0 == 0) goto L_0x00df
            com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22695c.m55922a()
            goto L_0x007c
        L_0x008b:
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r0)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r5 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            if (r2 == r5) goto L_0x00af
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r5 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            if (r2 != r5) goto L_0x00af
            int r0 = r8.f105479V
            if (r0 == 0) goto L_0x00a5
            if (r1 != 0) goto L_0x00a5
            com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22697d.m55923a()
            goto L_0x007c
        L_0x00a5:
            int r0 = r8.f105479V
            if (r0 != 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22695c.m55922a()
            goto L_0x00df
        L_0x00af:
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r1 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r0)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            if (r1 != r2) goto L_0x00df
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r1 = com.p683ss.android.ugc.aweme.antiaddic.lock.C22714d.m55951b(r8)
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CHILD
            if (r1 != r2) goto L_0x00df
            if (r0 == 0) goto L_0x00c4
            int r1 = r0.f105479V
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r1 == 0) goto L_0x00cf
            int r1 = r8.f105479V
            if (r1 != 0) goto L_0x00cf
            com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22695c.m55922a()
            goto L_0x007c
        L_0x00cf:
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.f105479V
            goto L_0x00d5
        L_0x00d4:
            r0 = 0
        L_0x00d5:
            if (r0 != 0) goto L_0x00df
            int r0 = r8.f105479V
            if (r0 == 0) goto L_0x00df
            com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22697d.m55923a()
            goto L_0x007c
        L_0x00df:
            r0 = 0
        L_0x00e0:
            java.util.List<com.ss.android.ugc.aweme.antiaddic.c> r1 = f60888a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00e8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.antiaddic.c r2 = (com.p683ss.android.ugc.aweme.antiaddic.C22692c) r2
            r2.mo47080a(r8, r0)
            goto L_0x00e8
        L_0x00f8:
            java.util.List<com.ss.android.ugc.aweme.antiaddic.c> r8 = f60888a
            r8.clear()
            f60889b = r3
            com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting r8 = new com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting
            r8.<init>()
            r8.setNotifyParentModeOnly(r4)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.mo47082a(com.ss.android.ugc.aweme.setting.serverpush.a.c):void");
    }
}
