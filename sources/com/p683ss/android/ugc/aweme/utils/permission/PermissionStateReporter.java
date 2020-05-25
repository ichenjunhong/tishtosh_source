package com.p683ss.android.ugc.aweme.utils.permission;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.app.C23098h;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter */
public class PermissionStateReporter implements C27979p {

    /* renamed from: b */
    private static volatile PermissionStateReporter f120532b;

    /* renamed from: a */
    ReportPermissionApi f120533a;

    /* renamed from: c */
    private boolean f120534c = true;

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter$ReportPermissionApi */
    public interface ReportPermissionApi {
        @C53084o(mo110612a = "/aweme/v1/app/data/access/")
        @C53074e
        C0013i<BaseResponse> report(@C53072c(mo110600a = "address_book_access") Integer num, @C53072c(mo110600a = "user_address_book_access") Integer num2, @C53072c(mo110600a = "gps_access") Integer num3);

        @C53084o(mo110612a = "/aweme/v1/app/data/access/")
        @C53074e
        C0013i<BaseResponse> report(@C53072c(mo110600a = "address_book_access") Integer num, @C53072c(mo110600a = "user_address_book_access") Integer num2, @C53072c(mo110600a = "gps_access") Integer num3, @C53072c(mo110600a = "upload_type") int i, @C53072c(mo110600a = "impression_ids") String str);
    }

    /* renamed from: b */
    public final void mo47072b() {
    }

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: e */
    public final void mo95108e() {
        m103714f();
    }

    private PermissionStateReporter() {
    }

    /* renamed from: a */
    public final void mo47070a() {
        if (!C23098h.f61512f.mo47841a()) {
            m103714f();
        }
    }

    /* renamed from: d */
    public static PermissionStateReporter m103713d() {
        if (f120532b == null) {
            synchronized (PermissionStateReporter.class) {
                if (f120532b == null) {
                    f120532b = new PermissionStateReporter();
                }
            }
        }
        return f120532b;
    }

    /* renamed from: f */
    private void m103714f() {
        if (this.f120534c) {
            this.f120534c = false;
            return;
        }
        if (this.f120533a == null) {
            this.f120533a = (ReportPermissionApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(ReportPermissionApi.class);
        }
        C0013i.m16a((Callable<TResult>) new C47944c<TResult>(this));
    }
}
