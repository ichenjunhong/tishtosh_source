package com.p683ss.android.ugc.aweme.shortvideo.cut.scene;

import android.content.Intent;
import android.view.View;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42992e;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43025i;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bg */
public final class C42856bg implements C42875bp {

    /* renamed from: a */
    public C43025i f108334a;

    /* renamed from: b */
    private C42992e f108335b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bg$a */
    public static final class C42857a implements C43025i {

        /* renamed from: a */
        final /* synthetic */ C42856bg f108336a;

        C42857a(C42856bg bgVar) {
            this.f108336a = bgVar;
        }

        /* renamed from: a */
        public final void mo87325a(View view) {
            C43025i iVar = this.f108336a.f108334a;
            if (iVar != null) {
                iVar.mo87325a(view);
            }
        }

        /* renamed from: b */
        public final void mo87327b(View view) {
            C43025i iVar = this.f108336a.f108334a;
            if (iVar != null) {
                iVar.mo87327b(view);
            }
        }

        /* renamed from: c */
        public final void mo87328c(View view) {
            C43025i iVar = this.f108336a.f108334a;
            if (iVar != null) {
                iVar.mo87328c(view);
            }
        }

        /* renamed from: a */
        public final void mo87326a(List<? extends MediaModel> list) {
            C43025i iVar = this.f108336a.f108334a;
            if (iVar != null) {
                iVar.mo87326a(list);
            }
        }
    }

    /* renamed from: c */
    public final void mo87324c() {
        C42992e eVar = this.f108335b;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final ArrayList<String> mo87316a() {
        if (this.f108335b == null) {
            return null;
        }
        C42992e eVar = this.f108335b;
        if (eVar == null) {
            C52711k.m112234a();
        }
        return eVar.mo87498b();
    }

    /* renamed from: b */
    public final long mo87322b() {
        if (this.f108335b == null) {
            return 0;
        }
        C42992e eVar = this.f108335b;
        if (eVar == null) {
            C52711k.m112234a();
        }
        return eVar.mo87501c();
    }

    /* renamed from: a */
    public final void mo87319a(C43025i iVar) {
        this.f108334a = iVar;
    }

    /* renamed from: a */
    public final void mo87320a(List<? extends VideoSegment> list) {
        C42992e eVar = this.f108335b;
        if (eVar != null) {
            eVar.mo87500b(list);
        }
    }

    /* renamed from: a */
    public final void mo87318a(C42992e eVar) {
        this.f108335b = eVar;
        C42992e eVar2 = this.f108335b;
        if (eVar2 != null) {
            eVar2.f108573g = new C42857a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87323b(boolean r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e r0 = r4.f108335b
            if (r0 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e r0 = r4.f108335b
            if (r0 != 0) goto L_0x000b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000b:
            java.util.List r0 = r0.mo87385d()
            boolean r0 = com.bytedance.apm.p501q.C9190h.m18253a(r0)
            if (r0 != 0) goto L_0x0042
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e r1 = r4.f108335b
            if (r1 != 0) goto L_0x0021
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0021:
            java.util.List r1 = r1.mo87385d()
            java.util.Iterator r1 = r1.iterator()
        L_0x0029:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.cut.w r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.C43170w) r2
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r3 = r2.f109123b
            boolean r3 = r3.f107911j
            if (r3 != 0) goto L_0x0029
            r0.add(r2)
            goto L_0x0029
        L_0x003f:
            java.util.List r0 = (java.util.List) r0
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            boolean r1 = com.bytedance.apm.p501q.C9190h.m18253a(r0)
            if (r1 != 0) goto L_0x0068
            if (r0 != 0) goto L_0x004e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0052:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.shortvideo.cut.w r1 = (com.p683ss.android.ugc.aweme.shortvideo.cut.C43170w) r1
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r1 = r1.f109123b
            java.lang.String r2 = "item.seg"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.f107918q = r5
            goto L_0x0052
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42856bg.mo87323b(boolean):void");
    }

    /* renamed from: a */
    public final void mo87321a(boolean z) {
        C42992e eVar = this.f108335b;
        if (eVar != null) {
            eVar.mo87383a(z);
        }
    }

    /* renamed from: a */
    public final void mo87317a(int i, int i2, Intent intent) {
        if (i == 1001) {
            if (i2 != -1 || intent == null) {
                C43025i iVar = this.f108334a;
                if (iVar != null) {
                    iVar.mo87326a(null);
                    return;
                }
                return;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C43025i iVar2 = this.f108334a;
            if (iVar2 != null) {
                iVar2.mo87326a((List<? extends MediaModel>) parcelableArrayListExtra);
            }
        }
    }
}
