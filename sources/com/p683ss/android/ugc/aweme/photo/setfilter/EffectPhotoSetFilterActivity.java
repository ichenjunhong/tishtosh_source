package com.p683ss.android.ugc.aweme.photo.setfilter;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.C31475n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31663a;
import com.p683ss.android.ugc.aweme.filter.view.internal.p1751a.C31621b;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31616k;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31616k.C31617a;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31618l;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photo.PhotoView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity */
public class EffectPhotoSetFilterActivity extends AmeActivity implements OnClickListener, OnTouchListener, C31618l {

    /* renamed from: a */
    public static final int f98456a = C31617a.FILTER_CONFIRM.getValue();

    /* renamed from: b */
    public static final int f98457b = C31617a.FILTER_CANCEL.getValue();

    /* renamed from: c */
    public C31616k f98458c;

    /* renamed from: d */
    PhotoContext f98459d;

    /* renamed from: e */
    boolean f98460e;

    /* renamed from: f */
    private boolean f98461f;

    /* renamed from: g */
    private C31405ah f98462g;

    /* renamed from: h */
    private PhotoView f98463h;

    /* renamed from: i */
    private ImageView f98464i;

    /* renamed from: j */
    private int f98465j;

    /* renamed from: k */
    private C31459g f98466k;

    /* renamed from: l */
    private Handler f98467l;

    /* renamed from: m */
    private C31459g f98468m;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private JSONObject m86065a() {
        String str = "upload";
        if (this.f98459d.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new C26898j().mo54849a("is_photo", "1").mo54849a("shoot_way", str).mo54849a("position", "mid_page").mo54850a();
    }

    /* renamed from: a */
    private void m86066a(C31459g gVar) {
        String str;
        EffectCategoryResponse b = C31487c.m73327b(C39618d.m88215d(), gVar);
        if (b == null) {
            str = "";
        } else {
            str = b.getName();
        }
        C47702b.f120193a.mo94984a("select_filter", C23089d.m56640a().mo47829a("creation_id", this.f98459d.creationId).mo47829a("shoot_way", this.f98459d.mShootWay).mo47826a("draft_id", this.f98459d.draftId).mo47829a("enter_method", "click").mo47829a("enter_from", "video_shoot_page").mo47829a("filter_name", gVar.f82326c).mo47826a("filter_id", gVar.f82324a).mo47829a("tab_name", str).f61491a);
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        C52847n nVar;
        Map map;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onCreate", true);
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        this.f98460e = C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust);
        if (this.f98460e) {
            i = R.layout.d7;
        } else {
            i = R.layout.d6;
        }
        setContentView(i);
        getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
        C43303dy.m94968a((Activity) this);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f98467l = new SafeHandler(this);
        this.f98459d = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        this.f98461f = getIntent().getBooleanExtra("is_first_open_filter", true);
        if (this.f98461f) {
            i2 = 0;
        } else {
            i2 = this.f98459d.mFilterIndex;
        }
        this.f98465j = i2;
        this.f98462g = C31475n.m73310a("PhotoEditActivity");
        C31499l d = C39629l.m88232a().mo58584o().mo64334d();
        this.f98463h = (PhotoView) findViewById(R.id.bxm);
        LayoutParams layoutParams = (LayoutParams) this.f98463h.getLayoutParams();
        layoutParams.topMargin = C43303dy.m94972c(this);
        this.f98463h.setLayoutParams(layoutParams);
        this.f98463h.mo78580a(this, this.f98459d);
        C31459g a = C31487c.m73324a(C39618d.m88215d(), this.f98465j);
        this.f98466k = a;
        String a2 = C31460h.m73281a(a);
        if (this.f98460e) {
            this.f98463h.mo39864a(a2, this.f98459d.mFilterRate);
        } else {
            this.f98463h.mo39865b(a2, this.f98459d.mFilterRate);
        }
        C38709a aVar = new C38709a(this, d, new C31663a(C39629l.m88232a().mo58584o().mo64335e(), d));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.afc);
        if (this.f98460e) {
            i3 = R.layout.a6b;
        } else {
            i3 = R.layout.a6a;
        }
        boolean z = this.f98460e;
        if (this.f98460e) {
            PhotoView photoView = this.f98463h;
            photoView.getClass();
            nVar = new C52847n(new C38710b(photoView), this.f98462g);
        } else {
            nVar = null;
        }
        C31621b bVar = new C31621b(viewGroup, aVar, i3, z, nVar);
        this.f98458c = bVar;
        this.f98458c.mo64514a(a, this.f98459d.mFilterRate);
        List list = (List) C39618d.m88215d().mo64419b().getValue();
        C31616k kVar = this.f98458c;
        if (list != null) {
            map = C31483a.m73321c(list);
        } else {
            map = Collections.emptyMap();
        }
        kVar.mo64491a(map);
        this.f98458c.mo64515a((C31618l) this);
        C39618d.m88215d().mo64419b().observe(this, new C38714f(this));
        this.f98464i = (ImageView) findViewById(R.id.af5);
        this.f98464i.setOnClickListener(this);
        this.f98464i.setOnTouchListener(this);
        if (VERSION.SDK_INT >= 21) {
            Slide slide = new Slide();
            slide.setDuration(300);
            getWindow().setEnterTransition(slide);
            getWindow().setReturnTransition(slide);
            this.f98467l.post(new C38711c(this, a));
        } else {
            this.f98467l.post(new C38712d(this, a));
        }
        m86066a(a);
        d.mo64411a(false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity", "onCreate", false);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (view != null) {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f}).start();
            }
            if (this.f98466k != null) {
                String a = C31460h.m73281a(this.f98466k);
                if (this.f98460e) {
                    this.f98463h.mo39864a(a, 0.0f);
                } else {
                    this.f98463h.mo39865b(a, 0.0f);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (view != null) {
                ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f}).start();
            }
            if (this.f98466k != null) {
                String a2 = C31460h.m73281a(this.f98466k);
                if (this.f98460e) {
                    this.f98463h.mo39864a(a2, this.f98459d.mFilterRate);
                } else {
                    this.f98463h.mo39865b(a2, this.f98459d.mFilterRate);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64517a(C31459g gVar, float f, C31459g gVar2, float f2, C31617a aVar) {
        String str;
        if (aVar == C31617a.FILTER_CANCEL) {
            gVar = gVar2;
        }
        if (aVar == C31617a.FILTER_CANCEL) {
            f = f2;
        }
        int a = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
        this.f98466k = gVar;
        this.f98459d.mFilterIndex = a;
        if (gVar != null) {
            this.f98459d.mFilterName = gVar.f82326c;
            this.f98459d.mFilterId = gVar.f82324a;
        }
        this.f98459d.mFilterRate = f;
        String a2 = C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(a));
        if (this.f98460e) {
            this.f98463h.mo39864a(a2, this.f98459d.mFilterRate);
        } else {
            this.f98463h.mo39865b(a2, this.f98459d.mFilterRate);
        }
        if (aVar == C31617a.FILTER_CONFIRM || aVar == C31617a.FILTER_CANCEL) {
            if (aVar == C31617a.FILTER_CONFIRM) {
                C26890h.onEvent(new MobClick().setLabelName("mid_page").setEventName("filter_confirm").setJsonObject(m86065a()));
            }
            Intent intent = new Intent();
            intent.putExtra("photo_model", this.f98459d);
            intent.putExtra("set_filter_result", aVar.getValue());
            setResult(-1, intent);
            if (VERSION.SDK_INT >= 21) {
                finishAfterTransition();
            } else {
                finish();
            }
        } else if (aVar == C31617a.FILTER_RATE_CONFIRM) {
            C26890h.m65008a((Context) this, "filter_strength", "mid_page", String.valueOf((int) (this.f98459d.mFilterRate * 100.0f)), "0", m86065a());
        } else if (aVar == C31617a.FILTER_SELECTED_CHANGE) {
            JSONObject a3 = m86065a();
            String str2 = "filter_name";
            if (gVar != null) {
                try {
                    str = gVar.f82326c;
                } catch (JSONException unused) {
                }
            } else {
                str = "";
            }
            a3.put(str2, str);
            C26890h.m65008a((Context) this, "filter_click", "mid_page", "0", "0", a3);
            m86066a(gVar);
            if (this.f98460e && this.f98468m != null) {
                C31459g gVar3 = this.f98468m;
                C31405ah ahVar = this.f98462g;
                PhotoView photoView = this.f98463h;
                photoView.getClass();
                C47702b.f120193a.mo94984a("adjust_filter_complete", C42438az.m93209a().mo86526a("enter_from", "video_edit_page").mo86526a("creation_id", this.f98459d.creationId).mo86526a("shoot_way", this.f98459d.mShootWay).mo86523a("draft_id", this.f98459d.draftId).mo86523a("filter_id", this.f98468m.f82324a).mo86526a("filter_name", this.f98468m.f82325b).mo86525a("value", (Object) Float.valueOf(C31460h.m73279a(gVar3, ahVar, (C31406ai) new C38713e(photoView)))).f107329a);
            }
            this.f98468m = gVar;
        }
    }
}
