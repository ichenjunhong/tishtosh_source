package com.p683ss.android.ugc.aweme.wiki;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.p665a.C10638c;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25633j;
import com.p683ss.android.ugc.aweme.commercialize.anchor.p1548c.C25619a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.p1548c.C25620b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.feed.model.Anchor;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity */
public final class AddWikiActivity extends AmeSSActivity implements C10638c {

    /* renamed from: h */
    public static final C48397a f121736h = new C48397a(null);

    /* renamed from: a */
    public boolean f121737a;
    public LinearLayout addBtn;

    /* renamed from: b */
    public String f121738b;
    public ImageView backBtn;

    /* renamed from: c */
    public String f121739c;
    public ImageView closeBtn;

    /* renamed from: d */
    public C17832m<C48407a> f121740d;

    /* renamed from: e */
    public Runnable f121741e;

    /* renamed from: f */
    public boolean f121742f;

    /* renamed from: g */
    public long f121743g;

    /* renamed from: i */
    private C52670a<C52860x> f121744i;

    /* renamed from: j */
    private boolean f121745j;
    public View statusBar;
    public DmtTextView titleView;
    public CrossPlatformWebView webView;

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$a */
    public static final class C48397a {
        private C48397a() {
        }

        public /* synthetic */ C48397a(C52707g gVar) {
            this();
        }

        /* renamed from: b */
        public static boolean m104729b(Aweme aweme) {
            AnchorCommonStruct anchorCommonStruct;
            C52711k.m112240b(aweme, "aweme");
            Anchor anchor = aweme.getAnchor();
            String str = null;
            if (anchor != null) {
                anchorCommonStruct = anchor.getAnchorInfo();
            } else {
                anchorCommonStruct = null;
            }
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getUrl();
            }
            if (!(str == null || anchorCommonStruct.getKeyword() == null)) {
                Integer businessType = aweme.getAnchor().getBusinessType();
                int type = C25600a.YELP.getTYPE();
                if (businessType != null && businessType.intValue() == type) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m104730c(Aweme aweme) {
            AnchorCommonStruct anchorCommonStruct;
            C52711k.m112240b(aweme, "aweme");
            Anchor anchor = aweme.getAnchor();
            String str = null;
            if (anchor != null) {
                anchorCommonStruct = anchor.getAnchorInfo();
            } else {
                anchorCommonStruct = null;
            }
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getUrl();
            }
            if (!(str == null || anchorCommonStruct.getKeyword() == null)) {
                Integer businessType = aweme.getAnchor().getBusinessType();
                int type = C25600a.TRIP_ADVISOR.getTYPE();
                if (businessType != null && businessType.intValue() == type) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m104728a(Aweme aweme) {
            WikipediaInfo wikipediaInfo;
            boolean z;
            C52711k.m112240b(aweme, "aweme");
            List anchors = aweme.getAnchors();
            String str = null;
            if (anchors != null) {
                Iterable iterable = anchors;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) next;
                    if (anchorCommonStruct.getType() != C25600a.WIKIPEDIA.getTYPE() || TextUtils.isEmpty(anchorCommonStruct.getLanguage()) || TextUtils.isEmpty(anchorCommonStruct.getKeyword())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    return true;
                }
            }
            Anchor anchor = aweme.getAnchor();
            if (anchor != null) {
                wikipediaInfo = anchor.getWikipediaInfo();
            } else {
                wikipediaInfo = null;
            }
            if (wikipediaInfo != null) {
                str = wikipediaInfo.getLang();
            }
            if (str == null || wikipediaInfo.getKeyword() == null) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static void m104727a(Context context, String str, Map<String, String> map) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            String str2;
            boolean z6;
            boolean z7;
            boolean z8;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "originUrl");
            C52711k.m112240b(map, "params");
            String str3 = (String) map.get("anchor_type");
            String str4 = (String) map.get("shoot_way");
            String str5 = (String) map.get("creation_id");
            StringBuilder sb = new StringBuilder(str);
            boolean z9 = false;
            if (str3 == null) {
                str3 = "Wiki";
                String str6 = (String) map.get("title");
                String str7 = (String) map.get("close");
                CharSequence charSequence = str7;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || C52830p.m112406a(str7, "true", true)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str8 = (String) map.get("hide_nav_bar");
                CharSequence charSequence2 = str8;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || C52830p.m112406a(str8, "true", true)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean a = C52830p.m112406a((String) map.get("back"), "true", true);
                boolean a2 = C52830p.m112406a((String) map.get("addButton"), "true", true);
                Uri parse = Uri.parse(str);
                C52711k.m112236a((Object) parse, "Uri.parse(originUrl)");
                if (parse.getQuery() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append('&');
                    str2 = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append('?');
                    str2 = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder(str2);
                StringBuilder sb5 = new StringBuilder("addButton=");
                sb5.append(a2);
                sb4.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder("&back=");
                sb6.append(a);
                sb4.append(sb6.toString());
                StringBuilder sb7 = new StringBuilder("&close=");
                sb7.append(z3);
                sb4.append(sb7.toString());
                C52711k.m112236a((Object) sb4, "StringBuilder(if (Uri.pa…d(\"&$CLOSE=$enableClose\")");
                CharSequence charSequence3 = str6;
                if (charSequence3 == null || charSequence3.length() == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    StringBuilder sb8 = new StringBuilder("&title=");
                    sb8.append(str6);
                    sb4.append(sb8.toString());
                }
                CharSequence charSequence4 = str4;
                if (charSequence4 == null || charSequence4.length() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    StringBuilder sb9 = new StringBuilder("&shoot_way=");
                    sb9.append(str4);
                    sb4.append(sb9.toString());
                }
                CharSequence charSequence5 = str5;
                if (charSequence5 == null || charSequence5.length() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    StringBuilder sb10 = new StringBuilder("&creation_id=");
                    sb10.append(str5);
                    sb4.append(sb10.toString());
                }
                if (z5) {
                    StringBuilder sb11 = new StringBuilder("&hide_nav_bar=1&status_bar_height=");
                    sb11.append(C20141b.m49700b(context, (float) C11065a.m22390a(context)));
                    sb4.append(sb11.toString());
                } else {
                    sb4.append("&hide_nav_bar=0&status_bar_height=0");
                }
                sb = sb4;
            }
            boolean a3 = C52830p.m112406a((String) map.get("show_keyboard"), "true", true);
            String str9 = "";
            String str10 = (String) map.get("host_filter");
            if (str10 != null && C52830p.m112406a(str10, "true", true)) {
                Uri parse2 = Uri.parse(str);
                C52711k.m112236a((Object) parse2, "Uri.parse(originUrl)");
                String host = parse2.getHost();
                if (host == null) {
                    host = "";
                }
                str9 = host;
            }
            CharSequence charSequence6 = (CharSequence) map.get("disable_app_link");
            if (charSequence6 == null || charSequence6.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || C52830p.m112406a((String) map.get("disable_app_link"), "true", true)) {
                z9 = true;
            }
            SmartRouter.buildRoute(context, "//wiki").withParam("url", sb.toString()).withParam("shoot_way", str4).withParam("creation_id", str5).withParam("show_keyboard", a3).withParam("anchor_type", str3).withParam("author_id", (String) map.get("author_id")).withParam("group_id", (String) map.get("group_id")).withParam("enter_from", (String) map.get("enter_from")).withParam("language", (String) map.get("language")).withParam("wiki_entry", (String) map.get("wiki_entry")).withParam("anchor_entry", (String) map.get("anchor_entry")).withParam("host_filter", str9).withParam("disable_app_link", z9).withParam("content_source", (String) map.get("content_source")).withParam("content_type", (String) map.get("content_type")).withParam("placeholder_enter_from", (String) map.get("placeholder_enter_from")).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$b */
    static final class C48398b extends C52712l implements C52682m<WebView, String, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f121746a;

        C48398b(AddWikiActivity addWikiActivity) {
            this.f121746a = addWikiActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(m104731a((WebView) obj, (String) obj2));
        }

        /* renamed from: a */
        private boolean m104731a(WebView webView, String str) {
            C52711k.m112240b(webView, "view");
            C52711k.m112240b(str, "url");
            if (this.f121746a.f121737a) {
                C10691a.m21548c((Context) this.f121746a, (int) R.string.aml).mo19066a();
                return true;
            }
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "uri");
            String scheme = parse.getScheme();
            boolean booleanExtra = this.f121746a.getIntent().getBooleanExtra("disable_app_link", true);
            String stringExtra = this.f121746a.getIntent().getStringExtra("anchor_type");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String path = parse.getPath();
            if (path != null && C52830p.m112413c(path, ".apk", false, 2, null)) {
                C10691a.m21548c((Context) this.f121746a, (int) R.string.i7).mo19066a();
                return true;
            } else if (C52830p.m112406a(scheme, "intent", true)) {
                if (booleanExtra) {
                    C10691a.m21548c((Context) this.f121746a, (int) R.string.i7).mo19066a();
                } else {
                    try {
                        this.f121746a.setIntent(Intent.parseUri(str, 1));
                        this.f121746a.getIntent().addFlags(268435456);
                        this.f121746a.startActivity(this.f121746a.getIntent());
                    } catch (URISyntaxException unused) {
                    }
                }
                return true;
            } else if (C52830p.m112406a(scheme, "yelp", true)) {
                if (booleanExtra) {
                    C10691a.m21548c((Context) this.f121746a, (int) R.string.i7).mo19066a();
                } else {
                    C26540w.m64236b((Context) this.f121746a, str);
                }
                return true;
            } else if (C52830p.m112406a(scheme, "tripadvisor", true)) {
                if (booleanExtra) {
                    C10691a.m21548c((Context) this.f121746a, (int) R.string.i7).mo19066a();
                } else {
                    C26540w.m64236b((Context) this.f121746a, str);
                }
                return true;
            } else if (C52830p.m112406a(scheme, "market", true)) {
                C10691a.m21548c((Context) this.f121746a, (int) R.string.i7).mo19066a();
                return true;
            } else {
                if (C52830p.m112406a(stringExtra, "Yelp", true)) {
                    CharSequence charSequence = str;
                    if (C52830p.m112455b(charSequence, (CharSequence) "&deeplink=", true)) {
                        if (booleanExtra) {
                            C10691a.m21548c((Context) this.f121746a, (int) R.string.i7).mo19066a();
                        } else {
                            String substring = str.substring(C52830p.m112419a(charSequence, "&deeplink=", 0, false, 6, (Object) null) + 10, str.length());
                            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            int a = C52830p.m112419a((CharSequence) substring, "&", 0, false, 6, (Object) null);
                            if (substring != null) {
                                String substring2 = substring.substring(0, a);
                                C52711k.m112236a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                C26540w.m64236b((Context) this.f121746a, URLDecoder.decode(substring2, "UTF-8"));
                            } else {
                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                        return true;
                    }
                }
                this.f121746a.mo95873a(true);
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$c */
    public static final class C48399c implements C27235d {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f121747a;

        /* renamed from: b */
        private boolean f121748b;

        /* renamed from: a */
        public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: b */
        public final boolean mo52683b(WebView webView, String str) {
            return false;
        }

        C48399c(AddWikiActivity addWikiActivity) {
            this.f121747a = addWikiActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a7, code lost:
            if (r12 == null) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a8, code lost:
            if (r3 != false) goto L_0x02aa;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x032b  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0389  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x04bd  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0281  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x02e4  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x02ee  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo49880a(android.webkit.WebView r12, java.lang.String r13) {
            /*
                r11 = this;
                boolean r0 = r11.f121748b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0181
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.widget.ImageView r12 = r12.mo95870a()
                int r12 = r12.getVisibility()
                r13 = 8
                if (r12 != r13) goto L_0x001d
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.widget.ImageView r12 = r12.mo95870a()
                r12.setVisibility(r1)
            L_0x001d:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.widget.ImageView r12 = r12.mo95874b()
                int r12 = r12.getVisibility()
                if (r12 != r13) goto L_0x0032
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.widget.ImageView r12 = r12.mo95874b()
                r12.setVisibility(r1)
            L_0x0032:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                r12.mo95873a(r1)
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.content.Intent r12 = r12.getIntent()
                java.lang.String r13 = "enter_from"
                java.lang.String r12 = r12.getStringExtra(r13)
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                if (r12 == 0) goto L_0x0050
                int r12 = r12.length()
                if (r12 != 0) goto L_0x004e
                goto L_0x0050
            L_0x004e:
                r12 = 0
                goto L_0x0051
            L_0x0050:
                r12 = 1
            L_0x0051:
                if (r12 != 0) goto L_0x0180
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.content.Intent r12 = r12.getIntent()
                java.lang.String r13 = "anchor_type"
                java.lang.String r12 = r12.getStringExtra(r13)
                if (r12 != 0) goto L_0x0063
                java.lang.String r12 = ""
            L_0x0063:
                java.lang.String r13 = "Yelp"
                boolean r13 = p2628d.p2650m.C52830p.m112406a(r12, r13, r2)
                if (r13 == 0) goto L_0x00dc
                com.ss.android.ugc.aweme.app.f.d r12 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r13 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_type"
                java.lang.String r0 = "Yelp"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "status"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47826a(r13, r1)
                java.lang.String r13 = "duration"
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r2 = r11.f121747a
                long r2 = r2.f121743g
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47827a(r13, r0)
                java.lang.String r13 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r12 = r12.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r12)
                return
            L_0x00dc:
                java.lang.String r13 = "TripAdvisor"
                boolean r12 = p2628d.p2650m.C52830p.m112406a(r12, r13, r2)
                if (r12 == 0) goto L_0x0155
                com.ss.android.ugc.aweme.app.f.d r12 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r13 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_type"
                java.lang.String r0 = "TripAdvisor"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r2 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "status"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47826a(r13, r1)
                java.lang.String r13 = "duration"
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r2 = r11.f121747a
                long r2 = r2.f121743g
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47827a(r13, r0)
                java.lang.String r13 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r12 = r12.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r12)
                return
            L_0x0155:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                com.ss.android.ugc.aweme.app.f.d r13 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r0 = "EventMapBuilder.newBuilder()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo95871a(r13)
                java.lang.String r13 = "status"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47826a(r13, r1)
                java.lang.String r13 = "duration"
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r2 = r11.f121747a
                long r2 = r2.f121743g
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47827a(r13, r0)
                java.lang.String r13 = "request_wiki_detail"
                java.util.Map<java.lang.String, java.lang.String> r12 = r12.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r12)
            L_0x0180:
                return
            L_0x0181:
                android.net.Uri r13 = android.net.Uri.parse(r13)
                java.lang.String r0 = "uri"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
                java.lang.String r0 = "title"
                java.lang.String r0 = com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.m104717a(r13, r0)
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L_0x019e
                int r3 = r3.length()
                if (r3 != 0) goto L_0x019c
                goto L_0x019e
            L_0x019c:
                r3 = 0
                goto L_0x019f
            L_0x019e:
                r3 = 1
            L_0x019f:
                if (r3 == 0) goto L_0x01af
                if (r12 == 0) goto L_0x01ac
                java.lang.String r12 = r12.getTitle()
                if (r12 != 0) goto L_0x01aa
                goto L_0x01ac
            L_0x01aa:
                r0 = r12
                goto L_0x01af
            L_0x01ac:
                java.lang.String r12 = ""
                goto L_0x01aa
            L_0x01af:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.content.Intent r12 = r12.getIntent()
                java.lang.String r3 = "anchor_type"
                java.lang.String r12 = r12.getStringExtra(r3)
                java.lang.String r3 = "Yelp"
                boolean r3 = p2628d.p2650m.C52830p.m112406a(r12, r3, r2)
                if (r3 != 0) goto L_0x01d9
                java.lang.String r3 = "TripAdvisor"
                boolean r3 = p2628d.p2650m.C52830p.m112406a(r12, r3, r2)
                if (r3 == 0) goto L_0x01cc
                goto L_0x01d9
            L_0x01cc:
                java.lang.String r3 = "addButton"
                java.lang.String r3 = com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.m104717a(r13, r3)
                java.lang.String r4 = "true"
                boolean r3 = p2628d.p2650m.C52830p.m112406a(r3, r4, r2)
                goto L_0x01da
            L_0x01d9:
                r3 = 1
            L_0x01da:
                com.ss.android.ugc.aweme.language.I18nManagerService r4 = com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.language.I18nManagerService r4 = (com.p683ss.android.ugc.aweme.language.I18nManagerService) r4
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r5 = r11.f121747a
                java.lang.String r6 = "lang"
                java.lang.String r6 = com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.m104717a(r13, r6)
                if (r6 != 0) goto L_0x01f8
                java.lang.String r6 = "service"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
                java.lang.String r6 = r4.getAppLanguage()
                java.lang.String r4 = "service.appLanguage"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r4)
            L_0x01f8:
                r5.f121739c = r6
                java.lang.String r4 = "TripAdvisor"
                boolean r4 = p2628d.p2650m.C52830p.m112406a(r12, r4, r2)
                if (r4 == 0) goto L_0x021a
                r5 = r0
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.String r4 = " - "
                r6[r1] = r4
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                java.util.List r4 = p2628d.p2650m.C52830p.m112452b(r5, r6, r7, r8, r9, r10)
                java.lang.Object r4 = r4.get(r1)
                java.lang.String r4 = (java.lang.String) r4
                goto L_0x021b
            L_0x021a:
                r4 = r0
            L_0x021b:
                java.lang.String r5 = "TripAdvisor"
                boolean r5 = p2628d.p2650m.C52830p.m112406a(r12, r5, r2)
                if (r5 == 0) goto L_0x0226
                java.lang.String r12 = "mt_tripadvisor"
                goto L_0x0233
            L_0x0226:
                java.lang.String r5 = "Yelp"
                boolean r12 = p2628d.p2650m.C52830p.m112406a(r12, r5, r2)
                if (r12 == 0) goto L_0x0231
                java.lang.String r12 = "mt_yelp"
                goto L_0x0233
            L_0x0231:
                java.lang.String r12 = "mt_wikipedia"
            L_0x0233:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r5 = r11.f121747a
                r6 = 0
                if (r3 == 0) goto L_0x0262
                r3 = r4
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 <= 0) goto L_0x0243
                r3 = 1
                goto L_0x0244
            L_0x0243:
                r3 = 0
            L_0x0244:
                if (r3 == 0) goto L_0x0262
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r3 = r11.f121747a
                java.lang.String r3 = r3.f121739c
                if (r3 != 0) goto L_0x0251
                java.lang.String r7 = "language"
                p2628d.p2639f.p2641b.C52711k.m112237a(r7)
            L_0x0251:
                java.lang.String r7 = "scene"
                p2628d.p2639f.p2641b.C52711k.m112240b(r12, r7)
                java.lang.String r7 = "keyword"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r7)
                com.ss.android.ugc.aweme.wiki.CheckWikiWordService r7 = com.p683ss.android.ugc.aweme.wiki.CheckWikiWordService.C48406a.f121764a
                com.google.b.h.a.m r12 = r7.checkKeyword(r12, r3, r4)
                goto L_0x0263
            L_0x0262:
                r12 = r6
            L_0x0263:
                r5.f121740d = r12
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.content.Intent r12 = r12.getIntent()
                java.lang.String r3 = "enter_from"
                java.lang.String r12 = r12.getStringExtra(r3)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x027e
                int r3 = r0.length()
                if (r3 != 0) goto L_0x027c
                goto L_0x027e
            L_0x027c:
                r3 = 0
                goto L_0x027f
            L_0x027e:
                r3 = 1
            L_0x027f:
                if (r3 != 0) goto L_0x02b3
                r3 = r12
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L_0x028f
                int r3 = r3.length()
                if (r3 != 0) goto L_0x028d
                goto L_0x028f
            L_0x028d:
                r3 = 0
                goto L_0x0290
            L_0x028f:
                r3 = 1
            L_0x0290:
                if (r3 != 0) goto L_0x02aa
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r3 = r11.f121747a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r3.mo95875c()
                java.lang.CharSequence r3 = r3.getText()
                if (r3 == 0) goto L_0x02a7
                int r3 = r3.length()
                if (r3 != 0) goto L_0x02a5
                goto L_0x02a7
            L_0x02a5:
                r3 = 0
                goto L_0x02a8
            L_0x02a7:
                r3 = 1
            L_0x02a8:
                if (r3 == 0) goto L_0x02b3
            L_0x02aa:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r3 = r11.f121747a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r3.mo95875c()
                r3.setText(r0)
            L_0x02b3:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                java.lang.String r3 = "keyword"
                java.lang.String r3 = com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.m104717a(r13, r3)
                r0.f121738b = r3
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                java.lang.String r3 = "noRedirect"
                java.lang.String r3 = com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.m104717a(r13, r3)
                java.lang.String r4 = "true"
                boolean r3 = p2628d.p2650m.C52830p.m112406a(r3, r4, r2)
                r0.f121737a = r3
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                r0.mo95872a(r13)
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r13 = r11.f121747a
                r13.f121741e = r6
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r13 = r11.f121747a
                android.content.Intent r0 = r13.getIntent()
                java.lang.String r3 = "anchor_type"
                java.lang.String r0 = r0.getStringExtra(r3)
                if (r0 != 0) goto L_0x02e6
                java.lang.String r0 = ""
            L_0x02e6:
                java.lang.String r3 = "Yelp"
                boolean r3 = p2628d.p2650m.C52830p.m112406a(r0, r3, r2)
                if (r3 == 0) goto L_0x032b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "javascript:(function extra(){"
                r0.append(r3)
                java.lang.String r3 = "[].forEach.call(document.getElementsByClassName('lemon--div__32e33__1mboc banner__32e33__39b4o border-color--default__32e33__2oFDT'), el => el.style.display = 'none');"
                r0.append(r3)
                java.lang.String r3 = "document.getElementById('smart-banner').style.display = 'none';"
                r0.append(r3)
                java.lang.String r3 = "document.getElementById('fullscreen-pitch').style.display = 'none';"
                r0.append(r3)
                java.lang.String r3 = "[].forEach.call(document.getElementsByClassName('fullscreen-pitch_close'), el => el.click());"
                r0.append(r3)
                java.lang.String r3 = "})();"
                r0.append(r3)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r4 = r13.webView
                if (r4 != 0) goto L_0x031a
                java.lang.String r13 = "webView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r13)
            L_0x031a:
                java.lang.String r5 = r0.toString()
                java.lang.String r13 = "jsCode.toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r13)
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m65745a(r4, r5, r6, r7, r8, r9)
                goto L_0x0374
            L_0x032b:
                java.lang.String r3 = "TripAdvisor"
                boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r3, r2)
                if (r0 == 0) goto L_0x0374
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "javascript:(function extra(){"
                r0.append(r3)
                java.lang.String r3 = "[].forEach.call(document.getElementsByClassName('social-ugc-actions-UploaderActionButton__upload_container--1wUKt social-ugc-actions-SocialFab__overlay--31Qvx'), el => el.style.display = 'none');"
                r0.append(r3)
                java.lang.String r3 = "[].forEach.call(document.getElementsByClassName('ppr_rup ppr_priv_daodao_mobile_open_app_smart_button_component'), el => el.style.display = 'none');"
                r0.append(r3)
                java.lang.String r3 = "[].forEach.call(document.getElementsByClassName('cpm-ad-target-mobile-adhesion-MobileAdhesion__fixedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');"
                r0.append(r3)
                java.lang.String r3 = "[].forEach.call(document.getElementsByClassName(' daodao-mobile-app-smartbutton-SmartButton__open_app_smartbutton--YE-xh daodao-mobile-app-smartbutton-SmartButton__is_shown--35tcaedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');"
                r0.append(r3)
                java.lang.String r3 = "[].forEach.call(document.getElementsByClassName('hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__ui_persistent_footer--1MGGe hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__fixed--8x8LO'), el => el.style.display = 'none');"
                r0.append(r3)
                java.lang.String r3 = "})();"
                r0.append(r3)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r4 = r13.webView
                if (r4 != 0) goto L_0x0364
                java.lang.String r13 = "webView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r13)
            L_0x0364:
                java.lang.String r5 = r0.toString()
                java.lang.String r13 = "jsCode.toString()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r13)
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m65745a(r4, r5, r6, r7, r8, r9)
            L_0x0374:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r13 = r11.f121747a
                r13.mo95873a(r1)
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                if (r12 == 0) goto L_0x0386
                int r12 = r12.length()
                if (r12 != 0) goto L_0x0384
                goto L_0x0386
            L_0x0384:
                r12 = 0
                goto L_0x0387
            L_0x0386:
                r12 = 1
            L_0x0387:
                if (r12 != 0) goto L_0x04b7
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                android.content.Intent r12 = r12.getIntent()
                java.lang.String r13 = "anchor_type"
                java.lang.String r12 = r12.getStringExtra(r13)
                if (r12 != 0) goto L_0x0399
                java.lang.String r12 = ""
            L_0x0399:
                java.lang.String r13 = "Yelp"
                boolean r13 = p2628d.p2650m.C52830p.m112406a(r12, r13, r2)
                if (r13 == 0) goto L_0x0413
                com.ss.android.ugc.aweme.app.f.d r12 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r13 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_type"
                java.lang.String r0 = "Yelp"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "status"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47826a(r13, r2)
                java.lang.String r13 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                long r5 = r0.f121743g
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47827a(r13, r3)
                java.lang.String r13 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r12 = r12.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r12)
                goto L_0x04b7
            L_0x0413:
                java.lang.String r13 = "TripAdvisor"
                boolean r12 = p2628d.p2650m.C52830p.m112406a(r12, r13, r2)
                if (r12 == 0) goto L_0x048c
                com.ss.android.ugc.aweme.app.f.d r12 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r13 = "enter_from"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "enter_from"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_type"
                java.lang.String r0 = "TripAdvisor"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "anchor_entry"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "anchor_entry"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "author_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "author_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "group_id"
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r3 = "group_id"
                java.lang.String r0 = r0.getStringExtra(r3)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47829a(r13, r0)
                java.lang.String r13 = "status"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47826a(r13, r2)
                java.lang.String r13 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                long r5 = r0.f121743g
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47827a(r13, r3)
                java.lang.String r13 = "request_anchor_detail"
                java.util.Map<java.lang.String, java.lang.String> r12 = r12.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r12)
                goto L_0x04b7
            L_0x048c:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                com.ss.android.ugc.aweme.app.f.d r13 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r0 = "EventMapBuilder.newBuilder()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo95871a(r13)
                java.lang.String r13 = "status"
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47826a(r13, r2)
                java.lang.String r13 = "duration"
                long r3 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r0 = r11.f121747a
                long r5 = r0.f121743g
                long r3 = r3 - r5
                com.ss.android.ugc.aweme.app.f.d r12 = r12.mo47827a(r13, r3)
                java.lang.String r13 = "request_wiki_detail"
                java.util.Map<java.lang.String, java.lang.String> r12 = r12.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r12)
            L_0x04b7:
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                boolean r12 = r12.f121742f
                if (r12 == 0) goto L_0x04eb
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                r12.f121742f = r1
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r12 = r11.f121747a
                java.lang.String r13 = "input_method"
                java.lang.Object r12 = r12.getSystemService(r13)
                if (r12 == 0) goto L_0x04e3
                android.view.inputmethod.InputMethodManager r12 = (android.view.inputmethod.InputMethodManager) r12
                com.ss.android.ugc.aweme.wiki.AddWikiActivity r13 = r11.f121747a
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r13 = r13.webView
                if (r13 != 0) goto L_0x04d8
                java.lang.String r0 = "webView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x04d8:
                r0 = 2132017404(0x7f1400fc, float:1.9673085E38)
                android.view.View r13 = r13.findViewById(r0)
                r12.showSoftInput(r13, r2)
                goto L_0x04eb
            L_0x04e3:
                d.u r12 = new d.u
                java.lang.String r13 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
                r12.<init>(r13)
                throw r12
            L_0x04eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48399c.mo49880a(android.webkit.WebView, java.lang.String):void");
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f121748b = true;
            }
        }

        /* renamed from: a */
        public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
            this.f121748b = false;
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            if (VERSION.SDK_INT < 23) {
                this.f121748b = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity$d */
    static final class C48400d implements DownloadListener {

        /* renamed from: a */
        public static final C48400d f121749a = new C48400d();

        C48400d() {
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }
    }

    /* renamed from: a */
    public static final boolean m104718a(Aweme aweme) {
        return C48397a.m104728a(aweme);
    }

    /* renamed from: b */
    public static final boolean m104719b(Aweme aweme) {
        return C48397a.m104729b(aweme);
    }

    /* renamed from: c */
    public static final boolean m104720c(Aweme aweme) {
        return C48397a.m104730c(aweme);
    }

    public final void onClickClose() {
        finish();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final ImageView mo95874b() {
        ImageView imageView = this.closeBtn;
        if (imageView == null) {
            C52711k.m112237a("closeBtn");
        }
        return imageView;
    }

    /* renamed from: c */
    public final DmtTextView mo95875c() {
        DmtTextView dmtTextView = this.titleView;
        if (dmtTextView == null) {
            C52711k.m112237a("titleView");
        }
        return dmtTextView;
    }

    public final void finish() {
        super.finish();
        C47718bf.m103288a(new C25633j());
    }

    /* renamed from: a */
    public final ImageView mo95870a() {
        ImageView imageView = this.backBtn;
        if (imageView == null) {
            C52711k.m112237a("backBtn");
        }
        return imageView;
    }

    public final void onBackPressed() {
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("webView");
        }
        if (!crossPlatformWebView.mo55683b()) {
            super.onBackPressed();
            return;
        }
        C52670a<C52860x> aVar = this.f121744i;
        if (aVar != null) {
            aVar.invoke();
        }
        CrossPlatformWebView crossPlatformWebView2 = this.webView;
        if (crossPlatformWebView2 == null) {
            C52711k.m112237a("webView");
        }
        crossPlatformWebView2.mo55681a();
    }

    public final void onClickBack() {
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("webView");
        }
        if (!crossPlatformWebView.mo55683b()) {
            finish();
            return;
        }
        C52670a<C52860x> aVar = this.f121744i;
        if (aVar != null) {
            aVar.invoke();
        }
        CrossPlatformWebView crossPlatformWebView2 = this.webView;
        if (crossPlatformWebView2 == null) {
            C52711k.m112237a("webView");
        }
        crossPlatformWebView2.mo55681a();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", true);
        super.onResume();
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("webView");
        }
        ((SingleWebView) crossPlatformWebView.findViewById(R.id.eu)).setDownloadListener(C48400d.f121749a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", false);
    }

    public final void onDestroy() {
        boolean z;
        ImmersionBar.with((Activity) this).destroy();
        CharSequence stringExtra = getIntent().getStringExtra("enter_from");
        if (stringExtra == null || stringExtra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String stringExtra2 = getIntent().getStringExtra("anchor_type");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            if (C52830p.m112406a(stringExtra2, "Yelp", true)) {
                C26890h.m65011a("anchor_stay_time", C23089d.m56640a().mo47829a("enter_from", getIntent().getStringExtra("enter_from")).mo47829a("anchor_type", "Yelp").mo47829a("anchor_entry", getIntent().getStringExtra("anchor_entry")).mo47829a("author_id", getIntent().getStringExtra("author_id")).mo47829a("group_id", getIntent().getStringExtra("group_id")).mo47827a("duration", System.currentTimeMillis() - this.f121743g).f61491a);
            } else if (C52830p.m112406a(stringExtra2, "TripAdvisor", true)) {
                C26890h.m65011a("anchor_stay_time", C23089d.m56640a().mo47829a("enter_from", getIntent().getStringExtra("enter_from")).mo47829a("anchor_type", "TripAdvisor").mo47829a("anchor_entry", getIntent().getStringExtra("anchor_entry")).mo47829a("author_id", getIntent().getStringExtra("author_id")).mo47829a("group_id", getIntent().getStringExtra("group_id")).mo47827a("duration", System.currentTimeMillis() - this.f121743g).f61491a);
            } else {
                C23089d a = C23089d.m56640a();
                C52711k.m112236a((Object) a, "EventMapBuilder.newBuilder()");
                C26890h.m65011a("wiki_stay_time", mo95871a(a).mo47827a("duration", System.currentTimeMillis() - this.f121743g).f61491a);
            }
        }
        super.onDestroy();
    }

    public final void onClickAdd() {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        if (!this.f121745j) {
            CrossPlatformWebView crossPlatformWebView = this.webView;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("webView");
            }
            Uri parse = Uri.parse(crossPlatformWebView.getCurrentUrl());
            C52711k.m112236a((Object) parse, "uri");
            String scheme = parse.getScheme();
            if (C52830p.m112406a(scheme, WebKitApi.SCHEME_HTTP, true) || C52830p.m112406a(scheme, WebKitApi.SCHEME_HTTPS, true)) {
                String stringExtra = getIntent().getStringExtra("anchor_type");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (C52830p.m112406a(stringExtra, "Yelp", true) && C24678b.m60182a(getIntent().getStringExtra("host_filter"))) {
                    String host = parse.getHost();
                    C52711k.m112236a((Object) host, "uri.host");
                    if (!C52830p.m112455b((CharSequence) host, (CharSequence) "yelp", true)) {
                        C10691a.m21548c((Context) this, (int) R.string.i8).mo19066a();
                        return;
                    }
                }
                if (C52830p.m112406a(stringExtra, "TripAdvisor", true) && C24678b.m60182a(getIntent().getStringExtra("host_filter"))) {
                    String host2 = parse.getHost();
                    C52711k.m112236a((Object) host2, "uri.host");
                    if (!C52830p.m112455b((CharSequence) host2, (CharSequence) "tripadvisor", true)) {
                        C10691a.m21548c((Context) this, (int) R.string.i8).mo19066a();
                        return;
                    }
                }
                try {
                    C17832m<C48407a> mVar = this.f121740d;
                    if (mVar != null) {
                        C48407a aVar = (C48407a) mVar.get();
                        if (aVar != null) {
                            DmtTextView dmtTextView = this.titleView;
                            if (dmtTextView == null) {
                                C52711k.m112237a("titleView");
                            }
                            String obj = dmtTextView.getText().toString();
                            String stringExtra2 = getIntent().getStringExtra("anchor_type");
                            if (C52830p.m112406a(stringExtra2, "Yelp", true) || C52830p.m112406a(stringExtra2, "TripAdvisor", true)) {
                                obj = (String) C52830p.m112452b((CharSequence) obj, new String[]{" - "}, false, 0, 6, (Object) null).get(0);
                            }
                            C23089d a = C23089d.m56640a();
                            String str2 = "enter_from";
                            CharSequence stringExtra3 = getIntent().getStringExtra("placeholder_enter_from");
                            if (stringExtra3 == null || stringExtra3.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                str = "video_post_page";
                            } else {
                                str = getIntent().getStringExtra("placeholder_enter_from");
                            }
                            C23089d a2 = a.mo47829a(str2, str);
                            String stringExtra4 = getIntent().getStringExtra("shoot_way");
                            CharSequence charSequence = stringExtra4;
                            if (charSequence == null || charSequence.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                a2.mo47829a("shoot_way", stringExtra4);
                            }
                            String stringExtra5 = getIntent().getStringExtra("creation_id");
                            CharSequence charSequence2 = stringExtra5;
                            if (charSequence2 == null || charSequence2.length() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                a2.mo47829a("creation_id", stringExtra5);
                            }
                            if (aVar.getCode() != 0) {
                                C10691a.m21545b((Context) this, aVar.getMsg()).mo19066a();
                                if (C52830p.m112406a(stringExtra, "Yelp", true)) {
                                    C26890h.m65011a("choose_anchor", a2.mo47829a("anchor_type", "Yelp").mo47829a("anchor_entry", obj).mo47826a("status", 0).f61491a);
                                } else if (C52830p.m112406a(stringExtra, "TripAdvisor", true)) {
                                    C26890h.m65011a("choose_anchor", a2.mo47829a("anchor_type", "TripAdvisor").mo47829a("anchor_entry", obj).mo47826a("status", 0).f61491a);
                                } else {
                                    String str3 = "add_wiki";
                                    String str4 = "language";
                                    String str5 = this.f121739c;
                                    if (str5 == null) {
                                        C52711k.m112237a("language");
                                    }
                                    C26890h.m65011a(str3, a2.mo47829a(str4, str5).mo47829a("wiki_entry", obj).mo47829a("key_word", this.f121738b).mo47826a("status", 0).mo47829a("content_source", getIntent().getStringExtra("content_source")).mo47829a("content_type", getIntent().getStringExtra("content_type")).f61491a);
                                }
                            } else if (C52830p.m112406a(stringExtra, "Yelp", true)) {
                                CrossPlatformWebView crossPlatformWebView2 = this.webView;
                                if (crossPlatformWebView2 == null) {
                                    C52711k.m112237a("webView");
                                }
                                String currentUrl = crossPlatformWebView2.getCurrentUrl();
                                if (currentUrl == null) {
                                    currentUrl = "https://www.yelp.com";
                                }
                                int type = C25600a.YELP.getTYPE();
                                String b = new C17971f().mo34889b(new C25619a(obj, currentUrl));
                                C52711k.m112236a((Object) b, "Gson().toJson(CommonAnchor(title, url))");
                                AnchorTransData anchorTransData = new AnchorTransData(type, b, obj, null, Integer.valueOf(1), null, null, 104, null);
                                C47718bf.m103288a(new C25615b(anchorTransData));
                                finish();
                                C26890h.m65011a("choose_anchor", a2.mo47829a("anchor_type", "Yelp").mo47829a("anchor_entry", obj).mo47826a("status", 1).f61491a);
                            } else if (C52830p.m112406a(stringExtra, "TripAdvisor", true)) {
                                CrossPlatformWebView crossPlatformWebView3 = this.webView;
                                if (crossPlatformWebView3 == null) {
                                    C52711k.m112237a("webView");
                                }
                                String currentUrl2 = crossPlatformWebView3.getCurrentUrl();
                                if (currentUrl2 == null) {
                                    currentUrl2 = "https://www.tripadvisor.com";
                                }
                                int type2 = C25600a.TRIP_ADVISOR.getTYPE();
                                String b2 = new C17971f().mo34889b(new C25619a(obj, currentUrl2));
                                C52711k.m112236a((Object) b2, "Gson().toJson(CommonAnchor(title, url))");
                                AnchorTransData anchorTransData2 = new AnchorTransData(type2, b2, obj, null, Integer.valueOf(1), null, null, 104, null);
                                C47718bf.m103288a(new C25615b(anchorTransData2));
                                finish();
                                C26890h.m65011a("choose_anchor", a2.mo47829a("anchor_type", "TripAdvisor").mo47829a("anchor_entry", obj).mo47826a("status", 1).f61491a);
                            } else {
                                int type3 = C25600a.WIKIPEDIA.getTYPE();
                                C17971f fVar = new C17971f();
                                String str6 = this.f121739c;
                                if (str6 == null) {
                                    C52711k.m112237a("language");
                                }
                                String b3 = fVar.mo34889b(new C25620b(obj, str6));
                                C52711k.m112236a((Object) b3, "Gson().toJson(WikiAnchor(title, language))");
                                AnchorTransData anchorTransData3 = new AnchorTransData(type3, b3, obj, null, Integer.valueOf(1), null, null, 104, null);
                                C47718bf.m103288a(new C25615b(anchorTransData3));
                                finish();
                                String str7 = "add_wiki";
                                String str8 = "language";
                                String str9 = this.f121739c;
                                if (str9 == null) {
                                    C52711k.m112237a("language");
                                }
                                C26890h.m65011a(str7, a2.mo47829a(str8, str9).mo47829a("wiki_entry", obj).mo47829a("key_word", this.f121738b).mo47826a("status", 1).mo47829a("content_source", getIntent().getStringExtra("content_source")).mo47829a("content_type", getIntent().getStringExtra("content_type")).f61491a);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                C10691a.m21548c((Context) this, (int) R.string.i8).mo19066a();
            }
        }
    }

    public final void setStatusBar(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.statusBar = view;
    }

    /* renamed from: a */
    public final void mo95873a(boolean z) {
        this.f121745j = z;
        String stringExtra = getIntent().getStringExtra("anchor_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (C52830p.m112406a(stringExtra, "Wiki", true)) {
            CrossPlatformWebView crossPlatformWebView = this.webView;
            if (crossPlatformWebView == null) {
                C52711k.m112237a("webView");
            }
            crossPlatformWebView.mo55680a(z);
        }
    }

    /* renamed from: a */
    public final C23089d mo95871a(C23089d dVar) {
        C23089d a = dVar.mo47829a("enter_from", getIntent().getStringExtra("enter_from")).mo47829a("wiki_entry", getIntent().getStringExtra("wiki_entry")).mo47829a("author_id", getIntent().getStringExtra("author_id")).mo47829a("group_id", getIntent().getStringExtra("group_id")).mo47829a("language", getIntent().getStringExtra("language"));
        C52711k.m112236a((Object) a, "this.appendParam(Mob.Key…ey.WIKI_ANCHOR_LANGUAGE))");
        return a;
    }

    /* renamed from: a */
    public final void mo95872a(Uri uri) {
        int i;
        int i2;
        String stringExtra = getIntent().getStringExtra("anchor_type");
        int i3 = 0;
        int i4 = 8;
        if (C52830p.m112406a(stringExtra, "Yelp", true) || C52830p.m112406a(stringExtra, "TripAdvisor", true)) {
            if (getIntent().getStringExtra("enter_from") == null) {
                LinearLayout linearLayout = this.addBtn;
                if (linearLayout == null) {
                    C52711k.m112237a("addBtn");
                }
                linearLayout.setVisibility(0);
                ImageView imageView = this.closeBtn;
                if (imageView == null) {
                    C52711k.m112237a("closeBtn");
                }
                imageView.setVisibility(0);
                ImageView imageView2 = this.backBtn;
                if (imageView2 == null) {
                    C52711k.m112237a("backBtn");
                }
                CrossPlatformWebView crossPlatformWebView = this.webView;
                if (crossPlatformWebView == null) {
                    C52711k.m112237a("webView");
                }
                if (!crossPlatformWebView.mo55683b()) {
                    i3 = 8;
                }
                imageView2.setVisibility(i3);
                return;
            }
            LinearLayout linearLayout2 = this.addBtn;
            if (linearLayout2 == null) {
                C52711k.m112237a("addBtn");
            }
            linearLayout2.setVisibility(8);
            ImageView imageView3 = this.closeBtn;
            if (imageView3 == null) {
                C52711k.m112237a("closeBtn");
            }
            CrossPlatformWebView crossPlatformWebView2 = this.webView;
            if (crossPlatformWebView2 == null) {
                C52711k.m112237a("webView");
            }
            if (crossPlatformWebView2.mo55683b()) {
                i4 = 0;
            }
            imageView3.setVisibility(i4);
            ImageView imageView4 = this.backBtn;
            if (imageView4 == null) {
                C52711k.m112237a("backBtn");
            }
            imageView4.setVisibility(0);
        } else if (C52830p.m112406a(m104717a(uri, "hide_nav_bar"), "1", true)) {
            LinearLayout linearLayout3 = this.addBtn;
            if (linearLayout3 == null) {
                C52711k.m112237a("addBtn");
            }
            linearLayout3.setVisibility(8);
            ImageView imageView5 = this.backBtn;
            if (imageView5 == null) {
                C52711k.m112237a("backBtn");
            }
            imageView5.setVisibility(8);
            ImageView imageView6 = this.closeBtn;
            if (imageView6 == null) {
                C52711k.m112237a("closeBtn");
            }
            imageView6.setVisibility(8);
            DmtTextView dmtTextView = this.titleView;
            if (dmtTextView == null) {
                C52711k.m112237a("titleView");
            }
            dmtTextView.setVisibility(8);
            View view = this.statusBar;
            if (view == null) {
                C52711k.m112237a("statusBar");
            }
            view.setVisibility(8);
        } else {
            View view2 = this.statusBar;
            if (view2 == null) {
                C52711k.m112237a("statusBar");
            }
            view2.setVisibility(0);
            DmtTextView dmtTextView2 = this.titleView;
            if (dmtTextView2 == null) {
                C52711k.m112237a("titleView");
            }
            dmtTextView2.setVisibility(0);
            boolean a = C52830p.m112406a(m104717a(uri, "addButton"), "true", true);
            LinearLayout linearLayout4 = this.addBtn;
            if (linearLayout4 == null) {
                C52711k.m112237a("addBtn");
            }
            if (a) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout4.setVisibility(i);
            boolean z = !C52830p.m112406a(m104717a(uri, "close"), "false", true);
            ImageView imageView7 = this.closeBtn;
            if (imageView7 == null) {
                C52711k.m112237a("closeBtn");
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView7.setVisibility(i2);
            boolean z2 = !C52830p.m112406a(m104717a(uri, "back"), "false", true);
            ImageView imageView8 = this.backBtn;
            if (imageView8 == null) {
                C52711k.m112237a("backBtn");
            }
            if (!z2 && (z || z2)) {
                i3 = 8;
            }
            imageView8.setVisibility(i3);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ex);
        Activity activity = this;
        ButterKnife.bind(activity);
        this.f121743g = System.currentTimeMillis();
        String stringExtra = getIntent().getStringExtra("url");
        Uri parse = Uri.parse(stringExtra);
        C52711k.m112236a((Object) parse, "Uri.parse(url)");
        mo95872a(parse);
        CrossPlatformWebView crossPlatformWebView = this.webView;
        if (crossPlatformWebView == null) {
            C52711k.m112237a("webView");
        }
        crossPlatformWebView.setCustomWebViewStatus(new C48399c(this));
        CrossPlatformWebView crossPlatformWebView2 = this.webView;
        if (crossPlatformWebView2 == null) {
            C52711k.m112237a("webView");
        }
        crossPlatformWebView2.setShouldOverrideInterceptor(new C48398b(this));
        mo95873a(true);
        CrossPlatformWebView crossPlatformWebView3 = this.webView;
        if (crossPlatformWebView3 == null) {
            C52711k.m112237a("webView");
        }
        C52711k.m112236a((Object) stringExtra, "url");
        CrossPlatformWebView.m65745a(crossPlatformWebView3, stringExtra, false, null, 6, null);
        CrossPlatformWebView crossPlatformWebView4 = this.webView;
        if (crossPlatformWebView4 == null) {
            C52711k.m112237a("webView");
        }
        crossPlatformWebView4.requestFocus();
        CrossPlatformWebView crossPlatformWebView5 = this.webView;
        if (crossPlatformWebView5 == null) {
            C52711k.m112237a("webView");
        }
        ((SingleWebView) crossPlatformWebView5.findViewById(R.id.eu)).requestFocus();
        this.f121742f = getIntent().getBooleanExtra("show_keyboard", false);
        getIntent().getStringExtra("anchor_type");
        ImmersionBar.with(activity).statusBarDarkFont(true).init();
        Context context = this;
        C10675b.m21496a(context);
        Window window = getWindow();
        C52711k.m112236a((Object) window, "window");
        View decorView = window.getDecorView();
        C52711k.m112236a((Object) decorView, "window.decorView");
        decorView.setBackground(new ColorDrawable(C0726c.m2098c(context, R.color.aso)));
        CrossPlatformWebView crossPlatformWebView6 = this.webView;
        if (crossPlatformWebView6 == null) {
            C52711k.m112237a("webView");
        }
        ((DmtStatusView) crossPlatformWebView6.findViewById(R.id.abc)).mo19029a(0);
        CrossPlatformWebView crossPlatformWebView7 = this.webView;
        if (crossPlatformWebView7 == null) {
            C52711k.m112237a("webView");
        }
        ((SingleWebView) crossPlatformWebView7.mo55669a((int) R.id.eu)).controlGeolocationPermissions(false);
        LayoutParams layoutParams = new LayoutParams(-1, C11065a.m22390a(context));
        View view = this.statusBar;
        if (view == null) {
            C52711k.m112237a("statusBar");
        }
        view.setLayoutParams(layoutParams);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static String m104717a(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }
}
