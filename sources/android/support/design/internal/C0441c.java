package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1262o;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1272u;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: android.support.design.internal.c */
public final class C0441c implements C1262o {

    /* renamed from: a */
    public NavigationMenuView f1498a;

    /* renamed from: b */
    public LinearLayout f1499b;

    /* renamed from: c */
    C1246h f1500c;

    /* renamed from: d */
    public int f1501d;

    /* renamed from: e */
    public C0444b f1502e;

    /* renamed from: f */
    public LayoutInflater f1503f;

    /* renamed from: g */
    int f1504g;

    /* renamed from: h */
    boolean f1505h;

    /* renamed from: i */
    public ColorStateList f1506i;

    /* renamed from: j */
    public ColorStateList f1507j;

    /* renamed from: k */
    public Drawable f1508k;

    /* renamed from: l */
    public int f1509l;

    /* renamed from: m */
    public int f1510m;

    /* renamed from: n */
    public int f1511n;

    /* renamed from: o */
    int f1512o;

    /* renamed from: p */
    final OnClickListener f1513p = new OnClickListener() {
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            C0441c.this.mo1139b(true);
            C1250j itemData = navigationMenuItemView.getItemData();
            boolean a = C0441c.this.f1500c.mo4114a((MenuItem) itemData, (C1262o) C0441c.this, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                C0441c.this.f1502e.mo1143a(itemData);
            }
            C0441c.this.mo1139b(false);
            C0441c.this.mo1086a(false);
        }
    };

    /* renamed from: q */
    private C1263a f1514q;

    /* renamed from: android.support.design.internal.c$a */
    static class C0443a extends C0452j {
        public C0443a(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.c$b */
    public class C0444b extends C1322a<C0452j> {

        /* renamed from: a */
        final ArrayList<C0446d> f1516a = new ArrayList<>();

        /* renamed from: b */
        public C1250j f1517b;

        /* renamed from: c */
        public boolean f1518c;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemCount() {
            return this.f1516a.size();
        }

        /* renamed from: b */
        public final Bundle mo1144b() {
            View view;
            Bundle bundle = new Bundle();
            if (this.f1517b != null) {
                bundle.putInt("android:menu:checked", this.f1517b.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f1516a.size();
            for (int i = 0; i < size; i++) {
                C0446d dVar = (C0446d) this.f1516a.get(i);
                if (dVar instanceof C0448f) {
                    C1250j jVar = ((C0448f) dVar).f1522a;
                    if (jVar != null) {
                        view = jVar.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(jVar.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1142a() {
            boolean z;
            if (!this.f1518c) {
                this.f1518c = true;
                this.f1516a.clear();
                this.f1516a.add(new C0445c());
                int size = C0441c.this.f1500c.mo4140g().size();
                int i = -1;
                boolean z2 = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C1250j jVar = (C1250j) C0441c.this.f1500c.mo4140g().get(i3);
                    if (jVar.isChecked()) {
                        mo1143a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.mo4163a(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f1516a.add(new C0447e(C0441c.this.f1512o, 0));
                            }
                            this.f1516a.add(new C0448f(jVar));
                            int size2 = this.f1516a.size();
                            int size3 = subMenu.size();
                            boolean z3 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C1250j jVar2 = (C1250j) subMenu.getItem(i4);
                                if (jVar2.isVisible()) {
                                    if (!z3 && jVar2.getIcon() != null) {
                                        z3 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.mo4163a(false);
                                    }
                                    if (jVar.isChecked()) {
                                        mo1143a(jVar);
                                    }
                                    this.f1516a.add(new C0448f(jVar2));
                                }
                            }
                            if (z3) {
                                m1098a(size2, this.f1516a.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f1516a.size();
                            if (jVar.getIcon() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i3 != 0) {
                                i2++;
                                this.f1516a.add(new C0447e(C0441c.this.f1512o, C0441c.this.f1512o));
                            }
                            z2 = z;
                        } else if (!z2 && jVar.getIcon() != null) {
                            m1098a(i2, this.f1516a.size());
                            z2 = true;
                        }
                        C0448f fVar = new C0448f(jVar);
                        fVar.f1523b = z2;
                        this.f1516a.add(fVar);
                        i = groupId;
                    }
                }
                this.f1518c = false;
            }
        }

        public C0444b() {
            mo1142a();
        }

        public final /* synthetic */ void onViewRecycled(C1352v vVar) {
            C0452j jVar = (C0452j) vVar;
            if (jVar instanceof C0449g) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.itemView;
                if (navigationMenuItemView.f1485e != null) {
                    navigationMenuItemView.f1485e.removeAllViews();
                }
                navigationMenuItemView.f1484d.setCompoundDrawables(null, null, null, null);
            }
        }

        /* renamed from: a */
        public final void mo1143a(C1250j jVar) {
            if (this.f1517b != jVar && jVar.isCheckable()) {
                if (this.f1517b != null) {
                    this.f1517b.setChecked(false);
                }
                this.f1517b = jVar;
                jVar.setChecked(true);
            }
        }

        public final int getItemViewType(int i) {
            C0446d dVar = (C0446d) this.f1516a.get(i);
            if (dVar instanceof C0447e) {
                return 2;
            }
            if (dVar instanceof C0445c) {
                return 3;
            }
            if (!(dVar instanceof C0448f)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C0448f) dVar).f1522a.hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: a */
        private void m1098a(int i, int i2) {
            while (i < i2) {
                ((C0448f) this.f1516a.get(i)).f1523b = true;
                i++;
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C0449g(C0441c.this.f1503f, viewGroup, C0441c.this.f1513p);
                case 1:
                    return new C0451i(C0441c.this.f1503f, viewGroup);
                case 2:
                    return new C0450h(C0441c.this.f1503f, viewGroup);
                case 3:
                    return new C0443a(C0441c.this.f1499b);
                default:
                    return null;
            }
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            Drawable drawable;
            C0452j jVar = (C0452j) vVar;
            switch (getItemViewType(i)) {
                case 0:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.itemView;
                    navigationMenuItemView.setIconTintList(C0441c.this.f1507j);
                    if (C0441c.this.f1505h) {
                        navigationMenuItemView.setTextAppearance(C0441c.this.f1504g);
                    }
                    if (C0441c.this.f1506i != null) {
                        navigationMenuItemView.setTextColor(C0441c.this.f1506i);
                    }
                    if (C0441c.this.f1508k != null) {
                        drawable = C0441c.this.f1508k.getConstantState().newDrawable();
                    } else {
                        drawable = null;
                    }
                    C1056u.m3030a((View) navigationMenuItemView, drawable);
                    C0448f fVar = (C0448f) this.f1516a.get(i);
                    navigationMenuItemView.setNeedsEmptyIcon(fVar.f1523b);
                    navigationMenuItemView.setHorizontalPadding(C0441c.this.f1509l);
                    navigationMenuItemView.setIconPadding(C0441c.this.f1510m);
                    navigationMenuItemView.mo1036a(fVar.f1522a, 0);
                    return;
                case 1:
                    ((TextView) jVar.itemView).setText(((C0448f) this.f1516a.get(i)).f1522a.getTitle());
                    return;
                case 2:
                    C0447e eVar = (C0447e) this.f1516a.get(i);
                    jVar.itemView.setPadding(0, eVar.f1520a, 0, eVar.f1521b);
                    break;
            }
        }
    }

    /* renamed from: android.support.design.internal.c$c */
    static class C0445c implements C0446d {
        C0445c() {
        }
    }

    /* renamed from: android.support.design.internal.c$d */
    interface C0446d {
    }

    /* renamed from: android.support.design.internal.c$e */
    static class C0447e implements C0446d {

        /* renamed from: a */
        public final int f1520a;

        /* renamed from: b */
        public final int f1521b;

        public C0447e(int i, int i2) {
            this.f1520a = i;
            this.f1521b = i2;
        }
    }

    /* renamed from: android.support.design.internal.c$f */
    static class C0448f implements C0446d {

        /* renamed from: a */
        public final C1250j f1522a;

        /* renamed from: b */
        boolean f1523b;

        C0448f(C1250j jVar) {
            this.f1522a = jVar;
        }
    }

    /* renamed from: android.support.design.internal.c$g */
    static class C0449g extends C0452j {
        public C0449g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.j7, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: android.support.design.internal.c$h */
    static class C0450h extends C0452j {
        public C0450h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.j9, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$i */
    static class C0451i extends C0452j {
        public C0451i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.j_, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$j */
    static abstract class C0452j extends C1352v {
        public C0452j(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final boolean mo1087a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1088a(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1089a(C1272u uVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo1090b() {
        return this.f1501d;
    }

    /* renamed from: b */
    public final boolean mo1091b(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1092c() {
        Bundle bundle = new Bundle();
        if (this.f1498a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f1498a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f1502e != null) {
            bundle.putBundle("android:menu:adapter", this.f1502e.mo1144b());
        }
        if (this.f1499b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f1499b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo1085a(C1263a aVar) {
        this.f1514q = aVar;
    }

    /* renamed from: a */
    public final void mo1134a(ColorStateList colorStateList) {
        this.f1507j = colorStateList;
        mo1086a(false);
    }

    /* renamed from: b */
    public final void mo1137b(int i) {
        this.f1509l = i;
        mo1086a(false);
    }

    /* renamed from: c */
    public final void mo1140c(int i) {
        this.f1510m = i;
        mo1086a(false);
    }

    /* renamed from: a */
    public final void mo1133a(int i) {
        this.f1504g = i;
        this.f1505h = true;
        mo1086a(false);
    }

    /* renamed from: b */
    public final void mo1138b(ColorStateList colorStateList) {
        this.f1506i = colorStateList;
        mo1086a(false);
    }

    /* renamed from: b */
    public final void mo1139b(boolean z) {
        if (this.f1502e != null) {
            this.f1502e.f1518c = z;
        }
    }

    /* renamed from: a */
    public final void mo1135a(Drawable drawable) {
        this.f1508k = drawable;
        mo1086a(false);
    }

    /* renamed from: a */
    public final void mo1083a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f1498a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C0444b bVar = this.f1502e;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    bVar.f1518c = true;
                    int size = bVar.f1516a.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C0446d dVar = (C0446d) bVar.f1516a.get(i2);
                        if (dVar instanceof C0448f) {
                            C1250j jVar = ((C0448f) dVar).f1522a;
                            if (jVar != null && jVar.getItemId() == i) {
                                bVar.mo1143a(jVar);
                                break;
                            }
                        }
                        i2++;
                    }
                    bVar.f1518c = false;
                    bVar.mo1142a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = bVar.f1516a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C0446d dVar2 = (C0446d) bVar.f1516a.get(i3);
                        if (dVar2 instanceof C0448f) {
                            C1250j jVar2 = ((C0448f) dVar2).f1522a;
                            if (jVar2 != null) {
                                View actionView = jVar2.getActionView();
                                if (actionView != null) {
                                    ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(jVar2.getItemId());
                                    if (parcelableSparseArray != null) {
                                        actionView.restoreHierarchyState(parcelableSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f1499b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* renamed from: a */
    public final void mo1136a(C1250j jVar) {
        this.f1502e.mo1143a(jVar);
    }

    /* renamed from: a */
    public final void mo1086a(boolean z) {
        if (this.f1502e != null) {
            C0444b bVar = this.f1502e;
            bVar.mo1142a();
            bVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo1082a(Context context, C1246h hVar) {
        this.f1503f = LayoutInflater.from(context);
        this.f1500c = hVar;
        this.f1512o = context.getResources().getDimensionPixelOffset(R.dimen.gd);
    }

    /* renamed from: a */
    public final void mo1084a(C1246h hVar, boolean z) {
        if (this.f1514q != null) {
            this.f1514q.mo3715a(hVar, z);
        }
    }
}
