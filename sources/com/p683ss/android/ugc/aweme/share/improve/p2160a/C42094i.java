package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p683ss.android.ugc.aweme.share.p2159h.C42039e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.i */
public final class C42094i implements C42357g {

    /* renamed from: b */
    public static final C42095a f106527b = new C42095a(null);

    /* renamed from: a */
    public final String f106528a;

    /* renamed from: c */
    private final WeakReference<C30313ae<C30332aw>> f106529c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.i$a */
    public static final class C42095a {
        private C42095a() {
        }

        public /* synthetic */ C42095a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dxd;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.ao2;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "delete";
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
        return R.drawable.dxe;
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

    public C42094i(String str, C30313ae<C30332aw> aeVar) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(aeVar, "listener");
        this.f106528a = str;
        this.f106529c = new WeakReference<>(aeVar);
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        SharePackage sharePackage2;
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        String str = null;
        if (!(sharePackage instanceof AwemeSharePackage)) {
            sharePackage2 = null;
        } else {
            sharePackage2 = sharePackage;
        }
        if (((AwemeSharePackage) sharePackage2) != null) {
            Aweme a = ((AwemeSharePackage) sharePackage).mo86152a();
            if (a != null) {
                String string = sharePackage.f106900i.getString("tab_name", "");
                C23089d a2 = C23089d.m56640a().mo47829a("group_id", a.getAid()).mo47829a("enter_from", this.f106528a).mo47829a("impr_id", sharePackage.f106900i.getString("impr_id", ""));
                if (TextUtils.equals(this.f106528a, "personal_homepage")) {
                    a2.mo47829a("tab_name", string);
                }
                C26890h.m65011a("click_delete_video", a2.f61491a);
                if (!C42039e.m92005a(a) || !C31190f.m72831a(a)) {
                    C52711k.m112240b(a, "aweme");
                    C23088c cVar = new C23088c();
                    String str2 = "author_id";
                    User author = a.getAuthor();
                    if (author != null) {
                        str = author.getUid();
                    }
                    if (str == null) {
                        str = "";
                    }
                    C23088c a3 = cVar.mo47824a(str2, str);
                    String str3 = "video_is_null";
                    if (a.getVideo() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C23131p.m57779a("aweme_video_author_info_unmatch", a3.mo47819a(str3, Boolean.valueOf(z)).mo47825b());
                } else {
                    C30313ae aeVar = (C30313ae) this.f106529c.get();
                    C52711k.m112236a((Object) string, "tabName");
                    C42069am.m92162a(context, a, aeVar, string, this.f106528a, null, 32, null);
                }
            }
        }
    }
}
