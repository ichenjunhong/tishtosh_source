package com.p683ss.android.ugc.aweme.arch;

import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.arch.a */
public final class C23266a<T> implements C0199s<C23274a> {

    /* renamed from: a */
    protected C23269c<T> f62214a;

    /* renamed from: b */
    protected DataCenter f62215b;

    /* renamed from: c */
    private C23267a<T> f62216c;

    /* renamed from: com.ss.android.ugc.aweme.arch.a$a */
    public interface C23267a<T> {
        /* renamed from: a */
        C23269c<T> mo48206a(View view);

        /* renamed from: a */
        void mo48207a();

        /* renamed from: c */
        String mo48208c();

        /* renamed from: d */
        String mo48209d();

        /* renamed from: e */
        String mo48210e();

        /* renamed from: f */
        DataCenter mo48211f();
    }

    /* renamed from: a */
    private static boolean m57214a(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 1) {
                return true;
            }
            return false;
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            return false;
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (this.f62214a != null && aVar != null && !TextUtils.isEmpty(aVar.f62242a)) {
            String str = aVar.f62242a;
            if (TextUtils.equals(str, this.f62216c.mo48209d())) {
                if (aVar.mo48246a() != Integer.valueOf(0)) {
                    this.f62214a.mo48216b();
                }
            } else if (TextUtils.equals(str, this.f62216c.mo48210e())) {
                if (aVar.mo48246a() != Integer.valueOf(0)) {
                }
            } else if (TextUtils.equals(str, this.f62216c.mo48208c())) {
                C23268b bVar = (C23268b) this.f62215b.mo48229a(this.f62216c.mo48208c());
                int intValue = ((Integer) bVar.mo48213a("action_type")).intValue();
                if (intValue == 1) {
                    this.f62214a.mo48215a((List) bVar.mo48213a("list_data"), m57214a(bVar.mo48213a("list_hasmore")));
                } else if (intValue == 2) {
                    this.f62214a.mo48217b((List) bVar.mo48213a("list_data"), m57214a(bVar.mo48213a("list_hasmore")));
                }
            }
        }
    }

    public C23266a(Fragment fragment, C23267a<T> aVar) {
        this.f62215b = aVar.mo48211f();
        this.f62216c = aVar;
    }

    /* renamed from: a */
    public final void mo48205a(View view, Bundle bundle) {
        if (this.f62215b == null) {
            this.f62215b = this.f62216c.mo48211f();
        }
        if (this.f62215b != null) {
            if (!TextUtils.isEmpty(this.f62216c.mo48208c())) {
                this.f62215b.mo48226a(this.f62216c.mo48208c(), (C0199s<C23274a>) this);
            }
            if (!TextUtils.isEmpty(this.f62216c.mo48209d())) {
                this.f62215b.mo48226a(this.f62216c.mo48209d(), (C0199s<C23274a>) this);
            }
            if (!TextUtils.isEmpty(this.f62216c.mo48210e())) {
                this.f62215b.mo48226a(this.f62216c.mo48210e(), (C0199s<C23274a>) this);
            }
        }
        this.f62214a = this.f62216c.mo48206a(view);
        this.f62216c.mo48207a();
    }
}
