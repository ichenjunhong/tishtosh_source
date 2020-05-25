package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.a */
public abstract class C6640a extends ConstraintLayout {

    /* renamed from: A */
    private boolean f18123A;

    /* renamed from: B */
    private float f18124B;

    /* renamed from: C */
    private float f18125C;

    /* renamed from: D */
    private boolean f18126D;

    /* renamed from: h */
    protected final C8721u f18127h;

    /* renamed from: i */
    protected final boolean f18128i;

    /* renamed from: j */
    protected final C6642a f18129j;

    /* renamed from: k */
    public View f18130k;

    /* renamed from: l */
    protected final int[] f18131l = new int[4];

    /* renamed from: m */
    protected final int f18132m;

    /* renamed from: n */
    protected final int f18133n;

    /* renamed from: o */
    protected String f18134o;

    /* renamed from: p */
    public View f18135p;

    /* renamed from: q */
    private boolean f18136q;

    /* renamed from: r */
    private TextView f18137r;

    /* renamed from: s */
    private View f18138s;

    /* renamed from: t */
    private View f18139t;

    /* renamed from: u */
    private View f18140u;

    /* renamed from: v */
    private int[] f18141v;

    /* renamed from: w */
    private final int[] f18142w = new int[2];

    /* renamed from: x */
    private final int[] f18143x = new int[2];

    /* renamed from: y */
    private final Rect f18144y = new Rect();

    /* renamed from: z */
    private final Rect f18145z = new Rect();

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.a$a */
    public interface C6642a {
        /* renamed from: a */
        void mo12356a(String str, int i);

        /* renamed from: a */
        void mo12357a(boolean z);

        /* renamed from: b */
        void mo12358b(C8721u uVar);

        /* renamed from: g */
        void mo12360g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12757b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo12758c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo12759d();

    /* renamed from: e */
    public void mo12760e() {
        String str;
        if (this.f18127h != null) {
            str = this.f18127h.f23943d;
        } else {
            str = "";
        }
        this.f18134o = str;
    }

    public int getType() {
        if (this.f18127h != null) {
            return this.f18127h.f23946g;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo12761f() {
        if (this.f18129j != null) {
            this.f18129j.mo12358b(this.f18127h);
            this.f18129j.mo12360g();
        }
    }

    public C8721u getRoomDecoration() {
        if (this.f18127h == null) {
            return null;
        }
        this.f18127h.f23950k = this.f18132m;
        this.f18127h.f23951l = this.f18133n;
        return this.f18127h;
    }

    public JSONObject getDecorationInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", String.valueOf(this.f18127h.f23947h));
            jSONObject.put(C42311c.f106865i, this.f18134o);
            jSONObject.put("x", this.f18127h.f23948i);
            jSONObject.put("y", this.f18127h.f23949j);
            jSONObject.put("w", this.f18132m);
            jSONObject.put("h", this.f18133n);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: g */
    private boolean m14044g() {
        if (this.f18139t == null || this.f18135p == null) {
            return false;
        }
        this.f18135p.getLocationOnScreen(this.f18143x);
        m14040a(this.f18135p, this.f18144y, this.f18143x);
        this.f18144y.offset(0, this.f18135p.getMeasuredHeight() / 3);
        this.f18139t.getLocationOnScreen(this.f18142w);
        m14040a(this.f18139t, this.f18145z, this.f18142w);
        return this.f18144y.intersect(this.f18145z);
    }

    /* renamed from: b */
    public final void mo12756b() {
        if (this.f18135p != null) {
            if (this.f18135p.getX() < ((float) this.f18131l[2])) {
                this.f18135p.setX((float) this.f18131l[2]);
            } else if (this.f18135p.getX() + ((float) this.f18135p.getMeasuredWidth()) > ((float) this.f18131l[3])) {
                this.f18135p.setX((float) (this.f18131l[3] - this.f18135p.getMeasuredWidth()));
            }
            if (this.f18135p.getY() < ((float) this.f18131l[0])) {
                this.f18135p.setY((float) this.f18131l[0]);
                return;
            }
            if (this.f18135p.getY() + ((float) this.f18135p.getMeasuredHeight()) > ((float) this.f18131l[1])) {
                this.f18135p.setY((float) (this.f18131l[1] - this.f18135p.getMeasuredHeight()));
            }
        }
    }

    public void setText(String str) {
        this.f18134o = str;
    }

    /* renamed from: c */
    private void m14043c(boolean z) {
        if (this.f18129j != null && C3922z.m9916f()) {
            this.f18129j.mo12357a(z);
        }
    }

    /* renamed from: a */
    public final void mo12755a(int[] iArr) {
        if (iArr != null) {
            this.f18141v = iArr;
            m14041a(false);
        }
    }

    /* renamed from: b */
    private void m14042b(boolean z) {
        if (this.f18138s != null) {
            if (!z || this.f18138s.getVisibility() == 0) {
                if (!z && this.f18138s.getVisibility() != 4) {
                    this.f18138s.setVisibility(4);
                }
                return;
            }
            this.f18138s.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m14041a(final boolean z) {
        if (this.f18141v != null && this.f18130k != null) {
            this.f18131l[0] = this.f18141v[0];
            this.f18131l[2] = this.f18141v[2];
            this.f18131l[3] = this.f18141v[3];
            int i = this.f18133n - this.f18141v[1];
            LayoutParams layoutParams = this.f18130k.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
                this.f18130k.setLayoutParams(layoutParams);
                this.f18130k.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        C6640a.this.f18130k.removeOnLayoutChangeListener(this);
                        C6640a.this.f18131l[1] = C6640a.this.f18130k.getTop();
                        if (z) {
                            C6640a.this.f18135p = C6640a.this.mo12758c();
                            if (C6640a.this.f18135p != null) {
                                C6640a.this.addView(C6640a.this.f18135p);
                                C6640a.this.mo12757b(C6640a.this.f18135p);
                            }
                        } else {
                            C6640a.this.mo12756b();
                        }
                    }
                });
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        String str;
        int i;
        if (!this.f18128i || this.f18135p == null) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x < this.f18135p.getX() || x > this.f18135p.getX() + ((float) this.f18135p.getMeasuredWidth()) || y < this.f18135p.getY() || y > this.f18135p.getY() + ((float) this.f18135p.getMeasuredHeight())) {
                    this.f18126D = false;
                    return super.onTouchEvent(motionEvent);
                }
                this.f18124B = motionEvent.getX();
                this.f18125C = motionEvent.getY();
                this.f18126D = true;
                return true;
            case 1:
                if (!this.f18126D) {
                    return super.onTouchEvent(motionEvent);
                }
                if (m14044g()) {
                    mo12761f();
                } else if (this.f18136q) {
                    this.f18127h.f23948i = (int) (this.f18135p.getX() + ((float) (this.f18135p.getMeasuredWidth() / 2)));
                    this.f18127h.f23949j = (int) (this.f18135p.getY() + ((float) (this.f18135p.getMeasuredHeight() / 2)));
                    if (this.f18129j != null) {
                        this.f18129j.mo12360g();
                    }
                } else {
                    mo12759d();
                }
                this.f18126D = false;
                this.f18136q = false;
                m14042b(false);
                m14043c(false);
                return true;
            case 2:
                if (!this.f18126D) {
                    return super.onTouchEvent(motionEvent);
                }
                float y2 = motionEvent.getY() - this.f18125C;
                float x2 = this.f18135p.getX() + (motionEvent.getX() - this.f18124B);
                if (x2 < ((float) this.f18131l[2])) {
                    x2 = (float) this.f18131l[2];
                }
                if (((float) this.f18135p.getMeasuredWidth()) + x2 > ((float) this.f18131l[3])) {
                    x2 = (float) (this.f18131l[3] - this.f18135p.getMeasuredWidth());
                }
                if (x2 != this.f18135p.getX()) {
                    this.f18135p.setX(x2);
                    this.f18124B = motionEvent.getX();
                    this.f18136q = true;
                }
                float y3 = this.f18135p.getY() + y2;
                if (y3 < ((float) this.f18131l[0])) {
                    y3 = (float) this.f18131l[0];
                }
                if (((float) this.f18135p.getMeasuredHeight()) + y3 > ((float) this.f18131l[1])) {
                    y3 = (float) (this.f18131l[1] - this.f18135p.getMeasuredHeight());
                }
                if (y3 != this.f18135p.getY()) {
                    this.f18135p.setY(y3);
                    this.f18125C = motionEvent.getY();
                    this.f18136q = true;
                }
                boolean g = m14044g();
                if (g != this.f18123A) {
                    this.f18123A = g;
                    if (this.f18137r != null) {
                        TextView textView = this.f18137r;
                        if (g) {
                            i = R.drawable.e3h;
                        } else {
                            i = R.drawable.e3g;
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(0, i, 0, 0);
                    }
                    if (this.f18139t != null) {
                        View view = this.f18139t;
                        if (g) {
                            str = "#57FF3B5C";
                        } else {
                            str = "#57000000";
                        }
                        view.setBackgroundColor(Color.parseColor(str));
                    }
                }
                if (!(this.f18140u == null || this.f18135p == null)) {
                    if (this.f18135p.getY() + ((float) this.f18135p.getMeasuredHeight()) >= ((float) this.f18131l[1])) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && this.f18140u.getVisibility() != 0) {
                        this.f18140u.setVisibility(0);
                    } else if (!z && this.f18140u.getVisibility() != 4) {
                        this.f18140u.setVisibility(4);
                    }
                }
                m14043c(true);
                m14042b(true);
                return true;
            case 3:
                if (!this.f18126D) {
                    return super.onTouchEvent(motionEvent);
                }
                this.f18126D = false;
                this.f18136q = false;
                m14042b(false);
                m14043c(false);
                return true;
            default:
                if (!this.f18126D) {
                    return super.onTouchEvent(motionEvent);
                }
                return true;
        }
    }

    /* renamed from: a */
    private static void m14040a(View view, Rect rect, int[] iArr) {
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
    }

    public C6640a(Context context, C8721u uVar, boolean z, int[] iArr, C6642a aVar) {
        super(context);
        this.f18127h = uVar;
        this.f18128i = z;
        this.f18141v = iArr;
        this.f18129j = aVar;
        this.f18132m = C9432q.m18670a(getContext());
        this.f18133n = C9432q.m18688b(getContext());
        inflate(context, R.layout.ah6, this);
        this.f18138s = findViewById(R.id.b99);
        this.f18139t = findViewById(R.id.a48);
        this.f18130k = findViewById(R.id.m6);
        this.f18137r = (TextView) findViewById(R.id.a49);
        this.f18140u = findViewById(R.id.dzy);
        m14041a(true);
    }
}
