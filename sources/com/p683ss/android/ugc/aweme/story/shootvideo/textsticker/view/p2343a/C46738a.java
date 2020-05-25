package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2343a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2191c.C43454a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.C46757l;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a */
public final class C46738a {

    /* renamed from: A */
    public int f117964A;

    /* renamed from: B */
    public int f117965B = 20;

    /* renamed from: C */
    public int f117966C = 30;

    /* renamed from: D */
    public int f117967D = 10;

    /* renamed from: E */
    public int f117968E;

    /* renamed from: F */
    public TextPaint f117969F = new TextPaint();

    /* renamed from: G */
    public Paint f117970G = new Paint();

    /* renamed from: H */
    public boolean f117971H = C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStickerFunctionalities);

    /* renamed from: I */
    public Path f117972I;

    /* renamed from: J */
    public C46757l f117973J;

    /* renamed from: K */
    public float f117974K;

    /* renamed from: L */
    public float f117975L;

    /* renamed from: M */
    public boolean f117976M = false;

    /* renamed from: N */
    public float f117977N;

    /* renamed from: O */
    public Paint f117978O;

    /* renamed from: P */
    public List<PointF> f117979P = new ArrayList();

    /* renamed from: Q */
    public float f117980Q;

    /* renamed from: R */
    private RectF f117981R = new RectF();

    /* renamed from: S */
    private RectF f117982S = new RectF();

    /* renamed from: T */
    private Paint f117983T = new Paint(2);

    /* renamed from: U */
    private float f117984U;

    /* renamed from: V */
    private Paint f117985V = new Paint();

    /* renamed from: a */
    public Context f117986a;

    /* renamed from: b */
    public RectF f117987b = new RectF();

    /* renamed from: c */
    public RectF f117988c = new RectF();

    /* renamed from: d */
    public Rect f117989d = new Rect();

    /* renamed from: e */
    public Rect f117990e = new Rect();

    /* renamed from: f */
    public RectF f117991f = new RectF();

    /* renamed from: g */
    public RectF f117992g = new RectF();

    /* renamed from: h */
    public RectF f117993h = new RectF();

    /* renamed from: i */
    public RectF f117994i = new RectF();

    /* renamed from: j */
    public RectF f117995j = new RectF();

    /* renamed from: k */
    public RectF f117996k = new RectF();

    /* renamed from: l */
    public RectF f117997l = new RectF();

    /* renamed from: m */
    public RectF f117998m = new RectF();

    /* renamed from: n */
    public Bitmap f117999n;

    /* renamed from: o */
    public Bitmap f118000o;

    /* renamed from: p */
    public Bitmap f118001p;

    /* renamed from: q */
    public Bitmap f118002q;

    /* renamed from: r */
    public Bitmap f118003r;

    /* renamed from: s */
    public Paint f118004s;

    /* renamed from: t */
    public int f118005t = 0;

    /* renamed from: u */
    public TextStickerTextWrap f118006u;

    /* renamed from: v */
    public TextStickerString[] f118007v;

    /* renamed from: w */
    public float f118008w = 60.0f;

    /* renamed from: x */
    public int f118009x = 20;

    /* renamed from: y */
    public int f118010y = 20;

    /* renamed from: z */
    public int f118011z;

    public C46738a() {
        this.f117985V.setColor(C23723j.m58216a(R.color.a05));
        this.f117985V.setAlpha(76);
    }

    /* renamed from: a */
    private int m101501a(List<InteractTextStructWrap> list, String str) {
        if (!C46717e.m101401a(list, str.length())) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) list.get(i2);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                int start = interactTextStructWrap.getRange().getStart();
                if (start < str.length() && str.charAt(start) == ' ') {
                    start++;
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    i = (int) (((float) (i - C46717e.m101392a(this.f117969F, str, start, start + 1))) + this.f117982S.width() + this.f117980Q);
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m101502a(Canvas canvas, List<InteractTextStructWrap> list, String str, float f, float f2) {
        int i;
        char c;
        Canvas canvas2 = canvas;
        List<InteractTextStructWrap> list2 = list;
        String str2 = str;
        float f3 = f2;
        if (!C46717e.m101401a(list2, str.length())) {
            canvas2.drawText(str2, f, f3, this.f117969F);
            return;
        }
        float f4 = f;
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) list2.get(i2);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                if (i3 < interactTextStructWrap.getRange().getStart()) {
                    canvas.drawText(str, i3, interactTextStructWrap.getRange().getStart(), f4, f2, this.f117969F);
                    f4 += (float) C46717e.m101392a(this.f117969F, str2, i3, interactTextStructWrap.getRange().getStart());
                }
                int start = interactTextStructWrap.getRange().getStart();
                int end = interactTextStructWrap.getRange().getEnd();
                if (start >= str.length() || str2.charAt(start) != ' ') {
                    c = ' ';
                    i = start;
                } else {
                    int i4 = start + 1;
                    i = i4;
                    c = ' ';
                    canvas.drawText(str, start, i4, f4, f2, this.f117969F);
                    f4 += (float) C46717e.m101392a(this.f117969F, str2, start, i);
                }
                if (i < str.length() && str2.charAt(i) == '_') {
                    this.f117982S.offsetTo(f4, ((((((float) this.f117969F.getFontMetricsInt().descent) + f3) + f3) + ((float) this.f117969F.getFontMetricsInt().ascent)) / 2.0f) - (this.f117982S.height() / 2.0f));
                    canvas2.drawBitmap(this.f118003r, this.f117990e, this.f117982S, this.f117983T);
                    f4 += this.f117982S.width() + this.f117980Q;
                    i++;
                }
                if (str2.charAt(end - 1) == c) {
                    end--;
                }
                int i5 = end;
                if (i < i5) {
                    this.f117969F.setUnderlineText(true);
                    canvas.drawText(str, i, i5, f4, f2, this.f117969F);
                    this.f117969F.setUnderlineText(false);
                    f4 += (float) C46717e.m101392a(this.f117969F, str2, i, i5);
                }
                if (i5 < interactTextStructWrap.getRange().getEnd()) {
                    int i6 = i5 + 1;
                    canvas.drawText(str, i5, i6, f4, f2, this.f117969F);
                    f4 += (float) C46717e.m101392a(this.f117969F, str2, i5, i6);
                }
                i3 = interactTextStructWrap.getRange().getEnd();
            }
            i2++;
            list2 = list;
        }
        if (i3 < str.length()) {
            canvas.drawText(str, i3, str.length(), f4, f2, this.f117969F);
        }
    }

    /* renamed from: a */
    public void mo93866a(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2) {
        int i3;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        int i4 = i;
        FontMetrics fontMetrics = this.f117969F.getFontMetrics();
        float f8 = fontMetrics.ascent;
        float f9 = fontMetrics.descent;
        int length = this.f118007v.length;
        float f10 = ((((float) (length - 1)) * (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) - f9;
        canvas.save();
        canvas.rotate(f7, this.f117988c.centerX(), this.f117988c.centerY());
        this.f117984U = C46717e.m101390a(this.f118008w);
        this.f117981R.set(0.0f, 0.0f, this.f117984U, this.f117984U);
        this.f117982S.set(this.f117981R);
        C43454a.m95251a(this.f117982S, f4);
        C43454a.m95252a(this.f117982S, f5, f6, f7);
        int i5 = 0;
        while (i5 < length) {
            float f11 = (((float) (-((length - i5) - 1))) * (f9 - f8)) + f10;
            String str = this.f118007v[i5].getStr();
            List list = (List) this.f118006u.getStrMap().get(this.f118007v[i5]);
            int a = C46717e.m101392a(this.f117969F, str, 0, str.length()) + m101501a(list, str);
            if (i4 == 2) {
                i3 = i5;
                m101502a(canvas, list, str, f5 - ((float) (a / 2)), f11 + f6 + ((float) (this.f118010y * i5)));
            } else {
                i3 = i5;
                if (i4 == 1) {
                    m101502a(canvas, list, str, f, f11 + f6 + ((float) (this.f118010y * i3)));
                } else if (i4 == 3) {
                    m101502a(canvas, list, str, f5 - ((float) a), f11 + f6 + ((float) (this.f118010y * i3)));
                }
            }
            i5 = i3 + 1;
        }
        canvas.restore();
    }
}
