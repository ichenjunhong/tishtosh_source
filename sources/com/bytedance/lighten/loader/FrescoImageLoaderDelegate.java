package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.net.Uri;
import com.bytedance.lighten.p766a.C12155a;
import com.bytedance.lighten.p766a.C12165c;
import com.bytedance.lighten.p766a.C12194h;
import com.bytedance.lighten.p766a.C12195i;
import com.bytedance.lighten.p766a.C12201o;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12204r;
import com.bytedance.lighten.p766a.C12207s;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p767a.C12156a;
import com.bytedance.lighten.p766a.p769c.C12170e;
import com.facebook.common.p917a.C13658b;
import com.facebook.common.p917a.C13659c;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13705d;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p947a.C13858b;
import com.facebook.fresco.animation.p948b.C13863a;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.fresco.animation.p954d.C13884a;
import com.facebook.fresco.animation.p954d.C13885b;
import com.facebook.imagepipeline.memory.C14064ab;
import com.facebook.imagepipeline.memory.C14064ab.C14066a;
import com.facebook.imagepipeline.memory.C14067ac;
import com.facebook.imagepipeline.p956a.p958b.C13916b;
import com.facebook.imagepipeline.p964d.C13987q;
import com.facebook.imagepipeline.p965e.C14008i;
import com.facebook.imagepipeline.p965e.C14008i.C14010a;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p974n.C14123ai;
import com.facebook.imageutils.C14252b;
import com.facebook.imageutils.C14252b.C14253a;
import com.facebook.p914c.p916b.C13636c;
import com.facebook.p914c.p916b.C13636c.C13638a;
import com.p992g.p993a.C14709b;
import com.p992g.p993a.C14711d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FrescoImageLoaderDelegate implements C12201o {
    private C12165c mFrescoCache;
    private C12195i mImpl;

    public C12165c getCache() {
        return this.mFrescoCache;
    }

    public void display(C12207s sVar) {
        this.mImpl.display(sVar);
    }

    public void download(C12207s sVar) {
        this.mImpl.download(sVar);
    }

    public C12208t load(Uri uri) {
        return new C12208t(uri);
    }

    public void loadBitmap(C12207s sVar) {
        this.mImpl.loadBitmap(sVar);
    }

    public void trimDisk(int i) {
        this.mImpl.trimDisk(i);
    }

    public void trimMemory(int i) {
        this.mImpl.trimMemory(i);
    }

    public C12208t load(C12156a aVar) {
        return new C12208t(aVar);
    }

    public C12208t load(File file) {
        return new C12208t(Uri.fromFile(file));
    }

    public C12208t load(int i) {
        StringBuilder sb = new StringBuilder("res://");
        sb.append(C12203q.f32145d);
        sb.append("/");
        sb.append(i);
        return new C12208t(Uri.parse(sb.toString()));
    }

    public C12208t load(Object obj) {
        return new C12208t(obj);
    }

    public C12208t load(String str) {
        return new C12208t(str);
    }

    public void init(C12204r rVar) {
        C12194h.m24639a(rVar.f32146a);
        if (rVar.f32156k) {
            if (rVar.f32148c >= 0) {
                C13916b.m28350a(rVar.f32148c);
            }
            C14010a a = C14008i.m28571a(rVar.f32146a);
            C13638a a2 = C13636c.m27531a(rVar.f32146a).mo25501a(rVar.f32150e).mo25502a("fresco_cache");
            if (rVar.f32153h > 0) {
                a2.mo25499a(rVar.f32153h);
            }
            a2.mo25500a((C13658b) C13659c.m27611a());
            C14010a a3 = a.mo26200a(a2.mo25503a());
            C13638a a4 = C13636c.m27531a(rVar.f32146a).mo25501a(rVar.f32150e).mo25502a("fresco_small_cache");
            if (rVar.f32154i > 0) {
                a4.mo25499a(rVar.f32154i);
            }
            a4.mo25500a((C13658b) C13659c.m27611a());
            a3.f36558w = a4.mo25503a();
            C14010a a5 = a3.mo26199a(rVar.f32147b).mo26205a(true);
            if (rVar.f32162q) {
                a5.mo26202a((C13705d) C12250q.m24726a());
                C14066a a6 = C14064ab.m28770a();
                a6.f36756d = C12250q.m24726a();
                a5.f36554s = new C14067ac(a6.mo26318a());
            }
            if (rVar.f32149d != null) {
                a5.mo26203a((C14123ai) new C12237o(rVar.f32149d));
            }
            a5.mo26201a((C13691k<C13987q>) new C12222b<C13987q>((ActivityManager) rVar.f32146a.getSystemService("activity"), (int) rVar.f32151f));
            a5.f36542g = (C13691k) C13689i.m27652a(new C12229h((int) rVar.f32152g));
            if (rVar.f32158m) {
                HashSet hashSet = new HashSet();
                C12253r.f32357a = new C14711d();
                hashSet.add(C12253r.m24729a());
                a5.mo26204a((Set<C14050c>) hashSet);
                C14709b.f38112e = rVar.f32146a;
                C14709b.f38108a = new C12260u(rVar.f32160o);
                C14709b.f38109b = false;
                C14709b.f38110c = true;
                C14709b.f38111d = rVar.f32159n;
            }
            C13877a.f36197c = new C13885b(rVar) {

                /* renamed from: a */
                final /* synthetic */ C12204r f32361a;

                {
                    this.f32361a = r1;
                }

                /* renamed from: a */
                public final C13884a mo23184a(C13857a aVar, Object obj) {
                    C12155a aVar2;
                    boolean z;
                    C12170e eVar = null;
                    if (!(obj instanceof HashMap) || this.f32361a.f32161p == null || this.f32361a.f32161p.isEmpty()) {
                        return null;
                    }
                    HashMap hashMap = (HashMap) obj;
                    Object obj2 = hashMap.get("frame_scheduler_id");
                    if (!(obj2 instanceof Integer)) {
                        return null;
                    }
                    Object obj3 = hashMap.get("frame_scheduler_listener");
                    Iterator it = this.f32361a.f32161p.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aVar2 = null;
                            break;
                        }
                        aVar2 = (C12155a) it.next();
                        if (((Integer) obj2).intValue() == aVar2.f32089b) {
                            break;
                        }
                    }
                    if (aVar2 == null) {
                        return null;
                    }
                    C13863a aVar3 = (C13863a) ((C13858b) aVar).f36144a;
                    if (aVar3 == null) {
                        return null;
                    }
                    int[] iArr = aVar2.f32091d;
                    if (obj3 instanceof C12170e) {
                        eVar = (C12170e) obj3;
                    }
                    int d = aVar.mo26005d();
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = false;
                    int i = -1;
                    for (int i2 : iArr) {
                        if (i2 >= d || i2 < 0 || i2 == i) {
                            z2 = true;
                        } else {
                            arrayList.add(Integer.valueOf(i2));
                            i = i2;
                        }
                    }
                    if (!z2) {
                        int length = iArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                z = false;
                                break;
                            } else if (iArr[i3] == d - 1) {
                                z = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                        z2 = !z;
                    }
                    if (z2 && eVar != null) {
                        eVar.mo23088a(d, iArr);
                    }
                    int[] iArr2 = new int[arrayList.size()];
                    for (int i4 = 0; i4 < iArr2.length; i4++) {
                        iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                    }
                    C12226f fVar = new C12226f(aVar, iArr2);
                    aVar3.f36158a = new C12225e(iArr2, fVar);
                    return fVar;
                }
            };
            if (rVar.f32163r != null) {
                C14252b.m29208a((C14253a) new C14253a(rVar) {

                    /* renamed from: a */
                    final /* synthetic */ C12204r f32360a;

                    /* renamed from: a */
                    public final void mo23183a(String str) {
                    }

                    {
                        this.f32360a = r1;
                    }
                });
            }
            C14008i a7 = a5.mo26206a();
            C13771c.m27872a(rVar.f32146a, a7);
            C12254s.m24730a().f32358a = a7;
            C13697a.f35669a.mo25585a(rVar.f32155j);
        }
        this.mFrescoCache = new C12234l();
        this.mImpl = new C12240p(this.mFrescoCache);
    }
}
