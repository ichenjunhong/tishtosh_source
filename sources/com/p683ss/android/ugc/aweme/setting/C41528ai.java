package com.p683ss.android.ugc.aweme.setting;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.play.core.p1048a.C17231a;
import com.google.android.play.core.p1048a.C17232b;
import com.google.android.play.core.p1048a.C17233c;
import com.google.android.play.core.p1049b.C17247b;
import com.google.android.play.core.p1049b.C17248c;
import com.google.android.play.core.p1056f.C17363b;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ai */
public final class C41528ai {

    /* renamed from: a */
    public static C17231a f105209a;

    /* renamed from: b */
    public static boolean f105210b;

    /* renamed from: c */
    public static C17232b f105211c;

    /* renamed from: d */
    public static C17248c f105212d;

    /* renamed from: e */
    public static boolean f105213e;

    /* renamed from: f */
    public static long f105214f;

    /* renamed from: g */
    public static final C41529a f105215g = new C41529a(null);

    /* renamed from: com.ss.android.ugc.aweme.setting.ai$a */
    public static final class C41529a {

        /* renamed from: com.ss.android.ugc.aweme.setting.ai$a$a */
        static final class C41530a<ResultT> implements C17363b<C17231a> {

            /* renamed from: a */
            final /* synthetic */ boolean f105216a;

            /* renamed from: b */
            final /* synthetic */ Activity f105217b;

            C41530a(boolean z, Activity activity) {
                this.f105216a = z;
                this.f105217b = activity;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo23058a(Object obj) {
                C17231a aVar = (C17231a) obj;
                if (!this.f105216a) {
                    C23859b.m58575b().mo49463a(C11010c.m22280a(), "KEY_LAST_CHECK_UPDATE_TIME", System.currentTimeMillis());
                }
                C52711k.m112236a((Object) aVar, "appUpdateInfo");
                C41528ai.f105209a = aVar;
                if (aVar == null) {
                    C52711k.m112237a("mAppUpdateInfo");
                }
                if (aVar.mo33494c() == 2) {
                    C17231a aVar2 = C41528ai.f105209a;
                    if (aVar2 == null) {
                        C52711k.m112237a("mAppUpdateInfo");
                    }
                    if (aVar2.mo33492a(0)) {
                        C41529a.m91360a("app_update_toast_show");
                        if (!this.f105216a) {
                            C23859b.m58575b().mo49462a(C11010c.m22280a(), "KEY_SHOW_UPDATE_TIMES", C23859b.m58575b().mo49467b(C11010c.m22280a(), "KEY_SHOW_UPDATE_TIMES", 0) + 1);
                        }
                        C23859b.m58575b().mo49466a(C11010c.m22280a(), "KEY_UPDATE_IN_PROGRESS", true);
                        C17232b bVar = C41528ai.f105211c;
                        if (bVar != null) {
                            C17231a aVar3 = C41528ai.f105209a;
                            if (aVar3 == null) {
                                C52711k.m112237a("mAppUpdateInfo");
                            }
                            bVar.mo33503a(aVar3, 0, this.f105217b, 19);
                        }
                    }
                } else {
                    C17231a aVar4 = C41528ai.f105209a;
                    if (aVar4 == null) {
                        C52711k.m112237a("mAppUpdateInfo");
                    }
                    if (aVar4.mo33494c() == 3) {
                        if (!this.f105216a) {
                            C23859b.m58575b().mo49462a(C11010c.m22280a(), "KEY_SHOW_UPDATE_TIMES", C23859b.m58575b().mo49467b(C11010c.m22280a(), "KEY_SHOW_UPDATE_TIMES", 0) + 1);
                        }
                        if (!C23859b.m58575b().mo49472b(C11010c.m22280a(), "KEY_DOWNLOADED_FOR_UPDATE", false)) {
                            if (this.f105216a) {
                                C10691a.m21548c((Context) this.f105217b, (int) R.string.ht).mo19066a();
                            }
                            C17232b bVar2 = C41528ai.f105211c;
                            if (bVar2 != null) {
                                C17231a aVar5 = C41528ai.f105209a;
                                if (aVar5 == null) {
                                    C52711k.m112237a("mAppUpdateInfo");
                                }
                                bVar2.mo33503a(aVar5, 0, this.f105217b, 19);
                            }
                        } else if (this.f105217b.isFinishing()) {
                            C47718bf.m103288a(new C41534aj());
                        } else {
                            Dialog a = C41529a.m91357a(this.f105217b);
                            if (!a.isShowing()) {
                                a.show();
                            }
                        }
                    } else {
                        if (this.f105216a) {
                            C10691a.m21548c((Context) this.f105217b, (int) R.string.bvx).mo19066a();
                        }
                        C17232b bVar3 = C41528ai.f105211c;
                        if (bVar3 != null) {
                            bVar3.mo33505b(C41528ai.f105212d);
                        }
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ai$a$b */
        static final class C41531b implements OnClickListener {

            /* renamed from: a */
            public static final C41531b f105218a = new C41531b();

            C41531b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C41529a.m91360a("app_update_install");
                C17232b bVar = C41528ai.f105211c;
                if (bVar != null) {
                    bVar.mo33504b();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ai$a$c */
        static final class C41532c implements OnClickListener {

            /* renamed from: a */
            public static final C41532c f105219a = new C41532c();

            C41532c() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C17232b bVar = C41528ai.f105211c;
                if (bVar != null) {
                    bVar.mo33505b(C41528ai.f105212d);
                }
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.ai$a$d */
        static final class C41533d implements C17248c {

            /* renamed from: a */
            final /* synthetic */ String f105220a;

            /* renamed from: b */
            final /* synthetic */ Activity f105221b;

            C41533d(String str, Activity activity) {
                this.f105220a = str;
                this.f105221b = activity;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo23054a(Object obj) {
                if (((C17247b) obj).mo33517a() == 11) {
                    C23859b.m58575b().mo49466a(C11010c.m22280a(), "KEY_DOWNLOADED_FOR_UPDATE", true);
                    C23859b.m58575b().mo49466a(C11010c.m22280a(), "KEY_UPDATE_IN_PROGRESS", false);
                    C41529a.m91360a("app_update_download_finish");
                    if (!TextUtils.isEmpty(this.f105220a)) {
                        Context context = this.f105221b;
                        C26890h.m65011a("app_update_download_finish", C23089d.m56640a().mo47829a("update_type", "prop_reminder").mo47829a("prop_id", this.f105220a).f61491a);
                    }
                    AwemeAppData a = AwemeAppData.m47851a();
                    C52711k.m112236a((Object) a, "AwemeAppData.inst()");
                    if (a.f61132j) {
                        C17232b bVar = C41528ai.f105211c;
                        if (bVar != null) {
                            bVar.mo33504b();
                        }
                    } else if (!C41528ai.f105213e) {
                        C41528ai.f105213e = true;
                        if (this.f105221b.isFinishing()) {
                            C47718bf.m103288a(new C41534aj());
                            return;
                        }
                        Dialog a2 = C41529a.m91357a(this.f105221b);
                        if (!a2.isShowing()) {
                            a2.show();
                        }
                    }
                }
            }
        }

        private C41529a() {
        }

        /* renamed from: a */
        private static boolean m91361a() {
            int i;
            int i2;
            int b = C23859b.m58575b().mo49467b(C11010c.m22280a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", 0);
            AwemeAppData a = AwemeAppData.m47851a();
            C52711k.m112236a((Object) a, "AwemeAppData.inst()");
            long j = 0;
            if (b != a.mo40805c()) {
                AwemeAppData a2 = AwemeAppData.m47851a();
                C52711k.m112236a((Object) a2, "AwemeAppData.inst()");
                C23859b.m58575b().mo49462a(C11010c.m22280a(), "KEY_CURRENT_VERSIONCODE_FOR_UPDATE", a2.mo40805c());
                C23859b.m58575b().mo49463a(C11010c.m22280a(), "KEY_LAST_CHECK_UPDATE_TIME", 0);
                C23859b.m58575b().mo49462a(C11010c.m22280a(), "KEY_SHOW_UPDATE_TIMES", 0);
                C23859b.m58575b().mo49466a(C11010c.m22280a(), "KEY_DOWNLOADED_FOR_UPDATE", false);
                C23859b.m58575b().mo49466a(C11010c.m22280a(), "KEY_UPDATE_IN_PROGRESS", false);
            }
            int b2 = C23859b.m58575b().mo49467b(C11010c.m22280a(), "KEY_SHOW_UPDATE_TIMES", 0);
            String str = "KEY_LAST_CHECK_UPDATE_TIME";
            SharedPreferences a3 = C23859b.m58575b().mo49458a(C11010c.m22280a());
            if (a3 != null) {
                j = a3.getLong(str, 0);
            }
            C41528ai.f105214f = j;
            try {
                IESSettingsProxy b3 = C32816h.m75716b();
                C52711k.m112236a((Object) b3, "SettingsReader.get()");
                FlexibleUpdateStrategy flexibleUpdateStrategy = b3.getFlexibleUpdateStrategy();
                C52711k.m112236a((Object) flexibleUpdateStrategy, "SettingsReader.get().flexibleUpdateStrategy");
                Integer allowShowAllTimes = flexibleUpdateStrategy.getAllowShowAllTimes();
                C52711k.m112236a((Object) allowShowAllTimes, "SettingsReader.get().fle…trategy.allowShowAllTimes");
                i2 = allowShowAllTimes.intValue();
                IESSettingsProxy b4 = C32816h.m75716b();
                C52711k.m112236a((Object) b4, "SettingsReader.get()");
                FlexibleUpdateStrategy flexibleUpdateStrategy2 = b4.getFlexibleUpdateStrategy();
                C52711k.m112236a((Object) flexibleUpdateStrategy2, "SettingsReader.get().flexibleUpdateStrategy");
                Integer intervalDays = flexibleUpdateStrategy2.getIntervalDays();
                C52711k.m112236a((Object) intervalDays, "SettingsReader.get().fle…dateStrategy.intervalDays");
                i = intervalDays.intValue();
            } catch (C10174a unused) {
                i2 = 0;
                i = 0;
            }
            if (b2 >= i2 || System.currentTimeMillis() - C41528ai.f105214f < ((long) i) * FbUploadTokenTime.group0) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C41529a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m91360a(String str) {
            C52711k.m112240b(str, "event");
            C26890h.m65011a(str, C23089d.m56640a().mo47829a("type", "flexible").f61491a);
        }

        /* renamed from: a */
        public static Dialog m91357a(Activity activity) {
            C52711k.m112240b(activity, "activity");
            C10643a aVar = new C10643a(activity);
            aVar.mo18885a((int) R.string.bsj).mo18902b(activity.getString(R.string.bsi)).mo18886a((int) R.string.bse, (OnClickListener) C41531b.f105218a).mo18900b((int) R.string.cio, (OnClickListener) C41532c.f105219a);
            Dialog c = aVar.mo18897a().mo18883c();
            c.setCanceledOnTouchOutside(false);
            C52711k.m112236a((Object) c, "dialog");
            return c;
        }

        /* renamed from: a */
        public static void m91358a(Activity activity, String str) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(str, "effectId");
            if (C41528ai.f105211c == null) {
                C41528ai.f105211c = C17233c.m42209a(activity.getApplicationContext());
            }
            C41528ai.f105212d = new C41533d(str, activity);
            C17232b bVar = C41528ai.f105211c;
            if (bVar != null) {
                bVar.mo33502a(C41528ai.f105212d);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            if (r1.intValue() != 1) goto L_0x0088;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo85312a(android.app.Activity r4, boolean r5, java.lang.String r6) {
            /*
                r3 = this;
                java.lang.String r0 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                java.lang.String r0 = "effectId"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                if (r0 >= r1) goto L_0x0011
                return
            L_0x0011:
                r0 = 1
                if (r5 != 0) goto L_0x0089
                boolean r1 = com.p683ss.android.ugc.aweme.setting.C41528ai.f105210b
                if (r1 != 0) goto L_0x0088
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()
                java.lang.String r2 = "SettingsReader.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.Integer r1 = r1.getInappUpdateSwitchStrategy()
                if (r1 != 0) goto L_0x0028
                goto L_0x002f
            L_0x0028:
                int r1 = r1.intValue()
                r2 = 3
                if (r1 == r2) goto L_0x0046
            L_0x002f:
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()
                java.lang.String r2 = "SettingsReader.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.Integer r1 = r1.getInappUpdateSwitchStrategy()
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                int r1 = r1.intValue()
                if (r1 == r0) goto L_0x0046
                goto L_0x0088
            L_0x0046:
                java.lang.Boolean r1 = com.p683ss.android.ugc.aweme.feed.C30578o.m71565a()
                java.lang.String r2 = "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x0081
                com.ss.android.ugc.aweme.bl.b r4 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()
                android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r6 = "KEY_LAST_CHECK_UPDATE_TIME"
                long r0 = java.lang.System.currentTimeMillis()
                r4.mo49463a(r5, r6, r0)
                com.ss.android.ugc.aweme.bl.b r4 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()
                android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r6 = "KEY_CURRENT_VERSIONCODE_FOR_UPDATE"
                com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.p683ss.android.ugc.aweme.app.AwemeAppData.m47851a()
                java.lang.String r1 = "AwemeAppData.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                int r0 = r0.mo40805c()
                r4.mo49462a(r5, r6, r0)
                return
            L_0x0081:
                boolean r1 = m91361a()
                if (r1 != 0) goto L_0x0089
                return
            L_0x0088:
                return
            L_0x0089:
                com.p683ss.android.ugc.aweme.setting.C41528ai.f105210b = r0
                m91358a(r4, r6)
                com.google.android.play.core.a.b r6 = com.p683ss.android.ugc.aweme.setting.C41528ai.f105211c
                if (r6 == 0) goto L_0x0097
                com.google.android.play.core.f.d r6 = r6.mo33501a()
                goto L_0x0098
            L_0x0097:
                r6 = 0
            L_0x0098:
                if (r6 == 0) goto L_0x00a5
                com.ss.android.ugc.aweme.setting.ai$a$a r0 = new com.ss.android.ugc.aweme.setting.ai$a$a
                r0.<init>(r5, r4)
                com.google.android.play.core.f.b r0 = (com.google.android.play.core.p1056f.C17363b) r0
                r6.mo33657a(r0)
                return
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.C41528ai.C41529a.mo85312a(android.app.Activity, boolean, java.lang.String):void");
        }
    }
}
