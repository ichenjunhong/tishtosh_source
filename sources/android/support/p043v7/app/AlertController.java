package android.support.p043v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
final class AlertController {

    /* renamed from: A */
    NestedScrollView f3593A;

    /* renamed from: B */
    int f3594B;

    /* renamed from: C */
    Drawable f3595C;

    /* renamed from: D */
    ImageView f3596D;

    /* renamed from: E */
    TextView f3597E;

    /* renamed from: F */
    TextView f3598F;

    /* renamed from: G */
    public View f3599G;

    /* renamed from: H */
    ListAdapter f3600H;

    /* renamed from: I */
    int f3601I = -1;

    /* renamed from: J */
    int f3602J;

    /* renamed from: K */
    int f3603K;

    /* renamed from: L */
    int f3604L;

    /* renamed from: M */
    int f3605M;

    /* renamed from: N */
    int f3606N;

    /* renamed from: O */
    int f3607O;

    /* renamed from: P */
    boolean f3608P;

    /* renamed from: Q */
    public int f3609Q;

    /* renamed from: R */
    Handler f3610R;

    /* renamed from: S */
    final OnClickListener f3611S = new OnClickListener() {
        public final void onClick(View view) {
            Message message;
            if (view == AlertController.this.f3626o && AlertController.this.f3628q != null) {
                message = Message.obtain(AlertController.this.f3628q);
            } else if (view == AlertController.this.f3630s && AlertController.this.f3632u != null) {
                message = Message.obtain(AlertController.this.f3632u);
            } else if (view != AlertController.this.f3634w || AlertController.this.f3636y == null) {
                message = null;
            } else {
                message = Message.obtain(AlertController.this.f3636y);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.f3610R.obtainMessage(1, AlertController.this.f3613b).sendToTarget();
        }
    };

    /* renamed from: a */
    final Context f3612a;

    /* renamed from: b */
    final C1164e f3613b;

    /* renamed from: c */
    final Window f3614c;

    /* renamed from: d */
    final int f3615d;

    /* renamed from: e */
    CharSequence f3616e;

    /* renamed from: f */
    CharSequence f3617f;

    /* renamed from: g */
    public ListView f3618g;

    /* renamed from: h */
    View f3619h;

    /* renamed from: i */
    int f3620i;

    /* renamed from: j */
    int f3621j;

    /* renamed from: k */
    int f3622k;

    /* renamed from: l */
    int f3623l;

    /* renamed from: m */
    int f3624m;

    /* renamed from: n */
    boolean f3625n;

    /* renamed from: o */
    Button f3626o;

    /* renamed from: p */
    CharSequence f3627p;

    /* renamed from: q */
    Message f3628q;

    /* renamed from: r */
    Drawable f3629r;

    /* renamed from: s */
    Button f3630s;

    /* renamed from: t */
    CharSequence f3631t;

    /* renamed from: u */
    Message f3632u;

    /* renamed from: v */
    Drawable f3633v;

    /* renamed from: w */
    Button f3634w;

    /* renamed from: x */
    CharSequence f3635x;

    /* renamed from: y */
    Message f3636y;

    /* renamed from: z */
    Drawable f3637z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        final int f3651a;

        /* renamed from: b */
        final int f3652b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.v4, R.attr.v7});
            this.f3652b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f3651a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C1132a {

        /* renamed from: A */
        public int f3653A;

        /* renamed from: B */
        public int f3654B;

        /* renamed from: C */
        public int f3655C;

        /* renamed from: D */
        public int f3656D;

        /* renamed from: E */
        public boolean f3657E;

        /* renamed from: F */
        public boolean[] f3658F;

        /* renamed from: G */
        public boolean f3659G;

        /* renamed from: H */
        public boolean f3660H;

        /* renamed from: I */
        public int f3661I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f3662J;

        /* renamed from: K */
        public Cursor f3663K;

        /* renamed from: L */
        public String f3664L;

        /* renamed from: M */
        public String f3665M;

        /* renamed from: N */
        public OnItemSelectedListener f3666N;

        /* renamed from: O */
        public boolean f3667O = true;

        /* renamed from: a */
        public final Context f3668a;

        /* renamed from: b */
        public final LayoutInflater f3669b;

        /* renamed from: c */
        public int f3670c;

        /* renamed from: d */
        public Drawable f3671d;

        /* renamed from: e */
        public int f3672e;

        /* renamed from: f */
        public CharSequence f3673f;

        /* renamed from: g */
        public View f3674g;

        /* renamed from: h */
        public CharSequence f3675h;

        /* renamed from: i */
        public CharSequence f3676i;

        /* renamed from: j */
        public Drawable f3677j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f3678k;

        /* renamed from: l */
        public CharSequence f3679l;

        /* renamed from: m */
        public Drawable f3680m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f3681n;

        /* renamed from: o */
        public CharSequence f3682o;

        /* renamed from: p */
        public Drawable f3683p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f3684q;

        /* renamed from: r */
        public boolean f3685r;

        /* renamed from: s */
        public OnCancelListener f3686s;

        /* renamed from: t */
        public OnDismissListener f3687t;

        /* renamed from: u */
        public OnKeyListener f3688u;

        /* renamed from: v */
        public CharSequence[] f3689v;

        /* renamed from: w */
        public ListAdapter f3690w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f3691x;

        /* renamed from: y */
        public int f3692y;

        /* renamed from: z */
        public View f3693z;

        public C1132a(Context context) {
            this.f3668a = context;
            this.f3685r = true;
            this.f3669b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    static final class C1137b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f3706a;

        public C1137b(DialogInterface dialogInterface) {
            this.f3706a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f3706a.get(), message.what);
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    static class C1138c extends ArrayAdapter<CharSequence> {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C1138c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }
    }

    /* renamed from: a */
    public final void mo3609a(CharSequence charSequence) {
        this.f3616e = charSequence;
        if (this.f3597E != null) {
            this.f3597E.setText(charSequence);
        }
    }

    /* renamed from: a */
    static void m3344a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    static boolean m3345a(View view) {
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
            if (m3345a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo3607a(int i) {
        this.f3595C = null;
        this.f3594B = i;
        if (this.f3596D != null) {
            if (i != 0) {
                this.f3596D.setVisibility(0);
                this.f3596D.setImageResource(this.f3594B);
                return;
            }
            this.f3596D.setVisibility(8);
        }
    }

    /* renamed from: a */
    static ViewGroup m3342a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m3343a(View view, View view2, View view3) {
        int i;
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

    public AlertController(Context context, C1164e eVar, Window window) {
        this.f3612a = context;
        this.f3613b = eVar;
        this.f3614c = window;
        this.f3610R = new C1137b(eVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842994, R.attr.dn, R.attr.f133576do, R.attr.sq, R.attr.sr, R.attr.uj, R.attr.a28, R.attr.a2f}, R.attr.al, 0);
        this.f3602J = obtainStyledAttributes.getResourceId(0, 0);
        this.f3603K = obtainStyledAttributes.getResourceId(2, 0);
        this.f3604L = obtainStyledAttributes.getResourceId(4, 0);
        this.f3605M = obtainStyledAttributes.getResourceId(5, 0);
        this.f3606N = obtainStyledAttributes.getResourceId(7, 0);
        this.f3607O = obtainStyledAttributes.getResourceId(3, 0);
        this.f3608P = obtainStyledAttributes.getBoolean(6, true);
        this.f3615d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        eVar.mo3778b(1);
    }

    /* renamed from: a */
    public final void mo3608a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.f3610R.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                this.f3635x = charSequence;
                this.f3636y = message;
                this.f3637z = drawable;
                return;
            case -2:
                this.f3631t = charSequence;
                this.f3632u = message;
                this.f3633v = drawable;
                return;
            case -1:
                this.f3627p = charSequence;
                this.f3628q = message;
                this.f3629r = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }
}
