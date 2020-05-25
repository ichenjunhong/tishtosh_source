package com.p683ss.android.ugc.aweme.photomovie.edit.cover;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p043v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1484bx.C24447b;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24457g;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38752b;
import com.p683ss.android.ugc.aweme.photomovie.edit.cover.C38764a.C38765a;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45564a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45566b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule */
public class PhotoMovieCoverModule implements C0183j, OnClickListener, C24457g, C45566b {

    /* renamed from: a */
    public PhotoMoviePlayerModule f98617a;

    /* renamed from: b */
    public ChooseVideoCoverView f98618b;

    /* renamed from: c */
    public C45564a f98619c;

    /* renamed from: d */
    public boolean f98620d;

    /* renamed from: e */
    private Context f98621e;

    /* renamed from: f */
    private C24456f f98622f;

    /* renamed from: g */
    private C38752b f98623g;

    /* renamed from: h */
    private C38763a f98624h;

    /* renamed from: i */
    private float f98625i;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule$a */
    public interface C38763a {
        /* renamed from: a */
        void mo78656a();

        /* renamed from: b */
        void mo78657b();
    }

    /* renamed from: a */
    public final C24456f mo50232a() {
        return this.f98622f;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void destroy() {
        if (this.f98619c != null) {
            this.f98619c.mo91860a();
        }
    }

    /* renamed from: c */
    public final void mo78721c(float f) {
        mo78722d(f);
    }

    /* renamed from: a */
    public final void mo78719a(float f) {
        this.f98620d = true;
    }

    /* renamed from: b */
    public final void mo78720b(float f) {
        this.f98617a.mo78756a((long) (((float) this.f98617a.mo78760c()) * f));
        this.f98617a.mo78759b(1);
    }

    /* renamed from: d */
    public final void mo78722d(float f) {
        long c = (long) (((float) this.f98617a.mo78760c()) * f);
        this.f98625i = ((float) (c / 100)) / 10.0f;
        this.f98617a.mo78756a(c);
        this.f98617a.mo78759b(2);
        this.f98617a.mo78755a(100, 7);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ash) {
            if (this.f98623g != null) {
                this.f98623g.mo78708b(this);
            }
            this.f98620d = false;
            this.f98624h.mo78657b();
            return;
        }
        if (id == R.id.asm) {
            this.f98617a.mo78753a().mCoverStartTm = this.f98625i;
            if (this.f98623g != null) {
                this.f98623g.mo78708b(this);
            }
            this.f98620d = false;
            this.f98624h.mo78656a();
        }
    }

    public PhotoMovieCoverModule(C0184k kVar, Context context, FrameLayout frameLayout, PhotoMoviePlayerModule photoMoviePlayerModule, C38752b bVar, C38763a aVar) {
        this.f98621e = context;
        this.f98624h = aVar;
        this.f98617a = photoMoviePlayerModule;
        this.f98623g = bVar;
        kVar.getLifecycle().mo324a(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.agb, frameLayout, false);
        this.f98622f = new C24447b(frameLayout, inflate);
        inflate.findViewById(R.id.ash).setOnClickListener(this);
        inflate.findViewById(R.id.asm).setOnClickListener(this);
        this.f98618b = (ChooseVideoCoverView) inflate.findViewById(R.id.tc);
        this.f98618b.setLayoutManager(new LinearLayoutManager(this.f98621e, 0, false));
        this.f98618b.setOnScrollListener(this);
        ((TextView) inflate.findViewById(R.id.ddn)).setText(R.string.e1o);
        this.f98622f.mo50220a((C24458h) new C24459a() {
            /* renamed from: b */
            public final void mo50221b() {
                PhotoMovieCoverModule.this.f98617a.mo78759b(2);
            }

            /* renamed from: a */
            public final void mo50217a() {
                if (PhotoMovieCoverModule.this.f98619c == null) {
                    PhotoMovieCoverModule.this.f98619c = new C45564a((C42542c) new C38766b(PhotoMovieCoverModule.this.f98617a.mo78753a().mImageList, new C38765a()), (int) PhotoMovieCoverModule.this.f98618b.getOneThumbWidth(), PhotoMovieCoverModule.this.f98618b.getMeasuredHeight());
                    PhotoMovieCoverModule.this.f98618b.setAdapter(PhotoMovieCoverModule.this.f98619c);
                }
                ChooseVideoCoverView chooseVideoCoverView = PhotoMovieCoverModule.this.f98618b;
                float width = ((float) (chooseVideoCoverView.f115138b.getWidth() * (chooseVideoCoverView.f115137a - 1))) * 0.0f;
                chooseVideoCoverView.f115138b.animate().x(width).y(chooseVideoCoverView.f115138b.getY()).setDuration(0).start();
                chooseVideoCoverView.mo91845a(width);
                PhotoMovieCoverModule.this.mo78722d(0.0f);
                ChooseVideoCoverView chooseVideoCoverView2 = PhotoMovieCoverModule.this.f98618b;
                if (chooseVideoCoverView2.f115138b != null) {
                    chooseVideoCoverView2.f115138b.setImageDrawable(new ColorDrawable(0));
                }
            }
        });
    }
}
