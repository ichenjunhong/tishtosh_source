package android.support.p043v7.view.menu;

import android.content.Context;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C1234b implements C1262o {

    /* renamed from: a */
    protected Context f4144a;

    /* renamed from: b */
    protected Context f4145b;

    /* renamed from: c */
    public C1246h f4146c;

    /* renamed from: d */
    protected LayoutInflater f4147d;

    /* renamed from: e */
    protected LayoutInflater f4148e;

    /* renamed from: f */
    public C1263a f4149f;

    /* renamed from: g */
    public C1264p f4150g;

    /* renamed from: h */
    public int f4151h;

    /* renamed from: i */
    private int f4152i = R.layout.d;

    /* renamed from: j */
    private int f4153j = R.layout.c;

    /* renamed from: a */
    public abstract void mo4062a(C1250j jVar, C1265a aVar);

    /* renamed from: a */
    public boolean mo1087a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo4063a(int i, C1250j jVar) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo1088a(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* renamed from: b */
    public final int mo1090b() {
        return this.f4151h;
    }

    /* renamed from: b */
    public final boolean mo1091b(C1246h hVar, C1250j jVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4064a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo1089a(C1272u uVar) {
        if (this.f4149f != null) {
            return this.f4149f.mo3716a(uVar);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1085a(C1263a aVar) {
        this.f4149f = aVar;
    }

    /* renamed from: a */
    public C1264p mo4060a(ViewGroup viewGroup) {
        if (this.f4150g == null) {
            this.f4150g = (C1264p) this.f4147d.inflate(this.f4152i, viewGroup, false);
            this.f4150g.mo1058a(this.f4146c);
            mo1086a(true);
        }
        return this.f4150g;
    }

    /* renamed from: a */
    public void mo1086a(boolean z) {
        C1250j jVar;
        ViewGroup viewGroup = (ViewGroup) this.f4150g;
        if (viewGroup != null) {
            int i = 0;
            if (this.f4146c != null) {
                this.f4146c.mo4142h();
                ArrayList g = this.f4146c.mo4140g();
                int size = g.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C1250j jVar2 = (C1250j) g.get(i3);
                    if (mo4063a(i2, jVar2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C1265a) {
                            jVar = ((C1265a) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View a = mo4061a(jVar2, childAt, viewGroup);
                        if (jVar2 != jVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f4150g).addView(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo4064a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1082a(Context context, C1246h hVar) {
        this.f4145b = context;
        this.f4148e = LayoutInflater.from(this.f4145b);
        this.f4146c = hVar;
    }

    /* renamed from: a */
    public void mo1084a(C1246h hVar, boolean z) {
        if (this.f4149f != null) {
            this.f4149f.mo3715a(hVar, z);
        }
    }

    public C1234b(Context context, int i, int i2) {
        this.f4144a = context;
        this.f4147d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public View mo4061a(C1250j jVar, View view, ViewGroup viewGroup) {
        C1265a aVar;
        if (view instanceof C1265a) {
            aVar = (C1265a) view;
        } else {
            aVar = (C1265a) this.f4147d.inflate(this.f4153j, viewGroup, false);
        }
        mo4062a(jVar, aVar);
        return (View) aVar;
    }
}
