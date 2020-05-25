package com.p683ss.android.ugc.aweme.p1445bp.p1455f;

import com.C2240a;
import com.bytedance.p829r.C12660a;
import com.p683ss.android.ugc.aweme.p1445bp.p1447b.C23882b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.f.a */
public abstract class C23910a implements C12660a {

    /* renamed from: a */
    public static final C23911a f63581a = new C23911a(null);

    /* renamed from: b */
    private AtomicBoolean f63582b = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.bp.f.a$a */
    public static final class C23911a {
        private C23911a() {
        }

        public /* synthetic */ C23911a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    public String mo49513e() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo49514f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C23882b mo49515g();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo49517i();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract long mo49519k();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo49516h() {
        this.f63582b.set(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo49518j() {
        this.f63582b.set(false);
    }

    /* renamed from: a */
    public final String mo23789a() {
        return mo49515g().toString();
    }

    /* renamed from: b */
    public final boolean mo23790b() {
        boolean z = false;
        if (this.f63582b.get()) {
            return false;
        }
        try {
            mo49516h();
            long currentTimeMillis = System.currentTimeMillis();
            mo49517i();
            C39629l.m88232a().mo58577h().mo49486a().mo49531b(mo49514f(), System.currentTimeMillis() - currentTimeMillis);
            z = true;
        } catch (Exception e) {
            C39629l.m88232a().mo58577h().mo49486a().mo49527a(mo49514f(), e);
        } catch (Throwable th) {
            mo49518j();
            throw th;
        }
        mo49518j();
        return z;
    }

    /* renamed from: d */
    public final long mo23792d() {
        long j;
        Exception e;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            j = mo49519k();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(mo49514f());
                sb.append(", size: ");
                String str = "%.1fMB";
                Object[] objArr = new Object[1];
                double d = (double) j;
                Double.isNaN(d);
                objArr[0] = Double.valueOf(d / 1048576.0d);
                C52711k.m112236a((Object) C2240a.m6772a(str, Arrays.copyOf(objArr, 1)), "java.lang.String.format(format, *args)");
                C39629l.m88232a().mo58577h().mo49486a().mo49526a(mo49514f(), System.currentTimeMillis() - currentTimeMillis);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            j = 0;
            e = e3;
            C39629l.m88232a().mo58577h().mo49486a().mo49527a(mo49514f(), e);
            return j;
        }
        return j;
    }
}
