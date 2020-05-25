package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.geckoclient.C10885e;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23643a;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23644aa;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23645ab;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23658d;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23659e;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23661f;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23664h;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23665i;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23666j;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23667k;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23669m;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23670n;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23671o;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23672p;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23674q;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23675r;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23676s;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23677t;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23678u;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23680v;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23682w;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23683x;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23684y;
import com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23686z;
import com.p683ss.android.ugc.aweme.commerce.shoptag.LynxTagAB;
import com.p683ss.android.ugc.aweme.commercialize.link.C25973h;
import com.p683ss.android.ugc.aweme.experiment.C29500b;
import com.p683ss.android.ugc.aweme.experiment.GreenScreenModeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30837cd;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30838ce;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36794a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import com.p683ss.android.ugc.aweme.sticker.prop.p2317d.C46371a;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.C47889fk;
import com.p683ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.FeedTagLayout2 */
public class FeedTagLayout2 extends AbstractFeedTagLayout implements OnClickListener {

    /* renamed from: n */
    public LinearLayout f62931n;

    /* renamed from: o */
    public C23667k f62932o;

    /* renamed from: p */
    public C30313ae<C30332aw> f62933p;

    /* renamed from: q */
    private boolean f62934q;

    /* renamed from: r */
    private DataCenter f62935r;

    /* renamed from: s */
    private String f62936s;

    /* renamed from: t */
    private String f62937t;

    /* renamed from: u */
    private String f62938u;

    /* renamed from: v */
    private String f62939v;

    /* renamed from: w */
    private boolean f62940w;

    /* renamed from: b */
    public final void mo48997b() {
        if (this.f62932o != null) {
            this.f62932o.mo49082d();
        }
    }

    public int getAnchorType() {
        return mo48990a(this.f62856d, this.f62859g);
    }

    /* renamed from: d */
    public final void mo48999d() {
        if (this.f62932o != null && (this.f62932o instanceof C23678u)) {
            ((C23678u) this.f62932o).f63064j.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48921a() {
        this.f62934q = true;
        try {
            addView(((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f62855c, R.layout.b6b));
        } catch (Exception unused) {
            LayoutInflater.from(this.f62855c).inflate(R.layout.b6b, this);
        }
        setOrientation(1);
        setPadding(0, 0, (int) C9432q.m18687b(this.f62855c, 100.0f), 0);
        if (VERSION.SDK_INT >= 17) {
            setPaddingRelative(0, 0, (int) C9432q.m18687b(this.f62855c, 100.0f), 0);
        }
        this.f62931n = (LinearLayout) findViewById(R.id.c12);
        this.f62931n.setOnTouchListener(C47889fk.m103591a(0.5f, 1.0f));
        this.f62931n.setOnClickListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r1 == false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48998c() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.base.ui.anchor.k r0 = r9.f62932o
            if (r0 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.base.ui.anchor.k r0 = r9.f62932o
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23678u
            if (r0 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.base.ui.anchor.k r0 = r9.f62932o
            com.ss.android.ugc.aweme.base.ui.anchor.u r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23678u) r0
            com.ss.android.ugc.aweme.poi.service.IPoiService r1 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r1 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r1
            boolean r1 = r1.isPoiAreaFilterNotOnlineStyle()
            r2 = 1
            if (r1 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r0.f63138u
            if (r1 == 0) goto L_0x0025
            boolean r1 = r1.isAdminArea
            if (r1 != r2) goto L_0x0025
            goto L_0x00be
        L_0x0025:
            java.lang.String r1 = r0.f63143z
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f63071q
            r4 = 0
            if (r3 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r3.getPoiStruct()
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.poiId
            goto L_0x0038
        L_0x0037:
            r3 = r4
        L_0x0038:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            r3 = 0
            if (r1 != 0) goto L_0x0054
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f63071q
            if (r1 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r1.getPoiStruct()
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.isExpandable()
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            if (r1 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r2 == 0) goto L_0x00be
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f63063i
            r2 = 8
            r1.setVisibility(r2)
            android.view.ViewGroup r1 = r0.f63064j
            r1.setVisibility(r3)
            com.ss.android.ugc.aweme.poi.service.IPoiService r1 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.poi.service.IPoiService r1 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f63071q
            java.lang.String r5 = "poi_label_show"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r7 = "enter_from"
            java.lang.String r8 = r0.f63128B
            if (r8 != 0) goto L_0x0079
            java.lang.String r8 = ""
        L_0x0079:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f63071q
            if (r8 == 0) goto L_0x0088
            java.lang.String r8 = r8.getAid()
            goto L_0x0089
        L_0x0088:
            r8 = r4
        L_0x0089:
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f63071q
            if (r8 == 0) goto L_0x0097
            java.lang.String r4 = r8.getAuthorUid()
        L_0x0097:
            com.ss.android.ugc.aweme.app.f.d r4 = r6.mo47829a(r7, r4)
            java.lang.String r6 = "poi_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f63071q
            java.lang.String r7 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r7)
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r6, r7)
            java.lang.String r6 = "poi_label_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f63071q
            if (r0 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r0.getPoiStruct()
            if (r0 == 0) goto L_0x00b7
            int r3 = r0.getPoiSubTitleType()
        L_0x00b7:
            com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47826a(r6, r3)
            r1.onEventV3IncludingPoiParams(r2, r5, r0)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.FeedTagLayout2.mo48998c():void");
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f62935r = dataCenter;
    }

    public void setOnIntervalEventListener(C30313ae<C30332aw> aeVar) {
        this.f62933p = aeVar;
    }

    public void setPoiPageType(String str) {
        this.f62939v = str;
    }

    public FeedTagLayout2(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f62932o != null) {
            this.f62932o.mo49075a(view);
        }
    }

    public void setFollowPageType(String str) {
        super.setFollowPageType(str);
        if (this.f62932o != null && (this.f62932o instanceof C23678u)) {
            C23678u uVar = (C23678u) this.f62932o;
            C52711k.m112240b(str, "<set-?>");
            uVar.f63139v = str;
        }
    }

    /* renamed from: a */
    public final C23667k mo48991a(int i) {
        if (i == 18) {
            if (this.f62932o instanceof C23672p) {
                return this.f62932o;
            }
            return new C23672p(this, this.f62860h, this.f62859g);
        } else if (i == 10) {
            if (this.f62932o instanceof C23645ab) {
                return this.f62932o;
            }
            return new C23645ab(this, this.f62860h, this.f62859g);
        } else if (i == 11) {
            if (this.f62932o instanceof C23665i) {
                return this.f62932o;
            }
            return new C23665i(this, this.f62860h, this.f62859g);
        } else if (i == 12) {
            if (this.f62932o instanceof C23670n) {
                return this.f62932o;
            }
            return new C23670n(this, this.f62860h, this.f62859g);
        } else if (i == 13) {
            if (this.f62932o instanceof C23671o) {
                return this.f62932o;
            }
            return new C23671o(this, this.f62860h, this.f62859g);
        } else if (i == 14) {
            if (this.f62932o instanceof C23643a) {
                return this.f62932o;
            }
            return new C23643a(this, this.f62860h, this.f62859g);
        } else if (i == 1) {
            if (this.f62932o instanceof C23646ac) {
                return this.f62932o;
            }
            return new C23646ac(this, this.f62860h, this.f62859g);
        } else if (i == 21) {
            if (this.f62932o instanceof C23674q) {
                return this.f62932o;
            }
            return new C23674q(this, this.f62860h, this.f62859g);
        } else if (i == 2) {
            if (this.f62932o instanceof C23684y) {
                return this.f62932o;
            }
            return new C23684y(this, this.f62860h, this.f62859g);
        } else if (i == 4) {
            if (this.f62932o instanceof C23678u) {
                return this.f62932o;
            }
            this.f62932o = new C23678u(this, this.f62860h, this.f62859g);
            C23678u uVar = (C23678u) this.f62932o;
            String str = this.f62936s;
            String str2 = this.f62937t;
            String str3 = this.f62938u;
            uVar.f63141x = str;
            uVar.f63142y = str2;
            uVar.f63143z = str3;
            return this.f62932o;
        } else if (i == 7) {
            if (this.f62932o instanceof C23664h) {
                return this.f62932o;
            }
            return new C23664h(this, this.f62860h, this.f62859g);
        } else if (i == 8) {
            if (this.f62932o instanceof C23669m) {
                return this.f62932o;
            }
            return new C23669m(this, this.f62860h, this.f62859g);
        } else if (i == 3) {
            if (this.f62932o instanceof C23676s) {
                return this.f62932o;
            }
            return new C23676s(this, this.f62860h, this.f62859g);
        } else if (i == 5) {
            if (this.f62932o instanceof C23675r) {
                return this.f62932o;
            }
            return new C23675r(this, this.f62860h, this.f62859g);
        } else if (i == 6) {
            if (this.f62932o instanceof C23644aa) {
                return this.f62932o;
            }
            return new C23644aa(this, this.f62860h, this.f62859g);
        } else if (i == 20) {
            if (this.f62932o instanceof C23666j) {
                return this.f62932o;
            }
            return new C23666j(this, this.f62860h, this.f62859g);
        } else if (i == 15) {
            if ((this.f62932o instanceof C23683x) || (this.f62932o instanceof C23686z)) {
                return this.f62932o;
            }
            if (this.f62940w) {
                return new C23686z(this, this.f62860h, this.f62859g, this.f62862j);
            }
            return new C23683x(this, this.f62860h, this.f62859g, this.f62862j);
        } else if (i == 16) {
            if (this.f62932o instanceof C23682w) {
                return this.f62932o;
            }
            return new C23682w(this, this.f62860h, this.f62859g);
        } else if (i == 17) {
            if (this.f62932o instanceof C23659e) {
                return this.f62932o;
            }
            return new C23659e(this, this.f62860h, this.f62859g);
        } else if (i == 24) {
            if (this.f62932o instanceof C23661f) {
                return this.f62932o;
            }
            return new C23661f(this, this.f62860h, this.f62859g);
        } else if (i == 19) {
            if (this.f62932o instanceof C23658d) {
                return this.f62932o;
            }
            return new C23658d(this, this.f62859g);
        } else if (i == 23) {
            if (this.f62932o instanceof C23680v) {
                return this.f62932o;
            }
            return new C23680v(this, this.f62860h, this.f62859g);
        } else if (i != 22) {
            return null;
        } else {
            if (this.f62932o instanceof C23677t) {
                return this.f62932o;
            }
            return new C23677t(this, this.f62860h, this.f62859g);
        }
    }

    /* renamed from: a */
    public final void mo48996a(boolean z) {
        if (this.f62935r != null) {
            this.f62935r.mo48228a("show_poi_distance", (Object) Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private static boolean m57929a(String str, Aweme aweme) {
        return C25973h.m62974c(aweme);
    }

    public FeedTagLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final int mo48990a(Aweme aweme, String str) {
        if (!C25973h.m62986g(aweme)) {
            return 0;
        }
        if (C36794a.m82822a(aweme)) {
            return 18;
        }
        if (C36794a.m82824b(aweme)) {
            return 10;
        }
        if (C36794a.m82825c(aweme)) {
            return 11;
        }
        if (C36794a.m82826d(aweme)) {
            return 12;
        }
        if (C36794a.m82827e(aweme)) {
            return 13;
        }
        if (C36794a.m82828f(aweme)) {
            return 14;
        }
        if (AddWikiActivity.m104718a(aweme) || AddWikiActivity.m104719b(aweme) || AddWikiActivity.m104720c(aweme)) {
            return 1;
        }
        if (C36794a.m82830h(aweme)) {
            return 21;
        }
        if (C30838ce.m72255a(aweme)) {
            return 2;
        }
        if (m57929a(str, aweme)) {
            return 4;
        }
        if (C36811b.m82844a(aweme)) {
            return 7;
        }
        if (C45379ae.m98934a(aweme)) {
            return 8;
        }
        if (C25973h.m62977d(aweme) && mo48922a(aweme)) {
            return 3;
        }
        if (C25973h.m62980e(aweme)) {
            return 5;
        }
        if (C25973h.m62983f(aweme) && !C46371a.m100720a(aweme)) {
            return 6;
        }
        if (C25973h.m62983f(aweme) && C46371a.m100720a(aweme) && GreenScreenModeExperiment.m69597a()) {
            return 20;
        }
        if (C25973h.m62975c(aweme, false, this.f62862j)) {
            return 15;
        }
        if (C30837cd.m72254a(aweme)) {
            return 16;
        }
        if (C36794a.m82829g(aweme)) {
            return 17;
        }
        if (C36794a.m82831i(aweme)) {
            return 24;
        }
        if (C36794a.m82832j(aweme)) {
            return 19;
        }
        if (C36794a.m82823a(aweme, getContext())) {
            return 23;
        }
        if (C36794a.m82833k(aweme)) {
            return 22;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo48994a(Aweme aweme, String str, JSONObject jSONObject) {
        this.f62856d = aweme;
        this.f62859g = str;
        this.f62861i = jSONObject;
    }

    public FeedTagLayout2(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        boolean z2 = false;
        if (C10181b.m20511a().mo18168a(LynxTagAB.class, true, "goods_feed_shopping_tag_dynamic", 31744, 0) == 1) {
            String str = "lynx_shop_tag";
            if (C47731bq.m103352f()) {
                z = C47731bq.m103360j(str);
            } else {
                C10885e e = C47731bq.m103348e();
                if (e != null) {
                    z = e.mo19666b(str);
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.f62940w = z2;
        this.f62855c = context;
        setOrientation(1);
    }

    /* renamed from: a */
    public final void mo48995a(String str, String str2, String str3) {
        this.f62936s = str;
        this.f62937t = str2;
        this.f62938u = str3;
    }

    /* renamed from: a */
    public final void mo48992a(Aweme aweme, Activity activity, String str, JSONObject jSONObject) {
        mo48993a(aweme, activity, str, jSONObject, -1);
    }

    /* renamed from: a */
    public final void mo48993a(Aweme aweme, Activity activity, String str, JSONObject jSONObject, int i) {
        if (!this.f62934q) {
            mo48921a();
        }
        this.f62856d = aweme;
        this.f62859g = str;
        this.f62860h = activity;
        this.f62861i = jSONObject;
        boolean z = false;
        if (C29500b.m69638a(this.f62856d) && ((this.f62856d.getFeedRelationLabel() != null && (TextUtils.equals(this.f62859g, "homepage_follow") || TextUtils.equals(this.f62859g, "homepage_hot"))) || (this.f62856d.getRelationLabel() != null && this.f62856d.getRelationLabel().getType() == 5))) {
            z = true;
        }
        if (z) {
            setVisibility(8);
            return;
        }
        C2201v a = C2201v.m6601a((C2205y<T>) new C23692f<T>(this, i));
        a.mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<Integer>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final void onSubscribe(C1690c cVar) {
            }

            public final /* synthetic */ void onNext(Object obj) {
                Integer num = (Integer) obj;
                if (num.intValue() == 4) {
                    FeedTagLayout2.this.mo48996a(true);
                } else {
                    FeedTagLayout2.this.mo48996a(false);
                }
                if (num.intValue() == 0) {
                    FeedTagLayout2.this.setVisibility(8);
                    FeedTagLayout2.this.f62863k = false;
                    FeedTagLayout2.this.f62932o = null;
                    return;
                }
                FeedTagLayout2.this.f62932o = FeedTagLayout2.this.mo48991a(num.intValue());
                if (FeedTagLayout2.this.f62932o == null) {
                    FeedTagLayout2 feedTagLayout2 = FeedTagLayout2.this;
                    feedTagLayout2.setVisibility(8);
                    feedTagLayout2.f62863k = false;
                    return;
                }
                FeedTagLayout2.this.f62931n.setBackgroundResource(FeedTagLayout2.this.f62932o.mo49083e());
                FeedTagLayout2.this.setVisibility(0);
                FeedTagLayout2.this.f62863k = true;
                if (FeedTagLayout2.this.f62932o instanceof C23678u) {
                    ((C23678u) FeedTagLayout2.this.f62932o).f63140w = FeedTagLayout2.this.f62933p;
                }
                if (FeedTagLayout2.this.f62932o instanceof C23683x) {
                    ((C23683x) FeedTagLayout2.this.f62932o).f63158a = FeedTagLayout2.this.f62933p;
                }
                if (FeedTagLayout2.this.f62932o instanceof C23686z) {
                    ((C23686z) FeedTagLayout2.this.f62932o).f63171e = FeedTagLayout2.this.f62933p;
                }
                if (FeedTagLayout2.this.f62932o instanceof C23682w) {
                    ((C23682w) FeedTagLayout2.this.f62932o).f63153a = FeedTagLayout2.this.f62933p;
                }
                if (FeedTagLayout2.this.f62932o instanceof C23646ac) {
                    ((C23646ac) FeedTagLayout2.this.f62932o).f63049a = FeedTagLayout2.this.f62933p;
                }
                FeedTagLayout2.this.f62932o.mo49076a(FeedTagLayout2.this.f62856d, FeedTagLayout2.this.f62861i);
            }
        });
    }
}
