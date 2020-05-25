package com.p683ss.android.ugc.aweme.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14041b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13745c;
import com.facebook.p987k.p988a.C14460b;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45636a;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45637b;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45639c;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.p2267a.C45641e;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.utils.C47954t;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.p2504a.C50181a.C50185b;
import com.p683ss.android.vesdk.C50720o.C50749j;
import com.ss.android.ugc.trill.R;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.watermark.m */
public final class C48251m {

    /* renamed from: a */
    public static final String f121432a;

    /* renamed from: j */
    private static final String f121433j;

    /* renamed from: b */
    public Context f121434b = C39618d.f101160a.getApplicationContext();

    /* renamed from: c */
    public String f121435c;

    /* renamed from: d */
    public C48250l f121436d;

    /* renamed from: e */
    C45641e f121437e;

    /* renamed from: f */
    private long f121438f = -1;

    /* renamed from: g */
    private String f121439g;

    /* renamed from: h */
    private String f121440h;

    /* renamed from: i */
    private JSONObject f121441i;

    /* renamed from: k */
    private boolean f121442k;

    /* renamed from: l */
    private boolean f121443l;

    /* renamed from: m */
    private String f121444m;

    /* renamed from: n */
    private long f121445n;

    /* renamed from: o */
    private C45636a f121446o;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo95752b() {
        this.f121435c = null;
        this.f121444m = null;
        if (this.f121446o != null) {
            this.f121446o.mo92021b();
        }
    }

    protected C48251m() {
        C48016e.m103935a(f121432a, false);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C43307ea.f109491d);
        sb.append("share/");
        f121433j = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f121433j);
        sb2.append("pic/");
        f121432a = sb2.toString();
    }

    /* renamed from: c */
    private void m104521c() {
        if (this.f121435c == null || !C47723bk.m103311a(this.f121435c)) {
            final String g = this.f121436d.f121417c.mo46163g();
            try {
                C50181a.m108297a(this.f121436d.f121417c.mo46162f(), (C50185b) new C50185b() {
                    /* renamed from: a */
                    public final void mo86745a(Exception exc) {
                    }

                    /* renamed from: a */
                    public final void mo86744a(C13745c<C13715a<C14042c>> cVar) {
                        String str;
                        C48234c cVar2;
                        int i;
                        float f;
                        Bitmap bitmap;
                        float width;
                        int i2;
                        float f2;
                        int i3;
                        int i4;
                        if (cVar.mo25672b()) {
                            C13715a aVar = (C13715a) cVar.mo25674d();
                            if (aVar != null && (aVar.mo25630a() instanceof C14041b)) {
                                Bitmap d = ((C14041b) aVar.mo25630a()).mo26257d();
                                if (d != null) {
                                    if (TextUtils.isEmpty(C48251m.this.f121436d.f121417c.mo46157a())) {
                                        str = C48251m.this.f121436d.f121417c.mo46158b();
                                    } else {
                                        str = C48251m.this.f121436d.f121417c.mo46157a();
                                    }
                                    StringBuilder sb = new StringBuilder("@");
                                    sb.append(str);
                                    String sb2 = sb.toString();
                                    C48251m mVar = C48251m.this;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(C48251m.f121432a);
                                    sb3.append(File.separator);
                                    sb3.append("end.png");
                                    mVar.f121435c = sb3.toString();
                                    int width2 = C48251m.this.f121436d.f121418d.getWidth();
                                    int height = C48251m.this.f121436d.f121418d.getHeight();
                                    int[] iArr = new int[10];
                                    if (C46813b.m101656a(C48251m.this.f121436d.f121415a, iArr) == 0) {
                                        width2 = iArr[0];
                                        height = iArr[1];
                                    }
                                    C48234c cVar3 = new C48234c();
                                    Context context = C48251m.this.f121434b;
                                    String str2 = g;
                                    boolean z = C48251m.this.f121436d.f121422h;
                                    if (width2 <= 0 || height <= 0) {
                                        cVar2 = null;
                                    } else {
                                        float f3 = (float) width2;
                                        float f4 = (float) height;
                                        float f5 = (f3 * 1.0f) / f4;
                                        if (!z || height <= width2) {
                                            i = 0;
                                        } else {
                                            i = (height - width2) / 2;
                                        }
                                        cVar3.f121380a = Bitmap.createBitmap(width2, height, Config.ARGB_8888);
                                        float f6 = f3 / 375.0f;
                                        int compare = Float.compare(f5, 1.0f);
                                        Canvas canvas = new Canvas(cVar3.f121380a);
                                        canvas.drawColor(-16777216);
                                        if (compare < 0) {
                                            if (z) {
                                                f = ((float) i) + (0.24f * f3);
                                            } else {
                                                f = f4 * 0.32f;
                                            }
                                        } else if (compare == 0) {
                                            f = f4 * 0.24f;
                                        } else {
                                            f = f4 * 0.18f;
                                        }
                                        float f7 = 56.0f * f6;
                                        if (z && f5 > 1.0f) {
                                            f7 = 112.0f;
                                        }
                                        C48234c cVar4 = cVar3;
                                        int i5 = i;
                                        float f8 = f + f7;
                                        RectF rectF = new RectF((f3 - f7) / 2.0f, f, (f3 + f7) / 2.0f, f8);
                                        Paint paint = new Paint(1);
                                        int i6 = height;
                                        paint.setColor(0);
                                        paint.setAntiAlias(true);
                                        paint.setFilterBitmap(true);
                                        paint.setDither(true);
                                        paint.setColor(-1);
                                        float f9 = f7 / 2.0f;
                                        canvas.drawCircle((float) (width2 / 2), f + f9, f9 + 3.0f, paint);
                                        if (d.getWidth() > d.getHeight()) {
                                            bitmap = Bitmap.createBitmap(d.getHeight(), d.getHeight(), Config.ARGB_8888);
                                        } else {
                                            bitmap = Bitmap.createBitmap(d.getWidth(), d.getWidth(), Config.ARGB_8888);
                                        }
                                        Canvas canvas2 = new Canvas(bitmap);
                                        Paint paint2 = new Paint();
                                        String str3 = sb2;
                                        boolean z2 = z;
                                        Rect rect = new Rect(0, 0, d.getWidth(), d.getHeight());
                                        if (d.getWidth() > d.getHeight()) {
                                            width = (float) (d.getHeight() / 2);
                                        } else {
                                            width = (float) (d.getWidth() / 2);
                                        }
                                        paint2.setAntiAlias(true);
                                        canvas2.drawARGB(0, 0, 0, 0);
                                        paint2.setColor(-12434878);
                                        canvas2.drawCircle(width, width, width, paint2);
                                        paint2.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
                                        canvas2.drawBitmap(d, rect, rect, paint2);
                                        canvas.drawBitmap(bitmap, null, rectF, null);
                                        float f10 = f8 + (20.0f * f6);
                                        TextPaint textPaint = new TextPaint(1);
                                        textPaint.setFakeBoldText(true);
                                        textPaint.setTextSize(18.0f * f6);
                                        textPaint.setColor(context.getResources().getColor(R.color.aso));
                                        float f11 = f3 * 0.77f;
                                        float measureText = textPaint.measureText(str2);
                                        if (measureText > f11) {
                                            int length = ((int) ((measureText - f11) / (measureText / ((float) str2.length())))) + 3;
                                            StringBuilder sb4 = new StringBuilder();
                                            int length2 = str2.length() - length;
                                            i2 = 0;
                                            sb4.append(str2.substring(0, length2));
                                            sb4.append("...");
                                            str2 = sb4.toString();
                                        } else {
                                            i2 = 0;
                                        }
                                        Rect rect2 = new Rect();
                                        textPaint.getTextBounds(str2, i2, str2.length(), rect2);
                                        float width3 = ((float) (width2 - rect2.width())) / 2.0f;
                                        int height2 = rect2.height();
                                        canvas.drawText(str2, width3, f10, textPaint);
                                        float f12 = f10 + ((float) height2);
                                        if (compare < 0) {
                                            if (z2) {
                                                f2 = f12 + 12.0f;
                                            } else {
                                                f2 = f12 + (4.0f * f6);
                                            }
                                        } else if (compare == 0) {
                                            f2 = f12 + (6.0f * f6);
                                        } else {
                                            f2 = f12 + (f6 * 3.0f);
                                        }
                                        TextPaint textPaint2 = new TextPaint(1);
                                        textPaint2.setFakeBoldText(false);
                                        textPaint2.setTextSize(f6 * 13.0f);
                                        textPaint2.setColor(context.getResources().getColor(R.color.a2o));
                                        Rect rect3 = new Rect();
                                        String str4 = str3;
                                        textPaint2.getTextBounds(str4, 0, str3.length(), rect3);
                                        canvas.drawText(str4, ((float) (width2 - rect3.width())) / 2.0f, f2, textPaint2);
                                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.a9d);
                                        int width4 = decodeResource.getWidth();
                                        int height3 = decodeResource.getHeight();
                                        if (compare < 0) {
                                            i4 = (width2 * 94) / 375;
                                            i3 = (i6 * 40) / 667;
                                        } else if (compare == 0) {
                                            i4 = (width2 * 72) / 374;
                                            i3 = (i6 * 16) / 677;
                                        } else {
                                            i4 = (width2 * 75) / 375;
                                            i3 = (i6 * 12) / 667;
                                        }
                                        if (z2) {
                                            i3 += i5;
                                        }
                                        int i7 = (int) (((float) (width2 - i4)) / 2.0f);
                                        int i8 = i6 - (i3 + 16);
                                        canvas.drawBitmap(decodeResource, null, new Rect(i7, i8 - ((int) (((((float) height3) * 1.0f) / ((float) width4)) * ((float) i4))), i4 + i7, i8), null);
                                        C47954t.m103763a(decodeResource);
                                        cVar2 = cVar4;
                                    }
                                    cVar2.mo95726a(C48251m.this.f121435c);
                                }
                            }
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo95749a() {
        if (this.f121436d != null) {
            if (this.f121436d.f121419e) {
                m104522d();
                this.f121446o.mo92020a(true, this.f121436d.f121417c);
                this.f121446o.mo92020a(false, this.f121436d.f121417c);
            }
            if (this.f121436d.f121422h && C39618d.f101169j.mo74141c()) {
                m104521c();
            }
        }
    }

    /* renamed from: d */
    private void m104522d() {
        int i;
        if (!(this.f121436d == null || this.f121436d.f121418d == null || this.f121446o != null)) {
            if (this.f121436d.f121422h) {
                i = 2;
            } else {
                i = -1;
            }
            int width = this.f121436d.f121418d.getWidth();
            int height = this.f121436d.f121418d.getHeight();
            this.f121446o = C48247i.m104500a(i, this.f121436d.f121418d.getPlayAddrH264().getBitRatedRatioUri(), new int[]{width, height});
        }
    }

    /* renamed from: a */
    private C50749j m104520a(int[] iArr) {
        C50749j jVar;
        if (C39618d.f101169j.mo74139a() == 0 && this.f121436d.f121422h) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(this.f121436d.f121415a);
                iArr[0] = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            } catch (Exception unused) {
                iArr[0] = 560;
            }
            jVar = C50749j.VIDEO_OUT_RATIO_1_1;
        } else if (C39618d.f101169j.mo74139a() != 1 || !this.f121436d.f121422h) {
            jVar = C50749j.VIDEO_OUT_RATIO_ORIGINAL;
        } else {
            jVar = C50749j.VIDEO_OUT_RATIO_16_9;
        }
        if (this.f121436d.f121424j) {
            return C50749j.VIDEO_OUT_RATIO_16_9;
        }
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo95748a(boolean z, boolean z2, boolean z3) throws Exception {
        boolean z4;
        this.f121445n = System.currentTimeMillis();
        this.f121438f = System.currentTimeMillis();
        this.f121439g = "download_time";
        this.f121440h = "add_watermark";
        this.f121441i = null;
        Video video = this.f121436d.f121418d;
        int width = video.getWidth();
        int height = video.getHeight();
        if (z || z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        C48249k a = m104519a(z4, z3, new int[]{width, height});
        if (a == null) {
            mo95750a(-1, 0, "create VideoWatermarkParam error");
            return null;
        }
        if (this.f121437e == null) {
            String a2 = C9395d.m18571a(this.f121436d.f121415a);
            StringBuilder sb = new StringBuilder();
            sb.append(C43308eb.f109492e);
            sb.append(a2);
            this.f121437e = new C45637b(sb.toString());
        }
        this.f121437e.mo92025a(a, new C45639c() {
            /* renamed from: a */
            public final void mo92026a() {
                C48251m.this.mo95751a(true, -1, -1, null);
                C48251m mVar = C48251m.this;
                mVar.mo95752b();
                if (mVar.f121436d.f121421g != null) {
                    mVar.f121436d.f121421g.mo95759a(mVar.f121436d.f121416b);
                }
                if (C48255o.m104533a(C39618d.f101160a)) {
                    C23569o.m57776a("aweme_download_synthesis_error_rate", 0, (JSONObject) null);
                    C26890h.m65011a("add_watermark", C23089d.m56640a().mo47829a("enter_from", "download_video").f61491a);
                }
            }

            /* renamed from: a */
            public final void mo92027a(float f) {
                if (C48251m.this.f121436d.f121421g != null) {
                    C48251m.this.f121436d.f121421g.mo95758a((int) (f * 100.0f));
                }
            }

            /* renamed from: a */
            public final void mo92028a(int i, String str, int i2) {
                C48251m.this.mo95750a(i, i2, str);
                C48251m.this.mo95751a(false, i, i2, str);
            }
        });
        return null;
    }

    /* renamed from: a */
    public final void mo95750a(int i, int i2, String str) {
        mo95752b();
        if (this.f121436d.f121421g != null) {
            this.f121436d.f121421g.mo95760b(i2);
        }
        if (!this.f121442k) {
            this.f121442k = true;
            C47625i.m103104a("mTmpPath", this.f121436d.f121415a);
            C47625i.m103104a("mOutPath", this.f121436d.f121416b);
            StringBuilder sb = new StringBuilder("WaterMarkComposer ret: ");
            sb.append(i);
            C32458a.m75148a((Throwable) new Exception(sb.toString()));
            if (C48255o.m104533a(C39618d.f101160a)) {
                C23569o.m57776a("aweme_download_synthesis_error_rate", 1, (JSONObject) null);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netWorkQuality", C14460b.m29586a().mo26625b().toString());
                jSONObject.put("netWorkSpeed", (int) C14460b.m29586a().mo26626c());
                jSONObject.put("ret", i);
                jSONObject.put("ext", i2);
                jSONObject.put("msg", str);
                C23569o.m57783b("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x035c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p683ss.android.ugc.aweme.watermark.C48249k m104519a(boolean r23, boolean r24, int[] r25) {
        /*
            r22 = this;
            r0 = r22
            r8 = r25
            r9 = 2
            r11 = 1
            r12 = 0
            if (r23 == 0) goto L_0x007c
            r22.m104522d()
            com.ss.android.ugc.aweme.shortvideo.z.a.a r2 = r0.f121446o
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f121436d
            com.ss.android.ugc.aweme.account.model.c r3 = r3.f121417c
            r5 = 0
            java.lang.String r6 = ""
            com.ss.android.ugc.aweme.watermark.l r4 = r0.f121436d
            boolean r7 = r4.f121422h
            r4 = r25
            com.ss.android.vesdk.VEWatermarkParam r2 = com.p683ss.android.ugc.aweme.watermark.C48247i.m104504a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x007d
            com.ss.android.vesdk.o$j r3 = r0.m104520a(r8)
            com.ss.android.vesdk.o$j r4 = com.p683ss.android.vesdk.C50720o.C50749j.VIDEO_OUT_RATIO_16_9
            if (r3 != r4) goto L_0x0068
            r3 = r8[r11]
            r4 = r8[r12]
            boolean r3 = com.p683ss.android.ugc.aweme.watermark.C48247i.m104507b(r3, r4)
            if (r3 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f121436d
            boolean r3 = r3.f121422h
            if (r3 == 0) goto L_0x0047
            r3 = r8[r11]
            r4 = r8[r12]
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x007d
            int r4 = r2.yOffset
            int r3 = r3 / r9
            int r4 = r4 + r3
            r2.yOffset = r4
            goto L_0x007d
        L_0x0047:
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f121436d
            boolean r3 = r3.f121429o
            if (r3 != 0) goto L_0x007d
            r3 = r8[r12]
            double r3 = (double) r3
            r5 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            int r3 = (int) r3
            r4 = r8[r11]
            int r4 = r3 - r4
            r8[r11] = r3
            int r3 = r2.yOffset
            int r4 = r4 / r9
            int r3 = r3 + r4
            r2.yOffset = r3
            goto L_0x007d
        L_0x0068:
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f121436d
            boolean r3 = r3.f121422h
            if (r3 == 0) goto L_0x007d
            r3 = r8[r11]
            r4 = r8[r12]
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x007d
            int r4 = r2.yOffset
            int r3 = r3 / r9
            int r4 = r4 + r3
            r2.yOffset = r4
            goto L_0x007d
        L_0x007c:
            r2 = 0
        L_0x007d:
            r3 = 3
            if (r24 == 0) goto L_0x02da
            com.ss.android.ugc.aweme.watermark.l r4 = r0.f121436d
            boolean r4 = r4.f121425k
            if (r4 == 0) goto L_0x008d
            r22.m104521c()
            r19 = r2
            goto L_0x0272
        L_0x008d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "@"
            r4.<init>(r5)
            com.ss.android.ugc.aweme.watermark.l r5 = r0.f121436d
            com.ss.android.ugc.aweme.account.model.c r5 = r5.f121417c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x00a4
            java.lang.String r4 = ""
            goto L_0x00ac
        L_0x00a4:
            com.ss.android.ugc.aweme.watermark.l r4 = r0.f121436d
            com.ss.android.ugc.aweme.account.model.c r4 = r4.f121417c
            java.lang.String r4 = r4.mo46163g()
        L_0x00ac:
            com.ss.android.ugc.aweme.watermark.l r5 = r0.f121436d
            com.ss.android.ugc.aweme.account.model.c r5 = r5.f121417c
            java.lang.String r5 = r5.mo46157a()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.watermark.l r5 = r0.f121436d
            com.ss.android.ugc.aweme.account.model.c r5 = r5.f121417c
            java.lang.String r5 = r5.mo46158b()
            goto L_0x00cb
        L_0x00c3:
            com.ss.android.ugc.aweme.watermark.l r5 = r0.f121436d
            com.ss.android.ugc.aweme.account.model.c r5 = r5.f121417c
            java.lang.String r5 = r5.mo46157a()
        L_0x00cb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = f121432a
            r6.append(r7)
            java.lang.String r7 = "end.png"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.f121435c = r6
            com.ss.android.ugc.aweme.watermark.l r6 = r0.f121436d
            com.ss.android.ugc.aweme.feed.model.Video r6 = r6.f121418d
            int r6 = r6.getWidth()
            com.ss.android.ugc.aweme.watermark.l r7 = r0.f121436d
            com.ss.android.ugc.aweme.feed.model.Video r7 = r7.f121418d
            int r7 = r7.getHeight()
            com.ss.android.medialib.FFMpegManager r13 = com.p683ss.android.medialib.FFMpegManager.m46826a()
            com.ss.android.ugc.aweme.watermark.l r14 = r0.f121436d
            java.lang.String r14 = r14.f121415a
            int[] r13 = r13.mo39233a(r14)
            r14 = r13[r12]
            if (r14 != 0) goto L_0x0104
            r6 = r13[r9]
            r7 = r13[r3]
        L_0x0104:
            com.ss.android.medialib.FFMpegManager r9 = com.p683ss.android.medialib.FFMpegManager.m46826a()
            r9.mo39234b()
            com.ss.android.ugc.aweme.watermark.p r9 = new com.ss.android.ugc.aweme.watermark.p
            r9.<init>()
            android.content.Context r13 = r0.f121434b
            android.content.Context r14 = r0.f121434b
            r15 = 2132542231(0x7f1c0317, float:2.0737561E38)
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r10[r12] = r5
            java.lang.String r5 = r14.getString(r15, r10)
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r6, r7, r10)
            r9.f121454a = r10
            float r10 = (float) r6
            r14 = 1065353216(0x3f800000, float:1.0)
            float r15 = r10 * r14
            float r3 = (float) r7
            float r15 = r15 / r3
            r16 = 1148190720(0x44700000, float:960.0)
            r17 = 1141309440(0x44070000, float:540.0)
            int r18 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r18 >= 0) goto L_0x013f
            float r14 = r10 / r17
            float r11 = r3 / r16
            float r11 = java.lang.Math.min(r14, r11)
            goto L_0x0147
        L_0x013f:
            float r11 = r10 / r16
            float r14 = r3 / r17
            float r11 = java.lang.Math.min(r11, r14)
        L_0x0147:
            android.graphics.Canvas r14 = new android.graphics.Canvas
            r19 = r2
            android.graphics.Bitmap r2 = r9.f121454a
            r14.<init>(r2)
            r14.drawColor(r12)
            android.text.TextPaint r2 = new android.text.TextPaint
            r12 = 1
            r2.<init>(r12)
            r2.setFakeBoldText(r12)
            r20 = r9
            double r8 = (double) r15
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r12 >= 0) goto L_0x016a
            r12 = 1108606976(0x42140000, float:37.0)
        L_0x0167:
            float r12 = r12 * r11
            goto L_0x016d
        L_0x016a:
            r12 = 1112014848(0x42480000, float:50.0)
            goto L_0x0167
        L_0x016d:
            r2.setTextSize(r12)
            android.content.res.Resources r12 = r13.getResources()
            r1 = 2131821816(0x7f1104f8, float:1.9276386E38)
            int r1 = r12.getColor(r1)
            r2.setColor(r1)
            r1 = 1061494456(0x3f451eb8, float:0.77)
            float r10 = r10 * r1
            float r1 = r2.measureText(r4)
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x01b3
            float r10 = r1 - r10
            int r12 = r4.length()
            float r12 = (float) r12
            float r1 = r1 / r12
            float r10 = r10 / r1
            int r1 = (int) r10
            r10 = 3
            int r1 = r1 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r12 = r4.length()
            int r12 = r12 - r1
            r1 = 0
            java.lang.String r4 = r4.substring(r1, r12)
            r10.append(r4)
            java.lang.String r4 = "..."
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            int r12 = r4.length()
            r2.getTextBounds(r4, r1, r12, r10)
            int r12 = r10.width()
            int r12 = r6 - r12
            float r12 = (float) r12
            r18 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r18
            int r10 = r10.height()
            android.text.TextPaint r0 = new android.text.TextPaint
            r21 = r7
            r7 = 1
            r0.<init>(r7)
            r0.setFakeBoldText(r1)
            int r1 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x01e3
            r1 = 1104150528(0x41d00000, float:26.0)
        L_0x01e0:
            float r1 = r1 * r11
            goto L_0x01e6
        L_0x01e3:
            r1 = 1103101952(0x41c00000, float:24.0)
            goto L_0x01e0
        L_0x01e6:
            r0.setTextSize(r1)
            android.content.res.Resources r1 = r13.getResources()
            r7 = 2131821856(0x7f110520, float:1.9276467E38)
            int r1 = r1.getColor(r7)
            r0.setColor(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            int r7 = r5.length()
            r8 = 0
            r0.getTextBounds(r5, r8, r7, r1)
            r7 = 1083179008(0x40900000, float:4.5)
            float r7 = r7 * r3
            r8 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 / r8
            r14.drawText(r4, r12, r7, r2)
            int r1 = r1.width()
            int r1 = r6 - r1
            float r1 = (float) r1
            float r1 = r1 / r18
            float r2 = (float) r10
            float r7 = r7 + r2
            r2 = 1077936128(0x40400000, float:3.0)
            float r11 = r11 * r2
            float r7 = r7 + r11
            r14.drawText(r5, r1, r7, r0)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131956777(0x7f131429, float:1.955012E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x023f
            int r4 = r6 * 21
        L_0x023c:
            int r4 = r4 / 100
            goto L_0x0242
        L_0x023f:
            int r4 = r6 * 13
            goto L_0x023c
        L_0x0242:
            r5 = 1031127695(0x3d75c28f, float:0.06)
            float r3 = r3 * r5
            int r3 = (int) r3
            int r6 = r6 - r4
            float r5 = (float) r6
            float r5 = r5 / r18
            int r5 = (int) r5
            float r2 = (float) r2
            r6 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r6
            float r1 = (float) r1
            float r2 = r2 / r1
            float r1 = (float) r4
            float r2 = r2 * r1
            int r1 = (int) r2
            android.graphics.Rect r2 = new android.graphics.Rect
            int r7 = r21 - r3
            int r1 = r7 - r1
            int r4 = r4 + r5
            r2.<init>(r5, r1, r4, r7)
            r1 = 0
            r14.drawBitmap(r0, r1, r2, r1)
            com.p683ss.android.ugc.aweme.utils.C47954t.m103763a(r0)
            r0 = r22
            java.lang.String r1 = r0.f121435c
            r2 = r20
            r2.mo95757a(r1)
        L_0x0272:
            java.lang.String r1 = r0.f121444m
            if (r1 == 0) goto L_0x027e
            java.lang.String r1 = r0.f121444m
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103311a(r1)
            if (r1 != 0) goto L_0x02ba
        L_0x027e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r0.f121434b
            java.io.File r2 = r2.getCacheDir()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "watermark.mp3"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f121444m = r1
            java.lang.String r1 = r0.f121444m
            r2 = 1
            com.p683ss.android.ugc.aweme.video.C48016e.m103935a(r1, r2)
            android.content.Context r1 = r0.f121434b     // Catch:{ IOException -> 0x02b9 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x02b9 }
            java.lang.String r2 = "watermark_audio.mp3"
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ IOException -> 0x02b9 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02b9 }
            java.lang.String r3 = r0.f121444m     // Catch:{ IOException -> 0x02b9 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x02b9 }
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103310a(r1, r2)     // Catch:{ IOException -> 0x02b9 }
            goto L_0x02ba
        L_0x02b9:
        L_0x02ba:
            java.lang.String r1 = r0.f121435c
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103311a(r1)
            if (r1 == 0) goto L_0x02dc
            com.ss.android.ugc.aweme.watermark.j r1 = new com.ss.android.ugc.aweme.watermark.j
            java.lang.String r3 = r0.f121435c
            java.lang.String r4 = r0.f121444m
            r5 = 3000(0xbb8, float:4.204E-42)
            r6 = 0
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r2 = "black"
            r8 = 0
            r7[r8] = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = r25
            goto L_0x02df
        L_0x02da:
            r19 = r2
        L_0x02dc:
            r1 = r25
            r2 = 0
        L_0x02df:
            r3 = 0
            r4 = r1[r3]
            r3 = 1
            r5 = r1[r3]
            com.ss.android.vesdk.VEVideoEncodeSettings r17 = com.p683ss.android.ugc.aweme.watermark.C48247i.m104501a(r4, r5)
            if (r23 == 0) goto L_0x02f4
            if (r19 != 0) goto L_0x02f4
            java.lang.String r1 = "need interWatermark,but watermark param is null ,maybe the image data is invalid"
            com.p683ss.android.ugc.tools.utils.C50203g.m108361b(r1)
            r3 = 0
            return r3
        L_0x02f4:
            r3 = 0
            com.ss.android.ugc.aweme.watermark.l r4 = r0.f121436d
            boolean r4 = r4.f121429o
            if (r4 == 0) goto L_0x033f
            com.ss.android.ugc.aweme.watermark.l r4 = r0.f121436d
            java.lang.String r4 = r4.f121430p
            if (r4 == 0) goto L_0x033f
            r4 = 10
            int[] r4 = new int[r4]
            com.ss.android.ugc.aweme.watermark.l r5 = r0.f121436d
            java.lang.String r5 = r5.f121415a
            com.p683ss.android.vesdk.VEUtils.getVideoFileInfo(r5, r4)
            com.ss.android.ugc.aweme.watermark.l r5 = r0.f121436d
            java.lang.String r5 = r5.f121430p
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5)
            if (r5 == 0) goto L_0x0335
            com.ss.android.ugc.aweme.watermark.b r3 = new com.ss.android.ugc.aweme.watermark.b
            r6 = 3
            r7 = r4[r6]
            r4 = 0
            r8 = r1[r4]
            r4 = 1
            r9 = r1[r4]
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f121436d
            java.lang.String r10 = r1.f121430p
            int r11 = r5.getHeight()
            int r12 = r5.getWidth()
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f121436d
            boolean r13 = r1.f121431q
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
        L_0x0335:
            r10 = r3
            com.ss.android.vesdk.aq r1 = com.p683ss.android.vesdk.C50637aq.TL
            r4 = r19
            r4.position = r1
            r18 = r10
            goto L_0x0343
        L_0x033f:
            r4 = r19
            r18 = r3
        L_0x0343:
            com.ss.android.ugc.aweme.watermark.k r1 = new com.ss.android.ugc.aweme.watermark.k
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f121436d
            java.lang.String r14 = r3.f121415a
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f121436d
            java.lang.String r15 = r3.f121416b
            r13 = r1
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            r1.mo95737a(r2)
            com.ss.android.ugc.aweme.watermark.l r2 = r0.f121436d
            boolean r2 = r2.f121425k
            if (r2 == 0) goto L_0x035f
            r2 = -1
            r1.f121412d = r2
        L_0x035f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.watermark.C48251m.m104519a(boolean, boolean, int[]):com.ss.android.ugc.aweme.watermark.k");
    }

    /* renamed from: a */
    public final void mo95751a(boolean z, int i, int i2, String str) {
        if (!this.f121443l) {
            this.f121443l = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f121445n;
            File file = new File(this.f121436d.f121415a);
            long length = file.length();
            boolean equals = TextUtils.equals(C47723bk.m103316d(file.getPath()), "20");
            if (z) {
                C23569o.m57776a("save_video_success_rate", 0, new C23088c().mo47823a("watermark_duration", Long.valueOf(currentTimeMillis)).mo47823a("download_rate", Long.valueOf(this.f121436d.f121427m)).mo47823a("download_duration", Long.valueOf(this.f121436d.f121428n)).mo47819a("isInstagram", Boolean.valueOf(this.f121436d.f121422h)).mo47823a("file_size", Long.valueOf(length)).mo47824a("url", this.f121436d.f121426l).mo47819a("needWaterMark", Boolean.valueOf(true)).mo47824a("ret", TEVideoRecorder.FACE_BEAUTY_NULL).mo47824a("ext", TEVideoRecorder.FACE_BEAUTY_NULL).mo47824a("msg", TEVideoRecorder.FACE_BEAUTY_NULL).mo47819a("isMp4", Boolean.valueOf(equals)).mo47825b());
            } else {
                C23569o.m57776a("save_video_success_rate", 2, new C23088c().mo47823a("watermark_duration", Long.valueOf(currentTimeMillis)).mo47823a("download_rate", Long.valueOf(this.f121436d.f121427m)).mo47823a("download_duration", Long.valueOf(this.f121436d.f121428n)).mo47819a("isInstagram", Boolean.valueOf(this.f121436d.f121422h)).mo47823a("file_size", Long.valueOf(length)).mo47824a("url", this.f121436d.f121426l).mo47819a("needWaterMark", Boolean.valueOf(true)).mo47822a("ret", Integer.valueOf(i)).mo47822a("ext", Integer.valueOf(i2)).mo47824a("msg", str).mo47819a("isMp4", Boolean.valueOf(equals)).mo47825b());
            }
        }
    }
}
