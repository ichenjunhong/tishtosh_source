package com.p683ss.android.ugc.aweme.share.viewmodel;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a */
public final class C42245a {

    /* renamed from: c */
    public static final C42249b f106806c = new C42249b();

    /* renamed from: d */
    public static final C42246a f106807d = new C42246a(null);

    /* renamed from: a */
    public final FeedPanelStateViewModel f106808a;

    /* renamed from: b */
    public final Context f106809b;

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$a */
    public static final class C42246a {
        private C42246a() {
        }

        /* renamed from: a */
        private static C42249b m92702a() {
            return C42245a.f106806c;
        }

        public /* synthetic */ C42246a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C42245a mo86224a(Context context) {
            FeedPanelStateViewModel feedPanelStateViewModel;
            C52711k.m112240b(context, "context");
            if (context instanceof FragmentActivity) {
                feedPanelStateViewModel = (FeedPanelStateViewModel) C0214z.m441a((FragmentActivity) context, (C0212b) m92702a()).mo359a(FeedPanelStateViewModel.class);
            } else {
                feedPanelStateViewModel = null;
            }
            return new C42245a(feedPanelStateViewModel, context, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$b */
    public interface C42247b {
        /* renamed from: a */
        void mo75532a();

        /* renamed from: b */
        void mo75533b();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$c */
    static final class C42248c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42247b f106810a;

        C42248c(C42247b bVar) {
            this.f106810a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.f106810a.mo75533b();
                    return;
                }
                this.f106810a.mo75532a();
            }
        }
    }

    /* renamed from: a */
    public static final C42245a m92680a(Context context) {
        return f106807d.mo86224a(context);
    }

    /* renamed from: e */
    public final boolean mo86220e() {
        return mo86209a("comment_panel");
    }

    /* renamed from: f */
    public final boolean mo86222f() {
        return mo86209a("swipe_up_guide");
    }

    /* renamed from: b */
    public final boolean mo86212b() {
        return mo86209a("upload_progress_fragment");
    }

    /* renamed from: c */
    public final boolean mo86215c() {
        return mo86209a("login_panel");
    }

    /* renamed from: d */
    public final boolean mo86218d() {
        return mo86209a("share_panel");
    }

    /* renamed from: a */
    public final boolean mo86208a() {
        return mo86209a("long_press_layer");
    }

    /* renamed from: b */
    public final void mo86211b(boolean z) {
        mo86206a("download_dialog", z);
    }

    /* renamed from: c */
    public final void mo86214c(boolean z) {
        mo86206a("follow_guide_popup", z);
    }

    /* renamed from: d */
    public final void mo86217d(boolean z) {
        mo86206a("swipe_up_guide", z);
    }

    /* renamed from: a */
    public final void mo86204a(C42247b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo86205a("privacy_policy_dialog", bVar);
    }

    /* renamed from: b */
    public final void mo86210b(C42247b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo86205a("long_press_layer", bVar);
    }

    /* renamed from: c */
    public final void mo86213c(C42247b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo86205a("upload_progress_fragment", bVar);
    }

    /* renamed from: d */
    public final void mo86216d(C42247b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo86205a("douyin_recommend_contact", bVar);
    }

    /* renamed from: e */
    public final void mo86219e(C42247b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo86205a("swipe_up_guide", bVar);
    }

    /* renamed from: f */
    public final void mo86221f(C42247b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo86205a("comment_panel", bVar);
    }

    /* renamed from: g */
    public final void mo86223g(C42247b bVar) {
        C52711k.m112240b(bVar, "listener");
        mo86205a("share_panel", bVar);
    }

    /* renamed from: a */
    public final void mo86207a(boolean z) {
        mo86206a("upload_progress_fragment", z);
    }

    /* renamed from: b */
    private final C0198r<Boolean> m92681b(String str) {
        switch (str.hashCode()) {
            case -2144360174:
                if (str.equals("long_press_layer")) {
                    FeedPanelStateViewModel feedPanelStateViewModel = this.f106808a;
                    if (feedPanelStateViewModel != null) {
                        return feedPanelStateViewModel.f106804m;
                    }
                }
                break;
            case -1109403612:
                if (str.equals("comment_panel")) {
                    FeedPanelStateViewModel feedPanelStateViewModel2 = this.f106808a;
                    if (feedPanelStateViewModel2 != null) {
                        return feedPanelStateViewModel2.f106794c;
                    }
                }
                break;
            case -208635325:
                if (str.equals("gif_share_dialog")) {
                    FeedPanelStateViewModel feedPanelStateViewModel3 = this.f106808a;
                    if (feedPanelStateViewModel3 != null) {
                        return feedPanelStateViewModel3.f106800i;
                    }
                }
                break;
            case -67089052:
                if (str.equals("upload_progress_fragment")) {
                    FeedPanelStateViewModel feedPanelStateViewModel4 = this.f106808a;
                    if (feedPanelStateViewModel4 != null) {
                        return feedPanelStateViewModel4.f106805n;
                    }
                }
                break;
            case -18099452:
                if (str.equals("downloaded_video_share_dialog")) {
                    FeedPanelStateViewModel feedPanelStateViewModel5 = this.f106808a;
                    if (feedPanelStateViewModel5 != null) {
                        return feedPanelStateViewModel5.f106801j;
                    }
                }
                break;
            case 106825951:
                if (str.equals("download_dialog")) {
                    FeedPanelStateViewModel feedPanelStateViewModel6 = this.f106808a;
                    if (feedPanelStateViewModel6 != null) {
                        return feedPanelStateViewModel6.f106798g;
                    }
                }
                break;
            case 403708324:
                if (str.equals("share_panel")) {
                    FeedPanelStateViewModel feedPanelStateViewModel7 = this.f106808a;
                    if (feedPanelStateViewModel7 != null) {
                        return feedPanelStateViewModel7.f106795d;
                    }
                }
                break;
            case 684302462:
                if (str.equals("privacy_policy_dialog")) {
                    FeedPanelStateViewModel feedPanelStateViewModel8 = this.f106808a;
                    if (feedPanelStateViewModel8 != null) {
                        return feedPanelStateViewModel8.f106797f;
                    }
                }
                break;
            case 833605106:
                if (str.equals("douyin_recommend_contact")) {
                    FeedPanelStateViewModel feedPanelStateViewModel9 = this.f106808a;
                    if (feedPanelStateViewModel9 != null) {
                        return feedPanelStateViewModel9.f106803l;
                    }
                }
                break;
            case 1049683556:
                if (str.equals("gif_download_dialog")) {
                    FeedPanelStateViewModel feedPanelStateViewModel10 = this.f106808a;
                    if (feedPanelStateViewModel10 != null) {
                        return feedPanelStateViewModel10.f106799h;
                    }
                }
                break;
            case 1316323261:
                if (str.equals("swipe_up_guide")) {
                    FeedPanelStateViewModel feedPanelStateViewModel11 = this.f106808a;
                    if (feedPanelStateViewModel11 != null) {
                        return feedPanelStateViewModel11.f106792a;
                    }
                }
                break;
            case 1494381465:
                if (str.equals("story_page")) {
                    FeedPanelStateViewModel feedPanelStateViewModel12 = this.f106808a;
                    if (feedPanelStateViewModel12 != null) {
                        return feedPanelStateViewModel12.f106796e;
                    }
                }
                break;
            case 1654221230:
                if (str.equals("login_panel")) {
                    FeedPanelStateViewModel feedPanelStateViewModel13 = this.f106808a;
                    if (feedPanelStateViewModel13 != null) {
                        return feedPanelStateViewModel13.f106793b;
                    }
                }
                break;
            case 2144107035:
                if (str.equals("follow_guide_popup")) {
                    FeedPanelStateViewModel feedPanelStateViewModel14 = this.f106808a;
                    if (feedPanelStateViewModel14 != null) {
                        return feedPanelStateViewModel14.f106802k;
                    }
                }
                break;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo86209a(String str) {
        C0198r b = m92681b(str);
        if (b != null) {
            Boolean bool = (Boolean) b.getValue();
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    private C42245a(FeedPanelStateViewModel feedPanelStateViewModel, Context context) {
        this.f106808a = feedPanelStateViewModel;
        this.f106809b = context;
    }

    /* renamed from: a */
    public final void mo86205a(String str, C42247b bVar) {
        if (this.f106808a != null && (this.f106809b instanceof C0184k)) {
            C0198r b = m92681b(str);
            if (b != null) {
                b.observe((C0184k) this.f106809b, new C42248c(bVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo86206a(String str, boolean z) {
        C0198r b = m92681b(str);
        if (b != null && (!C52711k.m112239a((Object) (Boolean) b.getValue(), (Object) Boolean.valueOf(z)))) {
            b.setValue(Boolean.valueOf(z));
        }
    }

    public /* synthetic */ C42245a(FeedPanelStateViewModel feedPanelStateViewModel, Context context, C52707g gVar) {
        this(feedPanelStateViewModel, context);
    }
}
