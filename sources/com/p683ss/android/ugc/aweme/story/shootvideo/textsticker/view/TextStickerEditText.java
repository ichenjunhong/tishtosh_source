package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerEditText */
public class TextStickerEditText extends AppCompatEditText {

    /* renamed from: a */
    private int f117904a;

    /* renamed from: b */
    private int f117905b;

    /* renamed from: c */
    private int f117906c;

    /* renamed from: d */
    protected int f117907d;

    /* renamed from: e */
    protected Paint f117908e;

    /* renamed from: f */
    protected Path f117909f;

    /* renamed from: g */
    protected int f117910g;

    /* renamed from: h */
    protected int f117911h;

    /* renamed from: i */
    public List<InteractTextStructWrap> f117912i;

    /* renamed from: j */
    public boolean f117913j;

    /* renamed from: k */
    private int f117914k;

    /* renamed from: l */
    private boolean f117915l;

    /* renamed from: m */
    private int f117916m;

    /* renamed from: n */
    private int f117917n;

    /* renamed from: o */
    private float f117918o;

    /* renamed from: p */
    private float f117919p;

    public int getAlign() {
        return this.f117905b;
    }

    public int getBgColor() {
        return this.f117917n;
    }

    public int getBgColorMode() {
        return this.f117916m;
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    public List<InteractTextStructWrap> getTextStructWrapList() {
        return this.f117912i;
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String obj = getText().toString();
        String[] strArr = new String[getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = obj.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public void setMode(int i) {
        this.f117904a = i;
    }

    public void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.f117912i = list;
    }

    public TextStickerEditText(Context context) {
        this(context, null);
    }

    private void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    /* renamed from: a */
    public static int m101470a(int i) {
        return Color.argb(153, (16711680 & i) >> 16, (65280 & i) >> 8, i & NormalGiftView.ALPHA_255);
    }

    public void setAligin(int i) {
        this.f117905b = i;
        if (this.f117905b == 1) {
            setGravity(3);
        } else if (this.f117905b == 2) {
            setGravity(17);
        } else {
            if (this.f117905b == 3) {
                setGravity(5);
            }
        }
    }

    public void setFontType(Typeface typeface) {
        boolean z;
        if (getTypeface() != typeface) {
            setTypeface(typeface);
        }
        C46679c a = C46679c.m101291a();
        int scene = getScene();
        if (a.mo93636d(scene) != null) {
            z = a.mo93636d(scene).mo93619a();
        } else {
            z = false;
        }
        this.f117915l = z;
        if (this.f117915l) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    public void setFontSize(int i) {
        float f = (float) i;
        float f2 = f / 28.0f;
        this.f117907d = (int) (C9432q.m18687b(getContext(), 6.0f) * f2);
        this.f117911h = (int) (C9432q.m18687b(getContext(), 5.0f) * f2);
        this.f117908e.setPathEffect(new CornerPathEffect((float) this.f117911h));
        setLineSpacing((float) this.f117907d, getLineSpacingMultiplier());
        setTextSize(f);
        setPadding(0, this.f117907d * 2, 0, this.f117907d * 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo90951a(Context context) {
        this.f117907d = (int) C9432q.m18687b(context, 6.0f);
        this.f117911h = (int) C9432q.m18687b(context, 5.0f);
        this.f117919p = C46717e.m101391a(context);
        this.f117908e = new Paint();
        this.f117908e.setColor(this.f117910g);
        this.f117908e.setStyle(Style.FILL);
        this.f117908e.setAntiAlias(true);
        this.f117908e.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f117908e.setPathEffect(new CornerPathEffect((float) this.f117911h));
        this.f117909f = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f117907d, getLineSpacingMultiplier());
        addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C52847n nVar;
                Object obj;
                String str;
                boolean z;
                if (TextStickerEditText.this.f117913j) {
                    TextStickerEditText.this.f117913j = false;
                    return;
                }
                int i4 = i3 - i2;
                if (i4 < 0) {
                    List<InteractTextStructWrap> list = TextStickerEditText.this.f117912i;
                    String charSequence2 = charSequence.toString();
                    if (list == null) {
                        nVar = new C52847n(null, Integer.valueOf(0));
                    } else if (charSequence2 == null) {
                        nVar = new C52847n(null, Integer.valueOf(0));
                    } else if (i < 0 || i >= charSequence2.length()) {
                        nVar = new C52847n(null, Integer.valueOf(0));
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) obj;
                            if (i <= interactTextStructWrap.getRange().getStart() || i >= interactTextStructWrap.getRange().getEnd()) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        InteractTextStructWrap interactTextStructWrap2 = (InteractTextStructWrap) obj;
                        if (interactTextStructWrap2 == null || !interactTextStructWrap2.getRange().isValid(charSequence2.length())) {
                            nVar = new C52847n(null, Integer.valueOf(0));
                        } else {
                            if (interactTextStructWrap2.getRange().getStart() == 0 && interactTextStructWrap2.getRange().getEnd() == charSequence2.length()) {
                                str = "";
                            } else if (interactTextStructWrap2.getRange().getStart() == 0) {
                                str = charSequence2.substring(interactTextStructWrap2.getRange().getEnd(), charSequence2.length());
                                C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else if (interactTextStructWrap2.getRange().getEnd() == charSequence2.length()) {
                                str = charSequence2.substring(0, interactTextStructWrap2.getRange().getStart());
                                C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else {
                                StringBuilder sb = new StringBuilder();
                                String substring = charSequence2.substring(0, interactTextStructWrap2.getRange().getStart());
                                C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                sb.append(substring);
                                String substring2 = charSequence2.substring(interactTextStructWrap2.getRange().getEnd(), charSequence2.length());
                                C52711k.m112236a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                sb.append(substring2);
                                str = sb.toString();
                            }
                            C46717e.m101397a(list, interactTextStructWrap2);
                            nVar = new C52847n(str, Integer.valueOf(interactTextStructWrap2.getRange().getStart()));
                        }
                    }
                    if (nVar.getFirst() != null) {
                        TextStickerEditText.this.mo93819a((String) nVar.getFirst(), ((Integer) nVar.getSecond()).intValue());
                    } else {
                        C46717e.m101396a(TextStickerEditText.this.f117912i, i, i4);
                    }
                } else {
                    C46717e.m101396a(TextStickerEditText.this.f117912i, i, i4);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x017b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f117904a
            r2 = 1
            if (r1 == r2) goto L_0x02c5
            android.text.Editable r1 = r19.getText()
            java.lang.String r1 = r1.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02c5
            android.graphics.Paint r1 = r0.f117908e
            int r3 = r0.f117910g
            r1.setColor(r3)
            java.lang.String[] r1 = r19.getTextStr()
            if (r1 == 0) goto L_0x02c5
            int r3 = r1.length
            if (r3 != 0) goto L_0x0027
            goto L_0x02c5
        L_0x0027:
            int r3 = r1.length
            android.graphics.Point[][] r4 = new android.graphics.Point[r3][]
            android.text.TextPaint r5 = r19.getPaint()
            android.graphics.Paint$FontMetrics r5 = r5.getFontMetrics()
            float r6 = r5.descent
            float r5 = r5.ascent
            float r6 = r6 - r5
            double r5 = (double) r6
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            float r6 = r19.getTextSize()
            int r6 = (int) r6
            r7 = 4
            int r6 = r6 / r7
            int r8 = r0.f117905b
            r9 = 0
            if (r8 != r2) goto L_0x004b
            r0.f117906c = r9
        L_0x004b:
            int r8 = r0.f117905b
            r10 = 3
            if (r8 != r10) goto L_0x0056
            int r8 = r19.getMeasuredWidth()
            r0.f117906c = r8
        L_0x0056:
            int r8 = r0.f117905b
            r11 = 2
            if (r8 != r11) goto L_0x0062
            int r8 = r19.getMeasuredWidth()
            int r8 = r8 / r11
            r0.f117906c = r8
        L_0x0062:
            r8 = -1
            r8 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
        L_0x006c:
            if (r8 >= r3) goto L_0x01b0
            android.text.TextPaint r9 = r19.getPaint()
            r10 = r1[r8]
            float r9 = r9.measureText(r10)
            int r9 = (int) r9
            int r10 = r0.f117906c
            int r18 = r9 / 2
            int r10 = r10 - r18
            int r7 = r0.f117907d
            int r7 = r7 * 2
            int r10 = r10 - r7
            int r7 = r0.f117906c
            int r7 = r7 + r18
            int r2 = r0.f117907d
            int r2 = r2 * 2
            int r7 = r7 + r2
            int r2 = r0.f117905b
            r11 = 1
            if (r2 != r11) goto L_0x009e
            int r10 = r0.f117906c
            int r2 = r0.f117906c
            int r2 = r2 + r9
            int r7 = r0.f117907d
            r11 = 4
            int r7 = r7 * 4
            int r7 = r7 + r2
            goto L_0x009f
        L_0x009e:
            r11 = 4
        L_0x009f:
            int r2 = r0.f117905b
            r11 = 3
            if (r2 != r11) goto L_0x00b0
            int r2 = r0.f117906c
            int r2 = r2 - r9
            int r7 = r0.f117907d
            r10 = 4
            int r7 = r7 * 4
            int r10 = r2 - r7
            int r7 = r0.f117906c
        L_0x00b0:
            r2 = r1[r8]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00c4
            r2 = r1[r8]
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00e0
        L_0x00c4:
            int r2 = r19.getMeasuredWidth()
            r7 = 2
            int r2 = r2 / r7
            int r7 = r0.f117905b
            r10 = 1
            if (r7 != r10) goto L_0x00d1
            int r2 = r0.f117907d
        L_0x00d1:
            r10 = r2
            int r2 = r0.f117905b
            r7 = 3
            if (r2 != r7) goto L_0x00df
            int r2 = r19.getMeasuredWidth()
            int r7 = r0.f117907d
            int r10 = r2 - r7
        L_0x00df:
            r7 = r10
        L_0x00e0:
            int r2 = r9 - r12
            int r2 = java.lang.Math.abs(r2)
            if (r2 >= r6) goto L_0x0100
            int r2 = r0.f117905b
            r11 = 1
            if (r2 != r11) goto L_0x00f0
            if (r13 <= 0) goto L_0x0100
            goto L_0x0102
        L_0x00f0:
            int r2 = r0.f117905b
            r11 = 3
            if (r2 != r11) goto L_0x00f8
            if (r14 <= 0) goto L_0x0100
            goto L_0x0102
        L_0x00f8:
            int r2 = r0.f117905b
            r11 = 2
            if (r2 != r11) goto L_0x0100
            if (r14 <= 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r13 = r7
            r14 = r10
        L_0x0102:
            if (r8 != 0) goto L_0x0132
            com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c.m101291a()
            int r2 = r19.getScene()
            java.lang.String[] r7 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c.f117752a
            int r10 = r7.length
            r11 = 0
        L_0x010f:
            if (r11 >= r10) goto L_0x0126
            r12 = r7[r11]
            com.ss.android.ugc.aweme.story.shootvideo.textfont.c r15 = com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c.m101291a()
            java.lang.String r15 = r15.mo93628b(r2)
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0123
            r2 = 1
            goto L_0x0127
        L_0x0123:
            int r11 = r11 + 1
            goto L_0x010f
        L_0x0126:
            r2 = 0
        L_0x0127:
            if (r2 != 0) goto L_0x0130
            int r2 = r0.f117914k
            int r7 = r0.f117907d
            int r15 = r2 - r7
            goto L_0x0132
        L_0x0130:
            int r15 = r0.f117914k
        L_0x0132:
            int r2 = r15 + r5
            r7 = 1
            if (r3 <= r7) goto L_0x015d
            if (r8 <= 0) goto L_0x0148
            android.text.TextPaint r7 = r19.getPaint()
            int r10 = r8 + -1
            r10 = r1[r10]
            float r7 = r7.measureText(r10)
            int r7 = (int) r7
            r16 = r7
        L_0x0148:
            int r7 = r3 + -1
            if (r8 >= r7) goto L_0x015d
            android.text.TextPaint r7 = r19.getPaint()
            int r10 = r8 + 1
            r10 = r1[r10]
            float r7 = r7.measureText(r10)
            int r7 = (int) r7
            r10 = r7
            r7 = r16
            goto L_0x0161
        L_0x015d:
            r7 = r16
            r10 = r17
        L_0x0161:
            if (r7 <= 0) goto L_0x0168
            if (r9 < r7) goto L_0x0168
            int r11 = r0.f117907d
            int r2 = r2 + r11
        L_0x0168:
            if (r10 <= 0) goto L_0x016f
            if (r9 <= r10) goto L_0x016f
            int r11 = r0.f117907d
            int r2 = r2 + r11
        L_0x016f:
            if (r8 != 0) goto L_0x0174
            int r11 = r0.f117907d
            int r15 = r15 - r11
        L_0x0174:
            int r11 = r3 + -1
            if (r8 != r11) goto L_0x017b
            int r11 = r0.f117907d
            int r2 = r2 + r11
        L_0x017b:
            r11 = 4
            android.graphics.Point[] r12 = new android.graphics.Point[r11]
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r14, r15)
            r16 = 0
            r12[r16] = r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r13, r15)
            r15 = 1
            r12[r15] = r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r13, r2)
            r15 = 2
            r12[r15] = r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r14, r2)
            r15 = 3
            r12[r15] = r11
            r4[r8] = r12
            int r8 = r8 + 1
            r15 = r2
            r16 = r7
            r12 = r9
            r17 = r10
            r2 = 1
            r7 = 4
            r9 = 0
            r10 = 3
            r11 = 2
            goto L_0x006c
        L_0x01b0:
            android.graphics.Path r1 = r0.f117909f
            r1.reset()
            r1 = 0
        L_0x01b6:
            if (r1 >= r3) goto L_0x0230
            if (r1 != 0) goto L_0x01ce
            android.graphics.Path r2 = r0.f117909f
            r5 = r4[r1]
            r6 = 0
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r4[r1]
            r7 = r7[r6]
            int r6 = r7.y
            float r6 = (float) r6
            r2.moveTo(r5, r6)
        L_0x01ce:
            android.graphics.Path r2 = r0.f117909f
            r5 = r4[r1]
            r6 = 1
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r4[r1]
            r7 = r7[r6]
            int r7 = r7.y
            float r7 = (float) r7
            r2.lineTo(r5, r7)
            r2 = r4[r1]
            r5 = 0
            r2 = r2[r5]
            int r2 = r2.x
            r5 = r4[r1]
            r5 = r5[r6]
            int r5 = r5.x
            if (r2 != r5) goto L_0x0219
            android.graphics.Path r2 = r0.f117909f
            r5 = r4[r1]
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r4[r1]
            r7 = r7[r6]
            int r6 = r7.y
            float r6 = (float) r6
            r2.lineTo(r5, r6)
            android.graphics.Path r2 = r0.f117909f
            r5 = r4[r1]
            r6 = 2
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r4[r1]
            r7 = r7[r6]
            int r7 = r7.y
            float r7 = (float) r7
            r2.lineTo(r5, r7)
            goto L_0x021a
        L_0x0219:
            r6 = 2
        L_0x021a:
            android.graphics.Path r2 = r0.f117909f
            r5 = r4[r1]
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r4[r1]
            r7 = r7[r6]
            int r7 = r7.y
            float r7 = (float) r7
            r2.lineTo(r5, r7)
            int r1 = r1 + 1
            goto L_0x01b6
        L_0x0230:
            r1 = 1
            int r3 = r3 - r1
        L_0x0232:
            if (r3 < 0) goto L_0x02a6
            r2 = r4[r3]
            r5 = 0
            r2 = r2[r5]
            int r2 = r2.x
            r5 = r4[r3]
            r5 = r5[r1]
            int r1 = r5.x
            if (r2 != r1) goto L_0x0258
            android.graphics.Path r1 = r0.f117909f
            r2 = r4[r3]
            r5 = 3
            r2 = r2[r5]
            int r2 = r2.x
            float r2 = (float) r2
            r6 = r4[r3]
            r6 = r6[r5]
            int r6 = r6.y
            float r6 = (float) r6
            r1.lineTo(r2, r6)
            goto L_0x0259
        L_0x0258:
            r5 = 3
        L_0x0259:
            android.graphics.Path r1 = r0.f117909f
            r2 = r4[r3]
            r2 = r2[r5]
            int r2 = r2.x
            float r2 = (float) r2
            r6 = r4[r3]
            r6 = r6[r5]
            int r6 = r6.y
            float r6 = (float) r6
            r1.lineTo(r2, r6)
            r1 = r4[r3]
            r2 = 0
            r1 = r1[r2]
            int r1 = r1.x
            r6 = r4[r3]
            r7 = 1
            r6 = r6[r7]
            int r6 = r6.x
            if (r1 != r6) goto L_0x028f
            android.graphics.Path r1 = r0.f117909f
            r6 = r4[r3]
            r6 = r6[r2]
            int r6 = r6.x
            float r6 = (float) r6
            r7 = r4[r3]
            r7 = r7[r2]
            int r7 = r7.y
            float r7 = (float) r7
            r1.lineTo(r6, r7)
        L_0x028f:
            android.graphics.Path r1 = r0.f117909f
            r6 = r4[r3]
            r6 = r6[r2]
            int r6 = r6.x
            float r6 = (float) r6
            r7 = r4[r3]
            r7 = r7[r2]
            int r7 = r7.y
            float r7 = (float) r7
            r1.lineTo(r6, r7)
            int r3 = r3 + -1
            r1 = 1
            goto L_0x0232
        L_0x02a6:
            r2 = 0
            android.graphics.Path r1 = r0.f117909f
            r3 = r4[r2]
            r5 = 1
            r3 = r3[r5]
            int r3 = r3.x
            float r3 = (float) r3
            r2 = r4[r2]
            r2 = r2[r5]
            int r2 = r2.y
            float r2 = (float) r2
            r1.lineTo(r3, r2)
            android.graphics.Path r1 = r0.f117909f
            android.graphics.Paint r2 = r0.f117908e
            r3 = r20
            r3.drawPath(r1, r2)
            goto L_0x02c7
        L_0x02c5:
            r3 = r20
        L_0x02c7:
            super.onDraw(r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerEditText.onDraw(android.graphics.Canvas):void");
    }

    public TextStickerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117910g = -1;
        this.f117904a = 1;
        this.f117905b = 2;
        mo90951a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f117906c = getMeasuredWidth() / 2;
        this.f117914k = (getLineHeight() - this.f117907d) / 2;
    }

    /* renamed from: a */
    public void mo90950a(int i, int i2) {
        this.f117916m = i;
        this.f117917n = i2;
        if (this.f117915l) {
            setMaskBlurColor(i2);
            this.f117904a = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        if (i == 1) {
            this.f117904a = 1;
            this.f117910g = i2;
            setBackground(null);
            setTextColor(i2);
        } else if (i == 2) {
            this.f117904a = 2;
            this.f117910g = i2;
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
        } else {
            if (i == 3) {
                this.f117904a = 3;
                this.f117910g = m101470a(i2);
                setTextColor(-1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getText() != null && i == i2 && C46717e.m101401a(this.f117912i, getText().length())) {
            for (InteractTextStructWrap interactTextStructWrap : this.f117912i) {
                if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                    setSelection(interactTextStructWrap.getRange().getEnd());
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo93819a(String str, int i) {
        if (str != null) {
            this.f117913j = true;
            if (!C46717e.m101401a(this.f117912i, str.length())) {
                setText(str);
                setSelection(i);
                return;
            }
            SpannableString spannableString = new SpannableString(str);
            Drawable drawable = getContext().getResources().getDrawable(R.drawable.d3f);
            this.f117918o = C46717e.m101390a(getTextSize());
            drawable.setBounds(new Rect(0, 0, (int) this.f117918o, (int) this.f117918o));
            for (InteractTextStructWrap interactTextStructWrap : this.f117912i) {
                if (interactTextStructWrap.isValid(str.length())) {
                    spannableString.setSpan(new C46763n(drawable, this.f117919p), interactTextStructWrap.getRange().getStart() + 1, interactTextStructWrap.getRange().getStart() + 2, 33);
                    spannableString.setSpan(new UnderlineSpan(), interactTextStructWrap.getRange().getStart() + 2, interactTextStructWrap.getRange().getEnd() - 1, 33);
                }
            }
            setText(spannableString);
            setSelection(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            String obj = getText().toString();
            mo93819a(obj.substring(0, obj.length() - 1), getText().length());
        }
    }
}
