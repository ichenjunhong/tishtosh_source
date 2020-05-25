package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38106s;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.view.CustomLinearLayoutManager;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41052b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.a.e */
public final class C38119e extends C38114b implements OnClickListener {

    /* renamed from: c */
    private Activity f97012c;

    /* renamed from: d */
    private AvatarImageWithVerify f97013d;

    /* renamed from: e */
    private SmartRoundImageView f97014e;

    /* renamed from: f */
    private RecyclerView f97015f;

    /* renamed from: g */
    private C38129l f97016g;

    /* renamed from: h */
    private TextView f97017h;

    /* renamed from: i */
    private TextView f97018i;

    /* renamed from: j */
    private TextView f97019j;

    /* renamed from: k */
    private TextView f97020k;

    /* renamed from: l */
    private ConstraintLayout f97021l;

    /* renamed from: m */
    private CommentNotice f97022m;

    /* renamed from: n */
    private C38106s f97023n;

    /* renamed from: o */
    private View f97024o;

    /* renamed from: p */
    private BaseNotice f97025p;

    /* renamed from: q */
    private String f97026q;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo78083a() {
        return true;
    }

    /* renamed from: a */
    public final void mo78082a(boolean z) {
        super.mo78082a(z);
        if (z) {
            this.f97024o.setVisibility(8);
            C41052b.m90722a(this.f97021l);
            return;
        }
        this.f97024o.setVisibility(0);
        C41052b.m90723a(this.f97021l, R.drawable.cm0, R.color.ana);
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v3, types: [int] */
    /* JADX WARNING: type inference failed for: r14v4, types: [int] */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], int, ?[boolean, int, float, short, byte, char]]
      uses: [boolean, int]
      mth insns count: 213
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r8 = r16
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r17)
            boolean r0 = r16.mo78092b()
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            super.onClick(r17)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r8.f97022m
            r9 = 2132021343(0x7f14105f, float:1.9681075E38)
            r10 = 2132021340(0x7f14105c, float:1.9681069E38)
            r11 = 2132021339(0x7f14105b, float:1.9681067E38)
            r12 = 2132021338(0x7f14105a, float:1.9681065E38)
            r1 = 8
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0135
            java.lang.String r2 = "click"
            java.lang.String r3 = "comment"
            int r4 = r16.getAdapterPosition()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r5 = r8.f97025p
            android.view.View r0 = r8.f97024o
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x0037
            r6 = 1
            goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r8.f97022m
            java.lang.String r7 = m85180a(r0)
            java.lang.String r15 = r8.f97026q
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r15
            r0.mo78087a(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r17.getId()
            if (r0 == r12) goto L_0x00fd
            if (r0 != r11) goto L_0x0056
            goto L_0x00fd
        L_0x0056:
            if (r0 == r10) goto L_0x005a
            if (r0 != r9) goto L_0x00fc
        L_0x005a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r8.f97022m
            int r0 = r0.getCommentType()
            if (r0 == 0) goto L_0x00b0
            if (r0 == r13) goto L_0x00b0
            r1 = 2
            if (r0 == r1) goto L_0x00b0
            r1 = 3
            if (r0 == r1) goto L_0x00b0
            r1 = 11
            if (r0 == r1) goto L_0x00b0
            r1 = 12
            if (r0 != r1) goto L_0x0073
            goto L_0x00b0
        L_0x0073:
            boolean r1 = m85186a(r0)
            if (r1 == 0) goto L_0x00f1
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r1 = r8.f97022m
            if (r1 == 0) goto L_0x00f1
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r1 = r8.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.getComment()
            if (r1 == 0) goto L_0x00f1
            android.app.Activity r1 = r8.f97012c
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r2 = r8.f97022m
            java.lang.String r2 = r2.getForwardId()
            java.lang.String r3 = "message"
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r4 = r8.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r4 = r4.getComment()
            java.lang.String r4 = r4.getCid()
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r5 = r8.f97022m
            if (r5 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.getAweme()
            if (r6 != 0) goto L_0x00a4
            goto L_0x00ac
        L_0x00a4:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.getAweme()
            int r14 = r5.getEnterpriseType()
        L_0x00ac:
            com.p683ss.android.ugc.aweme.notification.utils.C38454c.m85777a(r1, r2, r3, r4, r14)
            goto L_0x00f1
        L_0x00b0:
            com.ss.android.ugc.aweme.router.w r1 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            android.app.Activity r2 = r8.f97012c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "aweme://aweme/detail/"
            r3.<init>(r4)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r4 = r8.f97022m
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.getAweme()
            java.lang.String r4 = r4.getAid()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.ss.android.ugc.aweme.router.y r3 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r3)
            java.lang.String r4 = "cid"
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r5 = r8.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r5 = r5.getComment()
            java.lang.String r5 = r5.getCid()
            com.ss.android.ugc.aweme.router.y r3 = r3.mo83870a(r4, r5)
            java.lang.String r4 = "refer"
            java.lang.String r5 = "message"
            com.ss.android.ugc.aweme.router.y r3 = r3.mo83870a(r4, r5)
            java.lang.String r3 = r3.mo83871a()
            r1.mo83858a(r2, r3)
        L_0x00f1:
            boolean r0 = m85186a(r0)
            if (r0 != 0) goto L_0x00fc
            android.app.Activity r0 = r8.f97012c
            com.p683ss.android.ugc.aweme.notification.newstyle.C38415g.m85725a(r0)
        L_0x00fc:
            return
        L_0x00fd:
            android.app.Activity r0 = r8.f97012c
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r1 = r8.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.getComment()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            java.lang.String r1 = r1.getUid()
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r2 = r8.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r2 = r2.getComment()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getUser()
            java.lang.String r2 = r2.getSecUid()
            r8.mo78085a(r0, r1, r2)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r8.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            java.lang.String r0 = r0.getUid()
            java.lang.String r1 = "message_comment"
            java.lang.String r2 = "click_head"
            m85185a(r0, r1, r2)
            goto L_0x0243
        L_0x0135:
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r0 = r8.f97023n
            if (r0 == 0) goto L_0x0243
            java.lang.String r2 = "click"
            java.lang.String r3 = "pollsticker"
            int r4 = r16.getAdapterPosition()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r5 = r8.f97025p
            android.view.View r0 = r8.f97024o
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x014d
            r6 = 1
            goto L_0x014e
        L_0x014d:
            r6 = 0
        L_0x014e:
            java.lang.String r7 = r8.f97026q
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo78086a(r1, r2, r3, r4, r5, r6)
            int r0 = r17.getId()
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r1 = r8.f97023n
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r1 = r1.f96953a
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 == 0) goto L_0x016b
            r1 = 0
            goto L_0x0175
        L_0x016b:
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r1 = r8.f97023n
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r1 = r1.f96953a
            java.lang.Object r1 = r1.get(r14)
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p683ss.android.ugc.aweme.profile.model.User) r1
        L_0x0175:
            if (r1 == 0) goto L_0x0243
            if (r0 != r12) goto L_0x0194
            android.app.Activity r0 = r8.f97012c
            java.lang.String r2 = r1.getUid()
            java.lang.String r3 = r1.getSecUid()
            java.lang.String r4 = "message"
            m85182a(r0, r2, r3, r4)
            java.lang.String r0 = r1.getUid()
            java.lang.String r1 = "message_vote"
            java.lang.String r2 = "click_head"
            m85185a(r0, r1, r2)
            return
        L_0x0194:
            if (r0 != r11) goto L_0x01b1
            android.app.Activity r0 = r8.f97012c
            java.lang.String r2 = r1.getUid()
            java.lang.String r3 = r1.getSecUid()
            java.lang.String r4 = "message"
            m85182a(r0, r2, r3, r4)
            java.lang.String r0 = r1.getUid()
            java.lang.String r1 = "message_vote"
            java.lang.String r2 = "click_head"
            m85185a(r0, r1, r2)
            return
        L_0x01b1:
            if (r0 == r10) goto L_0x0211
            if (r0 != r9) goto L_0x01b6
            goto L_0x0211
        L_0x01b6:
            r1 = 2132024041(0x7f141ae9, float:1.9686547E38)
            if (r0 != r1) goto L_0x0243
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r0 = r8.f97023n
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r0 = r0.f96958f
            if (r0 == 0) goto L_0x0243
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r0 = r8.f97023n
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r0 = r0.f96958f
            java.lang.String r0 = r0.getUserId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0243
            android.app.Activity r0 = r8.f97012c
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r1 = r8.f97023n
            com.ss.android.ugc.aweme.router.w r2 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "aweme://user/profile/"
            r3.<init>(r4)
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r4 = r1.f96958f
            java.lang.String r4 = r4.getUserId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.ss.android.ugc.aweme.router.y r3 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r3)
            java.lang.String r4 = "sec_user_id"
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r1 = r1.f96953a
            java.lang.Object r1 = r1.get(r14)
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p683ss.android.ugc.aweme.profile.model.User) r1
            java.lang.String r1 = r1.getSecUid()
            com.ss.android.ugc.aweme.router.y r1 = r3.mo83870a(r4, r1)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "like_banner"
            com.ss.android.ugc.aweme.router.y r1 = r1.mo83870a(r3, r4)
            java.lang.String r1 = r1.mo83871a()
            r2.mo83858a(r0, r1)
            goto L_0x0243
        L_0x0211:
            java.lang.String r0 = "click"
            java.lang.String r1 = "pollsticker"
            int r2 = r16.getAdapterPosition()
            android.view.View r3 = r8.f97024o
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0222
            r14 = 1
        L_0x0222:
            r8.mo78089a(r0, r1, r2, r14)
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            android.app.Activity r1 = r8.f97012c
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r2 = r8.f97023n
            java.lang.String r2 = r2.f96959g
            com.ss.android.ugc.aweme.router.y r2 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r2)
            java.lang.String r3 = "refer"
            java.lang.String r4 = "message"
            com.ss.android.ugc.aweme.router.y r2 = r2.mo83870a(r3, r4)
            java.lang.String r2 = r2.mo83871a()
            r0.mo83858a(r1, r2)
            return
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.p2011a.C38119e.onClick(android.view.View):void");
    }

    public C38119e(View view, Activity activity) {
        super(view);
        this.f97012c = activity;
        this.f97013d = (AvatarImageWithVerify) view.findViewById(R.id.bs7);
        this.f97014e = (SmartRoundImageView) view.findViewById(R.id.bsb);
        this.f97017h = (TextView) view.findViewById(R.id.bs8);
        this.f97018i = (TextView) view.findViewById(R.id.bs_);
        this.f97019j = (TextView) view.findViewById(R.id.bs5);
        this.f97021l = (ConstraintLayout) view.findViewById(R.id.bs9);
        this.f97024o = view.findViewById(R.id.bsa);
        this.f97020k = (TextView) view.findViewById(R.id.bs6);
        this.f97015f = (RecyclerView) view.findViewById(R.id.ca4);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(this.f97012c);
        customLinearLayoutManager.mo4731b(0);
        C23697k kVar = new C23697k(0, (int) C9432q.m18687b((Context) this.f97012c, 10.0f), 0);
        this.f97015f.setLayoutManager(customLinearLayoutManager);
        this.f97015f.mo4798a((C1331h) kVar);
        this.f97016g = new C38129l(this.f97012c, 4);
        this.f97015f.setAdapter(this.f97016g);
        C38446k.m85764a(this.f97013d);
        C38446k.m85764a(this.f97017h);
        C38446k.m85764a(this.f97014e);
        this.f97013d.setOnClickListener(this);
        this.f97017h.setOnClickListener(this);
        this.f97021l.setOnClickListener(this);
        this.f97014e.setOnClickListener(this);
        ((C13833a) this.f97014e.getHierarchy()).mo25902b((int) R.color.c8);
        this.f97013d.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
    }

    /* renamed from: a */
    private void m85203a(BaseNotice baseNotice, boolean z) {
        String str;
        UserVerify userVerify;
        mo78089a("show", "pollsticker", getAdapterPosition(), !z);
        this.f97015f.setVisibility(8);
        if (!C9376b.m18558a((Collection<T>) this.f97023n.f96953a)) {
            User user = (User) this.f97023n.f96953a.get(0);
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f97013d.setUserData(userVerify);
            C12203q.m24645a((Object) C23608p.m57874a(this.f97023n.f96954b)).mo23125b(C47788ct.m103417a(500)).mo23118a("Notice").mo23116a((C12197k) this.f97014e).mo23121a();
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f97017h.setText(user.getRemarkName());
            } else {
                this.f97017h.setText(user.getNickname());
            }
            this.f97013d.mo48964b();
            C47916gh.m103674a(this.f97013d.getContext(), userVerify, this.f97017h);
            if (this.f97023n.f96953a.size() > 1 && this.f97023n.f96956d > 1) {
                this.f97015f.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                for (int i = 1; i < this.f97023n.f96953a.size(); i++) {
                    arrayList.add(this.f97023n.f96953a.get(i));
                }
                C38129l lVar = this.f97016g;
                C52711k.m112240b(arrayList, "data");
                lVar.f97088a.clear();
                lVar.f97088a.addAll(C52575l.m112129b((Iterable<? extends T>) arrayList, lVar.f97089b));
                lVar.notifyDataSetChanged();
            }
        }
        TextView textView = this.f97019j;
        if (!C9376b.m18558a((Collection<T>) this.f97023n.f96953a)) {
            int i2 = this.f97023n.f96956d;
            if (i2 == 1 && !this.f97023n.f96953a.isEmpty()) {
                str = this.f97012c.getString(R.string.fd7, new Object[]{this.f97023n.f96955c});
                textView.setText(str);
                this.f97019j.setVisibility(0);
                this.f97020k.setVisibility(8);
                this.f97018i.setText(C47903fw.m103626c(this.f97012c, baseNotice.getCreateTime() * 1000));
                C29408b.m69342a(this.f97019j);
            } else if (i2 > 1) {
                str = this.f97012c.getString(R.string.fd6, new Object[]{Integer.valueOf(i2 - 1)});
                textView.setText(str);
                this.f97019j.setVisibility(0);
                this.f97020k.setVisibility(8);
                this.f97018i.setText(C47903fw.m103626c(this.f97012c, baseNotice.getCreateTime() * 1000));
                C29408b.m69342a(this.f97019j);
            }
        }
        str = "";
        textView.setText(str);
        this.f97019j.setVisibility(0);
        this.f97020k.setVisibility(8);
        this.f97018i.setText(C47903fw.m103626c(this.f97012c, baseNotice.getCreateTime() * 1000));
        C29408b.m69342a(this.f97019j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d5, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78081a(com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r7, boolean r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x01de
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r7.getCommentNotice()
            if (r0 != 0) goto L_0x0010
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r0 = r7.getVoteNotice()
            if (r0 != 0) goto L_0x0010
            goto L_0x01de
        L_0x0010:
            super.mo78081a(r7, r8, r9)
            r6.mo78082a(r8)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r7.getCommentNotice()
            r6.f97022m = r0
            r6.f97025p = r7
            r6.f97026q = r9
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r9 = r7.getVoteNotice()
            r6.f97023n = r9
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r9 = r6.f97022m
            if (r9 == 0) goto L_0x01d6
            java.lang.String r1 = "show"
            java.lang.String r2 = "comment"
            int r3 = r6.getAdapterPosition()
            r9 = 1
            r4 = r8 ^ 1
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r8 = r6.f97022m
            java.lang.String r5 = m85180a(r8)
            r0 = r6
            r0.mo78090a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r8 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r8 = r8.getComment()
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getUser()
            if (r8 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.utils.UserVerify r8 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getAvatarThumb()
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            java.lang.String r2 = r0.getCustomVerify()
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            java.lang.String r3 = r0.getEnterpriseVerifyReason()
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            int r0 = r0.getVerificationType()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            java.lang.String r5 = r0.getWeiboVerify()
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x009d
        L_0x009c:
            r8 = 0
        L_0x009d:
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r6.f97013d
            r0.setUserData(r8)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getOriginCover()
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.f97022m
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getOriginCover()
            com.ss.android.ugc.aweme.base.k r0 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r0)
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24645a(r0)
            r1 = 500(0x1f4, float:7.0E-43)
            int[] r1 = com.p683ss.android.ugc.aweme.utils.C47788ct.m103417a(r1)
            com.bytedance.lighten.a.t r0 = r0.mo23125b(r1)
            java.lang.String r1 = "Notice"
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r1)
            com.ss.android.ugc.aweme.base.ui.SmartRoundImageView r1 = r6.f97014e
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r1)
            r0.mo23121a()
        L_0x00f5:
            android.widget.TextView r0 = r6.f97017h
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r1 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.getComment()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            java.lang.String r1 = r1.getNickname()
            r0.setText(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r6.f97013d
            r0.mo48964b()
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r6.f97013d
            android.content.Context r0 = r0.getContext()
            android.widget.TextView r1 = r6.f97017h
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103674a(r0, r8, r1)
            android.widget.TextView r8 = r6.f97018i
            android.app.Activity r0 = r6.f97012c
            long r1 = r7.getCreateTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            java.lang.String r7 = com.p683ss.android.ugc.aweme.utils.C47903fw.m103626c(r0, r1)
            r8.setText(r7)
            android.widget.TextView r7 = r6.f97019j
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r8 = r6.f97022m
            com.ss.android.ugc.aweme.comment.model.Comment r8 = r8.getComment()
            java.lang.String r0 = "$this$getForwardText"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = r8.getForwardId()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x014e
            java.lang.String r8 = r8.getText()
            java.lang.String r9 = "text"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            goto L_0x018f
        L_0x014e:
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r1 = 2132544845(0x7f1c0d4d, float:2.0742863E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = r8.getText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0169
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r9 = 0
        L_0x0169:
            if (r9 != 0) goto L_0x017c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = " • "
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        L_0x017c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r8 = r8.getText()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L_0x018f:
            r7.setText(r8)
            android.support.v7.widget.RecyclerView r7 = r6.f97015f
            r8 = 8
            r7.setVisibility(r8)
            android.widget.TextView r7 = r6.f97019j
            com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b.m69342a(r7)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r7 = r6.f97022m
            int r7 = r7.getCommentType()
            switch(r7) {
                case 0: goto L_0x01cc;
                case 1: goto L_0x01cc;
                case 2: goto L_0x01c3;
                case 3: goto L_0x01ba;
                case 4: goto L_0x01c3;
                case 5: goto L_0x01a7;
                case 6: goto L_0x01a7;
                case 7: goto L_0x01b1;
                case 8: goto L_0x01c3;
                case 9: goto L_0x01a8;
                case 10: goto L_0x01a8;
                case 11: goto L_0x01cc;
                case 12: goto L_0x01c3;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            goto L_0x01d5
        L_0x01a8:
            android.widget.TextView r7 = r6.f97020k
            r8 = 2132544856(0x7f1c0d58, float:2.0742885E38)
            r7.setText(r8)
            goto L_0x01d5
        L_0x01b1:
            android.widget.TextView r7 = r6.f97020k
            r8 = 2132543083(0x7f1c066b, float:2.073929E38)
            r7.setText(r8)
            goto L_0x01dd
        L_0x01ba:
            android.widget.TextView r7 = r6.f97020k
            r8 = 2132545254(0x7f1c0ee6, float:2.0743692E38)
            r7.setText(r8)
            goto L_0x01dd
        L_0x01c3:
            android.widget.TextView r7 = r6.f97020k
            r8 = 2132545253(0x7f1c0ee5, float:2.074369E38)
            r7.setText(r8)
            goto L_0x01dd
        L_0x01cc:
            android.widget.TextView r7 = r6.f97020k
            r8 = 2132545255(0x7f1c0ee7, float:2.0743694E38)
            r7.setText(r8)
            goto L_0x01dd
        L_0x01d5:
            return
        L_0x01d6:
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r9 = r6.f97023n
            if (r9 == 0) goto L_0x01dd
            r6.m85203a(r7, r8)
        L_0x01dd:
            return
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.p2011a.C38119e.mo78081a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, boolean, java.lang.String):void");
    }
}
