package com.p683ss.android.ugc.aweme.shortvideo.edit;

import com.p683ss.android.ugc.asve.p1239c.C20342a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42669p.C42670a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.vesdk.C50633an;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.VEListener.C50548l;
import com.p683ss.android.vesdk.runtime.C50765b;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.x */
public final class C43770x implements C43765s {

    /* renamed from: a */
    public C0027j<Boolean> f110836a = new C0027j<>();

    /* renamed from: b */
    public boolean f110837b;

    /* renamed from: c */
    private C20347c f110838c;

    /* renamed from: d */
    private final C20347c f110839d;

    /* renamed from: e */
    private final EditPreviewInfo f110840e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.x$a */
    public static final class C43771a implements C50548l {

        /* renamed from: a */
        final /* synthetic */ C43770x f110841a;

        C43771a(C43770x xVar) {
            this.f110841a = xVar;
        }

        /* renamed from: a */
        public final void mo89270a(int i) {
            boolean z;
            C43770x xVar = this.f110841a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            xVar.f110837b = z;
            this.f110841a.f110836a.mo44a(Boolean.valueOf(this.f110841a.f110837b));
        }
    }

    /* renamed from: c */
    public final String[] mo59021c() {
        return this.f110839d.mo43066h();
    }

    /* renamed from: d */
    public final String[] mo59022d() {
        return this.f110839d.mo43070j();
    }

    /* renamed from: e */
    public final String[] mo59023e() {
        return this.f110839d.mo43068i();
    }

    /* renamed from: b */
    public final boolean mo59020b() {
        if (mo59021c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C0013i<Boolean> mo59019a() {
        C20342a aVar;
        if (mo59021c() != null) {
            this.f110837b = true;
            this.f110836a.mo44a(Boolean.valueOf(this.f110837b));
        } else if (this.f110838c == null) {
            int i = 0;
            int[] iArr = (this.f110840e.getSceneIn() > 0 || this.f110840e.getSceneOut() > 0) ? new int[]{(int) this.f110840e.getSceneIn(), (int) this.f110840e.getSceneOut()} : new int[]{0, this.f110839d.mo43071k()};
            int i2 = iArr[0];
            int i3 = iArr[1];
            C50765b a = this.f110839d.mo43013a();
            String[] strArr = new String[this.f110840e.getVideoList().size()];
            int i4 = 0;
            for (Object next : this.f110840e.getVideoList()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C52575l.m112100b();
                }
                strArr[i4] = ((EditVideoSegment) next).getVideoPath();
                i4 = i5;
            }
            C50633an anVar = new C50633an(strArr);
            for (Object next2 : this.f110840e.getVideoList()) {
                int i6 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                VideoCutInfo videoCutInfo = ((EditVideoSegment) next2).getVideoCutInfo();
                if (videoCutInfo != null) {
                    anVar.f126932e[i] = (int) videoCutInfo.getStart();
                    anVar.f126933f[i] = (int) videoCutInfo.getEnd();
                    anVar.f126936i[i] = (double) videoCutInfo.getSpeed();
                    anVar.f126938k[i] = C42670a.m93643a(videoCutInfo.getRotate());
                }
                i = i6;
            }
            C50548l aVar2 = new C43771a(this);
            C52711k.m112240b(a, "resManager");
            C52711k.m112240b(anVar, "sceneTime");
            C50720o a2 = C50720o.m109678a(a, anVar, i2, i3, aVar2);
            if (a2 != null) {
                aVar = new C20342a(a2);
            } else {
                aVar = null;
            }
            this.f110838c = aVar;
        }
        C0013i<TResult> iVar = this.f110836a.f77a;
        C52711k.m112236a((Object) iVar, "prepareTask.task");
        return iVar;
    }

    public C43770x(C20347c cVar, EditPreviewInfo editPreviewInfo) {
        C52711k.m112240b(cVar, "srcVEEditor");
        C52711k.m112240b(editPreviewInfo, "editPreviewInfo");
        this.f110839d = cVar;
        this.f110840e = editPreviewInfo;
    }
}
