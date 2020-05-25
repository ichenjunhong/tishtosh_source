package com.bytedance.polaris.browser;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p521a.C9369a;
import com.bytedance.polaris.base.BasePolarisActivity;
import com.bytedance.polaris.base.C12581c;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12637g;
import com.bytedance.polaris.p826d.C12637g.C12638a;
import com.bytedance.polaris.p826d.C12650p;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;

public class PolarisBrowserActivity extends BasePolarisActivity implements C12581c {

    /* renamed from: A */
    private int f33028A;

    /* renamed from: B */
    private String f33029B;

    /* renamed from: C */
    private String f33030C;

    /* renamed from: D */
    private boolean f33031D;

    /* renamed from: E */
    private boolean f33032E;

    /* renamed from: F */
    private String f33033F;

    /* renamed from: G */
    private String f33034G;

    /* renamed from: H */
    private OnClickListener f33035H = new OnClickListener() {
        public final void onClick(View view) {
            boolean z;
            int id = view.getId();
            if (id == R.id.ccu) {
                try {
                    if (PolarisBrowserActivity.this.mo23655i() != null) {
                        WebView i = PolarisBrowserActivity.this.mo23655i();
                        String str = "javascript:(function(){function loadScript(url,callback){var head=document.head,script;script=document.createElement('script');script.async=false;script.type='text/javascript';script.charset='utf-8';script.src=url;head.insertBefore(script,head.firstChild);if(callback){script.addEventListener('load',callback,false)}}function sendMsg(argument){var min_image_size=100;var title='',desc='',icon='',title_ele=document.querySelector('title'),desc_ele=document.querySelector('meta[name=description]');if(title_ele){title=title_ele.innerText}if(desc_ele){desc=desc_ele.content}var imgs=document.querySelectorAll('body img');for(var i=0;i<imgs.length;i++){var img=imgs[i];if(img.naturalWidth>min_image_size&&img.naturalHeight>min_image_size){icon=img.src;break}}window.ToutiaoJSBridge.call('shareInfo',{'title':title,'desc':desc,'image':icon,'url':location.href})}if(!window.ToutiaoJSBridge){var protocol=location.protocol.indexOf('https')>-1?'https://':'http://';loadScript(protocol+'s2.pstatp.com/inapp/toutiao.js',sendMsg)}else{sendMsg()}})();";
                        C18984e.m46161a(str);
                        i.loadUrl(str);
                    }
                    PopupMenu popupMenu = new PopupMenu(PolarisBrowserActivity.this, PolarisBrowserActivity.this.f33013h);
                    Menu menu = popupMenu.getMenu();
                    Iterator it = PolarisBrowserActivity.this.f33042s.iterator();
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        C12588b bVar = (C12588b) it.next();
                        menu.add(0, bVar.mId, 0, bVar.mTitleRes);
                    }
                    PolarisBrowserActivity polarisBrowserActivity = PolarisBrowserActivity.this;
                    C12589a aVar = null;
                    if (polarisBrowserActivity.f33040q != null) {
                        aVar = (C12589a) polarisBrowserActivity.f33040q.get();
                    }
                    if ((aVar instanceof C12587a) && ((C12587a) aVar).mo23660a()) {
                        z = true;
                    }
                    if (!z) {
                        menu.removeItem(C12588b.SHARE.mId);
                    }
                    popupMenu.setOnMenuItemClickListener(PolarisBrowserActivity.this.f33041r);
                    if (menu.hasVisibleItems()) {
                        popupMenu.show();
                    }
                } catch (Throwable unused) {
                }
            } else if (id == R.id.mz) {
                PolarisBrowserActivity.this.onBackPressed();
            } else {
                if (id == R.id.ug) {
                    PolarisBrowserActivity.this.mo23646f();
                }
            }
        }
    };

    /* renamed from: I */
    private boolean f33036I;

    /* renamed from: n */
    public ImageView f33037n;

    /* renamed from: o */
    public String f33038o;

    /* renamed from: p */
    public boolean f33039p;

    /* renamed from: q */
    WeakReference<C12589a> f33040q;

    /* renamed from: r */
    OnMenuItemClickListener f33041r = new OnMenuItemClickListener() {
        public final boolean onMenuItemClick(MenuItem menuItem) {
            WebView i = PolarisBrowserActivity.this.mo23655i();
            if (i == null) {
                return true;
            }
            int itemId = menuItem.getItemId();
            String url = i.getUrl();
            C12589a aVar = null;
            if (itemId == R.id.c3c) {
                PolarisBrowserActivity polarisBrowserActivity = PolarisBrowserActivity.this;
                if (!C9431p.m18664a(url)) {
                    if (polarisBrowserActivity.f33040q != null) {
                        aVar = (C12589a) polarisBrowserActivity.f33040q.get();
                    }
                    if (!(aVar instanceof C12587a)) {
                        try {
                            Intent intent = new Intent();
                            intent.setData(Uri.parse(url));
                            intent.setAction("android.intent.action.VIEW");
                            polarisBrowserActivity.startActivity(intent);
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (itemId == R.id.c3b) {
                PolarisBrowserActivity polarisBrowserActivity2 = PolarisBrowserActivity.this;
                if (!C9431p.m18664a(url)) {
                    C9369a.m18549a(polarisBrowserActivity2, "", url);
                    C9432q.m18673a((Context) polarisBrowserActivity2, (int) R.drawable.b6t, (int) R.string.cvc);
                }
            } else if (itemId == R.id.c3e) {
                PolarisBrowserActivity polarisBrowserActivity3 = PolarisBrowserActivity.this;
                if (polarisBrowserActivity3.f33040q != null) {
                    aVar = (C12589a) polarisBrowserActivity3.f33040q.get();
                }
                if (aVar != null && aVar.mo23663p_()) {
                    aVar.mo23661b();
                }
            } else if (itemId == R.id.c3f) {
                PolarisBrowserActivity polarisBrowserActivity4 = PolarisBrowserActivity.this;
                if (polarisBrowserActivity4.f33040q != null) {
                    polarisBrowserActivity4.f33040q.get();
                }
            }
            return true;
        }
    };

    /* renamed from: s */
    public ArrayList<C12588b> f33042s;

    /* renamed from: t */
    private boolean f33043t;

    /* renamed from: u */
    private String f33044u;

    /* renamed from: v */
    private String f33045v;

    /* renamed from: w */
    private TextView f33046w;

    /* renamed from: x */
    private View f33047x;

    /* renamed from: y */
    private boolean f33048y;

    /* renamed from: z */
    private int f33049z;

    /* renamed from: com.bytedance.polaris.browser.PolarisBrowserActivity$a */
    public interface C12587a {
        /* renamed from: a */
        boolean mo23660a();
    }

    /* renamed from: com.bytedance.polaris.browser.PolarisBrowserActivity$b */
    public enum C12588b {
        REFRESH(R.id.c3e, "refresh", R.string.ctr),
        COPYLINK(R.id.c3b, "copylink", R.string.ctp),
        OPEN_WITH_BROWSER(R.id.c3c, "openwithbrowser", R.string.ctq),
        SHARE(R.id.c3f, "share", R.string.cts);
        
        public int mId;
        public String mKey;
        public int mTitleRes;

        private C12588b(int i, String str, int i2) {
            this.mId = i;
            this.mKey = str;
            this.mTitleRes = i2;
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    /* renamed from: e */
    public final boolean mo23645e() {
        if (this.f33049z != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23653a() {
        if (this.f33017l != null) {
            this.f33017l.setSwipeEnabled(false);
        }
    }

    /* renamed from: g */
    public final void mo23654g() {
        if (this.f33017l != null) {
            this.f33017l.setSwipeEnabled(true);
        }
    }

    /* renamed from: d */
    public final boolean mo23644d() {
        if (this.f33048y || this.f33049z == 1 || this.f33049z == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo23646f() {
        if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = C18920g.m46046a((Context) this, getPackageName());
            }
            finish();
            if (intent != null) {
                startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final WebView mo23655i() {
        C12589a aVar;
        if (this.f33040q != null) {
            aVar = (C12589a) this.f33040q.get();
        } else {
            aVar = null;
        }
        if (aVar == null || !aVar.mo23663p_()) {
            return null;
        }
        return aVar.mo23662c();
    }

    public void onBackPressed() {
        if (this.f33039p) {
            mo23646f();
            return;
        }
        if (this.f33037n.getVisibility() != 0) {
            this.f33037n.postDelayed(new Runnable() {
                public final void run() {
                    if ("back_arrow".equals(PolarisBrowserActivity.this.f33038o)) {
                        PolarisBrowserActivity.this.f33037n.setVisibility(0);
                    }
                }
            }, 300);
        }
        WebView i = mo23655i();
        if (i == null || !i.canGoBack()) {
            mo23646f();
        } else {
            i.goBack();
        }
    }

    /* renamed from: b */
    public final C12638a mo23642b() {
        C12638a aVar = new C12638a();
        if (this.f33043t) {
            aVar.f33218b = true;
            aVar.mo23737a((int) R.color.yz);
        }
        if (!C9431p.m18664a(this.f33045v) && VERSION.SDK_INT >= 23) {
            if ("black".equals(this.f33045v)) {
                aVar.mo23738a(true);
            } else if ("white".equals(this.f33045v)) {
                aVar.mo23738a(false);
            }
        }
        if (!this.f33043t) {
            if (C9431p.m18664a(this.f33044u) || VERSION.SDK_INT < 23) {
                aVar.mo23737a((int) R.color.z0);
            } else if ("black".equals(this.f33044u)) {
                aVar.mo23737a((int) R.color.yv);
            } else if ("white".equals(this.f33044u)) {
                aVar.mo23737a((int) R.color.z0);
            }
        }
        Window window = getWindow();
        if (C12563i.m25227i() && window != null) {
            window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x03ea  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23643c() {
        /*
            r52 = this;
            r0 = r52
            r1 = 2132017764(0x7f140264, float:1.9673816E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f33046w = r1
            android.widget.TextView r1 = r0.f33046w
            android.view.View$OnClickListener r2 = r0.f33035H
            r1.setOnClickListener(r2)
            r1 = 2132017766(0x7f140266, float:1.967382E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.f33047x = r1
            r1 = 2132018097(0x7f1403b1, float:1.9674491E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f33037n = r1
            android.widget.ImageView r1 = r0.f33037n
            android.view.View$OnClickListener r2 = r0.f33035H
            r1.setOnClickListener(r2)
            android.content.Intent r1 = r52.getIntent()
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r6 = 0
            r8 = 1
            r10 = 0
            if (r1 == 0) goto L_0x01a9
            java.lang.String r2 = r1.getDataString()
            java.lang.String r3 = "show_toolbar"
            boolean r3 = r1.getBooleanExtra(r3, r10)
            java.lang.String r4 = "use_swipe"
            boolean r4 = r1.getBooleanExtra(r4, r10)
            r0.f33048y = r4
            java.lang.String r4 = "swipe_mode"
            int r4 = r1.getIntExtra(r4, r10)
            r0.f33049z = r4
            java.lang.String r4 = "referer"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r5 = "orientation"
            int r5 = r1.getIntExtra(r5, r8)
            r0.f33028A = r5
            java.lang.String r5 = "screen_name"
            java.lang.String r5 = r1.getStringExtra(r5)
            r0.f33029B = r5
            java.lang.String r5 = "screen_context"
            java.lang.String r5 = r1.getStringExtra(r5)
            r0.f33030C = r5
            java.lang.String r5 = "ad_id"
            long r11 = r1.getLongExtra(r5, r6)
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0085
            r0.f33028A = r10
        L_0x0085:
            java.lang.String r5 = "bundle_app_package_name"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r13 = "bundle_user_webview_title"
            boolean r13 = r1.getBooleanExtra(r13, r10)
            java.lang.String r14 = "bundle_is_from_picture_detail_ad"
            boolean r14 = r1.getBooleanExtra(r14, r10)
            java.lang.String r15 = "bundle_picture_detail_ad_event"
            java.lang.String r15 = r1.getStringExtra(r15)
            java.lang.String r6 = "bundle_is_from_app_ad"
            boolean r6 = r1.getBooleanExtra(r6, r10)
            java.lang.String r7 = "bundle_app_ad_from"
            int r7 = r1.getIntExtra(r7, r10)
            java.lang.String r9 = "bundle_app_ad_event"
            java.lang.String r9 = r1.getStringExtra(r9)
            java.lang.String r8 = "bundle_download_url"
            java.lang.String r8 = r1.getStringExtra(r8)
            java.lang.String r10 = "bundle_download_app_name"
            java.lang.String r10 = r1.getStringExtra(r10)
            r17 = r2
            java.lang.String r2 = "bundle_download_app_extra"
            java.lang.String r2 = r1.getStringExtra(r2)
            r18 = r2
            java.lang.String r2 = "bundle_link_mode"
            r19 = r3
            r3 = 0
            int r2 = r1.getIntExtra(r2, r3)
            java.lang.String r3 = "bundle_deeplink_open_url"
            java.lang.String r3 = r1.getStringExtra(r3)
            r20 = r2
            java.lang.String r2 = "bundle_deeplink_web_url"
            java.lang.String r2 = r1.getStringExtra(r2)
            r21 = r2
            java.lang.String r2 = "bundle_deeplink_web_title"
            java.lang.String r2 = r1.getStringExtra(r2)
            r22 = r2
            java.lang.String r2 = "bundle_support_download"
            r23 = r3
            r3 = 0
            boolean r2 = r1.getBooleanExtra(r2, r3)
            java.lang.String r3 = "bundle_download_app_log_extra"
            java.lang.String r3 = r1.getStringExtra(r3)
            r24 = r2
            java.lang.String r2 = "bundle_no_hw_acceleration"
            r25 = r3
            r3 = 0
            boolean r2 = r1.getBooleanExtra(r2, r3)
            java.lang.String r3 = "gd_label"
            java.lang.String r3 = r1.getStringExtra(r3)
            r26 = r2
            java.lang.String r2 = "gd_ext_json"
            java.lang.String r2 = r1.getStringExtra(r2)
            r27 = r2
            java.lang.String r2 = "webview_track_key"
            java.lang.String r2 = r1.getStringExtra(r2)
            r28 = r2
            java.lang.String r2 = "wap_headers"
            java.lang.String r2 = r1.getStringExtra(r2)
            r29 = r2
            java.lang.String r2 = "hide_more"
            r30 = r3
            r3 = 0
            boolean r2 = r1.getBooleanExtra(r2, r3)
            r0.f33031D = r2
            java.lang.String r2 = "hide_back_button"
            boolean r2 = r1.getBooleanExtra(r2, r3)
            r0.f33032E = r2
            java.lang.String r2 = "back_button_color"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f33033F = r2
            java.lang.String r2 = r0.f33033F
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r2 == 0) goto L_0x0147
            java.lang.String r2 = "black"
            r0.f33033F = r2
        L_0x0147:
            java.lang.String r2 = "back_button_icon"
            java.lang.String r2 = r1.getStringExtra(r2)
            r0.f33038o = r2
            java.lang.String r2 = r0.f33038o
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r2 == 0) goto L_0x015b
            java.lang.String r2 = "back_arrow"
            r0.f33038o = r2
        L_0x015b:
            java.lang.String r2 = "back_button_position"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r3 = "back_button_disable_history"
            r31 = r2
            r2 = 0
            boolean r3 = r1.getBooleanExtra(r3, r2)
            r0.f33039p = r3
            java.lang.String r3 = "key_hide_bar"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            r32 = r3
            java.lang.String r3 = "require_login"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            r0.f33036I = r3
            r37 = r6
            r40 = r7
            r38 = r8
            r41 = r9
            r39 = r10
            r42 = r18
            r43 = r20
            r45 = r21
            r46 = r22
            r44 = r23
            r6 = r24
            r36 = r25
            r33 = r26
            r35 = r27
            r7 = r28
            r47 = r29
            r34 = r30
            r3 = r31
            r8 = r32
            r9 = r4
            r10 = r5
            r4 = r17
            r5 = r19
            goto L_0x01d6
        L_0x01a9:
            r6 = r2
            r2 = 0
            r44 = r3
            r45 = r4
            r46 = r5
            r41 = r6
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r47 = 0
        L_0x01d6:
            int r2 = r0.f33028A
            r48 = r8
            r8 = 4
            switch(r2) {
                case 0: goto L_0x01ec;
                case 1: goto L_0x01e7;
                case 2: goto L_0x01e2;
                default: goto L_0x01de;
            }
        L_0x01de:
            r0.setRequestedOrientation(r8)
            goto L_0x01ef
        L_0x01e2:
            r2 = 0
            r0.setRequestedOrientation(r2)
            goto L_0x01ef
        L_0x01e7:
            r2 = 1
            r0.setRequestedOrientation(r2)
            goto L_0x01ef
        L_0x01ec:
            r0.setRequestedOrientation(r8)
        L_0x01ef:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f33042s = r2
            java.util.ArrayList<com.bytedance.polaris.browser.PolarisBrowserActivity$b> r2 = r0.f33042s
            com.bytedance.polaris.browser.PolarisBrowserActivity$b r8 = com.bytedance.polaris.browser.PolarisBrowserActivity.C12588b.REFRESH
            r2.add(r8)
            java.util.ArrayList<com.bytedance.polaris.browser.PolarisBrowserActivity$b> r2 = r0.f33042s
            com.bytedance.polaris.browser.PolarisBrowserActivity$b r8 = com.bytedance.polaris.browser.PolarisBrowserActivity.C12588b.COPYLINK
            r2.add(r8)
            java.util.ArrayList<com.bytedance.polaris.browser.PolarisBrowserActivity$b> r2 = r0.f33042s
            com.bytedance.polaris.browser.PolarisBrowserActivity$b r8 = com.bytedance.polaris.browser.PolarisBrowserActivity.C12588b.OPEN_WITH_BROWSER
            r2.add(r8)
            java.util.ArrayList<com.bytedance.polaris.browser.PolarisBrowserActivity$b> r2 = r0.f33042s
            com.bytedance.polaris.browser.PolarisBrowserActivity$b r8 = com.bytedance.polaris.browser.PolarisBrowserActivity.C12588b.SHARE
            r2.add(r8)
            super.mo23643c()
            java.lang.String r2 = r0.f33038o
            boolean r8 = com.bytedance.common.utility.C9431p.m18664a(r2)
            r49 = r10
            if (r8 != 0) goto L_0x0268
            java.lang.String r8 = "back_arrow"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0231
            android.widget.TextView r2 = r0.f33046w
            r8 = 2131954832(0x7f130c90, float:1.9546174E38)
            r10 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r8, r10, r10, r10)
            goto L_0x0268
        L_0x0231:
            r10 = 0
            java.lang.String r8 = "close"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x024d
            android.widget.TextView r2 = r0.f33046w
            r8 = 2131954838(0x7f130c96, float:1.9546187E38)
            r2.setCompoundDrawablesWithIntrinsicBounds(r8, r10, r10, r10)
            r8 = 1
            r0.f33039p = r8
            android.widget.ImageView r2 = r0.f33037n
            r8 = 8
            com.bytedance.common.utility.C9432q.m18691b(r2, r8)
            goto L_0x0268
        L_0x024d:
            java.lang.String r8 = "down_arrow"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0268
            android.widget.TextView r2 = r0.f33046w
            r8 = 2131954820(0x7f130c84, float:1.954615E38)
            r2.setCompoundDrawablesWithIntrinsicBounds(r8, r10, r10, r10)
            r2 = 1
            r0.f33039p = r2
            android.widget.ImageView r8 = r0.f33037n
            r10 = 8
            com.bytedance.common.utility.C9432q.m18691b(r8, r10)
            goto L_0x0269
        L_0x0268:
            r2 = 1
        L_0x0269:
            java.lang.String r8 = r0.f33033F
            boolean r10 = com.bytedance.common.utility.C9431p.m18664a(r8)
            if (r10 != 0) goto L_0x02fd
            android.widget.TextView r10 = r0.f33046w
            android.graphics.drawable.Drawable[] r10 = r10.getCompoundDrawables()
            r16 = 0
            r10 = r10[r16]
            if (r10 == 0) goto L_0x02b9
            java.lang.String r2 = "white"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0298
            android.content.res.Resources r2 = r52.getResources()
            r50 = r11
            r11 = 2131821710(0x7f11048e, float:1.927617E38)
            int r2 = r2.getColor(r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            r10.setColorFilter(r2, r11)
            goto L_0x02b2
        L_0x0298:
            r50 = r11
            java.lang.String r2 = "black"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x02b2
            android.content.res.Resources r2 = r52.getResources()
            r11 = 2131821690(0x7f11047a, float:1.927613E38)
            int r2 = r2.getColor(r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            r10.setColorFilter(r2, r11)
        L_0x02b2:
            android.widget.TextView r2 = r0.f33046w
            r11 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r10, r11, r11, r11)
            goto L_0x02bc
        L_0x02b9:
            r50 = r11
            r11 = 0
        L_0x02bc:
            android.widget.ImageView r2 = r0.f33037n
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            if (r2 == 0) goto L_0x02fa
            java.lang.String r10 = "white"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x02dd
            android.content.res.Resources r10 = r52.getResources()
            r12 = 2131821710(0x7f11048e, float:1.927617E38)
            int r10 = r10.getColor(r12)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r10, r12)
            goto L_0x02f5
        L_0x02dd:
            java.lang.String r10 = "black"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x02f5
            android.content.res.Resources r10 = r52.getResources()
            r12 = 2131821690(0x7f11047a, float:1.927613E38)
            int r10 = r10.getColor(r12)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r10, r12)
        L_0x02f5:
            android.widget.ImageView r10 = r0.f33037n
            r10.setImageDrawable(r2)
        L_0x02fa:
            r0.f33033F = r8
            goto L_0x0300
        L_0x02fd:
            r50 = r11
            r11 = 0
        L_0x0300:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r2 != 0) goto L_0x037a
            android.widget.TextView r2 = r0.f33046w
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            java.lang.String r8 = "top_left"
            boolean r8 = r8.equals(r3)
            r12 = 11
            r11 = 10
            r10 = 9
            if (r8 == 0) goto L_0x032c
            r2.addRule(r10)
            r2.addRule(r11)
            r8 = 0
            r2.addRule(r12, r8)
            r3 = 12
            r2.addRule(r3, r8)
            goto L_0x0375
        L_0x032c:
            java.lang.String r8 = "top_right"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0344
            r2.addRule(r12)
            r2.addRule(r11)
            r8 = 0
            r2.addRule(r10, r8)
            r3 = 12
            r2.addRule(r3, r8)
            goto L_0x0375
        L_0x0344:
            r11 = 12
            java.lang.String r8 = "bottom_left"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x035e
            r2.addRule(r10)
            r2.addRule(r11)
            r8 = 0
            r2.addRule(r12, r8)
            r3 = 10
            r2.addRule(r3, r8)
            goto L_0x0375
        L_0x035e:
            java.lang.String r8 = "bottom_right"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0375
            r2.addRule(r12)
            r2.addRule(r11)
            r3 = 0
            r2.addRule(r10, r3)
            r8 = 10
            r2.addRule(r8, r3)
        L_0x0375:
            android.widget.TextView r3 = r0.f33046w
            r3.setLayoutParams(r2)
        L_0x037a:
            boolean r2 = r0.f33043t
            if (r2 == 0) goto L_0x0393
            android.widget.TextView r2 = r0.f33046w
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = com.bytedance.common.utility.C9432q.m18695e(r52)
            r2.topMargin = r3
            android.widget.TextView r2 = r0.f33046w
            r2.requestLayout()
            r48 = 1
        L_0x0393:
            if (r48 == 0) goto L_0x03bb
            android.view.ViewGroup r2 = r0.f33011f
            r3 = 2131954843(0x7f130c9b, float:1.9546197E38)
            r2.setBackgroundResource(r3)
            android.widget.TextView r2 = r0.f33013h
            r3 = 8
            com.bytedance.common.utility.C9432q.m18691b(r2, r3)
            android.widget.TextView r2 = r0.f33014i
            com.bytedance.common.utility.C9432q.m18691b(r2, r3)
            android.view.View r2 = r0.f33047x
            com.bytedance.common.utility.C9432q.m18691b(r2, r3)
            com.bytedance.polaris.widget.SwipeOverlayFrameLayout r2 = r0.f33017l
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r3 = 3
            r8 = 0
            r2.addRule(r3, r8)
        L_0x03bb:
            if (r1 == 0) goto L_0x03c4
            java.lang.String r2 = "title"
            java.lang.String r1 = r1.getStringExtra(r2)
            goto L_0x03c5
        L_0x03c4:
            r1 = 0
        L_0x03c5:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)
            if (r2 == 0) goto L_0x03d2
            r1 = 2132547735(0x7f1c1897, float:2.0748725E38)
            java.lang.String r1 = r0.getString(r1)
        L_0x03d2:
            r0.f33034G = r1
            android.widget.TextView r2 = r0.f33014i
            r2.setText(r1)
            android.widget.TextView r1 = r0.f33013h
            android.view.View$OnClickListener r2 = r0.f33035H
            r1.setOnClickListener(r2)
            boolean r1 = com.bytedance.polaris.p826d.C12650p.m25425c(r4)
            if (r1 != 0) goto L_0x03ea
            r52.finish()
            return
        L_0x03ea:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "bundle_url"
            r1.putString(r2, r4)
            java.lang.String r2 = "show_toolbar"
            r1.putBoolean(r2, r5)
            java.lang.String r2 = "bundle_user_webview_title"
            r1.putBoolean(r2, r13)
            java.lang.String r2 = "bundle_support_download"
            r1.putBoolean(r2, r6)
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r7)
            if (r2 != 0) goto L_0x040e
            java.lang.String r2 = "webview_track_key"
            r1.putString(r2, r7)
        L_0x040e:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r9)
            if (r2 != 0) goto L_0x0419
            java.lang.String r2 = "referer"
            r1.putString(r2, r9)
        L_0x0419:
            if (r14 == 0) goto L_0x042b
            boolean r2 = android.text.TextUtils.isEmpty(r15)
            if (r2 != 0) goto L_0x042b
            java.lang.String r2 = "bundle_is_from_picture_detail_ad"
            r1.putBoolean(r2, r14)
            java.lang.String r2 = "bundle_picture_detail_ad_event"
            r1.putString(r2, r15)
        L_0x042b:
            r2 = 0
            int r4 = (r50 > r2 ? 1 : (r50 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0438
            java.lang.String r2 = "ad_id"
            r11 = r50
            r1.putLong(r2, r11)
        L_0x0438:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r49)
            if (r2 != 0) goto L_0x0445
            java.lang.String r2 = "package_name"
            r5 = r49
            r1.putString(r2, r5)
        L_0x0445:
            r2 = r33
            if (r2 == 0) goto L_0x044e
            java.lang.String r3 = "bundle_no_hw_acceleration"
            r1.putBoolean(r3, r2)
        L_0x044e:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r34)
            if (r2 != 0) goto L_0x045b
            java.lang.String r2 = "gd_label"
            r3 = r34
            r1.putString(r2, r3)
        L_0x045b:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r35)
            if (r2 != 0) goto L_0x0468
            java.lang.String r2 = "gd_ext_json"
            r3 = r35
            r1.putString(r2, r3)
        L_0x0468:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r36)
            if (r2 != 0) goto L_0x0475
            java.lang.String r2 = "bundle_download_app_log_extra"
            r3 = r36
            r1.putString(r2, r3)
        L_0x0475:
            r2 = r37
            if (r2 == 0) goto L_0x04c3
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r38)
            if (r3 != 0) goto L_0x04c3
            java.lang.String r3 = "bundle_download_url"
            r8 = r38
            r1.putString(r3, r8)
            java.lang.String r3 = "bundle_download_app_name"
            r10 = r39
            r1.putString(r3, r10)
            java.lang.String r3 = "bundle_is_from_app_ad"
            r1.putBoolean(r3, r2)
            java.lang.String r2 = "bundle_app_ad_from"
            r7 = r40
            r1.putInt(r2, r7)
            java.lang.String r2 = "bundle_app_ad_event"
            r6 = r41
            r1.putString(r2, r6)
            java.lang.String r2 = "bundle_download_app_extra"
            r3 = r42
            r1.putString(r2, r3)
            java.lang.String r2 = "bundle_link_mode"
            r3 = r43
            r1.putInt(r2, r3)
            java.lang.String r2 = "bundle_deeplink_open_url"
            r3 = r44
            r1.putString(r2, r3)
            java.lang.String r2 = "bundle_deeplink_web_url"
            r4 = r45
            r1.putString(r2, r4)
            java.lang.String r2 = "bundle_deeplink_web_title"
            r5 = r46
            r1.putString(r2, r5)
        L_0x04c3:
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r47)
            if (r2 != 0) goto L_0x04d0
            java.lang.String r2 = "wap_headers"
            r3 = r47
            r1.putString(r2, r3)
        L_0x04d0:
            java.lang.String r2 = "require_login"
            boolean r3 = r0.f33036I
            r1.putBoolean(r2, r3)
            com.bytedance.polaris.browser.b r2 = new com.bytedance.polaris.browser.b
            r2.<init>()
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r0.f33040q = r3
            android.support.v4.app.k r3 = r52.getSupportFragmentManager()
            android.support.v4.app.r r3 = r3.mo2225a()
            android.support.v4.app.Fragment r2 = (android.support.p030v4.app.Fragment) r2
            r2.setArguments(r1)
            android.support.v4.app.k r1 = r52.getSupportFragmentManager()
            java.lang.String r4 = "browser_fragment_tag"
            android.support.v4.app.Fragment r1 = r1.mo2224a(r4)
            r4 = 2132017765(0x7f140265, float:1.9673818E38)
            if (r1 != 0) goto L_0x0505
            java.lang.String r1 = "browser_fragment_tag"
            r3.mo2176a(r4, r2, r1)
            goto L_0x050a
        L_0x0505:
            java.lang.String r1 = "browser_fragment_tag"
            r3.mo2192b(r4, r2, r1)
        L_0x050a:
            r3.mo2189b()
            boolean r1 = r0.f33031D
            if (r1 == 0) goto L_0x0517
            android.widget.TextView r1 = r0.f33013h
            r2 = 4
            r1.setVisibility(r2)
        L_0x0517:
            boolean r1 = r0.f33032E
            if (r1 == 0) goto L_0x0522
            android.widget.TextView r1 = r0.f33046w
            r2 = 8
            r1.setVisibility(r2)
        L_0x0522:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.PolarisBrowserActivity.mo23643c():void");
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        if (!getIntent().getBooleanExtra("hide_status_bar", false) || VERSION.SDK_INT < 23) {
            z = false;
        } else {
            z = true;
        }
        this.f33043t = z;
        this.f33044u = getIntent().getStringExtra("status_bar_background");
        this.f33045v = getIntent().getStringExtra("status_bar_color");
        super.onCreate(bundle);
        Window window = getWindow();
        if (C12563i.m25227i() && window != null) {
            window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
        getWindow().setSoftInputMode(48);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("key_show_feedback_entrance", false)) {
            C12563i.m25221c();
            if (this.f33013h != null) {
                this.f33013h.setText("我的反馈");
                this.f33013h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f33013h.setTextColor(getResources().getColor(R.color.yh));
                C9432q.m18691b((View) this.f33013h, 0);
                this.f33013h.setOnClickListener(new OnClickListener(1) {
                    public final void onClick(View view) {
                        C12563i.m25221c().mo23601a((Context) PolarisBrowserActivity.this, 1);
                    }
                });
            }
        }
        C12637g.m25393a(getWindow(), true);
    }

    /* renamed from: a */
    public static Intent m25255a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, PolarisBrowserActivity.class);
            String queryParameter = uri.getQueryParameter("url");
            if (C9431p.m18664a(queryParameter)) {
                return null;
            }
            boolean a = C12650p.m25423a(uri.getQueryParameter("rotate"));
            boolean a2 = C12650p.m25423a(uri.getQueryParameter("no_hw"));
            boolean a3 = C12650p.m25423a(uri.getQueryParameter("hide_more"));
            boolean a4 = C12650p.m25423a(uri.getQueryParameter("bundle_user_webview_title"));
            String queryParameter2 = uri.getQueryParameter("ad_id");
            if (!C9431p.m18664a(queryParameter2)) {
                try {
                    intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                } catch (Exception unused) {
                }
            }
            intent.setData(Uri.parse(URLDecoder.decode(queryParameter, "UTF-8")));
            intent.putExtra("swipe_mode", C12650p.m25415a(uri, "swipe_mode", 2));
            intent.putExtra("show_toolbar", true);
            if (a) {
                intent.putExtra("orientation", 0);
            }
            if (a4) {
                intent.putExtra("bundle_user_webview_title", a4);
            }
            if (a2) {
                intent.putExtra("bundle_no_hw_acceleration", a2);
            }
            if (a3) {
                intent.putExtra("hide_more", a3);
            }
            intent.putExtra("bundle_support_download", C12650p.m25423a(uri.getQueryParameter("support_download")));
            String queryParameter3 = uri.getQueryParameter("title");
            if (!C9431p.m18664a(queryParameter3)) {
                intent.putExtra("title", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("gd_label");
            if (!C9431p.m18664a(queryParameter4)) {
                intent.putExtra("gd_label", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("gd_ext_json");
            if (!C9431p.m18664a(queryParameter5)) {
                intent.putExtra("gd_ext_json", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("webview_track_key");
            if (!C9431p.m18664a(queryParameter6)) {
                intent.putExtra("webview_track_key", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("wap_headers");
            if (!C9431p.m18664a(queryParameter7)) {
                intent.putExtra("wap_headers", queryParameter7);
            }
            intent.putExtra("require_login", uri.getBooleanQueryParameter("require_login", false));
            m25256a(intent, uri);
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m25256a(Intent intent, Uri uri) {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("back_button_color");
            String queryParameter2 = uri.getQueryParameter("back_button_icon");
            String queryParameter3 = uri.getQueryParameter("back_button_position");
            String queryParameter4 = uri.getQueryParameter("disableHistory");
            String queryParameter5 = uri.getQueryParameter("hide_bar");
            String queryParameter6 = uri.getQueryParameter("hide_back_button");
            String queryParameter7 = uri.getQueryParameter("hide_nav_bar");
            String queryParameter8 = uri.getQueryParameter("title");
            if (!C9431p.m18664a(queryParameter8)) {
                intent.putExtra("title", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("status_bar_color");
            String queryParameter10 = uri.getQueryParameter("status_bar_background");
            String queryParameter11 = uri.getQueryParameter("hide_status_bar");
            if (!C9431p.m18664a(queryParameter)) {
                intent.putExtra("back_button_color", queryParameter);
            }
            if (!C9431p.m18664a(queryParameter2)) {
                intent.putExtra("back_button_icon", queryParameter2);
            }
            if (!C9431p.m18664a(queryParameter3)) {
                intent.putExtra("back_button_position", queryParameter3);
            }
            if (!C9431p.m18664a(queryParameter9)) {
                intent.putExtra("status_bar_color", queryParameter9);
            }
            if (!C9431p.m18664a(queryParameter10)) {
                intent.putExtra("status_bar_background", queryParameter10);
            }
            boolean z4 = true;
            if (!C9431p.m18664a(queryParameter11)) {
                try {
                    i5 = Integer.parseInt(queryParameter11);
                } catch (NumberFormatException unused) {
                    i5 = 0;
                }
                if (i5 > 0) {
                    intent.putExtra("hide_status_bar", true);
                }
            }
            if (!C9431p.m18664a(queryParameter4)) {
                try {
                    i4 = Integer.parseInt(queryParameter4);
                } catch (NumberFormatException unused2) {
                    i4 = 0;
                }
                if (i4 > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                intent.putExtra("back_button_disable_history", z3);
            }
            if (!C9431p.m18664a(queryParameter5)) {
                try {
                    i3 = Integer.parseInt(queryParameter5);
                } catch (NumberFormatException unused3) {
                    i3 = 0;
                }
                if (i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intent.putExtra("key_hide_bar", z2);
            }
            if (!C9431p.m18664a(queryParameter6)) {
                try {
                    i2 = Integer.parseInt(queryParameter6);
                } catch (NumberFormatException unused4) {
                    i2 = 0;
                }
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                intent.putExtra("hide_back_button", z);
            }
            if (!C9431p.m18664a(queryParameter7)) {
                try {
                    i = Integer.parseInt(queryParameter7);
                } catch (NumberFormatException unused5) {
                    i = 0;
                }
                if (i <= 0) {
                    z4 = false;
                }
                intent.putExtra("key_hide_bar", z4);
            }
            if (("down_arrow".equals(queryParameter2) || "close".equals(queryParameter2)) && ("top_left".equals(queryParameter3) || "top_right".equals(queryParameter3) || C9431p.m18664a(queryParameter3))) {
                intent.putExtra("activity_trans_type", 3);
            }
        }
    }
}
