package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.arch.lifecycle.C0199s;
import android.graphics.Bitmap;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.p769c.C12169d;
import com.bytedance.lighten.p766a.p769c.C12178m;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26063b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26169c;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26172e;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26173f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget */
public final class AdPlayFunWidget extends AbsAdFeedWidget {

    /* renamed from: j */
    public static final C26807a f70630j = new C26807a(null);

    /* renamed from: a */
    public AdPlayFunView f70631a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget$a */
    public static final class C26807a {
        private C26807a() {
        }

        public /* synthetic */ C26807a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget$b */
    static final class C26808b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f70632a;

        C26808b(AdPlayFunView adPlayFunView) {
            this.f70632a = adPlayFunView;
        }

        public final void run() {
            this.f70632a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget$c */
    public static final class C26809c extends C12169d {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunWidget f70633a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f70634b;

        /* renamed from: a */
        public final void mo23099a(Bitmap bitmap) {
            C26169c.f69100a.mo53792a(this.f70633a.f70584h, true, (String) null);
        }

        /* renamed from: a */
        public final void mo23100a(Throwable th) {
            String str;
            C26169c cVar = C26169c.f69100a;
            Aweme aweme = this.f70633a.f70584h;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            cVar.mo53792a(aweme, false, str);
        }

        C26809c(AdPlayFunWidget adPlayFunWidget, FragmentActivity fragmentActivity) {
            this.f70633a = adPlayFunWidget;
            this.f70634b = fragmentActivity;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo54694d() {
        super.mo54694d();
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            C0199s sVar = this;
            dataCenter.mo48226a("ad_feed_on_page_selected", sVar);
            dataCenter.mo48226a("ad_feed_on_page_unselected", sVar);
            dataCenter.mo48226a("ad_video_on_resume_play", sVar);
            dataCenter.mo48226a("ad_video_on_pause_play", sVar);
            dataCenter.mo48226a("ON_SIMILAR_ADVERT_SHOW", sVar);
            dataCenter.mo48226a("ON_SIMILAR_ADVERT_HIDE", sVar);
            dataCenter.mo48226a("ON_MOVE_IN_DESC_END_AFTER_SIMILAR_AD", sVar);
        }
    }

    /* renamed from: a */
    public final void mo54706a(boolean z) {
        float f;
        AdPlayFunView adPlayFunView = this.f70631a;
        if (adPlayFunView != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            adPlayFunView.setAlpha(f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54693a(C26816b bVar) {
        C52711k.m112240b(bVar, "params");
        super.mo54693a(bVar);
        Aweme aweme = this.f70584h;
        if (!C26512f.m64109K(this.f70584h)) {
            AdPlayFunView adPlayFunView = this.f70631a;
            if (adPlayFunView != null) {
                adPlayFunView.setVisibility(8);
                adPlayFunView.mo53768a((Aweme) null);
            }
        } else {
            if (this.f70631a == null) {
                View view = this.f62237d;
                if (view != null) {
                    View inflate = ((ViewStub) view).inflate();
                    if (inflate != null) {
                        this.f70631a = (AdPlayFunView) inflate;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewStub");
                }
            }
            AdPlayFunView adPlayFunView2 = this.f70631a;
            if (adPlayFunView2 != null) {
                if (aweme == null) {
                    C52711k.m112234a();
                }
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) awemeRawAd, "aweme!!.awemeRawAd!!");
                UrlModel imageInfo = awemeRawAd.getPlayFunModel().getImageInfo();
                Fragment fragment = this.f70585i;
                if (fragment != null) {
                    FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        C52711k.m112236a((Object) activity, "mFragment?.activity ?: return");
                        if (imageInfo != null) {
                            C26169c cVar = C26169c.f69100a;
                            Aweme aweme2 = this.f70584h;
                            if (!C26169c.m63443a() && aweme2 != null) {
                                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                                if (awemeRawAd2 != null) {
                                    C26063b bVar2 = new C26063b("playfun", "preload_start", 0, 4, null);
                                    C26072c.f68845b.mo53559a(bVar2.mo53548a(aweme2.getAid()).mo53549b(awemeRawAd2.getCreativeIdStr()).mo53550c(awemeRawAd2.getLogExtra()));
                                }
                            }
                            C12203q.m24645a((Object) C23608p.m57874a(imageInfo)).mo23114a(activity).mo23123a((C12178m) new C26809c(this, activity));
                        }
                    }
                }
                adPlayFunView2.mo53768a(aweme);
                DataCenter dataCenter = this.f62238e;
                adPlayFunView2.f69058d = dataCenter;
                C26173f fVar = adPlayFunView2.f69057c;
                if (fVar == null) {
                    C52711k.m112237a("stateContext");
                }
                fVar.f69118g = dataCenter;
                adPlayFunView2.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2057127075:
                    if (str.equals("ad_video_on_pause_play") && C26512f.m64109K(this.f70584h)) {
                        AdPlayFunView adPlayFunView = this.f70631a;
                        if (adPlayFunView != null) {
                            C26173f fVar = adPlayFunView.f69057c;
                            if (fVar == null) {
                                C52711k.m112237a("stateContext");
                            }
                            C26172e eVar = (C26172e) fVar.f69120i.get(fVar.f69113b);
                            if (eVar != null) {
                                eVar.mo53780b();
                            }
                        }
                        return;
                    }
                    break;
                case -1562171872:
                    if (str.equals("ON_MOVE_IN_DESC_END_AFTER_SIMILAR_AD")) {
                        AdPlayFunView adPlayFunView2 = this.f70631a;
                        if (adPlayFunView2 != null) {
                            adPlayFunView2.mo53769a(true);
                            return;
                        }
                    }
                    break;
                case -1540531799:
                    if (str.equals("ad_feed_on_page_unselected")) {
                        AdPlayFunView adPlayFunView3 = this.f70631a;
                        if (adPlayFunView3 != null) {
                            adPlayFunView3.f69059e = false;
                            C26173f fVar2 = adPlayFunView3.f69057c;
                            if (fVar2 == null) {
                                C52711k.m112237a("stateContext");
                            }
                            fVar2.mo53798a();
                            SmartImageView smartImageView = adPlayFunView3.f69055a;
                            if (smartImageView == null) {
                                C52711k.m112237a("eggImageView");
                            }
                            smartImageView.setImageDisplayListener(null);
                        }
                        AdPlayFunView adPlayFunView4 = this.f70631a;
                        if (adPlayFunView4 != null) {
                            adPlayFunView4.setVisibility(8);
                        }
                        return;
                    }
                    break;
                case -1132409520:
                    if (str.equals("ad_feed_on_page_selected")) {
                        AdPlayFunView adPlayFunView5 = this.f70631a;
                        if (adPlayFunView5 != null) {
                            adPlayFunView5.f69059e = true;
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -293484551:
                    if (str.equals("ON_SIMILAR_ADVERT_HIDE") && C26512f.m64109K(this.f70584h)) {
                        AdPlayFunView adPlayFunView6 = this.f70631a;
                        if (adPlayFunView6 != null) {
                            adPlayFunView6.setVisibility(0);
                            adPlayFunView6.animate().setStartDelay(250).setDuration(250).alpha(1.0f).start();
                            adPlayFunView6.mo53769a(false);
                            break;
                        } else {
                            return;
                        }
                    }
                case -293157452:
                    if (str.equals("ON_SIMILAR_ADVERT_SHOW") && C26512f.m64109K(this.f70584h)) {
                        AdPlayFunView adPlayFunView7 = this.f70631a;
                        if (adPlayFunView7 != null) {
                            adPlayFunView7.animate().alpha(0.0f).withEndAction(new C26808b(adPlayFunView7)).start();
                            break;
                        } else {
                            return;
                        }
                    }
                case 2040441990:
                    if (str.equals("ad_video_on_resume_play") && C26512f.m64109K(this.f70584h)) {
                        AdPlayFunView adPlayFunView8 = this.f70631a;
                        if (adPlayFunView8 != null) {
                            C26173f fVar3 = adPlayFunView8.f69057c;
                            if (fVar3 == null) {
                                C52711k.m112237a("stateContext");
                            }
                            C26172e eVar2 = (C26172e) fVar3.f69120i.get(fVar3.f69113b);
                            if (eVar2 != null) {
                                eVar2.mo53781c();
                            }
                        }
                        return;
                    }
                    break;
            }
        }
    }
}
