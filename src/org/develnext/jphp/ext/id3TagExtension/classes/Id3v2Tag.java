package org.develnext.jphp.ext.id3TagExtension.classes;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.ID3v22Tag;
import jdk.jfr.Name;
import org.develnext.jphp.ext.id3TagExtension.Id3TagExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.ext.core.classes.stream.FileStream;
import php.runtime.ext.core.classes.stream.MiscStream;
import php.runtime.ext.core.classes.stream.Stream;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.LongMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.StringMemory;
import php.runtime.memory.support.operation.ByteArrayInputStreamMemoryOperation;

import java.io.*;
import java.nio.file.Files;

@Reflection.Abstract
@Name("Id3v2Tag")
@Reflection.Namespace(Id3TagExtension.ns)
public class Id3v2Tag extends BaseWrapper<ID3v2> {
    private final ID3v2 id3;

    public Id3v2Tag(Environment env, ID3v2 wrappedObject) {
        super(env, wrappedObject);
        id3 = wrappedObject;
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
    public void getComment(String s) {
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
    public void setGenreDescription(String s) {
        id3.setGenreDescription(s);
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
    public Memory getAlbumArtist() {
        return StringMemory.valueOf(id3.getAlbumArtist());
    }

    @Signature
    public void setAlbumArtist(String s) {
        id3.setAlbumArtist(s);
    }

    @Signature
    public Memory getAlbumImage() {
        return new ObjectMemory(new MiscStream(__env__, new ByteArrayInputStream(id3.getAlbumImage())));
    }

    @Signature
    public void setAlbumImage(String path) {
        byte[] albumArt = new byte[0];
        try {
            File file = new File(path);
            if (file.exists()) {
                albumArt = Files.readAllBytes(file.toPath());
                // TODO add MIME type to varible
                id3.setAlbumImage(albumArt, "image/png");
            } else {
                throw new FileNotFoundException("File: \"" + path + "\" not found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Signature
    public Memory getAlbumImageMimeType() {
        return StringMemory.valueOf(id3.getAlbumImageMimeType());
    }

    @Signature
    public Memory getArtistUrl() {
        return StringMemory.valueOf(id3.getArtistUrl());
    }

    @Signature
    public void setArtistUrl(String s) {
        id3.setArtistUrl(s);
    }

    @Signature
    public Memory getYear() {
        return StringMemory.valueOf(id3.getYear());
    }

    @Signature
    public void setYear(String s) {
        id3.setYear(s);
    }

    @Signature
    public Memory getAudiofileUrl() {
        return StringMemory.valueOf(id3.getAudiofileUrl());
    }

    @Signature
    public void setAudiofileUrl(String s) {
        id3.setAudiofileUrl(s);
    }

    @Signature
    public Memory getBPM() {
        return LongMemory.valueOf(id3.getBPM());
    }

    @Signature
    public void setBPM(int i) {
        id3.setBPM(i);
    }

    @Signature
    public Memory getKey() {
        return StringMemory.valueOf(id3.getKey());
    }

    @Signature
    public void setKey(String s) {
        id3.setKey(s);
    }

    @Signature
    public Memory getDate() {
        return StringMemory.valueOf(id3.getDate());
    }

    @Signature
    public void setDate(String s) {
        id3.setDate(s);
    }

    @Signature
    public Memory getComposer() {
        return StringMemory.valueOf(id3.getComposer());
    }

    @Signature
    public void setComposer(String s) {
        id3.setComposer(s);
    }

    @Signature
    public Memory getPublisher() {
        return StringMemory.valueOf(id3.getPublisher());
    }

    @Signature
    public void setPublisher(String s) {
        id3.setPublisher(s);
    }

    @Signature
    public Memory getOriginalArtist() {
        return StringMemory.valueOf(id3.getOriginalArtist());
    }

    @Signature
    public void setOriginalArtist(String s) {
        id3.setOriginalArtist(s);
    }

    @Signature
    public Memory getCopyright() {
        return StringMemory.valueOf(id3.getCopyright());
    }

    @Signature
    public void setCopyright(String s) {
        id3.setCopyright(s);
    }

    @Signature
    public Memory getCommercialUrl() {
        return StringMemory.valueOf(id3.getCommercialUrl());
    }

    @Signature
    public void setCommercialUrl(String s) {
        id3.setCommercialUrl(s);
    }

    @Signature
    public Memory getCopyrightUrl() {
        return StringMemory.valueOf(id3.getCopyrightUrl());
    }

    @Signature
    public void setCopyrightUrl(String s) {
        id3.setCopyrightUrl(s);
    }

    @Signature
    public Memory getAudioSourceUrl() {
        return StringMemory.valueOf(id3.getAudioSourceUrl());
    }

    @Signature
    public void setAudioSourceUrl(String s) {
        id3.setAudioSourceUrl(s);
    }

    @Signature
    public Memory getRadiostationUrl() {
        return StringMemory.valueOf(id3.getRadiostationUrl());
    }

    @Signature
    public void setRadiostationUrl(String s) {
        id3.setRadiostationUrl(s);
    }

    @Signature
    public Memory getPaymentUrl() {
        return StringMemory.valueOf(id3.getPaymentUrl());
    }

    @Signature
    public void setPaymentUrl(String s) {
        id3.setPaymentUrl(s);
    }

    @Signature
    public Memory getPublisherUrl() {
        return StringMemory.valueOf(id3.getPublisherUrl());
    }

    @Signature
    public void setPublisherUrl(String s) {
        id3.setPublisherUrl(s);
    }

    @Signature
    public Memory getUrl() {
        return StringMemory.valueOf(id3.getUrl());
    }

    @Signature
    public void setUrl(String s) {
        id3.setUrl(s);
    }

    @Signature
    public Memory getEncoder() {
        return StringMemory.valueOf(id3.getEncoder());
    }

    @Signature
    public void setEncoder(String s) {
        id3.setEncoder(s);
    }

    @Signature
    public Memory getWmpRating() {
        return LongMemory.valueOf(id3.getWmpRating());
    }

    @Signature
    public void setWmpRating(int i) {
        id3.setWmpRating(i);
    }

    @Signature
    public Memory getItunesComment() {
        return StringMemory.valueOf(id3.getItunesComment());
    }

    @Signature
    public void setItunesComment(String s) {
        id3.setItunesComment(s);
    }

    @Signature
    public Memory getLyrics() {
        return StringMemory.valueOf(id3.getLyrics());
    }

    @Signature
    public void setLyrics(String s) {
        id3.setLyrics(s);
    }

    @Signature
    public Memory getDataLength() {
        return LongMemory.valueOf(id3.getDataLength());
    }

    @Signature
    public Memory getLength() {
        return LongMemory.valueOf(id3.getLength());
    }

    @Signature
    public Memory getObseleteFormat() {
        return id3.getObseleteFormat() ? Memory.TRUE : Memory.FALSE;
    }

    @Signature
    public Memory getPadding() {
        return id3.getPadding() ? Memory.TRUE : Memory.FALSE;
    }

    @Signature
    public void setPadding(boolean b) {
        id3.setPadding(b);
    }

    @Signature
    public Memory getGrouping() {
        return StringMemory.valueOf(id3.getGrouping());
    }

    @Signature
    public void getGrouping(String s) {
        id3.setGrouping(s);
    }

    @Signature
    public Memory getPartOfSet() {
        return StringMemory.valueOf(id3.getPartOfSet());
    }

    @Signature
    public void setPartOfSet(String s) {
        id3.setPartOfSet(s);
    }
}
