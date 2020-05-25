package com.p683ss.android.ugc.aweme.commercialize;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.bytedance.common.utility.p522b.C9376b;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b */
public final class C25649b {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b$a */
    public interface C25651a {
        /* renamed from: a */
        void mo52802a();

        /* renamed from: b */
        void mo52803b();
    }

    /* renamed from: a */
    public static boolean m62171a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C14017k.m28587a().mo26210d().mo25512d(C13978j.m28504a().mo26147c(C14229b.fromUri(uri), null));
    }

    /* renamed from: a */
    public static void m62168a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m62169a(remoteImageView, urlModel, false, new C25588a(false, remoteImageView));
    }

    /* renamed from: a */
    public static void m62170a(String str, final C25651a aVar) {
        if (str != null && !str.isEmpty() && !m62171a(Uri.parse(str))) {
            C14017k.m28587a().mo26211e().mo26188b(C14229b.fromUri(str), null).mo25666a(new C13744b<Void>() {
                public final void onFailureImpl(C13745c<Void> cVar) {
                    if (aVar != null) {
                        aVar.mo52803b();
                    }
                }

                public final void onNewResultImpl(C13745c<Void> cVar) {
                    if (aVar != null) {
                        aVar.mo52802a();
                    }
                }
            }, C24076h.m58903d());
        }
    }

    /* renamed from: a */
    public static void m62169a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z, C13791d dVar) {
        if (remoteImageView != null) {
            Context context = remoteImageView.getContext();
            if (context != null && urlModel != null && !C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
                C14229b[] a = C23515d.m57685a(urlModel, (C13952d) null, (C14234d) null, Config.ARGB_8888);
                if (a != null && a.length != 0) {
                    C13773e eVar = (C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25762c(false)).mo25755a((REQUEST[]) a);
                    eVar.mo25751a(C23515d.m57662a(dVar, a[0].mSourceUri, context, urlModel));
                    remoteImageView.setController(eVar.mo25763d());
                }
            }
        }
    }
}
