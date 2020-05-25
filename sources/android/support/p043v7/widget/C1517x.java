package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: android.support.v7.widget.x */
public class C1517x extends C1331h {

    /* renamed from: a */
    private static final int[] f5452a = {16843284};

    /* renamed from: b */
    private Drawable f5453b;

    /* renamed from: c */
    private int f5454c;

    /* renamed from: d */
    private final Rect f5455d = new Rect();

    /* renamed from: a */
    public final void mo5866a(Drawable drawable) {
        if (drawable != null) {
            this.f5453b = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public C1517x(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5452a);
        this.f5453b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.f5454c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.getLayoutManager() != null && this.f5453b != null) {
            int i5 = 0;
            if (this.f5454c == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.m4264a(childAt, this.f5455d);
                    int round = this.f5455d.bottom + Math.round(childAt.getTranslationY());
                    this.f5453b.setBounds(i3, round - this.f5453b.getIntrinsicHeight(), i4, round);
                    this.f5453b.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                recyclerView.getLayoutManager();
                C1332i.m4413a(childAt2, this.f5455d);
                int round2 = this.f5455d.right + Math.round(childAt2.getTranslationX());
                this.f5453b.setBounds(round2 - this.f5453b.getIntrinsicWidth(), i, round2, i2);
                this.f5453b.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        if (this.f5453b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f5454c == 1) {
            rect.set(0, 0, 0, this.f5453b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f5453b.getIntrinsicWidth(), 0);
        }
    }
}
