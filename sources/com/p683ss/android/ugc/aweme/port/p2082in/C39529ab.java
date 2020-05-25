package com.p683ss.android.ugc.aweme.port.p2082in;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24430a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24431b;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24432c;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24436e;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24437f;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24438g;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24439h;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24440i;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24442k;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24443l;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24444m;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.json.JSONArray;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.port.in.ab */
public interface C39529ab extends C39633p {

    /* renamed from: a */
    public static final C39530a f101105a = C39530a.f101106a;

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$a */
    public static final class C39530a {

        /* renamed from: a */
        static final /* synthetic */ C39530a f101106a = new C39530a();

        private C39530a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$b */
    public interface C39531b {
        /* renamed from: a */
        C24436e mo80587a();

        /* renamed from: a */
        void mo80588a(C24440i iVar);

        /* renamed from: a */
        void mo80589a(C24444m mVar);

        /* renamed from: a */
        void mo80590a(ExtractFramesModel extractFramesModel, boolean z, String str);

        /* renamed from: a */
        void mo80591a(ExtractFramesModel extractFramesModel, boolean z, String str, String str2, long j);

        /* renamed from: a */
        void mo80592a(String str, String str2, String str3, long j);

        /* renamed from: b */
        void mo80593b();
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$c */
    public interface C39532c {
        /* renamed from: a */
        void mo80594a();

        /* renamed from: a */
        void mo80595a(int i);

        /* renamed from: a */
        void mo80596a(AppCompatActivity appCompatActivity, FrameLayout frameLayout);

        /* renamed from: a */
        void mo80597a(C24438g gVar);

        /* renamed from: a */
        void mo80598a(C24439h hVar);

        /* renamed from: a */
        void mo80599a(C24441j jVar);

        /* renamed from: a */
        void mo80600a(C24442k kVar);

        /* renamed from: a */
        void mo80601a(C24443l lVar);

        /* renamed from: a */
        void mo80602a(List<String> list);

        /* renamed from: a */
        void mo80603a(boolean z);

        /* renamed from: b */
        C42482c mo80604b(int i);

        /* renamed from: b */
        void mo80605b();

        /* renamed from: b */
        void mo80606b(boolean z);

        /* renamed from: c */
        C42482c mo80607c(int i);

        /* renamed from: c */
        void mo80608c();

        /* renamed from: d */
        int mo80609d();

        /* renamed from: e */
        void mo80610e();

        /* renamed from: f */
        void mo80611f();

        /* renamed from: h */
        void mo80612h();
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$d */
    public interface C39533d {
        /* renamed from: a */
        void mo80613a(int i, C52671b<? super C42482c, C52860x> bVar);

        /* renamed from: a */
        void mo80614a(int i, boolean z);

        /* renamed from: a */
        void mo80615a(C26846a aVar);

        /* renamed from: a */
        void mo80616a(List<? extends MusicModel> list);

        void am_();

        void an_();

        void ao_();

        /* renamed from: b */
        MusicModel mo80620b(int i);

        /* renamed from: b */
        void mo80621b(int i, boolean z);

        /* renamed from: c */
        void mo80622c(boolean z);

        int cm_();

        void cn_();

        /* renamed from: g */
        void mo80625g();

        /* renamed from: g_ */
        void mo80626g_(int i);

        /* renamed from: h */
        C1322a<?> mo80627h();
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$e */
    public interface C39534e {
        /* renamed from: a */
        void mo80628a(Exception exc);

        /* renamed from: a */
        void mo80629a(String str, C42482c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$f */
    public interface C39535f {
        /* renamed from: a */
        boolean mo80630a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$g */
    public interface C39536g {
        /* renamed from: a */
        void mo80631a(Exception exc, String str);

        /* renamed from: a */
        void mo80632a(List<C42482c> list, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$h */
    public interface C39537h {
        /* renamed from: a */
        C39537h mo80633a(C24431b bVar);

        /* renamed from: a */
        C39537h mo80634a(List<String> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$i */
    public static abstract class C39538i extends C1322a<C1352v> {
        /* renamed from: a */
        public int mo80635a() {
            return -1;
        }

        /* renamed from: a */
        public void mo80636a(int i) {
        }

        /* renamed from: a */
        public void mo80637a(int i, boolean z) {
        }

        /* renamed from: a */
        public void mo80638a(C42482c cVar) {
        }

        /* renamed from: a */
        public void mo80639a(List<C42482c> list) {
        }

        /* renamed from: b */
        public int mo80640b() {
            return -1;
        }

        /* renamed from: b */
        public void mo80641b(int i) {
        }

        /* renamed from: b */
        public void mo80642b(int i, boolean z) {
        }

        /* renamed from: c */
        public void mo80643c() {
        }

        /* renamed from: d */
        public void mo80644d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$j */
    public interface C39539j {
        /* renamed from: a */
        void mo80645a(int i, String str, JSONArray jSONArray);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$k */
    public interface C39540k {
        /* renamed from: a */
        void mo80646a();

        /* renamed from: a */
        void mo80647a(List<? extends MusicModel> list, boolean z);

        /* renamed from: b */
        void mo80648b();

        /* renamed from: c */
        void mo80649c();
    }

    /* renamed from: a */
    UrlModel mo80559a(Object obj);

    /* renamed from: a */
    C39532c mo80560a(AppCompatActivity appCompatActivity, C20347c cVar, C24430a aVar);

    /* renamed from: a */
    C39533d mo80561a(C24441j jVar);

    /* renamed from: a */
    C39535f mo80562a(C39536g gVar);

    /* renamed from: a */
    C39537h mo80563a(C24437f fVar);

    /* renamed from: a */
    C39538i mo80564a(List<C42482c> list, C24441j jVar);

    /* renamed from: a */
    AVChallenge mo80565a(Challenge challenge);

    /* renamed from: a */
    C42482c mo80566a(MusicModel musicModel);

    /* renamed from: a */
    C42482c mo80567a(String str, boolean z, int i, int i2);

    /* renamed from: a */
    C43203d mo80568a(Serializable serializable);

    /* renamed from: a */
    Object mo80569a(C43203d dVar);

    /* renamed from: a */
    List<C42482c> mo80570a(int i, String str);

    /* renamed from: a */
    List<C42482c> mo80571a(List<? extends MusicModel> list);

    /* renamed from: a */
    void mo80572a(Activity activity, int i, C24432c cVar, C52671b<? super C24434d, C52860x> bVar, C52670a<C52860x> aVar);

    /* renamed from: a */
    void mo80573a(Context context, String str, int i, boolean z, ProgressDialog progressDialog, C39534e eVar);

    /* renamed from: a */
    void mo80574a(C39540k kVar);

    /* renamed from: a */
    void mo80575a(String str, int i, C39539j jVar);

    /* renamed from: a */
    void mo80576a(boolean z);

    /* renamed from: a */
    boolean mo80577a(int i);

    /* renamed from: b */
    int mo80578b(String str);

    /* renamed from: b */
    File mo80579b();

    /* renamed from: c */
    void mo80580c();

    /* renamed from: c */
    void mo80581c(String str);

    /* renamed from: d */
    void mo80582d();

    /* renamed from: e */
    boolean mo80583e();

    /* renamed from: f */
    void mo80584f();

    /* renamed from: g */
    C39531b mo80585g();

    /* renamed from: h */
    List<MusicModel> mo80586h();
}
