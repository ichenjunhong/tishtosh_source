package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43509at;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43549b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44541f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b.C44542g;
import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a.C46738a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a.C46739b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a.C46740c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a.C46740c.C46743b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l */
public final class C46757l extends View implements C43509at<TextStickerData> {

    /* renamed from: A */
    private int f118065A = 2;

    /* renamed from: B */
    private boolean f118066B = true;

    /* renamed from: C */
    private SafeHandler f118067C;

    /* renamed from: D */
    private int f118068D;

    /* renamed from: E */
    private C46738a f118069E;

    /* renamed from: F */
    private int f118070F;

    /* renamed from: G */
    private int f118071G;

    /* renamed from: H */
    private Vibrator f118072H;

    /* renamed from: I */
    private long f118073I;

    /* renamed from: J */
    private long f118074J;

    /* renamed from: K */
    private int f118075K = -1;

    /* renamed from: L */
    private PointF f118076L;

    /* renamed from: M */
    private boolean f118077M;

    /* renamed from: a */
    public float f118078a;

    /* renamed from: b */
    public float f118079b;

    /* renamed from: c */
    public float f118080c;

    /* renamed from: d */
    public float f118081d = 1.0f;

    /* renamed from: e */
    public boolean f118082e;

    /* renamed from: f */
    public final boolean f118083f;

    /* renamed from: g */
    public int f118084g;

    /* renamed from: h */
    public int f118085h;

    /* renamed from: i */
    public C46739b f118086i;

    /* renamed from: j */
    public C46740c f118087j;

    /* renamed from: k */
    public TextStickerData f118088k;

    /* renamed from: l */
    public boolean f118089l = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);

    /* renamed from: m */
    public C44542g f118090m = new C44542g(this, new C46759a());

    /* renamed from: n */
    public PointF f118091n = new PointF();

    /* renamed from: o */
    public C43549b f118092o;

    /* renamed from: p */
    public final int f118093p;

    /* renamed from: q */
    public boolean f118094q;

    /* renamed from: r */
    public boolean f118095r;

    /* renamed from: s */
    public boolean f118096s;

    /* renamed from: t */
    public float f118097t;

    /* renamed from: u */
    private boolean f118098u = true;

    /* renamed from: v */
    private TextStickerTextWrap f118099v;

    /* renamed from: w */
    private TextStickerString[] f118100w;

    /* renamed from: x */
    private int f118101x = 1;

    /* renamed from: y */
    private int f118102y = -1;

    /* renamed from: z */
    private String f118103z = "default";

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$a */
    class C46759a implements C44541f {
        /* renamed from: c */
        public final void mo88480c() {
        }

        /* renamed from: d */
        public final void mo88481d() {
        }

        /* renamed from: e */
        public final void mo88482e() {
        }

        /* renamed from: a */
        public final void mo88478a() {
            if (C46757l.this.f118087j.f118026a != null) {
                C46757l.this.f118087j.f118026a.mo93674a(C46757l.this);
            }
        }

        /* renamed from: b */
        public final void mo88479b() {
            if (C46757l.this.f118087j.f118026a != null) {
                C46757l.this.f118087j.f118026a.mo93676a(C46757l.this, true);
            }
        }

        private C46759a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$b */
    class C46760b implements C46743b {
        private C46760b() {
        }

        /* renamed from: a */
        public final void mo93874a(boolean z, boolean z2) {
            if (C46757l.this.f118089l) {
                if (z) {
                    C46757l.this.f118090m.mo90466a(C46757l.this.getCurrentHelpBoxRect(), (int) C46757l.this.f118091n.x, (int) C46757l.this.f118091n.y, C46757l.this.f118080c);
                } else if (z2) {
                    C46757l.this.f118090m.mo90465a();
                } else {
                    C46757l.this.f118090m.mo90467b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l$c */
    public interface C46761c {
        /* renamed from: a */
        int mo93671a(C46757l lVar, boolean z, boolean z2);

        /* renamed from: a */
        PointF mo93672a(C46757l lVar, float f, float f2);

        /* renamed from: a */
        Float mo93673a(float f);

        /* renamed from: a */
        void mo93674a(C46757l lVar);

        /* renamed from: a */
        void mo93675a(C46757l lVar, RectF rectF, int i, int i2, boolean z, boolean z2, boolean z3, C43549b bVar);

        /* renamed from: a */
        void mo93676a(C46757l lVar, boolean z);

        /* renamed from: b */
        void mo93677b(C46757l lVar);
    }

    public final float getCenterX() {
        return this.f118078a;
    }

    public final float getCenterY() {
        return this.f118079b;
    }

    public final int getCurAlignTxt() {
        return this.f118065A;
    }

    public final int getCurColor() {
        return this.f118102y;
    }

    public final String getCurFontType() {
        return this.f118103z;
    }

    public final int getCurMode() {
        return this.f118101x;
    }

    public final TextStickerData getData() {
        return this.f118088k;
    }

    public final float getStickerRotate() {
        return this.f118080c;
    }

    public final float getStickerScale() {
        return this.f118081d;
    }

    public final TextStickerTextWrap getTextWrap() {
        return this.f118099v;
    }

    public final void invalidate() {
        super.invalidate();
    }

    public final RectF getDeleteRect() {
        return this.f118069E.f117991f;
    }

    public final RectF getEditRect() {
        return this.f118069E.f117993h;
    }

    public final RectF getHelpRect() {
        return this.f118069E.f117988c;
    }

    public final RectF getRotateRect() {
        return this.f118069E.f117992g;
    }

    public final RectF getTextRect() {
        return this.f118069E.f117987b;
    }

    public final RectF getTimeRect() {
        return this.f118069E.f117994i;
    }

    /* renamed from: j */
    private boolean m101529j() {
        if (SystemClock.elapsedRealtime() < this.f118074J) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final /* synthetic */ C45868a mo52072c() {
        return mo93926h().clone();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f118090m.mo90471f();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f118090m.mo90472g();
    }

    private int getFontSize() {
        float f;
        if (this.f118075K < 0) {
            Context context = getContext();
            if (this.f118088k == null) {
                f = 28.0f;
            } else {
                f = (float) this.f118088k.getFontSize();
            }
            this.f118075K = (int) C9432q.m18669a(context, f);
        }
        return this.f118075K;
    }

    /* renamed from: f */
    public final boolean mo93900f() {
        if (this.f118095r || this.f118094q || this.f118087j.mo93868a()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo93902g() {
        if (this.f118096s || this.f118094q || this.f118087j.mo93868a()) {
            return true;
        }
        return false;
    }

    public final int getContentViewHeight() {
        return (int) Math.abs(getMinTextRect().bottom - getMinTextRect().top);
    }

    public final int getContentViewWidth() {
        return (int) Math.abs(getMinTextRect().right - getMinTextRect().left);
    }

    /* renamed from: i */
    private void m101528i() {
        if (this.f118088k != null && this.f118088k.hasPositionData()) {
            this.f118098u = false;
            this.f118078a = this.f118088k.getX();
            this.f118079b = this.f118088k.getY();
            this.f118080c = this.f118088k.getRotation();
            this.f118081d = this.f118088k.getScale();
        }
    }

    /* renamed from: b */
    public boolean mo93891b() {
        if (!this.f118066B || getVisibility() != 0 || (this.f118087j.mo93872d() && !this.f118083f)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo93896d() {
        int i;
        if (this.f118088k != null && !mo93888a() && !this.f118077M && !m101529j()) {
            boolean isVisibleWhen = this.f118088k.isVisibleWhen(this.f118073I);
            if (isVisibleWhen) {
                i = 0;
            } else {
                i = 8;
            }
            C23729p.m58264b((View) this, i);
            this.f118066B = isVisibleWhen;
        }
    }

    /* renamed from: e */
    public final boolean mo93898e() {
        if (this.f118095r || this.f118096s || this.f118094q || this.f118087j.mo93868a() || this.f118087j.mo93870b()) {
            return true;
        }
        return false;
    }

    public final PointF[] getAnglePointList() {
        C46738a aVar = this.f118069E;
        PointF[] pointFArr = new PointF[aVar.f117979P.size()];
        float radians = (float) Math.toRadians((double) aVar.f117977N);
        for (int i = 0; i < pointFArr.length; i++) {
            pointFArr[i] = C43454a.m95250a((PointF) aVar.f117979P.get(i), aVar.f117988c.centerX(), aVar.f117988c.centerY(), radians);
        }
        return pointFArr;
    }

    public final RectF getCurrentHelpBoxRect() {
        C46738a aVar = this.f118069E;
        RectF rectF = new RectF();
        rectF.set(aVar.f117987b);
        rectF.set(rectF.left - ((float) aVar.f117965B), rectF.top - ((float) aVar.f117965B), rectF.right + ((float) aVar.f117965B), rectF.bottom + ((float) aVar.f117965B));
        return rectF;
    }

    public final RectF getMinTextRect() {
        C46738a aVar = this.f118069E;
        return new RectF(aVar.f117987b.left + ((float) aVar.f118009x), aVar.f117987b.top + ((float) aVar.f118010y), aVar.f117987b.right - ((float) aVar.f118009x), aVar.f117987b.bottom - ((float) aVar.f118010y));
    }

    public final String getText() {
        TextStickerString[] textStickerStringArr = this.f118100w;
        if (textStickerStringArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (TextStickerString str : textStickerStringArr) {
            sb.append(str.getStr());
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final PointF[] getAnglePointListForBlock() {
        C46738a aVar = this.f118069E;
        PointF[] pointFArr = {new PointF(aVar.f117987b.left, aVar.f117987b.top), new PointF(aVar.f117987b.right, aVar.f117987b.top), new PointF(aVar.f117987b.right, aVar.f117987b.bottom), new PointF(aVar.f117987b.left, aVar.f117987b.bottom)};
        float radians = (float) Math.toRadians((double) aVar.f117977N);
        for (int i = 0; i < 4; i++) {
            pointFArr[i] = C43454a.m95250a(pointFArr[i], aVar.f117987b.centerX(), aVar.f117987b.centerY(), radians);
        }
        return pointFArr;
    }

    /* renamed from: h */
    public final TextStickerData mo93926h() {
        if (this.f118088k == null) {
            TextStickerData textStickerData = new TextStickerData("", this.f118101x, this.f118102y, this.f118065A, this.f118103z);
            this.f118088k = textStickerData;
            this.f118088k.setTextWrap(this.f118099v);
        }
        this.f118088k.setX(this.f118078a);
        this.f118088k.setY(this.f118079b);
        this.f118088k.setRotation(this.f118080c);
        this.f118088k.setScale(this.f118081d);
        this.f118088k.setTextWrap(this.f118099v);
        this.f118088k.setBgMode(this.f118101x);
        this.f118088k.setColor(this.f118102y);
        this.f118088k.setAlign(this.f118065A);
        this.f118088k.setFontType(this.f118103z);
        return this.f118088k;
    }

    /* renamed from: a */
    public final boolean mo93888a() {
        return this.f118087j.f118034i;
    }

    /* renamed from: b */
    public final boolean mo93892b(float f) {
        this.f118081d = f;
        return true;
    }

    public final void setCenterX(float f) {
        this.f118078a = f;
    }

    public final void setCenterY(float f) {
        this.f118079b = f;
    }

    public final void setEnableEdit(boolean z) {
        this.f118066B = z;
    }

    public final void setPlayPosition(long j) {
        this.f118073I = j;
    }

    public final void setOnEditClickListener(C46761c cVar) {
        this.f118087j.f118026a = cVar;
    }

    public final void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        mo93890b(f, false);
    }

    public final void setShowHelpBox(boolean z) {
        this.f118087j.mo93867a(z);
        if (!z) {
            m101524a(1000);
        }
    }

    public final void setTouching(boolean z) {
        if (z != this.f118077M) {
            this.f118077M = z;
            if (!z) {
                m101524a(1000);
            }
        }
    }

    /* renamed from: a */
    private void m101524a(long j) {
        this.f118074J = SystemClock.elapsedRealtime();
        this.f118067C.postDelayed(new C46762m(this), 1000);
    }

    /* renamed from: e */
    private void m101527e(int i) {
        C46738a aVar = this.f118069E;
        aVar.f118004s.setColor(i);
        aVar.f118005t = i;
        if (aVar.f117976M) {
            aVar.f117969F.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            aVar.f117969F.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        }
    }

    /* renamed from: b */
    public final int mo52069b(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return i;
        }
        return getData().getEndTime();
    }

    /* renamed from: c */
    public final int mo52071c(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return 0;
        }
        return getData().getUiStartTime();
    }

    /* renamed from: d */
    public final int mo52073d(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return i;
        }
        return getData().getUiEndTime();
    }

    public final void setAnimXY(Point point) {
        C46739b bVar = this.f118086i;
        int i = point.x - this.f118084g;
        int i2 = point.y - this.f118085h;
        bVar.f118016e = (float) i;
        bVar.f118017f = (float) i2;
    }

    public final void setText(TextStickerTextWrap textStickerTextWrap) {
        this.f118099v = textStickerTextWrap;
        this.f118100w = textStickerTextWrap.getStickerStringArray();
        C46738a aVar = this.f118069E;
        aVar.f118006u = textStickerTextWrap;
        aVar.f118007v = textStickerTextWrap.getStickerStringArray();
        invalidate();
    }

    /* renamed from: a */
    public float mo93885a(float f) {
        if (!C22452a.m55499e() || C43303dy.m94973d(getContext()) <= 0) {
            return f;
        }
        return f - ((float) C43303dy.m94972c(getContext()));
    }

    /* renamed from: c */
    public final boolean mo93894c(float f) {
        if (f <= 1.0f) {
            if (this.f118081d < 0.4f) {
                return false;
            }
        } else if (this.f118081d > 11.0f) {
            return false;
        }
        return true;
    }

    public final void setFontSize(int i) {
        if (this.f118088k != null) {
            this.f118088k.setFontSize(i);
        }
        this.f118075K = (int) C9432q.m18669a(getContext(), (float) i);
        C46738a aVar = this.f118069E;
        float f = (float) this.f118075K;
        aVar.f118008w = f;
        float a = f / C9432q.m18669a(aVar.f117973J.getContext(), 28.0f);
        aVar.f118009x = (int) (C9432q.m18687b(aVar.f117973J.getContext(), 12.0f) * a);
        aVar.f118010y = (int) (C9432q.m18687b(aVar.f117973J.getContext(), 8.0f) * a);
        aVar.f118011z = aVar.f118009x;
        aVar.f117964A = aVar.f118010y;
        aVar.f117968E = (int) (C9432q.m18687b(aVar.f117973J.getContext(), 5.0f) * a);
        aVar.f118004s.setPathEffect(new CornerPathEffect((float) aVar.f117968E));
        invalidate();
    }

    public final void setTextColor(int i) {
        boolean z;
        C46738a aVar = this.f118069E;
        C46679c a = C46679c.m101291a();
        if (a.mo93638f() != null) {
            z = a.mo93638f().mo93619a();
        } else {
            z = false;
        }
        aVar.f117976M = z;
        if (aVar.f117969F.getTypeface() != C46679c.m101291a().mo93634d()) {
            aVar.f117969F.setTypeface(C46679c.m101291a().mo93634d());
        }
        if (aVar.f117976M) {
            aVar.f117969F.setColor(-1);
            aVar.f117969F.setShadowLayer(12.0f, 0.0f, 0.0f, i);
            return;
        }
        aVar.f117969F.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        aVar.f117969F.setColor(i);
    }

    /* renamed from: a */
    public final int mo52063a(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return i;
        }
        return getData().getStartTime();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x05bd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0222 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r36) {
        /*
            r35 = this;
            r0 = r35
            r9 = r36
            super.onDraw(r36)
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r1 = r0.f118100w
            if (r1 == 0) goto L_0x07e1
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r1 = r0.f118100w
            int r1 = r1.length
            if (r1 != 0) goto L_0x0012
            goto L_0x07e1
        L_0x0012:
            android.graphics.PointF r1 = r0.f118076L
            float r2 = r0.f118078a
            r1.x = r2
            android.graphics.PointF r1 = r0.f118076L
            float r2 = r0.f118079b
            r1.y = r2
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a r10 = r0.f118069E
            float r6 = r0.f118081d
            float r11 = r0.f118080c
            android.graphics.PointF r1 = r0.f118076L
            int r7 = r0.f118065A
            boolean r12 = r0.f118082e
            boolean r2 = r35.mo93888a()
            boolean r3 = r0.f118083f
            int r8 = r35.getFontSize()
            float r4 = r1.x
            r10.f117974K = r4
            float r1 = r1.y
            r10.f117975L = r1
            android.text.TextPaint r1 = r10.f117969F
            float r4 = (float) r8
            float r4 = r4 * r6
            r1.setTextSize(r4)
            r10.f117977N = r11
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r1 = r10.f118007v
            r14 = 0
            if (r1 == 0) goto L_0x0088
            r1 = 0
            r15 = 0
        L_0x004d:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r5 = r10.f118007v
            int r5 = r5.length
            if (r1 >= r5) goto L_0x0072
            android.text.TextPaint r5 = r10.f117969F
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r4 = r10.f118007v
            r4 = r4[r1]
            java.lang.String r4 = r4.getStr()
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r13 = r10.f118007v
            r13 = r13[r1]
            java.lang.String r13 = r13.getStr()
            int r13 = r13.length()
            int r4 = com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e.m101392a(r5, r4, r14, r13)
            if (r4 <= r15) goto L_0x006f
            r15 = r4
        L_0x006f:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0072:
            r1 = 1
            if (r7 != r1) goto L_0x007d
            float r1 = r10.f117974K
            int r4 = r15 / 2
            float r4 = (float) r4
            float r1 = r1 - r4
            r10.f117974K = r1
        L_0x007d:
            r1 = 3
            if (r7 != r1) goto L_0x0088
            float r1 = r10.f117974K
            r4 = 2
            int r15 = r15 / r4
            float r4 = (float) r15
            float r1 = r1 + r4
            r10.f117974K = r1
        L_0x0088:
            float r1 = r10.f117974K
            float r4 = r10.f117975L
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r5 = r10.f118007v
            if (r5 == 0) goto L_0x0422
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r5 = r10.f118007v
            int r5 = r5.length
            if (r5 != 0) goto L_0x0097
            goto L_0x0422
        L_0x0097:
            android.text.TextPaint r5 = r10.f117969F
            android.graphics.Paint$FontMetrics r5 = r5.getFontMetrics()
            float r13 = r5.ascent
            float r14 = r5.descent
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r15 = r10.f118007v
            int r15 = r15.length
            int r0 = r15 + -1
            r18 = r12
            float r12 = (float) r0
            r19 = r8
            float r8 = r5.descent
            float r5 = r5.ascent
            float r8 = r8 - r5
            float r12 = r12 * r8
            android.graphics.PointF[][] r5 = new android.graphics.PointF[r15][]
            float r14 = r14 - r13
            int r8 = (int) r14
            int r13 = r10.f118011z
            float r13 = (float) r13
            float r13 = r13 * r6
            int r13 = (int) r13
            r10.f118009x = r13
            int r13 = r10.f117964A
            float r13 = (float) r13
            float r13 = r13 * r6
            int r13 = (int) r13
            r10.f118010y = r13
            int r13 = r10.f118010y
            int r14 = r10.f117964A
            if (r13 < r14) goto L_0x00d0
            int r13 = r10.f117964A
            r10.f118010y = r13
        L_0x00d0:
            int r13 = r10.f118009x
            int r14 = r10.f118011z
            if (r13 < r14) goto L_0x00da
            int r13 = r10.f118011z
            r10.f118009x = r13
        L_0x00da:
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r13
            float r4 = r4 - r12
            int r4 = (int) r4
            float r12 = r10.f118008w
            float r12 = r12 * r6
            r13 = 1082130432(0x40800000, float:4.0)
            float r12 = r12 / r13
            r22 = r6
            r6 = 0
            r13 = 0
            r14 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = -1
            r25 = -1
        L_0x00f5:
            if (r13 >= r15) goto L_0x023d
            r26 = r3
            android.text.TextPaint r3 = r10.f117969F
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r9 = r10.f118007v
            r9 = r9[r13]
            java.lang.String r9 = r9.getStr()
            float r3 = r3.measureText(r9)
            int r3 = (int) r3
            int r9 = r3 / 2
            float r9 = (float) r9
            float r27 = r1 - r9
            r28 = r2
            int r2 = r10.f118009x
            float r2 = (float) r2
            float r27 = r27 - r2
            float r9 = r9 + r1
            int r2 = r10.f118009x
            float r2 = (float) r2
            float r9 = r9 + r2
            r2 = 1
            if (r7 != r2) goto L_0x0127
            int r2 = r10.f118009x
            float r2 = (float) r2
            float r27 = r1 - r2
            float r2 = (float) r3
            float r2 = r2 + r1
            int r9 = r10.f118009x
            float r9 = (float) r9
            float r9 = r9 + r2
        L_0x0127:
            r2 = 3
            if (r7 != r2) goto L_0x0137
            float r2 = (float) r3
            float r2 = r1 - r2
            int r9 = r10.f118009x
            float r9 = (float) r9
            float r27 = r2 - r9
            int r2 = r10.f118009x
            float r2 = (float) r2
            float r9 = r1 + r2
        L_0x0137:
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r2 = r10.f118007v
            r2 = r2[r13]
            java.lang.String r2 = r2.getStr()
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x015d
            r2 = 1
            if (r7 != r2) goto L_0x0152
            int r2 = r10.f118009x
            float r2 = (float) r2
            float r2 = r2 + r1
            r9 = r2
            goto L_0x0153
        L_0x0152:
            r9 = r1
        L_0x0153:
            r2 = 3
            if (r7 != r2) goto L_0x015b
            int r2 = r10.f118009x
            float r2 = (float) r2
            float r9 = r1 - r2
        L_0x015b:
            r27 = r9
        L_0x015d:
            int r2 = r3 - r14
            int r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0186
            r2 = 1
            if (r7 != r2) goto L_0x0171
            r2 = 0
            int r14 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x0186
            goto L_0x0181
        L_0x0171:
            r2 = 0
            r14 = 3
            if (r7 != r14) goto L_0x017a
            int r14 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x0186
            goto L_0x0181
        L_0x017a:
            r14 = 2
            if (r7 != r14) goto L_0x0186
            int r14 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x0186
        L_0x0181:
            r9 = r20
            r2 = r21
            goto L_0x0188
        L_0x0186:
            r2 = r27
        L_0x0188:
            if (r13 != 0) goto L_0x018c
            int r23 = r4 - r8
        L_0x018c:
            int r14 = r23 + r8
            r29 = r4
            r4 = 1
            if (r15 <= r4) goto L_0x01c9
            if (r13 <= 0) goto L_0x01a9
            android.text.TextPaint r4 = r10.f117969F
            r30 = r8
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r8 = r10.f118007v
            int r20 = r13 + -1
            r8 = r8[r20]
            java.lang.String r8 = r8.getStr()
            float r4 = r4.measureText(r8)
            int r4 = (int) r4
            goto L_0x01ad
        L_0x01a9:
            r30 = r8
            r4 = r24
        L_0x01ad:
            if (r13 >= r0) goto L_0x01c6
            android.text.TextPaint r8 = r10.f117969F
            r31 = r4
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r4 = r10.f118007v
            int r20 = r13 + 1
            r4 = r4[r20]
            java.lang.String r4 = r4.getStr()
            float r4 = r8.measureText(r4)
            int r4 = (int) r4
            r8 = r4
            r4 = r31
            goto L_0x01cf
        L_0x01c6:
            r31 = r4
            goto L_0x01cd
        L_0x01c9:
            r30 = r8
            r4 = r24
        L_0x01cd:
            r8 = r25
        L_0x01cf:
            if (r4 <= 0) goto L_0x01d9
            if (r3 < r4) goto L_0x01d9
            r32 = r4
            int r4 = r10.f118010y
            int r14 = r14 + r4
            goto L_0x01db
        L_0x01d9:
            r32 = r4
        L_0x01db:
            if (r8 <= 0) goto L_0x01e2
            if (r3 <= r8) goto L_0x01e2
            int r4 = r10.f118010y
            int r14 = r14 + r4
        L_0x01e2:
            if (r13 != 0) goto L_0x01e8
            int r4 = r10.f118010y
            int r23 = r23 - r4
        L_0x01e8:
            r4 = r23
            if (r13 != r0) goto L_0x01f2
            r33 = r8
            int r8 = r10.f118010y
            int r14 = r14 + r8
            goto L_0x01f4
        L_0x01f2:
            r33 = r8
        L_0x01f4:
            r8 = 4
            android.graphics.PointF[] r8 = new android.graphics.PointF[r8]
            r34 = r12
            android.graphics.PointF r12 = new android.graphics.PointF
            float r4 = (float) r4
            r12.<init>(r2, r4)
            r17 = 0
            r8[r17] = r12
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r9, r4)
            r4 = 1
            r8[r4] = r12
            android.graphics.PointF r4 = new android.graphics.PointF
            float r12 = (float) r14
            r4.<init>(r9, r12)
            r16 = 2
            r8[r16] = r4
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r2, r12)
            r12 = 3
            r8[r12] = r4
            r5[r13] = r8
            if (r3 <= r6) goto L_0x0222
            r6 = r3
        L_0x0222:
            int r13 = r13 + 1
            r21 = r2
            r20 = r9
            r23 = r14
            r2 = r28
            r4 = r29
            r8 = r30
            r24 = r32
            r25 = r33
            r12 = r34
            r9 = r36
            r14 = r3
            r3 = r26
            goto L_0x00f5
        L_0x023d:
            r28 = r2
            r26 = r3
            android.graphics.Path r2 = r10.f117972I
            r2.reset()
            java.util.List<android.graphics.PointF> r2 = r10.f117979P
            r2.clear()
            r2 = 0
        L_0x024c:
            if (r2 >= r15) goto L_0x02e7
            if (r2 != 0) goto L_0x0262
            android.graphics.Path r3 = r10.f117972I
            r4 = r5[r2]
            r8 = 0
            r4 = r4[r8]
            float r4 = r4.x
            r9 = r5[r2]
            r9 = r9[r8]
            float r8 = r9.y
            r3.moveTo(r4, r8)
        L_0x0262:
            android.graphics.Path r3 = r10.f117972I
            r4 = r5[r2]
            r8 = 1
            r4 = r4[r8]
            float r4 = r4.x
            r9 = r5[r2]
            r9 = r9[r8]
            float r9 = r9.y
            r3.lineTo(r4, r9)
            r3 = r5[r2]
            r4 = 0
            r3 = r3[r4]
            float r3 = r3.x
            r4 = r5[r2]
            r4 = r4[r8]
            float r4 = r4.x
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x02a9
            android.graphics.Path r3 = r10.f117972I
            r4 = r5[r2]
            r4 = r4[r8]
            float r4 = r4.x
            r9 = r5[r2]
            r9 = r9[r8]
            float r8 = r9.y
            r3.lineTo(r4, r8)
            android.graphics.Path r3 = r10.f117972I
            r4 = r5[r2]
            r8 = 2
            r4 = r4[r8]
            float r4 = r4.x
            r9 = r5[r2]
            r9 = r9[r8]
            float r9 = r9.y
            r3.lineTo(r4, r9)
            goto L_0x02aa
        L_0x02a9:
            r8 = 2
        L_0x02aa:
            android.graphics.Path r3 = r10.f117972I
            r4 = r5[r2]
            r4 = r4[r8]
            float r4 = r4.x
            r9 = r5[r2]
            r9 = r9[r8]
            float r8 = r9.y
            r3.lineTo(r4, r8)
            java.util.List<android.graphics.PointF> r3 = r10.f117979P
            r4 = r5[r2]
            r8 = 0
            r4 = r4[r8]
            r3.add(r4)
            java.util.List<android.graphics.PointF> r3 = r10.f117979P
            r4 = r5[r2]
            r8 = 1
            r4 = r4[r8]
            r3.add(r4)
            java.util.List<android.graphics.PointF> r3 = r10.f117979P
            r4 = r5[r2]
            r8 = 2
            r4 = r4[r8]
            r3.add(r4)
            java.util.List<android.graphics.PointF> r3 = r10.f117979P
            r4 = r5[r2]
            r8 = 3
            r4 = r4[r8]
            r3.add(r4)
            int r2 = r2 + 1
            goto L_0x024c
        L_0x02e7:
            r2 = r0
        L_0x02e8:
            if (r2 < 0) goto L_0x0358
            r3 = r5[r2]
            r4 = 0
            r3 = r3[r4]
            float r3 = r3.x
            r4 = r5[r2]
            r8 = 1
            r4 = r4[r8]
            float r4 = r4.x
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x030f
            android.graphics.Path r3 = r10.f117972I
            r4 = r5[r2]
            r8 = 3
            r4 = r4[r8]
            float r4 = r4.x
            r9 = r5[r2]
            r9 = r9[r8]
            float r9 = r9.y
            r3.lineTo(r4, r9)
            goto L_0x0310
        L_0x030f:
            r8 = 3
        L_0x0310:
            android.graphics.Path r3 = r10.f117972I
            r4 = r5[r2]
            r4 = r4[r8]
            float r4 = r4.x
            r9 = r5[r2]
            r9 = r9[r8]
            float r8 = r9.y
            r3.lineTo(r4, r8)
            r3 = r5[r2]
            r4 = 0
            r3 = r3[r4]
            float r3 = r3.x
            r8 = r5[r2]
            r9 = 1
            r8 = r8[r9]
            float r8 = r8.x
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0344
            android.graphics.Path r3 = r10.f117972I
            r8 = r5[r2]
            r8 = r8[r4]
            float r8 = r8.x
            r9 = r5[r2]
            r9 = r9[r4]
            float r9 = r9.y
            r3.lineTo(r8, r9)
        L_0x0344:
            android.graphics.Path r3 = r10.f117972I
            r8 = r5[r2]
            r8 = r8[r4]
            float r8 = r8.x
            r9 = r5[r2]
            r9 = r9[r4]
            float r9 = r9.y
            r3.lineTo(r8, r9)
            int r2 = r2 + -1
            goto L_0x02e8
        L_0x0358:
            r4 = 0
            android.graphics.Path r2 = r10.f117972I
            r3 = r5[r4]
            r8 = 1
            r3 = r3[r8]
            float r3 = r3.x
            r9 = r5[r4]
            r9 = r9[r8]
            float r8 = r9.y
            r2.lineTo(r3, r8)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.text.TextPaint r3 = r10.f117969F
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r8 = r10.f118007v
            r8 = r8[r4]
            java.lang.String r8 = r8.getStr()
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString[] r9 = r10.f118007v
            r9 = r9[r4]
            java.lang.String r9 = r9.getStr()
            int r9 = r9.length()
            r3.getTextBounds(r8, r4, r9, r2)
            int r2 = r6 >> 1
            r3 = 1
            if (r7 != r3) goto L_0x03ad
            android.graphics.RectF r3 = new android.graphics.RectF
            int r8 = r10.f118009x
            float r8 = (float) r8
            float r8 = r1 - r8
            r9 = r5[r4]
            r9 = r9[r4]
            float r4 = r9.y
            float r9 = (float) r6
            float r9 = r9 + r1
            int r12 = r10.f118009x
            float r12 = (float) r12
            float r9 = r9 + r12
            r12 = r5[r0]
            r13 = 2
            r12 = r12[r13]
            float r12 = r12.y
            r3.<init>(r8, r4, r9, r12)
            r10.f117987b = r3
        L_0x03ad:
            r3 = 3
            if (r7 != r3) goto L_0x03d1
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = (float) r6
            float r4 = r1 - r4
            int r6 = r10.f118009x
            float r6 = (float) r6
            float r4 = r4 - r6
            r6 = 0
            r8 = r5[r6]
            r8 = r8[r6]
            float r6 = r8.y
            int r8 = r10.f118009x
            float r8 = (float) r8
            float r8 = r8 + r1
            r9 = r5[r0]
            r12 = 2
            r9 = r9[r12]
            float r9 = r9.y
            r3.<init>(r4, r6, r8, r9)
            r10.f117987b = r3
            goto L_0x03d2
        L_0x03d1:
            r12 = 2
        L_0x03d2:
            if (r7 != r12) goto L_0x03f5
            android.graphics.RectF r3 = new android.graphics.RectF
            float r2 = (float) r2
            float r4 = r1 - r2
            int r6 = r10.f118009x
            float r6 = (float) r6
            float r4 = r4 - r6
            r6 = 0
            r8 = r5[r6]
            r8 = r8[r6]
            float r6 = r8.y
            float r1 = r1 + r2
            int r2 = r10.f118009x
            float r2 = (float) r2
            float r1 = r1 + r2
            r0 = r5[r0]
            r2 = 2
            r0 = r0[r2]
            float r0 = r0.y
            r3.<init>(r4, r6, r1, r0)
            r10.f117987b = r3
        L_0x03f5:
            android.graphics.RectF r0 = r10.f117988c
            android.graphics.RectF r1 = r10.f117987b
            r0.set(r1)
            android.graphics.RectF r0 = r10.f117988c
            android.graphics.RectF r1 = r10.f117988c
            float r1 = r1.left
            int r2 = r10.f117965B
            float r2 = (float) r2
            float r1 = r1 - r2
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.top
            int r3 = r10.f117965B
            float r3 = (float) r3
            float r2 = r2 - r3
            android.graphics.RectF r3 = r10.f117988c
            float r3 = r3.right
            int r4 = r10.f117965B
            float r4 = (float) r4
            float r3 = r3 + r4
            android.graphics.RectF r4 = r10.f117988c
            float r4 = r4.bottom
            int r5 = r10.f117965B
            float r5 = (float) r5
            float r4 = r4 + r5
            r0.set(r1, r2, r3, r4)
            goto L_0x042c
        L_0x0422:
            r28 = r2
            r26 = r3
            r22 = r6
            r19 = r8
            r18 = r12
        L_0x042c:
            android.graphics.RectF r0 = r10.f117991f
            float r0 = r0.width()
            int r0 = (int) r0
            r9 = 1
            int r0 = r0 >> r9
            android.graphics.RectF r1 = r10.f117991f
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.left
            float r0 = (float) r0
            float r2 = r2 - r0
            android.graphics.RectF r3 = r10.f117988c
            float r3 = r3.top
            float r3 = r3 - r0
            r1.offsetTo(r2, r3)
            android.graphics.RectF r1 = r10.f117992g
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.right
            float r2 = r2 - r0
            android.graphics.RectF r3 = r10.f117988c
            float r3 = r3.bottom
            float r3 = r3 - r0
            r1.offsetTo(r2, r3)
            android.graphics.RectF r1 = r10.f117993h
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.left
            float r2 = r2 - r0
            android.graphics.RectF r3 = r10.f117988c
            float r3 = r3.bottom
            float r3 = r3 - r0
            r1.offsetTo(r2, r3)
            android.graphics.RectF r1 = r10.f117994i
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.right
            float r2 = r2 - r0
            android.graphics.RectF r3 = r10.f117988c
            float r3 = r3.top
            float r3 = r3 - r0
            r1.offsetTo(r2, r3)
            android.graphics.RectF r0 = r10.f117995j
            android.graphics.RectF r1 = r10.f117991f
            r0.set(r1)
            android.graphics.RectF r0 = r10.f117996k
            android.graphics.RectF r1 = r10.f117992g
            r0.set(r1)
            android.graphics.RectF r0 = r10.f117997l
            android.graphics.RectF r1 = r10.f117993h
            r0.set(r1)
            android.graphics.RectF r0 = r10.f117998m
            android.graphics.RectF r1 = r10.f117994i
            r0.set(r1)
            android.graphics.RectF r0 = r10.f117991f
            android.graphics.RectF r1 = r10.f117988c
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.centerY()
            com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95252a(r0, r1, r2, r11)
            android.graphics.RectF r0 = r10.f117992g
            android.graphics.RectF r1 = r10.f117988c
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.centerY()
            com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95252a(r0, r1, r2, r11)
            android.graphics.RectF r0 = r10.f117993h
            android.graphics.RectF r1 = r10.f117988c
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.centerY()
            com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95252a(r0, r1, r2, r11)
            android.graphics.RectF r0 = r10.f117994i
            android.graphics.RectF r1 = r10.f117988c
            float r1 = r1.centerX()
            android.graphics.RectF r2 = r10.f117988c
            float r2 = r2.centerY()
            com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a.m95252a(r0, r1, r2, r11)
            if (r28 == 0) goto L_0x0540
            r36.save()
            android.graphics.RectF r0 = r10.f117988c
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r10.f117988c
            float r1 = r1.centerY()
            r12 = r36
            r12.rotate(r11, r0, r1)
            boolean r0 = r10.f117971H
            if (r0 == 0) goto L_0x0500
            android.graphics.Paint r0 = r10.f117970G
            r1 = -1
            r0.setColor(r1)
            android.graphics.RectF r0 = r10.f117988c
            int r1 = r10.f117967D
            float r1 = (float) r1
            int r2 = r10.f117967D
            float r2 = (float) r2
            android.graphics.Paint r3 = r10.f117970G
            r12.drawRoundRect(r0, r1, r2, r3)
            goto L_0x053c
        L_0x0500:
            android.graphics.Paint r0 = r10.f117970G
            r1 = -2130706433(0xffffffff80ffffff, float:-2.3509886E-38)
            r0.setColor(r1)
            android.graphics.RectF r0 = r10.f117988c
            int r1 = r10.f117967D
            float r1 = (float) r1
            int r2 = r10.f117967D
            float r2 = (float) r2
            android.graphics.Paint r3 = r10.f117970G
            r12.drawRoundRect(r0, r1, r2, r3)
            android.graphics.Bitmap r0 = r10.f117999n
            android.graphics.Rect r1 = r10.f117989d
            android.graphics.RectF r2 = r10.f117995j
            r3 = 0
            r12.drawBitmap(r0, r1, r2, r3)
            android.graphics.Bitmap r0 = r10.f118000o
            android.graphics.Rect r1 = r10.f117989d
            android.graphics.RectF r2 = r10.f117996k
            r12.drawBitmap(r0, r1, r2, r3)
            android.graphics.Bitmap r0 = r10.f118001p
            android.graphics.Rect r1 = r10.f117989d
            android.graphics.RectF r2 = r10.f117997l
            r12.drawBitmap(r0, r1, r2, r3)
            if (r26 == 0) goto L_0x053c
            android.graphics.Bitmap r0 = r10.f118002q
            android.graphics.Rect r1 = r10.f117989d
            android.graphics.RectF r2 = r10.f117998m
            r12.drawBitmap(r0, r1, r2, r3)
        L_0x053c:
            r36.restore()
            goto L_0x0542
        L_0x0540:
            r12 = r36
        L_0x0542:
            float r3 = r10.f117974K
            float r4 = r10.f117975L
            r1 = r10
            r2 = r36
            r5 = r11
            r6 = r22
            r8 = r19
            r1.mo93866a(r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r10.f117976M
            if (r0 != 0) goto L_0x057a
            if (r18 == 0) goto L_0x057a
            r36.save()
            android.graphics.RectF r0 = r10.f117988c
            float r0 = r0.centerX()
            android.graphics.RectF r1 = r10.f117988c
            float r1 = r1.centerY()
            r12.rotate(r11, r0, r1)
            android.graphics.Paint r0 = r10.f118004s
            int r1 = r10.f118005t
            r0.setColor(r1)
            android.graphics.Path r0 = r10.f117972I
            android.graphics.Paint r1 = r10.f118004s
            r12.drawPath(r0, r1)
            r36.restore()
        L_0x057a:
            r0 = r35
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b r1 = r0.f118086i
            float r2 = r0.f118081d
            float r3 = r0.f118080c
            float r4 = r0.f118078a
            float r5 = r0.f118079b
            boolean r6 = r1.f118019h
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x06bf
            float r6 = r1.f118022k
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x059d
            float r6 = r1.f118022k
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x059b
        L_0x0599:
            r6 = 1
            goto L_0x05a4
        L_0x059b:
            r6 = 0
            goto L_0x05a4
        L_0x059d:
            float r6 = r1.f118022k
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x059b
            goto L_0x0599
        L_0x05a4:
            float r8 = r1.f118023l
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x05b4
            float r8 = r1.f118023l
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x05b2
        L_0x05b0:
            r8 = 1
            goto L_0x05bb
        L_0x05b2:
            r8 = 0
            goto L_0x05bb
        L_0x05b4:
            float r8 = r1.f118023l
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x05b2
            goto L_0x05b0
        L_0x05bb:
            if (r6 == 0) goto L_0x05cd
            if (r8 == 0) goto L_0x05cd
            float r6 = r1.f118020i
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x05cd
            float r6 = r1.f118021j
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x05cd
            r6 = 1
            goto L_0x05ce
        L_0x05cd:
            r6 = 0
        L_0x05ce:
            if (r6 == 0) goto L_0x05f3
            r6 = 0
            r1.f118019h = r6
            r1.f118018g = r6
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            float r3 = r1.f118023l
            r2.mo93892b(r3)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            float r3 = r1.f118022k
            r2.mo93886a(r3, r6)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            float r3 = r1.f118020i
            r2.setCenterX(r3)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            float r3 = r1.f118021j
            r2.setCenterY(r3)
            goto L_0x06ba
        L_0x05f3:
            float r6 = r1.f118023l
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x060a
            float r6 = r1.f118012a
            float r2 = r2 - r6
            float r6 = r1.f118023l
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0604
            float r2 = r1.f118023l
        L_0x0604:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r6 = r1.f118025n
            r6.mo93892b(r2)
            goto L_0x061a
        L_0x060a:
            float r6 = r1.f118012a
            float r2 = r2 + r6
            float r6 = r1.f118023l
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0615
            float r2 = r1.f118023l
        L_0x0615:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r6 = r1.f118025n
            r6.mo93892b(r2)
        L_0x061a:
            float r2 = r1.f118022k
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0639
            float r2 = r1.f118022k
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0650
            float r2 = r1.f118013b
            float r3 = r3 - r2
            float r2 = r1.f118022k
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0632
            float r3 = r1.f118022k
        L_0x0632:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r6 = 0
            r2.mo93886a(r3, r6)
            goto L_0x0650
        L_0x0639:
            float r2 = r1.f118022k
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0650
            float r2 = r1.f118013b
            float r3 = r3 - r2
            float r2 = r1.f118022k
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x064a
            float r3 = r1.f118022k
        L_0x064a:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r6 = 0
            r2.mo93886a(r3, r6)
        L_0x0650:
            float r2 = r1.f118020i
            float r3 = r1.f118016e
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x066f
            float r2 = r1.f118020i
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0685
            float r2 = r1.f118014c
            float r4 = r4 - r2
            float r2 = r1.f118020i
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0669
            float r4 = r1.f118020i
        L_0x0669:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterX(r4)
            goto L_0x0685
        L_0x066f:
            float r2 = r1.f118020i
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0685
            float r2 = r1.f118014c
            float r4 = r4 - r2
            float r2 = r1.f118020i
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0680
            float r4 = r1.f118020i
        L_0x0680:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterX(r4)
        L_0x0685:
            float r2 = r1.f118021j
            float r3 = r1.f118017f
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x06a4
            float r2 = r1.f118021j
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x06ba
            float r2 = r1.f118015d
            float r5 = r5 - r2
            float r2 = r1.f118021j
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x069e
            float r5 = r1.f118021j
        L_0x069e:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterY(r5)
            goto L_0x06ba
        L_0x06a4:
            float r2 = r1.f118021j
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x06ba
            float r2 = r1.f118015d
            float r5 = r5 - r2
            float r2 = r1.f118021j
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x06b5
            float r5 = r1.f118021j
        L_0x06b5:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterY(r5)
        L_0x06ba:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r1 = r1.f118025n
            r1.invalidate()
        L_0x06bf:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.b r1 = r0.f118086i
            float r2 = r0.f118081d
            float r3 = r0.f118080c
            float r4 = r0.f118078a
            float r5 = r0.f118079b
            boolean r6 = r1.f118018g
            if (r6 == 0) goto L_0x07e0
            float r6 = r1.f118022k
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x06eb
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x06e9
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x06e9
            float r6 = r1.f118016e
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x06e9
            float r6 = r1.f118017f
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x06e9
            goto L_0x0700
        L_0x06e9:
            r9 = 0
            goto L_0x0700
        L_0x06eb:
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x06e9
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x06e9
            float r6 = r1.f118016e
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x06e9
            float r6 = r1.f118017f
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x06e9
        L_0x0700:
            if (r9 == 0) goto L_0x0722
            r6 = 0
            r1.f118018g = r6
            r1.f118019h = r6
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.mo93892b(r7)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r3 = 0
            r2.mo93886a(r3, r6)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            float r3 = r1.f118016e
            r2.setCenterX(r3)
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            float r3 = r1.f118017f
            r2.setCenterY(r3)
            goto L_0x07db
        L_0x0722:
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0735
            float r6 = r1.f118012a
            float r2 = r2 - r6
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x072f
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x072f:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r6 = r1.f118025n
            r6.mo93892b(r2)
            goto L_0x0743
        L_0x0735:
            float r6 = r1.f118012a
            float r2 = r2 + r6
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x073e
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x073e:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r6 = r1.f118025n
            r6.mo93892b(r2)
        L_0x0743:
            float r2 = r1.f118022k
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x075e
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0771
            float r2 = r1.f118013b
            float r15 = r3 - r2
            int r2 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0757
            r15 = 0
        L_0x0757:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r3 = 0
            r2.mo93886a(r15, r3)
            goto L_0x0771
        L_0x075e:
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0771
            float r2 = r1.f118013b
            float r15 = r3 - r2
            int r2 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x076b
            r15 = 0
        L_0x076b:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r3 = 0
            r2.mo93886a(r15, r3)
        L_0x0771:
            float r2 = r1.f118020i
            float r3 = r1.f118016e
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0790
            float r2 = r1.f118016e
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x07a6
            float r2 = r1.f118014c
            float r4 = r4 - r2
            float r2 = r1.f118016e
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x078a
            float r4 = r1.f118016e
        L_0x078a:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterX(r4)
            goto L_0x07a6
        L_0x0790:
            float r2 = r1.f118016e
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x07a6
            float r2 = r1.f118014c
            float r4 = r4 - r2
            float r2 = r1.f118016e
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x07a1
            float r4 = r1.f118016e
        L_0x07a1:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterX(r4)
        L_0x07a6:
            float r2 = r1.f118021j
            float r3 = r1.f118017f
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x07c5
            float r2 = r1.f118017f
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x07db
            float r2 = r1.f118015d
            float r5 = r5 - r2
            float r2 = r1.f118017f
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x07bf
            float r5 = r1.f118017f
        L_0x07bf:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterY(r5)
            goto L_0x07db
        L_0x07c5:
            float r2 = r1.f118017f
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x07db
            float r2 = r1.f118015d
            float r5 = r5 - r2
            float r2 = r1.f118017f
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x07d6
            float r5 = r1.f118017f
        L_0x07d6:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r2 = r1.f118025n
            r2.setCenterY(r5)
        L_0x07db:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.l r1 = r1.f118025n
            r1.invalidate()
        L_0x07e0:
            return
        L_0x07e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l.onDraw(android.graphics.Canvas):void");
    }

    /* renamed from: b */
    public final void mo93890b(float f, boolean z) {
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(f);
        }
    }

    /* renamed from: d */
    public final boolean mo93897d(float f, float f2) {
        return m101526a(getTimeRect(), f, f2);
    }

    /* renamed from: e */
    public final boolean mo93899e(float f, float f2) {
        return m101526a(getEditRect(), f, f2);
    }

    /* renamed from: f */
    public final boolean mo93901f(float f, float f2) {
        return m101526a(getDeleteRect(), f, f2);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f118098u) {
            this.f118098u = false;
            this.f118078a = (float) (getMeasuredWidth() / 2);
            this.f118079b = (float) (getMeasuredHeight() / 2);
            this.f118080c = 0.0f;
            this.f118081d = 1.0f;
        }
    }

    /* renamed from: b */
    public final boolean mo93893b(float f, float f2) {
        return m101526a(getHelpRect(), f, f2);
    }

    /* renamed from: c */
    public final boolean mo93895c(float f, float f2) {
        return m101526a(getRotateRect(), f, f2);
    }

    /* renamed from: a */
    public final void mo93886a(float f, boolean z) {
        this.f118080c = f;
        if (this.f118080c > 180.0f) {
            this.f118080c -= 360.0f;
        }
        if (this.f118080c < -180.0f) {
            this.f118080c += 360.0f;
        }
        if (z) {
            this.f118080c = this.f118080c;
        }
    }

    /* renamed from: a */
    public final boolean mo93889a(float f, float f2) {
        return mo93893b(f, f2 - ((float) this.f118085h));
    }

    /* renamed from: a */
    private boolean m101526a(RectF rectF, float f, float f2) {
        return C43454a.m95253b(rectF, f, f2, this.f118080c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo52068a(TextStickerData textStickerData, int i, int i2) {
        this.f118088k = textStickerData;
        if (textStickerData != null) {
            setText(this.f118088k.getTextWrap());
            setFontSize(this.f118088k.getFontSize());
            mo93887a(this.f118088k.getBgMode(), this.f118088k.getColor(), this.f118088k.getAlign(), this.f118088k.getFontType());
            setAnimXY(this.f118088k.getEditCenterPoint());
            m101528i();
            invalidate();
        }
    }

    public C46757l(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z) {
        super(context);
        int i = C46717e.f117849a;
        C46717e.f117849a = i + 1;
        this.f118093p = i;
        this.f118076L = new PointF();
        this.f118067C = safeHandler;
        this.f118083f = z;
        this.f118090m.f112707h = this.f118083f;
        this.f118069E = new C46738a();
        this.f118087j = new C46740c();
        this.f118086i = new C46739b();
        C46738a aVar = this.f118069E;
        aVar.f117986a = context;
        aVar.f117973J = this;
        aVar.f117973J.setLayerType(2, null);
        aVar.f118008w = C9432q.m18669a(context, 28.0f);
        aVar.f118009x = (int) C9432q.m18687b(context, 12.0f);
        aVar.f118010y = (int) C9432q.m18687b(context, 8.0f);
        aVar.f118011z = aVar.f118009x;
        aVar.f117964A = aVar.f118010y;
        aVar.f117965B = (int) C9432q.m18687b(context, 12.0f);
        aVar.f117966C = (int) C9432q.m18687b(context, 14.0f);
        aVar.f117967D = (int) C9432q.m18687b(context, 2.0f);
        aVar.f117968E = (int) C9432q.m18687b(context, 5.0f);
        aVar.f117980Q = C46717e.m101391a(context);
        aVar.f117999n = BitmapFactory.decodeResource(context.getResources(), R.drawable.aea);
        aVar.f118000o = BitmapFactory.decodeResource(context.getResources(), R.drawable.aec);
        aVar.f118001p = BitmapFactory.decodeResource(context.getResources(), R.drawable.a21);
        aVar.f118002q = BitmapFactory.decodeResource(context.getResources(), R.drawable.aef);
        aVar.f118003r = BitmapFactory.decodeResource(context.getResources(), R.drawable.d3g);
        aVar.f117989d.set(0, 0, aVar.f117999n.getWidth(), aVar.f117999n.getHeight());
        aVar.f117990e.set(0, 0, aVar.f118003r.getWidth(), aVar.f118003r.getHeight());
        aVar.f117991f = new RectF(0.0f, 0.0f, (float) (aVar.f117966C << 1), (float) (aVar.f117966C << 1));
        aVar.f117992g = new RectF(0.0f, 0.0f, (float) (aVar.f117966C << 1), (float) (aVar.f117966C << 1));
        aVar.f117993h = new RectF(0.0f, 0.0f, (float) (aVar.f117966C << 1), (float) (aVar.f117966C << 1));
        aVar.f117994i = new RectF(0.0f, 0.0f, (float) (aVar.f117966C << 1), (float) (aVar.f117966C << 1));
        aVar.f117969F.setColor(-1);
        aVar.f117969F.setTypeface(Typeface.DEFAULT_BOLD);
        aVar.f117969F.setTextSize(aVar.f118008w);
        aVar.f117969F.setAntiAlias(true);
        aVar.f117978O = new Paint(aVar.f117969F);
        aVar.f117978O.setColor(-16737912);
        aVar.f117970G.setColor(-2130706433);
        aVar.f117970G.setStyle(Style.STROKE);
        aVar.f117970G.setAntiAlias(true);
        aVar.f117970G.setStrokeWidth(2.0f);
        aVar.f118004s = new Paint();
        aVar.f118004s.setStyle(Style.FILL);
        aVar.f118004s.setAntiAlias(true);
        aVar.f118004s.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        aVar.f118004s.setPathEffect(new CornerPathEffect((float) aVar.f117968E));
        aVar.f117972I = new Path();
        C46740c cVar = this.f118087j;
        SafeHandler safeHandler2 = this.f118067C;
        cVar.f118041p = this;
        cVar.f118040o = safeHandler2;
        this.f118086i.f118025n = this;
        this.f118087j.f118044s = new C46760b();
        this.f118070F = C43303dy.m94971b(context) / 2;
        this.f118071G = C43303dy.m94967a(context) / 2;
        this.f118068D = C43303dy.m94972c(context);
        this.f118072H = (Vibrator) context.getSystemService("vibrator");
        mo52068a(textStickerData, 0, 0);
    }

    /* renamed from: a */
    public final void mo93887a(int i, int i2, int i3, String str) {
        this.f118101x = i;
        this.f118102y = i2;
        this.f118103z = str;
        C46679c.m101291a().f117756d = this.f118103z;
        if (i == 1) {
            setTextColor(i2);
            this.f118082e = false;
        } else if (i == 2) {
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            m101527e(i2);
            this.f118082e = true;
        } else if (i == 3) {
            setTextColor(-1);
            m101527e(TextStickerEditText.m101470a(i2));
            this.f118082e = true;
        }
        this.f118065A = i3;
        invalidate();
    }
}
