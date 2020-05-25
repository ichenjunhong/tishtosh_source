package com.p683ss.android.socialbase.downloader.p1220i;

import android.app.AlarmManager;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.socialbase.downloader.depend.C19854m;
import com.p683ss.android.socialbase.downloader.depend.C19863r;
import com.p683ss.android.socialbase.downloader.depend.C19864s;
import com.p683ss.android.socialbase.downloader.depend.C19865t;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19889e;
import com.p683ss.android.socialbase.downloader.downloader.C19891f;
import com.p683ss.android.socialbase.downloader.downloader.C19896h;
import com.p683ss.android.socialbase.downloader.downloader.C19897i;
import com.p683ss.android.socialbase.downloader.downloader.C19901k;
import com.p683ss.android.socialbase.downloader.downloader.C19908r;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.exception.C19913a;
import com.p683ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.p683ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.p683ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.p683ss.android.socialbase.downloader.impls.C19950a;
import com.p683ss.android.socialbase.downloader.impls.C19982q;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk.C20041a;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1212b.C19781b;
import com.p683ss.android.socialbase.downloader.p1212b.C19790k;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1215e.C19911a;
import com.p683ss.android.socialbase.downloader.p1216f.C19924c;
import com.p683ss.android.socialbase.downloader.p1216f.C19926e;
import com.p683ss.android.socialbase.downloader.p1216f.p1217a.C19916a;
import com.p683ss.android.socialbase.downloader.p1216f.p1217a.C19922d;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.socialbase.downloader.p1221j.C19992c;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

/* renamed from: com.ss.android.socialbase.downloader.i.c */
public class C19941c implements C19946e, Runnable {

    /* renamed from: g */
    private static final String f54811g = "c";

    /* renamed from: A */
    private C19863r f54812A;

    /* renamed from: B */
    private C19854m f54813B;

    /* renamed from: C */
    private volatile int f54814C = 5;

    /* renamed from: D */
    private boolean f54815D = false;

    /* renamed from: E */
    private boolean f54816E = false;

    /* renamed from: F */
    private String f54817F;

    /* renamed from: G */
    private long f54818G;

    /* renamed from: a */
    public Future f54819a;

    /* renamed from: b */
    public final DownloadTask f54820b;

    /* renamed from: c */
    volatile C19889e f54821c;

    /* renamed from: d */
    volatile C19790k f54822d = C19790k.RUN_STATUS_NONE;

    /* renamed from: e */
    DownloadInfo f54823e;

    /* renamed from: f */
    public final C19891f f54824f;

    /* renamed from: h */
    private volatile boolean f54825h;

    /* renamed from: i */
    private AtomicInteger f54826i;

    /* renamed from: j */
    private final ArrayList<C19940b> f54827j = new ArrayList<>();

    /* renamed from: k */
    private boolean f54828k;

    /* renamed from: l */
    private boolean f54829l;

    /* renamed from: m */
    private boolean f54830m;

    /* renamed from: n */
    private boolean f54831n;

    /* renamed from: o */
    private boolean f54832o;

    /* renamed from: p */
    private final AtomicBoolean f54833p;

    /* renamed from: q */
    private final C19901k f54834q;

    /* renamed from: r */
    private C19897i f54835r;

    /* renamed from: s */
    private final C19897i f54836s;

    /* renamed from: t */
    private C19896h f54837t;

    /* renamed from: u */
    private final C19896h f54838u;

    /* renamed from: v */
    private C19908r f54839v;

    /* renamed from: w */
    private AlarmManager f54840w;

    /* renamed from: x */
    private volatile BaseException f54841x;

    /* renamed from: y */
    private C19926e f54842y;

    /* renamed from: z */
    private C19924c f54843z;

    /* renamed from: com.ss.android.socialbase.downloader.i.c$a */
    class C19944a extends Throwable {

        /* renamed from: b */
        private String f54848b;

        /* renamed from: a */
        public final String mo41685a() {
            return this.f54848b;
        }

        public C19944a(String str) {
            super(str);
            this.f54848b = str;
        }
    }

    /* renamed from: a */
    public final void mo41670a() {
        this.f54822d = C19790k.RUN_STATUS_PAUSE;
        if (this.f54821c != null) {
            this.f54821c.mo41492a();
        } else {
            mo41678c();
            this.f54822d = C19790k.RUN_STATUS_PAUSE;
            mo41676b();
        }
        try {
            Iterator it = ((ArrayList) this.f54827j.clone()).iterator();
            while (it.hasNext()) {
                C19940b bVar = (C19940b) it.next();
                if (bVar != null) {
                    bVar.mo41664a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v55 */
    /* JADX WARNING: type inference failed for: r3v56 */
    /* JADX WARNING: type inference failed for: r3v57 */
    /* JADX WARNING: type inference failed for: r3v58 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(7:7|(1:9)|10|(2:12|(1:14)(9:15|(2:17|(1:19)(2:20|21))|22|(3:24|25|26)(1:28)|29|30|31|(2:35|37)|(2:39|40)))|36|37|(0))|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05cb, code lost:
        if (r4 <= 0) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x06eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x06ec, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x06ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x06f0, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x06f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x06fa, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:?, code lost:
        r3 = f54811g;
        r4 = new java.lang.StringBuilder("downloadInner: throwable =  ");
        r4.append(r2);
        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r3, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0712, code lost:
        if (r1.f54822d != com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0714, code lost:
        mo41677b(new com.p683ss.android.socialbase.downloader.exception.BaseException(1045, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x071f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0720, code lost:
        r2 = r0;
        r3 = f54811g;
        r4 = new java.lang.StringBuilder("downloadInner: retry throwable for ");
        r4.append(r2.mo41685a());
        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r3, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x073c, code lost:
        if (r1.f54822d != com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0741, code lost:
        if (r1.f54826i == null) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x074b, code lost:
        r1.f54823e.updateCurRetryTime(r1.f54826i.decrementAndGet());
        r1.f54823e.setStatus(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:?, code lost:
        mo41678c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x075e, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0765, code lost:
        if (r1.f54826i != null) goto L_0x0767;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x076d, code lost:
        if (r1.f54823e.trySwitchToNextBackupUrl() != false) goto L_0x076f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x076f, code lost:
        r1.f54823e.setStatus(5);
        r1.f54826i.set(r1.f54823e.getRetryCount());
        r1.f54823e.updateCurRetryTime(r1.f54826i.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x078b, code lost:
        mo41677b(new com.p683ss.android.socialbase.downloader.exception.BaseException(1018, com.C2240a.m6772a("retry for Throwable, but retry Time %s all used, last error is %s", new java.lang.Object[]{java.lang.String.valueOf(r1.f54823e.getRetryCount()), r2.mo41685a()})));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x07b4, code lost:
        r5 = new java.lang.StringBuilder("retry for Throwable, but retain retry time is NULL, last error is");
        r5.append(r2.mo41685a());
        mo41677b(new com.p683ss.android.socialbase.downloader.exception.BaseException(1043, r5.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x07d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x07d3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x07d6, code lost:
        r3 = f54811g;
        r4 = new java.lang.StringBuilder("downloadInner: baseException = ");
        r4.append(r2);
        com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r3, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x07ed, code lost:
        if (r1.f54822d != com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE) goto L_0x07ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x07f5, code lost:
        if (r2.getErrorCode() == 1025) goto L_0x082c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x07fd, code lost:
        if (r2.getErrorCode() == 1009) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0804, code lost:
        if (mo41675a(r2) != false) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x080a, code lost:
        if (com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49352a(r2) != false) goto L_0x080c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x080c, code lost:
        m48965r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0817, code lost:
        if (mo41667a(r2, 0) == com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:?, code lost:
        mo41678c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x081c, code lost:
        mo41676b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x081f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:?, code lost:
        mo41678c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0823, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:?, code lost:
        mo41677b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x082c, code lost:
        r1.f54822d = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_END_RIGHT_NOW;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        mo41678c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0833, code lost:
        mo41676b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0836, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x014e, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x014e, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x014e, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:188:0x0314 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:295:0x054a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x014e */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v2
      assigns: []
      uses: []
      mth insns count: 829
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0217 A[Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0219 A[Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0220 A[Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x023c A[SYNTHETIC, Splitter:B:143:0x023c] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0243 A[SYNTHETIC, Splitter:B:147:0x0243] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02ce A[Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0305 A[Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x030e A[SYNTHETIC, Splitter:B:186:0x030e] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0324 A[SYNTHETIC, Splitter:B:192:0x0324] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x032b A[SYNTHETIC, Splitter:B:196:0x032b] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0577 A[Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x05d4 A[Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x05f9 A[SYNTHETIC, Splitter:B:335:0x05f9] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x06eb A[ExcHandler: BaseException (r0v6 'e' com.ss.android.socialbase.downloader.exception.BaseException A[CUSTOM_DECLARE]), PHI: r26 
      PHI: (r26v5 com.ss.android.socialbase.downloader.model.b) = (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v7 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b) binds: [B:383:0x06bd, B:344:0x0608, B:372:0x0692, B:353:0x0620, B:295:0x054a, B:165:0x02b9, B:196:0x032b, B:186:0x030e, B:188:0x0314, B:187:?, B:177:0x02ef, B:181:0x02f8, B:178:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:188:0x0314] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087 A[SYNTHETIC, Splitter:B:39:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06f9 A[ExcHandler: Throwable (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:94:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x071f A[Catch:{ all -> 0x06f5, all -> 0x083f }, ExcHandler: a (r0v2 'e' com.ss.android.socialbase.downloader.i.c$a A[CUSTOM_DECLARE, Catch:{ all -> 0x06f5, all -> 0x083f }]), PHI: r26 
      PHI: (r26v3 com.ss.android.socialbase.downloader.model.b) = (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v6 com.ss.android.socialbase.downloader.model.b), (r26v7 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b), (r26v1 com.ss.android.socialbase.downloader.model.b) binds: [B:383:0x06bd, B:344:0x0608, B:372:0x0692, B:353:0x0620, B:295:0x054a, B:94:0x015a, B:95:?, B:96:0x015c, B:147:0x0243, B:165:0x02b9, B:196:0x032b, B:186:0x030e, B:188:0x0314, B:187:?, B:177:0x02ef, B:181:0x02f8, B:178:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:94:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x07ef A[Catch:{ all -> 0x06f5, all -> 0x083f }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48956i() {
        /*
            r30 = this;
            r1 = r30
            com.ss.android.socialbase.downloader.b.k r2 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_NONE     // Catch:{ all -> 0x083f }
            r1.f54822d = r2     // Catch:{ all -> 0x083f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x083f }
            r2.updateStartDownloadTime()     // Catch:{ all -> 0x083f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x083f }
            r2.resetRealStartDownloadTime()     // Catch:{ all -> 0x083f }
            r2 = 0
            r3 = 1
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            int r4 = r4.getId()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            com.ss.android.socialbase.downloader.downloader.k r5 = r1.f54834q     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r5 == 0) goto L_0x008e
            r5 = 2048(0x800, float:2.87E-42)
            boolean r5 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r5)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r5 == 0) goto L_0x0029
            com.ss.android.socialbase.downloader.downloader.k r5 = r1.f54834q     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            r5.mo41259d()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
        L_0x0029:
            com.ss.android.socialbase.downloader.downloader.k r5 = r1.f54834q     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r5.mo41245b(r4)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r5 == 0) goto L_0x007f
            boolean r6 = r5.isNewTask()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r6 == 0) goto L_0x0038
            goto L_0x007f
        L_0x0038:
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            java.lang.String r6 = r6.getSavePath()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            java.lang.String r7 = r7.getMd5()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            r8.copyFromCacheData(r5, r3)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            java.lang.String r8 = r5.getSavePath()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            boolean r6 = r6.equals(r8)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r6 == 0) goto L_0x0064
            boolean r6 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49353a(r5, r2, r7)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r6 != 0) goto L_0x005a
            goto L_0x0064
        L_0x005a:
            com.ss.android.socialbase.downloader.exception.DownloadFileExistException r4 = new com.ss.android.socialbase.downloader.exception.DownloadFileExistException     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            java.lang.String r5 = r5.getName()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            r4.<init>(r5)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            throw r4     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
        L_0x0064:
            int r6 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48596a(r5)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r6 == r4) goto L_0x0071
            com.ss.android.socialbase.downloader.downloader.k r6 = r1.f54834q     // Catch:{ SQLiteException -> 0x006f }
            r6.mo41262f(r4)     // Catch:{ SQLiteException -> 0x006f }
        L_0x006f:
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r6 = 4096(0x1000, float:5.74E-42)
            boolean r6 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r6)     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r6 == 0) goto L_0x0085
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            if (r5 == r6) goto L_0x0085
            goto L_0x0084
        L_0x007f:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            r4.reset()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
        L_0x0084:
            r4 = 1
        L_0x0085:
            if (r4 == 0) goto L_0x008e
            com.ss.android.socialbase.downloader.downloader.k r4 = r1.f54834q     // Catch:{ SQLiteException -> 0x008e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f54823e     // Catch:{ SQLiteException -> 0x008e }
            r4.mo41244a(r5)     // Catch:{ SQLiteException -> 0x008e }
        L_0x008e:
            r30.m48955h()     // Catch:{ DownloadFileExistException -> 0x00bc, Throwable -> 0x0092 }
            goto L_0x00ba
        L_0x0092:
            r0 = move-exception
            r4 = r0
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r1.f54820b     // Catch:{ DownloadFileExistException -> 0x00bf }
            if (r5 == 0) goto L_0x00ba
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bf }
            if (r5 == 0) goto L_0x00ba
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r1.f54820b     // Catch:{ DownloadFileExistException -> 0x00bf }
            com.ss.android.socialbase.downloader.depend.t r5 = r5.getMonitorDepend()     // Catch:{ DownloadFileExistException -> 0x00bf }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bf }
            com.ss.android.socialbase.downloader.exception.BaseException r7 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ DownloadFileExistException -> 0x00bf }
            r8 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r9 = "checkTaskCache"
            java.lang.String r4 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49362b(r4, r9)     // Catch:{ DownloadFileExistException -> 0x00bf }
            r7.<init>(r8, r4)     // Catch:{ DownloadFileExistException -> 0x00bf }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ DownloadFileExistException -> 0x00bf }
            int r4 = r4.getStatus()     // Catch:{ DownloadFileExistException -> 0x00bf }
            com.p683ss.android.socialbase.downloader.p1215e.C19911a.m48889a(r5, r6, r7, r4)     // Catch:{ DownloadFileExistException -> 0x00bf }
        L_0x00ba:
            r4 = 0
            goto L_0x00d6
        L_0x00bc:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch:{ DownloadFileExistException -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x083f }
            java.lang.String r6 = "file exist "
            r5.<init>(r6)     // Catch:{ all -> 0x083f }
            java.lang.String r6 = r4.getExistTargetFileName()     // Catch:{ all -> 0x083f }
            r5.append(r6)     // Catch:{ all -> 0x083f }
            java.lang.String r4 = r4.getExistTargetFileName()     // Catch:{ all -> 0x083f }
            r1.f54817F = r4     // Catch:{ all -> 0x083f }
            r4 = 1
        L_0x00d6:
            boolean r5 = r1.f54815D     // Catch:{ all -> 0x083f }
            r6 = 2
            if (r5 != 0) goto L_0x0106
            com.ss.android.socialbase.downloader.downloader.f r5 = r1.f54824f     // Catch:{ all -> 0x083f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r5.f54670c     // Catch:{ all -> 0x083f }
            boolean r7 = r7.canSkipStatusHandler()     // Catch:{ all -> 0x083f }
            if (r7 == 0) goto L_0x00eb
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r5.f54670c     // Catch:{ all -> 0x083f }
            r5.changeSkipStatus()     // Catch:{ all -> 0x083f }
            goto L_0x0106
        L_0x00eb:
            com.ss.android.socialbase.downloader.downloader.k r7 = r5.f54671d     // Catch:{ all -> 0x083f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r5.f54670c     // Catch:{ all -> 0x083f }
            int r8 = r8.getId()     // Catch:{ all -> 0x083f }
            r7.mo41263g(r8)     // Catch:{ all -> 0x083f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r5.f54670c     // Catch:{ all -> 0x083f }
            boolean r7 = r7.isFirstDownload()     // Catch:{ all -> 0x083f }
            r8 = 0
            if (r7 == 0) goto L_0x0103
            r7 = 6
            r5.mo41497a(r7, r8)     // Catch:{ all -> 0x083f }
        L_0x0103:
            r5.mo41497a(r6, r8)     // Catch:{ all -> 0x083f }
        L_0x0106:
            r1.f54815D = r2     // Catch:{ all -> 0x083f }
            boolean r5 = r30.mo41680d()     // Catch:{ all -> 0x083f }
            if (r5 == 0) goto L_0x0112
            r30.mo41676b()
            return
        L_0x0112:
            java.lang.String r5 = r1.f54817F     // Catch:{ all -> 0x083f }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x083f }
            if (r5 != 0) goto L_0x0137
            if (r4 == 0) goto L_0x0137
            java.lang.String r2 = r1.f54817F     // Catch:{ all -> 0x083f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54823e     // Catch:{ all -> 0x083f }
            java.lang.String r3 = r3.getTargetFilePath()     // Catch:{ all -> 0x083f }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x083f }
            if (r2 == 0) goto L_0x012f
            com.ss.android.socialbase.downloader.b.k r2 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_END_RIGHT_NOW     // Catch:{ all -> 0x083f }
            r1.f54822d = r2     // Catch:{ all -> 0x083f }
            goto L_0x0133
        L_0x012f:
            com.ss.android.socialbase.downloader.b.k r2 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_END_FOR_FILE_EXIST     // Catch:{ all -> 0x083f }
            r1.f54822d = r2     // Catch:{ all -> 0x083f }
        L_0x0133:
            r30.mo41676b()
            return
        L_0x0137:
            com.ss.android.socialbase.downloader.f.a r4 = com.p683ss.android.socialbase.downloader.p1216f.C19914a.m48890a()     // Catch:{ all -> 0x083f }
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f54719a     // Catch:{ Throwable -> 0x014e }
            int r5 = r5.getAndIncrement()     // Catch:{ Throwable -> 0x014e }
            if (r5 != 0) goto L_0x014e
            com.ss.android.socialbase.downloader.f.a$a r5 = r4.f54720b     // Catch:{ Throwable -> 0x014e }
            r5.sendEmptyMessage(r3)     // Catch:{ Throwable -> 0x014e }
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x014e }
            r4.f54721c = r7     // Catch:{ Throwable -> 0x014e }
        L_0x014e:
            boolean r4 = r30.mo41680d()     // Catch:{ all -> 0x083f }
            if (r4 == 0) goto L_0x0158
            r30.mo41676b()
            return
        L_0x0158:
            r4 = 0
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x07d2, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r7 = r7.getSavePath()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 != 0) goto L_0x06e1
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r7 = r7.getName()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 != 0) goto L_0x06d7
            java.io.File r7 = new java.io.File     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = r8.getSavePath()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r7.<init>(r8)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r8 = r7.exists()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r8 != 0) goto L_0x0194
            boolean r7 = r7.mkdirs()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x018a
            goto L_0x019a
        L_0x018a:
            com.ss.android.socialbase.downloader.exception.BaseException r7 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r8 = 1030(0x406, float:1.443E-42)
            java.lang.String r9 = "download savePath directory can not created"
            r7.<init>(r8, r9)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            throw r7     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x0194:
            boolean r7 = r7.isDirectory()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x06cd
        L_0x019a:
            r30.m48964q()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r7 = r7.isOnlyWifi()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x01c6
            android.content.Context r7 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r7 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49351a(r7, r8)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x01b2
            goto L_0x01c6
        L_0x01b2:
            com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException r7 = new com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r8 = 1019(0x3fb, float:1.428E-42)
            java.lang.String r9 = "download task need permission:%s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r11 = "android.permission.ACCESS_NETWORK_STATE"
            r10[r2] = r11     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r9 = com.C2240a.m6772a(r9, r10)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r7.<init>(r8, r9)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            throw r7     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x01c6:
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r7 = r7.isDownloadWithWifiValid()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x06c7
            com.ss.android.socialbase.downloader.downloader.k r7 = r1.f54834q     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r8 = r8.getId()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.util.List r7 = r7.mo41253c(r8)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r8 != 0) goto L_0x01e0
        L_0x01de:
            r8 = r4
            goto L_0x020e
        L_0x01e0:
            com.ss.android.socialbase.downloader.downloader.k r9 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48616m()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r10 = r8.getId()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.util.List r9 = r9.mo41253c(r10)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r10 = r8.getChunkCount()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r10 <= r3) goto L_0x01f4
            r11 = 1
            goto L_0x01f5
        L_0x01f4:
            r11 = 0
        L_0x01f5:
            boolean r12 = r8.isBreakpointAvailable()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r12 == 0) goto L_0x01de
            if (r11 == 0) goto L_0x020a
            if (r9 == 0) goto L_0x01de
            int r8 = r9.size()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r10 != r8) goto L_0x01de
            long r8 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49360b(r9)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x020e
        L_0x020a:
            long r8 = r8.getCurBytes()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x020e:
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r10.setCurBytes(r8)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0219
            r8 = 1
            goto L_0x021a
        L_0x0219:
            r8 = 0
        L_0x021a:
            r1.f54829l = r8     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r8 = r1.f54829l     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r8 != 0) goto L_0x0230
            com.ss.android.socialbase.downloader.downloader.k r8 = r1.f54834q     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r9 = r9.getId()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r8.mo41258d(r9)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49343a(r8)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x0230:
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = r8.getConnectionUrl()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r9 = r30.mo41680d()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r9 == 0) goto L_0x0243
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r30.mo41676b()
            return
        L_0x0243:
            boolean r9 = r1.f54829l     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r9 == 0) goto L_0x0276
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r9 != 0) goto L_0x024e
            r9 = -1
            goto L_0x0277
        L_0x024e:
            com.ss.android.socialbase.downloader.downloader.k r10 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48616m()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r11 = r9.getId()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.util.List r10 = r10.mo41253c(r11)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r11 = r9.getChunkCount()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r11 != r3) goto L_0x0265
            long r9 = r9.getCurBytes()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x0277
        L_0x0265:
            if (r10 == 0) goto L_0x0276
            int r9 = r10.size()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            if (r9 <= r3) goto L_0x0276
            long r9 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49374c(r10)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x0276
            goto L_0x0277
        L_0x0276:
            r9 = r4
        L_0x0277:
            com.ss.android.socialbase.downloader.model.DownloadChunk$a r11 = new com.ss.android.socialbase.downloader.model.DownloadChunk$a     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            int r12 = r12.getId()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r11.<init>(r12)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r12 = -1
            com.ss.android.socialbase.downloader.model.DownloadChunk$a r11 = r11.mo41805a(r12)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadChunk$a r11 = r11.mo41806a(r4)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadChunk$a r11 = r11.mo41811e(r9)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadChunk$a r11 = r11.mo41808b(r9)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadChunk$a r11 = r11.mo41809c(r4)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            long r13 = r13.getTotalBytes()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r15 = 0
            long r13 = r13 - r9
            com.ss.android.socialbase.downloader.model.DownloadChunk$a r11 = r11.mo41810d(r13)     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadChunk r11 = r11.mo41807a()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.util.List r14 = r13.getExtraHeaders()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f54823e     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r15 = r13.geteTag()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            long r16 = r11.mo41799h()     // Catch:{ BaseException -> 0x06ef, a -> 0x071f, Throwable -> 0x06f9 }
            r20 = r7
            long r6 = r11.f55026c     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r18 = r6
            java.util.List r6 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49340a(r14, r15, r16, r18)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r7.setPreconnectLevel(r2)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r7 = r7.getChunkCount()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 != r3) goto L_0x02df
            com.ss.android.socialbase.downloader.f.a.a r7 = com.p683ss.android.socialbase.downloader.p1216f.p1217a.C19916a.m48893a()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.f.a.c r7 = r7.mo41644a(r8, r6)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x02df
            r1.f54843z = r7     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r7.setPreconnectLevel(r3)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x02df:
            com.ss.android.socialbase.downloader.f.c r7 = r1.f54843z     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 != 0) goto L_0x0301
            boolean r7 = r1.f54816E     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 != 0) goto L_0x0301
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r7 = r7.isHeadConnectionAvailable()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x0301
            com.ss.android.socialbase.downloader.f.c r7 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48598a(r8, r6)     // Catch:{ Throwable -> 0x02f6, BaseException -> 0x06eb, a -> 0x071f }
            r1.f54843z = r7     // Catch:{ Throwable -> 0x02f6, BaseException -> 0x06eb, a -> 0x071f }
            goto L_0x0301
        L_0x02f6:
            r0 = move-exception
            r7 = r0
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r7 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49384e(r7)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r13.setHeadConnectionException(r7)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x0301:
            com.ss.android.socialbase.downloader.f.c r7 = r1.f54843z     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 != 0) goto L_0x030e
            r1.m48951a(r8, r6)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.f.e r7 = r1.f54842y     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r1.m48949a(r7, r9)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x031e
        L_0x030e:
            com.ss.android.socialbase.downloader.f.c r7 = r1.f54843z     // Catch:{ Throwable -> 0x0314, BaseException -> 0x06eb, a -> 0x071f }
            r1.m48949a(r7, r9)     // Catch:{ Throwable -> 0x0314, BaseException -> 0x06eb, a -> 0x071f }
            goto L_0x031e
        L_0x0314:
            r1.f54816E = r3     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r1.m48951a(r8, r6)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.f.e r7 = r1.f54842y     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r1.m48949a(r7, r9)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x031e:
            boolean r7 = r30.mo41680d()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x032b
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r30.mo41676b()
            return
        L_0x032b:
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            long r9 = r7.getTotalBytes()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r7 = r7.getTempPath()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r13 = r13.getTempName()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r14 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49367b(r9)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r14 != 0) goto L_0x054b
            com.ss.android.socialbase.downloader.model.b r12 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49334a(r7, r13, r12)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x0544 }
            r14.<init>(r7, r13)     // Catch:{ all -> 0x0544 }
            long r13 = r14.length()     // Catch:{ all -> 0x0544 }
            r15 = 0
            long r4 = r9 - r13
            r21 = r4
            long r3 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49359b(r7)     // Catch:{ all -> 0x0544 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f54823e     // Catch:{ all -> 0x0544 }
            int r5 = r5.getId()     // Catch:{ all -> 0x0544 }
            com.ss.android.socialbase.downloader.h.a r5 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48929a(r5)     // Catch:{ all -> 0x0544 }
            java.lang.String r7 = "space_fill_part_download"
            int r7 = r5.mo41658a(r7, r2)     // Catch:{ all -> 0x0544 }
            r15 = 1
            if (r7 != r15) goto L_0x048e
            r23 = r3
            r2 = 0
            r1.f54818G = r2     // Catch:{ all -> 0x0489 }
            int r4 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0385
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x0489 }
            long r2 = r2.getTotalBytes()     // Catch:{ all -> 0x0489 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ all -> 0x0489 }
            long r15 = r4.getCurBytes()     // Catch:{ all -> 0x0489 }
            r4 = 0
            long r2 = r2 - r15
            goto L_0x0387
        L_0x0385:
            r2 = r21
        L_0x0387:
            int r4 = (r23 > r2 ? 1 : (r23 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0480
            java.lang.String r4 = f54811g     // Catch:{ all -> 0x0489 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0489 }
            java.lang.String r15 = "checkSpaceOverflow: contentLength = "
            r7.<init>(r15)     // Catch:{ all -> 0x0489 }
            r25 = r11
            r26 = r12
            double r11 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49330a(r9)     // Catch:{ all -> 0x04c1 }
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            java.lang.String r11 = "MB, downloaded = "
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            double r11 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49330a(r13)     // Catch:{ all -> 0x04c1 }
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            java.lang.String r11 = "MB, required = "
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            double r11 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49330a(r2)     // Catch:{ all -> 0x04c1 }
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            java.lang.String r11 = "MB, available = "
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            double r11 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49330a(r23)     // Catch:{ all -> 0x04c1 }
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            java.lang.String r11 = "MB"
            r7.append(r11)     // Catch:{ all -> 0x04c1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x04c1 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r4, r7)     // Catch:{ all -> 0x04c1 }
            r11 = 0
            int r4 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0442
            java.lang.String r4 = "space_fill_min_keep_mb"
            r7 = 100
            int r4 = r5.mo41658a(r4, r7)     // Catch:{ all -> 0x04c1 }
            if (r4 <= 0) goto L_0x0428
            long r11 = (long) r4     // Catch:{ all -> 0x04c1 }
            r15 = 1048576(0x100000, double:5.180654E-318)
            long r11 = r11 * r15
            long r11 = r23 - r11
            java.lang.String r5 = f54811g     // Catch:{ all -> 0x04c1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x04c1 }
            java.lang.String r15 = "checkSpaceOverflow: minKeep = "
            r7.<init>(r15)     // Catch:{ all -> 0x04c1 }
            r7.append(r4)     // Catch:{ all -> 0x04c1 }
            java.lang.String r4 = "MB, canDownload = "
            r7.append(r4)     // Catch:{ all -> 0x04c1 }
            r27 = r8
            r28 = r9
            double r8 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49330a(r11)     // Catch:{ all -> 0x04c1 }
            r7.append(r8)     // Catch:{ all -> 0x04c1 }
            java.lang.String r4 = "MB"
            r7.append(r4)     // Catch:{ all -> 0x04c1 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x04c1 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r5, r4)     // Catch:{ all -> 0x04c1 }
            r4 = 0
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0420
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x04c1 }
            long r2 = r2.getCurBytes()     // Catch:{ all -> 0x04c1 }
            r4 = 0
            long r2 = r2 + r11
            r1.f54818G = r2     // Catch:{ all -> 0x04c1 }
            goto L_0x042e
        L_0x0420:
            com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException r4 = new com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException     // Catch:{ all -> 0x04c1 }
            r11 = r23
            r4.<init>(r11, r2)     // Catch:{ all -> 0x04c1 }
            throw r4     // Catch:{ all -> 0x04c1 }
        L_0x0428:
            r27 = r8
            r28 = r9
            r11 = r23
        L_0x042e:
            int r2 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
            if (r2 >= 0) goto L_0x043a
            long r11 = r11 + r13
            int r2 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r2 <= 0) goto L_0x0438
            goto L_0x043a
        L_0x0438:
            r9 = r11
            goto L_0x043c
        L_0x043a:
            r9 = r28
        L_0x043c:
            r4 = r26
            r2 = r28
            goto L_0x04d0
        L_0x0442:
            r27 = r8
            r28 = r9
            r11 = r23
            java.lang.String r2 = "download_when_space_negative"
            r3 = 0
            int r2 = r5.mo41658a(r2, r3)     // Catch:{ all -> 0x04c1 }
            r3 = 1
            if (r2 != r3) goto L_0x045a
            r4 = r26
            r2 = r28
            r9 = r2
            r5 = 0
            goto L_0x04d1
        L_0x045a:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x04c1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04c1 }
            java.lang.String r4 = "availableSpace "
            r3.<init>(r4)     // Catch:{ all -> 0x04c1 }
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x046c
            java.lang.String r4 = "="
            goto L_0x046e
        L_0x046c:
            java.lang.String r4 = "<"
        L_0x046e:
            r3.append(r4)     // Catch:{ all -> 0x04c1 }
            java.lang.String r4 = " 0"
            r3.append(r4)     // Catch:{ all -> 0x04c1 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x04c1 }
            r4 = 1052(0x41c, float:1.474E-42)
            r2.<init>(r4, r3)     // Catch:{ all -> 0x04c1 }
            throw r2     // Catch:{ all -> 0x04c1 }
        L_0x0480:
            r27 = r8
            r28 = r9
            r25 = r11
            r26 = r12
            goto L_0x04cb
        L_0x0489:
            r0 = move-exception
            r2 = r0
            r4 = r12
            goto L_0x0547
        L_0x048e:
            r27 = r8
            r28 = r9
            r25 = r11
            r26 = r12
            r11 = r3
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x04c7
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x04c1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04c1 }
            java.lang.String r6 = "availableSpace "
            r5.<init>(r6)     // Catch:{ all -> 0x04c1 }
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x04ad
            java.lang.String r2 = "="
            goto L_0x04af
        L_0x04ad:
            java.lang.String r2 = "<"
        L_0x04af:
            r5.append(r2)     // Catch:{ all -> 0x04c1 }
            java.lang.String r2 = " 0"
            r5.append(r2)     // Catch:{ all -> 0x04c1 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x04c1 }
            r3 = 1052(0x41c, float:1.474E-42)
            r4.<init>(r3, r2)     // Catch:{ all -> 0x04c1 }
            throw r4     // Catch:{ all -> 0x04c1 }
        L_0x04c1:
            r0 = move-exception
            r2 = r0
            r4 = r26
            goto L_0x0547
        L_0x04c7:
            int r2 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r2 < 0) goto L_0x0538
        L_0x04cb:
            r4 = r26
            r2 = r28
            r9 = r2
        L_0x04d0:
            r5 = 1
        L_0x04d1:
            r4.mo42094a(r2)     // Catch:{ Throwable -> 0x04d5 }
            goto L_0x052e
        L_0x04d5:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = f54811g     // Catch:{ all -> 0x0542 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0542 }
            java.lang.String r12 = "checkSpaceOverflow: setLength1 e = "
            r11.<init>(r12)     // Catch:{ all -> 0x0542 }
            r11.append(r7)     // Catch:{ all -> 0x0542 }
            java.lang.String r12 = ", mustSetLength = "
            r11.append(r12)     // Catch:{ all -> 0x0542 }
            r11.append(r5)     // Catch:{ all -> 0x0542 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0542 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48487c(r8, r11)     // Catch:{ all -> 0x0542 }
            r8 = 1040(0x410, float:1.457E-42)
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L_0x052c
            r11 = 0
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x052c
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x052c
            r4.mo42094a(r9)     // Catch:{ Throwable -> 0x0506 }
            goto L_0x052e
        L_0x0506:
            r0 = move-exception
            r7 = r0
            java.lang.String r9 = f54811g     // Catch:{ all -> 0x0542 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0542 }
            java.lang.String r11 = "checkSpaceOverflow: setLength2 ex = "
            r10.<init>(r11)     // Catch:{ all -> 0x0542 }
            r10.append(r7)     // Catch:{ all -> 0x0542 }
            java.lang.String r11 = ", mustSetLength = "
            r10.append(r11)     // Catch:{ all -> 0x0542 }
            r10.append(r5)     // Catch:{ all -> 0x0542 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0542 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48487c(r9, r10)     // Catch:{ all -> 0x0542 }
            if (r5 != 0) goto L_0x0526
            goto L_0x052e
        L_0x0526:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x0542 }
            r2.<init>(r8, r7)     // Catch:{ all -> 0x0542 }
            throw r2     // Catch:{ all -> 0x0542 }
        L_0x052c:
            if (r5 != 0) goto L_0x0532
        L_0x052e:
            r4.mo42095b()     // Catch:{ Exception -> 0x0550 }
            goto L_0x0550
        L_0x0532:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x0542 }
            r2.<init>(r8, r7)     // Catch:{ all -> 0x0542 }
            throw r2     // Catch:{ all -> 0x0542 }
        L_0x0538:
            r4 = r26
            com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException r2 = new com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException     // Catch:{ all -> 0x0542 }
            r9 = r21
            r2.<init>(r11, r9)     // Catch:{ all -> 0x0542 }
            throw r2     // Catch:{ all -> 0x0542 }
        L_0x0542:
            r0 = move-exception
            goto L_0x0546
        L_0x0544:
            r0 = move-exception
            r4 = r12
        L_0x0546:
            r2 = r0
        L_0x0547:
            r4.mo42095b()     // Catch:{ Exception -> 0x054a }
        L_0x054a:
            throw r2     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x054b:
            r27 = r8
            r2 = r9
            r25 = r11
        L_0x0550:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r4 == 0) goto L_0x0574
            boolean r4 = r1.f54829l     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r4 == 0) goto L_0x0561
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r4 = r4.getChunkCount()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r5 = 1
            if (r4 <= r5) goto L_0x0574
        L_0x0561:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r4 = r4.isChunkDowngradeRetryUsed()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r4 == 0) goto L_0x056a
            goto L_0x0574
        L_0x056a:
            boolean r4 = r1.f54830m     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r4 == 0) goto L_0x0574
            boolean r4 = r1.f54832o     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r4 != 0) goto L_0x0574
            r4 = 1
            goto L_0x0575
        L_0x0574:
            r4 = 0
        L_0x0575:
            if (r4 == 0) goto L_0x05cd
            boolean r4 = r1.f54829l     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r4 == 0) goto L_0x0589
            if (r20 == 0) goto L_0x0582
            int r4 = r20.size()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x05cb
        L_0x0582:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r4 = r4.getChunkCount()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x05cb
        L_0x0589:
            com.ss.android.socialbase.downloader.downloader.i r4 = r1.f54835r     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r4 == 0) goto L_0x0594
            com.ss.android.socialbase.downloader.downloader.i r4 = r1.f54835r     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r4 = r4.mo41510a(r2)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x059a
        L_0x0594:
            com.ss.android.socialbase.downloader.downloader.i r4 = r1.f54836s     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r4 = r4.mo41510a(r2)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x059a:
            com.ss.android.socialbase.downloader.f.g r5 = com.p683ss.android.socialbase.downloader.p1216f.C19928g.m48914a()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.f.h r5 = r5.mo41652b()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r7 = "NetworkQuality is : %s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = r5.name()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r10 = 0
            r9[r10] = r8     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.C2240a.m6772a(r7, r9)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = r5.name()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r7.setNetworkQuality(r8)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.downloader.h r7 = r1.f54837t     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r7 == 0) goto L_0x05c5
            com.ss.android.socialbase.downloader.downloader.h r7 = r1.f54837t     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r4 = r7.mo41509a(r4, r5)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x05cb
        L_0x05c5:
            com.ss.android.socialbase.downloader.downloader.h r7 = r1.f54838u     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r4 = r7.mo41509a(r4, r5)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x05cb:
            if (r4 > 0) goto L_0x05ce
        L_0x05cd:
            r4 = 1
        L_0x05ce:
            boolean r5 = com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48485a()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r5 == 0) goto L_0x05f3
            java.lang.String r5 = "chunk count : %s for %s contentLen:%s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r9 = 0
            r7[r9] = r8     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = r8.getName()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r9 = 1
            r7[r9] = r8     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r9 = 2
            r7[r9] = r8     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.C2240a.m6772a(r5, r7)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x05f3:
            boolean r5 = r30.mo41680d()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r5 == 0) goto L_0x0600
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r30.mo41676b()
            return
        L_0x0600:
            if (r4 <= 0) goto L_0x06bd
            r5 = 1
            if (r4 != r5) goto L_0x0607
            r5 = 1
            goto L_0x0608
        L_0x0607:
            r5 = 0
        L_0x0608:
            r1.f54828k = r5     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r5 = r1.f54828k     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r5 == 0) goto L_0x067a
            r5 = r27
            r1.m48951a(r5, r6)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r2 = r30.mo41680d()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r2 == 0) goto L_0x0620
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r30.mo41676b()
            return
        L_0x0620:
            com.ss.android.socialbase.downloader.f.e r2 = r1.f54842y     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            long r3 = r3.getTotalBytes()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            long r5 = r25.mo41800i()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r7 = 0
            long r3 = r3 - r5
            r5 = r25
            r5.f55027d = r3     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r4 = 1
            r3.setChunkCount(r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.downloader.k r3 = r1.f54834q     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            int r6 = r6.getId()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3.mo41232a(r6, r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.downloader.e r3 = new com.ss.android.socialbase.downloader.downloader.e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3.<init>(r4, r2, r5, r1)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r1.f54821c = r3     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.downloader.e r2 = r1.f54821c     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r2 == 0) goto L_0x06b8
            com.ss.android.socialbase.downloader.b.k r2 = r1.f54822d     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.b.k r3 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_CANCELED     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r2 != r3) goto L_0x0662
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3 = -4
            r2.setStatus(r3)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.downloader.e r2 = r1.f54821c     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r2.mo41493b()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x06b8
        L_0x0662:
            com.ss.android.socialbase.downloader.b.k r2 = r1.f54822d     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.b.k r3 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r2 != r3) goto L_0x0674
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3 = -2
            r2.setStatus(r3)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            com.ss.android.socialbase.downloader.downloader.e r2 = r1.f54821c     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r2.mo41492a()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x06b8
        L_0x0674:
            com.ss.android.socialbase.downloader.downloader.e r2 = r1.f54821c     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r2.mo41494c()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x06b8
        L_0x067a:
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            boolean r5 = r5.isNeedReuseFirstConnection()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r5 != 0) goto L_0x0685
            r30.m48958k()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x0685:
            boolean r5 = r30.mo41680d()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r5 == 0) goto L_0x0692
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r30.mo41676b()
            return
        L_0x0692:
            boolean r5 = r1.f54829l     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r5 == 0) goto L_0x06b5
            int r2 = r20.size()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            if (r2 != r4) goto L_0x06a8
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            long r2 = r2.getTotalBytes()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r4 = r20
            r1.m48952a(r4, r2)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            goto L_0x06b8
        L_0x06a8:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3 = 1033(0x409, float:1.448E-42)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r4.<init>()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r2.<init>(r3, r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            throw r2     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x06b5:
            r1.m48948a(r2, r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x06b8:
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            goto L_0x0837
        L_0x06bd:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3 = 1032(0x408, float:1.446E-42)
            java.lang.String r4 = "chunkCount is 0"
            r2.<init>(r3, r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            throw r2     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x06c7:
            com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException r2 = new com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r2.<init>()     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            throw r2     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x06cd:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3 = 1031(0x407, float:1.445E-42)
            java.lang.String r4 = "download savePath is not a directory"
            r2.<init>(r3, r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            throw r2     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x06d7:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3 = 1029(0x405, float:1.442E-42)
            java.lang.String r4 = "download name can not be empty"
            r2.<init>(r3, r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            throw r2     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x06e1:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            r3 = 1028(0x404, float:1.44E-42)
            java.lang.String r4 = "download savePath can not be empty"
            r2.<init>(r3, r4)     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
            throw r2     // Catch:{ BaseException -> 0x06eb, a -> 0x071f, Throwable -> 0x06f9 }
        L_0x06eb:
            r0 = move-exception
            r2 = r0
            r6 = 2
            goto L_0x06f1
        L_0x06ef:
            r0 = move-exception
            r2 = r0
        L_0x06f1:
            r7 = 1
            r8 = 0
            goto L_0x07d6
        L_0x06f5:
            r0 = move-exception
            r2 = r0
            goto L_0x083b
        L_0x06f9:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = f54811g     // Catch:{ all -> 0x06f5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f5 }
            java.lang.String r5 = "downloadInner: throwable =  "
            r4.<init>(r5)     // Catch:{ all -> 0x06f5 }
            r4.append(r2)     // Catch:{ all -> 0x06f5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x06f5 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r3, r4)     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.b.k r3 = r1.f54822d     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.b.k r4 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE     // Catch:{ all -> 0x06f5 }
            if (r3 == r4) goto L_0x06b8
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x06f5 }
            r4 = 1045(0x415, float:1.464E-42)
            r3.<init>(r4, r2)     // Catch:{ all -> 0x06f5 }
            r1.mo41677b(r3)     // Catch:{ all -> 0x06f5 }
            goto L_0x06b8
        L_0x071f:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = f54811g     // Catch:{ all -> 0x06f5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f5 }
            java.lang.String r5 = "downloadInner: retry throwable for "
            r4.<init>(r5)     // Catch:{ all -> 0x06f5 }
            java.lang.String r5 = r2.mo41685a()     // Catch:{ all -> 0x06f5 }
            r4.append(r5)     // Catch:{ all -> 0x06f5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x06f5 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r3, r4)     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.b.k r3 = r1.f54822d     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.b.k r4 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE     // Catch:{ all -> 0x06f5 }
            if (r3 == r4) goto L_0x06b8
            java.util.concurrent.atomic.AtomicInteger r3 = r1.f54826i     // Catch:{ all -> 0x06f5 }
            r4 = 5
            if (r3 == 0) goto L_0x0763
            java.util.concurrent.atomic.AtomicInteger r3 = r1.f54826i     // Catch:{ all -> 0x06f5 }
            int r3 = r3.get()     // Catch:{ all -> 0x06f5 }
            if (r3 <= 0) goto L_0x0763
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x06f5 }
            java.util.concurrent.atomic.AtomicInteger r3 = r1.f54826i     // Catch:{ all -> 0x06f5 }
            int r3 = r3.decrementAndGet()     // Catch:{ all -> 0x06f5 }
            r2.updateCurRetryTime(r3)     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x06f5 }
            r2.setStatus(r4)     // Catch:{ all -> 0x06f5 }
        L_0x075b:
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r2 = 0
            r3 = 1
            r6 = 2
            goto L_0x014e
        L_0x0763:
            java.util.concurrent.atomic.AtomicInteger r3 = r1.f54826i     // Catch:{ all -> 0x06f5 }
            if (r3 == 0) goto L_0x07b4
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54823e     // Catch:{ all -> 0x06f5 }
            boolean r3 = r3.trySwitchToNextBackupUrl()     // Catch:{ all -> 0x06f5 }
            if (r3 == 0) goto L_0x078b
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x06f5 }
            r2.setStatus(r4)     // Catch:{ all -> 0x06f5 }
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f54826i     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f54823e     // Catch:{ all -> 0x06f5 }
            int r3 = r3.getRetryCount()     // Catch:{ all -> 0x06f5 }
            r2.set(r3)     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54823e     // Catch:{ all -> 0x06f5 }
            java.util.concurrent.atomic.AtomicInteger r3 = r1.f54826i     // Catch:{ all -> 0x06f5 }
            int r3 = r3.get()     // Catch:{ all -> 0x06f5 }
            r2.updateCurRetryTime(r3)     // Catch:{ all -> 0x06f5 }
            goto L_0x075b
        L_0x078b:
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x06f5 }
            r4 = 1018(0x3fa, float:1.427E-42)
            java.lang.String r5 = "retry for Throwable, but retry Time %s all used, last error is %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f54823e     // Catch:{ all -> 0x06f5 }
            int r7 = r7.getRetryCount()     // Catch:{ all -> 0x06f5 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x06f5 }
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x06f5 }
            java.lang.String r2 = r2.mo41685a()     // Catch:{ all -> 0x06f5 }
            r7 = 1
            r6[r7] = r2     // Catch:{ all -> 0x06f5 }
            java.lang.String r2 = com.C2240a.m6772a(r5, r6)     // Catch:{ all -> 0x06f5 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x06f5 }
            r1.mo41677b(r3)     // Catch:{ all -> 0x06f5 }
            goto L_0x06b8
        L_0x07b4:
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x06f5 }
            r4 = 1043(0x413, float:1.462E-42)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f5 }
            java.lang.String r6 = "retry for Throwable, but retain retry time is NULL, last error is"
            r5.<init>(r6)     // Catch:{ all -> 0x06f5 }
            java.lang.String r2 = r2.mo41685a()     // Catch:{ all -> 0x06f5 }
            r5.append(r2)     // Catch:{ all -> 0x06f5 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x06f5 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x06f5 }
            r1.mo41677b(r3)     // Catch:{ all -> 0x06f5 }
            goto L_0x06b8
        L_0x07d2:
            r0 = move-exception
            r7 = 1
            r8 = 0
            r2 = r0
        L_0x07d6:
            java.lang.String r3 = f54811g     // Catch:{ all -> 0x06f5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f5 }
            java.lang.String r5 = "downloadInner: baseException = "
            r4.<init>(r5)     // Catch:{ all -> 0x06f5 }
            r4.append(r2)     // Catch:{ all -> 0x06f5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x06f5 }
            com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48486b(r3, r4)     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.b.k r3 = r1.f54822d     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.b.k r4 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE     // Catch:{ all -> 0x06f5 }
            if (r3 == r4) goto L_0x06b8
            int r3 = r2.getErrorCode()     // Catch:{ all -> 0x06f5 }
            r4 = 1025(0x401, float:1.436E-42)
            if (r3 == r4) goto L_0x082c
            int r3 = r2.getErrorCode()     // Catch:{ all -> 0x06f5 }
            r4 = 1009(0x3f1, float:1.414E-42)
            if (r3 != r4) goto L_0x0800
            goto L_0x082c
        L_0x0800:
            boolean r3 = r1.mo41675a(r2)     // Catch:{ all -> 0x06f5 }
            if (r3 == 0) goto L_0x0827
            boolean r3 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49352a(r2)     // Catch:{ all -> 0x06f5 }
            if (r3 == 0) goto L_0x080f
            r30.m48965r()     // Catch:{ all -> 0x06f5 }
        L_0x080f:
            r3 = 0
            com.ss.android.socialbase.downloader.exception.a r2 = r1.mo41667a(r2, r3)     // Catch:{ all -> 0x06f5 }
            com.ss.android.socialbase.downloader.exception.a r3 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN     // Catch:{ all -> 0x06f5 }
            if (r2 != r3) goto L_0x0820
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r30.mo41676b()
            return
        L_0x0820:
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r2 = 0
            r3 = 1
            goto L_0x014e
        L_0x0827:
            r1.mo41677b(r2)     // Catch:{ all -> 0x06f5 }
            goto L_0x06b8
        L_0x082c:
            com.ss.android.socialbase.downloader.b.k r2 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_END_RIGHT_NOW     // Catch:{ all -> 0x06f5 }
            r1.f54822d = r2     // Catch:{ all -> 0x06f5 }
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            r30.mo41676b()
            return
        L_0x0837:
            r30.mo41676b()
            return
        L_0x083b:
            r30.mo41678c()     // Catch:{ all -> 0x083f }
            throw r2     // Catch:{ all -> 0x083f }
        L_0x083f:
            r0 = move-exception
            r2 = r0
            r30.mo41676b()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1220i.C19941c.m48956i():void");
    }

    /* renamed from: a */
    public final boolean mo41674a(long j) throws BaseException {
        long j2;
        long j3 = j;
        if (this.f54818G > 0 && this.f54823e.getCurBytes() > this.f54818G) {
            try {
                j2 = C19994e.m49359b(this.f54823e.getTempPath());
            } catch (BaseException unused) {
                j2 = 0;
            }
            String str = f54811g;
            StringBuilder sb = new StringBuilder("checkSpaceOverflowInProgress: available = ");
            sb.append(C19994e.m49330a(j2));
            sb.append("MB");
            C19819a.m48484a(str, sb.toString());
            if (j2 > 0) {
                long totalBytes = this.f54823e.getTotalBytes() - this.f54823e.getCurBytes();
                if (j2 < totalBytes) {
                    int a = C19938a.m48929a(this.f54823e.getId()).mo41658a("space_fill_min_keep_mb", 100);
                    if (a > 0) {
                        long j4 = j2 - (((long) a) * 1048576);
                        String str2 = f54811g;
                        StringBuilder sb2 = new StringBuilder("checkSpaceOverflowInProgress: minKeep  = ");
                        sb2.append(a);
                        sb2.append("MB, canDownload = ");
                        sb2.append(C19994e.m49330a(j4));
                        sb2.append("MB");
                        C19819a.m48484a(str2, sb2.toString());
                        if (j4 > 0) {
                            this.f54818G = this.f54823e.getCurBytes() + j4 + 1048576;
                        } else {
                            this.f54818G = 0;
                            throw new DownloadOutOfSpaceException(j2, totalBytes);
                        }
                    }
                }
            }
            this.f54818G = 0;
        }
        C19891f fVar = this.f54824f;
        fVar.f54673f.addAndGet(j3);
        fVar.f54670c.increaseCurBytes(j3);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = true;
        if (!fVar.f54674g) {
            fVar.f54674g = true;
        } else {
            long j5 = uptimeMillis - fVar.f54672e;
            if (fVar.f54673f.get() < fVar.f54676i && j5 < ((long) fVar.f54675h)) {
                z = false;
            }
            if (z) {
                fVar.f54672e = uptimeMillis;
                fVar.f54673f.set(0);
            }
        }
        return fVar.mo41502a(uptimeMillis, z);
    }

    /* renamed from: a */
    public final boolean mo41675a(BaseException baseException) {
        if (C19994e.m49369b(baseException)) {
            if (this.f54828k && !this.f54825h) {
                C19994e.m49343a(this.f54823e);
                this.f54825h = true;
            }
            return true;
        } else if (((this.f54826i == null || this.f54826i.get() <= 0) && !this.f54823e.hasNextBackupUrl() && ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f54823e.canReplaceHttpForRetry())) || (baseException instanceof DownloadRetryNeedlessException)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final C19913a mo41668a(DownloadChunk downloadChunk, BaseException baseException, long j) {
        if (m48959l()) {
            return C19913a.RETURN;
        }
        if (baseException.getErrorCode() == 1047 || C19994e.m49378c((Throwable) baseException)) {
            return mo41667a(baseException, j);
        }
        this.f54841x = baseException;
        this.f54823e.increaseCurBytes(-j);
        this.f54834q.mo41244a(this.f54823e);
        if (m48954d(baseException)) {
            return C19913a.RETURN;
        }
        C19891f fVar = this.f54824f;
        boolean z = this.f54822d == C19790k.RUN_STATUS_RETRY_DELAY;
        fVar.f54670c.setFirstDownload(false);
        fVar.f54673f.set(0);
        fVar.f54671d.mo41264h(fVar.f54670c.getId());
        fVar.mo41498a(z ? 10 : 9, baseException, true);
        if (this.f54822d != C19790k.RUN_STATUS_RETRY_DELAY && this.f54823e.isNeedRetryDelay()) {
            long p = m48963p();
            if (p > 0) {
                String str = f54811g;
                StringBuilder sb = new StringBuilder("onSingleChunkRetry with delay time ");
                sb.append(p);
                C19819a.m48484a(str, sb.toString());
                try {
                    Thread.sleep(p);
                } catch (Throwable th) {
                    String str2 = f54811g;
                    StringBuilder sb2 = new StringBuilder("onSingleChunkRetry:");
                    sb2.append(th.getMessage());
                    C19819a.m48486b(str2, sb2.toString());
                }
            }
        }
        return C19913a.CONTINUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        if (m48954d(r8) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        return com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.socialbase.downloader.exception.C19913a mo41667a(com.p683ss.android.socialbase.downloader.exception.BaseException r8, long r9) {
        /*
            r7 = this;
            r7.f54841x = r8
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54823e
            long r9 = -r9
            r0.increaseCurBytes(r9)
            com.ss.android.socialbase.downloader.downloader.k r9 = r7.f54834q
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r7.f54823e
            r9.mo41244a(r10)
            boolean r9 = r7.m48959l()
            if (r9 == 0) goto L_0x0018
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN
            return r8
        L_0x0018:
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x0061
            int r0 = r8.getErrorCode()
            r1 = 1047(0x417, float:1.467E-42)
            if (r0 != r1) goto L_0x0061
            com.ss.android.socialbase.downloader.depend.r r0 = r7.f54812A
            if (r0 == 0) goto L_0x0058
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54823e
            boolean r0 = r0.isForbiddenRetryed()
            if (r0 == 0) goto L_0x0031
            goto L_0x0058
        L_0x0031:
            com.ss.android.socialbase.downloader.i.c$1 r0 = new com.ss.android.socialbase.downloader.i.c$1
            r0.<init>()
            com.ss.android.socialbase.downloader.depend.r r1 = r7.f54812A
            boolean r1 = r1.mo41376a(r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f54823e
            r2.setForbiddenRetryed()
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r0.mo41310a()
            if (r0 != 0) goto L_0x00d9
            r7.mo41683g()
            com.ss.android.socialbase.downloader.downloader.f r8 = r7.f54824f
            r8.mo41507f()
            com.ss.android.socialbase.downloader.b.k r8 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_WAITING_ASYNC_HANDLER
            r7.f54822d = r8
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN
            return r8
        L_0x0058:
            boolean r0 = r7.m48954d(r8)
            if (r0 == 0) goto L_0x00f8
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN
            return r8
        L_0x0061:
            boolean r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49378c(r8)
            if (r0 == 0) goto L_0x00ef
            com.ss.android.socialbase.downloader.depend.m r0 = r7.f54813B
            if (r0 != 0) goto L_0x0071
            r7.mo41677b(r8)
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN
            return r8
        L_0x0071:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r10)
            com.ss.android.socialbase.downloader.i.c$2 r6 = new com.ss.android.socialbase.downloader.i.c$2
            r6.<init>(r0)
            boolean r1 = r8 instanceof com.p683ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException
            if (r1 == 0) goto L_0x008b
            r1 = r8
            com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException r1 = (com.p683ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException) r1
            long r2 = r1.getAvaliableSpaceBytes()
            long r4 = r1.getRequiredSpaceBytes()
            goto L_0x0095
        L_0x008b:
            r1 = -1
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r7.f54823e
            long r3 = r3.getTotalBytes()
            r4 = r3
            r2 = r1
        L_0x0095:
            monitor-enter(r7)
            com.ss.android.socialbase.downloader.depend.m r1 = r7.f54813B     // Catch:{ all -> 0x00ec }
            boolean r1 = r1.mo41365a(r2, r4, r6)     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x00db
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54823e     // Catch:{ all -> 0x00ec }
            int r1 = r1.getId()     // Catch:{ all -> 0x00ec }
            com.ss.android.socialbase.downloader.h.a r1 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48929a(r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r2 = "not_delete_when_clean_space"
            boolean r1 = r1.mo41661a(r2, r10)     // Catch:{ all -> 0x00ec }
            if (r1 != 0) goto L_0x00b3
            r7.m48962o()     // Catch:{ all -> 0x00ec }
        L_0x00b3:
            boolean r0 = r0.get()     // Catch:{ all -> 0x00ec }
            if (r0 != 0) goto L_0x00cf
            com.ss.android.socialbase.downloader.b.k r8 = r7.f54822d     // Catch:{ all -> 0x00ec }
            com.ss.android.socialbase.downloader.b.k r9 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x00ec }
            if (r8 == r9) goto L_0x00cb
            com.ss.android.socialbase.downloader.b.k r8 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x00ec }
            r7.f54822d = r8     // Catch:{ all -> 0x00ec }
            r7.mo41683g()     // Catch:{ all -> 0x00ec }
            com.ss.android.socialbase.downloader.downloader.f r8 = r7.f54824f     // Catch:{ all -> 0x00ec }
            r8.mo41507f()     // Catch:{ all -> 0x00ec }
        L_0x00cb:
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN     // Catch:{ all -> 0x00ec }
            monitor-exit(r7)     // Catch:{ all -> 0x00ec }
            return r8
        L_0x00cf:
            monitor-exit(r7)     // Catch:{ all -> 0x00ec }
            boolean r0 = r7.m48954d(r8)
            if (r0 == 0) goto L_0x00d9
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN
            return r8
        L_0x00d9:
            r0 = 1
            goto L_0x00f9
        L_0x00db:
            com.ss.android.socialbase.downloader.b.k r9 = r7.f54822d     // Catch:{ all -> 0x00ec }
            com.ss.android.socialbase.downloader.b.k r10 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x00ec }
            if (r9 != r10) goto L_0x00e5
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN     // Catch:{ all -> 0x00ec }
            monitor-exit(r7)     // Catch:{ all -> 0x00ec }
            return r8
        L_0x00e5:
            r7.mo41677b(r8)     // Catch:{ all -> 0x00ec }
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN     // Catch:{ all -> 0x00ec }
            monitor-exit(r7)     // Catch:{ all -> 0x00ec }
            return r8
        L_0x00ec:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ec }
            throw r8
        L_0x00ef:
            boolean r0 = r7.m48954d(r8)
            if (r0 == 0) goto L_0x00f8
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN
            return r8
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            if (r0 != 0) goto L_0x0123
            com.ss.android.socialbase.downloader.b.k r0 = r7.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            if (r0 == r1) goto L_0x011d
            android.app.AlarmManager r0 = r7.f54840w
            if (r0 == 0) goto L_0x011d
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f54823e
            boolean r0 = r0.isNeedRetryDelay()
            if (r0 == 0) goto L_0x011d
            long r0 = r7.m48963p()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x011d
            com.ss.android.socialbase.downloader.b.k r0 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            r7.f54822d = r0
            r0 = 1
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            if (r0 == 0) goto L_0x0123
            r7.mo41683g()
        L_0x0123:
            com.ss.android.socialbase.downloader.downloader.f r0 = r7.f54824f
            com.ss.android.socialbase.downloader.b.k r1 = r7.f54822d
            com.ss.android.socialbase.downloader.b.k r2 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            if (r1 != r2) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r9 = 0
        L_0x012d:
            r0.mo41501a(r8, r9)
            com.ss.android.socialbase.downloader.b.k r8 = r7.f54822d
            com.ss.android.socialbase.downloader.b.k r9 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            if (r8 != r9) goto L_0x0139
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.RETURN
            return r8
        L_0x0139:
            com.ss.android.socialbase.downloader.exception.a r8 = com.p683ss.android.socialbase.downloader.exception.C19913a.CONTINUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1220i.C19941c.mo41667a(com.ss.android.socialbase.downloader.exception.BaseException, long):com.ss.android.socialbase.downloader.exception.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0144, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f8 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p683ss.android.socialbase.downloader.model.DownloadChunk mo41669a(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r11.f54823e     // Catch:{ all -> 0x0145 }
            int r0 = r0.getChunkCount()     // Catch:{ all -> 0x0145 }
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L_0x000d
            monitor-exit(r11)
            return r2
        L_0x000d:
            com.ss.android.socialbase.downloader.downloader.k r0 = r11.f54834q     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r11.f54823e     // Catch:{ all -> 0x0145 }
            int r1 = r1.getId()     // Catch:{ all -> 0x0145 }
            java.util.List r0 = r0.mo41253c(r1)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x0143
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0145 }
            if (r1 == 0) goto L_0x0023
            goto L_0x0143
        L_0x0023:
            r1 = 0
            r3 = 0
        L_0x0025:
            int r4 = r0.size()     // Catch:{ all -> 0x0145 }
            if (r3 >= r4) goto L_0x0141
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.DownloadChunk r4 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r4     // Catch:{ all -> 0x0145 }
            if (r4 == 0) goto L_0x013d
            boolean r5 = r4.mo41792b()     // Catch:{ all -> 0x0145 }
            if (r5 == 0) goto L_0x0138
            r5 = 1
            long r6 = r4.mo41791b(r5)     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "reuseChunk retainLen:"
            r8.<init>(r9)     // Catch:{ all -> 0x0145 }
            r8.append(r6)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = " chunkIndex:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            r8.append(r12)     // Catch:{ all -> 0x0145 }
            boolean r8 = r4.mo41794d()     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x008c
            long r8 = com.p683ss.android.socialbase.downloader.p1212b.C19784e.f54483b     // Catch:{ all -> 0x0145 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x008c
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r11.f54823e     // Catch:{ all -> 0x0145 }
            boolean r6 = r6.isNeedReuseChunkRunnable()     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x008c
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r11.f54823e     // Catch:{ all -> 0x0145 }
            int r6 = r6.getChunkCount()     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r11.f54823e     // Catch:{ all -> 0x0145 }
            long r7 = r7.getTotalBytes()     // Catch:{ all -> 0x0145 }
            java.util.List r6 = r4.mo41786a(r6, r7)     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0145 }
        L_0x007a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0145 }
            if (r7 == 0) goto L_0x0092
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.DownloadChunk r7 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r7     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.downloader.k r8 = r11.f54834q     // Catch:{ all -> 0x0145 }
            r8.mo41250b(r7)     // Catch:{ all -> 0x0145 }
            goto L_0x007a
        L_0x008c:
            boolean r6 = r4.mo41794d()     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x0094
        L_0x0092:
            r6 = 1
            goto L_0x0095
        L_0x0094:
            r6 = 0
        L_0x0095:
            if (r6 == 0) goto L_0x0138
            boolean r6 = r4.mo41794d()     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x0138
            r6 = 1
        L_0x009e:
            java.util.List<com.ss.android.socialbase.downloader.model.DownloadChunk> r7 = r4.f55030g     // Catch:{ all -> 0x0145 }
            int r7 = r7.size()     // Catch:{ all -> 0x0145 }
            if (r6 >= r7) goto L_0x00f8
            java.util.List<com.ss.android.socialbase.downloader.model.DownloadChunk> r7 = r4.f55030g     // Catch:{ all -> 0x0145 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.DownloadChunk r7 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r7     // Catch:{ all -> 0x0145 }
            if (r7 == 0) goto L_0x00f5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "check can checkUnCompletedChunk -- chunkIndex:"
            r8.<init>(r9)     // Catch:{ all -> 0x0145 }
            int r9 = r7.f55028e     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = " currentOffset:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            long r9 = r7.mo41800i()     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "  startOffset:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            long r9 = r7.f55025b     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = " contentLen:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            long r9 = r7.f55027d     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            int r8 = r7.f55028e     // Catch:{ all -> 0x0145 }
            if (r8 < 0) goto L_0x00f9
            boolean r8 = r7.mo41797f()     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x00f5
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f55034k     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x00ec
            r8 = 0
            goto L_0x00f2
        L_0x00ec:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f55034k     // Catch:{ all -> 0x0145 }
            boolean r8 = r8.get()     // Catch:{ all -> 0x0145 }
        L_0x00f2:
            if (r8 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r6 = r6 + 1
            goto L_0x009e
        L_0x00f8:
            r7 = r2
        L_0x00f9:
            if (r7 == 0) goto L_0x0139
            long r8 = r4.mo41800i()     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            java.lang.String r10 = "unComplete chunk "
            r6.<init>(r10)     // Catch:{ all -> 0x0145 }
            int r4 = r4.f55028e     // Catch:{ all -> 0x0145 }
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = " curOffset:"
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            r6.append(r8)     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = " reuseChunk chunkIndex:"
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            r6.append(r12)     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = " for subChunk:"
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            int r4 = r7.f55028e     // Catch:{ all -> 0x0145 }
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.downloader.k r4 = r11.f54834q     // Catch:{ all -> 0x0145 }
            int r6 = r7.f55024a     // Catch:{ all -> 0x0145 }
            int r8 = r7.f55028e     // Catch:{ all -> 0x0145 }
            int r9 = r7.mo41785a()     // Catch:{ all -> 0x0145 }
            r4.mo41237a(r6, r8, r9, r12)     // Catch:{ all -> 0x0145 }
            r7.f55028e = r12     // Catch:{ all -> 0x0145 }
            r7.mo41790a(r5)     // Catch:{ all -> 0x0145 }
            goto L_0x0139
        L_0x0138:
            r7 = r2
        L_0x0139:
            if (r7 == 0) goto L_0x013d
            monitor-exit(r11)
            return r7
        L_0x013d:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0141:
            monitor-exit(r11)
            return r2
        L_0x0143:
            monitor-exit(r11)
            return r2
        L_0x0145:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1220i.C19941c.mo41669a(int):com.ss.android.socialbase.downloader.model.DownloadChunk");
    }

    /* renamed from: a */
    public final void mo41672a(C19924c cVar) {
        if (cVar != null) {
            try {
                int b = cVar.mo13393b();
                this.f54823e.setHttpStatusCode(b);
                this.f54823e.setHttpStatusMessage(C19992c.m49328a(b));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo41678c() {
        m48957j();
        m48958k();
    }

    /* renamed from: e */
    public final boolean mo41681e() {
        return this.f54833p.get();
    }

    /* renamed from: j */
    private void m48957j() {
        if (this.f54843z != null) {
            this.f54843z.mo13394c();
            this.f54843z = null;
        }
    }

    /* renamed from: k */
    private void m48958k() {
        if (this.f54842y != null) {
            this.f54842y.mo13395d();
            this.f54842y = null;
        }
    }

    /* renamed from: f */
    public final int mo41682f() {
        if (this.f54823e != null) {
            return this.f54823e.getId();
        }
        return 0;
    }

    /* renamed from: l */
    private boolean m48959l() {
        if (this.f54822d == C19790k.RUN_STATUS_CANCELED || this.f54822d == C19790k.RUN_STATUS_PAUSE) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private long m48963p() {
        return this.f54839v.mo41627a(this.f54823e.getCurRetryTimeInTotal(), this.f54823e.getTotalRetryCount());
    }

    /* renamed from: h */
    private void m48955h() {
        if (this.f54823e != null) {
            int retryCount = this.f54823e.getRetryCount() - this.f54823e.getCurRetryTime();
            if (retryCount < 0) {
                retryCount = 0;
            }
            if (this.f54826i == null) {
                this.f54826i = new AtomicInteger(retryCount);
            } else {
                this.f54826i.set(retryCount);
            }
        }
    }

    /* renamed from: r */
    private void m48965r() {
        try {
            this.f54834q.mo41258d(this.f54823e.getId());
            C19994e.m49343a(this.f54823e);
            this.f54829l = false;
            this.f54823e.resetDataForEtagEndure("");
            this.f54834q.mo41244a(this.f54823e);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo41680d() {
        if (!m48959l() && this.f54823e.getStatus() != -2) {
            return false;
        }
        if (!m48959l()) {
            if (this.f54823e.getStatus() == -2) {
                this.f54822d = C19790k.RUN_STATUS_PAUSE;
            } else if (this.f54823e.getStatus() == -4) {
                this.f54822d = C19790k.RUN_STATUS_CANCELED;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo41683g() {
        try {
            Iterator it = ((ArrayList) this.f54827j.clone()).iterator();
            while (it.hasNext()) {
                C19940b bVar = (C19940b) it.next();
                if (bVar != null) {
                    bVar.mo41665b();
                }
            }
        } catch (Throwable th) {
            String str = f54811g;
            StringBuilder sb = new StringBuilder("cancelAllChunkRunnable: ");
            sb.append(th.toString());
            C19819a.m48484a(str, sb.toString());
        }
    }

    /* renamed from: n */
    private boolean m48961n() {
        if (this.f54823e.getChunkCount() > 1) {
            List<DownloadChunk> c = this.f54834q.mo41253c(this.f54823e.getId());
            if (c == null || c.size() <= 1) {
                return false;
            }
            for (DownloadChunk downloadChunk : c) {
                if (downloadChunk != null) {
                    if (!downloadChunk.mo41797f()) {
                    }
                }
                return false;
            }
            return true;
        } else if (this.f54823e.getCurBytes() <= 0 || this.f54823e.getCurBytes() != this.f54823e.getTotalBytes()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    private boolean m48962o() {
        if (this.f54823e.isChunked()) {
            this.f54823e.setTotalBytes(this.f54823e.getCurBytes());
        }
        if (this.f54823e.getCurBytes() > 0 && (this.f54823e.isIgnoreDataVerify() || (this.f54823e.getTotalBytes() > 0 && this.f54823e.getCurBytes() == this.f54823e.getTotalBytes()))) {
            return true;
        }
        this.f54823e.setByteInvalidRetryStatus(C19781b.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f54823e.reset();
        this.f54834q.mo41244a(this.f54823e);
        this.f54834q.mo41258d(this.f54823e.getId());
        C19994e.m49343a(this.f54823e);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo41676b() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 0;
        if (this.f54822d == C19790k.RUN_STATUS_PAUSE || this.f54822d == C19790k.RUN_STATUS_CANCELED) {
            z = false;
        } else {
            z = true;
        }
        try {
            z3 = m48960m();
            z2 = false;
        } catch (Exception e) {
            if (e instanceof BaseException) {
                this.f54824f.mo41500a((BaseException) e);
            } else {
                this.f54824f.mo41500a(new BaseException(1046, (Throwable) e));
            }
            z3 = true;
            z2 = true;
        }
        if (z3 || z2) {
            this.f54833p.set(false);
            if (z) {
                try {
                    C19950a q = C19884b.m48620q();
                    if (q != null) {
                        q.mo41705a(this);
                    }
                } catch (Throwable th) {
                    C19865t monitorDepend = this.f54820b.getMonitorDepend();
                    DownloadInfo downloadInfo = this.f54823e;
                    BaseException baseException = new BaseException(1014, C19994e.m49362b(th, "removeDownloadRunnable"));
                    if (this.f54823e != null) {
                        i = this.f54823e.getStatus();
                    }
                    C19911a.m48889a(monitorDepend, downloadInfo, baseException, i);
                }
            }
        } else {
            this.f54815D = true;
        }
    }

    /* renamed from: q */
    private void m48964q() throws C19944a, BaseException {
        int id = this.f54823e.getId();
        int a = C19884b.m48596a(this.f54823e);
        if (!this.f54823e.isDownloaded()) {
            DownloadInfo b = this.f54834q.mo41245b(a);
            if (b != null) {
                C19950a q = C19884b.m48620q();
                if (q != null && b.getId() != id && b.equalsTask(this.f54823e)) {
                    if (!q.mo41708a(b.getId())) {
                        List<DownloadChunk> c = this.f54834q.mo41253c(a);
                        C19994e.m49343a(this.f54823e);
                        this.f54834q.mo41262f(a);
                        if (b != null && b.isBreakpointAvailable()) {
                            this.f54823e.copyFromCacheData(b, false);
                            this.f54834q.mo41244a(this.f54823e);
                            if (c != null) {
                                for (DownloadChunk downloadChunk : c) {
                                    downloadChunk.f55024a = id;
                                    this.f54834q.mo41242a(downloadChunk);
                                }
                            }
                            throw new C19944a("retry task because id generator changed");
                        }
                        return;
                    }
                    this.f54834q.mo41262f(id);
                    throw new BaseException(1025, "another same task is downloading");
                }
                return;
            }
            return;
        }
        throw new BaseException(1009, "file has downloaded");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a9  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m48960m() {
        /*
            r12 = this;
            com.ss.android.socialbase.downloader.f.a r0 = com.p683ss.android.socialbase.downloader.p1216f.C19914a.m48890a()
            r0.mo41641b()
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_ERROR
            r2 = 1
            if (r0 != r1) goto L_0x0017
            com.ss.android.socialbase.downloader.downloader.f r0 = r12.f54824f
            com.ss.android.socialbase.downloader.exception.BaseException r1 = r12.f54841x
            r0.mo41500a(r1)
            goto L_0x01ed
        L_0x0017:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_CANCELED
            if (r0 != r1) goto L_0x0024
            com.ss.android.socialbase.downloader.downloader.f r0 = r12.f54824f
            r0.mo41503b()
            goto L_0x01ed
        L_0x0024:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE
            if (r0 != r1) goto L_0x0031
            com.ss.android.socialbase.downloader.downloader.f r0 = r12.f54824f
            r0.mo41504c()
            goto L_0x01ed
        L_0x0031:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_END_RIGHT_NOW
            r3 = 0
            r4 = -3
            if (r0 != r1) goto L_0x0088
            com.ss.android.socialbase.downloader.downloader.f r0 = r12.f54824f
            boolean r1 = r0.f54669b
            if (r1 == 0) goto L_0x0067
            r0.mo41497a(r4, r3)
            com.ss.android.socialbase.downloader.downloader.k r1 = r0.f54671d
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r0.f54670c
            int r3 = r3.getId()
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r0.f54670c
            long r4 = r4.getTotalBytes()
            r1.mo41252c(r3, r4)
            com.ss.android.socialbase.downloader.downloader.k r1 = r0.f54671d
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r0.f54670c
            int r3 = r3.getId()
            r1.mo41258d(r3)
            com.ss.android.socialbase.downloader.downloader.k r1 = r0.f54671d
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r0.f54670c
            r1.mo41244a(r0)
            goto L_0x01ed
        L_0x0067:
            r0.mo41497a(r4, r3)
            com.ss.android.socialbase.downloader.downloader.k r1 = r0.f54671d
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r0.f54670c
            int r3 = r3.getId()
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r0.f54670c
            long r4 = r4.getTotalBytes()
            r1.mo41252c(r3, r4)
            com.ss.android.socialbase.downloader.downloader.k r1 = r0.f54671d
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r0.f54670c
            int r0 = r0.getId()
            r1.mo41258d(r0)
            goto L_0x01ed
        L_0x0088:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_END_FOR_FILE_EXIST
            if (r0 != r1) goto L_0x00d8
            com.ss.android.socialbase.downloader.downloader.f r0 = r12.f54824f     // Catch:{ BaseException -> 0x00d0 }
            java.lang.String r1 = r12.f54817F     // Catch:{ BaseException -> 0x00d0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ BaseException -> 0x00d0 }
            java.lang.String r6 = "onCompleteForFileExist existTargetFileName is "
            r5.<init>(r6)     // Catch:{ BaseException -> 0x00d0 }
            r5.append(r1)     // Catch:{ BaseException -> 0x00d0 }
            java.lang.String r6 = " but curName is "
            r5.append(r6)     // Catch:{ BaseException -> 0x00d0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r0.f54670c     // Catch:{ BaseException -> 0x00d0 }
            java.lang.String r6 = r6.getName()     // Catch:{ BaseException -> 0x00d0 }
            r5.append(r6)     // Catch:{ BaseException -> 0x00d0 }
            boolean r5 = r0.f54669b     // Catch:{ BaseException -> 0x00d0 }
            if (r5 == 0) goto L_0x00bf
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r0.f54670c     // Catch:{ BaseException -> 0x00d0 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49344a(r5, r1)     // Catch:{ BaseException -> 0x00d0 }
            r0.mo41497a(r4, r3)     // Catch:{ BaseException -> 0x00d0 }
            com.ss.android.socialbase.downloader.downloader.k r1 = r0.f54671d     // Catch:{ BaseException -> 0x00d0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r0.f54670c     // Catch:{ BaseException -> 0x00d0 }
            r1.mo41244a(r0)     // Catch:{ BaseException -> 0x00d0 }
            goto L_0x01ed
        L_0x00bf:
            com.ss.android.socialbase.downloader.downloader.k r5 = r0.f54671d     // Catch:{ BaseException -> 0x00d0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r0.f54670c     // Catch:{ BaseException -> 0x00d0 }
            r5.mo41244a(r6)     // Catch:{ BaseException -> 0x00d0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r0.f54670c     // Catch:{ BaseException -> 0x00d0 }
            com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49344a(r5, r1)     // Catch:{ BaseException -> 0x00d0 }
            r0.mo41497a(r4, r3)     // Catch:{ BaseException -> 0x00d0 }
            goto L_0x01ed
        L_0x00d0:
            r0 = move-exception
            com.ss.android.socialbase.downloader.downloader.f r1 = r12.f54824f
            r1.mo41500a(r0)
            goto L_0x01ed
        L_0x00d8:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET
            r3 = 0
            if (r0 != r1) goto L_0x00e7
            com.ss.android.socialbase.downloader.downloader.f r0 = r12.f54824f
            com.ss.android.socialbase.downloader.exception.BaseException r1 = r12.f54841x
            r0.mo41501a(r1, r3)
            return r3
        L_0x00e7:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_WAITING_ASYNC_HANDLER
            if (r0 != r1) goto L_0x00ee
            return r2
        L_0x00ee:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            if (r0 != r1) goto L_0x01c8
            boolean r0 = r12.m48961n()
            if (r0 != 0) goto L_0x01c8
            long r0 = r12.m48963p()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 2
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Throwable -> 0x0158 }
            java.lang.String r7 = "com.ss.android.downloader.action.DOWNLOAD_WAKEUP"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0158 }
            java.lang.String r7 = "extra_download_id"
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r12.f54823e     // Catch:{ Throwable -> 0x0158 }
            int r8 = r8.getId()     // Catch:{ Throwable -> 0x0158 }
            r6.putExtra(r7, r8)     // Catch:{ Throwable -> 0x0158 }
            android.content.Context r7 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()     // Catch:{ Throwable -> 0x0158 }
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r8 = com.p683ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r6.setClass(r7, r8)     // Catch:{ Throwable -> 0x0158 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0158 }
            r8 = 19
            if (r7 < r8) goto L_0x013c
            android.app.AlarmManager r7 = r12.f54840w     // Catch:{ Throwable -> 0x0158 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x0158 }
            r10 = 0
            long r8 = r8 + r0
            android.content.Context r10 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()     // Catch:{ Throwable -> 0x0158 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r12.f54823e     // Catch:{ Throwable -> 0x0158 }
            int r11 = r11.getId()     // Catch:{ Throwable -> 0x0158 }
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r10, r11, r6, r4)     // Catch:{ Throwable -> 0x0158 }
            r7.setExact(r5, r8, r6)     // Catch:{ Throwable -> 0x0158 }
            goto L_0x0196
        L_0x013c:
            android.app.AlarmManager r7 = r12.f54840w     // Catch:{ Throwable -> 0x0158 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x0158 }
            r10 = 0
            long r8 = r8 + r0
            android.content.Context r10 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()     // Catch:{ Throwable -> 0x0158 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r12.f54823e     // Catch:{ Throwable -> 0x0158 }
            int r11 = r11.getId()     // Catch:{ Throwable -> 0x0158 }
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r10, r11, r6, r4)     // Catch:{ Throwable -> 0x0158 }
            r7.set(r5, r8, r6)     // Catch:{ Throwable -> 0x0158 }
            goto L_0x0196
        L_0x0156:
            r0 = move-exception
            goto L_0x01b5
        L_0x0158:
            r6 = move-exception
            boolean r6 = r6 instanceof java.lang.NoSuchMethodError     // Catch:{ all -> 0x0156 }
            if (r6 == 0) goto L_0x0193
            android.content.Intent r6 = new android.content.Intent     // Catch:{ Throwable -> 0x0193 }
            java.lang.String r7 = "com.ss.android.downloader.action.DOWNLOAD_WAKEUP"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0193 }
            android.content.Context r7 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()     // Catch:{ Throwable -> 0x0193 }
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r8 = com.p683ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r6.setClass(r7, r8)     // Catch:{ Throwable -> 0x0193 }
            java.lang.String r7 = "extra_download_id"
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r12.f54823e     // Catch:{ Throwable -> 0x0193 }
            int r8 = r8.getId()     // Catch:{ Throwable -> 0x0193 }
            r6.putExtra(r7, r8)     // Catch:{ Throwable -> 0x0193 }
            android.app.AlarmManager r7 = r12.f54840w     // Catch:{ Throwable -> 0x0193 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x0193 }
            r10 = 0
            long r8 = r8 + r0
            android.content.Context r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48627x()     // Catch:{ Throwable -> 0x0193 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r12.f54823e     // Catch:{ Throwable -> 0x0193 }
            int r1 = r1.getId()     // Catch:{ Throwable -> 0x0193 }
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r0, r1, r6, r4)     // Catch:{ Throwable -> 0x0193 }
            r7.set(r5, r8, r0)     // Catch:{ Throwable -> 0x0193 }
            r0 = 1
            goto L_0x0194
        L_0x0193:
            r0 = 0
        L_0x0194:
            if (r0 == 0) goto L_0x01a9
        L_0x0196:
            com.ss.android.socialbase.downloader.b.k r0 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            r12.f54822d = r0
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r12.f54823e
            com.ss.android.socialbase.downloader.b.j r1 = com.p683ss.android.socialbase.downloader.p1212b.C19789j.DELAY_RETRY_WAITING
            r0.setRetryDelayStatus(r1)
            com.ss.android.socialbase.downloader.downloader.k r0 = r12.f54834q
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r12.f54823e
            r0.mo41244a(r1)
            goto L_0x01ad
        L_0x01a9:
            com.ss.android.socialbase.downloader.b.k r0 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_NONE
            r12.f54822d = r0
        L_0x01ad:
            com.ss.android.socialbase.downloader.b.k r0 = r12.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            if (r0 != r1) goto L_0x01b4
            return r2
        L_0x01b4:
            return r3
        L_0x01b5:
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_RETRY_DELAY
            r12.f54822d = r1
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r12.f54823e
            com.ss.android.socialbase.downloader.b.j r2 = com.p683ss.android.socialbase.downloader.p1212b.C19789j.DELAY_RETRY_WAITING
            r1.setRetryDelayStatus(r2)
            com.ss.android.socialbase.downloader.downloader.k r1 = r12.f54834q
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r12.f54823e
            r1.mo41244a(r2)
            throw r0
        L_0x01c8:
            boolean r0 = r12.m48962o()     // Catch:{ Throwable -> 0x01dc }
            if (r0 != 0) goto L_0x01cf
            return r3
        L_0x01cf:
            com.ss.android.socialbase.downloader.downloader.f r0 = r12.f54824f     // Catch:{ Throwable -> 0x01dc }
            r0.mo41505d()     // Catch:{ Throwable -> 0x01dc }
            com.ss.android.socialbase.downloader.impls.r r0 = com.p683ss.android.socialbase.downloader.impls.C19983r.m49310c()     // Catch:{ Throwable -> 0x01dc }
            r0.mo41747d()     // Catch:{ Throwable -> 0x01dc }
            goto L_0x01ed
        L_0x01dc:
            r0 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException
            r3 = 1008(0x3f0, float:1.413E-42)
            java.lang.String r4 = "doTaskStatusHandle onComplete"
            java.lang.String r0 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49362b(r0, r4)
            r1.<init>(r3, r0)
            r12.mo41677b(r1)
        L_0x01ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1220i.C19941c.m48960m():boolean");
    }

    public void run() {
        boolean z;
        Process.setThreadPriority(10);
        try {
            C19864s interceptor = this.f54820b.getInterceptor();
            if (interceptor != null && interceptor.mo41377a()) {
                C19891f fVar = this.f54824f;
                fVar.f54670c.setStatus(-7);
                try {
                    fVar.f54671d.mo41266j(fVar.f54670c.getId());
                } catch (SQLiteException unused) {
                }
                fVar.mo41497a(-7, (BaseException) null);
                return;
            }
        } catch (Throwable unused2) {
        }
        int status = this.f54823e.getStatus();
        int i = 0;
        if (status == 1 || this.f54823e.canSkipStatusHandler()) {
            z = true;
        } else {
            if (!(status == -2 || status == -4)) {
                StringBuilder sb = new StringBuilder("The download Task can't start, because its status is not prepare:");
                sb.append(status);
                mo41677b(new BaseException(1000, sb.toString()));
            }
            z = false;
        }
        if (!z) {
            C19865t monitorDepend = this.f54820b.getMonitorDepend();
            DownloadInfo downloadInfo = this.f54823e;
            BaseException baseException = new BaseException((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO, "task status is invalid");
            if (this.f54823e != null) {
                i = this.f54823e.getStatus();
            }
            C19911a.m48889a(monitorDepend, downloadInfo, baseException, i);
            return;
        }
        while (true) {
            m48956i();
            if (!this.f54815D) {
                break;
            } else if (this.f54814C > 0) {
                this.f54814C--;
            } else if (this.f54823e.getCurBytes() != this.f54823e.getTotalBytes()) {
                this.f54823e.getErrorBytesLog();
                C19891f fVar2 = this.f54824f;
                StringBuilder sb2 = new StringBuilder("current bytes is not equals to total bytes, bytes invalid retry status is : ");
                sb2.append(this.f54823e.getByteInvalidRetryStatus());
                fVar2.mo41500a(new DownloadRetryNeedlessException(1027, sb2.toString()));
                return;
            } else if (this.f54823e.getCurBytes() <= 0) {
                this.f54823e.getErrorBytesLog();
                C19891f fVar3 = this.f54824f;
                StringBuilder sb3 = new StringBuilder("curBytes is 0, bytes invalid retry status is : ");
                sb3.append(this.f54823e.getByteInvalidRetryStatus());
                fVar3.mo41500a(new DownloadRetryNeedlessException(1026, sb3.toString()));
                return;
            } else if (this.f54823e.getTotalBytes() <= 0) {
                this.f54823e.getErrorBytesLog();
                C19891f fVar4 = this.f54824f;
                StringBuilder sb4 = new StringBuilder("TotalBytes is 0, bytes invalid retry status is : ");
                sb4.append(this.f54823e.getByteInvalidRetryStatus());
                fVar4.mo41500a(new DownloadRetryNeedlessException(1044, sb4.toString()));
                break;
            }
        }
    }

    /* renamed from: a */
    public final void mo41673a(C19940b bVar) {
        if (!this.f54828k) {
            synchronized (this) {
                this.f54827j.remove(bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo41679c(BaseException baseException) {
        if (this.f54823e != null) {
            this.f54823e.setChunkDowngradeRetryUsed(true);
        }
        mo41671a(baseException, false);
    }

    /* renamed from: b */
    public final void mo41677b(BaseException baseException) {
        new StringBuilder("onError:").append(baseException.getMessage());
        this.f54822d = C19790k.RUN_STATUS_ERROR;
        this.f54841x = baseException;
        mo41683g();
    }

    /* renamed from: d */
    private boolean m48954d(BaseException baseException) {
        boolean z = true;
        if (this.f54826i != null) {
            if (this.f54826i.get() <= 0) {
                if (this.f54823e.trySwitchToNextBackupUrl()) {
                    this.f54826i.set(this.f54823e.getBackUpUrlRetryCount());
                    this.f54823e.updateCurRetryTime(this.f54826i.get());
                } else if (baseException == null || ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f54823e.canReplaceHttpForRetry())) {
                    mo41677b(new BaseException(baseException.getErrorCode(), C2240a.m6772a("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", new Object[]{String.valueOf(this.f54826i), String.valueOf(this.f54823e.getRetryCount()), baseException.getErrorMessage()})));
                    return true;
                } else {
                    this.f54826i.set(this.f54823e.getRetryCount());
                    this.f54823e.updateCurRetryTime(this.f54826i.get());
                    this.f54823e.setHttpsToHttpRetryUsed(true);
                }
                z = false;
            }
            if (this.f54822d != C19790k.RUN_STATUS_RETRY_DELAY && z) {
                this.f54823e.updateCurRetryTime(this.f54826i.decrementAndGet());
            }
            return false;
        }
        StringBuilder sb = new StringBuilder("retry for exception, but retain retry time is null, last error is :");
        sb.append(baseException.getErrorMessage());
        mo41677b(new BaseException(1043, sb.toString()));
        return true;
    }

    /* renamed from: a */
    public final void mo41671a(BaseException baseException, boolean z) {
        boolean z2;
        this.f54822d = C19790k.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.f54841x = baseException;
        mo41683g();
        if (z) {
            z2 = m48954d(baseException);
        } else {
            z2 = false;
        }
        if (!z2) {
            m48965r();
        }
    }

    /* renamed from: a */
    private void m48950a(String str, String str2) throws C19944a {
        this.f54834q.mo41258d(this.f54823e.getId());
        C19994e.m49343a(this.f54823e);
        this.f54829l = false;
        this.f54823e.resetDataForEtagEndure(str);
        this.f54834q.mo41244a(this.f54823e);
        throw new C19944a(str2);
    }

    /* renamed from: a */
    private void m48948a(long j, int i) throws BaseException {
        long j2;
        long j3 = j;
        int i2 = i;
        long j4 = j3 / ((long) i2);
        int id = this.f54823e.getId();
        ArrayList arrayList = new ArrayList();
        long j5 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i2 - 1) {
                j2 = 0;
            } else {
                j2 = (j5 + j4) - 1;
            }
            DownloadChunk a = new C20041a(id).mo41805a(i3).mo41806a(j5).mo41811e(j5).mo41808b(j5).mo41809c(j2).mo41807a();
            arrayList.add(a);
            this.f54834q.mo41242a(a);
            j5 += j4;
        }
        this.f54823e.setChunkCount(i2);
        this.f54834q.mo41232a(id, i2);
        m48952a((List<DownloadChunk>) arrayList, j3);
    }

    public C19941c(DownloadTask downloadTask, Handler handler) {
        this.f54820b = downloadTask;
        if (downloadTask != null) {
            this.f54823e = downloadTask.getDownloadInfo();
            this.f54835r = downloadTask.getChunkStrategy();
            this.f54837t = downloadTask.getChunkAdjustCalculator();
            this.f54812A = downloadTask.getForbiddenHandler();
            this.f54813B = downloadTask.getDiskSpaceHandler();
            C19908r retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
            if (retryDelayTimeCalculator == null) {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    String retryDelayTimeArray = downloadInfo.getRetryDelayTimeArray();
                    if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                        retryDelayTimeCalculator = new C19982q(retryDelayTimeArray);
                    }
                }
                retryDelayTimeCalculator = C19884b.m48626w();
            }
            this.f54839v = retryDelayTimeCalculator;
        }
        m48955h();
        this.f54834q = C19884b.m48616m();
        this.f54836s = C19884b.m48624u();
        this.f54838u = C19884b.m48625v();
        this.f54824f = new C19891f(downloadTask, handler);
        this.f54840w = C19884b.m48608e();
        this.f54833p = new AtomicBoolean(true);
    }

    /* renamed from: a */
    private void m48951a(String str, List<HttpHeader> list) throws BaseException, C19944a {
        if (this.f54842y == null) {
            C19922d dVar = null;
            if (this.f54823e.getChunkCount() == 1) {
                dVar = C19916a.m48893a().mo41645b(str, list);
            }
            if (dVar != null) {
                mo41672a((C19924c) this.f54842y);
                this.f54823e.setPreconnectLevel(2);
                this.f54842y = dVar;
            } else {
                try {
                    this.f54842y = C19884b.m48599a(this.f54823e.isNeedDefaultHttpServiceBackUp(), this.f54823e.getMaxBytes(), str, list);
                } catch (BaseException e) {
                    throw e;
                } catch (Throwable th) {
                    mo41672a((C19924c) this.f54842y);
                    throw th;
                }
                mo41672a((C19924c) this.f54842y);
            }
            if (this.f54842y == null) {
                throw new BaseException(1022, (Throwable) new IOException("download can't continue, firstConnection is null"));
            }
        }
    }

    /* renamed from: a */
    private void m48949a(C19924c cVar, long j) throws BaseException, C19944a {
        long j2;
        if (cVar != null) {
            try {
                int b = cVar.mo13393b();
                String a = cVar.mo13392a("Accept-Ranges");
                String a2 = cVar.mo13392a("Content-Type");
                if (TextUtils.isEmpty(this.f54823e.getMimeType()) && !TextUtils.isEmpty(a2)) {
                    this.f54823e.setMimeType(a2);
                }
                this.f54830m = C19994e.m49349a(b, a);
                this.f54831n = C19994e.m49348a(b);
                this.f54823e.setSupportPartial(this.f54830m);
                String str = this.f54823e.geteTag();
                String a3 = cVar.mo13392a("Etag");
                if (m48953a(b, str, a3)) {
                    if (cVar instanceof C19926e) {
                        if (!TextUtils.isEmpty(str) && str.equals(a3)) {
                            a3 = "";
                        }
                        m48950a(a3, "eTag of server file changed");
                    } else {
                        throw new DownloadHttpException(BaseNotice.CHECK_PROFILE, b, "");
                    }
                }
                if (!this.f54830m) {
                    if (!this.f54831n) {
                        if (b == 403) {
                            throw new BaseException(1047, "response code error : 403");
                        }
                        StringBuilder sb = new StringBuilder("response code error : ");
                        sb.append(b);
                        throw new DownloadHttpException(1004, b, sb.toString());
                    }
                }
                if (this.f54831n && j > 0) {
                    if (cVar instanceof C19926e) {
                        m48950a("", "http head request not support");
                    } else {
                        throw new BaseException(1004, "isResponseFromBegin but firstOffset > 0");
                    }
                }
                long a4 = C19994e.m49331a(cVar);
                String str2 = "";
                if (TextUtils.isEmpty(this.f54823e.getName())) {
                    str2 = C19994e.m49335a(cVar, this.f54823e.getUrl());
                }
                if (C19991b.m49327a(8)) {
                    this.f54832o = C19994e.m49370b(cVar);
                } else {
                    this.f54832o = C19994e.m49367b(a4);
                }
                if (!this.f54832o && a4 == 0) {
                    if (!(cVar instanceof C19926e)) {
                        throw new BaseException(1004, "");
                    }
                }
                if (!this.f54832o) {
                    String a5 = cVar.mo13392a("Content-Range");
                    if (TextUtils.isEmpty(a5) || !C19991b.m49327a(2)) {
                        j2 = j + a4;
                    } else {
                        j2 = C19994e.m49332a(a5);
                    }
                } else {
                    j2 = -1;
                }
                if (!mo41680d()) {
                    this.f54824f.mo41499a(j2, a3, str2);
                }
            } catch (BaseException e) {
                throw e;
            } catch (C19944a e2) {
                throw e2;
            } catch (Throwable th) {
                C19994e.m49346a(th, "HandleFirstConnection");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:45|46|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ce */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48952a(java.util.List<com.p683ss.android.socialbase.downloader.model.DownloadChunk> r8, long r9) throws com.p683ss.android.socialbase.downloader.exception.BaseException {
        /*
            r7 = this;
            java.util.Iterator r8 = r8.iterator()
        L_0x0004:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r8.next()
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r0
            if (r0 == 0) goto L_0x0004
            long r1 = r0.f55026c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0021
            long r1 = r0.mo41800i()
            long r1 = r9 - r1
            goto L_0x002b
        L_0x0021:
            long r1 = r0.f55026c
            long r5 = r0.mo41800i()
            long r1 = r1 - r5
            r5 = 1
            long r1 = r1 + r5
        L_0x002b:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0004
            r0.f55027d = r1
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54823e
            boolean r1 = r1.isNeedReuseFirstConnection()
            if (r1 == 0) goto L_0x006d
            com.ss.android.socialbase.downloader.f.e r1 = r7.f54842y
            if (r1 == 0) goto L_0x006d
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f54823e
            boolean r1 = r1.isHeadConnectionAvailable()
            if (r1 == 0) goto L_0x0049
            boolean r1 = r7.f54816E
            if (r1 == 0) goto L_0x006d
        L_0x0049:
            int r1 = r0.f55028e
            if (r1 != 0) goto L_0x005c
            com.ss.android.socialbase.downloader.i.b r1 = new com.ss.android.socialbase.downloader.i.b
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r7.f54820b
            com.ss.android.socialbase.downloader.f.e r3 = r7.f54842y
            r1.<init>(r0, r2, r3, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.i.b> r0 = r7.f54827j
            r0.add(r1)
            goto L_0x0004
        L_0x005c:
            int r1 = r0.f55028e
            if (r1 <= 0) goto L_0x0004
            com.ss.android.socialbase.downloader.i.b r1 = new com.ss.android.socialbase.downloader.i.b
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r7.f54820b
            r1.<init>(r0, r2, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.i.b> r0 = r7.f54827j
            r0.add(r1)
            goto L_0x0004
        L_0x006d:
            com.ss.android.socialbase.downloader.i.b r1 = new com.ss.android.socialbase.downloader.i.b
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r7.f54820b
            r1.<init>(r0, r2, r7)
            java.util.ArrayList<com.ss.android.socialbase.downloader.i.b> r0 = r7.f54827j
            r0.add(r1)
            goto L_0x0004
        L_0x007a:
            r8 = 64
            boolean r8 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r8)
            if (r8 == 0) goto L_0x00f7
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.socialbase.downloader.i.b> r9 = r7.f54827j
            int r9 = r9.size()
            r8.<init>(r9)
            java.util.ArrayList<com.ss.android.socialbase.downloader.i.b> r9 = r7.f54827j
            java.util.Iterator r9 = r9.iterator()
        L_0x0093:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00b7
            java.lang.Object r10 = r9.next()
            com.ss.android.socialbase.downloader.i.b r10 = (com.p683ss.android.socialbase.downloader.p1220i.C19940b) r10
            com.ss.android.socialbase.downloader.b.k r0 = r7.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_CANCELED
            if (r0 != r1) goto L_0x00a9
            r10.mo41665b()
            goto L_0x0093
        L_0x00a9:
            com.ss.android.socialbase.downloader.b.k r0 = r7.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE
            if (r0 != r1) goto L_0x00b3
            r10.mo41664a()
            goto L_0x0093
        L_0x00b3:
            r8.add(r10)
            goto L_0x0093
        L_0x00b7:
            r9 = 0
            java.lang.Object r9 = r8.remove(r9)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            java.util.List r8 = com.p683ss.android.socialbase.downloader.impls.C19962e.m49078b(r8)     // Catch:{ Throwable -> 0x00f6 }
        L_0x00c2:
            if (r9 == 0) goto L_0x00d3
            boolean r10 = r7.mo41680d()     // Catch:{ Throwable -> 0x00f6 }
            if (r10 == 0) goto L_0x00cb
            return
        L_0x00cb:
            r9.run()     // Catch:{ Throwable -> 0x00ce }
        L_0x00ce:
            java.lang.Runnable r9 = com.p683ss.android.socialbase.downloader.impls.C19962e.m49079c(r8)     // Catch:{ Throwable -> 0x00f6 }
            goto L_0x00c2
        L_0x00d3:
            boolean r9 = r8.isEmpty()     // Catch:{ Throwable -> 0x00f6 }
            if (r9 != 0) goto L_0x00f5
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Throwable -> 0x00f6 }
        L_0x00dd:
            boolean r9 = r8.hasNext()     // Catch:{ Throwable -> 0x00f6 }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r8.next()     // Catch:{ Throwable -> 0x00f6 }
            java.util.concurrent.Future r9 = (java.util.concurrent.Future) r9     // Catch:{ Throwable -> 0x00f6 }
            if (r9 == 0) goto L_0x00dd
            boolean r10 = r9.isDone()     // Catch:{ Throwable -> 0x00f6 }
            if (r10 != 0) goto L_0x00dd
            r9.get()     // Catch:{ Throwable -> 0x00dd }
            goto L_0x00dd
        L_0x00f5:
            return
        L_0x00f6:
            return
        L_0x00f7:
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.socialbase.downloader.i.b> r9 = r7.f54827j
            int r9 = r9.size()
            r8.<init>(r9)
            java.util.ArrayList<com.ss.android.socialbase.downloader.i.b> r9 = r7.f54827j
            java.util.Iterator r9 = r9.iterator()
        L_0x0108:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0130
            java.lang.Object r10 = r9.next()
            com.ss.android.socialbase.downloader.i.b r10 = (com.p683ss.android.socialbase.downloader.p1220i.C19940b) r10
            com.ss.android.socialbase.downloader.b.k r0 = r7.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_CANCELED
            if (r0 != r1) goto L_0x011e
            r10.mo41665b()
            goto L_0x0108
        L_0x011e:
            com.ss.android.socialbase.downloader.b.k r0 = r7.f54822d
            com.ss.android.socialbase.downloader.b.k r1 = com.p683ss.android.socialbase.downloader.p1212b.C19790k.RUN_STATUS_PAUSE
            if (r0 != r1) goto L_0x0128
            r10.mo41664a()
            goto L_0x0108
        L_0x0128:
            java.util.concurrent.Callable r10 = java.util.concurrent.Executors.callable(r10)
            r8.add(r10)
            goto L_0x0108
        L_0x0130:
            boolean r9 = r7.mo41680d()
            if (r9 == 0) goto L_0x0137
            return
        L_0x0137:
            java.util.concurrent.ExecutorService r9 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48612i()     // Catch:{ InterruptedException -> 0x0141 }
            if (r9 == 0) goto L_0x0140
            r9.invokeAll(r8)     // Catch:{ InterruptedException -> 0x0141 }
        L_0x0140:
            return
        L_0x0141:
            r8 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r9 = new com.ss.android.socialbase.downloader.exception.BaseException
            r10 = 1020(0x3fc, float:1.43E-42)
            r9.<init>(r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1220i.C19941c.m48952a(java.util.List, long):void");
    }

    /* renamed from: a */
    private boolean m48953a(int i, String str, String str2) {
        if (i == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.f54831n || this.f54830m)) {
            return true;
        }
        if ((i == 201 || i == 416) && this.f54823e.getCurBytes() > 0) {
            return true;
        }
        return false;
    }
}
