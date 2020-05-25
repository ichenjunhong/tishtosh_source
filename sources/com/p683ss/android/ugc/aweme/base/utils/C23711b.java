package com.p683ss.android.ugc.aweme.base.utils;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.common.utility.p522b.C9376b;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.utils.b */
public final class C23711b {

    /* renamed from: com.ss.android.ugc.aweme.base.utils.b$a */
    public static final class C23712a {

        /* renamed from: a */
        public boolean f63236a;

        /* renamed from: b */
        public Config f63237b = Config.RGB_565;

        /* renamed from: c */
        public int f63238c = R.drawable.x4;

        /* renamed from: d */
        public UrlModel f63239d;

        /* renamed from: e */
        public RemoteImageView f63240e;

        /* renamed from: f */
        C13791d<C14045f> f63241f = new C13790c<C14045f>() {

            /* renamed from: a */
            boolean f63248a;

            public final void onRelease(String str) {
                super.onRelease(str);
                this.f63248a = false;
            }

            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                super.onIntermediateImageSet(str, (C14045f) obj);
                this.f63248a = false;
            }

            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                C23712a aVar = C23712a.this;
                aVar.mo49147a(aVar.f63236a, aVar.f63237b, null);
                this.f63248a = false;
            }

            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C14045f fVar = (C14045f) obj;
                if (animatable != null) {
                    this.f63248a = true;
                    if (C23712a.this.f63240e.getController() != null && C23712a.this.f63240e.getVisibility() == 0 && this.f63248a) {
                        Animatable i = C23712a.this.f63240e.getController().mo25749i();
                        if (i != null && !i.isRunning()) {
                            i.start();
                        }
                    }
                    return;
                }
                this.f63248a = false;
            }
        };

        /* renamed from: g */
        private int f63242g;

        /* renamed from: h */
        private int f63243h;

        /* renamed from: i */
        private C14229b[] f63244i;

        /* renamed from: j */
        private C13842a f63245j;

        /* renamed from: k */
        private C13773e f63246k;

        /* renamed from: l */
        private boolean f63247l = true;

        public final int hashCode() {
            return C23722i.m58214a(Integer.valueOf(this.f63238c), this.f63239d, this.f63240e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23712a)) {
                return false;
            }
            C23712a aVar = (C23712a) obj;
            if (this.f63238c != aVar.f63238c || !C23722i.m58215a(this.f63239d, aVar.f63239d) || !C23722i.m58215a(this.f63240e, aVar.f63240e)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private C14229b[] m58199a(int i, boolean z, Config config) {
            if (this.f63244i == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                imageDecodeOptionsBuilder.mo26113a(z);
                this.f63244i = new C14229b[]{C14232c.m29168a(i).mo26451a(new C13950b(imageDecodeOptionsBuilder)).mo26449a()};
            }
            return this.f63244i;
        }

        /* renamed from: a */
        private C14229b[] m58200a(String str, boolean z, Config config) {
            if (this.f63244i == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                imageDecodeOptionsBuilder.mo26112a(1);
                imageDecodeOptionsBuilder.mo26113a(z);
                this.f63244i = new C14229b[]{C14232c.m29169a(Uri.parse(str)).mo26451a(new C13950b(imageDecodeOptionsBuilder)).mo26449a()};
            }
            return this.f63244i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49147a(boolean r4, android.graphics.Bitmap.Config r5, com.facebook.drawee.p936c.C13790c<com.facebook.imagepipeline.p970j.C14045f> r6) {
            /*
                r3 = this;
                r3.f63236a = r4
                r3.f63237b = r5
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.f63239d
                if (r0 != 0) goto L_0x0013
                int r0 = r3.f63243h
                if (r0 <= 0) goto L_0x002e
                int r0 = r3.f63243h
                com.facebook.imagepipeline.o.b[] r4 = r3.m58199a(r0, r4, r5)
                goto L_0x002f
            L_0x0013:
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.f63239d
                java.util.List r0 = r0.getUrlList()
                int r1 = r3.f63242g
                int r2 = r1 + 1
                r3.f63242g = r2
                java.lang.String r0 = com.p683ss.android.ugc.aweme.base.utils.C23711b.m58198a(r0, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x002e
                com.facebook.imagepipeline.o.b[] r4 = r3.m58200a(r0, r4, r5)
                goto L_0x002f
            L_0x002e:
                r4 = 0
            L_0x002f:
                if (r4 != 0) goto L_0x003d
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r3.f63240e
                int r5 = r3.f63238c
                com.ss.android.ugc.aweme.base.model.a r5 = com.p683ss.android.ugc.aweme.base.model.C23556a.m57755a(r5)
                com.p683ss.android.ugc.aweme.base.C23515d.m57676a(r4, r5)
                return
            L_0x003d:
                com.facebook.drawee.a.a.e r5 = r3.f63246k
                if (r5 != 0) goto L_0x0062
                com.facebook.drawee.a.a.e r5 = com.facebook.drawee.p930a.p931a.C13771c.m27870a()
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r3.f63240e
                com.facebook.drawee.h.a r0 = r0.getController()
                com.facebook.drawee.c.b r5 = r5.mo25759b(r0)
                com.facebook.drawee.a.a.e r5 = (com.facebook.drawee.p930a.p931a.C13773e) r5
                com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f> r0 = r3.f63241f
                com.facebook.drawee.c.b r5 = r5.mo25751a(r0)
                com.facebook.drawee.a.a.e r5 = (com.facebook.drawee.p930a.p931a.C13773e) r5
                r0 = 1
                com.facebook.drawee.c.b r5 = r5.mo25762c(r0)
                com.facebook.drawee.a.a.e r5 = (com.facebook.drawee.p930a.p931a.C13773e) r5
                r3.f63246k = r5
            L_0x0062:
                com.facebook.drawee.a.a.e r5 = r3.f63246k
                r5.mo25755a((REQUEST[]) r4)
                com.facebook.drawee.h.a r4 = r3.f63245j
                if (r4 != 0) goto L_0x0082
                com.facebook.drawee.a.a.e r4 = r3.f63246k
                com.facebook.drawee.c.a r4 = r4.mo25763d()
                r3.f63245j = r4
                com.facebook.drawee.h.a r4 = r3.f63245j
                boolean r4 = r4 instanceof com.facebook.drawee.p930a.p931a.C13772d
                if (r4 == 0) goto L_0x0082
                if (r6 == 0) goto L_0x0082
                com.facebook.drawee.h.a r4 = r3.f63245j
                com.facebook.drawee.a.a.d r4 = (com.facebook.drawee.p930a.p931a.C13772d) r4
                r4.mo25736a(r6)
            L_0x0082:
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r3.f63240e
                com.facebook.drawee.h.a r5 = r3.f63245j
                r4.setController(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.utils.C23711b.C23712a.mo49147a(boolean, android.graphics.Bitmap$Config, com.facebook.drawee.c.c):void");
        }
    }

    /* renamed from: a */
    public static String m58198a(List<String> list, int i) {
        if (!C9376b.m18558a((Collection<T>) list) && i < list.size()) {
            return (String) list.get(i);
        }
        return null;
    }
}
