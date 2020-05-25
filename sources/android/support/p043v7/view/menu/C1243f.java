package android.support.p043v7.view.menu;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p043v7.app.C1160b.C1161a;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public final class C1243f implements C1262o, OnItemClickListener {

    /* renamed from: a */
    Context f4195a;

    /* renamed from: b */
    LayoutInflater f4196b;

    /* renamed from: c */
    C1246h f4197c;

    /* renamed from: d */
    ExpandedMenuView f4198d;

    /* renamed from: e */
    public int f4199e;

    /* renamed from: f */
    int f4200f;

    /* renamed from: g */
    int f4201g;

    /* renamed from: h */
    C1244a f4202h;

    /* renamed from: i */
    public int f4203i;

    /* renamed from: j */
    private C1263a f4204j;

    /* renamed from: android.support.v7.view.menu.f$a */
    class C1244a extends BaseAdapter {

        /* renamed from: b */
        private int f4206b = -1;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final void notifyDataSetChanged() {
            m3823a();
            super.notifyDataSetChanged();
        }

        public final int getCount() {
            int size = C1243f.this.f4197c.mo4144i().size() - C1243f.this.f4199e;
            if (this.f4206b < 0) {
                return size;
            }
            return size - 1;
        }

        /* renamed from: a */
        private void m3823a() {
            C1250j jVar = C1243f.this.f4197c.f4225k;
            if (jVar != null) {
                ArrayList i = C1243f.this.f4197c.mo4144i();
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((C1250j) i.get(i2)) == jVar) {
                        this.f4206b = i2;
                        return;
                    }
                }
            }
            this.f4206b = -1;
        }

        public C1244a() {
            m3823a();
        }

        /* renamed from: a */
        public final C1250j getItem(int i) {
            ArrayList i2 = C1243f.this.f4197c.mo4144i();
            int i3 = i + C1243f.this.f4199e;
            if (this.f4206b >= 0 && i3 >= this.f4206b) {
                i3++;
            }
            return (C1250j) i2.get(i3);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C1243f.this.f4196b.inflate(C1243f.this.f4201g, viewGroup, false);
            }
            ((C1265a) view).mo1036a(getItem(i), 0);
            return view;
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

    /* renamed from: b */
    public final int mo1090b() {
        return this.f4203i;
    }

    /* renamed from: b */
    public final boolean mo1091b(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: d */
    public final ListAdapter mo4090d() {
        if (this.f4202h == null) {
            this.f4202h = new C1244a();
        }
        return this.f4202h;
    }

    /* renamed from: c */
    public final Parcelable mo1092c() {
        if (this.f4198d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        if (this.f4198d != null) {
            this.f4198d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* renamed from: a */
    public final void mo1085a(C1263a aVar) {
        this.f4204j = aVar;
    }

    /* renamed from: a */
    public final void mo1083a(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f4198d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public final C1264p mo4089a(ViewGroup viewGroup) {
        if (this.f4198d == null) {
            this.f4198d = (ExpandedMenuView) this.f4196b.inflate(R.layout.n, viewGroup, false);
            if (this.f4202h == null) {
                this.f4202h = new C1244a();
            }
            this.f4198d.setAdapter(this.f4202h);
            this.f4198d.setOnItemClickListener(this);
        }
        return this.f4198d;
    }

    /* renamed from: a */
    public final void mo1086a(boolean z) {
        if (this.f4202h != null) {
            this.f4202h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo1089a(C1272u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        C1249i iVar = new C1249i(uVar);
        C1246h hVar = iVar.f4240a;
        C1161a aVar = new C1161a(hVar.f4215a);
        iVar.f4242c = new C1243f(aVar.mo3757a(), (int) R.layout.q);
        iVar.f4242c.mo1085a((C1263a) iVar);
        iVar.f4240a.mo4110a((C1262o) iVar.f4242c);
        aVar.mo3763a(iVar.f4242c.mo4090d(), (OnClickListener) iVar);
        View view = hVar.f4223i;
        if (view != null) {
            aVar.f3808a.f3674g = view;
        } else {
            aVar.f3808a.f3671d = hVar.f4222h;
            aVar.mo3764a(hVar.f4221g);
        }
        aVar.f3808a.f3688u = iVar;
        iVar.f4241b = aVar.mo3772b();
        iVar.f4241b.setOnDismissListener(iVar);
        LayoutParams attributes = iVar.f4241b.getWindow().getAttributes();
        attributes.type = BaseNotice.COMMENT_REPLY_WITH_VIDEO;
        attributes.flags |= 131072;
        iVar.f4241b.show();
        if (this.f4204j != null) {
            this.f4204j.mo3716a(uVar);
        }
        return true;
    }

    private C1243f(int i, int i2) {
        this.f4201g = i;
        this.f4200f = 0;
    }

    public C1243f(Context context, int i) {
        this((int) R.layout.q, 0);
        this.f4195a = context;
        this.f4196b = LayoutInflater.from(this.f4195a);
    }

    /* renamed from: a */
    public final void mo1084a(C1246h hVar, boolean z) {
        if (this.f4204j != null) {
            this.f4204j.mo3715a(hVar, z);
        }
    }

    /* renamed from: a */
    public final void mo1082a(Context context, C1246h hVar) {
        if (this.f4200f != 0) {
            this.f4195a = new ContextThemeWrapper(context, this.f4200f);
            this.f4196b = LayoutInflater.from(this.f4195a);
        } else if (this.f4195a != null) {
            this.f4195a = context;
            if (this.f4196b == null) {
                this.f4196b = LayoutInflater.from(this.f4195a);
            }
        }
        this.f4197c = hVar;
        if (this.f4202h != null) {
            this.f4202h.notifyDataSetChanged();
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4197c.mo4114a((MenuItem) this.f4202h.getItem(i), (C1262o) this, 0);
    }
}
