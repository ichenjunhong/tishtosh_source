package com.p683ss.android.ugc.aweme.photomovie.edit.music;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0183j;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24432c;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.p1484bx.C24447b;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24457g;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38752b;
import com.p683ss.android.ugc.aweme.photomovie.edit.music.C38782b.C38786c;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.C38794a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule */
public class PhotoMovieMusicModule implements C0183j, OnClickListener, C24457g, C38786c {

    /* renamed from: a */
    public AmeActivity f98670a;

    /* renamed from: b */
    public C38794a f98671b;

    /* renamed from: c */
    public TextView f98672c;

    /* renamed from: d */
    public C42482c f98673d;

    /* renamed from: e */
    public String f98674e;

    /* renamed from: f */
    private C24456f f98675f;

    /* renamed from: g */
    private C38752b f98676g;

    /* renamed from: h */
    private final C38780a f98677h;

    /* renamed from: i */
    private C38782b f98678i;

    /* renamed from: j */
    private String f98679j;

    /* renamed from: k */
    private String f98680k;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule$a */
    public interface C38780a {
        /* renamed from: a */
        void mo78675a(String str, C42482c cVar, String str2);
    }

    /* renamed from: a */
    public final C24456f mo50232a() {
        return this.f98675f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo78741a(C24434d dVar) {
        if (this.f98677h != null) {
            this.f98677h.mo78675a(dVar.f64819b, dVar.f64820c, dVar.f64821d);
        }
        C42482c cVar = dVar.f64820c;
        m86160b(cVar, dVar.f64821d);
        if (this.f98678i != null) {
            C38782b bVar = this.f98678i;
            if (!C9376b.m18558a((Collection<T>) bVar.f98690b) && bVar.f98690b.size() > 0) {
                bVar.f98690b.set(0, new C38781a(cVar));
                bVar.mo78746b(0);
            }
        }
        return null;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ash) {
            C42482c cVar = this.f98671b.mo78753a().mMusic;
            if (cVar != null && this.f98673d != null && (cVar.getMid() == null || !TextUtils.equals(cVar.getMid(), this.f98673d.getMid()))) {
                m86160b(this.f98673d, this.f98674e);
                C42482c cVar2 = this.f98673d;
                if (this.f98678i != null && cVar2 != null) {
                    C38782b bVar = this.f98678i;
                    int i = 1;
                    while (true) {
                        if (i >= bVar.f98690b.size()) {
                            break;
                        } else if (((C38781a) bVar.f98690b.get(i)).f98686c.getMid().equals(cVar2.getMid())) {
                            bVar.mo78746b(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            this.f98676g.mo78708b(this);
            return;
        }
        if (id == R.id.asm) {
            this.f98676g.mo78708b(this);
        }
    }

    /* renamed from: b */
    private void m86160b(final C42482c cVar, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f98672c, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(100);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                PhotoMovieMusicModule.this.f98672c.setText(PhotoMovieMusicModule.this.f98670a.getString(R.string.e1t, new Object[]{cVar.getMusicName()}));
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f98672c, "alpha", new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).after(ofFloat);
        animatorSet.start();
        this.f98671b.mo78757a(cVar, str);
    }

    /* renamed from: a */
    public final void mo78742a(C42482c cVar, String str) {
        if (cVar == null && str == null) {
            C39529ab abVar = C39618d.f101168i;
            AmeActivity ameActivity = this.f98670a;
            C24432c cVar2 = new C24432c(this.f98670a.getString(R.string.zr), 0, false, null, this.f98679j, this.f98680k);
            abVar.mo80572a(ameActivity, 1, cVar2, new C38791g(this), null);
            return;
        }
        m86160b(cVar, str);
    }

    public PhotoMovieMusicModule(AmeActivity ameActivity, FrameLayout frameLayout, C38794a aVar, C38752b bVar, C38780a aVar2, String str, String str2) {
        String str3;
        ameActivity.getLifecycle().mo324a(this);
        this.f98670a = ameActivity;
        this.f98679j = str;
        this.f98680k = str2;
        this.f98671b = aVar;
        this.f98676g = bVar;
        this.f98677h = aVar2;
        View inflate = LayoutInflater.from(this.f98670a).inflate(R.layout.agc, frameLayout, false);
        this.f98675f = new C24447b(frameLayout, inflate);
        this.f98675f.mo50220a((C24458h) new C24459a() {
            /* renamed from: a */
            public final void mo50217a() {
                super.mo50217a();
                PhotoMovieMusicModule.this.f98673d = PhotoMovieMusicModule.this.f98671b.mo78753a().mMusic;
                PhotoMovieMusicModule.this.f98674e = PhotoMovieMusicModule.this.f98671b.mo78753a().mMusicPath;
            }
        });
        inflate.findViewById(R.id.ash).setOnClickListener(this);
        inflate.findViewById(R.id.asm).setOnClickListener(this);
        ((TextView) inflate.findViewById(R.id.ddn)).setText(R.string.e1p);
        this.f98672c = (TextView) inflate.findViewById(R.id.ddm);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.cah);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f98670a, 0, false));
        PhotoMovieContext a = this.f98671b.mo78753a();
        this.f98678i = new C38782b(a.mMusicList, a.mMusic);
        recyclerView.setAdapter(this.f98678i);
        TextView textView = this.f98672c;
        AmeActivity ameActivity2 = this.f98670a;
        Object[] objArr = new Object[1];
        if (a.mMusic == null) {
            str3 = "";
        } else {
            str3 = a.mMusic.getMusicName();
        }
        objArr[0] = str3;
        textView.setText(ameActivity2.getString(R.string.e1t, objArr));
    }
}
