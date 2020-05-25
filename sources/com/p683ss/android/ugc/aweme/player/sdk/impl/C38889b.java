package com.p683ss.android.ugc.aweme.player.sdk.impl;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38857c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38862c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38865f;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38868g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38870i;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2492a.C50103c;
import com.p683ss.android.ugc.playerkit.p2494c.C50110b;
import com.p683ss.ugc.live.sdk.p2606b.C51626b;
import com.p683ss.ugc.live.sdk.p2606b.C51627c;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51628a;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51629b;
import com.p683ss.ugc.live.sdk.p2606b.C51627c.C51630c;
import com.p683ss.ugc.live.sdk.p2606b.p2607a.C51624c;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.b */
public final class C38889b implements C38859e, C51628a {

    /* renamed from: a */
    private C51627c f99037a;

    /* renamed from: b */
    private C38862c f99038b;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.impl.b$a */
    class C38892a implements C51627c {
        /* renamed from: a */
        public final void mo78954a() {
        }

        /* renamed from: a */
        public final void mo78955a(Surface surface) {
        }

        /* renamed from: a */
        public final void mo78956a(SurfaceHolder surfaceHolder) {
        }

        /* renamed from: a */
        public final void mo78957a(C51628a aVar) {
        }

        /* renamed from: a */
        public final void mo78958a(String str, Map<String, String> map, C51630c cVar) throws IOException {
        }

        /* renamed from: b */
        public final void mo78959b() {
        }

        /* renamed from: c */
        public final void mo78960c() {
        }

        /* renamed from: d */
        public final void mo78961d() {
        }

        /* renamed from: e */
        public final void mo78962e() {
        }

        /* renamed from: f */
        public final boolean mo78963f() {
            return false;
        }

        /* renamed from: g */
        public final long mo78964g() {
            return 0;
        }

        /* renamed from: h */
        public final long mo78965h() {
            return 0;
        }

        C38892a() {
        }
    }

    /* renamed from: a */
    public final void mo78838a() {
    }

    /* renamed from: a */
    public final void mo78839a(float f) {
    }

    /* renamed from: a */
    public final void mo78840a(float f, float f2) {
    }

    /* renamed from: a */
    public final void mo78841a(long j) {
    }

    /* renamed from: a */
    public final void mo78844a(C38857c cVar) {
    }

    /* renamed from: a */
    public final void mo78846a(C38868g gVar) {
    }

    /* renamed from: a */
    public final void mo78847a(C38870i iVar) {
    }

    /* renamed from: a */
    public final void mo78848a(C50101a aVar) {
    }

    /* renamed from: a */
    public final void mo78849a(C50110b bVar, Map<String, Object> map) throws IOException {
    }

    /* renamed from: a */
    public final void mo78850a(String str) {
    }

    /* renamed from: a */
    public final void mo78851a(String str, C38856b bVar) {
    }

    /* renamed from: a */
    public final void mo78853a(boolean z) {
    }

    /* renamed from: b */
    public final void mo78855b(boolean z) {
    }

    /* renamed from: c */
    public final boolean mo78857c(boolean z) {
        return false;
    }

    /* renamed from: f */
    public final boolean mo78860f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo78861g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo78862h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo78863i() {
        return false;
    }

    /* renamed from: k */
    public final long mo78865k() {
        return 0;
    }

    /* renamed from: l */
    public final long mo78866l() {
        return 0;
    }

    /* renamed from: m */
    public final String mo78867m() {
        return null;
    }

    /* renamed from: n */
    public final String mo78868n() {
        return "";
    }

    /* renamed from: o */
    public final boolean mo78869o() {
        return false;
    }

    /* renamed from: p */
    public final C38866g mo78870p() {
        return null;
    }

    /* renamed from: q */
    public final C38865f mo78871q() {
        return null;
    }

    /* renamed from: a */
    public final void mo78953a(C51629b bVar, int i, String str) {
        switch (bVar) {
            case RENDERING_START:
                this.f99038b.mo78877b();
                return;
            case MEDIA_ERROR:
                this.f99038b.mo78873a(0, i, str);
                return;
            case PLAY_COMPLETED:
                this.f99038b.mo78878c();
                return;
            case PREPARED:
                this.f99038b.mo78872a();
                return;
            case VIDEO_SIZE_CHANGED:
                return;
            case SEI_UPDATE:
                return;
            case BUFFERING_START:
                this.f99038b.mo78876a(true);
                return;
            case BUFFERING_END:
                this.f99038b.mo78876a(false);
                break;
        }
    }

    /* renamed from: a */
    public final void mo78852a(String str, Map<String, Object> map) throws IOException {
        this.f99037a.mo78958a(str, null, ((Boolean) map.get("stream_type")).booleanValue() ? C51630c.AUDIO : C51630c.VIDEO);
        this.f99037a.mo78954a();
    }

    /* renamed from: b */
    public final void mo78854b() {
        this.f99037a.mo78959b();
    }

    /* renamed from: c */
    public final void mo78856c() {
        this.f99037a.mo78960c();
    }

    /* renamed from: d */
    public final void mo78858d() {
        this.f99037a.mo78961d();
    }

    /* renamed from: e */
    public final void mo78859e() {
        this.f99037a.mo78962e();
    }

    /* renamed from: j */
    public final boolean mo78864j() {
        return this.f99037a.mo78963f();
    }

    /* renamed from: a */
    public final float mo78837a(int i) {
        float f = -1.0f;
        if (this.f99037a == null) {
            return -1.0f;
        }
        switch (i) {
            case 6:
                f = (float) this.f99037a.mo78964g();
                break;
            case 7:
                f = (float) this.f99037a.mo78965h();
                break;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo78842a(Surface surface) {
        this.f99037a.mo78955a(surface);
    }

    /* renamed from: a */
    public final void mo78843a(SurfaceHolder surfaceHolder) {
        this.f99037a.mo78956a(surfaceHolder);
    }

    /* renamed from: a */
    public final void mo78845a(C38862c cVar) {
        this.f99038b = cVar;
    }

    public C38889b(Context context, SparseIntArray sparseIntArray, final C50103c cVar) {
        try {
            C51624c cVar2 = new C51624c(context);
            cVar2.f128936b = false;
            cVar2.f128937c = new C51626b() {
            };
            if (sparseIntArray != null) {
                for (int i = 0; i < sparseIntArray.size(); i++) {
                    cVar2.f128938d.append(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
                }
            }
            this.f99037a = cVar2.mo105574a();
        } catch (Exception unused) {
            this.f99037a = new C38892a();
        }
        this.f99037a.mo78957a((C51628a) this);
    }
}
