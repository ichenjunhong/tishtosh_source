package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2325c;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.views.C48216n;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import com.p683ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b */
public final class C46493b extends Dialog {

    /* renamed from: c */
    public static final C46494a f117325c = new C46494a(null);

    /* renamed from: a */
    public AnimatedImageView f117326a;

    /* renamed from: b */
    public Handler f117327b;

    /* renamed from: d */
    private AVLoadingLayout f117328d;

    /* renamed from: e */
    private KeepSurfaceTextureView f117329e;

    /* renamed from: f */
    private VideoViewComponent f117330f;

    /* renamed from: g */
    private AVTextView f117331g;

    /* renamed from: h */
    private Video f117332h;

    /* renamed from: i */
    private C46500d f117333i;

    /* renamed from: j */
    private final Effect f117334j;

    /* renamed from: k */
    private final C46492a f117335k;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b$a */
    public static final class C46494a {
        private C46494a() {
        }

        public /* synthetic */ C46494a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b$b */
    public static final class C46495b implements C50161j {

        /* renamed from: a */
        final /* synthetic */ C46493b f117336a;

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        public final void aD_() {
            if (this.f117336a.f117326a != null) {
                AnimatedImageView animatedImageView = this.f117336a.f117326a;
                if (animatedImageView == null) {
                    C52711k.m112234a();
                }
                animatedImageView.setVisibility(0);
            }
        }

        C46495b(C46493b bVar) {
            this.f117336a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b$c */
    public static final class C46496c extends C46500d {

        /* renamed from: a */
        final /* synthetic */ C46493b f117337a;

        C46496c(C46493b bVar) {
            this.f117337a = bVar;
        }

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            C52711k.m112240b(dVar, "error");
            this.f117337a.mo93237a(false);
            if (this.f117337a.f117326a != null) {
                AnimatedImageView animatedImageView = this.f117337a.f117326a;
                if (animatedImageView == null) {
                    C52711k.m112234a();
                }
                animatedImageView.setVisibility(0);
            }
        }

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            C52711k.m112240b(gVar, "sourceId");
            this.f117337a.mo93237a(false);
            if (this.f117337a.f117326a != null) {
                AnimatedImageView animatedImageView = this.f117337a.f117326a;
                if (animatedImageView == null) {
                    C52711k.m112234a();
                }
                animatedImageView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b$d */
    static final class C46497d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46493b f117338a;

        C46497d(C46493b bVar) {
            this.f117338a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f117338a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.b$e */
    static final class C46498e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46493b f117339a;

        C46498e(C46493b bVar) {
            this.f117339a = bVar;
        }

        public final void run() {
            this.f117339a.mo93237a(false);
        }
    }

    public final void dismiss() {
        if (this.f117330f != null) {
            if (this.f117333i != null) {
                VideoViewComponent videoViewComponent = this.f117330f;
                if (videoViewComponent == null) {
                    C52711k.m112234a();
                }
                videoViewComponent.mo60226b((C38871j) this.f117333i);
            }
            VideoViewComponent videoViewComponent2 = this.f117330f;
            if (videoViewComponent2 == null) {
                C52711k.m112234a();
            }
            videoViewComponent2.mo97919b();
        }
        C46499c.m100926a(this);
    }

    public final void show() {
        if (this.f117334j != null) {
            C23543g a = C23541e.m57714a(C39629l.m88233b(), C39630m.m88234a().mo58623u().mo74236a());
            String a2 = a.mo48703a("pixaloop_show", "");
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(this.f117334j.getEffectId());
            sb.append(",");
            a.mo48709b("pixaloop_show", sb.toString());
        }
        super.show();
    }

    /* renamed from: a */
    public final void mo93237a(boolean z) {
        int i;
        if (this.f117328d != null) {
            AVLoadingLayout aVLoadingLayout = this.f117328d;
            if (aVLoadingLayout == null) {
                C52711k.m112234a();
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            aVLoadingLayout.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        setContentView(R.layout.a81);
        Window window = getWindow();
        if (window == null) {
            C52711k.m112234a();
        }
        LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            C52711k.m112234a();
        }
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        C52711k.m112236a((Object) paint, "drawable.paint");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            C52711k.m112234a();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(true);
        findViewById(R.id.cfl).setOnClickListener(new C46497d(this));
        if (this.f117335k != null) {
            C46492a aVar = this.f117335k;
            if (TextUtils.isEmpty(aVar.mo93236b()) || TextUtils.isEmpty(aVar.mo93235a())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f117329e = (KeepSurfaceTextureView) findViewById(R.id.dqi);
                this.f117326a = (AnimatedImageView) findViewById(R.id.b1m);
                this.f117328d = (AVLoadingLayout) findViewById(R.id.bhy);
                this.f117331g = (AVTextView) findViewById(R.id.a03);
                View findViewById = findViewById(R.id.dpf);
                if (VERSION.SDK_INT >= 21) {
                    C52711k.m112236a((Object) findViewById, "videoLayout");
                    AnimatedImageView animatedImageView = this.f117326a;
                    if (animatedImageView == null) {
                        C52711k.m112234a();
                    }
                    findViewById.setOutlineProvider(new C48216n((int) C9432q.m18687b(animatedImageView.getContext(), 4.0f)));
                    findViewById.setClipToOutline(true);
                }
                View findViewById2 = findViewById(R.id.bjw);
                Drawable a = C42430at.m93196a(-1, -1, 0, (int) C9432q.m18687b(getContext(), 4.0f));
                C52711k.m112236a((Object) findViewById2, "rootLayout");
                findViewById2.setBackground(a);
                Drawable a2 = C42430at.m93196a(303437859, 303437859, 0, 0);
                Context context = getContext();
                C52711k.m112236a((Object) context, "context");
                C13833a a3 = new C13834b(context.getResources()).mo25912a();
                a3.mo25904b(a2);
                a3.mo25909c(a2);
                AnimatedImageView animatedImageView2 = this.f117326a;
                if (animatedImageView2 == null) {
                    C52711k.m112234a();
                }
                animatedImageView2.setHierarchy(a3);
                if (this.f117335k != null) {
                    if (!TextUtils.isEmpty(this.f117335k.mo93236b())) {
                        C50181a.m108292a((SimpleDraweeView) this.f117326a, this.f117335k.mo93236b());
                    }
                    if (TextUtils.isEmpty(this.f117335k.f117323c)) {
                        AVTextView aVTextView = this.f117331g;
                        if (aVTextView == null) {
                            C52711k.m112234a();
                        }
                        aVTextView.setVisibility(8);
                    } else {
                        AVTextView aVTextView2 = this.f117331g;
                        if (aVTextView2 == null) {
                            C52711k.m112234a();
                        }
                        aVTextView2.setVisibility(0);
                        AVTextView aVTextView3 = this.f117331g;
                        if (aVTextView3 == null) {
                            C52711k.m112234a();
                        }
                        aVTextView3.setText(this.f117335k.f117323c);
                    }
                }
                this.f117333i = new C46496c(this);
                KeepSurfaceTextureView keepSurfaceTextureView = this.f117329e;
                if (keepSurfaceTextureView == null) {
                    C52711k.m112234a();
                }
                C50160i a4 = C50160i.m108259a(keepSurfaceTextureView);
                this.f117330f = new VideoViewComponent();
                VideoViewComponent videoViewComponent = this.f117330f;
                if (videoViewComponent == null) {
                    C52711k.m112234a();
                }
                KeepSurfaceTextureView keepSurfaceTextureView2 = this.f117329e;
                if (keepSurfaceTextureView2 == null) {
                    C52711k.m112234a();
                }
                videoViewComponent.mo97917a(keepSurfaceTextureView2);
                VideoViewComponent videoViewComponent2 = this.f117330f;
                if (videoViewComponent2 == null) {
                    C52711k.m112234a();
                }
                videoViewComponent2.mo60207a((C38871j) this.f117333i);
                a4.mo97950a((C50161j) new C46495b(this));
                if (this.f117330f != null) {
                    if (this.f117335k == null || TextUtils.isEmpty(this.f117335k.mo93235a())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if (this.f117332h == null) {
                            this.f117332h = new Video();
                            VideoUrlModel videoUrlModel = new VideoUrlModel();
                            videoUrlModel.setH265(false);
                            ArrayList arrayList = new ArrayList();
                            C46492a aVar2 = this.f117335k;
                            if (aVar2 == null) {
                                C52711k.m112234a();
                            }
                            String a5 = aVar2.mo93235a();
                            if (a5 == null) {
                                C52711k.m112234a();
                            }
                            arrayList.add(a5);
                            videoUrlModel.setUrlList(arrayList);
                            videoUrlModel.setUrlKey(this.f117335k.f117322b);
                            videoUrlModel.setUri(this.f117335k.f117322b);
                            Video video = this.f117332h;
                            if (video == null) {
                                C52711k.m112234a();
                            }
                            video.setPlayAddr(videoUrlModel);
                            Video video2 = this.f117332h;
                            if (video2 == null) {
                                C52711k.m112234a();
                            }
                            video2.setSourceId(this.f117335k.f117322b);
                        }
                        mo93237a(true);
                        VideoViewComponent videoViewComponent3 = this.f117330f;
                        if (videoViewComponent3 == null) {
                            C52711k.m112234a();
                        }
                        Video video3 = this.f117332h;
                        if (video3 == null) {
                            C52711k.m112234a();
                        }
                        videoViewComponent3.mo60204a(video3);
                        if (this.f117327b != null) {
                            Handler handler = this.f117327b;
                            if (handler == null) {
                                C52711k.m112234a();
                            }
                            handler.postDelayed(new C46498e(this), 5000);
                        }
                    }
                }
            }
        }
    }

    public C46493b(Context context, Effect effect, C46492a aVar) {
        C52711k.m112240b(context, "context");
        super(context, R.style.i5);
        this.f117334j = effect;
        this.f117335k = aVar;
    }
}
