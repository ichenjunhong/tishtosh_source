package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25594d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.widget.C31243b;
import com.p683ss.android.ugc.aweme.feed.widget.C31251j;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48162f;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget */
public final class AdFakeUserProfileVideoDescWidget extends AbsAdProfileWidget {

    /* renamed from: j */
    static final /* synthetic */ C52767h[] f70601j = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileVideoDescWidget.class), "mVideoDesc", "getMVideoDesc()Lcom/ss/android/ugc/aweme/views/MentionTextView;"))};

    /* renamed from: k */
    public static final C26792a f70602k = new C26792a(null);

    /* renamed from: l */
    private final C52668f f70603l = C52732g.m112285a(new C26796d(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$a */
    public static final class C26792a {
        private C26792a() {
        }

        public /* synthetic */ C26792a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$b */
    static final class C26793b implements C48162f {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoDescWidget f70604a;

        /* renamed from: b */
        final /* synthetic */ String f70605b;

        C26793b(AdFakeUserProfileVideoDescWidget adFakeUserProfileVideoDescWidget, String str) {
            this.f70604a = adFakeUserProfileVideoDescWidget;
            this.f70605b = str;
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v3 */
        /* JADX WARNING: type inference failed for: r2v7, types: [com.ss.android.ugc.aweme.feed.model.VideoReplyStruct] */
        /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v10 */
        /* JADX WARNING: type inference failed for: r2v11 */
        /* JADX WARNING: type inference failed for: r2v12 */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
            if (r3 == null) goto L_0x00b9;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.VideoReplyStruct, java.lang.String]
          uses: [java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char]]
          mth insns count: 408
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x040c  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0411  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x041c  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x0421  */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51166a(android.view.View r10, com.p683ss.android.ugc.aweme.model.TextExtraStruct r11) {
            /*
                r9 = this;
                java.lang.String r10 = "struct"
                p2628d.p2639f.p2641b.C52711k.m112240b(r11, r10)
                boolean r10 = r11.isClickable()
                if (r10 == 0) goto L_0x0470
                com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget r10 = r9.f70604a
                if (r11 == 0) goto L_0x0470
                int r0 = r11.getType()
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x013e
                com.p683ss.android.ugc.aweme.commercialize.utils.C26403au.m63863a(r11)
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                java.lang.String r3 = "UUID.randomUUID().toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
                android.content.Context r3 = r10.f62235b
                java.lang.String r4 = "//challenge/detail"
                com.bytedance.router.SmartRoute r3 = com.bytedance.router.SmartRouter.buildRoute(r3, r4)
                java.lang.String r4 = "aweme_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r10.f70586a
                if (r5 == 0) goto L_0x003a
                java.lang.String r5 = r5.getAid()
                goto L_0x003b
            L_0x003a:
                r5 = r2
            L_0x003b:
                com.bytedance.router.SmartRoute r3 = r3.withParam(r4, r5)
                java.lang.String r4 = "id"
                java.lang.String r5 = r11.getHashTagName()
                com.bytedance.router.SmartRoute r3 = r3.withParam(r4, r5)
                java.lang.String r4 = "extra_challenge_is_hashtag"
                com.bytedance.router.SmartRoute r1 = r3.withParam(r4, r1)
                java.lang.String r3 = "process_id"
                com.bytedance.router.SmartRoute r1 = r1.withParam(r3, r0)
                java.lang.String r3 = "extra_challenge_from"
                java.lang.String r4 = r10.f70588i
                com.bytedance.router.SmartRoute r1 = r1.withParam(r3, r4)
                r3 = 10086(0x2766, float:1.4133E-41)
                r1.open(r3)
                com.ss.android.ugc.aweme.common.MobClick r1 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
                java.lang.String r3 = "challenge_click"
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r3)
                java.lang.String r3 = r10.f70588i
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r3)
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x007b
                java.lang.String r3 = r3.getAid()
                goto L_0x007c
            L_0x007b:
                r3 = r2
            L_0x007c:
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r3)
                java.lang.String r3 = r11.getCid()
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setExtValueString(r3)
                com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r1)
                android.content.Context r1 = r10.f62235b
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63380q(r1, r3)
                com.ss.android.ugc.aweme.aq.t r1 = new com.ss.android.ugc.aweme.aq.t
                r1.<init>()
                java.lang.String r3 = r10.f70588i
                if (r3 != 0) goto L_0x009d
                java.lang.String r3 = ""
            L_0x009d:
                com.ss.android.ugc.aweme.aq.t r1 = r1.mo48150f(r3)
                android.content.Context r3 = r10.f62235b
                com.ss.android.ugc.aweme.aq.a r1 = r1.mo47940a(r3)
                com.ss.android.ugc.aweme.aq.t r1 = (com.p683ss.android.ugc.aweme.p1382aq.C23250t) r1
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x00b9
                com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
                if (r3 == 0) goto L_0x00b9
                java.lang.String r3 = r3.getUid()
                if (r3 != 0) goto L_0x00bb
            L_0x00b9:
                java.lang.String r3 = ""
            L_0x00bb:
                com.ss.android.ugc.aweme.aq.t r1 = r1.mo48153s(r3)
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x00c8
                java.lang.String r3 = r3.getAid()
                goto L_0x00c9
            L_0x00c8:
                r3 = r2
            L_0x00c9:
                com.ss.android.ugc.aweme.aq.t r1 = r1.mo48151g(r3)
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                com.ss.android.ugc.aweme.aq.t r1 = r1.mo47954f(r3)
                com.ss.android.ugc.aweme.aq.t r0 = r1.mo48155u(r0)
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r10.f62238e
                java.lang.String r3 = "playlist_type"
                java.lang.String r4 = ""
                java.lang.Object r1 = r1.mo48230b(r3, r4)
                java.lang.String r1 = (java.lang.String) r1
                com.ss.android.ugc.aweme.aq.t r0 = r0.mo48146c(r1)
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r10.f62238e
                java.lang.String r3 = "playlist_id"
                java.lang.String r4 = ""
                java.lang.Object r1 = r1.mo48230b(r3, r4)
                java.lang.String r1 = (java.lang.String) r1
                com.ss.android.ugc.aweme.aq.t r0 = r0.mo48149e(r1)
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r10.f62238e
                java.lang.String r3 = "playlist_id_key"
                java.lang.String r4 = ""
                java.lang.Object r1 = r1.mo48230b(r3, r4)
                java.lang.String r1 = (java.lang.String) r1
                com.ss.android.ugc.aweme.aq.t r0 = r0.mo48147d(r1)
                com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r10.f62238e
                java.lang.String r3 = "tab_name"
                java.lang.String r4 = ""
                java.lang.Object r1 = r1.mo48230b(r3, r4)
                java.lang.String r1 = (java.lang.String) r1
                com.ss.android.ugc.aweme.aq.k r0 = r0.mo48100j(r1)
                com.ss.android.ugc.aweme.aq.t r0 = (com.p683ss.android.ugc.aweme.p1382aq.C23250t) r0
                java.lang.String r11 = r11.getCid()
                com.ss.android.ugc.aweme.aq.t r11 = r0.mo48154t(r11)
                java.lang.String r0 = "click_in_video_name"
                com.ss.android.ugc.aweme.aq.a r11 = r11.mo47941a(r0)
                com.ss.android.ugc.aweme.aq.t r11 = (com.p683ss.android.ugc.aweme.p1382aq.C23250t) r11
                com.ss.android.ugc.aweme.feed.model.Aweme r10 = r10.f70586a
                if (r10 == 0) goto L_0x0131
                java.lang.String r2 = r10.getRequestId()
            L_0x0131:
                com.ss.android.ugc.aweme.aq.t r10 = r11.mo48156v(r2)
                r10.mo48076e()
                com.ss.android.ugc.aweme.feed.ad r10 = com.p683ss.android.ugc.aweme.feed.C29988ad.CHALLENGE
                com.p683ss.android.ugc.aweme.feed.C30578o.m71566a(r10)
                return
            L_0x013e:
                int r0 = r11.getType()
                if (r0 != 0) goto L_0x0377
                java.lang.String r0 = r11.getAwemeId()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r3 = 2
                if (r0 == 0) goto L_0x0157
                int r0 = r11.getSubtype()
                if (r3 != r0) goto L_0x0377
            L_0x0157:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f70586a
                if (r0 == 0) goto L_0x0160
                java.lang.String r0 = r0.getDesc()
                goto L_0x0161
            L_0x0160:
                r0 = r2
            L_0x0161:
                boolean r0 = com.p683ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget.m64770a(r11, r0)
                if (r0 == 0) goto L_0x0377
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f70586a
                if (r0 == 0) goto L_0x0377
                java.lang.String r0 = r0.getDesc()
                if (r0 == 0) goto L_0x0377
                int r4 = r11.getStart()
                char r0 = r0.charAt(r4)
                r4 = 64
                if (r0 != r4) goto L_0x0377
                java.lang.String r0 = ""
                java.lang.String r4 = ""
                java.lang.String r5 = ""
                int r6 = r11.getSubtype()
                if (r3 != r6) goto L_0x020a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x01bd
                com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r3 = r3.getVideoReplyStruct()
                if (r3 == 0) goto L_0x01bd
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f70586a
                if (r0 != 0) goto L_0x019a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x019a:
                com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r0 = r0.getVideoReplyStruct()
                if (r0 != 0) goto L_0x01a3
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01a3:
                java.lang.String r3 = r0.getAwemeId()
                if (r3 != 0) goto L_0x01ab
                java.lang.String r3 = ""
            L_0x01ab:
                java.lang.String r4 = r0.getCommentId()
                if (r4 != 0) goto L_0x01b3
                java.lang.String r4 = ""
            L_0x01b3:
                java.lang.String r0 = r0.getAliasCommentId()
                if (r0 != 0) goto L_0x01bb
                java.lang.String r0 = ""
            L_0x01bb:
                r5 = r0
                r0 = r3
            L_0x01bd:
                java.lang.String r3 = "click_comment_chain"
                com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r7 = "enter_from"
                java.lang.String r8 = r10.f70588i
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "group_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 != 0) goto L_0x01d4
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01d4:
                java.lang.String r8 = r8.getAid()
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "author_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 != 0) goto L_0x01e5
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01e5:
                java.lang.String r8 = r8.getAuthorUid()
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "to_group_id"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r0)
                java.lang.String r7 = "reply_comment_id"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r4)
                java.lang.String r7 = "reply_user_id"
                java.lang.String r8 = r11.getUserId()
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r6)
                goto L_0x02f8
            L_0x020a:
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x025d
                int r3 = r3.getAwemeType()
                r6 = 51
                if (r3 != r6) goto L_0x025d
                java.lang.String r3 = "click_duet_icon"
                com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r7 = "enter_from"
                java.lang.String r8 = r10.f70588i
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "group_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 == 0) goto L_0x022f
                java.lang.String r8 = r8.getAid()
                goto L_0x0230
            L_0x022f:
                r8 = r2
            L_0x0230:
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "author_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 == 0) goto L_0x023f
                java.lang.String r8 = r8.getAuthorUid()
                goto L_0x0240
            L_0x023f:
                r8 = r2
            L_0x0240:
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "to_group_id"
                java.lang.String r8 = r11.getAwemeId()
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "chain_type"
                java.lang.String r8 = "duet"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r6)
                goto L_0x02f8
            L_0x025d:
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x02a7
                int r3 = r3.getAwemeType()
                r6 = 52
                if (r3 != r6) goto L_0x02a7
                java.lang.String r3 = "click_react_icon"
                com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r7 = "enter_from"
                java.lang.String r8 = r10.f70588i
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "group_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 == 0) goto L_0x0282
                java.lang.String r8 = r8.getAid()
                goto L_0x0283
            L_0x0282:
                r8 = r2
            L_0x0283:
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "author_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 == 0) goto L_0x0292
                java.lang.String r8 = r8.getAuthorUid()
                goto L_0x0293
            L_0x0292:
                r8 = r2
            L_0x0293:
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "to_group_id"
                java.lang.String r8 = r11.getAwemeId()
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r6)
                goto L_0x02f8
            L_0x02a7:
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x02f8
                int r3 = r3.getAwemeType()
                r6 = 58
                if (r3 != r6) goto L_0x02f8
                java.lang.String r3 = "click_duet_icon"
                com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r7 = "chain_type"
                java.lang.String r8 = "stitch"
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "enter_from"
                java.lang.String r8 = r10.f70588i
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "group_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 == 0) goto L_0x02d4
                java.lang.String r8 = r8.getAid()
                goto L_0x02d5
            L_0x02d4:
                r8 = r2
            L_0x02d5:
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "author_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.f70586a
                if (r8 == 0) goto L_0x02e4
                java.lang.String r8 = r8.getAuthorUid()
                goto L_0x02e5
            L_0x02e4:
                r8 = r2
            L_0x02e5:
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.lang.String r7 = "to_group_id"
                java.lang.String r8 = r11.getAwemeId()
                com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r6)
            L_0x02f8:
                android.content.Context r3 = r10.f62235b
                boolean r3 = com.p683ss.android.ugc.aweme.commercialize.widget.C26815a.m64830a(r3)
                if (r3 != 0) goto L_0x030d
                android.content.Context r10 = r10.f62235b
                r11 = 2132546921(0x7f1c1569, float:2.0747074E38)
                com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r10, r11)
                r10.mo19066a()
                return
            L_0x030d:
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x0315
                com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r2 = r3.getVideoReplyStruct()
            L_0x0315:
                if (r2 == 0) goto L_0x0353
                android.content.Context r11 = r10.f62235b
                java.lang.String r1 = "aweme://aweme/detail/"
                com.bytedance.router.SmartRoute r11 = com.bytedance.router.SmartRouter.buildRoute(r11, r1)
                java.lang.String r1 = "id"
                com.bytedance.router.SmartRoute r11 = r11.withParam(r1, r0)
                java.lang.String r0 = "refer"
                java.lang.String r1 = "click_comment_chain"
                com.bytedance.router.SmartRoute r11 = r11.withParam(r0, r1)
                java.lang.String r0 = "cid"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r2 = 44
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                com.bytedance.router.SmartRoute r11 = r11.withParam(r0, r1)
                java.lang.String r0 = "video_from"
                java.lang.String r10 = r10.f70588i
                com.bytedance.router.SmartRoute r10 = r11.withParam(r0, r10)
                r10.open()
                return
            L_0x0353:
                android.content.Context r0 = r10.f62235b
                java.lang.String r2 = "//aweme/detail"
                com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r2)
                java.lang.String r2 = "id"
                java.lang.String r11 = r11.getAwemeId()
                com.bytedance.router.SmartRoute r11 = r0.withParam(r2, r11)
                java.lang.String r0 = "refer"
                java.lang.String r10 = r10.f70588i
                com.bytedance.router.SmartRoute r10 = r11.withParam(r0, r10)
                java.lang.String r11 = "isChain"
                com.bytedance.router.SmartRoute r10 = r10.withParam(r11, r1)
                r10.open()
                return
            L_0x0377:
                android.content.Context r0 = r10.f62235b
                java.lang.String r1 = "name"
                java.lang.String r3 = "video_at"
                com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f70586a
                if (r4 == 0) goto L_0x0386
                java.lang.String r4 = r4.getAid()
                goto L_0x0387
            L_0x0386:
                r4 = r2
            L_0x0387:
                java.lang.String r5 = r11.getUserId()
                com.p683ss.android.ugc.aweme.common.C26890h.m65007a(r0, r1, r3, r4, r5)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "group_id"
                java.lang.String r3 = ""
                r0.put(r1, r3)     // Catch:{ Exception -> 0x03b7 }
                java.lang.String r1 = "request_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a     // Catch:{ Exception -> 0x03b7 }
                if (r3 == 0) goto L_0x03a5
                java.lang.String r3 = r3.getRequestId()     // Catch:{ Exception -> 0x03b7 }
                goto L_0x03a6
            L_0x03a5:
                r3 = r2
            L_0x03a6:
                r0.put(r1, r3)     // Catch:{ Exception -> 0x03b7 }
                java.lang.String r1 = "enter_from"
                java.lang.String r3 = r10.f70588i     // Catch:{ Exception -> 0x03b7 }
                r0.put(r1, r3)     // Catch:{ Exception -> 0x03b7 }
                java.lang.String r1 = "enter_method"
                java.lang.String r3 = "click_head"
                r0.put(r1, r3)     // Catch:{ Exception -> 0x03b7 }
            L_0x03b7:
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f70586a
                if (r1 == 0) goto L_0x03c0
                com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
                goto L_0x03c1
            L_0x03c0:
                r1 = r2
            L_0x03c1:
                if (r1 == 0) goto L_0x0433
                com.ss.android.ugc.aweme.common.MobClick r1 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
                java.lang.String r3 = "enter_detail"
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r3)
                java.lang.String r3 = "personal_homepage"
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r3)
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r10.f70586a
                if (r3 == 0) goto L_0x03e2
                com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
                if (r3 == 0) goto L_0x03e2
                java.lang.String r3 = r3.getUid()
                goto L_0x03e3
            L_0x03e2:
                r3 = r2
            L_0x03e3:
                com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r3)
                com.ss.android.ugc.aweme.common.MobClick r0 = r1.setJsonObject(r0)
                com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
                java.lang.String r0 = "enter_personal_detail"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "enter_from"
                java.lang.String r4 = r10.f70588i
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.lang.String r3 = "to_user_id"
                java.lang.String r4 = r11.getUserId()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.lang.String r3 = "group_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f70586a
                if (r4 == 0) goto L_0x0411
                java.lang.String r4 = r4.getAid()
                goto L_0x0412
            L_0x0411:
                r4 = r2
            L_0x0412:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.lang.String r3 = "author_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.f70586a
                if (r4 == 0) goto L_0x0421
                java.lang.String r4 = r4.getAuthorUid()
                goto L_0x0422
            L_0x0421:
                r4 = r2
            L_0x0422:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.lang.String r3 = "enter_method"
                java.lang.String r4 = "video_at"
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            L_0x0433:
                android.content.Context r0 = r10.f62235b
                java.lang.String r1 = "aweme://user/profile/"
                com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r1)
                java.lang.String r1 = "uid"
                java.lang.String r3 = r11.getUserId()
                com.bytedance.router.SmartRoute r0 = r0.withParam(r1, r3)
                java.lang.String r1 = "sec_user_id"
                java.lang.String r11 = r11.getSecUid()
                com.bytedance.router.SmartRoute r11 = r0.withParam(r1, r11)
                java.lang.String r0 = "profile_from"
                java.lang.String r1 = "video_at"
                com.bytedance.router.SmartRoute r11 = r11.withParam(r0, r1)
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = r10.f70588i
                com.bytedance.router.SmartRoute r11 = r11.withParam(r0, r1)
                java.lang.String r0 = "video_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r10 = r10.f70586a
                if (r10 == 0) goto L_0x0469
                java.lang.String r2 = r10.getAid()
            L_0x0469:
                com.bytedance.router.SmartRoute r10 = r11.withParam(r0, r2)
                r10.open()
            L_0x0470:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget.C26793b.mo51166a(android.view.View, com.ss.android.ugc.aweme.model.TextExtraStruct):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$c */
    static final class C26794c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoDescWidget f70606a;

        C26794c(AdFakeUserProfileVideoDescWidget adFakeUserProfileVideoDescWidget) {
            this.f70606a = adFakeUserProfileVideoDescWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f70606a.mo54699d()) {
                C26540w.m64253a(this.f70606a.f62235b, this.f70606a.f70586a, null, 37, C267951.f70607a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget$d */
    static final class C26796d extends C52712l implements C52670a<MentionTextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoDescWidget f70608a;

        C26796d(AdFakeUserProfileVideoDescWidget adFakeUserProfileVideoDescWidget) {
            this.f70608a = adFakeUserProfileVideoDescWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (MentionTextView) this.f70608a.mo54695a((int) R.id.f6o);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54699d() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f70586a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isAdFake()
            if (r0 != r2) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f70586a
            if (r3 == 0) goto L_0x0021
            boolean r3 = r3.isAd()
            if (r3 != r2) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 != 0) goto L_0x0028
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0038
            android.content.Context r0 = r4.f62235b
            r1 = 2132541683(0x7f1c00f3, float:2.073645E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r1)
            r0.mo19066a()
            return r2
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget.mo54699d():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54696a(C26818c cVar) {
        String str;
        int i;
        C52711k.m112240b(cVar, "params");
        super.mo54696a(cVar);
        Aweme aweme = this.f70586a;
        List<TextExtraStruct> list = null;
        if (aweme != null) {
            str = aweme.getDesc();
        } else {
            str = null;
        }
        if (str != null) {
            MentionTextView mentionTextView = (MentionTextView) this.f70603l.getValue();
            if (mentionTextView != null) {
                CharSequence charSequence = str;
                mentionTextView.setText(charSequence);
                Aweme aweme2 = this.f70586a;
                if (aweme2 != null) {
                    list = aweme2.getTextExtra();
                }
                if (list != null) {
                    for (TextExtraStruct textExtraStruct : list) {
                        if (textExtraStruct != null) {
                            if (textExtraStruct.getStart() < 0) {
                                textExtraStruct.setStart(0);
                            }
                            if (textExtraStruct.getEnd() > str.length()) {
                                textExtraStruct.setEnd(str.length());
                            }
                        }
                    }
                    if (this.f62235b != null) {
                        Aweme aweme3 = this.f70586a;
                        boolean z = true;
                        if (aweme3 == null || !aweme3.isAd()) {
                            i = NormalGiftView.MASK_TRANSLATE_VALUE;
                        } else {
                            i = 200;
                        }
                        mentionTextView.setMaxSize(i);
                        mentionTextView.setSpanSize((float) C23728o.m58246c(15.0d));
                        mentionTextView.setSpanColor(mentionTextView.getCurrentTextColor());
                        mentionTextView.setSpanStyle(1);
                        mentionTextView.setOnSpanClickListener(new C26793b(this, str));
                        mentionTextView.mo95551a(list, (C48160d) new C45549f(true));
                        if (charSequence.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    TextExtraStruct textExtraStruct2 = (TextExtraStruct) it.next();
                                    C52711k.m112236a((Object) textExtraStruct2, "textExtraStruct");
                                    if (m64770a(textExtraStruct2, str) && textExtraStruct2.getType() == 0) {
                                        if (!TextUtils.isEmpty(textExtraStruct2.getAwemeId()) || 2 == textExtraStruct2.getSubtype()) {
                                            Aweme aweme4 = this.f70586a;
                                            if (aweme4 == null) {
                                                C52711k.m112234a();
                                            }
                                            if (aweme4.getDesc().charAt(textExtraStruct2.getStart()) == '@') {
                                                Context context = this.f62235b;
                                                C52711k.m112236a((Object) context, "mContext");
                                                float a = (float) C9432q.m18670a(this.f62235b);
                                                float b = C9432q.m18687b(this.f62235b, 100.0f);
                                                Context context2 = this.f62235b;
                                                C52711k.m112236a((Object) context2, "mContext");
                                                float dimension = a - (b + context2.getResources().getDimension(R.dimen.vv));
                                                Context context3 = this.f62235b;
                                                C52711k.m112236a((Object) context3, "mContext");
                                                C25594d dVar = new C25594d(context, dimension, context3.getResources().getColor(R.color.j2), -1, textExtraStruct2);
                                                dVar.f67759b = C9432q.m18687b(this.f62235b, 12.0f);
                                                dVar.f67760c = C9432q.m18687b(this.f62235b, 2.0f);
                                                dVar.f67758a = C9432q.m18687b(this.f62235b, 13.0f);
                                                mentionTextView.mo95550a(textExtraStruct2.getStart(), textExtraStruct2.getEnd(), dVar);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            if (C47918gj.m103682a(this.f62235b)) {
                                mentionTextView.setMovementMethod(C31251j.m72964a());
                            } else {
                                mentionTextView.setMovementMethod(C31243b.m72951a());
                            }
                        } catch (IndexOutOfBoundsException e) {
                            C32458a.m75143a((Exception) e);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            View view = this.f62237d;
            if (view != null) {
                view.setOnClickListener(new C26794c(this));
            }
        }
    }

    /* renamed from: a */
    static boolean m64770a(TextExtraStruct textExtraStruct, String str) {
        if (str == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > str.length() || textExtraStruct.getStart() >= str.length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }
}
