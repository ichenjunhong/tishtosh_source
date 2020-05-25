package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38269j;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38135o;
import com.p683ss.android.ugc.aweme.notification.p2031ui.C38425a;
import com.p683ss.android.ugc.aweme.notification.util.C38440h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.h */
public class C38383h extends C38135o {

    /* renamed from: h */
    static final /* synthetic */ C52767h[] f97670h = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38383h.class), "normalTextColor", "getNormalTextColor()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38383h.class), "pressedTextColor", "getPressedTextColor()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38383h.class), "andText", "getAndText()Ljava/lang/String;"))};

    /* renamed from: k */
    public static final boolean f97671k = false;

    /* renamed from: l */
    public static final C38384a f97672l = new C38384a(null);

    /* renamed from: d */
    private final C52668f f97673d = C52732g.m112285a(new C38386c(this));

    /* renamed from: e */
    private final C52668f f97674e = C52732g.m112285a(new C38388e(this));

    /* renamed from: f */
    private final C52668f f97675f = C52732g.m112285a(new C38385b(this));

    /* renamed from: i */
    public boolean f97676i;

    /* renamed from: j */
    public Bundle f97677j;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.h$a */
    public static final class C38384a {
        private C38384a() {
        }

        /* renamed from: a */
        private static boolean m85692a() {
            return C38383h.f97671k;
        }

        public /* synthetic */ C38384a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo78308a(BaseNotice baseNotice, boolean z) {
            if (C38415g.m85730b()) {
                return "notification_page";
            }
            if (baseNotice != null) {
                int a = C38269j.m85499a(baseNotice);
                if (a != 9) {
                    if (a != 31) {
                        if (a != 33) {
                            if (a != 41) {
                                if (a != 45) {
                                    return "notification_page";
                                }
                                if (z) {
                                    return "at";
                                }
                                return "message_at";
                            } else if (z) {
                                return "like";
                            } else {
                                return "message_like";
                            }
                        } else if (z) {
                            return "fans";
                        } else {
                            return "message_fans";
                        }
                    } else if (z) {
                        return "comment";
                    } else {
                        return "message_comment";
                    }
                } else if (z) {
                    return "pollsticker";
                } else {
                    return "message_vote";
                }
            } else if (!m85692a()) {
                return "notification_page";
            } else {
                throw new IllegalStateException("黑T请传basenotice字段");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.h$b */
    static final class C38385b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C38383h f97678a;

        C38385b(C38383h hVar) {
            this.f97678a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f97678a.f97110c.getString(R.string.ckk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.h$c */
    static final class C38386c extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C38383h f97679a;

        C38386c(C38383h hVar) {
            this.f97679a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f97679a.f97110c;
            C52711k.m112236a((Object) context, "context");
            return Integer.valueOf(context.getResources().getColor(R.color.a17));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.h$d */
    public static final class C38387d implements C38349a {

        /* renamed from: a */
        final /* synthetic */ C38383h f97680a;

        /* renamed from: b */
        final /* synthetic */ int f97681b;

        /* renamed from: c */
        final /* synthetic */ BaseNotice f97682c;

        /* renamed from: d */
        final /* synthetic */ String f97683d;

        /* renamed from: e */
        final /* synthetic */ String f97684e;

        /* renamed from: f */
        final /* synthetic */ boolean f97685f;

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo78294a(android.view.View r16, com.p683ss.android.ugc.aweme.profile.model.User r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                java.lang.String r1 = "v"
                r2 = r16
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
                int r1 = r0.f97681b
                switch(r1) {
                    case 0: goto L_0x00b9;
                    case 1: goto L_0x0023;
                    case 2: goto L_0x000f;
                    default: goto L_0x000d;
                }
            L_0x000d:
                goto L_0x011b
            L_0x000f:
                java.lang.String r1 = "check_profile"
                com.ss.android.ugc.aweme.notification.newstyle.f.h r3 = r0.f97680a
                int r3 = r3.getLayoutPosition()
                com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h.m85236a(r1, r3)
                android.content.Context r1 = r16.getContext()
                com.p683ss.android.ugc.aweme.notification.utils.C38454c.m85775a(r1)
                goto L_0x011b
            L_0x0023:
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r1 = r0.f97682c
                if (r1 == 0) goto L_0x00b8
                com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r1 = r1.getDiggNotice()
                if (r1 == 0) goto L_0x00b8
                boolean r3 = com.p683ss.android.ugc.aweme.notification.newstyle.C38415g.m85732d()
                if (r3 == 0) goto L_0x009c
                int r3 = r1.getDiggType()
                if (r3 == 0) goto L_0x009c
                int r3 = r1.getDiggType()
                r4 = 3
                r5 = 0
                if (r3 != r4) goto L_0x004f
                com.ss.android.ugc.aweme.comment.model.Comment r3 = r1.getComment()
                if (r3 == 0) goto L_0x004d
                java.lang.String r3 = r3.getCid()
            L_0x004b:
                r8 = r3
                goto L_0x005a
            L_0x004d:
                r8 = r5
                goto L_0x005a
            L_0x004f:
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.getAweme()
                if (r3 == 0) goto L_0x004d
                java.lang.String r3 = r3.getAid()
                goto L_0x004b
            L_0x005a:
                android.content.Context r6 = r16.getContext()
                java.lang.String r2 = "v.context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.getAweme()
                if (r2 == 0) goto L_0x006d
                java.lang.String r5 = r2.getAid()
            L_0x006d:
                r7 = r5
                boolean r9 = r0.f97685f
                int r10 = r1.getDiggType()
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r2 = r0.f97682c
                long r11 = r2.getLastReadTime()
                com.ss.android.ugc.aweme.comment.model.Comment r2 = r1.getComment()
                java.lang.String r13 = com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38328b.m85623a(r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getAweme()
                java.lang.String r2 = "this.aweme"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
                java.lang.String r2 = "this.aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.base.model.UrlModel r14 = r1.getOriginCover()
                com.p683ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity.C38223a.m85414a(r6, r7, r8, r9, r10, r11, r13, r14)
                goto L_0x00b8
            L_0x009c:
                com.ss.android.ugc.aweme.notification.newstyle.f.h r2 = r0.f97680a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.getAweme()
                java.lang.String r4 = "aweme"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.String r3 = r3.getAid()
                java.lang.String r4 = "aweme.aid"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.String r1 = r1.getCid()
                r2.mo78305a(r3, r1)
                goto L_0x011b
            L_0x00b8:
                return
            L_0x00b9:
                com.ss.android.ugc.aweme.notification.newstyle.f.h$a r1 = com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h.f97672l
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r2 = r0.f97682c
                r3 = 1
                java.lang.String r6 = r1.mo78308a(r2, r3)
                r1 = r6
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r2 = "fans"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x00e5
                com.ss.android.ugc.aweme.notification.newstyle.f.h r1 = r0.f97680a
                android.content.Context r1 = r1.f97110c
                java.lang.String r2 = "context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.String r2 = "fans"
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r3 = r0.f97682c
                if (r3 == 0) goto L_0x00e1
                int r3 = r3.clientOrder
                goto L_0x00e2
            L_0x00e1:
                r3 = -1
            L_0x00e2:
                com.p683ss.android.ugc.aweme.notification.newstyle.C38415g.m85727a(r1, r2, r3)
            L_0x00e5:
                com.ss.android.ugc.aweme.notification.newstyle.f.h r4 = r0.f97680a
                java.lang.String r5 = "click"
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r7 = r0.f97682c
                java.lang.String r8 = r0.f97683d
                java.lang.String r9 = r0.f97684e
                r4.mo78108a(r5, r6, r7, r8, r9)
                if (r17 == 0) goto L_0x011b
                com.ss.android.ugc.aweme.notification.newstyle.f.h r2 = r0.f97680a
                java.lang.String r3 = r17.getUid()
                java.lang.String r4 = "user.uid"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.String r4 = r17.getSecUid()
                java.lang.String r1 = "user.secUid"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r5 = r0.f97682c
                r6 = 1
                r7 = 0
                r8 = 16
                r9 = 0
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h.m85681a(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x011b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h.C38387d.mo78294a(android.view.View, com.ss.android.ugc.aweme.profile.model.User, int):void");
        }

        C38387d(C38383h hVar, int i, BaseNotice baseNotice, String str, String str2, boolean z) {
            this.f97680a = hVar;
            this.f97681b = i;
            this.f97682c = baseNotice;
            this.f97683d = str;
            this.f97684e = str2;
            this.f97685f = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.h$e */
    static final class C38388e extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C38383h f97686a;

        C38388e(C38383h hVar) {
            this.f97686a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f97686a.f97110c;
            C52711k.m112236a((Object) context, "context");
            return Integer.valueOf(context.getResources().getColor(R.color.a19));
        }
    }

    /* renamed from: d */
    private int mo78297d() {
        return ((Number) this.f97674e.getValue()).intValue();
    }

    /* renamed from: e */
    private String mo78298e() {
        return (String) this.f97675f.getValue();
    }

    /* renamed from: c */
    public int mo78097c() {
        return R.id.bu1;
    }

    /* renamed from: h */
    public final int mo78307h() {
        return ((Number) this.f97673d.getValue()).intValue();
    }

    /* renamed from: a */
    public final void mo78303a(TextView textView, User user, BaseNotice baseNotice, String str, String str2) {
        C52711k.m112240b(textView, "textView");
        C52711k.m112240b(user, "user");
        textView.setText(m85676a(user, baseNotice, str, str2));
        textView.setMovementMethod(C38425a.m85737a());
        Context context = this.f97110c;
        UserVerify userVerify = new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null, null, 25, null);
        C47916gh.m103674a(context, userVerify, textView);
    }

    /* renamed from: a */
    public final void mo78304a(TextView textView, List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        TextView textView2 = textView;
        List<? extends User> list2 = list;
        C52711k.m112240b(textView, "textView");
        textView.setText(m85677a(list, i, i2, baseNotice, z, str, str2));
        textView.setMovementMethod(C38425a.m85737a());
        if (list2 != null) {
            if (list.size() == 1) {
                Context context = this.f97110c;
                UserVerify userVerify = new UserVerify(null, ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), null, null, 25, null);
                C47916gh.m103674a(context, userVerify, textView);
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo78305a(String str, String str2) {
        C52711k.m112240b(str, "aid");
        SmartRouter.buildRoute(C11010c.m22280a(), "aweme://aweme/detail/").withParam("id", str).withParam("refer", "message").withParam("cid", str2).open();
        C38415g gVar = C38415g.f97773a;
        Context context = this.f97110c;
        C52711k.m112236a((Object) context, "context");
        gVar.mo78318a(context);
    }

    /* renamed from: b */
    public void mo78306b(int i) {
        this.f97677j = null;
    }

    public C38383h(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
    }

    /* renamed from: a */
    private final SpannableStringBuilder m85676a(User user, BaseNotice baseNotice, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        m85682a(user, spannableStringBuilder, baseNotice, str, str2);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private final void m85682a(User user, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int length = spannableStringBuilder.length();
        CharSequence a = C38415g.m85724a(user);
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(a);
            spannableStringBuilder.setSpan(m85679a(user, 0, baseNotice, true, str, str2), length, spannableStringBuilder.length(), 33);
        }
    }

    /* renamed from: a */
    private void m85683a(String str, String str2, BaseNotice baseNotice, boolean z, String str3) {
        String str4;
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUid");
        mo78109b(str, str2, "message");
        if (TextUtils.isEmpty(str3)) {
            str3 = f97672l.mo78308a(baseNotice, false);
        }
        if (z) {
            str4 = "click_name";
        } else {
            str4 = "click_head";
        }
        m85185a(str, str3, str4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C38440h m85679a(User user, int i, BaseNotice baseNotice, boolean z, String str, String str2) {
        int h = mo78307h();
        int d = mo78297d();
        C38387d dVar = new C38387d(this, i, baseNotice, str, str2, z);
        C38440h hVar = new C38440h(user, i, h, d, dVar);
        return hVar;
    }

    /* renamed from: a */
    private final SpannableStringBuilder m85677a(List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        int i3;
        int i4;
        List<? extends User> list2 = list;
        int i5 = i;
        int i6 = i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list2 != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return m85676a((User) list2.get(0), baseNotice, str, str2);
            }
            BaseNotice baseNotice2 = baseNotice;
            String str3 = str;
            String str4 = str2;
            if (list.size() != 2 || 1 > i6 || 3 < i6) {
                if (list.size() == 3) {
                    i3 = 2;
                    i4 = 0;
                } else if (i6 == 3 && list.size() > 3) {
                    i4 = 0;
                    i3 = 2;
                } else if (list.size() > 1) {
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    BaseNotice baseNotice3 = baseNotice;
                    String str5 = str;
                    String str6 = str2;
                    m85682a((User) list2.get(0), spannableStringBuilder2, baseNotice3, str5, str6);
                    spannableStringBuilder.append(",").append(" ");
                    m85682a((User) list2.get(1), spannableStringBuilder2, baseNotice3, str5, str6);
                    spannableStringBuilder.append(" ").append(mo78298e()).append(" ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(this.f97110c.getString(R.string.ckj, new Object[]{Integer.valueOf(Math.max(i6, list.size()) - 2)}));
                    if (i5 == 2) {
                        spannableStringBuilder.setSpan(m85679a(null, 2, baseNotice, true, str, str2), length, spannableStringBuilder.length(), 33);
                    } else {
                        int i7 = length;
                        if (i5 == 1) {
                            spannableStringBuilder.setSpan(m85679a(null, 1, baseNotice, z, str, str2), i7, spannableStringBuilder.length(), 33);
                        }
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                BaseNotice baseNotice4 = baseNotice;
                String str7 = str;
                String str8 = str2;
                m85682a((User) list2.get(i4), spannableStringBuilder3, baseNotice4, str7, str8);
                spannableStringBuilder.append(", ");
                m85682a((User) list2.get(1), spannableStringBuilder3, baseNotice4, str7, str8);
                spannableStringBuilder.append(" ").append(mo78298e()).append(" ");
                m85682a((User) list2.get(i3), spannableStringBuilder3, baseNotice4, str7, str8);
            } else {
                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder;
                BaseNotice baseNotice5 = baseNotice;
                String str9 = str;
                String str10 = str2;
                m85682a((User) list2.get(0), spannableStringBuilder4, baseNotice5, str9, str10);
                spannableStringBuilder.append(" ").append(mo78298e()).append(" ");
                m85682a((User) list2.get(1), spannableStringBuilder4, baseNotice5, str9, str10);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static /* synthetic */ void m85681a(C38383h hVar, String str, String str2, BaseNotice baseNotice, boolean z, String str3, int i, Object obj) {
        boolean z2;
        if ((i & 4) != 0) {
            baseNotice = null;
        }
        BaseNotice baseNotice2 = baseNotice;
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        hVar.m85683a(str, str2, baseNotice2, z2, str3);
    }
}
