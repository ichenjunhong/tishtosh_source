package org.msgpack.template;

import java.io.IOException;
import org.msgpack.C53798c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class CharacterTemplate extends AbstractTemplate<Character> {
    static final CharacterTemplate instance = new CharacterTemplate();

    private CharacterTemplate() {
    }

    public static CharacterTemplate getInstance() {
        return instance;
    }

    public Character read(Unpacker unpacker, Character ch, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Character.valueOf((char) unpacker.readInt());
        }
        return null;
    }

    public void write(Packer packer, Character ch, boolean z) throws IOException {
        if (ch != null) {
            packer.write((int) ch.charValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new C53798c("Attempted to write null");
        }
    }
}
