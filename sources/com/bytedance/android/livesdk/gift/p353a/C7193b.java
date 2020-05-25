package com.bytedance.android.livesdk.gift.p353a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.livesdkapi.p455i.C8817g;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12688d;
import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1216f.C19926e;
import com.p683ss.android.socialbase.downloader.p1216f.C19927f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.a.b */
public final class C7193b implements C19927f {

    /* renamed from: a */
    C8817g<C8815e> f19552a;

    /* renamed from: b */
    C8815e f19553b;

    /* renamed from: a */
    public final C19926e mo13390a(int i, String str, List<HttpHeader> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (HttpHeader httpHeader : list) {
                arrayList.add(new C2977g(httpHeader.f55085a, httpHeader.f55086b));
            }
        }
        arrayList.add(new C2977g("Accept-Encoding", "identity"));
        this.f19552a = ((INetworkService) C4116c.m10249a(INetworkService.class)).downloadFile(false, i, str, arrayList, null);
        this.f19553b = (C8815e) this.f19552a.mo15805a();
        if (this.f19553b == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f19553b.f24064c != null) {
            for (C2977g gVar : this.f19553b.f24064c) {
                arrayList2.add(new C12685b(gVar.getName(), gVar.getValue()));
            }
        }
        final C12688d dVar = new C12688d(str, this.f19553b.f24063b, this.f19553b.f24067f, arrayList2, new TypedInput() {
            public final String mimeType() {
                return C7193b.this.f19553b.f24065d;
            }

            /* renamed from: in */
            public final InputStream mo9554in() throws IOException {
                return new ByteArrayInputStream(C7193b.this.f19553b.f24066e);
            }

            public final long length() throws IOException {
                return (long) C7193b.this.f19553b.f24066e.length;
            }
        });
        final InputStream in = new TypedInput() {
            public final String mimeType() {
                return C7193b.this.f19553b.f24065d;
            }

            /* renamed from: in */
            public final InputStream mo9554in() throws IOException {
                return new ByteArrayInputStream(C7193b.this.f19553b.f24066e);
            }

            public final long length() throws IOException {
                return (long) C7193b.this.f19553b.f24066e.length;
            }
        }.mo9554in();
        return new C19926e() {
            /* renamed from: a */
            public final InputStream mo13391a() throws IOException {
                return in;
            }

            /* renamed from: d */
            public final void mo13395d() {
            }

            /* renamed from: b */
            public final int mo13393b() throws IOException {
                return dVar.f33347b;
            }

            /* renamed from: c */
            public final void mo13394c() {
                if (C7193b.this.f19552a != null) {
                    try {
                        C7193b.this.f19552a.mo15806b();
                    } catch (IOException unused) {
                    }
                }
            }

            /* renamed from: a */
            public final String mo13392a(String str) {
                List<C12685b> list = dVar.f33349d;
                if (list != null && !TextUtils.isEmpty(str)) {
                    for (C12685b bVar : list) {
                        if (str.equalsIgnoreCase(bVar.f33318a)) {
                            return bVar.f33319b;
                        }
                    }
                }
                return null;
            }
        };
    }
}
