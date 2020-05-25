package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.n */
final class C1493n {

    /* renamed from: c */
    private static final RectF f5381c = new RectF();

    /* renamed from: d */
    private static ConcurrentHashMap<String, Method> f5382d = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f5383a;

    /* renamed from: b */
    public int[] f5384b = new int[0];

    /* renamed from: e */
    private boolean f5385e;

    /* renamed from: f */
    private float f5386f = -1.0f;

    /* renamed from: g */
    private float f5387g = -1.0f;

    /* renamed from: h */
    private float f5388h = -1.0f;

    /* renamed from: i */
    private boolean f5389i;

    /* renamed from: j */
    private TextPaint f5390j;

    /* renamed from: k */
    private final TextView f5391k;

    /* renamed from: l */
    private final Context f5392l;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5808a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f5392l.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.bn, R.attr.bo, R.attr.bp, R.attr.bq, R.attr.br, R.attr.ls, R.attr.m2, R.attr.q3, R.attr.sg, R.attr.a5j}, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f5383a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3)) {
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m5267a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m5273i()) {
            this.f5383a = 0;
        } else if (this.f5383a == 1) {
            if (!this.f5389i) {
                DisplayMetrics displayMetrics = this.f5392l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m5266a(dimension2, dimension3, dimension);
            }
            m5271g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5805a(int i) {
        if (m5273i()) {
            switch (i) {
                case 0:
                    m5272h();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f5392l.getResources().getDisplayMetrics();
                    m5266a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m5271g()) {
                        mo5812d();
                        return;
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5807a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m5273i()) {
            DisplayMetrics displayMetrics = this.f5392l.getResources().getDisplayMetrics();
            m5266a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m5271g()) {
                mo5812d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5809a(int[] iArr, int i) throws IllegalArgumentException {
        if (m5273i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f5392l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f5384b = m5269a(iArr2);
                if (!m5270f()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f5389i = false;
            }
            if (m5271g()) {
                mo5812d();
            }
        }
    }

    /* renamed from: a */
    private static int[] m5269a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5806a(int i, float f) {
        Resources resources;
        if (this.f5392l == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.f5392l.getResources();
        }
        m5265a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private boolean m5268a(int i, RectF rectF) {
        StaticLayout staticLayout;
        CharSequence text = this.f5391k.getText();
        TransformationMethod transformationMethod = this.f5391k.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f5391k);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f5391k.getMaxLines() : -1;
        if (this.f5390j == null) {
            this.f5390j = new TextPaint();
        } else {
            this.f5390j.reset();
        }
        this.f5390j.set(this.f5391k.getPaint());
        this.f5390j.setTextSize((float) i);
        Alignment alignment = (Alignment) m5263a((Object) this.f5391k, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL);
        if (VERSION.SDK_INT >= 23) {
            staticLayout = m5262a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayout = m5261a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo5804a() {
        return Math.round(this.f5386f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo5810b() {
        return Math.round(this.f5387g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo5811c() {
        return Math.round(this.f5388h);
    }

    /* renamed from: i */
    private boolean m5273i() {
        if (!(this.f5391k instanceof AppCompatEditText)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo5813e() {
        if (!m5273i() || this.f5383a == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m5272h() {
        this.f5383a = 0;
        this.f5387g = -1.0f;
        this.f5388h = -1.0f;
        this.f5386f = -1.0f;
        this.f5384b = new int[0];
        this.f5385e = false;
    }

    /* renamed from: f */
    private boolean m5270f() {
        boolean z;
        int length = this.f5384b.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f5389i = z;
        if (this.f5389i) {
            this.f5383a = 1;
            this.f5387g = (float) this.f5384b[0];
            this.f5388h = (float) this.f5384b[length - 1];
            this.f5386f = -1.0f;
        }
        return this.f5389i;
    }

    /* renamed from: g */
    private boolean m5271g() {
        if (!m5273i() || this.f5383a != 1) {
            this.f5385e = false;
        } else {
            if (!this.f5389i || this.f5384b.length == 0) {
                float round = (float) Math.round(this.f5387g);
                int i = 1;
                while (Math.round(this.f5386f + round) <= Math.round(this.f5388h)) {
                    i++;
                    round += this.f5386f;
                }
                int[] iArr = new int[i];
                float f = this.f5387g;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f5386f;
                }
                this.f5384b = m5269a(iArr);
            }
            this.f5385e = true;
        }
        return this.f5385e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo5812d() {
        int i;
        if (mo5813e()) {
            if (this.f5385e) {
                if (this.f5391k.getMeasuredHeight() > 0 && this.f5391k.getMeasuredWidth() > 0) {
                    if (((Boolean) m5263a((Object) this.f5391k, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue()) {
                        i = 1048576;
                    } else {
                        i = (this.f5391k.getMeasuredWidth() - this.f5391k.getTotalPaddingLeft()) - this.f5391k.getTotalPaddingRight();
                    }
                    int height = (this.f5391k.getHeight() - this.f5391k.getCompoundPaddingBottom()) - this.f5391k.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f5381c) {
                            f5381c.setEmpty();
                            f5381c.right = (float) i;
                            f5381c.bottom = (float) height;
                            float a = (float) m5260a(f5381c);
                            if (a != this.f5391k.getTextSize()) {
                                mo5806a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f5385e = true;
        }
    }

    C1493n(TextView textView) {
        this.f5391k = textView;
        this.f5392l = this.f5391k.getContext();
    }

    /* renamed from: a */
    private void m5267a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f5384b = m5269a(iArr);
            m5270f();
        }
    }

    /* renamed from: a */
    private int m5260a(RectF rectF) {
        int length = this.f5384b.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m5268a(this.f5384b[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f5384b[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private static Method m5264a(String str) {
        try {
            Method method = (Method) f5382d.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f5382d.put(str, method);
                }
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m5265a(float f) {
        boolean z;
        if (f != this.f5391k.getPaint().getTextSize()) {
            this.f5391k.getPaint().setTextSize(f);
            if (VERSION.SDK_INT >= 18) {
                z = this.f5391k.isInLayout();
            } else {
                z = false;
            }
            if (this.f5391k.getLayout() != null) {
                this.f5385e = false;
                try {
                    Method a = m5264a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f5391k, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!z) {
                    this.f5391k.requestLayout();
                } else {
                    this.f5391k.forceLayout();
                }
                this.f5391k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private <T> T m5263a(Object obj, String str, T t) {
        try {
            return m5264a(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return t;
        }
    }

    /* renamed from: a */
    private StaticLayout m5261a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (VERSION.SDK_INT >= 16) {
            floatValue = this.f5391k.getLineSpacingMultiplier();
            floatValue2 = this.f5391k.getLineSpacingExtra();
            booleanValue = this.f5391k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m5263a((Object) this.f5391k, "getLineSpacingMultiplier", (T) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m5263a((Object) this.f5391k, "getLineSpacingExtra", (T) Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m5263a((Object) this.f5391k, "getIncludeFontPadding", (T) Boolean.valueOf(true))).booleanValue();
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f5390j, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private void m5266a(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f5383a = 1;
            this.f5387g = f;
            this.f5388h = f2;
            this.f5386f = f3;
            this.f5389i = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    private StaticLayout m5262a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m5263a((Object) this.f5391k, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.f5390j, i).setAlignment(alignment).setLineSpacing(this.f5391k.getLineSpacingExtra(), this.f5391k.getLineSpacingMultiplier()).setIncludePad(this.f5391k.getIncludeFontPadding()).setBreakStrategy(this.f5391k.getBreakStrategy()).setHyphenationFrequency(this.f5391k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }
}
