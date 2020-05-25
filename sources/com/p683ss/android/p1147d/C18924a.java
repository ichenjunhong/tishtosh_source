package com.p683ss.android.p1147d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.uikit.p699c.C11088a;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.download.p1160a.C19087e;
import com.p683ss.android.download.p1160a.C19090g;
import com.p683ss.android.download.p1160a.C19090g.C19091a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.d.a */
public final class C18924a {

    /* renamed from: a */
    protected C19087e<String, Bitmap> f52135a;

    /* renamed from: b */
    protected C19091a<String, C18946h, Void, ImageView, Bitmap> f52136b;

    /* renamed from: c */
    protected C19090g<String, C18946h, Void, ImageView, Bitmap> f52137c;

    /* renamed from: d */
    public volatile boolean f52138d;

    /* renamed from: e */
    boolean f52139e;

    /* renamed from: f */
    boolean f52140f;

    /* renamed from: g */
    public Drawable f52141g;

    /* renamed from: h */
    private final int f52142h;

    /* renamed from: i */
    private Drawable f52143i;

    /* renamed from: j */
    private final int f52144j;

    /* renamed from: k */
    private final C18919f f52145k;

    /* renamed from: l */
    private final boolean f52146l;

    /* renamed from: m */
    private final C18933b f52147m;

    /* renamed from: n */
    private final C18926a f52148n;

    /* renamed from: com.ss.android.d.a$a */
    public interface C18926a {
        /* renamed from: a */
        Bitmap mo38788a(Bitmap bitmap);
    }

    /* renamed from: com.ss.android.d.a$b */
    public static class C18927b implements C18926a {

        /* renamed from: a */
        private final int f52150a;

        /* renamed from: b */
        private final boolean f52151b;

        /* renamed from: a */
        public final Bitmap mo38788a(Bitmap bitmap) {
            if (this.f52150a <= 0) {
                return bitmap;
            }
            if (this.f52151b) {
                int i = this.f52150a;
                int i2 = i * 2;
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-1);
                float f = (float) i;
                canvas.drawCircle(f, f, f, paint);
                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                Rect rect2 = new Rect(0, 0, i2, i2);
                paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
                canvas.drawBitmap(bitmap, rect, rect2, paint);
                return createBitmap;
            }
            int i3 = this.f52150a;
            if (bitmap == null) {
                return null;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Paint paint2 = new Paint();
            Rect rect3 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(rect3);
            float f2 = (float) i3;
            paint2.setAntiAlias(true);
            canvas2.drawARGB(0, 0, 0, 0);
            paint2.setColor(-12434878);
            canvas2.drawRoundRect(rectF, f2, f2, paint2);
            paint2.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
            canvas2.drawBitmap(bitmap, rect3, rect3, paint2);
            return createBitmap2;
        }

        public C18927b(int i, boolean z) {
            this.f52150a = i;
            this.f52151b = z;
        }
    }

    /* renamed from: a */
    public final void mo38781a() {
        this.f52139e = true;
        this.f52140f = true;
        this.f52137c.mo39009d();
    }

    /* renamed from: b */
    public final void mo38784b() {
        this.f52140f = false;
        this.f52137c.mo39008c();
        this.f52135a.mo39016a(8);
    }

    /* renamed from: c */
    public final void mo38785c() {
        this.f52139e = false;
        this.f52137c.mo39007b();
        if (this.f52145k != null) {
            this.f52145k.mo38773a();
        }
    }

    /* renamed from: a */
    private void m46067a(ImageView imageView) {
        if (this.f52142h > 0) {
            if (this.f52146l) {
                imageView.setBackgroundResource(this.f52142h);
            } else {
                imageView.setImageResource(this.f52142h);
            }
        } else if (this.f52141g == null) {
            if (this.f52143i != null) {
                imageView.setBackgroundDrawable(this.f52143i);
            }
        } else if (this.f52146l) {
            C11088a.m22438a(imageView, this.f52141g);
        } else {
            imageView.setImageDrawable(this.f52141g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bitmap mo38780a(String str, C18946h hVar) {
        try {
            String c = this.f52147m.mo38805c(str);
            String e = this.f52147m.mo38808e(str);
            File file = new File(c);
            File file2 = new File(e);
            boolean z = false;
            if (file.isFile() || file2.isFile()) {
                z = true;
            }
            if (!z && this.f52138d) {
                String a = this.f52147m.mo38800a(str);
                String b = C18933b.m46092b(str);
                z = C18943e.m46110a(this.f52147m.f52175l, 512000, hVar.mUri, hVar.mUrlList, a, this.f52147m.mo38807d(str), b, null, this.f52145k);
            }
            if (!z) {
                return null;
            }
            if (!new File(c).isFile()) {
                c = e;
            }
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(c, this.f52144j, this.f52144j);
            if (bitmapFromSD != null) {
                if (this.f52148n != null) {
                    return this.f52148n.mo38788a(bitmapFromSD);
                }
                return bitmapFromSD;
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo38782a(ImageView imageView, String str) {
        C18946h hVar = new C18946h(str, null);
        if (imageView != null) {
            String str2 = hVar.mKey;
            this.f52143i = imageView.getBackground();
            imageView.setTag(str2);
            if (str2 == null) {
                m46067a(imageView);
                return;
            }
            Bitmap bitmap = (Bitmap) this.f52135a.mo39014a(str2);
            if (bitmap != null) {
                if (this.f52146l) {
                    C11088a.m22438a(imageView, new BitmapDrawable(imageView.getResources(), bitmap));
                } else {
                    imageView.setImageBitmap(bitmap);
                    imageView.setBackgroundDrawable(null);
                }
                new ArrayList().add(imageView);
                imageView.setTag(null);
                return;
            }
            m46067a(imageView);
            this.f52137c.mo39005a(str2, hVar, null, imageView);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38783a(String str, C18946h hVar, Collection<ImageView> collection, Bitmap bitmap) {
        if (this.f52139e && str != null && collection != null && bitmap != null) {
            if (bitmap != null) {
                this.f52135a.mo39015a(str, bitmap);
            }
            for (ImageView imageView : collection) {
                if (str.equals(imageView.getTag())) {
                    if (this.f52146l) {
                        imageView.setBackgroundDrawable(new BitmapDrawable(imageView.getResources(), bitmap));
                    } else {
                        imageView.setImageBitmap(bitmap);
                        if (bitmap != null) {
                            imageView.setBackgroundDrawable(null);
                        }
                    }
                    imageView.setTag(null);
                }
            }
        }
    }

    public C18924a(int i, C18919f fVar, C18933b bVar, int i2, boolean z, int i3) {
        this(R.drawable.cqr, fVar, bVar, i2, false, i3, false);
    }

    private C18924a(int i, C18919f fVar, C18933b bVar, int i2, boolean z, C18926a aVar) {
        this(i, fVar, bVar, i2, z, aVar, 16, 2);
    }

    public C18924a(int i, C18919f fVar, C18933b bVar, int i2, boolean z, int i3, boolean z2) {
        this(i, fVar, bVar, i2, z, (C18926a) new C18927b(i3, z2));
    }

    private C18924a(int i, C18919f fVar, C18933b bVar, int i2, boolean z, C18926a aVar, int i3, int i4) {
        this.f52142h = i;
        this.f52144j = i2;
        this.f52145k = fVar;
        this.f52147m = bVar;
        this.f52146l = z;
        this.f52148n = aVar;
        this.f52135a = new C19087e<>(32);
        this.f52136b = new C19091a<String, C18946h, Void, ImageView, Bitmap>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38786a(Object obj, Object obj2, Object obj3) {
                Void voidR = (Void) obj3;
                return C18924a.this.mo38780a((String) obj, (C18946h) obj2);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38787a(Object obj, Object obj2, Object obj3, Collection collection, Object obj4) {
                Void voidR = (Void) obj3;
                C18924a.this.mo38783a((String) obj, (C18946h) obj2, collection, (Bitmap) obj4);
            }
        };
        this.f52137c = new C19090g<>(16, 2, this.f52136b);
        this.f52138d = true;
        this.f52139e = true;
        this.f52140f = true;
    }
}
