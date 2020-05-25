package com.p683ss.android.p1147d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.common.util.C18915b;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.download.p1160a.C19086d;
import com.p683ss.android.download.p1160a.C19087e;
import com.p683ss.android.download.p1160a.C19090g;
import com.p683ss.android.download.p1160a.C19090g.C19091a;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.d.i */
public final class C18947i implements C9382a {

    /* renamed from: a */
    static final Bitmap f52189a = Bitmap.createBitmap(1, 1, Config.RGB_565);

    /* renamed from: b */
    final Object f52190b;

    /* renamed from: c */
    final LinkedList<C18952b> f52191c;

    /* renamed from: d */
    public final WeakHashMap<ImageView, Object> f52192d;

    /* renamed from: e */
    public C19086d<String, Bitmap> f52193e;

    /* renamed from: f */
    public C19087e<String, Bitmap> f52194f;

    /* renamed from: g */
    C19091a<String, C18946h, Boolean, ImageView, C18951a> f52195g;

    /* renamed from: h */
    public C19090g<String, C18946h, Boolean, ImageView, C18951a> f52196h;

    /* renamed from: i */
    final boolean f52197i;

    /* renamed from: j */
    protected final int f52198j;

    /* renamed from: k */
    final int f52199k;

    /* renamed from: l */
    final int f52200l;

    /* renamed from: m */
    final C18915b<String> f52201m;

    /* renamed from: n */
    final C9381g f52202n;

    /* renamed from: o */
    final Context f52203o;

    /* renamed from: p */
    public final C18919f f52204p;

    /* renamed from: q */
    final C18933b f52205q;

    /* renamed from: r */
    final Resources f52206r;

    /* renamed from: s */
    C18960m f52207s;

    /* renamed from: t */
    public boolean f52208t;

    /* renamed from: u */
    public boolean f52209u;

    /* renamed from: v */
    public boolean f52210v;

    /* renamed from: com.ss.android.d.i$a */
    static class C18951a {

        /* renamed from: a */
        public final boolean f52225a = true;

        /* renamed from: b */
        public final Bitmap f52226b;

        public C18951a(Bitmap bitmap) {
            this.f52226b = bitmap;
        }
    }

    /* renamed from: com.ss.android.d.i$b */
    static class C18952b extends Drawable {

        /* renamed from: a */
        final Drawable f52227a;

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final int getIntrinsicHeight() {
            if (this.f52227a != null) {
                return this.f52227a.getIntrinsicHeight();
            }
            return 0;
        }

        public final int getIntrinsicWidth() {
            if (this.f52227a != null) {
                return this.f52227a.getIntrinsicWidth();
            }
            return 0;
        }

        public C18952b(Drawable drawable) {
            this.f52227a = drawable;
        }

        /* access modifiers changed from: protected */
        public final boolean onLevelChange(int i) {
            if (this.f52227a == null) {
                return false;
            }
            this.f52227a.setLevel(i);
            invalidateSelf();
            return true;
        }

        public final void draw(Canvas canvas) {
            if (this.f52227a != null && this.f52227a.getLevel() > 0) {
                this.f52227a.draw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        public final void onBoundsChange(Rect rect) {
            if (this.f52227a != null) {
                int intrinsicWidth = this.f52227a.getIntrinsicWidth();
                int intrinsicHeight = this.f52227a.getIntrinsicHeight();
                int width = rect.width();
                int height = rect.height();
                if (width > 0 && height > 0 && intrinsicWidth > 0 && intrinsicHeight > 0) {
                    int i = rect.left + ((width - intrinsicWidth) / 2);
                    int i2 = rect.top + ((height - intrinsicHeight) / 2);
                    this.f52227a.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38817a(ImageView imageView) {
        if (imageView != null) {
            this.f52192d.remove(imageView);
            if (this.f52200l > 0) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof C18952b) {
                    this.f52191c.add((C18952b) drawable);
                    imageView.setImageDrawable(null);
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        if (this.f52208t && message.what == 100) {
            String str = null;
            if (message.obj instanceof String) {
                str = (String) message.obj;
            }
            if (!C9431p.m18664a(str)) {
                int i = message.arg1;
                if (i < 0) {
                    i = 0;
                }
                if (i > 99) {
                    i = 99;
                }
                int i2 = i * 100;
                for (ImageView imageView : this.f52192d.keySet()) {
                    if (imageView != null && str.equals(imageView.getTag())) {
                        Drawable drawable = imageView.getDrawable();
                        if (drawable instanceof C18952b) {
                            drawable.setLevel(i2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38818a(ImageView imageView, C18946h hVar, boolean z) {
        Object obj;
        if (this.f52208t && imageView != null) {
            mo38817a(imageView);
            C18952b bVar = null;
            if (hVar != null) {
                obj = hVar.mKey;
            } else {
                obj = null;
            }
            imageView.setTag(obj);
            Drawable background = imageView.getBackground();
            if (obj == null) {
                if (background != null) {
                    background.setLevel(1);
                }
                return;
            }
            Bitmap bitmap = (Bitmap) this.f52194f.mo39014a(obj);
            if (bitmap == null && this.f52193e != null) {
                bitmap = (Bitmap) this.f52193e.mo39014a(obj);
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                if (background != null) {
                    background.setLevel(2);
                }
                return;
            }
            if (background != null) {
                background.setLevel(0);
            }
            if (this.f52200l > 0) {
                if (!this.f52191c.isEmpty()) {
                    bVar = (C18952b) this.f52191c.removeLast();
                }
                if (bVar == null) {
                    bVar = new C18952b(this.f52206r.getDrawable(this.f52200l));
                }
                imageView.setImageDrawable(bVar);
                bVar.setLevel(0);
            }
            this.f52192d.put(imageView, this.f52190b);
            this.f52196h.mo39005a(obj, hVar, Boolean.valueOf(false), imageView);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011b A[Catch:{ Throwable -> 0x0188 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011c A[Catch:{ Throwable -> 0x0188 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.p1147d.C18947i.C18951a mo38816a(java.lang.String r28, com.p683ss.android.p1147d.C18946h r29, boolean r30) {
        /*
            r27 = this;
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = 0
            com.ss.android.d.b r0 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r0 = r0.mo38805c(r14)     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.b r1 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r1 = r1.mo38808e(r14)     // Catch:{ Throwable -> 0x0188 }
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0188 }
            r12.<init>(r0)     // Catch:{ Throwable -> 0x0188 }
            java.lang.StringBuffer r11 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0188 }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x0188 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x0188 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0188 }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0188 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0188 }
            boolean r1 = r2.isFile()     // Catch:{ Throwable -> 0x0188 }
            r10 = 1
            r9 = 0
            if (r1 != 0) goto L_0x0039
            boolean r0 = r0.isFile()     // Catch:{ Throwable -> 0x0188 }
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            android.content.Context r1 = r13.f52203o     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.common.util.NetworkUtils$h r1 = com.p683ss.android.common.util.NetworkUtils.getNetworkType(r1)     // Catch:{ Throwable -> 0x0188 }
            if (r0 != 0) goto L_0x0054
            if (r30 != 0) goto L_0x004e
            com.ss.android.common.util.NetworkUtils$h r2 = com.p683ss.android.common.util.NetworkUtils.C18911h.WIFI     // Catch:{ Throwable -> 0x0188 }
            if (r1 == r2) goto L_0x004e
            com.ss.android.d.m r2 = r13.f52207s     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.m r3 = com.p683ss.android.p1147d.C18960m.ALWAYS     // Catch:{ Throwable -> 0x0188 }
            if (r2 != r3) goto L_0x0054
        L_0x004e:
            com.ss.android.common.util.NetworkUtils$h r2 = com.p683ss.android.common.util.NetworkUtils.C18911h.NONE     // Catch:{ Throwable -> 0x0188 }
            if (r1 == r2) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r0 != 0) goto L_0x010c
            if (r1 == 0) goto L_0x010c
            com.ss.android.d.b r0 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r4 = r0.mo38800a(r14)     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.b r0 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r5 = r0.mo38807d(r14)     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r6 = com.p683ss.android.p1147d.C18933b.m46092b(r28)     // Catch:{ Throwable -> 0x0188 }
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0188 }
            r8.<init>(r4)     // Catch:{ Throwable -> 0x0188 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0188 }
            r7.<init>(r5)     // Catch:{ Throwable -> 0x0188 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0188 }
            r3.<init>(r6)     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r2 = r29.getExtraKey()     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.b r0 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r17 = r0.mo38805c(r2)     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.b r0 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r18 = r0.mo38808e(r2)     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.b r0 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r19 = r0.mo38800a(r2)     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.b r0 = r13.f52205q     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r20 = r0.mo38807d(r2)     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r21 = com.p683ss.android.p1147d.C18933b.m46092b(r2)     // Catch:{ Throwable -> 0x0188 }
            boolean r0 = r13.f52210v     // Catch:{ Throwable -> 0x0188 }
            if (r0 == 0) goto L_0x00a1
            com.ss.android.common.util.b<java.lang.String> r0 = r13.f52201m     // Catch:{ Throwable -> 0x0188 }
            r22 = r0
            goto L_0x00a3
        L_0x00a1:
            r22 = r16
        L_0x00a3:
            boolean r0 = r15.mIsVideo     // Catch:{ Throwable -> 0x0188 }
            if (r0 == 0) goto L_0x00f4
            android.content.Context r6 = r13.f52203o     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r5 = r15.mUri     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r4 = r15.mUrlList     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.common.util.f r1 = r13.f52204p     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.i$3 r23 = new com.ss.android.d.i$3     // Catch:{ Throwable -> 0x0188 }
            r0 = r23
            r24 = r1
            r1 = r27
            r25 = r3
            r3 = r8
            r14 = r4
            r4 = r19
            r15 = r5
            r5 = r7
            r19 = r6
            r6 = r20
            r20 = r7
            r7 = r25
            r26 = r8
            r8 = r21
            r9 = r12
            r10 = r17
            r17 = r11
            r21 = r12
            r12 = r18
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Throwable -> 0x0188 }
            java.util.List r3 = com.p683ss.android.p1147d.C18946h.extractImageUrlList(r15, r14)     // Catch:{ Throwable -> 0x0188 }
            r1 = -1
            r0 = r19
            r2 = r15
            r4 = r26
            r5 = r20
            r6 = r25
            r7 = r22
            r8 = r28
            r9 = r24
            r10 = r23
            boolean r0 = com.p683ss.android.p1147d.C18943e.m46113a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x0188 }
            r10 = r29
            goto L_0x0111
        L_0x00f4:
            r17 = r11
            r21 = r12
            android.content.Context r0 = r13.f52203o     // Catch:{ Throwable -> 0x0188 }
            r1 = -1
            r10 = r29
            java.lang.String r2 = r10.mUri     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r3 = r10.mUrlList     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.common.util.f r9 = r13.f52204p     // Catch:{ Throwable -> 0x0188 }
            r7 = r22
            r8 = r28
            boolean r0 = com.p683ss.android.p1147d.C18943e.m46111a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0188 }
            goto L_0x0111
        L_0x010c:
            r17 = r11
            r21 = r12
            r10 = r15
        L_0x0111:
            java.lang.String r1 = r21.toString()     // Catch:{ Throwable -> 0x0188 }
            java.lang.String r2 = r17.toString()     // Catch:{ Throwable -> 0x0188 }
            if (r0 != 0) goto L_0x011c
            return r16
        L_0x011c:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0188 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0188 }
            boolean r3 = r0.isFile()     // Catch:{ Throwable -> 0x0188 }
            if (r3 != 0) goto L_0x012d
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0188 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0188 }
            r1 = r2
        L_0x012d:
            boolean r0 = r0.isFile()     // Catch:{ Throwable -> 0x0188 }
            if (r0 != 0) goto L_0x0134
            return r16
        L_0x0134:
            int r0 = r13.f52198j     // Catch:{ Throwable -> 0x0188 }
            int r2 = r13.f52199k     // Catch:{ Throwable -> 0x0188 }
            if (r10 == 0) goto L_0x0144
            boolean r3 = r29.isFixedDisplaySize()     // Catch:{ Throwable -> 0x0188 }
            if (r3 == 0) goto L_0x0144
            int r0 = r10.mWidth     // Catch:{ Throwable -> 0x0188 }
            int r2 = r10.mHeight     // Catch:{ Throwable -> 0x0188 }
        L_0x0144:
            boolean r3 = r13.f52197i     // Catch:{ Throwable -> 0x0188 }
            boolean r4 = r10.mNeedAlpha     // Catch:{ Throwable -> 0x0188 }
            android.graphics.Bitmap r0 = m46121a(r3, r0, r2, r1, r4)     // Catch:{ Throwable -> 0x0188 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0188 }
            r1.<init>()     // Catch:{ Throwable -> 0x0188 }
            boolean r2 = r10.mNeedAlpha     // Catch:{ Throwable -> 0x0188 }
            if (r2 == 0) goto L_0x0158
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Throwable -> 0x0188 }
            goto L_0x015a
        L_0x0158:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Throwable -> 0x0188 }
        L_0x015a:
            r3 = 80
            r0.compress(r2, r3, r1)     // Catch:{ Throwable -> 0x0188 }
            r0.recycle()     // Catch:{ Throwable -> 0x0188 }
            byte[] r0 = r1.toByteArray()     // Catch:{ Throwable -> 0x0188 }
            r1.close()     // Catch:{ Throwable -> 0x0188 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Throwable -> 0x0188 }
            r1.<init>()     // Catch:{ Throwable -> 0x0188 }
            r2 = 1
            r1.inPurgeable = r2     // Catch:{ Throwable -> 0x0188 }
            boolean r2 = r10.mNeedAlpha     // Catch:{ Throwable -> 0x0188 }
            if (r2 == 0) goto L_0x0178
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Throwable -> 0x0188 }
            goto L_0x017a
        L_0x0178:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Throwable -> 0x0188 }
        L_0x017a:
            r1.inPreferredConfig = r2     // Catch:{ Throwable -> 0x0188 }
            int r2 = r0.length     // Catch:{ Throwable -> 0x0188 }
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r2, r1)     // Catch:{ Throwable -> 0x0188 }
            com.ss.android.d.i$a r1 = new com.ss.android.d.i$a     // Catch:{ Throwable -> 0x0188 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0188 }
            return r1
        L_0x0188:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1147d.C18947i.mo38816a(java.lang.String, com.ss.android.d.h, boolean):com.ss.android.d.i$a");
    }

    /* renamed from: a */
    private static Bitmap m46121a(boolean z, int i, int i2, String str, boolean z2) {
        Bitmap bitmap;
        Config config;
        Bitmap createBitmap;
        if (!z) {
            if (z2) {
                config = Config.ARGB_8888;
            } else {
                config = null;
            }
            bitmap = BitmapUtils.getBitmapFromSD(str, 1000, i2, config);
            if (i <= 0 || bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = (float) i2;
            float f2 = (float) height;
            if (((int) (((f * 1.0f) * ((float) width)) / f2)) > i) {
                int i3 = (int) (((f2 * 1.0f) * ((float) i)) / f);
                createBitmap = Bitmap.createBitmap(bitmap, (width - i3) / 2, 0, i3, height);
            }
            return bitmap;
        } else if (i2 <= 0) {
            try {
                return BitmapUtils.loadBitmap(i, str, z2);
            } catch (Exception unused) {
                bitmap = null;
            }
        } else {
            bitmap = BitmapUtils.getBitmapFromSD(str, i, z2);
            if (bitmap == null) {
                return null;
            }
            try {
                int width2 = bitmap.getWidth();
                float f3 = (float) i;
                float f4 = (float) width2;
                if (((int) (((f3 * 1.0f) * ((float) bitmap.getHeight())) / f4)) > i2) {
                    createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, (int) (((f4 * 1.0f) * ((float) i2)) / f3));
                }
            } catch (Exception unused2) {
            }
            return bitmap;
        }
        bitmap = createBitmap;
        return bitmap;
    }

    public C18947i(Context context, C18919f fVar, int i, int i2, int i3, C18933b bVar, int i4, int i5, int i6) {
        this(context, fVar, 4, 4, 4, bVar, i4, i5, R.drawable.cpc, true);
    }

    private C18947i(Context context, C18919f fVar, int i, int i2, int i3, C18933b bVar, int i4, int i5, int i6, boolean z) {
        this.f52190b = new Object();
        this.f52191c = new LinkedList<>();
        this.f52192d = new WeakHashMap<>();
        this.f52193e = null;
        this.f52202n = new C9381g(Looper.getMainLooper(), this);
        this.f52203o = context.getApplicationContext();
        this.f52206r = this.f52203o.getResources();
        this.f52198j = i4;
        this.f52199k = i5;
        this.f52204p = fVar;
        this.f52205q = bVar;
        this.f52207s = C18960m.ALWAYS;
        this.f52200l = i6;
        this.f52197i = true;
        if (this.f52198j > 0) {
            this.f52201m = new C18915b<String>() {
                /* renamed from: a */
                public final /* synthetic */ void mo38772a(int i, Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        Message obtainMessage = C18947i.this.f52202n.obtainMessage(100);
                        obtainMessage.arg1 = i;
                        obtainMessage.obj = str;
                        C18947i.this.f52202n.sendMessage(obtainMessage);
                    }
                }
            };
            this.f52194f = new C19087e<>(i);
            this.f52195g = new C19091a<String, C18946h, Boolean, ImageView, C18951a>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo38786a(Object obj, Object obj2, Object obj3) {
                    return C18947i.this.mo38816a((String) obj, (C18946h) obj2, ((Boolean) obj3).booleanValue());
                }

                /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<android.widget.ImageView>, for r8v0, types: [java.util.Collection<android.widget.ImageView>, java.util.Collection] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void mo38787a(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.util.Collection<android.widget.ImageView> r8, java.lang.Object r9) {
                    /*
                        r4 = this;
                        java.lang.String r5 = (java.lang.String) r5
                        com.ss.android.d.h r6 = (com.p683ss.android.p1147d.C18946h) r6
                        java.lang.Boolean r7 = (java.lang.Boolean) r7
                        com.ss.android.d.i$a r9 = (com.p683ss.android.p1147d.C18947i.C18951a) r9
                        com.ss.android.d.i r6 = com.p683ss.android.p1147d.C18947i.this
                        boolean r7 = r6.f52208t
                        if (r7 == 0) goto L_0x0071
                        if (r5 == 0) goto L_0x0070
                        if (r8 != 0) goto L_0x0013
                        goto L_0x0070
                    L_0x0013:
                        r7 = 0
                        if (r9 == 0) goto L_0x0019
                        android.graphics.Bitmap r9 = r9.f52226b
                        goto L_0x001a
                    L_0x0019:
                        r9 = r7
                    L_0x001a:
                        r0 = 0
                        java.util.Iterator r8 = r8.iterator()
                    L_0x001f:
                        boolean r1 = r8.hasNext()
                        if (r1 == 0) goto L_0x005d
                        java.lang.Object r1 = r8.next()
                        android.widget.ImageView r1 = (android.widget.ImageView) r1
                        java.lang.Object r2 = r1.getTag()
                        boolean r2 = r5.equals(r2)
                        r3 = 1
                        if (r2 == 0) goto L_0x001f
                        android.graphics.drawable.Drawable r0 = r1.getBackground()
                        r6.mo38817a(r1)
                        if (r9 == 0) goto L_0x0049
                        r1.setImageBitmap(r9)
                        if (r0 == 0) goto L_0x0051
                        r2 = 2
                        r0.setLevel(r2)
                        goto L_0x0051
                    L_0x0049:
                        r1.setImageDrawable(r7)
                        if (r0 == 0) goto L_0x0051
                        r0.setLevel(r3)
                    L_0x0051:
                        if (r9 == 0) goto L_0x0056
                        r1.setImageBitmap(r9)
                    L_0x0056:
                        java.util.WeakHashMap<android.widget.ImageView, java.lang.Object> r0 = r6.f52192d
                        r0.remove(r1)
                        r0 = 1
                        goto L_0x001f
                    L_0x005d:
                        if (r0 == 0) goto L_0x0071
                        if (r9 == 0) goto L_0x0071
                        com.ss.android.download.a.e<java.lang.String, android.graphics.Bitmap> r7 = r6.f52194f
                        r7.mo39015a(r5, r9)
                        com.ss.android.download.a.d<java.lang.String, android.graphics.Bitmap> r7 = r6.f52193e
                        if (r7 == 0) goto L_0x0071
                        com.ss.android.download.a.d<java.lang.String, android.graphics.Bitmap> r6 = r6.f52193e
                        r6.mo39015a(r5, r9)
                        goto L_0x0071
                    L_0x0070:
                        return
                    L_0x0071:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1147d.C18947i.C189492.mo38787a(java.lang.Object, java.lang.Object, java.lang.Object, java.util.Collection, java.lang.Object):void");
                }
            };
            this.f52196h = new C19090g<>(i2, i3, this.f52195g);
            this.f52208t = true;
            this.f52209u = true;
            return;
        }
        throw new IllegalArgumentException("fitWidth but maxWidth is not positive");
    }
}
