package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.facebook.common.p918b.C13664c;
import com.facebook.common.p918b.C13670i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.p956a.p957a.C13905a;
import com.facebook.imagepipeline.p956a.p957a.C13913g;
import com.facebook.imagepipeline.p956a.p958b.C13915a;
import com.facebook.imagepipeline.p956a.p958b.C13918d;
import com.facebook.imagepipeline.p956a.p958b.C13919e;
import com.facebook.imagepipeline.p956a.p959c.C13924a;
import com.facebook.imagepipeline.p956a.p959c.C13925b;
import com.facebook.imagepipeline.p956a.p960d.C13934a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p964d.C13971h;
import com.facebook.imagepipeline.p965e.C13999f;
import com.facebook.imagepipeline.p967g.C14030c;
import com.facebook.imagepipeline.p968h.C14038a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p970j.C14047h;
import com.facebook.p914c.p915a.C13619c;

public class AnimatedFactoryV2Impl implements C13915a {
    public static int sAnimationCachingStrategy = 1;
    private C13925b mAnimatedDrawableBackendProvider;
    private C14038a mAnimatedDrawableFactory;
    private C13934a mAnimatedDrawableUtil;
    private C13918d mAnimatedImageFactory;
    private final C13971h<C13619c, C14042c> mBackingCache;
    private final C13999f mExecutorSupplier;
    private final C13946f mPlatformBitmapFactory;

    private C13918d buildAnimatedImageFactory() {
        return new C13919e(new C13925b() {
            /* renamed from: a */
            public final C13905a mo26050a(C13913g gVar, Rect rect) {
                return new C13924a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), gVar, rect);
            }
        }, this.mPlatformBitmapFactory);
    }

    private C13925b getAnimatedDrawableBackendProvider() {
        if (this.mAnimatedDrawableBackendProvider == null) {
            this.mAnimatedDrawableBackendProvider = new C13925b() {
                /* renamed from: a */
                public final C13905a mo26050a(C13913g gVar, Rect rect) {
                    return new C13924a(AnimatedFactoryV2Impl.this.getAnimatedDrawableUtil(), gVar, rect);
                }
            };
        }
        return this.mAnimatedDrawableBackendProvider;
    }

    public C13934a getAnimatedDrawableUtil() {
        if (this.mAnimatedDrawableUtil == null) {
            this.mAnimatedDrawableUtil = new C13934a();
        }
        return this.mAnimatedDrawableUtil;
    }

    public C13918d getAnimatedImageFactory() {
        if (this.mAnimatedImageFactory == null) {
            this.mAnimatedImageFactory = buildAnimatedImageFactory();
        }
        return this.mAnimatedImageFactory;
    }

    private C13893a createDrawableFactory() {
        C138893 r7 = new C13691k<Integer>() {
            /* renamed from: b */
            public final /* synthetic */ Object mo23157b() {
                return Integer.valueOf(AnimatedFactoryV2Impl.sAnimationCachingStrategy);
            }
        };
        C13893a aVar = new C13893a(getAnimatedDrawableBackendProvider(), C13670i.m27623a(), new C13664c(this.mExecutorSupplier.mo26176c()), RealtimeSinceBootClock.get(), this.mPlatformBitmapFactory, this.mBackingCache, r7, new C13691k<Integer>() {
            /* renamed from: b */
            public final /* synthetic */ Object mo23157b() {
                return Integer.valueOf(3);
            }
        });
        return aVar;
    }

    public static void setAnimationCachingStrategy(int i) {
        sAnimationCachingStrategy = i;
    }

    public C14030c getGifDecoder(final Config config) {
        return new C14030c() {
            /* renamed from: a */
            public final C14042c mo26049a(C14044e eVar, int i, C14047h hVar, C13950b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().mo26090a(eVar, bVar, config);
            }
        };
    }

    public C14030c getWebPDecoder(final Config config) {
        return new C14030c() {
            /* renamed from: a */
            public final C14042c mo26049a(C14044e eVar, int i, C14047h hVar, C13950b bVar) {
                return AnimatedFactoryV2Impl.this.getAnimatedImageFactory().mo26091b(eVar, bVar, config);
            }
        };
    }

    public C14038a getAnimatedDrawableFactory(Context context) {
        if (this.mAnimatedDrawableFactory == null) {
            this.mAnimatedDrawableFactory = createDrawableFactory();
        }
        return this.mAnimatedDrawableFactory;
    }

    public AnimatedFactoryV2Impl(C13946f fVar, C13999f fVar2, C13971h<C13619c, C14042c> hVar) {
        this.mPlatformBitmapFactory = fVar;
        this.mExecutorSupplier = fVar2;
        this.mBackingCache = hVar;
    }
}
