package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.lighten.p766a.C12155a;
import com.bytedance.lighten.p766a.C12159b;
import com.bytedance.lighten.p766a.C12165c;
import com.bytedance.lighten.p766a.C12180d;
import com.bytedance.lighten.p766a.C12187e;
import com.bytedance.lighten.p766a.C12187e.C12190b;
import com.bytedance.lighten.p766a.C12195i;
import com.bytedance.lighten.p766a.C12202p;
import com.bytedance.lighten.p766a.C12207s;
import com.bytedance.lighten.p766a.p769c.C12172g;
import com.bytedance.lighten.p766a.p769c.C12176k;
import com.bytedance.lighten.p766a.p769c.C12178m;
import com.bytedance.lighten.p766a.p770d.C12184b;
import com.bytedance.lighten.p766a.p770d.C12186c;
import com.facebook.common.p923g.C13703b;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p939e.C13815p;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p966f.C14024b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p973m.C14057a;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14229b.C14230a;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13749f;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.lighten.loader.p */
final class C12240p implements C12195i {

    /* renamed from: a */
    public C12165c f32333a;

    /* renamed from: b */
    private ExecutorService f32334b = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49845a("fresco-loader-io").mo49844a(2).mo49847a());

    /* renamed from: e */
    private static C13952d m24720e(C12207s sVar) {
        return new C13952d(sVar.f32204i, sVar.f32205j);
    }

    public final void trimDisk(final int i) {
        this.f32334b.submit(new Runnable() {
            public final void run() {
                switch (i) {
                    case 1:
                        C13771c.m27874b().mo26210d().mo25507b();
                        C13771c.m27874b().mo26213g().mo25507b();
                        return;
                    case 2:
                        C13771c.m27874b().mo26210d().mo25509c();
                        C13771c.m27874b().mo26213g().mo25509c();
                        break;
                }
            }
        });
    }

    /* renamed from: a */
    public static Executor m24711a(C12207s sVar) {
        C12184b a = C12184b.m24629a();
        if (sVar.f32183B != null) {
            return sVar.f32183B;
        }
        return a;
    }

    /* renamed from: h */
    private static C13951c m24723h(C12207s sVar) {
        C12202p pVar = sVar.f32221z;
        if (pVar == C12202p.LOW) {
            return C13951c.LOW;
        }
        if (pVar == C12202p.HIGH) {
            return C13951c.HIGH;
        }
        return C13951c.MEDIUM;
    }

    /* renamed from: i */
    private static List<String> m24724i(C12207s sVar) {
        if (sVar.f32194M == null || sVar.f32194M.mo23067a()) {
            return Collections.emptyList();
        }
        return sVar.f32194M.f32092a;
    }

    C12240p(C12165c cVar) {
        this.f32333a = cVar;
    }

    /* renamed from: b */
    static C14229b[] m24716b(C12207s sVar) {
        List<String> i = m24724i(sVar);
        ArrayList arrayList = new ArrayList();
        for (String a : i) {
            arrayList.add(m24714b(sVar, C12186c.m24631a(a)).mo26449a());
        }
        if (arrayList.size() == 0) {
            return new C14229b[0];
        }
        return (C14229b[]) arrayList.toArray(new C14229b[arrayList.size()]);
    }

    /* renamed from: c */
    private static void m24717c(C12207s sVar) {
        C13837e eVar;
        if (sVar.f32217v != null) {
            SmartImageView smartImageView = (SmartImageView) sVar.f32185D;
            if (smartImageView != null) {
                C12187e eVar2 = sVar.f32217v;
                if (((C13833a) smartImageView.getHierarchy()).f36079a != null) {
                    eVar = ((C13833a) smartImageView.getHierarchy()).f36079a;
                } else {
                    eVar = new C13837e();
                }
                ((C13833a) smartImageView.getHierarchy()).mo25899a(m24709a(eVar, eVar2));
            }
        }
    }

    /* renamed from: f */
    private static void m24721f(C12207s sVar) {
        if (!sVar.f32190I) {
            SmartImageView smartImageView = (SmartImageView) sVar.f32185D;
            if (smartImageView != null) {
                Drawable drawable = sVar.f32214s;
                if (drawable == null) {
                    ((C13833a) smartImageView.getHierarchy()).mo25911d((Drawable) null);
                } else {
                    ((C13833a) smartImageView.getHierarchy()).mo25911d((Drawable) new C13815p(drawable, C13818b.f36067g));
                }
            }
        }
    }

    public final void trimMemory(int i) {
        if (i == 5) {
            C12250q.m24726a().mo23181a(C13703b.OnSystemLowMemoryWhileAppInForeground);
            C12217a.m24686b().mo23152a();
        } else if (i != 10) {
            if (i == 40) {
                C12250q.m24726a().mo23181a(C13703b.OnSystemLowMemoryWhileAppInBackground);
            }
        } else {
            C12250q.m24726a().mo23181a(C13703b.OnCloseToDalvikHeapLimit);
            C12217a.m24686b().mo23152a();
        }
    }

    /* renamed from: d */
    private static C13950b m24719d(C12207s sVar) {
        ImageDecodeOptionsBuilder b = C13950b.m28427b();
        if (sVar.f32215t != null) {
            b.setBitmapConfig(sVar.f32215t);
        }
        b.mo26113a(sVar.f32201f);
        if (sVar.f32202g >= 0) {
            b.mo26112a(sVar.f32202g);
        }
        if (sVar.f32199d != C12155a.f32088a.f32089b) {
            HashMap hashMap = new HashMap();
            hashMap.put("frame_scheduler_id", Integer.valueOf(sVar.f32199d));
            if (sVar.f32195N != null) {
                hashMap.put("frame_scheduler_listener", sVar.f32195N);
            }
            b.f36381k = hashMap;
        }
        return b.mo26114a();
    }

    public final void download(C12207s sVar) {
        final Uri uri;
        List i = m24724i(sVar);
        if (i.isEmpty()) {
            uri = sVar.f32196a;
        } else {
            uri = Uri.parse((String) i.get(0));
        }
        final C12176k kVar = sVar.f32188G;
        if (this.f32333a.mo23083b(uri)) {
            if (kVar != null) {
                m24711a(sVar).execute(new Runnable() {
                    public final void run() {
                        C12240p.this.f32333a.mo23082a(uri);
                    }
                });
            }
            return;
        }
        C14229b fromUri = C14229b.fromUri(uri);
        C14001h e = C14017k.m28587a().mo26211e();
        if (kVar == null) {
            e.mo26192c(fromUri, null);
        } else {
            e.mo26192c(fromUri, null).mo25666a(new C13744b<Void>() {
                public final void onFailureImpl(C13745c<Void> cVar) {
                }

                public final void onNewResultImpl(C13745c<Void> cVar) {
                    if (cVar.mo25672b()) {
                        C12240p.this.f32333a.mo23082a(uri);
                    }
                }
            }, m24711a(sVar));
        }
    }

    public final void loadBitmap(C12207s sVar) {
        if (sVar.f32194M == null || sVar.f32194M.mo23067a()) {
            m24712a(C14017k.m28587a().mo26211e().mo26182a(m24710a(sVar, sVar.f32196a), (Object) null), sVar);
            return;
        }
        C14229b[] b = m24716b(sVar);
        if (b.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (C14229b bVar : b) {
                if (bVar != null) {
                    arrayList.add(C13771c.m27875c().mo26181a(bVar, (Object) null, C14231b.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty()) {
                m24712a(C13749f.m27821a(arrayList).mo23157b(), sVar);
            }
        }
    }

    /* renamed from: g */
    private static void m24722g(C12207s sVar) {
        SmartImageView smartImageView = (SmartImageView) sVar.f32185D;
        if (smartImageView != null) {
            if (sVar.f32209n > 0) {
                if (sVar.f32211p != null) {
                    ((C13833a) smartImageView.getHierarchy()).mo25892a(sVar.f32209n, C12261v.m24734a(sVar.f32211p));
                } else {
                    ((C13833a) smartImageView.getHierarchy()).mo25902b(sVar.f32209n);
                }
            } else if (sVar.f32210o != null) {
                ((C13833a) smartImageView.getHierarchy()).mo25904b(sVar.f32210o);
            }
            if (sVar.f32212q > 0) {
                if (sVar.f32213r != null) {
                    ((C13833a) smartImageView.getHierarchy()).mo25903b(sVar.f32212q, C12261v.m24734a(sVar.f32213r));
                } else {
                    ((C13833a) smartImageView.getHierarchy()).mo25907c(sVar.f32212q);
                }
            }
            if (sVar.f32216u != null) {
                ((C13833a) smartImageView.getHierarchy()).mo25898a(C12261v.m24734a(sVar.f32216u));
            }
            if (sVar.f32192K > 0) {
                if (sVar.f32193L != null) {
                    ((C13833a) smartImageView.getHierarchy()).mo25908c(sVar.f32192K, C12261v.m24734a(sVar.f32193L));
                } else {
                    ((C13833a) smartImageView.getHierarchy()).mo25910d(sVar.f32192K);
                }
            }
            if (sVar.f32208m > 0) {
                ((C13833a) smartImageView.getHierarchy()).mo25890a(sVar.f32208m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void display(com.bytedance.lighten.p766a.C12207s r11) {
        /*
            r10 = this;
            com.bytedance.lighten.a.k r0 = r11.f32185D
            boolean r0 = r0 instanceof com.bytedance.lighten.loader.SmartCircleImageView
            if (r0 == 0) goto L_0x000e
            com.bytedance.lighten.a.k r0 = r11.f32185D
            com.bytedance.lighten.loader.SmartCircleImageView r0 = (com.bytedance.lighten.loader.SmartCircleImageView) r0
            r0.mo23133a(r11)
            return
        L_0x000e:
            com.bytedance.lighten.a.k r0 = r11.f32185D
            boolean r0 = r0 instanceof com.bytedance.lighten.loader.SmartImageView
            if (r0 == 0) goto L_0x001c
            com.bytedance.lighten.a.k r0 = r11.f32185D
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            r0.mo23133a(r11)
            return
        L_0x001c:
            android.widget.ImageView r0 = r11.f32186E
            if (r0 == 0) goto L_0x0177
            android.widget.ImageView r0 = r11.f32186E
            if (r0 == 0) goto L_0x0176
            if (r11 != 0) goto L_0x0028
            goto L_0x0176
        L_0x0028:
            java.lang.String r1 = "DraweeHolder"
            r2 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.Object r3 = r0.getTag()
            boolean r4 = r3 instanceof com.bytedance.lighten.p766a.p770d.C12181a.C12183a
            if (r4 == 0) goto L_0x003e
            com.bytedance.lighten.a.d.a$a r3 = (com.bytedance.lighten.p766a.p770d.C12181a.C12183a) r3
            java.lang.Object r1 = r3.get(r1)
            if (r1 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            boolean r3 = r1 instanceof com.facebook.drawee.view.C13848b
            if (r3 == 0) goto L_0x0046
            com.facebook.drawee.view.b r1 = (com.facebook.drawee.view.C13848b) r1
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            com.bytedance.lighten.loader.c r3 = new com.bytedance.lighten.loader.c
            r3.<init>()
            r3.mo23158a(r11)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0103
            android.content.Context r1 = r0.getContext()
            com.facebook.drawee.view.b r1 = com.facebook.drawee.view.C13848b.m28154a(r2, r1)
            com.bytedance.lighten.loader.k$a r6 = new com.bytedance.lighten.loader.k$a
            r6.<init>(r1)
            com.facebook.drawee.f.a r7 = com.bytedance.lighten.loader.C12232k.m24702a(r0, r11)
            r1.mo25980a(r7)
            com.bytedance.lighten.a.a.a r7 = r11.f32194M
            if (r7 == 0) goto L_0x0078
            com.bytedance.lighten.a.a.a r7 = r11.f32194M
            boolean r7 = r7.mo23067a()
            if (r7 != 0) goto L_0x0078
            com.facebook.imagepipeline.o.b[] r7 = m24716b(r11)
            goto L_0x0088
        L_0x0078:
            android.net.Uri r7 = r11.f32196a
            if (r7 == 0) goto L_0x0087
            com.facebook.imagepipeline.o.b[] r7 = new com.facebook.imagepipeline.p975o.C14229b[r4]
            android.net.Uri r8 = r11.f32196a
            com.facebook.imagepipeline.o.b r8 = m24710a(r11, r8)
            r7[r5] = r8
            goto L_0x0088
        L_0x0087:
            r7 = r2
        L_0x0088:
            if (r7 == 0) goto L_0x0176
            int r8 = r7.length
            if (r8 != 0) goto L_0x008f
            goto L_0x0176
        L_0x008f:
            com.facebook.drawee.a.a.e r8 = com.facebook.drawee.p930a.p931a.C13771c.m27870a()
            boolean r9 = r11.f32198c
            com.facebook.drawee.c.b r8 = r8.mo25762c(r9)
            com.facebook.drawee.a.a.e r8 = (com.facebook.drawee.p930a.p931a.C13773e) r8
            com.facebook.drawee.c.b r3 = r8.mo25751a(r3)
            com.facebook.drawee.a.a.e r3 = (com.facebook.drawee.p930a.p931a.C13773e) r3
            com.facebook.drawee.h.a r8 = r1.f36129c
            com.facebook.drawee.c.b r3 = r3.mo25759b(r8)
            com.facebook.drawee.a.a.e r3 = (com.facebook.drawee.p930a.p931a.C13773e) r3
            com.facebook.drawee.c.b r3 = r3.mo25755a((REQUEST[]) r7)
            com.facebook.drawee.a.a.e r3 = (com.facebook.drawee.p930a.p931a.C13773e) r3
            com.facebook.drawee.c.b r3 = r3.mo25758b(r5)
            com.facebook.drawee.a.a.e r3 = (com.facebook.drawee.p930a.p931a.C13773e) r3
            int r11 = r11.f32192K
            if (r11 <= 0) goto L_0x00bb
            r11 = 1
            goto L_0x00bc
        L_0x00bb:
            r11 = 0
        L_0x00bc:
            com.facebook.drawee.c.b r11 = r3.mo25754a(r11)
            com.facebook.drawee.a.a.e r11 = (com.facebook.drawee.p930a.p931a.C13773e) r11
            com.facebook.drawee.c.a r11 = r11.mo25763d()
            r1.mo25979a(r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r11 < r3) goto L_0x00d4
            boolean r4 = r0.isAttachedToWindow()
            goto L_0x00dc
        L_0x00d4:
            android.os.IBinder r11 = r0.getWindowToken()
            if (r11 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            if (r4 == 0) goto L_0x00e1
            r6.onViewAttachedToWindow(r0)
        L_0x00e1:
            r0.addOnAttachStateChangeListener(r6)
            r0.setOnTouchListener(r6)
            java.lang.String r11 = "DraweeHolder"
            if (r0 == 0) goto L_0x016e
            java.lang.Object r3 = r0.getTag()
            boolean r4 = r3 instanceof com.bytedance.lighten.p766a.p770d.C12181a.C12183a
            if (r4 == 0) goto L_0x00fa
            com.bytedance.lighten.a.d.a$a r3 = (com.bytedance.lighten.p766a.p770d.C12181a.C12183a) r3
            r3.put(r11, r1)
            goto L_0x016e
        L_0x00fa:
            com.bytedance.lighten.a.d.a$a r3 = new com.bytedance.lighten.a.d.a$a
            r3.<init>(r11, r1)
            r0.setTag(r3)
            goto L_0x016e
        L_0x0103:
            r1.mo25983c()
            com.facebook.drawee.f.a r6 = com.bytedance.lighten.loader.C12232k.m24702a(r0, r11)
            r1.mo25980a(r6)
            com.bytedance.lighten.a.a.a r6 = r11.f32194M
            if (r6 == 0) goto L_0x011e
            com.bytedance.lighten.a.a.a r6 = r11.f32194M
            boolean r6 = r6.mo23067a()
            if (r6 != 0) goto L_0x011e
            com.facebook.imagepipeline.o.b[] r2 = m24716b(r11)
            goto L_0x012c
        L_0x011e:
            android.net.Uri r6 = r11.f32196a
            if (r6 == 0) goto L_0x012c
            com.facebook.imagepipeline.o.b[] r2 = new com.facebook.imagepipeline.p975o.C14229b[r4]
            android.net.Uri r6 = r11.f32196a
            com.facebook.imagepipeline.o.b r6 = m24710a(r11, r6)
            r2[r5] = r6
        L_0x012c:
            if (r2 == 0) goto L_0x0176
            int r6 = r2.length
            if (r6 != 0) goto L_0x0132
            goto L_0x0176
        L_0x0132:
            com.facebook.drawee.a.a.e r6 = com.facebook.drawee.p930a.p931a.C13771c.m27870a()
            boolean r7 = r11.f32198c
            com.facebook.drawee.c.b r6 = r6.mo25762c(r7)
            com.facebook.drawee.a.a.e r6 = (com.facebook.drawee.p930a.p931a.C13773e) r6
            com.facebook.drawee.c.b r3 = r6.mo25751a(r3)
            com.facebook.drawee.a.a.e r3 = (com.facebook.drawee.p930a.p931a.C13773e) r3
            com.facebook.drawee.c.b r2 = r3.mo25755a((REQUEST[]) r2)
            com.facebook.drawee.a.a.e r2 = (com.facebook.drawee.p930a.p931a.C13773e) r2
            com.facebook.drawee.h.a r3 = r1.f36129c
            com.facebook.drawee.c.b r2 = r2.mo25759b(r3)
            com.facebook.drawee.a.a.e r2 = (com.facebook.drawee.p930a.p931a.C13773e) r2
            com.facebook.drawee.c.b r2 = r2.mo25758b(r5)
            com.facebook.drawee.a.a.e r2 = (com.facebook.drawee.p930a.p931a.C13773e) r2
            int r11 = r11.f32192K
            if (r11 <= 0) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r4 = 0
        L_0x015e:
            com.facebook.drawee.c.b r11 = r2.mo25754a(r4)
            com.facebook.drawee.a.a.e r11 = (com.facebook.drawee.p930a.p931a.C13773e) r11
            com.facebook.drawee.c.a r11 = r11.mo25763d()
            r1.mo25979a(r11)
            r1.mo25982b()
        L_0x016e:
            android.graphics.drawable.Drawable r11 = r1.mo25985e()
            r0.setImageDrawable(r11)
            return
        L_0x0176:
            return
        L_0x0177:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Lighten:needs SmartImageView or ImageView to display, use with(view)"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.C12240p.display(com.bytedance.lighten.a.s):void");
    }

    /* renamed from: a */
    static C14229b m24710a(C12207s sVar, Uri uri) {
        return m24714b(sVar, uri).mo26449a();
    }

    /* renamed from: b */
    private static void m24715b(C14232c cVar, C12207s sVar) {
        if (sVar.f32219x != null) {
            cVar.mo26458a((C14234d) new C12224d(sVar.f32219x));
        }
    }

    /* renamed from: c */
    private static void m24718c(C14232c cVar, C12207s sVar) {
        C12159b bVar = sVar.f32218w;
        if (bVar != null) {
            cVar.mo26458a((C14234d) new C14057a(bVar.f32093a, sVar.f32197b, bVar.f32096d));
        }
    }

    /* renamed from: a */
    private void m24712a(final C13745c<C13715a<C14042c>> cVar, final C12207s sVar) {
        final C12178m mVar = sVar.f32189H;
        if (mVar != null) {
            cVar.mo25666a(new C14024b() {
                public final void onCancellation(C13745c<C13715a<C14042c>> cVar) {
                    if (cVar != null) {
                        cVar.mo25677g();
                        C12240p.m24711a(sVar).execute(new Runnable() {
                            public final void run() {
                            }
                        });
                    }
                }

                public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
                    if (cVar != null) {
                        final Throwable e = cVar.mo25675e();
                        C12240p.m24711a(sVar).execute(new Runnable() {
                            public final void run() {
                                mVar.mo23100a(e);
                            }
                        });
                    }
                }

                public final void onProgressUpdate(C13745c<C13715a<C14042c>> cVar) {
                    if (cVar != null) {
                        final float f = cVar.mo25676f();
                        C12240p.m24711a(sVar).execute(new Runnable() {
                            public final void run() {
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo9012a(Bitmap bitmap) {
                    if (!cVar.mo25672b() || bitmap == null) {
                        C12240p.m24711a(sVar).execute(new Runnable() {
                            public final void run() {
                                mVar.mo23100a(cVar.mo25675e());
                            }
                        });
                        return;
                    }
                    Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Config.ARGB_8888;
                    }
                    final Bitmap copy = bitmap.copy(config, true);
                    cVar.mo25677g();
                    C12240p.m24711a(sVar).execute(new Runnable() {
                        public final void run() {
                            mVar.mo23099a(copy);
                        }
                    });
                }
            }, this.f32334b);
        }
    }

    /* renamed from: a */
    static C13837e m24709a(C13837e eVar, C12187e eVar2) {
        if (eVar2 == null) {
            return eVar;
        }
        if (eVar == null) {
            eVar = new C13837e();
        }
        if (eVar2.f32106g != null) {
            C12190b bVar = eVar2.f32106g;
            eVar.mo25933a(bVar.f32116a, bVar.f32117b, bVar.f32118c, bVar.f32119d);
        }
        eVar.mo25937a(eVar2.f32103d);
        eVar.mo25932a(eVar2.f32104e);
        eVar.mo25939c(eVar2.f32100a);
        eVar.mo25938b(eVar2.f32101b);
        eVar.mo25934a(eVar2.f32102c);
        eVar.mo25940d(eVar2.f32105f);
        eVar.mo25936a(C12264x.m24735a(eVar2.f32107h));
        return eVar;
    }

    /* renamed from: b */
    private static C14232c m24714b(C12207s sVar, Uri uri) {
        C14232c a = C14232c.m29169a(uri).mo26460b(sVar.f32203h).mo26459a(sVar.f32200e);
        if (sVar.f32184C == C12180d.SMALL) {
            a.mo26456a(C14230a.SMALL);
        }
        m24715b(a, sVar);
        m24713a(a, sVar);
        m24718c(a, sVar);
        m24717c(sVar);
        a.mo26451a(m24719d(sVar)).mo26452a(m24723h(sVar)).mo26459a(sVar.f32200e);
        if (sVar.f32204i > 0 || sVar.f32205j > 0) {
            a.mo26453a(m24720e(sVar));
        }
        m24721f(sVar);
        m24722g(sVar);
        return a;
    }

    /* renamed from: a */
    private static void m24713a(C14232c cVar, C12207s sVar) {
        if (sVar.f32220y != null && sVar.f32220y.f32267a != null && !sVar.f32220y.f32267a.isEmpty()) {
            cVar.mo26458a((C14234d) new C12227g((C12172g) sVar.f32220y.f32267a.get(0)));
        }
    }
}
