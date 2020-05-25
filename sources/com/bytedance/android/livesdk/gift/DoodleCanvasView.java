package com.bytedance.android.livesdk.gift;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.p030v4.p038f.C0785g;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3897k;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView.C7368a;
import com.bytedance.android.livesdk.gift.p354b.C7216a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DoodleCanvasView extends View {

    /* renamed from: a */
    public boolean f19532a;

    /* renamed from: b */
    private int f19533b;

    /* renamed from: c */
    private Paint f19534c;

    /* renamed from: d */
    private List<C7648t> f19535d;

    /* renamed from: e */
    private C0785g<Bitmap> f19536e;

    /* renamed from: f */
    private int f19537f;

    /* renamed from: g */
    private long f19538g;

    /* renamed from: h */
    private int f19539h;

    /* renamed from: i */
    private ImageModel f19540i;

    /* renamed from: j */
    private int f19541j;

    /* renamed from: k */
    private DoodleGiftView f19542k;

    /* renamed from: l */
    private int f19543l;

    /* renamed from: m */
    private Stack<Integer> f19544m;

    /* renamed from: n */
    private int f19545n;

    /* renamed from: o */
    private C7188a f19546o;

    /* renamed from: p */
    private Runnable f19547p;

    /* renamed from: com.bytedance.android.livesdk.gift.DoodleCanvasView$a */
    public interface C7188a {
        /* renamed from: a */
        void mo13352a(List<C7648t> list, int i, int i2, int i3);
    }

    public List<C7648t> getMoveActions() {
        return this.f19535d;
    }

    public int getTotalCostDiamondCount() {
        return this.f19541j;
    }

    /* renamed from: c */
    public final boolean mo13342c() {
        if (!C9414h.m18630a(this.f19544m)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f19536e != null) {
            this.f19536e.mo2495c();
        }
        removeCallbacks(this.f19547p);
    }

    /* renamed from: a */
    public final void mo13339a() {
        if (this.f19535d != null && this.f19535d.size() > 0) {
            this.f19535d.clear();
            this.f19541j = 0;
            if (this.f19542k != null) {
                DoodleGiftView doodleGiftView = this.f19542k;
                if (doodleGiftView.f20094b == C7368a.draw && !doodleGiftView.f20093a.isEmpty()) {
                    doodleGiftView.f20093a.clear();
                    doodleGiftView.invalidate();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13341b() {
        if (mo13342c()) {
            int min = Math.min(((Integer) this.f19544m.pop()).intValue(), this.f19535d.size());
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                int size = this.f19535d.size() - 1;
                i += ((C7648t) this.f19535d.get(size)).f21074d;
                this.f19535d.remove(size);
                if (this.f19542k != null) {
                    DoodleGiftView doodleGiftView = this.f19542k;
                    if (doodleGiftView.f20094b == C7368a.draw && !doodleGiftView.f20093a.isEmpty()) {
                        doodleGiftView.f20093a.remove(doodleGiftView.getDrawPointNum() - 1);
                        doodleGiftView.invalidate();
                    }
                }
            }
            this.f19545n = this.f19535d.size();
            this.f19541j -= i;
            if (this.f19546o != null) {
                this.f19546o.mo13352a(this.f19535d, getWidth(), getHeight(), this.f19541j);
            }
            C4495a.m10823a().mo10301a((Object) new C7216a(this.f19535d.size(), this.f19541j));
        }
    }

    public void setDoodleCanvasBackground(int i) {
        this.f19543l = i;
    }

    public void setDoodleCanvasListener(C7188a aVar) {
        this.f19546o = aVar;
    }

    public DoodleCanvasView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.drawColor(this.f19543l);
    }

    public void setDrawDoodleGiftView(DoodleGiftView doodleGiftView) {
        this.f19542k = doodleGiftView;
        if (this.f19542k != null) {
            this.f19542k.mo13633a(C7368a.draw);
        }
    }

    /* renamed from: a */
    private void m14925a(C7648t tVar) {
        if (this.f19542k != null) {
            if (this.f19535d.size() < this.f19533b) {
                this.f19535d.add(tVar);
                this.f19541j += this.f19539h;
                String b = ((C8794c) C4116c.m10249a(C8794c.class)).mo15494b(this.f19540i);
                if (!TextUtils.isEmpty(b)) {
                    this.f19542k.mo13635a(tVar.f21071a, tVar.f21072b, b);
                }
            } else if (!this.f19532a) {
                C4575an.m10987a(C3897k.m9852a(C3922z.m9903a((int) R.string.hpm), Integer.valueOf(this.f19533b)));
                postDelayed(this.f19547p, 3000);
                this.f19532a = true;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f19538g == 0) {
            C3831a.m9716d("DoodleCanvasView", "doodle gift id invalid, skip doodle.");
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                C7648t tVar = new C7648t((int) motionEvent.getX(), (int) motionEvent.getY(), this.f19538g, this.f19539h);
                m14925a(tVar);
                if (this.f19546o != null) {
                    this.f19546o.mo13352a(this.f19535d, getWidth(), getHeight(), this.f19541j);
                }
                C4495a.m10823a().mo10301a((Object) new C7216a(this.f19535d.size(), this.f19541j));
                break;
            case 1:
                if (this.f19545n < this.f19535d.size()) {
                    this.f19544m.push(Integer.valueOf(this.f19535d.size() - this.f19545n));
                    this.f19545n = this.f19535d.size();
                }
                if (this.f19546o != null) {
                    this.f19546o.mo13352a(this.f19535d, getWidth(), getHeight(), this.f19541j);
                }
                C4495a.m10823a().mo10301a((Object) new C7216a(this.f19535d.size(), this.f19541j));
                break;
            case 2:
                if (this.f19535d.size() > 0) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int i3 = ((C7648t) this.f19535d.get(this.f19535d.size() - 1)).f21071a;
                    int i4 = ((C7648t) this.f19535d.get(this.f19535d.size() - 1)).f21072b;
                    int i5 = x - i3;
                    int i6 = y - i4;
                    int pow = (int) Math.pow(Math.pow((double) i5, 2.0d) + Math.pow((double) i6, 2.0d), 0.5d);
                    if (pow > this.f19537f) {
                        int round = Math.round(((float) pow) / ((float) this.f19537f));
                        double abs = (double) Math.abs(i6);
                        double abs2 = (double) Math.abs(i5);
                        Double.isNaN(abs);
                        Double.isNaN(abs2);
                        double atan = Math.atan(abs / abs2);
                        double d = (double) this.f19537f;
                        double cos = Math.cos(atan);
                        Double.isNaN(d);
                        int i7 = (int) (d * cos);
                        double d2 = (double) this.f19537f;
                        double sin = Math.sin(atan);
                        Double.isNaN(d2);
                        int i8 = (int) (d2 * sin);
                        for (int i9 = 1; i9 <= round; i9++) {
                            if (i5 > 0) {
                                i = (i7 * i9) + i3;
                            } else {
                                i = i3 - (i7 * i9);
                            }
                            int i10 = i;
                            if (i6 > 0) {
                                i2 = (i8 * i9) + i4;
                            } else {
                                i2 = i4 - (i8 * i9);
                            }
                            C7648t tVar2 = new C7648t(i10, i2, this.f19538g, this.f19539h);
                            m14925a(tVar2);
                        }
                        if (this.f19546o != null) {
                            this.f19546o.mo13352a(this.f19535d, getWidth(), getHeight(), this.f19541j);
                        }
                        C4495a.m10823a().mo10301a((Object) new C7216a(this.f19535d.size(), this.f19541j));
                        break;
                    }
                } else {
                    C7648t tVar3 = new C7648t((int) motionEvent.getX(), (int) motionEvent.getY(), this.f19538g, this.f19539h);
                    m14925a(tVar3);
                    if (this.f19546o != null) {
                        this.f19546o.mo13352a(this.f19535d, getWidth(), getHeight(), this.f19541j);
                    }
                    C4495a.m10823a().mo10301a((Object) new C7216a(this.f19535d.size(), this.f19541j));
                    return true;
                }
                break;
        }
        return true;
    }

    public DoodleCanvasView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo13340a(long j, int i, ImageModel imageModel) {
        this.f19538g = j;
        this.f19539h = i;
        this.f19540i = imageModel;
    }

    public DoodleCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19544m = new Stack<>();
        this.f19545n = 0;
        this.f19532a = false;
        this.f19547p = new Runnable() {
            public final void run() {
                DoodleCanvasView.this.f19532a = false;
            }
        };
        this.f19534c = new Paint();
        this.f19534c.setAntiAlias(true);
        this.f19534c.setStyle(Style.FILL);
        this.f19535d = new ArrayList();
        this.f19536e = new C0785g<>();
        this.f19537f = (int) C9432q.m18687b(getContext(), 40.0f);
        this.f19533b = ((Integer) C6718b.f18309F.mo9431a()).intValue();
        this.f19543l = Color.parseColor("#51000000");
    }
}
