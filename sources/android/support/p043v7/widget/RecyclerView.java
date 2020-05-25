package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p030v4.p038f.C0799m;
import android.support.p030v4.p040os.C0968g;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.view.C1046k;
import android.support.p030v4.view.C1047l;
import android.support.p030v4.view.C1053r;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1060v;
import android.support.p030v4.view.p041a.C1004a;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.view.p041a.C1008c.C1011c;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.RecyclerView */
public class RecyclerView extends ViewGroup implements C1046k, C1053r {

    /* renamed from: M */
    static final Interpolator f4632M = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: N */
    private static final int[] f4633N = {16843830};

    /* renamed from: O */
    private static final int[] f4634O = {16842987};

    /* renamed from: P */
    private static final boolean f4635P;

    /* renamed from: Q */
    private static final boolean f4636Q;

    /* renamed from: R */
    private static final Class<?>[] f4637R = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: a */
    static final boolean f4638a;

    /* renamed from: b */
    static final boolean f4639b;

    /* renamed from: c */
    static final boolean f4640c;

    /* renamed from: d */
    static final boolean f4641d;

    /* renamed from: A */
    C1327f f4642A;

    /* renamed from: B */
    final C1351u f4643B;

    /* renamed from: C */
    C1410ad f4644C;

    /* renamed from: D */
    C1412a f4645D;

    /* renamed from: E */
    final C1349s f4646E;

    /* renamed from: F */
    boolean f4647F;

    /* renamed from: G */
    boolean f4648G;

    /* renamed from: H */
    boolean f4649H;

    /* renamed from: I */
    C1428an f4650I;

    /* renamed from: J */
    final int[] f4651J;

    /* renamed from: K */
    final int[] f4652K;

    /* renamed from: L */
    final List<C1352v> f4653L;

    /* renamed from: S */
    private final C1345q f4654S;

    /* renamed from: T */
    private SavedState f4655T;

    /* renamed from: U */
    private final Rect f4656U;

    /* renamed from: V */
    private final ArrayList<C1339l> f4657V;

    /* renamed from: W */
    private C1339l f4658W;

    /* renamed from: aA */
    private List<C1340m> f4659aA;

    /* renamed from: aB */
    private C1328a f4660aB;

    /* renamed from: aC */
    private C1325d f4661aC;

    /* renamed from: aD */
    private final int[] f4662aD;

    /* renamed from: aE */
    private C1047l f4663aE;

    /* renamed from: aF */
    private final int[] f4664aF;

    /* renamed from: aG */
    private final int[] f4665aG;

    /* renamed from: aH */
    private Runnable f4666aH;

    /* renamed from: aI */
    private final C1466b f4667aI;

    /* renamed from: aa */
    private int f4668aa;

    /* renamed from: ab */
    private boolean f4669ab;

    /* renamed from: ac */
    private int f4670ac;

    /* renamed from: ad */
    private final AccessibilityManager f4671ad;

    /* renamed from: ae */
    private int f4672ae;

    /* renamed from: af */
    private int f4673af;

    /* renamed from: ag */
    private C1326e f4674ag;

    /* renamed from: ah */
    private EdgeEffect f4675ah;

    /* renamed from: ai */
    private EdgeEffect f4676ai;

    /* renamed from: aj */
    private EdgeEffect f4677aj;

    /* renamed from: ak */
    private EdgeEffect f4678ak;

    /* renamed from: al */
    private int f4679al;

    /* renamed from: am */
    private int f4680am;

    /* renamed from: an */
    private VelocityTracker f4681an;

    /* renamed from: ao */
    private int f4682ao;

    /* renamed from: ap */
    private int f4683ap;

    /* renamed from: aq */
    private int f4684aq;

    /* renamed from: ar */
    private int f4685ar;

    /* renamed from: as */
    private int f4686as;

    /* renamed from: at */
    private C1338k f4687at;

    /* renamed from: au */
    private final int f4688au;

    /* renamed from: av */
    private final int f4689av;

    /* renamed from: aw */
    private float f4690aw;

    /* renamed from: ax */
    private float f4691ax;

    /* renamed from: ay */
    private boolean f4692ay;

    /* renamed from: az */
    private C1340m f4693az;

    /* renamed from: e */
    final C1343o f4694e;

    /* renamed from: f */
    C1475d f4695f;

    /* renamed from: g */
    C1501t f4696g;

    /* renamed from: h */
    final C1464bi f4697h;

    /* renamed from: i */
    boolean f4698i;

    /* renamed from: j */
    final Runnable f4699j;

    /* renamed from: k */
    final Rect f4700k;

    /* renamed from: l */
    final RectF f4701l;

    /* renamed from: m */
    C1322a f4702m;

    /* renamed from: n */
    C1332i f4703n;

    /* renamed from: o */
    C1344p f4704o;

    /* renamed from: p */
    public final ArrayList<C1331h> f4705p;

    /* renamed from: q */
    boolean f4706q;

    /* renamed from: r */
    public boolean f4707r;

    /* renamed from: s */
    boolean f4708s;

    /* renamed from: t */
    boolean f4709t;

    /* renamed from: u */
    boolean f4710u;

    /* renamed from: v */
    public boolean f4711v;

    /* renamed from: w */
    boolean f4712w;

    /* renamed from: x */
    List<C1337j> f4713x;

    /* renamed from: y */
    boolean f4714y;

    /* renamed from: z */
    boolean f4715z;

    /* renamed from: android.support.v7.widget.RecyclerView$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: c */
        C1352v f4721c;

        /* renamed from: d */
        final Rect f4722d = new Rect();

        /* renamed from: e */
        boolean f4723e = true;

        /* renamed from: f */
        boolean f4724f = false;

        public final boolean bu_() {
            return this.f4721c.isRemoved();
        }

        public final boolean bv_() {
            return this.f4721c.isUpdated();
        }

        public final int bw_() {
            return this.f4721c.getLayoutPosition();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        Parcelable f4725a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4725a, 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C1332i.class.getClassLoader();
            }
            this.f4725a = parcel.readParcelable(classLoader);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a */
    public static abstract class C1322a<VH extends C1352v> {
        public boolean mHasStableIds = false;
        private final C1323b mObservable = new C1323b();

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public final boolean hasObservers() {
            return this.mObservable.mo4979a();
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo4980b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo4977a(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo4981b(i, 1);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo4982c(i, 1);
        }

        public void registerAdapterDataObserver(C1324c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void unregisterAdapterDataObserver(C1324c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo4983d(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo4977a(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo4981b(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo4982c(i, i2);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo4978a(i, 1, obj);
        }

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (this.mHasStableIds) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C0968g.m2814a("RV OnBindView");
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            android.view.ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).f4723e = true;
            }
            C0968g.m2813a();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C0968g.m2814a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0968g.m2813a();
            }
        }

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo4978a(i, i2, obj);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$b */
    static class C1323b extends Observable<C1324c> {
        C1323b() {
        }

        /* renamed from: a */
        public final boolean mo4979a() {
            if (!this.mObservers.isEmpty()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo4980b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4984a();
            }
        }

        /* renamed from: a */
        public final void mo4977a(int i, int i2) {
            mo4978a(i, i2, null);
        }

        /* renamed from: c */
        public final void mo4982c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4989c(i, i2);
            }
        }

        /* renamed from: d */
        public final void mo4983d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4986a(i, i2, 1);
            }
        }

        /* renamed from: b */
        public final void mo4981b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4988b(i, i2);
            }
        }

        /* renamed from: a */
        public final void mo4978a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1324c) this.mObservers.get(size)).mo4987a(i, i2, obj);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$c */
    public static abstract class C1324c {
        /* renamed from: a */
        public void mo4984a() {
        }

        /* renamed from: a */
        public void mo4985a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4986a(int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo4988b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4989c(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4987a(int i, int i2, Object obj) {
            mo4985a(i, i2);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d */
    public interface C1325d {
        /* renamed from: a */
        int mo4990a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$e */
    public static class C1326e {
        /* renamed from: a */
        protected static EdgeEffect m4384a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$f */
    public static abstract class C1327f {

        /* renamed from: a */
        private ArrayList<Object> f4726a = new ArrayList<>();

        /* renamed from: h */
        public C1328a f4727h;

        /* renamed from: i */
        public long f4728i = 120;

        /* renamed from: j */
        public long f4729j = 120;

        /* renamed from: k */
        public long f4730k = 250;

        /* renamed from: l */
        public long f4731l = 250;

        /* renamed from: android.support.v7.widget.RecyclerView$f$a */
        interface C1328a {
            /* renamed from: a */
            void mo5005a(C1352v vVar);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$b */
        public static class C1329b {

            /* renamed from: a */
            public int f4732a;

            /* renamed from: b */
            public int f4733b;

            /* renamed from: c */
            public int f4734c;

            /* renamed from: d */
            public int f4735d;

            /* renamed from: a */
            public final C1329b mo5006a(C1352v vVar) {
                return m4402a(vVar, 0);
            }

            /* renamed from: a */
            private C1329b m4402a(C1352v vVar, int i) {
                View view = vVar.itemView;
                this.f4732a = view.getLeft();
                this.f4733b = view.getTop();
                this.f4734c = view.getRight();
                this.f4735d = view.getBottom();
                return this;
            }
        }

        /* renamed from: a */
        public abstract void mo4993a();

        /* renamed from: a */
        public abstract boolean mo4994a(C1352v vVar, C1329b bVar, C1329b bVar2);

        /* renamed from: a */
        public abstract boolean mo4995a(C1352v vVar, C1352v vVar2, C1329b bVar, C1329b bVar2);

        /* renamed from: b */
        public abstract boolean mo4997b();

        /* renamed from: b */
        public abstract boolean mo4998b(C1352v vVar, C1329b bVar, C1329b bVar2);

        /* renamed from: c */
        public abstract void mo4999c(C1352v vVar);

        /* renamed from: c */
        public abstract boolean mo5000c(C1352v vVar, C1329b bVar, C1329b bVar2);

        /* renamed from: d */
        public abstract void mo5001d();

        /* renamed from: f */
        public boolean mo5004f(C1352v vVar) {
            return true;
        }

        /* renamed from: c */
        private static C1329b mo5849c() {
            return new C1329b();
        }

        /* renamed from: e */
        public final void mo5002e() {
            int size = this.f4726a.size();
            for (int i = 0; i < size; i++) {
                this.f4726a.get(i);
            }
            this.f4726a.clear();
        }

        /* renamed from: e */
        public final void mo5003e(C1352v vVar) {
            if (this.f4727h != null) {
                this.f4727h.mo5005a(vVar);
            }
        }

        /* renamed from: d */
        static int m4386d(C1352v vVar) {
            int i = vVar.mFlags & 14;
            if (vVar.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int i2 = vVar.mOldPosition;
                int adapterPosition = vVar.getAdapterPosition();
                if (!(i2 == -1 || adapterPosition == -1 || i2 == adapterPosition)) {
                    i |= 2048;
                }
            }
            return i;
        }

        /* renamed from: a */
        public final C1329b mo4991a(C1349s sVar, C1352v vVar) {
            return mo5849c().mo5006a(vVar);
        }

        /* renamed from: a */
        public boolean mo4996a(C1352v vVar, List<Object> list) {
            return mo5004f(vVar);
        }

        /* renamed from: a */
        public final C1329b mo4992a(C1349s sVar, C1352v vVar, int i, List<Object> list) {
            return mo5849c().mo5006a(vVar);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$g */
    class C1330g implements C1328a {
        C1330g() {
        }

        /* renamed from: a */
        public final void mo5005a(C1352v vVar) {
            vVar.setIsRecyclable(true);
            if (vVar.mShadowedHolder != null && vVar.mShadowingHolder == null) {
                vVar.mShadowedHolder = null;
            }
            vVar.mShadowingHolder = null;
            if (!vVar.shouldBeKeptAsChild() && !RecyclerView.this.mo4810a(vVar.itemView) && vVar.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(vVar.itemView, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$h */
    public static abstract class C1331h {
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).bw_(), recyclerView);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$i */
    public static abstract class C1332i {

        /* renamed from: A */
        public boolean f4737A = false;

        /* renamed from: B */
        public boolean f4738B = false;

        /* renamed from: C */
        public boolean f4739C = true;

        /* renamed from: D */
        public boolean f4740D = true;

        /* renamed from: E */
        int f4741E;

        /* renamed from: F */
        boolean f4742F;

        /* renamed from: G */
        public int f4743G;

        /* renamed from: H */
        public int f4744H;

        /* renamed from: I */
        public int f4745I;

        /* renamed from: J */
        public int f4746J;

        /* renamed from: a */
        private final C1463b f4747a = new C1463b() {
            /* renamed from: a */
            public final int mo5070a() {
                return C1332i.this.mo5063t();
            }

            /* renamed from: b */
            public final int mo5073b() {
                return C1332i.this.f4745I - C1332i.this.mo5065v();
            }

            /* renamed from: a */
            public final int mo5071a(View view) {
                return C1332i.this.mo5049g(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public final View mo5072a(int i) {
                return C1332i.this.mo5050g(i);
            }

            /* renamed from: b */
            public final int mo5074b(View view) {
                return C1332i.this.mo5053i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        };

        /* renamed from: b */
        private final C1463b f4748b = new C1463b() {
            /* renamed from: a */
            public final int mo5070a() {
                return C1332i.this.mo5064u();
            }

            /* renamed from: b */
            public final int mo5073b() {
                return C1332i.this.f4746J - C1332i.this.mo5066w();
            }

            /* renamed from: a */
            public final int mo5071a(View view) {
                return C1332i.this.mo5051h(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public final View mo5072a(int i) {
                return C1332i.this.mo5050g(i);
            }

            /* renamed from: b */
            public final int mo5074b(View view) {
                return C1332i.this.mo5055j(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        };

        /* renamed from: u */
        C1501t f4749u;

        /* renamed from: v */
        RecyclerView f4750v;

        /* renamed from: w */
        C1461bh f4751w = new C1461bh(this.f4747a);

        /* renamed from: x */
        C1461bh f4752x = new C1461bh(this.f4748b);

        /* renamed from: y */
        C1346r f4753y;

        /* renamed from: z */
        boolean f4754z = false;

        /* renamed from: android.support.v7.widget.RecyclerView$i$a */
        public interface C1335a {
            /* renamed from: a */
            void mo5075a(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$b */
        public static class C1336b {

            /* renamed from: a */
            public int f4757a;

            /* renamed from: b */
            public int f4758b;

            /* renamed from: c */
            public boolean f4759c;

            /* renamed from: d */
            public boolean f4760d;
        }

        /* renamed from: E */
        public void mo5017E() {
            this.f4754z = true;
        }

        /* renamed from: a */
        public int mo4665a(int i, C1343o oVar, C1349s sVar) {
            return 0;
        }

        /* renamed from: a */
        public abstract LayoutParams mo4667a();

        /* renamed from: a */
        public View mo4671a(View view, int i, C1343o oVar, C1349s sVar) {
            return null;
        }

        /* renamed from: a */
        public void mo4722a(int i, int i2, C1349s sVar, C1335a aVar) {
        }

        /* renamed from: a */
        public void mo4723a(int i, C1335a aVar) {
        }

        /* renamed from: a */
        public void mo4724a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo5019a(C1322a aVar, C1322a aVar2) {
        }

        /* renamed from: a */
        public void mo4677a(C1349s sVar) {
        }

        /* renamed from: a */
        public void mo4679a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo4680a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo4681a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo4725a(RecyclerView recyclerView, C1343o oVar) {
        }

        /* renamed from: a */
        public void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        }

        /* renamed from: a */
        public boolean mo4684a(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: b */
        public int mo4685b(int i, C1343o oVar, C1349s sVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo4730b(C1349s sVar) {
            return 0;
        }

        /* renamed from: b */
        public void mo4687b(RecyclerView recyclerView, int i, int i2) {
        }

        public boolean br_() {
            return this.f4738B;
        }

        public boolean bs_() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean bt_() {
            return false;
        }

        /* renamed from: c */
        public int mo4735c(C1349s sVar) {
            return 0;
        }

        /* renamed from: c */
        public void mo4689c(C1343o oVar, C1349s sVar) {
        }

        /* renamed from: c */
        public void mo5044c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int mo4737d(C1349s sVar) {
            return 0;
        }

        /* renamed from: d */
        public Parcelable mo4739d() {
            return null;
        }

        /* renamed from: d */
        public void mo5047d(RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public int mo4740e(C1349s sVar) {
            return 0;
        }

        /* renamed from: e */
        public void mo4741e(int i) {
        }

        /* renamed from: e */
        public boolean mo4742e() {
            return false;
        }

        /* renamed from: f */
        public int mo4744f(C1349s sVar) {
            return 0;
        }

        /* renamed from: f */
        public boolean mo4745f() {
            return false;
        }

        /* renamed from: g */
        public int mo4746g(C1349s sVar) {
            return 0;
        }

        /* renamed from: j */
        public void mo5056j(int i) {
        }

        /* renamed from: a */
        public void mo4673a(Rect rect, int i, int i2) {
            mo5046d(m4405a(i, rect.width() + mo5063t() + mo5065v(), mo5014B()), m4405a(i2, rect.height() + mo5064u() + mo5066w(), mo5015C()));
        }

        /* renamed from: a */
        public void mo4729a(String str) {
            if (this.f4750v != null) {
                this.f4750v.mo4804a(str);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5036b(RecyclerView recyclerView, C1343o oVar) {
            this.f4737A = false;
            mo4725a(recyclerView, oVar);
        }

        /* renamed from: a */
        public final boolean mo5031a(Runnable runnable) {
            if (this.f4750v != null) {
                return this.f4750v.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: a */
        public LayoutParams mo4669a(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new LayoutParams((MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* renamed from: a */
        public LayoutParams mo4668a(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: a */
        public final void mo5022a(C1346r rVar) {
            if (!(this.f4753y == null || rVar == this.f4753y || !this.f4753y.f4782k)) {
                this.f4753y.mo5112d();
            }
            this.f4753y = rVar;
            C1346r rVar2 = this.f4753y;
            rVar2.f4779h = this.f4750v;
            rVar2.f4780i = this;
            if (rVar2.f4778g != -1) {
                rVar2.f4779h.f4646E.f4792a = rVar2.f4778g;
                rVar2.f4782k = true;
                rVar2.f4781j = true;
                rVar2.f4783l = rVar2.f4779h.f4703n.mo4736c(rVar2.f4778g);
                rVar2.f4779h.f4643B.mo5120a();
                rVar2.f4784m = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: a */
        public final void mo5023a(View view) {
            mo5024a(view, -1);
        }

        /* renamed from: a */
        public final void mo5024a(View view, int i) {
            m4412a(view, i, true);
        }

        /* renamed from: b */
        public final void mo5037b(View view) {
            mo5038b(view, -1);
        }

        /* renamed from: b */
        public final void mo5038b(View view, int i) {
            m4412a(view, i, false);
        }

        /* renamed from: a */
        public final void mo5026a(View view, C1343o oVar) {
            m4427o(view);
            oVar.mo5094a(view);
        }

        /* renamed from: a */
        public final void mo5018a(int i, C1343o oVar) {
            View g = mo5050g(i);
            mo4672a(i);
            oVar.mo5094a(g);
        }

        /* renamed from: a */
        public final void mo5020a(C1343o oVar) {
            for (int s = mo5062s() - 1; s >= 0; s--) {
                m4410a(oVar, s, mo5050g(s));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5029a(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.f4739C || !mo74369b(view.getMeasuredWidth(), i, layoutParams.width) || !mo74369b(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo5040b(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.f4739C || !mo74369b(view.getWidth(), i, layoutParams.width) || !mo74369b(view.getHeight(), i2, layoutParams.height);
        }

        /* renamed from: a */
        public final void mo5027a(View view, boolean z, Rect rect) {
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).f4722d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f4750v != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f4750v.f4701l;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: b */
        public final void mo5039b(View view, Rect rect) {
            if (this.f4750v == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f4750v.mo4872h(view));
            }
        }

        /* renamed from: a */
        private int[] m4414a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int t = mo5063t();
            int u = mo5064u();
            int v = this.f4745I - mo5065v();
            int w = this.f4746J - mo5066w();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - t;
            int min = Math.min(0, i);
            int i2 = top - u;
            int min2 = Math.min(0, i2);
            int i3 = width - v;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - w);
            if (mo5060q() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: a */
        public final boolean mo5028a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] a = m4414a(recyclerView, view, rect, z);
            int i = a[0];
            int i2 = a[1];
            if ((z2 && !m4420d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4795a(i, i2);
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo5030a(View view, boolean z, boolean z2) {
            boolean z3 = this.f4751w.mo5708a(view, 24579) && this.f4752x.mo5708a(view, 24579);
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: a */
        public void mo4682a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo5044c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo5021a(C1343o oVar, C1349s sVar, int i, int i2) {
            this.f4750v.mo4846e(i, i2);
        }

        /* renamed from: a */
        public void mo4728a(AccessibilityEvent accessibilityEvent) {
            C1343o oVar = this.f4750v.f4694e;
            C1349s sVar = this.f4750v.f4646E;
            if (this.f4750v != null && accessibilityEvent != null) {
                boolean z = true;
                if (!this.f4750v.canScrollVertically(1) && !this.f4750v.canScrollVertically(-1) && !this.f4750v.canScrollHorizontally(-1) && !this.f4750v.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.f4750v.f4702m != null) {
                    accessibilityEvent.setItemCount(this.f4750v.f4702m.getItemCount());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5025a(View view, C1008c cVar) {
            C1352v d = RecyclerView.m4272d(view);
            if (d != null && !d.isRemoved() && !this.f4749u.mo5839d(d.itemView)) {
                mo4676a(this.f4750v.f4694e, this.f4750v.f4646E, view, cVar);
            }
        }

        /* renamed from: a */
        public void mo4676a(C1343o oVar, C1349s sVar, View view, C1008c cVar) {
            cVar.mo3134a((Object) C1011c.m2925a(mo4745f() ? m4418c(view) : 0, 1, mo4742e() ? m4418c(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public int mo4666a(C1343o oVar, C1349s sVar) {
            if (this.f4750v == null || this.f4750v.f4702m == null || !mo4745f()) {
                return 1;
            }
            return this.f4750v.f4702m.getItemCount();
        }

        /* renamed from: B */
        public final int mo5014B() {
            return C1056u.m3065k(this.f4750v);
        }

        /* renamed from: C */
        public final int mo5015C() {
            return C1056u.m3066l(this.f4750v);
        }

        /* renamed from: q */
        public final int mo5060q() {
            return C1056u.m3055f(this.f4750v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D */
        public final void mo5016D() {
            if (this.f4753y != null) {
                this.f4753y.mo5112d();
            }
        }

        /* renamed from: o */
        public final boolean mo5058o() {
            if (this.f4750v == null || !this.f4750v.f4698i) {
                return false;
            }
            return true;
        }

        /* renamed from: p */
        public final boolean mo5059p() {
            if (this.f4753y == null || !this.f4753y.f4782k) {
                return false;
            }
            return true;
        }

        /* renamed from: s */
        public final int mo5062s() {
            if (this.f4749u != null) {
                return this.f4749u.mo5828a();
            }
            return 0;
        }

        /* renamed from: t */
        public final int mo5063t() {
            if (this.f4750v != null) {
                return this.f4750v.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: u */
        public final int mo5064u() {
            if (this.f4750v != null) {
                return this.f4750v.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: v */
        public final int mo5065v() {
            if (this.f4750v != null) {
                return this.f4750v.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: w */
        public final int mo5066w() {
            if (this.f4750v != null) {
                return this.f4750v.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: x */
        public final int mo5067x() {
            if (this.f4750v != null) {
                return C1056u.m3061i(this.f4750v);
            }
            return 0;
        }

        /* renamed from: y */
        public final int mo5068y() {
            if (this.f4750v != null) {
                return C1056u.m3063j(this.f4750v);
            }
            return 0;
        }

        /* renamed from: A */
        public final int mo5013A() {
            C1322a aVar;
            if (this.f4750v != null) {
                aVar = this.f4750v.getAdapter();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                return aVar.getItemCount();
            }
            return 0;
        }

        /* renamed from: n */
        public final void mo5057n() {
            if (this.f4750v != null) {
                this.f4750v.requestLayout();
            }
        }

        /* renamed from: r */
        public final void mo5061r() {
            for (int s = mo5062s() - 1; s >= 0; s--) {
                this.f4749u.mo5829a(s);
            }
        }

        /* renamed from: z */
        public final View mo5069z() {
            if (this.f4750v == null) {
                return null;
            }
            View focusedChild = this.f4750v.getFocusedChild();
            if (focusedChild == null || this.f4749u.mo5839d(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: a */
        private void mo4672a(int i) {
            if (mo5050g(i) != null) {
                this.f4749u.mo5829a(i);
            }
        }

        /* renamed from: b */
        private void mo4731b(int i) {
            mo5050g(i);
            this.f4749u.mo5838d(i);
        }

        /* renamed from: c */
        public static int m4418c(View view) {
            return ((LayoutParams) view.getLayoutParams()).bw_();
        }

        /* renamed from: k */
        public static int m4423k(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4722d.top;
        }

        /* renamed from: l */
        public static int m4424l(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4722d.bottom;
        }

        /* renamed from: m */
        public static int m4425m(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4722d.left;
        }

        /* renamed from: n */
        public static int m4426n(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4722d.right;
        }

        /* renamed from: g */
        public final int mo5049g(View view) {
            return view.getLeft() - m4425m(view);
        }

        /* renamed from: h */
        public final int mo5051h(View view) {
            return view.getTop() - m4423k(view);
        }

        /* renamed from: i */
        public final int mo5053i(View view) {
            return view.getRight() + m4426n(view);
        }

        /* renamed from: j */
        public final int mo5055j(View view) {
            return view.getBottom() + m4424l(view);
        }

        /* renamed from: e */
        public static int m4421e(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4722d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: f */
        public static int m4422f(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4722d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: o */
        private void m4427o(View view) {
            C1501t tVar = this.f4749u;
            int a = tVar.f5396a.mo4931a(view);
            if (a >= 0) {
                if (tVar.f5397b.mo5846d(a)) {
                    tVar.mo5835b(view);
                }
                tVar.f5396a.mo4932a(a);
            }
        }

        /* renamed from: c */
        public final void mo5042c(C1343o oVar) {
            for (int s = mo5062s() - 1; s >= 0; s--) {
                if (!RecyclerView.m4272d(mo5050g(s)).shouldIgnore()) {
                    mo5018a(s, oVar);
                }
            }
        }

        /* renamed from: d */
        public final View mo5045d(View view) {
            if (this.f4750v == null) {
                return null;
            }
            View c = this.f4750v.mo4822c(view);
            if (c != null && !this.f4749u.mo5839d(c)) {
                return c;
            }
            return null;
        }

        /* renamed from: g */
        public final View mo5050g(int i) {
            if (this.f4749u != null) {
                return this.f4749u.mo5834b(i);
            }
            return null;
        }

        /* renamed from: h */
        public void mo5052h(int i) {
            if (this.f4750v != null) {
                RecyclerView recyclerView = this.f4750v;
                int a = recyclerView.f4696g.mo5828a();
                for (int i2 = 0; i2 < a; i2++) {
                    recyclerView.f4696g.mo5834b(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: i */
        public void mo5054i(int i) {
            if (this.f4750v != null) {
                RecyclerView recyclerView = this.f4750v;
                int a = recyclerView.f4696g.mo5828a();
                for (int i2 = 0; i2 < a; i2++) {
                    recyclerView.f4696g.mo5834b(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo5048e(RecyclerView recyclerView) {
            mo5033b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: c */
        public View mo4736c(int i) {
            int s = mo5062s();
            for (int i2 = 0; i2 < s; i2++) {
                View g = mo5050g(i2);
                C1352v d = RecyclerView.m4272d(g);
                if (d != null && d.getLayoutPosition() == i && !d.shouldIgnore() && (this.f4750v.f4646E.f4798g || !d.isRemoved())) {
                    return g;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5034b(C1343o oVar) {
            int size = oVar.f4767a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = ((C1352v) oVar.f4767a.get(i)).itemView;
                C1352v d = RecyclerView.m4272d(view);
                if (!d.shouldIgnore()) {
                    d.setIsRecyclable(false);
                    if (d.isTmpDetached()) {
                        this.f4750v.removeDetachedView(view, false);
                    }
                    if (this.f4750v.f4642A != null) {
                        this.f4750v.f4642A.mo4999c(d);
                    }
                    d.setIsRecyclable(true);
                    oVar.mo5099b(view);
                }
            }
            oVar.f4767a.clear();
            if (oVar.f4768b != null) {
                oVar.f4768b.clear();
            }
            if (size > 0) {
                this.f4750v.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5043c(RecyclerView recyclerView) {
            this.f4737A = true;
            mo5047d(recyclerView);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5035b(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4750v = null;
                this.f4749u = null;
                this.f4745I = 0;
                this.f4746J = 0;
            } else {
                this.f4750v = recyclerView;
                this.f4749u = recyclerView.f4696g;
                this.f4745I = recyclerView.getWidth();
                this.f4746J = recyclerView.getHeight();
            }
            this.f4743G = 1073741824;
            this.f4744H = 1073741824;
        }

        /* renamed from: a */
        public static void m4413a(View view, Rect rect) {
            RecyclerView.m4270b(view, rect);
        }

        /* renamed from: d */
        public void mo5046d(int i, int i2) {
            this.f4750v.setMeasuredDimension(i, i2);
        }

        /* renamed from: b */
        public int mo4686b(C1343o oVar, C1349s sVar) {
            if (this.f4750v == null || this.f4750v.f4702m == null || !mo4742e()) {
                return 1;
            }
            return this.f4750v.f4702m.getItemCount();
        }

        /* renamed from: c */
        private void m4419c(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C1352v d = RecyclerView.m4272d(view);
            if (d.isRemoved()) {
                this.f4750v.f4697h.mo5724e(d);
            } else {
                this.f4750v.f4697h.mo5725f(d);
            }
            this.f4749u.mo5831a(view, i, layoutParams, d.isRemoved());
        }

        /* renamed from: a */
        private void mo4721a(int i, int i2) {
            View g = mo5050g(i);
            if (g != null) {
                mo4731b(i);
                m4419c(g, i2);
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f4750v.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5033b(int i, int i2) {
            this.f4745I = MeasureSpec.getSize(i);
            this.f4743G = MeasureSpec.getMode(i);
            if (this.f4743G == 0 && !RecyclerView.f4639b) {
                this.f4745I = 0;
            }
            this.f4746J = MeasureSpec.getSize(i2);
            this.f4744H = MeasureSpec.getMode(i2);
            if (this.f4744H == 0 && !RecyclerView.f4639b) {
                this.f4746J = 0;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5041c(int i, int i2) {
            int s = mo5062s();
            if (s == 0) {
                this.f4750v.mo4846e(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = DynamicTabYellowPointVersion.DEFAULT;
            int i6 = DynamicTabYellowPointVersion.DEFAULT;
            for (int i7 = 0; i7 < s; i7++) {
                View g = mo5050g(i7);
                Rect rect = this.f4750v.f4700k;
                m4413a(g, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.f4750v.f4700k.set(i3, i4, i5, i6);
            mo4673a(this.f4750v.f4700k, i, i2);
        }

        /* renamed from: a */
        public static int m4405a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: d */
        private boolean m4420d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int t = mo5063t();
            int u = mo5064u();
            int v = this.f4745I - mo5065v();
            int w = this.f4746J - mo5066w();
            Rect rect = this.f4750v.f4700k;
            m4413a(focusedChild, rect);
            if (rect.left - i >= v || rect.right - i <= t || rect.top - i2 >= w || rect.bottom - i2 <= u) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private static boolean mo74369b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a_ */
        public final void mo5032a_(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect h = this.f4750v.mo4872h(view);
            int i3 = h.top + h.bottom + 0;
            int a = m4406a(this.f4745I, this.f4743G, mo5063t() + mo5065v() + layoutParams.leftMargin + layoutParams.rightMargin + h.left + h.right + 0, layoutParams.width, mo4742e());
            int a2 = m4406a(this.f4746J, this.f4744H, mo5064u() + mo5066w() + layoutParams.topMargin + layoutParams.bottomMargin + i3, layoutParams.height, mo4745f());
            if (mo5040b(view, a, a2, layoutParams)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        private void m4410a(C1343o oVar, int i, View view) {
            C1352v d = RecyclerView.m4272d(view);
            if (!d.shouldIgnore()) {
                if (!d.isInvalid() || d.isRemoved() || this.f4750v.f4702m.mHasStableIds) {
                    mo4731b(i);
                    oVar.mo5102c(view);
                    this.f4750v.f4697h.mo5727h(d);
                    return;
                }
                mo4672a(i);
                oVar.mo5092a(d);
            }
        }

        /* renamed from: a */
        private void m4412a(View view, int i, boolean z) {
            C1352v d = RecyclerView.m4272d(view);
            if (z || d.isRemoved()) {
                this.f4750v.f4697h.mo5724e(d);
            } else {
                this.f4750v.f4697h.mo5725f(d);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (d.wasReturnedFromScrap() || d.isScrap()) {
                if (d.isScrap()) {
                    d.unScrap();
                } else {
                    d.clearReturnedFromScrapFlag();
                }
                this.f4749u.mo5831a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4750v) {
                int c = this.f4749u.mo5836c(view);
                if (i == -1) {
                    i = this.f4749u.mo5828a();
                }
                if (c == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f4750v.indexOfChild(view));
                    sb.append(this.f4750v.mo4794a());
                    throw new IllegalStateException(sb.toString());
                } else if (c != i) {
                    this.f4750v.f4703n.mo4721a(c, i);
                }
            } else {
                this.f4749u.mo5832a(view, i, false);
                layoutParams.f4723e = true;
                if (this.f4753y != null && this.f4753y.f4782k) {
                    this.f4753y.mo5109a(view);
                }
            }
            if (layoutParams.f4724f) {
                d.itemView.invalidate();
                layoutParams.f4724f = false;
            }
        }

        /* renamed from: a */
        public static C1336b m4407a(Context context, AttributeSet attributeSet, int i, int i2) {
            C1336b bVar = new C1336b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842993, R.attr.ln, R.attr.lo, R.attr.lp, R.attr.lq, R.attr.lr, R.attr.q_, R.attr.yg, R.attr.a2m, R.attr.a2x}, i, i2);
            bVar.f4757a = obtainStyledAttributes.getInt(0, 1);
            bVar.f4758b = obtainStyledAttributes.getInt(9, 1);
            bVar.f4759c = obtainStyledAttributes.getBoolean(8, false);
            bVar.f4760d = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m4406a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001c
                if (r7 < 0) goto L_0x0013
            L_0x0010:
                r6 = 1073741824(0x40000000, float:2.0)
                goto L_0x002f
            L_0x0013:
                if (r7 != r1) goto L_0x002e
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002e
                if (r5 == r3) goto L_0x0021
                goto L_0x002e
            L_0x001c:
                if (r7 < 0) goto L_0x001f
                goto L_0x0010
            L_0x001f:
                if (r7 != r1) goto L_0x0024
            L_0x0021:
                r7 = r4
                r6 = r5
                goto L_0x002f
            L_0x0024:
                if (r7 != r0) goto L_0x002e
                if (r5 == r2) goto L_0x002a
                if (r5 != r3) goto L_0x002c
            L_0x002a:
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x002c:
                r7 = r4
                goto L_0x002f
            L_0x002e:
                r7 = 0
            L_0x002f:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.C1332i.m4406a(int, int, int, int, boolean):int");
        }

        /* renamed from: b */
        public static void m4416b(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f4722d;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* renamed from: a */
        public static void m4411a(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4722d;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$j */
    public interface C1337j {
        /* renamed from: a */
        void mo5076a(View view);

        /* renamed from: b */
        void mo5077b(View view);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$k */
    public static abstract class C1338k {
        /* renamed from: a */
        public abstract boolean mo5078a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$l */
    public interface C1339l {
        /* renamed from: a */
        void mo5079a(boolean z);

        /* renamed from: a */
        boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$m */
    public static abstract class C1340m {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$n */
    public static class C1341n {

        /* renamed from: a */
        SparseArray<C1342a> f4761a = new SparseArray<>();

        /* renamed from: b */
        int f4762b = 0;

        /* renamed from: android.support.v7.widget.RecyclerView$n$a */
        static class C1342a {

            /* renamed from: a */
            final ArrayList<C1352v> f4763a = new ArrayList<>();

            /* renamed from: b */
            int f4764b = 5;

            /* renamed from: c */
            long f4765c = 0;

            /* renamed from: d */
            long f4766d = 0;

            C1342a() {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5087b() {
            this.f4762b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5088c() {
            this.f4762b--;
        }

        /* renamed from: a */
        public final void mo5085a() {
            for (int i = 0; i < this.f4761a.size(); i++) {
                ((C1342a) this.f4761a.valueAt(i)).f4763a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1342a mo5084a(int i) {
            C1342a aVar = (C1342a) this.f4761a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1342a aVar2 = new C1342a();
            this.f4761a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        public final void mo5086a(C1352v vVar) {
            int i = vVar.mItemViewType;
            ArrayList<C1352v> arrayList = mo5084a(i).f4763a;
            if (((C1342a) this.f4761a.get(i)).f4764b > arrayList.size()) {
                vVar.resetInternal();
                arrayList.add(vVar);
            }
        }

        /* renamed from: a */
        static long m4538a(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return ((j / 4) * 3) + (j2 / 4);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$o */
    public final class C1343o {

        /* renamed from: a */
        final ArrayList<C1352v> f4767a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C1352v> f4768b = null;

        /* renamed from: c */
        final ArrayList<C1352v> f4769c = new ArrayList<>();

        /* renamed from: d */
        public final List<C1352v> f4770d = Collections.unmodifiableList(this.f4767a);

        /* renamed from: e */
        int f4771e = 2;

        /* renamed from: f */
        int f4772f = 2;

        /* renamed from: g */
        C1341n f4773g;

        /* renamed from: h */
        public C1350t f4774h;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C1352v mo5090a(int i, boolean z, long j) {
            return C1427am.m4955a(this, i, z, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C1341n mo5100c() {
            if (this.f4773g == null) {
                this.f4773g = new C1341n();
            }
            return this.f4773g;
        }

        /* renamed from: a */
        public final void mo5091a() {
            this.f4767a.clear();
            m4550f();
        }

        /* renamed from: f */
        private void m4550f() {
            for (int size = this.f4769c.size() - 1; size >= 0; size--) {
                mo5101c(size);
            }
            this.f4769c.clear();
            if (RecyclerView.f4641d) {
                RecyclerView.this.f4645D.mo5484a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5097b() {
            int i;
            if (RecyclerView.this.f4703n != null) {
                i = RecyclerView.this.f4703n.f4741E;
            } else {
                i = 0;
            }
            this.f4772f = this.f4771e + i;
            for (int size = this.f4769c.size() - 1; size >= 0 && this.f4769c.size() > this.f4772f; size--) {
                mo5101c(size);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo5103d() {
            int size = this.f4769c.size();
            for (int i = 0; i < size; i++) {
                C1352v vVar = (C1352v) this.f4769c.get(i);
                if (vVar != null) {
                    vVar.addFlags(6);
                    vVar.addChangePayload(null);
                }
            }
            if (RecyclerView.this.f4702m == null || !RecyclerView.this.f4702m.mHasStableIds) {
                m4550f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo5104e() {
            int size = this.f4769c.size();
            for (int i = 0; i < size; i++) {
                ((C1352v) this.f4769c.get(i)).clearOldPosition();
            }
            int size2 = this.f4767a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C1352v) this.f4767a.get(i2)).clearOldPosition();
            }
            if (this.f4768b != null) {
                int size3 = this.f4768b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C1352v) this.f4768b.get(i3)).clearOldPosition();
                }
            }
        }

        /* renamed from: b */
        public final View mo5096b(int i) {
            return m4545a(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5098b(C1352v vVar) {
            if (vVar.mInChangeScrap) {
                this.f4768b.remove(vVar);
            } else {
                this.f4767a.remove(vVar);
            }
            vVar.mScrapContainer = null;
            vVar.mInChangeScrap = false;
            vVar.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5101c(int i) {
            mo5093a((C1352v) this.f4769c.get(i), true);
            this.f4769c.remove(i);
        }

        public C1343o() {
        }

        /* renamed from: c */
        private void m4548c(C1352v vVar) {
            if (RecyclerView.this.f4704o != null) {
                RecyclerView.this.f4704o.onViewRecycled(vVar);
            }
            if (RecyclerView.this.f4702m != null) {
                RecyclerView.this.f4702m.onViewRecycled(vVar);
            }
            if (RecyclerView.this.f4646E != null) {
                RecyclerView.this.f4697h.mo5726g(vVar);
            }
        }

        /* renamed from: d */
        private C1352v m4549d(int i) {
            if (this.f4768b != null) {
                int size = this.f4768b.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C1352v vVar = (C1352v) this.f4768b.get(i3);
                        if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i) {
                            i3++;
                        } else {
                            vVar.addFlags(32);
                            return vVar;
                        }
                    }
                    if (RecyclerView.this.f4702m.mHasStableIds) {
                        int b = RecyclerView.this.f4695f.mo5747b(i);
                        if (b > 0 && b < RecyclerView.this.f4702m.getItemCount()) {
                            long itemId = RecyclerView.this.f4702m.getItemId(b);
                            while (i2 < size) {
                                C1352v vVar2 = (C1352v) this.f4768b.get(i2);
                                if (vVar2.wasReturnedFromScrap() || vVar2.mItemId != itemId) {
                                    i2++;
                                } else {
                                    vVar2.addFlags(32);
                                    return vVar2;
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final int mo5089a(int i) {
            if (i < 0 || i >= RecyclerView.this.f4646E.mo5115a()) {
                StringBuilder sb = new StringBuilder("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f4646E.mo5115a());
                sb.append(RecyclerView.this.mo4794a());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.f4646E.f4798g) {
                return i;
            } else {
                return RecyclerView.this.f4695f.mo5747b(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5099b(View view) {
            C1352v d = RecyclerView.m4272d(view);
            d.mScrapContainer = null;
            d.mInChangeScrap = false;
            d.clearReturnedFromScrapFlag();
            mo5092a(d);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5102c(View view) {
            C1352v d = RecyclerView.m4272d(view);
            if (!d.hasAnyOfTheFlags(12) && d.isUpdated() && !RecyclerView.this.mo4808a(d)) {
                if (this.f4768b == null) {
                    this.f4768b = new ArrayList<>();
                }
                d.setScrapContainer(this, true);
                this.f4768b.add(d);
            } else if (!d.isInvalid() || d.isRemoved() || RecyclerView.this.f4702m.mHasStableIds) {
                d.setScrapContainer(this, false);
                this.f4767a.add(d);
            } else {
                StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.mo4794a());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5092a(C1352v vVar) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (vVar.isScrap() || vVar.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(vVar.isScrap());
                sb.append(" isAttached:");
                if (vVar.itemView.getParent() != null) {
                    z3 = true;
                }
                sb.append(z3);
                sb.append(RecyclerView.this.mo4794a());
                throw new IllegalArgumentException(sb.toString());
            } else if (vVar.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(vVar);
                sb2.append(RecyclerView.this.mo4794a());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!vVar.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = vVar.doesTransientStatePreventRecycling();
                if (RecyclerView.this.f4702m == null || !doesTransientStatePreventRecycling || !RecyclerView.this.f4702m.onFailedToRecycleView(vVar)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || vVar.isRecyclable()) {
                    if (this.f4772f <= 0 || vVar.hasAnyOfTheFlags(526)) {
                        z2 = false;
                    } else {
                        int size = this.f4769c.size();
                        if (size >= this.f4772f && size > 0) {
                            mo5101c(0);
                            size--;
                        }
                        if (RecyclerView.f4641d && size > 0 && !RecyclerView.this.f4645D.mo5486a(vVar.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f4645D.mo5486a(((C1352v) this.f4769c.get(i)).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f4769c.add(size, vVar);
                        z2 = true;
                    }
                    if (!z2) {
                        mo5093a(vVar, true);
                        z3 = true;
                    }
                } else {
                    z2 = false;
                }
                RecyclerView.this.f4697h.mo5726g(vVar);
                if (!z2 && !z3 && doesTransientStatePreventRecycling) {
                    vVar.mOwnerRecyclerView = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.mo4794a());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* renamed from: a */
        public final void mo5094a(View view) {
            C1352v d = RecyclerView.m4272d(view);
            if (d.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d.isScrap()) {
                d.unScrap();
            } else if (d.wasReturnedFromScrap()) {
                d.clearReturnedFromScrapFlag();
            }
            mo5092a(d);
        }

        /* renamed from: a */
        private View m4545a(int i, boolean z) {
            return mo5090a(i, false, Long.MAX_VALUE).itemView;
        }

        /* renamed from: a */
        private void m4546a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4546a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: b */
        private C1352v m4547b(int i, boolean z) {
            View view;
            int size = this.f4767a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1352v vVar = (C1352v) this.f4767a.get(i3);
                if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i || vVar.isInvalid() || (!RecyclerView.this.f4646E.f4798g && vVar.isRemoved())) {
                    i3++;
                } else {
                    vVar.addFlags(32);
                    return vVar;
                }
            }
            if (!z) {
                C1501t tVar = RecyclerView.this.f4696g;
                int size2 = tVar.f5398c.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        view = null;
                        break;
                    }
                    view = (View) tVar.f5398c.get(i4);
                    C1352v b = tVar.f5396a.mo4935b(view);
                    if (b.getLayoutPosition() == i && !b.isInvalid() && !b.isRemoved()) {
                        break;
                    }
                    i4++;
                }
                if (view != null) {
                    C1352v d = RecyclerView.m4272d(view);
                    C1501t tVar2 = RecyclerView.this.f4696g;
                    int a = tVar2.f5396a.mo4931a(view);
                    if (a < 0) {
                        StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
                        sb.append(view);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (tVar2.f5397b.mo5845c(a)) {
                        tVar2.f5397b.mo5844b(a);
                        tVar2.mo5835b(view);
                        int c = RecyclerView.this.f4696g.mo5836c(view);
                        if (c != -1) {
                            RecyclerView.this.f4696g.mo5838d(c);
                            mo5102c(view);
                            d.addFlags(8224);
                            return d;
                        }
                        StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                        sb2.append(d);
                        sb2.append(RecyclerView.this.mo4794a());
                        throw new IllegalStateException(sb2.toString());
                    } else {
                        StringBuilder sb3 = new StringBuilder("trying to unhide a view that was not hidden");
                        sb3.append(view);
                        throw new RuntimeException(sb3.toString());
                    }
                }
            }
            int size3 = this.f4769c.size();
            while (i2 < size3) {
                C1352v vVar2 = (C1352v) this.f4769c.get(i2);
                if (vVar2.isInvalid() || vVar2.getLayoutPosition() != i) {
                    i2++;
                } else {
                    if (!z) {
                        this.f4769c.remove(i2);
                    }
                    return vVar2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5093a(C1352v vVar, boolean z) {
            RecyclerView.m4269b(vVar);
            if (vVar.hasAnyOfTheFlags(16384)) {
                vVar.setFlags(0, 16384);
                C1056u.m3031a(vVar.itemView, (C1002a) null);
            }
            if (z) {
                m4548c(vVar);
            }
            vVar.mOwnerRecyclerView = null;
            mo5100c().mo5086a(vVar);
        }

        /* renamed from: a */
        private C1352v m4544a(long j, int i, boolean z) {
            for (int size = this.f4767a.size() - 1; size >= 0; size--) {
                C1352v vVar = (C1352v) this.f4767a.get(size);
                if (vVar.mItemId == j && !vVar.wasReturnedFromScrap()) {
                    if (i == vVar.mItemViewType) {
                        vVar.addFlags(32);
                        if (vVar.isRemoved() && !RecyclerView.this.f4646E.f4798g) {
                            vVar.setFlags(2, 14);
                        }
                        return vVar;
                    } else if (!z) {
                        this.f4767a.remove(size);
                        RecyclerView.this.removeDetachedView(vVar.itemView, false);
                        mo5099b(vVar.itemView);
                    }
                }
            }
            int size2 = this.f4769c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1352v vVar2 = (C1352v) this.f4769c.get(size2);
                if (vVar2.mItemId == j) {
                    if (i == vVar2.mItemViewType) {
                        if (!z) {
                            this.f4769c.remove(size2);
                        }
                        return vVar2;
                    } else if (!z) {
                        mo5101c(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02af, code lost:
            if (r3 == false) goto L_0x027a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x029a  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x02d8  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x02ff  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x030a  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x0318  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00cb  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.support.p043v7.widget.RecyclerView.C1352v mo5095b(int r18, boolean r19, long r20) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 < 0) goto L_0x033b
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r5 = r5.f4646E
                int r5 = r5.mo5115a()
                if (r1 >= r5) goto L_0x033b
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r5 = r5.f4646E
                boolean r5 = r5.f4798g
                r7 = 1
                r8 = 0
                if (r5 == 0) goto L_0x0024
                android.support.v7.widget.RecyclerView$v r5 = r17.m4549d(r18)
                if (r5 == 0) goto L_0x0025
                r9 = 1
                goto L_0x0026
            L_0x0024:
                r5 = 0
            L_0x0025:
                r9 = 0
            L_0x0026:
                if (r5 != 0) goto L_0x00c2
                android.support.v7.widget.RecyclerView$v r5 = r17.m4547b(r18, r19)
                if (r5 == 0) goto L_0x00c2
                boolean r10 = r5.isRemoved()
                if (r10 == 0) goto L_0x003b
                android.support.v7.widget.RecyclerView r10 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r10 = r10.f4646E
                boolean r10 = r10.f4798g
                goto L_0x007c
            L_0x003b:
                int r10 = r5.mPosition
                if (r10 < 0) goto L_0x00a5
                int r10 = r5.mPosition
                android.support.v7.widget.RecyclerView r11 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r11 = r11.f4702m
                int r11 = r11.getItemCount()
                if (r10 >= r11) goto L_0x00a5
                android.support.v7.widget.RecyclerView r10 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r10 = r10.f4646E
                boolean r10 = r10.f4798g
                if (r10 != 0) goto L_0x0063
                android.support.v7.widget.RecyclerView r10 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r10 = r10.f4702m
                int r11 = r5.mPosition
                int r10 = r10.getItemViewType(r11)
                int r11 = r5.mItemViewType
                if (r10 == r11) goto L_0x0063
            L_0x0061:
                r10 = 0
                goto L_0x007c
            L_0x0063:
                android.support.v7.widget.RecyclerView r10 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r10 = r10.f4702m
                boolean r10 = r10.mHasStableIds
                if (r10 == 0) goto L_0x007b
                long r10 = r5.mItemId
                android.support.v7.widget.RecyclerView r12 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r12 = r12.f4702m
                int r13 = r5.mPosition
                long r12 = r12.getItemId(r13)
                int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r14 != 0) goto L_0x0061
            L_0x007b:
                r10 = 1
            L_0x007c:
                if (r10 != 0) goto L_0x00a3
                if (r2 != 0) goto L_0x00a1
                r10 = 4
                r5.addFlags(r10)
                boolean r10 = r5.isScrap()
                if (r10 == 0) goto L_0x0095
                android.support.v7.widget.RecyclerView r10 = android.support.p043v7.widget.RecyclerView.this
                android.view.View r11 = r5.itemView
                r10.removeDetachedView(r11, r8)
                r5.unScrap()
                goto L_0x009e
            L_0x0095:
                boolean r10 = r5.wasReturnedFromScrap()
                if (r10 == 0) goto L_0x009e
                r5.clearReturnedFromScrapFlag()
            L_0x009e:
                r0.mo5092a(r5)
            L_0x00a1:
                r5 = 0
                goto L_0x00c2
            L_0x00a3:
                r9 = 1
                goto L_0x00c2
            L_0x00a5:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.<init>(r3)
                r2.append(r5)
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                java.lang.String r3 = r3.mo4794a()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00c2:
                r10 = 0
                r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                if (r5 != 0) goto L_0x021e
                android.support.v7.widget.RecyclerView r14 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.d r14 = r14.f4695f
                int r14 = r14.mo5747b(r1)
                if (r14 < 0) goto L_0x01e9
                android.support.v7.widget.RecyclerView r15 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r15 = r15.f4702m
                int r15 = r15.getItemCount()
                if (r14 >= r15) goto L_0x01e9
                android.support.v7.widget.RecyclerView r15 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r15 = r15.f4702m
                int r15 = r15.getItemViewType(r14)
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r6 = r6.f4702m
                boolean r6 = r6.mHasStableIds
                if (r6 == 0) goto L_0x0100
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r5 = r5.f4702m
                long r5 = r5.getItemId(r14)
                android.support.v7.widget.RecyclerView$v r5 = r0.m4544a(r5, r15, r2)
                if (r5 == 0) goto L_0x0100
                r5.mPosition = r14
                r9 = 1
            L_0x0100:
                if (r5 != 0) goto L_0x0151
                android.support.v7.widget.RecyclerView$t r2 = r0.f4774h
                if (r2 == 0) goto L_0x0151
                android.support.v7.widget.RecyclerView$t r2 = r0.f4774h
                android.view.View r2 = r2.mo5118a(r0, r1, r15)
                if (r2 == 0) goto L_0x0151
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$v r5 = r5.mo4812b(r2)
                if (r5 == 0) goto L_0x0137
                boolean r2 = r5.shouldIgnore()
                if (r2 != 0) goto L_0x011d
                goto L_0x0151
            L_0x011d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r2.<init>(r3)
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                java.lang.String r3 = r3.mo4794a()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0137:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r2.<init>(r3)
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                java.lang.String r3 = r3.mo4794a()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0151:
                if (r5 != 0) goto L_0x0190
                android.support.v7.widget.RecyclerView$n r2 = r17.mo5100c()
                android.util.SparseArray<android.support.v7.widget.RecyclerView$n$a> r2 = r2.f4761a
                java.lang.Object r2 = r2.get(r15)
                android.support.v7.widget.RecyclerView$n$a r2 = (android.support.p043v7.widget.RecyclerView.C1341n.C1342a) r2
                if (r2 == 0) goto L_0x0178
                java.util.ArrayList<android.support.v7.widget.RecyclerView$v> r5 = r2.f4763a
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x0178
                java.util.ArrayList<android.support.v7.widget.RecyclerView$v> r2 = r2.f4763a
                int r5 = r2.size()
                int r5 = r5 - r7
                java.lang.Object r2 = r2.remove(r5)
                r6 = r2
                android.support.v7.widget.RecyclerView$v r6 = (android.support.p043v7.widget.RecyclerView.C1352v) r6
                goto L_0x0179
            L_0x0178:
                r6 = 0
            L_0x0179:
                if (r6 == 0) goto L_0x018f
                r6.resetInternal()
                boolean r2 = android.support.p043v7.widget.RecyclerView.f4638a
                if (r2 == 0) goto L_0x018f
                android.view.View r2 = r6.itemView
                boolean r2 = r2 instanceof android.view.ViewGroup
                if (r2 == 0) goto L_0x018f
                android.view.View r2 = r6.itemView
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0.m4546a(r2, r8)
            L_0x018f:
                r5 = r6
            L_0x0190:
                if (r5 != 0) goto L_0x021e
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                long r5 = r2.getNanoTime()
                int r2 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
                if (r2 == 0) goto L_0x01b5
                android.support.v7.widget.RecyclerView$n r2 = r0.f4773g
                android.support.v7.widget.RecyclerView$n$a r2 = r2.mo5084a(r15)
                long r12 = r2.f4765c
                int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r2 == 0) goto L_0x01b0
                long r12 = r12 + r5
                int r2 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
                if (r2 >= 0) goto L_0x01ae
                goto L_0x01b0
            L_0x01ae:
                r2 = 0
                goto L_0x01b1
            L_0x01b0:
                r2 = 1
            L_0x01b1:
                if (r2 != 0) goto L_0x01b5
                r2 = 0
                return r2
            L_0x01b5:
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r2 = r2.f4702m
                android.support.v7.widget.RecyclerView r12 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$v r2 = r2.createViewHolder(r12, r15)
                boolean r12 = android.support.p043v7.widget.RecyclerView.f4641d
                if (r12 == 0) goto L_0x01d2
                android.view.View r12 = r2.itemView
                android.support.v7.widget.RecyclerView r12 = android.support.p043v7.widget.RecyclerView.m4279i(r12)
                if (r12 == 0) goto L_0x01d2
                java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
                r13.<init>(r12)
                r2.mNestedRecyclerView = r13
            L_0x01d2:
                android.support.v7.widget.RecyclerView r12 = android.support.p043v7.widget.RecyclerView.this
                long r12 = r12.getNanoTime()
                android.support.v7.widget.RecyclerView$n r14 = r0.f4773g
                long r12 = r12 - r5
                android.support.v7.widget.RecyclerView$n$a r5 = r14.mo5084a(r15)
                long r14 = r5.f4765c
                long r12 = android.support.p043v7.widget.RecyclerView.C1341n.m4538a(r14, r12)
                r5.f4765c = r12
                r5 = r2
                goto L_0x021e
            L_0x01e9:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.<init>(r4)
                r3.append(r1)
                java.lang.String r1 = "(offset:"
                r3.append(r1)
                r3.append(r14)
                java.lang.String r1 = ").state:"
                r3.append(r1)
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r1 = r1.f4646E
                int r1 = r1.mo5115a()
                r3.append(r1)
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                java.lang.String r1 = r1.mo4794a()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L_0x021e:
                if (r9 == 0) goto L_0x0256
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.f4646E
                boolean r2 = r2.f4798g
                if (r2 != 0) goto L_0x0256
                r2 = 8192(0x2000, float:1.14794E-41)
                boolean r6 = r5.hasAnyOfTheFlags(r2)
                if (r6 == 0) goto L_0x0256
                r5.setFlags(r8, r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.f4646E
                boolean r2 = r2.f4801j
                if (r2 == 0) goto L_0x0256
                int r2 = android.support.p043v7.widget.RecyclerView.C1327f.m4386d(r5)
                r2 = r2 | 4096(0x1000, float:5.74E-42)
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$f r6 = r6.f4642A
                android.support.v7.widget.RecyclerView r12 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r12 = r12.f4646E
                java.util.List r13 = r5.getUnmodifiedPayloads()
                android.support.v7.widget.RecyclerView$f$b r2 = r6.mo4992a(r12, r5, r2, r13)
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                r6.mo4802a(r5, r2)
            L_0x0256:
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.f4646E
                boolean r2 = r2.f4798g
                if (r2 == 0) goto L_0x0267
                boolean r2 = r5.isBound()
                if (r2 == 0) goto L_0x0267
                r5.mPreLayoutPosition = r1
                goto L_0x027a
            L_0x0267:
                boolean r2 = r5.isBound()
                if (r2 == 0) goto L_0x027d
                boolean r2 = r5.needsUpdate()
                if (r2 != 0) goto L_0x027d
                boolean r2 = r5.isInvalid()
                if (r2 == 0) goto L_0x027a
                goto L_0x027d
            L_0x027a:
                r1 = 0
                goto L_0x0302
            L_0x027d:
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.d r2 = r2.f4695f
                int r2 = r2.mo5747b(r1)
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                r5.mOwnerRecyclerView = r6
                int r6 = r5.mItemViewType
                android.support.v7.widget.RecyclerView r12 = android.support.p043v7.widget.RecyclerView.this
                long r12 = r12.getNanoTime()
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r16 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
                if (r16 == 0) goto L_0x02b2
                android.support.v7.widget.RecyclerView$n r14 = r0.f4773g
                android.support.v7.widget.RecyclerView$n$a r6 = r14.mo5084a(r6)
                long r14 = r6.f4766d
                int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r6 == 0) goto L_0x02ae
                long r14 = r14 + r12
                int r6 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
                if (r6 >= 0) goto L_0x02ac
                goto L_0x02ae
            L_0x02ac:
                r3 = 0
                goto L_0x02af
            L_0x02ae:
                r3 = 1
            L_0x02af:
                if (r3 != 0) goto L_0x02b2
                goto L_0x027a
            L_0x02b2:
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r3 = r3.f4702m
                r3.bindViewHolder(r5, r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                long r2 = r2.getNanoTime()
                android.support.v7.widget.RecyclerView$n r4 = r0.f4773g
                int r6 = r5.mItemViewType
                long r2 = r2 - r12
                android.support.v7.widget.RecyclerView$n$a r4 = r4.mo5084a(r6)
                long r10 = r4.f4766d
                long r2 = android.support.p043v7.widget.RecyclerView.C1341n.m4538a(r10, r2)
                r4.f4766d = r2
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                boolean r2 = r2.mo4873h()
                if (r2 == 0) goto L_0x02f7
                android.view.View r2 = r5.itemView
                int r3 = android.support.p030v4.view.C1056u.m3053e(r2)
                if (r3 != 0) goto L_0x02e3
                android.support.p030v4.view.C1056u.m3043b(r2, r7)
            L_0x02e3:
                boolean r3 = android.support.p030v4.view.C1056u.m3046b(r2)
                if (r3 != 0) goto L_0x02f7
                r3 = 16384(0x4000, float:2.2959E-41)
                r5.addFlags(r3)
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.an r3 = r3.f4650I
                android.support.v4.view.a r3 = r3.f5126d
                android.support.p030v4.view.C1056u.m3031a(r2, r3)
            L_0x02f7:
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.f4646E
                boolean r2 = r2.f4798g
                if (r2 == 0) goto L_0x0301
                r5.mPreLayoutPosition = r1
            L_0x0301:
                r1 = 1
            L_0x0302:
                android.view.View r2 = r5.itemView
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                if (r2 != 0) goto L_0x0318
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
                android.support.v7.widget.RecyclerView$LayoutParams r2 = (android.support.p043v7.widget.RecyclerView.LayoutParams) r2
                android.view.View r3 = r5.itemView
                r3.setLayoutParams(r2)
                goto L_0x0330
            L_0x0318:
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                boolean r3 = r3.checkLayoutParams(r2)
                if (r3 != 0) goto L_0x032e
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r2 = r3.generateLayoutParams(r2)
                android.support.v7.widget.RecyclerView$LayoutParams r2 = (android.support.p043v7.widget.RecyclerView.LayoutParams) r2
                android.view.View r3 = r5.itemView
                r3.setLayoutParams(r2)
                goto L_0x0330
            L_0x032e:
                android.support.v7.widget.RecyclerView$LayoutParams r2 = (android.support.p043v7.widget.RecyclerView.LayoutParams) r2
            L_0x0330:
                r2.f4721c = r5
                if (r9 == 0) goto L_0x0337
                if (r1 == 0) goto L_0x0337
                goto L_0x0338
            L_0x0337:
                r7 = 0
            L_0x0338:
                r2.f4724f = r7
                return r5
            L_0x033b:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Invalid item position "
                r3.<init>(r4)
                r3.append(r1)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = "). Item count:"
                r3.append(r1)
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r1 = r1.f4646E
                int r1 = r1.mo5115a()
                r3.append(r1)
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                java.lang.String r1 = r1.mo4794a()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.C1343o.mo5095b(int, boolean, long):android.support.v7.widget.RecyclerView$v");
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$p */
    public interface C1344p {
        void onViewRecycled(C1352v vVar);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$q */
    class C1345q extends C1324c {
        /* renamed from: b */
        private void m4567b() {
            if (!RecyclerView.f4640c || !RecyclerView.this.f4707r || !RecyclerView.this.f4706q) {
                RecyclerView.this.f4712w = true;
                RecyclerView.this.requestLayout();
                return;
            }
            C1056u.m3034a((View) RecyclerView.this, RecyclerView.this.f4699j);
        }

        /* renamed from: a */
        public final void mo4984a() {
            RecyclerView.this.mo4804a((String) null);
            RecyclerView.this.f4646E.f4797f = true;
            RecyclerView.this.mo4819b(true);
            if (!RecyclerView.this.f4695f.mo5751d()) {
                RecyclerView.this.requestLayout();
            }
        }

        C1345q() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r0.f5314a.size() == 1) goto L_0x0027;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4989c(int r6, int r7) {
            /*
                r5 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                r1 = 0
                r0.mo4804a(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.f4695f
                r2 = 1
                if (r7 > 0) goto L_0x000e
                goto L_0x0026
            L_0x000e:
                java.util.ArrayList<android.support.v7.widget.d$b> r3 = r0.f5314a
                r4 = 2
                android.support.v7.widget.d$b r6 = r0.mo5513a(r4, r6, r7, r1)
                r3.add(r6)
                int r6 = r0.f5320g
                r6 = r6 | r4
                r0.f5320g = r6
                java.util.ArrayList<android.support.v7.widget.d$b> r6 = r0.f5314a
                int r6 = r6.size()
                if (r6 != r2) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                if (r2 == 0) goto L_0x002c
                r5.m4567b()
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.C1345q.mo4989c(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
            if (r0.f5314a.size() == 1) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4988b(int r5, int r6) {
            /*
                r4 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                r1 = 0
                r0.mo4804a(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.f4695f
                r2 = 1
                if (r6 > 0) goto L_0x000e
                goto L_0x0025
            L_0x000e:
                java.util.ArrayList<android.support.v7.widget.d$b> r3 = r0.f5314a
                android.support.v7.widget.d$b r5 = r0.mo5513a(r2, r5, r6, r1)
                r3.add(r5)
                int r5 = r0.f5320g
                r5 = r5 | r2
                r0.f5320g = r5
                java.util.ArrayList<android.support.v7.widget.d$b> r5 = r0.f5314a
                int r5 = r5.size()
                if (r5 != r2) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                if (r2 == 0) goto L_0x002b
                r4.m4567b()
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.C1345q.mo4988b(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
            if (r0.f5314a.size() == 1) goto L_0x0031;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4986a(int r5, int r6, int r7) {
            /*
                r4 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                r1 = 0
                r0.mo4804a(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.f4695f
                r2 = 1
                if (r5 == r6) goto L_0x0030
                if (r7 != r2) goto L_0x0028
                java.util.ArrayList<android.support.v7.widget.d$b> r7 = r0.f5314a
                r3 = 8
                android.support.v7.widget.d$b r5 = r0.mo5513a(r3, r5, r6, r1)
                r7.add(r5)
                int r5 = r0.f5320g
                r5 = r5 | r3
                r0.f5320g = r5
                java.util.ArrayList<android.support.v7.widget.d$b> r5 = r0.f5314a
                int r5 = r5.size()
                if (r5 != r2) goto L_0x0030
                goto L_0x0031
            L_0x0028:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Moving more than 1 item is not supported yet"
                r5.<init>(r6)
                throw r5
            L_0x0030:
                r2 = 0
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r4.m4567b()
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.C1345q.mo4986a(int, int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r0.f5314a.size() == 1) goto L_0x0027;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4987a(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                r1 = 0
                r0.mo4804a(r1)
                android.support.v7.widget.RecyclerView r0 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.d r0 = r0.f4695f
                r1 = 1
                if (r6 > 0) goto L_0x000e
                goto L_0x0026
            L_0x000e:
                java.util.ArrayList<android.support.v7.widget.d$b> r2 = r0.f5314a
                r3 = 4
                android.support.v7.widget.d$b r5 = r0.mo5513a(r3, r5, r6, r7)
                r2.add(r5)
                int r5 = r0.f5320g
                r5 = r5 | r3
                r0.f5320g = r5
                java.util.ArrayList<android.support.v7.widget.d$b> r5 = r0.f5314a
                int r5 = r5.size()
                if (r5 != r1) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r1 = 0
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r4.m4567b()
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.C1345q.mo4987a(int, int, java.lang.Object):void");
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$r */
    public static abstract class C1346r {

        /* renamed from: a */
        private final C1347a f4777a = new C1347a(0, 0);

        /* renamed from: g */
        public int f4778g = -1;

        /* renamed from: h */
        RecyclerView f4779h;

        /* renamed from: i */
        public C1332i f4780i;

        /* renamed from: j */
        public boolean f4781j;

        /* renamed from: k */
        public boolean f4782k;

        /* renamed from: l */
        View f4783l;

        /* renamed from: m */
        boolean f4784m;

        /* renamed from: android.support.v7.widget.RecyclerView$r$a */
        public static class C1347a {

            /* renamed from: a */
            public int f4785a;

            /* renamed from: b */
            public int f4786b;

            /* renamed from: c */
            public int f4787c;

            /* renamed from: d */
            public int f4788d;

            /* renamed from: e */
            public Interpolator f4789e;

            /* renamed from: f */
            private boolean f4790f;

            /* renamed from: g */
            private int f4791g;

            /* renamed from: a */
            private void m4581a() {
                if (this.f4789e != null && this.f4787c <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f4787c <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo5114a(RecyclerView recyclerView) {
                if (this.f4788d >= 0) {
                    int i = this.f4788d;
                    this.f4788d = -1;
                    recyclerView.mo4824c(i);
                    this.f4790f = false;
                } else if (this.f4790f) {
                    m4581a();
                    if (this.f4789e != null) {
                        recyclerView.f4643B.mo5123a(this.f4785a, this.f4786b, this.f4787c, this.f4789e);
                    } else if (this.f4787c == Integer.MIN_VALUE) {
                        recyclerView.f4643B.mo5121a(this.f4785a, this.f4786b);
                    } else {
                        recyclerView.f4643B.mo5122a(this.f4785a, this.f4786b, this.f4787c);
                    }
                    this.f4791g++;
                    this.f4790f = false;
                } else {
                    this.f4791g = 0;
                }
            }

            public C1347a(int i, int i2) {
                this(0, 0, DynamicTabYellowPointVersion.DEFAULT, null);
            }

            /* renamed from: a */
            public final void mo5113a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4785a = i;
                this.f4786b = i2;
                this.f4787c = i3;
                this.f4789e = interpolator;
                this.f4790f = true;
            }

            private C1347a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4788d = -1;
                this.f4785a = i;
                this.f4786b = i2;
                this.f4787c = DynamicTabYellowPointVersion.DEFAULT;
                this.f4789e = null;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$r$b */
        public interface C1348b {
            /* renamed from: d */
            PointF mo4738d(int i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5106a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5108a(int i, int i2, C1349s sVar, C1347a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5110a(View view, C1349s sVar, C1347a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo5112d() {
            if (this.f4782k) {
                this.f4782k = false;
                mo5106a();
                this.f4779h.f4646E.f4792a = -1;
                this.f4783l = null;
                this.f4778g = -1;
                this.f4781j = false;
                C1332i iVar = this.f4780i;
                if (iVar.f4753y == this) {
                    iVar.f4753y = null;
                }
                this.f4780i = null;
                this.f4779h = null;
            }
        }

        /* renamed from: b */
        private int m4573b(View view) {
            return RecyclerView.m4276g(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo5109a(View view) {
            if (m4573b(view) == this.f4778g) {
                this.f4783l = view;
            }
        }

        /* renamed from: c */
        public PointF mo5111c(int i) {
            C1332i iVar = this.f4780i;
            if (iVar instanceof C1348b) {
                return ((C1348b) iVar).mo4738d(i);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5107a(int i, int i2) {
            RecyclerView recyclerView = this.f4779h;
            if (!this.f4782k || this.f4778g == -1 || recyclerView == null) {
                mo5112d();
            }
            if (this.f4781j && this.f4783l == null && this.f4780i != null) {
                PointF c = mo5111c(this.f4778g);
                if (!(c == null || (c.x == 0.0f && c.y == 0.0f))) {
                    recyclerView.mo4797a((int) Math.signum(c.x), (int) Math.signum(c.y), (int[]) null);
                }
            }
            boolean z = false;
            this.f4781j = false;
            if (this.f4783l != null) {
                if (m4573b(this.f4783l) == this.f4778g) {
                    mo5110a(this.f4783l, recyclerView.f4646E, this.f4777a);
                    this.f4777a.mo5114a(recyclerView);
                    mo5112d();
                } else {
                    this.f4783l = null;
                }
            }
            if (this.f4782k) {
                mo5108a(i, i2, recyclerView.f4646E, this.f4777a);
                if (this.f4777a.f4788d >= 0) {
                    z = true;
                }
                this.f4777a.mo5114a(recyclerView);
                if (z) {
                    if (this.f4782k) {
                        this.f4781j = true;
                        recyclerView.f4643B.mo5120a();
                        return;
                    }
                    mo5112d();
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$s */
    public static class C1349s {

        /* renamed from: a */
        public int f4792a = -1;

        /* renamed from: b */
        int f4793b;

        /* renamed from: c */
        int f4794c;

        /* renamed from: d */
        int f4795d = 1;

        /* renamed from: e */
        int f4796e;

        /* renamed from: f */
        public boolean f4797f;

        /* renamed from: g */
        public boolean f4798g;

        /* renamed from: h */
        boolean f4799h;

        /* renamed from: i */
        public boolean f4800i;

        /* renamed from: j */
        public boolean f4801j;

        /* renamed from: k */
        public boolean f4802k;

        /* renamed from: l */
        int f4803l;

        /* renamed from: m */
        long f4804m;

        /* renamed from: n */
        int f4805n;

        /* renamed from: o */
        public int f4806o;

        /* renamed from: p */
        public int f4807p;

        /* renamed from: q */
        private SparseArray<Object> f4808q;

        /* renamed from: a */
        public final int mo5115a() {
            if (this.f4798g) {
                return this.f4793b - this.f4794c;
            }
            return this.f4796e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f4792a);
            sb.append(", mData=");
            sb.append(this.f4808q);
            sb.append(", mItemCount=");
            sb.append(this.f4796e);
            sb.append(", mIsMeasuring=");
            sb.append(this.f4800i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f4793b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f4794c);
            sb.append(", mStructureChanged=");
            sb.append(this.f4797f);
            sb.append(", mInPreLayout=");
            sb.append(this.f4798g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f4801j);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f4802k);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5116a(int i) {
            if ((this.f4795d & i) == 0) {
                StringBuilder sb = new StringBuilder("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f4795d));
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$t */
    public static abstract class C1350t {
        /* renamed from: a */
        public abstract View mo5118a(C1343o oVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$u */
    class C1351u implements Runnable {

        /* renamed from: a */
        int f4809a;

        /* renamed from: b */
        int f4810b;

        /* renamed from: c */
        OverScroller f4811c;

        /* renamed from: d */
        Interpolator f4812d = RecyclerView.f4632M;

        /* renamed from: f */
        private boolean f4814f;

        /* renamed from: g */
        private boolean f4815g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5120a() {
            if (this.f4814f) {
                this.f4815g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C1056u.m3034a((View) RecyclerView.this, (Runnable) this);
        }

        /* renamed from: b */
        public final void mo5124b() {
            RecyclerView.this.removeCallbacks(this);
            this.f4811c.abortAnimation();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e7, code lost:
            if (r8 > 0) goto L_0x00eb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r23 = this;
                r0 = r23
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r1 = r1.f4703n
                if (r1 != 0) goto L_0x000c
                r23.mo5124b()
                return
            L_0x000c:
                r1 = 0
                r0.f4815g = r1
                r2 = 1
                r0.f4814f = r2
                android.support.v7.widget.RecyclerView r3 = android.support.p043v7.widget.RecyclerView.this
                r3.mo4845e()
                android.widget.OverScroller r3 = r0.f4811c
                android.support.v7.widget.RecyclerView r4 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r4 = r4.f4703n
                android.support.v7.widget.RecyclerView$r r4 = r4.f4753y
                boolean r5 = r3.computeScrollOffset()
                if (r5 == 0) goto L_0x0191
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                int[] r5 = r5.f4651J
                int r12 = r3.getCurrX()
                int r13 = r3.getCurrY()
                int r6 = r0.f4809a
                int r14 = r12 - r6
                int r6 = r0.f4810b
                int r15 = r13 - r6
                r0.f4809a = r12
                r0.f4810b = r13
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                r10 = 0
                r11 = 1
                r7 = r14
                r8 = r15
                r9 = r5
                boolean r6 = r6.mo4807a(r7, r8, r9, r10, r11)
                if (r6 == 0) goto L_0x0050
                r6 = r5[r1]
                int r14 = r14 - r6
                r5 = r5[r2]
                int r15 = r15 - r5
            L_0x0050:
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r5 = r5.f4702m
                if (r5 == 0) goto L_0x0096
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                int[] r6 = r6.f4652K
                r5.mo4797a(r14, r15, r6)
                android.support.v7.widget.RecyclerView r5 = android.support.p043v7.widget.RecyclerView.this
                int[] r5 = r5.f4652K
                r5 = r5[r1]
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                int[] r6 = r6.f4652K
                r6 = r6[r2]
                int r7 = r14 - r5
                int r8 = r15 - r6
                if (r4 == 0) goto L_0x009a
                boolean r9 = r4.f4781j
                if (r9 != 0) goto L_0x009a
                boolean r9 = r4.f4782k
                if (r9 == 0) goto L_0x009a
                android.support.v7.widget.RecyclerView r9 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r9 = r9.f4646E
                int r9 = r9.mo5115a()
                if (r9 != 0) goto L_0x0087
                r4.mo5112d()
                goto L_0x009a
            L_0x0087:
                int r10 = r4.f4778g
                if (r10 < r9) goto L_0x008e
                int r9 = r9 - r2
                r4.f4778g = r9
            L_0x008e:
                int r9 = r14 - r7
                int r10 = r15 - r8
                r4.mo5107a(r9, r10)
                goto L_0x009a
            L_0x0096:
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
            L_0x009a:
                android.support.v7.widget.RecyclerView r9 = android.support.p043v7.widget.RecyclerView.this
                java.util.ArrayList<android.support.v7.widget.RecyclerView$h> r9 = r9.f4705p
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00a9
                android.support.v7.widget.RecyclerView r9 = android.support.p043v7.widget.RecyclerView.this
                r9.invalidate()
            L_0x00a9:
                android.support.v7.widget.RecyclerView r9 = android.support.p043v7.widget.RecyclerView.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00b7
                android.support.v7.widget.RecyclerView r9 = android.support.p043v7.widget.RecyclerView.this
                r9.mo4825c(r14, r15)
            L_0x00b7:
                android.support.v7.widget.RecyclerView r9 = android.support.p043v7.widget.RecyclerView.this
                r21 = 0
                r22 = 1
                r16 = r9
                r17 = r5
                r18 = r6
                r19 = r7
                r20 = r8
                boolean r9 = r16.mo4806a(r17, r18, r19, r20, r21, r22)
                if (r9 != 0) goto L_0x010f
                if (r7 != 0) goto L_0x00d1
                if (r8 == 0) goto L_0x010f
            L_0x00d1:
                float r9 = r3.getCurrVelocity()
                int r9 = (int) r9
                if (r7 == r12) goto L_0x00e0
                if (r7 >= 0) goto L_0x00dc
                int r11 = -r9
                goto L_0x00e1
            L_0x00dc:
                if (r7 <= 0) goto L_0x00e0
                r11 = r9
                goto L_0x00e1
            L_0x00e0:
                r11 = 0
            L_0x00e1:
                if (r8 == r13) goto L_0x00ea
                if (r8 >= 0) goto L_0x00e7
                int r9 = -r9
                goto L_0x00eb
            L_0x00e7:
                if (r8 <= 0) goto L_0x00ea
                goto L_0x00eb
            L_0x00ea:
                r9 = 0
            L_0x00eb:
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                int r1 = r1.getOverScrollMode()
                if (r1 == r10) goto L_0x00f8
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                r1.mo4834d(r11, r9)
            L_0x00f8:
                if (r11 != 0) goto L_0x0102
                if (r7 == r12) goto L_0x0102
                int r1 = r3.getFinalX()
                if (r1 != 0) goto L_0x010f
            L_0x0102:
                if (r9 != 0) goto L_0x010c
                if (r8 == r13) goto L_0x010c
                int r1 = r3.getFinalY()
                if (r1 != 0) goto L_0x010f
            L_0x010c:
                r3.abortAnimation()
            L_0x010f:
                if (r5 != 0) goto L_0x0113
                if (r6 == 0) goto L_0x0118
            L_0x0113:
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                r1.mo4849f(r5, r6)
            L_0x0118:
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                boolean r1 = r1.awakenScrollBars()
                if (r1 != 0) goto L_0x0125
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                r1.invalidate()
            L_0x0125:
                if (r15 == 0) goto L_0x0135
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r1 = r1.f4703n
                boolean r1 = r1.mo4745f()
                if (r1 == 0) goto L_0x0135
                if (r6 != r15) goto L_0x0135
                r1 = 1
                goto L_0x0136
            L_0x0135:
                r1 = 0
            L_0x0136:
                if (r14 == 0) goto L_0x0146
                android.support.v7.widget.RecyclerView r6 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r6 = r6.f4703n
                boolean r6 = r6.mo4742e()
                if (r6 == 0) goto L_0x0146
                if (r5 != r14) goto L_0x0146
                r5 = 1
                goto L_0x0147
            L_0x0146:
                r5 = 0
            L_0x0147:
                if (r14 != 0) goto L_0x014b
                if (r15 == 0) goto L_0x0152
            L_0x014b:
                if (r5 != 0) goto L_0x0152
                if (r1 == 0) goto L_0x0150
                goto L_0x0152
            L_0x0150:
                r1 = 0
                goto L_0x0153
            L_0x0152:
                r1 = 1
            L_0x0153:
                boolean r3 = r3.isFinished()
                if (r3 != 0) goto L_0x017b
                if (r1 != 0) goto L_0x0168
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v4.view.l r1 = r1.getScrollingChildHelper()
                boolean r1 = r1.mo3225a(r2)
                if (r1 != 0) goto L_0x0168
                goto L_0x017b
            L_0x0168:
                r23.mo5120a()
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.ad r1 = r1.f4644C
                if (r1 == 0) goto L_0x0191
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.ad r1 = r1.f4644C
                android.support.v7.widget.RecyclerView r2 = android.support.p043v7.widget.RecyclerView.this
                r1.mo5481a(r2, r14, r15)
                goto L_0x0191
            L_0x017b:
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = android.support.p043v7.widget.RecyclerView.f4641d
                if (r1 == 0) goto L_0x018c
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                android.support.v7.widget.ad$a r1 = r1.f4645D
                r1.mo5484a()
            L_0x018c:
                android.support.v7.widget.RecyclerView r1 = android.support.p043v7.widget.RecyclerView.this
                r1.mo3220a(r2)
            L_0x0191:
                if (r4 == 0) goto L_0x01a5
                boolean r1 = r4.f4781j
                if (r1 == 0) goto L_0x019c
                r1 = 0
                r4.mo5107a(r1, r1)
                goto L_0x019d
            L_0x019c:
                r1 = 0
            L_0x019d:
                boolean r2 = r0.f4815g
                if (r2 != 0) goto L_0x01a6
                r4.mo5112d()
                goto L_0x01a6
            L_0x01a5:
                r1 = 0
            L_0x01a6:
                r0.f4814f = r1
                boolean r1 = r0.f4815g
                if (r1 == 0) goto L_0x01af
                r23.mo5120a()
            L_0x01af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.C1351u.run():void");
        }

        /* renamed from: a */
        private static float m4588a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        C1351u() {
            this.f4811c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f4632M);
        }

        /* renamed from: a */
        public final void mo5121a(int i, int i2) {
            m4589b(i, i2, 0, 0);
        }

        /* renamed from: a */
        public final void mo5122a(int i, int i2, int i3) {
            mo5123a(i, i2, i3, RecyclerView.f4632M);
        }

        /* renamed from: b */
        private void m4589b(int i, int i2, int i3, int i4) {
            mo5122a(i, i2, mo5119a(i, i2, 0, 0));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5119a(int i, int i2, int i3, int i4) {
            boolean z;
            int i5;
            int i6;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            if (z) {
                i5 = RecyclerView.this.getWidth();
            } else {
                i5 = RecyclerView.this.getHeight();
            }
            int i7 = i5 / 2;
            float f = (float) i5;
            float f2 = (float) i7;
            float a = f2 + (m4588a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i6 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i6, 2000);
        }

        /* renamed from: a */
        public final void mo5123a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f4812d != interpolator) {
                this.f4812d = interpolator;
                this.f4811c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f4810b = 0;
            this.f4809a = 0;
            this.f4811c.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.f4811c.computeScrollOffset();
            }
            mo5120a();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$v */
    public static abstract class C1352v {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        public long mItemId = -1;
        public int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C1343o mScrapContainer;
        C1352v mShadowedHolder;
        C1352v mShadowingHolder;
        List<Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        /* access modifiers changed from: 0000 */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: 0000 */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: 0000 */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: 0000 */
        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        /* access modifiers changed from: 0000 */
        public void unScrap() {
            this.mScrapContainer.mo5098b(this);
        }

        /* access modifiers changed from: 0000 */
        public void clearPayload() {
            if (this.mPayloads != null) {
                this.mPayloads.clear();
            }
            this.mFlags &= -1025;
        }

        public final int getAdapterPosition() {
            if (this.mOwnerRecyclerView == null) {
                return -1;
            }
            return this.mOwnerRecyclerView.mo4821c(this);
        }

        public final int getLayoutPosition() {
            if (this.mPreLayoutPosition == -1) {
                return this.mPosition;
            }
            return this.mPreLayoutPosition;
        }

        public final int getPosition() {
            if (this.mPreLayoutPosition == -1) {
                return this.mPosition;
            }
            return this.mPreLayoutPosition;
        }

        /* access modifiers changed from: 0000 */
        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isTmpDetached() {
            if ((this.mFlags & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0 || !C1056u.m3050c(this.itemView)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            if (this.mPayloads == null || this.mPayloads.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & UnReadVideoExperiment.LIKE_USER_LIST) != 0 || isInvalid()) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || C1056u.m3050c(this.itemView)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m4269b(this);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ViewHolder{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo4809a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public C1352v(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: 0000 */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(PreloadTask.BYTE_UNIT_NUMBER);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            if (this.mPendingAccessibilityState != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = this.mPendingAccessibilityState;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C1056u.m3053e(this.itemView);
            }
            recyclerView.mo4809a(this, 4);
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            if (z) {
                i = this.mIsRecyclableCount - 1;
            } else {
                i = this.mIsRecyclableCount + 1;
            }
            this.mIsRecyclableCount = i;
            if (this.mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
            } else if (z || this.mIsRecyclableCount != 1) {
                if (z && this.mIsRecyclableCount == 0) {
                    this.mFlags &= -17;
                }
            } else {
                this.mFlags |= 16;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setScrapContainer(C1343o oVar, boolean z) {
            this.mScrapContainer = oVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: 0000 */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
        }

        /* access modifiers changed from: 0000 */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f4723e = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }
    }

    public C1322a getAdapter() {
        return this.f4702m;
    }

    public boolean getClipToPadding() {
        return this.f4698i;
    }

    public C1428an getCompatAccessibilityDelegate() {
        return this.f4650I;
    }

    public C1326e getEdgeEffectFactory() {
        return this.f4674ag;
    }

    public C1327f getItemAnimator() {
        return this.f4642A;
    }

    public C1332i getLayoutManager() {
        return this.f4703n;
    }

    public int getMaxFlingVelocity() {
        return this.f4689av;
    }

    public int getMinFlingVelocity() {
        return this.f4688au;
    }

    public C1338k getOnFlingListener() {
        return this.f4687at;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4692ay;
    }

    public int getScrollState() {
        return this.f4679al;
    }

    public boolean isAttachedToWindow() {
        return this.f4706q;
    }

    public void scrollTo(int i, int i2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo4794a() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.f4702m);
        sb.append(", layout:");
        sb.append(this.f4703n);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo4799a(C1337j jVar) {
        if (this.f4713x == null) {
            this.f4713x = new ArrayList();
        }
        this.f4713x.add(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4810a(View view) {
        mo49162o();
        C1501t tVar = this.f4696g;
        int a = tVar.f5396a.mo4931a(view);
        boolean z = true;
        if (a == -1) {
            tVar.mo5835b(view);
        } else if (tVar.f5397b.mo5845c(a)) {
            tVar.f5397b.mo5846d(a);
            tVar.mo5835b(view);
            tVar.f5396a.mo4932a(a);
        } else {
            z = false;
        }
        if (z) {
            C1352v d = m4272d(view);
            this.f4694e.mo5098b(d);
            this.f4694e.mo5092a(d);
        }
        m4271c(!z);
        return z;
    }

    /* renamed from: a */
    public final void mo4798a(C1331h hVar) {
        m4257a(hVar, -1);
    }

    /* renamed from: a */
    public final void mo4801a(C1340m mVar) {
        if (this.f4659aA == null) {
            this.f4659aA = new ArrayList();
        }
        this.f4659aA.add(mVar);
    }

    /* renamed from: b */
    public final void mo4818b(C1340m mVar) {
        if (this.f4659aA != null) {
            this.f4659aA.remove(mVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4797a(int i, int i2, int[] iArr) {
        mo49162o();
        mo4851g();
        C0968g.m2814a("RV Scroll");
        m4258a(this.f4646E);
        int a = i != 0 ? this.f4703n.mo4665a(i, this.f4694e, this.f4646E) : 0;
        int b = i2 != 0 ? this.f4703n.mo4685b(i2, this.f4694e, this.f4646E) : 0;
        C0968g.m2813a();
        int a2 = this.f4696g.mo5828a();
        for (int i3 = 0; i3 < a2; i3++) {
            View b2 = this.f4696g.mo5834b(i3);
            C1352v b3 = mo4812b(b2);
            if (!(b3 == null || b3.mShadowingHolder == null)) {
                View view = b3.mShadowingHolder.itemView;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m4290y();
        m4271c(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    /* renamed from: a */
    private boolean m4267a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo4845e();
        if (this.f4702m != null) {
            mo4797a(i7, i8, this.f4652K);
            int i9 = this.f4652K[0];
            int i10 = this.f4652K[1];
            i5 = i9;
            i4 = i10;
            i3 = i7 - i9;
            i6 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f4705p.isEmpty()) {
            invalidate();
        }
        int i11 = i6;
        if (mo4806a(i5, i4, i3, i6, this.f4664aF, 0)) {
            this.f4684aq -= this.f4664aF[0];
            this.f4685ar -= this.f4664aF[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) this.f4664aF[0], (float) this.f4664aF[1]);
            }
            int[] iArr = this.f4665aG;
            iArr[0] = iArr[0] + this.f4664aF[0];
            int[] iArr2 = this.f4665aG;
            iArr2[1] = iArr2[1] + this.f4664aF[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C1044i.m2987e(motionEvent2, 8194)) {
                m4255a(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i11);
            }
            mo4825c(i, i2);
        }
        if (!(i5 == 0 && i4 == 0)) {
            mo4849f(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i5 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean mo4820b(int i, int i2) {
        if (this.f4703n == null || this.f4711v) {
            return false;
        }
        boolean e = this.f4703n.mo4742e();
        boolean f = this.f4703n.mo4745f();
        int i3 = (!e || Math.abs(i) < this.f4688au) ? 0 : i;
        int i4 = (!f || Math.abs(i2) < this.f4688au) ? 0 : i2;
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f2 = (float) i3;
        float f3 = (float) i4;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z = e || f;
            dispatchNestedFling(f2, f3, z);
            if (this.f4687at != null && this.f4687at.mo5078a(i3, i4)) {
                return true;
            }
            if (z) {
                if (f) {
                    e |= true;
                }
                m4278h(e ? 1 : 0, 1);
                int max = Math.max(-this.f4689av, Math.min(i3, this.f4689av));
                int max2 = Math.max(-this.f4689av, Math.min(i4, this.f4689av));
                C1351u uVar = this.f4643B;
                RecyclerView.this.setScrollState(2);
                uVar.f4810b = 0;
                uVar.f4809a = 0;
                uVar.f4811c.fling(0, 0, max, max2, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE);
                uVar.mo5120a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m4265a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4700k.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f4723e) {
                Rect rect = layoutParams2.f4722d;
                this.f4700k.left -= rect.left;
                this.f4700k.right += rect.right;
                this.f4700k.top -= rect.top;
                this.f4700k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4700k);
            offsetRectIntoDescendantCoords(view, this.f4700k);
        }
        this.f4703n.mo5028a(this, view, this.f4700k, !this.f4709t, view2 == null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4804a(String str) {
        if (!mo4875i()) {
            return;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
            sb.append(mo4794a());
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public final void mo4800a(C1339l lVar) {
        this.f4657V.add(lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4805a(boolean z) {
        this.f4672ae--;
        if (this.f4672ae <= 0) {
            this.f4672ae = 0;
            if (z) {
                m4291z();
                m4254M();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4802a(C1352v vVar, C1329b bVar) {
        vVar.setFlags(0, VideoCacheReadBuffersizeExperiment.DEFAULT);
        if (this.f4646E.f4799h && vVar.isUpdated() && !vVar.isRemoved() && !vVar.shouldIgnore()) {
            this.f4697h.mo5715a(m4274e(vVar), vVar);
        }
        this.f4697h.mo5716a(vVar, bVar);
    }

    /* renamed from: a */
    private void m4266a(int[] iArr) {
        int a = this.f4696g.mo5828a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = DynamicTabYellowPointVersion.DEFAULT;
        for (int i3 = 0; i3 < a; i3++) {
            C1352v d = m4272d(this.f4696g.mo5834b(i3));
            if (!d.shouldIgnore()) {
                int layoutPosition = d.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4803a(C1352v vVar, C1329b bVar, C1329b bVar2) {
        m4273d(vVar);
        vVar.setIsRecyclable(false);
        if (this.f4642A.mo4994a(vVar, bVar, bVar2)) {
            mo4877j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4796a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f4696g.mo5833b();
        for (int i4 = 0; i4 < b; i4++) {
            C1352v d = m4272d(this.f4696g.mo5837c(i4));
            if (d != null && !d.shouldIgnore()) {
                if (d.mPosition >= i3) {
                    d.offsetPosition(-i2, z);
                    this.f4646E.f4797f = true;
                } else if (d.mPosition >= i) {
                    d.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f4646E.f4797f = true;
                }
            }
        }
        C1343o oVar = this.f4694e;
        for (int size = oVar.f4769c.size() - 1; size >= 0; size--) {
            C1352v vVar = (C1352v) oVar.f4769c.get(size);
            if (vVar != null) {
                if (vVar.mPosition >= i3) {
                    vVar.offsetPosition(-i2, z);
                } else if (vVar.mPosition >= i) {
                    vVar.addFlags(8);
                    oVar.mo5101c(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4808a(C1352v vVar) {
        return this.f4642A == null || this.f4642A.mo4996a(vVar, vVar.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4819b(boolean z) {
        this.f4715z = z | this.f4715z;
        this.f4714y = true;
        m4253L();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1352v mo4792a(int i, boolean z) {
        int b = this.f4696g.mo5833b();
        C1352v vVar = null;
        for (int i2 = 0; i2 < b; i2++) {
            C1352v d = m4272d(this.f4696g.mo5837c(i2));
            if (d != null && !d.isRemoved()) {
                if (z) {
                    if (d.mPosition != i) {
                        continue;
                    }
                } else if (d.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f4696g.mo5839d(d.itemView)) {
                    return d;
                }
                vVar = d;
            }
        }
        return vVar;
    }

    /* renamed from: a */
    public final View mo4793a(float f, float f2) {
        for (int a = this.f4696g.mo5828a() - 1; a >= 0; a--) {
            View b = this.f4696g.mo5834b(a);
            float translationX = b.getTranslationX();
            float translationY = b.getTranslationY();
            if (f >= ((float) b.getLeft()) + translationX && f <= ((float) b.getRight()) + translationX && f2 >= ((float) b.getTop()) + translationY && f2 <= ((float) b.getBottom()) + translationY) {
                return b;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4809a(C1352v vVar, int i) {
        if (mo4875i()) {
            vVar.mPendingAccessibilityState = i;
            this.f4653L.add(vVar);
            return false;
        }
        C1056u.m3043b(vVar.itemView, i);
        return true;
    }

    /* renamed from: a */
    public final void mo3220a(int i) {
        getScrollingChildHelper().mo3233c(i);
    }

    /* renamed from: a */
    public final boolean mo4806a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo3228a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public final boolean mo4807a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo3230a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public final void mo4795a(int i, int i2) {
        if (this.f4703n != null && !this.f4711v) {
            if (!this.f4703n.mo4742e()) {
                i = 0;
            }
            if (!this.f4703n.mo4745f()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                C1351u uVar = this.f4643B;
                uVar.mo5123a(i, i2, uVar.mo5119a(i, i2, 0, 0), f4632M);
            }
        }
    }

    /* renamed from: x */
    private void m4289x() {
        m4288w();
        setScrollState(0);
    }

    /* renamed from: y */
    private void m4290y() {
        mo4805a(true);
    }

    /* renamed from: f */
    public final void mo4848f() {
        setScrollState(0);
        m4281p();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo4851g() {
        this.f4672ae++;
    }

    public int getItemDecorationCount() {
        return this.f4705p.size();
    }

    public C1341n getRecycledViewPool() {
        return this.f4694e.mo5100c();
    }

    /* renamed from: i */
    public final boolean mo4875i() {
        if (this.f4672ae > 0) {
            return true;
        }
        return false;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3329a;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo3231b();
    }

    /* renamed from: A */
    private boolean m4242A() {
        if (this.f4642A == null || !this.f4703n.bs_()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private void m4246E() {
        this.f4646E.f4804m = -1;
        this.f4646E.f4803l = -1;
        this.f4646E.f4805n = -1;
    }

    /* renamed from: p */
    private void m4281p() {
        this.f4643B.mo5124b();
        if (this.f4703n != null) {
            this.f4703n.mo5016D();
        }
    }

    /* renamed from: v */
    private void m4287v() {
        this.f4678ak = null;
        this.f4676ai = null;
        this.f4677aj = null;
        this.f4675ah = null;
    }

    /* renamed from: c */
    public final void mo4823c() {
        if (this.f4713x != null) {
            this.f4713x.clear();
        }
    }

    public int getBaseline() {
        if (this.f4703n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (f4641d) {
            return System.nanoTime();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public C1047l getScrollingChildHelper() {
        if (this.f4663aE == null) {
            this.f4663aE = new C1047l(this);
        }
        return this.f4663aE;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo3222a();
    }

    /* renamed from: l */
    public final boolean mo4880l() {
        if (this.f4642A == null || !this.f4642A.mo4997b()) {
            return false;
        }
        return true;
    }

    public void requestLayout() {
        if (this.f4668aa != 0 || this.f4711v) {
            this.f4710u = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: J */
    private void m4251J() {
        int b = this.f4696g.mo5833b();
        for (int i = 0; i < b; i++) {
            C1352v d = m4272d(this.f4696g.mo5837c(i));
            if (!d.shouldIgnore()) {
                d.saveOldPosition();
            }
        }
    }

    /* renamed from: o */
    private void mo49162o() {
        this.f4668aa++;
        if (this.f4668aa == 1 && !this.f4711v) {
            this.f4710u = false;
        }
    }

    /* renamed from: w */
    private void m4288w() {
        if (this.f4681an != null) {
            this.f4681an.clear();
        }
        mo3220a(0);
        m4282q();
    }

    /* renamed from: z */
    private void m4291z() {
        int i = this.f4670ac;
        this.f4670ac = 0;
        if (i != 0 && mo4873h()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C1004a.m2882a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public int computeHorizontalScrollExtent() {
        if (this.f4703n != null && this.f4703n.mo4742e()) {
            return this.f4703n.mo4737d(this.f4646E);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        if (this.f4703n != null && this.f4703n.mo4742e()) {
            return this.f4703n.mo4730b(this.f4646E);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.f4703n != null && this.f4703n.mo4742e()) {
            return this.f4703n.mo4744f(this.f4646E);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.f4703n != null && this.f4703n.mo4745f()) {
            return this.f4703n.mo4740e(this.f4646E);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.f4703n != null && this.f4703n.mo4745f()) {
            return this.f4703n.mo4735c(this.f4646E);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.f4703n != null && this.f4703n.mo4745f()) {
            return this.f4703n.mo4746g(this.f4646E);
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo4832d() {
        if (this.f4659aA != null) {
            this.f4659aA.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo4873h() {
        if (this.f4671ad == null || !this.f4671ad.isEnabled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo4877j() {
        if (!this.f4649H && this.f4706q) {
            C1056u.m3034a((View) this, this.f4666aH);
            this.f4649H = true;
        }
    }

    /* renamed from: m */
    public final void mo4881m() {
        if (this.f4705p.size() != 0) {
            if (this.f4703n != null) {
                this.f4703n.mo4729a("Cannot invalidate item decorations during a scroll or layout");
            }
            mo4879k();
            requestLayout();
        }
    }

    /* renamed from: n */
    public final boolean mo4882n() {
        if (!this.f4709t || this.f4714y || this.f4695f.mo5751d()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private void m4252K() {
        int b = this.f4696g.mo5833b();
        for (int i = 0; i < b; i++) {
            C1352v d = m4272d(this.f4696g.mo5837c(i));
            if (!d.shouldIgnore()) {
                d.clearOldPosition();
            }
        }
        this.f4694e.mo5104e();
    }

    /* renamed from: L */
    private void m4253L() {
        int b = this.f4696g.mo5833b();
        for (int i = 0; i < b; i++) {
            C1352v d = m4272d(this.f4696g.mo5837c(i));
            if (d != null && !d.shouldIgnore()) {
                d.addFlags(6);
            }
        }
        mo4879k();
        this.f4694e.mo5103d();
    }

    /* renamed from: M */
    private void m4254M() {
        for (int size = this.f4653L.size() - 1; size >= 0; size--) {
            C1352v vVar = (C1352v) this.f4653L.get(size);
            if (vVar.itemView.getParent() == this && !vVar.shouldIgnore()) {
                int i = vVar.mPendingAccessibilityState;
                if (i != -1) {
                    C1056u.m3043b(vVar.itemView, i);
                    vVar.mPendingAccessibilityState = -1;
                }
            }
        }
        this.f4653L.clear();
    }

    /* renamed from: r */
    private void m4283r() {
        if (this.f4675ah == null) {
            this.f4675ah = C1326e.m4384a(this, 0);
            if (this.f4698i) {
                this.f4675ah.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f4675ah.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: s */
    private void m4284s() {
        if (this.f4677aj == null) {
            this.f4677aj = C1326e.m4384a(this, 2);
            if (this.f4698i) {
                this.f4677aj.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f4677aj.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: t */
    private void m4285t() {
        if (this.f4676ai == null) {
            this.f4676ai = C1326e.m4384a(this, 1);
            if (this.f4698i) {
                this.f4676ai.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f4676ai.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: u */
    private void m4286u() {
        if (this.f4678ak == null) {
            this.f4678ak = C1326e.m4384a(this, 3);
            if (this.f4698i) {
                this.f4678ak.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f4678ak.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.f4703n != null) {
            return this.f4703n.mo4667a();
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(mo4794a());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public void mo4879k() {
        int b = this.f4696g.mo5833b();
        for (int i = 0; i < b; i++) {
            ((LayoutParams) this.f4696g.mo5837c(i).getLayoutParams()).f4723e = true;
        }
        C1343o oVar = this.f4694e;
        int size = oVar.f4769c.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((C1352v) oVar.f4769c.get(i2)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f4723e = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f4655T != null) {
            savedState.f4725a = this.f4655T.f4725a;
        } else if (this.f4703n != null) {
            savedState.f4725a = this.f4703n.mo4739d();
        } else {
            savedState.f4725a = null;
        }
        return savedState;
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20) {
            z = true;
        } else {
            z = false;
        }
        f4638a = z;
        if (VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        f4639b = z2;
        if (VERSION.SDK_INT >= 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        f4640c = z3;
        if (VERSION.SDK_INT >= 21) {
            z4 = true;
        } else {
            z4 = false;
        }
        f4641d = z4;
        if (VERSION.SDK_INT <= 15) {
            z5 = true;
        } else {
            z5 = false;
        }
        f4635P = z5;
        if (VERSION.SDK_INT <= 15) {
            z6 = true;
        } else {
            z6 = false;
        }
        f4636Q = z6;
    }

    /* renamed from: B */
    private void m4243B() {
        boolean z;
        boolean z2;
        if (this.f4714y) {
            this.f4695f.mo5745a();
            if (this.f4715z) {
                this.f4703n.mo4679a(this);
            }
        }
        if (m4242A()) {
            this.f4695f.mo5748b();
        } else {
            this.f4695f.mo5752e();
        }
        boolean z3 = false;
        if (this.f4647F || this.f4648G) {
            z = true;
        } else {
            z = false;
        }
        C1349s sVar = this.f4646E;
        if (!this.f4709t || this.f4642A == null || ((!this.f4714y && !z && !this.f4703n.f4754z) || (this.f4714y && !this.f4702m.mHasStableIds))) {
            z2 = false;
        } else {
            z2 = true;
        }
        sVar.f4801j = z2;
        C1349s sVar2 = this.f4646E;
        if (this.f4646E.f4801j && z && !this.f4714y && m4242A()) {
            z3 = true;
        }
        sVar2.f4802k = z3;
    }

    /* renamed from: C */
    private void m4244C() {
        if (this.f4702m != null && this.f4703n != null) {
            this.f4646E.f4800i = false;
            if (this.f4646E.f4795d == 1) {
                m4248G();
                this.f4703n.mo5048e(this);
                m4249H();
            } else if (!this.f4695f.mo5753f() && this.f4703n.f4745I == getWidth() && this.f4703n.f4746J == getHeight()) {
                this.f4703n.mo5048e(this);
            } else {
                this.f4703n.mo5048e(this);
                m4249H();
            }
            m4250I();
        }
    }

    /* renamed from: D */
    private void m4245D() {
        View view;
        long j;
        int i;
        C1352v vVar = null;
        if (!this.f4692ay || !hasFocus() || this.f4702m == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            View c = mo4822c(view);
            if (c != null) {
                vVar = mo4812b(c);
            }
        }
        if (vVar == null) {
            m4246E();
            return;
        }
        C1349s sVar = this.f4646E;
        if (this.f4702m.mHasStableIds) {
            j = vVar.mItemId;
        } else {
            j = -1;
        }
        sVar.f4804m = j;
        C1349s sVar2 = this.f4646E;
        if (this.f4714y) {
            i = -1;
        } else if (vVar.isRemoved()) {
            i = vVar.mOldPosition;
        } else {
            i = vVar.getAdapterPosition();
        }
        sVar2.f4803l = i;
        C1349s sVar3 = this.f4646E;
        View view2 = vVar.itemView;
        int id = view2.getId();
        while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
            view2 = ((ViewGroup) view2).getFocusedChild();
            if (view2.getId() != -1) {
                id = view2.getId();
            }
        }
        sVar3.f4805n = id;
    }

    /* renamed from: H */
    private void m4249H() {
        boolean z;
        mo49162o();
        mo4851g();
        this.f4646E.mo5116a(6);
        this.f4695f.mo5752e();
        this.f4646E.f4796e = this.f4702m.getItemCount();
        this.f4646E.f4794c = 0;
        this.f4646E.f4798g = false;
        this.f4703n.mo4689c(this.f4694e, this.f4646E);
        this.f4646E.f4797f = false;
        this.f4655T = null;
        C1349s sVar = this.f4646E;
        if (!this.f4646E.f4801j || this.f4642A == null) {
            z = false;
        } else {
            z = true;
        }
        sVar.f4801j = z;
        this.f4646E.f4795d = 4;
        m4290y();
        m4271c(false);
    }

    /* renamed from: q */
    private void m4282q() {
        boolean z;
        if (this.f4675ah != null) {
            this.f4675ah.onRelease();
            z = this.f4675ah.isFinished();
        } else {
            z = false;
        }
        if (this.f4676ai != null) {
            this.f4676ai.onRelease();
            z |= this.f4676ai.isFinished();
        }
        if (this.f4677aj != null) {
            this.f4677aj.onRelease();
            z |= this.f4677aj.isFinished();
        }
        if (this.f4678ak != null) {
            this.f4678ak.onRelease();
            z |= this.f4678ak.isFinished();
        }
        if (z) {
            C1056u.m3052d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4642A != null) {
            this.f4642A.mo5001d();
        }
        mo4848f();
        this.f4706q = false;
        if (this.f4703n != null) {
            this.f4703n.mo5036b(this, this.f4694e);
        }
        this.f4653L.clear();
        removeCallbacks(this.f4666aH);
        do {
        } while (C1465a.f5287d.acquire() != null);
        if (f4641d && this.f4644C != null) {
            this.f4644C.f5082b.remove(this);
            this.f4644C = null;
        }
    }

    /* renamed from: I */
    private void m4250I() {
        this.f4646E.mo5116a(4);
        mo49162o();
        mo4851g();
        this.f4646E.f4795d = 1;
        if (this.f4646E.f4801j) {
            for (int a = this.f4696g.mo5828a() - 1; a >= 0; a--) {
                C1352v d = m4272d(this.f4696g.mo5834b(a));
                if (!d.shouldIgnore()) {
                    long e = m4274e(d);
                    C1329b a2 = this.f4642A.mo4991a(this.f4646E, d);
                    C1352v a3 = this.f4697h.mo5713a(e);
                    if (a3 == null || a3.shouldIgnore()) {
                        this.f4697h.mo5722c(d, a2);
                    } else {
                        boolean a4 = this.f4697h.mo5718a(a3);
                        boolean a5 = this.f4697h.mo5718a(d);
                        if (!a4 || a3 != d) {
                            C1329b b = this.f4697h.mo5719b(a3);
                            this.f4697h.mo5722c(d, a2);
                            C1329b c = this.f4697h.mo5721c(d);
                            if (b == null) {
                                m4256a(e, d, a3);
                            } else {
                                m4259a(a3, d, b, c, a4, a5);
                            }
                        } else {
                            this.f4697h.mo5722c(d, a2);
                        }
                    }
                }
            }
            this.f4697h.mo5717a(this.f4667aI);
        }
        this.f4703n.mo5034b(this.f4694e);
        this.f4646E.f4793b = this.f4646E.f4796e;
        this.f4714y = false;
        this.f4715z = false;
        this.f4646E.f4801j = false;
        this.f4646E.f4802k = false;
        this.f4703n.f4754z = false;
        if (this.f4694e.f4768b != null) {
            this.f4694e.f4768b.clear();
        }
        if (this.f4703n.f4742F) {
            this.f4703n.f4741E = 0;
            this.f4703n.f4742F = false;
            this.f4694e.mo5097b();
        }
        this.f4703n.mo4677a(this.f4646E);
        m4290y();
        m4271c(false);
        this.f4697h.mo5714a();
        if (mo87671g(this.f4662aD[0], this.f4662aD[1])) {
            mo4849f(0, 0);
        }
        m4247F();
        m4246E();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo4845e() {
        if (!this.f4709t || this.f4714y) {
            C0968g.m2814a("RV FullInvalidate");
            m4244C();
            C0968g.m2813a();
        } else if (this.f4695f.mo5751d()) {
            if (!this.f4695f.mo5746a(4) || this.f4695f.mo5746a(11)) {
                if (this.f4695f.mo5751d()) {
                    C0968g.m2814a("RV FullInvalidate");
                    m4244C();
                    C0968g.m2813a();
                }
                return;
            }
            C0968g.m2814a("RV PartialInvalidate");
            mo49162o();
            mo4851g();
            this.f4695f.mo5748b();
            if (!this.f4710u) {
                int a = this.f4696g.mo5828a();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a) {
                        break;
                    }
                    C1352v d = m4272d(this.f4696g.mo5834b(i));
                    if (d != null && !d.shouldIgnore() && d.isUpdated()) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    m4244C();
                } else {
                    this.f4695f.mo5750c();
                }
            }
            m4271c(true);
            m4290y();
            C0968g.m2813a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r0 >= 30.0f) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f4672ae = r0
            r1 = 1
            r4.f4706q = r1
            boolean r2 = r4.f4709t
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f4709t = r1
            android.support.v7.widget.RecyclerView$i r1 = r4.f4703n
            if (r1 == 0) goto L_0x0020
            android.support.v7.widget.RecyclerView$i r1 = r4.f4703n
            r1.mo5043c(r4)
        L_0x0020:
            r4.f4649H = r0
            boolean r0 = f4641d
            if (r0 == 0) goto L_0x008c
            java.lang.ThreadLocal<android.support.v7.widget.ad> r0 = android.support.p043v7.widget.C1410ad.f5080a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.ad r0 = (android.support.p043v7.widget.C1410ad) r0
            r4.f4644C = r0
            android.support.v7.widget.ad r0 = r4.f4644C
            if (r0 != 0) goto L_0x0085
            android.support.v7.widget.ad r0 = new android.support.v7.widget.ad
            r0.<init>()
            r4.f4644C = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x0046
            android.view.Display r0 = r4.getDisplay()
            goto L_0x005e
        L_0x0046:
            boolean r0 = android.support.p030v4.view.C1056u.m3018B(r4)
            if (r0 == 0) goto L_0x005d
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0075:
            android.support.v7.widget.ad r1 = r4.f4644C
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f5084d = r2
            java.lang.ThreadLocal<android.support.v7.widget.ad> r0 = android.support.p043v7.widget.C1410ad.f5080a
            android.support.v7.widget.ad r1 = r4.f4644C
            r0.set(r1)
        L_0x0085:
            android.support.v7.widget.ad r0 = r4.f4644C
            java.util.ArrayList<android.support.v7.widget.RecyclerView> r0 = r0.f5082b
            r0.add(r4)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ee, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0128, code lost:
        if (r0.isFocusable() != false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0111  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4247F() {
        /*
            r13 = this;
            boolean r0 = r13.f4692ay
            if (r0 == 0) goto L_0x0130
            android.support.v7.widget.RecyclerView$a r0 = r13.f4702m
            if (r0 == 0) goto L_0x0130
            boolean r0 = r13.hasFocus()
            if (r0 == 0) goto L_0x0130
            int r0 = r13.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x0130
            int r0 = r13.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r13.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x0130
        L_0x0026:
            boolean r0 = r13.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r13.getFocusedChild()
            boolean r1 = f4636Q
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            android.support.v7.widget.t r0 = r13.f4696g
            int r0 = r0.mo5828a()
            if (r0 != 0) goto L_0x0055
            r13.requestFocus()
            return
        L_0x004c:
            android.support.v7.widget.t r1 = r13.f4696g
            boolean r0 = r1.mo5839d(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            android.support.v7.widget.RecyclerView$s r0 = r13.f4646E
            long r0 = r0.f4804m
            r2 = 0
            r3 = -1
            r5 = 0
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00a9
            android.support.v7.widget.RecyclerView$a r0 = r13.f4702m
            boolean r0 = r0.mHasStableIds
            if (r0 == 0) goto L_0x00a9
            android.support.v7.widget.RecyclerView$s r0 = r13.f4646E
            long r0 = r0.f4804m
            android.support.v7.widget.RecyclerView$a r6 = r13.f4702m
            if (r6 == 0) goto L_0x00a9
            android.support.v7.widget.RecyclerView$a r6 = r13.f4702m
            boolean r6 = r6.mHasStableIds
            if (r6 != 0) goto L_0x0076
            goto L_0x00a9
        L_0x0076:
            android.support.v7.widget.t r6 = r13.f4696g
            int r6 = r6.mo5833b()
            r8 = r5
            r7 = 0
        L_0x007e:
            if (r7 >= r6) goto L_0x00aa
            android.support.v7.widget.t r9 = r13.f4696g
            android.view.View r9 = r9.mo5837c(r7)
            android.support.v7.widget.RecyclerView$v r9 = m4272d(r9)
            if (r9 == 0) goto L_0x00a6
            boolean r10 = r9.isRemoved()
            if (r10 != 0) goto L_0x00a6
            long r10 = r9.mItemId
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x00a6
            android.support.v7.widget.t r8 = r13.f4696g
            android.view.View r10 = r9.itemView
            boolean r8 = r8.mo5839d(r10)
            if (r8 == 0) goto L_0x00a4
            r8 = r9
            goto L_0x00a6
        L_0x00a4:
            r8 = r9
            goto L_0x00aa
        L_0x00a6:
            int r7 = r7 + 1
            goto L_0x007e
        L_0x00a9:
            r8 = r5
        L_0x00aa:
            if (r8 == 0) goto L_0x00c2
            android.support.v7.widget.t r0 = r13.f4696g
            android.view.View r1 = r8.itemView
            boolean r0 = r0.mo5839d(r1)
            if (r0 != 0) goto L_0x00c2
            android.view.View r0 = r8.itemView
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x00bf
            goto L_0x00c2
        L_0x00bf:
            android.view.View r5 = r8.itemView
            goto L_0x010f
        L_0x00c2:
            android.support.v7.widget.t r0 = r13.f4696g
            int r0 = r0.mo5828a()
            if (r0 <= 0) goto L_0x010f
            android.support.v7.widget.RecyclerView$s r0 = r13.f4646E
            int r0 = r0.f4803l
            r1 = -1
            if (r0 == r1) goto L_0x00d5
            android.support.v7.widget.RecyclerView$s r0 = r13.f4646E
            int r2 = r0.f4803l
        L_0x00d5:
            android.support.v7.widget.RecyclerView$s r0 = r13.f4646E
            int r0 = r0.mo5115a()
            r1 = r2
        L_0x00dc:
            if (r1 >= r0) goto L_0x00f3
            android.support.v7.widget.RecyclerView$v r6 = r13.mo4847f(r1)
            if (r6 == 0) goto L_0x00f3
            android.view.View r7 = r6.itemView
            boolean r7 = r7.hasFocusable()
            if (r7 == 0) goto L_0x00f0
            android.view.View r0 = r6.itemView
        L_0x00ee:
            r5 = r0
            goto L_0x010f
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00dc
        L_0x00f3:
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = r0 + -1
        L_0x00f9:
            if (r0 < 0) goto L_0x010f
            android.support.v7.widget.RecyclerView$v r1 = r13.mo4847f(r0)
            if (r1 == 0) goto L_0x010f
            android.view.View r2 = r1.itemView
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L_0x010c
            android.view.View r0 = r1.itemView
            goto L_0x00ee
        L_0x010c:
            int r0 = r0 + -1
            goto L_0x00f9
        L_0x010f:
            if (r5 == 0) goto L_0x012f
            android.support.v7.widget.RecyclerView$s r0 = r13.f4646E
            int r0 = r0.f4805n
            long r0 = (long) r0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x012b
            android.support.v7.widget.RecyclerView$s r0 = r13.f4646E
            int r0 = r0.f4805n
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x012b
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r0 = r5
        L_0x012c:
            r0.requestFocus()
        L_0x012f:
            return
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.m4247F():void");
    }

    /* renamed from: G */
    private void m4248G() {
        boolean z = true;
        this.f4646E.mo5116a(1);
        m4258a(this.f4646E);
        this.f4646E.f4800i = false;
        mo49162o();
        this.f4697h.mo5714a();
        mo4851g();
        m4243B();
        m4245D();
        C1349s sVar = this.f4646E;
        if (!this.f4646E.f4801j || !this.f4648G) {
            z = false;
        }
        sVar.f4799h = z;
        this.f4648G = false;
        this.f4647F = false;
        this.f4646E.f4798g = this.f4646E.f4802k;
        this.f4646E.f4796e = this.f4702m.getItemCount();
        m4266a(this.f4662aD);
        if (this.f4646E.f4801j) {
            int a = this.f4696g.mo5828a();
            for (int i = 0; i < a; i++) {
                C1352v d = m4272d(this.f4696g.mo5834b(i));
                if (!d.shouldIgnore() && (!d.isInvalid() || this.f4702m.mHasStableIds)) {
                    this.f4697h.mo5716a(d, this.f4642A.mo4992a(this.f4646E, d, C1327f.m4386d(d), d.getUnmodifiedPayloads()));
                    if (this.f4646E.f4799h && d.isUpdated() && !d.isRemoved() && !d.shouldIgnore() && !d.isInvalid()) {
                        this.f4697h.mo5715a(m4274e(d), d);
                    }
                }
            }
        }
        if (this.f4646E.f4802k) {
            m4251J();
            boolean z2 = this.f4646E.f4797f;
            this.f4646E.f4797f = false;
            this.f4703n.mo4689c(this.f4694e, this.f4646E);
            this.f4646E.f4797f = z2;
            for (int i2 = 0; i2 < this.f4696g.mo5828a(); i2++) {
                C1352v d2 = m4272d(this.f4696g.mo5834b(i2));
                if (!d2.shouldIgnore() && !this.f4697h.mo5723d(d2)) {
                    int d3 = C1327f.m4386d(d2);
                    boolean hasAnyOfTheFlags = d2.hasAnyOfTheFlags(VideoCacheReadBuffersizeExperiment.DEFAULT);
                    if (!hasAnyOfTheFlags) {
                        d3 |= 4096;
                    }
                    C1329b a2 = this.f4642A.mo4992a(this.f4646E, d2, d3, d2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo4802a(d2, a2);
                    } else {
                        this.f4697h.mo5720b(d2, a2);
                    }
                }
            }
            m4252K();
        } else {
            m4252K();
        }
        m4290y();
        m4271c(false);
        this.f4646E.f4795d = 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4813b() {
        if (this.f4642A != null) {
            this.f4642A.mo5001d();
        }
        if (this.f4703n != null) {
            this.f4703n.mo5042c(this.f4694e);
            this.f4703n.mo5034b(this.f4694e);
        }
        this.f4694e.mo5091a();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z) {
        this.f4707r = z;
    }

    public void setOnFlingListener(C1338k kVar) {
        this.f4687at = kVar;
    }

    public void setOnScrollListener(C1340m mVar) {
        this.f4693az = mVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4692ay = z;
    }

    public void setRecyclerListener(C1344p pVar) {
        this.f4704o = pVar;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public final int mo4843e(View view) {
        return m4275f(view);
    }

    public void setAccessibilityDelegateCompat(C1428an anVar) {
        this.f4650I = anVar;
        C1056u.m3031a((View) this, (C1002a) this.f4650I);
    }

    public void setItemViewCacheSize(int i) {
        C1343o oVar = this.f4694e;
        oVar.f4771e = i;
        oVar.mo5097b();
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo3221a(z);
    }

    public void setViewCacheExtension(C1350t tVar) {
        this.f4694e.f4774h = tVar;
    }

    /* renamed from: d */
    static C1352v m4272d(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f4721c;
    }

    /* renamed from: e */
    private long m4274e(C1352v vVar) {
        if (this.f4702m.mHasStableIds) {
            return vVar.mItemId;
        }
        return (long) vVar.mPosition;
    }

    /* renamed from: f */
    public static int m4275f(View view) {
        C1352v d = m4272d(view);
        if (d != null) {
            return d.getAdapterPosition();
        }
        return -1;
    }

    /* renamed from: g */
    public static int m4276g(View view) {
        C1352v d = m4272d(view);
        if (d != null) {
            return d.getLayoutPosition();
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo4816b(C1337j jVar) {
        if (this.f4713x != null) {
            this.f4713x.remove(jVar);
        }
    }

    public void setEdgeEffectFactory(C1326e eVar) {
        C0799m.m2267a(eVar);
        this.f4674ag = eVar;
        m4287v();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo3232b(i);
    }

    /* renamed from: b */
    public final void mo4814b(int i) {
        if (!this.f4711v) {
            mo4848f();
            if (this.f4703n != null) {
                this.f4703n.mo4741e(i);
                awakenScrollBars();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo4821c(C1352v vVar) {
        if (vVar.hasAnyOfTheFlags(524) || !vVar.isBound()) {
            return -1;
        }
        return this.f4695f.mo5749c(vVar.mPosition);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !this.f4703n.mo4684a((LayoutParams) layoutParams)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final C1352v mo4844e(int i) {
        return mo4792a(i, false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4705p.size();
        for (int i = 0; i < size; i++) {
            ((C1331h) this.f4705p.get(i)).onDraw(canvas, this, this.f4646E);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4657V.size();
        for (int i = 0; i < size; i++) {
            ((C1339l) this.f4657V.get(i)).mo5079a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setChildDrawingOrderCallback(C1325d dVar) {
        boolean z;
        if (dVar != this.f4661aC) {
            this.f4661aC = dVar;
            if (this.f4661aC != null) {
                z = true;
            } else {
                z = false;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f4698i) {
            m4287v();
        }
        this.f4698i = z;
        super.setClipToPadding(z);
        if (this.f4709t) {
            requestLayout();
        }
    }

    public void setItemAnimator(C1327f fVar) {
        if (this.f4642A != null) {
            this.f4642A.mo5001d();
            this.f4642A.f4727h = null;
        }
        this.f4642A = fVar;
        if (this.f4642A != null) {
            this.f4642A.f4727h = this.f4660aB;
        }
    }

    public void setRecycledViewPool(C1341n nVar) {
        C1343o oVar = this.f4694e;
        if (oVar.f4773g != null) {
            oVar.f4773g.mo5088c();
        }
        oVar.f4773g = nVar;
        if (oVar.f4773g != null && RecyclerView.this.getAdapter() != null) {
            oVar.f4773g.mo5087b();
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.f4686as = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f4686as = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    /* renamed from: b */
    static void m4269b(C1352v vVar) {
        if (vVar.mNestedRecyclerView != null) {
            View view = (View) vVar.mNestedRecyclerView.get();
            while (view != null) {
                if (view != vVar.itemView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            vVar.mNestedRecyclerView = null;
        }
    }

    /* renamed from: c */
    private void m4271c(boolean z) {
        if (this.f4668aa <= 0) {
            this.f4668aa = 1;
        }
        if (!z && !this.f4711v) {
            this.f4710u = false;
        }
        if (this.f4668aa == 1) {
            if (z && this.f4710u && !this.f4711v && this.f4703n != null && this.f4702m != null) {
                m4244C();
            }
            if (!this.f4711v) {
                this.f4710u = false;
            }
        }
        this.f4668aa--;
    }

    /* renamed from: i */
    static RecyclerView m4279i(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView i2 = m4279i(viewGroup.getChildAt(i));
            if (i2 != null) {
                return i2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo4833d(int i) {
        if (!this.f4711v && this.f4703n != null) {
            this.f4703n.mo4726a(this, this.f4646E, i);
        }
    }

    /* renamed from: f */
    public final C1352v mo4847f(int i) {
        C1352v vVar = null;
        if (this.f4714y) {
            return null;
        }
        int b = this.f4696g.mo5833b();
        for (int i2 = 0; i2 < b; i2++) {
            C1352v d = m4272d(this.f4696g.mo5837c(i2));
            if (d != null && !d.isRemoved() && mo4821c(d) == i) {
                if (!this.f4696g.mo5839d(d.itemView)) {
                    return d;
                }
                vVar = d;
            }
        }
        return vVar;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f4703n != null) {
            return this.f4703n.mo4668a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(mo4794a());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo4878j(View view) {
        C1352v d = m4272d(view);
        if (!(this.f4702m == null || d == null)) {
            this.f4702m.onViewDetachedFromWindow(d);
        }
        if (this.f4713x != null) {
            for (int size = this.f4713x.size() - 1; size >= 0; size--) {
                ((C1337j) this.f4713x.get(size)).mo5077b(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f4655T = (SavedState) parcelable;
        super.onRestoreInstanceState(this.f4655T.f3119e);
        if (!(this.f4703n == null || this.f4655T.f4725a == null)) {
            this.f4703n.mo4724a(this.f4655T.f4725a);
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        boolean z = false;
        if (mo4875i()) {
            if (accessibilityEvent == null || VERSION.SDK_INT < 19) {
                i = 0;
            } else {
                i = accessibilityEvent.getContentChangeTypes();
            }
            if (i == 0) {
                i = 0;
            }
            this.f4670ac = i | this.f4670ac;
            z = true;
        }
        if (!z) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f4711v) {
            mo4804a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f4711v = false;
                if (!(!this.f4710u || this.f4703n == null || this.f4702m == null)) {
                    requestLayout();
                }
                this.f4710u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4711v = true;
            this.f4669ab = true;
            mo4848f();
        }
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.f4679al) {
            this.f4679al = i;
            if (i != 2) {
                m4281p();
            }
            if (this.f4703n != null) {
                this.f4703n.mo5056j(i);
            }
            if (this.f4693az != null) {
                this.f4693az.onScrollStateChanged(this, i);
            }
            if (this.f4659aA != null) {
                for (int size = this.f4659aA.size() - 1; size >= 0; size--) {
                    ((C1340m) this.f4659aA.get(size)).onScrollStateChanged(this, i);
                }
            }
        }
    }

    /* renamed from: d */
    private void m4273d(C1352v vVar) {
        boolean z;
        View view = vVar.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f4694e.mo5098b(mo4812b(view));
        if (vVar.isTmpDetached()) {
            this.f4696g.mo5831a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f4696g.mo5832a(view, -1, true);
        } else {
            C1501t tVar = this.f4696g;
            int a = tVar.f5396a.mo4931a(view);
            if (a >= 0) {
                tVar.f5397b.mo5842a(a);
                tVar.mo5830a(view);
                return;
            }
            StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public final View mo4822c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f4703n != null) {
            return this.f4703n.mo4669a(layoutParams);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(mo4794a());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final Rect mo4872h(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f4723e) {
            return layoutParams.f4722d;
        }
        if (this.f4646E.f4798g && (layoutParams.bv_() || layoutParams.f4721c.isInvalid())) {
            return layoutParams.f4722d;
        }
        Rect rect = layoutParams.f4722d;
        rect.set(0, 0, 0, 0);
        int size = this.f4705p.size();
        for (int i = 0; i < size; i++) {
            this.f4700k.set(0, 0, 0, 0);
            ((C1331h) this.f4705p.get(i)).getItemOffsets(this.f4700k, view, this, this.f4646E);
            rect.left += this.f4700k.left;
            rect.top += this.f4700k.top;
            rect.right += this.f4700k.right;
            rect.bottom += this.f4700k.bottom;
        }
        layoutParams.f4723e = false;
        return rect;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f4703n != null && !this.f4711v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f4703n.mo4745f()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.f4703n.mo4742e()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        m4267a((int) (f * this.f4690aw), (int) (f2 * this.f4691ax), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f4703n.mo4745f()) {
                        f2 = -axisValue;
                    } else if (this.f4703n.mo4742e()) {
                        f = axisValue;
                        f2 = 0.0f;
                        m4267a((int) (f * this.f4690aw), (int) (f2 * this.f4691ax), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            m4267a((int) (f * this.f4690aw), (int) (f2 * this.f4691ax), motionEvent);
        }
        return false;
    }

    public void setAdapter(C1322a aVar) {
        setLayoutFrozen(false);
        if (this.f4702m != null) {
            this.f4702m.unregisterAdapterDataObserver(this.f4654S);
            this.f4702m.onDetachedFromRecyclerView(this);
        }
        mo4813b();
        this.f4695f.mo5745a();
        C1322a aVar2 = this.f4702m;
        this.f4702m = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.f4654S);
            aVar.onAttachedToRecyclerView(this);
        }
        if (this.f4703n != null) {
            this.f4703n.mo5019a(aVar2, this.f4702m);
        }
        C1343o oVar = this.f4694e;
        C1322a aVar3 = this.f4702m;
        oVar.mo5091a();
        C1341n c = oVar.mo5100c();
        if (aVar2 != null) {
            c.mo5088c();
        }
        if (c.f4762b == 0) {
            c.mo5085a();
        }
        if (aVar3 != null) {
            c.mo5087b();
        }
        this.f4646E.f4797f = true;
        mo4819b(false);
        requestLayout();
    }

    /* renamed from: b */
    public final C1352v mo4812b(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4272d(view);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo4824c(int i) {
        if (this.f4703n != null) {
            this.f4703n.mo4741e(i);
            awakenScrollBars();
        }
    }

    public void setLayoutManager(C1332i iVar) {
        if (iVar != this.f4703n) {
            mo4848f();
            if (this.f4703n != null) {
                if (this.f4642A != null) {
                    this.f4642A.mo5001d();
                }
                this.f4703n.mo5042c(this.f4694e);
                this.f4703n.mo5034b(this.f4694e);
                this.f4694e.mo5091a();
                if (this.f4706q) {
                    this.f4703n.mo5036b(this, this.f4694e);
                }
                this.f4703n.mo5035b((RecyclerView) null);
                this.f4703n = null;
            } else {
                this.f4694e.mo5091a();
            }
            C1501t tVar = this.f4696g;
            tVar.f5397b.mo5841a();
            for (int size = tVar.f5398c.size() - 1; size >= 0; size--) {
                tVar.f5396a.mo4940d((View) tVar.f5398c.get(size));
                tVar.f5398c.remove(size);
            }
            tVar.f5396a.mo4937b();
            this.f4703n = iVar;
            if (iVar != null) {
                if (iVar.f4750v == null) {
                    this.f4703n.mo5035b(this);
                    if (this.f4706q) {
                        this.f4703n.mo5043c(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(iVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(iVar.f4750v.mo4794a());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f4694e.mo5097b();
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m4258a(C1349s sVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4643B.f4811c;
            sVar.f4806o = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.f4807p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.f4806o = 0;
        sVar.f4807p = 0;
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        super.draw(canvas);
        int size = this.f4705p.size();
        boolean z5 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((C1331h) this.f4705p.get(i3)).onDrawOver(canvas, this, this.f4646E);
        }
        if (this.f4675ah == null || this.f4675ah.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.f4698i) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), 0.0f);
            if (this.f4675ah == null || !this.f4675ah.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        if (this.f4676ai != null && !this.f4676ai.isFinished()) {
            int save2 = canvas.save();
            if (this.f4698i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (this.f4676ai == null || !this.f4676ai.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save2);
        }
        if (this.f4677aj != null && !this.f4677aj.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f4698i) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i), (float) (-width));
            if (this.f4677aj == null || !this.f4677aj.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save3);
        }
        if (this.f4678ak == null || this.f4678ak.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4698i) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.f4678ak != null && this.f4678ak.draw(canvas)) {
                z5 = true;
            }
            z2 = z5 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f4642A != null && this.f4705p.size() > 0 && this.f4642A.mo4997b()) {
            z2 = true;
        }
        if (z2) {
            C1056u.m3052d(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.f4711v) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f4658W = null;
        }
        int size = this.f4657V.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            C1339l lVar = (C1339l) this.f4657V.get(i);
            if (lVar.mo5080a(this, motionEvent) && action != 3) {
                this.f4658W = lVar;
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            m4289x();
            return true;
        } else if (this.f4703n == null) {
            return false;
        } else {
            boolean e = this.f4703n.mo4742e();
            boolean f = this.f4703n.mo4745f();
            if (this.f4681an == null) {
                this.f4681an = VelocityTracker.obtain();
            }
            this.f4681an.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    if (this.f4669ab) {
                        this.f4669ab = false;
                    }
                    this.f4680am = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f4684aq = x;
                    this.f4682ao = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f4685ar = y;
                    this.f4683ap = y;
                    if (this.f4679al == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f4665aG;
                    this.f4665aG[1] = 0;
                    iArr[0] = 0;
                    if (f) {
                        e |= true;
                    }
                    m4278h(e ? 1 : 0, 0);
                    break;
                case 1:
                    this.f4681an.clear();
                    mo3220a(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4680am);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.f4679al != 1) {
                            int i2 = x2 - this.f4682ao;
                            int i3 = y2 - this.f4683ap;
                            if (!e || Math.abs(i2) <= this.f4686as) {
                                z2 = false;
                            } else {
                                this.f4684aq = x2;
                                z2 = true;
                            }
                            if (f && Math.abs(i3) > this.f4686as) {
                                this.f4685ar = y2;
                                z2 = true;
                            }
                            if (z2) {
                                setScrollState(1);
                                break;
                            }
                        }
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    m4289x();
                    break;
                case 5:
                    this.f4680am = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f4684aq = x3;
                    this.f4682ao = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f4685ar = y3;
                    this.f4683ap = y3;
                    break;
                case 6:
                    m4263a(motionEvent);
                    break;
            }
            if (this.f4679al == 1) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            boolean r0 = r14.f4711v
            r1 = 0
            if (r0 != 0) goto L_0x01eb
            boolean r0 = r14.f4669ab
            if (r0 == 0) goto L_0x000b
            goto L_0x01eb
        L_0x000b:
            int r0 = r15.getAction()
            android.support.v7.widget.RecyclerView$l r2 = r14.f4658W
            r3 = 1
            if (r2 == 0) goto L_0x0028
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r14.f4658W = r2
            goto L_0x0028
        L_0x001a:
            android.support.v7.widget.RecyclerView$l r4 = r14.f4658W
            r4.mo5081b(r14, r15)
            r4 = 3
            if (r0 == r4) goto L_0x0024
            if (r0 != r3) goto L_0x0026
        L_0x0024:
            r14.f4658W = r2
        L_0x0026:
            r0 = 1
            goto L_0x0048
        L_0x0028:
            if (r0 == 0) goto L_0x0047
            java.util.ArrayList<android.support.v7.widget.RecyclerView$l> r0 = r14.f4657V
            int r0 = r0.size()
            r2 = 0
        L_0x0031:
            if (r2 >= r0) goto L_0x0047
            java.util.ArrayList<android.support.v7.widget.RecyclerView$l> r4 = r14.f4657V
            java.lang.Object r4 = r4.get(r2)
            android.support.v7.widget.RecyclerView$l r4 = (android.support.p043v7.widget.RecyclerView.C1339l) r4
            boolean r5 = r4.mo5080a(r14, r15)
            if (r5 == 0) goto L_0x0044
            r14.f4658W = r4
            goto L_0x0026
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0031
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 == 0) goto L_0x004e
            r14.m4289x()
            return r3
        L_0x004e:
            android.support.v7.widget.RecyclerView$i r0 = r14.f4703n
            if (r0 != 0) goto L_0x0053
            return r1
        L_0x0053:
            android.support.v7.widget.RecyclerView$i r0 = r14.f4703n
            boolean r0 = r0.mo4742e()
            android.support.v7.widget.RecyclerView$i r2 = r14.f4703n
            boolean r2 = r2.mo4745f()
            android.view.VelocityTracker r4 = r14.f4681an
            if (r4 != 0) goto L_0x0069
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r14.f4681an = r4
        L_0x0069:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r15)
            int r5 = r15.getActionMasked()
            int r6 = r15.getActionIndex()
            if (r5 != 0) goto L_0x007f
            int[] r7 = r14.f4665aG
            int[] r8 = r14.f4665aG
            r8[r3] = r1
            r7[r1] = r1
        L_0x007f:
            int[] r7 = r14.f4665aG
            r7 = r7[r1]
            float r7 = (float) r7
            int[] r8 = r14.f4665aG
            r8 = r8[r3]
            float r8 = (float) r8
            r4.offsetLocation(r7, r8)
            r7 = 1056964608(0x3f000000, float:0.5)
            switch(r5) {
                case 0: goto L_0x01bf;
                case 1: goto L_0x017d;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b4;
                case 4: goto L_0x0091;
                case 5: goto L_0x0098;
                case 6: goto L_0x0093;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x01e0
        L_0x0093:
            r14.m4263a(r15)
            goto L_0x01e0
        L_0x0098:
            int r0 = r15.getPointerId(r6)
            r14.f4680am = r0
            float r0 = r15.getX(r6)
            float r0 = r0 + r7
            int r0 = (int) r0
            r14.f4684aq = r0
            r14.f4682ao = r0
            float r15 = r15.getY(r6)
            float r15 = r15 + r7
            int r15 = (int) r15
            r14.f4685ar = r15
            r14.f4683ap = r15
            goto L_0x01e0
        L_0x00b4:
            r14.m4289x()
            goto L_0x01e0
        L_0x00b9:
            int r5 = r14.f4680am
            int r5 = r15.findPointerIndex(r5)
            if (r5 >= 0) goto L_0x00c2
            return r1
        L_0x00c2:
            float r6 = r15.getX(r5)
            float r6 = r6 + r7
            int r6 = (int) r6
            float r15 = r15.getY(r5)
            float r15 = r15 + r7
            int r15 = (int) r15
            int r5 = r14.f4684aq
            int r5 = r5 - r6
            int r7 = r14.f4685ar
            int r13 = r7 - r15
            int[] r10 = r14.f4651J
            int[] r11 = r14.f4664aF
            r12 = 0
            r7 = r14
            r8 = r5
            r9 = r13
            boolean r7 = r7.mo4807a(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0110
            int[] r7 = r14.f4651J
            r7 = r7[r1]
            int r5 = r5 - r7
            int[] r7 = r14.f4651J
            r7 = r7[r3]
            int r13 = r13 - r7
            int[] r7 = r14.f4664aF
            r7 = r7[r1]
            float r7 = (float) r7
            int[] r8 = r14.f4664aF
            r8 = r8[r3]
            float r8 = (float) r8
            r4.offsetLocation(r7, r8)
            int[] r7 = r14.f4665aG
            r8 = r7[r1]
            int[] r9 = r14.f4664aF
            r9 = r9[r1]
            int r8 = r8 + r9
            r7[r1] = r8
            int[] r7 = r14.f4665aG
            r8 = r7[r3]
            int[] r9 = r14.f4664aF
            r9 = r9[r3]
            int r8 = r8 + r9
            r7[r3] = r8
        L_0x0110:
            int r7 = r14.f4679al
            if (r7 == r3) goto L_0x0146
            if (r0 == 0) goto L_0x012a
            int r7 = java.lang.Math.abs(r5)
            int r8 = r14.f4686as
            if (r7 <= r8) goto L_0x012a
            if (r5 <= 0) goto L_0x0124
            int r7 = r14.f4686as
            int r5 = r5 - r7
            goto L_0x0127
        L_0x0124:
            int r7 = r14.f4686as
            int r5 = r5 + r7
        L_0x0127:
            r7 = r5
            r5 = 1
            goto L_0x012c
        L_0x012a:
            r7 = r5
            r5 = 0
        L_0x012c:
            if (r2 == 0) goto L_0x0140
            int r8 = java.lang.Math.abs(r13)
            int r9 = r14.f4686as
            if (r8 <= r9) goto L_0x0140
            if (r13 <= 0) goto L_0x013c
            int r5 = r14.f4686as
            int r13 = r13 - r5
            goto L_0x013f
        L_0x013c:
            int r5 = r14.f4686as
            int r13 = r13 + r5
        L_0x013f:
            r5 = 1
        L_0x0140:
            if (r5 == 0) goto L_0x0145
            r14.setScrollState(r3)
        L_0x0145:
            r5 = r7
        L_0x0146:
            int r7 = r14.f4679al
            if (r7 != r3) goto L_0x01e0
            int[] r7 = r14.f4664aF
            r7 = r7[r1]
            int r6 = r6 - r7
            r14.f4684aq = r6
            int[] r6 = r14.f4664aF
            r6 = r6[r3]
            int r15 = r15 - r6
            r14.f4685ar = r15
            if (r0 == 0) goto L_0x015c
            r15 = r5
            goto L_0x015d
        L_0x015c:
            r15 = 0
        L_0x015d:
            if (r2 == 0) goto L_0x0161
            r0 = r13
            goto L_0x0162
        L_0x0161:
            r0 = 0
        L_0x0162:
            boolean r15 = r14.m4267a(r15, r0, r4)
            if (r15 == 0) goto L_0x016f
            android.view.ViewParent r15 = r14.getParent()
            r15.requestDisallowInterceptTouchEvent(r3)
        L_0x016f:
            android.support.v7.widget.ad r15 = r14.f4644C
            if (r15 == 0) goto L_0x01e0
            if (r5 != 0) goto L_0x0177
            if (r13 == 0) goto L_0x01e0
        L_0x0177:
            android.support.v7.widget.ad r15 = r14.f4644C
            r15.mo5481a(r14, r5, r13)
            goto L_0x01e0
        L_0x017d:
            android.view.VelocityTracker r15 = r14.f4681an
            r15.addMovement(r4)
            android.view.VelocityTracker r15 = r14.f4681an
            r5 = 1000(0x3e8, float:1.401E-42)
            int r6 = r14.f4689av
            float r6 = (float) r6
            r15.computeCurrentVelocity(r5, r6)
            r15 = 0
            if (r0 == 0) goto L_0x0199
            android.view.VelocityTracker r0 = r14.f4681an
            int r5 = r14.f4680am
            float r0 = r0.getXVelocity(r5)
            float r0 = -r0
            goto L_0x019a
        L_0x0199:
            r0 = 0
        L_0x019a:
            if (r2 == 0) goto L_0x01a6
            android.view.VelocityTracker r2 = r14.f4681an
            int r5 = r14.f4680am
            float r2 = r2.getYVelocity(r5)
            float r2 = -r2
            goto L_0x01a7
        L_0x01a6:
            r2 = 0
        L_0x01a7:
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x01af
            int r15 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x01b7
        L_0x01af:
            int r15 = (int) r0
            int r0 = (int) r2
            boolean r15 = r14.mo4820b(r15, r0)
            if (r15 != 0) goto L_0x01ba
        L_0x01b7:
            r14.setScrollState(r1)
        L_0x01ba:
            r14.m4288w()
            r1 = 1
            goto L_0x01e0
        L_0x01bf:
            int r5 = r15.getPointerId(r1)
            r14.f4680am = r5
            float r5 = r15.getX()
            float r5 = r5 + r7
            int r5 = (int) r5
            r14.f4684aq = r5
            r14.f4682ao = r5
            float r15 = r15.getY()
            float r15 = r15 + r7
            int r15 = (int) r15
            r14.f4685ar = r15
            r14.f4683ap = r15
            if (r2 == 0) goto L_0x01dd
            r0 = r0 | 2
        L_0x01dd:
            r14.m4278h(r0, r1)
        L_0x01e0:
            if (r1 != 0) goto L_0x01e7
            android.view.VelocityTracker r15 = r14.f4681an
            r15.addMovement(r4)
        L_0x01e7:
            r4.recycle()
            return r3
        L_0x01eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void mo4815b(C1331h hVar) {
        boolean z;
        if (this.f4703n != null) {
            this.f4703n.mo4729a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4705p.remove(hVar);
        if (this.f4705p.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        mo4879k();
        requestLayout();
    }

    /* renamed from: a */
    private void m4263a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4680am) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f4680am = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4684aq = x;
            this.f4682ao = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4685ar = y;
            this.f4683ap = y;
        }
    }

    /* renamed from: b */
    public final void mo4817b(C1339l lVar) {
        this.f4657V.remove(lVar);
        if (this.f4658W == lVar) {
            this.f4658W = null;
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: h */
    private boolean m4278h(int i, int i2) {
        return getScrollingChildHelper().mo3226a(i, i2);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo3223a(f, f2);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f4661aC == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.f4661aC.mo4990a(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4875i()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* renamed from: a */
    public static void m4264a(View view, Rect rect) {
        m4270b(view, rect);
    }

    /* renamed from: g */
    private boolean mo87671g(int i, int i2) {
        m4266a(this.f4662aD);
        if (this.f4662aD[0] == i && this.f4662aD[1] == i2) {
            return false;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        C1332i iVar = this.f4703n;
        C1349s sVar = this.f4646E;
        if (iVar.mo5059p() || mo4875i()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && view2 != null) {
            m4265a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: a */
    private void m4257a(C1331h hVar, int i) {
        if (this.f4703n != null) {
            this.f4703n.mo4729a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4705p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f4705p.add(hVar);
        mo4879k();
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo4846e(int i, int i2) {
        setMeasuredDimension(C1332i.m4405a(i, getPaddingLeft() + getPaddingRight(), C1056u.m3065k(this)), C1332i.m4405a(i2, getPaddingTop() + getPaddingBottom(), C1056u.m3066l(this)));
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1352v d = m4272d(view);
        if (d != null) {
            if (d.isTmpDetached()) {
                d.clearTmpDetachFlag();
            } else if (!d.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(d);
                sb.append(mo4794a());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        mo4878j(view);
        super.removeDetachedView(view, z);
    }

    public void scrollBy(int i, int i2) {
        if (this.f4703n != null && !this.f4711v) {
            boolean e = this.f4703n.mo4742e();
            boolean f = this.f4703n.mo4745f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                m4267a(i, i2, (MotionEvent) null);
            }
        }
    }

    /* renamed from: b */
    static void m4270b(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f4722d;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo4849f(int i, int i2) {
        this.f4673af++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        if (this.f4693az != null) {
            this.f4693az.onScrolled(this, i, i2);
        }
        if (this.f4659aA != null) {
            for (int size = this.f4659aA.size() - 1; size >= 0; size--) {
                ((C1340m) this.f4659aA.get(size)).onScrolled(this, i, i2);
            }
        }
        this.f4673af--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo4834d(int i, int i2) {
        if (i < 0) {
            m4283r();
            this.f4675ah.onAbsorb(-i);
        } else if (i > 0) {
            m4284s();
            this.f4677aj.onAbsorb(i);
        }
        if (i2 < 0) {
            m4285t();
            this.f4676ai.onAbsorb(-i2);
        } else if (i2 > 0) {
            m4286u();
            this.f4678ak.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C1056u.m3052d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4703n == null) {
            mo4846e(i, i2);
            return;
        }
        boolean z = false;
        if (this.f4703n.br_()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f4703n.mo5021a(this.f4694e, this.f4646E, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f4702m != null) {
                if (this.f4646E.f4795d == 1) {
                    m4248G();
                }
                this.f4703n.mo5033b(i, i2);
                this.f4646E.f4800i = true;
                m4249H();
                this.f4703n.mo5041c(i, i2);
                if (this.f4703n.bt_()) {
                    this.f4703n.mo5033b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f4646E.f4800i = true;
                    m4249H();
                    this.f4703n.mo5041c(i, i2);
                }
            }
        } else if (this.f4707r) {
            this.f4703n.mo5021a(this.f4694e, this.f4646E, i, i2);
        } else {
            if (this.f4712w) {
                mo49162o();
                mo4851g();
                m4243B();
                m4290y();
                if (this.f4646E.f4802k) {
                    this.f4646E.f4798g = true;
                } else {
                    this.f4695f.mo5752e();
                    this.f4646E.f4798g = false;
                }
                this.f4712w = false;
                m4271c(false);
            } else if (this.f4646E.f4802k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.f4702m != null) {
                this.f4646E.f4796e = this.f4702m.getItemCount();
            } else {
                this.f4646E.f4796e = 0;
            }
            mo49162o();
            this.f4703n.mo5021a(this.f4694e, this.f4646E, i, i2);
            m4271c(false);
            this.f4646E.f4798g = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo4825c(int i, int i2) {
        boolean z;
        if (this.f4675ah == null || this.f4675ah.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f4675ah.onRelease();
            z = this.f4675ah.isFinished();
        }
        if (this.f4677aj != null && !this.f4677aj.isFinished() && i < 0) {
            this.f4677aj.onRelease();
            z |= this.f4677aj.isFinished();
        }
        if (this.f4676ai != null && !this.f4676ai.isFinished() && i2 > 0) {
            this.f4676ai.onRelease();
            z |= this.f4676ai.isFinished();
        }
        if (this.f4678ak != null && !this.f4678ak.isFinished() && i2 < 0) {
            this.f4678ak.onRelease();
            z |= this.f4678ak.isFinished();
        }
        if (z) {
            C1056u.m3052d(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01cc, code lost:
        if ((r9 * r3) < 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01d5, code lost:
        if ((r9 * r3) > 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01d8, code lost:
        if (r8 > 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01db, code lost:
        if (r9 > 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01de, code lost:
        if (r8 < 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01e1, code lost:
        if (r9 < 0) goto L_0x01e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            r12 = this;
            android.support.v7.widget.RecyclerView$a r0 = r12.f4702m
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            android.support.v7.widget.RecyclerView$i r0 = r12.f4703n
            if (r0 == 0) goto L_0x0016
            boolean r0 = r12.mo4875i()
            if (r0 != 0) goto L_0x0016
            boolean r0 = r12.f4711v
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 17
            r5 = 66
            r6 = 33
            r7 = 130(0x82, float:1.82E-43)
            r8 = 0
            if (r0 == 0) goto L_0x009a
            r9 = 2
            if (r14 == r9) goto L_0x002b
            if (r14 != r1) goto L_0x009a
        L_0x002b:
            android.support.v7.widget.RecyclerView$i r0 = r12.f4703n
            boolean r0 = r0.mo4745f()
            if (r0 == 0) goto L_0x0049
            if (r14 != r9) goto L_0x0038
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003a
        L_0x0038:
            r0 = 33
        L_0x003a:
            android.view.View r10 = r3.findNextFocus(r12, r13, r0)
            if (r10 != 0) goto L_0x0042
            r10 = 1
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            boolean r11 = f4635P
            if (r11 == 0) goto L_0x004a
            r14 = r0
            goto L_0x004a
        L_0x0049:
            r10 = 0
        L_0x004a:
            if (r10 != 0) goto L_0x007a
            android.support.v7.widget.RecyclerView$i r0 = r12.f4703n
            boolean r0 = r0.mo4742e()
            if (r0 == 0) goto L_0x007a
            android.support.v7.widget.RecyclerView$i r0 = r12.f4703n
            int r0 = r0.mo5060q()
            if (r0 != r1) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r14 != r9) goto L_0x0063
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            r0 = r0 ^ r9
            if (r0 == 0) goto L_0x006a
            r0 = 66
            goto L_0x006c
        L_0x006a:
            r0 = 17
        L_0x006c:
            android.view.View r9 = r3.findNextFocus(r12, r13, r0)
            if (r9 != 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            boolean r9 = f4635P
            if (r9 == 0) goto L_0x007a
            r14 = r0
        L_0x007a:
            if (r10 == 0) goto L_0x0095
            r12.mo4845e()
            android.view.View r0 = r12.mo4822c(r13)
            if (r0 != 0) goto L_0x0086
            return r8
        L_0x0086:
            r12.mo49162o()
            android.support.v7.widget.RecyclerView$i r0 = r12.f4703n
            android.support.v7.widget.RecyclerView$o r9 = r12.f4694e
            android.support.v7.widget.RecyclerView$s r10 = r12.f4646E
            r0.mo4671a(r13, r14, r9, r10)
            r12.m4271c(r2)
        L_0x0095:
            android.view.View r0 = r3.findNextFocus(r12, r13, r14)
            goto L_0x00be
        L_0x009a:
            android.view.View r3 = r3.findNextFocus(r12, r13, r14)
            if (r3 != 0) goto L_0x00bd
            if (r0 == 0) goto L_0x00bd
            r12.mo4845e()
            android.view.View r0 = r12.mo4822c(r13)
            if (r0 != 0) goto L_0x00ac
            return r8
        L_0x00ac:
            r12.mo49162o()
            android.support.v7.widget.RecyclerView$i r0 = r12.f4703n
            android.support.v7.widget.RecyclerView$o r3 = r12.f4694e
            android.support.v7.widget.RecyclerView$s r9 = r12.f4646E
            android.view.View r0 = r0.mo4671a(r13, r14, r3, r9)
            r12.m4271c(r2)
            goto L_0x00be
        L_0x00bd:
            r0 = r3
        L_0x00be:
            if (r0 == 0) goto L_0x00d5
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00d5
            android.view.View r1 = r12.getFocusedChild()
            if (r1 != 0) goto L_0x00d1
            android.view.View r13 = super.focusSearch(r13, r14)
            return r13
        L_0x00d1:
            r12.m4265a(r0, r8)
            return r13
        L_0x00d5:
            if (r0 == 0) goto L_0x01e4
            if (r0 != r12) goto L_0x00db
            goto L_0x01e4
        L_0x00db:
            android.view.View r3 = r12.mo4822c(r0)
            if (r3 != 0) goto L_0x00e3
            goto L_0x01e4
        L_0x00e3:
            if (r13 != 0) goto L_0x00e7
            goto L_0x01e5
        L_0x00e7:
            android.view.View r3 = r12.mo4822c(r13)
            if (r3 != 0) goto L_0x00ef
            goto L_0x01e5
        L_0x00ef:
            android.graphics.Rect r3 = r12.f4700k
            int r8 = r13.getWidth()
            int r9 = r13.getHeight()
            r3.set(r2, r2, r8, r9)
            android.graphics.Rect r3 = r12.f4656U
            int r8 = r0.getWidth()
            int r9 = r0.getHeight()
            r3.set(r2, r2, r8, r9)
            android.graphics.Rect r3 = r12.f4700k
            r12.offsetDescendantRectToMyCoords(r13, r3)
            android.graphics.Rect r3 = r12.f4656U
            r12.offsetDescendantRectToMyCoords(r0, r3)
            android.support.v7.widget.RecyclerView$i r3 = r12.f4703n
            int r3 = r3.mo5060q()
            r8 = -1
            if (r3 != r1) goto L_0x011e
            r3 = -1
            goto L_0x011f
        L_0x011e:
            r3 = 1
        L_0x011f:
            android.graphics.Rect r9 = r12.f4700k
            int r9 = r9.left
            android.graphics.Rect r10 = r12.f4656U
            int r10 = r10.left
            if (r9 < r10) goto L_0x0133
            android.graphics.Rect r9 = r12.f4700k
            int r9 = r9.right
            android.graphics.Rect r10 = r12.f4656U
            int r10 = r10.left
            if (r9 > r10) goto L_0x013f
        L_0x0133:
            android.graphics.Rect r9 = r12.f4700k
            int r9 = r9.right
            android.graphics.Rect r10 = r12.f4656U
            int r10 = r10.right
            if (r9 >= r10) goto L_0x013f
            r9 = 1
            goto L_0x0160
        L_0x013f:
            android.graphics.Rect r9 = r12.f4700k
            int r9 = r9.right
            android.graphics.Rect r10 = r12.f4656U
            int r10 = r10.right
            if (r9 > r10) goto L_0x0153
            android.graphics.Rect r9 = r12.f4700k
            int r9 = r9.left
            android.graphics.Rect r10 = r12.f4656U
            int r10 = r10.right
            if (r9 < r10) goto L_0x015f
        L_0x0153:
            android.graphics.Rect r9 = r12.f4700k
            int r9 = r9.left
            android.graphics.Rect r10 = r12.f4656U
            int r10 = r10.left
            if (r9 <= r10) goto L_0x015f
            r9 = -1
            goto L_0x0160
        L_0x015f:
            r9 = 0
        L_0x0160:
            android.graphics.Rect r10 = r12.f4700k
            int r10 = r10.top
            android.graphics.Rect r11 = r12.f4656U
            int r11 = r11.top
            if (r10 < r11) goto L_0x0174
            android.graphics.Rect r10 = r12.f4700k
            int r10 = r10.bottom
            android.graphics.Rect r11 = r12.f4656U
            int r11 = r11.top
            if (r10 > r11) goto L_0x0180
        L_0x0174:
            android.graphics.Rect r10 = r12.f4700k
            int r10 = r10.bottom
            android.graphics.Rect r11 = r12.f4656U
            int r11 = r11.bottom
            if (r10 >= r11) goto L_0x0180
            r8 = 1
            goto L_0x01a0
        L_0x0180:
            android.graphics.Rect r10 = r12.f4700k
            int r10 = r10.bottom
            android.graphics.Rect r11 = r12.f4656U
            int r11 = r11.bottom
            if (r10 > r11) goto L_0x0194
            android.graphics.Rect r10 = r12.f4700k
            int r10 = r10.top
            android.graphics.Rect r11 = r12.f4656U
            int r11 = r11.bottom
            if (r10 < r11) goto L_0x019f
        L_0x0194:
            android.graphics.Rect r10 = r12.f4700k
            int r10 = r10.top
            android.graphics.Rect r11 = r12.f4656U
            int r11 = r11.top
            if (r10 <= r11) goto L_0x019f
            goto L_0x01a0
        L_0x019f:
            r8 = 0
        L_0x01a0:
            if (r14 == r4) goto L_0x01e1
            if (r14 == r6) goto L_0x01de
            if (r14 == r5) goto L_0x01db
            if (r14 == r7) goto L_0x01d8
            switch(r14) {
                case 1: goto L_0x01cf;
                case 2: goto L_0x01c6;
                default: goto L_0x01ab;
            }
        L_0x01ab:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid direction: "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r12.mo4794a()
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        L_0x01c6:
            if (r8 > 0) goto L_0x01e5
            if (r8 != 0) goto L_0x01e4
            int r9 = r9 * r3
            if (r9 < 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01cf:
            if (r8 < 0) goto L_0x01e5
            if (r8 != 0) goto L_0x01e4
            int r9 = r9 * r3
            if (r9 > 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01d8:
            if (r8 <= 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01db:
            if (r9 <= 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01de:
            if (r8 >= 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e1:
            if (r9 >= 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r1 = 0
        L_0x01e5:
            if (r1 == 0) goto L_0x01e8
            return r0
        L_0x01e8:
            android.view.View r13 = super.focusSearch(r13, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo3224a(f, f2, z);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4703n.mo5028a(this, view, rect, z, false);
    }

    /* renamed from: a */
    private void m4256a(long j, C1352v vVar, C1352v vVar2) {
        int a = this.f4696g.mo5828a();
        int i = 0;
        while (i < a) {
            C1352v d = m4272d(this.f4696g.mo5834b(i));
            if (d == vVar || m4274e(d) != j) {
                i++;
            } else if (this.f4702m == null || !this.f4702m.mHasStableIds) {
                StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb.append(d);
                sb.append(" \n View Holder 2:");
                sb.append(vVar);
                sb.append(mo4794a());
                throw new IllegalStateException(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(d);
                sb2.append(" \n View Holder 2:");
                sb2.append(vVar);
                sb2.append(mo4794a());
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        C1412a aVar;
        float f;
        float f2;
        boolean z;
        int i2;
        char c;
        TypedArray typedArray;
        char c2;
        int i3;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i;
        super(context, attributeSet, i);
        this.f4654S = new C1345q();
        this.f4694e = new C1343o();
        this.f4697h = new C1464bi();
        this.f4699j = new Runnable() {
            public final void run() {
                if (RecyclerView.this.f4709t && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.f4706q) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.f4711v) {
                        RecyclerView.this.f4710u = true;
                    } else {
                        RecyclerView.this.mo4845e();
                    }
                }
            }
        };
        this.f4700k = new Rect();
        this.f4656U = new Rect();
        this.f4701l = new RectF();
        this.f4705p = new ArrayList<>();
        this.f4657V = new ArrayList<>();
        this.f4668aa = 0;
        this.f4714y = false;
        this.f4715z = false;
        this.f4672ae = 0;
        this.f4673af = 0;
        this.f4674ag = new C1326e();
        this.f4642A = new C1506w();
        this.f4679al = 0;
        this.f4680am = -1;
        this.f4690aw = Float.MIN_VALUE;
        this.f4691ax = Float.MIN_VALUE;
        boolean z2 = true;
        this.f4692ay = true;
        this.f4643B = new C1351u();
        if (f4641d) {
            aVar = new C1412a();
        } else {
            aVar = null;
        }
        this.f4645D = aVar;
        this.f4646E = new C1349s();
        this.f4647F = false;
        this.f4648G = false;
        this.f4660aB = new C1330g();
        this.f4649H = false;
        this.f4662aD = new int[2];
        this.f4664aF = new int[2];
        this.f4651J = new int[2];
        this.f4665aG = new int[2];
        this.f4652K = new int[2];
        this.f4653L = new ArrayList();
        this.f4666aH = new Runnable() {
            public final void run() {
                if (RecyclerView.this.f4642A != null) {
                    RecyclerView.this.f4642A.mo4993a();
                }
                RecyclerView.this.f4649H = false;
            }
        };
        this.f4667aI = new C1466b() {
            /* renamed from: a */
            public final void mo4926a(C1352v vVar) {
                RecyclerView.this.f4703n.mo5026a(vVar.itemView, RecyclerView.this.f4694e);
            }

            /* renamed from: a */
            public final void mo4927a(C1352v vVar, C1329b bVar, C1329b bVar2) {
                RecyclerView.this.f4694e.mo5098b(vVar);
                RecyclerView.this.mo4803a(vVar, bVar, bVar2);
            }

            /* renamed from: b */
            public final void mo4928b(C1352v vVar, C1329b bVar, C1329b bVar2) {
                RecyclerView recyclerView = RecyclerView.this;
                vVar.setIsRecyclable(false);
                if (recyclerView.f4642A.mo4998b(vVar, bVar, bVar2)) {
                    recyclerView.mo4877j();
                }
            }

            /* renamed from: c */
            public final void mo4929c(C1352v vVar, C1329b bVar, C1329b bVar2) {
                vVar.setIsRecyclable(false);
                if (RecyclerView.this.f4714y) {
                    if (RecyclerView.this.f4642A.mo4995a(vVar, vVar, bVar, bVar2)) {
                        RecyclerView.this.mo4877j();
                    }
                } else if (RecyclerView.this.f4642A.mo5000c(vVar, bVar, bVar2)) {
                    RecyclerView.this.mo4877j();
                }
            }
        };
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, f4634O, i4, 0);
            this.f4698i = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4698i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4686as = viewConfiguration.getScaledTouchSlop();
        if (VERSION.SDK_INT >= 26) {
            f = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            f = C1060v.m3089a(viewConfiguration, context2);
        }
        this.f4690aw = f;
        if (VERSION.SDK_INT >= 26) {
            f2 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            f2 = C1060v.m3089a(viewConfiguration, context2);
        }
        this.f4691ax = f2;
        this.f4688au = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4689av = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.f4642A.f4727h = this.f4660aB;
        this.f4695f = new C1475d(new C1476a() {
            /* renamed from: a */
            public final void mo4944a(C1477b bVar) {
                m4361c(bVar);
            }

            /* renamed from: b */
            public final void mo4946b(C1477b bVar) {
                m4361c(bVar);
            }

            /* renamed from: a */
            public final C1352v mo4941a(int i) {
                C1352v a = RecyclerView.this.mo4792a(i, true);
                if (a != null && !RecyclerView.this.f4696g.mo5839d(a.itemView)) {
                    return a;
                }
                return null;
            }

            /* renamed from: c */
            private void m4361c(C1477b bVar) {
                int i = bVar.f5322a;
                if (i != 4) {
                    if (i != 8) {
                        switch (i) {
                            case 1:
                                RecyclerView.this.f4703n.mo4680a(RecyclerView.this, bVar.f5323b, bVar.f5325d);
                                return;
                            case 2:
                                RecyclerView.this.f4703n.mo4687b(RecyclerView.this, bVar.f5323b, bVar.f5325d);
                                return;
                        }
                    } else {
                        RecyclerView.this.f4703n.mo4681a(RecyclerView.this, bVar.f5323b, bVar.f5325d, 1);
                    }
                    return;
                }
                RecyclerView.this.f4703n.mo4682a(RecyclerView.this, bVar.f5323b, bVar.f5325d, bVar.f5324c);
            }

            /* renamed from: b */
            public final void mo4945b(int i, int i2) {
                RecyclerView.this.mo4796a(i, i2, false);
                RecyclerView.this.f4647F = true;
            }

            /* renamed from: a */
            public final void mo4942a(int i, int i2) {
                RecyclerView.this.mo4796a(i, i2, true);
                RecyclerView.this.f4647F = true;
                RecyclerView.this.f4646E.f4794c += i2;
            }

            /* renamed from: d */
            public final void mo4948d(int i, int i2) {
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                RecyclerView recyclerView = RecyclerView.this;
                int b = recyclerView.f4696g.mo5833b();
                if (i < i2) {
                    i5 = i;
                    i4 = i2;
                    i3 = -1;
                } else {
                    i4 = i;
                    i5 = i2;
                    i3 = 1;
                }
                for (int i9 = 0; i9 < b; i9++) {
                    C1352v d = RecyclerView.m4272d(recyclerView.f4696g.mo5837c(i9));
                    if (d != null && d.mPosition >= i5 && d.mPosition <= i4) {
                        if (d.mPosition == i) {
                            d.offsetPosition(i2 - i, false);
                        } else {
                            d.offsetPosition(i3, false);
                        }
                        recyclerView.f4646E.f4797f = true;
                    }
                }
                C1343o oVar = recyclerView.f4694e;
                if (i < i2) {
                    i8 = i;
                    i7 = i2;
                    i6 = -1;
                } else {
                    i7 = i;
                    i8 = i2;
                    i6 = 1;
                }
                int size = oVar.f4769c.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1352v vVar = (C1352v) oVar.f4769c.get(i10);
                    if (vVar != null && vVar.mPosition >= i8 && vVar.mPosition <= i7) {
                        if (vVar.mPosition == i) {
                            vVar.offsetPosition(i2 - i, false);
                        } else {
                            vVar.offsetPosition(i6, false);
                        }
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.f4647F = true;
            }

            /* renamed from: c */
            public final void mo4947c(int i, int i2) {
                RecyclerView recyclerView = RecyclerView.this;
                int b = recyclerView.f4696g.mo5833b();
                for (int i3 = 0; i3 < b; i3++) {
                    C1352v d = RecyclerView.m4272d(recyclerView.f4696g.mo5837c(i3));
                    if (d != null && !d.shouldIgnore() && d.mPosition >= i) {
                        d.offsetPosition(i2, false);
                        recyclerView.f4646E.f4797f = true;
                    }
                }
                C1343o oVar = recyclerView.f4694e;
                int size = oVar.f4769c.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C1352v vVar = (C1352v) oVar.f4769c.get(i4);
                    if (vVar != null && vVar.mPosition >= i) {
                        vVar.offsetPosition(i2, true);
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.f4647F = true;
            }

            /* renamed from: a */
            public final void mo4943a(int i, int i2, Object obj) {
                RecyclerView recyclerView = RecyclerView.this;
                int b = recyclerView.f4696g.mo5833b();
                int i3 = i2 + i;
                for (int i4 = 0; i4 < b; i4++) {
                    View c = recyclerView.f4696g.mo5837c(i4);
                    C1352v d = RecyclerView.m4272d(c);
                    if (d != null && !d.shouldIgnore() && d.mPosition >= i && d.mPosition < i3) {
                        d.addFlags(2);
                        d.addChangePayload(obj);
                        ((LayoutParams) c.getLayoutParams()).f4723e = true;
                    }
                }
                C1343o oVar = recyclerView.f4694e;
                for (int size = oVar.f4769c.size() - 1; size >= 0; size--) {
                    C1352v vVar = (C1352v) oVar.f4769c.get(size);
                    if (vVar != null) {
                        int i5 = vVar.mPosition;
                        if (i5 >= i && i5 < i3) {
                            vVar.addFlags(2);
                            oVar.mo5101c(size);
                        }
                    }
                }
                RecyclerView.this.f4648G = true;
            }
        });
        this.f4696g = new C1501t(new C1503b() {
            /* renamed from: a */
            public final int mo4930a() {
                return RecyclerView.this.getChildCount();
            }

            /* renamed from: b */
            public final void mo4937b() {
                int a = mo4930a();
                for (int i = 0; i < a; i++) {
                    View b = mo4936b(i);
                    RecyclerView.this.mo4878j(b);
                    b.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            /* renamed from: b */
            public final C1352v mo4935b(View view) {
                return RecyclerView.m4272d(view);
            }

            /* renamed from: a */
            public final int mo4931a(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            /* renamed from: b */
            public final View mo4936b(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            /* renamed from: c */
            public final void mo4939c(View view) {
                C1352v d = RecyclerView.m4272d(view);
                if (d != null) {
                    d.onEnteredHiddenState(RecyclerView.this);
                }
            }

            /* renamed from: d */
            public final void mo4940d(View view) {
                C1352v d = RecyclerView.m4272d(view);
                if (d != null) {
                    d.onLeftHiddenState(RecyclerView.this);
                }
            }

            /* renamed from: a */
            public final void mo4932a(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.mo4878j(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            /* renamed from: c */
            public final void mo4938c(int i) {
                View b = mo4936b(i);
                if (b != null) {
                    C1352v d = RecyclerView.m4272d(b);
                    if (d != null) {
                        if (!d.isTmpDetached() || d.shouldIgnore()) {
                            d.addFlags(UnReadVideoExperiment.BROWSE_RECORD_LIST);
                        } else {
                            StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                            sb.append(d);
                            sb.append(RecyclerView.this.mo4794a());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                RecyclerView.this.detachViewFromParent(i);
            }

            /* renamed from: a */
            public final void mo4933a(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView recyclerView = RecyclerView.this;
                C1352v d = RecyclerView.m4272d(view);
                if (!(recyclerView.f4702m == null || d == null)) {
                    recyclerView.f4702m.onViewAttachedToWindow(d);
                }
                if (recyclerView.f4713x != null) {
                    for (int size = recyclerView.f4713x.size() - 1; size >= 0; size--) {
                        ((C1337j) recyclerView.f4713x.get(size)).mo5076a(view);
                    }
                }
            }

            /* renamed from: a */
            public final void mo4934a(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
                C1352v d = RecyclerView.m4272d(view);
                if (d != null) {
                    if (d.isTmpDetached() || d.shouldIgnore()) {
                        d.clearTmpDetachFlag();
                    } else {
                        StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                        sb.append(d);
                        sb.append(RecyclerView.this.mo4794a());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }
        });
        if (VERSION.SDK_INT >= 26) {
            i2 = getImportantForAutofill();
        } else {
            i2 = 0;
        }
        if (i2 == 0 && VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        if (C1056u.m3053e(this) == 0) {
            C1056u.m3043b((View) this, 1);
        }
        this.f4671ad = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1428an(this));
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, new int[]{16842948, 16842993, R.attr.ln, R.attr.lo, R.attr.lp, R.attr.lq, R.attr.lr, R.attr.q_, R.attr.yg, R.attr.a2m, R.attr.a2x}, i4, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f4708s = obtainStyledAttributes2.getBoolean(2, false);
            if (this.f4708s) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    StringBuilder sb = new StringBuilder("Trying to set fast scroller without both required drawables.");
                    sb.append(mo4794a());
                    throw new IllegalArgumentException(sb.toString());
                }
                Resources resources = getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hn);
                c2 = 3;
                Drawable drawable3 = drawable2;
                i3 = 4;
                int i5 = dimensionPixelSize;
                typedArray = obtainStyledAttributes2;
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hp);
                c = 2;
                C1400aa aaVar = new C1400aa(this, stateListDrawable, drawable, stateListDrawable2, drawable3, i5, dimensionPixelSize2, resources.getDimensionPixelOffset(R.dimen.ho));
            } else {
                typedArray = obtainStyledAttributes2;
                i3 = 4;
                c2 = 3;
                c = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(context.getPackageName());
                        sb2.append(trim);
                        trim = sb2.toString();
                    } else if (!trim.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(RecyclerView.class.getPackage().getName());
                        sb3.append('.');
                        sb3.append(trim);
                        trim = sb3.toString();
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class asSubclass = classLoader.loadClass(trim).asSubclass(C1332i.class);
                        try {
                            Constructor constructor2 = asSubclass.getConstructor(f4637R);
                            Object[] objArr2 = new Object[i3];
                            objArr2[0] = context2;
                            objArr2[1] = attributeSet2;
                            objArr2[c] = Integer.valueOf(i);
                            objArr2[c2] = Integer.valueOf(0);
                            objArr = objArr2;
                            constructor = constructor2;
                        } catch (NoSuchMethodException e) {
                            noSuchMethodException = e;
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((C1332i) constructor.newInstance(objArr));
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(noSuchMethodException);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(attributeSet.getPositionDescription());
                        sb4.append(": Error creating LayoutManager ");
                        sb4.append(trim);
                        throw new IllegalStateException(sb4.toString(), e2);
                    } catch (ClassNotFoundException e3) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(attributeSet.getPositionDescription());
                        sb5.append(": Unable to find LayoutManager ");
                        sb5.append(trim);
                        throw new IllegalStateException(sb5.toString(), e3);
                    } catch (InvocationTargetException e4) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(attributeSet.getPositionDescription());
                        sb6.append(": Could not instantiate the LayoutManager: ");
                        sb6.append(trim);
                        throw new IllegalStateException(sb6.toString(), e4);
                    } catch (InstantiationException e5) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(attributeSet.getPositionDescription());
                        sb7.append(": Could not instantiate the LayoutManager: ");
                        sb7.append(trim);
                        throw new IllegalStateException(sb7.toString(), e5);
                    } catch (IllegalAccessException e6) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(attributeSet.getPositionDescription());
                        sb8.append(": Cannot access non-public constructor ");
                        sb8.append(trim);
                        throw new IllegalStateException(sb8.toString(), e6);
                    } catch (ClassCastException e7) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(attributeSet.getPositionDescription());
                        sb9.append(": Class is not a LayoutManager ");
                        sb9.append(trim);
                        throw new IllegalStateException(sb9.toString(), e7);
                    }
                }
            }
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, f4633N, i4, 0);
                boolean z3 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z2 = z3;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo3229a(i, i2, iArr, iArr2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m4287v();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4255a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.m4283r()
            android.widget.EdgeEffect r3 = r6.f4675ah
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            android.support.p030v4.widget.C1109i.m3233a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.m4284s()
            android.widget.EdgeEffect r3 = r6.f4677aj
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            android.support.p030v4.widget.C1109i.m3233a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.m4285t()
            android.widget.EdgeEffect r9 = r6.f4676ai
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            android.support.p030v4.widget.C1109i.m3233a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.m4286u()
            android.widget.EdgeEffect r9 = r6.f4678ak
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            android.support.p030v4.widget.C1109i.m3233a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            android.support.p030v4.view.C1056u.m3052d(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.RecyclerView.m4255a(float, float, float, float):void");
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo3227a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0968g.m2814a("RV OnLayout");
        m4244C();
        C0968g.m2813a();
        this.f4709t = true;
    }

    /* renamed from: a */
    private void m4259a(C1352v vVar, C1352v vVar2, C1329b bVar, C1329b bVar2, boolean z, boolean z2) {
        vVar.setIsRecyclable(false);
        if (z) {
            m4273d(vVar);
        }
        if (vVar != vVar2) {
            if (z2) {
                m4273d(vVar2);
            }
            vVar.mShadowedHolder = vVar2;
            m4273d(vVar);
            this.f4694e.mo5098b(vVar);
            vVar2.setIsRecyclable(false);
            vVar2.mShadowingHolder = vVar;
        }
        if (this.f4642A.mo4995a(vVar, vVar2, bVar, bVar2)) {
            mo4877j();
        }
    }
}
