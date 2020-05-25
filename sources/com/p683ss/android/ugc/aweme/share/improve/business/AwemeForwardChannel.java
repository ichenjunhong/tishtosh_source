package com.p683ss.android.ugc.aweme.share.improve.business;

import android.arch.lifecycle.C0183j;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25145b;
import com.p683ss.android.ugc.aweme.comment.services.C25285d;
import com.p683ss.android.ugc.aweme.comment.services.C25286e;
import com.p683ss.android.ugc.aweme.comment.services.CommentService;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.share.p2159h.C42035a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42307b.C42308a;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel */
public final class AwemeForwardChannel implements C0183j, C25285d, C42307b {

    /* renamed from: b */
    public static final C42143a f106609b = new C42143a(null);

    /* renamed from: a */
    public C25145b f106610a;

    /* renamed from: c */
    private final Aweme f106611c;

    /* renamed from: d */
    private final Fragment f106612d;

    /* renamed from: e */
    private final String f106613e;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel$a */
    public static final class C42143a {
        private C42143a() {
        }

        public /* synthetic */ C42143a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.business.AwemeForwardChannel$b */
    static final /* synthetic */ class C42144b extends C52710j implements C52670a<C52860x> {
        C42144b(AwemeForwardChannel awemeForwardChannel) {
            super(0, awemeForwardChannel);
        }

        public final String getName() {
            return "forwardAweme";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(AwemeForwardChannel.class);
        }

        public final String getSignature() {
            return "forwardAweme()V";
        }

        public final /* synthetic */ Object invoke() {
            ((AwemeForwardChannel) this.receiver).mo86144d();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.ana;
    }

    /* renamed from: a */
    public final void mo51779a(int i, int i2, String str, String str2, String str3) {
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        return true;
    }

    /* renamed from: a */
    public final boolean mo86138a(C42322h hVar, Context context) {
        C52711k.m112240b(hVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "forward";
    }

    /* renamed from: c */
    public final void mo51783c(Comment comment) {
    }

    /* renamed from: d */
    public final void mo86144d() {
        m92472n();
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.ana;
    }

    /* renamed from: e */
    public final void mo51784e(boolean z) {
    }

    /* renamed from: e_ */
    public final void mo51785e_(boolean z) {
    }

    /* renamed from: f */
    public final float mo86142f() {
        return 0.34f;
    }

    /* renamed from: f */
    public final void mo51786f(boolean z) {
    }

    /* renamed from: g */
    public final boolean mo86143g() {
        return false;
    }

    /* renamed from: h */
    public final Aweme mo51787h() {
        return this.f106611c;
    }

    /* renamed from: i */
    public final Comment mo51788i() {
        return null;
    }

    /* renamed from: j */
    public final String mo51789j() {
        return this.f106613e;
    }

    /* renamed from: k */
    public final int mo51790k() {
        return 4;
    }

    /* renamed from: l */
    public final boolean mo51791l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo51792m() {
        return C25286e.m61511a(this);
    }

    /* renamed from: c */
    public final String mo86137c() {
        String string = C11010c.m22280a().getString(R.string.b5x);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…tString(R.string.forward)");
        return string;
    }

    /* renamed from: n */
    private final void m92472n() {
        if (this.f106610a == null) {
            this.f106610a = C25280a.m61493a().providerCommentInputManager(this.f106612d, hashCode(), this);
        }
        C25145b bVar = this.f106610a;
        if (bVar == null) {
            C52711k.m112237a("commentInputManager");
        }
        bVar.mo51248h();
    }

    /* renamed from: a */
    public final boolean mo86141a(Context context) {
        C52711k.m112240b(context, "context");
        return C42308a.m92907a(this, context);
    }

    /* renamed from: b */
    public final void mo51781b(Comment comment) {
        C25145b bVar = this.f106610a;
        if (bVar == null) {
            C52711k.m112237a("commentInputManager");
        }
        bVar.mo51249j();
        C28220g.f74083b.mo56651a(this.f106611c, 3);
    }

    /* renamed from: b */
    public final void mo51782b(String str) {
        C25280a.m61493a().sendEmojiToKeyboardEvent(str, this.f106613e, this.f106611c.getAid(), this.f106611c.getAuthorUid());
    }

    public final void onEvent(C32385a aVar) {
        if (aVar != null && aVar.f84279d == 1 && this.f106610a != null) {
            if (aVar.f84280e == hashCode()) {
                C23794bh.m58391e().mo65594a(this.f106613e, aVar.f84278c, C22858c.f61208d, "click_share_button", true);
                Context context = this.f106612d.getContext();
                if (!(context == null || aVar.f84276a == null)) {
                    ForwardDetail forwardDetail = aVar.f84276a;
                    C52711k.m112236a((Object) forwardDetail, "event.forwardDetail");
                    if (forwardDetail.getComment() != null) {
                        CommentService a = C25280a.m61493a();
                        C52711k.m112236a((Object) context, "this");
                        ForwardDetail forwardDetail2 = aVar.f84276a;
                        C52711k.m112236a((Object) forwardDetail2, "event.forwardDetail");
                        Comment comment = forwardDetail2.getComment();
                        C52711k.m112236a((Object) comment, "event.forwardDetail.comment");
                        a.handleCommentInputPublishSuccess(context, comment);
                    }
                }
            }
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.b66).mo19066a();
            C25145b bVar = this.f106610a;
            if (bVar == null) {
                C52711k.m112237a("commentInputManager");
            }
            bVar.mo51249j();
        }
    }

    /* renamed from: a */
    public final void mo86139a(RemoteImageView remoteImageView, boolean z) {
        C52711k.m112240b(remoteImageView, "imageView");
        C42308a.m92906a(this, remoteImageView, z);
    }

    /* renamed from: a */
    public final boolean mo49947a(C42318f fVar, Context context) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (C23794bh.m58390d().mo47104a((int) R.string.dw5) || !this.f106611c.getAwemeControl().canShare() || !this.f106611c.getAwemeControl().canForward()) {
            return false;
        }
        C23794bh.m58391e().mo65597b(this.f106613e, this.f106611c, C22858c.f61208d, "click_share_button");
        C42035a.m92000a(this.f106611c);
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            C27965f.m66721a(C11016e.m22312g(), this.f106613e, "click_repost_button", (Bundle) null, (C23505g) new C42145a(new C42144b(this)));
        } else {
            mo86144d();
        }
        return true;
    }

    public AwemeForwardChannel(Aweme aweme, Fragment fragment, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(str, "enterFrom");
        this.f106611c = aweme;
        this.f106612d = fragment;
        this.f106613e = str;
    }

    /* renamed from: a */
    public final void mo51780a(Exception exc, int i, Comment comment) {
        int i2;
        CommentService a = C25280a.m61493a();
        Context a2 = C11010c.m22280a();
        if (i == 3) {
            i2 = R.string.b65;
        } else {
            i2 = R.string.a8l;
        }
        a.handleException(a2, exc, i2, false);
        if (i == 3) {
            C23794bh.m58391e().mo65594a(this.f106613e, this.f106611c, C22858c.f61208d, "click_share_button", false);
        }
    }
}
