package com.p683ss.android.ugc.aweme.friends.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.p665a.C10635a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.github.p994a.p995a.C14721a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.challenge.model.Segment;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.friends.adapter.C32513a.C32516b;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32507d;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.b */
public final class C32519b extends C26844j {

    /* renamed from: f */
    public static final C32526c f84643f = new C32526c(null);

    /* renamed from: a */
    public List<? extends IMUser> f84644a;

    /* renamed from: b */
    public List<? extends SummonFriendItem> f84645b;

    /* renamed from: c */
    public String f84646c = "";

    /* renamed from: d */
    public int f84647d = -1;

    /* renamed from: e */
    public C32520a f84648e;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.b$a */
    public interface C32520a {
        /* renamed from: a */
        String mo65821a();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.b$b */
    public static final class C32521b extends C10635a<IMUser> {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f84649a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32521b.class), "highlightColor", "getHighlightColor()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32521b.class), "douyinNickNamePrefix", "getDouyinNickNamePrefix()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C32521b.class), "idPrefix", "getIdPrefix()Ljava/lang/String;"))};

        /* renamed from: b */
        public TextView f84650b;

        /* renamed from: c */
        public TextView f84651c;

        /* renamed from: d */
        public AvatarImageWithVerify f84652d;

        /* renamed from: e */
        public TextView f84653e;

        /* renamed from: f */
        public TextView f84654f;

        /* renamed from: g */
        public ImageView f84655g;

        /* renamed from: h */
        public int f84656h = -1;

        /* renamed from: i */
        public String f84657i = "";

        /* renamed from: j */
        public C32520a f84658j;

        /* renamed from: k */
        final C52668f f84659k = C52732g.m112285a(new C32525d(this));

        /* renamed from: l */
        public final View f84660l;

        /* renamed from: m */
        public final C32519b f84661m;

        /* renamed from: n */
        private final C52668f f84662n = C52732g.m112285a(new C32524c(this));

        /* renamed from: o */
        private final C52668f f84663o = C52732g.m112285a(new C32523b(this));

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.b$b$a */
        static final class C32522a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32521b f84664a;

            /* renamed from: b */
            final /* synthetic */ User f84665b;

            C32522a(C32521b bVar, User user) {
                this.f84664a = bVar;
                this.f84665b = user;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                if (this.f84664a.f84656h == 0) {
                    String str2 = "add_video_at";
                    C23089d a = C23089d.m56640a().mo47829a("search_keyword", this.f84664a.f84657i);
                    String str3 = "log_pb";
                    C29981aa a2 = C29981aa.m70153a();
                    C32520a aVar = this.f84664a.f84658j;
                    if (aVar != null) {
                        str = aVar.mo65821a();
                    } else {
                        str = null;
                    }
                    C26890h.m65014b(str2, C23198ae.m56851a(a.mo47829a(str3, a2.mo60161a(str)).mo47829a("to_user_id", this.f84665b.getUid()).f61491a));
                }
                IAccountUserService a3 = C20902b.m53242a();
                C52711k.m112236a((Object) a3, "AccountUserProxyService.get()");
                if (!TextUtils.equals(a3.getCurUserId(), this.f84665b.getUid())) {
                    C26890h.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f84665b.getUid()));
                    C47718bf.m103288a(new C32507d(this.f84665b));
                    return;
                }
                View view2 = this.f84664a.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                C10691a.m21542b(view2.getContext(), (int) R.string.cgz).mo19066a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.b$b$b */
        static final class C32523b extends C52712l implements C52670a<String> {

            /* renamed from: a */
            final /* synthetic */ C32521b f84666a;

            C32523b(C32521b bVar) {
                this.f84666a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return this.f84666a.f84660l.getResources().getString(R.string.b50);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.b$b$c */
        static final class C32524c extends C52712l implements C52670a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C32521b f84667a;

            C32524c(C32521b bVar) {
                this.f84667a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(this.f84667a.f84660l.getResources().getColor(R.color.a0y));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.b$b$d */
        static final class C32525d extends C52712l implements C52670a<String> {

            /* renamed from: a */
            final /* synthetic */ C32521b f84668a;

            C32525d(C32521b bVar) {
                this.f84668a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return this.f84668a.f84660l.getResources().getString(R.string.bdn);
            }
        }

        /* renamed from: a */
        public final void mo18876a() {
        }

        /* renamed from: b */
        public final int mo65824b() {
            return ((Number) this.f84662n.getValue()).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final String mo65825c() {
            return (String) this.f84663o.getValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo65823a(User user) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            view.setBackground(C10678c.m21505e(view2.getContext()));
            AvatarImageWithVerify avatarImageWithVerify = this.f84652d;
            String customVerify = user.getCustomVerify();
            Integer valueOf = Integer.valueOf(user.getVerificationType());
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), customVerify, user.getEnterpriseVerifyReason(), valueOf, user.getWeiboVerify());
            avatarImageWithVerify.setUserData(userVerify);
            AvatarImageWithVerify avatarImageWithVerify2 = this.f84652d;
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            C32531g.m75277a(avatarImageWithVerify2, view3.getContext(), user, this.f84653e);
            if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
                this.f84653e.setVisibility(0);
                this.f84654f.setVisibility(0);
                this.f84653e.setText(C47915gg.m103656e(user));
                this.f84654f.setText(C47915gg.m103666o(user));
            }
            if (user.getFollowStatus() == 2) {
                this.f84655g.setVisibility(0);
                this.f84655g.setImageResource(R.drawable.zs);
            } else {
                this.f84655g.setVisibility(8);
            }
            this.f84651c.setVisibility(8);
            this.f84660l.setOnClickListener(new C32522a(this, user));
        }

        public C32521b(View view, C32519b bVar) {
            C52711k.m112240b(view, "container");
            C52711k.m112240b(bVar, "adapter");
            super(view);
            this.f84660l = view;
            this.f84661m = bVar;
            View findViewById = this.f84660l.findViewById(R.id.ck5);
            C52711k.m112236a((Object) findViewById, "container.findViewById(R.id.sectionLabel)");
            this.f84650b = (TextView) findViewById;
            View findViewById2 = this.f84660l.findViewById(R.id.atd);
            C52711k.m112236a((Object) findViewById2, "container.findViewById(R.id.indexLabel)");
            this.f84651c = (TextView) findViewById2;
            View findViewById3 = this.f84660l.findViewById(R.id.hi);
            C52711k.m112236a((Object) findViewById3, "container.findViewById(R.id.avatar)");
            this.f84652d = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = this.f84660l.findViewById(R.id.bpp);
            C52711k.m112236a((Object) findViewById4, "container.findViewById(R.id.name)");
            this.f84653e = (TextView) findViewById4;
            View findViewById5 = this.f84660l.findViewById(R.id.a4e);
            C52711k.m112236a((Object) findViewById5, "container.findViewById(R.id.desc)");
            this.f84654f = (TextView) findViewById5;
            View findViewById6 = this.f84660l.findViewById(R.id.cb1);
            C52711k.m112236a((Object) findViewById6, "container.findViewById(R.id.relation)");
            this.f84655g = (ImageView) findViewById6;
        }

        /* renamed from: a */
        public final void mo65822a(SummonFriendItem summonFriendItem, int i) {
            int i2;
            C52711k.m112240b(summonFriendItem, "data");
            User user = summonFriendItem.mUser;
            List<? extends IMUser> list = this.f84661m.f84644a;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i == i2) {
                this.f84650b.setVisibility(0);
                this.f84650b.setText(R.string.ks);
            } else {
                this.f84650b.setVisibility(8);
            }
            this.f84654f.setVisibility(0);
            C52711k.m112236a((Object) user, "user");
            if (TextUtils.isEmpty(user.getSignature())) {
                this.f84654f.setVisibility(8);
            } else {
                this.f84654f.setText(user.getSignature());
            }
            C52711k.m112236a((Object) user, "user");
            SpannableString spannableString = new SpannableString(user.getNickname());
            List<Segment> list2 = summonFriendItem.segments;
            if (list2 != null) {
                for (Segment segment : list2) {
                    C52711k.m112236a((Object) segment, "seg");
                    int i3 = segment.begin;
                    int i4 = segment.end + 1;
                    CharSequence charSequence = spannableString;
                    if (!TextUtils.isEmpty(charSequence)) {
                        int max = Math.max(0, i3);
                        if (!TextUtils.isEmpty(charSequence) && max <= i4 && max < spannableString.length() && i4 <= spannableString.length()) {
                            spannableString.setSpan(new ForegroundColorSpan(mo65824b()), max, i4, 17);
                        }
                    }
                }
            }
            this.f84653e.setText(spannableString);
            mo65823a(user);
        }

        /* renamed from: a */
        static SpannableString m75267a(int i, String str, String str2, int i2) {
            if (C52830p.m112454b((CharSequence) str2, '.', false, 2, (Object) null)) {
                str2 = C52830p.m112401a(str2, ClassUtils.PACKAGE_SEPARATOR, "\\.", false, 4, (Object) null);
            }
            SpannableString spannableString = new SpannableString(str);
            try {
                Pattern compile = Pattern.compile(str2);
                if (compile == null) {
                    C52711k.m112234a();
                }
                Matcher matcher = compile.matcher(spannableString);
                if (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (start >= i2) {
                        spannableString.setSpan(new ForegroundColorSpan(i), start, end, 33);
                    }
                }
                return spannableString;
            } catch (PatternSyntaxException unused) {
                return spannableString;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.b$c */
    public static final class C32526c {
        private C32526c() {
        }

        public /* synthetic */ C32526c(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m75273a(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    CharSequence obj = C52830p.m112447b(str).toString();
                    for (int i = 0; i < obj.length(); i++) {
                        sb.append(C14721a.m30100a(obj.charAt(i)));
                    }
                    String sb2 = sb.toString();
                    if (sb2 != null) {
                        return sb2;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return "";
        }

        /* renamed from: b */
        public static String m75274b(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    CharSequence obj = C52830p.m112447b(str).toString();
                    for (int i = 0; i < obj.length(); i++) {
                        sb.append(C14721a.m30100a(obj.charAt(i)).charAt(0));
                    }
                    String sb2 = sb.toString();
                    if (sb2 != null) {
                        return sb2;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return "";
        }
    }

    /* renamed from: c */
    public final int mo48636c() {
        int i;
        List<? extends IMUser> list = this.f84644a;
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<? extends SummonFriendItem> list2 = this.f84645b;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.s5, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…at_friend, parent, false)");
        return new C32521b(inflate, this);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        List<? extends IMUser> list = this.f84644a;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (vVar != null) {
            C32521b bVar = (C32521b) vVar;
            bVar.f84656h = this.f84647d;
            String str = this.f84646c;
            C52711k.m112240b(str, "<set-?>");
            bVar.f84657i = str;
            bVar.f84658j = this.f84648e;
            if (i < i2) {
                List<? extends IMUser> list2 = this.f84644a;
                if (list2 != null) {
                    IMUser iMUser = (IMUser) list2.get(i);
                    C52711k.m112240b(iMUser, "user");
                    bVar.f84653e.setText(iMUser.getNickName());
                    if (i == 0) {
                        bVar.f84650b.setVisibility(0);
                        bVar.f84650b.setText(R.string.kw);
                    } else {
                        bVar.f84650b.setVisibility(8);
                    }
                    TextView textView = bVar.f84653e;
                    String str2 = bVar.f84661m.f84646c;
                    if (str2 != null) {
                        String lowerCase = str2.toLowerCase();
                        C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        String nickName = iMUser.getNickName();
                        if (!TextUtils.isEmpty(nickName)) {
                            C52711k.m112236a((Object) nickName, LeakCanaryFileProvider.f132049i);
                            if (nickName != null) {
                                String lowerCase2 = nickName.toLowerCase();
                                C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                                int a = C52830p.m112419a((CharSequence) lowerCase2, lowerCase, 0, false, 6, (Object) null);
                                if (a != -1 && a < nickName.length() && lowerCase.length() + a <= nickName.length()) {
                                    lowerCase = nickName.substring(a, lowerCase.length() + a);
                                    C52711k.m112236a((Object) lowerCase, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                }
                            } else {
                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                        int b = bVar.mo65824b();
                        String displayName = iMUser.getDisplayName();
                        C52711k.m112236a((Object) displayName, "user.displayName");
                        textView.setText(C32521b.m75267a(b, displayName, lowerCase, 0));
                        TextView textView2 = bVar.f84654f;
                        String str3 = bVar.f84661m.f84646c;
                        textView2.setVisibility(0);
                        if (iMUser.getSearchType() == 5) {
                            textView2.setText(iMUser.getSignature());
                        } else if (iMUser.getSearchType() == 3) {
                            if (TextUtils.isEmpty(iMUser.getRemarkName())) {
                                textView2.setText(iMUser.getSignature());
                            } else {
                                int b2 = bVar.mo65824b();
                                StringBuilder sb = new StringBuilder();
                                sb.append(bVar.mo65825c());
                                sb.append(iMUser.getNickName());
                                String sb2 = sb.toString();
                                String convertSearchKeyword = C33194e.m76279d().convertSearchKeyword(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str3);
                                C52711k.m112236a((Object) convertSearchKeyword, "IM.get().convertSearchKe…nickNameInitial, keyword)");
                                textView2.setText(C32521b.m75267a(b2, sb2, convertSearchKeyword, bVar.mo65825c().length()));
                            }
                        } else if (iMUser.getSearchType() == 1) {
                            String str4 = (String) bVar.f84659k.getValue();
                            String displayId = iMUser.getDisplayId();
                            int b3 = bVar.mo65824b();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str4);
                            sb3.append(displayId);
                            String sb4 = sb3.toString();
                            String convertSearchKeyword2 = C33194e.m76279d().convertSearchKeyword(displayId, C32526c.m75273a(displayId), C32526c.m75274b(displayId), str3);
                            C52711k.m112236a((Object) convertSearchKeyword2, "IM.get().convertSearchKe…nyinInitial(id), keyword)");
                            textView2.setText(C32521b.m75267a(b3, sb4, convertSearchKeyword2, str4.length()));
                        } else if (iMUser.getSearchType() == 2) {
                            int b4 = bVar.mo65824b();
                            String string = bVar.f84660l.getResources().getString(R.string.bg5, new Object[]{iMUser.getContactName()});
                            C52711k.m112236a((Object) string, "container.resources.getS…t_name, user.contactName)");
                            String convertSearchKeyword3 = C33194e.m76279d().convertSearchKeyword(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str3);
                            C52711k.m112236a((Object) convertSearchKeyword3, "IM.get().convertSearchKe…tactNameInitial, keyword)");
                            textView2.setText(C32521b.m75267a(b4, string, convertSearchKeyword3, 6));
                        } else {
                            textView2.setVisibility(8);
                        }
                        if (TextUtils.isEmpty(textView2.getText())) {
                            textView2.setVisibility(8);
                        }
                        bVar.mo65823a(C32516b.m75260a(iMUser));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    return;
                }
            } else {
                List<? extends SummonFriendItem> list3 = this.f84645b;
                if (list3 != null) {
                    bVar.mo65822a((SummonFriendItem) list3.get(i - i2), i);
                    return;
                }
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.AtViewHolder");
    }
}
