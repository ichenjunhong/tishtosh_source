package com.p683ss.android.ugc.aweme.p2377ug.p2378a;

import android.content.Context;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.a.c */
public final class C47415c {

    /* renamed from: a */
    public static boolean f119634a;

    /* renamed from: b */
    public static final C47415c f119635b = new C47415c();

    /* renamed from: com.ss.android.ugc.aweme.ug.a.c$a */
    public static final class C47416a<TTaskResult, TContinuationResult> implements C0011g<Void, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Context f119636a;

        public C47416a(Context context) {
            this.f119636a = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r9) {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.ug.a.c r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47415c.f119635b
                android.content.Context r9 = r8.f119636a
                r0 = 1
                r1 = 0
                if (r9 == 0) goto L_0x0016
                boolean r2 = r9 instanceof android.app.Activity
                if (r2 == 0) goto L_0x0014
                android.app.Activity r9 = (android.app.Activity) r9
                boolean r9 = r9.isFinishing()
                if (r9 != 0) goto L_0x0016
            L_0x0014:
                r9 = 1
                goto L_0x0017
            L_0x0016:
                r9 = 0
            L_0x0017:
                if (r9 != 0) goto L_0x0023
                com.ss.android.ugc.aweme.ug.a.b r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.f119629b
                java.lang.String r2 = "context 不可用"
                r9.mo94690b(r2)
            L_0x0020:
                r9 = 0
                goto L_0x00ba
            L_0x0023:
                boolean r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47415c.m102791a()
                if (r9 != 0) goto L_0x0031
                com.ss.android.ugc.aweme.ug.a.b r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.f119629b
                java.lang.String r2 = "开关未打开"
                r9.mo94690b(r2)
                goto L_0x0020
            L_0x0031:
                com.ss.android.ugc.aweme.IAccountUserService r9 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r2 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
                boolean r9 = r9.isLogin()
                if (r9 != 0) goto L_0x0048
                com.ss.android.ugc.aweme.ug.a.b r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.f119629b
                java.lang.String r2 = "未登录"
                r9.mo94690b(r2)
                goto L_0x0020
            L_0x0048:
                com.ss.android.ugc.aweme.ug.a.f r9 = new com.ss.android.ugc.aweme.ug.a.f
                r9.<init>()
                long r2 = java.lang.System.currentTimeMillis()
                long r4 = r9.f119646b
                long r2 = r2 - r4
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.DAYS
                r5 = 14
                long r4 = r4.toMillis(r5)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x0068
                com.ss.android.ugc.aweme.ug.a.b r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.f119629b
                java.lang.String r2 = "14天内曾出现过"
                r9.mo94690b(r2)
                goto L_0x0020
            L_0x0068:
                com.ss.android.ugc.aweme.ug.a.f r2 = new com.ss.android.ugc.aweme.ug.a.f
                r2.<init>()
                long r3 = r2.f119650f
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L_0x007c
                long r3 = java.lang.System.currentTimeMillis()
                r2.mo94702b(r3)
            L_0x007c:
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r2.f119650f
                long r3 = r3 - r5
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
                r5 = 7
                long r5 = r2.toMillis(r5)
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 < 0) goto L_0x0091
                r2 = 1
                goto L_0x0092
            L_0x0091:
                r2 = 0
            L_0x0092:
                if (r2 != 0) goto L_0x009c
                com.ss.android.ugc.aweme.ug.a.b r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.f119629b
                java.lang.String r2 = "安装时间小于7天"
                r9.mo94690b(r2)
                goto L_0x0020
            L_0x009c:
                long r2 = com.bytedance.ies.ugc.p694a.C11010c.m22287h()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r9 = r9.f119649e
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                boolean r9 = android.text.TextUtils.equals(r2, r9)
                if (r9 == 0) goto L_0x00b9
                com.ss.android.ugc.aweme.ug.a.b r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.f119629b
                java.lang.String r2 = "这个版本展示过"
                r9.mo94690b(r2)
                goto L_0x0020
            L_0x00b9:
                r9 = 1
            L_0x00ba:
                if (r9 != 0) goto L_0x00bd
                goto L_0x00d4
            L_0x00bd:
                com.ss.android.ugc.aweme.ug.a.f r9 = new com.ss.android.ugc.aweme.ug.a.f
                r9.<init>()
                boolean r2 = r9.f119647c
                if (r2 != 0) goto L_0x00cd
                boolean r9 = r9.f119648d
                if (r9 == 0) goto L_0x00cb
                goto L_0x00cd
            L_0x00cb:
                r1 = 1
                goto L_0x00d4
            L_0x00cd:
                com.ss.android.ugc.aweme.ug.a.b r9 = com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47411b.f119629b
                java.lang.String r0 = "曾点过点赞后弹窗反馈或提交按钮"
                r9.mo94690b(r0)
            L_0x00d4:
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2377ug.p2378a.C47415c.C47416a.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.a.c$b */
    public static final class C47417b<TTaskResult, TContinuationResult> implements C0011g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Context f119637a;

        public C47417b(Context context) {
            this.f119637a = context;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            Boolean bool = (Boolean) iVar.mo34e();
            C52711k.m112236a((Object) bool, "shouldShow");
            if (bool.booleanValue()) {
                Context context = this.f119637a;
                if (context == null) {
                    C52711k.m112234a();
                }
                new C47418d(context).mo94694a();
                I18nBridgeService.getBridgeService_Monster().recordGuideBundle(null);
            } else if (this.f119637a != null) {
                I18nBridgeService.getBridgeService_Monster().tryShowNotificationGuideDialog(this.f119637a);
            }
            return null;
        }
    }

    private C47415c() {
    }

    /* renamed from: a */
    static boolean m102791a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            AppStoreMessage appStoreScore = b.getAppStoreScore();
            C52711k.m112236a((Object) appStoreScore, "SettingsReader.get().appStoreScore");
            Integer switcher = appStoreScore.getSwitcher();
            if (switcher != null) {
                if (switcher.intValue() == 0) {
                    return false;
                }
            }
            return true;
        } catch (C10174a unused) {
            return false;
        }
    }
}
