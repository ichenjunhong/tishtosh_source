package com.bytedance.ies.uikit.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.uikit.dialog.a */
public final class C11091a {

    /* renamed from: A */
    TextView f29792A;

    /* renamed from: B */
    TextView f29793B;

    /* renamed from: C */
    public View f29794C;

    /* renamed from: D */
    public boolean f29795D;

    /* renamed from: E */
    public ListAdapter f29796E;

    /* renamed from: F */
    public int f29797F = -1;

    /* renamed from: G */
    int f29798G;

    /* renamed from: H */
    int f29799H;

    /* renamed from: I */
    public int f29800I;

    /* renamed from: J */
    public int f29801J;

    /* renamed from: K */
    public int f29802K;

    /* renamed from: L */
    public int f29803L;

    /* renamed from: M */
    int f29804M;

    /* renamed from: N */
    public Handler f29805N;

    /* renamed from: O */
    final OnClickListener f29806O = new OnClickListener() {
        public final void onClick(View view) {
            Message message;
            if (view == C11091a.this.f29820n && C11091a.this.f29822p != null) {
                message = Message.obtain(C11091a.this.f29822p);
            } else if (view == C11091a.this.f29823q && C11091a.this.f29825s != null) {
                message = Message.obtain(C11091a.this.f29825s);
            } else if (view != C11091a.this.f29826t || C11091a.this.f29828v == null) {
                message = null;
            } else {
                message = Message.obtain(C11091a.this.f29828v);
            }
            if (message != null) {
                message.sendToTarget();
            }
            C11091a.this.f29805N.obtainMessage(1, C11091a.this.f29808b).sendToTarget();
        }
    };

    /* renamed from: a */
    public final Context f29807a;

    /* renamed from: b */
    public final DialogInterface f29808b;

    /* renamed from: c */
    final Window f29809c;

    /* renamed from: d */
    CharSequence f29810d;

    /* renamed from: e */
    CharSequence f29811e;

    /* renamed from: f */
    public ListView f29812f;

    /* renamed from: g */
    View f29813g;

    /* renamed from: h */
    int f29814h;

    /* renamed from: i */
    int f29815i;

    /* renamed from: j */
    int f29816j;

    /* renamed from: k */
    int f29817k;

    /* renamed from: l */
    int f29818l;

    /* renamed from: m */
    boolean f29819m;

    /* renamed from: n */
    public Button f29820n;

    /* renamed from: o */
    CharSequence f29821o;

    /* renamed from: p */
    public Message f29822p;

    /* renamed from: q */
    public Button f29823q;

    /* renamed from: r */
    CharSequence f29824r;

    /* renamed from: s */
    public Message f29825s;

    /* renamed from: t */
    public Button f29826t;

    /* renamed from: u */
    CharSequence f29827u;

    /* renamed from: v */
    public Message f29828v;

    /* renamed from: w */
    public ScrollView f29829w;

    /* renamed from: x */
    int f29830x;

    /* renamed from: y */
    Drawable f29831y;

    /* renamed from: z */
    ImageView f29832z;

    /* renamed from: com.bytedance.ies.uikit.dialog.a$a */
    public static class C11097a {

        /* renamed from: A */
        public int f29845A;

        /* renamed from: B */
        public boolean f29846B;

        /* renamed from: C */
        public boolean[] f29847C;

        /* renamed from: D */
        public boolean f29848D;

        /* renamed from: E */
        public boolean f29849E;

        /* renamed from: F */
        public int f29850F = -1;

        /* renamed from: G */
        public OnMultiChoiceClickListener f29851G;

        /* renamed from: H */
        public Cursor f29852H;

        /* renamed from: I */
        public String f29853I;

        /* renamed from: J */
        public String f29854J;

        /* renamed from: K */
        public boolean f29855K;

        /* renamed from: L */
        public OnItemSelectedListener f29856L;

        /* renamed from: M */
        public boolean f29857M = true;

        /* renamed from: a */
        public final Context f29858a;

        /* renamed from: b */
        public final LayoutInflater f29859b;

        /* renamed from: c */
        public int f29860c;

        /* renamed from: d */
        public Drawable f29861d;

        /* renamed from: e */
        public int f29862e;

        /* renamed from: f */
        public CharSequence f29863f;

        /* renamed from: g */
        public View f29864g;

        /* renamed from: h */
        public CharSequence f29865h;

        /* renamed from: i */
        public CharSequence f29866i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f29867j;

        /* renamed from: k */
        public CharSequence f29868k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f29869l;

        /* renamed from: m */
        public CharSequence f29870m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f29871n;

        /* renamed from: o */
        public boolean f29872o;

        /* renamed from: p */
        public OnCancelListener f29873p;

        /* renamed from: q */
        public OnDismissListener f29874q;

        /* renamed from: r */
        public OnKeyListener f29875r;

        /* renamed from: s */
        public CharSequence[] f29876s;

        /* renamed from: t */
        public ListAdapter f29877t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f29878u;

        /* renamed from: v */
        public int f29879v;

        /* renamed from: w */
        public View f29880w;

        /* renamed from: x */
        public int f29881x;

        /* renamed from: y */
        public int f29882y;

        /* renamed from: z */
        public int f29883z;

        public C11097a(Context context) {
            this.f29858a = context;
            this.f29872o = true;
            this.f29859b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$b */
    static final class C11102b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f29896a;

        public C11102b(DialogInterface dialogInterface) {
            this.f29896a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f29896a.get(), message.what);
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$c */
    static class C11103c extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C11103c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, R.id.cya, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo20113a(CharSequence charSequence) {
        this.f29810d = charSequence;
        if (this.f29792A != null) {
            this.f29792A.setText(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo20114b(CharSequence charSequence) {
        this.f29811e = charSequence;
        if (this.f29793B != null) {
            this.f29793B.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo20111a(int i) {
        this.f29831y = null;
        this.f29830x = i;
        if (this.f29832z != null) {
            if (i != 0) {
                this.f29832z.setImageResource(this.f29830x);
                return;
            }
            this.f29832z.setVisibility(8);
        }
    }

    /* renamed from: a */
    static boolean m22444a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m22444a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public C11091a(Context context, DialogInterface dialogInterface, Window window) {
        this.f29807a = context;
        this.f29808b = dialogInterface;
        this.f29809c = window;
        this.f29805N = new C11102b(dialogInterface);
        this.f29798G = R.layout.aew;
        this.f29799H = 0;
        this.f29800I = R.layout.aez;
        this.f29801J = R.layout.af1;
        this.f29802K = R.layout.af2;
        this.f29803L = R.layout.af0;
    }

    /* renamed from: a */
    public static void m22443a(View view, View view2, View view3) {
        int i;
        if (VERSION.SDK_INT >= 14) {
            int i2 = 4;
            if (view2 != null) {
                if (view.canScrollVertically(-1)) {
                    i = 0;
                } else {
                    i = 4;
                }
                view2.setVisibility(i);
            }
            if (view3 != null) {
                if (view.canScrollVertically(1)) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo20112a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f29805N.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                this.f29827u = charSequence;
                this.f29828v = message;
                return;
            case -2:
                this.f29824r = charSequence;
                this.f29825s = message;
                return;
            case -1:
                this.f29821o = charSequence;
                this.f29822p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }
}
