package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.os.Build;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p521a.C9369a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask.C35899a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.utils.C47689aw;
import com.p683ss.posterprocessor2.PosterSRProcessor;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.a */
public final class C30238a extends C31009h implements C0199s<C23274a> {

    /* renamed from: f */
    public static final C30239a f79000f = new C30239a(null);

    /* renamed from: a */
    public TextView f79001a;

    /* renamed from: b */
    public TextView f79002b;

    /* renamed from: c */
    public TextView f79003c;

    /* renamed from: d */
    public TextView f79004d;

    /* renamed from: e */
    public TextView f79005e;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.a$a */
    public static final class C30239a {
        private C30239a() {
        }

        public /* synthetic */ C30239a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.a$b */
    static final class C30240b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30238a f79006a;

        C30240b(C30238a aVar) {
            this.f79006a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Aweme aweme = this.f79006a.f81192l;
            C52711k.m112236a((Object) aweme, "mAweme");
            Video video = aweme.getVideo();
            C52711k.m112236a((Object) video, "mAweme.video");
            UrlModel originCover = video.getOriginCover();
            C52711k.m112236a((Object) originCover, "mAweme.video.originCover");
            C9369a.m18549a(this.f79006a.f81198r, "", originCover.getUrlList().toString());
        }
    }

    /* renamed from: a */
    private static String m71052a(String str) {
        return str == null ? TEVideoRecorder.FACE_BEAUTY_NULL : str;
    }

    /* renamed from: a */
    public final void mo49781a() {
    }

    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
    }

    public C30238a(View view) {
        super(view);
    }

    /* renamed from: b */
    public final void mo60581b(DataCenter dataCenter) {
        super.mo60581b(dataCenter);
        C0199s sVar = this;
        this.f81197q.mo48226a("poster_processor", sVar);
        this.f81197q.mo48226a("poster_processor_end", sVar);
        this.f81197q.mo48226a("poster_processor_time", sVar);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            int hashCode = str.hashCode();
            if (hashCode != -1339133892) {
                if (hashCode != -320681952) {
                    if (hashCode == 1436964748 && str.equals("poster_processor_time")) {
                        String str2 = (String) aVar.mo48246a();
                        TextView textView = this.f79004d;
                        if (textView != null) {
                            textView.setText(str2);
                        }
                    }
                } else if (str.equals("poster_processor")) {
                    TextView textView2 = this.f79001a;
                    if (textView2 != null) {
                        textView2.setText((CharSequence) aVar.mo48246a());
                    }
                }
            } else if (str.equals("poster_processor_end")) {
                TextView textView3 = this.f79003c;
                if (textView3 != null) {
                    textView3.setText((CharSequence) aVar.mo48246a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.a9_);
        if (view != null && (view instanceof FrameLayout)) {
            ((FrameLayout) view).addView(view2, 2);
        }
        this.f79001a = (TextView) view2.findViewById(R.id.c3x);
        this.f79002b = (TextView) view2.findViewById(R.id.a2n);
        this.f79003c = (TextView) view2.findViewById(R.id.a28);
        this.f79004d = (TextView) view2.findViewById(R.id.a29);
        this.f79005e = (TextView) view2.findViewById(R.id.a2c);
        TextView textView = this.f79002b;
        if (textView != null) {
            StringBuilder sb = new StringBuilder("<");
            sb.append(m71052a(Build.HARDWARE));
            sb.append(',');
            sb.append(m71052a(C47689aw.m103221d()));
            sb.append('>');
            textView.setText(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        List list;
        super.mo58323a(videoItemParams);
        if (videoItemParams != null && videoItemParams.mAweme != null) {
            TextView textView = this.f79001a;
            if (textView != null) {
                textView.setOnClickListener(new C30240b(this));
            }
            TextView textView2 = this.f79005e;
            if (textView2 != null) {
                Aweme aweme = this.f81192l;
                C52711k.m112236a((Object) aweme, "mAweme");
                Video video = aweme.getVideo();
                if (video != null) {
                    UrlModel originCover = video.getOriginCover();
                    if (originCover != null) {
                        list = originCover.getUrlList();
                        textView2.setText(String.valueOf(list));
                    }
                }
                list = null;
                textView2.setText(String.valueOf(list));
            }
            TextView textView3 = this.f79002b;
            if (textView3 != null) {
                StringBuilder sb = new StringBuilder("<");
                sb.append(m71052a(Build.HARDWARE));
                sb.append(',');
                sb.append(m71052a(C47689aw.m103221d()));
                sb.append(",setting :");
                sb.append(C35899a.m81070b());
                sb.append(",final:");
                sb.append(PosterSRProcessor.m110479a());
                sb.append('>');
                textView3.setText(sb.toString());
            }
        }
    }
}
