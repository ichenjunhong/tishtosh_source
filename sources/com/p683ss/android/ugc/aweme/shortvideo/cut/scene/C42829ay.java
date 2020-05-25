package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39538i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43040g.C43041a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43047h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2182b.C43000a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43019c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43020d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43439b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45870a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay */
public final class C42829ay implements C42876bq {

    /* renamed from: a */
    public final C39538i f108284a;

    /* renamed from: b */
    final ArrayList<C42482c> f108285b = new ArrayList<>();

    /* renamed from: c */
    public int f108286c;

    /* renamed from: d */
    boolean f108287d;

    /* renamed from: e */
    public int f108288e;

    /* renamed from: f */
    int f108289f;

    /* renamed from: g */
    public boolean f108290g;

    /* renamed from: h */
    public C42836az f108291h;

    /* renamed from: i */
    public String f108292i;

    /* renamed from: j */
    public boolean f108293j;

    /* renamed from: k */
    private final C43439b f108294k = new C43439b();

    /* renamed from: l */
    private final Activity f108295l;

    /* renamed from: m */
    private final C42835e f108296m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$a */
    static final class C42831a extends C52712l implements C52671b<C24434d, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42829ay f108298a;

        C42831a(C42829ay ayVar) {
            this.f108298a = ayVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C24434d dVar = (C24434d) obj;
            C52711k.m112240b(dVar, "result");
            if (dVar.f64820c != null) {
                this.f108298a.mo87291b(dVar.f64820c);
            } else {
                C42836az azVar = this.f108298a.f108291h;
                if (azVar != null) {
                    azVar.mo87304a(null, "");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$b */
    static final class C42832b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42829ay f108299a;

        C42832b(C42829ay ayVar) {
            this.f108299a = ayVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42836az azVar = this.f108299a.f108291h;
            if (azVar != null) {
                azVar.mo87304a(null, "");
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$c */
    public static final class C42833c implements C43019c {

        /* renamed from: a */
        final /* synthetic */ C42829ay f108300a;

        C42833c(C42829ay ayVar) {
            this.f108300a = ayVar;
        }

        /* renamed from: a */
        public final void mo87296a(C42482c cVar, boolean z) {
            if (!z) {
                this.f108300a.mo87287a(cVar);
            }
        }

        /* renamed from: b */
        public final void mo87297b(C42482c cVar, boolean z) {
            String str;
            if (z) {
                C42829ay ayVar = this.f108300a;
                if (!ayVar.f108287d || ayVar.f108288e != -1) {
                    ayVar.f108289f = ayVar.f108288e;
                    if (ayVar.f108286c == 0) {
                        C39538i iVar = ayVar.f108284a;
                        if (iVar == null) {
                            C52711k.m112234a();
                        }
                        iVar.mo80642b(ayVar.f108284a.mo80640b(), true);
                    } else {
                        C39538i iVar2 = ayVar.f108284a;
                        if (iVar2 == null) {
                            C52711k.m112234a();
                        }
                        iVar2.mo80642b(-1, false);
                    }
                    if (C52711k.m112239a((Object) ayVar.f108292i, (Object) "sync_page_favorite")) {
                        str = "favorite";
                    } else {
                        str = "recommend";
                    }
                    if (ayVar.f108293j) {
                        C43047h hVar = C43047h.f108667g;
                        int i = ayVar.f108288e;
                        C52711k.m112240b(str, "tabName");
                        if (cVar != null) {
                            C26890h.m65011a("select_music", C43047h.m94328a().mo47829a("content_source", "upload").mo47829a("content_type", "sound_sync").mo47829a("music_id", cVar.getMusicId()).mo47826a("music_show_rank", i + 1).mo47829a("music_rec_type", "").mo47829a("tab_name", str).f61491a);
                        }
                        ayVar.f108293j = false;
                    }
                } else {
                    ArrayList<C42482c> arrayList = ayVar.f108285b;
                    if (cVar == null) {
                        C52711k.m112234a();
                    }
                    arrayList.add(0, cVar);
                    C39538i iVar3 = ayVar.f108284a;
                    if (iVar3 == null) {
                        C52711k.m112234a();
                    }
                    iVar3.mo80638a(cVar);
                    ayVar.f108284a.mo80636a(ayVar.f108284a.mo80635a() + 1);
                    ayVar.f108284a.mo80642b(0, true);
                    C43047h hVar2 = C43047h.f108667g;
                    if (cVar != null) {
                        if (C45870a.m99714a()) {
                            C43047h.m94328a().mo47829a("is_commercial", "1");
                        }
                        C26890h.m65011a("change_music", C43047h.m94328a().mo47829a("content_source", "upload").mo47829a("content_type", "sound_sync").mo47829a("music_id", cVar.getMusicId()).mo47829a("music_rec_type", "").f61491a);
                    }
                    ayVar.f108289f = 0;
                }
                C42836az azVar = ayVar.f108291h;
                if (azVar != null) {
                    azVar.mo87304a(cVar, ayVar.f108292i);
                }
                if (ayVar.f108288e != -1) {
                    C42836az azVar2 = ayVar.f108291h;
                    if (azVar2 != null) {
                        azVar2.mo87301a(ayVar.f108288e + 1);
                    }
                }
                ayVar.f108290g = false;
                ayVar.f108287d = false;
                return;
            }
            this.f108300a.mo87287a(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$d */
    public static final class C42834d implements C43020d {

        /* renamed from: a */
        final /* synthetic */ C42829ay f108301a;

        C42834d(C42829ay ayVar) {
            this.f108301a = ayVar;
        }

        /* renamed from: a */
        public final void mo87298a(Exception exc) {
            C42836az azVar = this.f108301a.f108291h;
            if (azVar != null) {
                azVar.mo87308c();
            }
        }

        /* renamed from: a */
        public final void mo87299a(List<? extends C42482c> list) {
            Collection collection = list;
            if (C23715d.m58202a(collection)) {
                C42836az azVar = this.f108301a.f108291h;
                if (azVar != null) {
                    azVar.mo87308c();
                    return;
                }
                return;
            }
            C42829ay ayVar = this.f108301a;
            if (list == null) {
                C52711k.m112234a();
            }
            ayVar.mo87292b(C52575l.m112139e(collection));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$e */
    public static final class C42835e implements C42730a {

        /* renamed from: a */
        final /* synthetic */ C42829ay f108302a;

        C42835e(C42829ay ayVar) {
            this.f108302a = ayVar;
        }

        /* renamed from: a */
        public final void mo87188a(int i) {
            this.f108302a.f108286c = i;
        }

        /* renamed from: a */
        public final void mo87189a(C42482c cVar, int i) {
            this.f108302a.f108293j = true;
            this.f108302a.f108292i = "sync_page_favorite";
            C42836az azVar = this.f108302a.f108291h;
            if (azVar != null) {
                azVar.mo87304a(null, "");
            }
            C39538i iVar = this.f108302a.f108284a;
            if (iVar != null) {
                iVar.mo80642b(-1, false);
            }
            C42836az azVar2 = this.f108302a.f108291h;
            if (azVar2 != null) {
                azVar2.mo87303a(cVar);
            }
            this.f108302a.mo87294c(cVar);
            this.f108302a.f108288e = i;
        }
    }

    /* renamed from: c */
    public final C39538i mo87293c() {
        return this.f108284a;
    }

    /* renamed from: b */
    public final C42730a mo87290b() {
        return this.f108296m;
    }

    /* renamed from: a */
    public final C42482c mo87285a() {
        if (C23715d.m58202a((Collection<T>) this.f108285b)) {
            return null;
        }
        C39538i iVar = this.f108284a;
        if (iVar == null) {
            C52711k.m112234a();
        }
        return m93963b(iVar.mo80635a());
    }

    /* renamed from: d */
    public final void mo87295d() {
        List list;
        int i;
        StringBuilder sb = new StringBuilder();
        C42836az azVar = this.f108291h;
        if (azVar != null) {
            list = azVar.mo87310e();
        } else {
            list = null;
        }
        Collection collection = list;
        if (C23715d.m58202a(collection) || C23715d.m58202a(collection)) {
            i = 0;
        } else {
            if (list == null) {
                C52711k.m112234a();
            }
            i = list.size();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(((VideoSegment) list.get(i2)).f107904c);
                if (i2 < i - 1) {
                    sb.append(",");
                }
            }
        }
        C42836az azVar2 = this.f108291h;
        if (azVar2 != null) {
            azVar2.mo87305b();
        }
        C43041a.m94322a().mo87422a(i, sb.toString(), new C42834d(this));
    }

    /* renamed from: a */
    public final void mo87288a(C42836az azVar) {
        C52711k.m112240b(azVar, "listener");
        this.f108291h = azVar;
    }

    /* renamed from: c */
    public final void mo87294c(C42482c cVar) {
        C42836az azVar = this.f108291h;
        if (azVar != null) {
            azVar.mo87307b(cVar);
        }
        this.f108290g = true;
        C43000a.f108582a.mo87390a(this.f108295l, cVar, new C42833c(this));
    }

    /* renamed from: b */
    private final C42482c m93963b(int i) {
        if (!C23715d.m58202a((Collection<T>) this.f108285b) && i >= 0 && i < this.f108285b.size()) {
            return (C42482c) this.f108285b.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo87287a(C42482c cVar) {
        C42836az azVar = this.f108291h;
        if (azVar != null) {
            azVar.mo87304a(null, "");
        }
        this.f108290g = false;
        this.f108287d = false;
        C42836az azVar2 = this.f108291h;
        if (azVar2 != null) {
            azVar2.mo87300a();
        }
    }

    public C42829ay(Context context) {
        C52711k.m112240b(context, "context");
        this.f108295l = (Activity) context;
        this.f108288e = -1;
        this.f108289f = -1;
        this.f108292i = "sync_page_recommend";
        this.f108284a = C39630m.m88234a().mo58604b().mo80564a((List<C42482c>) this.f108285b, (C24441j) new C24441j(this) {

            /* renamed from: a */
            final /* synthetic */ C42829ay f108297a;

            {
                this.f108297a = r1;
            }

            /* renamed from: a */
            public final void mo50207a(View view, int i) {
                C52711k.m112240b(view, "view");
                if (!this.f108297a.f108290g) {
                    this.f108297a.f108293j = true;
                    this.f108297a.f108288e = i;
                    this.f108297a.mo87286a(i);
                    this.f108297a.f108292i = "sync_page_recommend";
                }
            }
        });
        this.f108296m = new C42835e(this);
    }

    /* renamed from: a */
    public final void mo87286a(int i) {
        if (i == -1) {
            this.f108292i = "sync_page_lib ";
            C43439b.m95211a(this.f108295l, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, new C42831a(this), new C42832b(this));
            C42836az azVar = this.f108291h;
            if (azVar != null) {
                azVar.mo87311f();
            }
            this.f108287d = true;
            return;
        }
        this.f108292i = "sync_page_recommend";
        C42482c b = m93963b(i);
        C39538i iVar = this.f108284a;
        if (iVar == null) {
            C52711k.m112234a();
        }
        if (iVar.mo80635a() != this.f108284a.mo80640b() || this.f108284a.mo80635a() != i) {
            this.f108284a.mo80637a(i, false);
            this.f108284a.mo80643c();
            C42836az azVar2 = this.f108291h;
            if (azVar2 != null) {
                azVar2.mo87303a(b);
            }
            mo87294c(b);
        }
    }

    /* renamed from: b */
    public final void mo87292b(List<C42482c> list) {
        C42836az azVar = this.f108291h;
        if (azVar != null) {
            azVar.mo87309d();
        }
        C39538i iVar = this.f108284a;
        if (iVar == null) {
            C52711k.m112234a();
        }
        iVar.mo80644d();
        ArrayList<C42482c> arrayList = this.f108285b;
        if (list == null) {
            C52711k.m112234a();
        }
        arrayList.addAll(list);
        this.f108284a.mo80639a(list);
        mo87286a(0);
    }

    /* renamed from: a */
    public final void mo87289a(List<C42482c> list) {
        if (C23715d.m58202a((Collection<T>) list)) {
            mo87295d();
        } else {
            mo87292b(list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87291b(com.p683ss.android.ugc.aweme.shortvideo.C42482c r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0006
            r7.f108287d = r0
            return
        L_0x0006:
            java.lang.String r1 = r8.getMusicId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = -1
            if (r1 != 0) goto L_0x003d
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.c> r1 = r7.f108285b
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x006e
            java.lang.String r4 = r8.getMusicId()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.c> r5 = r7.f108285b
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r6 = "musicModelList[i]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.shortvideo.c r5 = (com.p683ss.android.ugc.aweme.shortvideo.C42482c) r5
            java.lang.String r5 = r5.getMusicId()
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            if (r4 == 0) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x003d:
            java.lang.String r1 = r8.getPath()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x006e
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.c> r1 = r7.f108285b
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L_0x0052:
            if (r3 >= r1) goto L_0x006e
            java.lang.String r4 = r8.getPath()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.c> r5 = r7.f108285b
            java.lang.Object r5 = r5.get(r3)
            com.ss.android.ugc.aweme.shortvideo.c r5 = (com.p683ss.android.ugc.aweme.shortvideo.C42482c) r5
            java.lang.String r5 = r5.getPath()
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            if (r4 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x0052
        L_0x006e:
            r3 = -1
        L_0x006f:
            if (r3 != r2) goto L_0x007a
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f r0 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.f108637b
            r0.mo87416a(r8)
            r7.mo87294c(r8)
            return
        L_0x007a:
            int r8 = r7.f108289f
            if (r3 != r8) goto L_0x009a
            int r8 = r7.f108288e
            if (r8 == r2) goto L_0x008d
            com.ss.android.ugc.aweme.shortvideo.cut.scene.az r8 = r7.f108291h
            if (r8 == 0) goto L_0x008d
            int r1 = r7.f108288e
            int r1 = r1 + 1
            r8.mo87301a(r1)
        L_0x008d:
            com.ss.android.ugc.aweme.shortvideo.cut.scene.az r8 = r7.f108291h
            if (r8 == 0) goto L_0x0097
            r1 = 0
            java.lang.String r2 = ""
            r8.mo87304a(r1, r2)
        L_0x0097:
            r7.f108287d = r0
            return
        L_0x009a:
            r7.f108288e = r3
            r7.mo87286a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42829ay.mo87291b(com.ss.android.ugc.aweme.shortvideo.c):void");
    }
}
