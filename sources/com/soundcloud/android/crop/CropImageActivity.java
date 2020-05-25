package com.soundcloud.android.crop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Handler;
import com.soundcloud.android.crop.C18337c.C18339b;
import com.ss.android.ugc.trill.R;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CropImageActivity extends C18337c {

    /* renamed from: a */
    public final Handler f50561a = new Handler();

    /* renamed from: b */
    public int f50562b;

    /* renamed from: c */
    public int f50563c;

    /* renamed from: d */
    Uri f50564d;

    /* renamed from: e */
    Uri f50565e;

    /* renamed from: f */
    public boolean f50566f;

    /* renamed from: g */
    public C18340d f50567g;

    /* renamed from: h */
    public CropImageView f50568h;

    /* renamed from: i */
    public C18334b f50569i;

    /* renamed from: j */
    private int f50570j;

    /* renamed from: k */
    private int f50571k;

    /* renamed from: l */
    private int f50572l;

    /* renamed from: m */
    private int f50573m;

    /* renamed from: com.soundcloud.android.crop.CropImageActivity$a */
    class C18326a {
        /* renamed from: a */
        public final void mo36744a() {
            int i;
            if (CropImageActivity.this.f50567g != null) {
                C18334b bVar = new C18334b(CropImageActivity.this.f50568h);
                int c = CropImageActivity.this.f50567g.mo36779c();
                int b = CropImageActivity.this.f50567g.mo36778b();
                boolean z = false;
                Rect rect = new Rect(0, 0, c, b);
                int min = (Math.min(c, b) * 4) / 5;
                if (CropImageActivity.this.f50562b == 0 || CropImageActivity.this.f50563c == 0) {
                    i = min;
                } else if (CropImageActivity.this.f50562b > CropImageActivity.this.f50563c) {
                    i = (CropImageActivity.this.f50563c * min) / CropImageActivity.this.f50562b;
                } else {
                    i = min;
                    min = (CropImageActivity.this.f50562b * min) / CropImageActivity.this.f50563c;
                }
                int i2 = (c - min) / 2;
                int i3 = (b - i) / 2;
                RectF rectF = new RectF((float) i2, (float) i3, (float) (i2 + min), (float) (i3 + i));
                Matrix unrotatedMatrix = CropImageActivity.this.f50568h.getUnrotatedMatrix();
                if (!(CropImageActivity.this.f50562b == 0 || CropImageActivity.this.f50563c == 0)) {
                    z = true;
                }
                bVar.f50622c = new Matrix(unrotatedMatrix);
                bVar.f50620a = rectF;
                bVar.f50623d = new RectF(rect);
                bVar.f50633n = z;
                bVar.f50634o = bVar.f50620a.width() / bVar.f50620a.height();
                bVar.f50621b = bVar.mo36772a();
                bVar.f50624e.setARGB(125, 50, 50, 50);
                bVar.f50625f.setStyle(Style.STROKE);
                bVar.f50625f.setAntiAlias(true);
                bVar.f50636q = bVar.mo36771a(2.0f);
                bVar.f50626g.setColor(bVar.f50630k);
                bVar.f50626g.setStyle(Style.FILL);
                bVar.f50626g.setAntiAlias(true);
                bVar.f50635p = bVar.mo36771a(12.0f);
                bVar.f50631l = C18336b.None;
                CropImageView cropImageView = CropImageActivity.this.f50568h;
                cropImageView.f50586a.add(bVar);
                cropImageView.invalidate();
            }
        }

        private C18326a() {
        }
    }

    public boolean onSearchRequested() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f50567g != null) {
            this.f50567g.mo36780d();
        }
    }

    /* renamed from: a */
    public final void mo36730a() {
        if (this.f50569i != null && !this.f50566f) {
            this.f50566f = true;
            C18334b bVar = this.f50569i;
            float f = (float) this.f50573m;
            Rect rect = new Rect((int) (bVar.f50620a.left * f), (int) (bVar.f50620a.top * f), (int) (bVar.f50620a.right * f), (int) (bVar.f50620a.bottom * f));
            int width = rect.width();
            int height = rect.height();
            if (this.f50570j > 0 && this.f50571k > 0 && (width > this.f50570j || height > this.f50571k)) {
                float f2 = ((float) width) / ((float) height);
                if (((float) this.f50570j) / ((float) this.f50571k) > f2) {
                    height = this.f50571k;
                    width = (int) ((((float) this.f50571k) * f2) + 0.5f);
                } else {
                    int i = this.f50570j;
                    height = (int) ((((float) this.f50570j) / f2) + 0.5f);
                    width = i;
                }
            }
            try {
                final Bitmap a = m44506a(rect, width, height);
                if (a != null) {
                    this.f50568h.mo36750a(new C18340d(a, this.f50572l), true);
                    this.f50568h.mo36760b();
                    this.f50568h.f50586a.clear();
                }
                if (a != null) {
                    C18331a.m44534a(this, null, getResources().getString(R.string.amu), new Runnable() {
                        public final void run() {
                            CropImageActivity cropImageActivity = CropImageActivity.this;
                            Bitmap bitmap = a;
                            if (cropImageActivity.f50565e != null) {
                                OutputStream outputStream = null;
                                try {
                                    OutputStream openOutputStream = cropImageActivity.getContentResolver().openOutputStream(cropImageActivity.f50565e);
                                    if (openOutputStream != null) {
                                        try {
                                            bitmap.compress(CompressFormat.JPEG, 90, openOutputStream);
                                        } catch (IOException e) {
                                            OutputStream outputStream2 = openOutputStream;
                                            e = e;
                                            outputStream = outputStream2;
                                        } catch (Throwable th) {
                                            th = th;
                                            outputStream = openOutputStream;
                                            C18331a.m44535a((Closeable) outputStream);
                                            throw th;
                                        }
                                    }
                                    C18331a.m44535a((Closeable) openOutputStream);
                                } catch (IOException e2) {
                                    e = e2;
                                    try {
                                        cropImageActivity.mo36732a((Throwable) e);
                                        new StringBuilder("Cannot open file: ").append(cropImageActivity.f50565e);
                                        C18331a.m44535a((Closeable) outputStream);
                                        C18331a.m44536a(C18331a.m44533a(cropImageActivity, cropImageActivity.getContentResolver(), cropImageActivity.f50564d), C18331a.m44533a(cropImageActivity, cropImageActivity.getContentResolver(), cropImageActivity.f50565e));
                                        cropImageActivity.setResult(-1, new Intent().putExtra("output", cropImageActivity.f50565e));
                                        cropImageActivity.f50561a.post(new Runnable(bitmap) {

                                            /* renamed from: a */
                                            final /* synthetic */ Bitmap f50582a;

                                            public final void run() {
                                                CropImageActivity.this.f50568h.mo36746a();
                                                this.f50582a.recycle();
                                            }

                                            {
                                                this.f50582a = r2;
                                            }
                                        });
                                        cropImageActivity.finish();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        C18331a.m44535a((Closeable) outputStream);
                                        throw th;
                                    }
                                }
                                C18331a.m44536a(C18331a.m44533a(cropImageActivity, cropImageActivity.getContentResolver(), cropImageActivity.f50564d), C18331a.m44533a(cropImageActivity, cropImageActivity.getContentResolver(), cropImageActivity.f50565e));
                                cropImageActivity.setResult(-1, new Intent().putExtra("output", cropImageActivity.f50565e));
                            }
                            cropImageActivity.f50561a.post(new Runnable(bitmap) {

                                /* renamed from: a */
                                final /* synthetic */ Bitmap f50582a;

                                public final void run() {
                                    CropImageActivity.this.f50568h.mo36746a();
                                    this.f50582a.recycle();
                                }

                                {
                                    this.f50582a = r2;
                                }
                            });
                            cropImageActivity.finish();
                        }
                    }, this.f50561a);
                } else {
                    finish();
                }
            } catch (IllegalArgumentException e) {
                mo36732a((Throwable) e);
                finish();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36731a(C18339b bVar) {
        super.mo36731a(bVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo36733b(C18339b bVar) {
        super.mo36733b(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36732a(Throwable th) {
        setResult(404, new Intent().putExtra("error", th));
    }

    /* renamed from: a */
    private int m44505a(Uri uri) throws IOException {
        int i;
        Options options = new Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                C18331a.m44535a((Closeable) openInputStream);
                int[] iArr = new int[1];
                GLES10.glGetIntegerv(3379, iArr, 0);
                int i3 = iArr[0];
                if (i3 == 0) {
                    i = 2048;
                } else {
                    i = Math.min(i3, 4096);
                }
                while (true) {
                    if (options.outHeight / i2 <= i && options.outWidth / i2 <= i) {
                        return i2;
                    }
                    i2 <<= 1;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = openInputStream;
                C18331a.m44535a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C18331a.m44535a((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [int] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v33, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: type inference failed for: r0v36 */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: type inference failed for: r0v38 */
    /* JADX WARNING: type inference failed for: r0v39 */
    /* JADX WARNING: type inference failed for: r0v40 */
    /* JADX WARNING: type inference failed for: r0v41 */
    /* JADX WARNING: type inference failed for: r0v42 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v23
      assigns: []
      uses: []
      mth insns count: 109
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
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r6 = 1
            r5.requestWindowFeature(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x0016
            android.view.Window r0 = r5.getWindow()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r1)
        L_0x0016:
            r0 = 2132214379(0x7f17026b, float:2.0072598E38)
            r5.setContentView(r0)
            r0 = 2132018409(0x7f1404e9, float:1.9675124E38)
            android.view.View r0 = r5.findViewById(r0)
            com.soundcloud.android.crop.CropImageView r0 = (com.soundcloud.android.crop.CropImageView) r0
            r5.f50568h = r0
            com.soundcloud.android.crop.CropImageView r0 = r5.f50568h
            r0.f50588c = r5
            com.soundcloud.android.crop.CropImageView r0 = r5.f50568h
            com.soundcloud.android.crop.CropImageActivity$1 r1 = new com.soundcloud.android.crop.CropImageActivity$1
            r1.<init>()
            r0.setRecycler(r1)
            r0 = 2132017792(0x7f140280, float:1.9673872E38)
            android.view.View r0 = r5.findViewById(r0)
            com.soundcloud.android.crop.CropImageActivity$2 r1 = new com.soundcloud.android.crop.CropImageActivity$2
            r1.<init>()
            r0.setOnClickListener(r1)
            r0 = 2132017804(0x7f14028c, float:1.9673897E38)
            android.view.View r0 = r5.findViewById(r0)
            com.soundcloud.android.crop.CropImageActivity$3 r1 = new com.soundcloud.android.crop.CropImageActivity$3
            r1.<init>()
            r0.setOnClickListener(r1)
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0087
            java.lang.String r2 = "aspect_x"
            int r2 = r1.getInt(r2)
            r5.f50562b = r2
            java.lang.String r2 = "aspect_y"
            int r2 = r1.getInt(r2)
            r5.f50563c = r2
            java.lang.String r2 = "max_x"
            int r2 = r1.getInt(r2)
            r5.f50570j = r2
            java.lang.String r2 = "max_y"
            int r2 = r1.getInt(r2)
            r5.f50571k = r2
            java.lang.String r2 = "output"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r5.f50565e = r1
        L_0x0087:
            android.net.Uri r0 = r0.getData()
            r5.f50564d = r0
            android.net.Uri r0 = r5.f50564d
            r1 = 0
            if (r0 == 0) goto L_0x0102
            android.content.ContentResolver r0 = r5.getContentResolver()
            android.net.Uri r2 = r5.f50564d
            java.io.File r0 = com.soundcloud.android.crop.C18331a.m44533a(r5, r0, r2)
            int r0 = com.soundcloud.android.crop.C18331a.m44532a(r0)
            r5.f50572l = r0
            android.net.Uri r0 = r5.f50564d     // Catch:{ IOException -> 0x00e6, OutOfMemoryError -> 0x00d2, all -> 0x00cf }
            int r0 = r5.m44505a(r0)     // Catch:{ IOException -> 0x00e6, OutOfMemoryError -> 0x00d2, all -> 0x00cf }
            r5.f50573m = r0     // Catch:{ IOException -> 0x00e6, OutOfMemoryError -> 0x00d2, all -> 0x00cf }
            android.content.ContentResolver r0 = r5.getContentResolver()     // Catch:{ IOException -> 0x00e6, OutOfMemoryError -> 0x00d2, all -> 0x00cf }
            android.net.Uri r2 = r5.f50564d     // Catch:{ IOException -> 0x00e6, OutOfMemoryError -> 0x00d2, all -> 0x00cf }
            java.io.InputStream r0 = r0.openInputStream(r2)     // Catch:{ IOException -> 0x00e6, OutOfMemoryError -> 0x00d2, all -> 0x00cf }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            r2.<init>()     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            int r3 = r5.f50573m     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            r2.inSampleSize = r3     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            com.soundcloud.android.crop.d r3 = new com.soundcloud.android.crop.d     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r1, r2)     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            int r4 = r5.f50572l     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            r5.f50567g = r3     // Catch:{ IOException -> 0x00cd, OutOfMemoryError -> 0x00cb }
            goto L_0x00f9
        L_0x00cb:
            r2 = move-exception
            goto L_0x00d4
        L_0x00cd:
            r2 = move-exception
            goto L_0x00e8
        L_0x00cf:
            r6 = move-exception
            r0 = r1
            goto L_0x00fe
        L_0x00d2:
            r2 = move-exception
            r0 = r1
        L_0x00d4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = "OOM reading image: "
            r3.<init>(r4)     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = r2.getMessage()     // Catch:{ all -> 0x00fd }
            r3.append(r4)     // Catch:{ all -> 0x00fd }
            r5.mo36732a(r2)     // Catch:{ all -> 0x00fd }
            goto L_0x00f9
        L_0x00e6:
            r2 = move-exception
            r0 = r1
        L_0x00e8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = "Error reading image: "
            r3.<init>(r4)     // Catch:{ all -> 0x00fd }
            java.lang.String r4 = r2.getMessage()     // Catch:{ all -> 0x00fd }
            r3.append(r4)     // Catch:{ all -> 0x00fd }
            r5.mo36732a(r2)     // Catch:{ all -> 0x00fd }
        L_0x00f9:
            com.soundcloud.android.crop.C18331a.m44535a(r0)
            goto L_0x0102
        L_0x00fd:
            r6 = move-exception
        L_0x00fe:
            com.soundcloud.android.crop.C18331a.m44535a(r0)
            throw r6
        L_0x0102:
            com.soundcloud.android.crop.d r0 = r5.f50567g
            if (r0 != 0) goto L_0x010a
            r5.finish()
            return
        L_0x010a:
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x012c
            com.soundcloud.android.crop.CropImageView r0 = r5.f50568h
            com.soundcloud.android.crop.d r2 = r5.f50567g
            r0.mo36750a(r2, r6)
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2132543681(0x7f1c08c1, float:2.0740502E38)
            java.lang.String r6 = r6.getString(r0)
            com.soundcloud.android.crop.CropImageActivity$4 r0 = new com.soundcloud.android.crop.CropImageActivity$4
            r0.<init>()
            android.os.Handler r2 = r5.f50561a
            com.soundcloud.android.crop.C18331a.m44534a(r5, r1, r6, r0, r2)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.soundcloud.android.crop.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r5v14, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r5v15, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r10v0, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f7, code lost:
        r0 = th;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fa, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1
      assigns: []
      uses: []
      mth insns count: 150
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
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0023] */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m44506a(android.graphics.Rect r18, int r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.soundcloud.android.crop.CropImageView r3 = r1.f50568h
            r3.mo36746a()
            com.soundcloud.android.crop.d r3 = r1.f50567g
            if (r3 == 0) goto L_0x0014
            com.soundcloud.android.crop.d r3 = r1.f50567g
            r3.mo36780d()
        L_0x0014:
            java.lang.System.gc()
            r3 = 0
            android.content.ContentResolver r4 = r17.getContentResolver()     // Catch:{ IOException -> 0x0118, OutOfMemoryError -> 0x0104 }
            android.net.Uri r5 = r1.f50564d     // Catch:{ IOException -> 0x0118, OutOfMemoryError -> 0x0104 }
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch:{ IOException -> 0x0118, OutOfMemoryError -> 0x0104 }
            r5 = 0
            android.graphics.BitmapRegionDecoder r5 = android.graphics.BitmapRegionDecoder.newInstance(r4, r5)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r6 = r5.getWidth()     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r7 = r5.getHeight()     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r8 = r1.f50572l     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            if (r8 == 0) goto L_0x0074
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r8.<init>()     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r9 = r1.f50572l     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r9 = -r9
            float r9 = (float) r9     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r8.setRotate(r9)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            android.graphics.RectF r9 = new android.graphics.RectF     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r9.<init>()     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            android.graphics.RectF r10 = new android.graphics.RectF     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r11 = r18
            r10.<init>(r11)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r8.mapRect(r9, r10)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            float r8 = r9.left     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0057
            float r8 = (float) r6     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            float r11 = r9.top     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x005f
            float r10 = (float) r7     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
        L_0x005f:
            r9.offset(r8, r10)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            float r10 = r9.left     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r10 = (int) r10     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            float r11 = r9.top     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r11 = (int) r11     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            float r12 = r9.right     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r12 = (int) r12     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            float r9 = r9.bottom     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r9 = (int) r9     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r8.<init>(r10, r11, r12, r9)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            goto L_0x0077
        L_0x0074:
            r11 = r18
            r8 = r11
        L_0x0077:
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ IllegalArgumentException -> 0x00c3 }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x00c3 }
            android.graphics.Bitmap r5 = r5.decodeRegion(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            int r3 = r8.width()     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            if (r3 > r0) goto L_0x008f
            int r3 = r8.height()     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            if (r3 <= r2) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r0 = r5
            goto L_0x00b6
        L_0x008f:
            android.graphics.Matrix r15 = new android.graphics.Matrix     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            r15.<init>()     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            float r0 = (float) r0     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            int r3 = r8.width()     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            float r0 = r0 / r3
            float r2 = (float) r2     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            int r3 = r8.height()     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            float r2 = r2 / r3
            r15.postScale(r0, r2)     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            r11 = 0
            r12 = 0
            int r13 = r5.getWidth()     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            int r14 = r5.getHeight()     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
            r16 = 1
            r10 = r5
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IllegalArgumentException -> 0x00c0, IOException -> 0x00be, OutOfMemoryError -> 0x00bc, all -> 0x00f7 }
        L_0x00b6:
            com.soundcloud.android.crop.C18331a.m44535a(r4)
            r5 = r0
            goto L_0x012e
        L_0x00bc:
            r0 = move-exception
            goto L_0x00fb
        L_0x00be:
            r0 = move-exception
            goto L_0x00ff
        L_0x00c0:
            r0 = move-exception
            r3 = r5
            goto L_0x00c4
        L_0x00c3:
            r0 = move-exception
        L_0x00c4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            java.lang.String r9 = "Rectangle "
            r5.<init>(r9)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r5.append(r8)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            java.lang.String r8 = " is outside of the image ("
            r5.append(r8)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r5.append(r6)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r5.append(r7)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            int r6 = r1.f50572l     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r5.append(r6)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
            throw r2     // Catch:{ IOException -> 0x00fd, OutOfMemoryError -> 0x00f9, all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            goto L_0x012f
        L_0x00f9:
            r0 = move-exception
            r5 = r3
        L_0x00fb:
            r3 = r4
            goto L_0x0106
        L_0x00fd:
            r0 = move-exception
            r5 = r3
        L_0x00ff:
            r3 = r4
            goto L_0x011a
        L_0x0101:
            r0 = move-exception
            r4 = r3
            goto L_0x012f
        L_0x0104:
            r0 = move-exception
            r5 = r3
        L_0x0106:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            java.lang.String r4 = "OOM cropping image: "
            r2.<init>(r4)     // Catch:{ all -> 0x0101 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x0101 }
            r2.append(r4)     // Catch:{ all -> 0x0101 }
            r1.mo36732a(r0)     // Catch:{ all -> 0x0101 }
            goto L_0x012b
        L_0x0118:
            r0 = move-exception
            r5 = r3
        L_0x011a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            java.lang.String r4 = "Error cropping image: "
            r2.<init>(r4)     // Catch:{ all -> 0x0101 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x0101 }
            r2.append(r4)     // Catch:{ all -> 0x0101 }
            r1.mo36732a(r0)     // Catch:{ all -> 0x0101 }
        L_0x012b:
            com.soundcloud.android.crop.C18331a.m44535a(r3)
        L_0x012e:
            return r5
        L_0x012f:
            com.soundcloud.android.crop.C18331a.m44535a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.soundcloud.android.crop.CropImageActivity.m44506a(android.graphics.Rect, int, int):android.graphics.Bitmap");
    }
}
