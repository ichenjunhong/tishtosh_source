package android.support.p043v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.p031a.p032a.C0575a;
import android.support.p030v4.view.C1019b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C1246h implements C0575a {

    /* renamed from: m */
    private static final int[] f4213m = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f4214A = false;

    /* renamed from: a */
    public final Context f4215a;

    /* renamed from: b */
    public final Resources f4216b;

    /* renamed from: c */
    public C1247a f4217c;

    /* renamed from: d */
    ArrayList<C1250j> f4218d;

    /* renamed from: e */
    public ArrayList<C1250j> f4219e;

    /* renamed from: f */
    public ContextMenuInfo f4220f;

    /* renamed from: g */
    public CharSequence f4221g;

    /* renamed from: h */
    public Drawable f4222h;

    /* renamed from: i */
    public View f4223i;

    /* renamed from: j */
    public boolean f4224j;

    /* renamed from: k */
    public C1250j f4225k;

    /* renamed from: l */
    public boolean f4226l;

    /* renamed from: n */
    private boolean f4227n;

    /* renamed from: o */
    private boolean f4228o;

    /* renamed from: p */
    private ArrayList<C1250j> f4229p;

    /* renamed from: q */
    private boolean f4230q;

    /* renamed from: r */
    private ArrayList<C1250j> f4231r;

    /* renamed from: s */
    private boolean f4232s;

    /* renamed from: t */
    private int f4233t;

    /* renamed from: u */
    private boolean f4234u;

    /* renamed from: v */
    private boolean f4235v;

    /* renamed from: w */
    private boolean f4236w;

    /* renamed from: x */
    private boolean f4237x;

    /* renamed from: y */
    private ArrayList<C1250j> f4238y = new ArrayList<>();

    /* renamed from: z */
    private CopyOnWriteArrayList<WeakReference<C1262o>> f4239z = new CopyOnWriteArrayList<>();

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C1247a {
        /* renamed from: a */
        void mo1289a(C1246h hVar);

        /* renamed from: a */
        boolean mo1290a(C1246h hVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C1248b {
        /* renamed from: a */
        boolean mo4012a(C1250j jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4105a() {
        return "android:menu:actionviewstates";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4129c() {
        return this.f4227n;
    }

    /* renamed from: d */
    public boolean mo4135d() {
        return this.f4228o;
    }

    /* renamed from: j */
    public C1246h mo4146j() {
        return this;
    }

    /* renamed from: a */
    public final void mo4110a(C1262o oVar) {
        mo4111a(oVar, this.f4215a);
    }

    /* renamed from: a */
    public final void mo4111a(C1262o oVar, Context context) {
        this.f4239z.add(new WeakReference(oVar));
        oVar.mo1082a(context, this);
        this.f4232s = true;
    }

    /* renamed from: a */
    public void mo4108a(C1247a aVar) {
        this.f4217c = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4112a(C1246h hVar, MenuItem menuItem) {
        return this.f4217c != null && this.f4217c.mo1290a(hVar, menuItem);
    }

    /* renamed from: a */
    public final boolean mo4113a(MenuItem menuItem, int i) {
        return mo4114a(menuItem, (C1262o) null, i);
    }

    /* renamed from: a */
    public final boolean mo4114a(MenuItem menuItem, C1262o oVar, int i) {
        C1250j jVar = (C1250j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean b = jVar.mo4165b();
        C1019b a = jVar.mo1778a();
        boolean z = a != null && a.mo3200e();
        if (jVar.mo4193j()) {
            b |= jVar.expandActionView();
            if (b) {
                mo4126b(true);
            }
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo4126b(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo4162a(new C1272u(this.f4215a, this, jVar));
            }
            C1272u uVar = (C1272u) jVar.getSubMenu();
            if (z) {
                a.mo3195a((SubMenu) uVar);
            }
            b |= m3831a(uVar, oVar);
            if (!b) {
                mo4126b(true);
            }
        } else if ((i & 1) == 0) {
            mo4126b(true);
        }
        return b;
    }

    /* renamed from: a */
    public void mo1150a(boolean z) {
        if (!this.f4234u) {
            if (z) {
                this.f4230q = true;
                this.f4232s = true;
            }
            if (!this.f4239z.isEmpty()) {
                mo4137e();
                Iterator it = this.f4239z.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C1262o oVar = (C1262o) weakReference.get();
                    if (oVar == null) {
                        this.f4239z.remove(weakReference);
                    } else {
                        oVar.mo1086a(z);
                    }
                }
                mo4138f();
            }
            return;
        }
        this.f4235v = true;
        if (z) {
            this.f4236w = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4109a(C1250j jVar) {
        this.f4230q = true;
        mo1150a(true);
    }

    public void close() {
        mo4126b(true);
    }

    /* renamed from: i */
    public final ArrayList<C1250j> mo4144i() {
        mo4142h();
        return this.f4231r;
    }

    public int size() {
        return this.f4218d.size();
    }

    /* renamed from: b */
    public boolean mo4127b() {
        return this.f4214A;
    }

    public void clearHeader() {
        this.f4222h = null;
        this.f4221g = null;
        this.f4223i = null;
        mo1150a(false);
    }

    /* renamed from: e */
    public final void mo4137e() {
        if (!this.f4234u) {
            this.f4234u = true;
            this.f4235v = false;
            this.f4236w = false;
        }
    }

    /* renamed from: f */
    public final void mo4138f() {
        this.f4234u = false;
        if (this.f4235v) {
            this.f4235v = false;
            mo1150a(this.f4236w);
        }
    }

    public void clear() {
        if (this.f4225k != null) {
            mo4136d(this.f4225k);
        }
        this.f4218d.clear();
        mo1150a(true);
    }

    /* renamed from: g */
    public final ArrayList<C1250j> mo4140g() {
        if (!this.f4230q) {
            return this.f4229p;
        }
        this.f4229p.clear();
        int size = this.f4218d.size();
        for (int i = 0; i < size; i++) {
            C1250j jVar = (C1250j) this.f4218d.get(i);
            if (jVar.isVisible()) {
                this.f4229p.add(jVar);
            }
        }
        this.f4230q = false;
        this.f4232s = true;
        return this.f4229p;
    }

    public boolean hasVisibleItems() {
        if (this.f4226l) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C1250j) this.f4218d.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo4142h() {
        ArrayList g = mo4140g();
        if (this.f4232s) {
            Iterator it = this.f4239z.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1262o oVar = (C1262o) weakReference.get();
                if (oVar == null) {
                    this.f4239z.remove(weakReference);
                } else {
                    z |= oVar.mo1087a();
                }
            }
            if (z) {
                this.f4219e.clear();
                this.f4231r.clear();
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    C1250j jVar = (C1250j) g.get(i);
                    if (jVar.mo4172f()) {
                        this.f4219e.add(jVar);
                    } else {
                        this.f4231r.add(jVar);
                    }
                }
            } else {
                this.f4219e.clear();
                this.f4231r.clear();
                this.f4231r.addAll(mo4140g());
            }
            this.f4232s = false;
        }
    }

    /* renamed from: a */
    public final C1246h mo4104a(int i) {
        this.f4233t = 1;
        return this;
    }

    /* renamed from: b */
    public final void mo4123b(Bundle bundle) {
        m3833f(bundle);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f4214A = z;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4124b(C1250j jVar) {
        this.f4232s = true;
        mo1150a(true);
    }

    public void setQwertyMode(boolean z) {
        this.f4227n = z;
        mo1150a(false);
    }

    /* renamed from: a */
    public final void mo4107a(Bundle bundle) {
        m3832e(bundle);
    }

    public MenuItem add(int i) {
        return mo1131a(0, 0, 0, this.f4216b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f4216b.getString(i));
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f4218d.get(i);
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1250j) this.f4218d.get(i2)).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        m3829a(i2, true);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1131a(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void mo4125b(C1262o oVar) {
        Iterator it = this.f4239z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1262o oVar2 = (C1262o) weakReference.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.f4239z.remove(weakReference);
            }
        }
    }

    /* renamed from: c */
    public boolean mo4130c(C1250j jVar) {
        boolean z = false;
        if (this.f4239z.isEmpty()) {
            return false;
        }
        mo4137e();
        Iterator it = this.f4239z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1262o oVar = (C1262o) weakReference.get();
            if (oVar != null) {
                z = oVar.mo1088a(this, jVar);
                if (z) {
                    break;
                }
            } else {
                this.f4239z.remove(weakReference);
            }
        }
        mo4138f();
        if (z) {
            this.f4225k = jVar;
        }
        return z;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1250j jVar = (C1250j) this.f4218d.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu()) {
                MenuItem findItem = jVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0073, code lost:
        if (r1 != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1246h(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f4238y = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r5.f4239z = r0
            r0 = 0
            r5.f4214A = r0
            r5.f4215a = r6
            android.content.res.Resources r6 = r6.getResources()
            r5.f4216b = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f4218d = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f4229p = r6
            r6 = 1
            r5.f4230q = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4219e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4231r = r1
            r5.f4232s = r6
            android.content.res.Resources r1 = r5.f4216b
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.keyboard
            if (r1 == r6) goto L_0x0076
            android.content.Context r1 = r5.f4215a
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            android.content.Context r2 = r5.f4215a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x005a
            boolean r1 = r1.shouldShowMenuShortcutsWhenKeyboardPresent()
            goto L_0x0073
        L_0x005a:
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r2 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r3 = "bool"
            java.lang.String r4 = "android"
            int r2 = r1.getIdentifier(r2, r3, r4)
            if (r2 == 0) goto L_0x0072
            boolean r1 = r1.getBoolean(r2)
            if (r1 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            if (r1 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            r5.f4228o = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.view.menu.C1246h.<init>(android.content.Context):void");
    }

    /* renamed from: e */
    private void m3832e(Bundle bundle) {
        if (!this.f4239z.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f4239z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1262o oVar = (C1262o) weakReference.get();
                if (oVar == null) {
                    this.f4239z.remove(weakReference);
                } else {
                    int b = oVar.mo1090b();
                    if (b > 0) {
                        Parcelable c = oVar.mo1092c();
                        if (c != null) {
                            sparseArray.put(b, c);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: f */
    private void m3833f(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f4239z.isEmpty()) {
            Iterator it = this.f4239z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1262o oVar = (C1262o) weakReference.get();
                if (oVar == null) {
                    this.f4239z.remove(weakReference);
                } else {
                    int b = oVar.mo1090b();
                    if (b > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(b);
                        if (parcelable != null) {
                            oVar.mo1083a(parcelable);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo4126b(boolean z) {
        if (!this.f4237x) {
            this.f4237x = true;
            Iterator it = this.f4239z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1262o oVar = (C1262o) weakReference.get();
                if (oVar == null) {
                    this.f4239z.remove(weakReference);
                } else {
                    oVar.mo1084a(this, z);
                }
            }
            this.f4237x = false;
        }
    }

    /* renamed from: c */
    public final void mo4128c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C1272u) item.getSubMenu()).mo4128c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo4105a(), sparseArray);
        }
    }

    /* renamed from: d */
    public final void mo4134d(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo4105a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C1272u) item.getSubMenu()).mo4134d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1250j) this.f4218d.get(i2)).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f4218d.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((C1250j) this.f4218d.get(i2)).getGroupId() != i) {
                    mo1150a(true);
                } else {
                    m3829a(i2, false);
                    i3 = i4;
                }
            }
            mo1150a(true);
        }
    }

    /* renamed from: d */
    public boolean mo4136d(C1250j jVar) {
        boolean z = false;
        if (this.f4239z.isEmpty() || this.f4225k != jVar) {
            return false;
        }
        mo4137e();
        Iterator it = this.f4239z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1262o oVar = (C1262o) weakReference.get();
            if (oVar != null) {
                z = oVar.mo1091b(this, jVar);
                if (z) {
                    break;
                }
            } else {
                this.f4239z.remove(weakReference);
            }
        }
        mo4138f();
        if (z) {
            this.f4225k = null;
        }
        return z;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (m3828a(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo4113a(findItem(i), i2);
    }

    /* renamed from: a */
    private static int m3827a(ArrayList<C1250j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C1250j) arrayList.get(size)).f4249a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f4218d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1250j jVar = (C1250j) this.f4218d.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    /* renamed from: a */
    private void m3829a(int i, boolean z) {
        if (i >= 0 && i < this.f4218d.size()) {
            this.f4218d.remove(i);
            if (z) {
                mo1150a(true);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f4218d.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1250j jVar = (C1250j) this.f4218d.get(i2);
            if (jVar.getGroupId() == i && jVar.mo4167c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1150a(true);
        }
    }

    /* renamed from: a */
    private C1250j m3828a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C1250j> arrayList = this.f4238y;
        arrayList.clear();
        m3830a((List<C1250j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1250j) arrayList.get(0);
        }
        boolean c2 = mo4129c();
        for (int i2 = 0; i2 < size; i2++) {
            C1250j jVar = (C1250j) arrayList.get(i2);
            if (c2) {
                c = jVar.getAlphabeticShortcut();
            } else {
                c = jVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (c2 && c == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m3831a(C1272u uVar, C1262o oVar) {
        boolean z = false;
        if (this.f4239z.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z = oVar.mo1089a(uVar);
        }
        Iterator it = this.f4239z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1262o oVar2 = (C1262o) weakReference.get();
            if (oVar2 == null) {
                this.f4239z.remove(weakReference);
            } else if (!z) {
                z = oVar2.mo1089a(uVar);
            }
        }
        return z;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C1250j a = m3828a(i, keyEvent);
        if (a != null) {
            z = mo4113a((MenuItem) a, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo4126b(true);
        }
        return z;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f4218d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1250j jVar = (C1250j) this.f4218d.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo4163a(z2);
                jVar.setCheckable(z);
            }
        }
    }

    /* renamed from: a */
    private void m3830a(List<C1250j> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean c2 = mo4129c();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f4218d.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1250j jVar = (C1250j) this.f4218d.get(i3);
                if (jVar.hasSubMenu()) {
                    ((C1246h) jVar.getSubMenu()).m3830a(list, i, keyEvent);
                }
                if (c2) {
                    c = jVar.getAlphabeticShortcut();
                } else {
                    c = jVar.getNumericShortcut();
                }
                if (c2) {
                    i2 = jVar.getAlphabeticModifiers();
                } else {
                    i2 = jVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (i2 & 69647)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (c2 && c == 8 && i == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1131a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1131a(i, i2, i3, this.f4216b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f4216b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1250j jVar = (C1250j) mo1131a(i, i2, i3, charSequence);
        C1272u uVar = new C1272u(this.f4215a, this, jVar);
        jVar.mo4162a(uVar);
        return uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1131a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = (-65536 & i3) >> 16;
        if (i4 < 0 || i4 >= f4213m.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (f4213m[i4] << 16) | (65535 & i3);
        C1250j jVar = new C1250j(this, i, i2, i3, i5, charSequence, this.f4233t);
        if (this.f4220f != null) {
            jVar.f4254f = this.f4220f;
        }
        this.f4218d.add(m3827a(this.f4218d, i5), jVar);
        mo1150a(true);
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4106a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f4216b;
        if (view != null) {
            this.f4223i = view;
            this.f4221g = null;
            this.f4222h = null;
        } else {
            if (i > 0) {
                this.f4221g = resources.getText(i);
            } else if (charSequence != null) {
                this.f4221g = charSequence;
            }
            if (i2 > 0) {
                this.f4222h = C0726c.m2091a(this.f4215a, i2);
            } else if (drawable != null) {
                this.f4222h = drawable;
            }
            this.f4223i = null;
        }
        mo1150a(false);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.f4215a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }
}
