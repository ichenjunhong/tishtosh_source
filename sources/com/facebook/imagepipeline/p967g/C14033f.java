package com.facebook.imagepipeline.p967g;

import com.facebook.common.p920d.C13679b;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13696m;
import com.facebook.common.p923g.C13702a;
import com.facebook.common.p923g.C13708g;
import com.facebook.common.p927k.C13728d;
import com.facebook.imagepipeline.p970j.C14044e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.g.f */
public final class C14033f {

    /* renamed from: a */
    public int f36684a = 0;

    /* renamed from: b */
    public int f36685b = 0;

    /* renamed from: c */
    public boolean f36686c;

    /* renamed from: d */
    private int f36687d = 0;

    /* renamed from: e */
    private int f36688e = 0;

    /* renamed from: f */
    private int f36689f = 0;

    /* renamed from: g */
    private int f36690g = 0;

    /* renamed from: h */
    private final C13702a f36691h;

    /* renamed from: a */
    private void m28676a(int i) {
        if (this.f36690g > 0) {
            this.f36685b = i;
        }
        int i2 = this.f36690g;
        this.f36690g = i2 + 1;
        this.f36684a = i2;
    }

    public C14033f(C13702a aVar) {
        this.f36691h = (C13702a) C13689i.m27652a(aVar);
    }

    /* renamed from: a */
    public final boolean mo26248a(C14044e eVar) {
        if (this.f36687d == 6 || eVar.mo26272i() <= this.f36689f) {
            return false;
        }
        C13708g gVar = new C13708g(eVar.mo26265c(), (byte[]) this.f36691h.mo25599a(16384), this.f36691h);
        try {
            C13728d.m27774a(gVar, (long) this.f36689f);
            return m28677a((InputStream) gVar);
        } catch (IOException e) {
            C13696m.m27667b(e);
            return false;
        } finally {
            C13679b.m27634a(gVar);
        }
    }

    /* renamed from: a */
    private boolean m28677a(InputStream inputStream) {
        boolean z;
        int i = this.f36684a;
        while (this.f36687d != 6) {
            try {
                int read = inputStream.read();
                if (read != -1) {
                    this.f36689f++;
                    if (this.f36686c) {
                        this.f36687d = 6;
                        this.f36686c = false;
                        return false;
                    }
                    switch (this.f36687d) {
                        case 0:
                            if (read != 255) {
                                this.f36687d = 6;
                                break;
                            } else {
                                this.f36687d = 1;
                                break;
                            }
                        case 1:
                            if (read != 216) {
                                this.f36687d = 6;
                                break;
                            } else {
                                this.f36687d = 2;
                                break;
                            }
                        case 2:
                            if (read != 255) {
                                break;
                            } else {
                                this.f36687d = 3;
                                break;
                            }
                        case 3:
                            if (read != 255) {
                                if (read != 0) {
                                    if (read != 217) {
                                        if (read == 218) {
                                            m28676a(this.f36689f - 2);
                                        }
                                        if (read == 1 || ((read >= 208 && read <= 215) || read == 217 || read == 216)) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (!z) {
                                            this.f36687d = 2;
                                            break;
                                        } else {
                                            this.f36687d = 4;
                                            break;
                                        }
                                    } else {
                                        this.f36686c = true;
                                        m28676a(this.f36689f - 2);
                                        this.f36687d = 2;
                                        break;
                                    }
                                } else {
                                    this.f36687d = 2;
                                    break;
                                }
                            } else {
                                this.f36687d = 3;
                                break;
                            }
                        case 4:
                            this.f36687d = 5;
                            break;
                        case 5:
                            int i2 = ((this.f36688e << 8) + read) - 2;
                            C13728d.m27774a(inputStream, (long) i2);
                            this.f36689f += i2;
                            this.f36687d = 2;
                            break;
                        default:
                            C13689i.m27657b(false);
                            break;
                    }
                    this.f36688e = read;
                } else if (this.f36687d != 6 || this.f36684a == i) {
                    return false;
                } else {
                    return true;
                }
            } catch (IOException e) {
                C13696m.m27667b(e);
            }
        }
        if (this.f36687d != 6) {
        }
        return false;
    }
}
