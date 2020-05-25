package com.facebook.p987k.p988a;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.facebook.k.a.f */
final class C14469f {

    /* renamed from: a */
    FileInputStream f37575a;

    /* renamed from: b */
    int f37576b;

    /* renamed from: c */
    int f37577c;

    /* renamed from: d */
    private byte[] f37578d = new byte[UnReadVideoExperiment.LIKE_USER_LIST];

    /* renamed from: a */
    public final void mo26631a() throws IOException {
        if (this.f37576b >= this.f37577c) {
            this.f37577c = this.f37575a.read(this.f37578d);
            this.f37576b = 0;
        }
        while (this.f37577c != -1 && this.f37578d[this.f37576b] != 10) {
            this.f37576b++;
            if (this.f37576b >= this.f37577c) {
                this.f37577c = this.f37575a.read(this.f37578d);
                this.f37576b = 0;
            }
        }
        this.f37576b++;
    }

    /* renamed from: a */
    public final int mo26630a(byte[] bArr) throws IOException {
        if (this.f37576b >= this.f37577c) {
            this.f37577c = this.f37575a.read(this.f37578d);
            this.f37576b = 0;
        }
        int i = 0;
        while (this.f37577c != -1 && i < bArr.length && this.f37578d[this.f37576b] != 10) {
            bArr[i] = this.f37578d[this.f37576b];
            this.f37576b++;
            if (this.f37576b >= this.f37577c) {
                this.f37577c = this.f37575a.read(this.f37578d);
                this.f37576b = 0;
            }
            i++;
        }
        this.f37576b++;
        if (this.f37577c == -1) {
            return -1;
        }
        return i;
    }
}
