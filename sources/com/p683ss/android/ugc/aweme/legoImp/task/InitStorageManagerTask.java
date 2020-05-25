package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.p829r.C12662c;
import com.bytedance.p829r.C12664d;
import com.bytedance.p829r.C12666f;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask */
public final class InitStorageManagerTask implements LegoTask {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InitStorageManagerTask.class), "storageParams", "getStorageParams()Lcom/bytedance/storage/StorageParams;"))};
    public static final C35943a Companion = new C35943a(null);
    private final C52668f storageParams$delegate = C52732g.m112285a(new C35945c(this));
    public final String tag = "InitStorageManagerTask";

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$a */
    static final class C35943a {
        private C35943a() {
        }

        public /* synthetic */ C35943a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$b */
    static final class C35944b<T> implements C12666f<C12664d> {

        /* renamed from: a */
        final /* synthetic */ InitStorageManagerTask f92173a;

        C35944b(InitStorageManagerTask initStorageManagerTask) {
            this.f92173a = initStorageManagerTask;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23795a() {
            return this.f92173a.getStorageParams();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$c */
    static final class C35945c extends C52712l implements C52670a<C12664d> {

        /* renamed from: a */
        final /* synthetic */ InitStorageManagerTask f92174a;

        C35945c(InitStorageManagerTask initStorageManagerTask) {
            this.f92174a = initStorageManagerTask;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m81126a();
        }

        /* renamed from: a */
        private static C12664d m81126a() {
            if (VERSION.SDK_INT <= 22) {
                try {
                    C12664d dVar = new C12664d();
                    dVar.f33266a = 52428800;
                    dVar.f33267b = 52428800;
                    dVar.f33268c = 52428800;
                    return dVar;
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }

    public final C12664d getStorageParams() {
        return (C12664d) this.storageParams$delegate.getValue();
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.MAIN;
    }

    public final void run(Context context) {
        C12662c.m25454a((C12666f<C12664d>) new C35944b<C12664d>(this));
    }
}
