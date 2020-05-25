package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.facebook.common.p927k.C13731f;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.C22551ak;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p683ss.android.ugc.aweme.commerce.service.p1534a.C25540a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25622e;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AnchorPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45385ai;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45397ao;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c */
public final class C45087c implements IAVPublishExtension<AnchorPublishModel> {

    /* renamed from: l */
    public static final C45088a f114187l = new C45088a(null);

    /* renamed from: a */
    public C45156d f114188a;

    /* renamed from: b */
    public ExtensionMisc f114189b;

    /* renamed from: c */
    public Fragment f114190c;

    /* renamed from: d */
    public AVPublishContentType f114191d;

    /* renamed from: e */
    public PublishOutput f114192e;

    /* renamed from: f */
    public C26109ad f114193f;

    /* renamed from: g */
    public LinearLayout f114194g;

    /* renamed from: h */
    public Context f114195h;

    /* renamed from: i */
    public MentionEditText f114196i;

    /* renamed from: j */
    public C25622e f114197j;

    /* renamed from: k */
    public List<C25626g> f114198k;

    /* renamed from: m */
    private DmtTextView f114199m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$a */
    public static final class C45088a {
        private C45088a() {
        }

        public /* synthetic */ C45088a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static UrlModel m98613a(Integer num) {
            int i;
            UrlModel urlModel = new UrlModel();
            int type = C25600a.ANCHOR_SHOP_LINK.getTYPE();
            if (num != null && num.intValue() == type) {
                i = 2131953604;
            } else {
                int type2 = C25600a.ARTICLE.getTYPE();
                if (num != null && num.intValue() == type2) {
                    i = R.drawable.d03;
                } else {
                    int type3 = C25600a.POI.getTYPE();
                    if (num != null && num.intValue() == type3) {
                        i = R.drawable.d0e;
                    } else {
                        int type4 = C25600a.SHOP.getTYPE();
                        if (num != null && num.intValue() == type4) {
                            i = R.drawable.d0j;
                        } else {
                            int type5 = C25600a.MICRO_APP.getTYPE();
                            if (num != null && num.intValue() == type5) {
                                i = R.drawable.d0b;
                            } else {
                                int type6 = C25600a.MICRO_GAME.getTYPE();
                                if (num != null && num.intValue() == type6) {
                                    i = R.drawable.d0c;
                                } else {
                                    int type7 = C25600a.GAME.getTYPE();
                                    if (num != null && num.intValue() == type7) {
                                        i = R.drawable.d09;
                                    } else {
                                        int type8 = C25600a.MEDIUM.getTYPE();
                                        if (num != null && num.intValue() == type8) {
                                            i = R.drawable.d0a;
                                        } else {
                                            int type9 = C25600a.INDIA_MOVIE.getTYPE();
                                            if (num != null && num.intValue() == type9) {
                                                i = R.drawable.d0d;
                                            } else {
                                                int type10 = C25600a.SEEDING.getTYPE();
                                                if (num != null && num.intValue() == type10) {
                                                    i = R.drawable.d0g;
                                                } else {
                                                    int type11 = C25600a.WIKIPEDIA.getTYPE();
                                                    if (num != null && num.intValue() == type11) {
                                                        i = R.drawable.d0m;
                                                    } else {
                                                        int type12 = C25600a.YELP.getTYPE();
                                                        if (num != null && num.intValue() == type12) {
                                                            i = R.drawable.d0o;
                                                        } else {
                                                            int type13 = C25600a.TRIP_ADVISOR.getTYPE();
                                                            if (num != null && num.intValue() == type13) {
                                                                i = R.drawable.d0l;
                                                            } else {
                                                                int type14 = C25600a.COUPON.getTYPE();
                                                                if (num != null && num.intValue() == type14) {
                                                                    i = R.drawable.d06;
                                                                } else {
                                                                    int type15 = C25600a.BRAND_WIKI.getTYPE();
                                                                    if (num != null && num.intValue() == type15) {
                                                                        i = R.drawable.d05;
                                                                    } else {
                                                                        i = R.drawable.d04;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C13731f.m27775a(i).toString());
            urlModel.setUrlList(arrayList);
            urlModel.setWidth(720);
            urlModel.setHeight(720);
            return urlModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$b */
    public static final class C45089b implements C25540a {

        /* renamed from: a */
        final /* synthetic */ C45087c f114200a;

        C45089b(C45087c cVar) {
            this.f114200a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$c */
    static final class C45090c<T> implements C0199s<AnchorTransData> {

        /* renamed from: a */
        final /* synthetic */ C45087c f114201a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114202b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$c$a */
        static final class C45091a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ AnchorTransData f114203a;

            /* renamed from: b */
            final /* synthetic */ C45090c f114204b;

            C45091a(AnchorTransData anchorTransData, C45090c cVar) {
                this.f114203a = anchorTransData;
                this.f114204b = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                if (this.f114203a.getBusinessType() == C25600a.ANCHOR_SHOP_LINK.getTYPE() && this.f114204b.f114201a.mo91438a().getVisibility() == 0) {
                    C45385ai.m98942a(this.f114204b.f114201a.f114196i);
                }
                C26890h.m65011a("delete_label", new C23089d().mo47829a("enter_from", "video_post_page").mo47829a("shoot_way", this.f114204b.f114202b.getMobParam().getShootWay()).mo47829a("creation_id", this.f114204b.f114202b.getMobParam().getCreationId()).mo47826a("business_type", this.f114203a.getBusinessType()).f61491a);
                this.f114204b.f114201a.mo91439a(this.f114204b.f114202b);
                return C52860x.f131107a;
            }
        }

        C45090c(C45087c cVar, ExtensionMisc extensionMisc) {
            this.f114201a = cVar;
            this.f114202b = extensionMisc;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            Object obj2;
            boolean z;
            AnchorTransData anchorTransData = (AnchorTransData) obj;
            if (anchorTransData != null) {
                List<C25626g> list = this.f114201a.f114198k;
                String str = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((C25626g) obj2).f67830a == C25600a.ANCHOR_SHOP_LINK.getTYPE() && this.f114201a.mo91438a().getVisibility() == 0 && anchorTransData.getBusinessType() == C25600a.ANCHOR_SHOP_LINK.getTYPE()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C25626g gVar = (C25626g) obj2;
                    if (gVar != null) {
                        C45385ai.m98941a(this.f114201a.f114195h, this.f114201a.f114196i, gVar.f67839j);
                    }
                }
                Integer source = anchorTransData.getSource();
                if (source != null && source.intValue() == 999) {
                    this.f114201a.mo91438a().mo91461a();
                } else {
                    C45156d a = this.f114201a.mo91438a();
                    UrlModel anchorIcon = anchorTransData.getAnchorIcon();
                    if (anchorIcon == null) {
                        anchorIcon = C45088a.m98613a(Integer.valueOf(anchorTransData.getBusinessType()));
                    }
                    UrlModel urlModel = anchorIcon;
                    String title = anchorTransData.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    String str2 = title;
                    String anchorTag = anchorTransData.getAnchorTag();
                    if (anchorTag == null) {
                        anchorTag = "";
                    }
                    String str3 = anchorTag;
                    Integer source2 = anchorTransData.getSource();
                    if (source2 != null) {
                        i2 = source2.intValue();
                    } else {
                        i2 = 0;
                    }
                    a.mo91462a(urlModel, str2, str3, i2, new C45091a(anchorTransData, this));
                }
                C39592a publishExtensionDataContainer = this.f114202b.getPublishExtensionDataContainer();
                if (publishExtensionDataContainer != null) {
                    str = publishExtensionDataContainer.mo78634c();
                }
                C26109ad a2 = C26109ad.m63393a(str);
                a2.f68926h = anchorTransData.getBusinessType();
                a2.f68927i = anchorTransData.getAnchorContent();
                a2.f68928j = anchorTransData.getTitle();
                a2.f68938t = anchorTransData.getAnchorTag();
                a2.f68925g = anchorTransData.getId();
                Integer source3 = anchorTransData.getSource();
                if (source3 != null) {
                    i = source3.intValue();
                } else {
                    i = 0;
                }
                a2.f68930l = i;
                C39592a publishExtensionDataContainer2 = this.f114202b.getPublishExtensionDataContainer();
                if (publishExtensionDataContainer2 != null) {
                    publishExtensionDataContainer2.mo78632a(C26109ad.m63394a(a2));
                }
                this.f114202b.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(false));
                if (anchorTransData.getBusinessType() == C25600a.SHOP.getTYPE()) {
                    this.f114202b.getExtensionDataRepo().getRecordLinkAction().invoke();
                    this.f114202b.getExtensionDataRepo().getResetLinkAction().invoke();
                    this.f114202b.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(false));
                }
                return;
            }
            this.f114201a.mo91442b(this.f114202b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$d */
    static final class C45092d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45087c f114205a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f114206b;

        /* renamed from: c */
        final /* synthetic */ Fragment f114207c;

        /* renamed from: d */
        final /* synthetic */ AVPublishContentType f114208d;

        C45092d(C45087c cVar, ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
            this.f114205a = cVar;
            this.f114206b = extensionMisc;
            this.f114207c = fragment;
            this.f114208d = aVPublishContentType;
        }

        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r6v29, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r7v1 */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r5v38 */
        /* JADX WARNING: type inference failed for: r5v39 */
        /* JADX WARNING: type inference failed for: r5v40 */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x02d1, code lost:
            if (r0 == null) goto L_0x02d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x0372, code lost:
            if (r0 == null) goto L_0x0374;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0232, code lost:
            if (r0 == null) goto L_0x0234;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v5
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, ?[OBJECT, ARRAY], java.lang.Integer]
          uses: [java.lang.Object, java.lang.String]
          mth insns count: 573
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 6 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
                r12 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r13)
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
                android.arch.lifecycle.r r0 = r0.getUpdateAnchor()
                java.lang.Object r0 = r0.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r0 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r0
                r1 = 2132549428(0x7f1c1f34, float:2.0752158E38)
                if (r0 == 0) goto L_0x0052
                java.lang.Integer r2 = r0.getSource()
                if (r2 != 0) goto L_0x001f
                goto L_0x0047
            L_0x001f:
                int r2 = r2.intValue()
                r3 = 999(0x3e7, float:1.4E-42)
                if (r2 != r3) goto L_0x0047
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.c r0 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r0 = r0.mo91438a()
                android.content.Context r0 = r0.getContext()
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r13, r0)
                r13.mo19066a()
                return
            L_0x0047:
                java.lang.Integer r0 = r0.getSource()
                boolean r0 = com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82845a(r0)
                if (r0 == 0) goto L_0x0052
                return
            L_0x0052:
                com.ss.android.ugc.aweme.shortvideo.ui.c r0 = r12.f114205a
                java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r0 = r0.f114198k
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0066
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L_0x0064
                goto L_0x0066
            L_0x0064:
                r5 = 0
                goto L_0x0067
            L_0x0066:
                r5 = 1
            L_0x0067:
                if (r5 == 0) goto L_0x006a
                return
            L_0x006a:
                java.lang.String r5 = "open_label_panel"
                com.ss.android.ugc.aweme.app.f.d r6 = new com.ss.android.ugc.aweme.app.f.d
                r6.<init>()
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r6)
                com.ss.android.ugc.aweme.shortvideo.ui.c r5 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r5 = r5.mo91438a()
                boolean r5 = r5.f113683j
                if (r5 != 0) goto L_0x0141
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.r r13 = r13.getWithStarAtlasAnchor()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                boolean r13 = p2628d.p2639f.p2641b.C52711k.m112239a(r13, r0)
                if (r13 != 0) goto L_0x0121
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.r r13 = r13.getWithStarAtlasOrderGoods()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                boolean r13 = p2628d.p2639f.p2641b.C52711k.m112239a(r13, r0)
                if (r13 != 0) goto L_0x0121
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.r r13 = r13.getWithStarAtlasOrderLink()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                boolean r13 = p2628d.p2639f.p2641b.C52711k.m112239a(r13, r0)
                if (r13 != 0) goto L_0x0121
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.r r13 = r13.getWithStarAtlasOrderPoi()
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                boolean r13 = p2628d.p2639f.p2641b.C52711k.m112239a(r13, r0)
                if (r13 == 0) goto L_0x00e9
                goto L_0x0121
            L_0x00e9:
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.c r0 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r0 = r0.mo91438a()
                android.content.Context r0 = r0.getContext()
                r1 = 2132543501(0x7f1c080d, float:2.0740137E38)
                java.lang.Object[] r2 = new java.lang.Object[r4]
                com.ss.android.ugc.aweme.shortvideo.ui.c r4 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r4 = r4.mo91438a()
                android.content.Context r4 = r4.getContext()
                r5 = 2132543584(0x7f1c0860, float:2.0740305E38)
                java.lang.String r4 = r4.getString(r5)
                r2[r3] = r4
                java.lang.String r0 = r0.getString(r1, r2)
                com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r13, r0)
                r13.mo19066a()
                return
            L_0x0121:
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                com.ss.android.ugc.aweme.shortvideo.ui.c r0 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r0 = r0.mo91438a()
                android.content.Context r0 = r0.getContext()
                java.lang.String r0 = r0.getString(r1)
                com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r13, r0)
                r13.mo19066a()
                return
            L_0x0141:
                com.ss.android.ugc.aweme.shortvideo.ui.c r1 = r12.f114205a
                java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r1 = r1.f114198k
                if (r1 == 0) goto L_0x015c
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x014d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x015c
                java.lang.Object r5 = r1.next()
                com.ss.android.ugc.aweme.commercialize.anchor.g r5 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r5
                r5.f67843n = r4
                goto L_0x014d
            L_0x015c:
                com.ss.android.ugc.aweme.shortvideo.ui.c r1 = r12.f114205a
                java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r1 = r1.f114198k
                if (r1 == 0) goto L_0x01ad
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Collection r5 = (java.util.Collection) r5
                java.util.Iterator r1 = r1.iterator()
            L_0x016f:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x018f
                java.lang.Object r6 = r1.next()
                r7 = r6
                com.ss.android.ugc.aweme.commercialize.anchor.g r7 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r7
                int r7 = r7.f67830a
                com.ss.android.ugc.aweme.commercialize.anchor.a r8 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
                int r8 = r8.getTYPE()
                if (r7 != r8) goto L_0x0188
                r7 = 1
                goto L_0x0189
            L_0x0188:
                r7 = 0
            L_0x0189:
                if (r7 == 0) goto L_0x016f
                r5.add(r6)
                goto L_0x016f
            L_0x018f:
                java.util.List r5 = (java.util.List) r5
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r1 = r5.iterator()
            L_0x0197:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x01ad
                java.lang.Object r5 = r1.next()
                com.ss.android.ugc.aweme.commercialize.anchor.g r5 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r5
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r6 = r12.f114206b
                boolean r6 = r6.getHasEditPageWikiAnchor()
                r6 = r6 ^ r4
                r5.f67843n = r6
                goto L_0x0197
            L_0x01ad:
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r1 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r1 = r1.getExtensionDataRepo()
                android.arch.lifecycle.r r1 = r1.getUpdateAnchor()
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r1 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r1
                r5 = 0
                if (r1 == 0) goto L_0x01c9
                int r1 = r1.getBusinessType()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x01ca
            L_0x01c9:
                r1 = r5
            L_0x01ca:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
                int r6 = r6.getTYPE()
                r7 = 3
                r8 = 2
                r9 = 4
                if (r1 != 0) goto L_0x01d7
                goto L_0x0287
            L_0x01d7:
                int r10 = r1.intValue()
                if (r10 != r6) goto L_0x0287
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r13 = r0.iterator()
            L_0x01e3:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x0200
                java.lang.Object r0 = r13.next()
                r1 = r0
                com.ss.android.ugc.aweme.commercialize.anchor.g r1 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r1
                int r1 = r1.f67830a
                com.ss.android.ugc.aweme.commercialize.anchor.a r2 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
                int r2 = r2.getTYPE()
                if (r1 != r2) goto L_0x01fc
                r1 = 1
                goto L_0x01fd
            L_0x01fc:
                r1 = 0
            L_0x01fd:
                if (r1 == 0) goto L_0x01e3
                goto L_0x0201
            L_0x0200:
                r0 = r5
            L_0x0201:
                com.ss.android.ugc.aweme.commercialize.anchor.g r0 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r0
                if (r0 == 0) goto L_0x021f
                boolean r13 = r0.f67843n
                if (r13 != 0) goto L_0x021f
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                android.content.Context r13 = r13.f114195h
                if (r13 == 0) goto L_0x021e
                r0 = 2132552019(0x7f1c2953, float:2.0757413E38)
                java.lang.String r0 = r13.getString(r0)
                com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r13, r0)
                r13.mo19066a()
                return
            L_0x021e:
                return
            L_0x021f:
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                java.lang.String r1 = "delegate.context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r1)
                if (r0 == 0) goto L_0x0234
                java.lang.String r0 = r0.f67833d
                if (r0 != 0) goto L_0x0236
            L_0x0234:
                java.lang.String r0 = ""
            L_0x0236:
                d.n[] r1 = new p2628d.C52847n[r9]
                java.lang.String r2 = "title"
                android.support.v4.app.Fragment r5 = r12.f114207c
                r6 = 2132543591(0x7f1c0867, float:2.074032E38)
                java.lang.String r5 = r5.getString(r6)
                d.n r2 = p2628d.C52856t.m112465a(r2, r5)
                r1[r3] = r2
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.MobParam r3 = r3.getMobParam()
                java.lang.String r3 = r3.getShootWay()
                if (r3 != 0) goto L_0x0259
                java.lang.String r3 = ""
            L_0x0259:
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r4] = r2
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.MobParam r3 = r3.getMobParam()
                java.lang.String r3 = r3.getCreationId()
                if (r3 != 0) goto L_0x026f
                java.lang.String r3 = ""
            L_0x026f:
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r8] = r2
                java.lang.String r2 = "show_keyboard"
                java.lang.String r3 = "true"
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r7] = r2
                java.util.Map r1 = p2628d.p2629a.C52550ab.m112050a(r1)
                com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a.m104727a(r13, r0, r1)
                return
            L_0x0287:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.YELP
                int r6 = r6.getTYPE()
                r10 = 5
                if (r1 != 0) goto L_0x0292
                goto L_0x0329
            L_0x0292:
                int r11 = r1.intValue()
                if (r11 != r6) goto L_0x0329
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r13 = r0.iterator()
            L_0x029e:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x02bb
                java.lang.Object r0 = r13.next()
                r1 = r0
                com.ss.android.ugc.aweme.commercialize.anchor.g r1 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r1
                int r1 = r1.f67830a
                com.ss.android.ugc.aweme.commercialize.anchor.a r2 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.YELP
                int r2 = r2.getTYPE()
                if (r1 != r2) goto L_0x02b7
                r1 = 1
                goto L_0x02b8
            L_0x02b7:
                r1 = 0
            L_0x02b8:
                if (r1 == 0) goto L_0x029e
                goto L_0x02bc
            L_0x02bb:
                r0 = r5
            L_0x02bc:
                com.ss.android.ugc.aweme.commercialize.anchor.g r0 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r0
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                java.lang.String r1 = "delegate.context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r1)
                if (r0 == 0) goto L_0x02d3
                java.lang.String r0 = r0.f67833d
                if (r0 != 0) goto L_0x02d5
            L_0x02d3:
                java.lang.String r0 = ""
            L_0x02d5:
                d.n[] r1 = new p2628d.C52847n[r10]
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r5 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.MobParam r5 = r5.getMobParam()
                java.lang.String r5 = r5.getShootWay()
                if (r5 != 0) goto L_0x02e7
                java.lang.String r5 = ""
            L_0x02e7:
                d.n r2 = p2628d.C52856t.m112465a(r2, r5)
                r1[r3] = r2
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.MobParam r3 = r3.getMobParam()
                java.lang.String r3 = r3.getCreationId()
                if (r3 != 0) goto L_0x02fd
                java.lang.String r3 = ""
            L_0x02fd:
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r4] = r2
                java.lang.String r2 = "host_filter"
                java.lang.String r3 = "true"
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r8] = r2
                java.lang.String r2 = "anchor_type"
                java.lang.String r3 = "Yelp"
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r7] = r2
                java.lang.String r2 = "addButton"
                java.lang.String r3 = "true"
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r9] = r2
                java.util.Map r1 = p2628d.p2629a.C52550ab.m112050a(r1)
                com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a.m104727a(r13, r0, r1)
                return
            L_0x0329:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.TRIP_ADVISOR
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x0333
                goto L_0x03ca
            L_0x0333:
                int r11 = r1.intValue()
                if (r11 != r6) goto L_0x03ca
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r13 = r0.iterator()
            L_0x033f:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x035c
                java.lang.Object r0 = r13.next()
                r1 = r0
                com.ss.android.ugc.aweme.commercialize.anchor.g r1 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r1
                int r1 = r1.f67830a
                com.ss.android.ugc.aweme.commercialize.anchor.a r2 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.TRIP_ADVISOR
                int r2 = r2.getTYPE()
                if (r1 != r2) goto L_0x0358
                r1 = 1
                goto L_0x0359
            L_0x0358:
                r1 = 0
            L_0x0359:
                if (r1 == 0) goto L_0x033f
                goto L_0x035d
            L_0x035c:
                r0 = r5
            L_0x035d:
                com.ss.android.ugc.aweme.commercialize.anchor.g r0 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r0
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                java.lang.String r1 = "delegate.context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r1)
                if (r0 == 0) goto L_0x0374
                java.lang.String r0 = r0.f67833d
                if (r0 != 0) goto L_0x0376
            L_0x0374:
                java.lang.String r0 = ""
            L_0x0376:
                d.n[] r1 = new p2628d.C52847n[r10]
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r5 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.MobParam r5 = r5.getMobParam()
                java.lang.String r5 = r5.getShootWay()
                if (r5 != 0) goto L_0x0388
                java.lang.String r5 = ""
            L_0x0388:
                d.n r2 = p2628d.C52856t.m112465a(r2, r5)
                r1[r3] = r2
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.MobParam r3 = r3.getMobParam()
                java.lang.String r3 = r3.getCreationId()
                if (r3 != 0) goto L_0x039e
                java.lang.String r3 = ""
            L_0x039e:
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r4] = r2
                java.lang.String r2 = "host_filter"
                java.lang.String r3 = "true"
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r8] = r2
                java.lang.String r2 = "anchor_type"
                java.lang.String r3 = "TripAdvisor"
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r7] = r2
                java.lang.String r2 = "addButton"
                java.lang.String r3 = "true"
                d.n r2 = p2628d.C52856t.m112465a(r2, r3)
                r1[r9] = r2
                java.util.Map r1 = p2628d.p2629a.C52550ab.m112050a(r1)
                com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a.m104727a(r13, r0, r1)
                return
            L_0x03ca:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.INDIA_MOVIE
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x03d3
                goto L_0x03e9
            L_0x03d3:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x03e9
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.c r0 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r0 = r0.mo91438a()
                android.content.Context r0 = r0.getContext()
                r13.mo91444c(r0)
                return
            L_0x03e9:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.GAME
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x03f2
                goto L_0x0406
            L_0x03f2:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x0406
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.m98599b(r13)
                return
            L_0x0406:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_APP
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x040f
                goto L_0x047b
            L_0x040f:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x047b
                com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r13 = new com.ss.android.ugc.aweme.miniapp_api.model.b.b$a
                r13.<init>()
                java.lang.String r0 = "publish_page"
                com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r13 = r13.mo76222b(r0)
                java.lang.String r0 = "021017"
                com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r13 = r13.mo76223c(r0)
                com.ss.android.ugc.aweme.miniapp_api.model.b.b r13 = r13.mo76221a()
                com.google.gson.f r0 = new com.google.gson.f
                r0.<init>()
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r1 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r1 = r1.getExtensionDataRepo()
                android.arch.lifecycle.r r1 = r1.getUpdateAnchor()
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r1 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r1
                if (r1 == 0) goto L_0x0445
                java.lang.String r5 = r1.getAnchorContent()
            L_0x0445:
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.o> r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o.class
                java.lang.Object r0 = r0.mo34884a(r5, r1)
                com.ss.android.ugc.aweme.shortvideo.edit.o r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o) r0
                com.ss.android.ugc.aweme.miniapp_api.services.a r1 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
                java.lang.String r2 = "MiniAppServiceProxy.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = r1.mo76294a()
                java.lang.String r2 = "microAppModel"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                java.lang.String r0 = r0.getSchema()
                java.lang.String r2 = "021017"
                java.lang.String r0 = r1.addScene(r0, r2)
                java.lang.String r0 = r1.setLaunchModeHostTask(r0)
                com.ss.android.ugc.aweme.shortvideo.ui.c r2 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r2 = r2.mo91438a()
                android.content.Context r2 = r2.getContext()
                r1.openMiniApp(r2, r0, r13)
                return
            L_0x047b:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ARTICLE
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x0484
                goto L_0x04b2
            L_0x0484:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x04b2
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.r r13 = r13.getUpdateAnchor()
                java.lang.Object r13 = r13.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r13 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r13
                if (r13 == 0) goto L_0x04b1
                java.lang.String r13 = r13.getAnchorContent()
                if (r13 == 0) goto L_0x04b1
                android.support.v4.app.Fragment r0 = r12.f114207c
                android.content.Context r0 = r0.getContext()
                com.ss.android.ugc.aweme.commercialize.anchor.b.a$a r13 = com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.m62149a(r13)
                com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.m62150a(r0, r13)
                goto L_0x0636
            L_0x04b1:
                return
            L_0x04b2:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.POI
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x04bb
                goto L_0x04cd
            L_0x04bb:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x04cd
                com.ss.android.ugc.aweme.shortvideo.ui.ab r13 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44955ab.f113869a
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r12.f114206b
                android.support.v4.app.Fragment r1 = r12.f114207c
                com.ss.android.ugc.aweme.services.publish.AVPublishContentType r2 = r12.f114208d
                r13.mo91247a(r0, r1, r2)
                return
            L_0x04cd:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SHOP
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x04d6
                goto L_0x04e2
            L_0x04d6:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x04e2
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                r13.mo91446e()
                return
            L_0x04e2:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ANCHOR_SHOP_LINK
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x04ec
                goto L_0x058b
            L_0x04ec:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x058b
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r13 = r12.f114206b
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r13 = r13.getExtensionDataRepo()
                android.arch.lifecycle.r r13 = r13.getUpdateAnchor()
                java.lang.Object r13 = r13.getValue()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r13 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r13
                if (r13 == 0) goto L_0x058a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x050a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0527
                java.lang.Object r1 = r0.next()
                r2 = r1
                com.ss.android.ugc.aweme.commercialize.anchor.g r2 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r2
                int r2 = r2.f67830a
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ANCHOR_SHOP_LINK
                int r6 = r6.getTYPE()
                if (r2 != r6) goto L_0x0523
                r2 = 1
                goto L_0x0524
            L_0x0523:
                r2 = 0
            L_0x0524:
                if (r2 == 0) goto L_0x050a
                goto L_0x0528
            L_0x0527:
                r1 = r5
            L_0x0528:
                com.ss.android.ugc.aweme.commercialize.anchor.g r1 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r1
                java.lang.String r0 = "add_label"
                com.ss.android.ugc.aweme.app.f.d r2 = new com.ss.android.ugc.aweme.app.f.d
                r2.<init>()
                java.lang.String r3 = "enter_from"
                java.lang.String r4 = "label_panel"
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "business_type"
                if (r1 == 0) goto L_0x0543
                int r4 = r1.f67830a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            L_0x0543:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47828a(r3, r5)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
                if (r1 == 0) goto L_0x0636
                java.lang.String r0 = r1.f67833d
                if (r0 == 0) goto L_0x058a
                java.lang.String r0 = r1.f67833d
                com.ss.android.ugc.aweme.music.e.g$a r0 = com.p683ss.android.ugc.aweme.music.p1977e.C37382g.m83707a(r0)
                java.lang.String r1 = "anchor_content"
                java.lang.String r13 = r13.getAnchorContent()
                com.ss.android.ugc.aweme.music.e.g$a r13 = r0.mo76659a(r1, r13)
                java.lang.String r0 = "need_bottom_out"
                java.lang.String r1 = "1"
                com.ss.android.ugc.aweme.music.e.g$a r13 = r13.mo76659a(r0, r1)
                android.net.Uri r13 = r13.mo76658a()
                java.lang.String r13 = r13.toString()
                java.lang.String r0 = "RnSchemeHelper.parseRnSc…              .toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
                com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
                android.support.v4.app.Fragment r1 = r12.f114207c
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.app.Activity r1 = (android.app.Activity) r1
                boolean r13 = r0.mo83858a(r1, r13)
                java.lang.Boolean.valueOf(r13)
            L_0x058a:
                return
            L_0x058b:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SEEDING
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x0594
                goto L_0x05a0
            L_0x0594:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x05a0
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                r13.mo91447f()
                return
            L_0x05a0:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MEDIUM
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x05a9
                goto L_0x05bd
            L_0x05a9:
                int r7 = r1.intValue()
                if (r7 != r6) goto L_0x05bd
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.shortvideo.ui.d r13 = r13.mo91438a()
                android.content.Context r13 = r13.getContext()
                com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.m98598a(r13)
                return
            L_0x05bd:
                com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.COUPON
                int r6 = r6.getTYPE()
                if (r1 != 0) goto L_0x05c6
                goto L_0x05d2
            L_0x05c6:
                int r1 = r1.intValue()
                if (r1 != r6) goto L_0x05d2
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                r13.mo91448g()
                return
            L_0x05d2:
                com.ss.android.ugc.aweme.shortvideo.ui.c r1 = r12.f114205a
                com.ss.android.ugc.aweme.commercialize.anchor.e r1 = r1.f114197j
                if (r1 != 0) goto L_0x062a
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r1 = (java.util.List) r1
                r1.addAll(r2)
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x05eb:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x0608
                java.lang.Object r6 = r1.next()
                r7 = r6
                com.ss.android.ugc.aweme.commercialize.anchor.g r7 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r7
                int r7 = r7.f67830a
                com.ss.android.ugc.aweme.commercialize.anchor.a r8 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_APP
                int r8 = r8.getTYPE()
                if (r7 != r8) goto L_0x0604
                r7 = 1
                goto L_0x0605
            L_0x0604:
                r7 = 0
            L_0x0605:
                if (r7 == 0) goto L_0x05eb
                r5 = r6
            L_0x0608:
                java.util.Collection r1 = p2628d.p2639f.p2641b.C52731z.m112266b(r2)
                r1.remove(r5)
                com.ss.android.ugc.aweme.shortvideo.ui.c r1 = r12.f114205a
                com.ss.android.ugc.aweme.commercialize.anchor.e r2 = new com.ss.android.ugc.aweme.commercialize.anchor.e
                java.lang.String r3 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r3)
                android.content.Context r13 = r13.getContext()
                java.lang.String r3 = "it.context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r3)
                android.support.v4.app.Fragment r3 = r12.f114207c
                android.arch.lifecycle.k r3 = (android.arch.lifecycle.C0184k) r3
                r2.<init>(r13, r0, r3)
                r1.f114197j = r2
            L_0x062a:
                com.ss.android.ugc.aweme.shortvideo.ui.c r13 = r12.f114205a
                com.ss.android.ugc.aweme.commercialize.anchor.e r13 = r13.f114197j
                if (r13 != 0) goto L_0x0633
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0633:
                r13.show()
            L_0x0636:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.C45092d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$e */
    static final class C45093e extends C52712l implements C52671b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ ExtensionMisc f114209a;

        C45093e(ExtensionMisc extensionMisc) {
            this.f114209a = extensionMisc;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            this.f114209a.getExtensionDataRepo().getUpdateAnchor().getValue();
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$f */
    static final class C45094f<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45087c f114210a;

        C45094f(C45087c cVar) {
            this.f114210a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45087c cVar = this.f114210a;
                C52711k.m112236a((Object) bool, "it");
                cVar.mo91440a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$g */
    static final class C45095g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ ExtensionMisc f114211a;

        C45095g(ExtensionMisc extensionMisc) {
            this.f114211a = extensionMisc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f114211a.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            this.f114211a.getExtensionDataRepo().getAnchorState().setValue(Boolean.valueOf(true));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$h */
    static final class C45096h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C45096h f114212a = new C45096h();

        C45096h() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$i */
    static final class C45097i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25626g f114213a;

        /* renamed from: b */
        final /* synthetic */ C45087c f114214b;

        C45097i(C25626g gVar, C45087c cVar) {
            this.f114213a = gVar;
            this.f114214b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C26890h.m65011a("add_label", new C23089d().mo47829a("enter_from", "label_panel").mo47826a("business_type", this.f114213a.f67830a).f61491a);
            int i = this.f114213a.f67830a;
            if (i == C25600a.WIKIPEDIA.getTYPE()) {
                if (!this.f114213a.f67843n) {
                    Context context = this.f114214b.f114195h;
                    if (context != null) {
                        C10691a.m21551c(context, context.getString(R.string.hwm)).mo19066a();
                    }
                } else {
                    Context context2 = this.f114214b.mo91438a().getContext();
                    C52711k.m112236a((Object) context2, "delegate.context");
                    String str = this.f114213a.f67833d;
                    if (str == null) {
                        str = "";
                    }
                    C52847n[] nVarArr = new C52847n[4];
                    nVarArr[0] = C52856t.m112465a("title", this.f114214b.mo91443c().getString(R.string.am1));
                    String str2 = "shoot_way";
                    String shootWay = this.f114214b.mo91441b().getMobParam().getShootWay();
                    if (shootWay == null) {
                        shootWay = "";
                    }
                    nVarArr[1] = C52856t.m112465a(str2, shootWay);
                    String str3 = "creation_id";
                    String creationId = this.f114214b.mo91441b().getMobParam().getCreationId();
                    if (creationId == null) {
                        creationId = "";
                    }
                    nVarArr[2] = C52856t.m112465a(str3, creationId);
                    nVarArr[3] = C52856t.m112465a("show_keyboard", "true");
                    C48397a.m104727a(context2, str, C52550ab.m112050a(nVarArr));
                    C25622e eVar = this.f114214b.f114197j;
                    if (eVar != null) {
                        eVar.dismiss();
                    }
                }
            } else if (i == C25600a.YELP.getTYPE()) {
                Context context3 = this.f114214b.mo91438a().getContext();
                C52711k.m112236a((Object) context3, "delegate.context");
                String str4 = this.f114213a.f67833d;
                if (str4 == null) {
                    str4 = "";
                }
                C52847n[] nVarArr2 = new C52847n[5];
                String str5 = "shoot_way";
                String shootWay2 = this.f114214b.mo91441b().getMobParam().getShootWay();
                if (shootWay2 == null) {
                    shootWay2 = "";
                }
                nVarArr2[0] = C52856t.m112465a(str5, shootWay2);
                String str6 = "creation_id";
                String creationId2 = this.f114214b.mo91441b().getMobParam().getCreationId();
                if (creationId2 == null) {
                    creationId2 = "";
                }
                nVarArr2[1] = C52856t.m112465a(str6, creationId2);
                nVarArr2[2] = C52856t.m112465a("host_filter", "true");
                nVarArr2[3] = C52856t.m112465a("anchor_type", "Yelp");
                nVarArr2[4] = C52856t.m112465a("addButton", "true");
                C48397a.m104727a(context3, str4, C52550ab.m112050a(nVarArr2));
                C25622e eVar2 = this.f114214b.f114197j;
                if (eVar2 != null) {
                    eVar2.dismiss();
                }
            } else if (i == C25600a.TRIP_ADVISOR.getTYPE()) {
                Context context4 = this.f114214b.mo91438a().getContext();
                C52711k.m112236a((Object) context4, "delegate.context");
                String str7 = this.f114213a.f67833d;
                if (str7 == null) {
                    str7 = "";
                }
                C52847n[] nVarArr3 = new C52847n[5];
                String str8 = "shoot_way";
                String shootWay3 = this.f114214b.mo91441b().getMobParam().getShootWay();
                if (shootWay3 == null) {
                    shootWay3 = "";
                }
                nVarArr3[0] = C52856t.m112465a(str8, shootWay3);
                String str9 = "creation_id";
                String creationId3 = this.f114214b.mo91441b().getMobParam().getCreationId();
                if (creationId3 == null) {
                    creationId3 = "";
                }
                nVarArr3[1] = C52856t.m112465a(str9, creationId3);
                nVarArr3[2] = C52856t.m112465a("host_filter", "true");
                nVarArr3[3] = C52856t.m112465a("anchor_type", "TripAdvisor");
                nVarArr3[4] = C52856t.m112465a("addButton", "true");
                C48397a.m104727a(context4, str7, C52550ab.m112050a(nVarArr3));
                C25622e eVar3 = this.f114214b.f114197j;
                if (eVar3 != null) {
                    eVar3.dismiss();
                }
            } else if (i == C25600a.GAME.getTYPE()) {
                if (!this.f114213a.f67837h) {
                    C45087c.m98599b(this.f114214b.mo91443c().getContext());
                    C25622e eVar4 = this.f114214b.f114197j;
                    if (eVar4 != null) {
                        eVar4.dismiss();
                    }
                }
            } else if (i == C25600a.MICRO_APP.getTYPE() || i == C25600a.MICRO_GAME.getTYPE()) {
                if (!this.f114213a.f67837h) {
                    C36811b.m82841a(this.f114214b.mo91443c().getContext(), C25600a.MICRO_APP);
                    C25622e eVar5 = this.f114214b.f114197j;
                    if (eVar5 != null) {
                        eVar5.dismiss();
                    }
                }
            } else if (i == C25600a.ARTICLE.getTYPE()) {
                C25616a.m62151a(this.f114214b.mo91443c().getContext(), this.f114213a.f67833d);
                C25622e eVar6 = this.f114214b.f114197j;
                if (eVar6 != null) {
                    eVar6.dismiss();
                }
            } else if (i == C25600a.INDIA_MOVIE.getTYPE()) {
                this.f114214b.mo91444c(this.f114214b.mo91438a().getContext());
                C25622e eVar7 = this.f114214b.f114197j;
                if (eVar7 != null) {
                    eVar7.dismiss();
                }
            } else if (i == C25600a.POI.getTYPE()) {
                C44955ab.f113869a.mo91247a(this.f114214b.mo91441b(), this.f114214b.mo91443c(), this.f114214b.mo91445d());
                C25622e eVar8 = this.f114214b.f114197j;
                if (eVar8 != null) {
                    eVar8.dismiss();
                }
            } else if (i == C25600a.SHOP.getTYPE()) {
                this.f114214b.mo91446e();
                C25622e eVar9 = this.f114214b.f114197j;
                if (eVar9 != null) {
                    eVar9.dismiss();
                }
            } else if (i == C25600a.ANCHOR_SHOP_LINK.getTYPE()) {
                PublishOutput publishOutput = this.f114214b.f114192e;
                if (publishOutput == null) {
                    C52711k.m112237a("publishOutput");
                }
                if (C45397ao.m98954a(publishOutput, this.f114214b.mo91445d())) {
                    C10691a.m21545b(this.f114214b.mo91438a().getContext(), this.f114214b.mo91438a().getContext().getString(R.string.bwx)).mo19066a();
                } else if (this.f114213a.f67833d != null) {
                    String uri = C37382g.m83707a(this.f114213a.f67833d).mo76659a("need_bottom_out", "1").mo76658a().toString();
                    C52711k.m112236a((Object) uri, "RnSchemeHelper.parseRnSc…              .toString()");
                    C41302w.m91042a().mo83858a((Activity) this.f114214b.mo91443c().getActivity(), uri);
                }
                C25622e eVar10 = this.f114214b.f114197j;
                if (eVar10 != null) {
                    eVar10.dismiss();
                }
            } else if (i == C25600a.SEEDING.getTYPE()) {
                this.f114214b.mo91447f();
                C25622e eVar11 = this.f114214b.f114197j;
                if (eVar11 != null) {
                    eVar11.dismiss();
                }
            } else if (i == C25600a.MEDIUM.getTYPE()) {
                C45087c.m98598a(this.f114214b.mo91443c().getContext());
                C25622e eVar12 = this.f114214b.f114197j;
                if (eVar12 != null) {
                    eVar12.dismiss();
                }
            } else if (i == C25600a.COUPON.getTYPE()) {
                this.f114214b.mo91448g();
                C25622e eVar13 = this.f114214b.f114197j;
                if (eVar13 != null) {
                    eVar13.dismiss();
                }
            }
            return C52860x.f131107a;
        }
    }

    public final String getName() {
        return "AnchorPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onCreateFinish() {
        DefaultImpls.onCreateFinish(this);
    }

    public final void onPublish(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
    }

    public final /* synthetic */ Object provideExtensionData() {
        return new AnchorPublishModel();
    }

    /* renamed from: a */
    public final C45156d mo91438a() {
        C45156d dVar = this.f114188a;
        if (dVar == null) {
            C52711k.m112237a("delegate");
        }
        return dVar;
    }

    /* renamed from: b */
    public final ExtensionMisc mo91441b() {
        ExtensionMisc extensionMisc = this.f114189b;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        return extensionMisc;
    }

    /* renamed from: c */
    public final Fragment mo91443c() {
        Fragment fragment = this.f114190c;
        if (fragment == null) {
            C52711k.m112237a("fragment");
        }
        return fragment;
    }

    /* renamed from: d */
    public final AVPublishContentType mo91445d() {
        AVPublishContentType aVPublishContentType = this.f114191d;
        if (aVPublishContentType == null) {
            C52711k.m112237a("contentType");
        }
        return aVPublishContentType;
    }

    public final void onEnterChildrenMode() {
        C45156d dVar = this.f114188a;
        if (dVar == null) {
            C52711k.m112237a("delegate");
        }
        dVar.setVisibility(8);
    }

    /* renamed from: h */
    private final void m98601h() {
        List<C25626g> list = this.f114198k;
        if (list != null) {
            Iterator it = list.iterator();
            if (it != null) {
                while (it.hasNext()) {
                    if (((C25626g) it.next()).f67837h) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void onDestroy() {
        C47718bf.m103291d(this);
        List<C25626g> list = this.f114198k;
        if (list != null) {
            for (C25626g a : list) {
                a.mo52779a(C45096h.f114212a);
            }
        }
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
        List<C25626g> list = this.f114198k;
        if (list != null) {
            for (C25626g gVar : list) {
                ExtensionMisc extensionMisc = this.f114189b;
                if (extensionMisc == null) {
                    C52711k.m112237a("extensionMisc");
                }
                C52711k.m112240b(extensionMisc, "<set-?>");
                gVar.f67842m = extensionMisc;
                gVar.mo52779a(new C45097i(gVar, this));
            }
        }
    }

    /* renamed from: e */
    public final void mo91446e() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
        if (TextUtils.isEmpty(curUser.getBindPhone())) {
            C22551ak e = C20854a.m53165e();
            Fragment fragment = this.f114190c;
            if (fragment == null) {
                C52711k.m112237a("fragment");
            }
            e.bindMobile(fragment.getActivity(), "", null, null);
            return;
        }
        ICommerceService a2 = C25539a.m62079a();
        Fragment fragment2 = this.f114190c;
        if (fragment2 == null) {
            C52711k.m112237a("fragment");
        }
        a2.tryCheckRealName(fragment2.getActivity(), "video_post_page", "click_add_product", new C45089b(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 == null) goto L_0x0041;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91447f() {
        /*
            r8 = this;
            r0 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0018 }
            java.lang.String r2 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0018 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs r1 = r1.getAwemeFeConf()     // Catch:{ a -> 0x0018 }
            java.lang.String r2 = "SettingsReader.get().awemeFeConf"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x0018 }
            java.lang.String r1 = r1.getSeedLabel()     // Catch:{ a -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0024
            java.lang.String r1 = "aweme://webview/?url=https%3A%2F%2Fffh.jinritemai.com%2Ffalcon%2Fe_commerce%2Frn%2Fseed_label%2F%3Fstatus_bar_color%3Dffffff%26status_font_dark%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3Dffffff%26video_title%3Dvideo_title_placeholder&status_bar_color=ffffff&status_font_dark=1&hide_nav_bar=1&loading_bgcolor=ffffff&video_title=video_title_placeholder&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_lyon_seed_label%26bundle%3Dindex.js%26module_name%3Dpage_seed_label%26status_bar_color%3Dffffff%26status_font_dark%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3Dffffff%26video_title%3Dvideo_title_placeholder"
        L_0x0024:
            r2 = r1
            if (r2 == 0) goto L_0x004b
            java.lang.String r3 = "video_title_placeholder"
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r8.f114189b
            if (r0 != 0) goto L_0x0032
            java.lang.String r1 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0032:
            com.ss.android.ugc.aweme.port.in.bc$a r0 = r0.getPublishExtensionDataContainer()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r0.mo78635d()
            if (r0 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r4 = r0
            goto L_0x0044
        L_0x0041:
            java.lang.String r0 = ""
            goto L_0x003f
        L_0x0044:
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r2, r3, r4, r5, r6, r7)
        L_0x004b:
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.ab.CommerceBulletExperiment> r2 = com.p683ss.android.ugc.aweme.commerce.service.p1535ab.CommerceBulletExperiment.class
            r3 = 1
            java.lang.String r4 = "commerce_hybrid_use_bullet"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            int r1 = r1.mo18168a(r2, r3, r4, r5, r6)
            r2 = 1
            if (r1 != r2) goto L_0x0062
            java.lang.String r0 = com.p683ss.android.ugc.aweme.bullet.utils.C24348b.m59717b(r0)
        L_0x0062:
            com.ss.android.ugc.aweme.router.w r1 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            r1.mo83861a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.mo91447f():void");
    }

    /* renamed from: g */
    public final void mo91448g() {
        Object obj;
        boolean z;
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C25626g) obj).f67830a == C25600a.COUPON.getTYPE()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C25626g gVar = (C25626g) obj;
            if (gVar != null) {
                String str = gVar.f67833d;
                if (str != null) {
                    SmartRouter.buildRoute(this.f114195h, str).withParam("need_bottom_out", true).withAnimation(R.anim.q, 0).open();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m98598a(Context context) {
        C45379ae.m98930a(context);
    }

    /* renamed from: b */
    public static void m98599b(Context context) {
        C36811b.m82841a(context, C25600a.GAME);
    }

    /* renamed from: c */
    private final void m98600c(ExtensionMisc extensionMisc) {
        mo91442b(extensionMisc);
        mo91440a(true);
    }

    /* renamed from: c */
    public final void mo91444c(Context context) {
        C25600a aVar = C25600a.INDIA_MOVIE;
        ExtensionMisc extensionMisc = this.f114189b;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        String shootWay = extensionMisc.getMobParam().getShootWay();
        ExtensionMisc extensionMisc2 = this.f114189b;
        if (extensionMisc2 == null) {
            C52711k.m112237a("extensionMisc");
        }
        C36811b.m82842a(context, aVar, shootWay, extensionMisc2.getMobParam().getCreationId());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[RETURN] */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAsyncAnchor(com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001b
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r3 = r3.f67806a
            if (r3 == 0) goto L_0x001b
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r2.f114189b
            if (r0 != 0) goto L_0x000f
            java.lang.String r1 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x000f:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
            android.arch.lifecycle.r r0 = r0.getUpdateAnchor()
            r0.setValue(r3)
            goto L_0x0027
        L_0x001b:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f114189b
            if (r3 != 0) goto L_0x0024
            java.lang.String r0 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0024:
            r2.mo91439a(r3)
        L_0x0027:
            com.ss.android.ugc.aweme.commercialize.anchor.e r3 = r2.f114197j
            if (r3 == 0) goto L_0x002e
            r3.dismiss()
        L_0x002e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r2.f114199m
            if (r3 == 0) goto L_0x0038
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.onAsyncAnchor(com.ss.android.ugc.aweme.commercialize.anchor.b):void");
    }

    /* renamed from: a */
    public final void mo91439a(ExtensionMisc extensionMisc) {
        AnchorTransData anchorTransData = (AnchorTransData) extensionMisc.getExtensionDataRepo().getUpdateAnchor().getValue();
        if (anchorTransData != null && anchorTransData.getBusinessType() == C25600a.SHOP.getTYPE()) {
            extensionMisc.getExtensionDataRepo().getRevertLinkAction().invoke();
        }
        m98600c(extensionMisc);
        extensionMisc.getExtensionDataRepo().getLocationState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getLinkState().setValue(Boolean.valueOf(true));
        extensionMisc.getExtensionDataRepo().getUpdateAnchor().setValue(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) (java.lang.Boolean) r0.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (java.lang.Object) java.lang.Boolean.valueOf(true)) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r3.f68930l == 999) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r3 = r2.f114189b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        p2628d.p2639f.p2641b.C52711k.m112237a("extensionMisc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r3.getExtensionDataRepo().getUpdateAnchor().setValue(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed(com.p683ss.android.ugc.aweme.services.publish.PublishOutput r3) {
        /*
            r2 = this;
            java.lang.String r0 = "publishOutput"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f114189b
            if (r3 != 0) goto L_0x000e
            java.lang.String r0 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x000e:
            com.ss.android.ugc.aweme.port.in.bc$a r3 = r3.getPublishExtensionDataContainer()
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = r3.mo78634c()
            com.ss.android.ugc.aweme.commercialize.model.ad r3 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r3)
            if (r3 == 0) goto L_0x0065
            int r0 = r3.f68926h
            com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SHOP
            int r1 = r1.getTYPE()
            if (r0 != r1) goto L_0x004a
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r2.f114189b
            if (r0 != 0) goto L_0x0031
            java.lang.String r1 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0031:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
            android.arch.lifecycle.r r0 = r0.getWithStarAtlasOrderGoods()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 != 0) goto L_0x0050
        L_0x004a:
            int r3 = r3.f68930l
            r0 = 999(0x3e7, float:1.4E-42)
            if (r3 != r0) goto L_0x0065
        L_0x0050:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f114189b
            if (r3 != 0) goto L_0x0059
            java.lang.String r0 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0059:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r3 = r3.getExtensionDataRepo()
            android.arch.lifecycle.r r3 = r3.getUpdateAnchor()
            r0 = 0
            r3.setValue(r0)
        L_0x0065:
            r2.m98601h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.onBackPressed(com.ss.android.ugc.aweme.services.publish.PublishOutput):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) (java.lang.Boolean) r0.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (java.lang.Object) java.lang.Boolean.valueOf(true)) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r3.f68930l == 999) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r3 = r2.f114189b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        p2628d.p2639f.p2641b.C52711k.m112237a("extensionMisc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r3.getExtensionDataRepo().getUpdateAnchor().setValue(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSaveDraft(com.p683ss.android.ugc.aweme.services.publish.PublishOutput r3) {
        /*
            r2 = this;
            java.lang.String r0 = "publishOutput"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f114189b
            if (r3 != 0) goto L_0x000e
            java.lang.String r0 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x000e:
            com.ss.android.ugc.aweme.port.in.bc$a r3 = r3.getPublishExtensionDataContainer()
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = r3.mo78634c()
            com.ss.android.ugc.aweme.commercialize.model.ad r3 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r3)
            if (r3 == 0) goto L_0x0065
            int r0 = r3.f68926h
            com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SHOP
            int r1 = r1.getTYPE()
            if (r0 != r1) goto L_0x004a
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r2.f114189b
            if (r0 != 0) goto L_0x0031
            java.lang.String r1 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0031:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r0.getExtensionDataRepo()
            android.arch.lifecycle.r r0 = r0.getWithStarAtlasOrderGoods()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 != 0) goto L_0x0050
        L_0x004a:
            int r3 = r3.f68930l
            r0 = 999(0x3e7, float:1.4E-42)
            if (r3 != r0) goto L_0x0065
        L_0x0050:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = r2.f114189b
            if (r3 != 0) goto L_0x0059
            java.lang.String r0 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0059:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r3 = r3.getExtensionDataRepo()
            android.arch.lifecycle.r r3 = r3.getUpdateAnchor()
            r0 = 0
            r3.setValue(r0)
        L_0x0065:
            r2.m98601h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.onSaveDraft(com.ss.android.ugc.aweme.services.publish.PublishOutput):void");
    }

    /* renamed from: a */
    private final DmtTextView m98597a(LinearLayout linearLayout) {
        DmtTextView dmtTextView = new DmtTextView(linearLayout.getContext());
        linearLayout.addView(dmtTextView, -2, (int) C9432q.m18687b(linearLayout.getContext(), 20.0f));
        dmtTextView.setTextSize(13.0f);
        StringBuilder sb = new StringBuilder(linearLayout.getContext().getString(R.string.fjj));
        C26109ad adVar = this.f114193f;
        if (adVar == null) {
            C52711k.m112237a("data");
        }
        List<C25626g> list = adVar.f68944z;
        if (list != null) {
            for (C25626g gVar : list) {
                String str = gVar.f67832c;
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(' ');
                    sb.append(sb2.toString());
                }
            }
        }
        dmtTextView.setText(sb.toString());
        dmtTextView.setTextColor(dmtTextView.getResources().getColor(R.color.asz));
        dmtTextView.setPadding(45, 0, 0, 0);
        dmtTextView.setMaxEms(18);
        dmtTextView.setMaxLines(1);
        dmtTextView.setSingleLine();
        return dmtTextView;
    }

    /* renamed from: b */
    public final void mo91442b(ExtensionMisc extensionMisc) {
        C39592a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            C26109ad a = C26109ad.m63393a(publishExtensionDataContainer.mo78634c());
            if (a != null) {
                a.f68926h = C25600a.NO_TYPE.getTYPE();
                a.f68925g = "";
                a.f68929k = null;
                a.f68927i = "";
                a.f68930l = 0;
                a.f68928j = "";
                a.f68938t = "";
                a.f68939u = "";
                a.f68940v = "";
                publishExtensionDataContainer.mo78632a(C26109ad.m63394a(a));
                DmtTextView dmtTextView = this.f114199m;
                if (dmtTextView != null) {
                    dmtTextView.setVisibility(0);
                }
                List<C25626g> list = this.f114198k;
                if (list != null && this.f114199m == null && a.f68944z != null && a.f68944z.size() > 0) {
                    List<C25626g> list2 = a.f68944z;
                    if (list2 != null) {
                        for (C25626g gVar : list2) {
                            gVar.f67837h = true;
                        }
                    }
                    Object obj = a.f68944z.get(0);
                    C52711k.m112236a(obj, "recommendAnchor[0]");
                    list.add(0, obj);
                    C45156d dVar = this.f114188a;
                    if (dVar == null) {
                        C52711k.m112237a("delegate");
                    }
                    LinearLayout linearLayout = this.f114194g;
                    if (linearLayout == null) {
                        C52711k.m112237a("container");
                    }
                    dVar.setLayoutParams(new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 40.0f)));
                    LinearLayout linearLayout2 = this.f114194g;
                    if (linearLayout2 == null) {
                        C52711k.m112237a("container");
                    }
                    this.f114199m = m98597a(linearLayout2);
                }
            }
        }
        C45156d dVar2 = this.f114188a;
        if (dVar2 == null) {
            C52711k.m112237a("delegate");
        }
        dVar2.mo91461a();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(C29906l lVar) {
        C52711k.m112240b(lVar, "broadCastEvent");
        try {
            String string = lVar.f78045b.getString("eventName");
            if (string != null) {
                if (!C52711k.m112239a((Object) string, (Object) "anchor_merch_pick_content")) {
                    string = null;
                }
                if (string != null) {
                    if (!lVar.f78045b.has("data")) {
                        string = null;
                    }
                    if (string != null) {
                        String string2 = lVar.f78045b.getString("data");
                        ExtensionMisc extensionMisc = this.f114189b;
                        if (extensionMisc == null) {
                            C52711k.m112237a("extensionMisc");
                        }
                        C0198r updateAnchor = extensionMisc.getExtensionDataRepo().getUpdateAnchor();
                        int type = C25600a.ANCHOR_SHOP_LINK.getTYPE();
                        C52711k.m112236a((Object) string2, "data");
                        AnchorTransData anchorTransData = new AnchorTransData(type, string2, (String) ((HashMap) new C17971f().mo34884a(string2, new HashMap().getClass())).get("keyword"), null, Integer.valueOf(1), null, null, 104, null);
                        updateAnchor.setValue(anchorTransData);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo91440a(boolean z) {
        if (z) {
            C45156d dVar = this.f114188a;
            if (dVar == null) {
                C52711k.m112237a("delegate");
            }
            dVar.setAlpha(1.0f);
            C45156d dVar2 = this.f114188a;
            if (dVar2 == null) {
                C52711k.m112237a("delegate");
            }
            dVar2.setEnable(true);
            C45156d dVar3 = this.f114188a;
            if (dVar3 == null) {
                C52711k.m112237a("delegate");
            }
            RemoteImageView leftDrawableView = dVar3.getLeftDrawableView();
            C52711k.m112236a((Object) leftDrawableView, "delegate.leftDrawableView");
            leftDrawableView.setEnabled(true);
            return;
        }
        C45156d dVar4 = this.f114188a;
        if (dVar4 == null) {
            C52711k.m112237a("delegate");
        }
        dVar4.setAlpha(0.5f);
        C45156d dVar5 = this.f114188a;
        if (dVar5 == null) {
            C52711k.m112237a("delegate");
        }
        dVar5.setEnable(false);
        C45156d dVar6 = this.f114188a;
        if (dVar6 == null) {
            C52711k.m112237a("delegate");
        }
        RemoteImageView leftDrawableView2 = dVar6.getLeftDrawableView();
        C52711k.m112236a((Object) leftDrawableView2, "delegate.leftDrawableView");
        leftDrawableView2.setEnabled(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:200:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.support.p030v4.app.Fragment r30, android.widget.LinearLayout r31, android.os.Bundle r32, com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType r33, com.p683ss.android.ugc.aweme.services.publish.PublishOutput r34, com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc r35, com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r36) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r34
            r5 = r35
            java.lang.String r6 = "fragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r6)
            java.lang.String r6 = "extensionWidgetContainer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r6)
            java.lang.String r6 = "contentType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r6)
            java.lang.String r6 = "publishOutput"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            java.lang.String r6 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
            java.lang.String r6 = "callback"
            r7 = r36
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r6)
            r0.f114190c = r1
            r0.f114191d = r3
            r0.f114192e = r4
            android.content.Context r6 = r30.getContext()
            r0.f114195h = r6
            android.view.View r6 = r30.getView()
            r7 = 0
            if (r6 == 0) goto L_0x0049
            r8 = 2132018756(0x7f140644, float:1.9675828E38)
            android.view.View r6 = r6.findViewById(r8)
            com.ss.android.ugc.aweme.views.mention.MentionEditText r6 = (com.p683ss.android.ugc.aweme.views.mention.MentionEditText) r6
            goto L_0x004a
        L_0x0049:
            r6 = r7
        L_0x004a:
            r0.f114196i = r6
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r29)
            r0.f114189b = r5
            r0.f114194g = r2
            com.ss.android.ugc.aweme.shortvideo.ui.d r6 = new com.ss.android.ugc.aweme.shortvideo.ui.d
            android.content.Context r8 = r31.getContext()
            r6.<init>(r8)
            r8 = r6
            android.view.View r8 = (android.view.View) r8
            android.content.Context r9 = r31.getContext()
            r10 = 1112539136(0x42500000, float:52.0)
            float r9 = com.bytedance.common.utility.C9432q.m18687b(r9, r10)
            int r9 = (int) r9
            r10 = -1
            r2.addView(r8, r10, r9)
            r2 = 16
            r6.setGravity(r2)
            r2 = 1
            r6.setOrientation(r2)
            r6.setSingleLine(r2)
            r0.f114188a = r6
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f67772d
            java.util.List r6 = r6.mo52758b()
            r8 = 3
            r9 = 0
            if (r6 == 0) goto L_0x00d5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.Iterator r6 = r6.iterator()
        L_0x0093:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x00bd
            java.lang.Object r12 = r6.next()
            r13 = r12
            com.ss.android.ugc.aweme.commercialize.anchor.g r13 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r13
            int r14 = r13.f67830a
            com.ss.android.ugc.aweme.commercialize.anchor.a r15 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
            int r15 = r15.getTYPE()
            if (r14 != r15) goto L_0x00b6
            int r14 = r13.f67840k
            r15 = 2
            if (r14 == r15) goto L_0x00b6
            int r13 = r13.f67840k
            if (r13 != r8) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r13 = 0
            goto L_0x00b7
        L_0x00b6:
            r13 = 1
        L_0x00b7:
            if (r13 == 0) goto L_0x0093
            r11.add(r12)
            goto L_0x0093
        L_0x00bd:
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r0.f114198k = r6
            java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r6 = r0.f114198k
            if (r6 == 0) goto L_0x00d5
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r6 = r6.addAll(r11)
            java.lang.Boolean.valueOf(r6)
        L_0x00d5:
            com.ss.android.ugc.aweme.port.in.bc$a r6 = r35.getPublishExtensionDataContainer()
            if (r6 == 0) goto L_0x0353
            java.lang.String r6 = r6.mo78634c()
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r6)
            java.lang.String r11 = "PublishExtensionModel.fromString(it.publishData)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r11)
            r0.f114193f = r6
            java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r6 = r0.f114198k
            if (r6 == 0) goto L_0x01dc
            r11 = r6
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x0105
            java.lang.Object r11 = r6.get(r9)
            com.ss.android.ugc.aweme.commercialize.anchor.g r11 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r11
            boolean r11 = r11.f67837h
            if (r11 == 0) goto L_0x0105
            r6.remove(r9)
        L_0x0105:
            com.ss.android.ugc.aweme.commercialize.model.ad r11 = r0.f114193f
            if (r11 != 0) goto L_0x010e
            java.lang.String r12 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x010e:
            java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r11 = r11.f68944z
            if (r11 == 0) goto L_0x01dc
            int r12 = r11.size()
            if (r12 <= 0) goto L_0x01dc
            com.ss.android.ugc.aweme.commercialize.model.ad r12 = r0.f114193f
            if (r12 != 0) goto L_0x0121
            java.lang.String r13 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r13)
        L_0x0121:
            int r12 = r12.f68926h
            com.ss.android.ugc.aweme.commercialize.anchor.a r13 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.NO_TYPE
            int r13 = r13.getTYPE()
            if (r12 != r13) goto L_0x01dc
            r12 = r11
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x0132:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0141
            java.lang.Object r13 = r12.next()
            com.ss.android.ugc.aweme.commercialize.anchor.g r13 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r13
            r13.f67837h = r2
            goto L_0x0132
        L_0x0141:
            java.lang.Object r12 = r11.get(r9)
            java.lang.String r13 = "this[0]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            r6.add(r9, r12)
            com.ss.android.ugc.aweme.shortvideo.ui.d r6 = r0.f114188a
            if (r6 != 0) goto L_0x0156
            java.lang.String r12 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0156:
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            android.widget.LinearLayout r13 = r0.f114194g
            if (r13 != 0) goto L_0x0161
            java.lang.String r14 = "container"
            p2628d.p2639f.p2641b.C52711k.m112237a(r14)
        L_0x0161:
            android.content.Context r13 = r13.getContext()
            r14 = 1109393408(0x42200000, float:40.0)
            float r13 = com.bytedance.common.utility.C9432q.m18687b(r13, r14)
            int r13 = (int) r13
            r12.<init>(r10, r13)
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12
            r6.setLayoutParams(r12)
            android.widget.LinearLayout r6 = r0.f114194g
            if (r6 != 0) goto L_0x017d
            java.lang.String r10 = "container"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x017d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r0.m98597a(r6)
            r0.f114199m = r6
            java.lang.String r6 = "gc_bind_show_words"
            com.ss.android.ugc.aweme.app.f.d r10 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r12 = "params_for_special"
            java.lang.String r13 = "game_platform"
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r12, r13)
            java.lang.String r12 = "target_app_id"
            java.lang.String r13 = "2210"
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r12, r13)
            java.lang.String r12 = "request_id"
            com.ss.android.ugc.aweme.commercialize.model.ad r13 = r0.f114193f
            if (r13 != 0) goto L_0x01a4
            java.lang.String r14 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r14)
        L_0x01a4:
            java.lang.String r13 = r13.f68934p
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r12, r13)
            java.lang.String r12 = "game_name"
            java.lang.Object r13 = r11.get(r9)
            com.ss.android.ugc.aweme.commercialize.anchor.g r13 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r13
            java.lang.String r13 = r13.f67832c
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r12, r13)
            java.lang.String r12 = "game_id"
            java.lang.Object r11 = r11.get(r9)
            com.ss.android.ugc.aweme.commercialize.anchor.g r11 = (com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g) r11
            java.lang.String r11 = r11.f67836g
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.anchor.d.a.a> r13 = com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36830a.class
            java.lang.Object r11 = com.p683ss.android.ugc.aweme.utils.C47760cd.m103384a(r11, r13)
            java.lang.String r13 = "GsonUtil.fromJson(this[0…nt, GameInfo::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r13)
            com.ss.android.ugc.aweme.miniapp.anchor.d.a.a r11 = (com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36830a) r11
            java.lang.String r11 = r11.getId()
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r12, r11)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r10)
        L_0x01dc:
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = r0.f114193f
            if (r6 != 0) goto L_0x01e5
            java.lang.String r10 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x01e5:
            int r6 = r6.f68926h
            com.ss.android.ugc.aweme.commercialize.anchor.a r10 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.NO_TYPE
            int r10 = r10.getTYPE()
            if (r6 != r10) goto L_0x021d
            r0.m98600c(r5)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r6 = r6.getLocationState()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r6.setValue(r10)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r6 = r6.getLinkState()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r6.setValue(r10)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r6 = r6.getUpdateAnchor()
            r6.setValue(r7)
            goto L_0x0353
        L_0x021d:
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = r0.f114193f
            if (r6 != 0) goto L_0x0226
            java.lang.String r10 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0226:
            int r6 = r6.f68926h
            com.ss.android.ugc.aweme.commercialize.anchor.a r10 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MEDIUM
            int r10 = r10.getTYPE()
            if (r6 != r10) goto L_0x023d
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = r0.f114193f
            if (r6 != 0) goto L_0x0239
            java.lang.String r10 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0239:
            java.lang.String r10 = "影视综艺"
            r6.f68938t = r10
        L_0x023d:
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = r0.f114193f
            if (r6 != 0) goto L_0x0246
            java.lang.String r10 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0246:
            int r6 = r6.f68926h
            com.ss.android.ugc.aweme.commercialize.anchor.a r10 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.BRAND_WIKI
            int r10 = r10.getTYPE()
            if (r6 != r10) goto L_0x0268
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = r0.f114193f
            if (r6 != 0) goto L_0x0259
            java.lang.String r10 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0259:
            android.content.Context r10 = r0.f114195h
            if (r10 == 0) goto L_0x0265
            r11 = 2132549635(0x7f1c2003, float:2.0752578E38)
            java.lang.String r10 = r10.getString(r11)
            goto L_0x0266
        L_0x0265:
            r10 = r7
        L_0x0266:
            r6.f68938t = r10
        L_0x0268:
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = r0.f114193f
            if (r6 != 0) goto L_0x0271
            java.lang.String r10 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0271:
            int r6 = r6.f68926h
            com.ss.android.ugc.aweme.commercialize.anchor.a r10 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.SHOP
            int r10 = r10.getTYPE()
            if (r6 != r10) goto L_0x02d3
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            d.f.a.a r6 = r6.getRecordLinkAction()
            r6.invoke()
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            d.f.a.a r6 = r6.getResetLinkAction()
            r6.invoke()
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r6 = r6.getLinkState()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r6.setValue(r10)
            com.ss.android.ugc.aweme.commercialize.model.ad r6 = r0.f114193f
            if (r6 != 0) goto L_0x02a9
            java.lang.String r10 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x02a9:
            java.lang.String r6 = r6.f68927i
            if (r6 != 0) goto L_0x02ae
            goto L_0x02d3
        L_0x02ae:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x02ba }
            r10.<init>(r6)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r6 = "shop_draft_id"
            java.lang.String r6 = r10.optString(r6)     // Catch:{ Exception -> 0x02ba }
            goto L_0x02bb
        L_0x02ba:
            r6 = r7
        L_0x02bb:
            if (r6 == 0) goto L_0x02d3
            r10 = r6
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r10 = r10 ^ r2
            if (r10 == 0) goto L_0x02c9
            r10 = r6
            goto L_0x02ca
        L_0x02c9:
            r10 = r7
        L_0x02ca:
            if (r10 == 0) goto L_0x02d3
            com.ss.android.ugc.aweme.commerce.service.ICommerceService r10 = com.p683ss.android.ugc.aweme.commerce.service.C25539a.m62079a()
            r10.checkShopDraft(r6)
        L_0x02d3:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r6 = r6.getUpdateAnchor()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r15 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
            com.ss.android.ugc.aweme.commercialize.model.ad r10 = r0.f114193f
            if (r10 != 0) goto L_0x02e6
            java.lang.String r11 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x02e6:
            int r11 = r10.f68926h
            com.ss.android.ugc.aweme.commercialize.model.ad r10 = r0.f114193f
            if (r10 != 0) goto L_0x02f1
            java.lang.String r12 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x02f1:
            java.lang.String r10 = r10.f68927i
            if (r10 != 0) goto L_0x02f7
            java.lang.String r10 = ""
        L_0x02f7:
            r12 = r10
            com.ss.android.ugc.aweme.commercialize.model.ad r10 = r0.f114193f
            if (r10 != 0) goto L_0x0301
            java.lang.String r13 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r13)
        L_0x0301:
            java.lang.String r10 = r10.f68928j
            if (r10 != 0) goto L_0x0307
            java.lang.String r10 = ""
        L_0x0307:
            r13 = r10
            com.ss.android.ugc.aweme.commercialize.model.ad r10 = r0.f114193f
            if (r10 != 0) goto L_0x0311
            java.lang.String r14 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r14)
        L_0x0311:
            java.lang.String r10 = r10.f68938t
            if (r10 != 0) goto L_0x0317
            java.lang.String r10 = ""
        L_0x0317:
            r14 = r10
            com.ss.android.ugc.aweme.commercialize.model.ad r10 = r0.f114193f
            if (r10 != 0) goto L_0x0321
            java.lang.String r16 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r16)
        L_0x0321:
            int r10 = r10.f68930l
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            com.ss.android.ugc.aweme.commercialize.model.ad r10 = r0.f114193f
            if (r10 != 0) goto L_0x0330
            java.lang.String r17 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r17)
        L_0x0330:
            java.lang.String r10 = r10.f68925g
            if (r10 != 0) goto L_0x0336
            java.lang.String r10 = ""
        L_0x0336:
            r17 = r10
            com.ss.android.ugc.aweme.commercialize.model.ad r10 = r0.f114193f
            if (r10 != 0) goto L_0x0341
            java.lang.String r18 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r18)
        L_0x0341:
            com.ss.android.ugc.aweme.base.model.UrlModel r10 = r10.f68929k
            r18 = r10
            r10 = r15
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r6.setValue(r2)
        L_0x0353:
            boolean r2 = com.p683ss.android.ugc.aweme.shortvideo.util.C45397ao.m98954a(r4, r3)
            if (r2 == 0) goto L_0x0398
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r2 = r2.getUpdateAnchor()
            java.lang.Object r2 = r2.getValue()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r2 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r2
            if (r2 == 0) goto L_0x0389
            int r4 = r2.getBusinessType()
            com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.ANCHOR_SHOP_LINK
            int r6 = r6.getTYPE()
            if (r4 != r6) goto L_0x0377
            r4 = 1
            goto L_0x0378
        L_0x0377:
            r4 = 0
        L_0x0378:
            if (r4 == 0) goto L_0x037b
            goto L_0x037c
        L_0x037b:
            r2 = r7
        L_0x037c:
            if (r2 == 0) goto L_0x0389
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r2 = r2.getUpdateAnchor()
            r2.setValue(r7)
        L_0x0389:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r2 = r2.getI18nStarAtlasClosed()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            r2.setValue(r4)
        L_0x0398:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r35.getExtensionDataRepo()
            com.ss.android.ugc.aweme.shortvideo.ui.c$e r4 = new com.ss.android.ugc.aweme.shortvideo.ui.c$e
            r4.<init>(r5)
            d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4
            r2.setShowPermissionAction(r4)
            com.ss.android.ugc.aweme.port.in.bc$a r2 = r35.getPublishExtensionDataContainer()
            if (r2 == 0) goto L_0x03f5
            boolean r4 = r2.mo78636e()
            if (r4 == 0) goto L_0x03f5
            com.ss.android.ugc.aweme.shortvideo.edit.o r4 = r35.getTransMicroAppInfo()
            if (r4 == 0) goto L_0x03f5
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r6 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r6 = r6.getUpdateAnchor()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r10 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
            com.ss.android.ugc.aweme.commercialize.anchor.a r11 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.MICRO_APP
            int r20 = r11.getTYPE()
            com.google.gson.f r11 = new com.google.gson.f
            r11.<init>()
            java.lang.String r11 = r11.mo34889b(r4)
            java.lang.String r12 = "Gson().toJson(it)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            java.lang.String r22 = r4.getAnchorTitle()
            r23 = 0
            java.lang.Integer r24 = java.lang.Integer.valueOf(r8)
            r25 = 0
            r26 = 0
            r27 = 104(0x68, float:1.46E-43)
            r28 = 0
            r19 = r10
            r21 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6.setValue(r10)
            r2.mo78637f()
        L_0x03f5:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r2 = r2.getAnchorState()
            r4 = r1
            android.arch.lifecycle.k r4 = (android.arch.lifecycle.C0184k) r4
            com.ss.android.ugc.aweme.shortvideo.ui.c$f r6 = new com.ss.android.ugc.aweme.shortvideo.ui.c$f
            r6.<init>(r0)
            android.arch.lifecycle.s r6 = (android.arch.lifecycle.C0199s) r6
            r2.observe(r4, r6)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r35.getExtensionDataRepo()
            com.ss.android.ugc.aweme.shortvideo.ui.c$g r6 = new com.ss.android.ugc.aweme.shortvideo.ui.c$g
            r6.<init>(r5)
            d.f.a.a r6 = (p2628d.p2639f.p2640a.C52670a) r6
            r2.setResetAnchor(r6)
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r2 = r35.getExtensionDataRepo()
            android.arch.lifecycle.r r2 = r2.getUpdateAnchor()
            com.ss.android.ugc.aweme.shortvideo.ui.c$c r6 = new com.ss.android.ugc.aweme.shortvideo.ui.c$c
            r6.<init>(r0, r5)
            android.arch.lifecycle.s r6 = (android.arch.lifecycle.C0199s) r6
            r2.observe(r4, r6)
            com.ss.android.ugc.aweme.shortvideo.ui.d r2 = r0.f114188a
            if (r2 != 0) goto L_0x0433
            java.lang.String r4 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0433:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r4 = r0.f114189b
            if (r4 != 0) goto L_0x043c
            java.lang.String r6 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x043c:
            com.ss.android.ugc.aweme.port.in.bc$a r4 = r4.getPublishExtensionDataContainer()
            if (r4 == 0) goto L_0x0447
            java.lang.String r4 = r4.mo78634c()
            goto L_0x0448
        L_0x0447:
            r4 = r7
        L_0x0448:
            com.ss.android.ugc.aweme.commercialize.model.ad r4 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r4)
            java.lang.String r6 = "PublishExtensionModel\n  …                        )"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo r4 = r4.f68924f
            if (r4 == 0) goto L_0x046a
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r4 = r0.f114189b
            if (r4 != 0) goto L_0x045e
            java.lang.String r6 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x045e:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r4 = r4.getExtensionDataRepo()
            android.arch.lifecycle.r r4 = r4.getUpdateAnchor()
            r4.setValue(r7)
            goto L_0x0489
        L_0x046a:
            java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r4 = r0.f114198k
            if (r4 == 0) goto L_0x048b
            java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r4 = r0.f114198k
            if (r4 == 0) goto L_0x0479
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0479
            goto L_0x048b
        L_0x0479:
            java.util.List<com.ss.android.ugc.aweme.commercialize.anchor.g> r4 = r0.f114198k
            if (r4 != 0) goto L_0x0480
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0480:
            int r4 = r4.size()
            r6 = 1
            if (r4 <= r6) goto L_0x0489
            r4 = 1
            goto L_0x04ac
        L_0x0489:
            r4 = 0
            goto L_0x04ac
        L_0x048b:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r4 = r0.f114189b
            if (r4 != 0) goto L_0x0494
            java.lang.String r6 = "extensionMisc"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0494:
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r4 = r4.getExtensionDataRepo()
            android.arch.lifecycle.r r4 = r4.getUpdateAnchor()
            java.lang.Object r4 = r4.getValue()
            com.ss.android.ugc.aweme.services.publish.AnchorTransData r4 = (com.p683ss.android.ugc.aweme.services.publish.AnchorTransData) r4
            if (r4 == 0) goto L_0x04a8
            java.lang.Integer r7 = r4.getSource()
        L_0x04a8:
            boolean r4 = com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82845a(r7)
        L_0x04ac:
            if (r4 == 0) goto L_0x04af
            goto L_0x04b1
        L_0x04af:
            r9 = 8
        L_0x04b1:
            r2.setVisibility(r9)
            com.ss.android.ugc.aweme.shortvideo.ui.d r2 = r0.f114188a
            if (r2 != 0) goto L_0x04bd
            java.lang.String r4 = "delegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x04bd:
            com.ss.android.ugc.aweme.shortvideo.ui.c$d r4 = new com.ss.android.ugc.aweme.shortvideo.ui.c$d
            r4.<init>(r0, r5, r1, r3)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r2.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c.onCreate(android.support.v4.app.Fragment, android.widget.LinearLayout, android.os.Bundle, com.ss.android.ugc.aweme.services.publish.AVPublishContentType, com.ss.android.ugc.aweme.services.publish.PublishOutput, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback):void");
    }
}
