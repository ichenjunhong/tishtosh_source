package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.SparseArray;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.p963c.C13948g;
import com.facebook.imagepipeline.p964d.C13959c;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p964d.C13985o;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.imagepipeline.p975o.C14229b;
import com.p683ss.android.medialib.jni.FrameThumb;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache */
public interface VideoCoverBitmapCache {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$DefaultVideoCover */
    public static class DefaultVideoCover extends VideoCoverCacheImpl {

        /* renamed from: a */
        public SparseArray<C13715a<C14042c>> f114720a = new SparseArray<>();

        /* access modifiers changed from: 0000 */
        @C0200t(mo345a = C0177a.ON_DESTROY)
        public void onDestroy() {
            this.f114730f.unInitVideoToGraph();
            for (int i = 0; i < this.f114720a.size(); i++) {
                C13715a.m27752c((C13715a) this.f114720a.valueAt(i));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Runnable mo91705b(final int i, final C45370a aVar) {
            return new Runnable() {
                public final void run() {
                    int[] frameThumbnail = DefaultVideoCover.this.f114730f.getFrameThumbnail(i);
                    if (frameThumbnail != null) {
                        C13715a a = C13715a.m27746a(new C14043d(Bitmap.createBitmap(frameThumbnail, DefaultVideoCover.this.f114726b, DefaultVideoCover.this.f114727c, Config.ARGB_8888), (C13718c<Bitmap>) C13948g.m28419a(), C14046g.f36711a, 0));
                        final C13715a b = a.clone();
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                aVar.mo86475a(b);
                            }
                        });
                        DefaultVideoCover.this.f114720a.put(i, a);
                    }
                }
            };
        }

        /* renamed from: a */
        public final void mo91704a(int i, C45370a aVar) {
            super.mo91704a(i, aVar);
            C13715a aVar2 = (C13715a) this.f114720a.get(i);
            if (aVar2 == null || !aVar2.mo25635d()) {
                this.f114729e.execute(mo91705b(i, aVar));
                return;
            }
            aVar.mo86475a(aVar2.clone());
            C13715a.m27752c(aVar2);
        }

        public DefaultVideoCover(C0184k kVar, FrameThumb frameThumb, String str, int i, int i2) {
            super(kVar, frameThumb, str, i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$VideoCoverCacheImpl */
    public static class VideoCoverCacheImpl implements C0183j, VideoCoverBitmapCache {

        /* renamed from: b */
        int f114726b;

        /* renamed from: c */
        int f114727c;

        /* renamed from: d */
        String f114728d;

        /* renamed from: e */
        Executor f114729e;

        /* renamed from: f */
        FrameThumb f114730f;

        /* access modifiers changed from: 0000 */
        @C0200t(mo345a = C0177a.ON_DESTROY)
        public void onDestroy() {
            if (this.f114730f != null) {
                this.f114730f.unInitVideoToGraph();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Runnable mo91705b(final int i, final C45370a aVar) {
            return new Runnable() {
                public final void run() {
                    int[] frameThumbnail = VideoCoverCacheImpl.this.f114730f.getFrameThumbnail(i);
                    if (frameThumbnail != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(frameThumbnail, VideoCoverCacheImpl.this.f114726b, VideoCoverCacheImpl.this.f114727c, Config.ARGB_8888);
                        VideoCoverCacheImpl videoCoverCacheImpl = VideoCoverCacheImpl.this;
                        C13715a a = C13715a.m27746a(new C14043d(createBitmap, (C13718c<Bitmap>) C13948g.m28419a(), C14046g.f36711a, 0));
                        final C13715a b = a.clone();
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                aVar.mo86475a(b);
                            }
                        });
                        StringBuilder sb = new StringBuilder();
                        sb.append(VideoCoverCacheImpl.this.f114728d);
                        sb.append(i);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder("file://");
                        sb3.append(sb2);
                        C13771c.m27874b().mo26209c().mo26160a(C13978j.m28504a().mo26145a(C14229b.fromUri(sb3.toString()), null), a);
                    }
                }
            };
        }

        /* renamed from: a */
        public void mo91704a(int i, C45370a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f114728d);
            sb.append(i);
            String sb2 = sb.toString();
            C13985o c = C13771c.m27874b().mo26209c();
            StringBuilder sb3 = new StringBuilder("file://");
            sb3.append(sb2);
            C13959c cVar = new C13959c(sb3.toString(), null, C13953e.m28428a(), C13950b.m28426a(), null, null, null);
            C13715a a = c.mo26159a(cVar);
            if (a != null) {
                aVar.mo86475a(a.clone());
                C13715a.m27752c(a);
                return;
            }
            this.f114729e.execute(mo91705b(i, aVar));
        }

        public VideoCoverCacheImpl(C0184k kVar, FrameThumb frameThumb, String str, int i, int i2) {
            this.f114728d = str;
            this.f114726b = i;
            this.f114727c = i2;
            kVar.getLifecycle().mo324a(this);
            this.f114730f = frameThumb;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiscardOldestPolicy());
            this.f114729e = threadPoolExecutor;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache$a */
    public interface C45370a {
        /* renamed from: a */
        void mo86475a(C13715a<C14042c> aVar);
    }

    /* renamed from: a */
    void mo91704a(int i, C45370a aVar);
}
