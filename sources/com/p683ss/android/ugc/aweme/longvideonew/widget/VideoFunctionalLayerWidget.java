package com.p683ss.android.ugc.aweme.longvideonew.widget;

import android.animation.AnimatorSet;
import android.arch.lifecycle.C0199s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideonew.C36433i;
import com.p683ss.android.ugc.aweme.longvideonew.feature.VolumeController;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget */
public final class VideoFunctionalLayerWidget extends GenericWidget implements C0199s<C23274a>, OnClickListener {

    /* renamed from: o */
    public static final C36441a f93357o = new C36441a(null);

    /* renamed from: a */
    public ImageView f93358a;

    /* renamed from: h */
    public AnimatedImageView f93359h;

    /* renamed from: i */
    public LineProgressBar f93360i;

    /* renamed from: j */
    public VolumeController f93361j;

    /* renamed from: k */
    public final Aweme f93362k;

    /* renamed from: l */
    public final String f93363l;

    /* renamed from: m */
    public final int f93364m;

    /* renamed from: n */
    public final String f93365n;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget$a */
    public static final class C36441a {
        private C36441a() {
        }

        public /* synthetic */ C36441a(C52707g gVar) {
            this();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        LineProgressBar lineProgressBar = this.f93360i;
        if (lineProgressBar != null) {
            lineProgressBar.mo64036c();
        }
        VolumeController volumeController = this.f93361j;
        if (volumeController != null) {
            AnimatorSet animatorSet = volumeController.f93290a;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = volumeController.f93291b;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = volumeController.f93292c;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48226a("action_video_on_play_completed", sVar).mo48226a("action_video_on_resume_play", sVar).mo48226a("action_video_on_pause_play", sVar).mo48226a("action_video_on_prepare_play", sVar).mo48226a("action_video_on_play_fail", sVar).mo48226a("action_video_on_buffering", sVar).mo48226a("action_video_on_render_ready", sVar).mo48226a("on_render_first_frame", sVar).mo48226a("action_seek_stop_tracking_touch", sVar).mo48226a("action_keycode_volume_down", sVar).mo48226a("action_keycode_volume_up", sVar);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b3j) {
            C47718bf.m103288a(new C36349a());
            ImageView imageView = this.f93358a;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.f62238e.mo48228a("action_replay", (Object) "replay");
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        Video video;
        UrlModel urlModel;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            UrlModel urlModel2 = null;
            View inflate = LayoutInflater.from(mo48242c()).inflate(R.layout.a9b, null, false);
            if (inflate != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                viewGroup.addView(frameLayout);
                this.f93359h = (AnimatedImageView) frameLayout.findViewById(R.id.a22);
                AnimatedImageView animatedImageView = this.f93359h;
                if (animatedImageView != null) {
                    animatedImageView.setVisibility(0);
                }
                if ("long_video_player_activity".equals(this.f93365n)) {
                    video = C36433i.f93328b.mo75372a(this.f93362k);
                } else {
                    video = null;
                }
                if (video == null) {
                    video = C36433i.f93327a.mo75372a(this.f93362k);
                }
                AnimatedImageView animatedImageView2 = this.f93359h;
                if (animatedImageView2 != null) {
                    if (video != null) {
                        urlModel = video.getOriginCover();
                    } else {
                        urlModel = null;
                    }
                    animatedImageView2.mo48930a(urlModel);
                    RemoteImageView remoteImageView = animatedImageView2;
                    if (video != null) {
                        urlModel2 = video.getOriginCover();
                    }
                    C23515d.m57672a(remoteImageView, urlModel2, animatedImageView2.getControllerListener());
                }
                View findViewById = frameLayout.findViewById(R.id.gy);
                C52711k.m112236a((Object) findViewById, "funLayerContainer.findViewById(R.id.audio_view)");
                this.f93361j = new VolumeController((AudioControlView) findViewById);
                this.f93360i = (LineProgressBar) frameLayout.findViewById(R.id.byb);
                LineProgressBar lineProgressBar = this.f93360i;
                if (lineProgressBar != null) {
                    lineProgressBar.mo64034a();
                }
                this.f93358a = (ImageView) frameLayout.findViewById(R.id.b3j);
                ImageView imageView = this.f93358a;
                if (imageView != null) {
                    imageView.setOnClickListener(this);
                }
                ImageView imageView2 = this.f93358a;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1294386419:
                    if (str.equals("action_video_on_render_ready")) {
                        LineProgressBar lineProgressBar = this.f93360i;
                        if (lineProgressBar != null) {
                            lineProgressBar.mo64035b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -1235492779:
                    if (str.equals("on_render_first_frame")) {
                        AnimatedImageView animatedImageView = this.f93359h;
                        if (animatedImageView != null) {
                            animatedImageView.setVisibility(8);
                        }
                        return;
                    }
                    break;
                case -809540112:
                    if (str.equals("action_video_on_pause_play")) {
                        LineProgressBar lineProgressBar2 = this.f93360i;
                        if (lineProgressBar2 != null) {
                            lineProgressBar2.mo64035b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -517056298:
                    if (str.equals("action_video_on_play_fail")) {
                        LineProgressBar lineProgressBar3 = this.f93360i;
                        if (lineProgressBar3 != null) {
                            lineProgressBar3.mo64035b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -411372444:
                    if (str.equals("action_keycode_volume_up")) {
                        VolumeController volumeController = this.f93361j;
                        if (volumeController != null) {
                            Object a = aVar.mo48246a();
                            C52711k.m112236a(a, "t.getData()");
                            volumeController.onKeyDown(((Number) a).intValue(), null);
                            return;
                        }
                    }
                    break;
                case -192431061:
                    if (str.equals("action_keycode_volume_down")) {
                        VolumeController volumeController2 = this.f93361j;
                        if (volumeController2 != null) {
                            Object a2 = aVar.mo48246a();
                            C52711k.m112236a(a2, "t.getData()");
                            volumeController2.onKeyDown(((Number) a2).intValue(), null);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -110819137:
                    if (str.equals("action_video_on_prepare_play")) {
                        LineProgressBar lineProgressBar4 = this.f93360i;
                        if (lineProgressBar4 != null) {
                            lineProgressBar4.mo64034a();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 356960147:
                    if (str.equals("action_video_on_play_completed")) {
                        ImageView imageView = this.f93358a;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        AnimatedImageView animatedImageView2 = this.f93359h;
                        if (animatedImageView2 != null) {
                            animatedImageView2.setVisibility(0);
                        }
                        return;
                    }
                    break;
                case 710880054:
                    if (str.equals("action_seek_stop_tracking_touch")) {
                        Object a3 = aVar.mo48246a();
                        C52711k.m112236a(a3, "t.getData()");
                        if (((Number) a3).floatValue() > 0.0f) {
                            ImageView imageView2 = this.f93358a;
                            if (imageView2 != null) {
                                imageView2.setVisibility(8);
                            }
                            AnimatedImageView animatedImageView3 = this.f93359h;
                            if (animatedImageView3 != null) {
                                animatedImageView3.setVisibility(8);
                            }
                            return;
                        }
                    }
                    break;
                case 1422397231:
                    if (str.equals("action_video_on_buffering")) {
                        Object a4 = aVar.mo48246a();
                        C52711k.m112236a(a4, "t.getData()");
                        if (((Boolean) a4).booleanValue()) {
                            LineProgressBar lineProgressBar5 = this.f93360i;
                            if (lineProgressBar5 != null) {
                                lineProgressBar5.mo64034a();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            LineProgressBar lineProgressBar6 = this.f93360i;
                            if (lineProgressBar6 != null) {
                                lineProgressBar6.mo64035b();
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 2060932179:
                    if (str.equals("action_video_on_resume_play")) {
                        ImageView imageView3 = this.f93358a;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        AnimatedImageView animatedImageView4 = this.f93359h;
                        if (animatedImageView4 != null) {
                            animatedImageView4.setVisibility(8);
                        }
                        return;
                    }
                    break;
            }
        }
    }

    public VideoFunctionalLayerWidget(Aweme aweme, String str, int i, String str2) {
        C52711k.m112240b(str, "mEventType");
        C52711k.m112240b(str2, "mBusinessType");
        this.f93362k = aweme;
        this.f93363l = str;
        this.f93364m = i;
        this.f93365n = str2;
    }
}
