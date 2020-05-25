package com.p683ss.android.ugc.aweme.tools.music.lrc;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.LrcView */
public final class LrcView extends HorizontalScrollView {

    /* renamed from: a */
    private float f119160a;

    /* renamed from: b */
    private float f119161b;

    /* renamed from: c */
    private float f119162c;

    /* renamed from: d */
    private float f119163d;

    /* renamed from: e */
    private List<C47205a> f119164e;

    /* renamed from: f */
    private TextView f119165f;

    /* renamed from: g */
    private final AttributeSet f119166g;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.LrcView$a */
    static final class C47204a<T> implements Comparator<C47205a> {

        /* renamed from: a */
        public static final C47204a f119167a = new C47204a();

        C47204a() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            float f = ((C47205a) obj).f119169a - ((C47205a) obj2).f119169a;
            if (f > 0.0f) {
                return 1;
            }
            if (f < 0.0f) {
                return -1;
            }
            return 0;
        }
    }

    public LrcView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LrcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        return false;
    }

    public final AttributeSet getAttrs() {
        return this.f119166g;
    }

    /* renamed from: a */
    private final void m102462a() {
        boolean z;
        float f;
        Collection collection = this.f119164e;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = 0;
            while (true) {
                List<C47205a> list = this.f119164e;
                if (list == null) {
                    C52711k.m112234a();
                }
                if (i >= list.size() - 1) {
                    break;
                }
                float f2 = this.f119162c;
                List<C47205a> list2 = this.f119164e;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                int i2 = i + 1;
                if (f2 < ((C47205a) list2.get(i2)).f119169a) {
                    break;
                }
                i = i2;
            }
            TextView textView = this.f119165f;
            if (textView == null) {
                C52711k.m112234a();
            }
            List<C47205a> list3 = this.f119164e;
            if (list3 == null) {
                C52711k.m112234a();
            }
            textView.setText(((C47205a) list3.get(i)).f119170b);
            List<C47205a> list4 = this.f119164e;
            if (list4 == null) {
                C52711k.m112234a();
            }
            float f3 = ((C47205a) list4.get(i)).f119169a;
            List<C47205a> list5 = this.f119164e;
            if (list5 == null) {
                C52711k.m112234a();
            }
            if (i == list5.size() - 1) {
                f = this.f119160a;
            } else {
                List<C47205a> list6 = this.f119164e;
                if (list6 == null) {
                    C52711k.m112234a();
                }
                f = ((C47205a) list6.get(i + 1)).f119169a;
            }
            float f4 = this.f119162c - f3;
            float f5 = f - f3;
            float f6 = 0.0f;
            if (f4 >= 0.0f && f5 >= f4 && f5 > 0.0f) {
                List<C47205a> list7 = this.f119164e;
                if (list7 == null) {
                    C52711k.m112234a();
                }
                int measuredWidth = (int) (((C47205a) list7.get(i)).f119171c - ((float) getMeasuredWidth()));
                if (measuredWidth > 0) {
                    f6 = (((float) measuredWidth) * f4) / f5;
                }
                smoothScrollTo((int) f6, 0);
            }
        }
    }

    public final void setDuration(float f) {
        this.f119160a = f;
    }

    public final void setPreviewStartTime(float f) {
        this.f119163d = f;
    }

    public final void setCurrentTime(int i) {
        if (i >= 0) {
            this.f119162c = this.f119163d + this.f119161b + (((float) i) / 1000.0f);
            m102462a();
        }
    }

    public final void setStartTime(int i) {
        this.f119161b = ((float) i) / 1000.0f;
        if (!C9376b.m18558a((Collection<T>) this.f119164e)) {
            List<C47205a> list = this.f119164e;
            if (list == null) {
                C52711k.m112234a();
            }
            if (list.size() == 1) {
                setVisibility(8);
            }
        }
    }

    public final void setLrcInfos(List<C47205a> list) {
        boolean z;
        C52711k.m112240b(list, "lrcInfos");
        this.f119164e = list;
        Collection collection = this.f119164e;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            setVisibility(0);
            List<C47205a> list2 = this.f119164e;
            if (list2 == null) {
                C52711k.m112234a();
            }
            C52575l.m112105a(list2, C47204a.f119167a);
            List<C47205a> list3 = this.f119164e;
            TextView textView = this.f119165f;
            if (textView == null) {
                C52711k.m112234a();
            }
            TextPaint paint = textView.getPaint();
            C52711k.m112236a((Object) paint, "mTvwLrc!!.paint");
            C52711k.m112240b(paint, "paint");
            if (list3 == null) {
                list3 = null;
            } else {
                int i = 0;
                while (i < list3.size()) {
                    int i2 = i + 1;
                    if (i2 < list3.size() && ((C47205a) list3.get(i)).f119169a == ((C47205a) list3.get(i2)).f119169a) {
                        C47205a aVar = (C47205a) list3.get(i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(((C47205a) list3.get(i)).f119170b);
                        sb.append(" ");
                        sb.append(((C47205a) list3.get(i2)).f119170b);
                        aVar.f119170b = sb.toString();
                        list3.remove(i2);
                        i--;
                    }
                    i++;
                }
                int size = list3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C47205a) list3.get(i3)).f119171c = paint.measureText(((C47205a) list3.get(i3)).f119170b) + 15.0f;
                }
            }
            this.f119164e = list3;
            List<C47205a> list4 = this.f119164e;
            if (list4 == null) {
                C52711k.m112234a();
            }
            if (list4.size() == 1) {
                if (this.f119160a <= 0.0f) {
                    this.f119160a = 70.0f;
                }
                if (this.f119161b != 0.0f) {
                    setVisibility(8);
                    return;
                }
            } else {
                List<C47205a> list5 = this.f119164e;
                if (list5 == null) {
                    C52711k.m112234a();
                }
                float f = ((C47205a) C52575l.m112142g(list5)).f119169a;
                if (f >= this.f119160a) {
                    this.f119160a = f + 20.0f;
                }
            }
            m102462a();
        }
    }

    public LrcView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f119166g = attributeSet;
        this.f119165f = new DmtTextView(getContext());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.f119166g, new int[]{16842901, 16842904});
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 45);
        TextView textView = this.f119165f;
        if (textView == null) {
            C52711k.m112234a();
        }
        textView.setTextSize(0, (float) dimensionPixelOffset);
        int color = obtainStyledAttributes.getColor(1, -1);
        TextView textView2 = this.f119165f;
        if (textView2 == null) {
            C52711k.m112234a();
        }
        textView2.setTextColor(color);
        obtainStyledAttributes.recycle();
        addView(this.f119165f, new LayoutParams(-2, -2));
    }

    public /* synthetic */ LrcView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
