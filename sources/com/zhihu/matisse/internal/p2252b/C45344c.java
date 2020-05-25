package com.zhihu.matisse.internal.p2252b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.zhihu.matisse.C45333b;
import com.zhihu.matisse.R;
import com.zhihu.matisse.internal.entity.C45352b;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2253c.C45346b;
import com.zhihu.matisse.p2249a.C45332a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.internal.b.c */
public final class C45344c {

    /* renamed from: a */
    public Set<Item> f114639a;

    /* renamed from: b */
    public int f114640b;

    /* renamed from: c */
    private final Context f114641c;

    /* renamed from: b */
    public final List<Item> mo91645b() {
        return new ArrayList(this.f114639a);
    }

    /* renamed from: f */
    public final int mo91654f() {
        return this.f114639a.size();
    }

    /* renamed from: e */
    public final boolean mo91653e() {
        if (this.f114639a.size() == m98858g()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int m98858g() {
        C45353c a = C45353c.m98893a();
        if (a.f114670g > 0) {
            return a.f114670g;
        }
        if (this.f114640b == 1) {
            return a.f114671h;
        }
        if (this.f114640b == 2) {
            return a.f114672i;
        }
        return a.f114670g;
    }

    /* renamed from: a */
    public final Bundle mo91642a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList(this.f114639a));
        bundle.putInt("state_collection_type", this.f114640b);
        return bundle;
    }

    /* renamed from: c */
    public final List<Uri> mo91648c() {
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f114639a) {
            arrayList.add(item.f114655c);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List<String> mo91651d() {
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f114639a) {
            arrayList.add(C45346b.m98872a(this.f114641c, item.f114655c));
        }
        return arrayList;
    }

    public C45344c(Context context) {
        this.f114641c = context;
    }

    /* renamed from: c */
    public final boolean mo91649c(Item item) {
        return this.f114639a.contains(item);
    }

    /* renamed from: b */
    public final void mo91646b(Bundle bundle) {
        bundle.putParcelableArrayList("state_selection", new ArrayList(this.f114639a));
        bundle.putInt("state_collection_type", this.f114640b);
    }

    /* renamed from: e */
    public final int mo91652e(Item item) {
        int indexOf = new ArrayList(this.f114639a).indexOf(item);
        if (indexOf == -1) {
            return DynamicTabYellowPointVersion.DEFAULT;
        }
        return indexOf + 1;
    }

    /* renamed from: f */
    private boolean m98857f(Item item) {
        if (!C45353c.m98893a().f114665b || ((!item.mo91663a() || (this.f114640b != 2 && this.f114640b != 3)) && (!item.mo91665c() || (this.f114640b != 1 && this.f114640b != 3)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo91643a(Bundle bundle) {
        if (bundle == null) {
            this.f114639a = new LinkedHashSet();
            return;
        }
        this.f114639a = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
        this.f114640b = bundle.getInt("state_collection_type", 0);
    }

    /* renamed from: a */
    public final boolean mo91644a(Item item) {
        if (!m98857f(item)) {
            boolean add = this.f114639a.add(item);
            if (add) {
                if (this.f114640b == 0) {
                    if (item.mo91663a()) {
                        this.f114640b = 1;
                    } else if (item.mo91665c()) {
                        this.f114640b = 2;
                    }
                } else if (this.f114640b == 1) {
                    if (item.mo91665c()) {
                        this.f114640b = 3;
                    }
                } else if (this.f114640b == 2 && item.mo91663a()) {
                    this.f114640b = 3;
                }
            }
            return add;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    /* renamed from: b */
    public final boolean mo91647b(Item item) {
        boolean remove = this.f114639a.remove(item);
        if (remove) {
            boolean z = false;
            if (this.f114639a.size() == 0) {
                this.f114640b = 0;
            } else if (this.f114640b == 3) {
                boolean z2 = false;
                for (Item item2 : this.f114639a) {
                    if (item2.mo91663a() && !z) {
                        z = true;
                    }
                    if (item2.mo91665c() && !z2) {
                        z2 = true;
                    }
                }
                if (z && z2) {
                    this.f114640b = 3;
                } else if (z) {
                    this.f114640b = 1;
                } else if (z2) {
                    this.f114640b = 2;
                }
            }
        }
        return remove;
    }

    /* renamed from: d */
    public final C45352b mo91650d(Item item) {
        String str;
        boolean z = true;
        if (mo91653e()) {
            int g = m98858g();
            try {
                str = this.f114641c.getResources().getQuantityString(R.plurals.matisse_error_over_count, g, new Object[]{Integer.valueOf(g)});
            } catch (NotFoundException unused) {
                str = this.f114641c.getString(com.ss.android.ugc.trill.R.string.c4w, new Object[]{Integer.valueOf(g)});
            } catch (NoClassDefFoundError unused2) {
                str = this.f114641c.getString(com.ss.android.ugc.trill.R.string.c4w, new Object[]{Integer.valueOf(g)});
            }
            return new C45352b(str);
        } else if (m98857f(item)) {
            return new C45352b(this.f114641c.getString(com.ss.android.ugc.trill.R.string.c51));
        } else {
            Context context = this.f114641c;
            if (context != null) {
                ContentResolver contentResolver = context.getContentResolver();
                Iterator it = C45353c.m98893a().f114664a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C45333b) it.next()).checkType(contentResolver, item.f114655c)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                return new C45352b(context.getString(com.ss.android.ugc.trill.R.string.c4u));
            }
            if (C45353c.m98893a().f114673j != null) {
                for (C45332a a : C45353c.m98893a().f114673j) {
                    C45352b a2 = a.mo49933a(context, item);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            return null;
        }
    }
}
