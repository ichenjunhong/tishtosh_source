package com.p683ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.f */
public final class C32530f extends C1331h {

    /* renamed from: a */
    private final boolean f84688a;

    /* renamed from: b */
    private Context f84689b;

    /* renamed from: c */
    private Resources f84690c = this.f84689b.getResources();

    /* renamed from: d */
    private float f84691d;

    /* renamed from: e */
    private Paint f84692e;

    /* renamed from: f */
    private Paint f84693f;

    /* renamed from: g */
    private int f84694g;

    /* renamed from: h */
    private int f84695h;

    /* renamed from: i */
    private float f84696i;

    /* renamed from: j */
    private Rect f84697j;

    /* renamed from: k */
    private String f84698k;

    /* renamed from: l */
    private C32527c f84699l;

    /* renamed from: a */
    private String m75276a(int i) {
        String str;
        int a = this.f84699l.mo65827a(i);
        if (a != -1) {
            str = (String) this.f84699l.getSections()[a];
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f84698k)) {
            str = this.f84698k;
        }
        this.f84698k = str;
        return str;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public C32530f(Context context, C32527c cVar, boolean z) {
        this.f84689b = context;
        this.f84691d = C9432q.m18687b(context, 32.0f);
        this.f84692e = new Paint();
        this.f84692e.setColor(this.f84690c.getColor(R.color.a2j));
        this.f84693f = new Paint();
        this.f84693f.setColor(this.f84690c.getColor(R.color.sp));
        this.f84693f.setTextSize(C9432q.m18687b(this.f84689b, 14.0f));
        FontMetrics fontMetrics = this.f84693f.getFontMetrics();
        this.f84694g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f84695h = (int) fontMetrics.bottom;
        this.f84696i = C9432q.m18687b(this.f84689b, 16.0f);
        this.f84697j = new Rect();
        this.f84699l = cVar;
        this.f84688a = z;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        super.onDrawOver(canvas, recyclerView, sVar);
        int j = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4749j();
        int k = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4750k() - (this.f84688a ? 1 : 0);
        if (j != -1 && k > 0) {
            C1352v f = recyclerView.mo4847f(j);
            if (f != null) {
                if (this.f84688a) {
                    j--;
                }
                View view = f.itemView;
                String a = m75276a(j);
                if (!TextUtils.isEmpty(a)) {
                    boolean z = true;
                    int i = j + 1;
                    if (m75276a(i) == null || TextUtils.equals(m75276a(i), a) || ((float) (view.getHeight() + view.getTop())) >= this.f84691d) {
                        z = false;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f84691d);
                    }
                    this.f84697j.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f84691d));
                    this.f84692e.setColor(this.f84690c.getColor(R.color.a2j));
                    canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f84691d, this.f84692e);
                    canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f84696i, ((((float) recyclerView.getPaddingTop()) + this.f84691d) - ((this.f84691d - ((float) this.f84694g)) / 2.0f)) - ((float) this.f84695h), this.f84693f);
                    if (z) {
                        canvas.restore();
                    }
                }
            }
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
    }
}
