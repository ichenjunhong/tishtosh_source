package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.p */
public final class C23672p extends C23649b {

    /* renamed from: a */
    public String f63110a = "";

    /* renamed from: b */
    public final Activity f63111b;

    /* renamed from: s */
    public final String f63112s;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.p$a */
    public static final class C23673a implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ Aweme f63113a;

        /* renamed from: b */
        final /* synthetic */ IExternalService f63114b;

        /* renamed from: c */
        final /* synthetic */ Activity f63115c;

        /* renamed from: d */
        final /* synthetic */ Builder f63116d;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            if (this.f63113a.getMusic() == null || !this.f63114b.configService().avsettingsConfig().enableStickerDetailsEntrance()) {
                asyncAVService.uiService().recordService().startRecord((Context) this.f63115c, this.f63116d.build());
                return;
            }
            IRecordService recordService = asyncAVService.uiService().recordService();
            Activity activity = this.f63115c;
            RecordConfig build = this.f63116d.build();
            MusicModel convertToMusicModel = this.f63113a.getMusic().convertToMusicModel();
            C52711k.m112236a((Object) convertToMusicModel, "music.convertToMusicModel()");
            recordService.startRecord(activity, build, convertToMusicModel, false);
        }

        C23673a(Aweme aweme, IExternalService iExternalService, Activity activity, Builder builder) {
            this.f63113a = aweme;
            this.f63114b = iExternalService;
            this.f63115c = activity;
            this.f63116d = builder;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r3 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49074a() {
        /*
            r5 = this;
            java.lang.String r0 = "anchor_entrance_show"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r5.f63112s
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f63071q
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r3 = ""
        L_0x001c:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f63071q
            if (r3 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r3.getId()
            if (r3 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r3 = ""
        L_0x0034:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_type"
            java.lang.String r3 = "sound_sync"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r4.<init>()
            java.lang.String r3 = r3.mo60160a(r4)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f63071q
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23672p.mo49074a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        if (r3 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r3 == null) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49077b() {
        /*
            r5 = this;
            java.lang.String r0 = "anchor_entrance_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r5.f63112s
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f63071q
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r3 = ""
        L_0x001c:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f63071q
            if (r3 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r3.getId()
            if (r3 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r3 = ""
        L_0x0034:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_type"
            java.lang.String r3 = "sound_sync"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r4.<init>()
            java.lang.String r3 = r3.mo60160a(r4)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f63071q
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            com.ss.android.ugc.aweme.aq.ao r0 = new com.ss.android.ugc.aweme.aq.ao
            r0.<init>()
            java.lang.String r1 = r5.f63112s
            r0.f61771e = r1
            java.lang.String r1 = "upload_anchor"
            com.ss.android.ugc.aweme.aq.ao r0 = r0.mo47993a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f63071q
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = r1.getAid()
            if (r1 != 0) goto L_0x0085
        L_0x0083:
            java.lang.String r1 = ""
        L_0x0085:
            r0.f61768b = r1
            java.lang.String r1 = r5.f63110a
            com.ss.android.ugc.aweme.aq.ao r0 = r0.mo47996d(r1)
            java.lang.String r1 = "sound_sync"
            com.ss.android.ugc.aweme.aq.ao r0 = r0.mo47994b(r1)
            java.lang.String r1 = "upload"
            com.ss.android.ugc.aweme.aq.ao r0 = r0.mo47995c(r1)
            java.lang.String r1 = "video"
            com.ss.android.ugc.aweme.aq.ao r0 = r0.mo47994b(r1)
            r0.mo48076e()
            java.lang.String r0 = "click_upload_entrance"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "shoot_way"
            java.lang.String r3 = "upload_anchor"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f63071q
            if (r3 == 0) goto L_0x00bc
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x00be
        L_0x00bc:
            java.lang.String r3 = ""
        L_0x00be:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "creation_id"
            java.lang.String r3 = r5.f63110a
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r5.f63112s
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23672p.mo49077b():void");
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        super.mo49075a(view);
        if (!C32800a.m75679a(view)) {
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            this.f63110a = uuid;
            Aweme aweme = this.f63071q;
            if (aweme != null) {
                AnchorInfo anchorInfo = aweme.getAnchorInfo();
                if (anchorInfo != null) {
                    String openUrl = anchorInfo.getOpenUrl();
                    if (openUrl != null) {
                        Uri parse = Uri.parse(openUrl);
                        if (parse != null && C52830p.m112406a("studio", parse.getHost(), true) && C52830p.m112406a("/upload", parse.getPath(), true)) {
                            Builder creationId = new Builder().shootWay("upload_anchor").creationId(this.f63110a);
                            Activity activity = this.f63111b;
                            if (activity != null) {
                                IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
                                aVServiceImpl_Monster.asyncService(new C23673a(aweme, aVServiceImpl_Monster, activity, creationId));
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r2, org.json.JSONObject r3) {
        /*
            r1 = this;
            super.mo49076a(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f63058d
            if (r2 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r0 = r2.getAnchorInfo()
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.getTitle()
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            if (r2 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r2 = r2.getAnchorInfo()
            if (r2 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getIcon()
            if (r2 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r1.f63057c
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r3, r2)
            return
        L_0x002c:
            r2 = r1
            com.ss.android.ugc.aweme.base.ui.anchor.p r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23672p) r2
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r2.f63057c
            r3 = 2131953118(0x7f1305de, float:1.9542698E38)
            r2.setImageResource(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23672p.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23672p(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        this.f63111b = activity;
        this.f63112s = str;
    }
}
