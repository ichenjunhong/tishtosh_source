package com.p683ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.medialib.photomovie.PhotoMoviePlayer;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38752b;
import com.p683ss.android.ugc.aweme.photomovie.edit.C38753c;
import com.p683ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule;
import com.p683ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule;
import com.p683ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule;
import com.p683ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule.C38780a;
import com.p683ss.android.ugc.aweme.photomovie.edit.p2049a.C38749a;
import com.p683ss.android.ugc.aweme.photomovie.edit.p2049a.C38751b;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.C38795b;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerPresenter;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43650k;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43650k.C43653a;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45205n;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46798a;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46801b;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46805f;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.gamora.editor.p2459a.C49066a;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity */
public class PhotoMovieEditActivity extends AmeActivity implements OnClickListener, C38780a, C45205n {

    /* renamed from: a */
    public C42482c f98516a;

    /* renamed from: b */
    protected boolean f98517b;

    /* renamed from: c */
    FrameLayout f98518c;

    /* renamed from: d */
    C38752b f98519d;

    /* renamed from: e */
    public PhotoMoviePlayerModule f98520e;

    /* renamed from: f */
    public PhotoMovieCoverModule f98521f;

    /* renamed from: g */
    PhotoMovieChangeModule f98522g;

    /* renamed from: h */
    PhotoMovieMusicModule f98523h;

    /* renamed from: i */
    public C38751b f98524i;

    /* renamed from: j */
    public C43650k f98525j;

    /* renamed from: k */
    private TextView f98526k;

    /* renamed from: l */
    private TextView f98527l;

    /* renamed from: m */
    private FrameLayout f98528m;

    /* renamed from: n */
    private RelativeLayout f98529n;

    /* renamed from: o */
    private TextView f98530o;

    /* renamed from: p */
    private PhotoMovieContext f98531p;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        m86077a(false);
        super.finish();
    }

    public void onDestroy() {
        m86077a(false);
        super.onDestroy();
    }

    /* renamed from: a */
    public final boolean mo78676a() {
        return this.f98517b;
    }

    public void onBackPressed() {
        findViewById(R.id.asg).performClick();
    }

    /* renamed from: a */
    private void m86077a(boolean z) {
        this.f98517b = z;
    }

    /* renamed from: a */
    public final void mo78674a(int i) {
        if (i == 0) {
            this.f98530o.setText(getString(R.string.e1m));
            this.f98530o.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ak4), null, null);
            return;
        }
        this.f98530o.setText(getString(R.string.e1n));
        this.f98530o.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.ak5), null, null);
    }

    public void onClick(View view) {
        C46801b bVar;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.dc4) {
            PhotoMovieContext a = this.f98520e.mo78753a();
            a.setVideoLength((int) this.f98520e.mo78760c());
            a.mFilterId = this.f98524i.mo78705c().f82324a;
            a.mFilterName = this.f98524i.mo78705c().f82326c;
            if (a == null) {
                bVar = C38735a.f98561a;
            } else {
                bVar = new C46801b(a) {

                    /* renamed from: a */
                    final /* synthetic */ BaseShortVideoContext f98563a;

                    {
                        this.f98563a = r1;
                    }

                    /* renamed from: a */
                    public final String mo78695a(C46805f fVar) {
                        switch (C387405.f98565a[fVar.ordinal()]) {
                            case 1:
                                return this.f98563a.getMainBusinessData();
                            case 2:
                                return this.f98563a.socialData;
                            case 3:
                                return this.f98563a.poiData;
                            case 4:
                                return this.f98563a.commerceData;
                            case 5:
                                return this.f98563a.ugData;
                            case 6:
                                return this.f98563a.techData;
                            case 7:
                                return this.f98563a.globalData;
                            default:
                                return null;
                        }
                    }
                };
            }
            C46806g.m101653a(bVar, (C46798a) new C46798a(a) {

                /* renamed from: a */
                final /* synthetic */ BaseShortVideoContext f98564a;

                {
                    this.f98564a = r1;
                }

                /* renamed from: a */
                public final void mo78696a(C46805f fVar, String str) {
                    switch (C387405.f98565a[fVar.ordinal()]) {
                        case 1:
                            this.f98564a.setMainBusinessData(str);
                            return;
                        case 2:
                            this.f98564a.socialData = str;
                            return;
                        case 3:
                            this.f98564a.poiData = str;
                            return;
                        case 4:
                            this.f98564a.commerceData = str;
                            return;
                        case 5:
                            this.f98564a.ugData = str;
                            return;
                        case 6:
                            this.f98564a.techData = str;
                            return;
                        case 7:
                            this.f98564a.globalData = str;
                            break;
                    }
                }
            }, C46804e.EDIT, C46804e.PUBLISH);
            C44403a.m97196a().mo48299a((Activity) this, a, 1);
            return;
        }
        if (id == R.id.asg || id == R.id.cyx) {
            if (this.f98520e.mo78753a().mFrom == 1 || this.f98520e.mo78753a().mFrom == 2) {
                new C10643a(this).mo18902b(getResources().getString(R.string.e1q)).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.ah2, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PhotoMovieEditActivity.this.finish();
                        C43214dh.m94817a().mo50200a(PhotoMovieEditActivity.this.f98516a);
                    }
                }).mo18897a().mo18882b().show();
            } else {
                C39618d.f101149M.mo78421a(this, this.f98520e.mo78753a());
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2 = 1;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ag2);
        m86077a(true);
        getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
        C43303dy.m94968a((Activity) this);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(-16777216);
        }
        getWindow().getDecorView().setBackgroundColor(-16777216);
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) getIntent().getParcelableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE);
        if (photoMovieContext == null || C50201e.m108355a(photoMovieContext.mImageList)) {
            C10691a.m21545b((Context) this, getString(R.string.ayw)).mo19066a();
            photoMovieContext = null;
        } else {
            if (photoMovieContext.mImageList != null && photoMovieContext.mImageList.size() <= 2) {
                photoMovieContext.mImageList.add(photoMovieContext.mImageList.get(0));
            }
            List<C42482c> list = (List) getIntent().getSerializableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE_MUSIC_LIST);
            if (list == null) {
                list = new ArrayList<>();
            }
            photoMovieContext.mMusicList = list;
            if (!photoMovieContext.mIsFromDraft && photoMovieContext.mMusic == null && photoMovieContext.mMusicList.size() > 0) {
                photoMovieContext.mMusic = (C42482c) photoMovieContext.mMusicList.get(0);
            }
        }
        this.f98531p = photoMovieContext;
        if (this.f98531p == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onCreate", false);
            return;
        }
        PhotoMovieContext photoMovieContext2 = this.f98531p;
        this.f98528m = (FrameLayout) findViewById(R.id.b7b);
        this.f98518c = (FrameLayout) findViewById(R.id.b73);
        this.f98529n = (RelativeLayout) findViewById(R.id.bxq);
        this.f98526k = (TextView) findViewById(R.id.dc2);
        this.f98530o = (TextView) findViewById(R.id.dc1);
        this.f98527l = (TextView) findViewById(R.id.dc3);
        FrameLayout frameLayout = (FrameLayout) this.f98528m.findViewById(R.id.bxr);
        LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
        layoutParams.topMargin = ((int) C20141b.m49696a((Context) this, 20.0f)) + C43303dy.m94972c(this);
        frameLayout.setLayoutParams(layoutParams);
        this.f98526k.setOnClickListener(new C38745c(this, photoMovieContext2));
        if (C49066a.m105887a(this)) {
            if (C47842ed.m103485a(this)) {
                findViewById(R.id.dc4).setBackground(getResources().getDrawable(R.drawable.ccc));
            } else {
                findViewById(R.id.dc4).setBackground(getResources().getDrawable(R.drawable.ccb));
            }
        }
        findViewById(R.id.dc4).setOnClickListener(this);
        this.f98527l.setOnClickListener(new C38746d(this, photoMovieContext2));
        findViewById(R.id.asg).setOnClickListener(this);
        findViewById(R.id.cyx).setOnClickListener(this);
        if (photoMovieContext2.mIsFromDraft) {
            findViewById(R.id.cyx).setVisibility(0);
        }
        findViewById(R.id.asg).setOnClickListener(this);
        this.f98530o.setOnClickListener(new C38747e(this));
        mo78674a(photoMovieContext2.mPlayType);
        if (photoMovieContext2.mMusic == null) {
            i = R.drawable.a_d;
        } else {
            i = R.drawable.ak3;
        }
        this.f98527l.setCompoundDrawablesWithIntrinsicBounds(0, i, 0, 0);
        this.f98520e = new PhotoMoviePlayerModule(this, this.f98528m, this.f98531p);
        this.f98524i = new C38749a(this, this.f98520e, this.f98529n, this.f98518c);
        this.f98524i.mo78703a(new C26898j().mo54849a("is_photo", "0").mo54849a("position", "mid_page").mo54849a("media_type", "pic_movie").mo54850a());
        this.f98519d = new C38753c(this.f98520e, this.f98524i);
        this.f98525j = new C43650k(this.f98528m, this, this, this.f98524i.mo78705c());
        this.f98525j.mo88990a(1);
        this.f98525j.f110556b = new C43653a() {
            /* renamed from: a */
            public final void mo78603a(C31459g gVar) {
                PhotoMovieEditActivity.this.f98524i.mo78701a(gVar);
                PhotoMoviePlayerPresenter photoMoviePlayerPresenter = PhotoMovieEditActivity.this.f98520e.f98705a;
                String str = gVar.f82331h;
                photoMoviePlayerPresenter.f98708a.mo40164a(str);
                photoMoviePlayerPresenter.f98709b.mFilterPath = str;
                photoMoviePlayerPresenter.f98709b.mFilterName = gVar.f82326c;
                photoMoviePlayerPresenter.f98709b.mFilterId = gVar.f82324a;
            }

            /* renamed from: a */
            public final void mo78604a(C31459g gVar, C31459g gVar2, float f) {
                PhotoMoviePlayerModule photoMoviePlayerModule = PhotoMovieEditActivity.this.f98520e;
                String str = gVar.f82331h;
                String str2 = gVar2.f82331h;
                PhotoMoviePlayer photoMoviePlayer = photoMoviePlayerModule.f98705a.f98708a;
                photoMoviePlayer.nativeSetFilter(photoMoviePlayer.f53514a, str, str2, f);
            }
        };
        this.f98524i.mo78702a(this.f98525j);
        ((C38795b) this.f98520e.f98706b).f98718a = new C24459a() {
            /* renamed from: a */
            public final void mo50217a() {
                super.mo50217a();
                if (PhotoMovieEditActivity.this.f98525j != null) {
                    PhotoMovieEditActivity.this.f98525j.f110560f = false;
                }
            }

            /* renamed from: d */
            public final void mo50225d() {
                super.mo50225d();
                if (PhotoMovieEditActivity.this.f98525j != null) {
                    PhotoMovieEditActivity.this.f98525j.f110560f = true;
                }
            }
        };
        String str = "enter_video_edit_page";
        C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f98531p.creationId).mo47829a("shoot_way", this.f98531p.mShootWay).mo47826a("draft_id", this.f98531p.draftId).mo47829a("content_type", "slideshow").mo47829a("content_source", "upload").mo47829a("filter_list", this.f98524i.mo78705c().f82326c).mo47826a("filter_id_list", this.f98524i.mo78705c().f82324a).mo47826a("video_cnt", 0).mo47826a("pic_cnt", this.f98531p.mRealImageCount).mo47829a("music_selected_from", this.f98531p.musicOrigin);
        String str2 = "is_multi_content";
        if (this.f98531p.mRealImageCount <= 1) {
            i2 = 0;
        }
        C26890h.m65011a(str, a.mo47826a(str2, i2).mo47829a("mix_type", C45624b.m99356a(0, this.f98531p.mRealImageCount)).f61491a);
        long longExtra = getIntent().getLongExtra("extra_start_enter_edit_page", 0);
        if (longExtra > 0) {
            C47702b.f120193a.mo94984a("tool_performance_edit_first_frame", C23089d.m56640a().mo47827a("first_frame_duration", System.currentTimeMillis() - longExtra).mo47829a("creation_id", this.f98531p.creationId).mo47828a("is_fast_import", (Object) Boolean.valueOf(false)).mo47829a("content_type", "slideshow").mo47829a("content_source", "upload").mo47828a("is_hardcode", (Object) Boolean.valueOf(false)).mo47829a("resolution", C40797m.m90253h()).mo47828a("bite_rate", (Object) Float.valueOf(C40797m.m90249d())).mo47826a("video_quality", C40797m.m90251f()).f61491a);
        }
        this.f98516a = C43214dh.m94817a().mo50201b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo78675a(String str, C42482c cVar, String str2) {
        this.f98531p.musicOrigin = str;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            PhotoMovieContext photoMovieContext = (PhotoMovieContext) intent.getParcelableExtra(IPhotoMovieService.EXTRA_DATA_PHOTO_MOVIE);
            if (photoMovieContext != null) {
                this.f98520e.mo78753a().title = photoMovieContext.title;
                this.f98520e.mo78753a().structList = photoMovieContext.structList;
                this.f98520e.mo78753a().isPrivate = photoMovieContext.isPrivate;
                this.f98520e.mo78753a().challenges = photoMovieContext.challenges;
                this.f98520e.mo78753a().poiId = photoMovieContext.poiId;
                this.f98520e.mo78753a().mFinalVideoTmpPath = photoMovieContext.mFinalVideoTmpPath;
                this.f98520e.mo78753a().mCoverStartTm = photoMovieContext.mCoverStartTm;
            }
        }
    }
}
