package com.bytedance.android.p140a.p141a;

import android.content.Context;
import com.bytedance.android.p140a.p141a.p142a.C2771a;
import com.bytedance.android.p140a.p141a.p148g.C2792a;
import com.bytedance.android.p140a.p141a.p149h.C2796a;
import com.bytedance.android.p140a.p141a.p149h.C2797b;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.a.a.d */
public abstract class C2782d implements C2797b {

    /* renamed from: com.bytedance.android.a.a.d$a */
    public static class C2784a {

        /* renamed from: a */
        public C2792a f8347a;

        /* renamed from: b */
        public C2771a f8348b;

        /* renamed from: c */
        public Map<String, C2796a> f8349c;

        /* renamed from: d */
        public C2789f f8350d;

        /* renamed from: e */
        private Context f8351e;

        /* renamed from: f */
        private ExecutorService f8352f;

        /* renamed from: a */
        public final void mo7387a() {
            if (!C2782d.m7909a().mo7385b()) {
                C2782d.m7909a().mo7379a(this.f8351e, this.f8347a);
                C2782d.m7909a().mo7380a(this.f8348b);
                C2782d.m7909a().mo7381a(this.f8350d);
                C2782d.m7909a().mo7384a(this.f8352f);
                for (Entry value : this.f8349c.entrySet()) {
                    C2782d.m7909a().mo7383a((C2796a) value.getValue());
                }
                C2782d.m7909a().mo7386c();
            }
        }

        private C2784a(Context context) {
            this.f8351e = context;
        }
    }

    /* renamed from: a */
    public abstract void mo7379a(Context context, C2792a aVar);

    /* renamed from: a */
    public abstract void mo7380a(C2771a aVar);

    /* renamed from: a */
    public abstract void mo7381a(C2789f fVar);

    /* renamed from: a */
    public abstract void mo7382a(C2792a aVar);

    /* renamed from: a */
    public abstract void mo7383a(C2796a aVar);

    /* renamed from: a */
    public abstract void mo7384a(ExecutorService executorService);

    /* renamed from: b */
    public abstract boolean mo7385b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo7386c();

    /* renamed from: a */
    public static C2782d m7909a() {
        return C2786e.m7920d();
    }
}
