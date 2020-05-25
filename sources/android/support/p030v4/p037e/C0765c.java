package android.support.p030v4.p037e;

import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0793j;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.e.c */
public final class C0765c implements Spannable {

    /* renamed from: c */
    private static final Object f2638c = new Object();

    /* renamed from: d */
    private static Executor f2639d = null;

    /* renamed from: a */
    public final Spannable f2640a;

    /* renamed from: b */
    public final C0766a f2641b;

    /* renamed from: e */
    private final PrecomputedText f2642e;

    /* renamed from: android.support.v4.e.c$a */
    public static final class C0766a {

        /* renamed from: a */
        public final TextPaint f2643a;

        /* renamed from: b */
        public final TextDirectionHeuristic f2644b;

        /* renamed from: c */
        public final int f2645c;

        /* renamed from: d */
        public final int f2646d;

        /* renamed from: e */
        final Params f2647e;

        /* renamed from: android.support.v4.e.c$a$a */
        public static class C0767a {

            /* renamed from: a */
            public final TextPaint f2648a;

            /* renamed from: b */
            public TextDirectionHeuristic f2649b;

            /* renamed from: c */
            public int f2650c;

            /* renamed from: d */
            public int f2651d;

            public C0767a(TextPaint textPaint) {
                this.f2648a = textPaint;
                if (VERSION.SDK_INT >= 23) {
                    this.f2650c = 1;
                    this.f2651d = 1;
                } else {
                    this.f2651d = 0;
                    this.f2650c = 0;
                }
                if (VERSION.SDK_INT >= 18) {
                    this.f2649b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f2649b = null;
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            sb2.append(this.f2643a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder(", textScaleX=");
            sb3.append(this.f2643a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder(", textSkewX=");
            sb4.append(this.f2643a.getTextSkewX());
            sb.append(sb4.toString());
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb5 = new StringBuilder(", letterSpacing=");
                sb5.append(this.f2643a.getLetterSpacing());
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
                sb6.append(this.f2643a.isElegantTextHeight());
                sb.append(sb6.toString());
            }
            if (VERSION.SDK_INT >= 24) {
                StringBuilder sb7 = new StringBuilder(", textLocale=");
                sb7.append(this.f2643a.getTextLocales());
                sb.append(sb7.toString());
            } else if (VERSION.SDK_INT >= 17) {
                StringBuilder sb8 = new StringBuilder(", textLocale=");
                sb8.append(this.f2643a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder(", typeface=");
            sb9.append(this.f2643a.getTypeface());
            sb.append(sb9.toString());
            if (VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder(", variationSettings=");
                sb10.append(this.f2643a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder(", textDir=");
            sb11.append(this.f2644b);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder(", breakStrategy=");
            sb12.append(this.f2645c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder(", hyphenationFrequency=");
            sb13.append(this.f2646d);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }

        public final int hashCode() {
            if (VERSION.SDK_INT >= 24) {
                return C0793j.m2263a(Float.valueOf(this.f2643a.getTextSize()), Float.valueOf(this.f2643a.getTextScaleX()), Float.valueOf(this.f2643a.getTextSkewX()), Float.valueOf(this.f2643a.getLetterSpacing()), Integer.valueOf(this.f2643a.getFlags()), this.f2643a.getTextLocales(), this.f2643a.getTypeface(), Boolean.valueOf(this.f2643a.isElegantTextHeight()), this.f2644b, Integer.valueOf(this.f2645c), Integer.valueOf(this.f2646d));
            } else if (VERSION.SDK_INT >= 21) {
                return C0793j.m2263a(Float.valueOf(this.f2643a.getTextSize()), Float.valueOf(this.f2643a.getTextScaleX()), Float.valueOf(this.f2643a.getTextSkewX()), Float.valueOf(this.f2643a.getLetterSpacing()), Integer.valueOf(this.f2643a.getFlags()), this.f2643a.getTextLocale(), this.f2643a.getTypeface(), Boolean.valueOf(this.f2643a.isElegantTextHeight()), this.f2644b, Integer.valueOf(this.f2645c), Integer.valueOf(this.f2646d));
            } else if (VERSION.SDK_INT >= 18) {
                return C0793j.m2263a(Float.valueOf(this.f2643a.getTextSize()), Float.valueOf(this.f2643a.getTextScaleX()), Float.valueOf(this.f2643a.getTextSkewX()), Integer.valueOf(this.f2643a.getFlags()), this.f2643a.getTextLocale(), this.f2643a.getTypeface(), this.f2644b, Integer.valueOf(this.f2645c), Integer.valueOf(this.f2646d));
            } else if (VERSION.SDK_INT >= 17) {
                return C0793j.m2263a(Float.valueOf(this.f2643a.getTextSize()), Float.valueOf(this.f2643a.getTextScaleX()), Float.valueOf(this.f2643a.getTextSkewX()), Integer.valueOf(this.f2643a.getFlags()), this.f2643a.getTextLocale(), this.f2643a.getTypeface(), this.f2644b, Integer.valueOf(this.f2645c), Integer.valueOf(this.f2646d));
            } else {
                return C0793j.m2263a(Float.valueOf(this.f2643a.getTextSize()), Float.valueOf(this.f2643a.getTextScaleX()), Float.valueOf(this.f2643a.getTextSkewX()), Integer.valueOf(this.f2643a.getFlags()), this.f2643a.getTypeface(), this.f2644b, Integer.valueOf(this.f2645c), Integer.valueOf(this.f2646d));
            }
        }

        public C0766a(Params params) {
            this.f2643a = params.getTextPaint();
            this.f2644b = params.getTextDirection();
            this.f2645c = params.getBreakStrategy();
            this.f2646d = params.getHyphenationFrequency();
            this.f2647e = params;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0766a)) {
                return false;
            }
            C0766a aVar = (C0766a) obj;
            if (this.f2647e != null) {
                return this.f2647e.equals(aVar.f2647e);
            }
            if (VERSION.SDK_INT >= 23 && (this.f2645c != aVar.f2645c || this.f2646d != aVar.f2646d)) {
                return false;
            }
            if ((VERSION.SDK_INT >= 18 && this.f2644b != aVar.f2644b) || this.f2643a.getTextSize() != aVar.f2643a.getTextSize() || this.f2643a.getTextScaleX() != aVar.f2643a.getTextScaleX() || this.f2643a.getTextSkewX() != aVar.f2643a.getTextSkewX()) {
                return false;
            }
            if ((VERSION.SDK_INT >= 21 && (this.f2643a.getLetterSpacing() != aVar.f2643a.getLetterSpacing() || !TextUtils.equals(this.f2643a.getFontFeatureSettings(), aVar.f2643a.getFontFeatureSettings()))) || this.f2643a.getFlags() != aVar.f2643a.getFlags()) {
                return false;
            }
            if (VERSION.SDK_INT >= 24) {
                if (!this.f2643a.getTextLocales().equals(aVar.f2643a.getTextLocales())) {
                    return false;
                }
            } else if (VERSION.SDK_INT >= 17 && !this.f2643a.getTextLocale().equals(aVar.f2643a.getTextLocale())) {
                return false;
            }
            if (this.f2643a.getTypeface() == null) {
                if (aVar.f2643a.getTypeface() != null) {
                    return false;
                }
            } else if (!this.f2643a.getTypeface().equals(aVar.f2643a.getTypeface())) {
                return false;
            }
            return true;
        }

        public C0766a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.f2647e = new Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2647e = null;
            }
            this.f2643a = textPaint;
            this.f2644b = textDirectionHeuristic;
            this.f2645c = i;
            this.f2646d = i2;
        }
    }

    public final int length() {
        return this.f2640a.length();
    }

    public final String toString() {
        return this.f2640a.toString();
    }

    public final char charAt(int i) {
        return this.f2640a.charAt(i);
    }

    public final int getSpanEnd(Object obj) {
        return this.f2640a.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f2640a.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f2640a.getSpanStart(obj);
    }

    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f2642e.removeSpan(obj);
        } else {
            this.f2640a.removeSpan(obj);
        }
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.f2640a.subSequence(i, i2);
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2640a.nextSpanTransition(i, i2, cls);
    }

    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (VERSION.SDK_INT >= 28) {
            return this.f2642e.getSpans(i, i2, cls);
        }
        return this.f2640a.getSpans(i, i2, cls);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (VERSION.SDK_INT >= 28) {
            this.f2642e.setSpan(obj, i, i2, i3);
        } else {
            this.f2640a.setSpan(obj, i, i2, i3);
        }
    }
}
