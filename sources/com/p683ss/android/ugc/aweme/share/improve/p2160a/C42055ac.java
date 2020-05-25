package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37609f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.C44418b;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.C44425c;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.C44426d;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.C44431i;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ac */
public final class C42055ac implements C42357g {

    /* renamed from: a */
    private final Aweme f106451a;

    /* renamed from: b */
    private final String f106452b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.adm;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d3z;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "react";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return R.drawable.d2z;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        if (!C37609f.m84056a(this.f106451a.getMusic())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    public C42055ac(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106451a = aweme;
        this.f106452b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C44418b bVar = new C44418b();
        Activity a = C42149b.m92512a(context);
        Aweme aweme = this.f106451a;
        String str = this.f106452b;
        bVar.f112366a = a;
        bVar.f112367b = aweme;
        bVar.f112371f = str;
        bVar.f112380o = System.currentTimeMillis();
        AVExternalServiceImpl.getAVServiceImpl_Monster().provideAVPerformance().start("av_video_record_init", "clickGoReaction");
        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
        if (aVServiceImpl_Monster == null || !aVServiceImpl_Monster.configService().avsettingsConfig().needLoginBeforeRecord()) {
            boolean z = false;
            if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishable()) {
                C9432q.m18689b(C11010c.m22280a(), (int) R.string.hr, 0);
                return;
            }
            if (!(bVar.f112367b == null || bVar.f112367b.getAuthor() == null)) {
                if (!C48016e.m103957g()) {
                    C10691a.m21542b(C11010c.m22280a(), (int) R.string.da8).mo19066a();
                } else if (C48016e.m103958h() < 20971520) {
                    C10691a.m21542b(C11010c.m22280a(), (int) R.string.da9).mo19066a();
                } else {
                    z = true;
                }
                if (z) {
                    if (!C44431i.m97235a(C11010c.m22280a())) {
                        C10691a.m21542b(C11010c.m22280a(), (int) R.string.cg2).mo19066a();
                        return;
                    } else if (C37609f.m84056a(bVar.f112367b.getMusic())) {
                        C10691a.m21536a((Context) bVar.f112366a, (int) R.string.hj9, 1, 2, (int) C9432q.m18687b((Context) bVar.f112366a, 16.0f)).mo19066a();
                        return;
                    } else {
                        bVar.f112378m = C45547d.m99208b(bVar.f112366a, bVar.f112366a.getResources().getString(R.string.au9));
                        bVar.f112378m.setIndeterminate(true);
                        C0013i.m16a((Callable<TResult>) new C44425c<TResult>(bVar)).mo20a((C0011g<TResult, TContinuationResult>) new C44426d<TResult,TContinuationResult>(bVar), C0013i.f25b);
                        return;
                    }
                }
            }
            return;
        }
        C27965f.m66720a(a, str, "click_react_button", C47661ab.m103163a().mo94972a("login_title", a.getString(R.string.dij)).f120139a);
    }
}
