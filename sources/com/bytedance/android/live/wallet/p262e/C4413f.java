package com.bytedance.android.live.wallet.p262e;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.C4285a.C4286a;
import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.api.C4303i.C4304a;
import com.bytedance.android.live.wallet.api.C4303i.C4305b;
import com.bytedance.android.live.wallet.api.C4303i.C4306c;
import com.bytedance.android.live.wallet.api.C4303i.C4307d;
import com.bytedance.android.live.wallet.api.C4303i.C4308e;
import com.bytedance.android.live.wallet.api.C4303i.C4309f;
import com.bytedance.android.livesdkapi.host.C8801e;
import com.p683ss.caijing.globaliap.C51210a;
import com.p683ss.caijing.globaliap.C51210a.C51215a;
import com.p683ss.caijing.globaliap.C51210a.C51216b;
import com.p683ss.caijing.globaliap.C51222b;
import com.p683ss.caijing.globaliap.C51225c;
import com.p683ss.caijing.globaliap.C51227d;
import com.p683ss.caijing.globaliap.C51270e;
import com.p683ss.caijing.globaliap.p2558c.C51226a;
import com.p683ss.caijing.globaliap.p2559d.C51249e;
import com.p683ss.caijing.globaliap.p2559d.C51249e.C51256b;
import com.p683ss.caijing.globaliap.p2559d.C51249e.C51257c;
import com.p683ss.caijing.globaliap.p2559d.C51249e.C51261g;
import com.p683ss.caijing.globaliap.p2563f.C51284c;
import com.p683ss.caijing.globaliap.p2564g.C51285a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.wallet.e.f */
public final class C4413f implements C4303i {

    /* renamed from: com.bytedance.android.live.wallet.e.f$a */
    public static final class C4419a implements C4286a<C4303i> {

        /* renamed from: com.bytedance.android.live.wallet.e.f$a$a */
        static class C4420a {

            /* renamed from: a */
            public static final C4303i f12066a = new C4413f();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10041a() {
            return C4420a.f12066a;
        }
    }

    /* renamed from: b */
    public final void mo10082b() {
        C51226a.f127937a = null;
    }

    /* renamed from: c */
    public final void mo10084c() {
        C51285a.f128052a = null;
    }

    /* renamed from: a */
    public final void mo10074a() {
        C51284c.f128051a = new C51222b() {
            /* renamed from: a */
            public final void mo10221a(String str, Map<String, String> map) {
                ((C8801e) C4116c.m10249a(C8801e.class)).mo15567a(str, map);
            }
        };
    }

    public C4413f() {
        C4309f.f11800a = "pay_result_code";
        C4309f.f11801b = "pay_result_extra";
        C4309f.f11802c = "pay_result_detail_code";
        C4309f.f11803d = "pay_result_msg";
        C4308e.f11793a = 0;
        C4308e.f11794b = 0;
        C4308e.f11795c = 1;
        C4308e.f11796d = 2;
        C4308e.f11798f = 4;
        C4308e.f11799g = 5;
    }

    /* renamed from: a */
    public final void mo10076a(Context context) {
        C51270e.m110219a(context);
    }

    /* renamed from: a */
    public final void mo10080a(final C4305b bVar) {
        C51226a.f127937a = new C51225c() {
            /* renamed from: a */
            public final void mo10222a(String str, String str2) {
                bVar.mo10087a(str, str2);
            }
        };
    }

    /* renamed from: a */
    public final void mo10081a(final C4307d dVar) {
        C51285a.f128052a = new C51227d() {
            /* renamed from: a */
            public final void mo10223a(boolean z) {
                dVar.mo10088a(z);
            }
        };
    }

    /* renamed from: b */
    public final void mo10083b(Context context, String str) {
        C51270e.m110220a(context, str);
    }

    /* renamed from: a */
    public final void mo10077a(Context context, String str) {
        C51270e.m110224b(context, str);
    }

    /* renamed from: a */
    public final void mo10078a(Context context, ArrayList<String> arrayList, C4306c cVar) {
        C51210a aVar = new C51210a();
        aVar.f127900b = new C51215a(null) {
        };
        C51249e eVar = new C51249e(context.getApplicationContext());
        eVar.mo101781a(new C51256b(eVar, arrayList) {

            /* renamed from: a */
            final /* synthetic */ C51249e f127906a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f127907b;

            /* renamed from: b */
            public final void mo101739b() {
                this.f127906a.mo101780a();
            }

            /* renamed from: a */
            public final void mo101738a() {
                this.f127906a.mo101785a(this.f127907b, (C51257c) new C51257c() {
                    /* renamed from: a */
                    public final void mo101742a(Map<String, Integer> map) {
                        C512132.this.f127906a.mo101780a();
                    }
                });
            }

            {
                this.f127906a = r2;
                this.f127907b = r3;
            }
        });
    }

    /* renamed from: a */
    public final void mo10079a(Context context, List<String> list, String str, final C4304a aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        C51210a aVar2 = new C51210a();
        aVar2.f127899a = new C51216b() {
            /* renamed from: a */
            public final void mo10219a() {
                aVar.mo10085a();
            }

            /* renamed from: a */
            public final void mo10220a(Bundle bundle) {
                aVar.mo10086a(bundle);
            }
        };
        C51249e eVar = new C51249e(context.getApplicationContext());
        eVar.mo101781a(new C51256b(eVar, arrayList, str) {

            /* renamed from: a */
            final /* synthetic */ C51249e f127901a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f127902b;

            /* renamed from: c */
            final /* synthetic */ String f127903c;

            /* renamed from: a */
            public final void mo101738a() {
                this.f127901a.mo101786a(this.f127902b, this.f127903c, (C51261g) new C51261g() {
                    /* renamed from: a */
                    public final void mo101740a() {
                        if (C51210a.this.f127899a != null) {
                            C51210a.this.f127899a.mo10219a();
                            C51210a.this.f127899a = null;
                        }
                        C512111.this.f127901a.mo101780a();
                    }

                    /* renamed from: a */
                    public final void mo101741a(Bundle bundle) {
                        if (C51210a.this.f127899a != null) {
                            C51210a.this.f127899a.mo10220a(bundle);
                            C51210a.this.f127899a = null;
                        }
                        C512111.this.f127901a.mo101780a();
                    }
                });
            }

            /* renamed from: b */
            public final void mo101739b() {
                if (C51210a.this.f127899a != null) {
                    C51210a.this.f127899a.mo10219a();
                    C51210a.this.f127899a = null;
                }
                this.f127901a.mo101780a();
            }

            {
                this.f127901a = r2;
                this.f127902b = r3;
                this.f127903c = r4;
            }
        });
    }

    /* renamed from: a */
    public final void mo10075a(Activity activity, String str, Map<String, String> map, int i, Bundle bundle) {
        C51270e.m110222a(activity, str, map, 111, bundle);
    }
}
