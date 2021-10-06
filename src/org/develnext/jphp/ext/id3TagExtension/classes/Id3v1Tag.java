package org.develnext.jphp.ext.id3TagExtension.classes;

import com.mpatric.mp3agic.ID3v1;
import jdk.jfr.Name;
import org.develnext.jphp.ext.id3TagExtension.Id3TagExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.*;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Name("Id3v1Tag")
@Reflection.Namespace(Id3TagExtension.ns)
public class Id3v1Tag extends BaseWrapper<ID3v1> {
    private ID3v1 id3;

    public Id3v1Tag(Environment env, ID3v1 wrappedObject) {
        super(env, wrappedObject);
        id3 = wrappedObject;
    }

    public void __construct() {
        System.out.println(id3.getYear());
    }

    public Id3v1Tag(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public Memory getAlbum() {
        return StringMemory.valueOf(id3.getAlbum());
    }

    @Signature
    public void setAlbum(String s) {
        id3.setAlbum(s);
    }

    @Signature
    public Memory getArtist() {
        return StringMemory.valueOf(id3.getArtist());
    }

    @Signature
    public void setArtist(String s) {
        id3.setArtist(s);
    }

    @Signature
    public Memory getComment() {
        return StringMemory.valueOf(id3.getComment());
    }

    @Signature
    public void setComment(String s) {
        id3.setComment(s);
    }

    @Signature
    public Memory getGenre() {
        return LongMemory.valueOf(id3.getGenre());
    }

    @Signature
    public void setGenre(int i) {
        id3.setGenre(i);
    }

    @Signature
    public Memory getGenreDescription() {
        return StringMemory.valueOf(id3.getGenreDescription());
    }

    @Signature
    public Memory getTitle() {
        return StringMemory.valueOf(id3.getTitle());
    }

    @Signature
    public void setTitle(String s) {
        id3.setTitle(s);
    }

    @Signature
    public Memory getTrack() {
        return StringMemory.valueOf(id3.getTrack());
    }

    @Signature
    public void setTrack(String s) {
        id3.setTrack(s);
    }

    @Signature
    public Memory getVersion() {
        return StringMemory.valueOf(id3.getVersion());
    }

    @Signature
    public Memory getYear() {
        return StringMemory.valueOf(id3.getYear());
    }

    @Signature
    public void setYear(String s) {
        id3.setYear(s);
    }
}