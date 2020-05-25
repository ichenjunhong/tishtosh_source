package com.bytedance.ies.dmt.p664ui.p666b;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10657o.C10658a;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.b.a */
public final class C10641a {

    /* renamed from: h */
    public static float f28183h = 0.5f;

    /* renamed from: j */
    private static final Float f28184j = Float.valueOf(17.0f);

    /* renamed from: k */
    private static final Float f28185k = Float.valueOf(15.0f);

    /* renamed from: l */
    private static final Float f28186l = Float.valueOf(0.75f);

    /* renamed from: m */
    private static final Float f28187m = Float.valueOf(16.0f);

    /* renamed from: n */
    private static final Float f28188n = Float.valueOf(8.0f);

    /* renamed from: o */
    private static final Float f28189o = Float.valueOf(20.0f);

    /* renamed from: p */
    private static final Float f28190p = Float.valueOf(2.0f);

    /* renamed from: q */
    private static final Float f28191q = Float.valueOf(8.0f);

    /* renamed from: r */
    private static final Float f28192r = Float.valueOf(15.0f);

    /* renamed from: A */
    private DmtTextView f28193A;

    /* renamed from: B */
    private DmtTextView f28194B;

    /* renamed from: C */
    private CharSequence f28195C;

    /* renamed from: D */
    private ImageView f28196D;

    /* renamed from: E */
    private ImageView f28197E;

    /* renamed from: F */
    private View f28198F;

    /* renamed from: G */
    private View f28199G;

    /* renamed from: H */
    private View f28200H;

    /* renamed from: I */
    private View f28201I;

    /* renamed from: J */
    private View f28202J;

    /* renamed from: K */
    private View f28203K;

    /* renamed from: L */
    private FrameLayout f28204L;

    /* renamed from: M */
    private FrameLayout f28205M;

    /* renamed from: N */
    private FrameLayout f28206N;

    /* renamed from: O */
    private FrameLayout f28207O;

    /* renamed from: P */
    private FrameLayout f28208P;

    /* renamed from: Q */
    private LinearLayout f28209Q;

    /* renamed from: R */
    private RelativeLayout f28210R;

    /* renamed from: S */
    private RelativeLayout f28211S;

    /* renamed from: T */
    private String f28212T;

    /* renamed from: U */
    private String f28213U;

    /* renamed from: V */
    private String f28214V;

    /* renamed from: W */
    private String f28215W;

    /* renamed from: X */
    private String f28216X;

    /* renamed from: Y */
    private String f28217Y;

    /* renamed from: Z */
    private int f28218Z;

    /* renamed from: a */
    RelativeLayout f28219a;

    /* renamed from: aa */
    private int f28220aa;

    /* renamed from: ab */
    private int f28221ab;

    /* renamed from: ac */
    private int f28222ac;

    /* renamed from: ad */
    private int f28223ad;

    /* renamed from: ae */
    private OnClickListener f28224ae;

    /* renamed from: af */
    private boolean f28225af;

    /* renamed from: ag */
    private boolean f28226ag;

    /* renamed from: ah */
    private boolean f28227ah;

    /* renamed from: ai */
    private boolean f28228ai;

    /* renamed from: aj */
    private boolean f28229aj;

    /* renamed from: ak */
    private boolean f28230ak;

    /* renamed from: al */
    private int f28231al;

    /* renamed from: am */
    private C10658a f28232am;

    /* renamed from: an */
    private OnDismissListener f28233an;

    /* renamed from: ao */
    private OnShowListener f28234ao;

    /* renamed from: ap */
    private int f28235ap;

    /* renamed from: aq */
    private int f28236aq;

    /* renamed from: ar */
    private boolean f28237ar;

    /* renamed from: as */
    private View f28238as;

    /* renamed from: at */
    private View f28239at;

    /* renamed from: au */
    private boolean f28240au;

    /* renamed from: b */
    DialogInterface.OnClickListener f28241b;

    /* renamed from: c */
    DialogInterface.OnClickListener f28242c;

    /* renamed from: d */
    DialogInterface.OnClickListener f28243d;

    /* renamed from: e */
    boolean f28244e;

    /* renamed from: f */
    boolean f28245f;

    /* renamed from: g */
    boolean f28246g;

    /* renamed from: i */
    AlertDialog f28247i;

    /* renamed from: s */
    private Context f28248s;

    /* renamed from: t */
    private DmtTextView f28249t;

    /* renamed from: u */
    private DmtTextView f28250u;

    /* renamed from: v */
    private DmtTextView f28251v;

    /* renamed from: w */
    private DmtTextView f28252w;

    /* renamed from: x */
    private DmtTextView f28253x;

    /* renamed from: y */
    private DmtTextView f28254y;

    /* renamed from: z */
    private DmtTextView f28255z;

    /* renamed from: com.bytedance.ies.dmt.ui.b.a$a */
    public static class C10643a {

        /* renamed from: A */
        public boolean f28256A;

        /* renamed from: B */
        public boolean f28257B;

        /* renamed from: C */
        public boolean f28258C;

        /* renamed from: D */
        public boolean f28259D;

        /* renamed from: E */
        public boolean f28260E;

        /* renamed from: F */
        public boolean f28261F;

        /* renamed from: G */
        public boolean f28262G;

        /* renamed from: H */
        public int f28263H = 17;

        /* renamed from: I */
        public DmtTextView f28264I;

        /* renamed from: J */
        public int f28265J;

        /* renamed from: K */
        public int f28266K;

        /* renamed from: L */
        public boolean f28267L = true;

        /* renamed from: M */
        public boolean f28268M = true;

        /* renamed from: N */
        public boolean f28269N;

        /* renamed from: a */
        public String f28270a;

        /* renamed from: b */
        public String f28271b;

        /* renamed from: c */
        public String f28272c;

        /* renamed from: d */
        public String f28273d;

        /* renamed from: e */
        public String f28274e;

        /* renamed from: f */
        public String f28275f;

        /* renamed from: g */
        public CharSequence f28276g;

        /* renamed from: h */
        public int f28277h;

        /* renamed from: i */
        public int f28278i;

        /* renamed from: j */
        public int f28279j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f28280k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f28281l;

        /* renamed from: m */
        public DialogInterface.OnClickListener f28282m;

        /* renamed from: n */
        public OnDismissListener f28283n;

        /* renamed from: o */
        public OnShowListener f28284o;

        /* renamed from: p */
        public C10658a f28285p;

        /* renamed from: q */
        public OnClickListener f28286q;

        /* renamed from: r */
        public Context f28287r;

        /* renamed from: s */
        public View f28288s;

        /* renamed from: t */
        public View f28289t;

        /* renamed from: u */
        public View f28290u;

        /* renamed from: v */
        public View f28291v;

        /* renamed from: w */
        public View f28292w;

        /* renamed from: x */
        public int f28293x;

        /* renamed from: y */
        public int f28294y;

        /* renamed from: z */
        public boolean f28295z;

        /* renamed from: b */
        public final C10643a mo18898b() {
            this.f28261F = true;
            return this;
        }

        /* renamed from: c */
        public final C10643a mo18906c() {
            this.f28260E = true;
            return this;
        }

        /* renamed from: a */
        public final C10641a mo18897a() {
            return new C10641a(this);
        }

        /* renamed from: a */
        public final C10643a mo18896a(boolean z) {
            this.f28256A = z;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18895a(String str, OnClickListener onClickListener) {
            this.f28272c = str;
            this.f28286q = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18888a(OnDismissListener onDismissListener) {
            this.f28283n = onDismissListener;
            return this;
        }

        /* renamed from: d */
        public final C10643a mo18910d(int i) {
            this.f28293x = i;
            return this;
        }

        /* renamed from: f */
        public final C10643a mo18912f(int i) {
            this.f28279j = i;
            return this;
        }

        /* renamed from: c */
        public final C10643a mo18907c(int i) {
            this.f28277h = i;
            return this;
        }

        /* renamed from: e */
        public final C10643a mo18911e(int i) {
            this.f28294y = R.style.mp;
            return this;
        }

        public C10643a(Context context) {
            this.f28287r = context;
        }

        /* renamed from: a */
        public final C10643a mo18885a(int i) {
            this.f28270a = this.f28287r.getString(i);
            return this;
        }

        /* renamed from: b */
        public final C10643a mo18899b(int i) {
            this.f28271b = this.f28287r.getString(i);
            return this;
        }

        /* renamed from: b */
        public final C10643a mo18902b(String str) {
            this.f28271b = str;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18890a(C10658a aVar) {
            this.f28285p = aVar;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18891a(DmtTextView dmtTextView) {
            this.f28264I = dmtTextView;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18892a(String str) {
            this.f28270a = str;
            return this;
        }

        /* renamed from: b */
        public final C10643a mo18905b(boolean z) {
            this.f28267L = z;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18886a(int i, DialogInterface.OnClickListener onClickListener) {
            return mo18887a(i, onClickListener, false);
        }

        /* renamed from: b */
        public final C10643a mo18900b(int i, DialogInterface.OnClickListener onClickListener) {
            return mo18901b(i, onClickListener, false);
        }

        /* renamed from: c */
        public final C10643a mo18908c(String str, DialogInterface.OnClickListener onClickListener) {
            return mo18909c(str, onClickListener, false);
        }

        /* renamed from: b */
        public final C10643a mo18903b(String str, DialogInterface.OnClickListener onClickListener) {
            return mo18904b(str, onClickListener, false);
        }

        /* renamed from: a */
        public final C10643a mo18893a(String str, DialogInterface.OnClickListener onClickListener) {
            return mo18894a(str, onClickListener, false);
        }

        /* renamed from: a */
        public final C10643a mo18887a(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
            return mo18894a(this.f28287r.getString(i), onClickListener, z);
        }

        /* renamed from: b */
        public final C10643a mo18901b(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
            return mo18904b(this.f28287r.getString(i), onClickListener, z);
        }

        /* renamed from: c */
        public final C10643a mo18909c(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f28275f = str;
            this.f28282m = onClickListener;
            this.f28259D = z;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18889a(View view, int i, int i2) {
            this.f28291v = view;
            this.f28265J = 48;
            this.f28266K = 48;
            return this;
        }

        /* renamed from: b */
        public final C10643a mo18904b(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f28274e = str;
            this.f28281l = onClickListener;
            this.f28258C = z;
            return this;
        }

        /* renamed from: a */
        public final C10643a mo18894a(String str, DialogInterface.OnClickListener onClickListener, boolean z) {
            this.f28273d = str;
            this.f28280k = onClickListener;
            this.f28257B = z;
            return this;
        }
    }

    public final void dismiss() {
        if (this.f28247i != null) {
            this.f28247i.dismiss();
        }
    }

    /* renamed from: d */
    private int m21429d() {
        int b = (int) C9432q.m18687b(this.f28248s, 360.0f);
        double a = (double) C9432q.m18670a(this.f28248s);
        Double.isNaN(a);
        int i = (int) (a * 0.8d);
        if (i > b) {
            return b;
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo18881a() {
        if (this.f28247i != null) {
            return this.f28247i.isShowing();
        }
        return false;
    }

    /* renamed from: b */
    public final Dialog mo18882b() {
        Builder builder;
        if (this.f28223ad == 0) {
            builder = new Builder(this.f28248s, R.style.ts);
        } else {
            builder = new Builder(this.f28248s, this.f28223ad);
        }
        if (!TextUtils.isEmpty(this.f28212T)) {
            builder.setTitle(this.f28212T);
        }
        if (!TextUtils.isEmpty(this.f28195C)) {
            builder.setMessage(this.f28195C);
        } else if (!TextUtils.isEmpty(this.f28213U)) {
            builder.setMessage(this.f28213U);
        }
        builder.setPositiveButton(this.f28215W, new C10644b(this));
        if (!TextUtils.isEmpty(this.f28217Y)) {
            builder.setNeutralButton(this.f28217Y, new C10645c(this));
        }
        if (!TextUtils.isEmpty(this.f28216X)) {
            builder.setNegativeButton(this.f28216X, new C10649g(this));
        }
        builder.setCancelable(this.f28237ar);
        this.f28247i = builder.create();
        if (this.f28233an != null) {
            this.f28247i.setOnDismissListener(this.f28233an);
        }
        if (this.f28234ao != null) {
            this.f28247i.setOnShowListener(this.f28234ao);
        }
        m21426a(this.f28247i);
        try {
            this.f28247i.show();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(this.f28212T)) {
            int identifier = this.f28248s.getResources().getIdentifier("alertTitle", "id", "android");
            if (identifier > 0) {
                C10749b.m21787a().mo19438a((TextView) this.f28247i.getWindow().findViewById(identifier), C10751d.f28908g);
            }
        }
        if (!TextUtils.isEmpty(this.f28213U)) {
            C10749b.m21787a().mo19438a((TextView) this.f28247i.getWindow().findViewById(16908299), C10751d.f28902a);
        }
        Button button = this.f28247i.getButton(-1);
        if (button != null) {
            button.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
        }
        Button button2 = this.f28247i.getButton(-2);
        if (button2 != null) {
            button2.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
        }
        return this.f28247i;
    }

    /* renamed from: c */
    public final Dialog mo18883c() {
        Builder builder;
        int i;
        int i2;
        int i3;
        this.f28219a.setAlpha(0.0f);
        if (this.f28223ad == 0) {
            builder = new Builder(this.f28248s);
        } else {
            builder = new Builder(this.f28248s, this.f28223ad);
        }
        this.f28239at.setVisibility(0);
        if (this.f28194B != null) {
            this.f28250u.setVisibility(8);
            this.f28194B.setTextColor(this.f28248s.getResources().getColor(R.color.aoo));
            this.f28194B.setTextSize(1, 15.0f);
            this.f28194B.setFontType(C10751d.f28902a);
            int b = (int) C9432q.m18687b(this.f28248s, 8.0f);
            this.f28194B.setPadding(b, 0, b, 0);
            this.f28194B.setGravity(17);
            this.f28250u = this.f28194B;
            this.f28205M.addView(this.f28250u);
        } else {
            this.f28250u.setVisibility(0);
            if (!TextUtils.isEmpty(this.f28195C)) {
                this.f28250u.setText(this.f28195C);
            } else if (!TextUtils.isEmpty(this.f28213U)) {
                this.f28250u.setText(this.f28213U);
            } else {
                this.f28239at.setVisibility(8);
            }
            this.f28250u.setGravity(this.f28231al);
        }
        if (!TextUtils.isEmpty(this.f28212T)) {
            this.f28249t.setText(this.f28212T);
            this.f28250u.setTextSize(1, f28185k.floatValue());
            this.f28250u.setTextColor(this.f28248s.getResources().getColor(R.color.aog));
        } else {
            this.f28250u.setTextSize(1, f28184j.floatValue());
            this.f28250u.setTextColor(this.f28248s.getResources().getColor(R.color.aof));
        }
        if (this.f28214V != null) {
            this.f28251v.setVisibility(0);
            this.f28251v.setText(this.f28214V);
            if (this.f28224ae != null) {
                this.f28251v.setTextColor(this.f28248s.getResources().getColor(R.color.ao7));
                this.f28251v.setOnClickListener(this.f28224ae);
            }
            if (VERSION.SDK_INT >= 17) {
                this.f28251v.setCompoundDrawablesRelativeWithIntrinsicBounds(this.f28220aa, 0, this.f28221ab, 0);
            } else {
                this.f28251v.setCompoundDrawablesWithIntrinsicBounds(this.f28220aa, 0, this.f28221ab, 0);
            }
        }
        this.f28253x.setText(this.f28215W);
        this.f28204L.setBackgroundColor(this.f28222ac);
        if (this.f28222ac != 0) {
            this.f28204L.getLayoutParams().height = (int) C9432q.m18687b(this.f28248s, 140.0f);
        }
        if (this.f28226ag) {
            this.f28197E.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f28216X)) {
            this.f28252w.setVisibility(8);
            this.f28255z.setVisibility(8);
            this.f28253x.setBackgroundResource(R.drawable.c9l);
        } else {
            this.f28252w.setText(this.f28216X);
        }
        if (TextUtils.isEmpty(this.f28217Y)) {
            this.f28252w.setTextColor(this.f28248s.getResources().getColor(R.color.jl));
            this.f28252w.setFontType(C10751d.f28902a);
            this.f28254y.setVisibility(8);
            this.f28193A.setVisibility(8);
        } else {
            this.f28254y.setText(this.f28217Y);
        }
        if (this.f28228ai) {
            if (this.f28227ah) {
                this.f28201I.setVisibility(8);
                this.f28255z.setVisibility(8);
                this.f28193A.setVisibility(8);
                this.f28253x.setBackground(this.f28248s.getResources().getDrawable(R.drawable.dvb));
                int b2 = (int) C9432q.m18687b(this.f28248s, f28189o.floatValue());
                int b3 = (int) C9432q.m18687b(this.f28248s, f28190p.floatValue());
                LayoutParams layoutParams = new LayoutParams(this.f28253x.getLayoutParams());
                layoutParams.setMargins(b2, b3, b2, b3);
                this.f28253x.setLayoutParams(layoutParams);
                this.f28253x.setTextColor(this.f28248s.getResources().getColor(R.color.aso));
                if (TextUtils.isEmpty(this.f28216X) || TextUtils.isEmpty(this.f28217Y)) {
                    i3 = (int) C9432q.m18687b(this.f28248s, f28187m.floatValue());
                } else {
                    i3 = (int) C9432q.m18687b(this.f28248s, f28188n.floatValue());
                }
                this.f28209Q.setPadding(0, 0, 0, i3);
                this.f28252w.setBackground(null);
                this.f28254y.setBackground(null);
                C10705c.m21580a(this.f28252w, f28186l.floatValue());
                C10705c.m21580a(this.f28254y, f28186l.floatValue());
            } else {
                this.f28253x.setTextColor(this.f28248s.getResources().getColor(R.color.b51));
            }
        }
        if (this.f28199G != null) {
            this.f28250u.setVisibility(8);
            this.f28249t.setVisibility(8);
            ((MarginLayoutParams) this.f28201I.getLayoutParams()).topMargin = 0;
            this.f28210R.removeAllViews();
            this.f28210R.addView(this.f28199G);
        }
        if (this.f28202J != null) {
            this.f28204L.setVisibility(8);
            this.f28211S.setVisibility(0);
            this.f28211S.removeAllViews();
            this.f28211S.addView(this.f28202J);
        }
        if (TextUtils.isEmpty(this.f28212T)) {
            this.f28249t.setVisibility(8);
            LayoutParams layoutParams2 = (LayoutParams) this.f28239at.getLayoutParams();
            if (this.f28238as == null || this.f28200H != null || this.f28218Z > 0) {
                layoutParams2.topMargin = (int) C9432q.m18687b(this.f28248s, 24.0f);
            } else {
                layoutParams2.topMargin = (int) C9432q.m18687b(this.f28248s, 16.0f);
            }
            this.f28239at.setLayoutParams(layoutParams2);
        }
        if (this.f28200H != null) {
            this.f28204L.removeView(this.f28196D);
            this.f28204L.addView(this.f28200H, 0, new FrameLayout.LayoutParams(-1, -1));
        } else if (this.f28218Z > 0) {
            this.f28196D.setImageResource(this.f28218Z);
        } else if (this.f28238as != null) {
            this.f28204L.setVisibility(8);
            this.f28206N.setVisibility(0);
            if (this.f28235ap == 0) {
                i = -2;
            } else {
                i = (int) C9432q.m18687b(this.f28248s, (float) this.f28235ap);
            }
            if (this.f28236aq == 0) {
                i2 = -2;
            } else {
                i2 = (int) C9432q.m18687b(this.f28248s, (float) this.f28236aq);
            }
            this.f28207O.addView(this.f28238as, 0, new FrameLayout.LayoutParams(i, i2));
            LayoutParams layoutParams3 = (LayoutParams) this.f28249t.getLayoutParams();
            layoutParams3.setMargins(0, (int) C9432q.m18687b(this.f28248s, 16.0f), 0, 0);
            this.f28249t.setLayoutParams(layoutParams3);
        } else {
            this.f28204L.setVisibility(8);
        }
        if (this.f28240au) {
            this.f28197E.setImageResource(R.drawable.d4c);
        }
        if (this.f28203K != null) {
            this.f28239at.setVisibility(8);
            this.f28249t.setTextSize(1, f28184j.floatValue());
            this.f28208P.setVisibility(0);
            this.f28208P.addView(this.f28203K, 0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (!this.f28229aj) {
            mo18880a(Boolean.valueOf(false));
        }
        if (this.f28230ak) {
            if (TextUtils.isEmpty(this.f28213U)) {
                this.f28249t.setTextSize(1, f28184j.floatValue());
            }
            this.f28253x.setTextColor(this.f28248s.getResources().getColor(R.color.avn));
            this.f28253x.setBackground(this.f28248s.getResources().getDrawable(R.drawable.e44));
            this.f28252w.setTextColor(this.f28248s.getResources().getColor(R.color.avn));
            this.f28252w.setBackground(this.f28248s.getResources().getDrawable(R.drawable.e44));
            int b4 = (int) C9432q.m18687b(this.f28248s, f28189o.floatValue());
            int b5 = (int) C9432q.m18687b(this.f28248s, f28190p.floatValue());
            LayoutParams layoutParams4 = new LayoutParams(this.f28252w.getLayoutParams());
            layoutParams4.setMargins(b4, b5, b4, b5);
            this.f28252w.setLayoutParams(layoutParams4);
        }
        builder.setCancelable(this.f28237ar);
        this.f28247i = builder.create();
        if (this.f28233an != null) {
            this.f28247i.setOnDismissListener(this.f28233an);
        }
        if (this.f28234ao != null) {
            this.f28247i.setOnShowListener(this.f28234ao);
        }
        m21426a(this.f28247i);
        this.f28252w.setOnClickListener(new C10650h(this));
        this.f28253x.setOnClickListener(new C10651i(this));
        this.f28254y.setOnClickListener(new C10652j(this));
        this.f28197E.setOnClickListener(new C10653k(this));
        AlertDialog alertDialog = this.f28247i;
        try {
            m21428a(true, this.f28219a);
            alertDialog.show();
            alertDialog.setContentView(this.f28198F);
            Window window = alertDialog.getWindow();
            window.setWindowAnimations(R.style.a5b);
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = f28183h;
                window.addFlags(2);
                attributes.gravity = 1;
                attributes.width = m21429d();
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
        return this.f28247i;
    }

    /* renamed from: a */
    static void m21427a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m21426a(AlertDialog alertDialog) {
        if (this.f28232am != null && alertDialog.getWindow() != null && alertDialog.getWindow().getCallback() != null) {
            C10657o oVar = new C10657o(alertDialog.getWindow().getCallback());
            oVar.f28312a = this.f28232am;
            alertDialog.getWindow().setCallback(oVar);
        }
    }

    /* renamed from: a */
    public final void mo18880a(Boolean bool) {
        if (this.f28228ai) {
            if (bool.booleanValue()) {
                this.f28253x.setTextColor(this.f28248s.getResources().getColor(R.color.auk));
                this.f28253x.setBackground(this.f28248s.getResources().getDrawable(R.drawable.dvb));
            } else {
                this.f28253x.setTextColor(this.f28248s.getResources().getColor(R.color.avo));
                this.f28253x.setBackgroundColor(this.f28248s.getResources().getColor(R.color.atw));
            }
        }
        this.f28253x.setEnabled(bool.booleanValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0136, code lost:
        if (r3 > r7) goto L_0x0138;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C10641a(com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.f28237ar = r0
            android.content.Context r1 = r7.f28287r
            r6.f28248s = r1
            int r1 = r7.f28277h
            r6.f28218Z = r1
            java.lang.String r1 = r7.f28270a
            r6.f28212T = r1
            java.lang.String r1 = r7.f28271b
            r6.f28213U = r1
            java.lang.String r1 = r7.f28272c
            r6.f28214V = r1
            java.lang.String r1 = r7.f28274e
            r6.f28216X = r1
            java.lang.String r1 = r7.f28273d
            r6.f28215W = r1
            java.lang.String r1 = r7.f28275f
            r6.f28217Y = r1
            android.content.DialogInterface$OnClickListener r1 = r7.f28280k
            r6.f28241b = r1
            android.content.DialogInterface$OnClickListener r1 = r7.f28281l
            r6.f28242c = r1
            android.content.DialogInterface$OnClickListener r1 = r7.f28282m
            r6.f28243d = r1
            android.view.View r1 = r7.f28290u
            r6.f28202J = r1
            android.view.View r1 = r7.f28288s
            r6.f28199G = r1
            android.view.View r1 = r7.f28289t
            r6.f28200H = r1
            int r1 = r7.f28293x
            r6.f28222ac = r1
            int r1 = r7.f28294y
            r6.f28223ad = r1
            boolean r1 = r7.f28295z
            r6.f28225af = r1
            boolean r1 = r7.f28256A
            r6.f28226ag = r1
            boolean r1 = r7.f28258C
            r6.f28245f = r1
            boolean r1 = r7.f28257B
            r6.f28244e = r1
            boolean r1 = r7.f28259D
            r6.f28246g = r1
            int r1 = r7.f28263H
            r6.f28231al = r1
            boolean r1 = r7.f28260E
            r6.f28227ah = r1
            boolean r1 = r7.f28261F
            r6.f28228ai = r1
            android.view.View$OnClickListener r1 = r7.f28286q
            r6.f28224ae = r1
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f28264I
            r6.f28194B = r1
            java.lang.CharSequence r1 = r7.f28276g
            r6.f28195C = r1
            android.content.DialogInterface$OnDismissListener r1 = r7.f28283n
            r6.f28233an = r1
            com.bytedance.ies.dmt.ui.b.o$a r1 = r7.f28285p
            r6.f28232am = r1
            int r1 = r7.f28278i
            r6.f28220aa = r1
            int r1 = r7.f28279j
            r6.f28221ab = r1
            android.content.DialogInterface$OnShowListener r1 = r7.f28284o
            r6.f28234ao = r1
            int r1 = r7.f28265J
            r6.f28235ap = r1
            int r1 = r7.f28266K
            r6.f28236aq = r1
            boolean r1 = r7.f28267L
            r6.f28237ar = r1
            android.view.View r1 = r7.f28291v
            r6.f28238as = r1
            boolean r1 = r7.f28269N
            r6.f28240au = r1
            android.view.View r1 = r7.f28292w
            r6.f28203K = r1
            boolean r1 = r7.f28268M
            r6.f28229aj = r1
            boolean r7 = r7.f28262G
            r6.f28230ak = r7
            boolean r7 = r6.f28227ah
            if (r7 != 0) goto L_0x013e
            java.lang.String r7 = r6.f28216X
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x013e
            int r7 = r6.m21429d()
            float r7 = (float) r7
            android.content.Context r1 = r6.f28248s
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r2)
            float r7 = r7 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r1
            android.content.Context r2 = r6.f28248s
            java.lang.Float r3 = f28191q
            float r3 = r3.floatValue()
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            float r2 = r2 * r1
            float r7 = r7 - r2
            java.lang.String r1 = r6.f28215W
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x00dd
            r1 = 0
            goto L_0x0102
        L_0x00dd:
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            android.content.Context r4 = r6.f28248s
            java.lang.Float r5 = f28192r
            float r5 = r5.floatValue()
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            r2.setTextSize(r4)
            com.bytedance.ies.dmt.ui.widget.util.b r4 = com.bytedance.ies.dmt.p664ui.widget.util.C10749b.m21787a()
            java.lang.String r5 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28903b
            android.graphics.Typeface r4 = r4.mo19435a(r5)
            r2.setTypeface(r4)
            float r1 = r2.measureText(r1)
        L_0x0102:
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0138
            java.lang.String r1 = r6.f28216X
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x010f
            goto L_0x0134
        L_0x010f:
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            android.content.Context r3 = r6.f28248s
            java.lang.Float r4 = f28192r
            float r4 = r4.floatValue()
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r4)
            r2.setTextSize(r3)
            com.bytedance.ies.dmt.ui.widget.util.b r3 = com.bytedance.ies.dmt.p664ui.widget.util.C10749b.m21787a()
            java.lang.String r4 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28902a
            android.graphics.Typeface r3 = r3.mo19435a(r4)
            r2.setTypeface(r3)
            float r3 = r2.measureText(r1)
        L_0x0134:
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x013e
        L_0x0138:
            r6.f28227ah = r0
            java.lang.String r7 = ""
            r6.f28217Y = r7
        L_0x013e:
            android.content.Context r7 = r6.f28248s
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            boolean r0 = r6.f28227ah
            if (r0 == 0) goto L_0x014c
            r0 = 2132215170(0x7f170582, float:2.0074203E38)
            goto L_0x014f
        L_0x014c:
            r0 = 2132215168(0x7f170580, float:2.0074198E38)
        L_0x014f:
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r1)
            r6.f28198F = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132024169(0x7f141b69, float:1.9686807E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28249t = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132023727(0x7f1419af, float:1.968591E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28250u = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132024078(0x7f141b0e, float:1.9686622E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28251v = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132019556(0x7f140964, float:1.967745E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f28196D = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132021248(0x7f141000, float:1.9680882E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28252w = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132021858(0x7f141262, float:1.968212E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28253x = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132021253(0x7f141005, float:1.9680892E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28254y = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132019151(0x7f1407cf, float:1.9676629E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f28206N = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132019119(0x7f1407af, float:1.9676564E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f28207O = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132023887(0x7f141a4f, float:1.9686235E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28255z = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132023888(0x7f141a50, float:1.9686237E38)
            android.view.View r7 = r7.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            r6.f28193A = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132022407(0x7f141487, float:1.9683233E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r6.f28219a = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132022320(0x7f141430, float:1.9683056E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r6.f28210R = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132022354(0x7f141452, float:1.9683125E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r6.f28211S = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132022353(0x7f141451, float:1.9683123E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f28204L = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132018591(0x7f14059f, float:1.9675493E38)
            android.view.View r7 = r7.findViewById(r0)
            r6.f28201I = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132018108(0x7f1403bc, float:1.9674513E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f28197E = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132019131(0x7f1407bb, float:1.9676588E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f28205M = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132017908(0x7f1402f4, float:1.9674108E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f28209Q = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132022504(0x7f1414e8, float:1.968343E38)
            android.view.View r7 = r7.findViewById(r0)
            r6.f28239at = r7
            android.view.View r7 = r6.f28198F
            r0 = 2132019132(0x7f1407bc, float:1.967659E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f28208P = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.p666b.C10641a.<init>(com.bytedance.ies.dmt.ui.b.a$a):void");
    }

    /* renamed from: a */
    public static void m21428a(boolean z, View view) {
        if (view != null) {
            view.post(new C10654l(view, z));
        }
    }
}
