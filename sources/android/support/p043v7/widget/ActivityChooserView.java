package android.support.p043v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1019b;
import android.support.p043v7.widget.C1469c.C1470a;
import android.support.p043v7.widget.C1469c.C1472c;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public final class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C1291a f4428a;

    /* renamed from: b */
    final FrameLayout f4429b;

    /* renamed from: c */
    final FrameLayout f4430c;

    /* renamed from: d */
    C1019b f4431d;

    /* renamed from: e */
    final DataSetObserver f4432e;

    /* renamed from: f */
    OnDismissListener f4433f;

    /* renamed from: g */
    boolean f4434g;

    /* renamed from: h */
    int f4435h;

    /* renamed from: i */
    private final C1292b f4436i;

    /* renamed from: j */
    private final View f4437j;

    /* renamed from: k */
    private final ImageView f4438k;

    /* renamed from: l */
    private final int f4439l;

    /* renamed from: m */
    private final OnGlobalLayoutListener f4440m;

    /* renamed from: n */
    private ListPopupWindow f4441n;

    /* renamed from: o */
    private boolean f4442o;

    /* renamed from: p */
    private int f4443p;

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f4444a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C1451bb a = C1451bb.m5031a(context, attributeSet, f4444a);
            setBackgroundDrawable(a.mo5652a(0));
            a.mo5653a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    class C1291a extends BaseAdapter {

        /* renamed from: a */
        public C1469c f4445a;

        /* renamed from: b */
        public boolean f4446b;

        /* renamed from: c */
        final /* synthetic */ ActivityChooserView f4447c;

        /* renamed from: d */
        private int f4448d;

        /* renamed from: e */
        private boolean f4449e;

        /* renamed from: f */
        private boolean f4450f;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getViewTypeCount() {
            return 3;
        }

        /* renamed from: b */
        public final int mo4473b() {
            return this.f4445a.mo5729a();
        }

        /* renamed from: a */
        public final int mo4469a() {
            int i = this.f4448d;
            this.f4448d = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f4448d = i;
            return i2;
        }

        public final int getCount() {
            int a = this.f4445a.mo5729a();
            if (!this.f4446b && this.f4445a.mo5734b() != null) {
                a--;
            }
            int min = Math.min(a, this.f4448d);
            if (this.f4450f) {
                return min + 1;
            }
            return min;
        }

        /* renamed from: a */
        public final void mo4470a(int i) {
            if (this.f4448d != i) {
                this.f4448d = i;
                notifyDataSetChanged();
            }
        }

        public final int getItemViewType(int i) {
            if (!this.f4450f || i != getCount() - 1) {
                return 0;
            }
            return 1;
        }

        /* renamed from: a */
        public final void mo4471a(boolean z) {
            if (this.f4450f != z) {
                this.f4450f = z;
                notifyDataSetChanged();
            }
        }

        public final Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f4446b && this.f4445a.mo5734b() != null) {
                        i++;
                    }
                    return this.f4445a.mo5731a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public final void mo4472a(boolean z, boolean z2) {
            if (this.f4446b != z || this.f4449e != z2) {
                this.f4446b = z;
                this.f4449e = z2;
                notifyDataSetChanged();
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != R.id.bbw) {
                        view = LayoutInflater.from(this.f4447c.getContext()).inflate(R.layout.h, viewGroup, false);
                    }
                    PackageManager packageManager = this.f4447c.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(R.id.aqa)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f4446b || i != 0 || !this.f4449e) {
                        view.setActivated(false);
                    } else {
                        view.setActivated(true);
                    }
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(this.f4447c.getContext()).inflate(R.layout.h, viewGroup, false);
                        view.setId(1);
                        ((TextView) view.findViewById(R.id.title)).setText(this.f4447c.getContext().getString(R.string.b0));
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    class C1292b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f4451a;

        public final void onDismiss() {
            if (this.f4451a.f4433f != null) {
                this.f4451a.f4433f.onDismiss();
            }
            if (this.f4451a.f4431d != null) {
                this.f4451a.f4431d.mo3196a(false);
            }
        }

        public final boolean onLongClick(View view) {
            if (view == this.f4451a.f4430c) {
                if (this.f4451a.f4428a.getCount() > 0) {
                    this.f4451a.f4434g = true;
                    this.f4451a.mo4454a(this.f4451a.f4435h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public final void onClick(View view) {
            if (view == this.f4451a.f4430c) {
                this.f4451a.mo4455a();
                Intent b = this.f4451a.f4428a.f4445a.mo5733b(this.f4451a.f4428a.f4445a.mo5730a(this.f4451a.f4428a.f4445a.mo5734b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f4451a.getContext().startActivity(b);
                }
            } else if (view == this.f4451a.f4429b) {
                this.f4451a.f4434g = false;
                this.f4451a.mo4454a(this.f4451a.f4435h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            float f;
            switch (((C1291a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f4451a.mo4455a();
                    if (this.f4451a.f4434g) {
                        if (i > 0) {
                            C1469c cVar = this.f4451a.f4428a.f4445a;
                            synchronized (cVar.f5295b) {
                                cVar.mo5735c();
                                C1470a aVar = (C1470a) cVar.f5296c.get(i);
                                C1470a aVar2 = (C1470a) cVar.f5296c.get(0);
                                if (aVar2 != null) {
                                    f = (aVar2.f5309b - aVar.f5309b) + 5.0f;
                                } else {
                                    f = 1.0f;
                                }
                                cVar.mo5732a(new C1472c(new ComponentName(aVar.f5308a.activityInfo.packageName, aVar.f5308a.activityInfo.name), System.currentTimeMillis(), f));
                            }
                        }
                        return;
                    }
                    if (!this.f4451a.f4428a.f4446b) {
                        i++;
                    }
                    Intent b = this.f4451a.f4428a.f4445a.mo5733b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        this.f4451a.getContext().startActivity(b);
                    }
                    return;
                case 1:
                    this.f4451a.mo4454a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public final C1469c getDataModel() {
        return this.f4428a.f4445a;
    }

    /* renamed from: b */
    private boolean m4055b() {
        return getListPopupWindow().mo4077e();
    }

    /* renamed from: a */
    public final boolean mo4455a() {
        if (m4055b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f4440m);
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1469c cVar = this.f4428a.f4445a;
        if (cVar != null) {
            cVar.registerObserver(this.f4432e);
        }
        this.f4442o = true;
    }

    /* access modifiers changed from: 0000 */
    public final ListPopupWindow getListPopupWindow() {
        if (this.f4441n == null) {
            this.f4441n = new ListPopupWindow(getContext());
            this.f4441n.mo4588a((ListAdapter) this.f4428a);
            this.f4441n.f4612o = this;
            this.f4441n.mo4772a(true);
            this.f4441n.f4614q = this.f4436i;
            this.f4441n.mo4771a((OnDismissListener) this.f4436i);
        }
        return this.f4441n;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1469c cVar = this.f4428a.f4445a;
        if (cVar != null) {
            cVar.unregisterObserver(this.f4432e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4440m);
        }
        if (m4055b()) {
            mo4455a();
        }
        this.f4442o = false;
    }

    public final void setDefaultActionButtonContentDescription(int i) {
        this.f4443p = i;
    }

    public final void setInitialActivityCount(int i) {
        this.f4435h = i;
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f4433f = onDismissListener;
    }

    public final void setProvider(C1019b bVar) {
        this.f4431d = bVar;
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f4438k.setImageDrawable(drawable);
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f4438k.setContentDescription(getContext().getString(i));
    }

    public final void setActivityChooserModel(C1469c cVar) {
        C1291a aVar = this.f4428a;
        C1469c cVar2 = aVar.f4447c.f4428a.f4445a;
        if (cVar2 != null && aVar.f4447c.isShown()) {
            cVar2.unregisterObserver(aVar.f4447c.f4432e);
        }
        aVar.f4445a = cVar;
        if (cVar != null && aVar.f4447c.isShown()) {
            cVar.registerObserver(aVar.f4447c.f4432e);
        }
        aVar.notifyDataSetChanged();
        if (m4055b()) {
            mo4455a();
            if (!m4055b() && this.f4442o) {
                this.f4434g = false;
                mo4454a(this.f4435h);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4454a(int i) {
        boolean z;
        if (this.f4428a.f4445a != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f4440m);
            if (this.f4430c.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int b = this.f4428a.mo4473b();
            if (i == Integer.MAX_VALUE || b <= i + (z ? 1 : 0)) {
                this.f4428a.mo4471a(false);
                this.f4428a.mo4470a(i);
            } else {
                this.f4428a.mo4471a(true);
                this.f4428a.mo4470a(i - 1);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo4077e()) {
                if (this.f4434g || !z) {
                    this.f4428a.mo4472a(true, z);
                } else {
                    this.f4428a.mo4472a(false, false);
                }
                listPopupWindow.mo4774b(Math.min(this.f4428a.mo4469a(), this.f4439l));
                listPopupWindow.mo4075d();
                if (this.f4431d != null) {
                    this.f4431d.mo3196a(true);
                }
                listPopupWindow.mo4078f().setContentDescription(getContext().getString(R.string.b1));
                listPopupWindow.mo4078f().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view = this.f4437j;
        if (this.f4430c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f4437j.layout(0, 0, i3 - i, i4 - i2);
        if (!m4055b()) {
            mo4455a();
        }
    }
}
