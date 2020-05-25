package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.n */
public final class C35412n extends C1331h {

    /* renamed from: a */
    public int f91027a;

    /* renamed from: b */
    public int f91028b = -1;

    /* renamed from: c */
    public boolean f91029c;

    /* renamed from: d */
    private Context f91030d;

    /* renamed from: e */
    private Resources f91031e;

    /* renamed from: f */
    private float f91032f;

    /* renamed from: g */
    private Paint f91033g;

    /* renamed from: h */
    private Paint f91034h;

    /* renamed from: i */
    private int f91035i;

    /* renamed from: j */
    private int f91036j;

    /* renamed from: k */
    private float f91037k;

    /* renamed from: l */
    private float f91038l;

    /* renamed from: m */
    private float f91039m;

    /* renamed from: n */
    private Bitmap f91040n;

    /* renamed from: o */
    private Rect f91041o;

    /* renamed from: p */
    private Rect f91042p;

    /* renamed from: q */
    private boolean f91043q;

    /* renamed from: r */
    private String f91044r;

    /* renamed from: s */
    private List<String> f91045s;

    /* renamed from: t */
    private List<Integer> f91046t;

    /* renamed from: u */
    private boolean f91047u;

    /* renamed from: a */
    private String m80052a(int i) {
        String string;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f91046t.size()) {
                i2 = -1;
                break;
            }
            i3 += ((Integer) this.f91046t.get(i2)).intValue();
            if (i < i3) {
                break;
            }
            i2++;
        }
        String str = null;
        if (i2 != -1) {
            str = (String) this.f91045s.get(i2);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f91044r)) {
            str = this.f91044r;
        }
        if ("recent".equals(str)) {
            if (this.f91047u) {
                string = this.f91030d.getString(R.string.bmd);
            } else {
                string = this.f91030d.getString(R.string.bme);
            }
            str = string;
        } else if ("Friend".equals(str)) {
            if (this.f91047u) {
                str = this.f91030d.getString(R.string.bhg);
            } else {
                str = this.f91030d.getString(R.string.bla);
            }
        } else if (i == 0) {
            if (this.f91028b == 0) {
                str = this.f91030d.getString(R.string.bhg);
            } else if (this.f91028b == -1 || this.f91028b == 1) {
                str = this.f91030d.getString(R.string.bl_);
            }
        }
        this.f91044r = str;
        return str;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public C35412n(Context context, List<String> list, List<Integer> list2) {
        this.f91030d = context;
        this.f91031e = this.f91030d.getResources();
        this.f91032f = C9432q.m18687b(context, 32.0f);
        this.f91033g = new Paint();
        this.f91033g.setColor(this.f91031e.getColor(R.color.qx));
        this.f91034h = new Paint();
        this.f91034h.setColor(this.f91031e.getColor(R.color.ayo));
        this.f91034h.setTextSize(C9432q.m18687b(this.f91030d, 13.0f));
        FontMetrics fontMetrics = this.f91034h.getFontMetrics();
        this.f91035i = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f91036j = (int) fontMetrics.bottom;
        this.f91037k = C9432q.m18687b(this.f91030d, 16.0f);
        this.f91041o = new Rect();
        this.f91038l = C9432q.m18687b(this.f91030d, 2.0f);
        this.f91040n = ((BitmapDrawable) this.f91031e.getDrawable(R.drawable.azt)).getBitmap();
        this.f91039m = C9432q.m18687b(this.f91030d, 16.0f);
        this.f91042p = new Rect(0, 0, (int) this.f91039m, (int) this.f91039m);
        this.f91045s = list;
        this.f91046t = list2;
        DefaultIMService.provideIMService_Monster().getAbInterface();
        this.f91047u = false;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        String str;
        boolean z;
        float f;
        super.onDrawOver(canvas, recyclerView, sVar);
        this.f91029c = false;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            int j = linearLayoutManager.mo4749j();
            if (j != -1 && j >= this.f91027a) {
                C1352v f2 = recyclerView.mo4847f(j);
                if (f2 != null) {
                    int i = j - this.f91027a;
                    View view = f2.itemView;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 >= this.f91046t.size()) {
                            i2 = -1;
                            break;
                        }
                        i3 += ((Integer) this.f91046t.get(i2)).intValue();
                        if (i < i3) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        str = (String) this.f91045s.get(i2);
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f91044r)) {
                        str = this.f91044r;
                    }
                    boolean z2 = true;
                    if ("recent".equals(str) || "Friend".equals(str) || i == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        String a = m80052a(i);
                        if (!TextUtils.isEmpty(a)) {
                            this.f91029c = true;
                            this.f91043q = false;
                            if (TextUtils.equals(this.f91030d.getString(R.string.bla), a)) {
                                this.f91043q = true;
                            }
                            int i4 = i + 1;
                            if (m80052a(i4) == null || TextUtils.equals(m80052a(i4), a) || ((float) (view.getHeight() + view.getTop())) >= this.f91032f) {
                                z2 = false;
                            } else {
                                canvas.save();
                                canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f91032f);
                            }
                            this.f91041o.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f91032f));
                            this.f91033g.setColor(this.f91031e.getColor(R.color.a2j));
                            canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f91032f, this.f91033g);
                            canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f91037k, ((((float) recyclerView.getPaddingTop()) + this.f91032f) - ((this.f91032f - ((float) this.f91035i)) / 2.0f)) - ((float) this.f91036j), this.f91034h);
                            if (this.f91043q) {
                                this.f91034h.getTextBounds(a, 0, a.length(), this.f91041o);
                                float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.f91037k + ((float) this.f91041o.width()) + this.f91038l;
                                if (C35279p.m79763a()) {
                                    f = ((float) recyclerView.getPaddingTop()) + ((this.f91032f - ((float) this.f91035i)) / 2.0f) + ((float) this.f91036j);
                                } else {
                                    f = ((((float) recyclerView.getPaddingTop()) + ((this.f91032f - ((float) this.f91035i)) / 2.0f)) + ((float) this.f91036j)) - this.f91038l;
                                }
                                this.f91042p.set((int) paddingLeft, (int) f, (int) (paddingLeft + this.f91039m), (int) (f + this.f91039m));
                                canvas.drawBitmap(this.f91040n, null, this.f91042p, this.f91034h);
                            }
                            if (z2) {
                                canvas.restore();
                            }
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
