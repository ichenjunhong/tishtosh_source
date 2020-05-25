package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.share.C41974am;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p064c.p065a.C1680ad;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p082e.C2033b;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.d */
public class C42079d implements C42357g {

    /* renamed from: a */
    public static final C42080a f106496a = new C42080a(null);

    /* renamed from: b */
    private final String f106497b;

    /* renamed from: c */
    private final boolean f106498c;

    /* renamed from: d */
    private final boolean f106499d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$a */
    public static final class C42080a {
        private C42080a() {
        }

        public /* synthetic */ C42080a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$b */
    static final class C42081b<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ SharePackage f106500a;

        /* renamed from: b */
        final /* synthetic */ String f106501b;

        C42081b(SharePackage sharePackage, String str) {
            this.f106500a = sharePackage;
            this.f106501b = str;
        }

        public final /* synthetic */ Object call() {
            String a = C41974am.m91940a(this.f106500a, this.f106501b);
            if (a == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.d$c */
    static final class C42082c<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ C42079d f106502a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f106503b;

        /* renamed from: c */
        final /* synthetic */ Context f106504c;

        C42082c(C42079d dVar, SharePackage sharePackage, Context context) {
            this.f106502a = dVar;
            this.f106503b = sharePackage;
            this.f106504c = context;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C42079d dVar = this.f106502a;
            C52711k.m112236a((Object) str, "toCopy");
            dVar.mo86117a(str, this.f106504c);
        }
    }

    public C42079d() {
        this(null, false, false, 7, null);
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.an2;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.dhn;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "copy";
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
    public boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
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
    public void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C1680ad b = C1680ad.m5962a((Callable<? extends T>) new C42081b<Object>(sharePackage, "copy_link")).mo6148a(C1667a.m5940a()).mo6155b(C2168a.m6521b());
        C1710e cVar = new C42082c(this, sharePackage, context);
        C1745b.m6050a(cVar, "doAfterSuccess is null");
        C2150a.m6480a((C1680ad<T>) new C2033b<T>(b, cVar)).mo6158b();
    }

    /* renamed from: a */
    public final void mo86117a(String str, Context context) {
        C52711k.m112240b(str, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            CharSequence charSequence = str;
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
            if (this.f106499d) {
                C10691a.m21533a(context, (int) R.string.aix).mo19066a();
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    public C42079d(String str, boolean z, boolean z2) {
        C52711k.m112240b(str, "enterFrom");
        this.f106497b = str;
        this.f106498c = z;
        this.f106499d = z2;
    }

    public /* synthetic */ C42079d(String str, boolean z, boolean z2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        this(str, false, z2);
    }
}
