package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.api.C25647f;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25722k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.net.C37745b;
import com.p683ss.android.ugc.aweme.net.C37757d;
import com.p683ss.android.ugc.aweme.net.C37790j;
import com.p683ss.android.ugc.aweme.profile.experiment.ShowPrivateAlbumExp;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.o */
public final class C42114o implements C37757d<Object>, C42357g {

    /* renamed from: b */
    public static final C42115a f106573b = new C42115a(null);

    /* renamed from: a */
    public final Aweme f106574a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.o$a */
    public static final class C42115a {
        private C42115a() {
        }

        public /* synthetic */ C42115a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "top";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
    }

    /* renamed from: a */
    public final int mo49948a() {
        if (!this.f106574a.isTop()) {
            return 2131953750;
        }
        return 2131953754;
    }

    /* renamed from: b */
    public final int mo49953b() {
        if (this.f106574a.isTop()) {
            return R.string.ci6;
        }
        return R.string.e1y;
    }

    public C42114o(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        this.f106574a = aweme;
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

    /* renamed from: a */
    public final void mo46329a(Exception exc) {
        String str;
        C22971a.m56494a(C11010c.m22280a(), exc, R.string.cg1);
        String str2 = "click_video_top";
        User author = this.f106574a.getAuthor();
        C52711k.m112236a((Object) author, "aweme.author");
        C23089d a = new C23089d().mo47829a("group_id", this.f106574a.getAid()).mo47829a("author_id", author.getUid()).mo47829a("enter_from", "personal_homepage");
        String str3 = "final_status";
        if (this.f106574a.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        String str;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (ShowPrivateAlbumExp.m88630a() && this.f106574a.isPrivate() && !this.f106574a.isTop()) {
            C10691a.m21533a(context, (int) R.string.h1t).mo19066a();
        } else if (!this.f106574a.isPrivate() || this.f106574a.isTop()) {
            C37757d dVar = this;
            String aid = this.f106574a.getAid();
            boolean z = !this.f106574a.isTop();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C19180e("aweme_id", aid));
            String str2 = "need_top";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            arrayList.add(new C19180e(str2, String.valueOf(str)));
            C37745b bVar = new C37745b(C25647f.f67872a, C37790j.POST, (List<C19180e>) arrayList, String.class);
            bVar.mo77239a(dVar);
            bVar.f96183g = false;
            bVar.mo77238a();
        } else {
            C10691a.m21533a(context, (int) R.string.h49).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo46330a(String str, Object obj) {
        int i;
        String str2;
        this.f106574a.setIsTop(this.f106574a.isTop() ^ true ? 1 : 0);
        Context a = C11010c.m22280a();
        if (this.f106574a.isTop()) {
            i = R.string.e25;
        } else {
            i = R.string.e20;
        }
        C10691a.m21537a(a, a.getString(i)).mo19066a();
        String str3 = "click_video_top";
        User author = this.f106574a.getAuthor();
        C52711k.m112236a((Object) author, "aweme.author");
        C23089d a2 = new C23089d().mo47829a("group_id", this.f106574a.getAid()).mo47829a("author_id", author.getUid()).mo47829a("enter_from", "personal_homepage");
        String str4 = "final_status";
        if (this.f106574a.isTop()) {
            str2 = "top";
        } else {
            str2 = "top_cancel";
        }
        C26890h.m65011a(str3, a2.mo47829a(str4, str2).f61491a);
        C47718bf.m103288a(new C25722k(1));
    }
}
