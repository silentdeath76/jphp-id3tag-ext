package org.develnext.jphp.ext.id3tag;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;

import org.develnext.jphp.ext.id3tag.classes.Id3v1Tag;
import org.develnext.jphp.ext.id3tag.classes.Id3v2Tag;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

import org.develnext.jphp.ext.id3tag.classes.Mp3File;

public class Id3TagExtension extends Extension {
    public static final String ns = "id3Tag";

    @Override
    public Status getStatus() {
        return Status.STABLE;
    }

    @Override
    public String[] getPackageNames() {
        return new String[]{"id3tag"};
    }

    @Override
    public void onRegister(CompileScope compileScope) {
        registerClass(compileScope, Mp3File.class);
        registerWrapperClass(compileScope, ID3v1.class, Id3v1Tag.class);
        registerWrapperClass(compileScope, ID3v2.class, Id3v2Tag.class);
    }
}
