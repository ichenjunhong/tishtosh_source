package com.p683ss.android.ugc.aweme.p1437bj;

import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.aweme.photo.PhotoModule;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39631n;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C45329y;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.tools.live.LiveSettingApi.C47068a;
import com.p683ss.android.ugc.aweme.tools.live.p2360a.C47077a;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bj.d */
public final class C23836d {

    /* renamed from: a */
    final boolean f63498a = true;

    /* renamed from: com.ss.android.ugc.aweme.bj.d$a */
    static final class C23837a<TTaskResult, TContinuationResult> implements C0011g<C47068a, Object> {

        /* renamed from: a */
        final /* synthetic */ C23836d f63499a;

        /* renamed from: b */
        final /* synthetic */ C48923a f63500b;

        C23837a(C23836d dVar, C48923a aVar) {
            this.f63499a = dVar;
            this.f63500b = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            int i;
            C52711k.m112236a((Object) iVar, "task");
            if (iVar.mo26b()) {
                C39618d.f101180u.mo74208a(((C47068a) iVar.mo34e()).f118855a);
                if (this.f63499a.mo49422b(this.f63500b.mo96752c())) {
                    C49577b bVar = (C49577b) C2755a.m7851a(this.f63500b.mo96751b()).mo7341b(C49577b.class);
                    if (bVar != null) {
                        C23836d dVar = this.f63499a;
                        int g = bVar.mo97486g();
                        C48923a aVar = this.f63500b;
                        if (!C23836d.m58487a() || dVar.f63498a || !C23836d.m58488a(aVar.mo96752c())) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        bVar.mo97482a(g - i, new C47077a(), 0);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    static boolean m58487a() {
        return C39618d.f101152P.mo83103a(C40790a.StudioEnableRecorderTutorial);
    }

    public C23836d(boolean z) {
    }

    /* renamed from: a */
    static boolean m58488a(ShortVideoContext shortVideoContext) {
        return PhotoModule.m85988a(shortVideoContext.f107132y);
    }

    /* renamed from: e */
    private static boolean m58495e(ShortVideoContext shortVideoContext) {
        return shortVideoContext.mo86362d();
    }

    /* renamed from: c */
    private static boolean m58491c(ShortVideoContext shortVideoContext) {
        return C52711k.m112239a((Object) "comment_reply", (Object) shortVideoContext.f107132y);
    }

    /* renamed from: g */
    private static int m58499g(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.f107089ao) {
            return R.string.d5b;
        }
        return R.string.d5a;
    }

    /* renamed from: d */
    private static boolean m58493d(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.mo86365f() || shortVideoContext.mo86366g()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static int m58497f(ShortVideoContext shortVideoContext) {
        switch (shortVideoContext.f107101b) {
            case 1:
                return shortVideoContext.f107081ag;
            case 2:
                return C43306a.m94990b().shootMode;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    private final boolean m58490b(C48923a aVar) {
        boolean a = m58487a();
        if (!m58495e(aVar.mo96752c()) && !a && m58488a(aVar.mo96752c()) && !m58491c(aVar.mo96752c())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m58494d(C48923a aVar) {
        if (!m58495e(aVar.mo96752c()) && C47251c.m102589b() && !aVar.mo96752c().mo86365f() && !aVar.mo96752c().mo86366g()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m58496e(C48923a aVar) {
        if (!m58495e(aVar.mo96752c()) && !aVar.mo96752c().mo86365f() && !aVar.mo96752c().mo86366g() && this.f63498a) {
            C39631n nVar = C39618d.f101169j;
            C52711k.m112236a((Object) nVar, "AVEnv.AB_SERVICE");
            if (nVar.mo74143e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m58492c(C48923a aVar) {
        boolean d = m58493d(aVar.mo96752c());
        boolean e = m58495e(aVar.mo96752c());
        if (!e && this.f63498a && !C39629l.m88232a().mo58590u().mo74222c().booleanValue() && !m58491c(aVar.mo96752c()) && !e && !d && C45329y.m98812d()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m58498f(com.p683ss.android.ugc.gamora.p2457a.C48923a r4) {
        /*
            r3 = this;
            java.lang.String r0 = "recordEnv"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.mo96752c()
            boolean r0 = r3.mo49422b(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.mo96752c()
            boolean r0 = r0.f107056aH
            if (r0 != 0) goto L_0x004a
        L_0x0018:
            boolean r0 = r3.m58492c(r4)
            if (r0 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.mo96752c()
            boolean r0 = r0.f107057aI
            if (r0 != 0) goto L_0x004a
        L_0x0026:
            boolean r0 = r3.m58494d(r4)
            r2 = 0
            if (r0 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r4.mo96752c()
            boolean r0 = com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c.m102584a(r0)
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r4.f123095k
            if (r0 == 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 != 0) goto L_0x004a
        L_0x0040:
            boolean r0 = r3.m58496e(r4)
            if (r0 == 0) goto L_0x004b
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.f123096l
            if (r4 == 0) goto L_0x004b
        L_0x004a:
            return r1
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1437bj.C23836d.m58498f(com.ss.android.ugc.gamora.a.a):boolean");
    }

    /* renamed from: b */
    public final boolean mo49422b(ShortVideoContext shortVideoContext) {
        boolean z = false;
        if (m58495e(shortVideoContext)) {
            return false;
        }
        if (this.f63498a) {
            Boolean c = C39629l.m88232a().mo58590u().mo74222c();
            C52711k.m112236a((Object) c, "CameraClient.getAPI().lo…nService.isInTikTokRegion");
            if (c.booleanValue()) {
                if ((C52711k.m112239a((Object) "direct_shoot", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "urge_update", (Object) shortVideoContext.f107132y)) && C39618d.f101180u.mo74209a() && !m58491c(shortVideoContext)) {
                    return true;
                }
                return false;
            } else if (!C39618d.f101182w.mo74175b() || !C39618d.f101180u.mo74212b() || shortVideoContext.mo86365f() || shortVideoContext.mo86366g() || !C52711k.m112239a((Object) "direct_shoot", (Object) shortVideoContext.f107132y) || m58491c(shortVideoContext)) {
                return false;
            } else {
                z = true;
            }
        } else if ((C52711k.m112239a((Object) "direct_shoot", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "urge_update", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "prop_reuse", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "single_song", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "prop_page", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "xs", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "challenge", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "live_challenge", (Object) shortVideoContext.f107132y) || C52711k.m112239a((Object) "super_entrance", (Object) shortVideoContext.f107132y)) && C39618d.f101180u.mo74209a() && !m58491c(shortVideoContext)) {
            return true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a> mo49421a(com.p683ss.android.ugc.gamora.p2457a.C48923a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "recordEnv"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r10.f63498a
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0020
            com.ss.android.ugc.aweme.property.h r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r4 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.ChangeRecordBottomTabOrder
            com.ss.android.ugc.aweme.property.aa$a r4 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r4
            boolean r1 = r1.mo83103a(r4)
            if (r1 == 0) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            boolean r4 = r10.m58496e(r11)
            boolean r5 = m58487a()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r11.mo96752c()
            boolean r6 = m58493d(r6)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r11.mo96752c()
            boolean r7 = m58495e(r7)
            if (r7 != 0) goto L_0x004b
            if (r6 != 0) goto L_0x004b
            if (r5 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.mo96752c()
            boolean r5 = m58491c(r5)
            if (r5 != 0) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            if (r5 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.bj.c r5 = new com.ss.android.ugc.aweme.bj.c
            r5.<init>()
            r0.add(r5)
        L_0x0056:
            if (r1 != 0) goto L_0x007c
            boolean r5 = r10.m58490b(r11)
            if (r5 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.bj.g r5 = new com.ss.android.ugc.aweme.bj.g
            com.ss.android.ugc.aweme.bj.j r6 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.PHOTO_SHORT
            int r6 = r6.getNameResId()
            java.lang.String r6 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r6)
            com.ss.android.ugc.aweme.bj.j r7 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.PHOTO_SHORT
            int r7 = r7.getTagResId()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r7)
            java.lang.String r8 = "photo"
            r5.<init>(r6, r7, r8, r3)
            r0.add(r5)
        L_0x007c:
            if (r1 == 0) goto L_0x008e
            boolean r5 = r10.m58494d(r11)
            if (r5 == 0) goto L_0x008e
            if (r4 != 0) goto L_0x008e
            com.ss.android.ugc.aweme.tools.mvtemplate.b.a r5 = new com.ss.android.ugc.aweme.tools.mvtemplate.b.a
            r5.<init>()
            r0.add(r5)
        L_0x008e:
            boolean r5 = r10.m58492c(r11)
            if (r5 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.status.h r5 = new com.ss.android.ugc.aweme.status.h
            com.ss.android.ugc.aweme.bj.j r6 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_STATUS
            int r6 = r6.getNameResId()
            java.lang.String r6 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r6)
            com.ss.android.ugc.aweme.bj.j r7 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_STATUS
            int r7 = r7.getTagResId()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r7)
            java.lang.String r8 = "status"
            r5.<init>(r6, r7, r8, r3)
            r0.add(r5)
        L_0x00b2:
            if (r4 == 0) goto L_0x00c2
            boolean r5 = r10.m58494d(r11)
            if (r5 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.tools.mvtemplate.b.a r5 = new com.ss.android.ugc.aweme.tools.mvtemplate.b.a
            r5.<init>()
            r0.add(r5)
        L_0x00c2:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.mo96752c()
            boolean r5 = m58493d(r5)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r11.mo96752c()
            boolean r6 = m58495e(r6)
            com.ss.android.ugc.aweme.shortvideo.y r7 = com.p683ss.android.ugc.aweme.shortvideo.C45329y.f114612c
            boolean r7 = r7.mo91609e()
            if (r7 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00df
            if (r6 != 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r5 = 0
            goto L_0x00e2
        L_0x00e1:
            r5 = 1
        L_0x00e2:
            if (r5 == 0) goto L_0x0110
            com.ss.android.ugc.aweme.bj.j r5 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE
            int r5 = r5.getTagResId()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r5)
            boolean r5 = r10.m58489a(r5, r11)
            com.ss.android.ugc.aweme.bj.b r6 = new com.ss.android.ugc.aweme.bj.b
            com.ss.android.ugc.aweme.bj.j r7 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE
            int r7 = r7.getNameResId()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r7)
            com.ss.android.ugc.aweme.bj.j r8 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE
            int r8 = r8.getTagResId()
            java.lang.String r8 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r8)
            java.lang.String r9 = "video"
            r6.<init>(r7, r8, r9, r5)
            r0.add(r6)
        L_0x0110:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.mo96752c()
            boolean r5 = m58493d(r5)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r11.mo96752c()
            boolean r6 = m58495e(r6)
            com.ss.android.ugc.aweme.shortvideo.y r7 = com.p683ss.android.ugc.aweme.shortvideo.C45329y.f114612c
            boolean r7 = r7.mo91609e()
            if (r7 == 0) goto L_0x012a
            if (r5 == 0) goto L_0x012c
        L_0x012a:
            if (r6 == 0) goto L_0x012e
        L_0x012c:
            r5 = 1
            goto L_0x012f
        L_0x012e:
            r5 = 0
        L_0x012f:
            if (r5 == 0) goto L_0x015d
            com.ss.android.ugc.aweme.bj.j r5 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE_60
            int r5 = r5.getTagResId()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r5)
            boolean r5 = r10.m58489a(r5, r11)
            com.ss.android.ugc.aweme.bj.b r6 = new com.ss.android.ugc.aweme.bj.b
            com.ss.android.ugc.aweme.bj.j r7 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE_60
            int r7 = r7.getNameResId()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r7)
            com.ss.android.ugc.aweme.bj.j r8 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE_60
            int r8 = r8.getTagResId()
            java.lang.String r8 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r8)
            java.lang.String r9 = "video_60"
            r6.<init>(r7, r8, r9, r5)
            r0.add(r6)
        L_0x015d:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.mo96752c()
            boolean r5 = m58493d(r5)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r11.mo96752c()
            boolean r6 = m58495e(r6)
            com.ss.android.ugc.aweme.shortvideo.y r7 = com.p683ss.android.ugc.aweme.shortvideo.C45329y.f114612c
            boolean r7 = r7.mo91609e()
            if (r7 == 0) goto L_0x0177
            if (r5 == 0) goto L_0x0179
        L_0x0177:
            if (r6 == 0) goto L_0x017b
        L_0x0179:
            r5 = 1
            goto L_0x017c
        L_0x017b:
            r5 = 0
        L_0x017c:
            if (r5 == 0) goto L_0x01aa
            com.ss.android.ugc.aweme.bj.j r5 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE_15
            int r5 = r5.getTagResId()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r5)
            boolean r5 = r10.m58489a(r5, r11)
            com.ss.android.ugc.aweme.bj.b r6 = new com.ss.android.ugc.aweme.bj.b
            com.ss.android.ugc.aweme.bj.j r7 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE_15
            int r7 = r7.getNameResId()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r7)
            com.ss.android.ugc.aweme.bj.j r8 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_COMBINE_15
            int r8 = r8.getTagResId()
            java.lang.String r8 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r8)
            java.lang.String r9 = "video_15"
            r6.<init>(r7, r8, r9, r5)
            r0.add(r6)
        L_0x01aa:
            if (r1 != 0) goto L_0x01bc
            if (r4 != 0) goto L_0x01bc
            boolean r5 = r10.m58494d(r11)
            if (r5 == 0) goto L_0x01bc
            com.ss.android.ugc.aweme.tools.mvtemplate.b.a r5 = new com.ss.android.ugc.aweme.tools.mvtemplate.b.a
            r5.<init>()
            r0.add(r5)
        L_0x01bc:
            if (r4 == 0) goto L_0x01dc
            com.ss.android.ugc.aweme.greenscreen.c r4 = new com.ss.android.ugc.aweme.greenscreen.c
            com.ss.android.ugc.aweme.bj.j r5 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_GREEN_SCREEN
            int r5 = r5.getNameResId()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r5)
            com.ss.android.ugc.aweme.bj.j r6 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.RECORD_GREEN_SCREEN
            int r6 = r6.getTagResId()
            java.lang.String r6 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r6)
            java.lang.String r7 = "green_screen"
            r4.<init>(r5, r6, r7)
            r0.add(r4)
        L_0x01dc:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r11.mo96752c()
            boolean r4 = r10.mo49422b(r4)
            if (r4 == 0) goto L_0x01ef
            com.ss.android.ugc.aweme.tools.live.a.a r4 = new com.ss.android.ugc.aweme.tools.live.a.a
            r4.<init>()
            r0.add(r4)
            goto L_0x0206
        L_0x01ef:
            com.ss.android.ugc.aweme.tools.live.LiveSettingApi$API r4 = com.p683ss.android.ugc.aweme.tools.live.LiveSettingApi.f118854a
            java.lang.String r5 = "LiveSettingApi.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            a.i r4 = r4.getLivePodCast()
            com.ss.android.ugc.aweme.bj.d$a r5 = new com.ss.android.ugc.aweme.bj.d$a
            r5.<init>(r10, r11)
            a.g r5 = (p001a.C0011g) r5
            java.util.concurrent.Executor r6 = p001a.C0013i.f25b
            r4.mo20a(r5, r6)
        L_0x0206:
            if (r1 == 0) goto L_0x022c
            boolean r1 = r10.m58490b(r11)
            if (r1 == 0) goto L_0x022c
            com.ss.android.ugc.aweme.bj.g r1 = new com.ss.android.ugc.aweme.bj.g
            com.ss.android.ugc.aweme.bj.j r4 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.PHOTO_SHORT
            int r4 = r4.getNameResId()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r4)
            com.ss.android.ugc.aweme.bj.j r5 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.PHOTO_SHORT
            int r5 = r5.getTagResId()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r5)
            java.lang.String r6 = "photo"
            r1.<init>(r4, r5, r6, r3)
            r0.add(r1)
        L_0x022c:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r11.mo96752c()
            boolean r1 = m58495e(r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r11.mo96752c()
            java.lang.String r5 = "direct_shoot"
            java.lang.String r6 = r4.f107132y
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 != 0) goto L_0x0261
            java.lang.String r5 = "xs"
            java.lang.String r6 = r4.f107132y
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 != 0) goto L_0x0261
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.mo96752c()
            boolean r5 = r5.f107058aJ
            if (r5 != 0) goto L_0x0261
            java.lang.String r5 = "super_entrance"
            java.lang.String r6 = r4.f107132y
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 == 0) goto L_0x025f
            goto L_0x0261
        L_0x025f:
            r5 = 0
            goto L_0x0262
        L_0x0261:
            r5 = 1
        L_0x0262:
            if (r1 != 0) goto L_0x028b
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r11.mo96752c()
            boolean r1 = r1.f107056aH
            if (r1 != 0) goto L_0x028b
            com.ss.android.ugc.aweme.services.IInternalAVService r1 = com.p683ss.android.ugc.aweme.out.AVServiceImpl.createIInternalAVServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IInternalAVService r1 = (com.p683ss.android.ugc.aweme.services.IInternalAVService) r1
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r1 = r1.avSettingsService()
            java.lang.String r6 = "ServiceManager.get().get…java).avSettingsService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            boolean r1 = r1.isXsSupport()
            if (r1 == 0) goto L_0x028b
            if (r5 == 0) goto L_0x028b
            boolean r1 = m58491c(r4)
            if (r1 != 0) goto L_0x028b
            r1 = 1
            goto L_0x028c
        L_0x028b:
            r1 = 0
        L_0x028c:
            if (r1 == 0) goto L_0x0296
            com.ss.android.ugc.aweme.xs.b r1 = new com.ss.android.ugc.aweme.xs.b
            r1.<init>()
            r0.add(r1)
        L_0x0296:
            boolean r1 = m58487a()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r11.mo96752c()
            boolean r4 = m58495e(r4)
            if (r4 != 0) goto L_0x02bf
            if (r1 == 0) goto L_0x02bf
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r11.mo96752c()
            boolean r1 = m58491c(r1)
            if (r1 != 0) goto L_0x02bf
            boolean r1 = r10.f63498a
            if (r1 != 0) goto L_0x02bf
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = r11.mo96752c()
            boolean r11 = m58488a(r11)
            if (r11 == 0) goto L_0x02bf
            goto L_0x02c0
        L_0x02bf:
            r2 = 0
        L_0x02c0:
            if (r2 == 0) goto L_0x02e0
            com.ss.android.ugc.aweme.bj.g r11 = new com.ss.android.ugc.aweme.bj.g
            com.ss.android.ugc.aweme.bj.j r1 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.PHOTO_SHORT
            int r1 = r1.getNameResId()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r1)
            com.ss.android.ugc.aweme.bj.j r2 = com.p683ss.android.ugc.aweme.p1437bj.C23854j.PHOTO_SHORT
            int r2 = r2.getTagResId()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.utils.C47911gc.m103636a(r2)
            java.lang.String r4 = "photo"
            r11.<init>(r1, r2, r4, r3)
            r0.add(r11)
        L_0x02e0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1437bj.C23836d.mo49421a(com.ss.android.ugc.gamora.a.a):java.util.List");
    }

    /* renamed from: a */
    private final boolean m58489a(String str, C48923a aVar) {
        if (m58498f(aVar)) {
            return false;
        }
        return C52711k.m112239a((Object) str, (Object) m58486a(aVar.mo96752c(), m58497f(aVar.mo96752c())));
    }

    /* renamed from: a */
    private final String m58486a(ShortVideoContext shortVideoContext, int i) {
        String str;
        int i2;
        if (C45329y.m98811c()) {
            if (C45329y.f114612c.mo91609e()) {
                switch (i) {
                    case 10:
                        i2 = R.string.d5a;
                        break;
                    case 11:
                        i2 = R.string.d5b;
                        break;
                    default:
                        i2 = m58499g(shortVideoContext);
                        break;
                }
                str = C39618d.f101160a.getString(i2);
            } else {
                str = C39618d.f101160a.getString(R.string.d5c);
            }
            C52711k.m112236a((Object) str, "if (CombineRecordModeHel…ombine_tag)\n            }");
            return str;
        }
        int i3 = R.string.d59;
        switch (i) {
            case 1:
                i3 = R.string.d5l;
                break;
        }
        String string = C39618d.f101160a.getString(i3);
        C52711k.m112236a((Object) string, "AVEnv.application.getString(tagRes)");
        return string;
    }
}
