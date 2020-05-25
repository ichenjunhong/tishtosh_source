package com.p683ss.android.ugc.aweme.player.sdk.p2054a;

import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2494c.C50110b;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.model.VideoModel;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e */
public interface C38859e {

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e$a */
    public static class C38860a implements C38862c {
        /* renamed from: a */
        public final void mo78872a() {
        }

        /* renamed from: a */
        public final void mo78873a(int i, int i2, Object obj) {
        }

        /* renamed from: a */
        public final void mo78874a(long j) {
        }

        /* renamed from: a */
        public final void mo78875a(Resolution resolution, int i) {
        }

        /* renamed from: a */
        public final void mo78876a(boolean z) {
        }

        /* renamed from: b */
        public final void mo78877b() {
        }

        /* renamed from: c */
        public final void mo78878c() {
        }

        /* renamed from: d */
        public final void mo78879d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e$b */
    public interface C38861b {
        /* renamed from: a */
        boolean mo78880a(Surface surface);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e$c */
    public interface C38862c {
        /* renamed from: a */
        void mo78872a();

        /* renamed from: a */
        void mo78873a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo78874a(long j);

        /* renamed from: a */
        void mo78875a(Resolution resolution, int i);

        /* renamed from: a */
        void mo78876a(boolean z);

        /* renamed from: b */
        void mo78877b();

        /* renamed from: c */
        void mo78878c();

        /* renamed from: d */
        void mo78879d();
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e$d */
    public static class C38863d {

        /* renamed from: a */
        public long f98961a;

        /* renamed from: b */
        public long f98962b;

        /* renamed from: c */
        public long f98963c;

        /* renamed from: d */
        public long f98964d;

        /* renamed from: e */
        public long f98965e;

        /* renamed from: f */
        public long f98966f;

        /* renamed from: g */
        public long f98967g;
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e$e */
    public static class C38864e {

        /* renamed from: a */
        public Resolution f98968a;

        /* renamed from: b */
        public int f98969b;

        public C38864e(Resolution resolution, int i) {
            this.f98968a = resolution;
            this.f98969b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e$f */
    public static class C38865f {

        /* renamed from: a */
        public volatile int f98970a;

        /* renamed from: b */
        public volatile int f98971b;

        /* renamed from: c */
        public volatile int f98972c;

        /* renamed from: d */
        public volatile int f98973d;

        /* renamed from: e */
        public volatile int f98974e;

        /* renamed from: f */
        public volatile long f98975f;

        /* renamed from: g */
        public volatile C38863d f98976g;

        /* renamed from: h */
        public volatile VideoModel f98977h;
    }

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.e$g */
    public static class C38866g {

        /* renamed from: a */
        public String f98978a;

        /* renamed from: b */
        public Bundle f98979b;
    }

    /* renamed from: a */
    float mo78837a(int i);

    /* renamed from: a */
    void mo78838a();

    /* renamed from: a */
    void mo78839a(float f);

    /* renamed from: a */
    void mo78840a(float f, float f2);

    /* renamed from: a */
    void mo78841a(long j);

    /* renamed from: a */
    void mo78842a(Surface surface);

    /* renamed from: a */
    void mo78843a(SurfaceHolder surfaceHolder);

    /* renamed from: a */
    void mo78844a(C38857c cVar);

    /* renamed from: a */
    void mo78845a(C38862c cVar);

    /* renamed from: a */
    void mo78846a(C38868g gVar);

    /* renamed from: a */
    void mo78847a(C38870i iVar);

    /* renamed from: a */
    void mo78848a(C50101a aVar);

    /* renamed from: a */
    void mo78849a(C50110b bVar, Map<String, Object> map) throws IOException;

    /* renamed from: a */
    void mo78850a(String str);

    /* renamed from: a */
    void mo78851a(String str, C38856b bVar);

    /* renamed from: a */
    void mo78852a(String str, Map<String, Object> map) throws IOException;

    /* renamed from: a */
    void mo78853a(boolean z);

    /* renamed from: b */
    void mo78854b();

    /* renamed from: b */
    void mo78855b(boolean z);

    /* renamed from: c */
    void mo78856c();

    /* renamed from: c */
    boolean mo78857c(boolean z);

    /* renamed from: d */
    void mo78858d();

    /* renamed from: e */
    void mo78859e();

    /* renamed from: f */
    boolean mo78860f();

    /* renamed from: g */
    boolean mo78861g();

    /* renamed from: h */
    boolean mo78862h();

    /* renamed from: i */
    boolean mo78863i();

    /* renamed from: j */
    boolean mo78864j();

    /* renamed from: k */
    long mo78865k();

    /* renamed from: l */
    long mo78866l();

    /* renamed from: m */
    String mo78867m();

    /* renamed from: n */
    String mo78868n();

    /* renamed from: o */
    boolean mo78869o();

    /* renamed from: p */
    C38866g mo78870p();

    /* renamed from: q */
    C38865f mo78871q();
}
