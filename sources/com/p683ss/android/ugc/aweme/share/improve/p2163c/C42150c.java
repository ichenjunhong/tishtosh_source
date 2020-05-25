package com.p683ss.android.ugc.aweme.share.improve.p2163c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.support.p030v4.app.C0636b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.share.improve.C42163e;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.C47722bj;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.c */
public final class C42150c {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.c.c$a */
    public static final class C42151a implements C23364b {

        /* renamed from: a */
        final /* synthetic */ Activity f106616a;

        /* renamed from: b */
        final /* synthetic */ Context f106617b;

        /* renamed from: com.ss.android.ugc.aweme.share.improve.c.c$a$a */
        static final class C42152a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42151a f106618a;

            C42152a(C42151a aVar) {
                this.f106618a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C47720bh.m103294a(this.f106618a.f106617b);
            }
        }

        public C42151a(Activity activity, Context context) {
            this.f106616a = activity;
            this.f106617b = context;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            C52711k.m112236a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && iArr[0] == -1 && !C0636b.m1719a(this.f106616a, strArr[0])) {
                C47700ay.m103234a(this.f106617b, R.string.kc, R.string.wf, null, R.string.ah4, new C42152a(this)).show();
            }
        }
    }

    /* renamed from: a */
    public static final Context m92517a() {
        return C11010c.m22280a();
    }

    /* renamed from: a */
    public static final ShareInfo m92520a(ShareInfo shareInfo) {
        if (shareInfo != null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.setShareTitle("");
        shareInfo2.setBoolPersist(0);
        shareInfo2.setShareDesc("");
        shareInfo2.setShareSignatureDesc("");
        shareInfo2.setShareSignatureUrl("");
        shareInfo2.setShareUrl("");
        shareInfo2.setShareQuote("");
        return shareInfo2;
    }

    /* renamed from: a */
    public static final Uri m92518a(String str, Context context) {
        C52711k.m112240b(str, "$this$pathToUri");
        C52711k.m112240b(context, "context");
        Uri a = C47722bj.m103304a(context, new File(str));
        C52711k.m112236a((Object) a, "FileProviderUtils.getFil…rUri(context, File(this))");
        return a;
    }

    /* renamed from: a */
    public static final String m92521a(String str, C42307b bVar) {
        C52711k.m112240b(str, "$this$enhanceAppParams");
        C52711k.m112240b(bVar, "channel");
        return C42163e.m92531a(C42163e.f106630a, str, bVar.mo86136b(), false, 4, null);
    }
}
