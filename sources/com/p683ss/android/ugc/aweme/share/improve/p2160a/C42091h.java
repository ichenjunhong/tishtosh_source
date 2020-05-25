package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.feed.C30131ah;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.p2159h.C42035a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p064c.p065a.C2149h;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.h */
public final class C42091h extends C42079d {

    /* renamed from: b */
    public final Aweme f106518b;

    /* renamed from: c */
    public final boolean f106519c;

    /* renamed from: d */
    public final int f106520d;

    /* renamed from: e */
    private final String f106521e;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.h$a */
    static final class C42092a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C42091h f106522a;

        C42092a(C42091h hVar) {
            this.f106522a = hVar;
        }

        public final /* synthetic */ Object call() {
            return C30131ah.m70705a(this.f106522a.f106518b.getShareInfo(), "copy_link", true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.h$b */
    static final class C42093b<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ C42091h f106523a;

        /* renamed from: b */
        final /* synthetic */ C41047a f106524b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f106525c;

        /* renamed from: d */
        final /* synthetic */ Context f106526d;

        C42093b(C42091h hVar, C41047a aVar, SharePackage sharePackage, Context context) {
            this.f106523a = hVar;
            this.f106524b = aVar;
            this.f106525c = sharePackage;
            this.f106526d = context;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            String str;
            String str2 = (String) obj;
            C41047a aVar = this.f106524b;
            if (aVar != null) {
                aVar.dismiss();
            }
            ShareInfo shareInfo = this.f106523a.f106518b.getShareInfo();
            C52711k.m112236a((Object) shareInfo, "aweme.shareInfo");
            String shareLinkDesc = shareInfo.getShareLinkDesc();
            C52711k.m112236a((Object) shareLinkDesc, "copyUrlText");
            if (shareLinkDesc.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C52711k.m112236a((Object) str2, "url");
                str = C52830p.m112401a(shareLinkDesc, "%s", str2, false, 4, (Object) null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f106525c.f106898g);
                sb.append(" ");
                sb.append(this.f106525c.f106899h);
                str = sb.toString();
            }
            this.f106523a.mo86117a(str, this.f106526d);
            if (!this.f106523a.f106519c) {
                C10691a.m21533a(this.f106526d, this.f106523a.f106520d).mo19066a();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return this.f106518b.getAwemeControl().canShare();
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (!C42148a.m92511a((C42357g) this, context, this.f106518b, this.f106521e) || !this.f106518b.getAwemeControl().canShare() || C23794bh.m58390d().mo47104a((int) R.string.dwm)) {
            return;
        }
        if (this.f106518b.getAwemeType() != 13 || C42069am.m92164a(this.f106518b, context)) {
            Aweme aweme = this.f106518b;
            if (aweme == null || aweme.getShareInfo() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C42035a.m92000a(this.f106518b);
                C41047a a = C41047a.m90709a(context, context.getResources().getString(R.string.au9));
                a.mo83562a();
                C2149h.m6452a((Callable<? extends T>) new C42092a<Object>(this)).mo6452b(C2168a.m6521b()).mo6443a(C1667a.m5940a()).mo6450b((C1710e<? super T>) new C42093b<Object>(this, a, sharePackage, context));
            }
        }
    }

    public C42091h(Aweme aweme, String str, boolean z, int i) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        super(str, false, false);
        this.f106518b = aweme;
        this.f106521e = str;
        this.f106519c = z;
        this.f106520d = i;
    }

    public /* synthetic */ C42091h(Aweme aweme, String str, boolean z, int i, int i2, C52707g gVar) {
        this(aweme, "", true, R.string.aix);
    }
}
