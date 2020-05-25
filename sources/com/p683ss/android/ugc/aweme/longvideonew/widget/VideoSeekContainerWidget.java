package com.p683ss.android.ugc.aweme.longvideonew.widget;

import android.arch.lifecycle.C0199s;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.C36385k;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36357c.C36358a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36360e.C36361a;
import com.p683ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.p683ss.android.ugc.aweme.longvideonew.feature.C36428c;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23216au;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget */
public final class VideoSeekContainerWidget extends GenericWidget implements C0199s<C23274a>, OnClickListener, OnSeekBarChangeListener {

    /* renamed from: k */
    public static final C36447a f93390k = new C36447a(null);

    /* renamed from: a */
    public final Aweme f93391a;

    /* renamed from: h */
    public final String f93392h;

    /* renamed from: i */
    public final int f93393i;

    /* renamed from: j */
    public final String f93394j;

    /* renamed from: l */
    private boolean f93395l;

    /* renamed from: m */
    private ImageView f93396m;

    /* renamed from: n */
    private ImageView f93397n;

    /* renamed from: o */
    private VideoPlaySeekBar f93398o;

    /* renamed from: p */
    private int f93399p;

    /* renamed from: q */
    private long f93400q;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget$a */
    public static final class C36447a {
        private C36447a() {
        }

        public /* synthetic */ C36447a(C52707g gVar) {
            this();
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48226a("action_is_landscape_mode", sVar).mo48226a("action_video_on_resume_play", sVar).mo48226a("action_video_on_pause_play", sVar).mo48226a("action_video_on_play_progress_change", sVar).mo48226a("action_video_secondary_progress", sVar).mo48226a("action_video_on_play_completed", sVar).mo48226a("resize_video_and_cover", sVar);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f93395l = true;
        C36349a aVar = new C36349a();
        aVar.f93058a = true;
        C47718bf.m103288a(aVar);
        if (seekBar != null) {
            this.f93399p = seekBar.getProgress();
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        String str;
        String str2;
        this.f93400q = SystemClock.elapsedRealtime();
        this.f93395l = false;
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            DataCenter dataCenter = this.f62238e;
            if (dataCenter != null) {
                dataCenter.mo48228a("action_seek_stop_tracking_touch", (Object) Float.valueOf(((float) progress) / 100.0f));
            }
        }
        C36349a aVar = new C36349a();
        aVar.f93059b = true;
        C47718bf.m103288a(aVar);
        if (seekBar != null) {
            if (this.f93399p < seekBar.getProgress()) {
                str = "front";
            } else {
                str = "back";
            }
            String str3 = "click_progress_bar";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f93392h).mo47826a("is_long_item", 1).mo47829a("impr_type", C23198ae.m56883s(this.f93391a)).mo47829a("action_type", str);
            String str4 = "group_id";
            Aweme aweme = this.f93391a;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        int i;
        int i2;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            Video video = null;
            int i3 = 0;
            View inflate = LayoutInflater.from(mo48242c()).inflate(R.layout.a6d, null, false);
            if (inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                viewGroup.addView(linearLayout);
                this.f93396m = (ImageView) linearLayout.findViewById(R.id.b37);
                ImageView imageView = this.f93396m;
                if (imageView != null) {
                    imageView.setSelected(true);
                }
                ImageView imageView2 = this.f93396m;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(this);
                }
                this.f93397n = (ImageView) linearLayout.findViewById(R.id.b4s);
                ImageView imageView3 = this.f93397n;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(this);
                }
                if ("long_video_player_activity".equals(this.f93394j)) {
                    video = C36385k.f93161b.mo75308a(this.f93391a);
                }
                if (video == null) {
                    video = C36385k.f93160a.mo75308a(this.f93391a);
                }
                if (video != null) {
                    i = video.getWidth();
                } else {
                    i = 0;
                }
                if (video != null) {
                    i2 = video.getHeight();
                } else {
                    i2 = 0;
                }
                m82250a(i, i2);
                this.f93398o = (VideoPlaySeekBar) linearLayout.findViewById(R.id.dq2);
                VideoPlaySeekBar videoPlaySeekBar = this.f93398o;
                if (videoPlaySeekBar != null) {
                    if (video != null) {
                        i3 = video.getDuration();
                    }
                    videoPlaySeekBar.setTotalTime(C36361a.m82046b(i3));
                }
                VideoPlaySeekBar videoPlaySeekBar2 = this.f93398o;
                if (videoPlaySeekBar2 != null) {
                    videoPlaySeekBar2.setProgress(0.0f);
                }
                VideoPlaySeekBar videoPlaySeekBar3 = this.f93398o;
                if (videoPlaySeekBar3 != null) {
                    videoPlaySeekBar3.setOnSeekBarChangeListener(this);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        C47718bf.m103288a(new C36349a());
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        boolean z = false;
        if (num != null && num.intValue() == R.id.b37) {
            ImageView imageView = this.f93396m;
            if (imageView != null && imageView.isSelected()) {
                new C23216au().mo48019c(this.f93391a, this.f93393i).mo48018a(this.f93392h).mo48017a(1).mo48076e();
            }
            DataCenter dataCenter = this.f62238e;
            String str2 = "action_play_control";
            ImageView imageView2 = this.f93396m;
            if (imageView2 != null) {
                z = imageView2.isSelected();
            }
            dataCenter.mo48228a(str2, (Object) Boolean.valueOf(z));
            return;
        }
        if (num != null && num.intValue() == R.id.b4s) {
            ImageView imageView3 = this.f93397n;
            if (imageView3 != null && !imageView3.isSelected()) {
                String str3 = "enter_full_screen";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f93392h).mo47826a("is_long_item", 1);
                String str4 = "group_id";
                Aweme aweme = this.f93391a;
                if (aweme != null) {
                    str = aweme.getAid();
                }
                C26890h.m65011a(str3, a.mo47829a(str4, str).f61491a);
            }
            DataCenter dataCenter2 = this.f62238e;
            String str5 = "action_switch_mode";
            ImageView imageView4 = this.f93397n;
            if (imageView4 != null) {
                z = imageView4.isSelected();
            }
            dataCenter2.mo48228a(str5, (Object) Boolean.valueOf(z));
        }
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
                case -809540112:
                    if (str.equals("action_video_on_pause_play")) {
                        ImageView imageView = this.f93396m;
                        if (imageView != null) {
                            imageView.setSelected(false);
                        }
                        return;
                    }
                    break;
                case -330388150:
                    if (str.equals("action_video_on_play_progress_change") && !this.f93395l) {
                        if (this.f93400q == 0 || SystemClock.elapsedRealtime() > this.f93400q + 1200) {
                            VideoPlaySeekBar videoPlaySeekBar = this.f93398o;
                            if (videoPlaySeekBar != null) {
                                Object a = aVar.mo48246a();
                                C52711k.m112236a(a, "t.getData()");
                                videoPlaySeekBar.setProgress(((Number) a).floatValue());
                                break;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                    break;
                case 356960147:
                    if (str.equals("action_video_on_play_completed")) {
                        VideoPlaySeekBar videoPlaySeekBar2 = this.f93398o;
                        if (videoPlaySeekBar2 != null) {
                            videoPlaySeekBar2.setProgress(0.0f);
                        }
                        this.f93400q = 0;
                        return;
                    }
                    break;
                case 441659136:
                    if (str.equals("resize_video_and_cover")) {
                        Object a2 = aVar.mo48246a();
                        C52711k.m112236a(a2, "t.getData()");
                        C36428c cVar = (C36428c) a2;
                        m82250a(cVar.f93307a, cVar.f93308b);
                        break;
                    }
                    break;
                case 929573523:
                    if (str.equals("action_is_landscape_mode")) {
                        ImageView imageView2 = this.f93397n;
                        if (imageView2 != null) {
                            Object a3 = aVar.mo48246a();
                            C52711k.m112236a(a3, "t.getData()");
                            imageView2.setSelected(((Boolean) a3).booleanValue());
                        }
                        Object a4 = aVar.mo48246a();
                        C52711k.m112236a(a4, "t.getData()");
                        if (((Boolean) a4).booleanValue()) {
                            VideoPlaySeekBar videoPlaySeekBar3 = this.f93398o;
                            if (videoPlaySeekBar3 != null) {
                                videoPlaySeekBar3.setSeekBarThumb(1);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            VideoPlaySeekBar videoPlaySeekBar4 = this.f93398o;
                            if (videoPlaySeekBar4 != null) {
                                videoPlaySeekBar4.setSeekBarThumb(0);
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 1083569349:
                    if (str.equals("action_video_secondary_progress")) {
                        VideoPlaySeekBar videoPlaySeekBar5 = this.f93398o;
                        if (videoPlaySeekBar5 != null) {
                            Object a5 = aVar.mo48246a();
                            C52711k.m112236a(a5, "t.getData()");
                            videoPlaySeekBar5.setSecondaryProgress(((Number) a5).intValue());
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 2060932179:
                    if (str.equals("action_video_on_resume_play")) {
                        ImageView imageView3 = this.f93396m;
                        if (imageView3 != null) {
                            imageView3.setSelected(true);
                        }
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    private final void m82250a(int i, int i2) {
        if (!"long_video_player_activity".equals(this.f93394j) || !C36358a.m82045a(i, i2)) {
            ImageView imageView = this.f93397n;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            return;
        }
        ImageView imageView2 = this.f93397n;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        ImageView imageView3 = this.f93397n;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
    }

    public VideoSeekContainerWidget(Aweme aweme, String str, int i, String str2) {
        C52711k.m112240b(str, "mEventType");
        C52711k.m112240b(str2, "mBusinessType");
        this.f93391a = aweme;
        this.f93392h = str;
        this.f93393i = i;
        this.f93394j = str2;
    }
}
