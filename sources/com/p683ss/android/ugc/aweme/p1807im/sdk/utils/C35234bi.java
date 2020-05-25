package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.p522b.C9376b;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32464b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.R$drawable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bi */
public final class C35234bi {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bi$a */
    static final class C35235a {

        /* renamed from: a */
        public RemoteImageView f90534a;

        /* renamed from: b */
        public C35306y f90535b;

        /* renamed from: c */
        public boolean f90536c = true;

        /* renamed from: d */
        C13791d<C14045f> f90537d = new C13790c<C14045f>() {

            /* renamed from: a */
            boolean f90546a;

            public final void onRelease(String str) {
                super.onRelease(str);
                this.f90546a = false;
            }

            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                super.onIntermediateImageSet(str, (C14045f) obj);
                this.f90546a = false;
            }

            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                if (C35235a.this.f90535b != null) {
                    C35235a.this.f90535b.mo71038b();
                }
                C35235a.this.mo73338a();
                this.f90546a = false;
            }

            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C14045f fVar = (C14045f) obj;
                if (animatable != null) {
                    this.f90546a = true;
                    if (C35235a.this.f90534a.getController() != null && this.f90546a) {
                        Animatable i = C35235a.this.f90534a.getController().mo25749i();
                        if (i != null && !i.isRunning() && C35235a.this.f90536c) {
                            i.start();
                        }
                    }
                    if (C35235a.this.f90535b != null) {
                        C35235a.this.f90535b.mo71037a();
                    }
                } else {
                    this.f90546a = false;
                }
            }
        };

        /* renamed from: e */
        private int f90538e;

        /* renamed from: f */
        private UrlModel f90539f;

        /* renamed from: g */
        private C14229b[] f90540g;

        /* renamed from: h */
        private C13842a f90541h;

        /* renamed from: i */
        private int f90542i;

        /* renamed from: j */
        private int f90543j;

        /* renamed from: k */
        private C13773e f90544k;

        /* renamed from: l */
        private boolean f90545l = true;

        /* renamed from: a */
        public final void mo73338a() {
            List urlList = this.f90539f.getUrlList();
            int i = this.f90538e;
            this.f90538e = i + 1;
            String a = C35234bi.m79637a(urlList, i);
            if (!TextUtils.isEmpty(a)) {
                C14229b[] a2 = m79645a(a);
                if (this.f90544k == null) {
                    this.f90544k = (C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(this.f90534a.getController())).mo25755a((REQUEST[]) a2)).mo25751a(this.f90537d);
                }
                this.f90544k.mo25755a((REQUEST[]) a2);
                if (this.f90541h == null) {
                    this.f90541h = this.f90544k.mo25763d();
                }
                this.f90534a.setController(this.f90541h);
            } else if (this.f90545l) {
                if (this.f90535b != null && this.f90535b.mo71039c()) {
                    int a3 = C32464b.m75163a(this.f90534a.getContext(), 90.0f);
                    LayoutParams layoutParams = this.f90534a.getLayoutParams();
                    layoutParams.width = a3;
                    layoutParams.height = a3;
                    this.f90534a.setLayoutParams(layoutParams);
                }
                if (this.f90535b == null) {
                    C23515d.m57676a(this.f90534a, C23556a.m57755a(R$drawable.im_emoji_download_fail));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C35235a mo73337a(boolean z) {
            this.f90545l = z;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C35235a mo73339b(boolean z) {
            this.f90536c = z;
            return this;
        }

        /* renamed from: a */
        private C14229b[] m79645a(String str) {
            if (this.f90540g == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Config.ARGB_8888);
                imageDecodeOptionsBuilder.mo26112a(1);
                imageDecodeOptionsBuilder.mo26113a(false);
                C14232c a = C14232c.m29169a(Uri.parse(str)).mo26451a(new C13950b(imageDecodeOptionsBuilder));
                if (this.f90543j > 0 && this.f90542i > 0) {
                    a.mo26453a(new C13952d(this.f90542i, this.f90543j));
                }
                this.f90540g = new C14229b[]{a.mo26449a()};
            }
            return this.f90540g;
        }

        public C35235a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C35306y yVar) {
            this.f90534a = remoteImageView;
            this.f90539f = urlModel;
            this.f90542i = i;
            this.f90543j = i2;
            this.f90535b = yVar;
        }
    }

    /* renamed from: b */
    public static void m79644b(RemoteImageView remoteImageView, UrlModel urlModel) {
        m79643a(remoteImageView, urlModel, true);
    }

    /* renamed from: a */
    public static String m79637a(List<String> list, int i) {
        if (!C9376b.m18558a((Collection<T>) list) && i < list.size()) {
            return (String) list.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public static void m79638a(RemoteImageView remoteImageView, UrlModel urlModel) {
        if (remoteImageView != null && urlModel != null) {
            if (!C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
                C23515d.m57669a(remoteImageView, urlModel);
                return;
            }
            if (!TextUtils.isEmpty(urlModel.getUri())) {
                C23515d.m57677a(remoteImageView, urlModel.getUri());
            }
        }
    }

    /* renamed from: a */
    public static void m79642a(RemoteImageView remoteImageView, UrlModel urlModel, C35306y yVar) {
        m79640a(remoteImageView, urlModel, 0, 0, yVar, true, true);
    }

    /* renamed from: a */
    public static void m79643a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        m79640a(remoteImageView, urlModel, 0, 0, null, z, true);
    }

    /* renamed from: a */
    public static void m79639a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m79640a(remoteImageView, urlModel, i, i2, null, true, true);
    }

    /* renamed from: a */
    public static void m79641a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, boolean z) {
        m79640a(remoteImageView, urlModel, i, i2, null, true, false);
    }

    /* renamed from: a */
    private static void m79640a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C35306y yVar, boolean z, boolean z2) {
        if (!C9376b.m18558a((Collection<T>) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            C35235a aVar = new C35235a(remoteImageView, urlModel, i, i2, yVar);
            aVar.mo73337a(z2).mo73339b(z).mo73338a();
        }
    }
}
