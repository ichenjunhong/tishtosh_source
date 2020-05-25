package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.discover.adapter.C27900g;
import com.p683ss.android.ugc.aweme.discover.api.CommentApi;
import com.p683ss.android.ugc.aweme.discover.api.CommentApi.RealApi;
import com.p683ss.android.ugc.aweme.discover.model.BarrageData;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28092a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C36674a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.net.cache.C37753b;
import com.p683ss.android.ugc.aweme.net.cache.C37755d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import org.greenrobot.eventbus.C53755c;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ci */
public final class C28642ci extends C31009h implements C0199s<C23274a>, C9382a {

    /* renamed from: a */
    public C28458a f75204a;

    /* renamed from: b */
    public C9381g f75205b;

    /* renamed from: c */
    public String f75206c = "";

    /* renamed from: d */
    public boolean f75207d;

    /* renamed from: e */
    public boolean f75208e;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ci$a */
    public static final class C28643a implements C27900g {

        /* renamed from: a */
        final /* synthetic */ C28642ci f75209a;

        /* renamed from: a */
        public final void mo56308a() {
            C28458a aVar = this.f75209a.f75204a;
            if (aVar == null) {
                C52711k.m112237a("barrageViewHolder");
            }
            C28458a.m67579a(aVar, 0, false, false, 6, null);
        }

        C28643a(C28642ci ciVar) {
            this.f75209a = ciVar;
        }

        /* renamed from: a */
        public final void mo56309a(String str) {
            C52711k.m112240b(str, "cid");
            C53755c.m114319a().mo112960d(new C28092a(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ci$b */
    public static final class C28644b implements C36674a {
        C28644b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
            if (r11 == null) goto L_0x0011;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49729a(com.p683ss.android.ugc.aweme.feed.model.Aweme r11) {
            /*
                r10 = this;
                org.greenrobot.eventbus.c r0 = org.greenrobot.eventbus.C53755c.m114319a()
                com.ss.android.ugc.aweme.discover.d.c r9 = new com.ss.android.ugc.aweme.discover.d.c
                if (r11 == 0) goto L_0x0011
                java.lang.String r11 = r11.getAid()
                if (r11 != 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r3 = r11
                goto L_0x0014
            L_0x0011:
                java.lang.String r11 = ""
                goto L_0x000f
            L_0x0014:
                r4 = 3000(0xbb8, double:1.482E-320)
                r6 = 0
                r7 = 8
                r8 = 0
                r2 = 2
                r1 = r9
                r1.<init>(r2, r3, r4, r6, r7, r8)
                r0.mo112960d(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28642ci.C28644b.mo49729a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
        }
    }

    /* renamed from: a */
    public final void mo49781a() {
        C53755c.m114319a().mo112959c((Object) this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m67904d() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            com.ss.android.ugc.aweme.discover.model.BarrageBean r9 = new com.ss.android.ugc.aweme.discover.model.BarrageBean
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f81192l
            if (r1 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = r1.getNickname()
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r1 = ""
        L_0x001b:
            r2 = r1
            r3 = -2
            r4 = 0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f81192l
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = r1.getDesc()
            if (r1 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r5 = r1
            goto L_0x002e
        L_0x002b:
            java.lang.String r1 = ""
            goto L_0x0029
        L_0x002e:
            java.lang.String r6 = ""
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.f81192l
            if (r1 == 0) goto L_0x0039
            long r7 = r1.getCreateTime()
            goto L_0x003b
        L_0x0039:
            r7 = 0
        L_0x003b:
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r9)
            com.ss.android.ugc.aweme.discover.ui.a r1 = r10.f75204a
            if (r1 != 0) goto L_0x004b
            java.lang.String r2 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x004b:
            r1.mo58127a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28642ci.m67904d():void");
    }

    public C28642ci(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
    }

    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo48226a("on_render_ready", (C0199s<C23274a>) this);
        }
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 0) {
            Object obj = message.obj;
            if (obj instanceof CommentItemList) {
                m67903a((CommentItemList) obj);
                return;
            }
            m67904d();
            this.f75208e = true;
            C28458a aVar = this.f75204a;
            if (aVar == null) {
                C52711k.m112237a("barrageViewHolder");
            }
            aVar.mo58124a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Object r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r10 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r10
            if (r10 == 0) goto L_0x0007
            java.lang.String r10 = r10.f62242a
            goto L_0x0008
        L_0x0007:
            r10 = 0
        L_0x0008:
            if (r10 != 0) goto L_0x000b
            return
        L_0x000b:
            int r0 = r10.hashCode()
            r1 = -962685926(0xffffffffc69e941a, float:-20298.05)
            if (r0 == r1) goto L_0x0015
            goto L_0x0045
        L_0x0015:
            java.lang.String r0 = "on_render_ready"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0045
            boolean r10 = r9.f75207d
            if (r10 != 0) goto L_0x0045
            org.greenrobot.eventbus.c r10 = org.greenrobot.eventbus.C53755c.m114319a()
            com.ss.android.ugc.aweme.discover.d.c r8 = new com.ss.android.ugc.aweme.discover.d.c
            r1 = 2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f81192l
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r2 = r0
            goto L_0x0038
        L_0x0035:
            java.lang.String r0 = ""
            goto L_0x0033
        L_0x0038:
            r3 = 3000(0xbb8, double:1.482E-320)
            r5 = 0
            r6 = 8
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r10.mo112960d(r8)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28642ci.onChanged(java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        LayoutInflater from = LayoutInflater.from(this.f81198r);
        if (view != null) {
            View inflate = from.inflate(R.layout.b3g, (ViewGroup) view, false);
            ((FrameLayout) view).addView(inflate);
            View findViewById = inflate.findViewById(R.id.eth);
            C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.rv_barrage)");
            this.f75204a = new C28458a(findViewById);
            C28458a aVar = this.f75204a;
            if (aVar == null) {
                C52711k.m112237a("barrageViewHolder");
            }
            aVar.f74849c.f73262c = new C28643a(this);
            this.f75205b = new C9381g(Looper.getMainLooper(), this);
            C53755c.m114319a().mo112955a((Object) this);
            Activity d = C23729p.m58270d(view);
            if (d != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) d;
                Activity d2 = C23729p.m58270d(view);
                if (d2 != null) {
                    AwemeChangeCallBack.m82602a(fragmentActivity, (FragmentActivity) d2, new C28644b());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r5 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r5 == null) goto L_0x0032;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m67903a(com.p683ss.android.ugc.aweme.comment.model.CommentItemList r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "obj"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            com.ss.android.ugc.aweme.discover.model.BarrageData r2 = com.p683ss.android.ugc.aweme.discover.model.BarrageData.INSTANCE
            java.util.Map r2 = r2.getMap()
            java.lang.String r3 = r0.f75206c
            r2.put(r3, r1)
            java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> r2 = r1.items
            r3 = 1
            if (r2 == 0) goto L_0x00fa
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            com.ss.android.ugc.aweme.discover.model.BarrageBean r13 = new com.ss.android.ugc.aweme.discover.model.BarrageBean
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f81192l
            if (r5 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            if (r5 == 0) goto L_0x0032
            java.lang.String r5 = r5.getNickname()
            if (r5 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r5 = ""
        L_0x0034:
            r6 = r5
            r7 = -2
            r8 = 0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f81192l
            if (r5 == 0) goto L_0x0044
            java.lang.String r5 = r5.getDesc()
            if (r5 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r9 = r5
            goto L_0x0047
        L_0x0044:
            java.lang.String r5 = ""
            goto L_0x0042
        L_0x0047:
            java.lang.String r10 = ""
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f81192l
            if (r5 == 0) goto L_0x0052
            long r11 = r5.getCreateTime()
            goto L_0x0054
        L_0x0052:
            r11 = 0
        L_0x0054:
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.add(r13)
            int r5 = r2.size()
            r6 = 10
            if (r5 < r6) goto L_0x00b8
            r5 = 0
            int r6 = r2.size()
            int r6 = r6 - r3
            if (r6 < 0) goto L_0x00aa
        L_0x006b:
            com.ss.android.ugc.aweme.discover.model.BarrageBean r15 = new com.ss.android.ugc.aweme.discover.model.BarrageBean
            java.lang.String r8 = ""
            r9 = 1
            int r16 = r5 + 1
            java.lang.Object r7 = r2.get(r5)
            java.lang.String r10 = "it.get(i)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r10)
            com.ss.android.ugc.aweme.comment.model.Comment r7 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r7
            java.lang.String r11 = r7.getText()
            java.lang.String r7 = "it.get(i).text"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r7)
            java.lang.Object r7 = r2.get(r5)
            java.lang.String r10 = "it.get(i)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r10)
            com.ss.android.ugc.aweme.comment.model.Comment r7 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r7
            java.lang.String r12 = r7.getCid()
            java.lang.String r7 = "it.get(i).cid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r7)
            r13 = 0
            r7 = r15
            r10 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4.add(r15)
            if (r5 == r6) goto L_0x00aa
            r5 = r16
            goto L_0x006b
        L_0x00aa:
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x00b3
            java.lang.String r5 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00b3:
            r5 = 3
            r2.mo58128a(r4, r5)
            goto L_0x00c4
        L_0x00b8:
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x00c1
            java.lang.String r5 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00c1:
            r2.mo58127a(r4)
        L_0x00c4:
            r0.f75208e = r3
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x00cf
            java.lang.String r4 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00cf:
            r2.mo58124a()
            boolean r2 = r0.f75208e
            if (r2 == 0) goto L_0x00fa
            boolean r2 = r0.f75207d
            if (r2 == 0) goto L_0x00fa
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x00e3
            java.lang.String r4 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00e3:
            java.lang.String r4 = r0.f75206c
            r2.mo58126a(r4)
            com.ss.android.ugc.aweme.discover.ui.a r5 = r0.f75204a
            if (r5 != 0) goto L_0x00f1
            java.lang.String r2 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00f1:
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 7
            r11 = 0
            com.p683ss.android.ugc.aweme.discover.p1659ui.C28458a.m67579a(r5, r6, r8, r9, r10, r11)
        L_0x00fa:
            java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> r1 = r1.items
            if (r1 != 0) goto L_0x010f
            r17.m67904d()
            r0.f75208e = r3
            com.ss.android.ugc.aweme.discover.ui.a r1 = r0.f75204a
            if (r1 != 0) goto L_0x010c
            java.lang.String r2 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x010c:
            r1.mo58124a()
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28642ci.m67903a(com.ss.android.ugc.aweme.comment.model.CommentItemList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r7 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r7 == null) goto L_0x0097;
     */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.p683ss.android.ugc.aweme.discover.p1642d.C28094c r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81192l
            java.lang.String r3 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getAid()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = r1.f73783b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0163
            java.lang.String r2 = r1.f73785d
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r4 = "hotinfo"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L_0x0163
            int r2 = r1.f73782a
            switch(r2) {
                case 1: goto L_0x0155;
                case 2: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0163
        L_0x0035:
            r2 = 1
            r0.f75207d = r2
            boolean r4 = r0.f75207d
            if (r4 == 0) goto L_0x0163
            boolean r4 = r0.f75208e
            if (r4 == 0) goto L_0x0163
            com.ss.android.ugc.aweme.discover.ui.a r4 = r0.f75204a
            if (r4 != 0) goto L_0x0049
            java.lang.String r5 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0049:
            com.ss.android.ugc.aweme.discover.ui.BarrageRecyclerView r4 = r4.f74850d
            int r4 = r4.getVisibility()
            r5 = 0
            if (r4 != 0) goto L_0x0054
            r4 = 1
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 != 0) goto L_0x0133
            java.lang.String r4 = r1.f73783b
            java.lang.String r6 = "aid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            com.ss.android.ugc.aweme.discover.model.BarrageData r6 = com.p683ss.android.ugc.aweme.discover.model.BarrageData.INSTANCE
            java.util.Map r6 = r6.getMap()
            java.lang.Object r4 = r6.get(r4)
            com.ss.android.ugc.aweme.comment.model.CommentItemList r4 = (com.p683ss.android.ugc.aweme.comment.model.CommentItemList) r4
            if (r4 == 0) goto L_0x0125
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            com.ss.android.ugc.aweme.discover.model.BarrageBean r15 = new com.ss.android.ugc.aweme.discover.model.BarrageBean
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f81192l
            if (r7 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.getAuthor()
            if (r7 == 0) goto L_0x0085
            java.lang.String r7 = r7.getNickname()
            if (r7 != 0) goto L_0x0087
        L_0x0085:
            java.lang.String r7 = ""
        L_0x0087:
            r8 = r7
            r9 = -2
            r10 = 0
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f81192l
            if (r7 == 0) goto L_0x0097
            java.lang.String r7 = r7.getDesc()
            if (r7 != 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r11 = r7
            goto L_0x009a
        L_0x0097:
            java.lang.String r7 = ""
            goto L_0x0095
        L_0x009a:
            java.lang.String r12 = ""
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f81192l
            if (r7 == 0) goto L_0x00a5
            long r13 = r7.getCreateTime()
            goto L_0x00a7
        L_0x00a5:
            r13 = 0
        L_0x00a7:
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.add(r15)
            java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> r7 = r4.items
            int r7 = r7.size()
            r8 = 10
            if (r7 < r8) goto L_0x0117
            java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> r7 = r4.items
            int r7 = r7.size()
            int r7 = r7 - r2
            if (r7 < 0) goto L_0x0108
            r2 = 0
        L_0x00c2:
            com.ss.android.ugc.aweme.discover.model.BarrageBean r14 = new com.ss.android.ugc.aweme.discover.model.BarrageBean
            java.lang.String r9 = ""
            r10 = 1
            int r16 = r2 + 1
            java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> r8 = r4.items
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r11 = "obj.items.get(i)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r11)
            com.ss.android.ugc.aweme.comment.model.Comment r8 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r8
            java.lang.String r12 = r8.getText()
            java.lang.String r8 = "obj.items.get(i).text"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r8)
            java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> r8 = r4.items
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r11 = "obj.items.get(i)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r11)
            com.ss.android.ugc.aweme.comment.model.Comment r8 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r8
            java.lang.String r13 = r8.getCid()
            java.lang.String r8 = "obj.items.get(i).cid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r8)
            r17 = 0
            r8 = r14
            r11 = r16
            r3 = r14
            r14 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r6.add(r3)
            if (r2 == r7) goto L_0x0108
            r2 = r16
            goto L_0x00c2
        L_0x0108:
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x0111
            java.lang.String r3 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0111:
            r3 = 2
            r4 = 0
            r2.mo58128a(r6, 2)
            goto L_0x0126
        L_0x0117:
            r4 = 0
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x0121
            java.lang.String r3 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0121:
            r2.mo58127a(r6)
            goto L_0x0126
        L_0x0125:
            r4 = 0
        L_0x0126:
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x012f
            java.lang.String r3 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x012f:
            r2.mo58124a()
            goto L_0x0134
        L_0x0133:
            r4 = 0
        L_0x0134:
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x013d
            java.lang.String r3 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x013d:
            java.lang.String r3 = r1.f73783b
            r2.mo58126a(r3)
            com.ss.android.ugc.aweme.discover.ui.a r5 = r0.f75204a
            if (r5 != 0) goto L_0x014b
            java.lang.String r2 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x014b:
            long r6 = r1.f73784c
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            com.p683ss.android.ugc.aweme.discover.p1659ui.C28458a.m67579a(r5, r6, r8, r9, r10, r11)
            goto L_0x0164
        L_0x0155:
            r4 = 0
            com.ss.android.ugc.aweme.discover.ui.a r2 = r0.f75204a
            if (r2 != 0) goto L_0x015f
            java.lang.String r3 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x015f:
            r2.mo58129b()
            goto L_0x0164
        L_0x0163:
            r4 = 0
        L_0x0164:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f81192l
            if (r2 == 0) goto L_0x016d
            java.lang.String r3 = r2.getAid()
            goto L_0x016e
        L_0x016d:
            r3 = r4
        L_0x016e:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r2 = r1.f73783b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 != 0) goto L_0x0194
            java.lang.String r1 = r1.f73785d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "hotinfo"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0194
            com.ss.android.ugc.aweme.discover.ui.a r1 = r0.f75204a
            if (r1 != 0) goto L_0x0191
            java.lang.String r2 = "barrageViewHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0191:
            r1.mo58129b()
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28642ci.onEvent(com.ss.android.ugc.aweme.discover.d.c):void");
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        C37755d dVar;
        super.mo58323a(videoItemParams);
        this.f75207d = false;
        this.f75208e = false;
        Aweme aweme = this.f81192l;
        if (aweme != null) {
            C28458a aVar = this.f75204a;
            if (aVar == null) {
                C52711k.m112237a("barrageViewHolder");
            }
            aVar.f74849c.f73263d = aweme;
            Map map = BarrageData.INSTANCE.getMap();
            Aweme aweme2 = this.f81192l;
            C52711k.m112236a((Object) aweme2, "aweme");
            if (map.get(aweme2.getAid()) != null) {
                Map map2 = BarrageData.INSTANCE.getMap();
                Aweme aweme3 = this.f81192l;
                C52711k.m112236a((Object) aweme3, "aweme");
                Object obj = map2.get(aweme3.getAid());
                if (obj == null) {
                    C52711k.m112234a();
                }
                m67903a((CommentItemList) obj);
            } else {
                Aweme aweme4 = this.f81192l;
                C52711k.m112236a((Object) aweme4, "aweme");
                String aid = aweme4.getAid();
                int a = C47945d.m103731a();
                int b = C47945d.m103733b();
                User author = aweme.getAuthor();
                C52711k.m112236a((Object) author, "it.author");
                String city = author.getCity();
                boolean isFollowFeedEnterFullScreenDetail = C25282a.m61494a().isFollowFeedEnterFullScreenDetail();
                Aweme awemeById = C23324d.m57378a().getAwemeById(aid);
                if (!(awemeById == null || awemeById.getAwemeRawAd() == null || C26503d.m64064g(awemeById))) {
                    awemeById.getAwemeRawAd().getCreativeId();
                }
                if (awemeById == null || awemeById.getPreload() == null || awemeById.getPreload().commentPreload < 0) {
                    dVar = null;
                } else {
                    C37755d dVar2 = new C37755d();
                    C37753b bVar = new C37753b();
                    bVar.f96198a = "cache_comment";
                    bVar.f96200c = 100000;
                    bVar.f96199b = 1;
                    dVar2.f96204s = bVar;
                    dVar = dVar2;
                }
                C0013i fetchCommentListV2 = ((RealApi) CommentApi.f73685a.create(RealApi.class)).fetchCommentListV2(aid, 0, 30, null, Integer.valueOf(a), Integer.valueOf(b), isFollowFeedEnterFullScreenDetail ? 1 : 0, null, 40, city, dVar);
                C9381g gVar = this.f75205b;
                if (gVar == null) {
                    C52711k.m112237a("hld");
                }
                fetchCommentListV2.mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(gVar, 0));
            }
        }
    }
}
