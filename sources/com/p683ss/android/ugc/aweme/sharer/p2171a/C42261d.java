package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.net.Uri;
import com.facebook.C14533n;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareLinkContent.C14638a;
import com.facebook.share.model.SharePhoto.C14656a;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.C14658a;
import com.facebook.share.model.ShareVideo.C14661a;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.model.ShareVideoContent.C14663a;
import com.facebook.share.p990a.C14569a;
import com.p683ss.android.ugc.aweme.sharer.C42254a;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.d */
public final class C42261d extends C42254a {

    /* renamed from: a */
    public static final C42262a f106828a = new C42262a(null);

    /* renamed from: b */
    private final C42309a f106829b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.d$a */
    public static final class C42262a {
        private C42262a() {
        }

        public /* synthetic */ C42262a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.an9;
    }

    /* renamed from: a */
    public final boolean mo86141a(Context context) {
        C52711k.m112240b(context, "context");
        return true;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        return true;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "facebook";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "Facebook";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atk;
    }

    public C42261d(C42309a aVar) {
        C52711k.m112240b(aVar, "activityProvider");
        this.f106829b = aVar;
        if (!C14533n.m29764a()) {
            C14533n.m29760a((Context) this.f106829b.mo60818a());
        }
    }

    /* renamed from: a */
    public final boolean mo49947a(C42318f fVar, Context context) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (this.f106829b.mo60818a() == null) {
            return false;
        }
        return super.mo49947a(fVar, context);
    }

    /* renamed from: a */
    public final boolean mo86138a(C42322h hVar, Context context) {
        C52711k.m112240b(hVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        ShareLinkContent a = ((C14638a) new C14638a().mo26870a(Uri.parse(hVar.f106878b))).mo26878a(hVar.f106886d).mo26879a();
        C14569a aVar = new C14569a(this.f106829b.mo60818a());
        if (!aVar.mo26528a(a)) {
            return false;
        }
        aVar.mo26530b(a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        SharePhotoContent a = new C14658a().mo26923a(new C14656a().mo26917a(iVar.f106880b).mo26920a()).mo26926a();
        C14569a aVar = new C14569a(this.f106829b.mo60818a());
        if (!aVar.mo26528a(a)) {
            return false;
        }
        aVar.mo26530b(a);
        return true;
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        ShareVideoContent a = new C14663a().mo26937a(new C14661a().mo26931a(kVar.f106888b).mo26934a()).mo26938a();
        C14569a aVar = new C14569a(this.f106829b.mo60818a());
        if (!aVar.mo26528a(a)) {
            return false;
        }
        aVar.mo26530b(a);
        return true;
    }
}
