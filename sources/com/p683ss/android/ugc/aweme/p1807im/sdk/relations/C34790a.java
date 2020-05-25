package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

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
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a */
public final class C34790a extends C1331h {

    /* renamed from: a */
    public int f89611a;

    /* renamed from: b */
    public int f89612b = -1;

    /* renamed from: c */
    public boolean f89613c;

    /* renamed from: d */
    private Context f89614d;

    /* renamed from: e */
    private Resources f89615e;

    /* renamed from: f */
    private float f89616f;

    /* renamed from: g */
    private Paint f89617g;

    /* renamed from: h */
    private Paint f89618h;

    /* renamed from: i */
    private int f89619i;

    /* renamed from: j */
    private int f89620j;

    /* renamed from: k */
    private float f89621k;

    /* renamed from: l */
    private float f89622l;

    /* renamed from: m */
    private float f89623m;

    /* renamed from: n */
    private Bitmap f89624n;

    /* renamed from: o */
    private Rect f89625o;

    /* renamed from: p */
    private Rect f89626p;

    /* renamed from: q */
    private boolean f89627q;

    /* renamed from: r */
    private String f89628r;

    /* renamed from: s */
    private List<String> f89629s;

    /* renamed from: t */
    private List<Integer> f89630t;

    /* renamed from: u */
    private boolean f89631u;

    /* renamed from: a */
    private String m78826a(int i) {
        String string;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f89630t.size()) {
                i2 = -1;
                break;
            }
            i3 += ((Integer) this.f89630t.get(i2)).intValue();
            if (i < i3) {
                break;
            }
            i2++;
        }
        String str = null;
        if (i2 != -1) {
            str = (String) this.f89629s.get(i2);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f89628r)) {
            str = this.f89628r;
        }
        if ("recent".equals(str)) {
            if (this.f89631u) {
                string = this.f89614d.getString(R.string.bmd);
            } else {
                string = this.f89614d.getString(R.string.bme);
            }
            str = string;
        } else if ("Friend".equals(str)) {
            if (this.f89631u) {
                str = this.f89614d.getString(R.string.bhg);
            } else {
                str = this.f89614d.getString(R.string.bla);
            }
        } else if (i == 0) {
            if (this.f89612b == 0) {
                str = this.f89614d.getString(R.string.bhg);
            } else if (this.f89612b == -1 || this.f89612b == 1) {
                str = this.f89614d.getString(R.string.bl_);
            }
        }
        this.f89628r = str;
        return str;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public C34790a(Context context, List<String> list, List<Integer> list2) {
        this.f89614d = context;
        this.f89615e = this.f89614d.getResources();
        this.f89616f = C9432q.m18687b(context, 32.0f);
        this.f89617g = new Paint();
        this.f89617g.setColor(this.f89615e.getColor(R.color.qx));
        this.f89618h = new Paint();
        this.f89618h.setColor(this.f89615e.getColor(R.color.ayo));
        this.f89618h.setTextSize(C9432q.m18687b(this.f89614d, 13.0f));
        FontMetrics fontMetrics = this.f89618h.getFontMetrics();
        this.f89619i = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f89620j = (int) fontMetrics.bottom;
        this.f89621k = C9432q.m18687b(this.f89614d, 16.0f);
        this.f89625o = new Rect();
        this.f89622l = C9432q.m18687b(this.f89614d, 2.0f);
        this.f89624n = ((BitmapDrawable) this.f89615e.getDrawable(R.drawable.azt)).getBitmap();
        this.f89623m = C9432q.m18687b(this.f89614d, 16.0f);
        this.f89626p = new Rect(0, 0, (int) this.f89623m, (int) this.f89623m);
        this.f89629s = list;
        this.f89630t = list2;
        DefaultIMService.provideIMService_Monster().getAbInterface();
        this.f89631u = false;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        float f;
        super.onDrawOver(canvas, recyclerView, sVar);
        this.f89613c = false;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            int j = linearLayoutManager.mo4749j();
            if (j != -1 && j >= this.f89611a) {
                C1352v f2 = recyclerView.mo4847f(j);
                if (f2 != null) {
                    int i = j - this.f89611a;
                    View view = f2.itemView;
                    String a = m78826a(i);
                    if (!TextUtils.isEmpty(a)) {
                        boolean z = true;
                        this.f89613c = true;
                        this.f89627q = false;
                        if (TextUtils.equals(this.f89614d.getString(R.string.bla), a)) {
                            this.f89627q = true;
                        }
                        int i2 = i + 1;
                        if (m78826a(i2) == null || TextUtils.equals(m78826a(i2), a) || ((float) (view.getHeight() + view.getTop())) >= this.f89616f) {
                            z = false;
                        } else {
                            canvas.save();
                            canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f89616f);
                        }
                        this.f89625o.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f89616f));
                        this.f89617g.setColor(this.f89615e.getColor(R.color.a2j));
                        canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f89616f, this.f89617g);
                        canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f89621k, ((((float) recyclerView.getPaddingTop()) + this.f89616f) - ((this.f89616f - ((float) this.f89619i)) / 2.0f)) - ((float) this.f89620j), this.f89618h);
                        if (this.f89627q) {
                            this.f89618h.getTextBounds(a, 0, a.length(), this.f89625o);
                            float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.f89621k + ((float) this.f89625o.width()) + this.f89622l;
                            if (C35279p.m79763a()) {
                                f = ((float) recyclerView.getPaddingTop()) + ((this.f89616f - ((float) this.f89619i)) / 2.0f) + ((float) this.f89620j);
                            } else {
                                f = ((((float) recyclerView.getPaddingTop()) + ((this.f89616f - ((float) this.f89619i)) / 2.0f)) + ((float) this.f89620j)) - this.f89622l;
                            }
                            this.f89626p.set((int) paddingLeft, (int) f, (int) (paddingLeft + this.f89623m), (int) (f + this.f89623m));
                            canvas.drawBitmap(this.f89624n, null, this.f89626p, this.f89618h);
                        }
                        if (z) {
                            canvas.restore();
                        }
                    }
                }
            }
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
    }
}
