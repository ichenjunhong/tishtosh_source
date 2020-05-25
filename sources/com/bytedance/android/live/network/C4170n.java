package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.android.livesdkapi.p455i.C8817g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12683a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.retrofit2.p830a.C12689e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.network.n */
final /* synthetic */ class C4170n implements C12683a {

    /* renamed from: a */
    private final IHostNetwork f11362a;

    C4170n(IHostNetwork iHostNetwork) {
        this.f11362a = iHostNetwork;
    }

    /* renamed from: a */
    public final C12689e mo9561a(C12686c cVar) {
        return new C12689e(cVar, this.f11362a) {

            /* renamed from: a */
            final /* synthetic */ C12686c f11357a;

            /* renamed from: b */
            final /* synthetic */ IHostNetwork f11358b;

            /* renamed from: c */
            private C8817g f11359c;

            /* renamed from: b */
            public final void mo9560b() {
                if (this.f11359c != null) {
                    try {
                        this.f11359c.mo15806b();
                    } catch (IOException unused) {
                    }
                }
            }

            /* renamed from: a */
            public final C12688d mo9559a() throws IOException {
                TypedInput typedByteArray;
                String str = this.f11357a.f33320a;
                if ("GET".equals(str) || "POST".equals(str)) {
                    ArrayList arrayList = new ArrayList();
                    List<C12685b> list = this.f11357a.f33322c;
                    if (list != null) {
                        for (C12685b bVar : list) {
                            if (((Boolean) C4163i.f11353a.mo9431a()).booleanValue() || !TextUtils.equals(bVar.f33318a, "response-format")) {
                                arrayList.add(new C2977g(bVar.f33318a, bVar.f33319b));
                            }
                        }
                    }
                    if (C4166l.f11356a.contains(this.f11357a.mo23860c()) && ((Boolean) C4163i.f11353a.mo9431a()).booleanValue()) {
                        arrayList.add(new C2977g("response-format", "protobuf"));
                    }
                    if (TextUtils.equals("GET", str)) {
                        this.f11359c = this.f11358b.get(this.f11357a.f33321b, arrayList);
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (this.f11357a.mo23857a() != null) {
                            this.f11357a.mo23857a().writeTo(byteArrayOutputStream);
                        }
                        if (this.f11357a.mo23857a() instanceof MultipartTypedOutput) {
                            this.f11359c = this.f11358b.uploadFile(this.f11357a.f33327h, this.f11357a.f33321b, arrayList, this.f11357a.mo23857a().mimeType(), byteArrayOutputStream.toByteArray(), this.f11357a.mo23857a().length(), this.f11357a.mo23857a().md5Stub());
                        } else {
                            this.f11359c = this.f11358b.post(this.f11357a.f33321b, arrayList, this.f11357a.mo23857a().mimeType(), byteArrayOutputStream.toByteArray());
                        }
                    }
                    final C8815e eVar = (C8815e) this.f11359c.mo15805a();
                    ArrayList arrayList2 = new ArrayList();
                    if (eVar.f24064c != null) {
                        for (C2977g gVar : eVar.f24064c) {
                            arrayList2.add(new C12685b(gVar.getName(), gVar.getValue()));
                        }
                    }
                    if (this.f11357a.f33326g) {
                        typedByteArray = new TypedInput() {
                            public final long length() throws IOException {
                                return (long) eVar.f24066e.length;
                            }

                            public final String mimeType() {
                                return eVar.f24065d;
                            }

                            /* renamed from: in */
                            public final InputStream mo9554in() throws IOException {
                                return new ByteArrayInputStream(eVar.f24066e);
                            }
                        };
                    } else {
                        typedByteArray = new TypedByteArray(eVar.f24065d, eVar.f24066e, new String[0]);
                    }
                    C12688d dVar = new C12688d(eVar.f24062a, eVar.f24063b, eVar.f24067f, arrayList2, typedByteArray);
                    return dVar;
                }
                C3831a.m9716d("RetrofitProvider", "REQUEST NOT GET OR POST");
                return null;
            }

            {
                this.f11357a = r1;
                this.f11358b = r2;
            }
        };
    }
}
