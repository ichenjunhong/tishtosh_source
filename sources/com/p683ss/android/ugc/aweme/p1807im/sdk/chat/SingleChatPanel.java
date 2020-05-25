package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.p702im.core.internal.utils.C11501n;
import com.bytedance.p702im.core.internal.utils.C11501n.C11502a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11245w.C11247a;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImChatCallSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1816c.C33370a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1820e.C33448a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33460f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33460f.C33461a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33829cu;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33849j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmViewModel.C33854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.FriendChatDetailActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34879a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34883a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34884b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35269i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel */
public final class SingleChatPanel extends BaseChatPanel implements C11502a, C34883a {

    /* renamed from: u */
    static final /* synthetic */ C52767h[] f86462u = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SingleChatPanel.class), "mFollowBarHelper", "getMFollowBarHelper()Lcom/ss/android/ugc/aweme/im/sdk/chat/FollowBarHelper;"))};

    /* renamed from: x */
    public static final C33341a f86463x = new C33341a(null);

    /* renamed from: A */
    private IMUser f86464A;

    /* renamed from: B */
    private C34879a f86465B;

    /* renamed from: C */
    private boolean f86466C;

    /* renamed from: D */
    private long f86467D;

    /* renamed from: E */
    private C52847n<Boolean, String> f86468E;

    /* renamed from: F */
    private boolean f86469F;

    /* renamed from: G */
    private final C33342b f86470G = new C33342b(new WeakReference(this));

    /* renamed from: v */
    public C10660a f86471v;

    /* renamed from: w */
    public final C33354ac f86472w;

    /* renamed from: y */
    private final C11501n f86473y = new C11501n(this);

    /* renamed from: z */
    private final C52668f f86474z = C52732g.m112285a(new C33345d(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$a */
    public static final class C33341a {
        private C33341a() {
        }

        public /* synthetic */ C33341a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$b */
    public static final class C33342b implements Runnable {

        /* renamed from: a */
        private final WeakReference<SingleChatPanel> f86475a;

        public final void run() {
            SingleChatPanel singleChatPanel = (SingleChatPanel) this.f86475a.get();
            if (singleChatPanel != null) {
                singleChatPanel.mo70688a(1, true);
            }
        }

        public C33342b(WeakReference<SingleChatPanel> weakReference) {
            C52711k.m112240b(weakReference, "chatPanel");
            this.f86475a = weakReference;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$c */
    static final class C33343c<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f86476a;

        C33343c(SingleChatPanel singleChatPanel) {
            this.f86476a = singleChatPanel;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                this.f86476a.f86387f.setStartCallView(R.drawable.d9w);
                if (C35284t.m79782a().mo73379E()) {
                    this.f86476a.f86387f.postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C33343c f86477a;

                        {
                            this.f86477a = r1;
                        }

                        public final void run() {
                            C10660a a = new C10661a(this.f86477a.f86476a.f86385d).mo19015b((int) R.string.fsg).mo19017c(true).mo19013a(false).mo19010a(4000).mo19014a();
                            a.mo18996a();
                            int e = a.mo19005e();
                            int[] iArr = new int[2];
                            int a2 = C23728o.m58241a(17.0d);
                            this.f86477a.f86476a.f86387f.getStartCallView().getLocationOnScreen(iArr);
                            int i = iArr[0];
                            View startCallView = this.f86477a.f86476a.f86387f.getStartCallView();
                            C52711k.m112236a((Object) startCallView, "mTitleBar.startCallView");
                            int measuredWidth = (i - ((e - startCallView.getMeasuredWidth()) / 2)) - a2;
                            int i2 = iArr[1];
                            View startCallView2 = this.f86477a.f86476a.f86387f.getStartCallView();
                            C52711k.m112236a((Object) startCallView2, "mTitleBar.startCallView");
                            float f = (float) ((e / 2) + a2);
                            C10660a aVar = a;
                            aVar.mo18998a(this.f86477a.f86476a.f86387f, 80, measuredWidth, i2 + startCallView2.getMeasuredHeight(), f);
                            this.f86477a.f86476a.f86471v = a;
                        }
                    }, 100);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$d */
    static final class C33345d extends C52712l implements C52670a<C33465g> {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f86478a;

        C33345d(SingleChatPanel singleChatPanel) {
            this.f86478a = singleChatPanel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C33465g(this.f86478a.f86383b, this.f86478a.f86472w.getFromUser());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$e */
    static final class C33346e<T> implements C0199s<C11207p> {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f86479a;

        C33346e(SingleChatPanel singleChatPanel) {
            this.f86479a = singleChatPanel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C11207p pVar = (C11207p) obj;
            if (pVar != null) {
                C33689r a = this.f86479a.mo70646a();
                List arrayList = new ArrayList();
                arrayList.add(pVar);
                a.mo71711a(arrayList, 3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$f */
    public static final class C33347f implements C35356a {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f86480a;

        /* renamed from: c */
        public final void mo70671c() {
            C33460f.m76690a(this.f86480a.f86472w.getFromUser(), "top");
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f86480a.f86385d.finish();
            C35190af.m79514g(this.f86480a.f86472w.getConversationId(), "private");
        }

        /* renamed from: b */
        public final void mo70670b() {
            boolean z;
            IMUser fromUser = this.f86480a.f86472w.getFromUser();
            if (fromUser != null) {
                C35190af.m79498d(this.f86480a.f86472w.getConversationId(), this.f86480a.f86472w.getSingleChatFromUserId(), "private");
                Activity activity = this.f86480a.f86385d;
                if (this.f86480a.f86472w.getChatType() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                boolean isAuthorSupporterChat = this.f86480a.f86472w.isAuthorSupporterChat();
                C52711k.m112240b(activity, "context");
                C52711k.m112240b(fromUser, "user");
                Intent intent = new Intent(activity, FriendChatDetailActivity.class);
                intent.putExtra("simple_uesr", fromUser);
                intent.putExtra("is_stranger", z);
                intent.putExtra("is_author_supporter", isAuthorSupporterChat);
                activity.startActivityForResult(intent, 1);
                C34004b.m77717a().mo71950g();
                C33849j.m77600e().mo70738b();
            }
        }

        C33347f(SingleChatPanel singleChatPanel) {
            this.f86480a = singleChatPanel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$g */
    static final class C33348g<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f86481a;

        C33348g(SingleChatPanel singleChatPanel) {
            this.f86481a = singleChatPanel;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f86481a.mo70646a().mo71720k();
            return C52860x.f131107a;
        }
    }

    /* renamed from: f */
    private final C33465g m76496f() {
        return (C33465g) this.f86474z.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C33689r mo70653b() {
        return new C33448a(this.f86398q, this.f86397p);
    }

    public final void onDestroy() {
        super.onDestroy();
        C34879a aVar = this.f86465B;
        if (aVar != null) {
            aVar.mo72995a(true);
        }
        this.f86465B = null;
    }

    public final void onPause() {
        super.onPause();
        C34879a aVar = this.f86465B;
        if (aVar != null) {
            aVar.mo72995a(false);
        }
        this.f86472w.getFromUser();
        mo70688a(2, false);
    }

    public final void onStop() {
        super.onStop();
        this.f86469F = false;
        C10660a aVar = null;
        this.f86468E = null;
        C10660a aVar2 = this.f86471v;
        if (aVar2 != null) {
            if (aVar2.isShowing()) {
                aVar = aVar2;
            }
            if (aVar != null) {
                aVar.mo19006f();
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        DmViewModel a = C33854a.m77621a(this.f86384c);
        if (a != null) {
            C0198r a2 = a.mo71884a();
            if (a2 != null) {
                a2.observe(this.f86386e, new C33346e(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m76497g() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.ac r0 = r5.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r0.getFromUser()
            if (r0 == 0) goto L_0x00ab
            int r1 = r0.getFollowStatus()
            if (r1 != 0) goto L_0x00a1
            boolean r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79728a(r0)
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = r0.getUid()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0027
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r1 = 0
            goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = r0.getSecUid()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x003b
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r1 = 0
            goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            if (r1 != 0) goto L_0x00a1
        L_0x003e:
            java.lang.String r1 = r0.getUid()
            boolean r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.UserExtra.isDisableShowFollowBar(r1)
            if (r1 != 0) goto L_0x00a1
            com.ss.android.ugc.aweme.im.sdk.chat.ac r1 = r5.f86472w
            boolean r1 = r1.isAuthorSupporterChat()
            if (r1 != 0) goto L_0x00a1
            com.ss.android.ugc.aweme.im.sdk.chat.ac r1 = r5.f86472w
            int r1 = r1.getSelectMsgType()
            if (r1 == r3) goto L_0x00a1
            com.ss.android.ugc.aweme.im.sdk.chat.g r1 = r5.m76496f()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r4 = r5.f86472w
            int r4 = r4.getEnterFrom()
            if (r4 != r3) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r3 = 0
        L_0x0066:
            r1.f86739j = r3
            com.ss.android.ugc.aweme.im.sdk.chat.g r1 = r5.m76496f()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r3 = r5.f86472w
            java.lang.String r3 = r3.getShareUserId()
            r1.f86738i = r3
            com.ss.android.ugc.aweme.im.sdk.chat.g r1 = r5.m76496f()
            java.lang.String r3 = r0.getUid()
            java.lang.String r0 = r0.getSecUid()
            r1.mo70871a(r3, r0)
            com.ss.android.ugc.aweme.im.sdk.chat.g r0 = r5.m76496f()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r1 = r5.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r1.getFromUser()
            if (r1 != 0) goto L_0x0092
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0092:
            int r1 = r1.getFollowerStatus()
            r0.mo70870a(r1)
            com.ss.android.ugc.aweme.im.sdk.chat.g r0 = r5.m76496f()
            r0.mo70872b(r2)
            goto L_0x00ab
        L_0x00a1:
            com.ss.android.ugc.aweme.im.sdk.chat.g r0 = r5.m76496f()
            r1 = 8
            r0.mo70872b(r1)
            return
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.SingleChatPanel.m76497g():void");
    }

    public final void onResume() {
        boolean z;
        super.onResume();
        Long valueOf = Long.valueOf(this.f86467D);
        if (valueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            m76495a(Long.valueOf(valueOf.longValue()));
        }
        C34879a aVar = this.f86465B;
        if (aVar != null) {
            aVar.mo72997c();
        }
        m76497g();
        this.f86472w.getFromUser();
        new StringBuilder("chat fragment resume, ext: ").append(this.f86472w.getChatExt());
        mo70688a(1, true);
        C33358ae aeVar = C33358ae.f86506c;
        Context context = this.f86385d;
        IMUser fromUser = this.f86472w.getFromUser();
        if (fromUser != null) {
            str = fromUser.getUid();
        }
        C52711k.m112240b(context, "ctx");
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                C52711k.m112234a();
            }
            SystemContent a = C33358ae.m76518a(str);
            if (a != null) {
                C33829cu cuVar = new C33829cu(LayoutInflater.from(context).inflate(R.layout.bez, new FrameLayout(context), false), 91);
                C11207p pVar = new C11207p();
                pVar.setMsgType(1007);
                pVar.setSender(Long.parseLong(str));
                cuVar.mo71870a(pVar, a, 0);
            }
        }
    }

    /* renamed from: d */
    public final void mo70656d() {
        CharSequence charSequence;
        String str;
        String str2;
        Object obj;
        long j;
        super.mo70656d();
        Handler handler = this.f86473y;
        IMUser fromUser = this.f86472w.getFromUser();
        Boolean bool = null;
        if (fromUser != null) {
            charSequence = fromUser.getUid();
        } else {
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        IMUser fromUser2 = this.f86472w.getFromUser();
        if (fromUser2 != null) {
            str = fromUser2.getSecUid();
        } else {
            str = null;
        }
        C35286u.m79870a(handler, charSequence2, str, 1);
        if (this.f86472w.getChatType() == 1) {
            Handler handler2 = this.f86473y;
            IMUser fromUser3 = this.f86472w.getFromUser();
            if (fromUser3 != null) {
                String uid = fromUser3.getUid();
                if (uid != null) {
                    j = Long.parseLong(uid);
                    C35286u.m79869a(handler2, j, C34030j.f87981c.mo71977b(this.f86472w.getFromUser()), 0);
                }
            }
            j = 0;
            C35286u.m79869a(handler2, j, C34030j.f87981c.mo71977b(this.f86472w.getFromUser()), 0);
        }
        C34010e a = C34010e.m77748a();
        IMUser fromUser4 = this.f86472w.getFromUser();
        if (fromUser4 != null) {
            str2 = fromUser4.getUid();
        } else {
            str2 = null;
        }
        this.f86464A = a.mo71952a(str2);
        m76494a(this.f86464A);
        C33353ab abVar = this.f86472w;
        C23371a cVar = new C33343c(this);
        C52711k.m112240b(cVar, "callback");
        if (!ImChatCallSettings.getValue()) {
            C33460f.m76691a("checkShowChatCallEntrance: settings disabled");
            cVar.run(Boolean.valueOf(false));
        } else if (abVar == null || abVar.isGroupChat() || abVar.isAuthorSupporterChat()) {
            StringBuilder sb = new StringBuilder("checkShowChatCallEntrance session invalid: ");
            if (abVar != null) {
                obj = Boolean.valueOf(abVar.isGroupChat());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            if (abVar != null) {
                bool = Boolean.valueOf(abVar.isAuthorSupporterChat());
            }
            sb.append(bool);
            C33460f.m76691a(sb.toString());
            cVar.run(Boolean.valueOf(false));
        } else if (C35265e.m79729a(String.valueOf(C11190e.m22685a(abVar.getConversationId())))) {
            C33460f.m76691a("checkShowChatCallEntrance self conversation");
            cVar.run(Boolean.valueOf(false));
        } else {
            C34004b a2 = C34004b.m77717a();
            C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
            C35460j f = a2.mo71949f();
            if (f == null || f.getXrtcProxy() == null) {
                C33460f.m76691a("checkShowChatCallEntrance rtcProxy null");
                cVar.run(Boolean.valueOf(false));
                return;
            }
            new C33461a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo70648a(C33709u uVar) {
        C52711k.m112240b(uVar, "messageObserver");
        super.mo70648a(uVar);
        uVar.f87425c = this.f86470G;
    }

    /* renamed from: c_ */
    public final void mo70689c_(Throwable th) {
        StringBuilder sb = new StringBuilder("SingleChatPanel onUserActiveStatusFetchError: ");
        sb.append(th.getMessage());
        C32458a.m75144a(sb.toString());
    }

    /* renamed from: a */
    private final void m76494a(IMUser iMUser) {
        Object obj;
        String str;
        if (!C34886b.m78989c()) {
            C32458a.m75144a("SingleChatPanel fetchUserActiveStatus config disabled");
            m76495a((Long) null);
            return;
        }
        C34879a aVar = this.f86465B;
        boolean z = true;
        if (aVar != null) {
            aVar.mo72995a(true);
        }
        this.f86465B = null;
        if (iMUser != null && iMUser.getFollowStatus() == 2) {
            CharSequence secUid = iMUser.getSecUid();
            if (!(secUid == null || secUid.length() == 0)) {
                z = false;
            }
            if (!z && !C35265e.m79728a(iMUser)) {
                Set linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(iMUser);
                this.f86465B = C34886b.m78987a(C34884b.CHAT_PULL, linkedHashSet, this);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("SingleChatPanel fetchUserActiveStatus user invalid: ");
        if (iMUser != null) {
            obj = Integer.valueOf(iMUser.getFollowStatus());
        } else {
            obj = null;
        }
        sb.append(obj);
        sb.append(", ");
        if (iMUser != null) {
            str = iMUser.getSecUid();
        } else {
            str = null;
        }
        sb.append(str);
        C32458a.m75144a(sb.toString());
        m76495a((Long) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (((java.lang.Boolean) r0.getFirst()).booleanValue() != ((java.lang.Boolean) r7.getFirst()).booleanValue()) goto L_0x00a7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m76495a(java.lang.Long r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0009
            long r2 = r7.longValue()
            goto L_0x000a
        L_0x0009:
            r2 = r0
        L_0x000a:
            r6.f86467D = r2
            r2 = 0
            if (r7 == 0) goto L_0x00c5
            long r3 = r7.longValue()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0019
            goto L_0x00c5
        L_0x0019:
            long r0 = r7.longValue()
            d.n r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b.m78988a(r0)
            java.lang.Object r0 = r7.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x004a
            java.lang.Object r0 = r7.getSecond()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x003f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = 0
            goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r6.f86387f
            r0.setHint(r2)
            r6.f86468E = r7
            return
        L_0x004a:
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = r6.f86387f
            java.lang.Object r2 = r7.getSecond()
            java.lang.String r2 = (java.lang.String) r2
            r0.setHint(r2)
            boolean r0 = r6.f86466C
            if (r0 != 0) goto L_0x0086
            com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r2 = r6.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r2.getFromUser()
            if (r2 != 0) goto L_0x0068
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0068:
            java.lang.String r2 = r2.getUid()
            boolean r0 = r0.mo73409c(r2)
            if (r0 == 0) goto L_0x0086
            r6.f86466C = r1
            r0 = 700(0x2bc, double:3.46E-321)
            a.i r0 = p001a.C0013i.m12a(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$g r1 = new com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$g
            r1.<init>(r6)
            a.g r1 = (p001a.C0011g) r1
            java.util.concurrent.Executor r2 = p001a.C0013i.f25b
            r0.mo20a(r1, r2)
        L_0x0086:
            d.n<java.lang.Boolean, java.lang.String> r0 = r6.f86468E
            if (r0 == 0) goto L_0x00a7
            d.n<java.lang.Boolean, java.lang.String> r0 = r6.f86468E
            if (r0 != 0) goto L_0x0091
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0091:
            java.lang.Object r0 = r0.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r1 = r7.getFirst()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r0 == r1) goto L_0x00c2
        L_0x00a7:
            java.lang.String r0 = "online_status_chat_show"
            java.lang.Object r1 = r7.getFirst()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r2 = r7.getSecond()
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.aweme.im.sdk.chat.ac r3 = r6.f86472w
            java.lang.String r3 = r3.getSingleChatFromUserId()
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai.m79546a(r0, r1, r2, r3)
        L_0x00c2:
            r6.f86468E = r7
            return
        L_0x00c5:
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r7 = r6.f86387f
            r7.setHint(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.SingleChatPanel.m76495a(java.lang.Long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r4 != r0.getFollowStatus()) goto L_0x008b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20961a(android.os.Message r4) {
        /*
            r3 = this;
            java.lang.String r0 = "msg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.Object r0 = r4.obj
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            int r4 = r4.what
            switch(r4) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x00be
        L_0x0011:
            boolean r4 = r0 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a
            if (r4 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.base.api.a.b.a r0 = (com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a) r0
            int r4 = r0.getErrorCode()
            r0 = 2065(0x811, float:2.894E-42)
            if (r4 != r0) goto L_0x00be
            com.ss.android.ugc.aweme.im.sdk.d.e r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r0 = r3.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r0.getFromUser()
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r0.getUid()
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r4.mo71966c(r0)
            return
        L_0x0035:
            boolean r4 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.model.UserStruct
            if (r4 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.im.sdk.model.UserStruct r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.model.UserStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.getUser()
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = "IM Query User is null"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r4)
            return
        L_0x0047:
            com.ss.android.ugc.aweme.im.sdk.chat.ac r0 = r3.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser.fromUser(r4)
            r0.setFromUser(r4)
            com.ss.android.ugc.aweme.im.sdk.chat.ac r4 = r3.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.getFromUser()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r0 = r3.f86472w
            java.lang.String r0 = r0.getConversationId()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r1 = r3.f86472w
            int r1 = r1.getEnterFrom()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "SingleChatPanel"
            com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33682n.m77130a(r4, r0, r1, r2)
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r3.f86464A
            if (r4 == 0) goto L_0x008b
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r3.f86464A
            if (r4 != 0) goto L_0x0076
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0076:
            int r4 = r4.getFollowStatus()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r0 = r3.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r0.getFromUser()
            if (r0 != 0) goto L_0x0085
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0085:
            int r0 = r0.getFollowStatus()
            if (r4 == r0) goto L_0x0094
        L_0x008b:
            com.ss.android.ugc.aweme.im.sdk.chat.ac r4 = r3.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.getFromUser()
            r3.m76494a(r4)
        L_0x0094:
            com.ss.android.ugc.aweme.im.sdk.d.e r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            com.ss.android.ugc.aweme.im.sdk.chat.ac r0 = r3.f86472w
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r0.getFromUser()
            r4.mo71959a(r0)
            r3.m76497g()
            goto L_0x00be
        L_0x00a5:
            boolean r4 = r0 instanceof com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a
            if (r4 == 0) goto L_0x00b4
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r0 = 2132545596(0x7f1c103c, float:2.0744386E38)
            com.bytedance.common.utility.C9432q.m18672a(r4, r0)
            return
        L_0x00b4:
            boolean r4 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerMessageList
            if (r4 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.im.sdk.model.StrangerMessageList r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.model.StrangerMessageList) r0
            r3.mo70649a(r0)
        L_0x00bd:
            return
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.SingleChatPanel.mo20961a(android.os.Message):void");
    }

    /* renamed from: a */
    public final void mo70650a(ImTextTitleBar imTextTitleBar) {
        String str;
        C52711k.m112240b(imTextTitleBar, "titleBar");
        super.mo70650a(imTextTitleBar);
        IMUser fromUser = this.f86472w.getFromUser();
        String str2 = null;
        if (fromUser != null) {
            str = fromUser.getDisplayName();
        } else {
            str = null;
        }
        imTextTitleBar.setTitle(str);
        if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
            IMUser fromUser2 = this.f86472w.getFromUser();
            if (fromUser2 != null) {
                str2 = fromUser2.getDisplayId();
            }
            imTextTitleBar.setTitle(str2);
        }
        if (this.f86472w.getChatType() == 0) {
            C11180b a = C11182d.m22641a().mo20658a(this.f86472w.getConversationId());
            String a2 = C35269i.f90607a.mo73368a(a, false);
            if (!TextUtils.isEmpty(a2)) {
                imTextTitleBar.setHint(a2);
                if (!this.f86469F) {
                    this.f86469F = true;
                    C52711k.m112236a((Object) a, "conversation");
                    String conversationId = a.getConversationId();
                    C52711k.m112236a((Object) conversationId, "conversation.conversationId");
                    C35193ai.m79545a(conversationId, this.f86472w.getSingleChatFromUserId(), a2);
                }
            }
        }
        imTextTitleBar.setOnTitlebarClickListener(new C33347f(this));
    }

    /* renamed from: a */
    public final void mo70688a(int i, boolean z) {
        boolean z2;
        if (!C35279p.m79763a()) {
            IMUser fromUser = this.f86472w.getFromUser();
            if (fromUser != null) {
                CharSequence uid = fromUser.getUid();
                if (uid == null || uid.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (fromUser.getCommerceUserLevel() != 0 || fromUser.isWithCommerceEntry())) {
                    C11180b a = C11182d.m22641a().mo20658a(this.f86472w.getConversationId());
                    if (a != null && !a.isTemp()) {
                        C11247a a2 = new C11247a().mo20940a(i).mo20941a(a);
                        if (z && this.f86472w.getChatExt() != null) {
                            a2.mo20942a(this.f86472w.getChatExt());
                        }
                        a2.mo20943a();
                    }
                }
            }
        }
    }

    public SingleChatPanel(C0184k kVar, View view, C33354ac acVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(acVar, "currentSessionInfo");
        super(kVar, view, acVar);
        this.f86472w = acVar;
        new C33370a(this.f86386e, this.f86383b, this.f86388g, mo70646a());
    }
}
