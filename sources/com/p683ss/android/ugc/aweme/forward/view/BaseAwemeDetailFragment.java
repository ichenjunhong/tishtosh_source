package com.p683ss.android.ugc.aweme.forward.view;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.comment.C25273o;
import com.p683ss.android.ugc.aweme.comment.list.C25253b;
import com.p683ss.android.ugc.aweme.comment.list.C25254c;
import com.p683ss.android.ugc.aweme.comment.list.C25257f;
import com.p683ss.android.ugc.aweme.comment.list.C25258g;
import com.p683ss.android.ugc.aweme.comment.list.C25263l;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p683ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25145b;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25148b;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.comment.services.C25286e;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27021a;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30502u;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30508z;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31756c;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31777f;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31835c;
import com.p683ss.android.ugc.aweme.forward.model.C32414b;
import com.p683ss.android.ugc.aweme.forward.p1773a.C32374a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32375a.C32376a;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32375a.C32377b;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32378b;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32386a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.forward.view.BaseAwemeDetailFragment */
public class BaseAwemeDetailFragment extends C23526a implements C25254c, C25257f, C25263l, C25285d, C26846a, C26877c<Comment>, C30502u, C31835c, C32377b, C32378b {

    /* renamed from: a */
    public C25258g f84483a;

    /* renamed from: b */
    protected C32374a f84484b;

    /* renamed from: c */
    public C31777f f84485c;

    /* renamed from: d */
    public String f84486d = "homepage_follow";

    /* renamed from: e */
    public String f84487e = "";

    /* renamed from: j */
    public String f84488j = "";

    /* renamed from: k */
    public Aweme f84489k;

    /* renamed from: l */
    public Comment f84490l;

    /* renamed from: m */
    public C25145b f84491m;
    FadeImageView mAtView;
    LiveCircleView mAuthorAvatarBorderView;
    AvatarImageView mAuthorAvatarImageView;
    ViewGroup mAuthorAvatarLayout;
    AvatarImageView mAuthorAvatarLiveView;
    TextView mAuthorNameView;
    MentionEditText mEditText;
    FadeImageView mEmojiView;
    RecyclerView mRecyclerView;

    /* renamed from: n */
    C25253b f84492n;

    /* renamed from: o */
    public String f84493o;

    /* renamed from: p */
    Comment f84494p;

    /* renamed from: q */
    private C31756c f84495q;

    /* renamed from: r */
    private C32376a f84496r;

    /* renamed from: s */
    private C30828c f84497s;

    /* renamed from: t */
    private String f84498t;

    /* renamed from: u */
    private boolean f84499u;

    /* renamed from: v */
    private C25269r f84500v;

    /* renamed from: w */
    private boolean f84501w;

    /* renamed from: x */
    private C1710e<C36083b> f84502x;

    /* renamed from: y */
    private long f84503y;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo64869a(C31777f fVar) {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    public final void ar_() {
        mo65729v();
    }

    /* renamed from: c */
    public final C11079a mo65530c() {
        return this;
    }

    /* renamed from: c */
    public final void mo47029c(List list, boolean z) {
    }

    /* renamed from: d */
    public final void mo55804d(Exception exc) {
    }

    /* renamed from: i */
    public final Comment mo51788i() {
        return this.f84490l;
    }

    /* renamed from: j */
    public final String mo51789j() {
        return this.f84486d;
    }

    /* renamed from: m */
    public final boolean mo51792m() {
        return C25286e.m61511a(this);
    }

    /* renamed from: n */
    public final C30502u mo65534n() {
        return this;
    }

    /* renamed from: o */
    public final C32378b mo65535o() {
        return this;
    }

    /* renamed from: p */
    public final C25257f mo65536p() {
        return this;
    }

    /* renamed from: q */
    public final C25263l mo65537q() {
        return this;
    }

    /* renamed from: r */
    public final Aweme mo65538r() {
        return this.f84489k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo65726s() {
    }

    /* renamed from: a */
    public final void mo65528a(String str, boolean z) {
        C32374a aVar = this.f84484b;
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (awemeById != null && aVar.f84271l != null) {
            aVar.f84271l.setUserDigg(awemeById.getUserDigg());
            aVar.f84271l.setStatistics(awemeById.getStatistics());
            if (!z) {
                if (aVar.f84265f != null) {
                    aVar.f84265f.mo64801q();
                }
                if (aVar.f84266g != null) {
                    aVar.f84266g.mo64801q();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo65529a(boolean z) {
        if (this.f84491m != null) {
            if (!this.f84491m.mo51245b()) {
                C10691a.m21548c(C11010c.m22280a(), (int) R.string.a9g).mo19066a();
                return;
            }
            this.f84499u = z;
            this.f84491m.mo51248h();
            if (z) {
                this.f84493o = "click_repost_button";
                C32401a.m74900a(this.f84486d, mo51787h(), C22858c.f61208d, "click_repost_button");
                return;
            }
            this.f84493o = "click_comment";
        }
    }

    /* renamed from: a */
    public void mo47018a(List<Comment> list, boolean z) {
        Aweme r = mo65538r();
        if (r == null || !r.getAwemeControl().canShowComment()) {
            list.clear();
            aJ_();
        }
        this.f84484b.mo54798c(true);
        if (!z) {
            this.f84484b.an_();
        } else {
            this.f84484b.ao_();
        }
        if (this.f84491m != null) {
            this.f84491m.mo51246c();
            this.f84491m.mo51238a(this.f84483a.mo51441e());
        }
        this.f84484b.mo50304b(C32374a.m74719a(this.f84489k, list));
        this.f84484b.mo65513a(true);
    }

    /* renamed from: a */
    public final void mo51535a(String str) {
        int d = this.f84500v.mo51526d(str);
        int a = this.f84484b.mo65511a(str, d);
        if (a > 0) {
            int i = a - 1;
            this.f84500v.mo51513a(i, d + i);
        }
        C27021a.f71325a.tryShowCommentFilterGuide(getActivity(), mo65538r(), this.f84494p);
    }

    /* renamed from: a */
    public final void mo51538a(String str, Exception exc) {
        if (!TextUtils.isEmpty(this.f84496r.mo65525f())) {
            C25280a.m61493a().sendLikeCommentResultEvent(this.f84486d, this.f84489k, null, false, C22858c.f61208d, null);
        }
    }

    /* renamed from: a */
    public final void mo51539a(Object... objArr) {
        if (this.f84484b != null) {
            C32374a aVar = this.f84484b;
            String str = objArr[0];
            if (aVar.mo48636c() != 0) {
                int i = 0;
                while (true) {
                    if (i >= aVar.mo50673a().size()) {
                        break;
                    }
                    if (aVar.mo65515b(i)) {
                        Comment comment = ((C32414b) aVar.mo50673a().get(i)).getComment();
                        if (comment != null && C9431p.m18665a(comment.getCid(), str)) {
                            C25280a.m61493a().updateDigg(comment, aVar.f84271l.getAuthorUid());
                            aVar.notifyItemChanged(i, Integer.valueOf(0));
                            C47718bf.m103288a(new C25064a(2, new Object[]{aVar.f84271l.getAid(), comment}));
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        if (!TextUtils.isEmpty(this.f84496r.mo65525f())) {
            C25280a.m61493a().sendLikeCommentResultEvent(this.f84486d, this.f84489k, (String) objArr[0], true, C22858c.f61208d, null);
        }
    }

    /* renamed from: a */
    public final void mo51557a(String str, List<Comment> list) {
        if (!TextUtils.isEmpty(str) && !C9376b.m18558a((Collection<T>) list)) {
            int b = this.f84484b.mo65514b(str, 11);
            String str2 = "";
            if (b > 0 && this.f84500v != null) {
                C32414b bVar = (C32414b) this.f84484b.mo50673a().get(b);
                if (bVar != null && (bVar.getComment() instanceof CommentReplyButtonStruct)) {
                    str2 = ((CommentReplyButtonStruct) bVar.getComment()).getCommentId();
                }
                this.f84500v.mo51515a(b - 1, list);
                this.f84484b.mo50673a().addAll(b, C32374a.m74722e(list));
                this.f84484b.notifyItemRangeInserted(b, list.size());
                C32374a aVar = this.f84484b;
                aVar.notifyItemRangeChanged(b, aVar.getItemCount() - b);
            }
            C25280a.m61493a().sendShowMoreReplyEvent(this.f84486d, this.f84489k.getAid(), str2);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ Activity mo65531d() {
        return super.getActivity();
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f84484b.am_();
    }

    /* renamed from: h */
    public final Aweme mo51787h() {
        return mo65538r();
    }

    /* renamed from: z */
    private void m75062z() {
        this.f84490l = null;
        this.f84499u = false;
        if (this.f84491m != null) {
            this.f84491m.mo51250o();
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (this.f84491m != null) {
            this.f84491m.mo51247d();
        }
    }

    /* renamed from: k */
    public final int mo51790k() {
        if (this.f84499u) {
            return 4;
        }
        if (this.f84490l != null) {
            return 3;
        }
        return 2;
    }

    /* renamed from: l */
    public final boolean mo51791l() {
        if (!C20902b.m53242a().isLogin()) {
            return false;
        }
        return true;
    }

    public void onBack() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f84495q != null) {
            this.f84495q.mo56247k();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f84495q != null) {
            this.f84495q.ba_();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f84495q != null) {
            this.f84495q.bb_();
        }
    }

    public void aJ_() {
        if (this.f84491m != null) {
            this.f84491m.mo51246c();
        }
        if (this.f84484b.f70699x) {
            this.f84484b.mo54798c(false);
            this.f84484b.notifyDataSetChanged();
        }
    }

    /* renamed from: w */
    private Long m75059w() {
        if (this.f84489k == null || this.f84489k.getAwemeRawAd() == null || C26512f.m64064g(this.f84489k)) {
            return null;
        }
        return this.f84489k.getAwemeRawAd().getCreativeId();
    }

    /* renamed from: x */
    private void m75060x() {
        if (this.f84503y > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f84503y;
            this.f84503y = 0;
            C25280a.m61493a().sendCloseTextEvent(this.f84486d, this.f84489k, currentTimeMillis, C22858c.f61208d);
        }
    }

    /* renamed from: y */
    private int[] m75061y() {
        int i;
        C1332i layoutManager = this.mRecyclerView.getLayoutManager();
        int i2 = -1;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.mo4749j();
            i = linearLayoutManager.mo4751l();
        } else {
            i = -1;
        }
        return new int[]{i2, i};
    }

    public void onAvatarClick() {
        User user;
        if (this.f84496r != null && this.f84496r.mo65520a() != null) {
            C31758e a = this.f84496r.mo65520a();
            Aweme r = mo65538r();
            if (mo65538r() != null) {
                user = mo65538r().getAuthor();
            } else {
                user = null;
            }
            a.mo64660a((View) null, (View) null, r, user);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f84483a != null) {
            this.f84483a.mo51540S_();
            this.f84483a.aq_();
        }
        if (this.f84485c != null) {
            this.f84485c.mo46991S_();
            this.f84485c.aq_();
            this.f84485c.mo64734g();
        }
        if (this.f84496r != null) {
            this.f84496r.mo65524e();
        }
        if (this.f84491m != null) {
            this.f84491m.mo51251r();
        }
    }

    public void onNickNameClick() {
        User user;
        if (this.f84496r != null && this.f84496r.mo65520a() != null) {
            C31758e a = this.f84496r.mo65520a();
            Aweme r = mo65538r();
            if (mo65538r() != null) {
                user = mo65538r().getAuthor();
            } else {
                user = null;
            }
            a.mo64668b(null, null, r, user);
        }
    }

    /* renamed from: v */
    public final void mo65729v() {
        if (this.f84489k != null && !this.f84501w) {
            this.f84501w = true;
            if (this.f84483a != null) {
                this.f84483a.mo44934a_(Integer.valueOf(4), this.f84489k.getAid(), Integer.valueOf(2), "", "", m75059w());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65728u() {
        if (this.f84489k != null) {
            if (C32455a.m75135a(getContext())) {
                this.f84483a.mo44934a_(Integer.valueOf(1), this.f84489k.getAid(), Integer.valueOf(2), "", this.f84498t, m75059w());
                return;
            }
            C18842a.m45933a(new Runnable() {
                public final void run() {
                    if (BaseAwemeDetailFragment.this.isViewValid()) {
                        C9432q.m18672a(BaseAwemeDetailFragment.this.getContext(), (int) R.string.cg1);
                    }
                }
            }, 100);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo65727t() {
        boolean z;
        if (this.f84489k != null) {
            this.mAuthorAvatarLayout.setVisibility(0);
            if (this.f84489k.getAuthor() == null || !this.f84489k.getAuthor().isLive()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f84497s == null) {
                this.f84497s = new C30828c(z, this.mAuthorAvatarLiveView, this.mAuthorAvatarImageView, this.mAuthorAvatarBorderView);
            }
            if (this.f84502x == null) {
                this.f84502x = new C1710e<C36083b>() {
                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        C36083b bVar = (C36083b) obj;
                        if (TextUtils.equals(BaseAwemeDetailFragment.this.f84489k.getAuthor().getUid(), String.valueOf(bVar.f92446a))) {
                            BaseAwemeDetailFragment.this.f84489k.getAuthor().roomId = bVar.f92447b;
                            if (!BaseAwemeDetailFragment.this.f84489k.getAuthor().isLive()) {
                                BaseAwemeDetailFragment.this.mo65727t();
                            }
                        }
                    }
                };
            }
            this.f84497s.mo63563a(this.f84489k.getAuthor(), getClass(), this.f84502x);
            int b = (int) C9432q.m18687b(getContext(), 27.0f);
            if (C31753a.m73739a(this.f84489k)) {
                this.f84497s.mo63561a(0);
                C23515d.m57670a((RemoteImageView) this.mAuthorAvatarLiveView, this.f84489k.getAuthor().getAvatarThumb(), b, b);
                C37879b.m84583b(this.f84489k);
            } else {
                this.f84497s.mo63561a(8);
                if (this.f84489k.getAuthor() != null) {
                    C23515d.m57670a((RemoteImageView) this.mAuthorAvatarImageView, this.f84489k.getAuthor().getAvatarThumb(), b, b);
                }
            }
            if (this.f84489k.getAuthor() != null) {
                this.mAuthorNameView.setText(this.f84489k.getAuthor().getNickname());
            }
        }
    }

    /* renamed from: b */
    public final void mo51781b(Comment comment) {
        m75055a(comment, false);
    }

    /* renamed from: a */
    public final void mo64865a(Aweme aweme) {
        C32374a aVar = this.f84484b;
        if (aVar.f84265f != null) {
            aVar.f84265f.mo64774c(aweme);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f84501w = false;
        this.f84484b.co_();
    }

    /* renamed from: d */
    public final void mo65532d(Comment comment) {
        this.f84493o = "click_reply_comment";
        mo65720f(comment);
    }

    /* renamed from: f */
    public final void mo51786f(boolean z) {
        if (z) {
            this.f84490l = null;
            this.f84499u = false;
        }
        m75060x();
    }

    /* renamed from: i */
    private void m75058i(Comment comment) {
        int h = C25273o.m61473b().mo51553h(comment);
        C1322a adapter = this.mRecyclerView.getAdapter();
        if (h >= 0 && adapter != null) {
            adapter.notifyItemChanged(h, Integer.valueOf(1));
        }
    }

    /* renamed from: b */
    public void mo47025b(Exception exc) {
        if (this.f84491m != null) {
            this.f84491m.mo51246c();
        }
        if (this.f84484b.f70699x) {
            this.f84484b.mo54798c(false);
            this.f84484b.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public final void mo55805d(String str) {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: e_ */
    public final void mo51785e_(boolean z) {
        String str;
        if (z) {
            String str2 = this.f84486d;
            Aweme h = mo51787h();
            String str3 = C22858c.f61208d;
            if (this.f84490l != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            C32401a.m74904b(str2, h, str3, str);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
    }

    /* renamed from: a */
    public final void mo65527a(Comment comment) {
        String text = comment.getText();
        m75054a(C25273o.m61473b().mo51556k(comment), C25273o.m61473b().mo51554i(comment), C29408b.m69341a(text), text);
        if (this.f84491m != null) {
            this.f84491m.mo51244b(comment);
        }
    }

    /* renamed from: b */
    public final void mo51782b(String str) {
        String str2;
        String str3;
        CommentService a = C25280a.m61493a();
        String str4 = this.f84486d;
        if (this.f84489k == null) {
            str2 = "";
        } else {
            str2 = this.f84489k.getAid();
        }
        if (this.f84489k == null) {
            str3 = "";
        } else {
            str3 = this.f84489k.getAuthorUid();
        }
        a.sendEmojiToKeyboardEvent(str, str4, str2, str3);
    }

    /* renamed from: e */
    public final void mo65719e(Comment comment) {
        if (isAdded() && this.f84491m != null) {
            this.f84499u = true;
            this.f84490l = comment;
            this.f84491m.mo51248h();
            C32401a.m74900a(this.f84486d, mo51787h(), C22858c.f61208d, "click_reply_comment");
        }
    }

    /* renamed from: f */
    public final void mo65720f(Comment comment) {
        if (isAdded()) {
            if (this.f84490l == null || !this.f84490l.equals(comment)) {
                this.f84490l = comment;
                if (this.f84491m != null) {
                    this.f84491m.mo51241a(comment.getUser());
                }
            } else {
                this.f84490l = comment;
                this.mEditText.performClick();
            }
        }
    }

    /* renamed from: e */
    public final void mo51784e(boolean z) {
        if (z) {
            this.f84493o = "click_comment";
        }
        C25280a.m61493a().sendEnterTextEvent(this.f84486d, this.f84489k, C25280a.m61493a().getCommentCategory(this.f84490l), C22858c.f61208d);
        this.f84503y = System.currentTimeMillis();
    }

    /* renamed from: g */
    public final void mo65721g(Comment comment) {
        C27013a.m65227a().report(getActivity(), new Builder().appendQueryParameter("report_type", "comment").appendQueryParameter("object_id", comment.getCid()).appendQueryParameter("owner_id", comment.getUser().getUid()));
        C25280a.m61493a().sendReportCommentEvent(this.f84486d, mo51787h(), comment.getCid(), C22858c.f61208d, "click_report_button");
    }

    /* renamed from: h */
    private void m75057h(Comment comment) {
        int i;
        C32414b bVar = new C32414b(comment);
        int i2 = 1;
        if (comment.getCommentType() == 2) {
            C32374a aVar = this.f84484b;
            String replyToReplyCommentId = comment.getReplyToReplyCommentId();
            if (TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                i = 1;
            } else {
                i = 2;
            }
            int b = aVar.mo65514b(replyToReplyCommentId, i);
            if (b > 0) {
                int i3 = b + 1;
                while (true) {
                    if (i3 >= this.f84484b.mo50673a().size()) {
                        i3 = -1;
                        break;
                    } else if (this.f84484b.getItemViewType(i3) != 2) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 <= 0) {
                    i3 = this.f84484b.mo50673a().size();
                }
                int i4 = i3;
                boolean a = this.f84500v.mo51518a(comment.getReplyId(), (i4 - this.f84484b.mo65514b(comment.getReplyId(), 1)) - 1, comment);
                int i5 = i4 - 1;
                this.f84500v.mo51522b(i5, comment);
                this.f84484b.mo51186a(bVar, i4);
                if (i4 > 0) {
                    this.f84484b.notifyItemChanged(i5);
                }
                if (a) {
                    this.f84484b.notifyItemChanged(i4 + 1);
                }
                this.mRecyclerView.mo4814b(i4 + 1);
                i2 = i4;
            } else {
                i2 = 0;
            }
        } else {
            this.f84500v.mo51514a(0, comment);
            this.f84500v.mo51522b(0, comment);
            this.f84484b.mo51186a(bVar, 1);
            this.mRecyclerView.mo4814b(1);
        }
        C25273o.m61473b().mo51545a(comment, i2);
    }

    /* renamed from: c */
    public final void mo51783c(Comment comment) {
        if (this.f84490l != null && (!this.f84499u || !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId()) || comment.getCommentType() == 0)) {
            comment.setReplyToUserId(this.f84490l.getUser().getUid());
            if (this.f84499u && comment.getCommentType() != 0) {
                comment.setReplyToUserName(C47915gg.m103650b(this.f84490l.getUser()));
            } else if (comment.getCommentType() == 2 && !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                comment.setReplyToUserName(C47915gg.m103650b(this.f84490l.getUser()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f84490l);
            comment.setReplyComments(arrayList);
        }
        if (!C25273o.m61473b().mo51550e(comment)) {
            C25273o.m61473b().mo51546a(comment, this.f84490l);
        }
        boolean z = !C25273o.m61473b().mo51547a(comment);
        if (z) {
            m75057h(comment);
        }
        if (!C25273o.m61473b().mo51550e(comment)) {
            C25273o.m61473b().mo51549d(comment);
        }
        if (!z) {
            m75058i(comment);
        }
        m75062z();
    }

    @C53771m
    public void onEvent(C32385a aVar) {
        if (aVar != null) {
            if (aVar.f84279d != 1 || aVar.f84276a == null) {
                if (aVar.f84279d == 2 && getActivity() != null) {
                    getActivity().finish();
                }
                return;
            }
            if (aVar.f84280e == hashCode()) {
                C32401a.m74901a(this.f84486d, aVar.f84278c, C22858c.f61208d, this.f84493o, true);
            }
            if (this.f84491m != null) {
                this.f84491m.mo51249j();
            }
            m75062z();
            if (hashCode() == aVar.f84280e) {
                m75055a(aVar.f84276a.getComment(), true);
            }
            C32374a aVar2 = this.f84484b;
            if (aVar2.f84271l != null) {
                AwemeStatistics statistics = aVar2.f84271l.getStatistics();
                if (statistics != null) {
                    statistics.setForwardCount(statistics.getForwardCount() + 1);
                } else {
                    statistics = new AwemeStatistics();
                    statistics.setForwardCount(1);
                }
                aVar2.f84271l.setStatistics(statistics);
            }
            if (aVar2.f84265f != null) {
                aVar2.f84265f.mo64797o();
            }
            if (aVar2.f84266g != null) {
                aVar2.f84266g.mo65645A();
            }
        }
    }

    @C53771m
    public void onReportCommentEvent(C29906l lVar) {
        C32374a aVar = this.f84484b;
        C25269r rVar = this.f84500v;
        try {
            if (TextUtils.equals("commentReportSuccess", lVar.f78045b.getString("eventName"))) {
                String string = lVar.f78045b.getJSONObject("data").getString("object_id");
                int d = rVar.mo51526d(string);
                int a = aVar.mo65511a(string, d);
                if (a > 0) {
                    int i = a - 1;
                    rVar.mo51513a(i, d + i);
                }
                if (aVar.mo48636c() != 0) {
                    if (!TextUtils.isEmpty(string)) {
                        Iterator it = aVar.f70670n.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            Comment comment = ((C32414b) it.next()).getComment();
                            if (comment != null && !C9376b.m18558a((Collection<T>) comment.getReplyComments())) {
                                Comment comment2 = (Comment) comment.getReplyComments().get(0);
                                if (comment2 != null && TextUtils.equals(comment2.getCid(), string)) {
                                    it.remove();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            aVar.notifyDataSetChanged();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public final void mo51558b(String str, List<Comment> list) {
        if (!TextUtils.isEmpty(str) && !C9376b.m18558a((Collection<T>) list)) {
            int b = this.f84484b.mo65514b(str, 11);
            String str2 = "";
            if (b - list.size() >= 0) {
                C32414b bVar = (C32414b) this.f84484b.mo50673a().get(b);
                if (bVar != null && (bVar.getComment() instanceof CommentReplyButtonStruct)) {
                    str2 = ((CommentReplyButtonStruct) bVar.getComment()).getCommentId();
                }
                this.f84500v.mo51523b(list);
                this.f84484b.mo50673a().removeAll(C32374a.m74722e(list));
                int size = b - list.size();
                this.f84484b.notifyItemRangeRemoved(size, list.size());
                C32374a aVar = this.f84484b;
                aVar.notifyItemRangeChanged(size, aVar.getItemCount() - size);
            }
            C25280a.m61493a().sendHideAllReplyEvent(this.f84486d, this.f84489k.getAid(), str2);
        }
    }

    /* renamed from: a */
    private void m75055a(Comment comment, boolean z) {
        int i;
        int i2;
        if (comment != null) {
            if (!C25273o.m61473b().mo51547a(comment)) {
                m75057h(comment);
            }
            C25273o.m61473b().mo51555j(comment);
            C25273o.m61473b().mo51551f(comment);
            int h = C25273o.m61473b().mo51553h(comment);
            List a = this.f84484b.mo50673a();
            if (h >= 0 && h <= a.size() - 1) {
                ((C32414b) a.get(h)).setComment(comment);
                this.f84484b.notifyItemChanged(h);
            }
            List b = this.f84500v.mo51520b();
            if (b != null) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
                    if (TextUtils.equals(commentReplyListItem.mComment.getFakeId(), comment.getFakeId())) {
                        commentReplyListItem.mComment = comment;
                    } else if (TextUtils.equals(commentReplyListItem.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list = commentReplyListItem.mReplyComments;
                        if (list == null) {
                            i2 = 0;
                        } else {
                            i2 = list.size();
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                break;
                            } else if (TextUtils.equals(((Comment) list.get(i3)).getFakeId(), comment.getFakeId())) {
                                list.set(i3, comment);
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
            int[] y = m75061y();
            if (m75056a(comment, y[0], y[1])) {
                Context a2 = C11010c.m22280a();
                if (z) {
                    i = R.string.b66;
                } else {
                    i = R.string.a9j;
                }
                C10691a.m21533a(a2, i).mo19066a();
            }
            C25273o.m61473b().mo51552g(comment);
            this.mRecyclerView.setVisibility(0);
            C23324d.m57378a().increaseCommentCount(mo65538r().getAid());
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Comment> list, boolean z) {
        this.f84501w = false;
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f84484b.an_();
        } else {
            this.f84484b.ao_();
        }
        this.f84484b.mo50304b(C32374a.m74719a(this.f84489k, list));
    }

    /* renamed from: a */
    public final void mo65526a(final C25265n nVar, final Comment comment) {
        String str;
        String str2;
        String str3;
        if (comment != null) {
            if (!C20902b.m53242a().isLogin()) {
                if (this.f84489k != null) {
                    str3 = this.f84489k.getAid();
                } else {
                    str3 = "";
                }
                C27965f.m66724a((Fragment) this, this.f84486d, "reply_comment", C47661ab.m103163a().mo94972a("group_id", str3).mo94972a("log_pb", C23198ae.m56874k(str3)).f120139a);
                return;
            }
            if (comment.getUser() != null) {
                str = comment.getUser().getUid();
            } else {
                str = "";
            }
            boolean equals = TextUtils.equals(str, C20902b.m53242a().getCurUserId());
            if (mo65538r() == null) {
                str2 = "";
            } else {
                str2 = mo65538r().getAuthorUid();
            }
            boolean equals2 = TextUtils.equals(str2, C20902b.m53242a().getCurUserId());
            if (this.f84491m != null) {
                this.f84491m.mo51243a(this.f84486d, this.f84489k, comment.getCommentType(), false, false, equals, equals2, !comment.isTranslated(), comment, new C25148b() {
                    /* renamed from: a */
                    public final void mo51263a() {
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

                    /* renamed from: e */
                    public final void mo51267e() {
                        BaseAwemeDetailFragment.this.mo65721g(comment);
                    }

                    /* renamed from: c */
                    public final void mo51265c() {
                        BaseAwemeDetailFragment.this.f84493o = "click_reply_comment";
                        BaseAwemeDetailFragment.this.mo65720f(comment);
                    }

                    /* renamed from: d */
                    public final void mo51266d() {
                        BaseAwemeDetailFragment.this.f84493o = "click_reply_comment";
                        BaseAwemeDetailFragment.this.mo65719e(comment);
                    }

                    /* renamed from: g */
                    public final void mo51269g() {
                        BaseAwemeDetailFragment.this.f84491m.mo51240a(comment, BaseAwemeDetailFragment.this.f84486d);
                    }

                    /* renamed from: h */
                    public final void mo51270h() {
                        C25280a.m61493a().sendCloseCommentTabEvent(BaseAwemeDetailFragment.this.f84486d);
                    }

                    /* renamed from: i */
                    public final void mo51271i() {
                        C25265n nVar = nVar;
                        Comment comment = comment;
                        if (nVar != null) {
                            nVar.mo51559a();
                        }
                    }

                    /* renamed from: j */
                    public final void mo51272j() {
                        C25265n nVar = nVar;
                        Comment comment = comment;
                        if (nVar != null) {
                            nVar.mo51560b();
                        }
                    }

                    /* renamed from: f */
                    public final void mo51268f() {
                        BaseAwemeDetailFragment.this.f84491m.mo51239a(comment);
                        C25280a.m61493a().sendCopyCommentEvent(BaseAwemeDetailFragment.this.f84486d, comment.getUser().getUid(), comment.getCid(), BaseAwemeDetailFragment.this.mo65538r());
                    }

                    /* renamed from: b */
                    public final void mo51264b() {
                        BaseAwemeDetailFragment baseAwemeDetailFragment = BaseAwemeDetailFragment.this;
                        Comment comment = comment;
                        FragmentActivity activity = baseAwemeDetailFragment.getActivity();
                        if (activity != null && comment != null) {
                            if (!C32455a.m75135a(activity)) {
                                C10691a.m21548c((Context) activity, (int) R.string.cg1).mo19066a();
                                return;
                            }
                            if (baseAwemeDetailFragment.f84492n == null) {
                                baseAwemeDetailFragment.f84492n = C25280a.m61493a().providerCommentDeletePresenter();
                                baseAwemeDetailFragment.f84492n.mo51426a(baseAwemeDetailFragment);
                            }
                            if (!TextUtils.isEmpty(comment.getCid())) {
                                baseAwemeDetailFragment.f84492n.mo51427a(comment.getCid(), baseAwemeDetailFragment.f84489k.getAid());
                                baseAwemeDetailFragment.f84494p = comment;
                            }
                        }
                    }
                });
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f84486d = getArguments().getString("refer");
        this.f84487e = getArguments().getString("tab_name");
        this.f84488j = getArguments().getString("content_source");
        this.f84498t = getArguments().getString("cid");
        this.f84485c = new C31777f(this.f84486d, 0);
        this.f84485c.mo64733f();
        this.f84485c.mo54799a(new C30508z());
        this.f84485c.mo54800a((C31835c) this);
        this.f84500v = C25280a.m61493a().providerReplyCommentDataManager();
        this.f84496r = new C32386a(this, this.f84486d, this.f84500v);
        this.f84496r.mo65523d();
        this.f84484b = new C32374a(this.mRecyclerView, this.f84496r.mo65522c());
        this.f84484b.f84267h = this.f84486d;
        this.f84484b.f84268i = this.f84487e;
        this.f84484b.f84269j = this.f84488j;
        this.f84484b.mo54798c(false);
        this.f84484b.f84262c = this.f84485c;
        this.f84484b.f84261b = this.f84496r.mo65521b();
        this.f84484b.f84260a = this.f84496r.mo65520a();
        this.f84484b.mo54788a((C26846a) this);
        this.f84484b.f84274z = this.f84500v;
        this.f84484b.f84264e = new C31755b() {
            /* renamed from: d */
            public final String mo64657d() {
                return "key_container_forward_detail";
            }

            /* renamed from: a */
            public final boolean mo64654a() {
                return BaseAwemeDetailFragment.this.isViewValid();
            }

            /* renamed from: c */
            public final Context mo64656c() {
                return BaseAwemeDetailFragment.this.getActivity();
            }

            /* renamed from: b */
            public final boolean mo64655b() {
                return BaseAwemeDetailFragment.this.getLifecycle().mo323a().equals(C0178b.RESUMED);
            }
        };
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.mRecyclerView.setLayoutManager(wrapLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.f84484b);
        this.mRecyclerView.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                int l = ((LinearLayoutManager) BaseAwemeDetailFragment.this.mRecyclerView.getLayoutManager()).mo4751l();
                int A = BaseAwemeDetailFragment.this.mRecyclerView.getLayoutManager().mo5013A();
                if (l >= 8 && A - l < 8 && BaseAwemeDetailFragment.this.f84483a.mo51438a().isHasMore()) {
                    BaseAwemeDetailFragment.this.mo65729v();
                }
            }
        });
        this.f84483a = C25280a.m61493a().providerCommentFetchPresenter();
        this.f84483a.mo51440a((C26877c<Comment>) this);
        this.f84483a.mo51439a(this.f84500v);
        mo65726s();
        this.f84491m = C31781d.m73923b().mo64674a(this, hashCode(), this);
        C25145b bVar = this.f84491m;
        MentionEditText mentionEditText = this.mEditText;
        FadeImageView fadeImageView = this.mAtView;
        FadeImageView fadeImageView2 = this.mEmojiView;
        if (this.f84489k != null) {
            str = this.f84489k.getAid();
        } else {
            str = "";
        }
        bVar.mo51242a(mentionEditText, fadeImageView, fadeImageView2, str, this.f84486d);
        this.mEditText.setCursorVisible(false);
        this.f84495q = this.f84484b;
    }

    /* renamed from: a */
    public final void mo64870a(final Exception exc, final Aweme aweme) {
        if (isViewValid()) {
            if (C24501b.m59896a(exc)) {
                C24501b.m59895a(getChildFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        BaseAwemeDetailFragment.this.f84485c.mo44935c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        BaseAwemeDetailFragment.this.f84484b.mo65512a(exc, aweme, BaseAwemeDetailFragment.this.f84485c.mo64732e());
                    }
                });
            } else {
                this.f84484b.mo65512a(exc, aweme, this.f84485c.mo64732e());
            }
        }
    }

    /* renamed from: a */
    private static boolean m75056a(Comment comment, int i, int i2) {
        int h = C25273o.m61473b().mo51553h(comment);
        if (h != -1 && i >= 0 && i2 >= 0 && h >= i && h <= i2) {
            return false;
        }
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.p2, viewGroup, false);
        C26894c.m65022a(inflate.findViewById(R.id.csm));
        return inflate;
    }

    /* renamed from: a */
    public final void mo51780a(Exception exc, int i, Comment comment) {
        int i2;
        if (i == 3) {
            i2 = R.string.b65;
        } else {
            i2 = R.string.a9f;
        }
        int[] y = m75061y();
        if (i == 3) {
            C32401a.m74901a(this.f84486d, this.f84489k, C22858c.f61208d, this.f84493o, false);
        }
        if (!C25273o.m61473b().mo51547a(comment)) {
            m75057h(comment);
        }
        C25273o.m61473b().mo51548c(comment);
        if (C25280a.m61493a().handleException(this.mRecyclerView.getContext(), exc, i2, m75056a(comment, y[0], y[1]))) {
            C25273o.m61473b().mo51552g(comment);
            String fakeId = comment.getFakeId();
            int c = this.f84500v.mo51524c(fakeId);
            int a = this.f84484b.mo65511a(fakeId, c);
            if (a > 0) {
                int i3 = a - 1;
                this.f84500v.mo51513a(i3, c + i3);
            }
            return;
        }
        m75058i(comment);
    }

    /* renamed from: a */
    private void m75054a(Comment comment, int i, int i2, String str) {
        String str2;
        String str3;
        Comment comment2 = comment;
        Aweme aweme = this.f84489k;
        String str4 = this.f84486d;
        String str5 = C22858c.f61208d;
        if (this.f84490l != null) {
            str2 = comment.getCid();
        } else {
            str2 = "";
        }
        C37879b.m84585b(aweme, str4, str5, str2);
        CommentService a = C25280a.m61493a();
        Aweme aweme2 = this.f84489k;
        String str6 = this.f84486d;
        String commentCategory = C25280a.m61493a().getCommentCategory(comment2);
        if (comment2 != null) {
            str3 = comment.getCid();
        } else {
            str3 = "";
        }
        a.sendPostCommentEvent(aweme2, str, str6, commentCategory, str3, C22858c.f61208d, String.valueOf(i2), 0, "");
    }

    /* renamed from: a */
    public final void mo51779a(int i, int i2, String str, String str2, String str3) {
        m75054a(this.f84490l, i, i2, str);
    }
}
