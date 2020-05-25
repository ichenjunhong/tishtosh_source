package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48657k;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48658l;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48694b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48718a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.d */
public final class C48860d extends C48656j {

    /* renamed from: a */
    public Effect f122778a;

    /* renamed from: b */
    public C48718a f122779b;

    /* renamed from: f */
    private int f122780f;

    /* renamed from: g */
    private C48565a f122781g;

    /* renamed from: h */
    private List<String> f122782h;

    /* renamed from: i */
    private C48890g f122783i;

    /* renamed from: j */
    private DownloadEffectExtra f122784j;

    /* renamed from: k */
    private C48642c f122785k;

    /* renamed from: a */
    public final void mo96139a() {
        if (this.f122779b == null || !this.f122779b.mo96300a(this.f122778a.getEffectId())) {
            C48657k a = this.f122781g.f122047a.f122949B.mo59209a(new C48694b(this.f122778a, this.f122782h, this.f122783i.f122964j.getPath()));
            final C48749e a2 = new C48749e(this.f122778a, null).mo96323a(0).mo96324a(0);
            a.f122294d = new C48658l<C48749e>() {
                /* renamed from: b */
                public final void mo96250b(C48657k<C48749e> kVar) {
                }

                /* renamed from: a */
                public final void mo96246a(C48657k<C48749e> kVar) {
                    if (C48860d.this.f122779b != null) {
                        C48860d.this.f122779b.mo96301b(C48860d.this.f122778a);
                    }
                    C48860d.this.mo96238a(42, new C48749e(C48860d.this.f122778a, null));
                }

                /* renamed from: a */
                public final void mo96248a(C48657k<C48749e> kVar, C48649d dVar) {
                    C48860d.this.mo96330a(false, dVar);
                    if (C48860d.this.f122779b != null) {
                        C48860d.this.f122779b.mo96298a(C48860d.this.f122778a, dVar);
                    }
                    C48860d.this.mo96238a(15, new C48749e(C48860d.this.f122778a, dVar));
                }

                /* renamed from: a */
                public final /* synthetic */ void mo96249a(C48657k kVar, Object obj) {
                    C48749e eVar = (C48749e) obj;
                    C48860d.this.mo96330a(true, null);
                    if (C48860d.this.f122779b != null) {
                        C48860d.this.f122779b.mo96297a(C48860d.this.f122778a);
                    }
                    C48860d.this.mo96238a(15, new C48749e(eVar.f122430b, null));
                }

                /* renamed from: a */
                public final void mo96247a(C48657k<C48749e> kVar, int i, long j) {
                    C48860d.this.mo96238a(53, a2.mo96323a(i).mo96324a(j));
                }
            };
            a.mo96239a();
            return;
        }
        mo96238a(42, new C48749e(this.f122778a, null));
        this.f122783i.f122952E.mo96299a(this.f122778a.getEffectId(), (C48705j) new C48699d() {
            /* renamed from: a */
            public final void mo8643a(Effect effect) {
            }

            /* renamed from: a */
            public final void mo59191a(Effect effect, int i, long j) {
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                C48860d.this.mo96238a(15, new C48749e((Effect) obj, null));
            }

            /* renamed from: a */
            public final void mo8644a(Effect effect, C48649d dVar) {
                C48860d.this.mo96238a(15, new C48749e(C48860d.this.f122778a, dVar));
            }
        });
    }

    /* renamed from: a */
    public final void mo96330a(boolean z, C48649d dVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f122785k != null && this.f122784j != null) {
            if (TextUtils.equals("beautify", this.f122784j.getPanel()) || TextUtils.equals("beautifynew", this.f122784j.getPanel())) {
                boolean z2 = !z;
                StringBuilder sb = new StringBuilder();
                if (this.f122782h != null) {
                    for (String append : this.f122782h) {
                        sb.append(append);
                        sb.append(",");
                    }
                }
                C48642c cVar = this.f122785k;
                String str5 = "effect_resource_download_success_rate";
                C48670h a = C48670h.m105314a();
                String str6 = "effect_id";
                if (this.f122778a == null) {
                    str = "";
                } else {
                    str = this.f122778a.getEffectId();
                }
                C48670h a2 = a.mo96255a(str6, str);
                String str7 = "effect_name";
                if (this.f122778a == null) {
                    str2 = "";
                } else {
                    str2 = this.f122778a.getName();
                }
                C48670h a3 = a2.mo96255a(str7, str2).mo96255a("app_id", this.f122783i.f122966l).mo96255a("access_key", this.f122783i.f122956b).mo96255a("download_urls", sb.toString()).mo96255a("panel", this.f122784j.getPanel());
                String str8 = "error_code";
                if (dVar == null) {
                    str3 = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dVar.f122279a);
                    str3 = sb2.toString();
                }
                C48670h a4 = a3.mo96255a(str8, str3);
                String str9 = "error_msg";
                if (dVar == null) {
                    str4 = "";
                } else {
                    str4 = dVar.f122280b;
                }
                cVar.mo59187a(str5, z2 ? 1 : 0, a4.mo96255a(str9, str4).mo96256b());
            }
        }
    }

    public C48860d(Effect effect, C48565a aVar, String str, Handler handler) {
        this(effect, aVar, str, handler, null);
    }

    public C48860d(Effect effect, C48565a aVar, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str);
        this.f122778a = effect;
        this.f122781g = aVar;
        this.f122783i = aVar.f122047a;
        this.f122780f = aVar.f122047a.f122973s;
        this.f122782h = C48669g.m105313b(this.f122778a.getFileUrl());
        this.f122784j = downloadEffectExtra;
        this.f122785k = this.f122783i.f122978x;
        this.f122779b = this.f122783i.f122952E;
    }
}
