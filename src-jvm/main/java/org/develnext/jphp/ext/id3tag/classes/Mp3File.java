package org.develnext.jphp.ext.id3tag.classes;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;

import jdk.jfr.Name;
import org.develnext.jphp.ext.id3tag.Id3TagExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.ext.core.classes.time.WrapTime;
import php.runtime.lang.BaseObject;
import php.runtime.memory.LongMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

import java.io.IOException;
import java.util.Date;

@Name("Mp3File")
@Reflection.Namespace(Id3TagExtension.ns)
public class Mp3File extends BaseObject {
    public com.mpatric.mp3agic.Mp3File mp3File;

    public Mp3File(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(String file) {
        try {
            mp3File = new com.mpatric.mp3agic.Mp3File(file);
        } catch (IOException | UnsupportedTagException | InvalidDataException e) {
            e.printStackTrace();
        }
    }


    @Signature
    public Id3v1Tag getId3v1Tag() {
        return new Id3v1Tag(getEnvironment(), mp3File.getId3v1Tag());
    }

    @Signature
    public Id3v2Tag getId3v2Tag() {
        return new Id3v2Tag(getEnvironment(), mp3File.getId3v2Tag());
    }

    @Signature
    public Memory hasCustomTag() {
        return mp3File.hasCustomTag() ? Memory.TRUE : Memory.FALSE;
    }

    @Signature
    public Memory hasId3v1Tag() {
        return mp3File.hasId3v1Tag() ? Memory.TRUE : Memory.FALSE;
    }

    @Signature
    public Memory hasId3v2Tag() {
        return mp3File.hasId3v2Tag() ? Memory.TRUE : Memory.FALSE;
    }

    @Signature
    public Memory getBitrate() {
        return LongMemory.valueOf(mp3File.getBitrate());
    }

    @Signature
    public Memory getChannelMode() {
        return StringMemory.valueOf(mp3File.getChannelMode());
    }

    @Signature
    public Memory getEmphasis() {
        return StringMemory.valueOf(mp3File.getEmphasis());
    }

    @Signature
    public Memory getVersion() {
        return StringMemory.valueOf(mp3File.getVersion());
    }

    @Signature
    public WrapTime getLastModified() {
        return new WrapTime(getEnvironment(), new Date(mp3File.getLastModified()));
    }

    @Signature
    public void removeCustomTag() {
        mp3File.removeCustomTag();
    }

    @Signature
    public void removeId3v1Tag() {
        mp3File.removeId3v1Tag();
    }

    @Signature
    public void removeId3v2Tag() {
        mp3File.removeId3v2Tag();
    }

    @Signature
    public Memory getLengthInMilliseconds() {
        return LongMemory.valueOf(mp3File.getLengthInMilliseconds());
    }

    @Signature
    public Memory getLengthInSeconds() {
        return LongMemory.valueOf(mp3File.getLengthInSeconds());
    }

    @Signature
    public Memory getFilename() {
        return StringMemory.valueOf(mp3File.getFilename());
    }

    @Signature
    public void setCustomTag(String s) {
        mp3File.setCustomTag(s.getBytes());
    }

    @Signature
    public void save(String fileName) {
        try {
            mp3File.save(fileName);
        } catch (IOException | NotSupportedException e) {
            e.printStackTrace();
        }
    }

}
