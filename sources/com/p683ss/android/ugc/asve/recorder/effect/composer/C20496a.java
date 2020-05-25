package com.p683ss.android.ugc.asve.recorder.effect.composer;

import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a */
public final class C20496a implements C20501c {

    /* renamed from: c */
    public static final C20497a f56154c = new C20497a(null);

    /* renamed from: a */
    public final ArrayList<C20498b> f56155a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C20498b> f56156b = new ArrayList<>();

    /* renamed from: d */
    private final C20499b f56157d;

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a$a */
    public static final class C20497a {
        private C20497a() {
        }

        public /* synthetic */ C20497a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.a$b */
    public final class C20498b {

        /* renamed from: a */
        public int f56158a;

        /* renamed from: b */
        public int f56159b;

        /* renamed from: c */
        public String f56160c;

        /* renamed from: d */
        public String f56161d;

        /* renamed from: e */
        public float f56162e;

        /* renamed from: f */
        public String f56163f;

        public C20498b(int i) {
            this.f56158a = 1;
            this.f56159b = -1;
            this.f56160c = "";
            this.f56161d = "";
            this.f56163f = "";
            this.f56158a = 0;
        }

        public C20498b(C20496a aVar, int i, String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C20496a.this = aVar;
            this.f56158a = 1;
            this.f56159b = -1;
            this.f56160c = "";
            this.f56161d = "";
            this.f56163f = "";
            this.f56158a = 2;
            this.f56160c = str;
        }

        public C20498b(C20496a aVar, int i, int i2, String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C20496a.this = aVar;
            this.f56158a = 1;
            this.f56159b = -1;
            this.f56160c = "";
            this.f56161d = "";
            this.f56163f = "";
            this.f56158a = 3;
            this.f56160c = str;
            this.f56159b = i2;
        }

        public C20498b(C20496a aVar, String str, String str2, float f) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "featureTag");
            C20496a.this = aVar;
            this.f56158a = 1;
            this.f56159b = -1;
            this.f56160c = "";
            this.f56161d = "";
            this.f56163f = "";
            this.f56158a = 4;
            this.f56160c = str;
            this.f56161d = str2;
            this.f56162e = f;
        }

        public C20498b(C20496a aVar, int i, int i2, String str, String str2) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "extra");
            C20496a.this = aVar;
            this.f56158a = 1;
            this.f56159b = -1;
            this.f56160c = "";
            this.f56161d = "";
            this.f56163f = "";
            this.f56158a = 1;
            this.f56160c = str;
            this.f56159b = i2;
            this.f56163f = str2;
        }

        public C20498b(C20496a aVar, int i, String str, String str2, float f) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "featureTag");
            C20496a.this = aVar;
            this.f56158a = 1;
            this.f56159b = -1;
            this.f56160c = "";
            this.f56161d = "";
            this.f56163f = "";
            this.f56159b = i;
            this.f56158a = 4;
            this.f56160c = str;
            this.f56161d = str2;
            this.f56162e = f;
        }
    }

    /* renamed from: a */
    public final void mo43557a() {
        C20499b bVar = this.f56157d;
        if (bVar instanceof C20502d) {
            C20502d dVar = (C20502d) this.f56157d;
            C52711k.m112240b(this, "composerOperation");
            if (this.f56155a.size() > 0) {
                for (C20498b bVar2 : this.f56155a) {
                    switch (bVar2.f56158a) {
                        case 0:
                            dVar.f56167a.clear();
                            dVar.f56168b.mo40274a(new String[0], 0, new String[0]);
                            break;
                        case 1:
                            ArrayList arrayList = (ArrayList) dVar.f56167a.get(Integer.valueOf(bVar2.f56159b));
                            if (arrayList != null) {
                                ComposerInfo composerInfo = new ComposerInfo(bVar2.f56160c, bVar2.f56163f, null, 4, null);
                                arrayList.add(composerInfo);
                                break;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                ComposerInfo composerInfo2 = new ComposerInfo(bVar2.f56160c, bVar2.f56163f, null, 4, null);
                                arrayList2.add(composerInfo2);
                                dVar.f56167a.put(Integer.valueOf(bVar2.f56159b), arrayList2);
                                continue;
                            }
                        case 2:
                            dVar.mo43560a(bVar2);
                            continue;
                        case 3:
                            dVar.f56167a.remove(Integer.valueOf(bVar2.f56159b));
                            continue;
                    }
                }
                dVar.mo43559a();
            }
            for (C20498b bVar3 : this.f56156b) {
                if (bVar3.f56159b != -1) {
                    ArrayList<ComposerInfo> arrayList3 = (ArrayList) dVar.f56167a.get(Integer.valueOf(bVar3.f56159b));
                    if (arrayList3 != null) {
                        for (ComposerInfo composerInfo3 : arrayList3) {
                            CharSequence charSequence = composerInfo3.f56151a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar3.f56160c);
                            sb.append(";");
                            sb.append(bVar3.f56161d);
                            if (C52830p.m112456b(charSequence, (CharSequence) sb.toString(), false, 2, (Object) null)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(bVar3.f56160c);
                                sb2.append(";");
                                sb2.append(bVar3.f56161d);
                                sb2.append(";");
                                sb2.append(bVar3.f56162e);
                                composerInfo3.mo43542a(sb2.toString());
                            }
                        }
                    }
                }
                dVar.f56168b.mo40324b(bVar3.f56160c, bVar3.f56161d, bVar3.f56162e);
            }
        } else if (bVar instanceof C20503e) {
            ((C20503e) this.f56157d).mo43561a(this);
        } else {
            throw new Exception("should not go this case ");
        }
        this.f56155a.clear();
        this.f56156b.clear();
    }

    /* renamed from: b */
    public final C20501c mo43558b() {
        this.f56155a.add(new C20498b(0));
        return this;
    }

    public C20496a(C20499b bVar) {
        C52711k.m112240b(bVar, "composerService");
        this.f56157d = bVar;
    }

    /* renamed from: a */
    public final C20501c mo43550a(int i) {
        this.f56155a.add(new C20498b(this, 3, i, ""));
        return this;
    }

    /* renamed from: a */
    public final C20501c mo43552a(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        this.f56155a.add(new C20498b(this, 2, str));
        return this;
    }

    /* renamed from: a */
    public final C20501c mo43555a(List<String> list) {
        C52711k.m112240b(list, "paths");
        for (String a : list) {
            mo43552a(a);
        }
        return this;
    }

    /* renamed from: a */
    public final C20501c mo43556a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "paths");
        for (ComposerInfo composerInfo : list) {
            mo43554a(composerInfo.f56151a, composerInfo.f56152b, i);
        }
        return this;
    }

    /* renamed from: a */
    public final C20501c mo43553a(String str, String str2, float f) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "featureTag");
        this.f56156b.add(new C20498b(this, str, str2, f));
        return this;
    }

    /* renamed from: a */
    public final C20501c mo43554a(String str, String str2, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "extra");
        ArrayList<C20498b> arrayList = this.f56155a;
        C20498b bVar = new C20498b(this, 1, i, str, str2);
        arrayList.add(bVar);
        return this;
    }

    /* renamed from: a */
    public final C20501c mo43551a(int i, String str, String str2, float f) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "featureTag");
        ArrayList<C20498b> arrayList = this.f56156b;
        C20498b bVar = new C20498b(this, i, str, str2, f);
        arrayList.add(bVar);
        return this;
    }
}
