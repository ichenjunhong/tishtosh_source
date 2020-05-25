package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.facebook.common.p927k.C13731f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView.C32671a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38101n;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38105r;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.RoomInfo;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.NoticeCollapsilitySetting;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38336e;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38351ab;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38353ad;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38355af;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38357ah;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38360aj;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38363al;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38365an;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38366ao;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38367ap;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38367ap.C38368a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38367ap.C38369b;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38378d;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38380f;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38389i;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38391j;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38394l;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38396n;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38399p;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38401r;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38406u;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38407v;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38411x;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38413z;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38131m;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38136p;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38138r;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38140t;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38142v;
import com.p683ss.android.ugc.aweme.notification.p2015e.C38178a;
import com.p683ss.android.ugc.aweme.notification.p2015e.C38180b;
import com.p683ss.android.ugc.aweme.notification.p2015e.C38180b.C38182a;
import com.p683ss.android.ugc.aweme.notification.p2015e.C38180b.C38183b;
import com.p683ss.android.ugc.aweme.notification.util.C38431c;
import com.p683ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.e */
public final class C38258e extends C26840g<MusNotice> implements C38131m {

    /* renamed from: m */
    public static final C38260b f97376m = new C38260b(null);

    /* renamed from: A */
    private MusNotice f97377A;

    /* renamed from: B */
    private C38336e f97378B;

    /* renamed from: C */
    private int f97379C = 36;

    /* renamed from: D */
    private boolean f97380D = true;

    /* renamed from: E */
    private int f97381E;

    /* renamed from: F */
    private final HashMap<String, Boolean> f97382F = new HashMap<>();

    /* renamed from: G */
    private int f97383G;

    /* renamed from: H */
    private boolean f97384H;

    /* renamed from: I */
    private LinearLayoutManager f97385I;

    /* renamed from: J */
    private final Fragment f97386J;

    /* renamed from: K */
    private final String f97387K;

    /* renamed from: a */
    public List<MusNotice> f97388a;

    /* renamed from: b */
    public int f97389b;

    /* renamed from: c */
    public C23452y<User> f97390c;

    /* renamed from: d */
    public C38368a f97391d;

    /* renamed from: e */
    List<MusNotice> f97392e;

    /* renamed from: f */
    public boolean f97393f;

    /* renamed from: g */
    boolean f97394g = true;

    /* renamed from: h */
    C38178a f97395h = new C38178a(2002, null);

    /* renamed from: i */
    public C38259a f97396i;

    /* renamed from: j */
    public List<MusNotice> f97397j;

    /* renamed from: k */
    public int f97398k;

    /* renamed from: l */
    public final C52670a<C52860x> f97399l;

    /* renamed from: y */
    private Dialog f97400y;

    /* renamed from: z */
    private MusNotice f97401z;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.e$a */
    public interface C38259a {
        /* renamed from: a */
        void mo78239a(List<MusNotice> list);

        /* renamed from: b */
        void mo78240b(List<MusNotice> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.e$b */
    public static final class C38260b {
        private C38260b() {
        }

        public /* synthetic */ C38260b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.e$c */
    static final class C38261c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38258e f97402a;

        C38261c(C38258e eVar) {
            this.f97402a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C38258e eVar = this.f97402a;
            if (eVar.f97393f) {
                int indexOf = eVar.mo50673a().indexOf(eVar.f97395h);
                if (indexOf != -1) {
                    eVar.f97393f = false;
                    eVar.f97394g = false;
                    if (eVar.f97392e != null) {
                        List a = eVar.mo50673a();
                        List<MusNotice> list = eVar.f97392e;
                        if (list == null) {
                            C52711k.m112234a();
                        }
                        a.addAll(indexOf, list);
                        List<MusNotice> list2 = eVar.f97392e;
                        if (list2 == null) {
                            C52711k.m112234a();
                        }
                        eVar.notifyItemRangeInserted(indexOf, list2.size());
                    }
                }
                eVar.f97393f = false;
            }
            int indexOf2 = eVar.mo50673a().indexOf(eVar.f97395h);
            if (indexOf2 != -1) {
                eVar.mo50673a().remove(eVar.f97395h);
                eVar.notifyItemRemoved(indexOf2);
                if (eVar.f97397j != null) {
                    List a2 = eVar.mo50673a();
                    List<MusNotice> list3 = eVar.f97397j;
                    if (list3 == null) {
                        C52711k.m112234a();
                    }
                    a2.removeAll(list3);
                    List<MusNotice> list4 = eVar.f97397j;
                    if (list4 == null) {
                        C52711k.m112234a();
                    }
                    eVar.notifyItemRangeRemoved(indexOf2, list4.size());
                }
                C38259a aVar = eVar.f97396i;
                if (aVar != null) {
                    aVar.mo78240b(eVar.mo50673a());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.e$d */
    static final class C38262d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38258e f97403a;

        /* renamed from: b */
        final /* synthetic */ int f97404b;

        C38262d(C38258e eVar, int i) {
            this.f97403a = eVar;
            this.f97404b = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r7, int r8) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.notification.newstyle.a.e r8 = r6.f97403a
                java.util.List r8 = r8.f70670n
                int r8 = r8.size()
                r0 = 0
                r1 = 1
                if (r8 <= 0) goto L_0x00ba
                int r2 = r6.f97404b
                if (r2 < 0) goto L_0x00ba
                int r2 = r6.f97404b
                if (r2 >= r8) goto L_0x00ba
                com.ss.android.ugc.aweme.notification.newstyle.a.e r8 = r6.f97403a
                java.util.List r8 = r8.f70670n
                int r2 = r6.f97404b
                java.lang.Object r8 = r8.get(r2)
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
                if (r8 == 0) goto L_0x0029
                java.lang.String r8 = r8.getNid()
                com.p683ss.android.ugc.aweme.notification.api.MusNotificationApiManager.m85267a(r8)
            L_0x0029:
                com.ss.android.ugc.aweme.notification.newstyle.a.e r8 = r6.f97403a
                java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r8 = r8.f97388a
                if (r8 == 0) goto L_0x003c
                com.ss.android.ugc.aweme.notification.newstyle.a.e r2 = r6.f97403a
                java.util.List r2 = r2.f70670n
                int r3 = r6.f97404b
                java.lang.Object r2 = r2.get(r3)
                r8.remove(r2)
            L_0x003c:
                com.ss.android.ugc.aweme.notification.newstyle.a.e r8 = r6.f97403a
                java.util.List r8 = r8.f70670n
                int r2 = r6.f97404b
                r8.remove(r2)
                com.ss.android.ugc.aweme.notification.newstyle.a.e r8 = r6.f97403a
                java.util.List r2 = r8.f70670n
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
                if (r2 != 0) goto L_0x00aa
                java.util.List r2 = r8.f70670n
                int r2 = r2.size()
                if (r2 != r1) goto L_0x006a
                java.util.List r2 = r8.f70670n
                java.lang.Object r2 = r2.get(r0)
                boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m
                if (r2 == 0) goto L_0x00aa
                java.util.List r8 = r8.f70670n
                r8.remove(r0)
            L_0x0068:
                r8 = 1
                goto L_0x00ab
            L_0x006a:
                java.util.List r2 = r8.f70670n
                int r2 = r2.size()
                int r2 = r2 + -2
                if (r2 < 0) goto L_0x00aa
                r3 = 0
            L_0x0075:
                java.util.List r4 = r8.f70670n
                java.lang.Object r4 = r4.get(r3)
                boolean r4 = r4 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m
                if (r4 == 0) goto L_0x00a5
                java.util.List r4 = r8.f70670n
                int r5 = r3 + 1
                java.lang.Object r4 = r4.get(r5)
                boolean r4 = r4 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m
                if (r4 == 0) goto L_0x00a5
                java.util.List r2 = r8.f70670n
                r2.remove(r3)
                if (r3 != 0) goto L_0x0068
                java.util.List r2 = r8.f70670n
                java.lang.Object r2 = r2.get(r3)
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
                int r2 = r2.timeLineType
                r4 = 5
                if (r2 != r4) goto L_0x0068
                java.util.List r8 = r8.f70670n
                r8.remove(r3)
                goto L_0x0068
            L_0x00a5:
                if (r3 == r2) goto L_0x00aa
                int r3 = r3 + 1
                goto L_0x0075
            L_0x00aa:
                r8 = 0
            L_0x00ab:
                if (r8 == 0) goto L_0x00b3
                com.ss.android.ugc.aweme.notification.newstyle.a.e r8 = r6.f97403a
                r8.notifyDataSetChanged()
                goto L_0x00ba
            L_0x00b3:
                com.ss.android.ugc.aweme.notification.newstyle.a.e r8 = r6.f97403a
                int r2 = r6.f97404b
                r8.notifyItemRemoved(r2)
            L_0x00ba:
                r7.dismiss()
                com.ss.android.ugc.aweme.notification.newstyle.a.e r7 = r6.f97403a
                java.util.List r7 = r7.mo50673a()
                java.util.Collection r7 = (java.util.Collection) r7
                if (r7 == 0) goto L_0x00cd
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x00ce
            L_0x00cd:
                r0 = 1
            L_0x00ce:
                if (r0 == 0) goto L_0x00d7
                com.ss.android.ugc.aweme.notification.newstyle.a.e r7 = r6.f97403a
                d.f.a.a<d.x> r7 = r7.f97399l
                r7.invoke()
            L_0x00d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38258e.C38262d.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        C1352v vVar2 = vVar;
        int i2 = i;
        if (vVar2 instanceof C38406u) {
            C38406u uVar = (C38406u) vVar2;
            Object obj = mo50673a().get(i2);
            if (obj != null) {
                uVar.mo78316a((C38099m) obj);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTitle");
        }
        String b = C38431c.m85743b(((MusNotice) mo50673a().get(i2)).timeLineType);
        boolean z = true;
        switch (mo48641a(i2)) {
            case 1:
            case 12:
                if (vVar2 != null) {
                    C38413z zVar = (C38413z) vVar2;
                    Object obj2 = mo50673a().get(i2);
                    C52711k.m112236a(obj2, "data[position]");
                    zVar.mo78317a((BaseNotice) obj2, true);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewAssistantNotificationHolder");
            case 2:
            case 11:
                if (vVar2 != null) {
                    C38360aj ajVar = (C38360aj) vVar2;
                    Object obj3 = mo50673a().get(i2);
                    C52711k.m112236a(obj3, "data[position]");
                    BaseNotice baseNotice = (BaseNotice) obj3;
                    C52711k.m112240b(baseNotice, "notice");
                    if (!(baseNotice.getAnnouncement() == null && baseNotice.getTextNotice() == null)) {
                        ajVar.f97616f = baseNotice.getTextNotice();
                        UserTextNotice userTextNotice = ajVar.f97616f;
                        if (userTextNotice != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            Context context = ajVar.f97110c;
                            C52711k.m112236a((Object) context, "context");
                            spannableStringBuilder.append(context.getResources().getString(R.string.ck7)).append(": ");
                            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append(8296);
                            if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                                spannableStringBuilder.append(userTextNotice.getTitle());
                            } else {
                                spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                            }
                            spannableStringBuilder.append(8297);
                            C38389i.m85696a(ajVar.f97615e, spannableStringBuilder, baseNotice, 5, C9432q.m18670a(ajVar.f97110c) - ((int) C9432q.m18687b(ajVar.f97110c, 132.0f)));
                            ajVar.f97614d.setImageURI(C13731f.m27775a((int) R.drawable.ckw));
                        }
                        ajVar.f97617g = baseNotice.getAnnouncement();
                        AnnouncementNotice announcementNotice = ajVar.f97617g;
                        if (announcementNotice != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            Context context2 = ajVar.f97110c;
                            C52711k.m112236a((Object) context2, "context");
                            spannableStringBuilder2.append(context2.getResources().getString(R.string.ck0)).append(": ");
                            spannableStringBuilder2.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
                            spannableStringBuilder2.append(8296);
                            if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                                spannableStringBuilder2.append(announcementNotice.getTitle());
                            } else {
                                spannableStringBuilder2.delete(spannableStringBuilder2.length() - 2, spannableStringBuilder2.length());
                            }
                            spannableStringBuilder2.append(8297);
                            C38389i.m85696a(ajVar.f97615e, spannableStringBuilder2, baseNotice, 5, C9432q.m18670a(ajVar.f97110c) - ((int) C9432q.m18687b(ajVar.f97110c, 132.0f)));
                            ajVar.f97614d.setImageURI(C13731f.m27775a((int) R.drawable.ckw));
                            break;
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTextNotificationHolder");
            case 6:
                if (vVar2 != null) {
                    ((C38138r) vVar2).mo78111a((MusNotice) mo50673a().get(i2), true);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MusAdHelperNotificationHolder");
            case 9:
                m85459a("pollsticker", i2, b);
                if (vVar2 != null) {
                    C38136p pVar = (C38136p) vVar2;
                    Object obj4 = mo50673a().get(i2);
                    C52711k.m112236a(obj4, "data[position]");
                    pVar.mo78110a((BaseNotice) obj4, true, m85461f(i2), C38431c.m85742a(this.f97379C), this.f97387K);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder");
            case 13:
                if (vVar2 != null) {
                    C38407v vVar3 = (C38407v) vVar2;
                    Object obj5 = mo50673a().get(i2);
                    if (obj5 != null) {
                        C38336e eVar = (C38336e) obj5;
                        int i3 = this.f97381E;
                        C52711k.m112240b(eVar, "notice");
                        vVar3.f97756f = i3;
                        DmtTextView dmtTextView = (DmtTextView) vVar3.f97755e.getValue();
                        C52711k.m112236a((Object) dmtTextView, "mCount");
                        dmtTextView.setText(C33095b.m76068a((long) eVar.f97567a));
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.model.MusMixedFollowRequestNotice");
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusMixedFollowRequestHolder");
            case 21:
                m85459a("duet", i2, b);
                if (vVar2 != null) {
                    C38394l lVar = (C38394l) vVar2;
                    Object obj6 = mo50673a().get(i2);
                    C52711k.m112236a(obj6, "data[position]");
                    lVar.mo78311a((BaseNotice) obj6, true);
                    m85458a(vVar2, mo48641a(i2), i2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder");
            case 22:
                m85459a("create_aweme", i2, b);
                if (vVar2 != null) {
                    C38353ad adVar = (C38353ad) vVar2;
                    Object obj7 = mo50673a().get(i2);
                    C52711k.m112236a(obj7, "data[position]");
                    MusNotice musNotice = (MusNotice) obj7;
                    C52711k.m112240b(musNotice, "notice");
                    if (musNotice.getPostNotice() != null) {
                        adVar.f97598m = musNotice.getPostNotice();
                        PostNotice postNotice = adVar.f97598m;
                        if (postNotice != null) {
                            Aweme aweme = postNotice.getAweme();
                            if (aweme != null) {
                                UserVerify userVerify = new UserVerify(aweme.getAuthor().getAvatarThumb(), aweme.getAuthor().getCustomVerify(), aweme.getAuthor().getEnterpriseVerifyReason(), Integer.valueOf(aweme.getAuthor().getVerificationType()), aweme.getAuthor().getWeiboVerify());
                                adVar.f97594d.setUserData(userVerify);
                                TextView textView = adVar.f97595e;
                                User author = aweme.getAuthor();
                                C52711k.m112236a((Object) author, "it.author");
                                adVar.mo78303a(textView, author, (BaseNotice) null, (String) null, (String) null);
                                if (aweme.getVideo() != null) {
                                    RemoteImageView remoteImageView = adVar.f97597g;
                                    Video video = aweme.getVideo();
                                    C52711k.m112236a((Object) video, "it.video");
                                    C23515d.m57669a(remoteImageView, video.getOriginCover());
                                }
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append(adVar.f97110c.getString(R.string.ckr));
                                adVar.mo78107a(spannableStringBuilder3, (BaseNotice) musNotice);
                                adVar.f97596f.setText(spannableStringBuilder3);
                                break;
                            }
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCreateAwemeNotificationHolder");
            case 23:
                if (vVar2 != null) {
                    C38411x xVar = (C38411x) vVar2;
                    Object obj8 = mo50673a().get(i2);
                    C52711k.m112236a(obj8, "data[position]");
                    MusNotice musNotice2 = (MusNotice) obj8;
                    C52711k.m112240b(musNotice2, "notice");
                    if (musNotice2.getFollowApproveNotice() != null) {
                        xVar.f97764g = musNotice2.getFollowApproveNotice();
                        FollowApproveNotice followApproveNotice = xVar.f97764g;
                        if (followApproveNotice != null) {
                            User user = followApproveNotice.getUser();
                            if (user != null) {
                                UserVerify userVerify2 = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
                                xVar.f97761d.setUserData(userVerify2);
                                xVar.f97761d.mo48964b();
                                xVar.mo78303a(xVar.f97762e, user, (BaseNotice) null, (String) null, (String) null);
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                Context context3 = xVar.f97110c;
                                C52711k.m112236a((Object) context3, "context");
                                spannableStringBuilder4.append(context3.getResources().getString(R.string.cj8));
                                xVar.mo78107a(spannableStringBuilder4, (BaseNotice) musNotice2);
                                xVar.f97763f.setText(spannableStringBuilder4);
                                break;
                            }
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewApproveFollowNotificationHolder");
            case 24:
                m85459a("friend", i2, b);
                if (vVar2 != null) {
                    ((C38140t) vVar2).mo78112a((MusNotice) mo50673a().get(i2), true);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MusFriendNotificationHolder");
            case 31:
                if (vVar2 != null) {
                    C38391j jVar = (C38391j) vVar2;
                    Object obj9 = mo50673a().get(i2);
                    C52711k.m112236a(obj9, "data[position]");
                    jVar.mo78310a((BaseNotice) obj9, true, C38431c.m85742a(this.f97379C), this.f97387K);
                    m85458a(vVar2, mo48641a(i2), i2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder");
            case 33:
                if (vVar2 != null) {
                    C38396n nVar = (C38396n) vVar2;
                    Object obj10 = mo50673a().get(i2);
                    C52711k.m112236a(obj10, "data[position]");
                    nVar.mo78312a((BaseNotice) obj10, true, C38431c.m85742a(this.f97379C), this.f97387K);
                    m85458a(vVar2, mo48641a(i2), i2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder");
            case BaseNotice.LIKE /*41*/:
                if (vVar2 != null) {
                    C38399p pVar2 = (C38399p) vVar2;
                    Object obj11 = mo50673a().get(i2);
                    C52711k.m112236a(obj11, "data[position]");
                    pVar2.mo78313a((BaseNotice) obj11, true, m85461f(i2), C38431c.m85742a(this.f97379C), this.f97387K);
                    m85458a(vVar2, mo48641a(i2), i2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder");
            case BaseNotice.f96882AT /*45*/:
                if (vVar2 != null) {
                    C38401r rVar = (C38401r) vVar2;
                    Object obj12 = mo50673a().get(i2);
                    C52711k.m112236a(obj12, "data[position]");
                    rVar.mo78314a((BaseNotice) obj12, true, C38431c.m85742a(this.f97379C), this.f97387K);
                    m85458a(vVar2, mo48641a(i2), i2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder");
            case 50:
                m85459a(CustomActionPushReceiver.f104061f, i2, b);
                if (vVar2 != null) {
                    ((C38142v) vVar2).mo78113a((MusNotice) mo50673a().get(i2), true);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MusLiveRecommendAvatarNotificationHolder");
            case BaseNotice.TCM /*61*/:
                if (vVar2 != null) {
                    C38357ah ahVar = (C38357ah) vVar2;
                    Object obj13 = mo50673a().get(i2);
                    C52711k.m112236a(obj13, "data[position]");
                    BaseNotice baseNotice2 = (BaseNotice) obj13;
                    if (C36782d.m82775a().mo75940c(61) > 0) {
                        z = false;
                    }
                    C52711k.m112240b(baseNotice2, "notice");
                    if (baseNotice2.getTcmNotice() != null) {
                        ahVar.f97610g = baseNotice2.getTcmNotice();
                        C38105r rVar2 = ahVar.f97610g;
                        if (rVar2 != null) {
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                            Context context4 = ahVar.f97110c;
                            C52711k.m112236a((Object) context4, "context");
                            spannableStringBuilder5.append(context4.getResources().getString(R.string.gj4)).append(": ");
                            spannableStringBuilder5.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder5.length(), 33);
                            spannableStringBuilder5.append(8296);
                            if (!TextUtils.isEmpty(rVar2.f96946a)) {
                                spannableStringBuilder5.append(rVar2.f96946a);
                            } else {
                                spannableStringBuilder5.delete(spannableStringBuilder5.length() - 2, spannableStringBuilder5.length());
                            }
                            spannableStringBuilder5.append(8297);
                            if (z) {
                                ahVar.f97609f.setVisibility(8);
                                C38389i.m85696a(ahVar.f97608e, spannableStringBuilder5, baseNotice2, 5, C9432q.m18670a(ahVar.f97110c) - ((int) C9432q.m18687b(ahVar.f97110c, 132.0f)));
                                ahVar.f97609f.setVisibility(8);
                            } else {
                                ahVar.f97608e.setText(spannableStringBuilder5);
                                ahVar.f97609f.setVisibility(0);
                            }
                            ahVar.f97607d.setImageURI(C13731f.m27775a((int) R.drawable.ckx));
                            break;
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTcmNotificationHolder");
            case BaseNotice.DONATION /*69*/:
                if (vVar2 instanceof C38380f) {
                    C38380f fVar = (C38380f) vVar2;
                    Object obj14 = mo50673a().get(i2);
                    C52711k.m112236a(obj14, "data[position]");
                    fVar.mo78302a((BaseNotice) obj14, C38431c.m85742a(this.f97379C), this.f97387K);
                    break;
                }
                break;
            case BaseNotice.HASHTAG /*101*/:
                m85459a("tag", i2, b);
                if (vVar2 != null) {
                    C38413z zVar2 = (C38413z) vVar2;
                    Object obj15 = mo50673a().get(i2);
                    C52711k.m112236a(obj15, "data[position]");
                    zVar2.mo78317a((BaseNotice) obj15, true);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewAssistantNotificationHolder");
            case 1000:
                if (vVar2 != null) {
                    C38363al alVar = (C38363al) vVar2;
                    Object obj16 = mo50673a().get(i2);
                    C52711k.m112236a(obj16, "data[position]");
                    alVar.mo78295a((MusNotice) obj16, false);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusTutorialVideoHolder");
            case 1001:
                m85459a(CustomActionPushReceiver.f104061f, i2, b);
                if (vVar2 != null) {
                    C38355af afVar = (C38355af) vVar2;
                    Object obj17 = mo50673a().get(i2);
                    C52711k.m112236a(obj17, "data[position]");
                    MusNotice musNotice3 = (MusNotice) obj17;
                    C52711k.m112240b(musNotice3, "notice");
                    if (musNotice3.getLiveNotice() != null) {
                        afVar.f97603g = musNotice3.getLiveNotice();
                        LiveNotice liveNotice = afVar.f97603g;
                        if (liveNotice != null) {
                            User user2 = liveNotice.getUser();
                            String str = null;
                            UrlModel avatarThumb = user2 != null ? user2.getAvatarThumb() : null;
                            String customVerify = user2 != null ? user2.getCustomVerify() : null;
                            String enterpriseVerifyReason = user2 != null ? user2.getEnterpriseVerifyReason() : null;
                            Integer valueOf = user2 != null ? Integer.valueOf(user2.getVerificationType()) : null;
                            if (user2 != null) {
                                str = user2.getWeiboVerify();
                            }
                            UserVerify userVerify3 = new UserVerify(avatarThumb, customVerify, enterpriseVerifyReason, valueOf, str);
                            afVar.f97600d.setUserData(userVerify3);
                            afVar.f97600d.mo48964b();
                            if (user2 != null) {
                                afVar.mo78303a(afVar.f97601e, user2, (BaseNotice) null, (String) null, (String) null);
                            }
                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                            spannableStringBuilder6.append(afVar.f97110c.getString(R.string.ckc));
                            if (!TextUtils.isEmpty(liveNotice.getTitle())) {
                                spannableStringBuilder6.append(": ");
                                spannableStringBuilder6.append(liveNotice.getTitle());
                            }
                            spannableStringBuilder6.append(" ");
                            int length = spannableStringBuilder6.length();
                            spannableStringBuilder6.append(afVar.f97110c.getString(R.string.bu6));
                            Context context5 = afVar.f97110c;
                            C52711k.m112236a((Object) context5, "context");
                            spannableStringBuilder6.setSpan(new ForegroundColorSpan(context5.getResources().getColor(R.color.jl)), length, spannableStringBuilder6.length(), 17);
                            afVar.f97602f.setText(spannableStringBuilder6);
                            break;
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewLiveNotificationHolder");
            case BaseNotice.CHECK_PROFILE /*1002*/:
                m85459a("check_profile", i2, b);
                if (vVar2 != null) {
                    C38351ab abVar = (C38351ab) vVar2;
                    Object obj18 = mo50673a().get(i2);
                    C52711k.m112236a(obj18, "data[position]");
                    MusNotice musNotice4 = (MusNotice) obj18;
                    C52711k.m112240b(musNotice4, "notice");
                    if (musNotice4.getCheckProfileNotice() != null) {
                        abVar.f97591n = musNotice4.getCheckProfileNotice();
                        CheckProfileNotice checkProfileNotice = musNotice4.getCheckProfileNotice();
                        if (checkProfileNotice != null) {
                            List users = checkProfileNotice.getUsers();
                            if (users == null) {
                                users = C52575l.m112097a();
                            }
                            int size = users.size();
                            if (size > 0) {
                                abVar.mo78304a(abVar.f97589g, users, 2, checkProfileNotice.getCountOfUser(), (BaseNotice) null, true, (String) null, (String) null);
                                if (size == 1) {
                                    abVar.f97586d.setVisibility(0);
                                    abVar.f97587e.setVisibility(8);
                                    abVar.f97588f.setVisibility(8);
                                    UserVerify userVerify4 = new UserVerify(((User) users.get(0)).getAvatarThumb(), ((User) users.get(0)).getCustomVerify(), ((User) users.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) users.get(0)).getVerificationType()), ((User) users.get(0)).getWeiboVerify());
                                    abVar.f97586d.setUserData(userVerify4);
                                    abVar.f97586d.mo48964b();
                                } else {
                                    abVar.f97586d.setVisibility(8);
                                    abVar.f97587e.setVisibility(0);
                                    abVar.f97588f.setVisibility(0);
                                    C23515d.m57669a((RemoteImageView) abVar.f97587e, ((User) users.get(0)).getAvatarThumb());
                                    C23515d.m57669a((RemoteImageView) abVar.f97588f, ((User) users.get(1)).getAvatarThumb());
                                }
                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                spannableStringBuilder7.append(abVar.f97110c.getString(R.string.cj_));
                                abVar.mo78107a(spannableStringBuilder7, (BaseNotice) musNotice4);
                                abVar.f97590m.setText(spannableStringBuilder7);
                                break;
                            }
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCheckProfileNotificationHolder");
            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                if (vVar2 != null) {
                    C38378d dVar = (C38378d) vVar2;
                    Object obj19 = mo50673a().get(i2);
                    C52711k.m112236a(obj19, "data[position]");
                    dVar.mo78301a((BaseNotice) obj19, true, C38431c.m85742a(this.f97379C), this.f97387K);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTCommentReplyWithVideoNotificationHolder");
            case 2000:
                if (vVar2 instanceof C38367ap) {
                    C38367ap apVar = (C38367ap) vVar2;
                    String string = this.f97386J.getString(R.string.czm);
                    C52711k.m112236a((Object) string, "mFragment.getString(R.st…ile_suggested_area_title)");
                    C52711k.m112240b(string, "titleName");
                    apVar.f97630d.setText(string);
                    if (this.f97391d != null) {
                        C38368a aVar = this.f97391d;
                        if (aVar == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112240b(aVar, "listener");
                        ImageView imageView = apVar.f97631e;
                        if (imageView != null) {
                            imageView.setOnClickListener(new C38369b(apVar, aVar));
                            break;
                        }
                    }
                    return;
                }
                break;
            case 2001:
                if (vVar2 instanceof C38180b) {
                    Object obj20 = mo50673a().get(i2);
                    if (obj20 != null) {
                        User user3 = ((C38178a) obj20).f97243b;
                        C38180b bVar = (C38180b) vVar2;
                        bVar.f97244d = this.f97390c;
                        bVar.f97246f.mo66239a(user3);
                        C31980a aVar2 = bVar.f97245e;
                        if (aVar2 != null) {
                            aVar2.mo65173a(user3);
                        }
                        C31980a aVar3 = bVar.f97245e;
                        if (aVar3 != null) {
                            aVar3.f83489d = new C38182a(bVar, user3);
                        }
                        bVar.f97246f.setActionEventListener(new C38183b(bVar, user3, i2));
                        C23452y<User> yVar = bVar.f97244d;
                        if (yVar != null) {
                            yVar.mo48614a(C32671a.m75534d(), user3, i, bVar.f97246f, null);
                            break;
                        } else {
                            return;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.recommend.NoticeRecommend");
                    }
                }
                break;
            case 2002:
                if (vVar2 instanceof C38365an) {
                    C38365an anVar = (C38365an) vVar2;
                    String string2 = this.f97386J.getString(R.string.hem);
                    C52711k.m112236a((Object) string2, "mFragment.getString(R.string.see_all)");
                    C52711k.m112240b(string2, "collapseText");
                    anVar.f97627d.setText(string2);
                    vVar2.itemView.setOnClickListener(new C38261c(this));
                    return;
                }
                break;
            case 2003:
                if (vVar2 instanceof C38366ao) {
                    C38366ao aoVar = (C38366ao) vVar2;
                    Context context6 = aoVar.f97110c;
                    if (context6 == null) {
                        C52711k.m112234a();
                    }
                    MtEmptyView a = MtEmptyView.m21697a(context6);
                    Context context7 = aoVar.f97110c;
                    if (context7 == null) {
                        C52711k.m112234a();
                    }
                    a.setStatus(new C10723a(context7).mo19277a((int) R.drawable.cl7).mo19280b((int) R.string.cj4).mo19282c(R.string.cjr).f28711a);
                    Context context8 = aoVar.f97110c;
                    if (context8 == null) {
                        C52711k.m112234a();
                    }
                    C10722c cVar = new C10723a(context8).mo19280b((int) R.string.goh).mo19281b("").f28711a;
                    C10719a a2 = C10719a.m21676a(aoVar.f97110c).mo19223a();
                    if (!C38455d.m85779a()) {
                        a2.mo19231b((View) a);
                    } else {
                        a2.mo19229a(cVar);
                    }
                    aoVar.f97629d.setBuilder(a2);
                    aoVar.f97629d.mo19209d();
                    DmtStatusView dmtStatusView = aoVar.f97629d;
                    dmtStatusView.mo19213g();
                    dmtStatusView.setFocusable(false);
                    dmtStatusView.setFocusableInTouchMode(false);
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo50303a(List<MusNotice> list) {
        this.f97388a = list;
        int i = 0;
        this.f97383G = 0;
        Integer num = null;
        this.f97392e = null;
        this.f97384H = false;
        this.f97393f = false;
        this.f97394g = true;
        if (list == null || list.size() <= 0) {
            super.mo50303a(m85460f(list));
        } else {
            super.mo50303a(m85460f(m85462g(list)));
        }
        LinearLayoutManager linearLayoutManager = this.f97385I;
        if (linearLayoutManager != null) {
            num = Integer.valueOf(linearLayoutManager.mo4751l());
        }
        if (num != null && num.intValue() >= 0) {
            int intValue = num.intValue();
            if (intValue >= 0) {
                while (true) {
                    mo78237e(i);
                    if (i == intValue) {
                        break;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo78235a(List<User> list, int i, int i2) {
        C52711k.m112240b(list, "list");
        this.f97381E = i2;
        if (i == 0) {
            this.f97378B = null;
        } else {
            C38336e eVar = new C38336e();
            eVar.setType(13);
            eVar.f97568b = list;
            eVar.f97567a = i;
            this.f97378B = eVar;
        }
        super.mo50303a(m85460f(mo50673a()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[LOOP:0: B:1:0x0012->B:14:0x003e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[EDGE_INSN: B:19:0x0042->B:16:0x0042 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78234a(com.p683ss.android.ugc.aweme.profile.model.User r6) {
        /*
            r5 = this;
            java.lang.String r0 = "user"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.util.List r0 = r5.f70670n
            java.lang.String r1 = "mItems"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0012:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.notification.p2015e.C38178a
            if (r4 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.notification.e.a r3 = (com.p683ss.android.ugc.aweme.notification.p2015e.C38178a) r3
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f97243b
            if (r3 == 0) goto L_0x002d
            java.lang.String r3 = r3.getUid()
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            java.lang.String r4 = r6.getUid()
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
            if (r3 == 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 == 0) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0041:
            r2 = -1
        L_0x0042:
            r5.m85464g(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38258e.mo78234a(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* renamed from: g */
    private final void m85463g() {
        Dialog dialog = this.f97400y;
        if (dialog != null && dialog.isShowing()) {
            C38263f.m85484a(dialog);
        }
    }

    /* renamed from: e */
    public final void mo78238e(List<? extends MusNotice> list) {
        super.mo50304b(m85460f(list));
    }

    /* renamed from: c */
    public final void mo78236c(int i) {
        boolean z;
        this.f97379C = i;
        if (this.f97379C == 36) {
            z = true;
        } else {
            z = false;
        }
        this.f97380D = z;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f97385I = null;
    }

    /* renamed from: b */
    public final void mo50304b(List<? extends MusNotice> list) {
        if (list != null) {
            super.mo50304b(m85460f(m85462g(list)));
        } else {
            super.mo50304b(m85460f(list));
        }
    }

    /* renamed from: j */
    private static int m85467j(List<MusNotice> list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (!(list.get(i2) instanceof C38099m)) {
                i++;
                if (i >= 10) {
                    return i2 + 1;
                }
            }
        }
        return 0;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                this.f97385I = (LinearLayoutManager) layoutManager;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: f */
    private final List<MusNotice> m85460f(List<? extends MusNotice> list) {
        C38336e eVar = this.f97378B;
        MusNotice musNotice = this.f97401z;
        MusNotice musNotice2 = this.f97377A;
        List<MusNotice> arrayList = new ArrayList<>();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayList.size() > 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((MusNotice) arrayList.get(size)).getType() == 50 || ((MusNotice) arrayList.get(size)).getType() == 13 || ((MusNotice) arrayList.get(size)).getType() == 1000) {
                    arrayList.remove(size);
                }
            }
        }
        if (musNotice2 != null && this.f97380D) {
            arrayList.add(0, musNotice2);
        }
        if (musNotice != null && this.f97380D) {
            arrayList.add(0, musNotice);
        }
        if (eVar != null && this.f97380D) {
            arrayList.add(0, eVar);
        }
        return arrayList;
    }

    /* renamed from: g */
    private final void m85464g(int i) {
        if (i >= 0 && i < this.f70670n.size()) {
            boolean z = false;
            if (i == this.f70670n.size() - 1) {
                MusNotice musNotice = (MusNotice) this.f70670n.get(i - 1);
                if ((musNotice instanceof C38178a) && ((C38178a) musNotice).f97242a == 2000) {
                    z = true;
                }
            }
            this.f70670n.remove(i);
            notifyItemRemoved(i);
            if (z) {
                int i2 = i - 1;
                this.f70670n.remove(i2);
                notifyItemRemoved(i2);
            }
        }
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        int c = C0726c.m2098c(viewGroup.getContext(), R.color.a1a);
        this.f70682s = c;
        C1352v a_ = super.mo49730a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(c);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setText(R.string.blg);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) dmtTextView));
            C52711k.m112236a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: e */
    public final void mo78237e(int i) {
        if (i >= 0 && i < mo50673a().size() && mo48641a(i) == 1001) {
            try {
                LiveNotice liveNotice = ((MusNotice) mo50673a().get(i)).getLiveNotice();
                if (liveNotice != null) {
                    User user = liveNotice.getUser();
                    if (user != null) {
                        RoomInfo roomInfo = liveNotice.getRoomInfo();
                        if (roomInfo != null) {
                            long roomId = roomInfo.getRoomId();
                            LogHelper a = C26052as.m63104a();
                            String uid = user.getUid();
                            C52711k.m112236a((Object) uid, "user.uid");
                            a.logLiveShow(uid, roomId, "message", "live_cell", user.getRequestId(), i - 1, true, "");
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    private final boolean m85461f(int i) {
        if (i > 0) {
            Iterable a = C52753d.m112318a(i - 1, 0);
            Collection arrayList = new ArrayList(C52575l.m112104a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add((MusNotice) this.f70670n.get(((C52549aa) it).mo110114a()));
            }
            for (MusNotice musNotice : (List) arrayList) {
                if (musNotice instanceof C38099m) {
                    if (musNotice.timeLineType == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    private final void m85466i(List<MusNotice> list) {
        if (NoticeCollapsilitySetting.getNoticeCount() != 0 && this.f97398k - this.f97383G > NoticeCollapsilitySetting.getNoticeCount() && this.f97384H && !this.f97393f) {
            this.f97392e = new ArrayList();
            int j = m85467j(list);
            if (j != 0) {
                int size = list.size() - 1;
                if (size >= j) {
                    while (true) {
                        if (!(((MusNotice) list.get(size)).getType() == 2000 || ((MusNotice) list.get(size)).getType() == 2001 || ((MusNotice) list.get(size)).getType() == 2003)) {
                            if (((MusNotice) list.get(size)).getNeedCollapse()) {
                                List<MusNotice> list2 = this.f97392e;
                                if (list2 == null) {
                                    C52711k.m112234a();
                                }
                                list2.add(list.get(size));
                            }
                            if (size == j || !((MusNotice) list.get(size)).getNeedCollapse()) {
                                this.f97393f = true;
                            }
                        }
                        if (size == j) {
                            break;
                        }
                        size--;
                    }
                    this.f97393f = true;
                    if (this.f97392e != null) {
                        list.add(size + 1, this.f97395h);
                        List<MusNotice> list3 = this.f97392e;
                        if (list3 == null) {
                            C52711k.m112234a();
                        }
                        C52575l.m112113d(list3);
                        if (this.f97392e != null) {
                            List<MusNotice> list4 = this.f97392e;
                            if (list4 == null) {
                                C52711k.m112234a();
                            }
                            list.removeAll(list4);
                            notifyDataSetChanged();
                        }
                        C38259a aVar = this.f97396i;
                        if (aVar != null) {
                            aVar.mo78239a(list);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        int i2;
        MusNotice musNotice = (MusNotice) mo50673a().get(i);
        if (musNotice == null) {
            i2 = 0;
        } else if (musNotice instanceof C38099m) {
            return 999;
        } else {
            if (musNotice instanceof C38178a) {
                i2 = ((C38178a) musNotice).f97242a;
            } else {
                if ((musNotice.getType() == 1 || musNotice.getType() == 11) && musNotice.getAnnouncement() != null) {
                    AnnouncementNotice announcement = musNotice.getAnnouncement();
                    C52711k.m112236a((Object) announcement, "notice.announcement");
                    if (announcement.getChallenge() != null) {
                        i2 = BaseNotice.HASHTAG;
                    }
                }
                if (musNotice.getType() == 31 && musNotice.getCommentNotice() != null) {
                    CommentNotice commentNotice = musNotice.getCommentNotice();
                    C52711k.m112236a((Object) commentNotice, "notice.commentNotice");
                    if (commentNotice.isReplyWithVideo()) {
                        i2 = BaseNotice.COMMENT_REPLY_WITH_VIDEO;
                    }
                }
                return musNotice.getType();
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final void mo78105b(int i) {
        if (i < mo50673a().size()) {
            Object obj = mo50673a().get(i);
            C52711k.m112236a(obj, "data[position]");
            if (((MusNotice) obj).getType() != 2000) {
                Object obj2 = mo50673a().get(i);
                C52711k.m112236a(obj2, "data[position]");
                if (((MusNotice) obj2).getType() != 2001) {
                    Object obj3 = mo50673a().get(i);
                    C52711k.m112236a(obj3, "data[position]");
                    if (((MusNotice) obj3).getType() != 2002) {
                        Object obj4 = mo50673a().get(i);
                        C52711k.m112236a(obj4, "data[position]");
                        if (((MusNotice) obj4).getType() != 2003) {
                            Dialog dialog = this.f97400y;
                            if (dialog == null || !dialog.isShowing()) {
                                C26891a aVar = new C26891a(this.f97386J.getContext());
                                String[] strArr = new String[1];
                                Context context = this.f97386J.getContext();
                                if (context == null) {
                                    C52711k.m112234a();
                                }
                                C52711k.m112236a((Object) context, "mFragment.context!!");
                                strArr[0] = context.getResources().getString(R.string.ao2);
                                aVar.mo54844a((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C38262d(this, i));
                                this.f97400y = aVar.mo54842a();
                                Dialog dialog2 = this.f97400y;
                                if (dialog2 != null) {
                                    dialog2.show();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        if ((r10.getTimeInMillis() - r7) >= (((long) r9) * com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime.group0)) goto L_0x006f;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m85465h(java.util.List<com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r15) {
        /*
            r14 = this;
            int r0 = r14.f97389b
            java.util.Iterator r1 = r15.iterator()
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0009:
            boolean r5 = r1.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r1.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r5 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r5
            int r7 = r5.getType()
            switch(r7) {
                case 13: goto L_0x0036;
                case 50: goto L_0x0031;
                case 1000: goto L_0x002c;
                case 1001: goto L_0x0027;
                case 2000: goto L_0x0009;
                case 2001: goto L_0x0009;
                case 2003: goto L_0x0009;
                default: goto L_0x001d;
            }
        L_0x001d:
            if (r0 <= 0) goto L_0x003b
            r5.timeLineType = r2
            r5.setNeedCollapse(r2)
            int r0 = r0 + -1
            goto L_0x0009
        L_0x0027:
            int r4 = r4 + 1
            r5.timeLineType = r2
            goto L_0x006e
        L_0x002c:
            int r3 = r3 + 1
            r5.timeLineType = r2
            goto L_0x006e
        L_0x0031:
            int r3 = r3 + 1
            r5.timeLineType = r2
            goto L_0x006e
        L_0x0036:
            int r3 = r3 + 1
            r5.timeLineType = r2
            goto L_0x006e
        L_0x003b:
            long r7 = r5.getCreateTime()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            int r7 = com.p683ss.android.ugc.aweme.utils.C47903fw.m103622a(r7)
            r5.timeLineType = r7
            long r7 = r5.getCreateTime()
            long r7 = r7 * r9
            int r9 = com.p683ss.android.ugc.aweme.notification.newstyle.NoticeCollapsilitySetting.getCutOffDays()
            if (r9 <= 0) goto L_0x006e
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            java.lang.String r11 = "Calendar.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            long r10 = r10.getTimeInMillis()
            long r10 = r10 - r7
            long r7 = (long) r9
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 * r12
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            r5.setNeedCollapse(r6)
            goto L_0x0009
        L_0x0073:
            r14.f97383G = r2
            int r1 = r15.size()
            int r1 = r1 - r6
        L_0x007a:
            r5 = 2003(0x7d3, float:2.807E-42)
            r7 = 2000(0x7d0, float:2.803E-42)
            r8 = 2001(0x7d1, float:2.804E-42)
            if (r1 < 0) goto L_0x00c6
            java.lang.Object r9 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
            int r9 = r9.getType()
            if (r9 == r8) goto L_0x00c3
            java.lang.Object r8 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
            int r8 = r8.getType()
            if (r8 == r7) goto L_0x00c3
            java.lang.Object r7 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r7 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r7
            int r7 = r7.getType()
            if (r7 == r5) goto L_0x00c3
            java.lang.Object r5 = r15.get(r1)
            boolean r5 = r5 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38099m
            if (r5 == 0) goto L_0x00af
            goto L_0x00c3
        L_0x00af:
            java.lang.Object r5 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r5 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r5
            boolean r5 = r5.getNeedCollapse()
            if (r5 != 0) goto L_0x00c1
            int r5 = r14.f97383G
            int r5 = r5 + r6
            r14.f97383G = r5
            goto L_0x00c3
        L_0x00c1:
            r14.f97384H = r6
        L_0x00c3:
            int r1 = r1 + -1
            goto L_0x007a
        L_0x00c6:
            if (r4 > 0) goto L_0x00d3
            int r1 = r14.f97389b
            if (r1 <= 0) goto L_0x00cd
            goto L_0x00d3
        L_0x00cd:
            com.ss.android.ugc.aweme.notification.util.j r1 = com.p683ss.android.ugc.aweme.notification.util.C38443j.f97847f
            com.p683ss.android.ugc.aweme.notification.util.C38443j.m85763a(r2, r2, r2)
            goto L_0x00e0
        L_0x00d3:
            com.ss.android.ugc.aweme.notice.repo.list.bean.m r1 = new com.ss.android.ugc.aweme.notice.repo.list.bean.m
            r1.<init>(r2)
            r15.add(r3, r1)
            int r1 = r14.f97389b
            com.p683ss.android.ugc.aweme.notification.util.C38443j.m85763a(r6, r3, r1)
        L_0x00e0:
            int r1 = r15.size()
            int r1 = r1 - r6
        L_0x00e5:
            if (r1 < 0) goto L_0x015b
            java.lang.Object r2 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
            int r2 = r2.timeLineType
            if (r2 != 0) goto L_0x00f2
            return
        L_0x00f2:
            java.lang.Object r2 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
            int r2 = r2.getType()
            if (r2 == r8) goto L_0x0158
            java.lang.Object r2 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
            int r2 = r2.getType()
            if (r2 == r7) goto L_0x0158
            java.lang.Object r2 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
            int r2 = r2.getType()
            if (r2 != r5) goto L_0x0117
            goto L_0x0158
        L_0x0117:
            java.lang.Object r2 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
            int r2 = r2.timeLineType
            if (r1 != 0) goto L_0x0137
            com.ss.android.ugc.aweme.notice.repo.list.bean.m r3 = new com.ss.android.ugc.aweme.notice.repo.list.bean.m
            r3.<init>(r2)
            java.lang.Object r2 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
            boolean r2 = r2.getNeedCollapse()
            r3.setNeedCollapse(r2)
            r15.add(r0, r3)
            goto L_0x0158
        L_0x0137:
            int r3 = r1 + -1
            java.lang.Object r3 = r15.get(r3)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            int r3 = r3.timeLineType
            if (r2 == r3) goto L_0x0158
            com.ss.android.ugc.aweme.notice.repo.list.bean.m r3 = new com.ss.android.ugc.aweme.notice.repo.list.bean.m
            r3.<init>(r2)
            java.lang.Object r2 = r15.get(r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r2
            boolean r2 = r2.getNeedCollapse()
            r3.setNeedCollapse(r2)
            r15.add(r1, r3)
        L_0x0158:
            int r1 = r1 + -1
            goto L_0x00e5
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38258e.m85465h(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo78232a(TutorialVideoResp tutorialVideoResp) {
        MusNotice musNotice = new MusNotice(null, null, null, null, null, null, null, false, NormalGiftView.ALPHA_255, null);
        musNotice.setTutorialVideo(tutorialVideoResp);
        musNotice.setType(1000);
        this.f97377A = musNotice;
        super.mo50303a(m85460f(mo50673a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017d, code lost:
        if (r3 == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0192, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0199, code lost:
        if (r3.getTextNotice() != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a0, code lost:
        if (r3.getAnnouncement() != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a3, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a5, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r3 == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r3.getLiveNotice() != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r3.getTutorialVideo() != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        if (r3.getTcmNotice() != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        if (r3 == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e4, code lost:
        if (r3 == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ec, code lost:
        if (r3.getFollowNotice() != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0126, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0134, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0142, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0150, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015d, code lost:
        if (r5 != null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0164, code lost:
        if (r3.getFollowRequestNotice() != null) goto L_0x01a7;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> m85462g(java.util.List<? extends com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r10) {
        /*
            r9 = this;
            r9.m85463g()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r10 = r10.iterator()
        L_0x0017:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x01ae
            java.lang.Object r2 = r10.next()
            r3 = r2
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            int r4 = r3.getType()
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r4) {
                case 1: goto L_0x019c;
                case 2: goto L_0x0195;
                case 6: goto L_0x0180;
                case 9: goto L_0x0167;
                case 11: goto L_0x019c;
                case 12: goto L_0x0195;
                case 13: goto L_0x0160;
                case 21: goto L_0x0153;
                case 22: goto L_0x0146;
                case 23: goto L_0x0138;
                case 24: goto L_0x012a;
                case 31: goto L_0x00f0;
                case 33: goto L_0x00e8;
                case 41: goto L_0x00cc;
                case 45: goto L_0x00be;
                case 50: goto L_0x009a;
                case 61: goto L_0x0088;
                case 69: goto L_0x0070;
                case 1000: goto L_0x0068;
                case 1001: goto L_0x0056;
                case 1002: goto L_0x003a;
                case 2000: goto L_0x01a7;
                case 2001: goto L_0x01a7;
                case 2002: goto L_0x01a7;
                case 2003: goto L_0x01a7;
                default: goto L_0x002e;
            }
        L_0x002e:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r3 = r3.getCommentNotice()
            if (r3 == 0) goto L_0x01a5
            com.ss.android.ugc.aweme.comment.model.Comment r5 = r3.getComment()
            goto L_0x01a5
        L_0x003a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r3 = r3.getCheckProfileNotice()
            if (r3 == 0) goto L_0x0044
            java.util.List r5 = r3.getUsers()
        L_0x0044:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0051
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            goto L_0x0052
        L_0x0051:
            r3 = 1
        L_0x0052:
            if (r3 != 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0056:
            com.ss.android.ugc.aweme.services.function.FunctionSupportService r4 = com.p683ss.android.ugc.aweme.services.function.FunctionSupportService.INSTANCE
            com.ss.android.ugc.aweme.services.function.IFunctionKey r5 = com.p683ss.android.ugc.aweme.services.function.IFunctionKey.LIVE
            boolean r4 = r4.notSupport(r5)
            if (r4 != 0) goto L_0x01a3
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice r3 = r3.getLiveNotice()
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0068:
            com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp r3 = r3.getTutorialVideo()
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0070:
            com.ss.android.ugc.aweme.notice.repo.list.bean.d r4 = r3.getDonationNotice()
            if (r4 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.f96896a
            goto L_0x007a
        L_0x0079:
            r4 = r5
        L_0x007a:
            if (r4 == 0) goto L_0x01a3
            com.ss.android.ugc.aweme.notice.repo.list.bean.d r3 = r3.getDonationNotice()
            if (r3 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.profile.model.User r5 = r3.f96897b
        L_0x0084:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0088:
            com.ss.android.ugc.aweme.services.function.FunctionSupportService r4 = com.p683ss.android.ugc.aweme.services.function.FunctionSupportService.INSTANCE
            com.ss.android.ugc.aweme.services.function.IFunctionKey r5 = com.p683ss.android.ugc.aweme.services.function.IFunctionKey.LIVE
            boolean r4 = r4.notSupport(r5)
            if (r4 != 0) goto L_0x01a3
            com.ss.android.ugc.aweme.notice.repo.list.bean.r r3 = r3.getTcmNotice()
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x009a:
            com.ss.android.ugc.aweme.services.function.FunctionSupportService r4 = com.p683ss.android.ugc.aweme.services.function.FunctionSupportService.INSTANCE
            com.ss.android.ugc.aweme.services.function.IFunctionKey r8 = com.p683ss.android.ugc.aweme.services.function.IFunctionKey.LIVE
            boolean r4 = r4.notSupport(r8)
            if (r4 != 0) goto L_0x01a3
            com.ss.android.ugc.aweme.notice.repo.list.bean.n r3 = r3.getRecommendAvatars()
            if (r3 == 0) goto L_0x00ac
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r5 = r3.f96933a
        L_0x00ac:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x00b9
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r3 = 0
            goto L_0x00ba
        L_0x00b9:
            r3 = 1
        L_0x00ba:
            if (r3 != 0) goto L_0x01a3
            goto L_0x01a7
        L_0x00be:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe r3 = r3.getAtMe()
            if (r3 == 0) goto L_0x00c8
            com.ss.android.ugc.aweme.profile.model.User r5 = r3.getUser()
        L_0x00c8:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x00cc:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r3 = r3.getDiggNotice()
            if (r3 == 0) goto L_0x00d6
            java.util.List r5 = r3.getUsers()
        L_0x00d6:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x00e3
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r3 = 0
            goto L_0x00e4
        L_0x00e3:
            r3 = 1
        L_0x00e4:
            if (r3 != 0) goto L_0x01a3
            goto L_0x01a7
        L_0x00e8:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice r3 = r3.getFollowNotice()
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x00f0:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r4 = r3.getCommentNotice()
            if (r4 == 0) goto L_0x011c
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r4 = r3.getCommentNotice()
            java.lang.String r8 = "it.commentNotice"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
            boolean r4 = r4.isReplyWithVideo()
            if (r4 == 0) goto L_0x011c
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r3 = r3.getCommentNotice()
            java.lang.String r4 = "it.commentNotice"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.ss.android.ugc.aweme.comment.model.Comment r3 = r3.getComment()
            if (r3 == 0) goto L_0x0118
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.getAliasAweme()
        L_0x0118:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x011c:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r3 = r3.getCommentNotice()
            if (r3 == 0) goto L_0x0126
            com.ss.android.ugc.aweme.comment.model.Comment r5 = r3.getComment()
        L_0x0126:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x012a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice r3 = r3.getFriendNotice()
            if (r3 == 0) goto L_0x0134
            com.ss.android.ugc.aweme.profile.model.User r5 = r3.getUser()
        L_0x0134:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0138:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r3 = r3.getFollowApproveNotice()
            if (r3 == 0) goto L_0x0142
            com.ss.android.ugc.aweme.profile.model.User r5 = r3.getUser()
        L_0x0142:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0146:
            com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice r3 = r3.getPostNotice()
            if (r3 == 0) goto L_0x0150
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.getAweme()
        L_0x0150:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0153:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice r3 = r3.getDuetNotice()
            if (r3 == 0) goto L_0x015d
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.getAweme()
        L_0x015d:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0160:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r3 = r3.getFollowRequestNotice()
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0167:
            com.ss.android.ugc.aweme.notice.repo.list.bean.s r3 = r3.getVoteNotice()
            if (r3 == 0) goto L_0x016f
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r5 = r3.f96953a
        L_0x016f:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x017c
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x017a
            goto L_0x017c
        L_0x017a:
            r3 = 0
            goto L_0x017d
        L_0x017c:
            r3 = 1
        L_0x017d:
            if (r3 != 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0180:
            com.ss.android.ugc.aweme.services.function.FunctionSupportService r4 = com.p683ss.android.ugc.aweme.services.function.FunctionSupportService.INSTANCE
            com.ss.android.ugc.aweme.services.function.IFunctionKey r8 = com.p683ss.android.ugc.aweme.services.function.IFunctionKey.AD
            boolean r4 = r4.notSupport(r8)
            if (r4 != 0) goto L_0x01a3
            com.ss.android.ugc.aweme.notice.repo.list.bean.b r3 = r3.getAdHelperNotice()
            if (r3 == 0) goto L_0x0192
            java.lang.String r5 = r3.f96889a
        L_0x0192:
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x0195:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r3 = r3.getTextNotice()
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x019c:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r3 = r3.getAnnouncement()
            if (r3 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x01a3:
            r7 = 0
            goto L_0x01a7
        L_0x01a5:
            if (r5 == 0) goto L_0x01a3
        L_0x01a7:
            if (r7 == 0) goto L_0x0017
            r1.add(r2)
            goto L_0x0017
        L_0x01ae:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r10 = r1.iterator()
        L_0x01b6:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x01c9
            java.lang.Object r1 = r10.next()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r1 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r1
            r2.add(r1)
            goto L_0x01b6
        L_0x01c9:
            r9.m85465h(r0)
            boolean r10 = com.p683ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment.m75371b()
            if (r10 == 0) goto L_0x01df
            boolean r10 = r9.f97394g
            if (r10 == 0) goto L_0x01df
            boolean r10 = com.p683ss.android.ugc.aweme.notification.newstyle.NoticeCollapsilitySetting.needCollapse()
            if (r10 == 0) goto L_0x01df
            r9.m85466i(r0)
        L_0x01df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38258e.m85462g(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public final void mo78233a(C38101n nVar) {
        boolean z;
        if (nVar != null) {
            Collection collection = nVar.f96933a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                MusNotice musNotice = new MusNotice(null, null, null, null, null, null, null, false, NormalGiftView.ALPHA_255, null);
                musNotice.setRecommendAvatars(nVar);
                musNotice.setType(50);
                musNotice.setCreateTime(9223372036854775806L);
                this.f97401z = musNotice;
                C46641d.m101221b("message");
                C26052as.m63104a().logLiveMergeShow("message", false);
                super.mo50303a(m85460f(mo50673a()));
            }
        }
        this.f97401z = null;
        super.mo50303a(m85460f(mo50673a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b8, code lost:
        r0 = new com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38360aj(m85457a((int) com.ss.android.ugc.trill.R.layout.b35, r8, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01c5, code lost:
        r0 = new com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38413z(m85457a((int) com.ss.android.ugc.trill.R.layout.b35, r8, false), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01d1, code lost:
        if (r0 == null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d3, code lost:
        r0.f97003a = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01d8, code lost:
        if (r0 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01dc, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01dd, code lost:
        r8 = super.onCreateViewHolder(r8, r9);
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r8, "super.onCreateViewHolder(parent, viewType)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01e6, code lost:
        return r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p043v7.widget.RecyclerView.C1352v mo48221a(android.view.ViewGroup r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "parent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            r0 = 2132214172(0x7f17019c, float:2.0072178E38)
            r1 = 0
            switch(r9) {
                case 1: goto L_0x01c5;
                case 2: goto L_0x01b8;
                default: goto L_0x000c;
            }
        L_0x000c:
            switch(r9) {
                case 11: goto L_0x01b8;
                case 12: goto L_0x01c5;
                case 13: goto L_0x01a6;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r9) {
                case 21: goto L_0x0196;
                case 22: goto L_0x0186;
                case 23: goto L_0x0176;
                case 24: goto L_0x0166;
                default: goto L_0x0012;
            }
        L_0x0012:
            switch(r9) {
                case 999: goto L_0x0156;
                case 1000: goto L_0x0145;
                case 1001: goto L_0x0134;
                case 1002: goto L_0x0123;
                case 1003: goto L_0x0112;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r9) {
                case 2000: goto L_0x0101;
                case 2001: goto L_0x00e4;
                case 2002: goto L_0x00d3;
                case 2003: goto L_0x00c2;
                default: goto L_0x0018;
            }
        L_0x0018:
            r2 = 2132214159(0x7f17018f, float:2.0072152E38)
            switch(r9) {
                case 6: goto L_0x00b1;
                case 9: goto L_0x00a0;
                case 31: goto L_0x0092;
                case 33: goto L_0x0081;
                case 41: goto L_0x0070;
                case 45: goto L_0x005f;
                case 50: goto L_0x004e;
                case 61: goto L_0x003e;
                case 69: goto L_0x0030;
                case 101: goto L_0x0021;
                default: goto L_0x001e;
            }
        L_0x001e:
            r0 = 0
            goto L_0x01d1
        L_0x0021:
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.z r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.z
            r2 = 1
            r1.<init>(r0, r2)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0030:
            android.view.View r0 = m85457a(r2, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.f r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.f
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x003e:
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.ah r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.ah
            android.support.v4.app.Fragment r2 = r7.f97386J
            r1.<init>(r0, r2)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x004e:
            r0 = 2132214171(0x7f17019b, float:2.0072176E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.a.v r1 = new com.ss.android.ugc.aweme.notification.a.v
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x005f:
            r0 = 2132214157(0x7f17018d, float:2.0072148E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.r r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.r
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0070:
            r0 = 2132214169(0x7f170199, float:2.0072172E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.p r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.p
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0081:
            r0 = 2132214166(0x7f170196, float:2.0072166E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.n r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.n
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0092:
            android.view.View r0 = m85457a(r2, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.j r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.j
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x00a0:
            r0 = 2132214175(0x7f17019f, float:2.0072184E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.a.p r1 = new com.ss.android.ugc.aweme.notification.a.p
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x00b1:
            r0 = 2132214155(0x7f17018b, float:2.0072144E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.a.r r1 = new com.ss.android.ugc.aweme.notification.a.r
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x00c2:
            r0 = 2132215010(0x7f1704e2, float:2.0073878E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.ao r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.ao
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x00d3:
            r0 = 2132214142(0x7f17017e, float:2.0072118E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.an r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.an
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x00e4:
            com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView r0 = new com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView
            android.content.Context r2 = r8.getContext()
            java.lang.String r1 = "parent.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r1)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.notification.e.b r1 = new com.ss.android.ugc.aweme.notification.e.b
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0101:
            r0 = 2132214224(0x7f1701d0, float:2.0072284E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.ap r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.ap
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0112:
            r0 = 2132214173(0x7f17019d, float:2.007218E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.d r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.d
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0123:
            r0 = 2132214158(0x7f17018e, float:2.007215E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.ab r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.ab
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0134:
            r0 = 2132214170(0x7f17019a, float:2.0072174E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.af r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.af
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0145:
            r0 = 2132214150(0x7f170186, float:2.0072134E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.al r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.al
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0156:
            r0 = 2132214174(0x7f17019e, float:2.0072182E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.u r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.u
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0166:
            r0 = 2132214165(0x7f170195, float:2.0072164E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.a.t r1 = new com.ss.android.ugc.aweme.notification.a.t
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0176:
            r0 = 2132214156(0x7f17018c, float:2.0072146E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.x r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.x
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0186:
            r0 = 2132214160(0x7f170190, float:2.0072154E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.ad r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.ad
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x0196:
            r0 = 2132214164(0x7f170194, float:2.0072162E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.l r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.l
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x01a6:
            r0 = 2132214167(0x7f170197, float:2.0072168E38)
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.v r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.v
            android.support.v4.app.Fragment r2 = r7.f97386J
            r1.<init>(r0, r2)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x01b8:
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.aj r1 = new com.ss.android.ugc.aweme.notification.newstyle.f.aj
            r1.<init>(r0)
            r0 = r1
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
            goto L_0x01d1
        L_0x01c5:
            android.view.View r0 = m85457a(r0, r8, r1)
            com.ss.android.ugc.aweme.notification.newstyle.f.z r2 = new com.ss.android.ugc.aweme.notification.newstyle.f.z
            r2.<init>(r0, r1)
            r0 = r2
            com.ss.android.ugc.aweme.notification.a.o r0 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38135o) r0
        L_0x01d1:
            if (r0 == 0) goto L_0x01d8
            r1 = r7
            com.ss.android.ugc.aweme.notification.a.m r1 = (com.p683ss.android.ugc.aweme.notification.p2011a.C38131m) r1
            r0.f97003a = r1
        L_0x01d8:
            if (r0 == 0) goto L_0x01dd
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p043v7.widget.RecyclerView.C1352v) r0
            return r0
        L_0x01dd:
            android.support.v7.widget.RecyclerView$v r8 = super.onCreateViewHolder(r8, r9)
            java.lang.String r9 = "super.onCreateViewHolder(parent, viewType)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38258e.mo48221a(android.view.ViewGroup, int):android.support.v7.widget.RecyclerView$v");
    }

    /* renamed from: a */
    private static View m85457a(int i, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare… parent, attatchToParent)");
        return inflate;
    }

    public C38258e(Fragment fragment, String str, C52670a<C52860x> aVar) {
        C52711k.m112240b(fragment, "mFragment");
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(aVar, "onEmptyListener");
        this.f97386J = fragment;
        this.f97387K = str;
        this.f97399l = aVar;
    }

    /* renamed from: a */
    private static void m85458a(C1352v vVar, int i, int i2) {
        if (vVar != null) {
            try {
                ((C38383h) vVar).mo78306b(i);
            } catch (Exception unused) {
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder");
        }
    }

    /* renamed from: a */
    private final void m85459a(String str, int i, String str2) {
        C26890h.m65011a("notification_message_inner_message", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("account_type", str).mo47829a("client_order", String.valueOf(i)).mo47829a("tab_name", C38431c.m85742a(this.f97379C)).mo47829a("timeline", str2).mo47829a("scene_id", "1002").f61491a);
    }
}
