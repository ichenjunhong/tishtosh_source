package com.p683ss.android.ugc.aweme.effect;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.google.p1057b.p1058a.C17421k;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45237z;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekLayout */
public class VEEffectSeekLayout extends RelativeLayout {

    /* renamed from: a */
    VEEffectSeekBar f76237a;

    /* renamed from: b */
    public int f76238b;

    /* renamed from: c */
    ArrayList<EffectPointModel> f76239c;

    /* renamed from: d */
    public int f76240d;

    /* renamed from: e */
    public C45237z f76241e;

    /* renamed from: f */
    public int f76242f;

    /* renamed from: g */
    private TextView f76243g;

    /* renamed from: h */
    private TextView f76244h;

    /* renamed from: i */
    private FrameLayout f76245i;

    /* renamed from: j */
    private int f76246j;

    /* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekLayout$a */
    class C29086a implements OnTouchListener {

        /* renamed from: b */
        private FrameLayout f76248b;

        /* renamed from: c */
        private LayoutParams f76249c = ((LayoutParams) this.f76248b.getLayoutParams());

        /* renamed from: d */
        private int f76250d = 1;

        /* renamed from: a */
        private float m68532a(float f, int i) {
            int b = VEEffectSeekLayout.this.mo58916b(i);
            if (f < ((float) VEEffectSeekLayout.this.f76242f)) {
                return (float) (-VEEffectSeekLayout.this.f76238b);
            }
            if (f > ((float) (((int) C9432q.m18687b(VEEffectSeekLayout.this.getContext(), (float) (VEEffectSeekLayout.this.f76240d - 24))) - b))) {
                return ((C9432q.m18687b(VEEffectSeekLayout.this.getContext(), (float) VEEffectSeekLayout.this.f76240d) - ((float) (VEEffectSeekLayout.this.f76242f * 2))) - ((float) b)) + ((float) VEEffectSeekLayout.this.f76238b);
            }
            float f2 = f - ((float) VEEffectSeekLayout.this.f76242f);
            return f2 + (((float) VEEffectSeekLayout.this.f76238b) * (((2.0f * f2) / ((C9432q.m18687b(VEEffectSeekLayout.this.getContext(), (float) VEEffectSeekLayout.this.f76240d) - ((float) (VEEffectSeekLayout.this.f76242f * 2))) - ((float) b))) - 4.0f));
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f76249c.setMargins(Math.round(m68532a(motionEvent.getRawX(), this.f76250d)), 0, 0, 0);
                    this.f76248b.setLayoutParams(this.f76249c);
                    if (VEEffectSeekLayout.this.f76241e != null) {
                        VEEffectSeekLayout.this.f76241e.mo58981a(VEEffectSeekLayout.this.mo58909a(this.f76248b, this.f76250d), this.f76250d, 1);
                        break;
                    }
                    break;
                case 1:
                case 3:
                    if (VEEffectSeekLayout.this.f76241e != null) {
                        VEEffectSeekLayout.this.f76241e.mo58981a(VEEffectSeekLayout.this.mo58909a(this.f76248b, this.f76250d), this.f76250d, 2);
                        break;
                    }
                    break;
                case 2:
                    this.f76249c.setMargins(Math.round(m68532a(motionEvent.getRawX(), this.f76250d)), 0, 0, 0);
                    this.f76248b.setLayoutParams(this.f76249c);
                    if (this.f76250d == 1) {
                        VEEffectSeekLayout.this.setStartTime(VEEffectSeekLayout.this.getCursorPosition());
                    }
                    if (VEEffectSeekLayout.this.f76241e != null) {
                        VEEffectSeekLayout.this.f76241e.mo58981a(VEEffectSeekLayout.this.mo58909a(this.f76248b, this.f76250d), this.f76250d, 3);
                        break;
                    }
                    break;
            }
            return true;
        }

        C29086a(FrameLayout frameLayout, int i) {
            this.f76248b = frameLayout;
        }
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        return this.f76239c;
    }

    public int getCursorPosition() {
        return mo58909a(this.f76245i, 1);
    }

    public int getCursorOffsetTime() {
        return (int) ((((float) ((int) C9432q.m18687b(getContext(), 21.0f))) / ((float) C29197f.f76504a)) * ((float) this.f76246j));
    }

    public void setOnCursorSeekListener(C45237z zVar) {
        this.f76241e = zVar;
    }

    public VEEffectSeekLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo58914a(boolean z) {
        this.f76237a.mo58902a(z);
    }

    /* renamed from: c */
    public final void mo58917c(int i) {
        mo58911a(i, 1);
    }

    public void setNormalColor(int i) {
        this.f76237a.setNormalColor(i);
    }

    public void setOverlayColor(int i) {
        this.f76237a.setOverlayColor(i);
    }

    /* renamed from: b */
    public final int mo58916b(int i) {
        if (i == 1) {
            return (int) C9432q.m18687b(getContext(), 4.0f);
        }
        return (int) C9432q.m18687b(getContext(), 30.0f);
    }

    public void setStartTime(int i) {
        if (i > this.f76246j - getCursorOffsetTime()) {
            i = this.f76246j;
        }
        this.f76244h.setText(m68522d(i));
    }

    public void setVideoDuration(int i) {
        if (this.f76237a != null) {
            this.f76246j = i;
            this.f76237a.setDuration(i);
            this.f76243g.setText(m68522d(i));
        }
    }

    /* renamed from: d */
    private static String m68522d(int i) {
        StringBuilder sb = new StringBuilder();
        double d = (double) i;
        Double.isNaN(d);
        sb.append((int) Math.floor(d / 1000.0d));
        String sb2 = sb.toString();
        if (sb2.length() < 2) {
            StringBuilder sb3 = new StringBuilder("0");
            sb3.append(sb2);
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("00:");
        sb4.append(sb2);
        return sb4.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public EffectPointModel mo58910a(int i) {
        try {
            ArrayList<EffectPointModel> arrayList = this.f76239c;
            C29151bk bkVar = new C29151bk(i);
            Iterator it = arrayList.iterator();
            C17421k.m42653a(it);
            C17421k.m42653a(bkVar);
            while (it.hasNext()) {
                Object next = it.next();
                if (bkVar.apply(next)) {
                    return (EffectPointModel) next;
                }
            }
            throw new NoSuchElementException();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public VEEffectSeekLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo58915a(boolean z, int i) {
        this.f76237a.mo58903a(z, i);
    }

    /* renamed from: a */
    public final void mo58913a(List<EffectPointModel> list, boolean z) {
        this.f76239c.clear();
        this.f76239c.addAll(list);
        this.f76237a.mo58901a(this.f76239c, z);
    }

    /* renamed from: a */
    public final int mo58909a(FrameLayout frameLayout, int i) {
        int i2 = 0;
        if (frameLayout == null) {
            return 0;
        }
        int left = (int) ((((float) (frameLayout.getLeft() - this.f76242f)) / ((float) C29197f.f76504a)) * ((float) this.f76246j));
        int b = (int) ((((float) mo58916b(i)) / ((float) C29197f.f76504a)) * ((float) this.f76246j));
        if (left >= 0) {
            if (left > this.f76246j - b) {
                i2 = this.f76246j;
            } else {
                i2 = left;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo58911a(int i, int i2) {
        int b = C29197f.f76504a - mo58916b(1);
        int i3 = (int) ((((float) i) / ((float) this.f76246j)) * ((float) b));
        if (i3 >= b) {
            i3 = this.f76238b + b;
        }
        if (i3 <= 0) {
            i3 = -this.f76238b;
        }
        LayoutParams layoutParams = (LayoutParams) this.f76245i.getLayoutParams();
        layoutParams.setMargins(i3, 0, 0, 0);
        this.f76245i.setLayoutParams(layoutParams);
        setStartTime(i);
    }

    public VEEffectSeekLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76240d = C9432q.m18692c(context, (float) C9432q.m18670a(context));
        this.f76238b = (int) C9432q.m18687b(context, 0.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ip, R.attr.iq, R.attr.j6, R.attr.j7, R.attr.mi, R.attr.mj, R.attr.s7, R.attr.acz, R.attr.ad0, R.attr.vq, R.attr.a1z, R.attr.adk, R.attr.adl});
            this.f76242f = Math.round(obtainStyledAttributes.getDimension(6, 0.0f));
            obtainStyledAttributes.recycle();
        }
        if (VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
        }
        LayoutInflater.from(getContext()).inflate(R.layout.gl, this);
        this.f76239c = new ArrayList<>();
        this.f76237a = (VEEffectSeekBar) findViewById(R.id.a_3);
        this.f76243g = (TextView) findViewById(R.id.d9x);
        this.f76244h = (TextView) findViewById(R.id.dgd);
        this.f76245i = (FrameLayout) findViewById(R.id.cdf);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.uq});
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        this.f76237a.setNormalColor(color);
        this.f76245i.setOnTouchListener(new C29086a(this.f76245i, 1));
        LayoutParams layoutParams = (LayoutParams) this.f76245i.getLayoutParams();
        layoutParams.setMargins(-this.f76238b, 0, 0, 0);
        this.f76245i.setLayoutParams(layoutParams);
        ((ImageView) findViewById(R.id.d8t)).setImageDrawable(C42430at.m93196a(0, -1, 1, (int) C9432q.m18687b(getContext(), 2.0f)));
        findViewById(R.id.lk).setBackground(C42430at.m93196a(C46788b.f118235d.mo94011b(false), 0, (int) C9432q.m18687b(getContext(), 1.0f), 0));
        View findViewById = findViewById(R.id.a_4);
        LayoutParams layoutParams2 = (LayoutParams) findViewById.getLayoutParams();
        int i2 = this.f76242f;
        layoutParams2.rightMargin = i2;
        layoutParams2.leftMargin = i2;
        findViewById.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public final void mo58912a(int i, long j, int i2, boolean z) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setIndex(i);
        int i3 = (int) j;
        effectPointModel.setUiStartPoint(i3);
        effectPointModel.setUiEndPoint(i3);
        effectPointModel.setSelectedColor(i2);
        effectPointModel.setFromEnd(z);
        this.f76239c.add(effectPointModel);
        this.f76237a.mo58901a(this.f76239c, z);
    }
}
