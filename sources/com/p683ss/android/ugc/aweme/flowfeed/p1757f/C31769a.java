package com.p683ss.android.ugc.aweme.flowfeed.p1757f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.net.Uri.Builder;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.comment.abtest.C25069a;
import com.p683ss.android.ugc.aweme.comment.list.C25253b;
import com.p683ss.android.ugc.aweme.comment.list.C25254c;
import com.p683ss.android.ugc.aweme.comment.list.C25256e;
import com.p683ss.android.ugc.aweme.comment.list.C25257f;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25145b;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25148b;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b.C25165a;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.comment.services.C25286e;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.C25707d;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27021a;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27382o;
import com.p683ss.android.ugc.aweme.feed.C30180e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30316ah;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30337f;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30502u;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30505x;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30507y;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31759f;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31760g;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31761a;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31764d;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31765e;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31778a;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.C32258a;
import com.p683ss.android.ugc.aweme.forward.model.C32413a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32378b;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32393d;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32403c;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.f.a */
public abstract class C31769a<M extends C26875a, V extends C31817a> extends C26851b<M, V> implements C25254c, C25257f, C25285d, C27382o, C30313ae<C30332aw>, C30447d, C30502u, C31760g, C32378b {

    /* renamed from: a */
    protected C30180e f82963a;

    /* renamed from: b */
    protected C25707d f82964b;

    /* renamed from: c */
    protected C30507y f82965c;

    /* renamed from: d */
    protected C32393d f82966d;

    /* renamed from: e */
    protected C25256e f82967e;

    /* renamed from: h */
    protected C25253b f82968h;

    /* renamed from: i */
    protected C25145b f82969i;

    /* renamed from: j */
    protected Aweme f82970j;

    /* renamed from: k */
    protected Comment f82971k;

    /* renamed from: l */
    protected boolean f82972l;

    /* renamed from: m */
    protected boolean f82973m;

    /* renamed from: n */
    public Comment f82974n;

    /* renamed from: a */
    public final void mo51538a(String str, Exception exc) {
    }

    /* renamed from: b */
    public void mo64669b(Aweme aweme) {
    }

    /* renamed from: c */
    public C26875a mo64671c(Aweme aweme) {
        return C31759f.m73771a(this, aweme);
    }

    /* renamed from: c */
    public final void mo51783c(Comment comment) {
    }

    /* renamed from: d */
    public final void mo55804d(Exception exc) {
    }

    /* renamed from: e */
    public String mo64715e() {
        return "";
    }

    /* renamed from: e */
    public final void mo51784e(boolean z) {
    }

    /* renamed from: h */
    public final Aweme mo51787h() {
        return this.f82970j;
    }

    /* renamed from: i */
    public final Comment mo51788i() {
        return this.f82971k;
    }

    /* renamed from: m */
    public final boolean mo51792m() {
        return C25286e.m61511a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Fragment mo64727q();

    /* renamed from: a */
    public final /* synthetic */ void mo60714a(Object obj) {
        C30332aw awVar = (C30332aw) obj;
        if (this.f70700f != null && this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            int i = awVar.f79228a;
            if (i != 28) {
                switch (i) {
                    case 1:
                        if (C23718g.m58207b().mo49153d()) {
                            Aweme aweme = (Aweme) awVar.f79229b;
                            if (aweme != null && aweme.getAuthor() != null && this.f82963a != null) {
                                C31781d.m73922a().mo64690a(aweme, mo64728r(), this.f82963a.mo60476k());
                                break;
                            } else {
                                return;
                            }
                        } else {
                            if (((C31817a) this.f70701g).getContext() != null) {
                                C10691a.m21542b(((C31817a) this.f70701g).getContext(), (int) R.string.cg1).mo19066a();
                            }
                            return;
                        }
                    case 2:
                        if (!C23718g.m58207b().mo49153d()) {
                            C10691a.m21542b(((C31817a) this.f70701g).getContext(), (int) R.string.cg1).mo19066a();
                            return;
                        }
                        Aweme aweme2 = (Aweme) awVar.f79229b;
                        if (aweme2 != null && !TextUtils.isEmpty(aweme2.getAid())) {
                            if (aweme2.getAwemeType() == 13) {
                                if (this.f82966d == null) {
                                    this.f82966d = new C32393d();
                                    this.f82966d.mo54799a(new C32413a());
                                    this.f82966d.mo54800a(this);
                                }
                                this.f82966d.f84308a = aweme2.getAid();
                                this.f82966d.mo44934a_(aweme2.getAid());
                                return;
                            }
                            if (this.f82965c == null) {
                                this.f82965c = new C30507y();
                                this.f82965c.mo54799a(new C30505x());
                                this.f82965c.mo54800a(this);
                            }
                            this.f82965c.mo44934a_(aweme2.getAid());
                            return;
                        }
                        return;
                }
                return;
            }
            ((C31817a) this.f70701g).mo64878a(false, (Aweme) null);
        }
    }

    /* renamed from: a */
    public final void mo54800a(V v) {
        super.mo54800a(v);
        if (this.f82963a != null) {
            this.f82963a.mo60465a();
        }
    }

    /* renamed from: a */
    public final void mo54799a(M m) {
        super.mo54799a(m);
        if (this.f70700f instanceof C27369c) {
            ((C27369c) this.f70700f).f72149a = this;
        }
    }

    /* renamed from: a */
    public final void mo51535a(String str) {
        this.f82973m = true;
        ((C31817a) this.f70701g).mo64874a(this.f82970j.getAid(), str);
        C27021a.f71325a.tryShowCommentFilterGuide(mo64728r(), this.f82970j, this.f82974n);
    }

    /* renamed from: a */
    public final void mo51539a(Object... objArr) {
        ((C31817a) this.f70701g).mo64875a(this.f82970j.getAid(), objArr[0], -1);
    }

    /* renamed from: a */
    public final void mo64663a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme) {
        if (C31781d.m73924c().mo64696a(view, textExtraStruct, view2, aweme, mo60874g(true))) {
            C23794bh.m58392f().mo64984a(view.getContext(), textExtraStruct, aweme, mo60874g(true));
        }
    }

    /* renamed from: a */
    public final void mo64665a(Aweme aweme, List<String> list) {
        if (aweme != null && !C9376b.m18558a((Collection<T>) list)) {
            C26891a aVar = new C26891a(mo64728r());
            aVar.mo54844a((CharSequence[]) list.toArray(new String[list.size()]), (OnClickListener) new C31773b(this, aweme, list));
            aVar.mo54845b();
            String g = mo60874g(true);
            C52711k.m112240b(g, "enterFrom");
            C52711k.m112240b(aweme, "aweme");
            C26890h.m65011a("click_more_menu", C23089d.m56640a().mo47829a("enter_from", g).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo64666a(User user, List<String> list, OnShowListener onShowListener, OnDismissListener onDismissListener) {
        if (user != null && !C9376b.m18558a((Collection<T>) list)) {
            C1161a aVar = new C1161a(mo64728r(), R.style.s8);
            aVar.mo3767a((CharSequence[]) list.toArray(new String[list.size()]), (OnClickListener) new C31774c(this, user, list));
            aVar.mo3761a(onDismissListener);
            C1160b b = aVar.mo3772b();
            b.setOnShowListener(onShowListener);
            b.show();
            String g = mo60874g(true);
            C52711k.m112240b(g, "enterFrom");
            C52711k.m112240b(user, "user");
            C26890h.m65011a("click_more_menu", C23089d.m56640a().mo47829a("enter_from", g).mo47829a("author_id", user.getUid()).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo64710a(Aweme aweme, List<User> list, Comment comment, String str) {
        if (this.f82963a != null) {
            C25165a b = new C25165a(aweme).mo51330a(comment.getCid()).mo51332a(true).mo51336b(true).mo51337c(str).mo51339d(mo64715e()).mo51340d(false).mo51335b(list);
            if (mo77307s()) {
                b.mo51342e(true);
            }
            this.f82963a.mo51536a(b.mo51333a());
        } else {
            C25069a.m60928b("onExposedCommentClick mDialogController is null");
        }
        ((C31817a) this.f70701g).mo64878a(true, aweme);
    }

    /* renamed from: a */
    public final void mo64704a(View view, Aweme aweme, List<User> list, boolean z, String str) {
        if (this.f82963a != null) {
            C25165a b = new C25165a(aweme).mo51338c(z || this.f82973m).mo51337c(str).mo51339d(mo64715e()).mo51340d(false).mo51335b(list);
            if (mo77307s()) {
                b.mo51342e(true);
            }
            this.f82963a.mo51536a(b.mo51333a());
        } else {
            C25069a.m60928b("onExpandCommentClick mDialogController is null");
        }
        ((C31817a) this.f70701g).mo64878a(true, aweme);
        C23794bh.m58392f().mo64991a(aweme, mo60874g(true), "list");
        this.f82973m = false;
    }

    /* renamed from: a */
    public void mo64708a(Aweme aweme, String str, String str2) {
        C31781d.m73924c().mo64694a(aweme, str, str2, mo64728r(), mo60874g(true), "list");
    }

    /* renamed from: a */
    public final void mo64707a(Aweme aweme, Comment comment, int i) {
        if (!C31776e.m73883a(((C31817a) this.f70701g).getContext())) {
            C10691a.m21542b(((C31817a) this.f70701g).getContext(), (int) R.string.cg1).mo19066a();
        } else if (aweme != null && comment != null) {
            this.f82970j = aweme;
            String str = comment.getUserDigged() == 0 ? "1" : "2";
            String uid = comment.getUser() != null ? comment.getUser().getUid() : "";
            if (this.f82967e == null) {
                this.f82967e = C25280a.m61493a().providerCommentDiggPresenter();
                this.f82967e.mo51430a(this);
            }
            this.f82967e.mo51431a(comment.getCid(), comment.getAwemeId(), str, mo51789j());
            if (TextUtils.equals("1", str)) {
                C23794bh.m58392f().mo64993a(this.f82970j, comment.getCid(), uid, comment.getLabelType(), mo60874g(true), "list", i);
            }
        }
    }

    /* renamed from: a */
    public final void mo51780a(Exception exc, int i, Comment comment) {
        C31781d.m73923b().mo64681a(((C31817a) this.f70701g).getContext(), exc, i == 3 ? R.string.b65 : R.string.a8l, false);
        if (i == 3) {
            C23794bh.m58391e().mo65594a(mo60874g(true), mo51787h(), "list", this.f82972l ? "click_repost_button" : "click_comment", false);
        }
    }

    /* renamed from: a */
    public final void mo64706a(final Aweme aweme, final Comment comment) {
        if (aweme != null && comment != null) {
            this.f82970j = aweme;
            if (this.f82969i == null) {
                this.f82969i = C31781d.m73923b().mo64674a(mo64727q(), hashCode(), this);
            }
            this.f82969i.mo51243a(mo60874g(true), this.f82970j, comment.getCommentType(), false, false, TextUtils.equals(comment.getUser() != null ? comment.getUser().getUid() : "", C20854a.m53167g().getCurUserId()), TextUtils.equals(aweme.getAuthorUid(), C20854a.m53167g().getCurUserId()), false, comment, new C25148b() {
                /* renamed from: a */
                public final void mo51263a() {
                }

                /* renamed from: i */
                public final void mo51271i() {
                }

                /* renamed from: j */
                public final void mo51272j() {
                }

                /* renamed from: k */
                public final void mo51273k() {
                }

                /* renamed from: l */
                public final void mo51274l() {
                }

                /* renamed from: m */
                public final void mo51275m() {
                }

                /* renamed from: c */
                public final void mo51265c() {
                    C31769a.this.mo64710a(aweme, null, comment, "");
                }

                /* renamed from: d */
                public final void mo51266d() {
                    C31769a.this.f82971k = comment;
                    C31769a.this.mo64714d(aweme);
                }

                /* renamed from: g */
                public final void mo51269g() {
                    C31769a.this.f82969i.mo51240a(comment, C31769a.this.mo60874g(true));
                }

                /* renamed from: h */
                public final void mo51270h() {
                    C31781d.m73923b().mo64677a(C31769a.this.mo60874g(true));
                    ((C31817a) C31769a.this.f70701g).mo64878a(false, (Aweme) null);
                }

                /* renamed from: f */
                public final void mo51268f() {
                    C31769a.this.f82969i.mo51239a(comment);
                    C31781d.m73923b().mo64679a(C31769a.this.mo60874g(true), comment.getUser().getUid(), comment.getCid(), C31769a.this.f82970j);
                }

                /* renamed from: b */
                public final void mo51264b() {
                    if (C31769a.this.mo64728r() != null) {
                        if (!C31775d.m73882a(((C31817a) C31769a.this.f70701g).getContext())) {
                            C10691a.m21542b(((C31817a) C31769a.this.f70701g).getContext(), (int) R.string.cg1);
                            return;
                        }
                        if (C31769a.this.f82968h == null) {
                            C31769a.this.f82968h = C25280a.m61493a().providerCommentDeletePresenter();
                            C31769a.this.f82968h.mo51426a(C31769a.this);
                        }
                        if (!TextUtils.isEmpty(comment.getCid())) {
                            C31769a.this.f82968h.mo51427a(comment.getCid(), aweme.getAid());
                            C31769a.this.f82974n = comment;
                        }
                    }
                }

                /* renamed from: e */
                public final void mo51267e() {
                    C27013a.m65227a().report(C31769a.this.mo64728r(), new Builder().appendQueryParameter("object_id", comment.getCid()).appendQueryParameter("owner_id", comment.getUser().getUid()).appendQueryParameter("report_type", "comment"));
                    C31781d.m73923b().mo64678a(C31769a.this.mo60874g(true), C31769a.this.mo51787h(), comment.getCid(), "list", "click_report_button");
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64712a(User user, List list, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (TextUtils.equals((String) list.get(i), mo64728r().getString(R.string.f9m))) {
            new C31980a(new C32258a(mo64728r()), new C31988e() {
                /* renamed from: a */
                public final void mo49741a(int i, User user) {
                }

                /* renamed from: a */
                public final String mo56221a() {
                    return C31769a.this.mo51789j();
                }
            }).mo65173a(user);
            C31765e eVar = new C31765e();
            eVar.f82962a = user.getUid();
            C47718bf.m103288a(eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64709a(final Aweme aweme, List list, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String str = (String) list.get(i);
        if (TextUtils.equals(str, mo64728r().getString(R.string.dhj))) {
            mo64659a((View) null, (View) null, aweme);
        } else if (TextUtils.equals(str, mo64728r().getString(R.string.f9m))) {
            new C31980a(new C32258a(mo64728r()), new C31988e() {
                /* renamed from: a */
                public final String mo56221a() {
                    return C31769a.this.mo51789j();
                }

                /* renamed from: a */
                public final void mo49741a(int i, User user) {
                    C23794bh.m58392f().mo64999a("follow_cancel", mo56221a(), aweme);
                }
            }).mo65173a(aweme.getAuthor());
            C31765e eVar = new C31765e();
            eVar.f82962a = aweme.getAuthorUid();
            C47718bf.m103288a(eVar);
        } else {
            if (TextUtils.equals(str, mo64728r().getString(R.string.b6m))) {
                C31781d.m73922a().mo64686a(mo64728r(), aweme);
            }
        }
    }

    /* renamed from: c */
    public /* synthetic */ C26875a mo64670c() {
        return (C26875a) super.mo54803n();
    }

    /* renamed from: k */
    public final int mo51790k() {
        if (this.f82972l) {
            return 4;
        }
        return 2;
    }

    /* renamed from: s */
    private boolean mo77307s() {
        return TextUtils.equals(mo51789j(), "homepage_familiar");
    }

    /* renamed from: l */
    public final boolean mo51791l() {
        if (!C20854a.m53167g().isLogin()) {
            return false;
        }
        return true;
    }

    public final void aq_() {
        super.aq_();
        if (this.f70700f instanceof C27369c) {
            ((C27369c) this.f70700f).f72149a = null;
        }
    }

    /* renamed from: f */
    public final void mo64716f() {
        if (this.f82963a != null) {
            this.f82963a.mo60468b();
        }
        if (this.f82964b != null) {
            this.f82964b.mo60468b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo64726p() {
        if (this.f82969i == null) {
            this.f82969i = C31781d.m73923b().mo64674a(mo64727q(), hashCode(), this);
        }
        this.f82969i.mo51248h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Activity mo64728r() {
        if (mo64727q() != null) {
            return mo64727q().getActivity();
        }
        return null;
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        if (this.f70700f != null && this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            int i = ((C26875a) this.f70700f).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((C31817a) this.f70701g).mo64885b(2);
                }
                return;
            }
            ((C31817a) this.f70701g).mo64861a(2);
        }
    }

    /* renamed from: g */
    public final void mo64717g() {
        if (this.f82967e != null) {
            this.f82967e.mo51432c();
        }
        if (this.f82969i != null) {
            this.f82969i.mo51251r();
            this.f82969i = null;
        }
        if (this.f82968h != null) {
            this.f82968h.au_();
        }
        if (this.f82965c != null) {
            this.f82965c.aq_();
            this.f82965c.mo46991S_();
        }
        if (this.f82966d != null) {
            this.f82966d.aq_();
            this.f82966d.mo46991S_();
        }
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public final void mo64664a(Aweme aweme) {
        mo64714d(aweme);
    }

    /* renamed from: f */
    public final void mo51786f(boolean z) {
        if (z) {
            this.f82972l = false;
            this.f82971k = null;
            ((C31817a) this.f70701g).mo64878a(false, (Aweme) null);
        }
    }

    /* renamed from: b */
    public final void mo51781b(Comment comment) {
        if (this.f82969i != null) {
            this.f82969i.mo51249j();
        }
        C31817a aVar = (C31817a) this.f70701g;
        aVar.f83139f.mo64629a(this.f82970j.getAid(), comment);
        this.f82973m = true;
    }

    /* renamed from: c */
    public final void mo55862c(String str) {
        if (this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            ((C31817a) this.f70701g).mo64881b(str);
        }
    }

    /* renamed from: d */
    public final void mo55805d(String str) {
        C47718bf.m103288a(new C30332aw(2, str));
        ((C31817a) this.f70701g).mo64881b(str);
    }

    /* renamed from: e_ */
    public final void mo51785e_(boolean z) {
        if (z) {
            C23794bh.m58391e().mo65597b(mo60874g(true), mo51787h(), "list", "click_original");
        }
    }

    @C53771m
    public void onDeleteItemEvent(C31761a aVar) {
        if (this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            ((C31817a) this.f70701g).mo64868a(aVar);
        }
    }

    @C53771m
    public void onPrivateModelEvent(C30316ah ahVar) {
        if (ahVar.f79205b != null && this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            ((C31817a) this.f70701g).f83139f.mo64622a(ahVar);
        }
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        if (this.f70700f != null && this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            ((C31817a) this.f70701g).mo64877a(false);
            int i = ((C26875a) this.f70700f).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((C31817a) this.f70701g).mo64885b(1);
                }
                return;
            }
            ((C31817a) this.f70701g).mo64861a(1);
        }
    }

    /* renamed from: d */
    public final void mo64714d(Aweme aweme) {
        String str;
        this.f82970j = aweme;
        this.f82972l = true;
        mo64726p();
        ((C31817a) this.f70701g).mo64878a(true, aweme);
        C32403c e = C23794bh.m58391e();
        String g = mo60874g(true);
        Aweme h = mo51787h();
        String str2 = "list";
        if (this.f82971k != null) {
            str = "click_reply_comment";
        } else {
            str = "click_repost_button";
        }
        e.mo65593a(g, h, str2, str);
    }

    @C53771m
    public void onCommentDialogEvent(C30337f fVar) {
        if (this.f70701g != null && ((C31817a) this.f70701g).isViewValid() && fVar.f79244a == 0) {
            ((C31817a) this.f70701g).mo64878a(false, (Aweme) null);
            C31817a aVar = (C31817a) this.f70701g;
            aVar.f83139f.mo64628a(fVar.f79246c, fVar.f79245b);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onReportCommentEvent(C29906l lVar) {
        try {
            if (TextUtils.equals("commentReportSuccess", lVar.f78045b.getString("eventName")) && this.f70701g != null) {
                ((C31817a) this.f70701g).mo64874a(this.f82970j.getAid(), lVar.f78045b.getJSONObject("data").getString("object_id"));
            }
        } catch (JSONException unused) {
        }
    }

    @C53771m
    public void onUnFollowUserEvent(C31765e eVar) {
        if (this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            C31817a aVar = (C31817a) this.f70701g;
            if (!(aVar.f83139f == null || eVar == null)) {
                aVar.f83139f.mo64627a(eVar.f82962a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        return;
     */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCommentEvent(com.p683ss.android.ugc.aweme.comment.p1516a.C25064a r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.common.e r0 = r3.f70701g
            if (r0 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.common.e r0 = r3.f70701g
            com.ss.android.ugc.aweme.flowfeed.i.a r0 = (com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a) r0
            boolean r0 = r0.isViewValid()
            if (r0 != 0) goto L_0x000f
            goto L_0x005e
        L_0x000f:
            java.lang.Object r0 = r4.f66394b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            if (r0 == 0) goto L_0x005d
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L_0x001a
            goto L_0x005d
        L_0x001a:
            int r4 = r4.f66393a     // Catch:{ Exception -> 0x005c }
            r1 = 0
            r2 = 1
            switch(r4) {
                case 2: goto L_0x0044;
                case 3: goto L_0x0032;
                case 4: goto L_0x0022;
                default: goto L_0x0021;
            }     // Catch:{ Exception -> 0x005c }
        L_0x0021:
            goto L_0x005b
        L_0x0022:
            com.ss.android.ugc.aweme.common.e r4 = r3.f70701g     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.flowfeed.i.a r4 = (com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a) r4     // Catch:{ Exception -> 0x005c }
            r1 = r0[r1]     // Catch:{ Exception -> 0x005c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x005c }
            r0 = r0[r2]     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005c }
            r4.mo64874a(r1, r0)     // Catch:{ Exception -> 0x005c }
            goto L_0x005c
        L_0x0032:
            com.ss.android.ugc.aweme.common.e r4 = r3.f70701g     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.flowfeed.i.a r4 = (com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a) r4     // Catch:{ Exception -> 0x005c }
            r1 = r0[r1]     // Catch:{ Exception -> 0x005c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x005c }
            r0 = r0[r2]     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.comment.model.Comment r0 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r0     // Catch:{ Exception -> 0x005c }
            T r4 = r4.f83139f     // Catch:{ Exception -> 0x005c }
            r4.mo64636b(r1, r0)     // Catch:{ Exception -> 0x005c }
            goto L_0x005c
        L_0x0044:
            r4 = r0[r2]     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.comment.model.Comment r4 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r4     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.common.e r2 = r3.f70701g     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.flowfeed.i.a r2 = (com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a) r2     // Catch:{ Exception -> 0x005c }
            r0 = r0[r1]     // Catch:{ Exception -> 0x005c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x005c }
            java.lang.String r1 = r4.getCid()     // Catch:{ Exception -> 0x005c }
            int r4 = r4.getDiggCount()     // Catch:{ Exception -> 0x005c }
            r2.mo64875a(r0, r1, r4)     // Catch:{ Exception -> 0x005c }
        L_0x005b:
            return
        L_0x005c:
            return
        L_0x005d:
            return
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31769a.onCommentEvent(com.ss.android.ugc.aweme.comment.a.a):void");
    }

    @C53771m
    public void onEvent(C32385a aVar) {
        String str;
        if (aVar != null) {
            if (aVar.f84279d == 1) {
                if (aVar.f84280e == hashCode() && mo64727q().isVisible() && mo64727q().isResumed()) {
                    C32403c e = C23794bh.m58391e();
                    String g = mo60874g(true);
                    Aweme aweme = aVar.f84278c;
                    String str2 = "list";
                    if (this.f82972l) {
                        str = "click_repost_button";
                    } else {
                        str = "click_comment";
                    }
                    e.mo65594a(g, aweme, str2, str, true);
                }
                if (this.f82969i != null) {
                    this.f82969i.mo51249j();
                }
                ((C31817a) this.f70701g).mo64873a(aVar.f84277b, aVar.f84276a);
            } else if (aVar.f84279d == 2) {
                ((C31817a) this.f70701g).mo64881b(aVar.f84277b);
            }
            this.f82973m = true;
        }
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        if (this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            int i = awVar.f79228a;
            if (i != 13) {
                if (i == 21 && (awVar.f79229b instanceof Aweme)) {
                    Aweme aweme = (Aweme) awVar.f79229b;
                    if (awVar.f79239l) {
                        ((C31817a) this.f70701g).mo64866a(aweme, awVar.f79232e);
                    }
                    ((C31817a) this.f70701g).mo64867a(aweme, !awVar.f79238k, awVar.f79232e, awVar.f79233f);
                }
                return;
            }
            ((C31817a) this.f70701g).mo64872a((String) awVar.f79229b);
        }
    }

    @C53771m
    public void onPreloadEvent(C31764d dVar) {
        int i;
        if (dVar.f82961a != null && this.f70701g != null && ((C31817a) this.f70701g).isViewValid()) {
            C31817a aVar = (C31817a) this.f70701g;
            int i2 = 0;
            if (aVar.f83139f == null) {
                i = 0;
            } else {
                i = aVar.f83139f.mo48636c();
            }
            if (i != 0) {
                Aweme aweme = dVar.f82961a;
                if (aweme.getAwemeType() == 13) {
                    aweme = aweme.getForwardItem();
                }
                C31817a aVar2 = (C31817a) this.f70701g;
                Aweme aweme2 = null;
                if (aVar2.f83139f != null) {
                    T t = aVar2.f83139f;
                    if (!C9376b.m18558a((Collection<T>) t.f70670n) && aweme != null) {
                        while (true) {
                            if (i2 >= t.f70670n.size()) {
                                i2 = -1;
                                break;
                            }
                            C37859b bVar = (C37859b) t.f70670n.get(i2);
                            if (bVar.getAweme() != null && C31749e.m73700b(bVar.getAweme()) == 16 && TextUtils.equals(bVar.getAweme().getAid(), aweme.getAid())) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 != -1) {
                            while (true) {
                                i2++;
                                if (i2 >= t.f70670n.size()) {
                                    break;
                                }
                                C37859b bVar2 = (C37859b) t.f70670n.get(i2);
                                if (bVar2.getAweme() != null && C31749e.m73700b(bVar2.getAweme()) == 16) {
                                    aweme2 = bVar2.getAweme();
                                    break;
                                }
                            }
                        }
                    }
                }
                if (aweme2 != null) {
                    C48107j.m104193f().mo95348b();
                    Video video = aweme2.getVideo();
                    if (video != null && video.getProperPlayAddr() != null) {
                        video.setRationAndSourceId(aweme2.getAid());
                        C48107j.m104193f().mo95405a(aweme2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51782b(String str) {
        String str2;
        String str3;
        Aweme h = mo51787h();
        C31778a b = C31781d.m73923b();
        String g = mo60874g(true);
        if (h == null) {
            str2 = "";
        } else {
            str2 = h.getAid();
        }
        if (h == null) {
            str3 = "";
        } else {
            str3 = h.getAuthorUid();
        }
        b.mo64680a(str, g, str2, str3);
    }

    /* renamed from: a */
    public void mo64658a(Context context, Aweme aweme) {
        if (this.f82964b != null) {
            this.f82964b.mo52904a(new C30332aw(41, aweme), mo60874g(true));
        }
    }

    /* renamed from: a */
    public final void mo64702a(Fragment fragment, int i) {
        this.f82963a = C31781d.m73922a().mo64682a(mo60874g(true), i, (C30313ae<C30332aw>) this, (C30447d) this);
        this.f82963a.mo52903a(fragment.getActivity(), fragment);
        this.f82964b = new C25707d(mo60874g(true), i);
        this.f82964b.mo52903a((Activity) fragment.getActivity(), fragment);
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public void mo64703a(View view, Aweme aweme) {
        String str;
        if (!C20854a.m53167g().isLogin()) {
            String string = mo64728r().getString(R.string.a7w);
            Activity r = mo64728r();
            String str2 = "homepage_hot";
            String str3 = "click_comment_emotion";
            C47661ab a = C47661ab.m103163a().mo94972a("login_title", string);
            String str4 = "log_pb";
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = "";
            }
            C27965f.m66720a(r, str2, str3, a.mo94972a(str4, C23198ae.m56874k(str)).f120139a);
            return;
        }
        this.f82970j = aweme;
        mo64726p();
        ((C31817a) this.f70701g).mo64878a(true, aweme);
    }

    /* renamed from: b */
    public void mo64667b(View view, View view2, Aweme aweme) {
        if (aweme != null) {
            ((C31817a) this.f70701g).mo64878a(true, aweme);
            if (this.f82964b != null) {
                this.f82964b.mo52906b(new C30332aw(24, aweme), "click_shopping_cart", "video_cart_tag", mo60874g(true));
                C23794bh.m58392f().mo65007d(aweme, mo60874g(true));
            }
        }
    }

    /* renamed from: c */
    public final void mo64672c(View view, View view2, Aweme aweme) {
        String uuid = UUID.randomUUID().toString();
        if (C31781d.m73924c().mo64695a(view, view2, aweme, uuid)) {
            C23794bh.m58392f().mo65003b(aweme, mo60874g(true), "list", uuid);
        }
    }

    /* renamed from: d */
    public final void mo64673d(View view, View view2, Aweme aweme) {
        String uuid = UUID.randomUUID().toString();
        if (C31781d.m73924c().mo64700b(view, view2, aweme, uuid)) {
            C23794bh.m58392f().mo65003b(aweme, mo60874g(true), "list", uuid);
            String g = mo60874g(true);
            C52711k.m112240b(g, "enterFrom");
            C52711k.m112240b(aweme, "aweme");
            C26890h.m65011a("enter_song_category", C23089d.m56640a().mo47829a("enter_method", "click_category_list").mo47829a("category_name", C23723j.m58219b(R.string.cm_)).mo47829a("enter_from", g).mo47829a("category_id", "860").mo47829a("category_type", "original").f61491a);
        }
    }

    /* renamed from: a */
    public final void mo64659a(View view, View view2, Aweme aweme) {
        if (this.f70701g != null && ((C31817a) this.f70701g).isViewValid() && this.f82963a != null && aweme != null) {
            new C23238h().mo48091h(aweme.getAuthorUid()).mo48086d(mo60874g(true)).mo48088e(mo60874g(true)).mo47954f(aweme).mo48089f("list").mo48076e();
            this.f82963a.mo60707a(mo64728r(), aweme, null);
            ((C31817a) this.f70701g).mo64878a(true, aweme);
        }
    }

    /* renamed from: b */
    public final void mo64713b(Aweme aweme, String str, String str2) {
        C31781d.m73924c().mo64693a(((C31817a) this.f70701g).getContext(), str, str2, mo60874g(true));
    }

    /* renamed from: a */
    public final void mo64661a(View view, View view2, User user) {
        C31781d.m73924c().mo64698a(user, mo64728r(), mo60874g(true));
    }

    /* renamed from: b */
    public void mo64668b(View view, View view2, Aweme aweme, User user) {
        if (C31781d.m73924c().mo64701b(aweme, user, mo64728r(), mo60874g(true))) {
            C23794bh.m58392f().mo65005c(aweme, mo60874g(true));
            C23794bh.m58392f().mo64995a(aweme, user.getUid(), LeakCanaryFileProvider.f132049i, mo60874g(true), "list");
        }
    }

    /* renamed from: a */
    public void mo64660a(View view, View view2, Aweme aweme, User user) {
        if (C31781d.m73924c().mo64697a(aweme, user, mo64728r(), mo60874g(true)) && !C31753a.m73740a(user)) {
            C23794bh.m58392f().mo65005c(aweme, mo60874g(true));
            C23794bh.m58392f().mo64995a(aweme, user.getUid(), "head", mo60874g(true), "list");
        }
    }

    /* renamed from: a */
    public final void mo64662a(View view, View view2, User user, String str, String str2) {
        C31781d.m73924c().mo64699a(user, mo64728r(), str, str2);
    }

    /* renamed from: a */
    public final void mo51779a(int i, int i2, String str, String str2, String str3) {
        String str4;
        String str5;
        C23794bh.m58392f().mo65006c(this.f82970j, mo60874g(true), "list", "");
        CommentService a = C25280a.m61493a();
        Aweme aweme = this.f82970j;
        String g = mo60874g(true);
        String a2 = C31781d.m73923b().mo64676a(this.f82971k);
        if (this.f82971k != null) {
            str4 = this.f82971k.getCid();
        } else {
            str4 = "";
        }
        String str6 = str4;
        String str7 = "list";
        String valueOf = String.valueOf(i2);
        if (i != 3) {
            str5 = "click_comment_box";
        } else {
            str5 = "repost_comment";
        }
        a.sendPostCommentEvent(aweme, str, g, a2, str6, str7, valueOf, 0, str5);
    }
}
