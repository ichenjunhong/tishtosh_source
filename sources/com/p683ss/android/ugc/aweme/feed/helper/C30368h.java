package com.p683ss.android.ugc.aweme.feed.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10657o.C10658a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31012j;
import com.p683ss.android.ugc.aweme.feed.p1736ui.RatingBar;
import com.p683ss.android.ugc.aweme.feed.p1736ui.RatingBar.C30723a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.h */
public final class C30368h {

    /* renamed from: a */
    public static FeedSurveyConfig f79380a;

    /* renamed from: b */
    public static FeedSurvey f79381b;

    /* renamed from: c */
    public static FeedSurvey f79382c;

    /* renamed from: d */
    public static boolean f79383d;

    /* renamed from: e */
    public static int f79384e;

    /* renamed from: f */
    public static int f79385f = -1;

    /* renamed from: g */
    public static long f79386g;
    /* access modifiers changed from: 0000 */

    /* renamed from: h */
    public static String f79387h = "";

    /* renamed from: i */
    public static String f79388i = "";

    /* renamed from: j */
    public static String f79389j = "";

    /* renamed from: k */
    public static String f79390k = "";

    /* renamed from: l */
    public static int f79391l = -1;

    /* renamed from: m */
    public static boolean f79392m;

    /* renamed from: n */
    public static boolean f79393n;
    /* access modifiers changed from: 0000 */

    /* renamed from: o */
    public static boolean f79394o;

    /* renamed from: p */
    public static final C30368h f79395p = new C30368h();

    /* renamed from: q */
    private static int f79396q;

    /* renamed from: r */
    private static boolean f79397r;

    /* renamed from: s */
    private static long f79398s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static Option[] f79399t;

    /* renamed from: u */
    private static final Handler f79400u = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$a */
    public enum C30369a {
        SUBMIT(1),
        INTERVAL(2),
        CANCEL(3),
        DISLIKE(4),
        PRIORITY(5);
        

        /* renamed from: b */
        private final int f79402b;

        public final int getType() {
            return this.f79402b;
        }

        private C30369a(int i) {
            this.f79402b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$b */
    public enum C30370b {
        BINARY(0),
        FIVE_LEVEL(1),
        SINGLE_CHOICE(2),
        MULTIPLE_CHOICE(3);
        

        /* renamed from: b */
        private final int f79404b;

        public final int getType() {
            return this.f79404b;
        }

        private C30370b(int i) {
            this.f79404b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$c */
    static final class C30371c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f79405a;

        C30371c(boolean z) {
            this.f79405a = z;
        }

        public final void run() {
            if (C30368h.f79393n) {
                if (this.f79405a) {
                    C30368h hVar = C30368h.f79395p;
                    C30368h.f79386g = System.currentTimeMillis();
                    return;
                }
                C30368h.m71289a("background");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$d */
    static final class C30372d implements OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ C31012j f79406a;

        /* renamed from: b */
        final /* synthetic */ boolean f79407b;

        /* renamed from: c */
        final /* synthetic */ List f79408c;

        C30372d(C31012j jVar, boolean z, List list) {
            this.f79406a = jVar;
            this.f79407b = z;
            this.f79408c = list;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C30390n optionClickListener = this.f79406a.getOptionClickListener();
            if (optionClickListener != null) {
                optionClickListener.mo60804a(true);
            }
            if (this.f79407b) {
                Option option = (Option) this.f79408c.get(this.f79406a.getCheckedItemPosition());
                C30368h.f79399t = new Option[]{option};
                C30368h.f79387h = String.valueOf(option.getId());
                return;
            }
            SparseBooleanArray checkedItemPositions = this.f79406a.getCheckedItemPositions();
            C52711k.m112236a((Object) checkedItemPositions, "radioSurvey.checkedItemPositions");
            if (checkedItemPositions != null) {
                C30368h.f79387h = "";
                ArrayList arrayList = new ArrayList();
                int size = checkedItemPositions.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        if (checkedItemPositions.valueAt(i2)) {
                            Option option2 = (Option) this.f79408c.get(checkedItemPositions.keyAt(i2));
                            arrayList.add(option2);
                            C30368h.f79387h = C52711k.m112231a(C30368h.f79387h, (Object) String.valueOf(option2.getId()));
                        }
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                }
                C30368h hVar = C30368h.f79395p;
                Object[] array = arrayList.toArray(new Option[0]);
                if (array != null) {
                    C30368h.f79399t = (Option[]) array;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$e */
    public static final class C30373e implements C30723a {

        /* renamed from: a */
        final /* synthetic */ RatingBar f79409a;

        /* renamed from: b */
        final /* synthetic */ List f79410b;

        public C30373e(RatingBar ratingBar, List list) {
            this.f79409a = ratingBar;
            this.f79410b = list;
        }

        /* renamed from: a */
        public final void mo60797a(float f) {
            int i;
            C30390n optionClickListener = this.f79409a.getOptionClickListener();
            if (optionClickListener != null) {
                optionClickListener.mo60804a(true);
            }
            int i2 = (int) f;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = 0;
            }
            this.f79409a.setOption(((Option) this.f79410b.get(i)).getName());
            Option option = (Option) this.f79410b.get(i);
            C30368h.f79399t = new Option[]{option};
            C30368h.f79387h = String.valueOf(option.getId());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$f */
    static final class C30374f<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        public static final C30374f f79411a = new C30374f();

        C30374f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$g */
    static final class C30375g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C30375g f79412a = new C30375g();

        C30375g() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$h */
    static final class C30376h implements Runnable {

        /* renamed from: a */
        public static final C30376h f79413a = new C30376h();

        C30376h() {
        }

        public final void run() {
            if (C30368h.f79393n) {
                if (!C48121w.m104087I()) {
                    C48021h M = C48121w.m104249M();
                    C52711k.m112236a((Object) M, "PlayerManager.inst()");
                    if (M.mo95257o()) {
                        C48121w.m104249M().mo95293z();
                        C30368h.f79394o = true;
                        return;
                    }
                    C30368h.m71284a();
                    return;
                }
                C50130a a = C50130a.m108170a();
                C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
                if (a.mo97926b()) {
                    C50130a.m108170a().mo60215af();
                    C30368h.f79394o = true;
                    return;
                }
                C30368h.m71284a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$i */
    public static final class C30377i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f79414a;

        /* renamed from: b */
        final /* synthetic */ VerticalViewPager f79415b;

        /* renamed from: c */
        final /* synthetic */ int f79416c;

        /* renamed from: d */
        final /* synthetic */ int f79417d;

        /* renamed from: e */
        final /* synthetic */ int f79418e;

        public C30377i(List list, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f79414a = list;
            this.f79415b = verticalViewPager;
            this.f79416c = i;
            this.f79417d = i2;
            this.f79418e = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C30368h.f79399t = new Option[]{(Option) this.f79414a.get(0)};
            C30368h.f79387h = String.valueOf(((Option) this.f79414a.get(0)).getId());
            C30368h.f79395p.mo60792a(C30369a.SUBMIT, this.f79415b, this.f79416c, this.f79417d, this.f79418e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$j */
    public static final class C30378j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f79419a;

        /* renamed from: b */
        final /* synthetic */ VerticalViewPager f79420b;

        /* renamed from: c */
        final /* synthetic */ int f79421c;

        /* renamed from: d */
        final /* synthetic */ int f79422d;

        /* renamed from: e */
        final /* synthetic */ int f79423e;

        public C30378j(List list, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f79419a = list;
            this.f79420b = verticalViewPager;
            this.f79421c = i;
            this.f79422d = i2;
            this.f79423e = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C30368h.f79399t = new Option[]{(Option) this.f79419a.get(1)};
            C30368h.f79387h = String.valueOf(((Option) this.f79419a.get(1)).getId());
            C30368h.f79395p.mo60792a(C30369a.SUBMIT, this.f79420b, this.f79421c, this.f79422d, this.f79423e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$k */
    public static final class C30379k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VerticalViewPager f79424a;

        /* renamed from: b */
        final /* synthetic */ int f79425b;

        /* renamed from: c */
        final /* synthetic */ int f79426c;

        /* renamed from: d */
        final /* synthetic */ int f79427d;

        public C30379k(VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f79424a = verticalViewPager;
            this.f79425b = i;
            this.f79426c = i2;
            this.f79427d = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C30368h.f79395p.mo60792a(C30369a.CANCEL, this.f79424a, this.f79425b, this.f79426c, this.f79427d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$l */
    public static final class C30380l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VerticalViewPager f79428a;

        /* renamed from: b */
        final /* synthetic */ int f79429b;

        /* renamed from: c */
        final /* synthetic */ int f79430c;

        /* renamed from: d */
        final /* synthetic */ int f79431d;

        public C30380l(VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f79428a = verticalViewPager;
            this.f79429b = i;
            this.f79430c = i2;
            this.f79431d = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C30368h.f79395p.mo60792a(C30369a.SUBMIT, this.f79428a, this.f79429b, this.f79430c, this.f79431d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$m */
    public static final class C30381m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VerticalViewPager f79432a;

        /* renamed from: b */
        final /* synthetic */ int f79433b;

        /* renamed from: c */
        final /* synthetic */ int f79434c;

        /* renamed from: d */
        final /* synthetic */ int f79435d;

        public C30381m(VerticalViewPager verticalViewPager, int i, int i2, int i3) {
            this.f79432a = verticalViewPager;
            this.f79433b = i;
            this.f79434c = i2;
            this.f79435d = i3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C30368h.f79395p.mo60792a(C30369a.CANCEL, this.f79432a, this.f79433b, this.f79434c, this.f79435d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$n */
    public static final class C30382n implements C30390n {

        /* renamed from: a */
        final /* synthetic */ C10641a f79436a;

        public C30382n(C10641a aVar) {
            this.f79436a = aVar;
        }

        /* renamed from: a */
        public final void mo60804a(boolean z) {
            C10641a aVar = this.f79436a;
            if (aVar != null) {
                aVar.mo18880a(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$o */
    public static final class C30383o implements C10658a {
        /* renamed from: a */
        public final void mo18949a(boolean z) {
            if (z) {
                C30368h.m71284a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.h$p */
    public static final class C30384p implements OnDismissListener {

        /* renamed from: a */
        public static final C30384p f79437a = new C30384p();

        C30384p() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (C30368h.f79394o) {
                if (!C48121w.m104087I()) {
                    C48121w.m104249M().mo95291x();
                } else {
                    C50130a.m108170a().mo60214ae();
                }
                C30368h.f79394o = false;
            }
        }
    }

    private C30368h() {
    }

    /* renamed from: a */
    public final void mo60792a(C30369a aVar, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
        m71285a(aVar.getType());
        if (i > i2 && verticalViewPager.f71015h != null) {
            verticalViewPager.f71015h.mo55068a();
        }
        verticalViewPager.mo55005a(i, true, true, i3);
        String name = aVar.name();
        if (name != null) {
            String lowerCase = name.toLowerCase();
            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            m71289a(lowerCase);
            f79393n = false;
            f79399t = null;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public static void m71293b() {
        if (f79398s != 0) {
            Keva.getRepo("feed_survey").storeLong("key_next_time", System.currentTimeMillis() + (f79398s * 1000));
        }
    }

    /* renamed from: a */
    public static void m71284a() {
        if (!C48121w.m104087I()) {
            C48021h M = C48121w.m104249M();
            C52711k.m112236a((Object) M, "PlayerManager.inst()");
            if (M.mo95257o()) {
                C48121w.m104249M().mo95293z();
                f79394o = true;
                return;
            }
        } else {
            C50130a a = C50130a.m108170a();
            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            if (a.mo97926b()) {
                C50130a.m108170a().mo60215af();
                f79394o = true;
                return;
            }
        }
        f79400u.postDelayed(C30376h.f79413a, 1000);
    }

    /* JADX INFO: used method not loaded: d.m.y.b(java.lang.CharSequence, java.lang.CharSequence, boolean, int, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (p2628d.p2650m.C52830p.m112456b(r4, (java.lang.CharSequence) r3.toString(), false, 2, (java.lang.Object) null) == false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m71294c() {
        /*
            int r0 = f79396q
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 >= r3) goto L_0x009f
            int r0 = f79396q
            int r0 = r0 + r1
            f79396q = r0
            com.ss.android.ugc.aweme.feed.helper.FeedSurveyConfig r0 = com.p683ss.android.ugc.aweme.feed.helper.UserFeedbackSurveySettings.get()
            if (r0 == 0) goto L_0x009f
            f79380a = r0
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r3 = r0.getFixedSurvey()
            f79381b = r3
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r3 = r0.getFlexibleSurvey()
            f79382c = r3
            f79397r = r2
            f79383d = r2
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r3 = f79381b
            if (r3 != 0) goto L_0x002d
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r3 = f79382c
            if (r3 != 0) goto L_0x002d
            return r2
        L_0x002d:
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r3 = f79381b
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.feed.helper.Question[] r3 = r3.getQuestions()
            if (r3 == 0) goto L_0x0039
            int r3 = r3.length
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 <= 0) goto L_0x003e
            f79397r = r1
        L_0x003e:
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r3 = f79382c
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.feed.helper.Question[] r3 = r3.getQuestions()
            if (r3 == 0) goto L_0x004a
            int r3 = r3.length
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 <= 0) goto L_0x0099
            java.lang.String r3 = "feed_survey"
            com.bytedance.keva.Keva r3 = com.bytedance.keva.Keva.getRepo(r3)
            java.lang.String r4 = "key_submitted_flexible_survey"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x008b
            java.lang.String r5 = "submittedSurvey"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = ","
            r3.<init>(r5)
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r5 = f79382c
            r6 = 0
            if (r5 == 0) goto L_0x007a
            java.lang.String r5 = r5.getId()
            goto L_0x007b
        L_0x007a:
            r5 = r6
        L_0x007b:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = 2
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r4, r3, r2, r5, r6)
            if (r3 != 0) goto L_0x0099
        L_0x008b:
            int r3 = r0.getFeedTriggerThreshold()
            if (r3 <= 0) goto L_0x0099
            int r3 = r0.getFeedTriggerThreshold()
            f79385f = r3
            f79383d = r1
        L_0x0099:
            long r3 = r0.getShowIntervalTime()
            f79398s = r3
        L_0x009f:
            boolean r0 = f79397r
            if (r0 != 0) goto L_0x00a9
            boolean r0 = f79383d
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            return r2
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.helper.C30368h.m71294c():boolean");
    }

    /* renamed from: a */
    public static final void m71290a(boolean z) {
        f79400u.post(new C30371c(z));
        if (z && f79396q > 0) {
            f79396q = 0;
        }
    }

    /* renamed from: a */
    private static void m71285a(int i) {
        if (i != C30369a.SUBMIT.getType()) {
            f79399t = null;
        }
        FeedSurvey feedSurvey = new FeedSurvey(f79390k, "", "", "", new Question[]{new Question("", f79391l, "", f79399t)});
        Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(Api.f61282b).mo19925a().mo19930a(FeedSurveyApi.class);
        C52711k.m112236a(a, "ServiceManager.get().get…eedSurveyApi::class.java)");
        ((FeedSurveyApi) a).submitFeedSurvey(f79388i, f79384e, i, C47760cd.m103385a(feedSurvey)).mo6152a((C1710e<? super T>) C30374f.f79411a, (C1710e<? super Throwable>) C30375g.f79412a);
        if (f79384e == 2) {
            String string = Keva.getRepo("feed_survey").getString("key_submitted_flexible_survey", "");
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(',');
            sb.append(f79390k);
            Keva.getRepo("feed_survey").storeString("key_submitted_flexible_survey", sb.toString());
            return;
        }
        String string2 = Keva.getRepo("feed_survey").getString("key_submitted_fixed_aweme", "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        sb2.append(',');
        sb2.append(f79388i);
        Keva.getRepo("feed_survey").storeString("key_submitted_fixed_aweme", sb2.toString());
    }

    /* renamed from: a */
    public static void m71289a(String str) {
        String str2;
        String str3 = "exit_survey";
        C23089d a = C23089d.m56640a().mo47829a("group_id", f79388i).mo47829a("survey_id", f79390k).mo47829a("author_id", f79389j);
        String str4 = "type";
        String name = C30370b.values()[f79391l].name();
        if (name != null) {
            String lowerCase = name.toLowerCase();
            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            C23089d a2 = a.mo47829a(str4, lowerCase).mo47827a("stay_time", (System.currentTimeMillis() - f79386g) / 1000).mo47829a("exit_method", str);
            String str5 = "result";
            CharSequence charSequence = str;
            String name2 = C30369a.SUBMIT.name();
            if (name2 != null) {
                String lowerCase2 = name2.toLowerCase();
                C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (TextUtils.equals(charSequence, lowerCase2)) {
                    str2 = f79387h;
                } else {
                    str2 = "";
                }
                C26890h.m65011a(str3, a2.mo47829a(str5, str2).f61491a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static View m71283a(Context context, int i, List<Option> list) {
        boolean z;
        int i2;
        if (context == null) {
            return null;
        }
        C31012j jVar = new C31012j(context);
        int i3 = 1;
        if (i == C30370b.SINGLE_CHOICE.getType()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = 2;
        }
        jVar.setChoiceMode(i3);
        jVar.setVisibility(0);
        jVar.setDivider(null);
        jVar.setSelector(new ColorDrawable(0));
        ArrayList arrayList = new ArrayList(list.size());
        for (Option name : list) {
            arrayList.add(name.getName());
        }
        if (z) {
            i2 = R.layout.b5y;
        } else {
            i2 = R.layout.b5x;
        }
        jVar.setAdapter(new ArrayAdapter(context, i2, arrayList));
        jVar.setOnItemClickListener(new C30372d(jVar, z, list));
        jVar.setPadding(0, (int) C9432q.m18687b(context, 20.0f), 0, 0);
        return jVar;
    }

    /* renamed from: a */
    public static final boolean m71292a(String str, String str2, boolean z, int i) {
        C52711k.m112240b(str, "awemeId");
        C52711k.m112240b(str2, "authorId");
        if (f79397r && f79381b != null && z) {
            String string = Keva.getRepo("feed_survey").getString("key_submitted_fixed_aweme", "");
            CharSequence charSequence = string;
            if (!TextUtils.isEmpty(charSequence)) {
                C52711k.m112236a((Object) string, "submittedAweme");
                StringBuilder sb = new StringBuilder(",");
                sb.append(str);
                if (C52830p.m112456b(charSequence, (CharSequence) sb.toString(), false, 2, (Object) null)) {
                    return false;
                }
            }
            FeedSurvey feedSurvey = f79381b;
            if (feedSurvey == null) {
                C52711k.m112234a();
            }
            f79390k = feedSurvey.getId();
            FeedSurvey feedSurvey2 = f79381b;
            if (feedSurvey2 == null) {
                C52711k.m112234a();
            }
            Question[] questions = feedSurvey2.getQuestions();
            if (questions == null) {
                C52711k.m112234a();
            }
            f79391l = questions[0].getType();
            f79384e = 1;
        } else if (!f79383d || f79382c == null || i < f79385f) {
            return false;
        } else {
            FeedSurvey feedSurvey3 = f79382c;
            if (feedSurvey3 == null) {
                C52711k.m112234a();
            }
            f79390k = feedSurvey3.getId();
            FeedSurvey feedSurvey4 = f79382c;
            if (feedSurvey4 == null) {
                C52711k.m112234a();
            }
            Question[] questions2 = feedSurvey4.getQuestions();
            if (questions2 == null) {
                C52711k.m112234a();
            }
            f79391l = questions2[0].getType();
            f79384e = 2;
        }
        f79388i = str;
        f79389j = str2;
        if (f79392m) {
            m71285a(C30369a.DISLIKE.getType());
            m71293b();
            f79392m = false;
            return false;
        } else if (C32616c.f84865a.hasShownFriendslistPermissionPopUp()) {
            m71285a(C30369a.PRIORITY.getType());
            m71293b();
            return false;
        } else if (Keva.getRepo("feed_survey").getLong("key_next_time", 0) <= System.currentTimeMillis()) {
            return true;
        } else {
            m71285a(C30369a.INTERVAL.getType());
            return false;
        }
    }
}
