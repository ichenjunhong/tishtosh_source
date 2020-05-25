package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.p522b.C9376b;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.i */
public final class C26515i {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.i$a */
    public interface C26517a {
        void onFailureImpl();

        void onNewResultImpl();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.i$b */
    public static class C26518b extends C13790c<C14045f> {

        /* renamed from: a */
        private final View f69842a;

        public C26518b(View view) {
            this.f69842a = view;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (fVar != null) {
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                if (height > 0) {
                    LayoutParams layoutParams = this.f69842a.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f69842a.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m64159a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C14017k.m28587a().mo26210d().mo25512d(C13978j.m28504a().mo26147c(C14229b.fromUri(uri), null));
    }

    /* renamed from: a */
    public static void m64153a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m64155a(remoteImageView, urlModel, false);
    }

    /* renamed from: a */
    public static void m64158a(String str, final C26517a aVar) {
        if (str != null && !str.isEmpty() && !m64159a(Uri.parse(str))) {
            C14017k.m28587a().mo26211e().mo26188b(C14229b.fromUri(str), null).mo25666a(new C13744b<Void>() {
                public final void onFailureImpl(C13745c<Void> cVar) {
                    if (aVar != null) {
                        aVar.onFailureImpl();
                    }
                }

                public final void onNewResultImpl(C13745c<Void> cVar) {
                    if (aVar != null) {
                        aVar.onNewResultImpl();
                    }
                }
            }, C24076h.m58903d());
        }
    }

    /* renamed from: a */
    private static void m64155a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        m64156a(remoteImageView, urlModel, false, new C26324a(false, remoteImageView));
    }

    /* renamed from: a */
    public static void m64157a(RemoteImageView remoteImageView, String str, C13791d<C14045f> dVar) {
        if (remoteImageView != null && !TextUtils.isEmpty(str)) {
            remoteImageView.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25757b(C14232c.m29169a(Uri.parse(str)).mo26449a())).mo25751a(dVar)).mo25763d());
        }
    }

    /* renamed from: a */
    public static void m64154a(RemoteImageView remoteImageView, UrlModel urlModel, C13791d<C14045f> dVar) {
        C26406ax axVar = new C26406ax(dVar, new C26518b(remoteImageView));
        if (remoteImageView != null && urlModel != null && remoteImageView.getContext() != null) {
            C14229b[] a = C23515d.m57684a(urlModel, (C13952d) null, (C14234d) null);
            if (a != null && a.length > 0) {
                C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25755a((REQUEST[]) a);
                eVar.mo25751a((C13791d<? super INFO>) new C26406ax<Object>(C23515d.m57662a(null, a[0].mSourceUri, remoteImageView.getContext(), urlModel), axVar));
                remoteImageView.setController(eVar.mo25763d());
            }
        }
    }

    /* renamed from: a */
    public static void m64156a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z, C13791d dVar) {
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
