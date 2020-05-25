package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.aweme.storage.C2565h;
import com.aweme.storage.C2566i;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.keva.KevaPerfExperiment.C35803a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45469z;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask */
public final class StorageTask implements LegoTask {
    public static final C35966a Companion = new C35966a(null);
    public static volatile boolean inited;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask$a */
    public static final class C35966a {

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$a */
        public static final class C35967a implements C2565h {
            C35967a() {
            }

            /* renamed from: a */
            public final void mo7072a(String str, JSONObject jSONObject) {
                C9951d.m19997a(str, jSONObject);
            }

            /* renamed from: a */
            public final void mo7073a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                C9951d.m19999a(str, null, jSONObject2, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$b */
        public static final class C35968b implements C2566i {

            /* renamed from: a */
            final /* synthetic */ Context f92194a;

            /* renamed from: a */
            public final Set<String> mo7074a() {
                Set<String> b = C45469z.m99088b();
                C52711k.m112236a((Object) b, "FileCacheCleaner.getNoneDeleteWhiteList()");
                return b;
            }

            /* renamed from: b */
            public final boolean mo7076b() {
                if (C11016e.m22312g() == null) {
                    return true;
                }
                return false;
            }

            C35968b(Context context) {
                this.f92194a = context;
            }

            /* renamed from: a */
            public final void mo7075a(boolean z) {
                if (this.f92194a != null) {
                    C45469z.m99079a(this.f92194a.getApplicationContext(), z);
                }
            }
        }

        private C35966a() {
        }

        /* renamed from: a */
        public static boolean m81147a() {
            return StorageTask.inited;
        }

        /* renamed from: a */
        private static void m81146a(boolean z) {
            StorageTask.inited = true;
        }

        public /* synthetic */ C35966a(C52707g gVar) {
            this();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(30:3|(2:5|(1:7))|8|(2:10|(1:12))|13|(2:15|(1:17))|18|19|20|(2:22|(1:24))|25|(2:27|(1:29))|30|(2:32|(1:34))|35|36|(1:40)|41|(1:45)|46|47|(1:49)|50|52|53|56|(1:58)|59|(1:61)|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x061f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0684 */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0696 A[Catch:{ Exception -> 0x06ad }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x06dd  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x06e7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo74649a(android.content.Context r17, int r18) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "context"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
                boolean r1 = m81147a()
                if (r1 == 0) goto L_0x000e
                return
            L_0x000e:
                r1 = 1
                m81146a(r1)
                java.lang.String r2 = "StorageTask"
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r2)
                com.aweme.storage.j r2 = new com.aweme.storage.j
                r2.<init>()
                r3 = 11
                java.lang.String[] r4 = new java.lang.String[r3]
                java.lang.String r5 = "lib"
                r6 = 0
                r4[r6] = r5
                java.lang.String r5 = "CrashLogNative"
                r4[r1] = r5
                java.lang.String r5 = "code_cache"
                r7 = 2
                r4[r7] = r5
                java.lang.String r5 = "aweme-lib-main"
                r8 = 3
                r4[r8] = r5
                java.lang.String r5 = "ALOG"
                r9 = 4
                r4[r9] = r5
                java.lang.String r5 = ".um"
                r10 = 5
                r4[r10] = r5
                java.lang.String r5 = ".umeng"
                r11 = 6
                r4[r11] = r5
                java.lang.String r5 = ".Fabric"
                r12 = 7
                r4[r12] = r5
                java.lang.String r5 = "__macosx"
                r13 = 8
                r4[r13] = r5
                java.lang.String r5 = "lib-main"
                r14 = 9
                r4[r14] = r5
                java.lang.String r5 = "draft"
                r15 = 10
                r4[r15] = r5
                java.util.ArrayList r4 = p2628d.p2629a.C52575l.m112103d(r4)
                java.util.List r4 = (java.util.List) r4
                r2.f7959c = r4
                java.lang.String[] r4 = new java.lang.String[r11]
                java.lang.String r5 = "cache/cache/"
                r4[r6] = r5
                java.lang.String r5 = "lib/"
                r4[r1] = r5
                java.lang.String r5 = "shared_prefs/"
                r4[r7] = r5
                java.lang.String r5 = "code_cache/"
                r4[r8] = r5
                java.lang.String r5 = "aweme-lib-main/"
                r4[r9] = r5
                java.lang.String r5 = "databases/"
                r4[r10] = r5
                java.util.ArrayList r4 = p2628d.p2629a.C52575l.m112103d(r4)
                java.util.List r4 = (java.util.List) r4
                r2.f7962f = r4
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.io.File r5 = r17.getCacheDir()
                if (r5 == 0) goto L_0x0123
                java.io.File r5 = r17.getCacheDir()
                java.lang.String r3 = "context.cacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r3)
                java.lang.String r3 = r5.getParent()
                if (r3 == 0) goto L_0x0123
                com.aweme.storage.o r3 = new com.aweme.storage.o
                java.lang.String r5 = "private"
                java.io.File r15 = r17.getCacheDir()
                java.lang.String r13 = "context.cacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r15, r13)
                java.lang.String r13 = r15.getParent()
                com.aweme.storage.o$a[] r15 = new com.aweme.storage.C2576o.C2577a[r14]
                com.aweme.storage.o$a r14 = new com.aweme.storage.o$a
                java.lang.String r12 = "databases"
                java.lang.String r11 = "p_databases"
                r14.<init>(r12, r11)
                r15[r6] = r14
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "no_backup"
                java.lang.String r14 = "p_no_backup"
                r11.<init>(r12, r14)
                r15[r1] = r11
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "app_webview"
                java.lang.String r14 = "p_app_webview"
                r11.<init>(r12, r14)
                r15[r7] = r11
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "app_textures"
                java.lang.String r14 = "p_app_textures"
                r11.<init>(r12, r14)
                r15[r8] = r11
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "shared_prefs"
                java.lang.String r14 = "p_shared_prefs"
                r11.<init>(r12, r14)
                r15[r9] = r11
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "app_indicators"
                java.lang.String r14 = "p_app_indicators"
                r11.<init>(r12, r14)
                r15[r10] = r11
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "app_accs"
                java.lang.String r14 = "p_app_accs"
                r11.<init>(r12, r14)
                r12 = 6
                r15[r12] = r11
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "app_assets"
                java.lang.String r14 = "p_app_assets"
                r11.<init>(r12, r14)
                r12 = 7
                r15[r12] = r11
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r12 = "lib"
                java.lang.String r14 = "p_lib"
                r11.<init>(r12, r14)
                r12 = 8
                r15[r12] = r11
                java.util.ArrayList r11 = p2628d.p2629a.C52575l.m112103d(r15)
                java.util.List r11 = (java.util.List) r11
                r3.<init>(r5, r13, r11)
                r4.add(r3)
            L_0x0123:
                java.io.File r3 = r17.getCacheDir()
                if (r3 == 0) goto L_0x019a
                java.io.File r3 = r17.getCacheDir()
                java.lang.String r5 = "context.cacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                java.lang.String r3 = r3.getAbsolutePath()
                if (r3 == 0) goto L_0x019a
                com.aweme.storage.o r3 = new com.aweme.storage.o
                java.lang.String r5 = "p_cache"
                java.io.File r11 = r17.getCacheDir()
                java.lang.String r12 = "context.cacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
                java.lang.String r11 = r11.getAbsolutePath()
                r12 = 6
                com.aweme.storage.o$a[] r13 = new com.aweme.storage.C2576o.C2577a[r12]
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a
                java.lang.String r14 = "cache"
                java.lang.String r15 = "p_c_cache"
                r12.<init>(r14, r15)
                r13[r6] = r12
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a
                java.lang.String r14 = "WebView"
                java.lang.String r15 = "p_c_WebView"
                r12.<init>(r14, r15)
                r13[r1] = r12
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a
                java.lang.String r14 = "hashedimages"
                java.lang.String r15 = "p_c_hashedimages"
                r12.<init>(r14, r15)
                r13[r7] = r12
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a
                java.lang.String r14 = "patch_dir"
                java.lang.String r15 = "p_c_patch_dir"
                r12.<init>(r14, r15)
                r13[r8] = r12
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a
                java.lang.String r14 = "org.chromium.android_webview"
                java.lang.String r15 = "p_c_webview"
                r12.<init>(r14, r15)
                r13[r9] = r12
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a
                java.lang.String r14 = "feedCache"
                java.lang.String r15 = "p_c_feedCache"
                r12.<init>(r14, r15)
                r13[r10] = r12
                java.util.ArrayList r12 = p2628d.p2629a.C52575l.m112103d(r13)
                java.util.List r12 = (java.util.List) r12
                r3.<init>(r5, r11, r12)
                r4.add(r3)
            L_0x019a:
                java.io.File r3 = r17.getFilesDir()
                if (r3 == 0) goto L_0x03ca
                java.io.File r3 = r17.getFilesDir()
                java.lang.String r12 = "context.filesDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r12)
                java.lang.String r3 = r3.getAbsolutePath()
                if (r3 == 0) goto L_0x03ca
                com.aweme.storage.o r3 = new com.aweme.storage.o
                java.lang.String r12 = "p_file"
                java.io.File r13 = r17.getFilesDir()
                java.lang.String r14 = "context.filesDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
                java.lang.String r13 = r13.getAbsolutePath()
                r14 = 40
                com.aweme.storage.o$a[] r14 = new com.aweme.storage.C2576o.C2577a[r14]
                com.aweme.storage.o$a r15 = new com.aweme.storage.o$a
                java.lang.String r5 = "cache"
                java.lang.String r11 = "p_f_cache"
                r15.<init>(r5, r11)
                r14[r6] = r15
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "draft"
                java.lang.String r15 = "p_f_draft"
                r5.<init>(r11, r15)
                r14[r1] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "effect"
                java.lang.String r15 = "p_f_effect"
                r5.<init>(r11, r15)
                r14[r7] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "extract_shot"
                java.lang.String r15 = "p_f_extract_shot"
                r5.<init>(r11, r15)
                r14[r8] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "filter"
                java.lang.String r15 = "p_f_filter"
                r5.<init>(r11, r15)
                r14[r9] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "filters"
                java.lang.String r15 = "p_f_filters"
                r5.<init>(r11, r15)
                r14[r10] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "im_resources"
                java.lang.String r15 = "p_f_im_resources"
                r5.<init>(r11, r15)
                r11 = 6
                r14[r11] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "music"
                java.lang.String r15 = "p_f_music"
                r5.<init>(r11, r15)
                r11 = 7
                r14[r11] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "noCopyDraft"
                java.lang.String r15 = "p_f_nocopydraft"
                r5.<init>(r11, r15)
                r11 = 8
                r14[r11] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "offline"
                java.lang.String r15 = "p_f_offline"
                r5.<init>(r11, r15)
                r11 = 9
                r14[r11] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "share"
                java.lang.String r15 = "p_f_share"
                r5.<init>(r11, r15)
                r11 = 10
                r14[r11] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "sticker"
                java.lang.String r15 = "p_f_sticker"
                r5.<init>(r11, r15)
                r11 = 11
                r14[r11] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "tmp"
                java.lang.String r15 = "p_f_tmp"
                r5.<init>(r11, r15)
                r11 = 12
                r14[r11] = r5
                com.aweme.storage.o$a r5 = new com.aweme.storage.o$a
                java.lang.String r11 = "tmp_video"
                java.lang.String r15 = "p_f_tmp_video"
                r5.<init>(r11, r15)
                r11 = 13
                r14[r11] = r5
                r5 = 14
                com.aweme.storage.o$a r11 = new com.aweme.storage.o$a
                java.lang.String r15 = "beauty-face"
                java.lang.String r10 = "p_f_beauty-face"
                r11.<init>(r15, r10)
                r14[r5] = r11
                r5 = 15
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "tt_file_st"
                java.lang.String r15 = "p_f_tt_file_st"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 16
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "netlog"
                java.lang.String r15 = "p_f_netlog"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 17
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "photo"
                java.lang.String r15 = "p_f_photo"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 18
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "font"
                java.lang.String r15 = "p_f_font"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 19
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "benchmark"
                java.lang.String r15 = "p_f_benchmark"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 20
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "AFRequestCache"
                java.lang.String r15 = "p_f_AFRequestCache"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 21
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "keva"
                java.lang.String r15 = "p_f_keva"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 22
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "plugins"
                java.lang.String r15 = "p_f_plugins"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 23
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = ".patchs"
                java.lang.String r15 = "p_f_patchs"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 24
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "apks"
                java.lang.String r15 = "p_f_apks"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 25
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = ".envelope"
                java.lang.String r15 = "p_f_envelope"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 26
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "awcn_strategy"
                java.lang.String r15 = "p_f_awcn_strategy"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 27
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "stateless"
                java.lang.String r15 = "p_f_stateless"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 28
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "appbrand"
                java.lang.String r15 = "p_f_appbrand"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 29
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "a"
                java.lang.String r15 = "p_f_a"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 30
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "libso"
                java.lang.String r15 = "p_f_libso"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 31
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "pngex"
                java.lang.String r15 = "p_f_pngex"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 32
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "loc_cozip"
                java.lang.String r15 = "p_f_loc_cozip"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 33
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "tdReadTemp"
                java.lang.String r15 = "p_f_tdReadTemp"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 34
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "parallel_upload"
                java.lang.String r15 = "p_f_parallel_upload"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 35
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "effectmodel"
                java.lang.String r15 = "p_f_effectmodel"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 36
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "splitcompat"
                java.lang.String r15 = "p_f_splitcompat"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 37
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "speed_ml"
                java.lang.String r15 = "p_c_speed_ml"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 38
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "logs"
                java.lang.String r15 = "p_f_logs"
                r10.<init>(r11, r15)
                r14[r5] = r10
                r5 = 39
                com.aweme.storage.o$a r10 = new com.aweme.storage.o$a
                java.lang.String r11 = "festival"
                java.lang.String r15 = "p_f_festival"
                r10.<init>(r11, r15)
                r14[r5] = r10
                java.util.ArrayList r5 = p2628d.p2629a.C52575l.m112103d(r14)
                java.util.List r5 = (java.util.List) r5
                r3.<init>(r12, r13, r5)
                r4.add(r3)
            L_0x03ca:
                r3 = 0
                java.io.File r5 = r17.getExternalCacheDir()     // Catch:{ Exception -> 0x061f }
                if (r5 == 0) goto L_0x0420
                java.io.File r5 = r17.getExternalCacheDir()     // Catch:{ Exception -> 0x061f }
                java.lang.String r10 = "context.externalCacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r10)     // Catch:{ Exception -> 0x061f }
                java.lang.String r5 = r5.getParent()     // Catch:{ Exception -> 0x061f }
                if (r5 == 0) goto L_0x0420
                com.aweme.storage.o r5 = new com.aweme.storage.o     // Catch:{ Exception -> 0x061f }
                java.lang.String r10 = "external"
                java.io.File r11 = r17.getExternalCacheDir()     // Catch:{ Exception -> 0x061f }
                java.lang.String r12 = "context.externalCacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)     // Catch:{ Exception -> 0x061f }
                java.lang.String r11 = r11.getParent()     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a[] r12 = new com.aweme.storage.C2576o.C2577a[r8]     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "bytedance"
                java.lang.String r15 = "e_bytedance"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r6] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "splashCache"
                java.lang.String r15 = "e_splashCache"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r1] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "awemeSplashCache"
                java.lang.String r15 = "e_awemeSplashCache"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r7] = r13     // Catch:{ Exception -> 0x061f }
                java.util.ArrayList r12 = p2628d.p2629a.C52575l.m112103d(r12)     // Catch:{ Exception -> 0x061f }
                java.util.List r12 = (java.util.List) r12     // Catch:{ Exception -> 0x061f }
                r5.<init>(r10, r11, r12)     // Catch:{ Exception -> 0x061f }
                r4.add(r5)     // Catch:{ Exception -> 0x061f }
            L_0x0420:
                java.io.File r5 = r0.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x061f }
                if (r5 == 0) goto L_0x054d
                java.io.File r5 = r0.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x061f }
                java.lang.String r10 = "context.getExternalFilesDir(null)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r10)     // Catch:{ Exception -> 0x061f }
                java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x061f }
                if (r5 == 0) goto L_0x054d
                com.aweme.storage.o r5 = new com.aweme.storage.o     // Catch:{ Exception -> 0x061f }
                java.lang.String r10 = "e_file"
                java.io.File r11 = r0.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x061f }
                java.lang.String r12 = "context.getExternalFilesDir(null)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)     // Catch:{ Exception -> 0x061f }
                java.lang.String r11 = r11.getAbsolutePath()     // Catch:{ Exception -> 0x061f }
                r12 = 20
                com.aweme.storage.o$a[] r12 = new com.aweme.storage.C2576o.C2577a[r12]     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "cache"
                java.lang.String r15 = "e_f_cache"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r6] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "draft"
                java.lang.String r15 = "e_f_draft"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r1] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "effect"
                java.lang.String r15 = "e_f_effect"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r7] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "extract_shot"
                java.lang.String r15 = "e_f_extract_shot"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r8] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "filter"
                java.lang.String r15 = "e_f_filter"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r9] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "filters"
                java.lang.String r15 = "e_f_filters"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 5
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "im_resources"
                java.lang.String r15 = "e_f_im_resources"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 6
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "music"
                java.lang.String r15 = "e_f_music"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 7
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "noCopyDraft"
                java.lang.String r15 = "e_f_nocopydraft"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 8
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "offline"
                java.lang.String r15 = "e_f_offline"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 9
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "share"
                java.lang.String r15 = "e_f_share"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 10
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "sticker"
                java.lang.String r15 = "e_f_sticker"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 11
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "tmp"
                java.lang.String r15 = "e_f_tmp"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 12
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "tmp_video"
                java.lang.String r15 = "e_f_tmp_video"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r14 = 13
                r12[r14] = r13     // Catch:{ Exception -> 0x061f }
                r13 = 14
                com.aweme.storage.o$a r14 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r15 = "vesdk"
                java.lang.String r3 = "e_f_vesdk"
                r14.<init>(r15, r3)     // Catch:{ Exception -> 0x061f }
                r12[r13] = r14     // Catch:{ Exception -> 0x061f }
                r3 = 15
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "doctorx"
                java.lang.String r15 = "e_f_doctorx"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r3] = r13     // Catch:{ Exception -> 0x061f }
                r3 = 16
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "logs"
                java.lang.String r15 = "e_f_logs"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r3] = r13     // Catch:{ Exception -> 0x061f }
                r3 = 17
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = ".patchs"
                java.lang.String r15 = "e_f_patchs"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r3] = r13     // Catch:{ Exception -> 0x061f }
                r3 = 18
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = ".download"
                java.lang.String r15 = "e_f_download"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r3] = r13     // Catch:{ Exception -> 0x061f }
                r3 = 19
                com.aweme.storage.o$a r13 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r14 = "MiPushLog"
                java.lang.String r15 = "e_f_MiPushLog"
                r13.<init>(r14, r15)     // Catch:{ Exception -> 0x061f }
                r12[r3] = r13     // Catch:{ Exception -> 0x061f }
                java.util.ArrayList r3 = p2628d.p2629a.C52575l.m112103d(r12)     // Catch:{ Exception -> 0x061f }
                java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x061f }
                r5.<init>(r10, r11, r3)     // Catch:{ Exception -> 0x061f }
                r4.add(r5)     // Catch:{ Exception -> 0x061f }
            L_0x054d:
                java.io.File r3 = r17.getExternalCacheDir()     // Catch:{ Exception -> 0x061f }
                if (r3 == 0) goto L_0x061f
                java.io.File r3 = r17.getExternalCacheDir()     // Catch:{ Exception -> 0x061f }
                java.lang.String r5 = "context.externalCacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ Exception -> 0x061f }
                java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x061f }
                if (r3 == 0) goto L_0x061f
                com.aweme.storage.o r3 = new com.aweme.storage.o     // Catch:{ Exception -> 0x061f }
                java.lang.String r5 = "e_cache"
                java.io.File r10 = r17.getExternalCacheDir()     // Catch:{ Exception -> 0x061f }
                java.lang.String r11 = "context.externalCacheDir"
                p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)     // Catch:{ Exception -> 0x061f }
                java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x061f }
                r11 = 13
                com.aweme.storage.o$a[] r11 = new com.aweme.storage.C2576o.C2577a[r11]     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r13 = "cache"
                java.lang.String r14 = "e_c_cache"
                r12.<init>(r13, r14)     // Catch:{ Exception -> 0x061f }
                r11[r6] = r12     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r13 = "picture"
                java.lang.String r14 = "e_c_picture"
                r12.<init>(r13, r14)     // Catch:{ Exception -> 0x061f }
                r11[r1] = r12     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r13 = "prefs"
                java.lang.String r14 = "e_c_prefs"
                r12.<init>(r13, r14)     // Catch:{ Exception -> 0x061f }
                r11[r7] = r12     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r12 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r13 = "netlog"
                java.lang.String r14 = "e_c_netlog"
                r12.<init>(r13, r14)     // Catch:{ Exception -> 0x061f }
                r11[r8] = r12     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r12 = "video"
                java.lang.String r13 = "e_c_video"
                r8.<init>(r12, r13)     // Catch:{ Exception -> 0x061f }
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "hashedimages"
                java.lang.String r12 = "e_c_hashedimages"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 5
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "tmpimages"
                java.lang.String r12 = "e_c_tmpimages"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 6
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "fonts"
                java.lang.String r12 = "e_c_fonts"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 7
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "awemeCache"
                java.lang.String r12 = "e_c_awemeCache"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 8
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "head"
                java.lang.String r12 = "e_c_head"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 9
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "profileHeader"
                java.lang.String r12 = "e_c_profileHeader"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 10
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "profileCover"
                java.lang.String r12 = "e_c_profileCover"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 11
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                com.aweme.storage.o$a r8 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x061f }
                java.lang.String r9 = "profileVideoCover"
                java.lang.String r12 = "e_c_profileVideoCover"
                r8.<init>(r9, r12)     // Catch:{ Exception -> 0x061f }
                r9 = 12
                r11[r9] = r8     // Catch:{ Exception -> 0x061f }
                java.util.ArrayList r8 = p2628d.p2629a.C52575l.m112103d(r11)     // Catch:{ Exception -> 0x061f }
                java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x061f }
                r3.<init>(r5, r10, r8)     // Catch:{ Exception -> 0x061f }
                r4.add(r3)     // Catch:{ Exception -> 0x061f }
            L_0x061f:
                java.io.File r3 = com.bytedance.p829r.C12662c.m25449a(r17)     // Catch:{ Exception -> 0x0684 }
                if (r3 == 0) goto L_0x0657
                java.lang.String r5 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0684 }
                if (r5 == 0) goto L_0x0657
                com.aweme.storage.o r5 = new com.aweme.storage.o     // Catch:{ Exception -> 0x0684 }
                java.lang.String r8 = "sd_file"
                java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0684 }
                com.aweme.storage.o$a[] r7 = new com.aweme.storage.C2576o.C2577a[r7]     // Catch:{ Exception -> 0x0684 }
                com.aweme.storage.o$a r9 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x0684 }
                java.lang.String r10 = "logs"
                java.lang.String r11 = "sd_f_logs"
                r9.<init>(r10, r11)     // Catch:{ Exception -> 0x0684 }
                r7[r6] = r9     // Catch:{ Exception -> 0x0684 }
                com.aweme.storage.o$a r9 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x0684 }
                java.lang.String r10 = "share"
                java.lang.String r11 = "sd_f_share"
                r9.<init>(r10, r11)     // Catch:{ Exception -> 0x0684 }
                r7[r1] = r9     // Catch:{ Exception -> 0x0684 }
                java.util.ArrayList r7 = p2628d.p2629a.C52575l.m112103d(r7)     // Catch:{ Exception -> 0x0684 }
                java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x0684 }
                r5.<init>(r8, r3, r7)     // Catch:{ Exception -> 0x0684 }
                r4.add(r5)     // Catch:{ Exception -> 0x0684 }
            L_0x0657:
                java.io.File r3 = com.bytedance.p829r.C12662c.m25457b(r17)     // Catch:{ Exception -> 0x0684 }
                if (r3 == 0) goto L_0x0684
                java.lang.String r5 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0684 }
                if (r5 == 0) goto L_0x0684
                com.aweme.storage.o r5 = new com.aweme.storage.o     // Catch:{ Exception -> 0x0684 }
                java.lang.String r7 = "sd_cache"
                java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0684 }
                com.aweme.storage.o$a[] r8 = new com.aweme.storage.C2576o.C2577a[r1]     // Catch:{ Exception -> 0x0684 }
                com.aweme.storage.o$a r9 = new com.aweme.storage.o$a     // Catch:{ Exception -> 0x0684 }
                java.lang.String r10 = "picture"
                java.lang.String r11 = "sd_c_picture"
                r9.<init>(r10, r11)     // Catch:{ Exception -> 0x0684 }
                r8[r6] = r9     // Catch:{ Exception -> 0x0684 }
                java.util.ArrayList r8 = p2628d.p2629a.C52575l.m112103d(r8)     // Catch:{ Exception -> 0x0684 }
                java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x0684 }
                r5.<init>(r7, r3, r8)     // Catch:{ Exception -> 0x0684 }
                r4.add(r5)     // Catch:{ Exception -> 0x0684 }
            L_0x0684:
                com.p683ss.android.monitor.C19524a.m47804a()     // Catch:{ Exception -> 0x06ad }
                java.io.File r3 = com.p683ss.android.monitor.C19524a.m47804a()     // Catch:{ Exception -> 0x06ad }
                java.lang.String r5 = "MobMonitor.instance().monitorDir()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)     // Catch:{ Exception -> 0x06ad }
                java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x06ad }
                if (r3 == 0) goto L_0x06ad
                com.aweme.storage.o r3 = new com.aweme.storage.o     // Catch:{ Exception -> 0x06ad }
                java.lang.String r5 = "aweme_monitor"
                java.io.File r7 = com.p683ss.android.monitor.C19524a.m47804a()     // Catch:{ Exception -> 0x06ad }
                java.lang.String r8 = "MobMonitor.instance().monitorDir()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ Exception -> 0x06ad }
                java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x06ad }
                r3.<init>(r5, r7)     // Catch:{ Exception -> 0x06ad }
                r4.add(r3)     // Catch:{ Exception -> 0x06ad }
            L_0x06ad:
                java.util.List r4 = (java.util.List) r4
                r2.f7960d = r4
                com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$a r3 = new com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$a
                r3.<init>()
                com.aweme.storage.h r3 = (com.aweme.storage.C2565h) r3
                r2.f7958b = r3
                com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$b r3 = new com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$b
                r3.<init>(r0)
                com.aweme.storage.i r3 = (com.aweme.storage.C2566i) r3
                r2.f7957a = r3
                com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ Throwable -> 0x06d7 }
                java.lang.Class<com.ss.android.ugc.aweme.experiment.CacheStrategyExperiment> r8 = com.p683ss.android.ugc.aweme.experiment.CacheStrategyExperiment.class
                r9 = 1
                java.lang.String r10 = "storage_clean"
                r11 = 31744(0x7c00, float:4.4483E-41)
                java.lang.Class<com.aweme.storage.a> r12 = com.aweme.storage.C2548a.class
                java.lang.Object r3 = r7.mo18170a(r8, r9, r10, r11, r12)     // Catch:{ Throwable -> 0x06d7 }
                com.aweme.storage.a r3 = (com.aweme.storage.C2548a) r3     // Catch:{ Throwable -> 0x06d7 }
                goto L_0x06d8
            L_0x06d7:
                r3 = 0
            L_0x06d8:
                r2.f7961e = r3
                if (r18 <= 0) goto L_0x06dd
                goto L_0x06de
            L_0x06dd:
                r1 = 0
            L_0x06de:
                r2.f7963g = r1
                com.aweme.storage.C2553c.m7466a(r0, r2)
                boolean r1 = r2.f7963g
                if (r1 == 0) goto L_0x06ea
                com.aweme.storage.C2553c.m7465a(r17)
            L_0x06ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.StorageTask.C35966a.mo74649a(android.content.Context, int):void");
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        if (!inited) {
            Companion.mo74649a(context, 0);
            C52711k.m112240b(context, "context");
            C24076h.m58905f().schedule(new C35803a(context), 5, TimeUnit.SECONDS);
        }
    }
}
