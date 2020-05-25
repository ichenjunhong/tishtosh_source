package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.views.MentionTextView */
public class MentionTextView extends ClickSpanWorkaroundTextView {

    /* renamed from: b */
    public boolean f121129b;

    /* renamed from: c */
    public int f121130c = -1;

    /* renamed from: d */
    private C48162f f121131d;

    /* renamed from: e */
    private int f121132e;

    /* renamed from: f */
    private float f121133f;

    /* renamed from: g */
    private int f121134g;

    /* renamed from: h */
    private SpannableString f121135h;

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$a */
    class C48157a extends C48159c {

        /* renamed from: d */
        private C48162f f121137d;

        /* renamed from: e */
        private TextExtraStruct f121138e;

        /* renamed from: f */
        private int f121139f;

        /* renamed from: g */
        private C48161e f121140g;

        /* renamed from: a */
        public final void mo95561a(boolean z) {
            super.mo95561a(z);
        }

        public final void onClick(View view) {
            if (!C32800a.m75679a(view) && this.f121137d != null) {
                this.f121137d.mo51166a(view, this.f121138e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = MentionTextView.this.f121130c;
            if (i == -1) {
                i = this.f121139f;
            }
            if (i == 0) {
                i = textPaint.linkColor;
            }
            if (this.f121146b) {
                i = MentionTextView.m104381a(i, 0.75f);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(MentionTextView.this.f121129b);
        }

        C48157a(MentionTextView mentionTextView, C48162f fVar, TextExtraStruct textExtraStruct, int i) {
            this(fVar, textExtraStruct, i, null);
        }

        C48157a(C48162f fVar, TextExtraStruct textExtraStruct, int i, C48161e eVar) {
            TextPaint textPaint;
            int i2;
            super();
            this.f121137d = fVar;
            this.f121138e = textExtraStruct;
            this.f121139f = i;
            if (MentionTextView.this.f121130c != -1) {
                textPaint = MentionTextView.this.getPaint();
                i2 = MentionTextView.this.f121130c;
            } else {
                textPaint = MentionTextView.this.getPaint();
                if (this.f121139f == 0) {
                    i2 = MentionTextView.this.getPaint().linkColor;
                } else {
                    i2 = this.f121139f;
                }
            }
            textPaint.setColor(i2);
            this.f121140g = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$b */
    class C48158b extends C48159c {

        /* renamed from: d */
        private C48162f f121142d;

        /* renamed from: e */
        private TextExtraStruct f121143e;

        /* renamed from: f */
        private int f121144f;

        /* renamed from: g */
        private boolean f121145g;

        public final void onClick(View view) {
            if (!C32800a.m75679a(view) && this.f121142d != null) {
                this.f121142d.mo51166a(view, this.f121143e);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            int i = this.f121144f;
            if (i == 0) {
                i = textPaint.linkColor;
            }
            if (this.f121146b) {
                i = MentionTextView.m104381a(i, 0.75f);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(MentionTextView.this.f121129b);
            textPaint.setFakeBoldText(this.f121145g);
        }

        C48158b(C48162f fVar, TextExtraStruct textExtraStruct, int i) {
            super();
            this.f121142d = fVar;
            this.f121143e = textExtraStruct;
            this.f121144f = i;
            this.f121145g = textExtraStruct.isBoldText();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$c */
    public abstract class C48159c extends ClickableSpan {

        /* renamed from: b */
        public boolean f121146b;

        public C48159c() {
        }

        /* renamed from: a */
        public void mo95561a(boolean z) {
            this.f121146b = z;
            MentionTextView.this.invalidate();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$d */
    public interface C48160d {
        /* renamed from: a */
        boolean mo91837a(TextExtraStruct textExtraStruct);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$e */
    public interface C48161e {
    }

    /* renamed from: com.ss.android.ugc.aweme.views.MentionTextView$f */
    public interface C48162f {
        /* renamed from: a */
        void mo51166a(View view, TextExtraStruct textExtraStruct);
    }

    public int getSpanColor() {
        return this.f121134g;
    }

    public float getSpanSize() {
        return this.f121133f;
    }

    public int getSpanStyle() {
        return this.f121132e;
    }

    /* renamed from: a */
    private void m104382a() {
        this.f121129b = false;
        this.f121132e = 0;
        this.f121133f = getTextSize();
        this.f121134g = getCurrentTextColor();
        setHighlightColor(0);
    }

    public void setOnSpanClickListener(C48162f fVar) {
        this.f121131d = fVar;
    }

    public void setShowUnderline(boolean z) {
        this.f121129b = z;
    }

    public void setSpanColor(int i) {
        this.f121130c = i;
    }

    public void setSpanSize(float f) {
        this.f121133f = f;
    }

    public void setSpanStyle(int i) {
        this.f121132e = i;
    }

    public MentionTextView(Context context) {
        super(context);
        m104382a();
    }

    public void setMaxSize(int i) {
        setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    public MentionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m104382a();
    }

    /* renamed from: a */
    public static int m104381a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * 0.75f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public final void mo95551a(List<TextExtraStruct> list, C48160d dVar) {
        int i;
        int i2;
        if (list != null && !list.isEmpty()) {
            SpannableString spannableString = new SpannableString(getText());
            if (!TextUtils.isEmpty(spannableString.toString())) {
                int length = spannableString.length();
                for (TextExtraStruct textExtraStruct : list) {
                    dVar.mo91837a(textExtraStruct);
                    if (textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() >= 0) {
                        if (textExtraStruct.getStart() < 0) {
                            i = 0;
                        } else {
                            i = textExtraStruct.getStart();
                        }
                        if (textExtraStruct.getEnd() > length) {
                            i2 = length;
                        } else {
                            i2 = textExtraStruct.getEnd();
                        }
                        if (i2 > i) {
                            if (textExtraStruct.getType() == 65281) {
                                spannableString.setSpan(textExtraStruct.getCustomSpan(), i, i2, 33);
                            } else if (textExtraStruct.getType() == 65282) {
                                spannableString.setSpan(new C48158b(this.f121131d, textExtraStruct, textExtraStruct.getColor()), i, i2, 33);
                            } else if (textExtraStruct.getType() == 65285) {
                                Object customSpan = textExtraStruct.getCustomSpan();
                                int i3 = i + 1;
                                if (i3 > i2) {
                                    i3 = i2;
                                }
                                spannableString.setSpan(customSpan, i, i3, 33);
                                spannableString.setSpan(new StyleSpan(this.f121132e), i, i2, 33);
                                if (customSpan instanceof C48161e) {
                                    C48157a aVar = new C48157a(this.f121131d, textExtraStruct, this.f121134g, (C48161e) customSpan);
                                    spannableString.setSpan(aVar, i, i2, 33);
                                }
                            } else {
                                if (textExtraStruct.getType() == 2) {
                                    this.f121134g = getResources().getColor(R.color.a1k);
                                } else if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1) {
                                    this.f121134g = getResources().getColor(R.color.a36);
                                } else if (textExtraStruct.getType() == 3) {
                                    this.f121134g = getResources().getColor(R.color.a1k);
                                }
                                spannableString.setSpan(new C48157a(this, this.f121131d, textExtraStruct, this.f121134g), i, i2, 33);
                                if (textExtraStruct.getType() == 3) {
                                    spannableString.setSpan(new StyleSpan(1), i, i2, 33);
                                } else {
                                    spannableString.setSpan(new StyleSpan(this.f121132e), i, i2, 33);
                                }
                                spannableString.setSpan(new AbsoluteSizeSpan((int) this.f121133f), i, i2, 33);
                            }
                        }
                    }
                }
                this.f121135h = spannableString;
                setText(spannableString);
            }
        }
    }

    public MentionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m104382a();
    }

    /* renamed from: a */
    public final void mo95550a(int i, int i2, Object obj) {
        if (this.f121135h != null) {
            int length = this.f121135h.length();
            if (i <= length && i2 <= length && i <= i2) {
                this.f121135h.setSpan(obj, i, i2, 33);
                setText(this.f121135h);
            }
        }
    }
}
