package com.bytedance.android.livesdk.feed.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.tab.p350c.C7133a;
import com.bytedance.android.livesdkapi.view.C8867d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveTabIndicator extends HorizontalScrollView {

    /* renamed from: a */
    private C7164a f19445a;

    /* renamed from: b */
    LinearLayout f19446b;

    /* renamed from: c */
    private boolean f19447c = true;

    /* renamed from: d */
    private Map<Long, Boolean> f19448d = new HashMap();

    /* renamed from: e */
    private List<C6945f> f19449e;

    /* renamed from: f */
    private C7165b f19450f;

    /* renamed from: com.bytedance.android.livesdk.feed.widget.LiveTabIndicator$a */
    public interface C7164a {
        /* renamed from: a */
        void mo13070a(C6945f fVar);
    }

    /* renamed from: com.bytedance.android.livesdk.feed.widget.LiveTabIndicator$b */
    class C7165b implements OnLayoutChangeListener {

        /* renamed from: a */
        public List<C6945f> f19451a;

        C7165b(List<C6945f> list) {
            this.f19451a = list;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            LiveTabIndicator.this.mo13285a(this.f19451a);
            LiveTabIndicator.this.removeOnLayoutChangeListener(this);
        }
    }

    /* renamed from: b */
    private void mo13276b() {
        getParentViewPager();
    }

    public int getLayoutId() {
        return R.layout.aqh;
    }

    private C8867d getParentViewPager() {
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof C8867d)) {
            viewParent = viewParent.getParent();
        }
        return (C8867d) viewParent;
    }

    /* renamed from: a */
    private void mo13275a() {
        inflate(getContext(), getLayoutId(), this);
        setHorizontalScrollBarEnabled(false);
        this.f19446b = (LinearLayout) findViewById(R.id.zb);
    }

    /* access modifiers changed from: protected */
    public int getItemGap() {
        if (this.f19449e.size() > 5 || this.f19449e.size() <= 1) {
            return (int) C9432q.m18687b(getContext(), 30.0f);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        int i = 0;
        for (C6945f fVar : this.f19449e) {
            float measureText = textPaint.measureText(fVar.f19010b);
            float f = (float) i;
            if (measureText <= 0.0f) {
                measureText = 0.0f;
            }
            i = (int) (f + measureText);
        }
        int width = getWidth();
        int[] leftAndRightPadding = getLeftAndRightPadding();
        return (((width - leftAndRightPadding[0]) - leftAndRightPadding[1]) - i) / (this.f19449e.size() - 1);
    }

    /* access modifiers changed from: protected */
    public int[] getLeftAndRightPadding() {
        if (this.f19449e.size() == 1) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
            int a = (int) ((((float) C9432q.m18670a(getContext())) - textPaint.measureText(((C6945f) this.f19449e.get(0)).f19010b)) / 2.0f);
            return new int[]{a, a};
        } else if (this.f19449e.size() == 2) {
            int a2 = C9432q.m18670a(getContext());
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
            float f = (float) (a2 / 2);
            int measureText = (int) ((f - textPaint2.measureText(((C6945f) this.f19449e.get(1)).f19010b)) / 2.0f);
            return new int[]{(int) ((f - textPaint2.measureText(((C6945f) this.f19449e.get(0)).f19010b)) / 2.0f), measureText};
        } else {
            int b = (int) C9432q.m18687b(getContext(), 30.0f);
            return new int[]{b, b};
        }
    }

    public void setOnTabClickListener(C7164a aVar) {
        this.f19445a = aVar;
    }

    public LiveTabIndicator(Context context) {
        super(context);
        mo13275a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            mo13276b();
        } else if (motionEvent.getAction() != 2) {
            getParentViewPager();
        } else if (onInterceptTouchEvent) {
            mo13276b();
        }
        return onInterceptTouchEvent;
    }

    public void setTitles(List<C6945f> list) {
        if (getWidth() != 0) {
            mo13285a(list);
            return;
        }
        if (this.f19450f == null) {
            this.f19450f = new C7165b(list);
        }
        this.f19450f.f19451a = list;
        removeOnLayoutChangeListener(this.f19450f);
        addOnLayoutChangeListener(this.f19450f);
    }

    /* renamed from: a */
    public final void mo13284a(C6945f fVar) {
        int childCount = this.f19446b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C7133a aVar = (C7133a) this.f19446b.getChildAt(i);
            long j = ((C6945f) this.f19449e.get(i)).f19009a;
            if (j == fVar.f19009a) {
                aVar.setChecked(true);
                this.f19448d.put(Long.valueOf(j), Boolean.valueOf(true));
                ((C6945f) this.f19449e.get(i)).f19020l = true;
            } else {
                aVar.setChecked(false);
                this.f19448d.put(Long.valueOf(j), Boolean.valueOf(false));
                ((C6945f) this.f19449e.get(i)).f19020l = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo13285a(List<C6945f> list) {
        if (this.f19446b != null) {
            this.f19446b.removeAllViews();
            if (!C9376b.m18558a((Collection<T>) list)) {
                this.f19449e = list;
                for (int i = 0; i < list.size(); i++) {
                    C6945f fVar = (C6945f) list.get(i);
                    if (i == 0 && this.f19447c) {
                        this.f19448d.put(Long.valueOf(fVar.f19009a), Boolean.valueOf(true));
                        this.f19447c = false;
                    }
                    this.f19446b.addView(m14857a(fVar, i));
                }
                if (list.size() == 1) {
                    setVisibility(8);
                }
            }
        }
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo13275a();
    }

    /* renamed from: a */
    private C7133a m14857a(C6945f fVar, int i) {
        C7133a aVar = new C7133a(getContext());
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int[] leftAndRightPadding = getLeftAndRightPadding();
        int itemGap = getItemGap();
        if (i == 0) {
            layoutParams.setMargins(leftAndRightPadding[0], 0, 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(leftAndRightPadding[0]);
                layoutParams.setMarginEnd(0);
            }
        } else if (i == this.f19449e.size() - 1) {
            layoutParams.setMargins(itemGap, 0, leftAndRightPadding[1], 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(itemGap);
                layoutParams.setMarginEnd(leftAndRightPadding[1]);
            }
        } else {
            layoutParams.setMargins(itemGap, 0, 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(itemGap);
                layoutParams.setMarginEnd(0);
            }
        }
        aVar.setLayoutParams(layoutParams);
        aVar.setGravity(17);
        if (VERSION.SDK_INT >= 17) {
            aVar.setTextAlignment(4);
        }
        aVar.setTextColor(getResources().getColorStateList(R.color.aib));
        aVar.setText(fVar.f19010b);
        if (this.f19448d.containsKey(Long.valueOf(fVar.f19009a))) {
            aVar.setChecked(((Boolean) this.f19448d.get(Long.valueOf(fVar.f19009a))).booleanValue());
        }
        aVar.mo13255a(1, 16.0f);
        aVar.setOnClickListener(new C7166a(this, i, fVar, aVar));
        return aVar;
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo13275a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13283a(int i, C6945f fVar, C7133a aVar, View view) {
        int childCount = this.f19446b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (i2 != i) {
                ((C7133a) this.f19446b.getChildAt(i2)).setChecked(false);
                C6945f fVar2 = (C6945f) this.f19449e.get(i2);
                fVar2.f19020l = false;
                this.f19448d.put(Long.valueOf(fVar2.f19009a), Boolean.valueOf(false));
            }
        }
        fVar.f19020l = true;
        aVar.setChecked(true);
        this.f19448d.put(Long.valueOf(fVar.f19009a), Boolean.valueOf(true));
        if (this.f19445a != null) {
            this.f19445a.mo13070a(fVar);
        }
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo13275a();
    }
}
