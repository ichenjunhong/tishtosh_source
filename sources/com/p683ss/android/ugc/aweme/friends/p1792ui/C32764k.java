package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.k */
public final class C32764k extends C1331h {

    /* renamed from: a */
    public volatile boolean f85325a;

    /* renamed from: b */
    private Context f85326b;

    /* renamed from: c */
    private Resources f85327c;

    /* renamed from: d */
    private float f85328d;

    /* renamed from: e */
    private Paint f85329e;

    /* renamed from: f */
    private Paint f85330f;

    /* renamed from: g */
    private int f85331g;

    /* renamed from: h */
    private int f85332h;

    /* renamed from: i */
    private float f85333i;

    /* renamed from: j */
    private float f85334j;

    /* renamed from: k */
    private float f85335k;

    /* renamed from: l */
    private Bitmap f85336l;

    /* renamed from: m */
    private Bitmap f85337m;

    /* renamed from: n */
    private Rect f85338n;

    /* renamed from: o */
    private Rect f85339o;

    /* renamed from: p */
    private boolean f85340p;

    /* renamed from: q */
    private String f85341q;

    /* renamed from: r */
    private List<String> f85342r = new ArrayList();

    /* renamed from: s */
    private List<Integer> f85343s = new ArrayList();

    /* renamed from: a */
    private String m75642a(int i) {
        String str = null;
        if (this.f85325a) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f85343s.size()) {
                i2 = -1;
                break;
            }
            i3 += ((Integer) this.f85343s.get(i2)).intValue();
            if (i < i3) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            str = (String) this.f85342r.get(i2);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f85341q)) {
            str = this.f85341q;
        }
        if ("Recent".equals(str)) {
            str = this.f85326b.getString(R.string.duf);
        } else if ("Friend".equals(str)) {
            str = this.f85326b.getString(R.string.e1v);
        } else if (i == 0) {
            str = this.f85326b.getString(R.string.ks);
        }
        this.f85341q = str;
        return str;
    }

    public C32764k(Context context, List<String> list, List<Integer> list2) {
        this.f85326b = context;
        this.f85327c = this.f85326b.getResources();
        this.f85328d = C9432q.m18687b(context, 32.0f);
        this.f85329e = new Paint();
        this.f85329e.setColor(859328726);
        this.f85330f = new Paint();
        this.f85330f.setColor(this.f85327c.getColor(R.color.a7w));
        this.f85330f.setTextSize(C9432q.m18687b(this.f85326b, 13.0f));
        FontMetrics fontMetrics = this.f85330f.getFontMetrics();
        this.f85331g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f85332h = (int) fontMetrics.bottom;
        this.f85333i = C9432q.m18687b(this.f85326b, 16.0f);
        this.f85338n = new Rect();
        this.f85334j = C9432q.m18687b(this.f85326b, 2.0f);
        this.f85336l = ((BitmapDrawable) this.f85327c.getDrawable(R.drawable.a2u)).getBitmap();
        this.f85337m = ((BitmapDrawable) this.f85327c.getDrawable(R.drawable.a6m)).getBitmap();
        this.f85335k = C9432q.m18687b(this.f85326b, 16.0f);
        this.f85339o = new Rect(0, 0, (int) this.f85335k, (int) this.f85335k);
        this.f85342r = list;
        this.f85343s = list2;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        super.onDrawOver(canvas, recyclerView, sVar);
        int j = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4749j();
        if (j != -1) {
            C1352v f = recyclerView.mo4847f(j);
            if (f != null) {
                View view = f.itemView;
                String a = m75642a(j);
                if (!TextUtils.isEmpty(a)) {
                    this.f85340p = false;
                    boolean z = true;
                    if (TextUtils.equals(this.f85326b.getString(R.string.e1v), a)) {
                        this.f85340p = true;
                    }
                    int i = j + 1;
                    if (m75642a(i) == null || TextUtils.equals(m75642a(i), a) || ((float) (view.getHeight() + view.getTop())) >= this.f85328d) {
                        z = false;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f85328d);
                    }
                    this.f85338n.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f85328d));
                    this.f85329e.setColor(this.f85327c.getColor(R.color.a2j));
                    canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f85328d, this.f85329e);
                    canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f85333i, ((((float) recyclerView.getPaddingTop()) + this.f85328d) - ((this.f85328d - ((float) this.f85331g)) / 2.0f)) - ((float) this.f85332h), this.f85330f);
                    if (this.f85340p) {
                        this.f85330f.getTextBounds(a, 0, a.length(), this.f85338n);
                        canvas.drawBitmap(this.f85337m, ((float) recyclerView.getPaddingLeft()) + this.f85333i + ((float) this.f85338n.width()) + this.f85334j, ((float) recyclerView.getPaddingTop()) + ((this.f85328d - ((float) this.f85331g)) / 2.0f) + ((float) this.f85332h), this.f85330f);
                    } else if (TextUtils.equals(this.f85326b.getString(R.string.duf), a)) {
                        this.f85330f.getTextBounds(a, 0, a.length(), this.f85338n);
                        float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.f85333i + ((float) this.f85338n.width()) + this.f85334j;
                        float paddingTop = ((((float) recyclerView.getPaddingTop()) + ((this.f85328d - ((float) this.f85331g)) / 2.0f)) + ((float) this.f85332h)) - this.f85334j;
                        this.f85339o.set((int) paddingLeft, (int) paddingTop, (int) (paddingLeft + this.f85335k), (int) (paddingTop + this.f85335k));
                        canvas.drawBitmap(this.f85336l, null, this.f85339o, this.f85330f);
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
            }
        }
    }
}
