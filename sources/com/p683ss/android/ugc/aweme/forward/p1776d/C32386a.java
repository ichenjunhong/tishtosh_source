package com.p683ss.android.ugc.aweme.forward.p1776d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.comment.list.C25256e;
import com.p683ss.android.ugc.aweme.comment.list.C25261j;
import com.p683ss.android.ugc.aweme.comment.list.C25262k;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.C25707d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30505x;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30507y;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31759f;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31760g;
import com.p683ss.android.ugc.aweme.forward.model.C32413a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32375a.C32376a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32375a.C32377b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1995b.C37852b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.forward.d.a */
public class C32386a implements C30313ae<C30332aw>, C30447d, C32376a {

    /* renamed from: a */
    public C30303h f84281a;

    /* renamed from: b */
    public C25707d f84282b;

    /* renamed from: c */
    public C32377b f84283c;

    /* renamed from: d */
    public C25256e f84284d;

    /* renamed from: e */
    public C25262k f84285e;

    /* renamed from: f */
    public String f84286f;

    /* renamed from: g */
    public int f84287g;

    /* renamed from: h */
    public String f84288h;

    /* renamed from: i */
    public C25269r f84289i;

    /* renamed from: j */
    private C30507y f84290j;

    /* renamed from: k */
    private C32393d f84291k;

    /* renamed from: l */
    private C31758e f84292l = new C31760g() {
        /* renamed from: a */
        public final void mo64661a(View view, View view2, User user) {
        }

        /* renamed from: a */
        public final void mo64662a(View view, View view2, User user, String str, String str2) {
        }

        /* renamed from: a */
        public final void mo64703a(View view, Aweme aweme) {
        }

        /* renamed from: a */
        public final void mo64706a(Aweme aweme, Comment comment) {
        }

        /* renamed from: a */
        public final void mo64707a(Aweme aweme, Comment comment, int i) {
        }

        /* renamed from: a */
        public final void mo64708a(Aweme aweme, String str, String str2) {
        }

        /* renamed from: a */
        public final void mo64665a(Aweme aweme, List<String> list) {
        }

        /* renamed from: a */
        public final void mo64710a(Aweme aweme, List<User> list, Comment comment, String str) {
        }

        /* renamed from: a */
        public final void mo64666a(User user, List list, OnShowListener onShowListener, OnDismissListener onDismissListener) {
        }

        /* renamed from: b */
        public final void mo64669b(Aweme aweme) {
        }

        /* renamed from: b */
        public final void mo64713b(Aweme aweme, String str, String str2) {
        }

        /* renamed from: c */
        public final C26875a mo64670c() {
            return null;
        }

        /* renamed from: c */
        public final C26875a mo64671c(Aweme aweme) {
            return C31759f.m73771a(this, aweme);
        }

        /* renamed from: a */
        public final void mo64664a(Aweme aweme) {
            C32386a.this.f84283c.mo65529a(true);
        }

        /* renamed from: a */
        public final void mo64658a(Context context, Aweme aweme) {
            if (C32386a.this.f84282b != null) {
                C32386a.this.f84282b.mo52904a(new C30332aw(41, aweme), C32386a.this.f84286f);
            }
        }

        /* renamed from: c */
        public final void mo64672c(View view, View view2, Aweme aweme) {
            String uuid = UUID.randomUUID().toString();
            if (C37852b.m84501a(view, view2, aweme, uuid)) {
                C37879b.m84592c(aweme, C32386a.this.f84286f, C22858c.f61208d, uuid);
            }
        }

        /* renamed from: d */
        public final void mo64673d(View view, View view2, Aweme aweme) {
            String uuid = UUID.randomUUID().toString();
            if (C37852b.m84505b(view, view2, aweme, uuid)) {
                C37879b.m84592c(aweme, C32386a.this.f84286f, C22858c.f61208d, uuid);
            }
        }

        /* renamed from: b */
        public final void mo64667b(View view, View view2, Aweme aweme) {
            if (C32386a.this.f84282b != null) {
                C32386a.this.f84282b.mo52906b(new C30332aw(24, aweme), "click_follow", "video_cart_tag", C32386a.this.mo60874g(true));
                C37879b.m84591c(aweme, C32386a.this.f84286f);
            }
        }

        /* renamed from: a */
        public final void mo64659a(View view, View view2, Aweme aweme) {
            if (C32386a.this.f84283c != null && C32386a.this.f84283c.isViewValid() && C32386a.this.f84281a != null) {
                if (C31753a.m73743c(aweme) || !C47950q.m103754c(aweme)) {
                    new C23238h().mo48091h(aweme.getAuthorUid()).mo48086d(C32386a.this.f84286f).mo48088e(C32386a.this.f84286f).mo47954f(aweme).mo48089f(C22858c.f61208d).mo48076e();
                    C32386a.this.f84281a.mo60707a(null, aweme, null);
                    return;
                }
                C10691a.m21548c((Context) C32386a.this.f84283c.mo65531d(), (int) R.string.ffs).mo19066a();
            }
        }

        /* renamed from: a */
        public final void mo64660a(View view, View view2, Aweme aweme, User user) {
            if (C37852b.m84503a(aweme, user, C32386a.this.f84283c.mo65531d(), C32386a.this.f84286f) && !C31753a.m73740a(user)) {
                C37879b.m84584b(aweme, C32386a.this.f84286f);
                C37879b.m84573a(aweme, user.getUid(), "head", C32386a.this.f84286f, C22858c.f61208d);
            }
        }

        /* renamed from: b */
        public final void mo64668b(View view, View view2, Aweme aweme, User user) {
            if (C37852b.m84506b(aweme, user, C32386a.this.f84283c.mo65531d(), C32386a.this.f84286f)) {
                C37879b.m84584b(aweme, C32386a.this.f84286f);
                C37879b.m84573a(aweme, user.getUid(), LeakCanaryFileProvider.f132049i, C32386a.this.f84286f, C22858c.f61208d);
            }
        }

        /* renamed from: a */
        public final void mo64663a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme) {
            if (C37852b.m84502a(view, textExtraStruct, view2, aweme, "homepage_follow")) {
                C37879b.m84568a(view.getContext(), textExtraStruct, aweme, "homepage_follow");
            }
        }

        /* renamed from: a */
        public final void mo64704a(View view, Aweme aweme, List<User> list, boolean z, String str) {
            C32386a.this.f84283c.mo65529a(false);
            C25280a.m61493a().sendEnterCommentEvent(C32386a.this.mo60874g(true), aweme, C22858c.f61208d, 0, "", str);
        }
    };

    /* renamed from: m */
    private C25147a f84293m = new C25147a() {
        /* renamed from: a */
        public final void mo51252a(View view, boolean z, String str) {
        }

        /* renamed from: b */
        public final void mo51260b(Comment comment, int i) {
        }

        /* renamed from: d */
        public final void mo51262d() {
        }

        /* renamed from: a */
        public final void mo51254a(Comment comment) {
            if (C32386a.this.f84283c != null) {
                C32386a.this.f84283c.mo65527a(comment);
            }
        }

        /* renamed from: a */
        public final void mo51257a(C29366a aVar) {
            String str;
            if (aVar != null) {
                Aweme r = C32386a.this.f84283c.mo65538r();
                if (r == null) {
                    str = "";
                } else {
                    str = r.getAid();
                }
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66720a(C11016e.m22312g(), C32386a.this.f84286f, "like_comment", C47661ab.m103163a().mo94972a("group_id", str).mo94972a("log_pb", C23198ae.m56874k(str)).f120139a);
                } else if (C29368b.m69241a().mo59389a(aVar)) {
                    C10691a.m21548c((Context) C32386a.this.f84283c.mo65531d(), (int) R.string.ax7).mo19066a();
                } else {
                    UrlModel animateUrl = aVar.getAnimateUrl();
                    C25280a.m61493a().sendCollectEmojiEvent();
                    C29368b.m69241a().mo59383a(aVar.getId(), animateUrl.getUri(), (String) animateUrl.getUrlList().get(0), aVar.getResourcesId(), aVar.getStickerType());
                }
            }
        }

        /* renamed from: a */
        public final void mo51253a(C25265n nVar, Comment comment) {
            if (C32386a.this.f84283c != null) {
                C32386a.this.f84283c.mo65532d(comment);
            }
        }

        /* renamed from: b */
        public final void mo51259b(C25265n nVar, Comment comment) {
            if (C32386a.this.f84283c != null) {
                C32386a.this.f84283c.mo65526a(nVar, comment);
            }
        }

        /* renamed from: b */
        public final void mo51261b(String str, String str2) {
            UserProfileActivity.m89408a((Context) C32386a.this.f84283c.mo65531d(), str, str2, "like_banner");
        }

        /* renamed from: a */
        public final void mo51258a(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                C41302w a = C41302w.m91042a();
                Activity d = C32386a.this.f84283c.mo65531d();
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(str);
                a.mo83858a(d, C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", str2).mo83871a());
            }
        }

        /* renamed from: a */
        public final void mo51256a(CommentReplyButtonStruct commentReplyButtonStruct, C25261j jVar) {
            String str;
            if (C32386a.this.f84285e == null) {
                C32386a aVar = C32386a.this;
                CommentService a = C25280a.m61493a();
                if (C32386a.this.f84283c.mo65538r() != null) {
                    str = C32386a.this.f84283c.mo65538r().getAid();
                } else {
                    str = "";
                }
                aVar.f84285e = a.providerCommentReplyListPresenter(str);
                C32386a.this.f84285e.mo51446a(C32386a.this.f84289i);
                C32386a.this.f84285e.mo51445a(C32386a.this.f84283c.mo65537q());
            }
            C32386a.this.f84285e.mo51447a(commentReplyButtonStruct, jVar);
        }

        /* renamed from: a */
        public final void mo51255a(Comment comment, int i) {
            String str;
            if (!C32389b.m74819a(C32386a.this.f84283c.mo65531d())) {
                C10691a.m21542b((Context) C32386a.this.f84283c.mo65531d(), (int) R.string.cg1).mo19066a();
            } else if (!C20902b.m53242a().isLogin()) {
                C27965f.m66719a(C32386a.this.f84283c.mo65531d(), C32386a.this.f84286f, "like_comment");
            } else if (comment != null) {
                if (comment.getUserDigged() == 0) {
                    str = "1";
                } else {
                    str = "2";
                }
                if (C32386a.this.f84284d == null) {
                    C32386a.this.f84284d = C25280a.m61493a().providerCommentDiggPresenter();
                    C32386a.this.f84284d.mo51430a(C32386a.this.f84283c.mo65536p());
                }
                if (C32386a.this.f84284d != null && C32386a.this.f84284d.av_()) {
                    C32386a.this.f84284d.mo51431a(comment.getCid(), comment.getAwemeId(), str, C32386a.this.f84286f);
                }
                if ("1".equals(str)) {
                    C32386a.this.f84288h = comment.getCid();
                    return;
                }
                C32386a.this.f84288h = "";
            }
        }
    };

    /* renamed from: a */
    public final C31758e mo65520a() {
        return this.f84292l;
    }

    /* renamed from: b */
    public final C25147a mo65521b() {
        return this.f84293m;
    }

    /* renamed from: c */
    public final C30303h mo65522c() {
        return this.f84281a;
    }

    /* renamed from: f */
    public final String mo65525f() {
        return this.f84288h;
    }

    /* renamed from: e */
    public final void mo65524e() {
        if (this.f84281a != null) {
            this.f84281a.mo60468b();
        }
        if (this.f84282b != null) {
            this.f84282b.mo60468b();
        }
        if (this.f84290j != null) {
            this.f84290j.aq_();
            this.f84290j.mo46991S_();
        }
        C47718bf.m103291d(this);
    }

    /* renamed from: d */
    public final void mo65523d() {
        if (this.f84281a != null) {
            this.f84281a.mo60465a();
        }
        this.f84281a = new C30303h(this.f84286f, this.f84287g, this, this);
        this.f84281a.mo52903a(this.f84283c.mo65531d(), this.f84283c.mo65530c());
        this.f84282b = new C25707d(this.f84286f, this.f84287g);
        this.f84282b.mo52903a(this.f84283c.mo65531d(), (Fragment) this.f84283c.mo65530c());
        C47718bf.m103290c(this);
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f84286f;
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        if (this.f84283c != null && this.f84283c.isViewValid() && awVar.f79228a == 13) {
            this.f84283c.mo65528a((String) awVar.f79229b, TextUtils.equals(awVar.f79231d, this.f84286f));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo60714a(Object obj) {
        C30332aw awVar = (C30332aw) obj;
        if (this.f84283c != null && this.f84283c.isViewValid()) {
            int i = awVar.f79228a;
            if (i != 28) {
                switch (i) {
                    case 1:
                        if (C23718g.m58207b().mo49153d()) {
                            Aweme aweme = (Aweme) awVar.f79229b;
                            if (aweme != null && aweme.getAuthor() != null && this.f84281a != null) {
                                C41922a.m91868a().showReportDialog(aweme, this.f84281a.mo60476k(), C11016e.m22312g(), "");
                                break;
                            } else {
                                return;
                            }
                        } else {
                            if (this.f84283c.mo65531d() != null) {
                                C10691a.m21542b((Context) this.f84283c.mo65531d(), (int) R.string.cg1).mo19066a();
                            }
                            return;
                        }
                    case 2:
                        if (!C23718g.m58207b().mo49153d()) {
                            C10691a.m21542b((Context) this.f84283c.mo65531d(), (int) R.string.cg1).mo19066a();
                            return;
                        }
                        Aweme aweme2 = (Aweme) awVar.f79229b;
                        if (aweme2 != null && !TextUtils.isEmpty(aweme2.getAid())) {
                            if (aweme2.getAwemeType() == 13) {
                                if (this.f84291k == null) {
                                    this.f84291k = new C32393d();
                                    this.f84291k.mo54799a(new C32413a());
                                    this.f84291k.mo54800a(this.f84283c.mo65535o());
                                }
                                this.f84291k.f84308a = aweme2.getAid();
                                this.f84291k.mo44934a_(aweme2.getAid());
                                return;
                            }
                            if (this.f84290j == null) {
                                this.f84290j = new C30507y();
                                this.f84290j.mo54799a(new C30505x());
                                this.f84290j.mo54800a(this.f84283c.mo65534n());
                            }
                            this.f84290j.mo44934a_(aweme2.getAid());
                            return;
                        }
                        return;
                }
            }
        }
    }

    public C32386a(C32377b bVar, String str, C25269r rVar) {
        this.f84283c = bVar;
        this.f84286f = str;
        this.f84289i = rVar;
    }
}
