package org.msgpack.packer;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import org.msgpack.C53777a;
import org.msgpack.p2696b.C53795g;

public class MessagePackBufferPacker extends MessagePackPacker implements BufferPacker {
    public byte[] toByteArray() {
        return ((C53795g) this.out).mo113092a();
    }

    public MessagePackBufferPacker(C53777a aVar) {
        this(aVar, UnReadVideoExperiment.LIKE_USER_LIST);
    }

    public MessagePackBufferPacker(C53777a aVar, int i) {
        super(aVar, new C53795g(i));
    }
}
