package com.bytedance.android.live.uikit.dialog;

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

/* renamed from: com.bytedance.android.live.uikit.dialog.a */
public final class C4207a {

    /* renamed from: A */
    TextView f11418A;

    /* renamed from: B */
    TextView f11419B;

    /* renamed from: C */
    public View f11420C;

    /* renamed from: D */
    public boolean f11421D;

    /* renamed from: E */
    public ListAdapter f11422E;

    /* renamed from: F */
    public int f11423F = -1;

    /* renamed from: G */
    int f11424G;

    /* renamed from: H */
    int f11425H;

    /* renamed from: I */
    public int f11426I;

    /* renamed from: J */
    public int f11427J;

    /* renamed from: K */
    public int f11428K;

    /* renamed from: L */
    public int f11429L;

    /* renamed from: M */
    int f11430M;

    /* renamed from: N */
    public Handler f11431N;

    /* renamed from: O */
    final OnClickListener f11432O = new OnClickListener() {
        public final void onClick(View view) {
            Message message;
            if (view == C4207a.this.f11446n && C4207a.this.f11448p != null) {
                message = Message.obtain(C4207a.this.f11448p);
            } else if (view == C4207a.this.f11449q && C4207a.this.f11451s != null) {
                message = Message.obtain(C4207a.this.f11451s);
            } else if (view != C4207a.this.f11452t || C4207a.this.f11454v == null) {
                message = null;
            } else {
                message = Message.obtain(C4207a.this.f11454v);
            }
            if (message != null) {
                message.sendToTarget();
            }
            C4207a.this.f11431N.obtainMessage(1, C4207a.this.f11434b).sendToTarget();
        }
    };

    /* renamed from: a */
    public final Context f11433a;

    /* renamed from: b */
    public final DialogInterface f11434b;

    /* renamed from: c */
    final Window f11435c;

    /* renamed from: d */
    CharSequence f11436d;

    /* renamed from: e */
    CharSequence f11437e;

    /* renamed from: f */
    public ListView f11438f;

    /* renamed from: g */
    View f11439g;

    /* renamed from: h */
    int f11440h;

    /* renamed from: i */
    int f11441i;

    /* renamed from: j */
    int f11442j;

    /* renamed from: k */
    int f11443k;

    /* renamed from: l */
    int f11444l;

    /* renamed from: m */
    boolean f11445m;

    /* renamed from: n */
    public Button f11446n;

    /* renamed from: o */
    CharSequence f11447o;

    /* renamed from: p */
    public Message f11448p;

    /* renamed from: q */
    public Button f11449q;

    /* renamed from: r */
    CharSequence f11450r;

    /* renamed from: s */
    public Message f11451s;

    /* renamed from: t */
    public Button f11452t;

    /* renamed from: u */
    CharSequence f11453u;

    /* renamed from: v */
    public Message f11454v;

    /* renamed from: w */
    public ScrollView f11455w;

    /* renamed from: x */
    int f11456x;

    /* renamed from: y */
    Drawable f11457y;

    /* renamed from: z */
    ImageView f11458z;

    /* renamed from: com.bytedance.android.live.uikit.dialog.a$a */
    public static class C4213a {

        /* renamed from: A */
        public int f11471A;

        /* renamed from: B */
        public boolean f11472B;

        /* renamed from: C */
        public boolean[] f11473C;

        /* renamed from: D */
        public boolean f11474D;

        /* renamed from: E */
        public boolean f11475E;

        /* renamed from: F */
        public int f11476F = -1;

        /* renamed from: G */
        public OnMultiChoiceClickListener f11477G;

        /* renamed from: H */
        public Cursor f11478H;

        /* renamed from: I */
        public String f11479I;

        /* renamed from: J */
        public String f11480J;

        /* renamed from: K */
        public boolean f11481K;

        /* renamed from: L */
        public OnItemSelectedListener f11482L;

        /* renamed from: M */
        public boolean f11483M = true;

        /* renamed from: a */
        public final Context f11484a;

        /* renamed from: b */
        public final LayoutInflater f11485b;

        /* renamed from: c */
        public int f11486c;

        /* renamed from: d */
        public Drawable f11487d;

        /* renamed from: e */
        public int f11488e;

        /* renamed from: f */
        public CharSequence f11489f;

        /* renamed from: g */
        public View f11490g;

        /* renamed from: h */
        public CharSequence f11491h;

        /* renamed from: i */
        public CharSequence f11492i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f11493j;

        /* renamed from: k */
        public CharSequence f11494k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f11495l;

        /* renamed from: m */
        public CharSequence f11496m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f11497n;

        /* renamed from: o */
        public boolean f11498o;

        /* renamed from: p */
        public OnCancelListener f11499p;

        /* renamed from: q */
        public OnDismissListener f11500q;

        /* renamed from: r */
        public OnKeyListener f11501r;

        /* renamed from: s */
        public CharSequence[] f11502s;

        /* renamed from: t */
        public ListAdapter f11503t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f11504u;

        /* renamed from: v */
        public int f11505v;

        /* renamed from: w */
        public View f11506w;

        /* renamed from: x */
        public int f11507x;

        /* renamed from: y */
        public int f11508y;

        /* renamed from: z */
        public int f11509z;

        public C4213a(Context context) {
            this.f11484a = context;
            this.f11498o = true;
            this.f11485b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.dialog.a$b */
    static final class C4218b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f11522a;

        public C4218b(DialogInterface dialogInterface) {
            this.f11522a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f11522a.get(), message.what);
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.dialog.a$c */
    static class C4219c extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C4219c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, R.id.cya, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo9665a(CharSequence charSequence) {
        this.f11436d = charSequence;
        if (this.f11418A != null) {
            this.f11418A.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo9663a(int i) {
        this.f11457y = null;
        this.f11456x = i;
        if (this.f11458z != null) {
            if (i != 0) {
                this.f11458z.setImageResource(this.f11456x);
                return;
            }
            this.f11458z.setVisibility(8);
        }
    }

    /* renamed from: a */
    static boolean m10428a(View view) {
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
            if (m10428a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public C4207a(Context context, DialogInterface dialogInterface, Window window) {
        this.f11433a = context;
        this.f11434b = dialogInterface;
        this.f11435c = window;
        this.f11431N = new C4218b(dialogInterface);
        this.f11424G = R.layout.a_7;
        this.f11425H = 0;
        this.f11426I = R.layout.a_8;
        this.f11427J = R.layout.a__;
        this.f11428K = R.layout.a_a;
        this.f11429L = R.layout.a_9;
    }

    /* renamed from: a */
    public static void m10427a(View view, View view2, View view3) {
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
    public final void mo9664a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f11431N.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                this.f11453u = charSequence;
                this.f11454v = message;
                return;
            case -2:
                this.f11450r = charSequence;
                this.f11451s = message;
                return;
            case -1:
                this.f11447o = charSequence;
                this.f11448p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }
}
