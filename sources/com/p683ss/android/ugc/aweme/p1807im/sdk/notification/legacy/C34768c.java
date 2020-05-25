package com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11197f;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.c */
public final class C34768c {

    /* renamed from: g */
    public static final C34769a f89555g = new C34769a(null);

    /* renamed from: a */
    public boolean f89556a;

    /* renamed from: b */
    public ViewGroup f89557b;

    /* renamed from: c */
    public NotificationWidget f89558c;

    /* renamed from: d */
    C34767b f89559d;

    /* renamed from: e */
    public final CountDownTimer f89560e;

    /* renamed from: f */
    public final Activity f89561f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.c$a */
    public static final class C34769a {
        private C34769a() {
        }

        public /* synthetic */ C34769a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.c$b */
    public static final class C34770b implements C11162b<C11180b> {

        /* renamed from: a */
        final /* synthetic */ C34768c f89562a;

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
        }

        C34770b(C34768c cVar) {
            this.f89562a = cVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
            C11180b bVar = (C11180b) obj;
            C10691a.m21533a((Context) this.f89562a.f89561f, (int) R.string.a19).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.c$c */
    static final class C34771c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34768c f89563a;

        /* renamed from: b */
        final /* synthetic */ C52670a f89564b;

        C34771c(C34768c cVar, C52670a aVar) {
            this.f89563a = cVar;
            this.f89564b = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewGroup viewGroup = this.f89563a.f89557b;
            if (viewGroup != null) {
                viewGroup.removeView(this.f89563a.f89558c);
            }
            this.f89563a.f89556a = false;
            C52670a aVar = this.f89564b;
            if (aVar != null) {
                aVar.invoke();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.c$d */
    public static final class C34772d extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C34768c f89565a;

        public final void onTick(long j) {
        }

        public final void onFinish() {
            this.f89565a.dismiss(null);
            this.f89565a.mo72839b();
        }

        C34772d(C34768c cVar, long j, long j2) {
            this.f89565a = cVar;
            super(5000, 50);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.legacy.c$e */
    static final class C34773e extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34768c f89566a;

        C34773e(C34768c cVar) {
            this.f89566a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z = true;
            Map map = null;
            switch (((Number) obj).intValue()) {
                case 0:
                    this.f89566a.dismiss(new C52670a<C52860x>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C34773e f89567a;

                        {
                            this.f89567a = r1;
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
                            if (r3 == null) goto L_0x00c2;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final /* synthetic */ java.lang.Object invoke() {
                            /*
                                r10 = this;
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.c$e r0 = r10.f89567a
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r0 = r0.f89566a
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r1 = r0.f89559d
                                if (r1 == 0) goto L_0x0125
                                int r2 = r1.f89544a
                                r3 = 4
                                if (r2 != r3) goto L_0x0044
                                com.ss.android.ugc.aweme.im.sdk.d.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                                java.lang.String r2 = "AwemeImManager.instance()"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                                com.ss.android.ugc.aweme.im.service.j r1 = r1.mo71949f()
                                if (r1 == 0) goto L_0x001f
                                r1.getLiveProxy()
                            L_0x001f:
                                com.ss.android.ugc.aweme.im.sdk.d.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                                java.lang.String r2 = "AwemeImManager.instance()"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                                com.ss.android.ugc.aweme.im.service.j r1 = r1.mo71949f()
                                if (r1 == 0) goto L_0x0125
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.NotificationWidget r2 = r0.f89558c
                                r3 = 0
                                if (r2 == 0) goto L_0x0038
                                android.content.Context r2 = r2.getContext()
                                goto L_0x0039
                            L_0x0038:
                                r2 = r3
                            L_0x0039:
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r0 = r0.f89559d
                                if (r0 == 0) goto L_0x003f
                                java.lang.String r3 = r0.f89551h
                            L_0x003f:
                                r1.openLiveUrl(r2, r3)
                                goto L_0x0125
                            L_0x0044:
                                int r2 = r1.f89544a
                                r3 = 1
                                if (r2 != r3) goto L_0x0064
                                com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
                                java.lang.String r1 = "aweme://main"
                                com.ss.android.ugc.aweme.router.y r1 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r1)
                                java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
                                java.lang.String r3 = "NOTIFICATION"
                                com.ss.android.ugc.aweme.router.y r1 = r1.mo83870a(r2, r3)
                                java.lang.String r1 = r1.mo83871a()
                                r0.mo83861a(r1)
                                goto L_0x0125
                            L_0x0064:
                                boolean r2 = r1.f89554k
                                if (r2 == 0) goto L_0x008d
                                com.ss.android.ugc.aweme.im.sdk.abtest.f r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33246f.f86254a
                                int r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33246f.m76355a()
                                if (r2 != r3) goto L_0x0071
                                goto L_0x0072
                            L_0x0071:
                                r3 = 0
                            L_0x0072:
                                if (r3 == 0) goto L_0x008d
                                com.ss.android.ugc.aweme.router.w r2 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
                                java.lang.String r3 = "aweme://main"
                                com.ss.android.ugc.aweme.router.y r3 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r3)
                                java.lang.String r4 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
                                java.lang.String r5 = "NOTIFICATION"
                                com.ss.android.ugc.aweme.router.y r3 = r3.mo83870a(r4, r5)
                                java.lang.String r3 = r3.mo83871a()
                                r2.mo83861a(r3)
                            L_0x008d:
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.a r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a.f89518g
                                java.lang.String r3 = r1.f89546c
                                if (r3 == 0) goto L_0x00a0
                                java.util.Map<java.lang.String, java.lang.Integer> r4 = r2.f89522c
                                boolean r4 = r4.containsKey(r3)
                                if (r4 == 0) goto L_0x00a0
                                java.util.Map<java.lang.String, java.lang.Integer> r2 = r2.f89522c
                                r2.remove(r3)
                            L_0x00a0:
                                java.lang.Integer r2 = r1.f89545b
                                if (r2 == 0) goto L_0x0125
                                java.lang.Number r2 = (java.lang.Number) r2
                                int r2 = r2.intValue()
                                com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                                java.lang.String r4 = "AwemeImManager.instance()"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                                com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                                if (r3 == 0) goto L_0x00c2
                                java.lang.String r3 = r3.getInnerPushEnterFrom()
                                if (r3 != 0) goto L_0x00c0
                                goto L_0x00c2
                            L_0x00c0:
                                r8 = r3
                                goto L_0x00c5
                            L_0x00c2:
                                java.lang.String r3 = "others"
                                goto L_0x00c0
                            L_0x00c5:
                                int r3 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30115a
                                r4 = 11
                                if (r2 != r3) goto L_0x00fb
                                java.lang.String r2 = r1.f89546c
                                long r2 = com.bytedance.p702im.core.p706c.C11190e.m22685a(r2)
                                com.ss.android.ugc.aweme.im.sdk.d.e r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                                java.lang.String r2 = java.lang.String.valueOf(r2)
                                com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r5.mo71964b(r2)
                                if (r2 == 0) goto L_0x0125
                                android.app.Activity r0 = r0.f89561f
                                android.content.Context r0 = (android.content.Context) r0
                                com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76450a(r0, r2, r4)
                                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
                                java.lang.String r4 = r1.f89546c
                                java.lang.String r5 = r2.getUid()
                                java.lang.String r6 = "private"
                                java.lang.String r7 = "inner_push"
                                java.lang.String r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76444a()
                                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79468a(r4, r5, r6, r7, r8, r9)
                                goto L_0x0125
                            L_0x00fb:
                                int r3 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30116b
                                if (r2 != r3) goto L_0x0125
                                android.os.Bundle r2 = new android.os.Bundle
                                r2.<init>()
                                java.lang.String r3 = "key_enter_from"
                                r2.putInt(r3, r4)
                                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
                                java.lang.String r4 = r1.f89546c
                                java.lang.String r5 = ""
                                java.lang.String r6 = "group"
                                java.lang.String r7 = "inner_push"
                                java.lang.String r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76444a()
                                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79468a(r4, r5, r6, r7, r8, r9)
                                android.app.Activity r0 = r0.f89561f
                                android.content.Context r0 = (android.content.Context) r0
                                java.lang.String r1 = r1.f89546c
                                r3 = 3
                                com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76454a(r0, r1, r3, r2)
                            L_0x0125:
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.c$e r0 = r10.f89567a
                                com.ss.android.ugc.aweme.im.sdk.notification.legacy.c r0 = r0.f89566a
                                java.lang.String r1 = "click"
                                r0.mo72837a(r1)
                                d.x r0 = p2628d.C52860x.f131107a
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34768c.C34773e.C347741.invoke():java.lang.Object");
                        }
                    });
                    break;
                case 1:
                    C34768c cVar = this.f89566a;
                    C34767b bVar = cVar.f89559d;
                    if (bVar != null) {
                        C11180b a = C11182d.m22641a().mo20658a(bVar.f89546c);
                        if (a != null) {
                            C11197f settingInfo = a.getSettingInfo();
                            if (settingInfo != null) {
                                Map ext = settingInfo.getExt();
                                if (ext != null) {
                                    map = C52550ab.m112058c(ext);
                                }
                            }
                            if (map != null && !map.isEmpty()) {
                                z = false;
                            }
                            if (z) {
                                map = new LinkedHashMap();
                            }
                            map.put("a:s_awe_push_close", "1");
                            C11197f settingInfo2 = a.getSettingInfo();
                            if (settingInfo2 != null) {
                                settingInfo2.setExt(map);
                            }
                            new C11190e(bVar.f89546c).mo20692a(map, (C11162b) new C34770b(cVar));
                        }
                    }
                    this.f89566a.mo72840b("click");
                    break;
                case 3:
                    this.f89566a.dismiss(null);
                    this.f89566a.mo72837a("slide_up");
                    this.f89566a.mo72839b();
                    break;
                case 4:
                    this.f89566a.f89560e.cancel();
                    this.f89566a.f89560e.start();
                    this.f89566a.mo72837a("slide_down");
                    this.f89566a.mo72840b("show");
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final boolean mo72838a() {
        Integer num;
        C34767b bVar = this.f89559d;
        if (bVar != null) {
            int i = bVar.f89544a;
            if (NotificationWidget.f89483e != null) {
                num = Integer.valueOf(4);
            } else {
                num = null;
            }
            if (i == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo72839b() {
        C34767b bVar = this.f89559d;
        if (bVar != null && bVar.f89544a == 4) {
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            C35460j f = a.mo71949f();
            if (f != null) {
                f.getLiveProxy();
            }
        }
    }

    public C34768c(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f89561f = activity;
        C34772d dVar = new C34772d(this, 5000, 50);
        this.f89560e = dVar;
    }

    /* renamed from: b */
    public final void mo72840b(String str) {
        String str2;
        C34767b bVar = this.f89559d;
        if (bVar != null) {
            if (bVar.f89544a == 2) {
                str2 = "auto";
            } else {
                str2 = "slide_down";
            }
            Integer num = bVar.f89545b;
            int i = C11170a.f30115a;
            if (num != null && num.intValue() == i) {
                C35190af.m79520h("private", str, str2);
            } else {
                Integer num2 = bVar.f89545b;
                int i2 = C11170a.f30116b;
                if (num2 != null && num2.intValue() == i2) {
                    C35190af.m79520h("group", str, str2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72837a(java.lang.String r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.notification.legacy.b r0 = r4.f89559d
            if (r0 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.im.sdk.d.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r2 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.im.service.j r1 = r1.mo71949f()
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = r1.getInnerPushEnterFrom()
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r1 = "others"
        L_0x001b:
            int r2 = r0.f89544a
            r3 = 1
            if (r2 != r3) goto L_0x0026
            java.lang.String r0 = "aggregate"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79515g(r0, r5, r1)
            goto L_0x0056
        L_0x0026:
            boolean r2 = r0.f89554k
            if (r2 == 0) goto L_0x0030
            java.lang.String r0 = "launch_aggregate"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79515g(r0, r5, r1)
            goto L_0x0056
        L_0x0030:
            java.lang.Integer r2 = r0.f89545b
            int r3 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30115a
            if (r2 != 0) goto L_0x0037
            goto L_0x0043
        L_0x0037:
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x0043
            java.lang.String r0 = "private"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79515g(r0, r5, r1)
            goto L_0x0056
        L_0x0043:
            java.lang.Integer r0 = r0.f89545b
            int r2 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30116b
            if (r0 != 0) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0055
            java.lang.String r0 = "group"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79515g(r0, r5, r1)
        L_0x0055:
            return
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34768c.mo72837a(java.lang.String):void");
    }

    public final void dismiss(C52670a<C52860x> aVar) {
        NotificationWidget notificationWidget = this.f89558c;
        if (notificationWidget != null && this.f89556a) {
            C52670a cVar = new C34771c(this, aVar);
            float f = (-((float) notificationWidget.getMeasuredHeight())) - ((float) notificationWidget.f89489d);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(notificationWidget.f89486a, "translationY", new float[]{0.0f, f});
            C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m…              0f, height)");
            ofFloat.setDuration(300);
            ofFloat.addUpdateListener(new C34752b(f, cVar));
            ofFloat.start();
        }
        this.f89560e.cancel();
    }

    /* renamed from: a */
    public final void mo72836a(C34767b bVar) {
        ViewGroup viewGroup;
        String str;
        if (bVar != null) {
            this.f89559d = bVar;
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            C35460j f = a.mo71949f();
            if (f != null) {
                viewGroup = f.getCurrentDecorView(this.f89561f);
            } else {
                viewGroup = null;
            }
            this.f89557b = viewGroup;
            this.f89560e.cancel();
            this.f89560e.start();
            if (this.f89556a) {
                NotificationWidget notificationWidget = this.f89558c;
                if (notificationWidget != null) {
                    notificationWidget.mo72811a(this.f89559d);
                }
            } else {
                this.f89556a = true;
                NotificationWidget notificationWidget2 = new NotificationWidget(this.f89561f, null, 0, 6, null);
                notificationWidget2.mo72811a(this.f89559d);
                notificationWidget2.mo72810a();
                notificationWidget2.setActionListener(new C34773e(this));
                this.f89558c = notificationWidget2;
                LayoutParams layoutParams = new LayoutParams(-1, -2);
                layoutParams.gravity = 48;
                layoutParams.topMargin = C9432q.m18695e(this.f89561f);
                ViewGroup viewGroup2 = this.f89557b;
                if (viewGroup2 != null) {
                    viewGroup2.addView(this.f89558c, layoutParams);
                }
            }
            mo72837a("show");
            if (bVar.f89544a == 3) {
                Integer num = bVar.f89545b;
                int i = C11170a.f30115a;
                if (num != null && num.intValue() == i) {
                    str = "private";
                } else {
                    str = "group";
                }
                C35190af.m79532n(str);
            } else {
                if (bVar.f89544a == 2) {
                    mo72840b("show");
                }
            }
        }
    }
}
