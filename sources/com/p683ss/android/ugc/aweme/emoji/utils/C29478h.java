package com.p683ss.android.ugc.aweme.emoji.utils;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.h */
public final class C29478h {

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.h$a */
    static final class C29479a {

        /* renamed from: a */
        public RemoteImageView f77212a;

        /* renamed from: b */
        public C29482j f77213b;

        /* renamed from: c */
        public boolean f77214c = true;

        /* renamed from: d */
        C13791d<C14045f> f77215d = new C13791d<C14045f>() {

            /* renamed from: a */
            boolean f77223a;

            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            public final void onSubmit(String str, Object obj) {
            }

            public final void onRelease(String str) {
                this.f77223a = false;
            }

            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                C14045f fVar = (C14045f) obj;
                this.f77223a = false;
            }

            public final void onFailure(String str, Throwable th) {
                if (C29479a.this.f77213b != null) {
                    C29479a.this.f77213b.at_();
                }
                C29479a.this.mo59588a();
                this.f77223a = false;
            }

            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C14045f fVar = (C14045f) obj;
                if (animatable != null) {
                    this.f77223a = true;
                    if (C29479a.this.f77212a.getController() != null && this.f77223a) {
                        Animatable i = C29479a.this.f77212a.getController().mo25749i();
                        if (i != null && !i.isRunning() && C29479a.this.f77214c) {
                            i.start();
                        }
                    }
                    if (C29479a.this.f77213b != null) {
                        C29479a.this.f77213b.as_();
                    }
                } else {
                    this.f77223a = false;
                }
            }
        };

        /* renamed from: e */
        private int f77216e;

        /* renamed from: f */
        private UrlModel f77217f;

        /* renamed from: g */
        private C14229b[] f77218g;

        /* renamed from: h */
        private C13842a f77219h;

        /* renamed from: i */
        private int f77220i;

        /* renamed from: j */
        private int f77221j;

        /* renamed from: k */
        private C13773e f77222k;

        /* renamed from: a */
        public final void mo59588a() {
            List urlList = this.f77217f.getUrlList();
            int i = this.f77216e;
            this.f77216e = i + 1;
            C14229b[] a = m69564a(m69563a(urlList, i));
            if (this.f77222k == null) {
                this.f77222k = (C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(this.f77212a.getController())).mo25755a((REQUEST[]) a)).mo25751a(this.f77215d);
            }
            this.f77222k.mo25755a((REQUEST[]) a);
            if (this.f77219h == null) {
                this.f77219h = this.f77222k.mo25763d();
            }
            this.f77212a.setController(this.f77219h);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C29479a mo59587a(boolean z) {
            this.f77214c = z;
            return this;
        }

        /* renamed from: a */
        private C14229b[] m69564a(String str) {
            if (this.f77218g == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Config.ARGB_8888);
                imageDecodeOptionsBuilder.mo26112a(1);
                imageDecodeOptionsBuilder.mo26113a(false);
                C14232c a = C14232c.m29169a(Uri.parse(str)).mo26451a(new C13950b(imageDecodeOptionsBuilder));
                if (this.f77221j > 0 && this.f77220i > 0) {
                    a.mo26453a(new C13952d(this.f77220i, this.f77221j));
                }
                this.f77218g = new C14229b[]{a.mo26449a()};
            }
            return this.f77218g;
        }

        /* renamed from: a */
        private static String m69563a(List<String> list, int i) {
            if (!C9376b.m18558a((Collection<T>) list) && i < list.size()) {
                return (String) list.get(i);
            }
            return null;
        }

        C29479a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C29482j jVar) {
            this.f77212a = remoteImageView;
            this.f77217f = urlModel;
            this.f77220i = i;
            this.f77221j = i2;
            this.f77213b = jVar;
        }
    }

    /* renamed from: a */
    public static void m69558a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m69561a(remoteImageView, urlModel, true);
    }

    /* renamed from: a */
    public static void m69562a(RemoteImageView remoteImageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            List singletonList = Collections.singletonList(str);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(singletonList);
            m69558a(remoteImageView, urlModel);
        }
    }

    /* renamed from: a */
    public static void m69560a(RemoteImageView remoteImageView, UrlModel urlModel, C29482j jVar) {
        m69559a(remoteImageView, urlModel, 0, 0, jVar, true);
    }

    /* renamed from: a */
    private static void m69561a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        m69559a(remoteImageView, urlModel, 0, 0, null, true);
    }

    /* renamed from: a */
    public static void m69559a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C29482j jVar, boolean z) {
        if (!C9376b.m18558a((Collection<T>) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            C29479a aVar = new C29479a(remoteImageView, urlModel, i, i2, jVar);
            aVar.mo59587a(z).mo59588a();
        }
    }
}
