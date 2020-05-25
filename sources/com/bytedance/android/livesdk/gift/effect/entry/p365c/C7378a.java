package com.bytedance.android.livesdk.gift.effect.entry.p365c;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C4129g;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.assets.C7214j;
import com.bytedance.android.livesdk.gift.effect.entry.p363a.C7372a;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7394a;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7395b;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7396c;
import com.bytedance.android.livesdk.gift.effect.entry.p368f.C7397a;
import com.bytedance.android.livesdk.gift.effect.entry.view.C7404a;
import com.bytedance.android.livesdk.gift.effect.entry.view.EcomEnterTrayView;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.gift.effect.entry.view.LandscapeNobleEnterTrayView;
import com.bytedance.android.livesdk.gift.effect.entry.view.PortraitNobleEnterTrayView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserEnterLevelView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserEnterRankView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.message.model.C7835bj.C7836a;
import com.bytedance.android.livesdk.p279af.C4594h;
import com.bytedance.android.livesdk.p279af.C4594h.C4596b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.common.utility.C9414h;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.c.a */
public final class C7378a implements OnClickListener {

    /* renamed from: a */
    public LinkedList<C7394a> f20140a;

    /* renamed from: b */
    public EnterAnimationView f20141b;

    /* renamed from: c */
    public C4129g f20142c;

    /* renamed from: d */
    public int f20143d;

    /* renamed from: e */
    public Animator f20144e;

    /* renamed from: f */
    public int f20145f;

    /* renamed from: g */
    public boolean f20146g = false;

    /* renamed from: h */
    private Context f20147h;

    /* renamed from: i */
    private C7394a f20148i;

    /* renamed from: j */
    private int f20149j = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo9431a()).intValue();

    /* renamed from: b */
    public final void mo13652b() {
        if (this.f20145f < 0) {
            this.f20145f = 0;
        }
        mo13650a();
    }

    /* renamed from: d */
    private ViewGroup m15232d() {
        UserSpecialEntryView userSpecialEntryView = (UserSpecialEntryView) LayoutInflater.from(this.f20147h).inflate(R.layout.ary, this.f20141b, false);
        userSpecialEntryView.setupUi(this.f20148i);
        return userSpecialEntryView;
    }

    /* renamed from: c */
    private void m15229c() {
        ListIterator listIterator = this.f20140a.listIterator();
        while (listIterator.hasNext()) {
            if (!((C7394a) listIterator.next()).mo13659b()) {
                listIterator.previous();
                listIterator.remove();
                return;
            }
        }
        this.f20140a.remove();
    }

    /* renamed from: e */
    private void m15234e() {
        final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f20147h).inflate(R.layout.aru, this.f20141b, false);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = this.f20143d;
        viewGroup.setLayoutParams(marginLayoutParams);
        UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
        userEnterLevelView.setUI(this.f20148i);
        userEnterLevelView.setOnClickListener(this);
        UserEnterRankView userEnterRankView = (UserEnterRankView) viewGroup.findViewById(R.id.b93);
        userEnterRankView.setupUI(this.f20148i);
        userEnterRankView.setOnClickListener(this);
        viewGroup.setX((float) this.f20141b.getWidth());
        viewGroup.setY(0.0f);
        this.f20141b.addView(viewGroup);
        this.f20144e = C7397a.m15266a(viewGroup, new C7372a() {
            /* renamed from: a */
            public final void mo13644a(Animator animator) {
                UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
                if (userEnterLevelView != null) {
                    userEnterLevelView.mo13675a();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C7378a.this.f20141b.removeView(viewGroup);
                C7378a.this.f20145f--;
                C7378a.this.mo13652b();
            }
        });
        this.f20144e.start();
    }

    /* renamed from: a */
    public final void mo13650a() {
        if ((!LinkCrossRoomDataHolder.m11103a().f12611b || this.f20146g) && !this.f20140a.isEmpty() && this.f20145f <= 0) {
            this.f20145f++;
            this.f20148i = (C7394a) this.f20140a.poll();
            if (this.f20148i != null) {
                C7836a aVar = this.f20148i.f20195m;
                if (this.f20148i.mo13660c()) {
                    m15239i(this.f20148i);
                } else if (this.f20148i instanceof C7396c) {
                    C7396c cVar = (C7396c) this.f20148i;
                    if (cVar.f20203s != null && cVar.f20203s.getNobleLevel() > 0) {
                        m15225a(cVar);
                    }
                } else {
                    if (aVar == null) {
                        m15234e();
                    } else if (aVar.f21647a == 4) {
                        m15238h(this.f20148i);
                    } else if (aVar.f21647a == 5) {
                        m15237g(this.f20148i);
                    } else if (aVar.f21647a == 3) {
                        m15226a(aVar);
                    } else if (aVar.f21647a == 2) {
                        m15228b(aVar);
                    } else if (aVar.f21647a == 1) {
                        m15231c(aVar);
                    } else if (aVar.f21647a == 6) {
                        m15240j(this.f20148i);
                    } else if (aVar.f21647a == 7) {
                        m15241k(this.f20148i);
                    } else if (aVar.f21647a == 8) {
                        m15242l(this.f20148i);
                    }
                }
            }
        }
    }

    public final void onClick(View view) {
        if (this.f20148i != null && this.f20142c != null) {
            this.f20142c.mo9499a(this.f20148i.f20183a);
        }
    }

    /* renamed from: d */
    private void m15233d(C7394a aVar) {
        ListIterator listIterator = this.f20140a.listIterator();
        while (listIterator.hasNext()) {
            if (!((C7394a) listIterator.next()).mo13659b()) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            }
        }
        listIterator.add(aVar);
    }

    /* renamed from: e */
    private void m15235e(C7394a aVar) {
        if (this.f20140a.isEmpty()) {
            this.f20140a.add(aVar);
            return;
        }
        C7394a aVar2 = (C7394a) this.f20140a.getLast();
        if (!aVar2.mo13660c()) {
            this.f20140a.add(aVar);
            return;
        }
        if ((aVar instanceof C7395b) && (aVar2 instanceof C7395b)) {
            aVar2.mo13657a(aVar.f20184b);
            C7395b bVar = (C7395b) aVar2;
            bVar.f20201s += ((C7395b) aVar).f20201s;
        }
    }

    /* renamed from: f */
    private void m15236f(C7394a aVar) {
        if (this.f20140a.isEmpty()) {
            this.f20140a.add(aVar);
        } else if (!((C7394a) this.f20140a.getLast()).mo13660c()) {
            this.f20140a.add(aVar);
        } else {
            if (this.f20140a.size() > 0) {
                this.f20140a.add(this.f20140a.size() - 1, aVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo13653b(C7394a aVar) {
        if (!(aVar instanceof C7396c)) {
            if (aVar.mo13659b()) {
                m15233d(aVar);
            } else if (aVar.mo13660c()) {
                m15235e(aVar);
            } else {
                m15236f(aVar);
            }
        }
        if (this.f20140a.size() > this.f20149j) {
            m15229c();
        }
        mo13650a();
    }

    /* renamed from: a */
    private void m15226a(C7836a aVar) {
        final ViewGroup d = m15232d();
        View findViewById = d.findViewById(R.id.ua);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) d.getLayoutParams();
        marginLayoutParams.bottomMargin = this.f20143d;
        d.setLayoutParams(marginLayoutParams);
        d.setX((float) this.f20141b.getWidth());
        d.setY(0.0f);
        this.f20141b.addView(d);
        C7397a.m15269a(d, new C7372a() {
            public final void onAnimationEnd(Animator animator) {
                C7378a.this.f20141b.removeView(d);
                C7378a.this.f20145f--;
                C7378a.this.mo13652b();
            }

            /* renamed from: a */
            public final void mo13644a(Animator animator) {
                UserSpecialEntryView userSpecialEntryView = (UserSpecialEntryView) d.findViewById(R.id.ds1);
                if (userSpecialEntryView != null && userSpecialEntryView.f20269b != null && userSpecialEntryView.f20268a != null) {
                    int width = userSpecialEntryView.f20269b.getWidth() - userSpecialEntryView.f20268a.getWidth();
                    if (width > 0) {
                        ObjectAnimator.ofInt(userSpecialEntryView.f20268a, "scrollX", new int[]{0, width}).setDuration((long) userSpecialEntryView.f20270c).start();
                    }
                }
            }
        }, aVar.f21652f).start();
    }

    /* renamed from: c */
    private void m15230c(final C7394a aVar) {
        final long j = aVar.f20195m.f21653g;
        C73791 r2 = new C7214j() {
            /* renamed from: a */
            public final void mo8669a(Throwable th) {
                C7378a.m15227a("下载进场特效资源失败", String.valueOf(aVar.f20183a), String.valueOf(j));
            }

            /* renamed from: a */
            public final void mo8668a(long j, String str) {
                aVar.f20196n = C4594h.m11029a(str);
                C7378a.this.mo13653b(aVar);
            }
        };
        C7211h assetsManager = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsManager();
        if (assetsManager != null) {
            AssetsModel c = assetsManager.mo13434c(j);
            if (c == null) {
                m15227a("资源列表中找不到这个进场特效", String.valueOf(aVar.f20183a), String.valueOf(j));
            } else if (c.getResourceType() != 6) {
                m15227a("获取到的特效资源不是进场webp特效", String.valueOf(aVar.f20183a), String.valueOf(j));
            } else {
                assetsManager.mo13428a(j, r2, 4);
            }
        }
    }

    /* renamed from: h */
    private void m15238h(C7394a aVar) {
        if (aVar.f20195m != null) {
            final C7404a aVar2 = new C7404a(this.f20147h);
            aVar2.setUI(aVar);
            aVar2.setOnClickListener(this);
            aVar2.setX(750.0f);
            aVar2.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            this.f20141b.addView(aVar2, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) aVar2.getLayoutParams();
            marginLayoutParams.bottomMargin = C3922z.m9899a(175.0f);
            aVar2.setLayoutParams(marginLayoutParams);
            C7397a.m15272c(aVar2, new C7372a(aVar2) {

                /* renamed from: a */
                final /* synthetic */ C7404a f20180a;

                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(aVar2);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }

                /* renamed from: a */
                public final void mo13644a(Animator animator) {
                    C7404a aVar = this.f20180a;
                    aVar.f20278i.setVisibility(0);
                    ObjectAnimator.ofFloat(aVar.f20278i, "alpha", new float[]{0.0f, 1.0f}).setDuration(334).start();
                    this.f20180a.mo13691b();
                    this.f20180a.mo13692c();
                }

                {
                    this.f20180a = r2;
                }
            }).start();
        }
    }

    /* renamed from: i */
    private void m15239i(C7394a aVar) {
        if (this.f20141b != null && this.f20141b.getContext() != null) {
            if (!(aVar instanceof C7395b)) {
                if (this.f20145f == 1) {
                    this.f20145f--;
                }
                return;
            }
            final EcomEnterTrayView ecomEnterTrayView = new EcomEnterTrayView(this.f20141b.getContext());
            ecomEnterTrayView.mo13666a((C7395b) aVar);
            ecomEnterTrayView.setX((float) this.f20141b.getWidth());
            ecomEnterTrayView.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            this.f20141b.addView(ecomEnterTrayView, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) ecomEnterTrayView.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f20143d;
            ecomEnterTrayView.setLayoutParams(marginLayoutParams);
            this.f20144e = C7397a.m15266a(ecomEnterTrayView, new C7372a() {
                /* renamed from: a */
                public final void mo13644a(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(ecomEnterTrayView);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }
            });
            this.f20144e.start();
            C8049c.m15979a().mo14203a("buying_comment_show", Room.class);
        }
    }

    /* renamed from: a */
    private void m15225a(C7396c cVar) {
        if (this.f20141b != null && this.f20141b.getContext() != null && cVar != null) {
            if (cVar.f20205u) {
                final PortraitNobleEnterTrayView portraitNobleEnterTrayView = new PortraitNobleEnterTrayView(this.f20141b.getContext());
                portraitNobleEnterTrayView.mo13673a(cVar);
                portraitNobleEnterTrayView.setX((float) this.f20141b.getWidth());
                portraitNobleEnterTrayView.setY(0.0f);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                this.f20141b.addView(portraitNobleEnterTrayView, layoutParams);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) portraitNobleEnterTrayView.getLayoutParams();
                marginLayoutParams.bottomMargin = this.f20143d;
                portraitNobleEnterTrayView.setLayoutParams(marginLayoutParams);
                this.f20144e = C7397a.m15266a(portraitNobleEnterTrayView, new C7372a() {
                    public final void onAnimationEnd(Animator animator) {
                        C7378a.this.f20141b.removeView(portraitNobleEnterTrayView);
                        C7378a.this.f20145f--;
                        C7378a.this.mo13652b();
                    }
                });
                this.f20144e.start();
                return;
            }
            final LandscapeNobleEnterTrayView landscapeNobleEnterTrayView = new LandscapeNobleEnterTrayView(this.f20141b.getContext());
            landscapeNobleEnterTrayView.mo13672a(cVar);
            landscapeNobleEnterTrayView.setX((float) this.f20141b.getWidth());
            landscapeNobleEnterTrayView.setY(0.0f);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.gravity = 80;
            this.f20141b.addView(landscapeNobleEnterTrayView, layoutParams2);
            this.f20144e = C7397a.m15270b(landscapeNobleEnterTrayView, new C7372a() {
                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(landscapeNobleEnterTrayView);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }
            });
            this.f20144e.start();
        }
    }

    /* renamed from: b */
    private void m15228b(C7836a aVar) {
        if (aVar != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f20147h).inflate(R.layout.arw, this.f20141b, false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bgq);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.ajd);
            viewGroup.setX((float) this.f20141b.getWidth());
            viewGroup.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f20141b.addView(viewGroup, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f20143d;
            viewGroup.setLayoutParams(marginLayoutParams);
            viewGroup2.setVisibility(0);
            viewGroup3.setVisibility(8);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.ays);
            HSImageView hSImageView2 = (HSImageView) viewGroup.findViewById(R.id.ayt);
            final TextView textView = (TextView) viewGroup.findViewById(R.id.d7k);
            if (aVar.f21650d == 1) {
                hSImageView.setVisibility(0);
                C3899m.m9860a(hSImageView, this.f20148i.f20186d);
            } else {
                hSImageView.setVisibility(8);
            }
            if (aVar.f21648b != null && !C9414h.m18630a(aVar.f21648b.getUrls())) {
                hSImageView2.setController(((C13773e) C13771c.m27870a().mo25725b(Uri.parse((String) aVar.f21648b.getUrls().get(0))).mo25762c(true)).mo25763d());
            }
            m15224a(textView, aVar);
            textView.post(new Runnable() {
                public final void run() {
                    textView.setSelected(true);
                }
            });
            C7397a.m15267a(viewGroup, new C7372a() {
                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(viewGroup);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }
            }, 40.0f, -40.0f).start();
        }
    }

    /* renamed from: c */
    private void m15231c(C7836a aVar) {
        if (aVar != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f20147h).inflate(R.layout.arw, this.f20141b, false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bgq);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.ajd);
            viewGroup.setX((float) this.f20141b.getWidth());
            viewGroup.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f20141b.addView(viewGroup, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f20143d;
            viewGroup.setLayoutParams(marginLayoutParams);
            viewGroup2.setVisibility(8);
            viewGroup3.setVisibility(0);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.b4_);
            TextView textView = (TextView) viewGroup.findViewById(R.id.dg6);
            if (aVar.f21651e != null && !C9414h.m18630a(aVar.f21651e.getUrls())) {
                hSImageView.setController(((C13773e) C13771c.m27870a().mo25725b(Uri.parse((String) aVar.f21651e.getUrls().get(0))).mo25762c(true)).mo25763d());
            }
            m15224a(textView, aVar);
            textView.setSelected(true);
            C7397a.m15266a(viewGroup, new C7372a() {
                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(viewGroup);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }
            }).start();
        }
    }

    /* renamed from: g */
    private void m15237g(C7394a aVar) {
        if (aVar.f20195m != null) {
            final C7404a aVar2 = new C7404a(this.f20147h);
            aVar2.setUI(aVar);
            aVar2.setOnClickListener(this);
            aVar2.setX(750.0f);
            aVar2.setY(0.0f);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            this.f20141b.addView(aVar2, layoutParams);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) aVar2.getLayoutParams();
            marginLayoutParams.bottomMargin = C3922z.m9899a(175.0f);
            aVar2.setLayoutParams(marginLayoutParams);
            final View inflate = LayoutInflater.from(this.f20147h).inflate(R.layout.arx, this.f20141b, false);
            LayoutParams layoutParams2 = new LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            this.f20141b.addView(inflate, layoutParams2);
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) inflate.getLayoutParams();
            marginLayoutParams2.bottomMargin = C3922z.m9899a(79.0f);
            inflate.setLayoutParams(marginLayoutParams2);
            HSImageView hSImageView = (HSImageView) inflate.findViewById(R.id.dug);
            C4596b bVar = aVar.f20196n;
            String str = null;
            if (bVar != null) {
                str = bVar.mo10396a(this.f20147h);
            }
            if (!TextUtils.isEmpty(str)) {
                hSImageView.setController(((C13773e) C13771c.m27870a().mo25725b(new Builder().scheme("file").path(str).build()).mo25762c(true)).mo25763d());
            }
            C7397a.m15272c(aVar2, new C7372a() {
                /* renamed from: a */
                public final void mo13644a(Animator animator) {
                    aVar2.mo13691b();
                    aVar2.mo13692c();
                }

                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(aVar2);
                    C7378a.this.f20141b.removeView(inflate);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }
            }).start();
        }
    }

    /* renamed from: j */
    private void m15240j(C7394a aVar) {
        final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f20147h).inflate(R.layout.art, this.f20141b, false);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = this.f20143d;
        viewGroup.setLayoutParams(marginLayoutParams);
        UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
        userEnterLevelView.mo13676a(this.f20148i, C3922z.m9899a(22.0f), R.drawable.bgm, C3922z.m9903a((int) R.string.e_o), R.color.b3j, R.color.b3j);
        userEnterLevelView.setOnClickListener(this);
        HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.fh);
        if (aVar.f20195m.f21648b != null) {
            hSImageView.setVisibility(0);
            C3899m.m9868b(hSImageView, aVar.f20195m.f21648b);
        }
        viewGroup.setX((float) this.f20141b.getWidth());
        viewGroup.setY(0.0f);
        this.f20141b.addView(viewGroup);
        this.f20144e = C7397a.m15266a(viewGroup, new C7372a() {
            /* renamed from: a */
            public final void mo13644a(Animator animator) {
                UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
                if (userEnterLevelView != null) {
                    userEnterLevelView.mo13675a();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C7378a.this.f20141b.removeView(viewGroup);
                C7378a.this.f20145f--;
                C7378a.this.mo13652b();
            }
        });
        this.f20144e.start();
    }

    /* renamed from: k */
    private void m15241k(C7394a aVar) {
        if (aVar.f20195m != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f20147h).inflate(R.layout.art, this.f20141b, false);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f20143d;
            viewGroup.setLayoutParams(marginLayoutParams);
            UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
            userEnterLevelView.mo13676a(this.f20148i, C3922z.m9899a(22.0f), R.drawable.bgm, C3922z.m9903a((int) R.string.e_o), R.color.b3j, R.color.b3j);
            userEnterLevelView.setOnClickListener(this);
            viewGroup.setX((float) this.f20141b.getWidth());
            viewGroup.setY(0.0f);
            this.f20141b.addView(viewGroup);
            final View inflate = LayoutInflater.from(this.f20147h).inflate(R.layout.arx, this.f20141b, false);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f20141b.addView(inflate, layoutParams);
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) inflate.getLayoutParams();
            marginLayoutParams2.bottomMargin = this.f20143d - (C3922z.m9913d(R.dimen.r3) - C3922z.m9899a(78.0f));
            inflate.setLayoutParams(marginLayoutParams2);
            HSImageView hSImageView = (HSImageView) inflate.findViewById(R.id.dug);
            LayoutParams layoutParams2 = (LayoutParams) hSImageView.getLayoutParams();
            layoutParams2.height = C3922z.m9899a(255.0f);
            hSImageView.setLayoutParams(layoutParams2);
            C4596b bVar = aVar.f20196n;
            String str = null;
            if (bVar != null) {
                str = bVar.mo10396a(this.f20147h);
            }
            if (!TextUtils.isEmpty(str)) {
                hSImageView.setController(((C13773e) C13771c.m27870a().mo25725b(new Builder().scheme("file").path(str).build()).mo25762c(true)).mo25763d());
            }
            this.f20144e = C7397a.m15272c(viewGroup, new C7372a() {
                /* renamed from: a */
                public final void mo13644a(Animator animator) {
                    UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
                    if (userEnterLevelView != null) {
                        userEnterLevelView.mo13675a();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(viewGroup);
                    C7378a.this.f20141b.removeView(inflate);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }
            });
            this.f20144e.start();
        }
    }

    /* renamed from: l */
    private void m15242l(C7394a aVar) {
        String str;
        if (aVar != null && aVar.f20195m != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f20147h).inflate(R.layout.by1, this.f20141b, false);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f20143d;
            viewGroup.setLayoutParams(marginLayoutParams);
            C7836a aVar2 = aVar.f20195m;
            Spannable a = C5115z.m11756a(aVar2.f21649c, "");
            UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(R.id.fh);
            if (aVar2.f21648b != null) {
                hSImageView.setVisibility(0);
                C3899m.m9857a(hSImageView, aVar2.f21648b);
            }
            userEnterLevelView.mo13677a(a, aVar2.f21654h, aVar2.f21651e);
            userEnterLevelView.setOnClickListener(this);
            viewGroup.setX((float) this.f20141b.getWidth());
            viewGroup.setY(0.0f);
            this.f20141b.addView(viewGroup);
            final View inflate = LayoutInflater.from(this.f20147h).inflate(R.layout.arx, this.f20141b, false);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            this.f20141b.addView(inflate, layoutParams);
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) inflate.getLayoutParams();
            marginLayoutParams2.bottomMargin = this.f20143d - (C3922z.m9913d(R.dimen.r3) - C3922z.m9899a(78.0f));
            inflate.setLayoutParams(marginLayoutParams2);
            HSImageView hSImageView2 = (HSImageView) inflate.findViewById(R.id.dug);
            LayoutParams layoutParams2 = (LayoutParams) hSImageView2.getLayoutParams();
            layoutParams2.height = C3922z.m9899a(255.0f);
            hSImageView2.setLayoutParams(layoutParams2);
            C4596b bVar = aVar.f20196n;
            String str2 = null;
            if (bVar != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.f12558a);
                if (this.f20147h.getResources().getConfiguration().orientation == 1) {
                    str = bVar.f12559b;
                } else {
                    str = bVar.f12560c;
                }
                sb.append(str);
                str2 = sb.toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                hSImageView2.setController(((C13773e) C13771c.m27870a().mo25725b(new Builder().scheme("file").path(str2).build()).mo25762c(true)).mo25763d());
            }
            this.f20144e = C7397a.m15271b(viewGroup, new C7372a() {
                /* renamed from: a */
                public final void mo13644a(Animator animator) {
                    UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(R.id.drz);
                    if (userEnterLevelView != null) {
                        userEnterLevelView.mo13675a();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    C7378a.this.f20141b.removeView(viewGroup);
                    C7378a.this.f20141b.removeView(inflate);
                    C7378a.this.f20145f--;
                    C7378a.this.mo13652b();
                }
            }, aVar2.f21652f);
            this.f20144e.start();
        }
    }

    /* renamed from: a */
    public final void mo13651a(C7394a aVar) {
        if (aVar.f20195m == null || !(aVar.f20195m.f21647a == 5 || aVar.f20195m.f21647a == 7)) {
            if (aVar.f20195m != null && aVar.f20195m.f21647a == 8) {
                long j = aVar.f20195m.f21653g;
                C7211h assetsManager = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsManager();
                if (!(assetsManager == null || assetsManager.mo13434c(j) == null || assetsManager.mo13434c(j).getResourceType() != 6)) {
                    m15230c(aVar);
                    return;
                }
            }
            mo13653b(aVar);
            return;
        }
        m15230c(aVar);
    }

    public C7378a(Context context, EnterAnimationView enterAnimationView) {
        this.f20147h = context;
        this.f20141b = enterAnimationView;
        this.f20140a = new LinkedList<>();
    }

    /* renamed from: a */
    private static void m15224a(TextView textView, C7836a aVar) {
        if (aVar != null && textView != null) {
            C8851g gVar = aVar.f21649c;
            String str = null;
            String str2 = gVar.f24156b;
            if (gVar.f24155a != null) {
                str = C7676b.m15696a().mo14036a(gVar.f24155a);
            }
            if (!(str == null && str2 == null)) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                textView.setText(C5115z.m11758a(str, gVar));
            }
        }
    }

    /* renamed from: a */
    public static void m15227a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("msg_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("asset_id", str3);
        }
        C8064d.m16005b().mo9201c("ttlive_msg", (Map<String, ?>) hashMap);
    }
}
